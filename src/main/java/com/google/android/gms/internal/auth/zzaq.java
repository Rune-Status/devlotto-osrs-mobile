package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzaq extends ApiMethodImpl<SpatulaHeaderResult, zzak> {
    public zzaq(GoogleApiClient googleApiClient) {
        super(AuthProxy.API, googleApiClient);
    }

    protected static SpatulaHeaderResult zzc(Status status) {
        return new zzax(status);
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ Result createFailedResult(Status status) {
        return zzc(status);
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ void doExecute(AnyClient anyClient) throws RemoteException {
        zzak zzak = (zzak) anyClient;
        zza(zzak.getContext(), (zzan) zzak.getService());
    }

    public abstract void zza(Context context, zzan zzan) throws RemoteException;
}
