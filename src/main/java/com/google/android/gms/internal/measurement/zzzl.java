package com.google.android.gms.internal.measurement;

final class zzzl extends zzzj {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbto;
    private int zzbtp;
    private int zzbtq;
    private int zzbtr;

    private zzzl(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbtr = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbtq = this.pos;
        this.zzbto = z;
    }

    private final void zztp() {
        this.limit += this.zzbtp;
        int i = this.limit - this.zzbtq;
        if (i > this.zzbtr) {
            this.zzbtp = i - this.zzbtr;
            this.limit -= this.zzbtp;
            return;
        }
        this.zzbtp = 0;
    }

    public final int zzaf(int i) throws zzzy {
        if (i >= 0) {
            int zzto = zzto() + i;
            int i2 = this.zzbtr;
            if (zzto <= i2) {
                this.zzbtr = zzto;
                zztp();
                return i2;
            }
            throw zzzy.zzub();
        }
        throw zzzy.zzuc();
    }

    public final int zzto() {
        return this.pos - this.zzbtq;
    }
}
