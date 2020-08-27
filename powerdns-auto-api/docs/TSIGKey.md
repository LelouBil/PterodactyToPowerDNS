

# TSIGKey

A TSIG key that can be used to authenticate NOTIFYs and AXFRs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the key |  [optional]
**id** | **String** | The ID for this key, used in the TSIGkey URL endpoint. |  [optional] [readonly]
**algorithm** | **String** | The algorithm of the TSIG key |  [optional]
**key** | **String** | The Base64 encoded secret key, empty when listing keys. MAY be empty when POSTing to have the server generate the key material |  [optional]
**type** | **String** | Set to \&quot;TSIGKey\&quot; |  [optional] [readonly]



