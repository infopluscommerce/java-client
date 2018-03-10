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
 * SlaSetup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T09:46:11.573-06:00")
public class SlaSetup {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @SerializedName("standardServiceDays")
  private Integer standardServiceDays = null;

  @SerializedName("standardServiceCutoffHour")
  private Integer standardServiceCutoffHour = null;

  @SerializedName("massDistributionServiceDays")
  private Integer massDistributionServiceDays = null;

  @SerializedName("massDistributionServiceCutoffHour")
  private Integer massDistributionServiceCutoffHour = null;

  @SerializedName("backorderServiceDays")
  private Integer backorderServiceDays = null;

  @SerializedName("backorderServiceCutoffHour")
  private Integer backorderServiceCutoffHour = null;

  @SerializedName("rushServiceCutoffHour")
  private Integer rushServiceCutoffHour = null;

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

  public SlaSetup lobId(Integer lobId) {
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

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

   /**
   * Get standardServiceDays
   * @return standardServiceDays
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStandardServiceDays() {
    return standardServiceDays;
  }

   /**
   * Get standardServiceCutoffHour
   * @return standardServiceCutoffHour
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStandardServiceCutoffHour() {
    return standardServiceCutoffHour;
  }

   /**
   * Get massDistributionServiceDays
   * @return massDistributionServiceDays
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMassDistributionServiceDays() {
    return massDistributionServiceDays;
  }

   /**
   * Get massDistributionServiceCutoffHour
   * @return massDistributionServiceCutoffHour
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMassDistributionServiceCutoffHour() {
    return massDistributionServiceCutoffHour;
  }

   /**
   * Get backorderServiceDays
   * @return backorderServiceDays
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getBackorderServiceDays() {
    return backorderServiceDays;
  }

   /**
   * Get backorderServiceCutoffHour
   * @return backorderServiceCutoffHour
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getBackorderServiceCutoffHour() {
    return backorderServiceCutoffHour;
  }

   /**
   * Get rushServiceCutoffHour
   * @return rushServiceCutoffHour
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRushServiceCutoffHour() {
    return rushServiceCutoffHour;
  }

  public SlaSetup customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SlaSetup putCustomFieldsItem(String key, Object customFieldsItem) {
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
    SlaSetup slaSetup = (SlaSetup) o;
    return Objects.equals(this.id, slaSetup.id) &&
        Objects.equals(this.lobId, slaSetup.lobId) &&
        Objects.equals(this.warehouseId, slaSetup.warehouseId) &&
        Objects.equals(this.effectiveDate, slaSetup.effectiveDate) &&
        Objects.equals(this.standardServiceDays, slaSetup.standardServiceDays) &&
        Objects.equals(this.standardServiceCutoffHour, slaSetup.standardServiceCutoffHour) &&
        Objects.equals(this.massDistributionServiceDays, slaSetup.massDistributionServiceDays) &&
        Objects.equals(this.massDistributionServiceCutoffHour, slaSetup.massDistributionServiceCutoffHour) &&
        Objects.equals(this.backorderServiceDays, slaSetup.backorderServiceDays) &&
        Objects.equals(this.backorderServiceCutoffHour, slaSetup.backorderServiceCutoffHour) &&
        Objects.equals(this.rushServiceCutoffHour, slaSetup.rushServiceCutoffHour) &&
        Objects.equals(this.customFields, slaSetup.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, warehouseId, effectiveDate, standardServiceDays, standardServiceCutoffHour, massDistributionServiceDays, massDistributionServiceCutoffHour, backorderServiceDays, backorderServiceCutoffHour, rushServiceCutoffHour, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlaSetup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    standardServiceDays: ").append(toIndentedString(standardServiceDays)).append("\n");
    sb.append("    standardServiceCutoffHour: ").append(toIndentedString(standardServiceCutoffHour)).append("\n");
    sb.append("    massDistributionServiceDays: ").append(toIndentedString(massDistributionServiceDays)).append("\n");
    sb.append("    massDistributionServiceCutoffHour: ").append(toIndentedString(massDistributionServiceCutoffHour)).append("\n");
    sb.append("    backorderServiceDays: ").append(toIndentedString(backorderServiceDays)).append("\n");
    sb.append("    backorderServiceCutoffHour: ").append(toIndentedString(backorderServiceCutoffHour)).append("\n");
    sb.append("    rushServiceCutoffHour: ").append(toIndentedString(rushServiceCutoffHour)).append("\n");
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

