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

import java.util.ArrayList;

public class SFBulkProvisionResults extends SFODataObject {

    @SerializedName("BilledAddons")
    private ArrayList<SFBillingAddOn> BilledAddons;
    @SerializedName("ProvisionedAddons")
    private ArrayList<SFBillingAddOn> ProvisionedAddons;
    @SerializedName("DeprovisionedAddons")
    private ArrayList<SFBillingAddOn> DeprovisionedAddons;
    @SerializedName("BillingAmount")
    private Double BillingAmount;
    @SerializedName("IsEmailSent")
    private Boolean IsEmailSent;

    public ArrayList<SFBillingAddOn> getBilledAddons() {
        return this.BilledAddons;
    }

    public void setBilledAddons(ArrayList<SFBillingAddOn> billedaddons) {
        this.BilledAddons = billedaddons;
    }

    public ArrayList<SFBillingAddOn> getProvisionedAddons() {
        return this.ProvisionedAddons;
    }

    public void setProvisionedAddons(ArrayList<SFBillingAddOn> provisionedaddons) {
        this.ProvisionedAddons = provisionedaddons;
    }

    public ArrayList<SFBillingAddOn> getDeprovisionedAddons() {
        return this.DeprovisionedAddons;
    }

    public void setDeprovisionedAddons(ArrayList<SFBillingAddOn> deprovisionedaddons) {
        this.DeprovisionedAddons = deprovisionedaddons;
    }

    public Double getBillingAmount() {
        return this.BillingAmount;
    }

    public void setBillingAmount(Double billingamount) {
        this.BillingAmount = billingamount;
    }

    public Boolean getIsEmailSent() {
        return this.IsEmailSent;
    }

    public void setIsEmailSent(Boolean isemailsent) {
        this.IsEmailSent = isemailsent;
    }

}