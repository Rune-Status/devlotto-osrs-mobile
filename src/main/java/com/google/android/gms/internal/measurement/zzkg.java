package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkg extends zzacd<zzkg> {
    private static volatile zzkg[] zzatd;
    public Integer zzate;
    public zzkk[] zzatf;
    public zzkh[] zzatg;
    public Boolean zzath;
    public Boolean zzati;

    public zzkg() {
        this.zzate = null;
        this.zzatf = zzkk.zzlt();
        this.zzatg = zzkh.zzlr();
        this.zzath = null;
        this.zzati = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkg[] zzlq() {
        if (zzatd == null) {
            synchronized (zzach.zzbzn) {
                if (zzatd == null) {
                    zzatd = new zzkg[0];
                }
            }
        }
        return zzatd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkg)) {
            return false;
        }
        zzkg zzkg = (zzkg) obj;
        if (this.zzate == null) {
            if (zzkg.zzate != null) {
                return false;
            }
        } else if (!this.zzate.equals(zzkg.zzate)) {
            return false;
        }
        if (!zzach.equals(this.zzatf, zzkg.zzatf)) {
            return false;
        }
        if (!zzach.equals(this.zzatg, zzkg.zzatg)) {
            return false;
        }
        if (this.zzath == null) {
            if (zzkg.zzath != null) {
                return false;
            }
        } else if (!this.zzath.equals(zzkg.zzath)) {
            return false;
        }
        if (this.zzati == null) {
            if (zzkg.zzati != null) {
                return false;
            }
        } else if (!this.zzati.equals(zzkg.zzati)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkg.zzbzd == null || zzkg.zzbzd.isEmpty() : this.zzbzd.equals(zzkg.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = this.zzate == null ? 0 : this.zzate.hashCode();
        int hashCode3 = zzach.hashCode(this.zzatf);
        int hashCode4 = zzach.hashCode(this.zzatg);
        int hashCode5 = this.zzath == null ? 0 : this.zzath.hashCode();
        int hashCode6 = this.zzati == null ? 0 : this.zzati.hashCode();
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((((((((hashCode2 + ((hashCode + 527) * 31)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int i = 0;
        int zza = super.zza();
        if (this.zzate != null) {
            zza += zzacb.zzf(1, this.zzate.intValue());
        }
        if (this.zzatf != null && this.zzatf.length > 0) {
            for (zzacj zzacj : this.zzatf) {
                if (zzacj != null) {
                    zza += zzacb.zzb(2, zzacj);
                }
            }
        }
        if (this.zzatg != null && this.zzatg.length > 0) {
            while (i < this.zzatg.length) {
                zzacj zzacj2 = this.zzatg[i];
                if (zzacj2 != null) {
                    zza += zzacb.zzb(3, zzacj2);
                }
                i++;
            }
        }
        if (this.zzath != null) {
            this.zzath.booleanValue();
            zza += zzacb.zzaq(4) + 1;
        }
        if (this.zzati == null) {
            return zza;
        }
        this.zzati.booleanValue();
        return zza + (zzacb.zzaq(5) + 1);
    }

    public final void zza(zzacb zzacb) throws IOException {
        int i = 0;
        if (this.zzate != null) {
            zzacb.zze(1, this.zzate.intValue());
        }
        if (this.zzatf != null && this.zzatf.length > 0) {
            for (zzacj zzacj : this.zzatf) {
                if (zzacj != null) {
                    zzacb.zza(2, zzacj);
                }
            }
        }
        if (this.zzatg != null && this.zzatg.length > 0) {
            while (i < this.zzatg.length) {
                zzacj zzacj2 = this.zzatg[i];
                if (zzacj2 != null) {
                    zzacb.zza(3, zzacj2);
                }
                i++;
            }
        }
        if (this.zzath != null) {
            zzacb.zza(4, this.zzath.booleanValue());
        }
        if (this.zzati != null) {
            zzacb.zza(5, this.zzati.booleanValue());
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
                this.zzate = Integer.valueOf(zzaca.zzvn());
            } else if (zzvl == 18) {
                zzb = zzacm.zzb(zzaca, 18);
                zzvl = this.zzatf == null ? 0 : this.zzatf.length;
                zzkk[] zzkkArr = new zzkk[(zzb + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzatf, 0, zzkkArr, 0, zzvl);
                }
                while (zzvl < zzkkArr.length - 1) {
                    zzkkArr[zzvl] = new zzkk();
                    zzaca.zza(zzkkArr[zzvl]);
                    zzaca.zzvl();
                    zzvl++;
                }
                zzkkArr[zzvl] = new zzkk();
                zzaca.zza(zzkkArr[zzvl]);
                this.zzatf = zzkkArr;
            } else if (zzvl == 26) {
                zzb = zzacm.zzb(zzaca, 26);
                zzvl = this.zzatg == null ? 0 : this.zzatg.length;
                zzkh[] zzkhArr = new zzkh[(zzb + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzatg, 0, zzkhArr, 0, zzvl);
                }
                while (zzvl < zzkhArr.length - 1) {
                    zzkhArr[zzvl] = new zzkh();
                    zzaca.zza(zzkhArr[zzvl]);
                    zzaca.zzvl();
                    zzvl++;
                }
                zzkhArr[zzvl] = new zzkh();
                zzaca.zza(zzkhArr[zzvl]);
                this.zzatg = zzkhArr;
            } else if (zzvl == 32) {
                this.zzath = Boolean.valueOf(zzaca.zzvm());
            } else if (zzvl == 40) {
                this.zzati = Boolean.valueOf(zzaca.zzvm());
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }
}
