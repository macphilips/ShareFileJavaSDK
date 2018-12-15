package com.citrix.sharefile.api.https;

import com.citrix.sharefile.api.SFApiClient;
import com.citrix.sharefile.api.exceptions.SFSDKException;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class TransferRunnable extends Thread {
    protected final SFApiClient mApiClient;
    protected final IProgress mProgressListener;
    protected final SFCookieManager mCookieManager;
    //credentials for connectors
    protected final String mUsername;
    protected final String mPassword;
    protected AtomicBoolean cancelRequested = new AtomicBoolean(false);
    protected long mTotalBytesTransferredForThisFile;
    protected String mItemId;

    protected TransferRunnable(SFApiClient client, IProgress progressListener, SFCookieManager cookieManager,
                               String userName, String password) {
        mApiClient = client;
        mProgressListener = progressListener;
        mCookieManager = cookieManager;
        mUsername = userName;
        mPassword = password;
    }

    protected abstract void runInThisThread() throws SFSDKException;

    ;

    /**
     * execute Transfer in this thread overriding the cancel signal
     *
     * @param cancel
     * @return
     */
    public void runInThisThread(AtomicBoolean cancel) throws SFSDKException {
        cancelRequested = cancel;
        runInThisThread();
    }

    @Override
    public void run() {
        try {
            runInThisThread();
        } catch (SFSDKException e) {
            if (mProgressListener != null) {
                mProgressListener.onError(e, mTotalBytesTransferredForThisFile);
            }
        }
    }

    public void cancel() {
        cancelRequested.set(true);
    }


    public interface IProgress {
        public void bytesTransfered(long byteCount);

        public void onError(SFSDKException exception, long bytesTransfered);

        public void onComplete(long bytesTransfered, String itemId);
    }
}
