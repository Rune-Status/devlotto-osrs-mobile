package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkx extends zzacd<zzkx> {
    private static volatile zzkx[] zzawr;
    public String name;
    public String zzale;
    private Float zzasv;
    public Double zzasw;
    public Long zzave;
    public Long zzaws;

    public zzkx() {
        this.zzaws = null;
        this.name = null;
        this.zzale = null;
        this.zzave = null;
        this.zzasv = null;
        this.zzasw = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkx[] zzmc() {
        if (zzawr == null) {
            synchronized (zzach.zzbzn) {
                if (zzawr == null) {
                    zzawr = new zzkx[0];
                }
            }
        }
        return zzawr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkx)) {
            return false;
        }
        zzkx zzkx = (zzkx) obj;
        if (this.zzaws == null) {
            if (zzkx.zzaws != null) {
                return false;
            }
        } else if (!this.zzaws.equals(zzkx.zzaws)) {
            return false;
        }
        if (this.name == null) {
            if (zzkx.name != null) {
                return false;
            }
        } else if (!this.name.equals(zzkx.name)) {
            return false;
        }
        if (this.zzale == null) {
            if (zzkx.zzale != null) {
                return false;
            }
        } else if (!this.zzale.equals(zzkx.zzale)) {
            return false;
        }
        if (this.zzave == null) {
            if (zzkx.zzave != null) {
                return false;
            }
        } else if (!this.zzave.equals(zzkx.zzave)) {
            return false;
        }
        if (this.zzasv == null) {
            if (zzkx.zzasv != null) {
                return false;
            }
        } else if (!this.zzasv.equals(zzkx.zzasv)) {
            return false;
        }
        if (this.zzasw == null) {
            if (zzkx.zzasw != null) {
                return false;
            }
        } else if (!this.zzasw.equals(zzkx.zzasw)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkx.zzbzd == null || zzkx.zzbzd.isEmpty() : this.zzbzd.equals(zzkx.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = this.zzaws == null ? 0 : this.zzaws.hashCode();
        int hashCode3 = this.name == null ? 0 : this.name.hashCode();
        int hashCode4 = this.zzale == null ? 0 : this.zzale.hashCode();
        int hashCode5 = this.zzave == null ? 0 : this.zzave.hashCode();
        int hashCode6 = this.zzasv == null ? 0 : this.zzasv.hashCode();
        int hashCode7 = this.zzasw == null ? 0 : this.zzasw.hashCode();
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((((((((((hashCode2 + ((hashCode + 527) * 31)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int zza = super.zza();
        if (this.zzaws != null) {
            zza += zzacb.zzc(1, this.zzaws.longValue());
        }
        if (this.name != null) {
            zza += zzacb.zzc(2, this.name);
        }
        if (this.zzale != null) {
            zza += zzacb.zzc(3, this.zzale);
        }
        if (this.zzave != null) {
            zza += zzacb.zzc(4, this.zzave.longValue());
        }
        if (this.zzasv != null) {
            this.zzasv.floatValue();
            zza += zzacb.zzaq(5) + 4;
        }
        if (this.zzasw == null) {
            return zza;
        }
        this.zzasw.doubleValue();
        return zza + (zzacb.zzaq(6) + 8);
    }

    public final void zza(zzacb zzacb) throws IOException {
        if (this.zzaws != null) {
            zzacb.zzb(1, this.zzaws.longValue());
        }
        if (this.name != null) {
            zzacb.zzb(2, this.name);
        }
        if (this.zzale != null) {
            zzacb.zzb(3, this.zzale);
        }
        if (this.zzave != null) {
            zzacb.zzb(4, this.zzave.longValue());
        }
        if (this.zzasv != null) {
            zzacb.zza(5, this.zzasv.floatValue());
        }
        if (this.zzasw != null) {
            zzacb.zza(6, this.zzasw.doubleValue());
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        while (true) {
            int zzvl = zzaca.zzvl();
            if (zzvl == 0) {
                break;
            } else if (zzvl == 8) {
                this.zzaws = Long.valueOf(zzaca.zzvo());
            } else if (zzvl == 18) {
                this.name = zzaca.readString();
            } else if (zzvl == 26) {
                this.zzale = zzaca.readString();
            } else if (zzvl == 32) {
                this.zzave = Long.valueOf(zzaca.zzvo());
            } else if (zzvl == 45) {
                this.zzasv = Float.valueOf(Float.intBitsToFloat(zzaca.zzvp()));
            } else if (zzvl == 49) {
                this.zzasw = Double.valueOf(Double.longBitsToDouble(zzaca.zzvq()));
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }
}
