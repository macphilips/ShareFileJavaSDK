// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2017 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.models;

import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.google.gson.annotations.SerializedName;

public class SFZoneDeployment extends SFODataObject {

    @SerializedName("Zone")
    private SFZone Zone;
    @SerializedName("Region")
    private SFSafeEnum<SFZoneRegion> Region;
    @SerializedName("StorageBasePath")
    private String StorageBasePath;
    @SerializedName("LoadBalancerType")
    private SFSafeEnum<SFZoneLoadBalanceType> LoadBalancerType;
    @SerializedName("Description")
    private String Description;
    @SerializedName("IsVDREnalbed")
    private Boolean IsVDREnalbed;
    @SerializedName("IsTestZone")
    private Boolean IsTestZone;
    @SerializedName("AccountId")
    private String AccountId;

    /**
     * The new zone to be deployed.
     */
    public SFZone getZone() {
        return this.Zone;
    }

    /**
     * The new zone to be deployed.
     */
    public void setZone(SFZone zone) {
        this.Zone = zone;
    }

    /**
     * The geographical region of the deployed zone (for grouping purposes).
     */
    public SFSafeEnum<SFZoneRegion> getRegion() {
        return this.Region;
    }

    /**
     * The geographical region of the deployed zone (for grouping purposes).
     */
    public void setRegion(SFSafeEnum<SFZoneRegion> region) {
        this.Region = region;
    }

    /**
     * The base path used for storage in the deployed zone.
     */
    public String getStorageBasePath() {
        return this.StorageBasePath;
    }

    /**
     * The base path used for storage in the deployed zone.
     */
    public void setStorageBasePath(String storagebasepath) {
        this.StorageBasePath = storagebasepath;
    }

    /**
     * The type of load balancer used for this zone.
     */
    public SFSafeEnum<SFZoneLoadBalanceType> getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * The type of load balancer used for this zone.
     */
    public void setLoadBalancerType(SFSafeEnum<SFZoneLoadBalanceType> loadbalancertype) {
        this.LoadBalancerType = loadbalancertype;
    }

    /**
     * A description of this zone.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * A description of this zone.
     */
    public void setDescription(String description) {
        this.Description = description;
    }

    /**
     * Does this zone have VDR enabled?
     */
    public Boolean getIsVDREnalbed() {
        return this.IsVDREnalbed;
    }

    /**
     * Does this zone have VDR enabled?
     */
    public void setIsVDREnalbed(Boolean isvdrenalbed) {
        this.IsVDREnalbed = isvdrenalbed;
    }

    /**
     * Is this a test zone?
     */
    public Boolean getIsTestZone() {
        return this.IsTestZone;
    }

    /**
     * Is this a test zone?
     */
    public void setIsTestZone(Boolean istestzone) {
        this.IsTestZone = istestzone;
    }

    /**
     * The account to associate this zone with, if any.
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * The account to associate this zone with, if any.
     */
    public void setAccountId(String accountid) {
        this.AccountId = accountid;
    }

}