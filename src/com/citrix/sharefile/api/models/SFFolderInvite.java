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

import java.util.Date;

public class SFFolderInvite extends SFODataObject {

    @SerializedName("Title")
    private String Title;
    @SerializedName("Description")
    private String Description;
    @SerializedName("CreationDate")
    private Date CreationDate;
    @SerializedName("ExpirationDate")
    private Date ExpirationDate;
    @SerializedName("CreatorId")
    private String CreatorId;
    @SerializedName("CreatorNameShort")
    private String CreatorNameShort;
    @SerializedName("AccountId")
    private String AccountId;
    @SerializedName("MaxRegistrations")
    private Integer MaxRegistrations;
    @SerializedName("TotalRegistrations")
    private Integer TotalRegistrations;
    @SerializedName("NotifyCreatorOnRegistration")
    private Boolean NotifyCreatorOnRegistration;
    @SerializedName("FolderId")
    private String FolderId;
    @SerializedName("CanDownload")
    private Boolean CanDownload;
    @SerializedName("CanView")
    private Boolean CanView;
    @SerializedName("CanUpload")
    private Boolean CanUpload;
    @SerializedName("CanDelete")
    private Boolean CanDelete;
    @SerializedName("NotifyOnUpload")
    private Boolean NotifyOnUpload;
    @SerializedName("NotifyOnDownload")
    private Boolean NotifyOnDownload;
    @SerializedName("InviteUrl")
    private String InviteUrl;
    @SerializedName("IsExistingUser")
    private Boolean IsExistingUser;
    @SerializedName("IsConfirmed")
    private Boolean IsConfirmed;
    @SerializedName("HasExceededMaxFailedAttempts")
    private Boolean HasExceededMaxFailedAttempts;

    /**
     * Title of the folder invite
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Title of the folder invite
     */
    public void setTitle(String title) {
        this.Title = title;
    }

    /**
     * Short description for the folder invite
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Short description for the folder invite
     */
    public void setDescription(String description) {
        this.Description = description;
    }

    /**
     * Date when the folder invititation was created.
     */
    public Date getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Date when the folder invititation was created.
     */
    public void setCreationDate(Date creationdate) {
        this.CreationDate = creationdate;
    }

    /**
     * Expiration date of the folder invite.
     */
    public Date getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Expiration date of the folder invite.
     */
    public void setExpirationDate(Date expirationdate) {
        this.ExpirationDate = expirationdate;
    }

    /**
     * Unique identifier for the Creator of the folder invite.
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Unique identifier for the Creator of the folder invite.
     */
    public void setCreatorId(String creatorid) {
        this.CreatorId = creatorid;
    }

    /**
     * Short version of items creator's name. E.g., J. Doe.
     */
    public String getCreatorNameShort() {
        return this.CreatorNameShort;
    }

    /**
     * Short version of items creator's name. E.g., J. Doe.
     */
    public void setCreatorNameShort(String creatornameshort) {
        this.CreatorNameShort = creatornameshort;
    }

    /**
     * AccountId of the folder invite.
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * AccountId of the folder invite.
     */
    public void setAccountId(String accountid) {
        this.AccountId = accountid;
    }

    /**
     * Maxixmum registrations allowed for the folder invite.
     */
    public Integer getMaxRegistrations() {
        return this.MaxRegistrations;
    }

    /**
     * Maxixmum registrations allowed for the folder invite.
     */
    public void setMaxRegistrations(Integer maxregistrations) {
        this.MaxRegistrations = maxregistrations;
    }

    /**
     * Total registrations on the the folder invite.
     */
    public Integer getTotalRegistrations() {
        return this.TotalRegistrations;
    }

    /**
     * Total registrations on the the folder invite.
     */
    public void setTotalRegistrations(Integer totalregistrations) {
        this.TotalRegistrations = totalregistrations;
    }

