package com.google.android.gms.internal.measurement;

final class zzju implements Runnable {
    private final /* synthetic */ zzjy zzasm;
    private final /* synthetic */ zzjt zzasn;

    zzju(zzjt zzjt, zzjy zzjy) {
        this.zzasn = zzjt;
        this.zzasm = zzjy;
    }

    public final void run() {
        this.zzasn.zza(this.zzasm);
        this.zzasn.start();
    }
}
