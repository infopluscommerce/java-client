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
 * ParcelAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T15:16:41.679-06:00")
public class ParcelAccount {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("carrierCompany")
  private String carrierCompany = null;

  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("orderSourceId")
  private Integer orderSourceId = null;

  @SerializedName("client")
  private Integer client = null;

  @SerializedName("ipcDatabaseId")
  private Integer ipcDatabaseId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("manifestPartnerId")
  private String manifestPartnerId = null;

  @SerializedName("manifestPartnerCredentials")
  private String manifestPartnerCredentials = null;

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

  public ParcelAccount carrierCompany(String carrierCompany) {
    this.carrierCompany = carrierCompany;
    return this;
  }

   /**
   * Get carrierCompany
   * @return carrierCompany
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCarrierCompany() {
    return carrierCompany;
  }

  public void setCarrierCompany(String carrierCompany) {
    this.carrierCompany = carrierCompany;
  }

  public ParcelAccount accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public ParcelAccount lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public ParcelAccount orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }

   /**
   * Get orderSourceId
   * @return orderSourceId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }

  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")
  public Integer getClient() {
    return client;
  }

   /**
   * Get ipcDatabaseId
   * @return ipcDatabaseId
  **/
  @ApiModelProperty(value = "")
  public Integer getIpcDatabaseId() {
    return ipcDatabaseId;
  }

  public ParcelAccount name(String name) {
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

  public ParcelAccount manifestPartnerId(String manifestPartnerId) {
    this.manifestPartnerId = manifestPartnerId;
    return this;
  }

   /**
   * Get manifestPartnerId
   * @return manifestPartnerId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getManifestPartnerId() {
    return manifestPartnerId;
  }

  public void setManifestPartnerId(String manifestPartnerId) {
    this.manifestPartnerId = manifestPartnerId;
  }

  public ParcelAccount manifestPartnerCredentials(String manifestPartnerCredentials) {
    this.manifestPartnerCredentials = manifestPartnerCredentials;
    return this;
  }

   /**
   * Get manifestPartnerCredentials
   * @return manifestPartnerCredentials
  **/
  @ApiModelProperty(required = true, value = "")
  public String getManifestPartnerCredentials() {
    return manifestPartnerCredentials;
  }

  public void setManifestPartnerCredentials(String manifestPartnerCredentials) {
    this.manifestPartnerCredentials = manifestPartnerCredentials;
  }

  public ParcelAccount customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ParcelAccount putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ParcelAccount parcelAccount = (ParcelAccount) o;
    return Objects.equals(this.id, parcelAccount.id) &&
        Objects.equals(this.createDate, parcelAccount.createDate) &&
        Objects.equals(this.modifyDate, parcelAccount.modifyDate) &&
        Objects.equals(this.carrierCompany, parcelAccount.carrierCompany) &&
        Objects.equals(this.accountNo, parcelAccount.accountNo) &&
        Objects.equals(this.lobId, parcelAccount.lobId) &&
        Objects.equals(this.orderSourceId, parcelAccount.orderSourceId) &&
        Objects.equals(this.client, parcelAccount.client) &&
        Objects.equals(this.ipcDatabaseId, parcelAccount.ipcDatabaseId) &&
        Objects.equals(this.name, parcelAccount.name) &&
        Objects.equals(this.manifestPartnerId, parcelAccount.manifestPartnerId) &&
        Objects.equals(this.manifestPartnerCredentials, parcelAccount.manifestPartnerCredentials) &&
        Objects.equals(this.customFields, parcelAccount.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, carrierCompany, accountNo, lobId, orderSourceId, client, ipcDatabaseId, name, manifestPartnerId, manifestPartnerCredentials, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    carrierCompany: ").append(toIndentedString(carrierCompany)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    ipcDatabaseId: ").append(toIndentedString(ipcDatabaseId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    manifestPartnerId: ").append(toIndentedString(manifestPartnerId)).append("\n");
    sb.append("    manifestPartnerCredentials: ").append(toIndentedString(manifestPartnerCredentials)).append("\n");
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

