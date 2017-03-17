package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class ExternalShippingSystem   {
  
  private Integer id = null;
  private String name = null;
  private String systemType = null;
  private String apiKey = null;
  private String apiSecret = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public ExternalShippingSystem name(String name) {
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
  public ExternalShippingSystem systemType(String systemType) {
    this.systemType = systemType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("systemType")
  public String getSystemType() {
    return systemType;
  }
  public void setSystemType(String systemType) {
    this.systemType = systemType;
  }

  
  /**
   **/
  public ExternalShippingSystem apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("apiKey")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  
  /**
   **/
  public ExternalShippingSystem apiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("apiSecret")
  public String getApiSecret() {
    return apiSecret;
  }
  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
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
  public ExternalShippingSystem customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
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
    ExternalShippingSystem externalShippingSystem = (ExternalShippingSystem) o;
    return Objects.equals(this.id, externalShippingSystem.id) &&
        Objects.equals(this.name, externalShippingSystem.name) &&
        Objects.equals(this.systemType, externalShippingSystem.systemType) &&
        Objects.equals(this.apiKey, externalShippingSystem.apiKey) &&
        Objects.equals(this.apiSecret, externalShippingSystem.apiSecret) &&
        Objects.equals(this.createDate, externalShippingSystem.createDate) &&
        Objects.equals(this.modifyDate, externalShippingSystem.modifyDate) &&
        Objects.equals(this.customFields, externalShippingSystem.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, systemType, apiKey, apiSecret, createDate, modifyDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalShippingSystem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
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
