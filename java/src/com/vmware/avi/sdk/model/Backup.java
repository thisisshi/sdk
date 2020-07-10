/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Backup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class Backup {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("backup_config_ref")
  private String backupConfigRef = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("local_file_url")
  private String localFileUrl = null;

  @JsonProperty("remote_file_url")
  private String remoteFileUrl = null;

  @JsonProperty("scheduler_ref")
  private String schedulerRef = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public Backup backupConfigRef(String backupConfigRef) {
    this.backupConfigRef = backupConfigRef;
    return this;
  }

   /**
   * BackupConfiguration Information. It is a reference to an object of type BackupConfiguration.
   * @return backupConfigRef
  **/
  @Schema(description = "BackupConfiguration Information. It is a reference to an object of type BackupConfiguration.")
  public String getBackupConfigRef() {
    return backupConfigRef;
  }

  public void setBackupConfigRef(String backupConfigRef) {
    this.backupConfigRef = backupConfigRef;
  }

  public Backup fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The file name of backup.
   * @return fileName
  **/
  @Schema(required = true, description = "The file name of backup.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Backup localFileUrl(String localFileUrl) {
    this.localFileUrl = localFileUrl;
    return this;
  }

   /**
   * URL to download the backup file.
   * @return localFileUrl
  **/
  @Schema(description = "URL to download the backup file.")
  public String getLocalFileUrl() {
    return localFileUrl;
  }

  public void setLocalFileUrl(String localFileUrl) {
    this.localFileUrl = localFileUrl;
  }

  public Backup remoteFileUrl(String remoteFileUrl) {
    this.remoteFileUrl = remoteFileUrl;
    return this;
  }

   /**
   * URL to download the backup file.
   * @return remoteFileUrl
  **/
  @Schema(description = "URL to download the backup file.")
  public String getRemoteFileUrl() {
    return remoteFileUrl;
  }

  public void setRemoteFileUrl(String remoteFileUrl) {
    this.remoteFileUrl = remoteFileUrl;
  }

  public Backup schedulerRef(String schedulerRef) {
    this.schedulerRef = schedulerRef;
    return this;
  }

   /**
   * Scheduler Information. It is a reference to an object of type Scheduler.
   * @return schedulerRef
  **/
  @Schema(description = "Scheduler Information. It is a reference to an object of type Scheduler.")
  public String getSchedulerRef() {
    return schedulerRef;
  }

  public void setSchedulerRef(String schedulerRef) {
    this.schedulerRef = schedulerRef;
  }

  public Backup tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  public Backup timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Unix Timestamp of when the backup file is created.
   * @return timestamp
  **/
  @Schema(description = "Unix Timestamp of when the backup file is created.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public Backup uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @Schema(description = "Unique object identifier of the object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backup backup = (Backup) o;
    return Objects.equals(this._lastModified, backup._lastModified) &&
        Objects.equals(this.backupConfigRef, backup.backupConfigRef) &&
        Objects.equals(this.fileName, backup.fileName) &&
        Objects.equals(this.localFileUrl, backup.localFileUrl) &&
        Objects.equals(this.remoteFileUrl, backup.remoteFileUrl) &&
        Objects.equals(this.schedulerRef, backup.schedulerRef) &&
        Objects.equals(this.tenantRef, backup.tenantRef) &&
        Objects.equals(this.timestamp, backup.timestamp) &&
        Objects.equals(this.url, backup.url) &&
        Objects.equals(this.uuid, backup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, backupConfigRef, fileName, localFileUrl, remoteFileUrl, schedulerRef, tenantRef, timestamp, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backup {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    backupConfigRef: ").append(toIndentedString(backupConfigRef)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    localFileUrl: ").append(toIndentedString(localFileUrl)).append("\n");
    sb.append("    remoteFileUrl: ").append(toIndentedString(remoteFileUrl)).append("\n");
    sb.append("    schedulerRef: ").append(toIndentedString(schedulerRef)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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