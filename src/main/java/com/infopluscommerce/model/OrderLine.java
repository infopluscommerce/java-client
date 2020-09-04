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
import com.infopluscommerce.model.DynamicKitComponentLine;
import com.infopluscommerce.model.OverrideReceiptsForFulfillment;
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
 * OrderLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-04T16:15:47.032-05:00")
public class OrderLine {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lineItemId")
  private Integer lineItemId = null;

  @SerializedName("customerLineItemNo")
  private String customerLineItemNo = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("poNoId")
  private Integer poNoId = null;

  @SerializedName("orderedQty")
  private Integer orderedQty = null;

  @SerializedName("allowedQty")
  private Integer allowedQty = null;

  @SerializedName("shippedQty")
  private Integer shippedQty = null;

  @SerializedName("backorderQty")
  private Integer backorderQty = null;

  @SerializedName("numberOfWraps")
  private Integer numberOfWraps = null;

  @SerializedName("numberOfCases")
  private Integer numberOfCases = null;

  @SerializedName("numberOfInnerPacks")
  private Integer numberOfInnerPacks = null;

  @SerializedName("revDate")
  private String revDate = null;

  @SerializedName("chargeCode")
  private String chargeCode = null;

  @SerializedName("distributionCode")
  private String distributionCode = null;

  @SerializedName("upc")
  private String upc = null;

  @SerializedName("vendorSKU")
  private String vendorSKU = null;

  @SerializedName("orderSourceSKU")
  private String orderSourceSKU = null;

  @SerializedName("unitCost")
  private BigDecimal unitCost = null;

  @SerializedName("unitSell")
  private BigDecimal unitSell = null;

  @SerializedName("unitDiscount")
  private BigDecimal unitDiscount = null;

  @SerializedName("unitDeclaredValueOverride")
  private BigDecimal unitDeclaredValueOverride = null;

  @SerializedName("extendedCost")
  private BigDecimal extendedCost = null;

  @SerializedName("extendedSell")
  private BigDecimal extendedSell = null;

  @SerializedName("extendedDiscount")
  private BigDecimal extendedDiscount = null;

  @SerializedName("ncExtendedSell")
  private BigDecimal ncExtendedSell = null;

  @SerializedName("extendedDeclaredValueOverride")
  private BigDecimal extendedDeclaredValueOverride = null;

  @SerializedName("itemWeight")
  private BigDecimal itemWeight = null;

  @SerializedName("productionLot")
  private String productionLot = null;

  @SerializedName("expirationDate")
  private OffsetDateTime expirationDate = null;

  @SerializedName("weightPerWrap")
  private BigDecimal weightPerWrap = null;

  @SerializedName("sector")
  private String sector = null;

  @SerializedName("orderAssemblyInstructions")
  private String orderAssemblyInstructions = null;

  @SerializedName("itemAccountCodeId")
  private Integer itemAccountCodeId = null;

  @SerializedName("itemLegacyLowStockContactId")
  private Integer itemLegacyLowStockContactId = null;

  @SerializedName("itemMajorGroupId")
  private Integer itemMajorGroupId = null;

  @SerializedName("itemSubGroupId")
  private Integer itemSubGroupId = null;

  @SerializedName("itemProductCodeId")
  private Integer itemProductCodeId = null;

  @SerializedName("itemSummaryCodeId")
  private Integer itemSummaryCodeId = null;

  @SerializedName("fulfillmentChannel")
  private String fulfillmentChannel = null;

  @SerializedName("dynamicKitComponentList")
  private List<DynamicKitComponentLine> dynamicKitComponentList = null;

  @SerializedName("overrideReceiptsForFulfillmentList")
  private List<OverrideReceiptsForFulfillment> overrideReceiptsForFulfillmentList = null;

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
   * Get lineItemId
   * @return lineItemId
  **/
  @ApiModelProperty(value = "")
  public Integer getLineItemId() {
    return lineItemId;
  }

