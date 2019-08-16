package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkt extends zzacd<zzkt> {
    public zzku[] zzavf;

    public zzkt() {
        this.zzavf = zzku.zzma();
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkt)) {
            return false;
        }
        zzkt zzkt = (zzkt) obj;
        return !zzach.equals(this.zzavf, zzkt.zzavf) ? false : (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkt.zzbzd == null || zzkt.zzbzd.isEmpty() : this.zzbzd.equals(zzkt.zzbzd);
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = zzach.hashCode(this.zzavf);
        int hashCode3 = (this.zzbzd == null || this.zzbzd.isEmpty()) ? 0 : this.zzbzd.hashCode();
        return hashCode3 + ((((hashCode + 527) * 31) + hashCode2) * 31);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int zza = super.zza();
        if (this.zzavf != null && this.zzavf.length > 0) {
            for (zzacj zzacj : this.zzavf) {
                if (zzacj != null) {
                    zza += zzacb.zzb(1, zzacj);
                }
            }
        }
        return zza;
    }

    public final void zza(zzacb zzacb) throws IOException {
        if (this.zzavf != null && this.zzavf.length > 0) {
            for (zzacj zzacj : this.zzavf) {
                if (zzacj != null) {
                    zzacb.zza(1, zzacj);
                }
            }
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        while (true) {
            int zzvl = zzaca.zzvl();
            if (zzvl == 0) {
                break;
            } else if (zzvl == 10) {
                int zzb = zzacm.zzb(zzaca, 10);
                zzvl = this.zzavf == null ? 0 : this.zzavf.length;
                zzku[] zzkuArr = new zzku[(zzb + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzavf, 0, zzkuArr, 0, zzvl);
                }
                while (zzvl < zzkuArr.length - 1) {
                    zzkuArr[zzvl] = new zzku();
                    zzaca.zza(zzkuArr[zzvl]);
                    zzaca.zzvl();
                    zzvl++;
                }
                zzkuArr[zzvl] = new zzku();
                zzaca.zza(zzkuArr[zzvl]);
                this.zzavf = zzkuArr;
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }
}
