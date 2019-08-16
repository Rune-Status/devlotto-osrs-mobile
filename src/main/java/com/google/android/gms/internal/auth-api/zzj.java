package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzj extends zzp<CredentialRequestResult> {
    private final /* synthetic */ CredentialRequest zzam;

    zzj(zzi zzi, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        this.zzam = credentialRequest;
        super(googleApiClient);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Result createFailedResult(Status status) {
        return zzh.zzd(status);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzc(Context context, zzw zzw) throws RemoteException {
        zzw.zzc(new zzk(this), this.zzam);
    }
}
