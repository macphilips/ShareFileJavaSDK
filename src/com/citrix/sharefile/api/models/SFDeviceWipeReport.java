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

public class SFDeviceWipeReport extends SFODataObject {

    @SerializedName("Logs")
    private ArrayList<SFDeviceLogEntry> Logs;
    @SerializedName("WipeResults")
    private ArrayList<SFDeviceUserWipe> WipeResults;

    /**
     * Logs
     */
    public ArrayList<SFDeviceLogEntry> getLogs() {
        return this.Logs;
    }

    /**
     * Logs
     */
    public void setLogs(ArrayList<SFDeviceLogEntry> logs) {
        this.Logs = logs;
    }

    /**
     * Wipe results
     */
    public ArrayList<SFDeviceUserWipe> getWipeResults() {
        return this.WipeResults;
    }

    /**
     * Wipe results
     */
    public void setWipeResults(ArrayList<SFDeviceUserWipe> wiperesults) {
        this.WipeResults = wiperesults;
    }

}