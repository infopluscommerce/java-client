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
 * VendorComplianceSurvey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T23:38:27.636-05:00")
public class VendorComplianceSurvey {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("worksheetId")
  private Integer worksheetId = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("surveyQuestions")
  private String surveyQuestions = null;

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

  public VendorComplianceSurvey worksheetId(Integer worksheetId) {
    this.worksheetId = worksheetId;
    return this;
  }

   /**
   * Get worksheetId
   * @return worksheetId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWorksheetId() {
    return worksheetId;
  }

  public void setWorksheetId(Integer worksheetId) {
    this.worksheetId = worksheetId;
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

  public VendorComplianceSurvey surveyQuestions(String surveyQuestions) {
    this.surveyQuestions = surveyQuestions;
    return this;
  }

   /**
   * Get surveyQuestions
   * @return surveyQuestions
  **/
  @ApiModelProperty(value = "")
  public String getSurveyQuestions() {
    return surveyQuestions;
  }

  public void setSurveyQuestions(String surveyQuestions) {
    this.surveyQuestions = surveyQuestions;
  }

  public VendorComplianceSurvey customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public VendorComplianceSurvey putCustomFieldsItem(String key, Object customFieldsItem) {
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
    VendorComplianceSurvey vendorComplianceSurvey = (VendorComplianceSurvey) o;
    return Objects.equals(this.id, vendorComplianceSurvey.id) &&
        Objects.equals(this.worksheetId, vendorComplianceSurvey.worksheetId) &&
        Objects.equals(this.createDate, vendorComplianceSurvey.createDate) &&
        Objects.equals(this.modifyDate, vendorComplianceSurvey.modifyDate) &&
        Objects.equals(this.surveyQuestions, vendorComplianceSurvey.surveyQuestions) &&
        Objects.equals(this.customFields, vendorComplianceSurvey.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, worksheetId, createDate, modifyDate, surveyQuestions, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorComplianceSurvey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    worksheetId: ").append(toIndentedString(worksheetId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    surveyQuestions: ").append(toIndentedString(surveyQuestions)).append("\n");
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

