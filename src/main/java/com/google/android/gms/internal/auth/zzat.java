package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;

final class zzat extends zzaj {
    private final /* synthetic */ zzas zzcf;

    zzat(zzas zzas) {
        this.zzcf = zzas;
    }

    public final void zza(ProxyResponse proxyResponse) {
        this.zzcf.setResult(new zzaw(proxyResponse));
    }
}
