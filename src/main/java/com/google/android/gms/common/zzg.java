package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzg extends zze {
    private static final WeakReference<byte[]> zzw = new WeakReference(null);
    private WeakReference<byte[]> zzv = zzw;

    zzg(byte[] bArr) {
        super(bArr);
    }

    /* Access modifiers changed, original: final */
    public final byte[] getBytes() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.zzv.get();
            if (bArr == null) {
                bArr = zzd();
                this.zzv = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] zzd();
}
