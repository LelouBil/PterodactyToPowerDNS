/*
 * PowerDNS Authoritative HTTP API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A TSIG key that can be used to authenticate NOTIFYs and AXFRs
 */
@ApiModel(description = "A TSIG key that can be used to authenticate NOTIFYs and AXFRs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T14:59:34.966+02:00[Europe/Paris]")
public class TSIGKey {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private String algorithm;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public TSIGKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the key
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the key")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The ID for this key, used in the TSIGkey URL endpoint.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for this key, used in the TSIGkey URL endpoint.")

  public String getId() {
    return id;
  }




  public TSIGKey algorithm(String algorithm) {
    
    this.algorithm = algorithm;
    return this;
  }

   /**
   * The algorithm of the TSIG key
   * @return algorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The algorithm of the TSIG key")

  public String getAlgorithm() {
    return algorithm;
  }


  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }


  public TSIGKey key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The Base64 encoded secret key, empty when listing keys. MAY be empty when POSTing to have the server generate the key material
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Base64 encoded secret key, empty when listing keys. MAY be empty when POSTing to have the server generate the key material")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


   /**
   * Set to \&quot;TSIGKey\&quot;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to \"TSIGKey\"")

  public String getType() {
    return type;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TSIGKey tsIGKey = (TSIGKey) o;
    return Objects.equals(this.name, tsIGKey.name) &&
        Objects.equals(this.id, tsIGKey.id) &&
        Objects.equals(this.algorithm, tsIGKey.algorithm) &&
        Objects.equals(this.key, tsIGKey.key) &&
        Objects.equals(this.type, tsIGKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, algorithm, key, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TSIGKey {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

