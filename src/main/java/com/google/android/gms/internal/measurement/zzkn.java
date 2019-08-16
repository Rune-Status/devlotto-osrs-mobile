package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkn extends zzacd<zzkn> {
    public String zzafa;
    public Long zzaum;
    private Integer zzaun;
    public zzko[] zzauo;
    public zzkm[] zzaup;
    public zzkg[] zzauq;

    public zzkn() {
        this.zzaum = null;
        this.zzafa = null;
        this.zzaun = null;
        this.zzauo = zzko.zzlv();
        this.zzaup = zzkm.zzlu();
        this.zzauq = zzkg.zzlq();
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkn)) {
            return false;
        }
        zzkn zzkn = (zzkn) obj;
        if (this.zzaum == null) {
            if (zzkn.zzaum != null) {
                return false;
            }
        } else if (!this.zzaum.equals(zzkn.zzaum)) {
            return false;
        }
        if (this.zzafa == null) {
            if (zzkn.zzafa != null) {
                return false;
            }
        } else if (!this.zzafa.equals(zzkn.zzafa)) {
            return false;
        }
        if (this.zzaun == null) {
            if (zzkn.zzaun != null) {
                return false;
            }
        } else if (!this.zzaun.equals(zzkn.zzaun)) {
            return false;
        }
        return !zzach.equals(this.zzauo, zzkn.zzauo) ? false : !zzach.equals(this.zzaup, zzkn.zzaup) ? false : !zzach.equals(this.zzauq, zzkn.zzauq) ? false : (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkn.zzbzd == null || zzkn.zzbzd.isEmpty() : this.zzbzd.equals(zzkn.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = this.zzaum == null ? 0 : this.zzaum.hashCode();
        int hashCode3 = this.zzafa == null ? 0 : this.zzafa.hashCode();
        int hashCode4 = this.zzaun == null ? 0 : this.zzaun.hashCode();
        int hashCode5 = zzach.hashCode(this.zzauo);
        int hashCode6 = zzach.hashCode(this.zzaup);
        int hashCode7 = zzach.hashCode(this.zzauq);
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((((((((((hashCode2 + ((hashCode + 527) * 31)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int i = 0;
        int zza = super.zza();
        if (this.zzaum != null) {
            zza += zzacb.zzc(1, this.zzaum.longValue());
        }
        if (this.zzafa != null) {
            zza += zzacb.zzc(2, this.zzafa);
        }
        if (this.zzaun != null) {
            zza += zzacb.zzf(3, this.zzaun.intValue());
        }
        if (this.zzauo != null && this.zzauo.length > 0) {
            for (zzacj zzacj : this.zzauo) {
                if (zzacj != null) {
                    zza += zzacb.zzb(4, zzacj);
                }
            }
        }
        if (this.zzaup != null && this.zzaup.length > 0) {
            int i2 = zza;
            for (zzacj zzacj2 : this.zzaup) {
                if (zzacj2 != null) {
                    i2 += zzacb.zzb(5, zzacj2);
                }
            }
            zza = i2;
        }
        if (this.zzauq != null && this.zzauq.length > 0) {
            while (i < this.zzauq.length) {
                zzacj zzacj3 = this.zzauq[i];
                if (zzacj3 != null) {
                    zza += zzacb.zzb(6, zzacj3);
                }
                i++;
            }
        }
        return zza;
    }

    public final void zza(zzacb zzacb) throws IOException {
        int i = 0;
        if (this.zzaum != null) {
            zzacb.zzb(1, this.zzaum.longValue());
        }
        if (this.zzafa != null) {
            zzacb.zzb(2, this.zzafa);
        }
        if (this.zzaun != null) {
            zzacb.zze(3, this.zzaun.intValue());
        }
        if (this.zzauo != null && this.zzauo.length > 0) {
            for (zzacj zzacj : this.zzauo) {
                if (zzacj != null) {
                    zzacb.zza(4, zzacj);
                }
            }
        }
        if (this.zzaup != null && this.zzaup.length > 0) {
            for (zzacj zzacj2 : this.zzaup) {
                if (zzacj2 != null) {
                    zzacb.zza(5, zzacj2);
                }
            }
        }
        if (this.zzauq != null && this.zzauq.length > 0) {
            while (i < this.zzauq.length) {
                zzacj zzacj3 = this.zzauq[i];
                if (zzacj3 != null) {
                    zzacb.zza(6, zzacj3);
                }
                i++;
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
                this.zzaum = Long.valueOf(zzaca.zzvo());
            } else if (zzvl == 18) {
                this.zzafa = zzaca.readString();
            } else if (zzvl == 24) {
                this.zzaun = Integer.valueOf(zzaca.zzvn());
            } else if (zzvl == 34) {
                zzb = zzacm.zzb(zzaca, 34);
                zzvl = this.zzauo == null ? 0 : this.zzauo.length;
                zzko[] zzkoArr = new zzko[(zzb + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzauo, 0, zzkoArr, 0, zzvl);
                }
                while (zzvl < zzkoArr.length - 1) {
                    zzkoArr[zzvl] = new zzko();
                    zzaca.zza(zzkoArr[zzvl]);
                    zzaca.zzvl();
                    zzvl++;
                }
                zzkoArr[zzvl] = new zzko();
                zzaca.zza(zzkoArr[zzvl]);
                this.zzauo = zzkoArr;
            } else if (zzvl == 42) {
                zzb = zzacm.zzb(zzaca, 42);
                zzvl = this.zzaup == null ? 0 : this.zzaup.length;
                zzkm[] zzkmArr = new zzkm[(zzb + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzaup, 0, zzkmArr, 0, zzvl);
                }
                while (zzvl < zzkmArr.length - 1) {
                    zzkmArr[zzvl] = new zzkm();
                    zzaca.zza(zzkmArr[zzvl]);
                    zzaca.zzvl();
                    zzvl++;
                }
                zzkmArr[zzvl] = new zzkm();
                zzaca.zza(zzkmArr[zzvl]);
                this.zzaup = zzkmArr;
            } else if (zzvl == 50) {
                zzb = zzacm.zzb(zzaca, 50);
                zzvl = this.zzauq == null ? 0 : this.zzauq.length;
                zzkg[] zzkgArr = new zzkg[(zzb + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzauq, 0, zzkgArr, 0, zzvl);
                }
                while (zzvl < zzkgArr.length - 1) {
                    zzkgArr[zzvl] = new zzkg();
                    zzaca.zza(zzkgArr[zzvl]);
                    zzaca.zzvl();
                    zzvl++;
                }
                zzkgArr[zzvl] = new zzkg();
                zzaca.zza(zzkgArr[zzvl]);
                this.zzauq = zzkgArr;
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }
}
