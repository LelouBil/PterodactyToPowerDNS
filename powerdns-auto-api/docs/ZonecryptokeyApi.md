# ZonecryptokeyApi

All URIs are relative to *http://localhost:8081/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCryptokey**](ZonecryptokeyApi.md#createCryptokey) | **POST** /servers/{server_id}/zones/{zone_id}/cryptokeys | Creates a Cryptokey
[**deleteCryptokey**](ZonecryptokeyApi.md#deleteCryptokey) | **DELETE** /servers/{server_id}/zones/{zone_id}/cryptokeys/{cryptokey_id} | This method deletes a key specified by cryptokey_id.
[**getCryptokey**](ZonecryptokeyApi.md#getCryptokey) | **GET** /servers/{server_id}/zones/{zone_id}/cryptokeys/{cryptokey_id} | Returns all data about the CryptoKey, including the privatekey.
[**listCryptokeys**](ZonecryptokeyApi.md#listCryptokeys) | **GET** /servers/{server_id}/zones/{zone_id}/cryptokeys | Get all CryptoKeys for a zone, except the privatekey
[**modifyCryptokey**](ZonecryptokeyApi.md#modifyCryptokey) | **PUT** /servers/{server_id}/zones/{zone_id}/cryptokeys/{cryptokey_id} | This method (de)activates a key from zone_name specified by cryptokey_id


<a name="createCryptokey"></a>
# **createCryptokey**
> Cryptokey createCryptokey(serverId, zoneId, cryptokey)

Creates a Cryptokey

This method adds a new key to a zone. The key can either be generated or imported by supplying the content parameter. if content, bits and algo are null, a key will be generated based on the default-ksk-algorithm and default-ksk-size settings for a KSK and the default-zsk-algorithm and default-zsk-size options for a ZSK.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonecryptokeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonecryptokeyApi apiInstance = new ZonecryptokeyApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | 
    Cryptokey cryptokey = new Cryptokey(); // Cryptokey | Add a Cryptokey
    try {
      Cryptokey result = apiInstance.createCryptokey(serverId, zoneId, cryptokey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonecryptokeyApi#createCryptokey");
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
 **zoneId** | **String**|  |
 **cryptokey** | [**Cryptokey**](Cryptokey.md)| Add a Cryptokey |

### Return type

[**Cryptokey**](Cryptokey.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteCryptokey"></a>
# **deleteCryptokey**
> deleteCryptokey(serverId, zoneId, cryptokeyId)

This method deletes a key specified by cryptokey_id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonecryptokeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonecryptokeyApi apiInstance = new ZonecryptokeyApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    String cryptokeyId = "cryptokeyId_example"; // String | The id value of the Cryptokey
    try {
      apiInstance.deleteCryptokey(serverId, zoneId, cryptokeyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonecryptokeyApi#deleteCryptokey");
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
 **zoneId** | **String**| The id of the zone to retrieve |
 **cryptokeyId** | **String**| The id value of the Cryptokey |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**422** | Returned when something is wrong with the content of the request. Contains an error message |  -  |

<a name="getCryptokey"></a>
# **getCryptokey**
> Cryptokey getCryptokey(serverId, zoneId, cryptokeyId)

Returns all data about the CryptoKey, including the privatekey.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonecryptokeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonecryptokeyApi apiInstance = new ZonecryptokeyApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    String cryptokeyId = "cryptokeyId_example"; // String | The id value of the CryptoKey
    try {
      Cryptokey result = apiInstance.getCryptokey(serverId, zoneId, cryptokeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonecryptokeyApi#getCryptokey");
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
 **zoneId** | **String**| The id of the zone to retrieve |
 **cryptokeyId** | **String**| The id value of the CryptoKey |

### Return type

[**Cryptokey**](Cryptokey.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cryptokey |  -  |

<a name="listCryptokeys"></a>
# **listCryptokeys**
> List&lt;Cryptokey&gt; listCryptokeys(serverId, zoneId)

Get all CryptoKeys for a zone, except the privatekey

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonecryptokeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonecryptokeyApi apiInstance = new ZonecryptokeyApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    try {
      List<Cryptokey> result = apiInstance.listCryptokeys(serverId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonecryptokeyApi#listCryptokeys");
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
 **zoneId** | **String**| The id of the zone to retrieve |

### Return type

[**List&lt;Cryptokey&gt;**](Cryptokey.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Cryptokey objects |  -  |

<a name="modifyCryptokey"></a>
# **modifyCryptokey**
> modifyCryptokey(serverId, zoneId, cryptokeyId, cryptokey)

This method (de)activates a key from zone_name specified by cryptokey_id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonecryptokeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonecryptokeyApi apiInstance = new ZonecryptokeyApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | 
    String cryptokeyId = "cryptokeyId_example"; // String | Cryptokey to manipulate
    Cryptokey cryptokey = new Cryptokey(); // Cryptokey | the Cryptokey
    try {
      apiInstance.modifyCryptokey(serverId, zoneId, cryptokeyId, cryptokey);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonecryptokeyApi#modifyCryptokey");
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
 **zoneId** | **String**|  |
 **cryptokeyId** | **String**| Cryptokey to manipulate |
 **cryptokey** | [**Cryptokey**](Cryptokey.md)| the Cryptokey |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK |  -  |
**422** | Returned when something is wrong with the content of the request. Contains an error message |  -  |

