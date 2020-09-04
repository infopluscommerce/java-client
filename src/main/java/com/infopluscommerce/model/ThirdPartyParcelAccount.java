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
 * ThirdPartyParcelAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-04T16:15:47.032-05:00")
public class ThirdPartyParcelAccount {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("billingCompany")
  private String billingCompany = null;

  @SerializedName("attention")
  private String attention = null;

  @SerializedName("street1")
  private String street1 = null;

  @SerializedName("street2")
  private String street2 = null;

  @SerializedName("street3")
  private String street3 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("zipCode")
  private String zipCode = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("active")
  private String active = null;

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

  public ThirdPartyParcelAccount lobId(Integer lobId) {
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

  public ThirdPartyParcelAccount carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ThirdPartyParcelAccount accountNo(String accountNo) {
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

  public ThirdPartyParcelAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ThirdPartyParcelAccount billingCompany(String billingCompany) {
    this.billingCompany = billingCompany;
    return this;
  }

   /**
   * Get billingCompany
   * @return billingCompany
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBillingCompany() {
    return billingCompany;
  }

  public void setBillingCompany(String billingCompany) {
    this.billingCompany = billingCompany;
  }

  public ThirdPartyParcelAccount attention(String attention) {
    this.attention = attention;
    return this;
  }

   /**
   * Get attention
   * @return attention
  **/
  @ApiModelProperty(value = "")
  public String getAttention() {
    return attention;
  }

  public void setAttention(String attention) {
    this.attention = attention;
  }

  public ThirdPartyParcelAccount street1(String street1) {
    this.street1 = street1;
    return this;
  }

   /**
   * Get street1
   * @return street1
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public ThirdPartyParcelAccount street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Get street2
   * @return street2
  **/
  @ApiModelProperty(value = "")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public ThirdPartyParcelAccount street3(String street3) {
    this.street3 = street3;
    return this;
  }

   /**
   * Get street3
   * @return street3
  **/
  @ApiModelProperty(value = "")
  public String getStreet3() {
    return street3;
  }

  public void setStreet3(String street3) {
    this.street3 = street3;
  }

  public ThirdPartyParcelAccount city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ThirdPartyParcelAccount state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ThirdPartyParcelAccount country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public ThirdPartyParcelAccount zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public ThirdPartyParcelAccount phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ThirdPartyParcelAccount active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
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

  public ThirdPartyParcelAccount customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ThirdPartyParcelAccount putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ThirdPartyParcelAccount thirdPartyParcelAccount = (ThirdPartyParcelAccount) o;
    return Objects.equals(this.id, thirdPartyParcelAccount.id) &&
        Objects.equals(this.lobId, thirdPartyParcelAccount.lobId) &&
        Objects.equals(this.carrier, thirdPartyParcelAccount.carrier) &&
        Objects.equals(this.accountNo, thirdPartyParcelAccount.accountNo) &&
        Objects.equals(this.accountName, thirdPartyParcelAccount.accountName) &&
        Objects.equals(this.billingCompany, thirdPartyParcelAccount.billingCompany) &&
        Objects.equals(this.attention, thirdPartyParcelAccount.attention) &&
        Objects.equals(this.street1, thirdPartyParcelAccount.street1) &&
        Objects.equals(this.street2, thirdPartyParcelAccount.street2) &&
        Objects.equals(this.street3, thirdPartyParcelAccount.street3) &&
        Objects.equals(this.city, thirdPartyParcelAccount.city) &&
        Objects.equals(this.state, thirdPartyParcelAccount.state) &&
        Objects.equals(this.country, thirdPartyParcelAccount.country) &&
        Objects.equals(this.countryCode, thirdPartyParcelAccount.countryCode) &&
        Objects.equals(this.zipCode, thirdPartyParcelAccount.zipCode) &&
        Objects.equals(this.phone, thirdPartyParcelAccount.phone) &&
        Objects.equals(this.active, thirdPartyParcelAccount.active) &&
        Objects.equals(this.createDate, thirdPartyParcelAccount.createDate) &&
        Objects.equals(this.modifyDate, thirdPartyParcelAccount.modifyDate) &&
        Objects.equals(this.customFields, thirdPartyParcelAccount.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, carrier, accountNo, accountName, billingCompany, attention, street1, street2, street3, city, state, country, countryCode, zipCode, phone, active, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyParcelAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    billingCompany: ").append(toIndentedString(billingCompany)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    street3: ").append(toIndentedString(street3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

