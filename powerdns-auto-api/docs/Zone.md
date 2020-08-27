

# Zone

This represents an authoritative DNS Zone.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Opaque zone id (string), assigned by the server, should not be interpreted by the application. Guaranteed to be safe for embedding in URLs. |  [optional]
**name** | **String** | Name of the zone (e.g. “example.com.”) MUST have a trailing dot |  [optional]
**type** | **String** | Set to “Zone” |  [optional]
**url** | **String** | API endpoint for this zone |  [optional]
**kind** | [**KindEnum**](#KindEnum) | Zone kind, one of “Native”, “Master”, “Slave” |  [optional]
**rrsets** | [**List&lt;RRSet&gt;**](RRSet.md) | RRSets in this zone (for zones/{zone_id} endpoint only; omitted during GET on the .../zones list endpoint) |  [optional]
**serial** | **Integer** | The SOA serial number |  [optional]
**notifiedSerial** | **Integer** | The SOA serial notifications have been sent out for |  [optional]
**editedSerial** | **Integer** | The SOA serial as seen in query responses. Calculated using the SOA-EDIT metadata, default-soa-edit and default-soa-edit-signed settings |  [optional]
**masters** | **List&lt;String&gt;** |  List of IP addresses configured as a master for this zone (“Slave” type zones only) |  [optional]
**dnssec** | **Boolean** | Whether or not this zone is DNSSEC signed (inferred from presigned being true XOR presence of at least one cryptokey with active being true) |  [optional]
**nsec3param** | **String** | The NSEC3PARAM record |  [optional]
**nsec3narrow** | **Boolean** | Whether or not the zone uses NSEC3 narrow |  [optional]
**presigned** | **Boolean** | Whether or not the zone is pre-signed |  [optional]
**soaEdit** | **String** | The SOA-EDIT metadata item |  [optional]
**soaEditApi** | **String** | The SOA-EDIT-API metadata item |  [optional]
**apiRectify** | **Boolean** |  Whether or not the zone will be rectified on data changes via the API |  [optional]
**zone** | **String** | MAY contain a BIND-style zone file when creating a zone |  [optional]
**account** | **String** | MAY be set. Its value is defined by local policy |  [optional]
**nameservers** | **List&lt;String&gt;** | MAY be sent in client bodies during creation, and MUST NOT be sent by the server. Simple list of strings of nameserver names, including the trailing dot. Not required for slave zones. |  [optional]
**masterTsigKeyIds** | **List&lt;String&gt;** | The id of the TSIG keys used for master operation in this zone |  [optional]
**slaveTsigKeyIds** | **List&lt;String&gt;** | The id of the TSIG keys used for slave operation in this zone |  [optional]



## Enum: KindEnum

Name | Value
---- | -----
NATIVE | &quot;Native&quot;
MASTER | &quot;Master&quot;
SLAVE | &quot;Slave&quot;



