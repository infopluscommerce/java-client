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
 * Cart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T10:33:30.230-05:00")
public class Cart {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("cartId")
  private String cartId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("fulfillmentProcessId")
  private Integer fulfillmentProcessId = null;

  @SerializedName("positionType")
  private String positionType = null;

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

  public Cart cartId(String cartId) {
    this.cartId = cartId;
    return this;
  }

   /**
   * Get cartId
   * @return cartId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCartId() {
    return cartId;
  }

  public void setCartId(String cartId) {
    this.cartId = cartId;
  }

  public Cart description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Get fulfillmentProcessId
   * @return fulfillmentProcessId
  **/
  @ApiModelProperty(value = "")
  public Integer getFulfillmentProcessId() {
    return fulfillmentProcessId;
  }

  public Cart positionType(String positionType) {
    this.positionType = positionType;
    return this;
  }

   /**
   * Get positionType
   * @return positionType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPositionType() {
    return positionType;
  }

  public void setPositionType(String positionType) {
    this.positionType = positionType;
  }

  public Cart customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Cart putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Cart cart = (Cart) o;
    return Objects.equals(this.id, cart.id) &&
        Objects.equals(this.createDate, cart.createDate) &&
        Objects.equals(this.modifyDate, cart.modifyDate) &&
        Objects.equals(this.cartId, cart.cartId) &&
        Objects.equals(this.description, cart.description) &&
        Objects.equals(this.fulfillmentProcessId, cart.fulfillmentProcessId) &&
        Objects.equals(this.positionType, cart.positionType) &&
        Objects.equals(this.customFields, cart.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, cartId, description, fulfillmentProcessId, positionType, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fulfillmentProcessId: ").append(toIndentedString(fulfillmentProcessId)).append("\n");
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
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

