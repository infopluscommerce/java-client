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
 * ReplenishmentProcess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-14T22:20:31.696-06:00")
public class ReplenishmentProcess {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("replenishmentPlanId")
  private Integer replenishmentPlanId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("estimatedWork")
  private Integer estimatedWork = null;

  @SerializedName("workBatchId")
  private Integer workBatchId = null;

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

  public ReplenishmentProcess warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public ReplenishmentProcess replenishmentPlanId(Integer replenishmentPlanId) {
    this.replenishmentPlanId = replenishmentPlanId;
    return this;
  }

   /**
   * Get replenishmentPlanId
   * @return replenishmentPlanId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getReplenishmentPlanId() {
    return replenishmentPlanId;
  }

  public void setReplenishmentPlanId(Integer replenishmentPlanId) {
    this.replenishmentPlanId = replenishmentPlanId;
  }

  public ReplenishmentProcess status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * Get estimatedWork
   * @return estimatedWork
  **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedWork() {
    return estimatedWork;
  }

   /**
   * Get workBatchId
   * @return workBatchId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  public ReplenishmentProcess customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ReplenishmentProcess putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ReplenishmentProcess replenishmentProcess = (ReplenishmentProcess) o;
    return Objects.equals(this.id, replenishmentProcess.id) &&
        Objects.equals(this.createDate, replenishmentProcess.createDate) &&
        Objects.equals(this.modifyDate, replenishmentProcess.modifyDate) &&
        Objects.equals(this.warehouseId, replenishmentProcess.warehouseId) &&
        Objects.equals(this.replenishmentPlanId, replenishmentProcess.replenishmentPlanId) &&
        Objects.equals(this.status, replenishmentProcess.status) &&
        Objects.equals(this.estimatedWork, replenishmentProcess.estimatedWork) &&
        Objects.equals(this.workBatchId, replenishmentProcess.workBatchId) &&
        Objects.equals(this.customFields, replenishmentProcess.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, warehouseId, replenishmentPlanId, status, estimatedWork, workBatchId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplenishmentProcess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    replenishmentPlanId: ").append(toIndentedString(replenishmentPlanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    estimatedWork: ").append(toIndentedString(estimatedWork)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
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

