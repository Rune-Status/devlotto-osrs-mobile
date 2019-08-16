package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzp<R extends Result> extends ApiMethodImpl<R, zzr> {
    zzp(GoogleApiClient googleApiClient) {
        super(Auth.CREDENTIALS_API, googleApiClient);
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ void doExecute(AnyClient anyClient) throws RemoteException {
        zzr zzr = (zzr) anyClient;
        zzc(zzr.getContext(), (zzw) zzr.getService());
    }

    public abstract void zzc(Context context, zzw zzw) throws DeadObjectException, RemoteException;
}
