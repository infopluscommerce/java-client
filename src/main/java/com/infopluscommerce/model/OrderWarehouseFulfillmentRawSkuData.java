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

/**
 * OrderWarehouseFulfillmentRawSkuData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-14T22:20:31.696-06:00")
public class OrderWarehouseFulfillmentRawSkuData {
  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("canFulfill")
  private Boolean canFulfill = false;

  public OrderWarehouseFulfillmentRawSkuData quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderWarehouseFulfillmentRawSkuData canFulfill(Boolean canFulfill) {
    this.canFulfill = canFulfill;
    return this;
  }

   /**
   * Get canFulfill
   * @return canFulfill
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanFulfill() {
    return canFulfill;
  }

  public void setCanFulfill(Boolean canFulfill) {
    this.canFulfill = canFulfill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderWarehouseFulfillmentRawSkuData orderWarehouseFulfillmentRawSkuData = (OrderWarehouseFulfillmentRawSkuData) o;
    return Objects.equals(this.quantity, orderWarehouseFulfillmentRawSkuData.quantity) &&
        Objects.equals(this.canFulfill, orderWarehouseFulfillmentRawSkuData.canFulfill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, canFulfill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderWarehouseFulfillmentRawSkuData {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    canFulfill: ").append(toIndentedString(canFulfill)).append("\n");
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

