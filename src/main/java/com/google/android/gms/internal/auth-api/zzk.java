package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

final class zzk extends zzg {
    private final /* synthetic */ zzj zzan;

    zzk(zzj zzj) {
        this.zzan = zzj;
    }

    public final void zzc(Status status) {
        this.zzan.setResult(zzh.zzd(status));
    }

    public final void zzc(Status status, Credential credential) {
        this.zzan.setResult(new zzh(status, credential));
    }
}
