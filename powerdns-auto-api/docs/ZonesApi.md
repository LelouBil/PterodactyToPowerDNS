# ZonesApi

All URIs are relative to *http://localhost:8081/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**axfrExportZone**](ZonesApi.md#axfrExportZone) | **GET** /servers/{server_id}/zones/{zone_id}/export | Returns the zone in AXFR format.
[**axfrRetrieveZone**](ZonesApi.md#axfrRetrieveZone) | **PUT** /servers/{server_id}/zones/{zone_id}/axfr-retrieve | Retrieve slave zone from its master.
[**createZone**](ZonesApi.md#createZone) | **POST** /servers/{server_id}/zones | Creates a new domain, returns the Zone on creation.
[**deleteZone**](ZonesApi.md#deleteZone) | **DELETE** /servers/{server_id}/zones/{zone_id} | Deletes this zone, all attached metadata and rrsets.
[**listZone**](ZonesApi.md#listZone) | **GET** /servers/{server_id}/zones/{zone_id} | zone managed by a server
[**listZones**](ZonesApi.md#listZones) | **GET** /servers/{server_id}/zones | List all Zones in a server
[**notifyZone**](ZonesApi.md#notifyZone) | **PUT** /servers/{server_id}/zones/{zone_id}/notify | Send a DNS NOTIFY to all slaves.
[**patchZone**](ZonesApi.md#patchZone) | **PATCH** /servers/{server_id}/zones/{zone_id} | Creates/modifies/deletes RRsets present in the payload and their comments. Returns 204 No Content on success.
[**putZone**](ZonesApi.md#putZone) | **PUT** /servers/{server_id}/zones/{zone_id} | Modifies basic zone data (metadata).
[**rectifyZone**](ZonesApi.md#rectifyZone) | **PUT** /servers/{server_id}/zones/{zone_id}/rectify | Rectify the zone data.


<a name="axfrExportZone"></a>
# **axfrExportZone**
> String axfrExportZone(serverId, zoneId)

Returns the zone in AXFR format.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    try {
      String result = apiInstance.axfrExportZone(serverId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#axfrExportZone");
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

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="axfrRetrieveZone"></a>
# **axfrRetrieveZone**
> axfrRetrieveZone(serverId, zoneId)

Retrieve slave zone from its master.

Fails when zone kind is not Slave, or slave is disabled in the configuration. Clients MUST NOT send a body.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    try {
      apiInstance.axfrRetrieveZone(serverId, zoneId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#axfrRetrieveZone");
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

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="createZone"></a>
# **createZone**
> Zone createZone(serverId, zoneStruct, rrsets)

Creates a new domain, returns the Zone on creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    Zone zoneStruct = new Zone(); // Zone | The zone struct to patch with
    Boolean rrsets = true; // Boolean | “true” (default) or “false”, whether to include the “rrsets” in the response Zone object.
    try {
      Zone result = apiInstance.createZone(serverId, zoneStruct, rrsets);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#createZone");
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
 **zoneStruct** | [**Zone**](Zone.md)| The zone struct to patch with |
 **rrsets** | **Boolean**| “true” (default) or “false”, whether to include the “rrsets” in the response Zone object. | [optional] [default to true]

### Return type

[**Zone**](Zone.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A zone |  -  |

<a name="deleteZone"></a>
# **deleteZone**
> deleteZone(serverId, zoneId)

Deletes this zone, all attached metadata and rrsets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    try {
      apiInstance.deleteZone(serverId, zoneId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#deleteZone");
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

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Returns 204 No Content on success. |  -  |

<a name="listZone"></a>
# **listZone**
> Zone listZone(serverId, zoneId, rrsets)

zone managed by a server

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    Boolean rrsets = true; // Boolean | “true” (default) or “false”, whether to include the “rrsets” in the response Zone object.
    try {
      Zone result = apiInstance.listZone(serverId, zoneId, rrsets);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#listZone");
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
 **rrsets** | **Boolean**| “true” (default) or “false”, whether to include the “rrsets” in the response Zone object. | [optional] [default to true]

### Return type

[**Zone**](Zone.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Zone |  -  |

<a name="listZones"></a>
# **listZones**
> List&lt;Zone&gt; listZones(serverId, zone, dnssec)

List all Zones in a server

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zone = "zone_example"; // String | When set to the name of a zone, only this zone is returned. If no zone with that name exists, the response is an empty array. This can e.g. be used to check if a zone exists in the database without having to guess/encode the zone's id or to check if a zone exists. 
    Boolean dnssec = true; // Boolean | “true” (default) or “false”, whether to include the “dnssec” and ”edited_serial” fields in the Zone objects. Setting this to ”false” will make the query a lot faster.
    try {
      List<Zone> result = apiInstance.listZones(serverId, zone, dnssec);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#listZones");
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
 **zone** | **String**| When set to the name of a zone, only this zone is returned. If no zone with that name exists, the response is an empty array. This can e.g. be used to check if a zone exists in the database without having to guess/encode the zone&#39;s id or to check if a zone exists.  | [optional]
 **dnssec** | **Boolean**| “true” (default) or “false”, whether to include the “dnssec” and ”edited_serial” fields in the Zone objects. Setting this to ”false” will make the query a lot faster. | [optional] [default to true]

### Return type

[**List&lt;Zone&gt;**](Zone.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of Zones |  -  |

<a name="notifyZone"></a>
# **notifyZone**
> notifyZone(serverId, zoneId)

Send a DNS NOTIFY to all slaves.

Fails when zone kind is not Master or Slave, or master and slave are disabled in the configuration. Only works for Slave if renotify is on. Clients MUST NOT send a body.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    try {
      apiInstance.notifyZone(serverId, zoneId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#notifyZone");
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

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="patchZone"></a>
# **patchZone**
> patchZone(serverId, zoneId, zoneStruct)

Creates/modifies/deletes RRsets present in the payload and their comments. Returns 204 No Content on success.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | 
    Zone zoneStruct = new Zone(); // Zone | The zone struct to patch with
    try {
      apiInstance.patchZone(serverId, zoneId, zoneStruct);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#patchZone");
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
 **zoneStruct** | [**Zone**](Zone.md)| The zone struct to patch with |

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
**204** | Returns 204 No Content on success. |  -  |

<a name="putZone"></a>
# **putZone**
> putZone(serverId, zoneId, zoneStruct)

Modifies basic zone data (metadata).

Allowed fields in client body: all except id, url and name. Returns 204 No Content on success.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | 
    Zone zoneStruct = new Zone(); // Zone | The zone struct to patch with
    try {
      apiInstance.putZone(serverId, zoneId, zoneStruct);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#putZone");
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
 **zoneStruct** | [**Zone**](Zone.md)| The zone struct to patch with |

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
**204** | Returns 204 No Content on success. |  -  |

<a name="rectifyZone"></a>
# **rectifyZone**
> String rectifyZone(serverId, zoneId)

Rectify the zone data.

This does not take into account the API-RECTIFY metadata. Fails on slave zones and zones that do not have DNSSEC.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    try {
      String result = apiInstance.rectifyZone(serverId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#rectifyZone");
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

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

