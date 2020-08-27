package net.leloubil.pteropowerdns;

import lombok.Getter;
import lombok.Setter;
import org.openapitools.client.model.RRSet;

public class ServerRecord {

    public ServerRecord(String serverId) {
        this.serverId = serverId;
    }

    @Getter
    private String serverId;

    @Getter @Setter
    private RRSet Cname;


    @Getter @Setter
    private RRSet srv;

}
