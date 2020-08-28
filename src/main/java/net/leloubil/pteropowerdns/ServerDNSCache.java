package net.leloubil.pteropowerdns;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class ServerDNSCache {

    @Getter
    HashMap<String, ServerRecord> dnsRecords = new HashMap<>();
    @Getter
    @Setter
    private HashMap<String, ServerInfo> serverInfoList = new HashMap<>();

}
