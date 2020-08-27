package net.leloubil.pteropowerdns;

import com.mattmalec.pterodactyl4j.application.entities.ApplicationServer;
import lombok.Getter;

public class ServerInfo {


    @Getter
    private String subdomain;

    public ServerInfo(ApplicationServer server) {
        this.subdomain = server.getExternalId();
        this.serverid = server.getUUID();
        this.port = Integer.parseInt(server.retrieveAllocation().execute().getPort());
        this.minecraft = server.retrieveNest().execute().getName().equals("Minecraft");
    }

    @Getter
    private String serverid;

    @Getter
    public boolean minecraft;

    @Getter
    private int port;


}
