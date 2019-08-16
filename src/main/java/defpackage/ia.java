package defpackage;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import java.io.IOException;

/* renamed from: ia */
public class ia {
    static final int aq = 256;
    static final int ar = 128;
    static final int bp = 100;
    int[] aa;
    int[] ac;
    ef[] ad;
    int[] ae;
    int af;
    int[] ag;
    int ah;
    int[] ak;
    int am;
    int ao;
    int[] ap;
    int[] as;
    int au;
    int[] aw;
    int[] ax;
    int az;

    ia(ef[] efVarArr) {
        try {
            this.ae = new int[256];
            this.am = 0;
            this.au = 0;
            this.az = 0;
            this.ao = 0;
            this.ah = 0;
            this.af = 0;
            this.ad = efVarArr;
            ad((byte) -79);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ac(boolean z, boolean z2, int i) {
        try {
            lv.bs(go.jr, go.jh, go.jz, -1804322940);
            dw.ez.al(z, (byte) 23);
            ad.bv(z2, 1964498910);
            he.ac(20, (byte) 102);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int al(lv lvVar, int i) {
        try {
            int jm = lvVar.jm(2, 1558410047);
            return jm == 0 ? 0 : jm == 1 ? lvVar.jm(5, 1491471944) : jm == 2 ? lvVar.jm(8, -402733068) : lvVar.jm(11, 1024040583);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aq(boolean z, int i) {
        try {
            if (kk.aj != null) {
                try {
                    lj ljVar = new lj(4);
                    ljVar.al(z ? 2 : 3, -1045054974);
                    ljVar.ai(0, 2094895093);
                    kk.aj.ak(ljVar.ar, 0, 4);
                } catch (IOException e) {
                    try {
                        kk.aj.ar();
                    } catch (Exception e2) {
                    }
                    kk.ba -= 1722916809;
                    kk.aj = null;
                }
            }
        } catch (RuntimeException e3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.aq(");
            stringBuilder.append(')');
            throw mv.aq(e3, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final int aa(int i, int i2, int i3) {
        int i4 = 256 - i3;
        return ((((i4 * (-111790674 & i)) + ((1995432602 & i2) * i3)) & 1676290398) + ((((1915195409 & i) * i4) + ((192259814 & i2) * i3)) & -16711936)) >> 8;
    }

    /* Access modifiers changed, original: final */
    public final void ab(int i, int[] iArr) {
        int length = this.ak.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i > ox.aj) {
                this.ak[i2] = aj(this.as[i2], iArr[i2], 1024 - i, (byte) 45);
            } else if (i > 67592244) {
                this.ak[i2] = iArr[i2];
            } else {
                this.ak[i2] = aj(iArr[i2], this.as[i2], 1163179575 - i, (byte) 87);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ac(int i) {
        int i2;
        this.ao += 1216591488 * i;
        if (this.ao * 1455626853 > this.ac.length) {
            this.ao -= this.ac.length * 1318127469;
            ak(this.ad[(int) (Math.random() * 12.0d)], (byte) -32);
        }
        int i3 = 256 - i;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = i4;
            if (i2 >= i3 * 128) {
                break;
            }
            i4 = this.ax[(i * 128) + i5] - ((this.ac[((this.ao * 1455626853) + i5) & (this.ac.length - 1)] * i) / 6);
            if (i4 < 0) {
                i4 = 0;
            }
            this.ax[i5] = i4;
            i4 = i2 + 1;
            i5++;
        }
        for (i2 = i3; i2 < 256; i2++) {
            i5 = i2 * 128;
            i4 = 0;
            while (i4 < 128) {
                if (((int) (Math.random() * 100.0d)) >= 50 || i4 <= 10 || i4 >= 118) {
                    this.ax[i4 + i5] = 0;
                } else {
                    this.ax[i4 + i5] = 255;
                }
                i4++;
            }
        }
        if (this.au * 181939841 > 0) {
            this.au -= 333989380 * i;
        }
        if (this.az * 381117241 > 0) {
            this.az -= 1898605604 * i;
        }
        if (this.au * 181939841 == 0 && this.az * 381117241 == 0) {
            i4 = (int) (Math.random() * ((double) (2000 / i)));
            if (i4 == 0) {
                this.au = -398064640;
            }
            if (i4 == 1) {
                this.az = 711730176;
            }
        }
        for (i4 = 0; i4 < i3; i4++) {
            this.ae[i4] = this.ae[i + i4];
        }
        for (i4 = i3; i4 < 256; i4++) {
            this.ae[i4] = (int) (((Math.sin(((double) (this.am * 103974365)) / 14.0d) * 16.0d) + (Math.sin(((double) (this.am * 103974365)) / 15.0d) * 14.0d)) + (Math.sin(((double) (this.am * 103974365)) / 16.0d) * 12.0d));
            this.am -= 545523083;
        }
        this.ah += 539746019 * i;
        i5 = (((client.bj * 2133672263) & 1) + i) / 2;
        if (i5 > 0) {
            int i6;
            int i7;
            for (i4 = 0; i4 < this.ah * -1280710836; i4++) {
                i3 = ((int) (Math.random() * ((double) 124))) + 2;
                this.ax[i3 + ((((int) (Math.random() * ((double) 128))) + 128) << 7)] = 192;
            }
            this.ah = 0;
            i4 = 0;
            while (true) {
                i2 = i4;
                if (i2 >= 256) {
                    break;
                }
                i6 = i2 * 128;
                i4 = 0;
                for (i3 = -i5; i3 < 128; i3++) {
                    if (i5 + i3 < 128) {
                        i4 += this.ax[(i3 + i6) + i5];
                    }
                    i7 = i5 + 1;
                    if (i3 - i7 >= 0) {
                        i4 -= this.ax[(i6 + i3) - i7];
                    }
                    if (i3 >= 0) {
                        this.aw[i3 + i6] = i4 / ((i5 * 2) + 1);
                    }
                }
                i4 = i2 + 1;
            }
            i4 = 0;
            while (true) {
                i2 = i4;
                if (i2 < 128) {
                    i4 = 0;
                    for (i3 = -i5; i3 < 256; i3++) {
                        i6 = i3 * 128;
                        if (i3 + i5 < 256) {
                            i4 += this.aw[(i5 * 128) + (i2 + i6)];
                        }
                        i7 = i5 + 1;
                        if (i3 - i7 >= 0) {
                            i4 -= this.aw[(i6 + i2) - (i7 * 128)];
                        }
                        if (i3 >= 0) {
                            this.ax[i6 + i2] = i4 / ((i5 * 2) + 1);
                        }
                    }
                    i4 = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(byte b) {
        int i = 0;
        try {
            int i2;
            this.as = new int[256];
            for (i2 = 0; i2 < 64; i2++) {
                this.as[i2] = 262144 * i2;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.as[i2 + 64] = (i2 * 1024) + 16711680;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.as[i2 + 128] = (i2 * 4) + 16776960;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.as[i2 + 192] = ViewCompat.MEASURED_SIZE_MASK;
            }
            this.ag = new int[256];
            for (i2 = 0; i2 < 64; i2++) {
                this.ag[i2] = i2 * 1024;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.ag[i2 + 64] = (i2 * 4) + MotionEventCompat.ACTION_POINTER_INDEX_MASK;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.ag[i2 + 128] = (i2 * 262144) + SupportMenu.USER_MASK;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.ag[i2 + 192] = ViewCompat.MEASURED_SIZE_MASK;
            }
            this.ap = new int[256];
            for (i2 = 0; i2 < 64; i2++) {
                this.ap[i2] = i2 * 4;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.ap[i2 + 64] = (i2 * 262144) + 255;
            }
            for (i2 = 0; i2 < 64; i2++) {
                this.ap[i2 + 128] = (i2 * 1024) + 16711935;
            }
            while (i < 64) {
                this.ap[i + 192] = ViewCompat.MEASURED_SIZE_MASK;
                i++;
            }
            this.ak = new int[256];
            this.ac = new int[32768];
            this.aa = new int[32768];
            ak(null, (byte) -35);
            this.ax = new int[32768];
            this.aw = new int[32768];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ae(int i, int[] iArr, int i2) {
        try {
            int length = this.ak.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (i > ox.aj) {
                    this.ak[i3] = aj(this.as[i3], iArr[i3], 1024 - i, (byte) 29);
                } else if (i > 256) {
                    this.ak[i3] = iArr[i3];
                } else {
                    this.ak[i3] = aj(iArr[i3], this.as[i3], 256 - i, (byte) 35);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void af(int i, es esVar) {
        int length = this.ak.length;
        if (this.au * 181939841 > 0) {
            ae(this.au * 181939841, this.ag, 1808572037);
        } else if (this.az * 381117241 > 0) {
            ae(this.az * 381117241, this.ap, 1555480343);
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                this.ak[i2] = this.as[i2];
            }
        }
        am(esVar, i, 1688969820);
    }

    /* Access modifiers changed, original: 0000 */
    public void ag() {
        int i;
        int i2 = 0;
        this.as = new int[256];
        for (i = 0; i < 64; i++) {
            this.as[i] = 262144 * i;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 64] = (i * 1024) + 16711680;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 128] = (i * 4) + 16776960;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 192] = ViewCompat.MEASURED_SIZE_MASK;
        }
        this.ag = new int[256];
        for (i = 0; i < 64; i++) {
            this.ag[i] = i * 1024;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 64] = (i * 4) + MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 128] = (i * 262144) + SupportMenu.USER_MASK;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 192] = ViewCompat.MEASURED_SIZE_MASK;
        }
        this.ap = new int[256];
        for (i = 0; i < 64; i++) {
            this.ap[i] = i * 4;
        }
        for (i = 0; i < 64; i++) {
            this.ap[i + 64] = (i * 262144) + 255;
        }
        for (i = 0; i < 64; i++) {
            this.ap[i + 128] = (i * 1024) + 16711935;
        }
        while (i2 < 64) {
            this.ap[i2 + 192] = ViewCompat.MEASURED_SIZE_MASK;
            i2++;
        }
        this.ak = new int[256];
        this.ac = new int[32768];
        this.aa = new int[32768];
        ak(null, (byte) -102);
        this.ax = new int[32768];
        this.aw = new int[32768];
    }

    /* Access modifiers changed, original: final */
    public final void ah(int i, es esVar) {
        int length = this.ak.length;
        if (this.au * 181939841 > 0) {
            ae(this.au * 181939841, this.ag, 1711217265);
        } else if (this.az * 381117241 > 0) {
            ae(this.az * 381117241, this.ap, 1388009503);
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                this.ak[i2] = this.as[i2];
            }
        }
        am(esVar, i, 1946873627);
    }

    /* Access modifiers changed, original: final */
    public final void ai(int i, es esVar, int i2) {
        try {
            int length = this.ak.length;
            if (this.au * 181939841 > 0) {
                ae(this.au * 181939841, this.ag, 710200174);
            } else if (this.az * 381117241 > 0) {
                ae(this.az * 381117241, this.ap, 730334128);
            } else {
                for (int i3 = 0; i3 < length; i3++) {
                    this.ak[i3] = this.as[i3];
                }
            }
            am(esVar, i, 2012860532);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final int aj(int i, int i2, int i3, byte b) {
        int i4 = 256 - i3;
        return ((((i4 * (i & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + ((i2 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i3)) & 16711680) + (-16711936 & (((i & 16711935) * i4) + ((16711935 & i2) * i3)))) >> 8;
    }

    /* Access modifiers changed, original: final */
    public final void ak(ef efVar, byte b) {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < this.ac.length) {
            try {
                this.ac[i3] = 0;
                i3++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ia.ak(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        for (i3 = 0; i3 < 5000; i3++) {
            this.ac[(int) ((Math.random() * 128.0d) * 256.0d)] = (int) (Math.random() * 256.0d);
        }
        for (i = 0; i < 20; i++) {
            for (i2 = 1; i2 < 255; i2++) {
                for (i3 = 1; i3 < 127; i3++) {
                    int i4 = (i2 << 7) + i3;
                    this.aa[i4] = ((this.ac[i4 - 128] + (this.ac[i4 + 1] + this.ac[i4 - 1])) + this.ac[i4 + 128]) / 4;
                }
            }
            int[] iArr = this.ac;
            this.ac = this.aa;
            this.aa = iArr;
        }
        if (efVar != null) {
            int i5 = 0;
            for (i2 = 0; i2 < efVar.al; i2++) {
                i3 = 0;
                while (i3 < efVar.ar) {
                    if (efVar.ad[i5] != (byte) 0) {
                        i = efVar.aj;
                        i += i3 + 16;
                        this.ac[i + ((efVar.ai + (i2 + 16)) << 7)] = 0;
                    }
                    i3++;
                    i5++;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void al(int i, int i2) {
        try {
            int i3;
            this.ao += 1216591488 * i;
            if (this.ao * 1455626853 > this.ac.length) {
                this.ao -= this.ac.length * 1318127469;
                ak(this.ad[(int) (Math.random() * 12.0d)], (byte) -29);
            }
            int i4 = 256 - i;
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4 * 128) {
                i3 = this.ax[(i * 128) + i6] - ((this.ac[((this.ao * 1455626853) + i6) & (this.ac.length - 1)] * i) / 6);
                if (i3 < 0) {
                    i3 = 0;
                }
                this.ax[i6] = i3;
                i5++;
                i6++;
            }
            for (i6 = i4; i6 < 256; i6++) {
                i5 = i6 * 128;
                i3 = 0;
                while (i3 < 128) {
                    if (((int) (Math.random() * 100.0d)) >= 50 || i3 <= 10 || i3 >= 118) {
                        this.ax[i3 + i5] = 0;
                    } else {
                        this.ax[i3 + i5] = 255;
                    }
                    i3++;
                }
            }
            if (this.au * 181939841 > 0) {
                this.au -= 333989380 * i;
            }
            if (this.az * 381117241 > 0) {
                this.az -= 1898605604 * i;
            }
            if (this.au * 181939841 == 0 && this.az * 381117241 == 0) {
                i3 = (int) (Math.random() * ((double) (2000 / i)));
                if (i3 == 0) {
                    this.au = -398064640;
                }
                if (i3 == 1) {
                    this.az = 711730176;
                }
            }
            for (i3 = 0; i3 < i4; i3++) {
                this.ae[i3] = this.ae[i + i3];
            }
            while (i4 < 256) {
                this.ae[i4] = (int) (((Math.sin(((double) (this.am * 103974365)) / 14.0d) * 16.0d) + (Math.sin(((double) (this.am * 103974365)) / 15.0d) * 14.0d)) + (Math.sin(((double) (this.am * 103974365)) / 16.0d) * 12.0d));
                this.am -= 545523083;
                i4++;
            }
            this.ah += 539746019 * i;
            i5 = (((client.bj * 2133672263) & 1) + i) / 2;
            if (i5 > 0) {
                int i7;
                int i8;
                for (i4 = 0; i4 < this.ah * -1280710836; i4++) {
                    i3 = ((int) (Math.random() * ((double) 124))) + 2;
                    this.ax[i3 + ((((int) (Math.random() * ((double) 128))) + 128) << 7)] = 192;
                }
                this.ah = 0;
                i4 = 0;
                while (true) {
                    i6 = i4;
                    if (i6 >= 256) {
                        break;
                    }
                    i7 = i6 * 128;
                    i4 = 0;
                    for (i3 = -i5; i3 < 128; i3++) {
                        if (i5 + i3 < 128) {
                            i4 += this.ax[(i3 + i7) + i5];
                        }
                        i8 = i5 + 1;
                        if (i3 - i8 >= 0) {
                            i4 -= this.ax[(i7 + i3) - i8];
                        }
                        if (i3 >= 0) {
                            this.aw[i3 + i7] = i4 / ((i5 * 2) + 1);
                        }
                    }
                    i4 = i6 + 1;
                }
                i4 = 0;
                while (true) {
                    i6 = i4;
                    if (i6 < 128) {
                        i4 = 0;
                        for (i3 = -i5; i3 < 256; i3++) {
                            i7 = i3 * 128;
                            if (i3 + i5 < 256) {
                                i4 += this.aw[(i5 * 128) + (i6 + i7)];
                            }
                            i8 = i5 + 1;
                            if (i3 - i8 >= 0) {
                                i4 -= this.aw[(i7 + i6) - (i8 * 128)];
                            }
                            if (i3 >= 0) {
                                this.ax[i7 + i6] = i4 / ((i5 * 2) + 1);
                            }
                        }
                        i4 = i6 + 1;
                    } else {
                        return;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(es esVar, int i, int i2) {
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            int i6 = i3;
            if (i6 < 255) {
                try {
                    int i7;
                    i4 = ((this.ae[i6] * (256 - i6)) / 256) + i;
                    if (i4 < 0) {
                        i7 = -i4;
                        i3 = 0;
                    } else {
                        i7 = 0;
                        i3 = i4;
                    }
                    int i8 = i3 + 128 >= esVar.aq * 1462922907 ? (esVar.aq * 1462922907) - i3 : 128;
                    int i9 = i3 + ((esVar.aq * 1462922907) * (i6 + 8));
                    i3 = i5 + i7;
                    while (i7 < i8) {
                        i4 = this.ax[i3];
                        if (i4 != 0) {
                            i5 = 256 - i4;
                            int i10 = this.ak[i4];
                            int i11 = esVar.ad[i9];
                            esVar.ad[i9] = (((((i4 * (i10 & 16711935)) + (i5 * (16711935 & i11))) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i11) * i5) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i4)) & 16711680)) >> 8) | ViewCompat.MEASURED_STATE_MASK;
                        }
                        i7++;
                        i3++;
                        i9++;
                    }
                    i4 = (128 - i8) + i3;
                    i3 = i6 + 1;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ia.am(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: final */
    public final void an(int i, int[] iArr) {
        int length = this.ak.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i > ox.aj) {
                this.ak[i2] = aj(this.as[i2], iArr[i2], 1024 - i, (byte) 60);
            } else if (i > 256) {
                this.ak[i2] = iArr[i2];
            } else {
                this.ak[i2] = aj(iArr[i2], this.as[i2], 256 - i, (byte) 21);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ao(int i, es esVar) {
        int length = this.ak.length;
        if (this.au * 181939841 > 0) {
            ae(this.au * 181939841, this.ag, 1075118264);
        } else if (this.az * 381117241 > 0) {
            ae(this.az * 381117241, this.ap, -317096567);
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                this.ak[i2] = this.as[i2];
            }
        }
        am(esVar, i, 1670863452);
    }

    /* Access modifiers changed, original: 0000 */
    public void ap() {
        int i;
        int i2 = 0;
        this.as = new int[256];
        for (i = 0; i < 64; i++) {
            this.as[i] = 262144 * i;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 64] = (i * 1024) + 16711680;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 128] = (i * 4) + 16776960;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 192] = ViewCompat.MEASURED_SIZE_MASK;
        }
        this.ag = new int[256];
        for (i = 0; i < 64; i++) {
            this.ag[i] = i * 1024;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 64] = (i * 4) + MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 128] = (i * 262144) + SupportMenu.USER_MASK;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 192] = ViewCompat.MEASURED_SIZE_MASK;
        }
        this.ap = new int[256];
        for (i = 0; i < 64; i++) {
            this.ap[i] = i * 4;
        }
        for (i = 0; i < 64; i++) {
            this.ap[i + 64] = (i * 262144) + 255;
        }
        for (i = 0; i < 64; i++) {
            this.ap[i + 128] = (i * 1024) + 16711935;
        }
        while (i2 < 64) {
            this.ap[i2 + 192] = ViewCompat.MEASURED_SIZE_MASK;
            i2++;
        }
        this.ak = new int[256];
        this.ac = new int[32768];
        this.aa = new int[32768];
        ak(null, (byte) 53);
        this.ax = new int[32768];
        this.aw = new int[32768];
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i) {
        try {
            this.as = null;
            this.ag = null;
            this.ap = null;
            this.ak = null;
            this.ac = null;
            this.aa = null;
            this.ax = null;
            this.aw = null;
            this.ao = 0;
            this.ah = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i, int i2, es esVar, int i3) {
        try {
            if (this.ax == null) {
                ad((byte) -126);
            }
            if (this.af * 1307613913 == 0) {
                this.af = i2 * -21740183;
            }
            int i4 = i2 - (this.af * 1307613913);
            if (i4 >= 256) {
                i4 = 0;
            }
            this.af = i2 * -21740183;
            if (i4 > 0) {
                al(i4, 1432488308);
            }
            ai(i, esVar, -519122869);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ia.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as() {
        int i;
        int i2 = 0;
        this.as = new int[256];
        for (i = 0; i < 64; i++) {
            this.as[i] = 262144 * i;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 64] = (i * 1024) + 16711680;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 128] = (i * 4) + 16776960;
        }
        for (i = 0; i < 64; i++) {
            this.as[i + 192] = ViewCompat.MEASURED_SIZE_MASK;
        }
        this.ag = new int[256];
        for (i = 0; i < 64; i++) {
            this.ag[i] = i * 1024;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 64] = (i * 4) + MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 128] = (i * 262144) + SupportMenu.USER_MASK;
        }
        for (i = 0; i < 64; i++) {
            this.ag[i + 192] = ViewCompat.MEASURED_SIZE_MASK;
        }
        this.ap = new int[256];
        for (i = 0; i < 64; i++) {
            this.ap[i] = i * 4;
        }
        for (i = 0; i < 64; i++) {
            this.ap[i + 64] = (i * 262144) + 255;
        }
        for (i = 0; i < 64; i++) {
            this.ap[i + 128] = (i * 1024) + 16711935;
        }
        while (i2 < 64) {
            this.ap[i2 + 192] = ViewCompat.MEASURED_SIZE_MASK;
            i2++;
        }
        this.ak = new int[256];
        this.ac = new int[32768];
        this.aa = new int[32768];
        ak(null, (byte) 50);
        this.ax = new int[32768];
        this.aw = new int[32768];
    }

    /* Access modifiers changed, original: final */
    public final void at(int i, int[] iArr) {
        int length = this.ak.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i > ox.aj) {
                this.ak[i2] = aj(this.as[i2], iArr[i2], -659672578 - i, (byte) 2);
            } else if (i > 1436250664) {
                this.ak[i2] = iArr[i2];
            } else {
                this.ak[i2] = aj(iArr[i2], this.as[i2], 1490780706 - i, (byte) 26);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au() {
        this.as = null;
        this.ag = null;
        this.ap = null;
        this.ak = null;
        this.ac = null;
        this.aa = null;
        this.ax = null;
        this.aw = null;
        this.ao = 0;
        this.ah = 0;
    }

    /* Access modifiers changed, original: final */
    public final void av(int i, int[] iArr) {
        int length = this.ak.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i > -1163319670) {
                this.ak[i2] = aj(this.as[i2], iArr[i2], 1024 - i, (byte) 109);
            } else if (i > 256) {
                this.ak[i2] = iArr[i2];
            } else {
                this.ak[i2] = aj(iArr[i2], this.as[i2], -432648198 - i, (byte) 125);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void aw(int i) {
        int i2;
        this.ao += -922720901 * i;
        if (this.ao * -2032361253 > this.ac.length) {
            this.ao -= this.ac.length * 1328675036;
            ak(this.ad[(int) (Math.random() * 12.0d)], (byte) -93);
        }
        int i3 = 256 - i;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = i4;
            if (i2 >= 1675139680 * i3) {
                break;
            }
            i4 = this.ax[(i * 128) + i5] - ((this.ac[((this.ao * 1722713219) + i5) & (this.ac.length - 1)] * i) / 6);
            if (i4 < 0) {
                i4 = 0;
            }
            this.ax[i5] = i4;
            i4 = i2 + 1;
            i5++;
        }
        i4 = 1455881814 - i;
        while (true) {
            i2 = i4;
            if (i2 >= 2103803817) {
                break;
            }
            i5 = 1274415792 * i2;
            i4 = 0;
            while (i4 < 855124390) {
                if (((int) (Math.random() * 100.0d)) >= 50 || i4 <= 10 || i4 >= 1559385983) {
                    this.ax[i4 + i5] = 0;
                } else {
                    this.ax[i4 + i5] = 255;
                }
                i4++;
            }
            i4 = i2 + 1;
        }
        if (this.au * 181939841 > 0) {
            this.au -= 90435362 * i;
        }
        if (this.az * 302424146 > 0) {
            this.az -= -1144893654 * i;
        }
        if (this.au * 181939841 == 0 && this.az * -179776699 == 0) {
            i4 = (int) (Math.random() * ((double) (-1449139789 / i)));
            if (i4 == 0) {
                this.au = 2039223624;
            }
            if (i4 == 1) {
                this.az = -1127158389;
            }
        }
        for (i4 = 0; i4 < 982607361 - i; i4++) {
            this.ae[i4] = this.ae[i + i4];
        }
        for (i4 = i3; i4 < 256; i4++) {
            this.ae[i4] = (int) (((Math.sin(((double) (this.am * 103974365)) / 14.0d) * 16.0d) + (Math.sin(((double) (this.am * 103974365)) / 15.0d) * 14.0d)) + (Math.sin(((double) (this.am * 1053124576)) / 16.0d) * 12.0d));
            this.am -= 545523083;
        }
        this.ah += 2001325168 * i;
        if ((((client.bj * 2133672263) & 1) + i) / 2 > 0) {
            for (i4 = 0; i4 < this.ah * -428096351; i4++) {
                i3 = ((int) (Math.random() * ((double) 283884889))) + 2;
                this.ax[i3 + ((((int) (Math.random() * ((double) 886590483))) + 886590483) << 7)] = 192;
            }
            this.ah = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2, es esVar) {
        if (this.ax == null) {
            ad((byte) -54);
        }
        if (this.af * 1307613913 == 0) {
            this.af = i2 * -21740183;
        }
        int i3 = i2 - (this.af * -1658493936);
        if (i3 >= 256) {
            i3 = 0;
        }
        this.af = i2 * -21740183;
        if (i3 > 0) {
            al(i3, 857407290);
        }
        ai(i, esVar, 1551315951);
    }

    /* Access modifiers changed, original: final */
    public final void ay(int i, int[] iArr) {
        int length = this.ak.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i > ox.aj) {
                this.ak[i2] = aj(this.as[i2], iArr[i2], 1024 - i, (byte) 7);
            } else if (i > 943648704) {
                this.ak[i2] = iArr[i2];
            } else {
                this.ak[i2] = aj(iArr[i2], this.as[i2], 1982456572 - i, (byte) 116);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(int i, int i2, es esVar) {
        if (this.ax == null) {
            ad((byte) -63);
        }
        if (this.af * 1307613913 == 0) {
            this.af = i2 * -21740183;
        }
        int i3 = i2 - (this.af * 1307613913);
        if (i3 >= 256) {
            i3 = 0;
        }
        this.af = i2 * -21740183;
        if (i3 > 0) {
            al(i3, 1602847546);
        }
        ai(i, esVar, -604679684);
    }

    /* Access modifiers changed, original: final */
    public final void ba(es esVar, int i) {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            int i5 = i2;
            if (i5 < 255) {
                i3 = ((this.ae[i5] * (256 - i5)) / 256) + i;
                if (i3 < 0) {
                    i2 = -i3;
                    i3 = 0;
                } else {
                    i2 = 0;
                }
                int i6 = i3 + 128 >= esVar.aq * 1462922907 ? (esVar.aq * 1462922907) - i3 : 128;
                int i7 = i3 + ((esVar.aq * 1462922907) * (i5 + 8));
                i4 += i2;
                int i8 = i2;
                while (i8 < i6) {
                    i3 = this.ax[i4];
                    if (i3 != 0) {
                        i2 = 256 - i3;
                        int i9 = this.ak[i3];
                        int i10 = esVar.ad[i7];
                        esVar.ad[i7] = (((((i3 * (i9 & 16711935)) + (i2 * (16711935 & i10))) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i2) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i3)) & 16711680)) >> 8) | ViewCompat.MEASURED_STATE_MASK;
                    }
                    i8++;
                    i4++;
                    i7++;
                }
                i3 = (128 - i6) + i4;
                i2 = i5 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bk(es esVar, int i) {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            int i5 = i2;
            if (i5 < 255) {
                i3 = ((this.ae[i5] * (256 - i5)) / 256) + i;
                if (i3 < 0) {
                    i2 = -i3;
                    i3 = 0;
                } else {
                    i2 = 0;
                }
                int i6 = i3 + 128 >= esVar.aq * 1462922907 ? (esVar.aq * 1462922907) - i3 : 128;
                int i7 = i3 + ((esVar.aq * 1462922907) * (i5 + 8));
                i4 += i2;
                int i8 = i2;
                while (i8 < i6) {
                    i3 = this.ax[i4];
                    if (i3 != 0) {
                        i2 = 256 - i3;
                        int i9 = this.ak[i3];
                        int i10 = esVar.ad[i7];
                        esVar.ad[i7] = (((((i3 * (i9 & 16711935)) + (i2 * (16711935 & i10))) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i2) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i3)) & 16711680)) >> 8) | ViewCompat.MEASURED_STATE_MASK;
                    }
                    i8++;
                    i4++;
                    i7++;
                }
                i3 = (128 - i6) + i4;
                i2 = i5 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bm(ef efVar) {
        int i;
        int i2;
        int i3;
        for (i = 0; i < this.ac.length; i++) {
            this.ac[i] = 0;
        }
        for (i = 0; i < 941535494; i++) {
            this.ac[(int) ((Math.random() * 128.0d) * 256.0d)] = (int) (Math.random() * 256.0d);
        }
        for (i2 = 0; i2 < 20; i2++) {
            for (i3 = 1; i3 < 255; i3++) {
                for (i = 1; i < 127; i++) {
                    int i4 = (i3 << 7) + i;
                    this.aa[i4] = ((this.ac[i4 - 257303627] + (this.ac[i4 + 1] + this.ac[i4 - 1])) + this.ac[i4 + 128]) / 4;
                }
            }
            int[] iArr = this.ac;
            this.ac = this.aa;
            this.aa = iArr;
        }
        if (efVar != null) {
            int i5 = 0;
            for (i = 0; i < efVar.al; i++) {
                i3 = 0;
                while (i3 < efVar.ar) {
                    if (efVar.ad[i5] != (byte) 0) {
                        i2 = efVar.aj;
                        i2 += i3 + 16;
                        this.ac[i2 + ((efVar.ai + (i + 16)) << 7)] = 0;
                    }
                    i3++;
                    i5++;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bq(ef efVar) {
        int i;
        int i2;
        int i3;
        for (i = 0; i < this.ac.length; i++) {
            this.ac[i] = 0;
        }
        for (i = 0; i < 5000; i++) {
            this.ac[(int) ((Math.random() * 128.0d) * 256.0d)] = (int) (Math.random() * 256.0d);
        }
        for (i2 = 0; i2 < 20; i2++) {
            for (i3 = 1; i3 < 255; i3++) {
                for (i = 1; i < 127; i++) {
                    int i4 = (i3 << 7) + i;
                    this.aa[i4] = ((this.ac[i4 - 128] + (this.ac[i4 + 1] + this.ac[i4 - 1])) + this.ac[i4 + 128]) / 4;
                }
            }
            int[] iArr = this.ac;
            this.ac = this.aa;
            this.aa = iArr;
        }
        if (efVar != null) {
            int i5 = 0;
            for (i = 0; i < efVar.al; i++) {
                i3 = 0;
                while (i3 < efVar.ar) {
                    if (efVar.ad[i5] != (byte) 0) {
                        i2 = efVar.aj;
                        i2 += i3 + 16;
                        this.ac[i2 + ((efVar.ai + (i + 16)) << 7)] = 0;
                    }
                    i3++;
                    i5++;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bs(es esVar, int i) {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            int i5 = i2;
            if (i5 < 255) {
                i3 = ((this.ae[i5] * (256 - i5)) / 256) + i;
                if (i3 < 0) {
                    i2 = -i3;
                    i3 = 0;
                } else {
                    i2 = 0;
                }
                int i6 = i3 + 128 >= esVar.aq * 1462922907 ? (esVar.aq * 1462922907) - i3 : 128;
                int i7 = i3 + ((esVar.aq * 1462922907) * (i5 + 8));
                i4 += i2;
                int i8 = i2;
                while (i8 < i6) {
                    i3 = this.ax[i4];
                    if (i3 != 0) {
                        i2 = 256 - i3;
                        int i9 = this.ak[i3];
                        int i10 = esVar.ad[i7];
                        esVar.ad[i7] = (((((i3 * (i9 & 16711935)) + (i2 * (16711935 & i10))) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i2) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i3)) & 16711680)) >> 8) | ViewCompat.MEASURED_STATE_MASK;
                    }
                    i8++;
                    i4++;
                    i7++;
                }
                i3 = (128 - i6) + i4;
                i2 = i5 + 1;
            } else {
                return;
            }
        }
    }
}
