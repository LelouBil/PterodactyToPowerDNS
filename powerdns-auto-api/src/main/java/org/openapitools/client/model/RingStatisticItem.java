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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SimpleStatisticItem;

/**
 * RingStatisticItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T14:59:34.966+02:00[Europe/Paris]")
public class RingStatisticItem {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<SimpleStatisticItem> value = null;


  public RingStatisticItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Item name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RingStatisticItem type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Set to \&quot;RingStatisticItem\&quot;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to \"RingStatisticItem\"")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public RingStatisticItem size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Ring size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ring size")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public RingStatisticItem value(List<SimpleStatisticItem> value) {
    
    this.value = value;
    return this;
  }

  public RingStatisticItem addValueItem(SimpleStatisticItem valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<SimpleStatisticItem>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Named values
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Named values")

  public List<SimpleStatisticItem> getValue() {
    return value;
  }


  public void setValue(List<SimpleStatisticItem> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RingStatisticItem ringStatisticItem = (RingStatisticItem) o;
    return Objects.equals(this.name, ringStatisticItem.name) &&
        Objects.equals(this.type, ringStatisticItem.type) &&
        Objects.equals(this.size, ringStatisticItem.size) &&
        Objects.equals(this.value, ringStatisticItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, size, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RingStatisticItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

