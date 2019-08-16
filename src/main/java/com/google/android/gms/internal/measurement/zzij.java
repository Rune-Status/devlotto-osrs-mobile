package com.google.android.gms.internal.measurement;

final class zzij implements Runnable {
    private final /* synthetic */ zzih zzaqm;
    private final /* synthetic */ zzig zzaqn;

    zzij(zzih zzih, zzig zzig) {
        this.zzaqm = zzih;
        this.zzaqn = zzig;
    }

    public final void run() {
        this.zzaqm.zza(this.zzaqn);
        this.zzaqm.zzaqd = null;
        this.zzaqm.zzga().zzb(null);
    }
}