    /**
     * Notify the creator when a user registers for the folder.
     */
    public Boolean getNotifyCreatorOnRegistration() {
        return this.NotifyCreatorOnRegistration;
    }

    /**
     * Notify the creator when a user registers for the folder.
     */
    public void setNotifyCreatorOnRegistration(Boolean notifycreatoronregistration) {
        this.NotifyCreatorOnRegistration = notifycreatoronregistration;
    }

    /**
     * Unique identifier of the folder whose invite has been created or edited
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Unique identifier of the folder whose invite has been created or edited
     */
    public void setFolderId(String folderid) {
        this.FolderId = folderid;
    }

    /**
     * Indicates whether the recipient of the invite can download files from the folder.
     */
    public Boolean getCanDownload() {
        return this.CanDownload;
    }

    /**
     * Indicates whether the recipient of the invite can download files from the folder.
     */
    public void setCanDownload(Boolean candownload) {
        this.CanDownload = candownload;
    }

    /**
     * Indicates whether the recipient of the invite can view files of the folder.
     */
    public Boolean getCanView() {
        return this.CanView;
    }

    /**
     * Indicates whether the recipient of the invite can view files of the folder.
     */
    public void setCanView(Boolean canview) {
        this.CanView = canview;
    }

    /**
     * Indicates whether the recipient of the invite can upload files to the folder.
     */
    public Boolean getCanUpload() {
        return this.CanUpload;
    }

    /**
     * Indicates whether the recipient of the invite can upload files to the folder.
     */
    public void setCanUpload(Boolean canupload) {
        this.CanUpload = canupload;
    }

    /**
     * Indicates whether the recipient of the invite can delete files from the folder.
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Indicates whether the recipient of the invite can delete files from the folder.
     */
    public void setCanDelete(Boolean candelete) {
        this.CanDelete = candelete;
    }

    /**
     * Indicates whether the recipient of the invite can get notified when uploding files to the folder.
     */
    public Boolean getNotifyOnUpload() {
        return this.NotifyOnUpload;
    }

    /**
     * Indicates whether the recipient of the invite can get notified when uploding files to the folder.
     */
    public void setNotifyOnUpload(Boolean notifyonupload) {
        this.NotifyOnUpload = notifyonupload;
    }

    /**
     * Indicates whether the recipient of the invite can get notified when downloading files from the folder.
     */
    public Boolean getNotifyOnDownload() {
        return this.NotifyOnDownload;
    }

    /**
     * Indicates whether the recipient of the invite can get notified when downloading files from the folder.
     */
    public void setNotifyOnDownload(Boolean notifyondownload) {
        this.NotifyOnDownload = notifyondownload;
    }

    /**
     * Url that redirects the user to registration page.
     */
    public String getInviteUrl() {
        return this.InviteUrl;
    }

    /**
     * Url that redirects the user to registration page.
     */
    public void setInviteUrl(String inviteurl) {
        this.InviteUrl = inviteurl;
    }

    /**
     * User exists.
     */
    public Boolean getIsExistingUser() {
        return this.IsExistingUser;
    }

    /**
     * User exists.
     */
    public void setIsExistingUser(Boolean isexistinguser) {
        this.IsExistingUser = isexistinguser;
    }

    /**
     * User exists and already confirmed.
     */
    public Boolean getIsConfirmed() {
        return this.IsConfirmed;
    }

    /**
     * User exists and already confirmed.
     */
    public void setIsConfirmed(Boolean isconfirmed) {
        this.IsConfirmed = isconfirmed;
    }

    /**
     * Has exceeded Maximum failed attempts.
     */
    public Boolean getHasExceededMaxFailedAttempts() {
        return this.HasExceededMaxFailedAttempts;
    }

    /**
     * Has exceeded Maximum failed attempts.
     */
    public void setHasExceededMaxFailedAttempts(Boolean hasexceededmaxfailedattempts) {
        this.HasExceededMaxFailedAttempts = hasexceededmaxfailedattempts;
    }

}