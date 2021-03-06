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
import org.openapitools.client.model.Zone;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZonesApi
 */
@Ignore
public class ZonesApiTest {

    private final ZonesApi api = new ZonesApi();

    
    /**
     * Returns the zone in AXFR format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void axfrExportZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        String response = api.axfrExportZone(serverId, zoneId);

        // TODO: test validations
    }
    
    /**
     * Retrieve slave zone from its master.
     *
     * Fails when zone kind is not Slave, or slave is disabled in the configuration. Clients MUST NOT send a body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void axfrRetrieveZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        api.axfrRetrieveZone(serverId, zoneId);

        // TODO: test validations
    }
    
    /**
     * Creates a new domain, returns the Zone on creation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createZoneTest() throws ApiException {
        String serverId = null;
        Zone zoneStruct = null;
        Boolean rrsets = null;
        Zone response = api.createZone(serverId, zoneStruct, rrsets);

        // TODO: test validations
    }
    
    /**
     * Deletes this zone, all attached metadata and rrsets.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        api.deleteZone(serverId, zoneId);

        // TODO: test validations
    }
    
    /**
     * zone managed by a server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        Boolean rrsets = null;
        Zone response = api.listZone(serverId, zoneId, rrsets);

        // TODO: test validations
    }
    
    /**
     * List all Zones in a server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listZonesTest() throws ApiException {
        String serverId = null;
        String zone = null;
        Boolean dnssec = null;
        List<Zone> response = api.listZones(serverId, zone, dnssec);

        // TODO: test validations
    }
    
    /**
     * Send a DNS NOTIFY to all slaves.
     *
     * Fails when zone kind is not Master or Slave, or master and slave are disabled in the configuration. Only works for Slave if renotify is on. Clients MUST NOT send a body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        api.notifyZone(serverId, zoneId);

        // TODO: test validations
    }
    
    /**
     * Creates/modifies/deletes RRsets present in the payload and their comments. Returns 204 No Content on success.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        Zone zoneStruct = null;
        api.patchZone(serverId, zoneId, zoneStruct);

        // TODO: test validations
    }
    
    /**
     * Modifies basic zone data (metadata).
     *
     * Allowed fields in client body: all except id, url and name. Returns 204 No Content on success.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        Zone zoneStruct = null;
        api.putZone(serverId, zoneId, zoneStruct);

        // TODO: test validations
    }
    
    /**
     * Rectify the zone data.
     *
     * This does not take into account the API-RECTIFY metadata. Fails on slave zones and zones that do not have DNSSEC.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rectifyZoneTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        String response = api.rectifyZone(serverId, zoneId);

        // TODO: test validations
    }
    
}
