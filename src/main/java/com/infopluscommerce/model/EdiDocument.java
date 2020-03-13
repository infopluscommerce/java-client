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
 * EdiDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-12T22:27:15.327-05:00")
public class EdiDocument {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ediConnectionId")
  private Integer ediConnectionId = null;

  @SerializedName("as2PartnerId")
  private Integer as2PartnerId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("documentTypeId")
  private Integer documentTypeId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("interchangeIndex")
  private Integer interchangeIndex = null;

  @SerializedName("groupIndex")
  private Integer groupIndex = null;

  @SerializedName("transactionIndex")
  private Integer transactionIndex = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("jsonBody")
  private String jsonBody = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

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

  public EdiDocument ediConnectionId(Integer ediConnectionId) {
    this.ediConnectionId = ediConnectionId;
    return this;
  }

   /**
   * Get ediConnectionId
   * @return ediConnectionId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getEdiConnectionId() {
    return ediConnectionId;
  }

  public void setEdiConnectionId(Integer ediConnectionId) {
    this.ediConnectionId = ediConnectionId;
  }

   /**
   * Get as2PartnerId
   * @return as2PartnerId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAs2PartnerId() {
    return as2PartnerId;
  }

  public EdiDocument lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public EdiDocument transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public EdiDocument direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public EdiDocument documentTypeId(Integer documentTypeId) {
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Get documentTypeId
   * @return documentTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDocumentTypeId() {
    return documentTypeId;
  }

  public void setDocumentTypeId(Integer documentTypeId) {
    this.documentTypeId = documentTypeId;
  }

  public EdiDocument status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * Get interchangeIndex
   * @return interchangeIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getInterchangeIndex() {
    return interchangeIndex;
  }

   /**
   * Get groupIndex
   * @return groupIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getGroupIndex() {
    return groupIndex;
  }

   /**
   * Get transactionIndex
   * @return transactionIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getTransactionIndex() {
    return transactionIndex;
  }

  public EdiDocument body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public EdiDocument jsonBody(String jsonBody) {
    this.jsonBody = jsonBody;
    return this;
  }

   /**
   * Get jsonBody
   * @return jsonBody
  **/
  @ApiModelProperty(required = true, value = "")
  public String getJsonBody() {
    return jsonBody;
  }

  public void setJsonBody(String jsonBody) {
    this.jsonBody = jsonBody;
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

  public EdiDocument customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public EdiDocument putCustomFieldsItem(String key, Object customFieldsItem) {
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
    EdiDocument ediDocument = (EdiDocument) o;
    return Objects.equals(this.id, ediDocument.id) &&
        Objects.equals(this.ediConnectionId, ediDocument.ediConnectionId) &&
        Objects.equals(this.as2PartnerId, ediDocument.as2PartnerId) &&
        Objects.equals(this.lobId, ediDocument.lobId) &&
        Objects.equals(this.transactionType, ediDocument.transactionType) &&
        Objects.equals(this.direction, ediDocument.direction) &&
        Objects.equals(this.documentTypeId, ediDocument.documentTypeId) &&
        Objects.equals(this.status, ediDocument.status) &&
        Objects.equals(this.interchangeIndex, ediDocument.interchangeIndex) &&
        Objects.equals(this.groupIndex, ediDocument.groupIndex) &&
        Objects.equals(this.transactionIndex, ediDocument.transactionIndex) &&
        Objects.equals(this.body, ediDocument.body) &&
        Objects.equals(this.jsonBody, ediDocument.jsonBody) &&
        Objects.equals(this.createDate, ediDocument.createDate) &&
        Objects.equals(this.modifyDate, ediDocument.modifyDate) &&
        Objects.equals(this.customFields, ediDocument.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ediConnectionId, as2PartnerId, lobId, transactionType, direction, documentTypeId, status, interchangeIndex, groupIndex, transactionIndex, body, jsonBody, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdiDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ediConnectionId: ").append(toIndentedString(ediConnectionId)).append("\n");
    sb.append("    as2PartnerId: ").append(toIndentedString(as2PartnerId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    interchangeIndex: ").append(toIndentedString(interchangeIndex)).append("\n");
    sb.append("    groupIndex: ").append(toIndentedString(groupIndex)).append("\n");
    sb.append("    transactionIndex: ").append(toIndentedString(transactionIndex)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

