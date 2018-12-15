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

import java.util.ArrayList;
import java.util.Date;

public class SFConnectedApp extends SFODataObject {

    @SerializedName("Name")
    private String Name;
    @SerializedName("AppCode")
    private SFSafeEnum<SFAppCodes> AppCode;
    @SerializedName("LastLoginDate")
    private Date LastLoginDate;
    @SerializedName("UserId")
    private String UserId;
    @SerializedName("Active")
    private Boolean Active;
    @SerializedName("Devices")
    private ArrayList<SFDeviceUser> Devices;

    /**
     * Name of the application
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Name of the application
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * Used to determine which official ShareFile App this is, if any
     */
    public SFSafeEnum<SFAppCodes> getAppCode() {
        return this.AppCode;
    }

    /**
     * Used to determine which official ShareFile App this is, if any
     */
    public void setAppCode(SFSafeEnum<SFAppCodes> appcode) {
        this.AppCode = appcode;
    }

    /**
     * The last time this client was used to login to the account
     */
    public Date getLastLoginDate() {
        return this.LastLoginDate;
    }

    /**
     * The last time this client was used to login to the account
     */
    public void setLastLoginDate(Date lastlogindate) {
        this.LastLoginDate = lastlogindate;
    }

    /**
     * The user this app mapping is for
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * The user this app mapping is for
     */
    public void setUserId(String userid) {
        this.UserId = userid;
    }

    /**
     * Whether or not this App can still be used
     */
    public Boolean getActive() {
        return this.Active;
    }

    /**
     * Whether or not this App can still be used
     */
    public void setActive(Boolean active) {
        this.Active = active;
    }

    /**
     * Devices associated with this App
     */
    public ArrayList<SFDeviceUser> getDevices() {
        return this.Devices;
    }

    /**
     * Devices associated with this App
     */
    public void setDevices(ArrayList<SFDeviceUser> devices) {
        this.Devices = devices;
    }

}