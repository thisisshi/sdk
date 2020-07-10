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
import com.vmware.avi.sdk.model.NetworkProfileUnion;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * NetworkProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class NetworkProfile {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("connection_mirror")
  private Boolean connectionMirror = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("profile")
  private NetworkProfileUnion profile = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

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

  public NetworkProfile connectionMirror(Boolean connectionMirror) {
    this.connectionMirror = connectionMirror;
    return this;
  }

   /**
   * When enabled, Avi mirrors all TCP fastpath connections to standby. Applicable only in Legacy HA Mode. Field introduced in 18.1.3,18.2.1.
   * @return connectionMirror
  **/
  @Schema(description = "When enabled, Avi mirrors all TCP fastpath connections to standby. Applicable only in Legacy HA Mode. Field introduced in 18.1.3,18.2.1.")
  public Boolean isConnectionMirror() {
    return connectionMirror;
  }

  public void setConnectionMirror(Boolean connectionMirror) {
    this.connectionMirror = connectionMirror;
  }

  public NetworkProfile description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User defined description for the object.
   * @return description
  **/
  @Schema(description = "User defined description for the object.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NetworkProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the network profile.
   * @return name
  **/
  @Schema(required = true, description = "The name of the network profile.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworkProfile profile(NetworkProfileUnion profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @Schema(required = true, description = "")
  public NetworkProfileUnion getProfile() {
    return profile;
  }

  public void setProfile(NetworkProfileUnion profile) {
    this.profile = profile;
  }

  public NetworkProfile tenantRef(String tenantRef) {
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

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public NetworkProfile uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the network profile.
   * @return uuid
  **/
  @Schema(description = "UUID of the network profile.")
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
    NetworkProfile networkProfile = (NetworkProfile) o;
    return Objects.equals(this._lastModified, networkProfile._lastModified) &&
        Objects.equals(this.connectionMirror, networkProfile.connectionMirror) &&
        Objects.equals(this.description, networkProfile.description) &&
        Objects.equals(this.name, networkProfile.name) &&
        Objects.equals(this.profile, networkProfile.profile) &&
        Objects.equals(this.tenantRef, networkProfile.tenantRef) &&
        Objects.equals(this.url, networkProfile.url) &&
        Objects.equals(this.uuid, networkProfile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, connectionMirror, description, name, profile, tenantRef, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProfile {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    connectionMirror: ").append(toIndentedString(connectionMirror)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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