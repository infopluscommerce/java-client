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
import org.threeten.bp.OffsetDateTime;

/**
 * RecordFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-04T16:15:47.032-05:00")
public class RecordFile {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("roleName")
  private String roleName = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("printerTypeId")
  private Integer printerTypeId = null;

  @SerializedName("userFullName")
  private String userFullName = null;

  public RecordFile id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RecordFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public RecordFile extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @ApiModelProperty(value = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public RecordFile url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RecordFile roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(value = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RecordFile label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public RecordFile modifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

  public RecordFile printerTypeId(Integer printerTypeId) {
    this.printerTypeId = printerTypeId;
    return this;
  }

   /**
   * Get printerTypeId
   * @return printerTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getPrinterTypeId() {
    return printerTypeId;
  }

  public void setPrinterTypeId(Integer printerTypeId) {
    this.printerTypeId = printerTypeId;
  }

  public RecordFile userFullName(String userFullName) {
    this.userFullName = userFullName;
    return this;
  }

   /**
   * Get userFullName
   * @return userFullName
  **/
  @ApiModelProperty(value = "")
  public String getUserFullName() {
    return userFullName;
  }

  public void setUserFullName(String userFullName) {
    this.userFullName = userFullName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordFile recordFile = (RecordFile) o;
    return Objects.equals(this.id, recordFile.id) &&
        Objects.equals(this.fileName, recordFile.fileName) &&
        Objects.equals(this.extension, recordFile.extension) &&
        Objects.equals(this.url, recordFile.url) &&
        Objects.equals(this.roleName, recordFile.roleName) &&
        Objects.equals(this.label, recordFile.label) &&
        Objects.equals(this.modifyDate, recordFile.modifyDate) &&
        Objects.equals(this.printerTypeId, recordFile.printerTypeId) &&
        Objects.equals(this.userFullName, recordFile.userFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileName, extension, url, roleName, label, modifyDate, printerTypeId, userFullName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    printerTypeId: ").append(toIndentedString(printerTypeId)).append("\n");
    sb.append("    userFullName: ").append(toIndentedString(userFullName)).append("\n");
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

