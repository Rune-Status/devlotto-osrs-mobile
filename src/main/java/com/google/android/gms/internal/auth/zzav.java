package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Status;

final class zzav extends zzaj {
    private final /* synthetic */ zzau zzcg;

    zzav(zzau zzau) {
        this.zzcg = zzau;
    }

    public final void zzb(String str) {
        if (str != null) {
            this.zzcg.setResult(new zzax(str));
        } else {
            this.zzcg.setResult(zzaq.zzc(new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR)));
        }
    }
}
