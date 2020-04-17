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
 * FulfillmentLayoutPosition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T22:42:27.905-05:00")
public class FulfillmentLayoutPosition {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("fulfillmentProcessId")
  private Integer fulfillmentProcessId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("pickPosition")
  private String pickPosition = null;

  @SerializedName("layoutPosition")
  private String layoutPosition = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("quantity")
  private Integer quantity = null;

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

   /**
   * Get fulfillmentProcessId
   * @return fulfillmentProcessId
  **/
  @ApiModelProperty(value = "")
  public Integer getFulfillmentProcessId() {
    return fulfillmentProcessId;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

   /**
   * Get pickPosition
   * @return pickPosition
  **/
  @ApiModelProperty(value = "")
  public String getPickPosition() {
    return pickPosition;
  }

   /**
   * Get layoutPosition
   * @return layoutPosition
  **/
  @ApiModelProperty(value = "")
  public String getLayoutPosition() {
    return layoutPosition;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public FulfillmentLayoutPosition customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public FulfillmentLayoutPosition putCustomFieldsItem(String key, Object customFieldsItem) {
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
    FulfillmentLayoutPosition fulfillmentLayoutPosition = (FulfillmentLayoutPosition) o;
    return Objects.equals(this.id, fulfillmentLayoutPosition.id) &&
        Objects.equals(this.createDate, fulfillmentLayoutPosition.createDate) &&
        Objects.equals(this.modifyDate, fulfillmentLayoutPosition.modifyDate) &&
        Objects.equals(this.fulfillmentProcessId, fulfillmentLayoutPosition.fulfillmentProcessId) &&
        Objects.equals(this.lobId, fulfillmentLayoutPosition.lobId) &&
        Objects.equals(this.pickPosition, fulfillmentLayoutPosition.pickPosition) &&
        Objects.equals(this.layoutPosition, fulfillmentLayoutPosition.layoutPosition) &&
        Objects.equals(this.sku, fulfillmentLayoutPosition.sku) &&
        Objects.equals(this.quantity, fulfillmentLayoutPosition.quantity) &&
        Objects.equals(this.customFields, fulfillmentLayoutPosition.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, fulfillmentProcessId, lobId, pickPosition, layoutPosition, sku, quantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentLayoutPosition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    fulfillmentProcessId: ").append(toIndentedString(fulfillmentProcessId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    pickPosition: ").append(toIndentedString(pickPosition)).append("\n");
    sb.append("    layoutPosition: ").append(toIndentedString(layoutPosition)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

