package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzl extends zzp<Status> {
    private final /* synthetic */ Credential zzao;

    zzl(zzi zzi, GoogleApiClient googleApiClient, Credential credential) {
        this.zzao = credential;
        super(googleApiClient);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzc(Context context, zzw zzw) throws RemoteException {
        zzw.zzc(new zzo(this), new zzy(this.zzao));
    }
}
