package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class BillingCodeType   {
  
  private Integer id = null;
  private Integer clientId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String name = null;
  private String description = null;
  private String billingCode = null;
  private Boolean isActive = false;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }

  
  /**
   **/
  public BillingCodeType name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public BillingCodeType description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public BillingCodeType billingCode(String billingCode) {
    this.billingCode = billingCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billingCode")
  public String getBillingCode() {
    return billingCode;
  }
  public void setBillingCode(String billingCode) {
    this.billingCode = billingCode;
  }

  
  /**
   **/
  public BillingCodeType isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCodeType billingCodeType = (BillingCodeType) o;
    return Objects.equals(this.id, billingCodeType.id) &&
        Objects.equals(this.clientId, billingCodeType.clientId) &&
        Objects.equals(this.createDate, billingCodeType.createDate) &&
        Objects.equals(this.modifyDate, billingCodeType.modifyDate) &&
        Objects.equals(this.name, billingCodeType.name) &&
        Objects.equals(this.description, billingCodeType.description) &&
        Objects.equals(this.billingCode, billingCodeType.billingCode) &&
        Objects.equals(this.isActive, billingCodeType.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, createDate, modifyDate, name, description, billingCode, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCodeType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    billingCode: ").append(toIndentedString(billingCode)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
