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
 * InvoiceWorksheetLineDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-09T22:08:36.018-06:00")
public class InvoiceWorksheetLineDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("chargeRate")
  private BigDecimal chargeRate = null;

  @SerializedName("extendedCharge")
  private BigDecimal extendedCharge = null;

  @SerializedName("invoiceWorksheetId")
  private Integer invoiceWorksheetId = null;

  @SerializedName("invoiceWorksheetLineId")
  private Integer invoiceWorksheetLineId = null;

  @SerializedName("activityType")
  private String activityType = null;

  @SerializedName("activityRecordID")
  private String activityRecordID = null;

  @SerializedName("reference1")
  private String reference1 = null;

  @SerializedName("reference2")
  private String reference2 = null;

  @SerializedName("reference3")
  private String reference3 = null;

  @SerializedName("reference4")
  private String reference4 = null;

  @SerializedName("reference5")
  private String reference5 = null;

  @SerializedName("activityRecord")
  private Map<String, Object> activityRecord = null;

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

  public InvoiceWorksheetLineDetail lobId(Integer lobId) {
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

  public InvoiceWorksheetLineDetail quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public InvoiceWorksheetLineDetail chargeRate(BigDecimal chargeRate) {
    this.chargeRate = chargeRate;
    return this;
  }

   /**
   * Get chargeRate
   * @return chargeRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getChargeRate() {
    return chargeRate;
  }

  public void setChargeRate(BigDecimal chargeRate) {
    this.chargeRate = chargeRate;
  }

  public InvoiceWorksheetLineDetail extendedCharge(BigDecimal extendedCharge) {
    this.extendedCharge = extendedCharge;
    return this;
  }

   /**
   * Get extendedCharge
   * @return extendedCharge
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExtendedCharge() {
    return extendedCharge;
  }

  public void setExtendedCharge(BigDecimal extendedCharge) {
    this.extendedCharge = extendedCharge;
  }

  public InvoiceWorksheetLineDetail invoiceWorksheetId(Integer invoiceWorksheetId) {
    this.invoiceWorksheetId = invoiceWorksheetId;
    return this;
  }

   /**
   * Get invoiceWorksheetId
   * @return invoiceWorksheetId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getInvoiceWorksheetId() {
    return invoiceWorksheetId;
  }

  public void setInvoiceWorksheetId(Integer invoiceWorksheetId) {
    this.invoiceWorksheetId = invoiceWorksheetId;
  }

  public InvoiceWorksheetLineDetail invoiceWorksheetLineId(Integer invoiceWorksheetLineId) {
    this.invoiceWorksheetLineId = invoiceWorksheetLineId;
    return this;
  }

   /**
   * Get invoiceWorksheetLineId
   * @return invoiceWorksheetLineId
  **/
  @ApiModelProperty(value = "")
  public Integer getInvoiceWorksheetLineId() {
    return invoiceWorksheetLineId;
  }

  public void setInvoiceWorksheetLineId(Integer invoiceWorksheetLineId) {
    this.invoiceWorksheetLineId = invoiceWorksheetLineId;
  }

  public InvoiceWorksheetLineDetail activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(value = "")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

   /**
   * Get activityRecordID
   * @return activityRecordID
  **/
  @ApiModelProperty(value = "")
  public String getActivityRecordID() {
    return activityRecordID;
  }

  public InvoiceWorksheetLineDetail reference1(String reference1) {
    this.reference1 = reference1;
    return this;
  }

   /**
   * Get reference1
   * @return reference1
  **/
  @ApiModelProperty(value = "")
  public String getReference1() {
    return reference1;
  }

  public void setReference1(String reference1) {
    this.reference1 = reference1;
  }

  public InvoiceWorksheetLineDetail reference2(String reference2) {
    this.reference2 = reference2;
    return this;
  }

   /**
   * Get reference2
   * @return reference2
  **/
  @ApiModelProperty(value = "")
  public String getReference2() {
    return reference2;
  }

  public void setReference2(String reference2) {
    this.reference2 = reference2;
  }

  public InvoiceWorksheetLineDetail reference3(String reference3) {
    this.reference3 = reference3;
    return this;
  }

   /**
   * Get reference3
   * @return reference3
  **/
  @ApiModelProperty(value = "")
  public String getReference3() {
    return reference3;
  }

  public void setReference3(String reference3) {
    this.reference3 = reference3;
  }

  public InvoiceWorksheetLineDetail reference4(String reference4) {
    this.reference4 = reference4;
    return this;
  }

   /**
   * Get reference4
   * @return reference4
  **/
  @ApiModelProperty(value = "")
  public String getReference4() {
    return reference4;
  }

  public void setReference4(String reference4) {
    this.reference4 = reference4;
  }

  public InvoiceWorksheetLineDetail reference5(String reference5) {
    this.reference5 = reference5;
    return this;
  }

   /**
   * Get reference5
   * @return reference5
  **/
  @ApiModelProperty(value = "")
  public String getReference5() {
    return reference5;
  }

  public void setReference5(String reference5) {
    this.reference5 = reference5;
  }

  public InvoiceWorksheetLineDetail activityRecord(Map<String, Object> activityRecord) {
    this.activityRecord = activityRecord;
    return this;
  }

  public InvoiceWorksheetLineDetail putActivityRecordItem(String key, Object activityRecordItem) {
    if (this.activityRecord == null) {
      this.activityRecord = new HashMap<String, Object>();
    }
    this.activityRecord.put(key, activityRecordItem);
    return this;
  }

   /**
   * Get activityRecord
   * @return activityRecord
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getActivityRecord() {
    return activityRecord;
  }

  public void setActivityRecord(Map<String, Object> activityRecord) {
    this.activityRecord = activityRecord;
  }

  public InvoiceWorksheetLineDetail customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InvoiceWorksheetLineDetail putCustomFieldsItem(String key, Object customFieldsItem) {
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
    InvoiceWorksheetLineDetail invoiceWorksheetLineDetail = (InvoiceWorksheetLineDetail) o;
    return Objects.equals(this.id, invoiceWorksheetLineDetail.id) &&
        Objects.equals(this.createDate, invoiceWorksheetLineDetail.createDate) &&
        Objects.equals(this.modifyDate, invoiceWorksheetLineDetail.modifyDate) &&
        Objects.equals(this.lobId, invoiceWorksheetLineDetail.lobId) &&
        Objects.equals(this.quantity, invoiceWorksheetLineDetail.quantity) &&
        Objects.equals(this.chargeRate, invoiceWorksheetLineDetail.chargeRate) &&
        Objects.equals(this.extendedCharge, invoiceWorksheetLineDetail.extendedCharge) &&
        Objects.equals(this.invoiceWorksheetId, invoiceWorksheetLineDetail.invoiceWorksheetId) &&
        Objects.equals(this.invoiceWorksheetLineId, invoiceWorksheetLineDetail.invoiceWorksheetLineId) &&
        Objects.equals(this.activityType, invoiceWorksheetLineDetail.activityType) &&
        Objects.equals(this.activityRecordID, invoiceWorksheetLineDetail.activityRecordID) &&
        Objects.equals(this.reference1, invoiceWorksheetLineDetail.reference1) &&
        Objects.equals(this.reference2, invoiceWorksheetLineDetail.reference2) &&
        Objects.equals(this.reference3, invoiceWorksheetLineDetail.reference3) &&
        Objects.equals(this.reference4, invoiceWorksheetLineDetail.reference4) &&
        Objects.equals(this.reference5, invoiceWorksheetLineDetail.reference5) &&
        Objects.equals(this.activityRecord, invoiceWorksheetLineDetail.activityRecord) &&
        Objects.equals(this.customFields, invoiceWorksheetLineDetail.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, quantity, chargeRate, extendedCharge, invoiceWorksheetId, invoiceWorksheetLineId, activityType, activityRecordID, reference1, reference2, reference3, reference4, reference5, activityRecord, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceWorksheetLineDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    chargeRate: ").append(toIndentedString(chargeRate)).append("\n");
    sb.append("    extendedCharge: ").append(toIndentedString(extendedCharge)).append("\n");
    sb.append("    invoiceWorksheetId: ").append(toIndentedString(invoiceWorksheetId)).append("\n");
    sb.append("    invoiceWorksheetLineId: ").append(toIndentedString(invoiceWorksheetLineId)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    activityRecordID: ").append(toIndentedString(activityRecordID)).append("\n");
    sb.append("    reference1: ").append(toIndentedString(reference1)).append("\n");
    sb.append("    reference2: ").append(toIndentedString(reference2)).append("\n");
    sb.append("    reference3: ").append(toIndentedString(reference3)).append("\n");
    sb.append("    reference4: ").append(toIndentedString(reference4)).append("\n");
    sb.append("    reference5: ").append(toIndentedString(reference5)).append("\n");
    sb.append("    activityRecord: ").append(toIndentedString(activityRecord)).append("\n");
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
