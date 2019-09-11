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
 * OrderSourceItemSetup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-11T11:20:36.936-05:00")
public class OrderSourceItemSetup {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("orderSourceId")
  private Integer orderSourceId = null;

  @SerializedName("packingNotes")
  private String packingNotes = null;

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
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public OrderSourceItemSetup lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public OrderSourceItemSetup sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public OrderSourceItemSetup orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }

   /**
   * Get orderSourceId
   * @return orderSourceId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }

  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  public OrderSourceItemSetup packingNotes(String packingNotes) {
    this.packingNotes = packingNotes;
    return this;
  }

   /**
   * Get packingNotes
   * @return packingNotes
  **/
  @ApiModelProperty(value = "")
  public String getPackingNotes() {
    return packingNotes;
  }

  public void setPackingNotes(String packingNotes) {
    this.packingNotes = packingNotes;
  }

  public OrderSourceItemSetup customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OrderSourceItemSetup putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OrderSourceItemSetup orderSourceItemSetup = (OrderSourceItemSetup) o;
    return Objects.equals(this.id, orderSourceItemSetup.id) &&
        Objects.equals(this.modifyDate, orderSourceItemSetup.modifyDate) &&
        Objects.equals(this.createDate, orderSourceItemSetup.createDate) &&
        Objects.equals(this.lobId, orderSourceItemSetup.lobId) &&
        Objects.equals(this.sku, orderSourceItemSetup.sku) &&
        Objects.equals(this.orderSourceId, orderSourceItemSetup.orderSourceId) &&
        Objects.equals(this.packingNotes, orderSourceItemSetup.packingNotes) &&
        Objects.equals(this.customFields, orderSourceItemSetup.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modifyDate, createDate, lobId, sku, orderSourceId, packingNotes, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSourceItemSetup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    packingNotes: ").append(toIndentedString(packingNotes)).append("\n");
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

