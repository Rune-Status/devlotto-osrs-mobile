package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

final class zzgx implements Callable<List<zzef>> {
    private final /* synthetic */ String zzadn;
    private final /* synthetic */ String zzadu;
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzgp zzape;

    zzgx(zzgp zzgp, zzeb zzeb, String str, String str2) {
        this.zzape = zzgp;
        this.zzapd = zzeb;
        this.zzadn = str;
        this.zzadu = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzape.zzalo.zzlj();
        return this.zzape.zzalo.zzjh().zzc(this.zzapd.packageName, this.zzadn, this.zzadu);
    }
}
