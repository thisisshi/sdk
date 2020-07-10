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
import java.util.ArrayList;
import java.util.List;
/**
 * DnsRuleActionGslbSiteSelection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DnsRuleActionGslbSiteSelection {
  @JsonProperty("fallback_site_names")
  private List<String> fallbackSiteNames = null;

  @JsonProperty("is_site_preferred")
  private Boolean isSitePreferred = true;

  @JsonProperty("site_name")
  private String siteName = null;

  public DnsRuleActionGslbSiteSelection fallbackSiteNames(List<String> fallbackSiteNames) {
    this.fallbackSiteNames = fallbackSiteNames;
    return this;
  }

  public DnsRuleActionGslbSiteSelection addFallbackSiteNamesItem(String fallbackSiteNamesItem) {
    if (this.fallbackSiteNames == null) {
      this.fallbackSiteNames = new ArrayList<String>();
    }
    this.fallbackSiteNames.add(fallbackSiteNamesItem);
    return this;
  }

   /**
   * GSLB fallback sites to use in case the desired site is down. Field introduced in 17.2.5.
   * @return fallbackSiteNames
  **/
  @Schema(description = "GSLB fallback sites to use in case the desired site is down. Field introduced in 17.2.5.")
  public List<String> getFallbackSiteNames() {
    return fallbackSiteNames;
  }

  public void setFallbackSiteNames(List<String> fallbackSiteNames) {
    this.fallbackSiteNames = fallbackSiteNames;
  }

  public DnsRuleActionGslbSiteSelection isSitePreferred(Boolean isSitePreferred) {
    this.isSitePreferred = isSitePreferred;
    return this;
  }

   /**
   * When set to true, GSLB site is a preferred site. This setting comes into play when the site is down, as well as no configured fallback site is available (all fallback sites are also down), then any one available site is selected based on the default algorithm for GSLB pool member selection. Field introduced in 17.2.5.
   * @return isSitePreferred
  **/
  @Schema(description = "When set to true, GSLB site is a preferred site. This setting comes into play when the site is down, as well as no configured fallback site is available (all fallback sites are also down), then any one available site is selected based on the default algorithm for GSLB pool member selection. Field introduced in 17.2.5.")
  public Boolean isIsSitePreferred() {
    return isSitePreferred;
  }

  public void setIsSitePreferred(Boolean isSitePreferred) {
    this.isSitePreferred = isSitePreferred;
  }

  public DnsRuleActionGslbSiteSelection siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * GSLB site name. Field introduced in 17.1.5.
   * @return siteName
  **/
  @Schema(required = true, description = "GSLB site name. Field introduced in 17.1.5.")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleActionGslbSiteSelection dnsRuleActionGslbSiteSelection = (DnsRuleActionGslbSiteSelection) o;
    return Objects.equals(this.fallbackSiteNames, dnsRuleActionGslbSiteSelection.fallbackSiteNames) &&
        Objects.equals(this.isSitePreferred, dnsRuleActionGslbSiteSelection.isSitePreferred) &&
        Objects.equals(this.siteName, dnsRuleActionGslbSiteSelection.siteName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fallbackSiteNames, isSitePreferred, siteName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleActionGslbSiteSelection {\n");
    
    sb.append("    fallbackSiteNames: ").append(toIndentedString(fallbackSiteNames)).append("\n");
    sb.append("    isSitePreferred: ").append(toIndentedString(isSitePreferred)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
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