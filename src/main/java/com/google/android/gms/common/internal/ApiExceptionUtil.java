package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class ApiExceptionUtil {
    @KeepForSdk
    @NonNull
    public static ApiException fromStatus(@NonNull Status status) {
        return status.hasResolution() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
