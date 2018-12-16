package com.citrix.sharefile.api.constants;

public class SFSdkGlobals {
    public static final String VERSION_FOR_QUERY_URL = "v3";
    public static final String VERSION = "V3.1.0";

    public static final String GLOBAL_SUBDOMAIN = "g";
    public static final String DEFAULT_HOST = ".sharefile.com";
    public static final String DEFAULT_HOST_EU = ".sharefile.eu";
    public static final int INTERNAL_HTTP_ERROR = 599; //last http error code i s 505. Lets start our internal errors by leaving some difference.
    public static final int HTTP_ERROR_CANCELED = 600;
    public static final int INTERNAL_HTTP_ERROR_NETWORK_CONNECTION_PROBLEM = 601;
    private static final String API_SERVER_TEST = "sharefiletest.com";
    private static final String API_SERVER_DEV = "sf-apidev.com";
    private static final String API_SERVER_PRODUCTION = "sf-api.com";
    private static final String API_SERVER_PRODUCTION_EU = "sf-api.eu";
    private static final String API_SERVER_STAGING = "sf-apistaging.com";
    private static final String[] mApiServer = {API_SERVER_PRODUCTION, API_SERVER_DEV, API_SERVER_TEST, API_SERVER_PRODUCTION_EU, API_SERVER_STAGING};
    private static final int HOST_INDEX_PRODUCTION = 0;
    private static final int HOST_INDEX_DEV = 1;
    private static final int HOST_INDEX_TEST = 2;
    private static final int HOST_INDEX_PRODUCTION_EU = 3;
    private static final int HOST_INDEX_STAGING = 4;

    public static final int getHostIndex(final String hostName) {
        int index = HOST_INDEX_PRODUCTION;

        if (hostName.endsWith("dev.com")) {
            index = HOST_INDEX_DEV;
        } else if (hostName.endsWith("test.com")) {
            index = HOST_INDEX_TEST;
        } else if (hostName.endsWith(".eu")) {
            index = HOST_INDEX_PRODUCTION_EU;
        } else if (hostName.endsWith("staging.com")) {
            index = HOST_INDEX_STAGING;
        }

        return index;
    }

    public static final String getApiServer(String hostname) {
        return mApiServer[getHostIndex(hostname)];
    }
}