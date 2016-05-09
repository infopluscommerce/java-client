package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class PickFaceAssignment   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private Integer locationId = null;
  private Integer replenishmentPoint = null;
  private Integer maxQuantity = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String sku = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locationId")
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("replenishmentPoint")
  public Integer getReplenishmentPoint() {
    return replenishmentPoint;
  }
  public void setReplenishmentPoint(Integer replenishmentPoint) {
    this.replenishmentPoint = replenishmentPoint;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("maxQuantity")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }
  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickFaceAssignment pickFaceAssignment = (PickFaceAssignment) o;
    return Objects.equals(id, pickFaceAssignment.id) &&
        Objects.equals(warehouseId, pickFaceAssignment.warehouseId) &&
        Objects.equals(locationId, pickFaceAssignment.locationId) &&
        Objects.equals(replenishmentPoint, pickFaceAssignment.replenishmentPoint) &&
        Objects.equals(maxQuantity, pickFaceAssignment.maxQuantity) &&
        Objects.equals(createDate, pickFaceAssignment.createDate) &&
        Objects.equals(modifyDate, pickFaceAssignment.modifyDate) &&
        Objects.equals(sku, pickFaceAssignment.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, locationId, replenishmentPoint, maxQuantity, createDate, modifyDate, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickFaceAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    replenishmentPoint: ").append(toIndentedString(replenishmentPoint)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

