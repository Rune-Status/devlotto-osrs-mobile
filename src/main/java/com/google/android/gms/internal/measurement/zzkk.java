package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkk extends zzacd<zzkk> {
    private static volatile zzkk[] zzaub;
    public Integer zzatk;
    public String zzauc;
    public zzki zzaud;

    public zzkk() {
        this.zzatk = null;
        this.zzauc = null;
        this.zzaud = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkk[] zzlt() {
        if (zzaub == null) {
            synchronized (zzach.zzbzn) {
                if (zzaub == null) {
                    zzaub = new zzkk[0];
                }
            }
        }
        return zzaub;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkk)) {
            return false;
        }
        zzkk zzkk = (zzkk) obj;
        if (this.zzatk == null) {
            if (zzkk.zzatk != null) {
                return false;
            }
        } else if (!this.zzatk.equals(zzkk.zzatk)) {
            return false;
        }
        if (this.zzauc == null) {
            if (zzkk.zzauc != null) {
                return false;
            }
        } else if (!this.zzauc.equals(zzkk.zzauc)) {
            return false;
        }
        if (this.zzaud == null) {
            if (zzkk.zzaud != null) {
                return false;
            }
        } else if (!this.zzaud.equals(zzkk.zzaud)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkk.zzbzd == null || zzkk.zzbzd.isEmpty() : this.zzbzd.equals(zzkk.zzbzd);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = this.zzatk == null ? 0 : this.zzatk.hashCode();
        int hashCode3 = this.zzauc == null ? 0 : this.zzauc.hashCode();
        zzki zzki = this.zzaud;
        int hashCode4 = zzki == null ? 0 : zzki.hashCode();
        if (!(this.zzbzd == null || this.zzbzd.isEmpty())) {
            i = this.zzbzd.hashCode();
        }
        return ((((((hashCode2 + ((hashCode + 527) * 31)) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int zza = super.zza();
        if (this.zzatk != null) {
            zza += zzacb.zzf(1, this.zzatk.intValue());
        }
        if (this.zzauc != null) {
            zza += zzacb.zzc(2, this.zzauc);
        }
        return this.zzaud != null ? zza + zzacb.zzb(3, this.zzaud) : zza;
    }

    public final void zza(zzacb zzacb) throws IOException {
        if (this.zzatk != null) {
            zzacb.zze(1, this.zzatk.intValue());
        }
        if (this.zzauc != null) {
            zzacb.zzb(2, this.zzauc);
        }
        if (this.zzaud != null) {
            zzacb.zza(3, this.zzaud);
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        while (true) {
            int zzvl = zzaca.zzvl();
            if (zzvl == 0) {
                break;
            } else if (zzvl == 8) {
                this.zzatk = Integer.valueOf(zzaca.zzvn());
            } else if (zzvl == 18) {
                this.zzauc = zzaca.readString();
            } else if (zzvl == 26) {
                if (this.zzaud == null) {
                    this.zzaud = new zzki();
                }
                zzaca.zza(this.zzaud);
            } else if (!super.zza(zzaca, zzvl)) {
                break;
            }
        }
        return this;
    }
}
