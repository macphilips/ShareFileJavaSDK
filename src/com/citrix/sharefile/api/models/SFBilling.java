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

public class SFBilling extends SFODataObject {

    @SerializedName("TotalBillingAmount")
    private Double TotalBillingAmount;
    @SerializedName("GrossBillingAmount")
    private Double GrossBillingAmount;
    @SerializedName("BillingCycle")
    private String BillingCycle;
    @SerializedName("AccountID")
    private String AccountID;

    public Double getTotalBillingAmount() {
        return this.TotalBillingAmount;
    }

    public void setTotalBillingAmount(Double totalbillingamount) {
        this.TotalBillingAmount = totalbillingamount;
    }

    public Double getGrossBillingAmount() {
        return this.GrossBillingAmount;
    }

    public void setGrossBillingAmount(Double grossbillingamount) {
        this.GrossBillingAmount = grossbillingamount;
    }

    public String getBillingCycle() {
        return this.BillingCycle;
    }

    public void setBillingCycle(String billingcycle) {
        this.BillingCycle = billingcycle;
    }

    public String getAccountID() {
        return this.AccountID;
    }

    public void setAccountID(String accountid) {
        this.AccountID = accountid;
    }

}