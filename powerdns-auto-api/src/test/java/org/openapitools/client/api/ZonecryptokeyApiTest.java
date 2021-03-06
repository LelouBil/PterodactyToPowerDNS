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
import org.openapitools.client.model.Cryptokey;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZonecryptokeyApi
 */
@Ignore
public class ZonecryptokeyApiTest {

    private final ZonecryptokeyApi api = new ZonecryptokeyApi();

    
    /**
     * Creates a Cryptokey
     *
     * This method adds a new key to a zone. The key can either be generated or imported by supplying the content parameter. if content, bits and algo are null, a key will be generated based on the default-ksk-algorithm and default-ksk-size settings for a KSK and the default-zsk-algorithm and default-zsk-size options for a ZSK.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCryptokeyTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        Cryptokey cryptokey = null;
        Cryptokey response = api.createCryptokey(serverId, zoneId, cryptokey);

        // TODO: test validations
    }
    
    /**
     * This method deletes a key specified by cryptokey_id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCryptokeyTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        String cryptokeyId = null;
        api.deleteCryptokey(serverId, zoneId, cryptokeyId);

        // TODO: test validations
    }
    
    /**
     * Returns all data about the CryptoKey, including the privatekey.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptokeyTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        String cryptokeyId = null;
        Cryptokey response = api.getCryptokey(serverId, zoneId, cryptokeyId);

        // TODO: test validations
    }
    
    /**
     * Get all CryptoKeys for a zone, except the privatekey
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCryptokeysTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        List<Cryptokey> response = api.listCryptokeys(serverId, zoneId);

        // TODO: test validations
    }
    
    /**
     * This method (de)activates a key from zone_name specified by cryptokey_id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyCryptokeyTest() throws ApiException {
        String serverId = null;
        String zoneId = null;
        String cryptokeyId = null;
        Cryptokey cryptokey = null;
        api.modifyCryptokey(serverId, zoneId, cryptokeyId, cryptokey);

        // TODO: test validations
    }
    
}
