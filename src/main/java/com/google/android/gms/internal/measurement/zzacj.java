package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzacj {
    protected volatile int zzbzo = -1;

    public static final <T extends zzacj> T zza(T t, byte[] bArr) throws zzaci {
        return zzb(t, bArr, 0, bArr.length);
    }

    public static final void zza(zzacj zzacj, byte[] bArr, int i, int i2) {
        try {
            zzacb zzb = zzacb.zzb(bArr, 0, i2);
            zzacj.zza(zzb);
            zzb.zzvt();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    private static final <T extends zzacj> T zzb(T t, byte[] bArr, int i, int i2) throws zzaci {
        try {
            zzaca zza = zzaca.zza(bArr, 0, i2);
            t.zzb(zza);
            zza.zzaj(0);
            return t;
        } catch (zzaci e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public String toString() {
        return zzack.zzc(this);
    }

    /* Access modifiers changed, original: protected */
    public int zza() {
        return 0;
    }

    public void zza(zzacb zzacb) throws IOException {
    }

    public abstract zzacj zzb(zzaca zzaca) throws IOException;

    /* renamed from: zzvu */
    public zzacj clone() throws CloneNotSupportedException {
        return (zzacj) super.clone();
    }

    public final int zzwa() {
        if (this.zzbzo < 0) {
            zzwb();
        }
        return this.zzbzo;
    }

    public final int zzwb() {
        int zza = zza();
        this.zzbzo = zza;
        return zza;
    }
}
