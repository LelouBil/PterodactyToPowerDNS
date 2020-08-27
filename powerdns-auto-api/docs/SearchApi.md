# SearchApi

All URIs are relative to *http://localhost:8081/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchData**](SearchApi.md#searchData) | **GET** /servers/{server_id}/search-data | Search the data inside PowerDNS


<a name="searchData"></a>
# **searchData**
> List&lt;SearchResult&gt; searchData(serverId, q, max, objectType)

Search the data inside PowerDNS

Search the data inside PowerDNS for search_term and return at most max_results. This includes zones, records and comments. The * character can be used in search_term as a wildcard character and the ? character can be used as a wildcard for a single character.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String q = "q_example"; // String | The string to search for
    Integer max = 56; // Integer | Maximum number of entries to return
    String objectType = "objectType_example"; // String | Type of data to search for, one of “all”, “zone”, “record”, “comment”
    try {
      List<SearchResult> result = apiInstance.searchData(serverId, q, max, objectType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchData");
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
 **q** | **String**| The string to search for |
 **max** | **Integer**| Maximum number of entries to return |
 **objectType** | **String**| Type of data to search for, one of “all”, “zone”, “record”, “comment” | [optional]

### Return type

[**List&lt;SearchResult&gt;**](SearchResult.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a JSON array with results |  -  |

