

# Cryptokey

Describes a DNSSEC cryptographic key
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | set to \&quot;Cryptokey\&quot; |  [optional]
**id** | **Integer** | The internal identifier, read only |  [optional]
**keytype** | [**KeytypeEnum**](#KeytypeEnum) |  |  [optional]
**active** | **Boolean** | Whether or not the key is in active use |  [optional]
**published** | **Boolean** | Whether or not the DNSKEY record is published in the zone |  [optional]
**dnskey** | **String** | The DNSKEY record for this key |  [optional]
**ds** | **List&lt;String&gt;** | An array of DS records for this key |  [optional]
**privatekey** | **String** | The private key in ISC format |  [optional]
**algorithm** | **String** | The name of the algorithm of the key, should be a mnemonic |  [optional]
**bits** | **Integer** | The size of the key |  [optional]



## Enum: KeytypeEnum

Name | Value
---- | -----
KSK | &quot;ksk&quot;
ZSK | &quot;zsk&quot;
CSK | &quot;csk&quot;



