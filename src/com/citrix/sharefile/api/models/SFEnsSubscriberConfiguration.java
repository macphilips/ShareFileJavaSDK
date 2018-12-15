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

public class SFEnsSubscriberConfiguration extends SFODataObject {

    @SerializedName("IsEnsEnabled")
    private Boolean IsEnsEnabled;
    @SerializedName("EnsServerUrl")
    private String EnsServerUrl;
    @SerializedName("Version")
    private String Version;
    @SerializedName("RecommendedPollingSyncInterval")
    private Object RecommendedPollingSyncInterval;
    @SerializedName("RecommendedNotificationSyncInterval")
    private Object RecommendedNotificationSyncInterval;
    @SerializedName("NotificationConfigurationCount")
    private Integer NotificationConfigurationCount;
    @SerializedName("FailSafePollingCount")
    private Integer FailSafePollingCount;
    @SerializedName("MaxNotificationSyncWaitCount")
    private Integer MaxNotificationSyncWaitCount;

    /**
     * Is ENS enabled?
     */
    public Boolean getIsEnsEnabled() {
        return this.IsEnsEnabled;
    }

    /**
     * Is ENS enabled?
     */
    public void setIsEnsEnabled(Boolean isensenabled) {
        this.IsEnsEnabled = isensenabled;
    }

    /**
     * The ENS Server URL
     */
    public String getEnsServerUrl() {
        return this.EnsServerUrl;
    }

    /**
     * The ENS Server URL
     */
    public void setEnsServerUrl(String ensserverurl) {
        this.EnsServerUrl = ensserverurl;
    }

    /**
     * Version string
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Version string
     */
    public void setVersion(String version) {
        this.Version = version;
    }

    /**
     * RecommendedPollingSyncInterval will control how often a cloud check is done when we are not using ENS.
     */
    public Object getRecommendedPollingSyncInterval() {
        return this.RecommendedPollingSyncInterval;
    }

    /**
     * RecommendedPollingSyncInterval will control how often a cloud check is done when we are not using ENS.
     */
    public void setRecommendedPollingSyncInterval(Object recommendedpollingsyncinterval) {
        this.RecommendedPollingSyncInterval = recommendedpollingsyncinterval;
    }

    /**
     * RecommendedNotificationSyncInterval will control how soon we respond to notification events with a cloud check when we are using ENS.
     */
    public Object getRecommendedNotificationSyncInterval() {
        return this.RecommendedNotificationSyncInterval;
    }

    /**
     * RecommendedNotificationSyncInterval will control how soon we respond to notification events with a cloud check when we are using ENS.
     */
    public void setRecommendedNotificationSyncInterval(Object recommendednotificationsyncinterval) {
        this.RecommendedNotificationSyncInterval = recommendednotificationsyncinterval;
    }

    /**
     * NotificationConfigurationCount will control how often we check to see if we should be using ENS or not.
     * This value is a count that gets multiplied by the RecommendedPollingSyncInterval to determine the actual interval.
     */
    public Integer getNotificationConfigurationCount() {
        return this.NotificationConfigurationCount;
    }

    /**
     * NotificationConfigurationCount will control how often we check to see if we should be using ENS or not.
     * This value is a count that gets multiplied by the RecommendedPollingSyncInterval to determine the actual interval.
     */
    public void setNotificationConfigurationCount(Integer notificationconfigurationcount) {
        this.NotificationConfigurationCount = notificationconfigurationcount;
    }

    /**
     * FailSafePollingCount will only be used when ENS is enabled and will get multiplied by the RecommendedNotificationSyncInterval
     * to determine how often we do a cloudcheck if we have not received any notifications.
     */
    public Integer getFailSafePollingCount() {
        return this.FailSafePollingCount;
    }

    /**
     * FailSafePollingCount will only be used when ENS is enabled and will get multiplied by the RecommendedNotificationSyncInterval
     * to determine how often we do a cloudcheck if we have not received any notifications.
     */
    public void setFailSafePollingCount(Integer failsafepollingcount) {
        this.FailSafePollingCount = failsafepollingcount;
    }

    /**
     * MaxNotificationSyncWaitCount will control how long the sync client waits before doing a cloud check after receiving a series of notification events.
     */
    public Integer getMaxNotificationSyncWaitCount() {
        return this.MaxNotificationSyncWaitCount;
    }

    /**
     * MaxNotificationSyncWaitCount will control how long the sync client waits before doing a cloud check after receiving a series of notification events.
     */
    public void setMaxNotificationSyncWaitCount(Integer maxnotificationsyncwaitcount) {
        this.MaxNotificationSyncWaitCount = maxnotificationsyncwaitcount;
    }

}