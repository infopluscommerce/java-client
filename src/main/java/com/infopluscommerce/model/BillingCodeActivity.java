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
 * BillingCodeActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-10T23:21:27.216-06:00")
public class BillingCodeActivity {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("importedId")
  private Integer importedId = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("billingCodeTypeId")
  private Integer billingCodeTypeId = null;

  @SerializedName("billingCodeTypeName")
  private String billingCodeTypeName = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("recordTypeName")
  private String recordTypeName = null;

  @SerializedName("recordTypeId")
  private Integer recordTypeId = null;

  @SerializedName("recordId")
  private String recordId = null;

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
   * Get importedId
   * @return importedId
  **/
  @ApiModelProperty(value = "")
  public Integer getImportedId() {
    return importedId;
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
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public BillingCodeActivity quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public BillingCodeActivity lobId(Integer lobId) {
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

  public BillingCodeActivity userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public BillingCodeActivity email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BillingCodeActivity billingCodeTypeId(Integer billingCodeTypeId) {
    this.billingCodeTypeId = billingCodeTypeId;
    return this;
  }

   /**
   * Get billingCodeTypeId
   * @return billingCodeTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getBillingCodeTypeId() {
    return billingCodeTypeId;
  }

  public void setBillingCodeTypeId(Integer billingCodeTypeId) {
    this.billingCodeTypeId = billingCodeTypeId;
  }

  public BillingCodeActivity billingCodeTypeName(String billingCodeTypeName) {
    this.billingCodeTypeName = billingCodeTypeName;
    return this;
  }

   /**
   * Get billingCodeTypeName
   * @return billingCodeTypeName
  **/
  @ApiModelProperty(value = "")
  public String getBillingCodeTypeName() {
    return billingCodeTypeName;
  }

  public void setBillingCodeTypeName(String billingCodeTypeName) {
    this.billingCodeTypeName = billingCodeTypeName;
  }

  public BillingCodeActivity note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public BillingCodeActivity recordTypeName(String recordTypeName) {
    this.recordTypeName = recordTypeName;
    return this;
  }

   /**
   * Get recordTypeName
   * @return recordTypeName
  **/
  @ApiModelProperty(value = "")
  public String getRecordTypeName() {
    return recordTypeName;
  }

  public void setRecordTypeName(String recordTypeName) {
    this.recordTypeName = recordTypeName;
  }

  public BillingCodeActivity recordTypeId(Integer recordTypeId) {
    this.recordTypeId = recordTypeId;
    return this;
  }

   /**
   * Get recordTypeId
   * @return recordTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getRecordTypeId() {
    return recordTypeId;
  }

  public void setRecordTypeId(Integer recordTypeId) {
    this.recordTypeId = recordTypeId;
  }

  public BillingCodeActivity recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @ApiModelProperty(value = "")
  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public BillingCodeActivity customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public BillingCodeActivity putCustomFieldsItem(String key, Object customFieldsItem) {
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
    BillingCodeActivity billingCodeActivity = (BillingCodeActivity) o;
    return Objects.equals(this.id, billingCodeActivity.id) &&
        Objects.equals(this.importedId, billingCodeActivity.importedId) &&
        Objects.equals(this.createDate, billingCodeActivity.createDate) &&
        Objects.equals(this.modifyDate, billingCodeActivity.modifyDate) &&
        Objects.equals(this.date, billingCodeActivity.date) &&
        Objects.equals(this.quantity, billingCodeActivity.quantity) &&
        Objects.equals(this.lobId, billingCodeActivity.lobId) &&
        Objects.equals(this.userId, billingCodeActivity.userId) &&
        Objects.equals(this.email, billingCodeActivity.email) &&
        Objects.equals(this.billingCodeTypeId, billingCodeActivity.billingCodeTypeId) &&
        Objects.equals(this.billingCodeTypeName, billingCodeActivity.billingCodeTypeName) &&
        Objects.equals(this.note, billingCodeActivity.note) &&
        Objects.equals(this.recordTypeName, billingCodeActivity.recordTypeName) &&
        Objects.equals(this.recordTypeId, billingCodeActivity.recordTypeId) &&
        Objects.equals(this.recordId, billingCodeActivity.recordId) &&
        Objects.equals(this.customFields, billingCodeActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importedId, createDate, modifyDate, date, quantity, lobId, userId, email, billingCodeTypeId, billingCodeTypeName, note, recordTypeName, recordTypeId, recordId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCodeActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importedId: ").append(toIndentedString(importedId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    billingCodeTypeId: ").append(toIndentedString(billingCodeTypeId)).append("\n");
    sb.append("    billingCodeTypeName: ").append(toIndentedString(billingCodeTypeName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    recordTypeName: ").append(toIndentedString(recordTypeName)).append("\n");
    sb.append("    recordTypeId: ").append(toIndentedString(recordTypeId)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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

