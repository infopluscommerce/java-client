package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class ReceivingProcess   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private String status = null;
  private Integer workBatchId = null;
  private Integer receivingWorksheetId = null;
  private Date createDate = null;
  private Date modifyDate = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public ReceivingProcess warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public ReceivingProcess status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public ReceivingProcess workBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
  }
  public void setWorkBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
  }

  
  /**
   **/
  public ReceivingProcess receivingWorksheetId(Integer receivingWorksheetId) {
    this.receivingWorksheetId = receivingWorksheetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivingWorksheetId")
  public Integer getReceivingWorksheetId() {
    return receivingWorksheetId;
  }
  public void setReceivingWorksheetId(Integer receivingWorksheetId) {
    this.receivingWorksheetId = receivingWorksheetId;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivingProcess receivingProcess = (ReceivingProcess) o;
    return Objects.equals(this.id, receivingProcess.id) &&
        Objects.equals(this.warehouseId, receivingProcess.warehouseId) &&
        Objects.equals(this.status, receivingProcess.status) &&
        Objects.equals(this.workBatchId, receivingProcess.workBatchId) &&
        Objects.equals(this.receivingWorksheetId, receivingProcess.receivingWorksheetId) &&
        Objects.equals(this.createDate, receivingProcess.createDate) &&
        Objects.equals(this.modifyDate, receivingProcess.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, status, workBatchId, receivingWorksheetId, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingProcess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
    sb.append("    receivingWorksheetId: ").append(toIndentedString(receivingWorksheetId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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
