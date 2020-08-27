package net.leloubil.pteropowerdns;

import lombok.Getter;
import lombok.Setter;
import org.openapitools.client.model.RRSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServerDNSCache {

    @Getter @Setter
    private HashMap<String,ServerInfo> serverInfoList = new HashMap<>();

    @Getter
    HashMap<String,ServerRecord> dnsRecords = new HashMap<>();

}
