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
 * Zone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T15:16:41.679-06:00")
public class Zone {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("isClimateControlled")
  private Boolean isClimateControlled = false;

  @SerializedName("isFoodGrade")
  private Boolean isFoodGrade = false;

  @SerializedName("isSecure")
  private Boolean isSecure = false;

  @SerializedName("isFrozen")
  private Boolean isFrozen = false;

  @SerializedName("isRefrigerated")
  private Boolean isRefrigerated = false;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

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

  public Zone warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public Zone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Zone address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Zone isClimateControlled(Boolean isClimateControlled) {
    this.isClimateControlled = isClimateControlled;
    return this;
  }

   /**
   * Get isClimateControlled
   * @return isClimateControlled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsClimateControlled() {
    return isClimateControlled;
  }

  public void setIsClimateControlled(Boolean isClimateControlled) {
    this.isClimateControlled = isClimateControlled;
  }

  public Zone isFoodGrade(Boolean isFoodGrade) {
    this.isFoodGrade = isFoodGrade;
    return this;
  }

   /**
   * Get isFoodGrade
   * @return isFoodGrade
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFoodGrade() {
    return isFoodGrade;
  }

  public void setIsFoodGrade(Boolean isFoodGrade) {
    this.isFoodGrade = isFoodGrade;
  }

  public Zone isSecure(Boolean isSecure) {
    this.isSecure = isSecure;
    return this;
  }

   /**
   * Get isSecure
   * @return isSecure
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSecure() {
    return isSecure;
  }

  public void setIsSecure(Boolean isSecure) {
    this.isSecure = isSecure;
  }

  public Zone isFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
    return this;
  }

   /**
   * Get isFrozen
   * @return isFrozen
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFrozen() {
    return isFrozen;
  }

  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  public Zone isRefrigerated(Boolean isRefrigerated) {
    this.isRefrigerated = isRefrigerated;
    return this;
  }

   /**
   * Get isRefrigerated
   * @return isRefrigerated
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRefrigerated() {
    return isRefrigerated;
  }

  public void setIsRefrigerated(Boolean isRefrigerated) {
    this.isRefrigerated = isRefrigerated;
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

  public Zone customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Zone putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Zone zone = (Zone) o;
    return Objects.equals(this.id, zone.id) &&
        Objects.equals(this.warehouseId, zone.warehouseId) &&
        Objects.equals(this.name, zone.name) &&
        Objects.equals(this.address, zone.address) &&
        Objects.equals(this.isClimateControlled, zone.isClimateControlled) &&
        Objects.equals(this.isFoodGrade, zone.isFoodGrade) &&
        Objects.equals(this.isSecure, zone.isSecure) &&
        Objects.equals(this.isFrozen, zone.isFrozen) &&
        Objects.equals(this.isRefrigerated, zone.isRefrigerated) &&
        Objects.equals(this.createDate, zone.createDate) &&
        Objects.equals(this.modifyDate, zone.modifyDate) &&
        Objects.equals(this.customFields, zone.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, name, address, isClimateControlled, isFoodGrade, isSecure, isFrozen, isRefrigerated, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isClimateControlled: ").append(toIndentedString(isClimateControlled)).append("\n");
    sb.append("    isFoodGrade: ").append(toIndentedString(isFoodGrade)).append("\n");
    sb.append("    isSecure: ").append(toIndentedString(isSecure)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    isRefrigerated: ").append(toIndentedString(isRefrigerated)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

