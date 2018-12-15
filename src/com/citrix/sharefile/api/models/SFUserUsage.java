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

public class SFUserUsage extends SFODataObject {

    @SerializedName("EmployeeMax")
    private Integer EmployeeMax;
    @SerializedName("EmployeeCount")
    private Integer EmployeeCount;
    @SerializedName("ClientCount")
    private Integer ClientCount;

    /**
     * Max number of employee users.
     */
    public Integer getEmployeeMax() {
        return this.EmployeeMax;
    }

    /**
     * Max number of employee users.
     */
    public void setEmployeeMax(Integer employeemax) {
        this.EmployeeMax = employeemax;
    }

    /**
     * Current number of employee users.
     */
    public Integer getEmployeeCount() {
        return this.EmployeeCount;
    }

    /**
     * Current number of employee users.
     */
    public void setEmployeeCount(Integer employeecount) {
        this.EmployeeCount = employeecount;
    }

    /**
     * Current number of client users.
     */
    public Integer getClientCount() {
        return this.ClientCount;
    }

    /**
     * Current number of client users.
     */
    public void setClientCount(Integer clientcount) {
        this.ClientCount = clientcount;
    }

}