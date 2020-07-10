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
 * CloudConnectorDebugFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class CloudConnectorDebugFilter {
  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("disable_se_reboot")
  private Boolean disableSeReboot = null;

  @JsonProperty("se_id")
  private String seId = null;

  public CloudConnectorDebugFilter appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * filter debugs for an app.
   * @return appId
  **/
  @Schema(description = "filter debugs for an app.")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public CloudConnectorDebugFilter disableSeReboot(Boolean disableSeReboot) {
    this.disableSeReboot = disableSeReboot;
    return this;
  }

   /**
   * Disable SE reboot via cloud connector on HB miss.
   * @return disableSeReboot
  **/
  @Schema(description = "Disable SE reboot via cloud connector on HB miss.")
  public Boolean isDisableSeReboot() {
    return disableSeReboot;
  }

  public void setDisableSeReboot(Boolean disableSeReboot) {
    this.disableSeReboot = disableSeReboot;
  }

  public CloudConnectorDebugFilter seId(String seId) {
    this.seId = seId;
    return this;
  }

   /**
   * filter debugs for a SE.
   * @return seId
  **/
  @Schema(description = "filter debugs for a SE.")
  public String getSeId() {
    return seId;
  }

  public void setSeId(String seId) {
    this.seId = seId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConnectorDebugFilter cloudConnectorDebugFilter = (CloudConnectorDebugFilter) o;
    return Objects.equals(this.appId, cloudConnectorDebugFilter.appId) &&
        Objects.equals(this.disableSeReboot, cloudConnectorDebugFilter.disableSeReboot) &&
        Objects.equals(this.seId, cloudConnectorDebugFilter.seId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, disableSeReboot, seId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConnectorDebugFilter {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    disableSeReboot: ").append(toIndentedString(disableSeReboot)).append("\n");
    sb.append("    seId: ").append(toIndentedString(seId)).append("\n");
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