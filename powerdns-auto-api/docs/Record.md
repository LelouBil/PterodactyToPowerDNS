

# Record

The RREntry object represents a single record.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **String** | The content of this record | 
**disabled** | **Boolean** | Whether or not this record is disabled. When unset, the record is not disabled |  [optional]
**setPtr** | **Boolean** | If set to true, the server will find the matching reverse zone and create a PTR there. Existing PTR records are replaced. If no matching reverse Zone, an error is thrown. Only valid in client bodies, only valid for A and AAAA types. Not returned by the server. This feature is deprecated and will be removed in 4.3.0. |  [optional]



