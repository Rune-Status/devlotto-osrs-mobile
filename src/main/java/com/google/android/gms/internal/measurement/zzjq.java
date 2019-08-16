package com.google.android.gms.internal.measurement;

final class zzjq extends zzep {
    private final /* synthetic */ zzjt zzark;
    private final /* synthetic */ zzjp zzarq;

    zzjq(zzjp zzjp, zzhk zzhk, zzjt zzjt) {
        this.zzarq = zzjp;
        this.zzark = zzjt;
        super(zzhk);
    }

    public final void run() {
        this.zzarq.cancel();
        this.zzarq.zzgi().zzjc().log("Starting upload from DelayedRunnable");
        this.zzark.zzle();
    }
}
