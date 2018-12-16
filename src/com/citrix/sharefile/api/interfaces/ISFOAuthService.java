package com.citrix.sharefile.api.interfaces;

import com.citrix.sharefile.api.authentication.SFOAuth2Token;
import com.citrix.sharefile.api.authentication.SFWebAuthCode;
import com.citrix.sharefile.api.exceptions.*;

import java.io.IOException;

public interface ISFOAuthService {
    public SFOAuth2Token authenticate(String subDomain, String apiControlPlane, String username, String password)
            throws SFNotAuthorizedException, SFJsonException, SFInvalidStateException;

    public SFOAuth2Token authenticate(String subDomain, String apiControlPlane, String samlAssertion)
            throws SFNotAuthorizedException, SFJsonException, SFInvalidStateException;

    public SFOAuth2Token refreshOAuthToken(SFOAuth2Token oldToken)
            throws IOException, SFOAuthTokenRenewException, SFInvalidStateException;


    public void authenticateAsync(String subDomain, String apiControlPlane, String username, String password, IOAuthTokenCallback callback);

    public void authenticateAsync(String subDomain, String apiControlPlane, String samlAssertion, IOAuthTokenCallback callback);

    public void authenticateAsync(String subDomain, String apiControlPlane, String clientId, String clientSecret, String samlAssertion, IOAuthTokenCallback callback);

    public void refreshOAuthTokenAsync(SFOAuth2Token oldToken, IOAuthTokenCallback callback);

    public void refreshOAuthTokenAsync(SFOAuth2Token oldToken, String clientId, String clientSecret, IOAuthTokenCallback callback);

    /**
     * The clientID Secret is optional. Yf you don't pass these, the function will try to pick it up from
     * those which you set during the SFSdk.init()
     */
    public SFOAuth2Token getOAuthToken(SFWebAuthCode webAuthCode, String... clientIdSecret) throws SFServerException, SFOtherException;

    public SFOAuth2Token refreshOAuthToken(SFOAuth2Token oldToken, String clientId, String clientSecret) throws SFOAuthTokenRenewException;
}