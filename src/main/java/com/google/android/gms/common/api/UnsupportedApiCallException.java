package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zzar;

    @KeepForSdk
    public UnsupportedApiCallException(Feature feature) {
        this.zzar = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.zzar);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 8);
        stringBuilder.append("Missing ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
