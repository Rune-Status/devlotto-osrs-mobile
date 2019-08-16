package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class zzhc implements Callable<byte[]> {
    private final /* synthetic */ zzgp zzape;
    private final /* synthetic */ String zzapg;
    private final /* synthetic */ zzex zzaph;

    zzhc(zzgp zzgp, zzex zzex, String str) {
        this.zzape = zzgp;
        this.zzaph = zzex;
        this.zzapg = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzape.zzalo.zzlj();
        return this.zzape.zzalo.zza(this.zzaph, this.zzapg);
    }
}
