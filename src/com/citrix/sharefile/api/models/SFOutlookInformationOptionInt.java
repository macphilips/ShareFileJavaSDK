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

public class SFOutlookInformationOptionInt extends SFODataObject {

    @SerializedName("Locked")
    private Boolean Locked;
    @SerializedName("Value")
    private Integer Value;

    /**
     * Setting is locked.
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Setting is locked.
     */
    public void setLocked(Boolean locked) {
        this.Locked = locked;
    }

    /**
     * Value
     */
    public Integer getValue() {
        return this.Value;
    }

    /**
     * Value
     */
    public void setValue(Integer value) {
        this.Value = value;
    }

}