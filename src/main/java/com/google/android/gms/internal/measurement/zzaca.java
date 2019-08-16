package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzaca {
    private final byte[] buffer;
    private int zzbtk = 64;
    private int zzbtl = 67108864;
    private int zzbtp;
    private int zzbtr = Integer.MAX_VALUE;
    private final int zzbyw;
    private final int zzbyx;
    private int zzbyy;
    private int zzbyz;
    private int zzbza;
    private int zzbzb;

    private zzaca(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzbyw = i;
        int i3 = i2 + i;
        this.zzbyy = i3;
        this.zzbyx = i3;
        this.zzbyz = i;
    }

    public static zzaca zza(byte[] bArr, int i, int i2) {
        return new zzaca(bArr, 0, i2);
    }

    private final void zzan(int i) throws IOException {
        if (i < 0) {
            throw zzaci.zzvx();
        } else if (this.zzbyz + i > this.zzbtr) {
            zzan(this.zzbtr - this.zzbyz);
            throw zzaci.zzvw();
        } else if (i <= this.zzbyy - this.zzbyz) {
            this.zzbyz += i;
        } else {
            throw zzaci.zzvw();
        }
    }

    public static zzaca zzi(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    private final void zztp() {
        this.zzbyy += this.zzbtp;
        int i = this.zzbyy;
        if (i > this.zzbtr) {
            this.zzbtp = i - this.zzbtr;
            this.zzbyy -= this.zzbtp;
            return;
        }
        this.zzbtp = 0;
    }

    private final byte zzvs() throws IOException {
        if (this.zzbyz != this.zzbyy) {
            byte[] bArr = this.buffer;
            int i = this.zzbyz;
            this.zzbyz = i + 1;
            return bArr[i];
        }
        throw zzaci.zzvw();
    }

    public final int getPosition() {
        return this.zzbyz - this.zzbyw;
    }

    public final String readString() throws IOException {
        int zzvn = zzvn();
        if (zzvn < 0) {
            throw zzaci.zzvx();
        } else if (zzvn <= this.zzbyy - this.zzbyz) {
            String str = new String(this.buffer, this.zzbyz, zzvn, zzach.UTF_8);
            this.zzbyz = zzvn + this.zzbyz;
            return str;
        } else {
            throw zzaci.zzvw();
        }
    }

    public final void zza(zzacj zzacj) throws IOException {
        int zzvn = zzvn();
        if (this.zzbzb < this.zzbtk) {
            zzvn = zzaf(zzvn);
            this.zzbzb++;
            zzacj.zzb(this);
            zzaj(0);
            this.zzbzb--;
            zzal(zzvn);
            return;
        }
        throw zzaci.zzvz();
    }

    public final void zza(zzacj zzacj, int i) throws IOException {
        if (this.zzbzb < this.zzbtk) {
            this.zzbzb++;
            zzacj.zzb(this);
            zzaj((i << 3) | 4);
            this.zzbzb--;
            return;
        }
        throw zzaci.zzvz();
    }

    public final int zzaf(int i) throws zzaci {
        if (i >= 0) {
            int i2 = this.zzbyz + i;
            int i3 = this.zzbtr;
            if (i2 <= i3) {
                this.zzbtr = i2;
                zztp();
                return i3;
            }
            throw zzaci.zzvw();
        }
        throw zzaci.zzvx();
    }

    public final void zzaj(int i) throws zzaci {
        if (this.zzbza != i) {
            throw new zzaci("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzak(int i) throws IOException {
        switch (i & 7) {
            case 0:
                zzvn();
                return true;
            case 1:
                zzvq();
                return true;
            case 2:
                zzan(zzvn());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzvp();
                return true;
            default:
                throw new zzaci("Protocol message tag had invalid wire type.");
        }
        int zzvl;
        do {
            zzvl = zzvl();
            if (zzvl != 0) {
            }
            zzaj(((i >>> 3) << 3) | 4);
            return true;
        } while (zzak(zzvl));
        zzaj(((i >>> 3) << 3) | 4);
        return true;
    }

    public final void zzal(int i) {
        this.zzbtr = i;
        zztp();
    }

    public final void zzam(int i) {
        zzd(i, this.zzbza);
    }

    public final byte[] zzc(int i, int i2) {
        if (i2 == 0) {
            return zzacm.zzbzz;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzbyw + i, bArr, 0, i2);
        return bArr;
    }

    /* Access modifiers changed, original: final */
    public final void zzd(int i, int i2) {
        if (i > this.zzbyz - this.zzbyw) {
            int i3 = this.zzbyz;
            int i4 = this.zzbyw;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3 - i4);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.zzbyz = this.zzbyw + i;
            this.zzbza = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    public final int zzvl() throws IOException {
        if (this.zzbyz == this.zzbyy) {
            this.zzbza = 0;
            return 0;
        }
        this.zzbza = zzvn();
        if (this.zzbza != 0) {
            return this.zzbza;
        }
        throw new zzaci("Protocol message contained an invalid tag (zero).");
    }

    public final boolean zzvm() throws IOException {
        return zzvn() != 0;
    }

    public final int zzvn() throws IOException {
        byte zzvs = zzvs();
        if (zzvs >= (byte) 0) {
            return zzvs;
        }
        int i;
        int i2 = zzvs & 127;
        zzvs = zzvs();
        if (zzvs >= (byte) 0) {
            i = zzvs << 7;
        } else {
            i2 |= (zzvs & 127) << 7;
            zzvs = zzvs();
            if (zzvs >= (byte) 0) {
                i = zzvs << 14;
            } else {
                i2 |= (zzvs & 127) << 14;
                zzvs = zzvs();
                if (zzvs >= (byte) 0) {
                    i = zzvs << 21;
                } else {
                    byte zzvs2 = zzvs();
                    i = (((zzvs & 127) << 21) | i2) | (zzvs2 << 28);
                    if (zzvs2 >= (byte) 0) {
                        return i;
                    }
                    for (i2 = 0; i2 < 5; i2++) {
                        if (zzvs() >= (byte) 0) {
                            return i;
                        }
                    }
                    throw zzaci.zzvy();
                }
            }
        }
        return i | i2;
    }

    public final long zzvo() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzvs = zzvs();
            j |= ((long) (zzvs & 127)) << i;
            if ((zzvs & 128) == 0) {
                return j;
            }
        }
        throw zzaci.zzvy();
    }

    public final int zzvp() throws IOException {
        return (((zzvs() & 255) | ((zzvs() & 255) << 8)) | ((zzvs() & 255) << 16)) | ((zzvs() & 255) << 24);
    }

    public final long zzvq() throws IOException {
        byte zzvs = zzvs();
        return ((((((((((long) zzvs()) & 255) << 8) | (((long) zzvs) & 255)) | ((((long) zzvs()) & 255) << 16)) | ((((long) zzvs()) & 255) << 24)) | ((((long) zzvs()) & 255) << 32)) | ((((long) zzvs()) & 255) << 40)) | ((((long) zzvs()) & 255) << 48)) | ((((long) zzvs()) & 255) << 56);
    }

    public final int zzvr() {
        if (this.zzbtr == Integer.MAX_VALUE) {
            return -1;
        }
        return this.zzbtr - this.zzbyz;
    }
}
