package defpackage;

import android.support.v4.internal.view.SupportMenu;
import java.math.BigInteger;

/* renamed from: lj */
public class lj extends mb {
    public static final int ad = 100;
    static long[] ae = new long[256];
    static final int ai = -306674912;
    static int[] aj = new int[256];
    static final long am = -3932672073523589310L;
    public static final int aq = 5000;
    static al az = null;
    public static final int ca = 88;
    static final int nq = 503;
    public int al = 0;
    public byte[] ar;

    static {
        int i;
        for (i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = 1 == (i2 & 1) ? (i2 >>> 1) ^ ai : i2 >>> 1;
            }
            aj[i] = i2;
        }
        for (int i4 = 0; i4 < 256; i4++) {
            long j = (long) i4;
            for (i = 0; i < 8; i++) {
                j = 1 == (j & 1) ? (j >>> 1) ^ am : j >>> 1;
            }
            ae[i4] = j;
        }
    }

    public lj(int i) {
        try {
            this.ar = bi.ar(i, 421685225);
            this.al = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public lj(byte[] bArr) {
        try {
            this.ar = bArr;
            this.al = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static Integer ad(lj ljVar, int i) {
        int i2 = 0;
        Object obj = null;
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af == 255) {
                    return obj != null ? Integer.valueOf(i2) : null;
                } else {
                    if (af == 0) {
                        while (ljVar.af(1804771424) != 255) {
                            ljVar.al += 879823907;
                            if (ljVar.an(-1464407032) != 0) {
                                throw new IllegalStateException("");
                            } else if (obj == null) {
                                i2 = ljVar.at((byte) -34);
                                obj = 1;
                            } else {
                                throw new IllegalStateException("");
                            }
                        }
                    }
                    throw new IllegalStateException("");
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lj.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public static int cd(byte[] bArr, int i) {
        return hd.ad(bArr, 0, i, 432668889);
    }

    public static int cf(byte[] bArr, int i) {
        return hd.ad(bArr, 0, i, -2104472166);
    }

    static int cl(byte[] bArr, int i, int i2) {
        int i3 = -1;
        while (i < i2) {
            i3 = (i3 >>> 8) ^ aj[(bArr[i] ^ i3) & 255];
            i++;
        }
        return i3;
    }

    static int co(byte[] bArr, int i, int i2) {
        int i3 = -1;
        while (i < i2) {
            i3 = (i3 >>> 8) ^ aj[(bArr[i] ^ i3) & 255];
            i++;
        }
        return i3;
    }

    static int cu(byte[] bArr, int i, int i2) {
        int i3 = -1;
        while (i < i2) {
            i3 = (i3 >>> 8) ^ aj[(bArr[i] ^ i3) & -81539241];
            i++;
        }
        return i3;
    }

    public static int cz(byte[] bArr, int i) {
        return hd.ad(bArr, 0, i, 594353098);
    }

    public static int dq(String str) {
        return str.length() + 2;
    }

    public static int dx(String str) {
        return str.length() + 2;
    }

    public static int dy(String str) {
        return str.length() + 2;
    }

    public void aa(int i, byte b) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException();
        }
        try {
            this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ab(int i) {
        try {
            this.al -= 1759647814;
            int i2 = ((this.ar[(this.al * -1631454091) - 2] & 255) << 8) + (this.ar[(this.al * -1631454091) - 1] & 255);
            return i2 > 32767 ? i2 - 65536 : i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ac(int i, int i2) {
        if (i < 0 || i > SupportMenu.USER_MASK) {
            throw new IllegalArgumentException();
        }
        try {
            this.ar[((this.al * -1631454091) - i) - 2] = (byte) (i >> 8);
            this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ae(int i, byte b) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int af(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return bArr[(i2 * -1631454091) - 1] & 255;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ah(int i, int i2) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((-2097152 & i) != 0) {
                    if ((-268435456 & i) != 0) {
                        try {
                            al((i >>> 28) | 128, -387699686);
                        } catch (RuntimeException e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("lj.ah(");
                            stringBuilder.append(')');
                            throw mv.aq(e, stringBuilder.toString());
                        }
                    }
                    al((i >>> 21) | 128, 21775021);
                }
                al((i >>> 14) | 128, -220476253);
            }
            al((i >>> 7) | 128, -831472637);
        }
        al(i & 127, -452070337);
    }

    public void ai(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 16);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 8);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aj(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 8);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak(long j) {
        try {
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 56));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 48));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 40));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 32));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 24));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 16));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 8));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) j);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void am(long j) {
        try {
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 40));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 32));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 24));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 16));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 8));
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) ((int) j);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int an(int i) {
        try {
            this.al -= 1759647814;
            return ((this.ar[(this.al * -1631454091) - 2] & 255) << 8) + (this.ar[(this.al * -1631454091) - 1] & 255);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ao(int i, int i2) {
        if (i >= 0 && i < 128) {
            try {
                al(i, -1786005574);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lj.ao(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aj(i + 32768, -1837121284);
        }
    }

    public void ap(String str, int i) {
        try {
            if (str.indexOf(0) < 0) {
                this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * -1631454091, 2014964035) * -879823907) + this.al;
                byte[] bArr = this.ar;
                int i2 = this.al - 879823907;
                this.al = i2;
                bArr[(i2 * -1631454091) - 1] = (byte) 0;
                return;
            }
            throw new IllegalArgumentException("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(int i) {
        try {
            if (this.ar != null) {
                fg.al(this.ar, 368700281);
            }
            this.ar = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(boolean z, byte b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public int at(byte b) {
        try {
            this.al += 775671668;
            return (this.ar[(this.al * -1631454091) - 1] & 255) + ((((this.ar[(this.al * -1631454091) - 4] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 3] & 255) << 16)) + ((this.ar[(this.al * -1631454091) - 2] & 255) << 8));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int av(byte b) {
        try {
            this.al += 1655495575;
            return (this.ar[(this.al * -1631454091) - 1] & 255) + (((this.ar[(this.al * -1631454091) - 3] & 255) << 16) + ((this.ar[(this.al * -1631454091) - 2] & 255) << 8));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aw(int i, int i2) {
        if (i >= 0) {
            try {
                this.ar[((this.al * -1631454091) - i) - 4] = (byte) (i >> 24);
                this.ar[((this.al * -1631454091) - i) - 3] = (byte) (i >> 16);
                this.ar[((this.al * -1631454091) - i) - 2] = (byte) (i >> 8);
                this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lj.aw(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        throw new IllegalArgumentException();
    }

    public void ax(byte[] bArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i2 + i) {
            try {
                byte[] bArr2 = this.ar;
                int i5 = this.al - 879823907;
                this.al = i5;
                bArr2[(i5 * -1631454091) - 1] = bArr[i4];
                i4++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lj.ax(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public byte ay(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return bArr[(i2 * -1631454091) - 1];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void az(String str, byte b) {
        try {
            if (str.indexOf(0) < 0) {
                byte[] bArr = this.ar;
                int i = this.al - 879823907;
                this.al = i;
                bArr[(i * -1631454091) - 1] = (byte) 0;
                this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * -1631454091, -1070521031) * -879823907) + this.al;
                bArr = this.ar;
                i = this.al - 879823907;
                this.al = i;
                bArr[(i * -1631454091) - 1] = (byte) 0;
                return;
            }
            throw new IllegalArgumentException("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ba(int i) {
        try {
            return (af(1804771424) & 1) == 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bb(int i) {
        try {
            return this.ar[this.al * -1631454091] < (byte) 0 ? at((byte) -92) & Integer.MAX_VALUE : an(-1464407032);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bc(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            int i3 = bArr[(i2 * -1631454091) - 1];
            i2 = 0;
            while (i3 < 0) {
                i2 = ((i3 & 127) | i2) << 7;
                bArr = this.ar;
                int i4 = this.al - 879823907;
                this.al = i4;
                i3 = bArr[(i4 * -1631454091) - 1];
            }
            return i3 | i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bd(byte[] bArr, int i, int i2, byte b) {
        int i3 = i;
        while (i3 < i + i2) {
            try {
                byte[] bArr2 = this.ar;
                int i4 = this.al - 879823907;
                this.al = i4;
                bArr[i3] = bArr2[(i4 * -1631454091) - 1];
                i3++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lj.bd(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean be(int i) {
        try {
            this.al -= 775671668;
            return at((byte) -95) == hd.ad(this.ar, 0, this.al * -1631454091, -989782018);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.be(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bf(byte b) {
        int i = 0;
        try {
            int bl = bl(2131034147);
            while (bl == 32767) {
                i += 32767;
                bl = bl(2131034147);
            }
            return i + bl;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bg(int[] iArr, int i) {
        try {
            int i2 = (this.al * -1631454091) / 8;
            this.al = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                int at = at((byte) -64);
                int at2 = at((byte) -84);
                int i4 = -957401312;
                for (int i5 = 32; i5 > 0; i5--) {
                    at2 -= (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i4 >>> 11) & 3] + i4);
                    i4 += 1640531527;
                    at -= (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i4 & 3] + i4);
                }
                this.al -= 1551343336;
                ae(at, (byte) 90);
                ae(at2, (byte) 117);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bh(int i, byte b) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (0 - i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bi(int i) {
        try {
            if (this.ar[this.al * -1631454091] < (byte) 0) {
                return at((byte) -16) & Integer.MAX_VALUE;
            }
            int an = an(-1464407032);
            return 32767 == an ? -1 : an;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bj(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i + 128);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public long bk(int i) {
        try {
            return ((((long) at((byte) -82)) & 4294967295L) << 32) + (((long) at((byte) -24)) & 4294967295L);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bl(int i) {
        try {
            return (this.ar[this.al * -1631454091] & 255) < 128 ? af(1804771424) : an(-1464407032) - 32768;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String bm(int i) {
        try {
            int i2 = this.al * -1631454091;
            byte[] bArr;
            int i3;
            do {
                bArr = this.ar;
                i3 = this.al - 879823907;
                this.al = i3;
            } while (bArr[(i3 * -1631454091) - 1] != (byte) 0);
            int i4 = ((this.al * -1631454091) - i2) - 1;
            return i4 == 0 ? "" : eq.ai(this.ar, i2, i4, -1564982676);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bn(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return (bArr[(i2 * -1631454091) - 1] - 128) & 255;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bo(byte b) {
        try {
            return (this.ar[this.al * -1631454091] & 255) < 128 ? af(1804771424) - 64 : an(-1464407032) - 49152;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public byte bp(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return (byte) (bArr[(i2 * -1631454091) - 1] - 128);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String bq(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            if (bArr[(i2 * -1631454091) - 1] == (byte) 0) {
                int i3 = this.al * -1631454091;
                byte[] bArr2;
                int i4;
                do {
                    bArr2 = this.ar;
                    i4 = this.al - 879823907;
                    this.al = i4;
                } while (bArr2[(i4 * -1631454091) - 1] != (byte) 0);
                i2 = ((this.al * -1631454091) - i3) - 1;
                return i2 == 0 ? "" : eq.ai(this.ar, i3, i2, 1654572176);
            } else {
                throw new IllegalStateException("");
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int br(int i, int i2) {
        try {
            int ad = hd.ad(this.ar, i, this.al * -1631454091, -383055499);
            ae(ad, (byte) 17);
            return ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.br(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String bs(int i) {
        try {
            if (this.ar[this.al * -1631454091] != (byte) 0) {
                return bm(1138651525);
            }
            this.al -= 879823907;
            return null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bt(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (128 - i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bu(int[] iArr, int i, int i2, int i3) {
        try {
            int i4 = this.al;
            this.al = i * -879823907;
            int i5 = (i2 - i) / 8;
            for (int i6 = 0; i6 < i5; i6++) {
                int at = at((byte) -75);
                int at2 = at((byte) -117);
                int i7 = -957401312;
                for (int i8 = 32; i8 > 0; i8--) {
                    at2 -= (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i7 >>> 11) & 3] + i7);
                    i7 += 1640531527;
                    at -= (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i7 & 3] + i7);
                }
                this.al -= 1551343336;
                ae(at, (byte) 47);
                ae(at2, (byte) 121);
            }
            this.al = (-1631454091 * i4) * -879823907;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bv(int[] iArr, byte b) {
        try {
            int i = (this.al * -1631454091) / 8;
            this.al = 0;
            for (int i2 = 0; i2 < i; i2++) {
                int at = at((byte) -121);
                int at2 = at((byte) -58);
                int i3 = 0;
                for (int i4 = 32; i4 > 0; i4--) {
                    at += (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i3 & 3] + i3);
                    i3 -= 1640531527;
                    at2 += (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i3 >>> 11) & 3] + i3);
                }
                this.al -= 1551343336;
                ae(at, (byte) 57);
                ae(at2, (byte) 117);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bw(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        try {
            int i2 = this.al * -1631454091;
            this.al = 0;
            byte[] bArr = new byte[i2];
            bd(bArr, 0, i2, (byte) 0);
            byte[] toByteArray = new BigInteger(bArr).modPow(bigInteger, bigInteger2).toByteArray();
            this.al = 0;
            aj(toByteArray.length, 396354567);
            ax(toByteArray, 0, toByteArray.length, -7954463);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bx(int[] iArr, int i, int i2, int i3) {
        try {
            int i4 = this.al;
            this.al = i * -879823907;
            int i5 = (i2 - i) / 8;
            for (int i6 = 0; i6 < i5; i6++) {
                int at = at((byte) 0);
                int at2 = at((byte) -18);
                int i7 = 0;
                for (int i8 = 32; i8 > 0; i8--) {
                    at += (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i7 & 3] + i7);
                    i7 -= 1640531527;
                    at2 += (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i7 >>> 11) & 3] + i7);
                }
                this.al -= 1551343336;
                ae(at, (byte) 124);
                ae(at2, (byte) 47);
            }
            this.al = (-1631454091 * i4) * -879823907;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int by(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return (128 - bArr[(i2 * -1631454091) - 1]) & 255;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.by(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bz(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return (0 - bArr[(i2 * -1631454091) - 1]) & 255;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.bz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ca(short s) {
        try {
            this.al += 775671668;
            return ((((this.ar[(this.al * -1631454091) - 2] & 255) << 16) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 24)) + ((this.ar[(this.al * -1631454091) - 3] & 255) << 8)) + (this.ar[(this.al * -1631454091) - 4] & 255);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ca(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int cb(byte b) {
        try {
            this.al -= 1759647814;
            int i = ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + (this.ar[(this.al * -1631454091) - 2] & 255);
            return i > 32767 ? i - 65536 : i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cc(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) i;
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 8);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 16);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 24);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ce(int i) {
        try {
            this.al -= 1759647814;
            int i2 = ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + ((this.ar[(this.al * -1631454091) - 2] - 128) & 255);
            return i2 > 32767 ? i2 - 65536 : i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ce(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cg() {
        if (this.ar != null) {
            fg.al(this.ar, -472869825);
        }
        this.ar = null;
    }

    public void ch() {
        if (this.ar != null) {
            fg.al(this.ar, -1518607200);
        }
        this.ar = null;
    }

    public int ci(int i) {
        try {
            this.al -= 1759647814;
            return ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + ((this.ar[(this.al * -1631454091) - 2] - 128) & 255);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ci(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public byte cj(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return (byte) (128 - bArr[(i2 * -1631454091) - 1]);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ck(byte[] bArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i + i2) {
            try {
                byte[] bArr2 = this.ar;
                int i5 = this.al - 879823907;
                this.al = i5;
                bArr[i4] = (byte) (bArr2[(i5 * -1631454091) - 1] - 128);
                i4++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lj.ck(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void cm(int i, byte b) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) i;
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cn(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i + 128);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 8);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int cp(int i) {
        try {
            this.al -= 1759647814;
            return ((this.ar[(this.al * -1631454091) - 1] - 128) & 255) + ((this.ar[(this.al * -1631454091) - 2] & 255) << 8);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cq(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 8);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i + 128);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cr(int i, byte b) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) i;
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
            bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cr(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cs(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 8);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) i;
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 24);
            bArr = this.ar;
            i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (i >> 16);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ct(int i) {
        try {
            this.al += 775671668;
            return (((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + (((this.ar[(this.al * -1631454091) - 3] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 4] & 255) << 16))) + (this.ar[(this.al * -1631454091) - 2] & 255);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.ct(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public byte cv(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return (byte) (0 - bArr[(i2 * -1631454091) - 1]);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int cw(int i) {
        try {
            this.al -= 1759647814;
            return ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + (this.ar[(this.al * -1631454091) - 2] & 255);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int cx(byte b) {
        try {
            this.al += 775671668;
            return (this.ar[(this.al * -1631454091) - 3] & 255) + (((this.ar[(this.al * -1631454091) - 4] & 255) << 8) + (((this.ar[(this.al * -1631454091) - 2] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 16)));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int cy(int i) {
        try {
            this.al += 1655495575;
            return (this.ar[(this.al * -1631454091) - 3] & 255) + (((this.ar[(this.al * -1631454091) - 2] & 255) << 8) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 16));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lj.cy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void da(long j) {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        bArr[(i * 1724091982) - 1] = (byte) ((int) (j >> 966304933));
        bArr = this.ar;
        i = this.al - 879823907;
        this.al = i;
        bArr[(i * 1292710067) - 1] = (byte) ((int) (j >> -1348504739));
        bArr = this.ar;
        i = this.al - 2016620824;
        this.al = i;
        bArr[(i * 1076243069) - 1] = (byte) ((int) (j >> 24));
        bArr = this.ar;
        i = this.al + 331759841;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 16));
        bArr = this.ar;
        i = this.al + 1594499808;
        this.al = i;
        bArr[(i * 1587250745) - 1] = (byte) ((int) (j >> 8));
        bArr = this.ar;
        i = this.al - 879823907;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) j);
    }

    public void db(boolean z) {
        al(z ? 1 : 0, -1643887989);
    }

    public void dc(boolean z) {
        al(z ? 1 : 0, -119978708);
    }

    public void dd(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
    }

    public void de(String str) {
        if (str.indexOf(0) < 0) {
            this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * -1631454091, -22458919) * -879823907) + this.al;
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void df(long j) {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 40));
        bArr = this.ar;
        i = this.al - 879823907;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 32));
        bArr = this.ar;
        i = this.al - 879823907;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 24));
        bArr = this.ar;
        i = this.al - 879823907;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 16));
        bArr = this.ar;
        i = this.al - 879823907;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) (j >> 8));
        bArr = this.ar;
        i = this.al - 879823907;
        this.al = i;
        bArr[(i * -1631454091) - 1] = (byte) ((int) j);
    }

    public void dg(String str) {
        if (str.indexOf(0) < 0) {
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * 1633958361) - 1] = (byte) 0;
            this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * -1631454091, -402818382) * 345118688) + this.al;
            bArr = this.ar;
            i = this.al - 1138674333;
            this.al = i;
            bArr[(i * -410681473) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void dh(String str) {
        if (str.indexOf(0) < 0) {
            this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * -1631454091, -1286578992) * -879823907) + this.al;
            byte[] bArr = this.ar;
            int i = this.al + 1553487435;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void di(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * 2146363532) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1812028653) - 1] = (byte) i;
    }

    public void dj(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i2 + i; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 722346531;
            this.al = i4;
            bArr2[(i4 * -1631454091) - 1] = bArr[i3];
        }
    }

    public void dk(String str) {
        if (str.indexOf(0) < 0) {
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * -1631454091, 1956157266) * -879823907) + this.al;
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void dl(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
    }

    public void dm(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al + 482751051;
        this.al = i2;
        bArr[(i2 * -93476173) - 1] = (byte) i;
    }

    public void dn(boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* renamed from: do */
    public void m230do(String str) {
        if (str.indexOf(0) < 0) {
            this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * 609136827, 1552725512) * 99101732) + this.al;
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void dp(boolean z) {
        al(z ? 1 : 0, -1032026801);
    }

    public void dr(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * 389142539) - 1] = (byte) (i >> 24);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * 391286160) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1071542322) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al + 17403697;
        this.al = i2;
        bArr[(i2 * 635409709) - 1] = (byte) i;
    }

    public void ds(String str) {
        if (str.indexOf(0) < 0) {
            this.al = (gl.aj(str, 0, str.length(), this.ar, this.al * -1631454091, -1309951852) * -879823907) + this.al;
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void dt(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
    }

    public void du(boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public void dv(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
    }

    public void dw(String str) {
        if (str.indexOf(0) < 0) {
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            this.al = (gl.aj(str, 0, str.length(), this.ar, 2132392800 * this.al, 1009809665) * -127314529) + this.al;
            bArr = this.ar;
            i = this.al - 838781976;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void dz(String str) {
        if (str.indexOf(0) < 0) {
            byte[] bArr = this.ar;
            int i = this.al + 820150275;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            this.al = (gl.aj(str, 0, str.length(), this.ar, -280990000 * this.al, 642668526) * -879823907) + this.al;
            bArr = this.ar;
            i = this.al - 879823907;
            this.al = i;
            bArr[(i * -1631454091) - 1] = (byte) 0;
            return;
        }
        throw new IllegalArgumentException("");
    }

    public void ea(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException();
        }
        this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
    }

    public byte eb() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return bArr[(i * -1631454091) - 1];
    }

    public void ec(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException();
        }
        this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
    }

    public void ed(int i) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((-2097152 & i) != 0) {
                    if ((-268435456 & i) != 0) {
                        al((i >>> 28) | 128, -1034932247);
                    }
                    al((i >>> 21) | 128, -1866503658);
                }
                al((i >>> 14) | 128, -1164215587);
            }
            al((i >>> 7) | 128, -1424484810);
        }
        al(i & 127, -1404648214);
    }

    public int ee() {
        byte[] bArr = this.ar;
        int i = this.al + 692309401;
        this.al = i;
        return bArr[(i * -1631454091) - 1] & 1573865057;
    }

    public int ef() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1631454091) - 2] & -458257273) << 8) + (this.ar[(this.al * -1631454091) - 1] & 1628114352);
    }

    public void eg(int i) {
        if ((-1966953309 & i) != 0) {
            if ((1302162352 & i) != 0) {
                if ((119314308 & i) != 0) {
                    if ((710139825 & i) != 0) {
                        al((i >>> 28) | -186779453, -1933483876);
                    }
                    al((i >>> 21) | -419787510, -1332500379);
                }
                al((i >>> 14) | 128, -601793791);
            }
            al((i >>> 7) | -856055519, -643740554);
        }
        al(i & 127, -1472782213);
    }

    public void eh(int i) {
        if (i < 0 || i > SupportMenu.USER_MASK) {
            throw new IllegalArgumentException();
        }
        this.ar[((this.al * -1631454091) - i) - 2] = (byte) (i >> 8);
        this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
    }

    public void ei(int i) {
        if (i >= 0 && i < 128) {
            al(i, -1159512906);
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aj(i + 32768, -1586102749);
        }
    }

    public int ej() {
        this.al += 1655495575;
        return (this.ar[(this.al * 274560348) - 1] & -1852296767) + (((this.ar[(this.al * -1631454091) - 3] & 1461631748) << 16) + ((this.ar[(this.al * -1905255894) - 2] & 2138632077) << 8));
    }

    public void ek(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException();
        }
        this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
    }

    public byte el() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return bArr[(i * -204063880) - 1];
    }

    public int em() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1631454091) - 2] & 238454392) << 8) + (this.ar[(this.al * -1631454091) - 1] & 614752134);
    }

    public void en(int i) {
        if (i >= 0 && i < 128) {
            al(i, -2036311989);
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aj(i + 32768, 580304094);
        }
    }

    public void eo(int i) {
        if (i >= 0) {
            this.ar[((this.al * -1631454091) - i) - 4] = (byte) (i >> 24);
            this.ar[((this.al * -1631454091) - i) - 3] = (byte) (i >> 16);
            this.ar[((this.al * -1631454091) - i) - 2] = (byte) (i >> 8);
            this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int ep() {
        this.al -= 1131973060;
        return ((this.ar[(this.al * -1631454091) - 2] & 255) << 8) + (this.ar[(this.al * -1631454091) - 1] & 472623626);
    }

    public void eq(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i2 + i; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr2[(i4 * 307151686) - 1] = bArr[i3];
        }
    }

    public int er() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return bArr[(i * -732576617) - 1] & -2030871759;
    }

    public int es() {
        this.al -= 505848431;
        return (this.ar[(this.al * 2036416630) - 1] & 255) + (((this.ar[(this.al * -1631454091) - 3] & -1268922742) << 16) + ((this.ar[(this.al * -1631454091) - 2] & 653013622) << 8));
    }

    public void et(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i2 + i; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr2[(i4 * -1631454091) - 1] = bArr[i3];
        }
    }

    public int eu() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return bArr[(i * -1631454091) - 1] & 255;
    }

    public byte ev() {
        byte[] bArr = this.ar;
        int i = this.al + 267191380;
        this.al = i;
        return bArr[(i * -1631454091) - 1];
    }

    public byte ew() {
        byte[] bArr = this.ar;
        int i = this.al + 931459152;
        this.al = i;
        return bArr[(i * 343557461) - 1];
    }

    public int ex() {
        this.al -= 711133573;
        int i = ((this.ar[(this.al * -1631454091) - 2] & 255) << 8) + (this.ar[(this.al * 641042357) - 1] & 35661464);
        return i > 32767 ? i - 196248316 : i;
    }

    public void ey(int i) {
        if (i >= 0 && i < -2002964922) {
            al(i, -488805690);
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aj(i - 2063610797, -1677948021);
        }
    }

    public void ez(int i) {
        if (i >= 0) {
            this.ar[((this.al * -1631454091) - i) - 4] = (byte) (i >> 24);
            this.ar[((this.al * -1631454091) - i) - 3] = (byte) (i >> 16);
            this.ar[((this.al * -1631454091) - i) - 2] = (byte) (i >> 8);
            this.ar[((this.al * -1631454091) - i) - 1] = (byte) i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public String fb() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        if (bArr[(i * -1631454091) - 1] == (byte) 0) {
            int i2 = this.al * -1631454091;
            byte[] bArr2;
            int i3;
            do {
                bArr2 = this.ar;
                i3 = this.al - 879823907;
                this.al = i3;
            } while (bArr2[(i3 * -1631454091) - 1] != (byte) 0);
            i = ((this.al * -1631454091) - i2) - 1;
            return i == 0 ? "" : eq.ai(this.ar, i2, i, 1281247055);
        } else {
            throw new IllegalStateException("");
        }
    }

    public String fc() {
        byte[] bArr = this.ar;
        int i = this.al - 542288625;
        this.al = i;
        if (bArr[(i * -23539096) - 1] == (byte) 0) {
            int i2 = this.al * -2059340734;
            byte[] bArr2;
            int i3;
            do {
                bArr2 = this.ar;
                i3 = this.al - 879823907;
                this.al = i3;
            } while (bArr2[(i3 * -1631454091) - 1] != (byte) 0);
            i = ((this.al * 1300804618) - i2) - 1;
            return i == 0 ? "" : eq.ai(this.ar, i2, i, 404691423);
        } else {
            throw new IllegalStateException("");
        }
    }

    public void fe(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr[i3] = bArr2[(i4 * -1631454091) - 1];
        }
    }

    public String fg() {
        if (this.ar[this.al * -1631454091] != (byte) 0) {
            return bm(1355700963);
        }
        this.al -= 879823907;
        return null;
    }

    public String fh() {
        if (this.ar[this.al * -384365291] != (byte) 0) {
            return bm(1785641536);
        }
        this.al -= 879823907;
        return null;
    }

    public String fi() {
        int i = this.al * -1631454091;
        byte[] bArr;
        int i2;
        do {
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
        } while (bArr[(i2 * -1631454091) - 1] != (byte) 0);
        int i3 = ((this.al * -1631454091) - i) - 1;
        return i3 == 0 ? "" : eq.ai(this.ar, i, i3, 326137199);
    }

    public String fj() {
        int i = this.al * -16904497;
        byte[] bArr;
        int i2;
        do {
            bArr = this.ar;
            i2 = this.al + 1406076682;
            this.al = i2;
        } while (bArr[(i2 * -125715005) - 1] != (byte) 0);
        int i3 = ((this.al * 1499554588) - i) - 1;
        return i3 == 0 ? "" : eq.ai(this.ar, i, i3, -53220172);
    }

    public int fk() {
        return (this.ar[this.al * -1631454091] & 255) < 128 ? af(1804771424) - 64 : an(-1464407032) - 49152;
    }

    public void fl(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr[i3] = bArr2[(i4 * 841794145) - 1];
        }
    }

    public String fm() {
        if (this.ar[this.al * 143870798] != (byte) 0) {
            return bm(1693631138);
        }
        this.al -= 918327907;
        return null;
    }

    public boolean fn() {
        return (af(1804771424) & 1) == 1;
    }

    public void fo(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr[i3] = bArr2[(i4 * -1631454091) - 1];
        }
    }

    public String fp() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        if (bArr[(i * -1631454091) - 1] == (byte) 0) {
            int i2 = this.al * -1631454091;
            byte[] bArr2;
            int i3;
            do {
                bArr2 = this.ar;
                i3 = this.al + 590733433;
                this.al = i3;
            } while (bArr2[(i3 * -431404085) - 1] != (byte) 0);
            i = ((this.al * -1631454091) - i2) - 1;
            return i == 0 ? "" : eq.ai(this.ar, i2, i, -139271576);
        } else {
            throw new IllegalStateException("");
        }
    }

    public int fq() {
        this.al += 775671668;
        return (this.ar[(this.al * -1631454091) - 1] & 255) + ((((this.ar[(this.al * -1631454091) - 4] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 3] & 255) << 16)) + ((this.ar[(this.al * -1631454091) - 2] & 255) << 8));
    }

    public String fs() {
        if (this.ar[this.al * -1631454091] != (byte) 0) {
            return bm(1694731625);
        }
        this.al -= 879823907;
        return null;
    }

    public boolean ft() {
        return (af(1804771424) & 1) == 1;
    }

    public String fu() {
        int i = this.al * -1631454091;
        byte[] bArr;
        int i2;
        do {
            bArr = this.ar;
            i2 = this.al - 879823907;
            this.al = i2;
        } while (bArr[(i2 * -1631454091) - 1] != (byte) 0);
        int i3 = ((this.al * -1631454091) - i) - 1;
        return i3 == 0 ? "" : eq.ai(this.ar, i, i3, -1809933131);
    }

    public boolean fw() {
        return (af(1804771424) & 1) == 1;
    }

    public long fx() {
        return ((((long) at((byte) -6)) & 4294967295L) << 32) + (((long) at((byte) -3)) & 4294967295L);
    }

    public int ga() {
        byte[] bArr = this.ar;
        int i = this.al - 1238380336;
        this.al = i;
        i = bArr[(i * -1631454091) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 127)) << 7;
            byte[] bArr2 = this.ar;
            int i3 = this.al + 24622954;
            this.al = i3;
            i = bArr2[(i3 * -1631454091) - 1];
        }
        return i2 | i;
    }

    public int gb() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        i = bArr[(i * -1631454091) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & -1666614982)) << 7;
            byte[] bArr2 = this.ar;
            int i3 = this.al - 2094718278;
            this.al = i3;
            i = bArr2[(i3 * -1651204116) - 1];
        }
        return i2 | i;
    }

    public int gc() {
        return (this.ar[this.al * -1631454091] & -1137496465) < 128 ? af(1804771424) - 64 : an(-1464407032) - 875905747;
    }

    public void gd(int[] iArr, int i, int i2) {
        int i3 = this.al;
        this.al = i * -879823907;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int at = at((byte) -64);
            int at2 = at((byte) -29);
            int i6 = 0;
            for (int i7 = 32; i7 > 0; i7--) {
                at += (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i6 & 3] + i6);
                i6 -= 1640531527;
                at2 += (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i6 >>> 11) & 3] + i6);
            }
            this.al -= 1551343336;
            ae(at, (byte) 115);
            ae(at2, (byte) 97);
        }
        this.al = (-1631454091 * i3) * -879823907;
    }

    public int ge() {
        if (this.ar[this.al * -377198059] < (byte) 0) {
            return at((byte) -103) & Integer.MAX_VALUE;
        }
        int an = an(-1464407032);
        return 32767 == an ? -1 : an;
    }

    public void gf(int[] iArr) {
        int i = (this.al * -1631454091) / 8;
        this.al = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int at = at((byte) -23);
            int at2 = at((byte) -1);
            int i3 = -957401312;
            for (int i4 = 32; i4 > 0; i4--) {
                at2 -= (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i3 >>> 11) & 3] + i3);
                i3 += 1640531527;
                at -= (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i3 & 3] + i3);
            }
            this.al -= 1551343336;
            ae(at, (byte) 119);
            ae(at2, (byte) 11);
        }
    }

    public void gg(int[] iArr) {
        int i = 0;
        int i2 = (this.al * 817415908) / 8;
        this.al = 0;
        while (i < i2) {
            int at = at((byte) -61);
            int at2 = at((byte) -25);
            this.al -= 1551343336;
            ae(at, (byte) 36);
            ae(at2, (byte) 38);
            i++;
        }
    }

    public int gh() {
        int bl = bl(2131034147);
        int i = 0;
        while (bl == 32767) {
            i += 32767;
            bl = bl(2131034147);
        }
        return i + bl;
    }

    public int gi() {
        return this.ar[this.al * 1403929498] < (byte) 0 ? at((byte) -29) & -791857148 : an(-1464407032);
    }

    public int gj() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        i = bArr[(i * -1059946448) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 127)) << 7;
            byte[] bArr2 = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            i = bArr2[(i3 * -1631454091) - 1];
        }
        return i2 | i;
    }

    public void gk(int[] iArr) {
        int i = (this.al * 1449680805) / 8;
        this.al = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int at = at((byte) -68);
            int at2 = at((byte) -45);
            int i3 = 0;
            for (int i4 = 32; i4 > 0; i4--) {
                at += (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i3 & 3] + i3);
                i3 -= 1640531527;
                at2 += (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i3 >>> 11) & 3] + i3);
            }
            this.al -= 1551343336;
            ae(at, (byte) 106);
            ae(at2, (byte) 53);
        }
    }

    public int gl() {
        return (this.ar[this.al * -1820405957] & 255) < 128 ? af(1804771424) : an(-1464407032) - 1521835631;
    }

    public void gm(int[] iArr) {
        int i = 0;
        int i2 = (this.al * -1302450784) / 8;
        this.al = 0;
        while (i < i2) {
            int at = at((byte) -114);
            int at2 = at((byte) -58);
            this.al -= 765375638;
            ae(at, (byte) 7);
            ae(at2, (byte) 64);
            i++;
        }
    }

    public int gn() {
        return this.ar[this.al * -1631454091] < (byte) 0 ? at((byte) -43) & Integer.MAX_VALUE : an(-1464407032);
    }

    public int go() {
        int bl = bl(2131034147);
        int i = 0;
        while (bl == 32767) {
            i += 32767;
            bl = bl(2131034147);
        }
        return i + bl;
    }

    public int gp() {
        return (this.ar[this.al * -1631454091] & 1910036473) < -1462250264 ? af(1804771424) : an(-1464407032) - 32768;
    }

    public void gq(int[] iArr) {
        int i = (this.al * -1177846407) / 8;
        this.al = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int at = at((byte) -72);
            int at2 = at(Byte.MIN_VALUE);
            int i3 = 221206000;
            for (int i4 = 1869801012; i4 > 0; i4--) {
                at2 -= (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i3 >>> 11) & 3] + i3);
                i3 += 1640531527;
                at -= (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i3 & 3] + i3);
            }
            this.al -= 1700450765;
            ae(at, (byte) 9);
            ae(at2, (byte) 113);
        }
    }

    public int gr() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        i = bArr[(i * -1631454091) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 127)) << 7;
            byte[] bArr2 = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            i = bArr2[(i3 * -1631454091) - 1];
        }
        return i2 | i;
    }

    public int gs() {
        return this.ar[this.al * -1631454091] < (byte) 0 ? at((byte) -70) & 783314434 : an(-1464407032);
    }

    public void gt(int[] iArr) {
        int i = (this.al * -1631454091) / 8;
        this.al = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int at = at((byte) -40);
            int at2 = at((byte) -58);
            int i3 = 0;
            for (int i4 = 32; i4 > 0; i4--) {
                at += (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i3 & 3] + i3);
                i3 -= 1640531527;
                at2 += (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i3 >>> 11) & 3] + i3);
            }
            this.al -= 1551343336;
            ae(at, (byte) 16);
            ae(at2, (byte) 38);
        }
    }

    public int gu() {
        if (this.ar[this.al * -1631454091] < (byte) 0) {
            return at((byte) -119) & Integer.MAX_VALUE;
        }
        int an = an(-1464407032);
        return 32767 == an ? -1 : an;
    }

    public int gv() {
        return this.ar[this.al * -1631454091] < (byte) 0 ? at((byte) -46) & Integer.MAX_VALUE : an(-1464407032);
    }

    public int gw() {
        return (this.ar[this.al * 1728595994] & 255) < 1059075774 ? af(1804771424) - 767497233 : an(-1464407032) - 49152;
    }

    public void gx(int[] iArr, int i, int i2) {
        int i3 = this.al;
        this.al = -879823907 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int at = at((byte) -44);
            int at2 = at((byte) -60);
            int i6 = -957401312;
            for (int i7 = 1898175836; i7 > 0; i7--) {
                at2 -= (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i6 >>> 11) & 3] + i6);
                i6 += 1167948977;
                at -= (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i6 & 3] + i6);
            }
            this.al -= 1551343336;
            ae(at, (byte) 78);
            ae(at2, (byte) 124);
        }
        this.al = (2017440440 * i3) * -723456464;
    }

    public void gy(int[] iArr) {
        int i = (this.al * -1834044870) / 8;
        this.al = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int at = at((byte) 0);
            int at2 = at((byte) -101);
            int i3 = -957401312;
            for (int i4 = 1427665993; i4 > 0; i4--) {
                at2 -= (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i3 >>> 11) & 3] + i3);
                i3 -= 1211066539;
                at -= (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i3 & 3] + i3);
            }
            this.al -= 493860412;
            ae(at, (byte) 19);
            ae(at2, (byte) 79);
        }
    }

    public int gz() {
        if (this.ar[this.al * -2024076787] < (byte) 0) {
            return at((byte) -32) & Integer.MAX_VALUE;
        }
        int an = an(-1464407032);
        return 32767 == an ? -1 : an;
    }

    public void ha(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (0 - i);
    }

    public int hb() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (128 - bArr[(i * -1631454091) - 1]) & 255;
    }

    public void hc(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = this.al * -1631454091;
        this.al = 0;
        byte[] bArr = new byte[i];
        bd(bArr, 0, i, (byte) 0);
        byte[] toByteArray = new BigInteger(bArr).modPow(bigInteger, bigInteger2).toByteArray();
        this.al = 0;
        aj(toByteArray.length, 868818061);
        ax(toByteArray, 0, toByteArray.length, 1286059035);
    }

    public int hd(int i) {
        int ad = hd.ad(this.ar, i, this.al * 1560894449, 467529581);
        ae(ad, (byte) 111);
        return ad;
    }

    public void he(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al + 763520680;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (0 - i);
    }

    public boolean hf() {
        this.al -= 775671668;
        return at((byte) -16) == hd.ad(this.ar, 0, this.al * -1631454091, -1590243629);
    }

    public void hg(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = this.al * 1732804016;
        this.al = 0;
        byte[] bArr = new byte[i];
        bd(bArr, 0, i, (byte) 0);
        byte[] toByteArray = new BigInteger(bArr).modPow(bigInteger, bigInteger2).toByteArray();
        this.al = 0;
        aj(toByteArray.length, 782001436);
        ax(toByteArray, 0, toByteArray.length, -1137248034);
    }

    public boolean hh() {
        this.al -= 775671668;
        return at((byte) -117) == hd.ad(this.ar, 0, this.al * -1631454091, -1563238661);
    }

    public void hi(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 261308119;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (0 - i);
    }

    public byte hj() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (byte) (0 - bArr[(i * -1631454091) - 1]);
    }

    public boolean hk() {
        this.al -= 775671668;
        return at((byte) -66) == hd.ad(this.ar, 0, this.al * -1631454091, 2023924823);
    }

    public byte hl() {
        byte[] bArr = this.ar;
        int i = this.al - 1305689057;
        this.al = i;
        return (byte) (0 - bArr[(i * 1841791660) - 1]);
    }

    public int hm() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (0 - bArr[(i * -1631454091) - 1]) & -1858279086;
    }

    public byte hn() {
        byte[] bArr = this.ar;
        int i = this.al + 1047219278;
        this.al = i;
        return (byte) (bArr[(i * -1629829430) - 1] - 128);
    }

    public int ho() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (0 - bArr[(i * -1631454091) - 1]) & 255;
    }

    public void hp(int[] iArr, int i, int i2) {
        int i3 = this.al;
        this.al = i * -879823907;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int at = at((byte) -104);
            int at2 = at((byte) -112);
            int i6 = -957401312;
            for (int i7 = 32; i7 > 0; i7--) {
                at2 -= (((at << 4) ^ (at >>> 5)) + at) ^ (iArr[(i6 >>> 11) & 3] + i6);
                i6 += 1640531527;
                at -= (((at2 << 4) ^ (at2 >>> 5)) + at2) ^ (iArr[i6 & 3] + i6);
            }
            this.al -= 1551343336;
            ae(at, (byte) 120);
            ae(at2, (byte) 7);
        }
        this.al = (-1631454091 * i3) * -879823907;
    }

    public boolean hq() {
        this.al += 142464702;
        return at((byte) -73) == hd.ad(this.ar, 0, this.al * -1326836512, 1390933460);
    }

    public void hr(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = this.al * -1631454091;
        this.al = 0;
        byte[] bArr = new byte[i];
        bd(bArr, 0, i, (byte) 0);
        byte[] toByteArray = new BigInteger(bArr).modPow(bigInteger, bigInteger2).toByteArray();
        this.al = 0;
        aj(toByteArray.length, 1742345780);
        ax(toByteArray, 0, toByteArray.length, -1588328100);
    }

    public int hs() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (bArr[(i * -1631454091) - 1] - 128) & 255;
    }

    public void ht(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i + 128);
    }

    public void hu(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * 2146295611) - 1] = (byte) (0 - i);
    }

    public void hv(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (128 - i);
    }

    public int hw() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (0 - bArr[(i * -1631454091) - 1]) & 255;
    }

    public void hx(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 1130413891;
        this.al = i2;
        bArr[(i2 * 263895619) - 1] = (byte) (i + 128);
    }

    public int hy() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (128 - bArr[(i * -1631454091) - 1]) & 255;
    }

    public int hz() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (bArr[(i * -1631454091) - 1] - 128) & 255;
    }

    public void ia(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al + 849756755;
        this.al = i2;
        bArr[(i2 * -722952867) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al + 232261341;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
        bArr = this.ar;
        i2 = this.al - 2020871832;
        this.al = i2;
        bArr[(i2 * 1128230458) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * 912529463) - 1] = (byte) (i >> 8);
    }

    public int ib() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1631454091) - 1] - 128) & 255) + ((this.ar[(this.al * -1631454091) - 2] & 255) << 8);
    }

    public byte ic() {
        byte[] bArr = this.ar;
        int i = this.al + 1534719369;
        this.al = i;
        return (byte) (128 - bArr[(i * -1940375914) - 1]);
    }

    public byte id() {
        byte[] bArr = this.ar;
        int i = this.al - 1049180110;
        this.al = i;
        return (byte) (0 - bArr[(i * -1631454091) - 1]);
    }

    public void ie(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
    }

    /* renamed from: if */
    public byte m231if() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (byte) (128 - bArr[(i * -1631454091) - 1]);
    }

    public int ig() {
        this.al -= 1759647814;
        int i = ((this.ar[(this.al * -1631454091) - 1] & -1590945089) << 8) + (this.ar[(this.al * -1631454091) - 2] & -1543753849);
        return i > 32767 ? i - 65536 : i;
    }

    public int ih() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1631454091) - 1] - 128) & 255) + ((this.ar[(this.al * -1631454091) - 2] & 255) << 8);
    }

    public int ii() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1351235774) - 1] & 814012870) << 8) + ((this.ar[(this.al * -1631454091) - 2] - 1039317467) & 255);
    }

    public void ij(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
    }

    public void ik(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i + 128);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
    }

    public int il() {
        this.al -= 1759647814;
        int i = ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + ((this.ar[(this.al * -1631454091) - 2] - 128) & 255);
        return i > 32767 ? i - 65536 : i;
    }

    public int im() {
        this.al -= 1759647814;
        int i = ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + ((this.ar[(this.al * -1631454091) - 2] - 128) & 255);
        return i > 32767 ? i - 65536 : i;
    }

    public int in() {
        this.al -= 1109234307;
        return ((this.ar[(this.al * -1631454091) - 1] - 128) & 255) + ((this.ar[(this.al * 867921812) - 2] & 255) << 8);
    }

    public void io(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i + 128);
    }

    public int ip() {
        this.al -= 1759647814;
        int i = ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + (this.ar[(this.al * -1631454091) - 2] & 255);
        return i > 32767 ? i - 65536 : i;
    }

    public void iq(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al + 177212392;
        this.al = i2;
        bArr[(i2 * 1144228161) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1768146270) - 1] = (byte) (i + 128);
    }

    public int ir() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + ((this.ar[(this.al * -1631454091) - 2] - 128) & 255);
    }

    public int is() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + ((this.ar[(this.al * -1631454091) - 2] - 128) & 255);
    }

    public int it() {
        this.al += 1655495575;
        return (this.ar[(this.al * -143881856) - 3] & 1998482364) + (((this.ar[(this.al * -1631454091) - 2] & -1091721809) << 8) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 16));
    }

    public void iu(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
    }

    public void iv(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i + 128);
    }

    public void iw(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al + 990303869;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i + 128);
    }

    public int ix() {
        this.al -= 1759647814;
        return ((this.ar[(this.al * -1631454091) - 1] - 128) & 255) + ((this.ar[(this.al * -1631454091) - 2] & 255) << 8);
    }

    public int iy() {
        this.al -= 1759647814;
        int i = ((this.ar[(this.al * -1631454091) - 1] & -1648907423) << 8) + (this.ar[(this.al * -1631454091) - 2] & 255);
        return i > 32767 ? i + 158326356 : i;
    }

    public void iz(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 1167558519;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * 181027325) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
        bArr = this.ar;
        i2 = this.al + 1728813384;
        this.al = i2;
        bArr[(i2 * 675234706) - 1] = (byte) (i >> 16);
    }

    public void ja(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
    }

    public void jd(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr[i3] = (byte) (bArr2[(i4 * -1631454091) - 1] - 128);
        }
    }

    public int jf() {
        this.al += 775671668;
        return (this.ar[(this.al * -1631454091) - 3] & 255) + (((this.ar[(this.al * -1631454091) - 4] & 255) << 8) + (((this.ar[(this.al * -1631454091) - 2] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 16)));
    }

    public int jg() {
        this.al += 775671668;
        return (this.ar[(this.al * -1631454091) - 3] & 255) + (((this.ar[(this.al * -1631454091) - 4] & 255) << 8) + (((this.ar[(this.al * -1631454091) - 2] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 16)));
    }

    public int jk() {
        this.al += 775671668;
        return (((this.ar[(this.al * -1631454091) - 1] & 255) << 8) + (((this.ar[(this.al * -1631454091) - 3] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 4] & 255) << 16))) + (this.ar[(this.al * -1631454091) - 2] & 255);
    }

    public void jl(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
    }

    public int jo() {
        this.al += 775671668;
        return (this.ar[(this.al * -1982415882) - 3] & 255) + (((this.ar[(this.al * -1631454091) - 4] & 992972158) << 8) + (((this.ar[(this.al * 287237242) - 2] & -739517045) << 24) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 16)));
    }

    public int jp() {
        this.al += 775671668;
        return ((((this.ar[(this.al * -1631454091) - 2] & 255) << 16) + ((this.ar[(this.al * -1631454091) - 1] & 255) << 24)) + ((this.ar[(this.al * -1631454091) - 3] & 255) << 8)) + (this.ar[(this.al * -1631454091) - 4] & 255);
    }

    public int jq() {
        this.al += 1777414147;
        return (((this.ar[(this.al * 454111544) - 1] & 255) << 8) + (((this.ar[(this.al * -1631454091) - 3] & 255) << 24) + ((this.ar[(this.al * -1631454091) - 4] & 255) << 16))) + (this.ar[(this.al * -1631454091) - 2] & -93790321);
    }

    public void ju(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr[i3] = (byte) (bArr2[(i4 * -1631454091) - 1] - 128);
        }
    }

    public void jv(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 24);
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
    }

    public void jw(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 16);
        bArr = this.ar;
        i2 = this.al + 1528322954;
        this.al = i2;
        bArr[(i2 * 253093378) - 1] = (byte) (i >> 24);
        bArr = this.ar;
        i2 = this.al + 224713788;
        this.al = i2;
        bArr[(i2 * -766027851) - 1] = (byte) i;
        bArr = this.ar;
        i2 = this.al + 1916011617;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (i >> 8);
    }
}
