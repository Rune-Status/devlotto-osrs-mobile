package com.google.android.gms.internal.measurement;

final /* synthetic */ class zzxa implements zzxg {
    private final String zzbps;
    private final boolean zzbpt = false;

    zzxa(String str, boolean z) {
        this.zzbps = str;
    }

    public final Object zzsq() {
        return Boolean.valueOf(zzws.zza(zzwx.zzqx.getContentResolver(), this.zzbps, this.zzbpt));
    }
}
