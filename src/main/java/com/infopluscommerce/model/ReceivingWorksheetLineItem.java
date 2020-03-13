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
import com.infopluscommerce.model.ReceivingWorksheetPutAwayPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * ReceivingWorksheetLineItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-12T22:27:15.327-05:00")
public class ReceivingWorksheetLineItem {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("sku2")
  private String sku2 = null;

  @SerializedName("fullDescription")
  private String fullDescription = null;

  @SerializedName("orderedQty")
  private Integer orderedQty = null;

  @SerializedName("prevReceivedQty")
  private Integer prevReceivedQty = null;

  @SerializedName("unreceivedQty")
  private Integer unreceivedQty = null;

  @SerializedName("receivingQty")
  private Integer receivingQty = null;

  @SerializedName("unitCode")
  private String unitCode = null;

  @SerializedName("wrapCode")
  private String wrapCode = null;

  @SerializedName("unitsPerWrap")
  private Integer unitsPerWrap = null;

  @SerializedName("unitsPerCase")
  private Integer unitsPerCase = null;

  @SerializedName("quantityPerInnerPack")
  private Integer quantityPerInnerPack = null;

  @SerializedName("quantityPerPallet")
  private Integer quantityPerPallet = null;

  @SerializedName("weightPerWrap")
  private BigDecimal weightPerWrap = null;

  @SerializedName("weightPerCase")
  private BigDecimal weightPerCase = null;

  @SerializedName("productionLot")
  private String productionLot = null;

  @SerializedName("productIdTag")
  private String productIdTag = null;

  @SerializedName("revisionDate")
  private String revisionDate = null;

  @SerializedName("expirationDate")
  private OffsetDateTime expirationDate = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("cartonLength")
  private BigDecimal cartonLength = null;

  @SerializedName("cartonWidth")
  private BigDecimal cartonWidth = null;

  @SerializedName("cartonHeight")
  private BigDecimal cartonHeight = null;

  @SerializedName("putAwayPlans")
  private List<ReceivingWorksheetPutAwayPlan> putAwayPlans = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

   /**
   * Get sku2
   * @return sku2
  **/
  @ApiModelProperty(value = "")
  public String getSku2() {
    return sku2;
  }

   /**
   * Get fullDescription
   * @return fullDescription
  **/
  @ApiModelProperty(value = "")
  public String getFullDescription() {
    return fullDescription;
  }

   /**
   * Get orderedQty
   * @return orderedQty
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderedQty() {
    return orderedQty;
  }

   /**
   * Get prevReceivedQty
   * @return prevReceivedQty
  **/
  @ApiModelProperty(value = "")
  public Integer getPrevReceivedQty() {
    return prevReceivedQty;
  }

   /**
   * Get unreceivedQty
   * @return unreceivedQty
  **/
  @ApiModelProperty(value = "")
  public Integer getUnreceivedQty() {
    return unreceivedQty;
  }

  public ReceivingWorksheetLineItem receivingQty(Integer receivingQty) {
    this.receivingQty = receivingQty;
    return this;
  }

   /**
   * Get receivingQty
   * @return receivingQty
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getReceivingQty() {
    return receivingQty;
  }

  public void setReceivingQty(Integer receivingQty) {
    this.receivingQty = receivingQty;
  }

   /**
   * Get unitCode
   * @return unitCode
  **/
  @ApiModelProperty(value = "")
  public String getUnitCode() {
    return unitCode;
  }

