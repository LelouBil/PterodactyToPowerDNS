# ZonemetadataApi

All URIs are relative to *http://localhost:8081/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMetadata**](ZonemetadataApi.md#createMetadata) | **POST** /servers/{server_id}/zones/{zone_id}/metadata | Creates a set of metadata entries
[**deleteMetadata**](ZonemetadataApi.md#deleteMetadata) | **DELETE** /servers/{server_id}/zones/{zone_id}/metadata/{metadata_kind} | Delete all items of a single kind of domain metadata.
[**getMetadata**](ZonemetadataApi.md#getMetadata) | **GET** /servers/{server_id}/zones/{zone_id}/metadata/{metadata_kind} | Get the content of a single kind of domain metadata as a Metadata object.
[**listMetadata**](ZonemetadataApi.md#listMetadata) | **GET** /servers/{server_id}/zones/{zone_id}/metadata | Get all the Metadata associated with the zone.
[**modifyMetadata**](ZonemetadataApi.md#modifyMetadata) | **PUT** /servers/{server_id}/zones/{zone_id}/metadata/{metadata_kind} | Replace the content of a single kind of domain metadata.


<a name="createMetadata"></a>
# **createMetadata**
> createMetadata(serverId, zoneId, metadata)

Creates a set of metadata entries

Creates a set of metadata entries of given kind for the zone. Existing metadata entries for the zone with the same kind are not overwritten.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonemetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonemetadataApi apiInstance = new ZonemetadataApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | 
    Metadata metadata = new Metadata(); // Metadata | Metadata object with list of values to create
    try {
      apiInstance.createMetadata(serverId, zoneId, metadata);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonemetadataApi#createMetadata");
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
 **metadata** | [**Metadata**](Metadata.md)| Metadata object with list of values to create |

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

<a name="deleteMetadata"></a>
# **deleteMetadata**
> deleteMetadata(serverId, zoneId, metadataKind)

Delete all items of a single kind of domain metadata.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonemetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonemetadataApi apiInstance = new ZonemetadataApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    String metadataKind = "metadataKind_example"; // String | The kind of metadata
    try {
      apiInstance.deleteMetadata(serverId, zoneId, metadataKind);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonemetadataApi#deleteMetadata");
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
 **metadataKind** | **String**| The kind of metadata |

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

<a name="getMetadata"></a>
# **getMetadata**
> Metadata getMetadata(serverId, zoneId, metadataKind)

Get the content of a single kind of domain metadata as a Metadata object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonemetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonemetadataApi apiInstance = new ZonemetadataApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    String metadataKind = "metadataKind_example"; // String | The kind of metadata
    try {
      Metadata result = apiInstance.getMetadata(serverId, zoneId, metadataKind);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonemetadataApi#getMetadata");
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
 **metadataKind** | **String**| The kind of metadata |

### Return type

[**Metadata**](Metadata.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Metadata object with list of values |  -  |

<a name="listMetadata"></a>
# **listMetadata**
> List&lt;Metadata&gt; listMetadata(serverId, zoneId)

Get all the Metadata associated with the zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonemetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonemetadataApi apiInstance = new ZonemetadataApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | The id of the zone to retrieve
    try {
      List<Metadata> result = apiInstance.listMetadata(serverId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonemetadataApi#listMetadata");
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

[**List&lt;Metadata&gt;**](Metadata.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Metadata objects |  -  |

<a name="modifyMetadata"></a>
# **modifyMetadata**
> Metadata modifyMetadata(serverId, zoneId, metadataKind, metadata)

Replace the content of a single kind of domain metadata.

Creates a set of metadata entries of given kind for the zone. Existing metadata entries for the zone with the same kind are removed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonemetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    ZonemetadataApi apiInstance = new ZonemetadataApi(defaultClient);
    String serverId = "serverId_example"; // String | The id of the server to retrieve
    String zoneId = "zoneId_example"; // String | 
    String metadataKind = "metadataKind_example"; // String | The kind of metadata
    Metadata metadata = new Metadata(); // Metadata | metadata to add/create
    try {
      Metadata result = apiInstance.modifyMetadata(serverId, zoneId, metadataKind, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonemetadataApi#modifyMetadata");
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
 **metadataKind** | **String**| The kind of metadata |
 **metadata** | [**Metadata**](Metadata.md)| metadata to add/create |

### Return type

[**Metadata**](Metadata.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Metadata object with list of values |  -  |

