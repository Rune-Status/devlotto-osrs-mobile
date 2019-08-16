package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkw extends zzacd<zzkw> {
    private static volatile zzkw[] zzawp;
    private Integer zzaux;
    private long[] zzawq;

    public zzkw() {
        this.zzaux = null;
        this.zzawq = zzacm.zzbzt;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkw[] zzmb() {
        if (zzawp == null) {
            synchronized (zzach.zzbzn) {
                if (zzawp == null) {
                    zzawp = new zzkw[0];
                }
            }
        }
        return zzawp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkw)) {
            return false;
        }
        zzkw zzkw = (zzkw) obj;
        if (this.zzaux == null) {
            if (zzkw.zzaux != null) {
                return false;
            }
        } else if (!this.zzaux.equals(zzkw.zzaux)) {
            return false;
        }
        return !zzach.equals(this.zzawq, zzkw.zzawq) ? false : (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkw.zzbzd == null || zzkw.zzbzd.isEmpty() : this.zzbzd.equals(zzkw.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = this.zzaux == null ? 0 : this.zzaux.hashCode();
        int hashCode3 = zzach.hashCode(this.zzawq);
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((hashCode2 + ((hashCode + 527) * 31)) * 31) + hashCode3) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int i = 0;
        int zza = super.zza();
        if (this.zzaux != null) {
            zza += zzacb.zzf(1, this.zzaux.intValue());
        }
        if (this.zzawq == null || this.zzawq.length <= 0) {
            return zza;
        }
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 >= this.zzawq.length) {
                return (zza + i2) + (this.zzawq.length * 1);
            }
            i2 += zzacb.zzat(this.zzawq[i3]);
            i = i3 + 1;
        }
    }

    public final void zza(zzacb zzacb) throws IOException {
        if (this.zzaux != null) {
            zzacb.zze(1, this.zzaux.intValue());
        }
        if (this.zzawq != null && this.zzawq.length > 0) {
            for (long zzb : this.zzawq) {
                zzacb.zzb(2, zzb);
            }
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        while (true) {
            int zzvl = zzaca.zzvl();
            int zzb;
            if (zzvl == 0) {
                break;
            } else if (zzvl == 8) {
                this.zzaux = Integer.valueOf(zzaca.zzvn());
            } else if (zzvl == 16) {
                zzb = zzacm.zzb(zzaca, 16);
                zzvl = this.zzawq == null ? 0 : this.zzawq.length;
                long[] jArr = new long[(zzb + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzawq, 0, jArr, 0, zzvl);
                }
                while (zzvl < jArr.length - 1) {
                    jArr[zzvl] = zzaca.zzvo();
                    zzaca.zzvl();
                    zzvl++;
                }
                jArr[zzvl] = zzaca.zzvo();
                this.zzawq = jArr;
            } else if (zzvl == 18) {
                int zzaf = zzaca.zzaf(zzaca.zzvn());
                zzb = zzaca.getPosition();
                zzvl = 0;
                while (zzaca.zzvr() > 0) {
                    zzaca.zzvo();
                    zzvl++;
                }
                zzaca.zzam(zzb);
                zzb = this.zzawq == null ? 0 : this.zzawq.length;
                long[] jArr2 = new long[(zzvl + zzb)];
                if (zzb != 0) {
                    System.arraycopy(this.zzawq, 0, jArr2, 0, zzb);
                }
                while (zzb < jArr2.length) {
                    jArr2[zzb] = zzaca.zzvo();
                    zzb++;
                }
                this.zzawq = jArr2;
                zzaca.zzal(zzaf);
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }
}
