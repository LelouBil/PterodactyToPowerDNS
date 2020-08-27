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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatsApi {
    private ApiClient localVarApiClient;

    public StatsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getStats
     * @param serverId The id of the server to retrieve (required)
     * @param statistic When set to the name of a specific statistic, only this value is returned. If no statistic with that name exists, the response has a 422 status and an error message.  (optional)
     * @param includerings “true” (default) or “false”, whether to include the Ring items, which can contain thousands of log messages or queried domains. Setting this to ”false” may make the response a lot smaller. (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of Statistic Items </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Returned when a non-existing statistic name has been requested. Contains an error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatsCall(String serverId, String statistic, Boolean includerings, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/servers/{server_id}/statistics"
            .replaceAll("\\{" + "server_id" + "\\}", localVarApiClient.escapeString(serverId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (statistic != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("statistic", statistic));
        }

        if (includerings != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includerings", includerings));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIKeyHeader" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatsValidateBeforeCall(String serverId, String statistic, Boolean includerings, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'serverId' is set
        if (serverId == null) {
            throw new ApiException("Missing the required parameter 'serverId' when calling getStats(Async)");
        }
        

        okhttp3.Call localVarCall = getStatsCall(serverId, statistic, includerings, _callback);
        return localVarCall;

    }

    /**
     * Query statistics.
     * Query PowerDNS internal statistics.
     * @param serverId The id of the server to retrieve (required)
     * @param statistic When set to the name of a specific statistic, only this value is returned. If no statistic with that name exists, the response has a 422 status and an error message.  (optional)
     * @param includerings “true” (default) or “false”, whether to include the Ring items, which can contain thousands of log messages or queried domains. Setting this to ”false” may make the response a lot smaller. (optional, default to true)
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of Statistic Items </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Returned when a non-existing statistic name has been requested. Contains an error message </td><td>  -  </td></tr>
     </table>
     */
    public List<Object> getStats(String serverId, String statistic, Boolean includerings) throws ApiException {
        ApiResponse<List<Object>> localVarResp = getStatsWithHttpInfo(serverId, statistic, includerings);
        return localVarResp.getData();
    }

    /**
     * Query statistics.
     * Query PowerDNS internal statistics.
     * @param serverId The id of the server to retrieve (required)
     * @param statistic When set to the name of a specific statistic, only this value is returned. If no statistic with that name exists, the response has a 422 status and an error message.  (optional)
     * @param includerings “true” (default) or “false”, whether to include the Ring items, which can contain thousands of log messages or queried domains. Setting this to ”false” may make the response a lot smaller. (optional, default to true)
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of Statistic Items </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Returned when a non-existing statistic name has been requested. Contains an error message </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Object>> getStatsWithHttpInfo(String serverId, String statistic, Boolean includerings) throws ApiException {
        okhttp3.Call localVarCall = getStatsValidateBeforeCall(serverId, statistic, includerings, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Query statistics. (asynchronously)
     * Query PowerDNS internal statistics.
     * @param serverId The id of the server to retrieve (required)
     * @param statistic When set to the name of a specific statistic, only this value is returned. If no statistic with that name exists, the response has a 422 status and an error message.  (optional)
     * @param includerings “true” (default) or “false”, whether to include the Ring items, which can contain thousands of log messages or queried domains. Setting this to ”false” may make the response a lot smaller. (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of Statistic Items </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Returned when a non-existing statistic name has been requested. Contains an error message </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStatsAsync(String serverId, String statistic, Boolean includerings, final ApiCallback<List<Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStatsValidateBeforeCall(serverId, statistic, includerings, _callback);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}