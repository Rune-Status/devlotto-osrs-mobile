package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzks extends zzacd<zzks> {
    private static volatile zzks[] zzavd;
    public String name;
    public String zzale;
    private Float zzasv;
    public Double zzasw;
    public Long zzave;

    public zzks() {
        this.name = null;
        this.zzale = null;
        this.zzave = null;
        this.zzasv = null;
        this.zzasw = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzks[] zzlz() {
        if (zzavd == null) {
            synchronized (zzach.zzbzn) {
                if (zzavd == null) {
                    zzavd = new zzks[0];
                }
            }
        }
        return zzavd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzks)) {
            return false;
        }
        zzks zzks = (zzks) obj;
        if (this.name == null) {
            if (zzks.name != null) {
                return false;
            }
        } else if (!this.name.equals(zzks.name)) {
            return false;
        }
        if (this.zzale == null) {
            if (zzks.zzale != null) {
                return false;
            }
        } else if (!this.zzale.equals(zzks.zzale)) {
            return false;
        }
        if (this.zzave == null) {
            if (zzks.zzave != null) {
                return false;
            }
        } else if (!this.zzave.equals(zzks.zzave)) {
            return false;
        }
        if (this.zzasv == null) {
            if (zzks.zzasv != null) {
                return false;
            }
        } else if (!this.zzasv.equals(zzks.zzasv)) {
            return false;
        }
        if (this.zzasw == null) {
            if (zzks.zzasw != null) {
                return false;
            }
        } else if (!this.zzasw.equals(zzks.zzasw)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzks.zzbzd == null || zzks.zzbzd.isEmpty() : this.zzbzd.equals(zzks.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = this.name == null ? 0 : this.name.hashCode();
        int hashCode3 = this.zzale == null ? 0 : this.zzale.hashCode();
        int hashCode4 = this.zzave == null ? 0 : this.zzave.hashCode();
        int hashCode5 = this.zzasv == null ? 0 : this.zzasv.hashCode();
        int hashCode6 = this.zzasw == null ? 0 : this.zzasw.hashCode();
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((((((((hashCode2 + ((hashCode + 527) * 31)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int zza = super.zza();
        if (this.name != null) {
            zza += zzacb.zzc(1, this.name);
        }
        if (this.zzale != null) {
            zza += zzacb.zzc(2, this.zzale);
        }
        if (this.zzave != null) {
            zza += zzacb.zzc(3, this.zzave.longValue());
        }
        if (this.zzasv != null) {
            this.zzasv.floatValue();
            zza += zzacb.zzaq(4) + 4;
        }
        if (this.zzasw == null) {
            return zza;
        }
        this.zzasw.doubleValue();
        return zza + (zzacb.zzaq(5) + 8);
    }

    public final void zza(zzacb zzacb) throws IOException {
        if (this.name != null) {
            zzacb.zzb(1, this.name);
        }
        if (this.zzale != null) {
            zzacb.zzb(2, this.zzale);
        }
        if (this.zzave != null) {
            zzacb.zzb(3, this.zzave.longValue());
        }
        if (this.zzasv != null) {
            zzacb.zza(4, this.zzasv.floatValue());
        }
        if (this.zzasw != null) {
            zzacb.zza(5, this.zzasw.doubleValue());
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        while (true) {
            int zzvl = zzaca.zzvl();
            if (zzvl == 0) {
                break;
            } else if (zzvl == 10) {
                this.name = zzaca.readString();
            } else if (zzvl == 18) {
                this.zzale = zzaca.readString();
            } else if (zzvl == 24) {
                this.zzave = Long.valueOf(zzaca.zzvo());
            } else if (zzvl == 37) {
                this.zzasv = Float.valueOf(Float.intBitsToFloat(zzaca.zzvp()));
            } else if (zzvl == 41) {
                this.zzasw = Double.valueOf(Double.longBitsToDouble(zzaca.zzvq()));
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }
}
