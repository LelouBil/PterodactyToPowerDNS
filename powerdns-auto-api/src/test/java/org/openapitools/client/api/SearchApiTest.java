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
import org.openapitools.client.model.SearchResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Search the data inside PowerDNS
     *
     * Search the data inside PowerDNS for search_term and return at most max_results. This includes zones, records and comments. The * character can be used in search_term as a wildcard character and the ? character can be used as a wildcard for a single character.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDataTest() throws ApiException {
        String serverId = null;
        String q = null;
        Integer max = null;
        String objectType = null;
        List<SearchResult> response = api.searchData(serverId, q, max, objectType);

        // TODO: test validations
    }
    
}
