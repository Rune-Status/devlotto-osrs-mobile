package com.google.android.gms.internal.measurement;

final class zzhb implements Runnable {
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ String zzapg;
    private final /* synthetic */ zzex zzaph;

    zzhb(zzgp zzgp, zzex zzex, String str) {
        this.zzape = zzgp;
        this.zzaph = zzex;
        this.zzapg = str;
    }

    public final void run() {
        this.zzape.zzalo.zzlj();
        this.zzape.zzalo.zzc(this.zzaph, this.zzapg);
    }
}
