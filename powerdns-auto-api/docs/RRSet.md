

# RRSet

This represents a Resource Record Set (all records with the same name and type).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for record set (e.g. “www.powerdns.com.”) | 
**type** | **String** | Type of this record (e.g. “A”, “PTR”, “MX”) | 
**ttl** | **Integer** | DNS TTL of the records, in seconds. MUST NOT be included when changetype is set to “DELETE”. | 
**changetype** | **String** | MUST be added when updating the RRSet. Must be REPLACE or DELETE. With DELETE, all existing RRs matching name and type will be deleted, including all comments. With REPLACE: when records is present, all existing RRs matching name and type will be deleted, and then new records given in records will be created. If no records are left, any existing comments will be deleted as well. When comments is present, all existing comments for the RRs matching name and type will be deleted, and then new comments given in comments will be created. | 
**records** | [**List&lt;Record&gt;**](Record.md) | All records in this RRSet. When updating Records, this is the list of new records (replacing the old ones). Must be empty when changetype is set to DELETE. An empty list results in deletion of all records (and comments). | 
**comments** | [**List&lt;Comment&gt;**](Comment.md) | List of Comment. Must be empty when changetype is set to DELETE. An empty list results in deletion of all comments. modified_at is optional and defaults to the current server time. |  [optional]



