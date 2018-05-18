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
import com.infopluscommerce.model.InvoiceWorksheetLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * InvoiceWorksheet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-18T14:01:23.462-05:00")
public class InvoiceWorksheet {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("invoiceNo")
  private String invoiceNo = null;

  @SerializedName("poNo")
  private String poNo = null;

  @SerializedName("costCenter")
  private String costCenter = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("terms")
  private String terms = null;

  @SerializedName("specialInstructions")
  private String specialInstructions = null;

  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("customerInvoiceTemplateId")
  private Integer customerInvoiceTemplateId = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("issueDate")
  private OffsetDateTime issueDate = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("remitToAttention")
  private String remitToAttention = null;

  @SerializedName("remitToCompany")
  private String remitToCompany = null;

  @SerializedName("remitToStreet")
  private String remitToStreet = null;

  @SerializedName("remitToStreet2")
  private String remitToStreet2 = null;

  @SerializedName("remitToStreet3")
  private String remitToStreet3 = null;

  @SerializedName("remitToCity")
  private String remitToCity = null;

  @SerializedName("remitToState")
  private String remitToState = null;

  @SerializedName("remitToZip")
  private String remitToZip = null;

  @SerializedName("remitToCountry")
  private String remitToCountry = null;

  @SerializedName("remitToPhone")
  private String remitToPhone = null;

  @SerializedName("remitToEmail")
  private String remitToEmail = null;

  @SerializedName("billToAttention")
  private String billToAttention = null;

  @SerializedName("billToCompany")
  private String billToCompany = null;

  @SerializedName("billToStreet")
  private String billToStreet = null;

  @SerializedName("billToStreet2")
  private String billToStreet2 = null;

  @SerializedName("billToStreet3")
  private String billToStreet3 = null;

  @SerializedName("billToCity")
  private String billToCity = null;

  @SerializedName("billToState")
  private String billToState = null;

  @SerializedName("billToZip")
  private String billToZip = null;

  @SerializedName("billToCountry")
  private String billToCountry = null;

  @SerializedName("billToPhone")
  private String billToPhone = null;

  @SerializedName("billToEmail")
  private String billToEmail = null;

  @SerializedName("invoiceWorksheetLineItemList")
  private List<InvoiceWorksheetLine> invoiceWorksheetLineItemList = null;

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

  public InvoiceWorksheet name(String name) {
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

  public InvoiceWorksheet invoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * Get invoiceNo
   * @return invoiceNo
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public InvoiceWorksheet poNo(String poNo) {
    this.poNo = poNo;
    return this;
  }

   /**
   * Get poNo
   * @return poNo
  **/
  @ApiModelProperty(value = "")
  public String getPoNo() {
    return poNo;
  }

  public void setPoNo(String poNo) {
    this.poNo = poNo;
  }

  public InvoiceWorksheet costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @ApiModelProperty(value = "")
  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public InvoiceWorksheet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvoiceWorksheet notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public InvoiceWorksheet terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public InvoiceWorksheet specialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
    return this;
  }

   /**
   * Get specialInstructions
   * @return specialInstructions
  **/
  @ApiModelProperty(value = "")
  public String getSpecialInstructions() {
    return specialInstructions;
  }

  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotal() {
    return total;
  }

