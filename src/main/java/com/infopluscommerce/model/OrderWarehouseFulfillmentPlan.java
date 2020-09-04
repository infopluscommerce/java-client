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
import com.infopluscommerce.model.OrderWarehouseFulfillmentPlanDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderWarehouseFulfillmentPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-04T16:15:47.032-05:00")
public class OrderWarehouseFulfillmentPlan {
  @SerializedName("score")
  private Integer score = null;

  @SerializedName("planDetailList")
  private List<OrderWarehouseFulfillmentPlanDetail> planDetailList = new ArrayList<OrderWarehouseFulfillmentPlanDetail>();

  public OrderWarehouseFulfillmentPlan score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public OrderWarehouseFulfillmentPlan planDetailList(List<OrderWarehouseFulfillmentPlanDetail> planDetailList) {
    this.planDetailList = planDetailList;
    return this;
  }

  public OrderWarehouseFulfillmentPlan addPlanDetailListItem(OrderWarehouseFulfillmentPlanDetail planDetailListItem) {
    this.planDetailList.add(planDetailListItem);
    return this;
  }

   /**
   * Get planDetailList
   * @return planDetailList
  **/
  @ApiModelProperty(required = true, value = "")
  public List<OrderWarehouseFulfillmentPlanDetail> getPlanDetailList() {
    return planDetailList;
  }

  public void setPlanDetailList(List<OrderWarehouseFulfillmentPlanDetail> planDetailList) {
    this.planDetailList = planDetailList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderWarehouseFulfillmentPlan orderWarehouseFulfillmentPlan = (OrderWarehouseFulfillmentPlan) o;
    return Objects.equals(this.score, orderWarehouseFulfillmentPlan.score) &&
        Objects.equals(this.planDetailList, orderWarehouseFulfillmentPlan.planDetailList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, planDetailList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderWarehouseFulfillmentPlan {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    planDetailList: ").append(toIndentedString(planDetailList)).append("\n");
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

