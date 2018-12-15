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

import com.citrix.sharefile.api.enumerations.SFSafeEnumFlags;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SFFolder extends SFItem {

    @SerializedName("FileCount")
    private Integer FileCount;
    @SerializedName("Children")
    private ArrayList<SFItem> Children;
    @SerializedName("HasRemoteChildren")
    private Boolean HasRemoteChildren;
    @SerializedName("Info")
    private SFItemInfo Info;
    @SerializedName("Redirection")
    private SFRedirection Redirection;
    @SerializedName("FavoriteFolder")
    private SFFavoriteFolder FavoriteFolder;
    @SerializedName("ZoneService")
    private SFSafeEnumFlags<SFZoneService> ZoneService;
    @SerializedName("Bundle")
    private SFBundle Bundle;
    @SerializedName("SmartFolderOptions")
    private SFSmartFolderOptions SmartFolderOptions;

    /**
     * Number of Items defined under this Folder, including sub-folder counts.
     */
    public Integer getFileCount() {
        return this.FileCount;
    }

    /**
     * Number of Items defined under this Folder, including sub-folder counts.
     */
    public void setFileCount(Integer filecount) {
        this.FileCount = filecount;
    }

    /**
     * List of Children defined under this folder.
     */
    public ArrayList<SFItem> getChildren() {
        return this.Children;
    }

    /**
     * List of Children defined under this folder.
     */
    public void setChildren(ArrayList<SFItem> children) {
        this.Children = children;
    }

    /**
     * Defines whether the request to retreive Children is to be navigated to a remote endpoint.
     */
    public Boolean getHasRemoteChildren() {
        return this.HasRemoteChildren;
    }

    /**
     * Defines whether the request to retreive Children is to be navigated to a remote endpoint.
     */
    public void setHasRemoteChildren(Boolean hasremotechildren) {
        this.HasRemoteChildren = hasremotechildren;
    }

    /**
     * Effective Access Control Permissions for this Folder
     */
    public SFItemInfo getInfo() {
        return this.Info;
    }

    /**
     * Effective Access Control Permissions for this Folder
     */
    public void setInfo(SFItemInfo info) {
        this.Info = info;
    }

    /**
     * Redirection endpoint for this Item.
     */
    public SFRedirection getRedirection() {
        return this.Redirection;
    }

    /**
     * Redirection endpoint for this Item.
     */
    public void setRedirection(SFRedirection redirection) {
        this.Redirection = redirection;
    }

    /**
     * Favorite Folder object associated to this item
     * (This property would be deprecated in favor of the new 'Favorite' property under Item)
     */
    public SFFavoriteFolder getFavoriteFolder() {
        return this.FavoriteFolder;
    }

    /**
     * Favorite Folder object associated to this item
     * (This property would be deprecated in favor of the new 'Favorite' property under Item)
     */
    public void setFavoriteFolder(SFFavoriteFolder favoritefolder) {
        this.FavoriteFolder = favoritefolder;
    }

    public SFSafeEnumFlags<SFZoneService> getZoneService() {
        return this.ZoneService;
    }

    public void setZoneService(SFSafeEnumFlags<SFZoneService> zoneservice) {
        this.ZoneService = zoneservice;
    }

    public SFBundle getBundle() {
        return this.Bundle;
    }

    public void setBundle(SFBundle bundle) {
        this.Bundle = bundle;
    }

    public SFSmartFolderOptions getSmartFolderOptions() {
        return this.SmartFolderOptions;
    }

    public void setSmartFolderOptions(SFSmartFolderOptions smartfolderoptions) {
        this.SmartFolderOptions = smartfolderoptions;
    }

}