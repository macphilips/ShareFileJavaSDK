package com.citrix.sharefile.api.interfaces;

public interface ILog {
    int v(String tag, String msg);

    int v(String tag, String msg, Throwable tr);

    int d(String tag, String msg);

    int d(String tag, String msg, Throwable tr);

    int i(String tag, String msg);

    int i(String tag, String msg, Throwable tr);

    int w(String tag, String msg);

    int w(String tag, String msg, Throwable tr);

    int w(String tag, Throwable tr);

    @Deprecated
    int e(String tag, String msg);

    int e(String tag, Throwable tr);

    int e(String tag, String msg, Throwable tr);
}
