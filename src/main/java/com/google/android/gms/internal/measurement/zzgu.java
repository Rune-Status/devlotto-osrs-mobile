package com.google.android.gms.internal.measurement;

final class zzgu implements Runnable {
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ zzef zzapf;

    zzgu(zzgp zzgp, zzef zzef) {
        this.zzape = zzgp;
        this.zzapf = zzef;
    }

    public final void run() {
        this.zzape.zzalo.zzlj();
        this.zzape.zzalo.zze(this.zzapf);
    }
}
