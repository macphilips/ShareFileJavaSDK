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

public class SFShareSendParams extends SFODataObject {

    @SerializedName("Items")
    private ArrayList<String> Items;
    @SerializedName("Emails")
    private ArrayList<String> Emails;
    @SerializedName("Subject")
    private String Subject;
    @SerializedName("Body")
    private String Body;
    @SerializedName("CcSender")
    private Boolean CcSender;
    @SerializedName("RequireLogin")
    private Boolean RequireLogin;
    @SerializedName("SendAnon")
    private Boolean SendAnon;
    @SerializedName("RequireUserInfo")
    private Boolean RequireUserInfo;
    @SerializedName("ExpirationDays")
    private Integer ExpirationDays;
    @SerializedName("NotifyOnDownload")
    private Boolean NotifyOnDownload;
    @SerializedName("IsViewOnly")
    private Boolean IsViewOnly;
    @SerializedName("MaxDownloads")
    private Integer MaxDownloads;
    @SerializedName("UsesStreamIDs")
    private Boolean UsesStreamIDs;
    @SerializedName("ShareAccessRight")
    private SFShareAccessRight ShareAccessRight;

    /**
     * List of Item Ids to be sent
     */
    public ArrayList<String> getItems() {
        return this.Items;
    }

    /**
     * List of Item Ids to be sent
     */
    public void setItems(ArrayList<String> items) {
        this.Items = items;
    }

    /**
     * List of emails to whom this Share should be sent
     */
    public ArrayList<String> getEmails() {
        return this.Emails;
    }

    /**
     * List of emails to whom this Share should be sent
     */
    public void setEmails(ArrayList<String> emails) {
        this.Emails = emails;
    }

    /**
     * The subject of the Share email
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * The subject of the Share email
     */
    public void setSubject(String subject) {
        this.Subject = subject;
    }

    /**
     * A message to be included in the Share email body
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * A message to be included in the Share email body
     */
    public void setBody(String body) {
        this.Body = body;
    }

    /**
     * If true, the Share sender will be cc'd in the Share email
     */
    public Boolean getCcSender() {
        return this.CcSender;
    }

    /**
     * If true, the Share sender will be cc'd in the Share email
     */
    public void setCcSender(Boolean ccsender) {
        this.CcSender = ccsender;
    }

    /**
     * If true, recipients will need to login to access the Share
     */
    public Boolean getRequireLogin() {
        return this.RequireLogin;
    }

    /**
     * If true, recipients will need to login to access the Share
     */
    public void setRequireLogin(Boolean requirelogin) {
        this.RequireLogin = requirelogin;
    }

    /**
     * If true, anyone with the link can access the Share. Cannot be true if RequireLogin is true
     */
    public Boolean getSendAnon() {
        return this.SendAnon;
    }

    /**
     * If true, anyone with the link can access the Share. Cannot be true if RequireLogin is true
     */
    public void setSendAnon(Boolean sendanon) {
        this.SendAnon = sendanon;
    }

    /**
     * If true, a recipient will need to provide their full name and email to access the Share. Cannot be true if RequireLogin is true
     */
    public Boolean getRequireUserInfo() {
        return this.RequireUserInfo;
    }

    /**
     * If true, a recipient will need to provide their full name and email to access the Share. Cannot be true if RequireLogin is true
     */
    public void setRequireUserInfo(Boolean requireuserinfo) {
        this.RequireUserInfo = requireuserinfo;
    }

    /**
     * Number of days until access to this Share expires
     */
    public Integer getExpirationDays() {
        return this.ExpirationDays;
    }

    /**
     * Number of days until access to this Share expires
     */
    public void setExpirationDays(Integer expirationdays) {
        this.ExpirationDays = expirationdays;
    }

    /**
     * If true, the sender will receive an email notification when the Share items are downloaded
     */
    public Boolean getNotifyOnDownload() {
        return this.NotifyOnDownload;
    }

    /**
     * If true, the sender will receive an email notification when the Share items are downloaded
     */
    public void setNotifyOnDownload(Boolean notifyondownload) {
        this.NotifyOnDownload = notifyondownload;
    }

    /**
     * If true, the Share items can only be viewed but not downloaded. Requires account preference EnableViewOnly to work
     */
    public Boolean getIsViewOnly() {
        return this.IsViewOnly;
    }

    /**
     * If true, the Share items can only be viewed but not downloaded. Requires account preference EnableViewOnly to work
     */
    public void setIsViewOnly(Boolean isviewonly) {
        this.IsViewOnly = isviewonly;
    }

    /**
     * Maximum number of times each recipient can download the Share items
     */
    public Integer getMaxDownloads() {
        return this.MaxDownloads;
    }

    /**
     * Maximum number of times each recipient can download the Share items
     */
    public void setMaxDownloads(Integer maxdownloads) {
        this.MaxDownloads = maxdownloads;
    }

    /**
     * When enabled the items are identified by stream IDs instead of item IDs.
     * Applies to Send Shares only. (FINRA enabled accounts cannot use this)
     */
    public Boolean getUsesStreamIDs() {
        return this.UsesStreamIDs;
    }

    /**
     * When enabled the items are identified by stream IDs instead of item IDs.
     * Applies to Send Shares only. (FINRA enabled accounts cannot use this)
     */
    public void setUsesStreamIDs(Boolean usesstreamids) {
        this.UsesStreamIDs = usesstreamids;
    }

    /**
     * Used to define the share type and share action types
     */
    public SFShareAccessRight getShareAccessRight() {
        return this.ShareAccessRight;
    }

    /**
     * Used to define the share type and share action types
     */
    public void setShareAccessRight(SFShareAccessRight shareaccessright) {
        this.ShareAccessRight = shareaccessright;
    }

}