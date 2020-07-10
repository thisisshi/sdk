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
 * Service
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class Service {
  @JsonProperty("enable_http2")
  private Boolean enableHttp2 = null;

  @JsonProperty("enable_ssl")
  private Boolean enableSsl = null;

  @JsonProperty("override_application_profile_ref")
  private String overrideApplicationProfileRef = null;

  @JsonProperty("override_network_profile_ref")
  private String overrideNetworkProfileRef = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("port_range_end")
  private Integer portRangeEnd = null;

  public Service enableHttp2(Boolean enableHttp2) {
    this.enableHttp2 = enableHttp2;
    return this;
  }

   /**
   * Enable HTTP2 on this port. Field introduced in 20.1.1.
   * @return enableHttp2
  **/
  @Schema(description = "Enable HTTP2 on this port. Field introduced in 20.1.1.")
  public Boolean isEnableHttp2() {
    return enableHttp2;
  }

  public void setEnableHttp2(Boolean enableHttp2) {
    this.enableHttp2 = enableHttp2;
  }

  public Service enableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
    return this;
  }

   /**
   * Enable SSL termination and offload for traffic from clients.
   * @return enableSsl
  **/
  @Schema(description = "Enable SSL termination and offload for traffic from clients.")
  public Boolean isEnableSsl() {
    return enableSsl;
  }

  public void setEnableSsl(Boolean enableSsl) {
    this.enableSsl = enableSsl;
  }

  public Service overrideApplicationProfileRef(String overrideApplicationProfileRef) {
    this.overrideApplicationProfileRef = overrideApplicationProfileRef;
    return this;
  }

   /**
   * Enable application layer specific features for the this specific service. It is a reference to an object of type ApplicationProfile. Field introduced in 17.2.4.
   * @return overrideApplicationProfileRef
  **/
  @Schema(description = "Enable application layer specific features for the this specific service. It is a reference to an object of type ApplicationProfile. Field introduced in 17.2.4.")
  public String getOverrideApplicationProfileRef() {
    return overrideApplicationProfileRef;
  }

  public void setOverrideApplicationProfileRef(String overrideApplicationProfileRef) {
    this.overrideApplicationProfileRef = overrideApplicationProfileRef;
  }

  public Service overrideNetworkProfileRef(String overrideNetworkProfileRef) {
    this.overrideNetworkProfileRef = overrideNetworkProfileRef;
    return this;
  }

   /**
   * Override the network profile for this specific service port. It is a reference to an object of type NetworkProfile.
   * @return overrideNetworkProfileRef
  **/
  @Schema(description = "Override the network profile for this specific service port. It is a reference to an object of type NetworkProfile.")
  public String getOverrideNetworkProfileRef() {
    return overrideNetworkProfileRef;
  }

  public void setOverrideNetworkProfileRef(String overrideNetworkProfileRef) {
    this.overrideNetworkProfileRef = overrideNetworkProfileRef;
  }

  public Service port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The Virtual Service&#x27;s port number. Allowed values are 1-65535.
   * @return port
  **/
  @Schema(required = true, description = "The Virtual Service's port number. Allowed values are 1-65535.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Service portRangeEnd(Integer portRangeEnd) {
    this.portRangeEnd = portRangeEnd;
    return this;
  }

   /**
   * The end of the Virtual Service&#x27;s port number range. Allowed values are 1-65535. Special values are 0- &#x27;single port&#x27;.
   * @return portRangeEnd
  **/
  @Schema(description = "The end of the Virtual Service's port number range. Allowed values are 1-65535. Special values are 0- 'single port'.")
  public Integer getPortRangeEnd() {
    return portRangeEnd;
  }

  public void setPortRangeEnd(Integer portRangeEnd) {
    this.portRangeEnd = portRangeEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.enableHttp2, service.enableHttp2) &&
        Objects.equals(this.enableSsl, service.enableSsl) &&
        Objects.equals(this.overrideApplicationProfileRef, service.overrideApplicationProfileRef) &&
        Objects.equals(this.overrideNetworkProfileRef, service.overrideNetworkProfileRef) &&
        Objects.equals(this.port, service.port) &&
        Objects.equals(this.portRangeEnd, service.portRangeEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHttp2, enableSsl, overrideApplicationProfileRef, overrideNetworkProfileRef, port, portRangeEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    enableHttp2: ").append(toIndentedString(enableHttp2)).append("\n");
    sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
    sb.append("    overrideApplicationProfileRef: ").append(toIndentedString(overrideApplicationProfileRef)).append("\n");
    sb.append("    overrideNetworkProfileRef: ").append(toIndentedString(overrideNetworkProfileRef)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    portRangeEnd: ").append(toIndentedString(portRangeEnd)).append("\n");
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