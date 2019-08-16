package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class zzjx implements Callable<String> {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzjt zzasn;

    zzjx(zzjt zzjt, zzeb zzeb) {
        this.zzasn = zzjt;
        this.zzapd = zzeb;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzea zza = this.zzasn.zzgk().zzbc(this.zzapd.packageName) ? this.zzasn.zzg(this.zzapd) : this.zzasn.zzjh().zzbf(this.zzapd.packageName);
        if (zza != null) {
            return zza.getAppInstanceId();
        }
        this.zzasn.zzgi().zziy().log("App info was null when attempting to get app instance id");
        return null;
    }
}
