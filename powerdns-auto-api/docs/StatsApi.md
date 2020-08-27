# StatsApi

All URIs are relative to *http://localhost:8081/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStats**](StatsApi.md#getStats) | **GET** /servers/{server_id}/statistics | Query statistics.


<a name="getStats"></a>
# **getStats**
> List&lt;Object&gt; getStats(serverId, statistic, includerings)

Query statistics.

Query PowerDNS internal statistics.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String statistic = "statistic_example"; // String | When set to the name of a specific statistic, only this value is returned. If no statistic with that name exists, the response has a 422 status and an error message. 
    Boolean includerings = true; // Boolean | “true” (default) or “false”, whether to include the Ring items, which can contain thousands of log messages or queried domains. Setting this to ”false” may make the response a lot smaller.
    try {
      List<Object> result = apiInstance.getStats(serverId, statistic, includerings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverId** | **String**| The id of the server to retrieve |
 **statistic** | **String**| When set to the name of a specific statistic, only this value is returned. If no statistic with that name exists, the response has a 422 status and an error message.  | [optional]
 **includerings** | **Boolean**| “true” (default) or “false”, whether to include the Ring items, which can contain thousands of log messages or queried domains. Setting this to ”false” may make the response a lot smaller. | [optional] [default to true]

### Return type

**List&lt;Object&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Statistic Items |  -  |
**422** | Returned when a non-existing statistic name has been requested. Contains an error message |  -  |

