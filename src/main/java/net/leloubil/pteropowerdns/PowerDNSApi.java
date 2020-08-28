package net.leloubil.pteropowerdns;

import lombok.Getter;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.ServersApi;
import org.openapitools.client.api.ZonesApi;

public class PowerDNSApi {

    @Getter
    private final ServersApi serversApi;

    @Getter
    private final ZonesApi zonesApi;

    public PowerDNSApi(ApiClient client) {
        serversApi = new ServersApi(client);
        zonesApi = new ZonesApi(client);
    }
}
