package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzas extends zzap {
    private final /* synthetic */ ProxyRequest zzce;

    zzas(zzar zzar, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        this.zzce = proxyRequest;
        super(googleApiClient);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(Context context, zzan zzan) throws RemoteException {
        zzan.zza(new zzat(this), this.zzce);
    }
}
