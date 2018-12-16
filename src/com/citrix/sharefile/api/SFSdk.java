package com.citrix.sharefile.api;

import com.citrix.sharefile.api.async.SFAsyncTaskFactory;
import com.citrix.sharefile.api.exceptions.SFInvalidStateException;
import com.citrix.sharefile.api.interfaces.*;
import com.citrix.sharefile.api.log.Logger;
import com.citrix.sharefile.api.utils.Utils;

public class SFSdk {
    private static String mClientId;
    private static String mClientSecret;
    private static String mRedirectUrl;
    private static ISFReAuthHandler mReAuthHandler;
    private static IOAuthTokenChangeHandler mOAuthTokenChangeHandler;
    private static ISFAsyncTaskFactory mAsyncTaskFactory = new SFAsyncTaskFactory();

    public static boolean isInitialized() {
        if (Utils.isEmpty(mClientId) || Utils.isEmpty(mClientSecret) || Utils.isEmpty(mRedirectUrl)) {
            return false;
        }

        return true;
    }

    public static void validateInit() throws SFInvalidStateException {
        if (!SFSdk.isInitialized()) {
            throw new SFInvalidStateException("SDK not initilized.Call SFSdk.init()");
        }
    }

    public static void init(String clientId, String clientSecret, String redirectUrl) {
        mClientId = clientId;
        mClientSecret = clientSecret;
        mRedirectUrl = redirectUrl;
    }

    public static void init(String clientId, String clientSecret, String redirectUrl,
                            ISFReAuthHandler reAuthHandler,
                            IOAuthTokenChangeHandler authTokenChangeHandler) {
        mClientId = clientId;
        mClientSecret = clientSecret;
        mRedirectUrl = redirectUrl;
        mReAuthHandler = reAuthHandler;
        mOAuthTokenChangeHandler = authTokenChangeHandler;
    }

    public static String getClientId() {
        return mClientId;
    }

    public static String getClientSecret() {
        return mClientSecret;
    }

    public static String getRedirectUrl() {
        return mRedirectUrl;
    }

    public static ISFReAuthHandler getReAuthHandler() {
        return mReAuthHandler;
    }

    public static IOAuthTokenChangeHandler getOAuthTokenChangeHandler() {
        return mOAuthTokenChangeHandler;
    }

    public static void setLogger(ILog logger) {
        Logger.set(logger);
    }

    public static void setAsyncTaskFactory(ISFAsyncTaskFactory asyncTaskFactory) {
        mAsyncTaskFactory = asyncTaskFactory;
    }

    public static ISFAsyncTask createAsyncTask() {
        return mAsyncTaskFactory.createNewTask();
    }

    public static void setConnectionMgr(ISFConnectionManager newConnMgr) {
        SFConnectionManager.setInstance(newConnMgr);
    }
}