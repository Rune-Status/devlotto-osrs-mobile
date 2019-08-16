package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkj extends zzacd<zzkj> {
    public Integer zzatw;
    public Boolean zzatx;
    public String zzaty;
    public String zzatz;
    public String zzaua;

    public zzkj() {
        this.zzatw = null;
        this.zzatx = null;
        this.zzaty = null;
        this.zzatz = null;
        this.zzaua = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    private final zzkj zzd(zzaca zzaca) throws IOException {
        while (true) {
            int zzvl = zzaca.zzvl();
            if (zzvl == 0) {
                break;
            } else if (zzvl == 8) {
                int position = zzaca.getPosition();
                try {
                    int zzvn = zzaca.zzvn();
                    if (zzvn < 0 || zzvn > 4) {
                        StringBuilder stringBuilder = new StringBuilder(46);
                        stringBuilder.append(zzvn);
                        stringBuilder.append(" is not a valid enum ComparisonType");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    this.zzatw = Integer.valueOf(zzvn);
                } catch (IllegalArgumentException e) {
                    zzaca.zzam(position);
                    zza(zzaca, zzvl);
                }
            } else if (zzvl == 16) {
                this.zzatx = Boolean.valueOf(zzaca.zzvm());
            } else if (zzvl == 26) {
                this.zzaty = zzaca.readString();
            } else if (zzvl == 34) {
                this.zzatz = zzaca.readString();
            } else if (zzvl == 42) {
                this.zzaua = zzaca.readString();
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
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkj = (zzkj) obj;
        if (this.zzatw == null) {
            if (zzkj.zzatw != null) {
                return false;
            }
        } else if (!this.zzatw.equals(zzkj.zzatw)) {
            return false;
        }
        if (this.zzatx == null) {
            if (zzkj.zzatx != null) {
                return false;
            }
        } else if (!this.zzatx.equals(zzkj.zzatx)) {
            return false;
        }
        if (this.zzaty == null) {
            if (zzkj.zzaty != null) {
                return false;
            }
        } else if (!this.zzaty.equals(zzkj.zzaty)) {
            return false;
        }
        if (this.zzatz == null) {
            if (zzkj.zzatz != null) {
                return false;
            }
        } else if (!this.zzatz.equals(zzkj.zzatz)) {
            return false;
        }
        if (this.zzaua == null) {
            if (zzkj.zzaua != null) {
                return false;
            }
        } else if (!this.zzaua.equals(zzkj.zzaua)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkj.zzbzd == null || zzkj.zzbzd.isEmpty() : this.zzbzd.equals(zzkj.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int intValue = this.zzatw == null ? 0 : this.zzatw.intValue();
        int hashCode2 = this.zzatx == null ? 0 : this.zzatx.hashCode();
        int hashCode3 = this.zzaty == null ? 0 : this.zzaty.hashCode();
        int hashCode4 = this.zzatz == null ? 0 : this.zzatz.hashCode();
        int hashCode5 = this.zzaua == null ? 0 : this.zzaua.hashCode();
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((((((((intValue + ((hashCode + 527) * 31)) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int zza = super.zza();
        if (this.zzatw != null) {
            zza += zzacb.zzf(1, this.zzatw.intValue());
        }
        if (this.zzatx != null) {
            this.zzatx.booleanValue();
            zza += zzacb.zzaq(2) + 1;
        }
        if (this.zzaty != null) {
            zza += zzacb.zzc(3, this.zzaty);
        }
        if (this.zzatz != null) {
            zza += zzacb.zzc(4, this.zzatz);
        }
        return this.zzaua != null ? zza + zzacb.zzc(5, this.zzaua) : zza;
    }

    public final void zza(zzacb zzacb) throws IOException {
        if (this.zzatw != null) {
            zzacb.zze(1, this.zzatw.intValue());
        }
        if (this.zzatx != null) {
            zzacb.zza(2, this.zzatx.booleanValue());
        }
        if (this.zzaty != null) {
            zzacb.zzb(3, this.zzaty);
        }
        if (this.zzatz != null) {
            zzacb.zzb(4, this.zzatz);
        }
        if (this.zzaua != null) {
            zzacb.zzb(5, this.zzaua);
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        return zzd(zzaca);
    }
}
