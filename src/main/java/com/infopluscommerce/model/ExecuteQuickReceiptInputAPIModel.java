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
import java.util.ArrayList;
import java.util.List;

/**
 * ExecuteQuickReceiptInputAPIModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-26T11:45:52.597-05:00")
public class ExecuteQuickReceiptInputAPIModel {
  @SerializedName("idList")
  private List<Integer> idList = null;

  public ExecuteQuickReceiptInputAPIModel idList(List<Integer> idList) {
    this.idList = idList;
    return this;
  }

  public ExecuteQuickReceiptInputAPIModel addIdListItem(Integer idListItem) {
    if (this.idList == null) {
      this.idList = new ArrayList<Integer>();
    }
    this.idList.add(idListItem);
    return this;
  }

   /**
   * Get idList
   * @return idList
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getIdList() {
    return idList;
  }

  public void setIdList(List<Integer> idList) {
    this.idList = idList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteQuickReceiptInputAPIModel executeQuickReceiptInputAPIModel = (ExecuteQuickReceiptInputAPIModel) o;
    return Objects.equals(this.idList, executeQuickReceiptInputAPIModel.idList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteQuickReceiptInputAPIModel {\n");
    
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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

