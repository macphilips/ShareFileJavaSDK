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

import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SFItemInfo extends SFODataObject {

    @SerializedName("CurrentAccessControl")
    private SFAccessControl CurrentAccessControl;
    @SerializedName("HasVroot")
    private Boolean HasVroot;
    @SerializedName("IsSystemRoot")
    private Boolean IsSystemRoot;
    @SerializedName("IsAccountRoot")
    private Boolean IsAccountRoot;
    @SerializedName("IsVRoot")
    private Boolean IsVRoot;
    @SerializedName("IsMyFolders")
    private Boolean IsMyFolders;
    @SerializedName("IsAHomeFolder")
    private Boolean IsAHomeFolder;
    @SerializedName("IsMyHomeFolder")
    private Boolean IsMyHomeFolder;
    @SerializedName("IsAStartFolder")
    private Boolean IsAStartFolder;
    @SerializedName("IsSharedFolder")
    private Boolean IsSharedFolder;
    @SerializedName("IsPassthrough")
    private Boolean IsPassthrough;
    @SerializedName("IsVersioned")
    private Boolean IsVersioned;
    @SerializedName("CanAddFolder")
    private Boolean CanAddFolder;
    @SerializedName("CanAddNode")
    private Boolean CanAddNode;
    @SerializedName("CanView")
    private Boolean CanView;
    @SerializedName("CanDownload")
    private Boolean CanDownload;
    @SerializedName("CanWatermarkDownload")
    private Boolean CanWatermarkDownload;
    @SerializedName("CanDocViewerPrint")
    private Boolean CanDocViewerPrint;
    @SerializedName("CanUpload")
    private Boolean CanUpload;
    @SerializedName("CanSend")
    private Boolean CanSend;
    @SerializedName("CanDeleteCurrentItem")
    private Boolean CanDeleteCurrentItem;
    @SerializedName("CanDeleteChildItems")
    private Boolean CanDeleteChildItems;
    @SerializedName("CanManagePermissions")
    private Boolean CanManagePermissions;
    @SerializedName("CanEditFolderOpts")
    private Boolean CanEditFolderOpts;
    @SerializedName("CanEditRetentionPolicy")
    private Boolean CanEditRetentionPolicy;
    @SerializedName("CanEditFolderExpirationDays")
    private Boolean CanEditFolderExpirationDays;
    @SerializedName("CanEditFolderExpirationDate")
    private Boolean CanEditFolderExpirationDate;
    @SerializedName("CanEditFolderMaxVersions")
    private Boolean CanEditFolderMaxVersions;
    @SerializedName("CanEditFolderVersioning")
    private Boolean CanEditFolderVersioning;
    @SerializedName("CanCreateOfficeDocuments")
    private Boolean CanCreateOfficeDocuments;
    @SerializedName("FolderPayID")
    private String FolderPayID;
    @SerializedName("ShowFolderPayBuyButton")
    private Boolean ShowFolderPayBuyButton;
    @SerializedName("TreeMode")
    private SFSafeEnum<SFTreeMode> TreeMode;
    @SerializedName("Versioning")
    private SFSafeEnum<SFVersioning> Versioning;
    @SerializedName("TreeModeOperationAllowed")
    private Boolean TreeModeOperationAllowed;
    @SerializedName("TreeModeSourceId")
    private String TreeModeSourceId;
    @SerializedName("ForcedSortField")
    private SFSafeEnum<SFSortField> ForcedSortField;
    @SerializedName("ForcedSortOrder")
    private SFSafeEnum<SFSortDirection> ForcedSortOrder;
    @SerializedName("MaxVersions")
    private Integer MaxVersions;
    @SerializedName("DocumentViewerPrinting")
    private SFSafeEnum<SFDocumentViewerPrinting> DocumentViewerPrinting;
    @SerializedName("WatermarkedDownloads")
    private SFSafeEnum<SFWatermarkedDownloads> WatermarkedDownloads;
    @SerializedName("OptionPropagation")
    private ArrayList<SFSafeEnum<SFFolderOption>> OptionPropagation;
    @SerializedName("ViewOnlyWatermarkText")
    private String ViewOnlyWatermarkText;
    @SerializedName("SortField")
    private SFSafeEnum<SFSortField> SortField;
    @SerializedName("SortDirection")
    private SFSafeEnum<SFSortDirection> SortDirection;
    @SerializedName("CanCreateRequestList")
    private Boolean CanCreateRequestList;

    public SFAccessControl getCurrentAccessControl() {
        return this.CurrentAccessControl;
    }

    public void setCurrentAccessControl(SFAccessControl currentaccesscontrol) {
        this.CurrentAccessControl = currentaccesscontrol;
    }

    public Boolean getHasVroot() {
        return this.HasVroot;
    }

    public void setHasVroot(Boolean hasvroot) {
        this.HasVroot = hasvroot;
    }

    public Boolean getIsSystemRoot() {
        return this.IsSystemRoot;
    }

    public void setIsSystemRoot(Boolean issystemroot) {
        this.IsSystemRoot = issystemroot;
    }

    public Boolean getIsAccountRoot() {
        return this.IsAccountRoot;
    }

    public void setIsAccountRoot(Boolean isaccountroot) {
        this.IsAccountRoot = isaccountroot;
    }

    public Boolean getIsVRoot() {
        return this.IsVRoot;
    }

    public void setIsVRoot(Boolean isvroot) {
        this.IsVRoot = isvroot;
    }

    public Boolean getIsMyFolders() {
        return this.IsMyFolders;
    }

    public void setIsMyFolders(Boolean ismyfolders) {
        this.IsMyFolders = ismyfolders;
    }

    public Boolean getIsAHomeFolder() {
        return this.IsAHomeFolder;
    }

    public void setIsAHomeFolder(Boolean isahomefolder) {
        this.IsAHomeFolder = isahomefolder;
    }

    public Boolean getIsMyHomeFolder() {
        return this.IsMyHomeFolder;
    }

    public void setIsMyHomeFolder(Boolean ismyhomefolder) {
        this.IsMyHomeFolder = ismyhomefolder;
    }

    public Boolean getIsAStartFolder() {
        return this.IsAStartFolder;
    }

    public void setIsAStartFolder(Boolean isastartfolder) {
        this.IsAStartFolder = isastartfolder;
    }

    public Boolean getIsSharedFolder() {
        return this.IsSharedFolder;
    }

    public void setIsSharedFolder(Boolean issharedfolder) {
        this.IsSharedFolder = issharedfolder;
    }

    public Boolean getIsPassthrough() {
        return this.IsPassthrough;
    }

    public void setIsPassthrough(Boolean ispassthrough) {
        this.IsPassthrough = ispassthrough;
    }

    public Boolean getIsVersioned() {
        return this.IsVersioned;
    }

    public void setIsVersioned(Boolean isversioned) {
        this.IsVersioned = isversioned;
    }

    public Boolean getCanAddFolder() {
        return this.CanAddFolder;
    }

    public void setCanAddFolder(Boolean canaddfolder) {
        this.CanAddFolder = canaddfolder;
    }

    public Boolean getCanAddNode() {
        return this.CanAddNode;
    }

    public void setCanAddNode(Boolean canaddnode) {
        this.CanAddNode = canaddnode;
    }

    public Boolean getCanView() {
        return this.CanView;
    }

    public void setCanView(Boolean canview) {
        this.CanView = canview;
    }

    public Boolean getCanDownload() {
        return this.CanDownload;
    }

    public void setCanDownload(Boolean candownload) {
        this.CanDownload = candownload;
    }

    public Boolean getCanWatermarkDownload() {
        return this.CanWatermarkDownload;
    }

    public void setCanWatermarkDownload(Boolean canwatermarkdownload) {
        this.CanWatermarkDownload = canwatermarkdownload;
    }

    public Boolean getCanDocViewerPrint() {
        return this.CanDocViewerPrint;
    }

    public void setCanDocViewerPrint(Boolean candocviewerprint) {
        this.CanDocViewerPrint = candocviewerprint;
    }

    public Boolean getCanUpload() {
        return this.CanUpload;
    }

    public void setCanUpload(Boolean canupload) {
        this.CanUpload = canupload;
    }

    public Boolean getCanSend() {
        return this.CanSend;
    }

    public void setCanSend(Boolean cansend) {
        this.CanSend = cansend;
    }

    public Boolean getCanDeleteCurrentItem() {
        return this.CanDeleteCurrentItem;
    }

    public void setCanDeleteCurrentItem(Boolean candeletecurrentitem) {
        this.CanDeleteCurrentItem = candeletecurrentitem;
    }

    public Boolean getCanDeleteChildItems() {
        return this.CanDeleteChildItems;
    }

    public void setCanDeleteChildItems(Boolean candeletechilditems) {
        this.CanDeleteChildItems = candeletechilditems;
    }

    public Boolean getCanManagePermissions() {
        return this.CanManagePermissions;
    }

    public void setCanManagePermissions(Boolean canmanagepermissions) {
        this.CanManagePermissions = canmanagepermissions;
    }

    public Boolean getCanEditFolderOpts() {
        return this.CanEditFolderOpts;
    }

    public void setCanEditFolderOpts(Boolean caneditfolderopts) {
        this.CanEditFolderOpts = caneditfolderopts;
    }

    /**
     * Indicates whether the current user has permission to change folder retention policies (ExpirationDays)
     */
    public Boolean getCanEditRetentionPolicy() {
        return this.CanEditRetentionPolicy;
    }

    /**
     * Indicates whether the current user has permission to change folder retention policies (ExpirationDays)
     */
    public void setCanEditRetentionPolicy(Boolean caneditretentionpolicy) {
        this.CanEditRetentionPolicy = caneditretentionpolicy;
    }

    public Boolean getCanEditFolderExpirationDays() {
        return this.CanEditFolderExpirationDays;
    }

    public void setCanEditFolderExpirationDays(Boolean caneditfolderexpirationdays) {
        this.CanEditFolderExpirationDays = caneditfolderexpirationdays;
    }

    public Boolean getCanEditFolderExpirationDate() {
        return this.CanEditFolderExpirationDate;
    }

    public void setCanEditFolderExpirationDate(Boolean caneditfolderexpirationdate) {
        this.CanEditFolderExpirationDate = caneditfolderexpirationdate;
    }

    public Boolean getCanEditFolderMaxVersions() {
        return this.CanEditFolderMaxVersions;
    }

    public void setCanEditFolderMaxVersions(Boolean caneditfoldermaxversions) {
        this.CanEditFolderMaxVersions = caneditfoldermaxversions;
    }

    public Boolean getCanEditFolderVersioning() {
        return this.CanEditFolderVersioning;
    }

    public void setCanEditFolderVersioning(Boolean caneditfolderversioning) {
        this.CanEditFolderVersioning = caneditfolderversioning;
    }

    public Boolean getCanCreateOfficeDocuments() {
        return this.CanCreateOfficeDocuments;
    }

    public void setCanCreateOfficeDocuments(Boolean cancreateofficedocuments) {
        this.CanCreateOfficeDocuments = cancreateofficedocuments;
    }

    public String getFolderPayID() {
        return this.FolderPayID;
    }

    public void setFolderPayID(String folderpayid) {
        this.FolderPayID = folderpayid;
    }

    public Boolean getShowFolderPayBuyButton() {
        return this.ShowFolderPayBuyButton;
    }

    public void setShowFolderPayBuyButton(Boolean showfolderpaybuybutton) {
        this.ShowFolderPayBuyButton = showfolderpaybuybutton;
    }

    public SFSafeEnum<SFTreeMode> getTreeMode() {
        return this.TreeMode;
    }

    public void setTreeMode(SFSafeEnum<SFTreeMode> treemode) {
        this.TreeMode = treemode;
    }

    public SFSafeEnum<SFVersioning> getVersioning() {
        return this.Versioning;
    }

    public void setVersioning(SFSafeEnum<SFVersioning> versioning) {
        this.Versioning = versioning;
    }

    public Boolean getTreeModeOperationAllowed() {
        return this.TreeModeOperationAllowed;
    }

    public void setTreeModeOperationAllowed(Boolean treemodeoperationallowed) {
        this.TreeModeOperationAllowed = treemodeoperationallowed;
    }

    public String getTreeModeSourceId() {
        return this.TreeModeSourceId;
    }

    public void setTreeModeSourceId(String treemodesourceid) {
        this.TreeModeSourceId = treemodesourceid;
    }

    public SFSafeEnum<SFSortField> getForcedSortField() {
        return this.ForcedSortField;
    }

    public void setForcedSortField(SFSafeEnum<SFSortField> forcedsortfield) {
        this.ForcedSortField = forcedsortfield;
    }

    public SFSafeEnum<SFSortDirection> getForcedSortOrder() {
        return this.ForcedSortOrder;
    }

    public void setForcedSortOrder(SFSafeEnum<SFSortDirection> forcedsortorder) {
        this.ForcedSortOrder = forcedsortorder;
    }

    public Integer getMaxVersions() {
        return this.MaxVersions;
    }

    public void setMaxVersions(Integer maxversions) {
        this.MaxVersions = maxversions;
    }

    public SFSafeEnum<SFDocumentViewerPrinting> getDocumentViewerPrinting() {
        return this.DocumentViewerPrinting;
    }

    public void setDocumentViewerPrinting(SFSafeEnum<SFDocumentViewerPrinting> documentviewerprinting) {
        this.DocumentViewerPrinting = documentviewerprinting;
    }

    public SFSafeEnum<SFWatermarkedDownloads> getWatermarkedDownloads() {
        return this.WatermarkedDownloads;
    }

    public void setWatermarkedDownloads(SFSafeEnum<SFWatermarkedDownloads> watermarkeddownloads) {
        this.WatermarkedDownloads = watermarkeddownloads;
    }

    public ArrayList<SFSafeEnum<SFFolderOption>> getOptionPropagation() {
        return this.OptionPropagation;
    }

    public void setOptionPropagation(ArrayList<SFSafeEnum<SFFolderOption>> optionpropagation) {
        this.OptionPropagation = optionpropagation;
    }

    public String getViewOnlyWatermarkText() {
        return this.ViewOnlyWatermarkText;
    }

    public void setViewOnlyWatermarkText(String viewonlywatermarktext) {
        this.ViewOnlyWatermarkText = viewonlywatermarktext;
    }

    public SFSafeEnum<SFSortField> getSortField() {
        return this.SortField;
    }

    public void setSortField(SFSafeEnum<SFSortField> sortfield) {
        this.SortField = sortfield;
    }

    public SFSafeEnum<SFSortDirection> getSortDirection() {
        return this.SortDirection;
    }

    public void setSortDirection(SFSafeEnum<SFSortDirection> sortdirection) {
        this.SortDirection = sortdirection;
    }

    /**
     * Info on a folder to create a request list bundle
     */
    public Boolean getCanCreateRequestList() {
        return this.CanCreateRequestList;
    }

    /**
     * Info on a folder to create a request list bundle
     */
    public void setCanCreateRequestList(Boolean cancreaterequestlist) {
        this.CanCreateRequestList = cancreaterequestlist;
    }

}