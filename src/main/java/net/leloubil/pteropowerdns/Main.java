package net.leloubil.pteropowerdns;

import com.mattmalec.pterodactyl4j.PteroBuilder;
import com.mattmalec.pterodactyl4j.entities.PteroAPI;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.Comment;
import org.openapitools.client.model.RRSet;
import org.openapitools.client.model.Record;
import org.openapitools.client.model.Zone;

import javax.annotation.Nullable;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

@Log4j2
@UtilityClass
public class Main {


    @Getter
    private Configuration configuration;

    @Getter
    private PteroAPI pteroAdminAPI;

    @Getter
    private PowerDNSApi powerDnsAPI;

    @Getter
    private ServerDNSCache serverDNSCache;

    public void main(String[] args) {
        Configurator.setRootLevel(Level.INFO);
        log.info("starting");
        try {
            configuration = loadConfiguration();
            pteroAdminAPI = loadPteroAPI();
            powerDnsAPI = loadPowerDNSAPI();
        } catch (ConfigurationException e) {
            log.error("Error loading configuration", e);
            System.exit(1);
        } catch (NullPointerException e) {
            log.error("Missing configuration value", e);
            System.exit(2);
        }
        buildCache();
        checkCache();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                log.info("Refreshing servers");
                serverDNSCache.setServerInfoList(getServers());
                checkCache();
            }
        }, 0, 10000);
    }

    private void checkCache() {
        serverDNSCache.getServerInfoList().values().forEach(Main::checkRecordsFor);
    }

    private void checkRecordsFor(ServerInfo info) {
        String zoneid = configuration.getString("powerdns-zoneid");
        String serverid = configuration.getString("powerdns-serverid");
        ServerRecord record = serverDNSCache.getDnsRecords().get(info.getServerid());

        if (record == null) {
            log.info("full record for " + info.getServerid());
            fullRecord(info);
            return;
        }

        if (recordsDifferent(getCname(info), record.getCname())) {
            RRSet rec = record.getCname();
            RRSet o = getCname(info);
            log.warn("Record was {} but we wanted {}, replacing", rec, o);
            rec.changetype("DELETE");
            Zone z = new Zone();
            z.rrsets(Arrays.asList(rec, o));

            try {
                powerDnsAPI.getZonesApi().patchZone(serverid, zoneid, z);
                record.setCname(o);
            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
        if (configuration.getBoolean("add-srv", false) && info.minecraft && recordsDifferent(getSrv(info), record.getSrv())) {

            RRSet rec = record.getSrv();
            RRSet o = getSrv(info);
            log.warn("Record was {} but we wanted {}, replacing", rec, o);
            rec.changetype("DELETE");
            Zone z = new Zone();
            z.rrsets(Arrays.asList(rec, o));

            try {
                powerDnsAPI.getZonesApi().patchZone(serverid, zoneid, z);
                record.setSrv(o);
            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
        log.info("Check finished");
    }

    private boolean recordsDifferent(RRSet first, RRSet sec) {
        return !Objects.equals(first.getName(), sec.getName()) || !Objects.equals(first.getType(), sec.getType()) || commentsDifferent(first.getComments(), sec.getComments()) || !first.getRecords().equals(sec.getRecords());
    }

    private boolean commentsDifferent(@Nullable List<Comment> comments, @Nullable List<Comment> comments1) {
        if (comments == null ^ comments1 == null) return true;
        if (comments == null) return true;
        if (comments.size() != comments1.size()) return true;
        return !Objects.equals(comments.get(0).getContent(), comments1.get(0).getContent());
    }

    private void fullRecord(ServerInfo info) {
        String zoneid = configuration.getString("powerdns-zoneid");
        String serverid = configuration.getString("powerdns-serverid");
        Zone z = new Zone();
        List<RRSet> records = new ArrayList<>();
        ServerRecord value = new ServerRecord(info.getServerid());
        RRSet cname = getCname(info);
        value.setCname(cname);
        records.add(cname);
        if (info.minecraft) {
            RRSet srv = getSrv(info);
            records.add(srv);
            value.setSrv(srv);
        }

        z.setRrsets(records);
        try {
            powerDnsAPI.getZonesApi().patchZone(serverid, zoneid, z);
            log.info("added");

            serverDNSCache.getDnsRecords().put(info.getServerid(), value);
        } catch (ApiException e) {
            System.err.println("Exception when calling ZonesApi#patchZone");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    private RRSet getCname(ServerInfo info) {
        String username = configuration.getString("powerdns-username");
        Objects.requireNonNull(username,"powerdns-username");
        RRSet r = new RRSet();
        String zoneid = configuration.getString("powerdns-zoneid");
        r.setType("CNAME");
        r.ttl(60);
        r.setName(info.getSubdomain() + "." + zoneid + ".");
        r.changetype("REPLACE");
        r.setComments(Collections.singletonList(new Comment().content(info.getServerid()).account(username)));
        r.setRecords(new ArrayList<>());
        Record re = new Record();
        re.setContent(zoneid + ".");
        re.disabled(false);
        r.getRecords().add(re);
        return r;
    }

    private RRSet getSrv(ServerInfo info) {
        RRSet r = new RRSet();
        String zoneid = configuration.getString("powerdns-zoneid");
        r.setType("SRV");
        r.ttl(60);
        r.setName("_minecraft._tcp." + info.getSubdomain() + "." + zoneid + ".");
        r.changetype("REPLACE");
        r.setComments(Collections.singletonList(new Comment().content(info.getServerid()).account("LelouBil")));
        r.setRecords(new ArrayList<>());
        Record re = new Record();
        re.setContent("0 5 " + info.getPort() + " " + info.getSubdomain() + "." + zoneid + ".");
        re.disabled(false);
        r.getRecords().add(re);
        return r;
    }


    private void buildCache() {
        String zoneid = configuration.getString("powerdns-zoneid");
        String serverid = configuration.getString("powerdns-serverid");
        Objects.requireNonNull(zoneid, "powerdns-zoneid");
        Objects.requireNonNull(serverid, "powerdns-serverid");
        try {
            serverDNSCache = new ServerDNSCache();
            serverDNSCache.setServerInfoList(getServers());
            List<RRSet> rrsets = powerDnsAPI.getZonesApi().listZone(serverid, zoneid, true).getRrsets();
            List<RRSet> collect;
            if (rrsets == null) return;
            collect = rrsets.stream().filter(s -> s.getComments() != null && !s.getComments().isEmpty()).collect(Collectors.toList());
            collect.forEach(Main::linkRecords);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private HashMap<String, ServerInfo> getServers() {
        return pteroAdminAPI.asApplication().retrieveServers().execute().stream()
                .map(ServerInfo::new).collect(Collectors.toMap(ServerInfo::getServerid, s -> s ,(prev,next) -> next, HashMap::new));
    }

    private void linkRecords(RRSet record) {
        if(record.getComments() == null || record.getComments().isEmpty()) return;
        String serverId = record.getComments().get(0).getContent();
        ServerRecord info = serverDNSCache.getDnsRecords().get(serverId);
        if(info == null) info = new ServerRecord(serverId);
        switch (record.getType()){
            case "CNAME":
            case "A":
                info.setCname(record);
                break;
            case "SRV":
                info.setSrv(record);
        }
        serverDNSCache.getDnsRecords().put(info.getServerId(),info);
    }

    private PowerDNSApi loadPowerDNSAPI() throws NullPointerException{
        String powerDnsUrl = configuration.getString("powerdns-url");
        Objects.requireNonNull(powerDnsUrl, "powerdns-url");
        String powerDnsApiKey = configuration.getString("powerdns-apikey");
        Objects.requireNonNull(powerDnsApiKey, "powerdns-apikey");
        ApiClient client = org.openapitools.client.Configuration.getDefaultApiClient();
        client.setBasePath(powerDnsUrl);
        client.setApiKey(powerDnsApiKey);
        return new PowerDNSApi(client);
    }

    private PteroAPI loadPteroAPI() {
        String pterodactylUrl = configuration.getString("pterodactyl-url");
        String pterodactylApiKey = configuration.getString("pterodactyl-apikey");
        Objects.requireNonNull(pterodactylUrl, "pterodactyl-url");
        Objects.requireNonNull(pterodactylApiKey, "pterodactyl-apikey");

        return new PteroBuilder().setApplicationUrl(pterodactylUrl).setToken(pterodactylApiKey).build();
    }

    private Configuration loadConfiguration() throws ConfigurationException {
        Configurations config = new Configurations();
        return config.properties(new File("pteropowerdns.properties"));
    }
}
