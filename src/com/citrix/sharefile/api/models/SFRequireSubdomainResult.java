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

public class SFRequireSubdomainResult extends SFODataObject {

    @SerializedName("RequireSubdomain")
    private Boolean RequireSubdomain;

    /**
     * Indicates if subdomain is required.
     */
    public Boolean getRequireSubdomain() {
        return this.RequireSubdomain;
    }

    /**
     * Indicates if subdomain is required.
     */
    public void setRequireSubdomain(Boolean requiresubdomain) {
        this.RequireSubdomain = requiresubdomain;
    }

}