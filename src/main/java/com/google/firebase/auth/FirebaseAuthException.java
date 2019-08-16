package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import com.google.firebase.annotations.PublicApi;

@PublicApi
public class FirebaseAuthException extends FirebaseException {
    private final String errorCode;

    @PublicApi
    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        this.errorCode = Preconditions.checkNotEmpty(str);
    }

    @PublicApi
    @NonNull
    public String getErrorCode() {
        return this.errorCode;
    }
}
