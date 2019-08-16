package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzh implements CredentialRequestResult {
    private final Status mStatus;
    private final Credential zzal;

    public zzh(Status status, Credential credential) {
        this.mStatus = status;
        this.zzal = credential;
    }

    public static zzh zzd(Status status) {
        return new zzh(status, null);
    }

    public final Credential getCredential() {
        return this.zzal;
    }

    public final Status getStatus() {
        return this.mStatus;
    }
}
