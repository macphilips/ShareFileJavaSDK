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

public class SFPlanAddon extends SFODataObject {

    @SerializedName("PlanState")
    private String PlanState;
    @SerializedName("PlanInfo")
    private Object PlanInfo;
    @SerializedName("AvailablePlans")
    private ArrayList<String> AvailablePlans;
    @SerializedName("Features")
    private ArrayList<String> Features;
    @SerializedName("ProductCodeName")
    private String ProductCodeName;

    public String getPlanState() {
        return this.PlanState;
    }

    public void setPlanState(String planstate) {
        this.PlanState = planstate;
    }

    public Object getPlanInfo() {
        return this.PlanInfo;
    }

    public void setPlanInfo(Object planinfo) {
        this.PlanInfo = planinfo;
    }

    public ArrayList<String> getAvailablePlans() {
        return this.AvailablePlans;
    }

    public void setAvailablePlans(ArrayList<String> availableplans) {
        this.AvailablePlans = availableplans;
    }

    public ArrayList<String> getFeatures() {
        return this.Features;
    }

    public void setFeatures(ArrayList<String> features) {
        this.Features = features;
    }

    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    public void setProductCodeName(String productcodename) {
        this.ProductCodeName = productcodename;
    }

}