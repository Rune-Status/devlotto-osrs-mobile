package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkv extends zzacd<zzkv> {
    public long[] zzawl;
    public long[] zzawm;
    public zzkq[] zzawn;
    private zzkw[] zzawo;

    public zzkv() {
        this.zzawl = zzacm.zzbzt;
        this.zzawm = zzacm.zzbzt;
        this.zzawn = zzkq.zzlx();
        this.zzawo = zzkw.zzmb();
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkv)) {
            return false;
        }
        zzkv zzkv = (zzkv) obj;
        return !zzach.equals(this.zzawl, zzkv.zzawl) ? false : !zzach.equals(this.zzawm, zzkv.zzawm) ? false : !zzach.equals(this.zzawn, zzkv.zzawn) ? false : !zzach.equals(this.zzawo, zzkv.zzawo) ? false : (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkv.zzbzd == null || zzkv.zzbzd.isEmpty() : this.zzbzd.equals(zzkv.zzbzd);
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int hashCode2 = zzach.hashCode(this.zzawl);
        int hashCode3 = zzach.hashCode(this.zzawm);
        int hashCode4 = zzach.hashCode(this.zzawn);
        int hashCode5 = zzach.hashCode(this.zzawo);
        int hashCode6 = (this.zzbzd == null || this.zzbzd.isEmpty()) ? 0 : this.zzbzd.hashCode();
        return hashCode6 + ((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza() {
        int i;
        int i2;
        int i3 = 0;
        int zza = super.zza();
        if (this.zzawl == null || this.zzawl.length <= 0) {
            i = zza;
        } else {
            i = 0;
            for (long zzat : this.zzawl) {
                i += zzacb.zzat(zzat);
            }
            i = (i + zza) + (this.zzawl.length * 1);
        }
        if (this.zzawm != null && this.zzawm.length > 0) {
            i2 = 0;
            for (long zzat2 : this.zzawm) {
                i2 += zzacb.zzat(zzat2);
            }
            i = (i + i2) + (this.zzawm.length * 1);
        }
        if (this.zzawn != null && this.zzawn.length > 0) {
            for (zzacj zzacj : this.zzawn) {
                if (zzacj != null) {
                    i += zzacb.zzb(3, zzacj);
                }
            }
        }
        if (this.zzawo != null && this.zzawo.length > 0) {
            while (i3 < this.zzawo.length) {
                zzacj zzacj2 = this.zzawo[i3];
                if (zzacj2 != null) {
                    i += zzacb.zzb(4, zzacj2);
                }
                i3++;
            }
        }
        return i;
    }

    public final void zza(zzacb zzacb) throws IOException {
        int i = 0;
        if (this.zzawl != null && this.zzawl.length > 0) {
            for (long zza : this.zzawl) {
                zzacb.zza(1, zza);
            }
        }
        if (this.zzawm != null && this.zzawm.length > 0) {
            for (long zza2 : this.zzawm) {
                zzacb.zza(2, zza2);
            }
        }
        if (this.zzawn != null && this.zzawn.length > 0) {
            for (zzacj zzacj : this.zzawn) {
                if (zzacj != null) {
                    zzacb.zza(3, zzacj);
                }
            }
        }
        if (this.zzawo != null && this.zzawo.length > 0) {
            while (i < this.zzawo.length) {
                zzacj zzacj2 = this.zzawo[i];
                if (zzacj2 != null) {
                    zzacb.zza(4, zzacj2);
                }
                i++;
            }
        }
        super.zza(zzacb);
    }

    public final /* synthetic */ zzacj zzb(zzaca zzaca) throws IOException {
        while (true) {
            int zzvl = zzaca.zzvl();
            int position;
            long[] jArr;
            if (zzvl == 0) {
                break;
            } else if (zzvl != 8) {
                int zzaf;
                long[] jArr2;
                if (zzvl == 10) {
                    zzaf = zzaca.zzaf(zzaca.zzvn());
                    position = zzaca.getPosition();
                    zzvl = 0;
                    while (zzaca.zzvr() > 0) {
                        zzaca.zzvo();
                        zzvl++;
                    }
                    zzaca.zzam(position);
                    position = this.zzawl == null ? 0 : this.zzawl.length;
                    jArr2 = new long[(zzvl + position)];
                    if (position != 0) {
                        System.arraycopy(this.zzawl, 0, jArr2, 0, position);
                    }
                    while (position < jArr2.length) {
                        jArr2[position] = zzaca.zzvo();
                        position++;
                    }
                    this.zzawl = jArr2;
                } else if (zzvl == 16) {
                    position = zzacm.zzb(zzaca, 16);
                    zzvl = this.zzawm == null ? 0 : this.zzawm.length;
                    jArr = new long[(position + zzvl)];
                    if (zzvl != 0) {
                        System.arraycopy(this.zzawm, 0, jArr, 0, zzvl);
                    }
                    while (zzvl < jArr.length - 1) {
                        jArr[zzvl] = zzaca.zzvo();
                        zzaca.zzvl();
                        zzvl++;
                    }
                    jArr[zzvl] = zzaca.zzvo();
                    this.zzawm = jArr;
                } else if (zzvl == 18) {
                    zzaf = zzaca.zzaf(zzaca.zzvn());
                    position = zzaca.getPosition();
                    zzvl = 0;
                    while (zzaca.zzvr() > 0) {
                        zzaca.zzvo();
                        zzvl++;
                    }
                    zzaca.zzam(position);
                    position = this.zzawm == null ? 0 : this.zzawm.length;
                    jArr2 = new long[(zzvl + position)];
                    if (position != 0) {
                        System.arraycopy(this.zzawm, 0, jArr2, 0, position);
                    }
                    while (position < jArr2.length) {
                        jArr2[position] = zzaca.zzvo();
                        position++;
                    }
                    this.zzawm = jArr2;
                } else if (zzvl == 26) {
                    position = zzacm.zzb(zzaca, 26);
                    zzvl = this.zzawn == null ? 0 : this.zzawn.length;
                    zzkq[] zzkqArr = new zzkq[(position + zzvl)];
                    if (zzvl != 0) {
                        System.arraycopy(this.zzawn, 0, zzkqArr, 0, zzvl);
                    }
                    while (zzvl < zzkqArr.length - 1) {
                        zzkqArr[zzvl] = new zzkq();
                        zzaca.zza(zzkqArr[zzvl]);
                        zzaca.zzvl();
                        zzvl++;
                    }
                    zzkqArr[zzvl] = new zzkq();
                    zzaca.zza(zzkqArr[zzvl]);
                    this.zzawn = zzkqArr;
                } else if (zzvl == 34) {
                    position = zzacm.zzb(zzaca, 34);
                    zzvl = this.zzawo == null ? 0 : this.zzawo.length;
                    zzkw[] zzkwArr = new zzkw[(position + zzvl)];
                    if (zzvl != 0) {
                        System.arraycopy(this.zzawo, 0, zzkwArr, 0, zzvl);
                    }
                    while (zzvl < zzkwArr.length - 1) {
                        zzkwArr[zzvl] = new zzkw();
                        zzaca.zza(zzkwArr[zzvl]);
                        zzaca.zzvl();
                        zzvl++;
                    }
                    zzkwArr[zzvl] = new zzkw();
                    zzaca.zza(zzkwArr[zzvl]);
                    this.zzawo = zzkwArr;
                } else if (!super.zza(zzaca, zzvl)) {
                    break;
                }
                zzaca.zzal(zzaf);
            } else {
                position = zzacm.zzb(zzaca, 8);
                zzvl = this.zzawl == null ? 0 : this.zzawl.length;
                jArr = new long[(position + zzvl)];
                if (zzvl != 0) {
                    System.arraycopy(this.zzawl, 0, jArr, 0, zzvl);
                }
                while (zzvl < jArr.length - 1) {
                    jArr[zzvl] = zzaca.zzvo();
                    zzaca.zzvl();
                    zzvl++;
                }
                jArr[zzvl] = zzaca.zzvo();
                this.zzawl = jArr;
            }
        }
        return this;
    }
}
