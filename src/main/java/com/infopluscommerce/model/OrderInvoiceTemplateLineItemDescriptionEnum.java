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
 * OrderInvoiceTemplateLineItemDescriptionEnum
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-04T16:15:47.032-05:00")
public class OrderInvoiceTemplateLineItemDescriptionEnum {
  @SerializedName("id")
  private String id = null;

  @SerializedName("label")
  private String label = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabel() {
    return label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInvoiceTemplateLineItemDescriptionEnum orderInvoiceTemplateLineItemDescriptionEnum = (OrderInvoiceTemplateLineItemDescriptionEnum) o;
    return Objects.equals(this.id, orderInvoiceTemplateLineItemDescriptionEnum.id) &&
        Objects.equals(this.label, orderInvoiceTemplateLineItemDescriptionEnum.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInvoiceTemplateLineItemDescriptionEnum {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