  public ReceivingWorksheetLineItem wrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
    return this;
  }

   /**
   * Get wrapCode
   * @return wrapCode
  **/
  @ApiModelProperty(value = "")
  public String getWrapCode() {
    return wrapCode;
  }

  public void setWrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
  }

  public ReceivingWorksheetLineItem unitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
    return this;
  }

   /**
   * Get unitsPerWrap
   * @return unitsPerWrap
  **/
  @ApiModelProperty(value = "")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }

  public void setUnitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
  }

  public ReceivingWorksheetLineItem unitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
    return this;
  }

   /**
   * Get unitsPerCase
   * @return unitsPerCase
  **/
  @ApiModelProperty(value = "")
  public Integer getUnitsPerCase() {
    return unitsPerCase;
  }

  public void setUnitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
  }

  public ReceivingWorksheetLineItem quantityPerInnerPack(Integer quantityPerInnerPack) {
    this.quantityPerInnerPack = quantityPerInnerPack;
    return this;
  }

   /**
   * Get quantityPerInnerPack
   * @return quantityPerInnerPack
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityPerInnerPack() {
    return quantityPerInnerPack;
  }

  public void setQuantityPerInnerPack(Integer quantityPerInnerPack) {
    this.quantityPerInnerPack = quantityPerInnerPack;
  }

  public ReceivingWorksheetLineItem quantityPerPallet(Integer quantityPerPallet) {
    this.quantityPerPallet = quantityPerPallet;
    return this;
  }

   /**
   * Get quantityPerPallet
   * @return quantityPerPallet
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityPerPallet() {
    return quantityPerPallet;
  }

  public void setQuantityPerPallet(Integer quantityPerPallet) {
    this.quantityPerPallet = quantityPerPallet;
  }

  public ReceivingWorksheetLineItem weightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
    return this;
  }

   /**
   * Get weightPerWrap
   * @return weightPerWrap
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }

  public void setWeightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
  }

  public ReceivingWorksheetLineItem weightPerCase(BigDecimal weightPerCase) {
    this.weightPerCase = weightPerCase;
    return this;
  }

   /**
   * Get weightPerCase
   * @return weightPerCase
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWeightPerCase() {
    return weightPerCase;
  }

  public void setWeightPerCase(BigDecimal weightPerCase) {
    this.weightPerCase = weightPerCase;
  }

  public ReceivingWorksheetLineItem productionLot(String productionLot) {
    this.productionLot = productionLot;
    return this;
  }

   /**
   * Get productionLot
   * @return productionLot
  **/
  @ApiModelProperty(value = "")
  public String getProductionLot() {
    return productionLot;
  }

  public void setProductionLot(String productionLot) {
    this.productionLot = productionLot;
  }

  public ReceivingWorksheetLineItem productIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
    return this;
  }

   /**
   * Get productIdTag
   * @return productIdTag
  **/
  @ApiModelProperty(value = "")
  public String getProductIdTag() {
    return productIdTag;
  }

  public void setProductIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
  }

  public ReceivingWorksheetLineItem revisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
    return this;
  }

   /**
   * Get revisionDate
   * @return revisionDate
  **/
  @ApiModelProperty(value = "")
  public String getRevisionDate() {
    return revisionDate;
  }

  public void setRevisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
  }

  public ReceivingWorksheetLineItem expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ReceivingWorksheetLineItem origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public ReceivingWorksheetLineItem cartonLength(BigDecimal cartonLength) {
    this.cartonLength = cartonLength;
    return this;
  }

   /**
   * Get cartonLength
   * @return cartonLength
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCartonLength() {
    return cartonLength;
  }

  public void setCartonLength(BigDecimal cartonLength) {
    this.cartonLength = cartonLength;
  }

  public ReceivingWorksheetLineItem cartonWidth(BigDecimal cartonWidth) {
    this.cartonWidth = cartonWidth;
    return this;
  }

   /**
   * Get cartonWidth
   * @return cartonWidth
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCartonWidth() {
    return cartonWidth;
  }

  public void setCartonWidth(BigDecimal cartonWidth) {
    this.cartonWidth = cartonWidth;
  }

  public ReceivingWorksheetLineItem cartonHeight(BigDecimal cartonHeight) {
    this.cartonHeight = cartonHeight;
    return this;
  }

   /**
   * Get cartonHeight
   * @return cartonHeight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCartonHeight() {
    return cartonHeight;
  }

  public void setCartonHeight(BigDecimal cartonHeight) {
    this.cartonHeight = cartonHeight;
  }

  public ReceivingWorksheetLineItem putAwayPlans(List<ReceivingWorksheetPutAwayPlan> putAwayPlans) {
    this.putAwayPlans = putAwayPlans;
    return this;
  }

  public ReceivingWorksheetLineItem addPutAwayPlansItem(ReceivingWorksheetPutAwayPlan putAwayPlansItem) {
    if (this.putAwayPlans == null) {
      this.putAwayPlans = new ArrayList<ReceivingWorksheetPutAwayPlan>();
    }
    this.putAwayPlans.add(putAwayPlansItem);
    return this;
  }

   /**
   * Get putAwayPlans
   * @return putAwayPlans
  **/
  @ApiModelProperty(value = "")
  public List<ReceivingWorksheetPutAwayPlan> getPutAwayPlans() {
    return putAwayPlans;
  }

  public void setPutAwayPlans(List<ReceivingWorksheetPutAwayPlan> putAwayPlans) {
    this.putAwayPlans = putAwayPlans;
  }

  public ReceivingWorksheetLineItem quantity(Integer quantity) {
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

  public ReceivingWorksheetLineItem customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ReceivingWorksheetLineItem putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ReceivingWorksheetLineItem receivingWorksheetLineItem = (ReceivingWorksheetLineItem) o;
    return Objects.equals(this.sku, receivingWorksheetLineItem.sku) &&
        Objects.equals(this.sku2, receivingWorksheetLineItem.sku2) &&
        Objects.equals(this.fullDescription, receivingWorksheetLineItem.fullDescription) &&
        Objects.equals(this.orderedQty, receivingWorksheetLineItem.orderedQty) &&
        Objects.equals(this.prevReceivedQty, receivingWorksheetLineItem.prevReceivedQty) &&
        Objects.equals(this.unreceivedQty, receivingWorksheetLineItem.unreceivedQty) &&
        Objects.equals(this.receivingQty, receivingWorksheetLineItem.receivingQty) &&
        Objects.equals(this.unitCode, receivingWorksheetLineItem.unitCode) &&
        Objects.equals(this.wrapCode, receivingWorksheetLineItem.wrapCode) &&
        Objects.equals(this.unitsPerWrap, receivingWorksheetLineItem.unitsPerWrap) &&
        Objects.equals(this.unitsPerCase, receivingWorksheetLineItem.unitsPerCase) &&
        Objects.equals(this.quantityPerInnerPack, receivingWorksheetLineItem.quantityPerInnerPack) &&
        Objects.equals(this.quantityPerPallet, receivingWorksheetLineItem.quantityPerPallet) &&
        Objects.equals(this.weightPerWrap, receivingWorksheetLineItem.weightPerWrap) &&
        Objects.equals(this.weightPerCase, receivingWorksheetLineItem.weightPerCase) &&
        Objects.equals(this.productionLot, receivingWorksheetLineItem.productionLot) &&
        Objects.equals(this.productIdTag, receivingWorksheetLineItem.productIdTag) &&
        Objects.equals(this.revisionDate, receivingWorksheetLineItem.revisionDate) &&
        Objects.equals(this.expirationDate, receivingWorksheetLineItem.expirationDate) &&
        Objects.equals(this.origin, receivingWorksheetLineItem.origin) &&
        Objects.equals(this.cartonLength, receivingWorksheetLineItem.cartonLength) &&
        Objects.equals(this.cartonWidth, receivingWorksheetLineItem.cartonWidth) &&
        Objects.equals(this.cartonHeight, receivingWorksheetLineItem.cartonHeight) &&
        Objects.equals(this.putAwayPlans, receivingWorksheetLineItem.putAwayPlans) &&
        Objects.equals(this.quantity, receivingWorksheetLineItem.quantity) &&
        Objects.equals(this.customFields, receivingWorksheetLineItem.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, sku2, fullDescription, orderedQty, prevReceivedQty, unreceivedQty, receivingQty, unitCode, wrapCode, unitsPerWrap, unitsPerCase, quantityPerInnerPack, quantityPerPallet, weightPerWrap, weightPerCase, productionLot, productIdTag, revisionDate, expirationDate, origin, cartonLength, cartonWidth, cartonHeight, putAwayPlans, quantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingWorksheetLineItem {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    sku2: ").append(toIndentedString(sku2)).append("\n");
    sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
    sb.append("    orderedQty: ").append(toIndentedString(orderedQty)).append("\n");
    sb.append("    prevReceivedQty: ").append(toIndentedString(prevReceivedQty)).append("\n");
    sb.append("    unreceivedQty: ").append(toIndentedString(unreceivedQty)).append("\n");
    sb.append("    receivingQty: ").append(toIndentedString(receivingQty)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    wrapCode: ").append(toIndentedString(wrapCode)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    unitsPerCase: ").append(toIndentedString(unitsPerCase)).append("\n");
    sb.append("    quantityPerInnerPack: ").append(toIndentedString(quantityPerInnerPack)).append("\n");
    sb.append("    quantityPerPallet: ").append(toIndentedString(quantityPerPallet)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    weightPerCase: ").append(toIndentedString(weightPerCase)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    productIdTag: ").append(toIndentedString(productIdTag)).append("\n");
    sb.append("    revisionDate: ").append(toIndentedString(revisionDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    cartonLength: ").append(toIndentedString(cartonLength)).append("\n");
    sb.append("    cartonWidth: ").append(toIndentedString(cartonWidth)).append("\n");
    sb.append("    cartonHeight: ").append(toIndentedString(cartonHeight)).append("\n");
    sb.append("    putAwayPlans: ").append(toIndentedString(putAwayPlans)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

