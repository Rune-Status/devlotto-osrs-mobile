package com.google.android.gms.internal.measurement;

public abstract class zzzj {
    private static volatile boolean zzbtn;
    int zzbtk;
    private int zzbtl;
    private boolean zzbtm;

    private zzzj() {
        this.zzbtk = 100;
        this.zzbtl = Integer.MAX_VALUE;
        this.zzbtm = false;
    }

    /* synthetic */ zzzj(zzzk zzzk) {
        this();
    }

    static zzzj zza(byte[] bArr, int i, int i2, boolean z) {
        zzzl zzzl = new zzzl(bArr, i, i2);
        try {
            zzzl.zzaf(i2);
            return zzzl;
        } catch (zzzy e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zzto();
}
