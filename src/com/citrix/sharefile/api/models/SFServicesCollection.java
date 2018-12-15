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

public class SFServicesCollection extends SFODataObject {

    @SerializedName("RightSignature")
    private SFService RightSignature;
    @SerializedName("ShareConnect")
    private SFService ShareConnect;
    @SerializedName("ShareFileLegal")
    private SFService ShareFileLegal;
    @SerializedName("Podio")
    private SFService Podio;

    /**
     * RightSignature account service
     */
    public SFService getRightSignature() {
        return this.RightSignature;
    }

    /**
     * RightSignature account service
     */
    public void setRightSignature(SFService rightsignature) {
        this.RightSignature = rightsignature;
    }

    /**
     * ShareConnect account service
     */
    public SFService getShareConnect() {
        return this.ShareConnect;
    }

    /**
     * ShareConnect account service
     */
    public void setShareConnect(SFService shareconnect) {
        this.ShareConnect = shareconnect;
    }

    /**
     * ShareFile Legal account service
     */
    public SFService getShareFileLegal() {
        return this.ShareFileLegal;
    }

    /**
     * ShareFile Legal account service
     */
    public void setShareFileLegal(SFService sharefilelegal) {
        this.ShareFileLegal = sharefilelegal;
    }

    /**
     * Podio account service
     */
    public SFService getPodio() {
        return this.Podio;
    }

    /**
     * Podio account service
     */
    public void setPodio(SFService podio) {
        this.Podio = podio;
    }

}