# ServersApi

All URIs are relative to *http://localhost:8081/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cacheFlushByName**](ServersApi.md#cacheFlushByName) | **PUT** /servers/{server_id}/cache/flush | Flush a cache-entry by name
[**listServer**](ServersApi.md#listServer) | **GET** /servers/{server_id} | List a server
[**listServers**](ServersApi.md#listServers) | **GET** /servers | List all servers


<a name="cacheFlushByName"></a>
# **cacheFlushByName**
> CacheFlushResult cacheFlushByName(serverId, domain)

Flush a cache-entry by name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ServersApi apiInstance = new ServersApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String domain = "domain_example"; // String | The domain name to flush from the cache
    try {
      CacheFlushResult result = apiInstance.cacheFlushByName(serverId, domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServersApi#cacheFlushByName");
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
 **domain** | **String**| The domain name to flush from the cache |

### Return type

[**CacheFlushResult**](CacheFlushResult.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Flush successful |  -  |

<a name="listServer"></a>
# **listServer**
> Server listServer(serverId)

List a server

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ServersApi apiInstance = new ServersApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    try {
      Server result = apiInstance.listServer(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServersApi#listServer");
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

### Return type

[**Server**](Server.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An server |  -  |

<a name="listServers"></a>
# **listServers**
> List&lt;Server&gt; listServers()

List all servers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ServersApi apiInstance = new ServersApi(defaultClient);
    try {
      List<Server> result = apiInstance.listServers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServersApi#listServers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Server&gt;**](Server.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of servers |  -  |

