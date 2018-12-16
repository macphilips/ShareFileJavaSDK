package com.citrix.sharefile.api.utils;

import com.citrix.sharefile.api.SFConfiguration;
import com.citrix.sharefile.api.SFProvider;
import com.citrix.sharefile.api.constants.SFSdkGlobals;
import com.citrix.sharefile.api.exceptions.SFSDKException;
import com.citrix.sharefile.api.interfaces.ISFApiResultCallback;
import com.citrix.sharefile.api.interfaces.ISFQuery;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

public class Utils {
    private static final String FORMAT_GET_TOP_FOLDER = "https://%s.%s/" + SFProvider.PROVIDER_TYPE_SF + "/v3/Items(%s)";
    private static final String FORMAT_GET_DEVICES = "https://%s.%s/" + SFProvider.PROVIDER_TYPE_SF + "/v3/Devices(%s)";

    public static String getAcceptLanguageString(boolean resolveLocaleToSFApi) {
        return getDefaultLocale(resolveLocaleToSFApi).toString().replace('_', '-') + ";q=0.8,en;q=0.6";
    }

    public static String getAcceptLanguageString() {
        return getAcceptLanguageString(SFConfiguration.RESOLVE_LOCALE);
    }

    /**
     * Returns default Locale resolved to the closer supported SF-API when true is passed in.
     * Returns the default system Locale otherwise.
     */
    public static Locale getDefaultLocale(boolean resolveLocaleToSFApi) {
        return resolveLocaleToSFApi ? resolveLocale(Locale.getDefault()) : Locale.getDefault();
    }

    /**
     * Resolve the Locale associated to the closer Locale supported by the SF-API.
     *
     * @return the closer Locale supported.
     */
    public static Locale resolveLocale(Locale locale) {
        Locale.Builder localeBuilder = new Locale.Builder().setLanguage(locale.getLanguage());

        if (SFConfiguration.LOCALE_COUNTRY_SUPPORT)
            localeBuilder.setRegion(locale.getCountry());
        if (SFConfiguration.LOCALE_VARIANT_SUPPORT)
            localeBuilder.setVariant(locale.getVariant());
        if (SFConfiguration.LOCALE_SCRIPT_SUPPORT)
            localeBuilder.setScript(locale.getScript());

        return localeBuilder.build();
    }

    public static <T> void safeCallErrorListener(ISFApiResultCallback<T> mListener, SFSDKException error, ISFQuery<T> sfapiApiqueri) {
        if (mListener != null) {
            mListener.onError(error, sfapiApiqueri);
        }
    }

    public static <T> void safeCallSuccess(ISFApiResultCallback<T> listener, T object) {
        if (listener != null) {
            listener.onSuccess(object);
        }
    }

    public static String parseV3IDFromURL(String url) {
        String ret = "";

        if (url != null && url.length() > 2) {
            int startIndex = url.indexOf("/Items(");
            int endIndex = url.indexOf(")");
            if (startIndex > 0) {
                ret = url.substring(startIndex + 7, endIndex);
            }
        }

        return ret;
    }

    public static String parseV3IDFromURL(URI url) {
        if (url == null) {
            return null;
        }

        return parseV3IDFromURL(url.toString());
    }

    public static boolean isEmpty(String str) {
        boolean ret = false;

        if (str == null || str.length() == 0) {
            ret = true;
        }

        return ret;
    }

    public static boolean isEmpty(ArrayList arrayList) {
        boolean ret = false;

        if (arrayList == null || arrayList.size() == 0) {
            ret = true;
        }

        return ret;
    }

    public static boolean isConnectorGroup(String id) {
        return id.indexOf("c-") == 0;
    }

    /**
     * We need to manually construct the v3 url for the TOP folder. This function provides the helper for the apps
     * to build that url.
     */
    public static final URI getDefaultURL(final String subdomain, String hostname, final String folderID) throws URISyntaxException {
        URI uri;

        String urlSpec = String.format(FORMAT_GET_TOP_FOLDER, subdomain, SFSdkGlobals.getApiServer(hostname), folderID);

        uri = new URI(urlSpec);

        return uri;
    }

    public static final URI getDeviceURL(final String subdomain, String hostname, final String deviceID) throws URISyntaxException {
        URI uri;

        String urlSpec = String.format(FORMAT_GET_DEVICES, subdomain, SFSdkGlobals.getApiServer(hostname), deviceID);

        uri = new URI(urlSpec);

        return uri;
    }

    public static URI getURIFromString(String urlSpec) throws UnsupportedEncodingException, URISyntaxException, MalformedURLException {

        final String trimmedUrlSpec = urlSpec.trim().replace(" ", "%20");
        try {
            return new URI(trimmedUrlSpec);
        } catch (URISyntaxException e) {
            return new URI(URLEncoder.encode(trimmedUrlSpec, "UTF-8"));
        }
        //trim spaces and replace middle spaces by url-encoded spaces
        //Don't break the URI in components. On a certain ZK zones we are getting h-params during upload.
    }
}