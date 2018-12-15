package com.citrix.sharefile.api.async;

import com.citrix.sharefile.api.SFSDKDefaultAccessScope;
import com.citrix.sharefile.api.interfaces.ISFAsyncHelper;
import com.citrix.sharefile.api.interfaces.ISFAsyncTask;

@SFSDKDefaultAccessScope
class SFDefaultAsyncTask implements ISFAsyncTask, Runnable {
    private ISFAsyncHelper mAsyncHelper;

    @Override
    public void start(ISFAsyncHelper asyncHelper) {
        mAsyncHelper = asyncHelper;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        mAsyncHelper.execute();
        mAsyncHelper.onPostExecute();
    }
}