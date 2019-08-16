package com.google.android.gms.internal.measurement;

final class zziw implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzka zzapi;
    private final /* synthetic */ zzik zzaqv;
    private final /* synthetic */ boolean zzaqy;

    zziw(zzik zzik, boolean z, zzka zzka, zzeb zzeb) {
        this.zzaqv = zzik;
        this.zzaqy = z;
        this.zzapi = zzka;
        this.zzapd = zzeb;
    }

    public final void run() {
        zzfa zzd = this.zzaqv.zzaqp;
        if (zzd == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to set user attribute");
            return;
        }
        this.zzaqv.zza(zzd, this.zzaqy ? null : this.zzapi, this.zzapd);
        this.zzaqv.zzcu();
    }
}
