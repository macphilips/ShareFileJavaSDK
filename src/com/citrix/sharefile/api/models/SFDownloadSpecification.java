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

import java.net.URI;

public class SFDownloadSpecification extends SFODataObject {

    @SerializedName("DownloadToken")
    private String DownloadToken;
    @SerializedName("PrepareXmlInfo")
    private String PrepareXmlInfo;
    @SerializedName("DownloadUrl")
    private URI DownloadUrl;
    @SerializedName("DownloadPrepStartURL")
    private URI DownloadPrepStartURL;
    @SerializedName("DownloadPrepStatusURL")
    private URI DownloadPrepStatusURL;

    public String getDownloadToken() {
        return this.DownloadToken;
    }

    public void setDownloadToken(String downloadtoken) {
        this.DownloadToken = downloadtoken;
    }

    /**
     * Specifies the prepare operation for storage servers
     */
    public String getPrepareXmlInfo() {
        return this.PrepareXmlInfo;
    }

    /**
     * Specifies the prepare operation for storage servers
     */
    public void setPrepareXmlInfo(String preparexmlinfo) {
        this.PrepareXmlInfo = preparexmlinfo;
    }

    /**
     * Specifies the download URL for clients
     */
    public URI getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Specifies the download URL for clients
     */
    public void setDownloadUrl(URI downloadurl) {
        this.DownloadUrl = downloadurl;
    }

    public URI getDownloadPrepStartURL() {
        return this.DownloadPrepStartURL;
    }

    public void setDownloadPrepStartURL(URI downloadprepstarturl) {
        this.DownloadPrepStartURL = downloadprepstarturl;
    }

    public URI getDownloadPrepStatusURL() {
        return this.DownloadPrepStatusURL;
    }

    public void setDownloadPrepStatusURL(URI downloadprepstatusurl) {
        this.DownloadPrepStatusURL = downloadprepstatusurl;
    }

}