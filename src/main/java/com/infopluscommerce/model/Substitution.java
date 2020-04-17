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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Substitution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-16T22:42:27.905-05:00")
public class Substitution {
  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("orderSKUId")
  private Integer orderSKUId = null;

  @SerializedName("substituteSKUId")
  private Integer substituteSKUId = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("substitutionQuantity")
  private BigDecimal substitutionQuantity = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public Substitution lobId(Integer lobId) {
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

  public Substitution createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public Substitution modifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public Substitution orderSKUId(Integer orderSKUId) {
    this.orderSKUId = orderSKUId;
    return this;
  }

   /**
   * Get orderSKUId
   * @return orderSKUId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOrderSKUId() {
    return orderSKUId;
  }

  public void setOrderSKUId(Integer orderSKUId) {
    this.orderSKUId = orderSKUId;
  }

  public Substitution substituteSKUId(Integer substituteSKUId) {
    this.substituteSKUId = substituteSKUId;
    return this;
  }

   /**
   * Get substituteSKUId
   * @return substituteSKUId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSubstituteSKUId() {
    return substituteSKUId;
  }

  public void setSubstituteSKUId(Integer substituteSKUId) {
    this.substituteSKUId = substituteSKUId;
  }

  public Substitution period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public Substitution type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Substitution substitutionQuantity(BigDecimal substitutionQuantity) {
    this.substitutionQuantity = substitutionQuantity;
    return this;
  }

   /**
   * Get substitutionQuantity
   * @return substitutionQuantity
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSubstitutionQuantity() {
    return substitutionQuantity;
  }

  public void setSubstitutionQuantity(BigDecimal substitutionQuantity) {
    this.substitutionQuantity = substitutionQuantity;
  }

  public Substitution customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Substitution putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Substitution substitution = (Substitution) o;
    return Objects.equals(this.lobId, substitution.lobId) &&
        Objects.equals(this.createDate, substitution.createDate) &&
        Objects.equals(this.modifyDate, substitution.modifyDate) &&
        Objects.equals(this.id, substitution.id) &&
        Objects.equals(this.orderSKUId, substitution.orderSKUId) &&
        Objects.equals(this.substituteSKUId, substitution.substituteSKUId) &&
        Objects.equals(this.period, substitution.period) &&
        Objects.equals(this.type, substitution.type) &&
        Objects.equals(this.substitutionQuantity, substitution.substitutionQuantity) &&
        Objects.equals(this.customFields, substitution.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, createDate, modifyDate, id, orderSKUId, substituteSKUId, period, type, substitutionQuantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Substitution {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderSKUId: ").append(toIndentedString(orderSKUId)).append("\n");
    sb.append("    substituteSKUId: ").append(toIndentedString(substituteSKUId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    substitutionQuantity: ").append(toIndentedString(substitutionQuantity)).append("\n");
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

