package com.citrix.sharefile.api.enumerations;

import com.google.gson.annotations.SerializedName;

public class SFSafeEnum<T extends Enum> {
    private T mEnum;

    @SerializedName("value")
    private String originalString;

    public SFSafeEnum(T e) {
        setValue(e.toString(), e);
    }

    public SFSafeEnum() {

    }

    public void setValue(String v, T e) {
        originalString = v;
        mEnum = e;
    }

    public String getOriginalString() {
        return originalString;
    }

    public T get() {
        return mEnum;
    }

    @Override
    public String toString() {
        return originalString;
    }

    public boolean equals(T target) {
        return mEnum == target;
    }
}