   /**
   * Get customerLineItemNo
   * @return customerLineItemNo
  **/
  @ApiModelProperty(value = "")
  public String getCustomerLineItemNo() {
    return customerLineItemNo;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public OrderLine sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

   /**
   * Get poNoId
   * @return poNoId
  **/
  @ApiModelProperty(value = "")
  public Integer getPoNoId() {
    return poNoId;
  }

  public OrderLine orderedQty(Integer orderedQty) {
    this.orderedQty = orderedQty;
    return this;
  }

   /**
   * Get orderedQty
   * @return orderedQty
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOrderedQty() {
    return orderedQty;
  }

  public void setOrderedQty(Integer orderedQty) {
    this.orderedQty = orderedQty;
  }

   /**
   * Get allowedQty
   * @return allowedQty
  **/
  @ApiModelProperty(value = "")
  public Integer getAllowedQty() {
    return allowedQty;
  }

   /**
   * Get shippedQty
   * @return shippedQty
  **/
  @ApiModelProperty(value = "")
  public Integer getShippedQty() {
    return shippedQty;
  }

   /**
   * Get backorderQty
   * @return backorderQty
  **/
  @ApiModelProperty(value = "")
  public Integer getBackorderQty() {
    return backorderQty;
  }

   /**
   * Get numberOfWraps
   * @return numberOfWraps
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfWraps() {
    return numberOfWraps;
  }

   /**
   * Get numberOfCases
   * @return numberOfCases
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfCases() {
    return numberOfCases;
  }

   /**
   * Get numberOfInnerPacks
   * @return numberOfInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfInnerPacks() {
    return numberOfInnerPacks;
  }

   /**
   * Get revDate
   * @return revDate
  **/
  @ApiModelProperty(value = "")
  public String getRevDate() {
    return revDate;
  }

   /**
   * Get chargeCode
   * @return chargeCode
  **/
  @ApiModelProperty(value = "")
  public String getChargeCode() {
    return chargeCode;
  }

   /**
   * Get distributionCode
   * @return distributionCode
  **/
  @ApiModelProperty(value = "")
  public String getDistributionCode() {
    return distributionCode;
  }

   /**
   * Get upc
   * @return upc
  **/
  @ApiModelProperty(value = "")
  public String getUpc() {
    return upc;
  }

   /**
   * Get vendorSKU
   * @return vendorSKU
  **/
  @ApiModelProperty(value = "")
  public String getVendorSKU() {
    return vendorSKU;
  }

   /**
   * Get orderSourceSKU
   * @return orderSourceSKU
  **/
  @ApiModelProperty(value = "")
  public String getOrderSourceSKU() {
    return orderSourceSKU;
  }

   /**
   * Get unitCost
   * @return unitCost
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitCost() {
    return unitCost;
  }

   /**
   * Get unitSell
   * @return unitSell
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitSell() {
    return unitSell;
  }

   /**
   * Get unitDiscount
   * @return unitDiscount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitDiscount() {
    return unitDiscount;
  }

   /**
   * Get unitDeclaredValueOverride
   * @return unitDeclaredValueOverride
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitDeclaredValueOverride() {
    return unitDeclaredValueOverride;
  }

   /**
   * Get extendedCost
   * @return extendedCost
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExtendedCost() {
    return extendedCost;
  }

   /**
   * Get extendedSell
   * @return extendedSell
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExtendedSell() {
    return extendedSell;
  }

   /**
   * Get extendedDiscount
   * @return extendedDiscount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExtendedDiscount() {
    return extendedDiscount;
  }

   /**
   * Get ncExtendedSell
   * @return ncExtendedSell
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNcExtendedSell() {
    return ncExtendedSell;
  }

   /**
   * Get extendedDeclaredValueOverride
   * @return extendedDeclaredValueOverride
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExtendedDeclaredValueOverride() {
    return extendedDeclaredValueOverride;
  }

   /**
   * Get itemWeight
   * @return itemWeight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getItemWeight() {
    return itemWeight;
  }

   /**
   * Get productionLot
   * @return productionLot
  **/
  @ApiModelProperty(value = "")
  public String getProductionLot() {
    return productionLot;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

   /**
   * Get weightPerWrap
   * @return weightPerWrap
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }

   /**
   * Get sector
   * @return sector
  **/
  @ApiModelProperty(value = "")
  public String getSector() {
    return sector;
  }

  public OrderLine orderAssemblyInstructions(String orderAssemblyInstructions) {
    this.orderAssemblyInstructions = orderAssemblyInstructions;
    return this;
  }

   /**
   * Get orderAssemblyInstructions
   * @return orderAssemblyInstructions
  **/
  @ApiModelProperty(value = "")
  public String getOrderAssemblyInstructions() {
    return orderAssemblyInstructions;
  }

  public void setOrderAssemblyInstructions(String orderAssemblyInstructions) {
    this.orderAssemblyInstructions = orderAssemblyInstructions;
  }

  public OrderLine itemAccountCodeId(Integer itemAccountCodeId) {
    this.itemAccountCodeId = itemAccountCodeId;
    return this;
  }

   /**
   * Get itemAccountCodeId
   * @return itemAccountCodeId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemAccountCodeId() {
    return itemAccountCodeId;
  }

  public void setItemAccountCodeId(Integer itemAccountCodeId) {
    this.itemAccountCodeId = itemAccountCodeId;
  }

  public OrderLine itemLegacyLowStockContactId(Integer itemLegacyLowStockContactId) {
    this.itemLegacyLowStockContactId = itemLegacyLowStockContactId;
    return this;
  }

   /**
   * Get itemLegacyLowStockContactId
   * @return itemLegacyLowStockContactId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemLegacyLowStockContactId() {
    return itemLegacyLowStockContactId;
  }

  public void setItemLegacyLowStockContactId(Integer itemLegacyLowStockContactId) {
    this.itemLegacyLowStockContactId = itemLegacyLowStockContactId;
  }

  public OrderLine itemMajorGroupId(Integer itemMajorGroupId) {
    this.itemMajorGroupId = itemMajorGroupId;
    return this;
  }

   /**
   * Get itemMajorGroupId
   * @return itemMajorGroupId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemMajorGroupId() {
    return itemMajorGroupId;
  }

  public void setItemMajorGroupId(Integer itemMajorGroupId) {
    this.itemMajorGroupId = itemMajorGroupId;
  }

  public OrderLine itemSubGroupId(Integer itemSubGroupId) {
    this.itemSubGroupId = itemSubGroupId;
    return this;
  }

   /**
   * Get itemSubGroupId
   * @return itemSubGroupId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemSubGroupId() {
    return itemSubGroupId;
  }

  public void setItemSubGroupId(Integer itemSubGroupId) {
    this.itemSubGroupId = itemSubGroupId;
  }

  public OrderLine itemProductCodeId(Integer itemProductCodeId) {
    this.itemProductCodeId = itemProductCodeId;
    return this;
  }

   /**
   * Get itemProductCodeId
   * @return itemProductCodeId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemProductCodeId() {
    return itemProductCodeId;
  }

  public void setItemProductCodeId(Integer itemProductCodeId) {
    this.itemProductCodeId = itemProductCodeId;
  }

  public OrderLine itemSummaryCodeId(Integer itemSummaryCodeId) {
    this.itemSummaryCodeId = itemSummaryCodeId;
    return this;
  }

   /**
   * Get itemSummaryCodeId
   * @return itemSummaryCodeId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemSummaryCodeId() {
    return itemSummaryCodeId;
  }

  public void setItemSummaryCodeId(Integer itemSummaryCodeId) {
    this.itemSummaryCodeId = itemSummaryCodeId;
  }

  public OrderLine fulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
    return this;
  }

   /**
   * Get fulfillmentChannel
   * @return fulfillmentChannel
  **/
  @ApiModelProperty(value = "")
  public String getFulfillmentChannel() {
    return fulfillmentChannel;
  }

  public void setFulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
  }

  public OrderLine dynamicKitComponentList(List<DynamicKitComponentLine> dynamicKitComponentList) {
    this.dynamicKitComponentList = dynamicKitComponentList;
    return this;
  }

  public OrderLine addDynamicKitComponentListItem(DynamicKitComponentLine dynamicKitComponentListItem) {
    if (this.dynamicKitComponentList == null) {
      this.dynamicKitComponentList = new ArrayList<DynamicKitComponentLine>();
    }
    this.dynamicKitComponentList.add(dynamicKitComponentListItem);
    return this;
  }

   /**
   * Get dynamicKitComponentList
   * @return dynamicKitComponentList
  **/
  @ApiModelProperty(value = "")
  public List<DynamicKitComponentLine> getDynamicKitComponentList() {
    return dynamicKitComponentList;
  }

  public void setDynamicKitComponentList(List<DynamicKitComponentLine> dynamicKitComponentList) {
    this.dynamicKitComponentList = dynamicKitComponentList;
  }

  public OrderLine overrideReceiptsForFulfillmentList(List<OverrideReceiptsForFulfillment> overrideReceiptsForFulfillmentList) {
    this.overrideReceiptsForFulfillmentList = overrideReceiptsForFulfillmentList;
    return this;
  }

  public OrderLine addOverrideReceiptsForFulfillmentListItem(OverrideReceiptsForFulfillment overrideReceiptsForFulfillmentListItem) {
    if (this.overrideReceiptsForFulfillmentList == null) {
      this.overrideReceiptsForFulfillmentList = new ArrayList<OverrideReceiptsForFulfillment>();
    }
    this.overrideReceiptsForFulfillmentList.add(overrideReceiptsForFulfillmentListItem);
    return this;
  }

   /**
   * Get overrideReceiptsForFulfillmentList
   * @return overrideReceiptsForFulfillmentList
  **/
  @ApiModelProperty(value = "")
  public List<OverrideReceiptsForFulfillment> getOverrideReceiptsForFulfillmentList() {
    return overrideReceiptsForFulfillmentList;
  }

  public void setOverrideReceiptsForFulfillmentList(List<OverrideReceiptsForFulfillment> overrideReceiptsForFulfillmentList) {
    this.overrideReceiptsForFulfillmentList = overrideReceiptsForFulfillmentList;
  }

  public OrderLine customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OrderLine putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(this.id, orderLine.id) &&
        Objects.equals(this.lineItemId, orderLine.lineItemId) &&
        Objects.equals(this.customerLineItemNo, orderLine.customerLineItemNo) &&
        Objects.equals(this.orderNo, orderLine.orderNo) &&
        Objects.equals(this.lobId, orderLine.lobId) &&
        Objects.equals(this.sku, orderLine.sku) &&
        Objects.equals(this.poNoId, orderLine.poNoId) &&
        Objects.equals(this.orderedQty, orderLine.orderedQty) &&
        Objects.equals(this.allowedQty, orderLine.allowedQty) &&
        Objects.equals(this.shippedQty, orderLine.shippedQty) &&
        Objects.equals(this.backorderQty, orderLine.backorderQty) &&
        Objects.equals(this.numberOfWraps, orderLine.numberOfWraps) &&
        Objects.equals(this.numberOfCases, orderLine.numberOfCases) &&
        Objects.equals(this.numberOfInnerPacks, orderLine.numberOfInnerPacks) &&
        Objects.equals(this.revDate, orderLine.revDate) &&
        Objects.equals(this.chargeCode, orderLine.chargeCode) &&
        Objects.equals(this.distributionCode, orderLine.distributionCode) &&
        Objects.equals(this.upc, orderLine.upc) &&
        Objects.equals(this.vendorSKU, orderLine.vendorSKU) &&
        Objects.equals(this.orderSourceSKU, orderLine.orderSourceSKU) &&
        Objects.equals(this.unitCost, orderLine.unitCost) &&
        Objects.equals(this.unitSell, orderLine.unitSell) &&
        Objects.equals(this.unitDiscount, orderLine.unitDiscount) &&
        Objects.equals(this.unitDeclaredValueOverride, orderLine.unitDeclaredValueOverride) &&
        Objects.equals(this.extendedCost, orderLine.extendedCost) &&
        Objects.equals(this.extendedSell, orderLine.extendedSell) &&
        Objects.equals(this.extendedDiscount, orderLine.extendedDiscount) &&
        Objects.equals(this.ncExtendedSell, orderLine.ncExtendedSell) &&
        Objects.equals(this.extendedDeclaredValueOverride, orderLine.extendedDeclaredValueOverride) &&
        Objects.equals(this.itemWeight, orderLine.itemWeight) &&
        Objects.equals(this.productionLot, orderLine.productionLot) &&
        Objects.equals(this.expirationDate, orderLine.expirationDate) &&
        Objects.equals(this.weightPerWrap, orderLine.weightPerWrap) &&
        Objects.equals(this.sector, orderLine.sector) &&
        Objects.equals(this.orderAssemblyInstructions, orderLine.orderAssemblyInstructions) &&
        Objects.equals(this.itemAccountCodeId, orderLine.itemAccountCodeId) &&
        Objects.equals(this.itemLegacyLowStockContactId, orderLine.itemLegacyLowStockContactId) &&
        Objects.equals(this.itemMajorGroupId, orderLine.itemMajorGroupId) &&
        Objects.equals(this.itemSubGroupId, orderLine.itemSubGroupId) &&
        Objects.equals(this.itemProductCodeId, orderLine.itemProductCodeId) &&
        Objects.equals(this.itemSummaryCodeId, orderLine.itemSummaryCodeId) &&
        Objects.equals(this.fulfillmentChannel, orderLine.fulfillmentChannel) &&
        Objects.equals(this.dynamicKitComponentList, orderLine.dynamicKitComponentList) &&
        Objects.equals(this.overrideReceiptsForFulfillmentList, orderLine.overrideReceiptsForFulfillmentList) &&
        Objects.equals(this.customFields, orderLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItemId, customerLineItemNo, orderNo, lobId, sku, poNoId, orderedQty, allowedQty, shippedQty, backorderQty, numberOfWraps, numberOfCases, numberOfInnerPacks, revDate, chargeCode, distributionCode, upc, vendorSKU, orderSourceSKU, unitCost, unitSell, unitDiscount, unitDeclaredValueOverride, extendedCost, extendedSell, extendedDiscount, ncExtendedSell, extendedDeclaredValueOverride, itemWeight, productionLot, expirationDate, weightPerWrap, sector, orderAssemblyInstructions, itemAccountCodeId, itemLegacyLowStockContactId, itemMajorGroupId, itemSubGroupId, itemProductCodeId, itemSummaryCodeId, fulfillmentChannel, dynamicKitComponentList, overrideReceiptsForFulfillmentList, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
    sb.append("    customerLineItemNo: ").append(toIndentedString(customerLineItemNo)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    orderedQty: ").append(toIndentedString(orderedQty)).append("\n");
    sb.append("    allowedQty: ").append(toIndentedString(allowedQty)).append("\n");
    sb.append("    shippedQty: ").append(toIndentedString(shippedQty)).append("\n");
    sb.append("    backorderQty: ").append(toIndentedString(backorderQty)).append("\n");
    sb.append("    numberOfWraps: ").append(toIndentedString(numberOfWraps)).append("\n");
    sb.append("    numberOfCases: ").append(toIndentedString(numberOfCases)).append("\n");
    sb.append("    numberOfInnerPacks: ").append(toIndentedString(numberOfInnerPacks)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    distributionCode: ").append(toIndentedString(distributionCode)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    vendorSKU: ").append(toIndentedString(vendorSKU)).append("\n");
    sb.append("    orderSourceSKU: ").append(toIndentedString(orderSourceSKU)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    unitSell: ").append(toIndentedString(unitSell)).append("\n");
    sb.append("    unitDiscount: ").append(toIndentedString(unitDiscount)).append("\n");
    sb.append("    unitDeclaredValueOverride: ").append(toIndentedString(unitDeclaredValueOverride)).append("\n");
    sb.append("    extendedCost: ").append(toIndentedString(extendedCost)).append("\n");
    sb.append("    extendedSell: ").append(toIndentedString(extendedSell)).append("\n");
    sb.append("    extendedDiscount: ").append(toIndentedString(extendedDiscount)).append("\n");
    sb.append("    ncExtendedSell: ").append(toIndentedString(ncExtendedSell)).append("\n");
    sb.append("    extendedDeclaredValueOverride: ").append(toIndentedString(extendedDeclaredValueOverride)).append("\n");
    sb.append("    itemWeight: ").append(toIndentedString(itemWeight)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    orderAssemblyInstructions: ").append(toIndentedString(orderAssemblyInstructions)).append("\n");
    sb.append("    itemAccountCodeId: ").append(toIndentedString(itemAccountCodeId)).append("\n");
    sb.append("    itemLegacyLowStockContactId: ").append(toIndentedString(itemLegacyLowStockContactId)).append("\n");
    sb.append("    itemMajorGroupId: ").append(toIndentedString(itemMajorGroupId)).append("\n");
    sb.append("    itemSubGroupId: ").append(toIndentedString(itemSubGroupId)).append("\n");
    sb.append("    itemProductCodeId: ").append(toIndentedString(itemProductCodeId)).append("\n");
    sb.append("    itemSummaryCodeId: ").append(toIndentedString(itemSummaryCodeId)).append("\n");
    sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
    sb.append("    dynamicKitComponentList: ").append(toIndentedString(dynamicKitComponentList)).append("\n");
    sb.append("    overrideReceiptsForFulfillmentList: ").append(toIndentedString(overrideReceiptsForFulfillmentList)).append("\n");
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

