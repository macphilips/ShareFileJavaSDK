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

import java.util.HashMap;
import java.util.Map;

public class SFEntityTypeMap {

    private static final Map<String, Class> _entityTypeMap = new HashMap<String, Class>();
    private static Object mapLock = new Object();

    public static Map<String, Class> getEntityTypeMap() {
        synchronized (mapLock) {
            if (_entityTypeMap.size() > 0) {
                return _entityTypeMap;
            }

            _entityTypeMap.put("AccessControlsBulkParams", SFAccessControlsBulkParams.class);
            _entityTypeMap.put("AccessControlsBulkParamss", SFAccessControlsBulkParams.class);
            _entityTypeMap.put("AccessControlParam", SFAccessControlParam.class);
            _entityTypeMap.put("AccessControlParams", SFAccessControlParam.class);
            _entityTypeMap.put("AccountStatus", SFAccountStatus.class);
            _entityTypeMap.put("AccountStatuss", SFAccountStatus.class);
            _entityTypeMap.put("AccountMessageCode", SFAccountMessageCode.class);
            _entityTypeMap.put("AccountMessageCodes", SFAccountMessageCode.class);
            _entityTypeMap.put("AccessControlsCloneParams", SFAccessControlsCloneParams.class);
            _entityTypeMap.put("AccessControlsCloneParamss", SFAccessControlsCloneParams.class);
            _entityTypeMap.put("ActiveDirectoryGroup", SFActiveDirectoryGroup.class);
            _entityTypeMap.put("ActiveDirectoryGroups", SFActiveDirectoryGroup.class);
            _entityTypeMap.put("ActiveDirectoryUser", SFActiveDirectoryUser.class);
            _entityTypeMap.put("ActiveDirectoryUsers", SFActiveDirectoryUser.class);
            _entityTypeMap.put("Address", SFAddress.class);
            _entityTypeMap.put("Addresses", SFAddress.class);
            _entityTypeMap.put("AsyncOperationBatch", SFAsyncOperationBatch.class);
            _entityTypeMap.put("AsyncOperationBatches", SFAsyncOperationBatch.class);
            _entityTypeMap.put("Bandwidth", SFBandwidth.class);
            _entityTypeMap.put("Bandwidths", SFBandwidth.class);
            _entityTypeMap.put("BillingPreferences", SFBillingPreferences.class);
            _entityTypeMap.put("BillingPreferencess", SFBillingPreferences.class);
            _entityTypeMap.put("BulkProvisionResults", SFBulkProvisionResults.class);
            _entityTypeMap.put("BulkProvisionResultss", SFBulkProvisionResults.class);
            _entityTypeMap.put("Cancellation", SFCancellation.class);
            _entityTypeMap.put("Cancellations", SFCancellation.class);
            _entityTypeMap.put("Bundle", SFBundle.class);
            _entityTypeMap.put("Bundles", SFBundle.class);
            _entityTypeMap.put("CustomWorkflowBundle", SFCustomWorkflowBundle.class);
            _entityTypeMap.put("CustomWorkflowBundles", SFCustomWorkflowBundle.class);
            _entityTypeMap.put("MedicalStudyBundle", SFMedicalStudyBundle.class);
            _entityTypeMap.put("MedicalStudyBundles", SFMedicalStudyBundle.class);
            _entityTypeMap.put("RequestListBundle", SFRequestListBundle.class);
            _entityTypeMap.put("RequestListBundles", SFRequestListBundle.class);
            _entityTypeMap.put("WorkflowBundle", SFWorkflowBundle.class);
            _entityTypeMap.put("WorkflowBundles", SFWorkflowBundle.class);
            _entityTypeMap.put("ClickTrailEvent", SFClickTrailEvent.class);
            _entityTypeMap.put("ClickTrailEvents", SFClickTrailEvent.class);
            _entityTypeMap.put("ClickTrailSession", SFClickTrailSession.class);
            _entityTypeMap.put("ClickTrailSessions", SFClickTrailSession.class);
            _entityTypeMap.put("SearchField", SFSearchField.class);
            _entityTypeMap.put("SearchFields", SFSearchField.class);
            _entityTypeMap.put("SearchTextFieldSelector", SFSearchTextFieldSelector.class);
            _entityTypeMap.put("SearchTextFieldSelectors", SFSearchTextFieldSelector.class);
            _entityTypeMap.put("ContactsAdvancedSearchParams", SFContactsAdvancedSearchParams.class);
            _entityTypeMap.put("ContentViewerParams", SFContentViewerParams.class);
            _entityTypeMap.put("ContentViewerParamss", SFContentViewerParams.class);
            _entityTypeMap.put("EmailMessage", SFEmailMessage.class);
            _entityTypeMap.put("EmailMessages", SFEmailMessage.class);
            _entityTypeMap.put("CustomMessage", SFCustomMessage.class);
            _entityTypeMap.put("CustomMessages", SFCustomMessage.class);
            _entityTypeMap.put("CitrixCloudCredential", SFCitrixCloudCredential.class);
            _entityTypeMap.put("CitrixCloudCredentials", SFCitrixCloudCredential.class);
            _entityTypeMap.put("CitrixCloudSession", SFCitrixCloudSession.class);
            _entityTypeMap.put("CitrixCloudSessions", SFCitrixCloudSession.class);
            _entityTypeMap.put("EmailAddress", SFEmailAddress.class);
            _entityTypeMap.put("EmailAddresss", SFEmailAddress.class);
            _entityTypeMap.put("CitrixCloudAccountInfo", SFCitrixCloudAccountInfo.class);
            _entityTypeMap.put("CitrixCloudAccountInfos", SFCitrixCloudAccountInfo.class);
            _entityTypeMap.put("DocumentViewEvent", SFDocumentViewEvent.class);
            _entityTypeMap.put("DocumentViewEvents", SFDocumentViewEvent.class);
            _entityTypeMap.put("DocumentViewPageData", SFDocumentViewPageData.class);
            _entityTypeMap.put("DocumentViewPageDatas", SFDocumentViewPageData.class);
            _entityTypeMap.put("EmailAttachmentConversionSetting", SFEmailAttachmentConversionSetting.class);
            _entityTypeMap.put("EmailAttachmentConversionSettings", SFEmailAttachmentConversionSetting.class);
            _entityTypeMap.put("EmailBannerCustomization", SFEmailBannerCustomization.class);
            _entityTypeMap.put("EmailBannerCustomizations", SFEmailBannerCustomization.class);
            _entityTypeMap.put("Favorite", SFFavorite.class);
            _entityTypeMap.put("Favorites", SFFavorite.class);
            _entityTypeMap.put("BillingLog", SFBillingLog.class);
            _entityTypeMap.put("BillingLogs", SFBillingLog.class);
            _entityTypeMap.put("ContentViewerLinkRequest", SFContentViewerLinkRequest.class);
            _entityTypeMap.put("ContentViewerLinkRequests", SFContentViewerLinkRequest.class);
            _entityTypeMap.put("FileAndFolderSettingOptions", SFFileAndFolderSettingOptions.class);
            _entityTypeMap.put("FileAndFolderSettingOptionss", SFFileAndFolderSettingOptions.class);
            _entityTypeMap.put("ForbiddenOAuthClientNameWords", SFForbiddenOAuthClientNameWords.class);
            _entityTypeMap.put("ForbiddenOAuthClientNameWordss", SFForbiddenOAuthClientNameWords.class);
            _entityTypeMap.put("SmartFolderOptions", SFSmartFolderOptions.class);
            _entityTypeMap.put("EmailPluginSettings", SFEmailPluginSettings.class);
            _entityTypeMap.put("TenantAccountCreationParameters", SFTenantAccountCreationParameters.class);
            _entityTypeMap.put("TenantAccountCreationParameterss", SFTenantAccountCreationParameters.class);
            _entityTypeMap.put("UserBulkOperationRequest", SFUserBulkOperationRequest.class);
            _entityTypeMap.put("UserBulkOperationRequests", SFUserBulkOperationRequest.class);
            _entityTypeMap.put("UserBulkDowngradeRequest", SFUserBulkDowngradeRequest.class);
            _entityTypeMap.put("UserBulkDowngradeRequests", SFUserBulkDowngradeRequest.class);
            _entityTypeMap.put("ResetPasswordRequest", SFResetPasswordRequest.class);
            _entityTypeMap.put("ResetPasswordRequests", SFResetPasswordRequest.class);
            _entityTypeMap.put("Quote", SFQuote.class);
            _entityTypeMap.put("Quotes", SFQuote.class);
            _entityTypeMap.put("ServerInfo", SFServerInfo.class);
            _entityTypeMap.put("ServerInfos", SFServerInfo.class);
            _entityTypeMap.put("ServerTag", SFServerTag.class);
            _entityTypeMap.put("ServerTags", SFServerTag.class);
            _entityTypeMap.put("ShareFileCitrixCloudSession", SFShareFileCitrixCloudSession.class);
            _entityTypeMap.put("ShareFileCitrixCloudSessions", SFShareFileCitrixCloudSession.class);
            _entityTypeMap.put("SmtpSettings", SFSmtpSettings.class);
            _entityTypeMap.put("SubdomainAvailabilityResult", SFSubdomainAvailabilityResult.class);
            _entityTypeMap.put("SubdomainAvailabilityResults", SFSubdomainAvailabilityResult.class);
            _entityTypeMap.put("SupportFlag", SFSupportFlag.class);
            _entityTypeMap.put("SupportFlags", SFSupportFlag.class);
            _entityTypeMap.put("UrlLink", SFUrlLink.class);
            _entityTypeMap.put("UrlLinks", SFUrlLink.class);
            _entityTypeMap.put("OrderUpdateNotification", SFOrderUpdateNotification.class);
            _entityTypeMap.put("OrderUpdateNotifications", SFOrderUpdateNotification.class);
            _entityTypeMap.put("BrandingLinks", SFBrandingLinks.class);
            _entityTypeMap.put("BrandingLinkss", SFBrandingLinks.class);
            _entityTypeMap.put("EncodedJwt", SFEncodedJwt.class);
            _entityTypeMap.put("EncodedJwts", SFEncodedJwt.class);
            _entityTypeMap.put("PolicyUsage", SFPolicyUsage.class);
            _entityTypeMap.put("PolicyUsages", SFPolicyUsage.class);
            _entityTypeMap.put("StructuredDownloadItem", SFStructuredDownloadItem.class);
            _entityTypeMap.put("StructuredDownloadItems", SFStructuredDownloadItem.class);
            _entityTypeMap.put("StructuredDownloadFolder", SFStructuredDownloadFolder.class);
            _entityTypeMap.put("StructuredDownloadFolders", SFStructuredDownloadFolder.class);
            _entityTypeMap.put("FileAndFolderSettings", SFFileAndFolderSettings.class);
            _entityTypeMap.put("FileAndFolderSettingss", SFFileAndFolderSettings.class);
            _entityTypeMap.put("ApiRegulatorPolicy", SFApiRegulatorPolicy.class);
            _entityTypeMap.put("ApiRegulatorPolicies", SFApiRegulatorPolicy.class);
            _entityTypeMap.put("ContactsAutocompleteParams", SFContactsAutocompleteParams.class);
            _entityTypeMap.put("ContactsSearchParams", SFContactsSearchParams.class);
            _entityTypeMap.put("ContactsListSelectionParams", SFContactsListSelectionParams.class);
            _entityTypeMap.put("SearchTextFieldSelectorFlags", SFSearchTextFieldSelectorFlags.class);
            _entityTypeMap.put("SearchTextFieldSelectorFlagss", SFSearchTextFieldSelectorFlags.class);
            _entityTypeMap.put("CreditCard", SFCreditCard.class);
            _entityTypeMap.put("CreditCards", SFCreditCard.class);
            _entityTypeMap.put("DeletedAccount", SFDeletedAccount.class);
            _entityTypeMap.put("DeletedAccounts", SFDeletedAccount.class);
            _entityTypeMap.put("ConnectedApp", SFConnectedApp.class);
            _entityTypeMap.put("ConnectedApps", SFConnectedApp.class);
            _entityTypeMap.put("EditingPlatformInfo", SFEditingPlatformInfo.class);
            _entityTypeMap.put("EditingPlatformInfos", SFEditingPlatformInfo.class);
            _entityTypeMap.put("FolderInvite", SFFolderInvite.class);
            _entityTypeMap.put("FolderInvites", SFFolderInvite.class);
            _entityTypeMap.put("IrmClassification", SFIrmClassification.class);
            _entityTypeMap.put("IrmClassifications", SFIrmClassification.class);
            _entityTypeMap.put("IrmPrimaryAccessRightParams", SFIrmPrimaryAccessRightParams.class);
            _entityTypeMap.put("IrmPrimaryAccessRightParamss", SFIrmPrimaryAccessRightParams.class);
            _entityTypeMap.put("NotifyUsersParams", SFNotifyUsersParams.class);
            _entityTypeMap.put("NotifyUsersParamss", SFNotifyUsersParams.class);
            _entityTypeMap.put("PasswordPolicy", SFPasswordPolicy.class);
            _entityTypeMap.put("Policy", SFPolicy.class);
            _entityTypeMap.put("Policies", SFPolicy.class);
            _entityTypeMap.put("StoragePolicy", SFStoragePolicy.class);
            _entityTypeMap.put("StoragePolicys", SFStoragePolicy.class);
            _entityTypeMap.put("FileAndFolderPolicy", SFFileAndFolderPolicy.class);
            _entityTypeMap.put("FileAndFolderPolicys", SFFileAndFolderPolicy.class);
            _entityTypeMap.put("UserAccessPolicy", SFUserAccessPolicy.class);
            _entityTypeMap.put("UserAccessPolicys", SFUserAccessPolicy.class);
            _entityTypeMap.put("RemoteUpload", SFRemoteUpload.class);
            _entityTypeMap.put("RemoteUploads", SFRemoteUpload.class);
            _entityTypeMap.put("SalesTaxQuote", SFSalesTaxQuote.class);
            _entityTypeMap.put("SalesTaxQuotes", SFSalesTaxQuote.class);
            _entityTypeMap.put("SearchIndexAllocationDetails", SFSearchIndexAllocationDetails.class);
            _entityTypeMap.put("SearchIndexAllocationDetailss", SFSearchIndexAllocationDetails.class);
            _entityTypeMap.put("SearchProvider", SFSearchProvider.class);
            _entityTypeMap.put("SearchProviders", SFSearchProvider.class);
            _entityTypeMap.put("SecurityQuestion", SFSecurityQuestion.class);
            _entityTypeMap.put("SecurityQuestions", SFSecurityQuestion.class);
            _entityTypeMap.put("Service", SFService.class);
            _entityTypeMap.put("Services", SFService.class);
            _entityTypeMap.put("ServicesCollection", SFServicesCollection.class);
            _entityTypeMap.put("ServicesCollections", SFServicesCollection.class);
            _entityTypeMap.put("AccountItemStatusProvider", SFAccountItemStatusProvider.class);
            _entityTypeMap.put("AccountItemStatusProviders", SFAccountItemStatusProvider.class);
            _entityTypeMap.put("ItemStatusProvider", SFItemStatusProvider.class);
            _entityTypeMap.put("ItemStatusProviders", SFItemStatusProvider.class);
            _entityTypeMap.put("ItemStatus", SFItemStatus.class);
            _entityTypeMap.put("ItemStatuses", SFItemStatus.class);
            _entityTypeMap.put("SFObjectItemStatus", SFSFObjectItemStatus.class);
            _entityTypeMap.put("SFObjectItemStatuses", SFSFObjectItemStatus.class);
            _entityTypeMap.put("ShareAccessRight", SFShareAccessRight.class);
            _entityTypeMap.put("ShareAccessRights", SFShareAccessRight.class);
            _entityTypeMap.put("StorageSettings", SFStorageSettings.class);
            _entityTypeMap.put("StorageSettingss", SFStorageSettings.class);
            _entityTypeMap.put("AppliedPlanAddOns", SFAppliedPlanAddOns.class);
            _entityTypeMap.put("AppliedPlanAddOnss", SFAppliedPlanAddOns.class);
            _entityTypeMap.put("Billing", SFBilling.class);
            _entityTypeMap.put("Billings", SFBilling.class);
            _entityTypeMap.put("AccessControlBulkResult", SFAccessControlBulkResult.class);
            _entityTypeMap.put("AccessControlBulkResults", SFAccessControlBulkResult.class);
            _entityTypeMap.put("AccessControlFailedEntry", SFAccessControlFailedEntry.class);
            _entityTypeMap.put("AccessControlFailedEntrys", SFAccessControlFailedEntry.class);
            _entityTypeMap.put("ItemDlpInfo", SFItemDlpInfo.class);
            _entityTypeMap.put("ItemDlpInfos", SFItemDlpInfo.class);
            _entityTypeMap.put("DlpPolicy", SFDlpPolicy.class);
            _entityTypeMap.put("DlpPolicies", SFDlpPolicy.class);
            _entityTypeMap.put("ShareItemHistory", SFShareItemHistory.class);
            _entityTypeMap.put("ShareItemHistorys", SFShareItemHistory.class);
            _entityTypeMap.put("InboxMetadata", SFInboxMetadata.class);
            _entityTypeMap.put("InboxMetadatas", SFInboxMetadata.class);
            _entityTypeMap.put("FolderTemplate", SFFolderTemplate.class);
            _entityTypeMap.put("FolderTemplates", SFFolderTemplate.class);
            _entityTypeMap.put("FolderTemplateItem", SFFolderTemplateItem.class);
            _entityTypeMap.put("FolderTemplateItems", SFFolderTemplateItem.class);
            _entityTypeMap.put("ShareSettings", SFShareSettings.class);
            _entityTypeMap.put("ShareSettingss", SFShareSettings.class);
            _entityTypeMap.put("ToolSurvey", SFToolSurvey.class);
            _entityTypeMap.put("ToolSurveys", SFToolSurvey.class);
            _entityTypeMap.put("TwoFactorAuthApp", SFTwoFactorAuthApp.class);
            _entityTypeMap.put("TwoFactorAuthApps", SFTwoFactorAuthApp.class);
            _entityTypeMap.put("UserAccessSettings", SFUserAccessSettings.class);
            _entityTypeMap.put("UserAccessSettingss", SFUserAccessSettings.class);
            _entityTypeMap.put("UserConfirmRequirement", SFUserConfirmRequirement.class);
            _entityTypeMap.put("UserConfirmRequirements", SFUserConfirmRequirement.class);
            _entityTypeMap.put("UserPolicy", SFUserPolicy.class);
            _entityTypeMap.put("UserPolicies", SFUserPolicy.class);
            _entityTypeMap.put("UserUsage", SFUserUsage.class);
            _entityTypeMap.put("UserUsages", SFUserUsage.class);
            _entityTypeMap.put("DiskSpace", SFDiskSpace.class);
            _entityTypeMap.put("DiskSpaces", SFDiskSpace.class);
            _entityTypeMap.put("ReportRecord", SFReportRecord.class);
            _entityTypeMap.put("ReportRecords", SFReportRecord.class);
            _entityTypeMap.put("BillingAddOn", SFBillingAddOn.class);
            _entityTypeMap.put("BillingAddOns", SFBillingAddOn.class);
            _entityTypeMap.put("EnterpriseOrder", SFEnterpriseOrder.class);
            _entityTypeMap.put("EnterpriseOrders", SFEnterpriseOrder.class);
            _entityTypeMap.put("EnterpriseReseller", SFEnterpriseReseller.class);
            _entityTypeMap.put("EnterpriseResellers", SFEnterpriseReseller.class);
            _entityTypeMap.put("BillingInfo", SFBillingInfo.class);
            _entityTypeMap.put("BillingInfos", SFBillingInfo.class);
            _entityTypeMap.put("UploadRequestParams", SFUploadRequestParams.class);
            _entityTypeMap.put("UploadRequestParamss", SFUploadRequestParams.class);
            _entityTypeMap.put("RemoteUploadRequestParams", SFRemoteUploadRequestParams.class);
            _entityTypeMap.put("RemoteUploadRequestParamss", SFRemoteUploadRequestParams.class);
            _entityTypeMap.put("EncryptedEmail", SFEncryptedEmail.class);
            _entityTypeMap.put("EncryptedEmails", SFEncryptedEmail.class);
            _entityTypeMap.put("EncryptedEmailParams", SFEncryptedEmailParams.class);
            _entityTypeMap.put("EncryptedEmailParamss", SFEncryptedEmailParams.class);
            _entityTypeMap.put("EncryptedEmailReplyParams", SFEncryptedEmailReplyParams.class);
            _entityTypeMap.put("EncryptedEmailReplyParamss", SFEncryptedEmailReplyParams.class);
            _entityTypeMap.put("EncryptedEmailCreateParams", SFEncryptedEmailCreateParams.class);
            _entityTypeMap.put("EncryptedEmailCreateParamss", SFEncryptedEmailCreateParams.class);
            _entityTypeMap.put("EncryptedEmailSendParams", SFEncryptedEmailSendParams.class);
            _entityTypeMap.put("EncryptedEmailSendParamss", SFEncryptedEmailSendParams.class);
            _entityTypeMap.put("EncryptedEmailRecipient", SFEncryptedEmailRecipient.class);
            _entityTypeMap.put("EncryptedEmailRecipients", SFEncryptedEmailRecipient.class);
            _entityTypeMap.put("ESignature", SFESignature.class);
            _entityTypeMap.put("ESignatures", SFESignature.class);
            _entityTypeMap.put("MarketAnalytics", SFMarketAnalytics.class);
            _entityTypeMap.put("MarketAnalyticss", SFMarketAnalytics.class);
            _entityTypeMap.put("OAuthCode", SFOAuthCode.class);
            _entityTypeMap.put("OAuthCodes", SFOAuthCode.class);
            _entityTypeMap.put("OAuthAuthorizationCode", SFOAuthAuthorizationCode.class);
            _entityTypeMap.put("OAuthAuthorizationCodes", SFOAuthAuthorizationCode.class);
            _entityTypeMap.put("FileLock", SFFileLock.class);
            _entityTypeMap.put("FileLocks", SFFileLock.class);
            _entityTypeMap.put("PlanAddon", SFPlanAddon.class);
            _entityTypeMap.put("PlanAddons", SFPlanAddon.class);
            _entityTypeMap.put("InAppPurchase", SFInAppPurchase.class);
            _entityTypeMap.put("InAppPurchases", SFInAppPurchase.class);
            _entityTypeMap.put("TrialPeriod", SFTrialPeriod.class);
            _entityTypeMap.put("TrialPeriods", SFTrialPeriod.class);
            _entityTypeMap.put("PlanAddonUser", SFPlanAddonUser.class);
            _entityTypeMap.put("PlanAddonUsers", SFPlanAddonUser.class);
            _entityTypeMap.put("OAuthClient", SFOAuthClient.class);
            _entityTypeMap.put("OAuthClients", SFOAuthClient.class);
            _entityTypeMap.put("ClientUpgradeWeb", SFClientUpgradeWeb.class);
            _entityTypeMap.put("ClientUpgradeWebs", SFClientUpgradeWeb.class);
            _entityTypeMap.put("PowerTools", SFPowerTools.class);
            _entityTypeMap.put("PowerToolss", SFPowerTools.class);
            _entityTypeMap.put("ConnectorGroupZone", SFConnectorGroupZone.class);
            _entityTypeMap.put("ConnectorGroupZones", SFConnectorGroupZone.class);
            _entityTypeMap.put("ConnectorGroupAccessControl", SFConnectorGroupAccessControl.class);
            _entityTypeMap.put("ConnectorGroupAccessControls", SFConnectorGroupAccessControl.class);
            _entityTypeMap.put("Report", SFReport.class);
            _entityTypeMap.put("Reports", SFReport.class);
            _entityTypeMap.put("Reseller", SFReseller.class);
            _entityTypeMap.put("Resellers", SFReseller.class);
            _entityTypeMap.put("PreviewPlatformInfo", SFPreviewPlatformInfo.class);
            _entityTypeMap.put("PreviewPlatformInfos", SFPreviewPlatformInfo.class);
            _entityTypeMap.put("ShareResendParams", SFShareResendParams.class);
            _entityTypeMap.put("Support", SFSupport.class);
            _entityTypeMap.put("Supports", SFSupport.class);
            _entityTypeMap.put("SupportMethod", SFSupportMethod.class);
            _entityTypeMap.put("SupportMethods", SFSupportMethod.class);
            _entityTypeMap.put("PhoneSupport", SFPhoneSupport.class);
            _entityTypeMap.put("PhoneSupports", SFPhoneSupport.class);
            _entityTypeMap.put("EmailSupport", SFEmailSupport.class);
            _entityTypeMap.put("EmailSupports", SFEmailSupport.class);
            _entityTypeMap.put("DailyAvailability", SFDailyAvailability.class);
            _entityTypeMap.put("DailyAvailabilitys", SFDailyAvailability.class);
            _entityTypeMap.put("ToolInformation", SFToolInformation.class);
            _entityTypeMap.put("ToolInformations", SFToolInformation.class);
            _entityTypeMap.put("AccessControl", SFAccessControl.class);
            _entityTypeMap.put("AccessControls", SFAccessControl.class);
            _entityTypeMap.put("AccessControlDomains", SFAccessControlDomains.class);
            _entityTypeMap.put("Account", SFAccount.class);
            _entityTypeMap.put("Accounts", SFAccount.class);
            _entityTypeMap.put("FreeTrialAccount", SFFreeTrialAccount.class);
            _entityTypeMap.put("FreeTrialAccounts", SFFreeTrialAccount.class);
            _entityTypeMap.put("AccountPreferences", SFAccountPreferences.class);
            _entityTypeMap.put("AsyncOperation", SFAsyncOperation.class);
            _entityTypeMap.put("AsyncOperations", SFAsyncOperation.class);
            _entityTypeMap.put("Capability", SFCapability.class);
            _entityTypeMap.put("Capabilities", SFCapability.class);
            _entityTypeMap.put("Device", SFDevice.class);
            _entityTypeMap.put("Devices", SFDevice.class);
            _entityTypeMap.put("DeviceUser", SFDeviceUser.class);
            _entityTypeMap.put("DeviceUsers", SFDeviceUser.class);
            _entityTypeMap.put("DeviceUserWipe", SFDeviceUserWipe.class);
            _entityTypeMap.put("DeviceUserWipes", SFDeviceUserWipe.class);
            _entityTypeMap.put("DeviceStatus", SFDeviceStatus.class);
            _entityTypeMap.put("DeviceStatuss", SFDeviceStatus.class);
            _entityTypeMap.put("DeviceWipeReport", SFDeviceWipeReport.class);
            _entityTypeMap.put("DeviceWipeReports", SFDeviceWipeReport.class);
            _entityTypeMap.put("DeviceLogEntry", SFDeviceLogEntry.class);
            _entityTypeMap.put("DeviceLogEntrys", SFDeviceLogEntry.class);
            _entityTypeMap.put("DownloadSpecification", SFDownloadSpecification.class);
            _entityTypeMap.put("DownloadSpecifications", SFDownloadSpecification.class);
            _entityTypeMap.put("EnsSubscriberConfiguration", SFEnsSubscriberConfiguration.class);
            _entityTypeMap.put("EnsSubscriberConfigurations", SFEnsSubscriberConfiguration.class);
            _entityTypeMap.put("EnsSubscriptionRequest", SFEnsSubscriptionRequest.class);
            _entityTypeMap.put("EnsSubscriptionRequests", SFEnsSubscriptionRequest.class);
            _entityTypeMap.put("EnsSubscriptionToken", SFEnsSubscriptionToken.class);
            _entityTypeMap.put("EnsSubscriptionTokens", SFEnsSubscriptionToken.class);
            _entityTypeMap.put("FindSubdomainParams", SFFindSubdomainParams.class);
            _entityTypeMap.put("FindSubdomainResult", SFFindSubdomainResult.class);
            _entityTypeMap.put("FindSubdomainResults", SFFindSubdomainResult.class);
            _entityTypeMap.put("GenericConfig", SFGenericConfig.class);
            _entityTypeMap.put("GenericConfigs", SFGenericConfig.class);
            _entityTypeMap.put("FavoriteFolder", SFFavoriteFolder.class);
            _entityTypeMap.put("FavoriteFolders", SFFavoriteFolder.class);
            _entityTypeMap.put("Industry", SFIndustry.class);
            _entityTypeMap.put("Industrys", SFIndustry.class);
            _entityTypeMap.put("Item", SFItem.class);
            _entityTypeMap.put("Items", SFItem.class);
            _entityTypeMap.put("File", SFFile.class);
            _entityTypeMap.put("Files", SFFile.class);
            _entityTypeMap.put("Folder", SFFolder.class);
            _entityTypeMap.put("Folders", SFFolder.class);
            _entityTypeMap.put("ConnectorGroup", SFConnectorGroup.class);
            _entityTypeMap.put("ConnectorGroups", SFConnectorGroup.class);
            _entityTypeMap.put("SymbolicLink", SFSymbolicLink.class);
            _entityTypeMap.put("SymbolicLinks", SFSymbolicLink.class);
            _entityTypeMap.put("Link", SFLink.class);
            _entityTypeMap.put("Links", SFLink.class);
            _entityTypeMap.put("Note", SFNote.class);
            _entityTypeMap.put("Notes", SFNote.class);
            _entityTypeMap.put("ItemInfo", SFItemInfo.class);
            _entityTypeMap.put("ItemInfos", SFItemInfo.class);
            _entityTypeMap.put("ItemProtocolLink", SFItemProtocolLink.class);
            _entityTypeMap.put("ItemProtocolLinks", SFItemProtocolLink.class);
            _entityTypeMap.put("Metadata", SFMetadata.class);
            _entityTypeMap.put("Metadatas", SFMetadata.class);
            _entityTypeMap.put("MetadataTag", SFMetadataTag.class);
            _entityTypeMap.put("MetadataTags", SFMetadataTag.class);
            _entityTypeMap.put("MobileSecuritySettings", SFMobileSecuritySettings.class);
            _entityTypeMap.put("SentNotification", SFSentNotification.class);
            _entityTypeMap.put("SentNotifications", SFSentNotification.class);
            _entityTypeMap.put("OutlookInformation", SFOutlookInformation.class);
            _entityTypeMap.put("OutlookInformations", SFOutlookInformation.class);
            _entityTypeMap.put("OutlookInformationOptionBool", SFOutlookInformationOptionBool.class);
            _entityTypeMap.put("OutlookInformationOptionBools", SFOutlookInformationOptionBool.class);
            _entityTypeMap.put("OutlookInformationOptionString", SFOutlookInformationOptionString.class);
            _entityTypeMap.put("OutlookInformationOptionStrings", SFOutlookInformationOptionString.class);
            _entityTypeMap.put("OutlookInformationOptionInt", SFOutlookInformationOptionInt.class);
            _entityTypeMap.put("OutlookInformationOptionInts", SFOutlookInformationOptionInt.class);
            _entityTypeMap.put("Principal", SFPrincipal.class);
            _entityTypeMap.put("Principals", SFPrincipal.class);
            _entityTypeMap.put("ShareFileRepresentative", SFShareFileRepresentative.class);
            _entityTypeMap.put("ShareFileRepresentatives", SFShareFileRepresentative.class);
            _entityTypeMap.put("Contact", SFContact.class);
            _entityTypeMap.put("Contacts", SFContact.class);
            _entityTypeMap.put("Group", SFGroup.class);
            _entityTypeMap.put("Groups", SFGroup.class);
            _entityTypeMap.put("User", SFUser.class);
            _entityTypeMap.put("Users", SFUser.class);
            _entityTypeMap.put("AccountUser", SFAccountUser.class);
            _entityTypeMap.put("AccountUsers", SFAccountUser.class);
            _entityTypeMap.put("Zone", SFZone.class);
            _entityTypeMap.put("Zones", SFZone.class);
            _entityTypeMap.put("ProductDefaults", SFProductDefaults.class);
            _entityTypeMap.put("Queue", SFQueue.class);
            _entityTypeMap.put("Queues", SFQueue.class);
            _entityTypeMap.put("QueueEntry", SFQueueEntry.class);
            _entityTypeMap.put("QueueEntries", SFQueueEntry.class);
            _entityTypeMap.put("Redirection", SFRedirection.class);
            _entityTypeMap.put("Redirections", SFRedirection.class);
            _entityTypeMap.put("RequireSubdomainResult", SFRequireSubdomainResult.class);
            _entityTypeMap.put("RequireSubdomainResults", SFRequireSubdomainResult.class);
            _entityTypeMap.put("RequireWebPopResult", SFRequireWebPopResult.class);
            _entityTypeMap.put("RequireWebPopResults", SFRequireWebPopResult.class);
            _entityTypeMap.put("SearchQuery", SFSearchQuery.class);
            _entityTypeMap.put("SearchQueries", SFSearchQuery.class);
            _entityTypeMap.put("Query", SFQuery.class);
            _entityTypeMap.put("Queries", SFQuery.class);
            _entityTypeMap.put("QueryPaging", SFQueryPaging.class);
            _entityTypeMap.put("QueryPagings", SFQueryPaging.class);
            _entityTypeMap.put("QuerySorting", SFQuerySorting.class);
            _entityTypeMap.put("QuerySortings", SFQuerySorting.class);
            _entityTypeMap.put("SimpleSearchQuery", SFSimpleSearchQuery.class);
            _entityTypeMap.put("SimpleSearchQueries", SFSimpleSearchQuery.class);
            _entityTypeMap.put("SimpleQuery", SFSimpleQuery.class);
            _entityTypeMap.put("SimpleQueries", SFSimpleQuery.class);
            _entityTypeMap.put("SearchResults", SFSearchResults.class);
            _entityTypeMap.put("AdvancedSearchResults", SFAdvancedSearchResults.class);
            _entityTypeMap.put("SearchResult", SFSearchResult.class);
            _entityTypeMap.put("AzureSBTopicsEndPointInfo", SFAzureSBTopicsEndPointInfo.class);
            _entityTypeMap.put("AzureSBTopicsEndPointInfos", SFAzureSBTopicsEndPointInfo.class);
            _entityTypeMap.put("AzureSBTopicsResponse", SFAzureSBTopicsResponse.class);
            _entityTypeMap.put("AzureSBTopicsResponses", SFAzureSBTopicsResponse.class);
            _entityTypeMap.put("Session", SFSession.class);
            _entityTypeMap.put("Sessions", SFSession.class);
            _entityTypeMap.put("Share", SFShare.class);
            _entityTypeMap.put("Shares", SFShare.class);
            _entityTypeMap.put("ShareAlias", SFShareAlias.class);
            _entityTypeMap.put("ShareAliases", SFShareAlias.class);
            _entityTypeMap.put("ShareRequestParams", SFShareRequestParams.class);
            _entityTypeMap.put("ShareSendParams", SFShareSendParams.class);
            _entityTypeMap.put("SSOAccountProvider", SFSSOAccountProvider.class);
            _entityTypeMap.put("SSOAccountProviders", SFSSOAccountProvider.class);
            _entityTypeMap.put("SSOInfoEntry", SFSSOInfoEntry.class);
            _entityTypeMap.put("SSOInfoEntries", SFSSOInfoEntry.class);
            _entityTypeMap.put("SSOInfo", SFSSOInfo.class);
            _entityTypeMap.put("SSOInfos", SFSSOInfo.class);
            _entityTypeMap.put("StorageCenter", SFStorageCenter.class);
            _entityTypeMap.put("StorageCenters", SFStorageCenter.class);
            _entityTypeMap.put("UploadSpecification", SFUploadSpecification.class);
            _entityTypeMap.put("UploadSpecifications", SFUploadSpecification.class);
            _entityTypeMap.put("UsagePlan", SFUsagePlan.class);
            _entityTypeMap.put("UsagePlans", SFUsagePlan.class);
            _entityTypeMap.put("UsagePlanAddOn", SFUsagePlanAddOn.class);
            _entityTypeMap.put("UsagePlanAddOns", SFUsagePlanAddOn.class);
            _entityTypeMap.put("UserConfirmationSettings", SFUserConfirmationSettings.class);
            _entityTypeMap.put("UserInfo", SFUserInfo.class);
            _entityTypeMap.put("UserInfos", SFUserInfo.class);
            _entityTypeMap.put("PlanFeatures", SFPlanFeatures.class);
            _entityTypeMap.put("UserPreferences", SFUserPreferences.class);
            _entityTypeMap.put("UserSecurity", SFUserSecurity.class);
            _entityTypeMap.put("UserSecurities", SFUserSecurity.class);
            _entityTypeMap.put("WebhookCapabilities", SFWebhookCapabilities.class);
            _entityTypeMap.put("WebhookCapabilitiess", SFWebhookCapabilities.class);
            _entityTypeMap.put("WebhookClient", SFWebhookClient.class);
            _entityTypeMap.put("WebhookClients", SFWebhookClient.class);
            _entityTypeMap.put("WebhookSignatureKeys", SFWebhookSignatureKeys.class);
            _entityTypeMap.put("WebhookSignatureKeyss", SFWebhookSignatureKeys.class);
            _entityTypeMap.put("WebhookSubscription", SFWebhookSubscription.class);
            _entityTypeMap.put("WebhookSubscriptions", SFWebhookSubscription.class);
            _entityTypeMap.put("SubscribedResourceEvent", SFSubscribedResourceEvent.class);
            _entityTypeMap.put("SubscribedResourceEvents", SFSubscribedResourceEvent.class);
            _entityTypeMap.put("SubscriptionContext", SFSubscriptionContext.class);
            _entityTypeMap.put("SubscriptionContexts", SFSubscriptionContext.class);
            _entityTypeMap.put("WebhookSupportedContext", SFWebhookSupportedContext.class);
            _entityTypeMap.put("WebhookSupportedContexts", SFWebhookSupportedContext.class);
            _entityTypeMap.put("WebhookSupportedEvents", SFWebhookSupportedEvents.class);
            _entityTypeMap.put("WebhookSupportedEventss", SFWebhookSupportedEvents.class);
            _entityTypeMap.put("CreateWorkflowParams", SFCreateWorkflowParams.class);
            _entityTypeMap.put("CreateWorkflowParamss", SFCreateWorkflowParams.class);
            _entityTypeMap.put("WorkflowParticipant", SFWorkflowParticipant.class);
            _entityTypeMap.put("WorkflowParticipants", SFWorkflowParticipant.class);
            _entityTypeMap.put("Workflow", SFWorkflow.class);
            _entityTypeMap.put("Workflows", SFWorkflow.class);
            _entityTypeMap.put("ZoneDeployment", SFZoneDeployment.class);
            _entityTypeMap.put("ZoneDeployments", SFZoneDeployment.class);
            _entityTypeMap.put("AccountZoneUsage", SFAccountZoneUsage.class);
            _entityTypeMap.put("AccountZoneUsages", SFAccountZoneUsage.class);
            _entityTypeMap.put("TenantZoneUsageReport", SFTenantZoneUsageReport.class);
            _entityTypeMap.put("TenantZoneUsageReports", SFTenantZoneUsageReport.class);
            _entityTypeMap.put("ZoneUsageBreakdown", SFZoneUsageBreakdown.class);
            _entityTypeMap.put("ZoneUsageBreakdowns", SFZoneUsageBreakdown.class);

            return _entityTypeMap;
        }
    }

    /**
     * Add additional models to the type map.
     */
    public static void addEntity(String key, Class value) {
        synchronized (mapLock) {
            _entityTypeMap.put(key, value);
        }
    }
}