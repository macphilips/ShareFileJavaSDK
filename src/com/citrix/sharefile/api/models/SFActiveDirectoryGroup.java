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

import com.google.gson.annotations.SerializedName;

public class SFActiveDirectoryGroup extends SFODataObject {

    @SerializedName("Group")
    private SFGroup Group;
    @SerializedName("ADGuid")
    private String ADGuid;

    public SFGroup getGroup() {
        return this.Group;
    }

    public void setGroup(SFGroup group) {
        this.Group = group;
    }

    public String getADGuid() {
        return this.ADGuid;
    }

    public void setADGuid(String adguid) {
        this.ADGuid = adguid;
    }

}