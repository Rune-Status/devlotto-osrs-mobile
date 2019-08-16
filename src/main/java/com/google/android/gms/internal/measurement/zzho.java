package com.google.android.gms.internal.measurement;

final class zzho implements Runnable {
    private final /* synthetic */ String val$name;
    private final /* synthetic */ String zzadn;
    private final /* synthetic */ zzhm zzaps;
    private final /* synthetic */ Object zzapt;
    private final /* synthetic */ long zzapu;

    zzho(zzhm zzhm, String str, String str2, Object obj, long j) {
        this.zzaps = zzhm;
        this.zzadn = str;
        this.val$name = str2;
        this.zzapt = obj;
        this.zzapu = j;
    }

    public final void run() {
        this.zzaps.zza(this.zzadn, this.val$name, this.zzapt, this.zzapu);
    }
}
