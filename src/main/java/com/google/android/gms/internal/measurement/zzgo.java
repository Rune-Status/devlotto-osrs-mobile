package com.google.android.gms.internal.measurement;

final class zzgo implements Runnable {
    private final /* synthetic */ zzhl zzaoz;
    private final /* synthetic */ zzgn zzapa;

    zzgo(zzgn zzgn, zzhl zzhl) {
        this.zzapa = zzgn;
        this.zzaoz = zzhl;
    }

    public final void run() {
        this.zzapa.zza(this.zzaoz);
        this.zzapa.start();
    }
}
