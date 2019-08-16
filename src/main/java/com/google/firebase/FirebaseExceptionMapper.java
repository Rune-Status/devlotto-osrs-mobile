package com.google.firebase;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

@KeepForSdk
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    public Exception getException(Status status) {
        return status.getStatusCode() == 8 ? new FirebaseException(status.zzg()) : new FirebaseApiNotAvailableException(status.zzg());
    }
}
