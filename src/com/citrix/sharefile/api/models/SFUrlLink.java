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

public class SFUrlLink extends SFODataObject {

    @SerializedName("Url")
    private String Url;
    @SerializedName("DisplayText")
    private String DisplayText;

    public String getUrl() {
        return this.Url;
    }

    public void setUrl(String url) {
        this.Url = url;
    }

    public String getDisplayText() {
        return this.DisplayText;
    }

    public void setDisplayText(String displaytext) {
        this.DisplayText = displaytext;
    }

}