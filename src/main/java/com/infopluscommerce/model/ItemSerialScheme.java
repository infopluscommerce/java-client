/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * ItemSerialScheme
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-11T11:20:36.936-05:00")
public class ItemSerialScheme {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("receivingBehavior")
  private String receivingBehavior = null;

  @SerializedName("shippingBehavior")
  private String shippingBehavior = null;

  @SerializedName("requireUnique")
  private String requireUnique = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public ItemSerialScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemSerialScheme receivingBehavior(String receivingBehavior) {
    this.receivingBehavior = receivingBehavior;
    return this;
  }

   /**
   * Get receivingBehavior
   * @return receivingBehavior
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReceivingBehavior() {
    return receivingBehavior;
  }

  public void setReceivingBehavior(String receivingBehavior) {
    this.receivingBehavior = receivingBehavior;
  }

  public ItemSerialScheme shippingBehavior(String shippingBehavior) {
    this.shippingBehavior = shippingBehavior;
    return this;
  }

   /**
   * Get shippingBehavior
   * @return shippingBehavior
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShippingBehavior() {
    return shippingBehavior;
  }

  public void setShippingBehavior(String shippingBehavior) {
    this.shippingBehavior = shippingBehavior;
  }

  public ItemSerialScheme requireUnique(String requireUnique) {
    this.requireUnique = requireUnique;
    return this;
  }

   /**
   * Get requireUnique
   * @return requireUnique
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRequireUnique() {
    return requireUnique;
  }

  public void setRequireUnique(String requireUnique) {
    this.requireUnique = requireUnique;
  }

  public ItemSerialScheme customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ItemSerialScheme putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemSerialScheme itemSerialScheme = (ItemSerialScheme) o;
    return Objects.equals(this.id, itemSerialScheme.id) &&
        Objects.equals(this.createDate, itemSerialScheme.createDate) &&
        Objects.equals(this.modifyDate, itemSerialScheme.modifyDate) &&
        Objects.equals(this.name, itemSerialScheme.name) &&
        Objects.equals(this.receivingBehavior, itemSerialScheme.receivingBehavior) &&
        Objects.equals(this.shippingBehavior, itemSerialScheme.shippingBehavior) &&
        Objects.equals(this.requireUnique, itemSerialScheme.requireUnique) &&
        Objects.equals(this.customFields, itemSerialScheme.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, receivingBehavior, shippingBehavior, requireUnique, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSerialScheme {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    receivingBehavior: ").append(toIndentedString(receivingBehavior)).append("\n");
    sb.append("    shippingBehavior: ").append(toIndentedString(shippingBehavior)).append("\n");
    sb.append("    requireUnique: ").append(toIndentedString(requireUnique)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

