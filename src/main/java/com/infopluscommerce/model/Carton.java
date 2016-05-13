package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class Carton   {
  
  private Integer id = null;
  private Double orderNo = null;
  private Integer cartonNo = null;
  private Integer cartonTypeId = null;
  private String cartonLPN = null;
  private Double weightLbs = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Carton orderNo(Double orderNo) {
    this.orderNo = orderNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderNo")
  public Double getOrderNo() {
    return orderNo;
  }
  public void setOrderNo(Double orderNo) {
    this.orderNo = orderNo;
  }

  
  /**
   **/
  public Carton cartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonNo")
  public Integer getCartonNo() {
    return cartonNo;
  }
  public void setCartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
  }

  
  /**
   **/
  public Carton cartonTypeId(Integer cartonTypeId) {
    this.cartonTypeId = cartonTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cartonTypeId")
  public Integer getCartonTypeId() {
    return cartonTypeId;
  }
  public void setCartonTypeId(Integer cartonTypeId) {
    this.cartonTypeId = cartonTypeId;
  }

  
  /**
   **/
  public Carton cartonLPN(String cartonLPN) {
    this.cartonLPN = cartonLPN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonLPN")
  public String getCartonLPN() {
    return cartonLPN;
  }
  public void setCartonLPN(String cartonLPN) {
    this.cartonLPN = cartonLPN;
  }

  
  /**
   **/
  public Carton weightLbs(Double weightLbs) {
    this.weightLbs = weightLbs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public Double getWeightLbs() {
    return weightLbs;
  }
  public void setWeightLbs(Double weightLbs) {
    this.weightLbs = weightLbs;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carton carton = (Carton) o;
    return Objects.equals(this.id, carton.id) &&
        Objects.equals(this.orderNo, carton.orderNo) &&
        Objects.equals(this.cartonNo, carton.cartonNo) &&
        Objects.equals(this.cartonTypeId, carton.cartonTypeId) &&
        Objects.equals(this.cartonLPN, carton.cartonLPN) &&
        Objects.equals(this.weightLbs, carton.weightLbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderNo, cartonNo, cartonTypeId, cartonLPN, weightLbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carton {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    cartonTypeId: ").append(toIndentedString(cartonTypeId)).append("\n");
    sb.append("    cartonLPN: ").append(toIndentedString(cartonLPN)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
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
