package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkl extends zzacd<zzkl> {
    public Integer zzaue;
    public String zzauf;
    public Boolean zzaug;
    public String[] zzauh;

    public zzkl() {
        this.zzaue = null;
        this.zzauf = null;
        this.zzaug = null;
        this.zzauh = zzacm.zzbzx;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    private final zzkl zze(zzaca zzaca) throws IOException {
        int position;
        while (true) {
            int zzvl = zzaca.zzvl();
            if (zzvl == 0) {
                break;
            } else if (zzvl == 8) {
                position = zzaca.getPosition();
                try {
                    int zzvn = zzaca.zzvn();
                    if (zzvn < 0 || zzvn > 6) {
                        StringBuilder stringBuilder = new StringBuilder(41);
                        stringBuilder.append(zzvn);
                        stringBuilder.append(" is not a valid enum MatchType");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    this.zzaue = Integer.valueOf(zzvn);
                } catch (IllegalArgumentException e) {
                    zzaca.zzam(position);
                    zza(zzaca, zzvl);
                }
            } else if (zzvl == 18) {
                this.zzauf = zzaca.readString();
            } else if (zzvl == 24) {
                this.zzaug = Boolean.valueOf(zzaca.zzvm());
            } else if (zzvl == 34) {
                position = zzacm.zzb(zzaca, 34);
                zzvl = this.zzauh == null ? 0 : this.zzauh.length;
                String[] strArr = new String[(position + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzauh, 0, strArr, 0, zzvl);
                }
                while (zzvl < strArr.length - 1) {
                    strArr[zzvl] = zzaca.readString();
                    zzaca.zzvl();
                    zzvl++;
                }
                strArr[zzvl] = zzaca.readString();
                this.zzauh = strArr;
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkl)) {
            return false;
        }
        zzkl zzkl = (zzkl) obj;
        if (this.zzaue == null) {
            if (zzkl.zzaue != null) {
                return false;
            }
        } else if (!this.zzaue.equals(zzkl.zzaue)) {
            return false;
        }
        if (this.zzauf == null) {
            if (zzkl.zzauf != null) {
                return false;
            }
        } else if (!this.zzauf.equals(zzkl.zzauf)) {
            return false;
        }
        if (this.zzaug == null) {
            if (zzkl.zzaug != null) {
                return false;
            }
        } else if (!this.zzaug.equals(zzkl.zzaug)) {
            return false;
        }
        return !zzach.equals(this.zzauh, zzkl.zzauh) ? false : (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkl.zzbzd == null || zzkl.zzbzd.isEmpty() : this.zzbzd.equals(zzkl.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int intValue = this.zzaue == null ? 0 : this.zzaue.intValue();
        int hashCode2 = this.zzauf == null ? 0 : this.zzauf.hashCode();
        int hashCode3 = this.zzaug == null ? 0 : this.zzaug.hashCode();
        int hashCode4 = zzach.hashCode(this.zzauh);
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((((((intValue + ((hashCode + 527) * 31)) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int zza = super.zza();
        if (this.zzaue != null) {
            zza += zzacb.zzf(1, this.zzaue.intValue());
        }
        if (this.zzauf != null) {
            zza += zzacb.zzc(2, this.zzauf);
        }
        if (this.zzaug != null) {
            this.zzaug.booleanValue();
            zza += zzacb.zzaq(3) + 1;
        }
        if (this.zzauh == null || this.zzauh.length <= 0) {
            return zza;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.zzauh.length) {
            int zzfr;
            String str = this.zzauh[i3];
            if (str != null) {
                i++;
                zzfr = zzacb.zzfr(str) + i2;
            } else {
                zzfr = i2;
            }
            i3++;
            i2 = zzfr;
        }
        return (zza + i2) + (i * 1);
    }

    public final void zza(zzacb zzacb) throws IOException {
        if (this.zzaue != null) {
            zzacb.zze(1, this.zzaue.intValue());
        }
        if (this.zzauf != null) {
            zzacb.zzb(2, this.zzauf);
        }
        if (this.zzaug != null) {
            zzacb.zza(3, this.zzaug.booleanValue());
        }
        if (this.zzauh != null && this.zzauh.length > 0) {
            for (String str : this.zzauh) {
                if (str != null) {
                    zzacb.zzb(4, str);
                }
            }
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        return zze(zzaca);
    }
}
