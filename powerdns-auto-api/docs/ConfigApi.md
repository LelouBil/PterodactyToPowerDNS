# ConfigApi

All URIs are relative to *http://localhost:8081/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfig**](ConfigApi.md#getConfig) | **GET** /servers/{server_id}/config | Returns all ConfigSettings for a single server
[**getConfigSetting**](ConfigApi.md#getConfigSetting) | **GET** /servers/{server_id}/config/{config_setting_name} | Returns a specific ConfigSetting for a single server


<a name="getConfig"></a>
# **getConfig**
> List&lt;ConfigSetting&gt; getConfig(serverId)

Returns all ConfigSettings for a single server

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    try {
      List<ConfigSetting> result = apiInstance.getConfig(serverId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#getConfig");
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

[**List&lt;ConfigSetting&gt;**](ConfigSetting.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of config values |  -  |

<a name="getConfigSetting"></a>
# **getConfigSetting**
> ConfigSetting getConfigSetting(serverId, configSettingName)

Returns a specific ConfigSetting for a single server

NOT IMPLEMENTED

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String configSettingName = "configSettingName_example"; // String | The name of the setting to retrieve
    try {
      ConfigSetting result = apiInstance.getConfigSetting(serverId, configSettingName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#getConfigSetting");
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
 **configSettingName** | **String**| The name of the setting to retrieve |

### Return type

[**ConfigSetting**](ConfigSetting.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of config values |  -  |

