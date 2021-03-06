/*
 * PowerDNS Authoritative HTTP API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CacheFlushResult;
import org.openapitools.client.model.Server;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServersApi
 */
@Ignore
public class ServersApiTest {

    private final ServersApi api = new ServersApi();

    
    /**
     * Flush a cache-entry by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cacheFlushByNameTest() throws ApiException {
        String serverId = null;
        String domain = null;
        CacheFlushResult response = api.cacheFlushByName(serverId, domain);

        // TODO: test validations
    }
    
    /**
     * List a server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listServerTest() throws ApiException {
        String serverId = null;
        Server response = api.listServer(serverId);

        // TODO: test validations
    }
    
    /**
     * List all servers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listServersTest() throws ApiException {
        List<Server> response = api.listServers();

        // TODO: test validations
    }
    
}
