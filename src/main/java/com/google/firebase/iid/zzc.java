package com.google.firebase.iid;

import android.content.Intent;

final class zzc implements Runnable {
    private final /* synthetic */ Intent zzr;
    private final /* synthetic */ Intent zzs;
    private final /* synthetic */ zzb zzt;

    zzc(zzb zzb, Intent intent, Intent intent2) {
        this.zzt = zzb;
        this.zzr = intent;
        this.zzs = intent2;
    }

    public final void run() {
        this.zzt.zzd(this.zzr);
        this.zzt.zza(this.zzs);
    }
}
