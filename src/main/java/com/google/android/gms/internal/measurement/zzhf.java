package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

final class zzhf implements Callable<List<zzkc>> {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;

    zzhf(zzgp zzgp, zzeb zzeb) {
        this.zzape = zzgp;
        this.zzapd = zzeb;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzape.zzalo.zzlj();
        return this.zzape.zzalo.zzjh().zzbe(this.zzapd.packageName);
    }
}
