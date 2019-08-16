package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

final class zzi extends ApiMethodImpl<Result, zzr> {
    private final /* synthetic */ boolean zzae;

    zzi(zzh zzh, Api api, GoogleApiClient googleApiClient, boolean z) {
        this.zzae = z;
        super(api, googleApiClient);
    }

    /* Access modifiers changed, original: protected|final */
    public final Result createFailedResult(Status status) {
        return new zzp(status);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) throws RemoteException {
        ((zzc) ((zzr) anyClient).getService()).zzb(this.zzae);
        setResult(new zzp(Status.RESULT_SUCCESS));
    }
}