  public InvoiceWorksheet lobId(Integer lobId) {
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

  public InvoiceWorksheet customerInvoiceTemplateId(Integer customerInvoiceTemplateId) {
    this.customerInvoiceTemplateId = customerInvoiceTemplateId;
    return this;
  }

   /**
   * Get customerInvoiceTemplateId
   * @return customerInvoiceTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerInvoiceTemplateId() {
    return customerInvoiceTemplateId;
  }

  public void setCustomerInvoiceTemplateId(Integer customerInvoiceTemplateId) {
    this.customerInvoiceTemplateId = customerInvoiceTemplateId;
  }

  public InvoiceWorksheet startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public InvoiceWorksheet endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public InvoiceWorksheet issueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
  }

  public InvoiceWorksheet status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InvoiceWorksheet remitToAttention(String remitToAttention) {
    this.remitToAttention = remitToAttention;
    return this;
  }

   /**
   * Get remitToAttention
   * @return remitToAttention
  **/
  @ApiModelProperty(value = "")
  public String getRemitToAttention() {
    return remitToAttention;
  }

  public void setRemitToAttention(String remitToAttention) {
    this.remitToAttention = remitToAttention;
  }

  public InvoiceWorksheet remitToCompany(String remitToCompany) {
    this.remitToCompany = remitToCompany;
    return this;
  }

   /**
   * Get remitToCompany
   * @return remitToCompany
  **/
  @ApiModelProperty(value = "")
  public String getRemitToCompany() {
    return remitToCompany;
  }

  public void setRemitToCompany(String remitToCompany) {
    this.remitToCompany = remitToCompany;
  }

  public InvoiceWorksheet remitToStreet(String remitToStreet) {
    this.remitToStreet = remitToStreet;
    return this;
  }

   /**
   * Get remitToStreet
   * @return remitToStreet
  **/
  @ApiModelProperty(value = "")
  public String getRemitToStreet() {
    return remitToStreet;
  }

  public void setRemitToStreet(String remitToStreet) {
    this.remitToStreet = remitToStreet;
  }

  public InvoiceWorksheet remitToStreet2(String remitToStreet2) {
    this.remitToStreet2 = remitToStreet2;
    return this;
  }

   /**
   * Get remitToStreet2
   * @return remitToStreet2
  **/
  @ApiModelProperty(value = "")
  public String getRemitToStreet2() {
    return remitToStreet2;
  }

  public void setRemitToStreet2(String remitToStreet2) {
    this.remitToStreet2 = remitToStreet2;
  }

  public InvoiceWorksheet remitToStreet3(String remitToStreet3) {
    this.remitToStreet3 = remitToStreet3;
    return this;
  }

   /**
   * Get remitToStreet3
   * @return remitToStreet3
  **/
  @ApiModelProperty(value = "")
  public String getRemitToStreet3() {
    return remitToStreet3;
  }

  public void setRemitToStreet3(String remitToStreet3) {
    this.remitToStreet3 = remitToStreet3;
  }

  public InvoiceWorksheet remitToCity(String remitToCity) {
    this.remitToCity = remitToCity;
    return this;
  }

   /**
   * Get remitToCity
   * @return remitToCity
  **/
  @ApiModelProperty(value = "")
  public String getRemitToCity() {
    return remitToCity;
  }

  public void setRemitToCity(String remitToCity) {
    this.remitToCity = remitToCity;
  }

  public InvoiceWorksheet remitToState(String remitToState) {
    this.remitToState = remitToState;
    return this;
  }

   /**
   * Get remitToState
   * @return remitToState
  **/
  @ApiModelProperty(value = "")
  public String getRemitToState() {
    return remitToState;
  }

  public void setRemitToState(String remitToState) {
    this.remitToState = remitToState;
  }

  public InvoiceWorksheet remitToZip(String remitToZip) {
    this.remitToZip = remitToZip;
    return this;
  }

   /**
   * Get remitToZip
   * @return remitToZip
  **/
  @ApiModelProperty(value = "")
  public String getRemitToZip() {
    return remitToZip;
  }

  public void setRemitToZip(String remitToZip) {
    this.remitToZip = remitToZip;
  }

  public InvoiceWorksheet remitToCountry(String remitToCountry) {
    this.remitToCountry = remitToCountry;
    return this;
  }

   /**
   * Get remitToCountry
   * @return remitToCountry
  **/
  @ApiModelProperty(value = "")
  public String getRemitToCountry() {
    return remitToCountry;
  }

  public void setRemitToCountry(String remitToCountry) {
    this.remitToCountry = remitToCountry;
  }

  public InvoiceWorksheet remitToPhone(String remitToPhone) {
    this.remitToPhone = remitToPhone;
    return this;
  }

   /**
   * Get remitToPhone
   * @return remitToPhone
  **/
  @ApiModelProperty(value = "")
  public String getRemitToPhone() {
    return remitToPhone;
  }

  public void setRemitToPhone(String remitToPhone) {
    this.remitToPhone = remitToPhone;
  }

  public InvoiceWorksheet remitToEmail(String remitToEmail) {
    this.remitToEmail = remitToEmail;
    return this;
  }

   /**
   * Get remitToEmail
   * @return remitToEmail
  **/
  @ApiModelProperty(value = "")
  public String getRemitToEmail() {
    return remitToEmail;
  }

  public void setRemitToEmail(String remitToEmail) {
    this.remitToEmail = remitToEmail;
  }

  public InvoiceWorksheet billToAttention(String billToAttention) {
    this.billToAttention = billToAttention;
    return this;
  }

   /**
   * Get billToAttention
   * @return billToAttention
  **/
  @ApiModelProperty(value = "")
  public String getBillToAttention() {
    return billToAttention;
  }

  public void setBillToAttention(String billToAttention) {
    this.billToAttention = billToAttention;
  }

  public InvoiceWorksheet billToCompany(String billToCompany) {
    this.billToCompany = billToCompany;
    return this;
  }

   /**
   * Get billToCompany
   * @return billToCompany
  **/
  @ApiModelProperty(value = "")
  public String getBillToCompany() {
    return billToCompany;
  }

  public void setBillToCompany(String billToCompany) {
    this.billToCompany = billToCompany;
  }

  public InvoiceWorksheet billToStreet(String billToStreet) {
    this.billToStreet = billToStreet;
    return this;
  }

   /**
   * Get billToStreet
   * @return billToStreet
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet() {
    return billToStreet;
  }

  public void setBillToStreet(String billToStreet) {
    this.billToStreet = billToStreet;
  }

  public InvoiceWorksheet billToStreet2(String billToStreet2) {
    this.billToStreet2 = billToStreet2;
    return this;
  }

   /**
   * Get billToStreet2
   * @return billToStreet2
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet2() {
    return billToStreet2;
  }

  public void setBillToStreet2(String billToStreet2) {
    this.billToStreet2 = billToStreet2;
  }

  public InvoiceWorksheet billToStreet3(String billToStreet3) {
    this.billToStreet3 = billToStreet3;
    return this;
  }

   /**
   * Get billToStreet3
   * @return billToStreet3
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet3() {
    return billToStreet3;
  }

  public void setBillToStreet3(String billToStreet3) {
    this.billToStreet3 = billToStreet3;
  }

  public InvoiceWorksheet billToCity(String billToCity) {
    this.billToCity = billToCity;
    return this;
  }

   /**
   * Get billToCity
   * @return billToCity
  **/
  @ApiModelProperty(value = "")
  public String getBillToCity() {
    return billToCity;
  }

  public void setBillToCity(String billToCity) {
    this.billToCity = billToCity;
  }

  public InvoiceWorksheet billToState(String billToState) {
    this.billToState = billToState;
    return this;
  }

   /**
   * Get billToState
   * @return billToState
  **/
  @ApiModelProperty(value = "")
  public String getBillToState() {
    return billToState;
  }

  public void setBillToState(String billToState) {
    this.billToState = billToState;
  }

  public InvoiceWorksheet billToZip(String billToZip) {
    this.billToZip = billToZip;
    return this;
  }

   /**
   * Get billToZip
   * @return billToZip
  **/
  @ApiModelProperty(value = "")
  public String getBillToZip() {
    return billToZip;
  }

  public void setBillToZip(String billToZip) {
    this.billToZip = billToZip;
  }

  public InvoiceWorksheet billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

   /**
   * Get billToCountry
   * @return billToCountry
  **/
  @ApiModelProperty(value = "")
  public String getBillToCountry() {
    return billToCountry;
  }

  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  public InvoiceWorksheet billToPhone(String billToPhone) {
    this.billToPhone = billToPhone;
    return this;
  }

   /**
   * Get billToPhone
   * @return billToPhone
  **/
  @ApiModelProperty(value = "")
  public String getBillToPhone() {
    return billToPhone;
  }

  public void setBillToPhone(String billToPhone) {
    this.billToPhone = billToPhone;
  }

  public InvoiceWorksheet billToEmail(String billToEmail) {
    this.billToEmail = billToEmail;
    return this;
  }

   /**
   * Get billToEmail
   * @return billToEmail
  **/
  @ApiModelProperty(value = "")
  public String getBillToEmail() {
    return billToEmail;
  }

  public void setBillToEmail(String billToEmail) {
    this.billToEmail = billToEmail;
  }

  public InvoiceWorksheet invoiceWorksheetLineItemList(List<InvoiceWorksheetLine> invoiceWorksheetLineItemList) {
    this.invoiceWorksheetLineItemList = invoiceWorksheetLineItemList;
    return this;
  }

  public InvoiceWorksheet addInvoiceWorksheetLineItemListItem(InvoiceWorksheetLine invoiceWorksheetLineItemListItem) {
    if (this.invoiceWorksheetLineItemList == null) {
      this.invoiceWorksheetLineItemList = new ArrayList<InvoiceWorksheetLine>();
    }
    this.invoiceWorksheetLineItemList.add(invoiceWorksheetLineItemListItem);
    return this;
  }

   /**
   * Get invoiceWorksheetLineItemList
   * @return invoiceWorksheetLineItemList
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceWorksheetLine> getInvoiceWorksheetLineItemList() {
    return invoiceWorksheetLineItemList;
  }

  public void setInvoiceWorksheetLineItemList(List<InvoiceWorksheetLine> invoiceWorksheetLineItemList) {
    this.invoiceWorksheetLineItemList = invoiceWorksheetLineItemList;
  }

  public InvoiceWorksheet customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InvoiceWorksheet putCustomFieldsItem(String key, Object customFieldsItem) {
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
    InvoiceWorksheet invoiceWorksheet = (InvoiceWorksheet) o;
    return Objects.equals(this.id, invoiceWorksheet.id) &&
        Objects.equals(this.createDate, invoiceWorksheet.createDate) &&
        Objects.equals(this.modifyDate, invoiceWorksheet.modifyDate) &&
        Objects.equals(this.name, invoiceWorksheet.name) &&
        Objects.equals(this.invoiceNo, invoiceWorksheet.invoiceNo) &&
        Objects.equals(this.poNo, invoiceWorksheet.poNo) &&
        Objects.equals(this.costCenter, invoiceWorksheet.costCenter) &&
        Objects.equals(this.description, invoiceWorksheet.description) &&
        Objects.equals(this.notes, invoiceWorksheet.notes) &&
        Objects.equals(this.terms, invoiceWorksheet.terms) &&
        Objects.equals(this.specialInstructions, invoiceWorksheet.specialInstructions) &&
        Objects.equals(this.total, invoiceWorksheet.total) &&
        Objects.equals(this.lobId, invoiceWorksheet.lobId) &&
        Objects.equals(this.customerInvoiceTemplateId, invoiceWorksheet.customerInvoiceTemplateId) &&
        Objects.equals(this.startDate, invoiceWorksheet.startDate) &&
        Objects.equals(this.endDate, invoiceWorksheet.endDate) &&
        Objects.equals(this.issueDate, invoiceWorksheet.issueDate) &&
        Objects.equals(this.status, invoiceWorksheet.status) &&
        Objects.equals(this.remitToAttention, invoiceWorksheet.remitToAttention) &&
        Objects.equals(this.remitToCompany, invoiceWorksheet.remitToCompany) &&
        Objects.equals(this.remitToStreet, invoiceWorksheet.remitToStreet) &&
        Objects.equals(this.remitToStreet2, invoiceWorksheet.remitToStreet2) &&
        Objects.equals(this.remitToStreet3, invoiceWorksheet.remitToStreet3) &&
        Objects.equals(this.remitToCity, invoiceWorksheet.remitToCity) &&
        Objects.equals(this.remitToState, invoiceWorksheet.remitToState) &&
        Objects.equals(this.remitToZip, invoiceWorksheet.remitToZip) &&
        Objects.equals(this.remitToCountry, invoiceWorksheet.remitToCountry) &&
        Objects.equals(this.remitToPhone, invoiceWorksheet.remitToPhone) &&
        Objects.equals(this.remitToEmail, invoiceWorksheet.remitToEmail) &&
        Objects.equals(this.billToAttention, invoiceWorksheet.billToAttention) &&
        Objects.equals(this.billToCompany, invoiceWorksheet.billToCompany) &&
        Objects.equals(this.billToStreet, invoiceWorksheet.billToStreet) &&
        Objects.equals(this.billToStreet2, invoiceWorksheet.billToStreet2) &&
        Objects.equals(this.billToStreet3, invoiceWorksheet.billToStreet3) &&
        Objects.equals(this.billToCity, invoiceWorksheet.billToCity) &&
        Objects.equals(this.billToState, invoiceWorksheet.billToState) &&
        Objects.equals(this.billToZip, invoiceWorksheet.billToZip) &&
        Objects.equals(this.billToCountry, invoiceWorksheet.billToCountry) &&
        Objects.equals(this.billToPhone, invoiceWorksheet.billToPhone) &&
        Objects.equals(this.billToEmail, invoiceWorksheet.billToEmail) &&
        Objects.equals(this.invoiceWorksheetLineItemList, invoiceWorksheet.invoiceWorksheetLineItemList) &&
        Objects.equals(this.customFields, invoiceWorksheet.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, invoiceNo, poNo, costCenter, description, notes, terms, specialInstructions, total, lobId, customerInvoiceTemplateId, startDate, endDate, issueDate, status, remitToAttention, remitToCompany, remitToStreet, remitToStreet2, remitToStreet3, remitToCity, remitToState, remitToZip, remitToCountry, remitToPhone, remitToEmail, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, invoiceWorksheetLineItemList, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceWorksheet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    customerInvoiceTemplateId: ").append(toIndentedString(customerInvoiceTemplateId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    remitToAttention: ").append(toIndentedString(remitToAttention)).append("\n");
    sb.append("    remitToCompany: ").append(toIndentedString(remitToCompany)).append("\n");
    sb.append("    remitToStreet: ").append(toIndentedString(remitToStreet)).append("\n");
    sb.append("    remitToStreet2: ").append(toIndentedString(remitToStreet2)).append("\n");
    sb.append("    remitToStreet3: ").append(toIndentedString(remitToStreet3)).append("\n");
    sb.append("    remitToCity: ").append(toIndentedString(remitToCity)).append("\n");
    sb.append("    remitToState: ").append(toIndentedString(remitToState)).append("\n");
    sb.append("    remitToZip: ").append(toIndentedString(remitToZip)).append("\n");
    sb.append("    remitToCountry: ").append(toIndentedString(remitToCountry)).append("\n");
    sb.append("    remitToPhone: ").append(toIndentedString(remitToPhone)).append("\n");
    sb.append("    remitToEmail: ").append(toIndentedString(remitToEmail)).append("\n");
    sb.append("    billToAttention: ").append(toIndentedString(billToAttention)).append("\n");
    sb.append("    billToCompany: ").append(toIndentedString(billToCompany)).append("\n");
    sb.append("    billToStreet: ").append(toIndentedString(billToStreet)).append("\n");
    sb.append("    billToStreet2: ").append(toIndentedString(billToStreet2)).append("\n");
    sb.append("    billToStreet3: ").append(toIndentedString(billToStreet3)).append("\n");
    sb.append("    billToCity: ").append(toIndentedString(billToCity)).append("\n");
    sb.append("    billToState: ").append(toIndentedString(billToState)).append("\n");
    sb.append("    billToZip: ").append(toIndentedString(billToZip)).append("\n");
    sb.append("    billToCountry: ").append(toIndentedString(billToCountry)).append("\n");
    sb.append("    billToPhone: ").append(toIndentedString(billToPhone)).append("\n");
    sb.append("    billToEmail: ").append(toIndentedString(billToEmail)).append("\n");
    sb.append("    invoiceWorksheetLineItemList: ").append(toIndentedString(invoiceWorksheetLineItemList)).append("\n");
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

