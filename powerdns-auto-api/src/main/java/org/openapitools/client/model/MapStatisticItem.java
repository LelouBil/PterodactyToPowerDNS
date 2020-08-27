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
 * MapStatisticItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T14:59:34.966+02:00[Europe/Paris]")
public class MapStatisticItem {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<SimpleStatisticItem> value = null;


  public MapStatisticItem name(String name) {
    
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


  public MapStatisticItem type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Set to \&quot;MapStatisticItem\&quot;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to \"MapStatisticItem\"")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MapStatisticItem value(List<SimpleStatisticItem> value) {
    
    this.value = value;
    return this;
  }

  public MapStatisticItem addValueItem(SimpleStatisticItem valueItem) {
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
    MapStatisticItem mapStatisticItem = (MapStatisticItem) o;
    return Objects.equals(this.name, mapStatisticItem.name) &&
        Objects.equals(this.type, mapStatisticItem.type) &&
        Objects.equals(this.value, mapStatisticItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapStatisticItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
