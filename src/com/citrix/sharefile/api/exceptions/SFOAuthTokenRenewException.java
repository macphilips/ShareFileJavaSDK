package com.citrix.sharefile.api.exceptions;


@SuppressWarnings("serial")
public class SFOAuthTokenRenewException extends SFSDKException {
    public SFOAuthTokenRenewException(String reason) {
        super(reason);
    }

    public SFOAuthTokenRenewException(Throwable e) {
        super(e);
    }
}