package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

final class zzjv implements zzfo {
    private final /* synthetic */ zzjt zzasn;
    private final /* synthetic */ String zzaso;

    zzjv(zzjt zzjt, String str) {
        this.zzasn = zzjt;
        this.zzaso = str;
    }

    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzasn.zza(i, th, bArr, this.zzaso);
    }
}
