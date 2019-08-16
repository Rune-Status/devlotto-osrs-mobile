package defpackage;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;

/* renamed from: bx */
public class bx extends mb {
    static int[] ac = null;
    static final int ad = 0;
    static final int al = 3;
    static final int aq = 1;
    static final int ar = 2;
    int[] ae;
    int ag;
    boolean ai;
    int aj;
    int[] ak;
    int[] am;
    int ap;
    int[] as;
    int au;
    boolean aw = false;
    int[] ax;
    int az;

    bx(lj ljVar) {
        int i = 0;
        this.aj = ljVar.an(-1464407032);
        this.ai = ljVar.af(1804771424) == 1;
        int af = ljVar.af(1804771424);
        if (af < 1 || af > 4) {
            throw new RuntimeException();
        }
        int i2;
        this.ae = new int[af];
        for (i2 = 0; i2 < af; i2++) {
            this.ae[i2] = ljVar.an(-1464407032);
        }
        if (af > 1) {
            int i3 = af - 1;
            this.am = new int[i3];
            for (i2 = 0; i2 < i3; i2++) {
                this.am[i2] = ljVar.af(1804771424);
            }
        }
        if (af > 1) {
            int i4 = af - 1;
            this.ak = new int[i4];
            for (i2 = 0; i2 < i4; i2++) {
                this.ak[i2] = ljVar.af(1804771424);
            }
        }
        this.as = new int[af];
        while (i < af) {
            this.as[i] = ljVar.at((byte) -49);
            i++;
        }
        this.ag = ljVar.af(1804771424);
        this.ap = ljVar.af(1804771424);
        this.ax = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ad(double d, int i, kh khVar) {
        int i2;
        for (int i22 : this.ae) {
            if (khVar.ap(i22, (byte) -82) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.ax = new int[i3];
        int i4 = 0;
        while (i4 < this.ae.length) {
            ef ap = la.ap(khVar, this.ae[i4], -978568160);
            ap.ad();
            byte[] bArr = ap.ad;
            int[] iArr = ap.aq;
            int i5 = this.as[i4];
            if ((ViewCompat.MEASURED_STATE_MASK & i5) == 50331648) {
                for (i22 = 0; i22 < iArr.length; i22++) {
                    int i6 = iArr[i22];
                    if (i6 != 0 && (SupportMenu.USER_MASK & i6) == ((i6 >> 8) & SupportMenu.USER_MASK)) {
                        i6 &= 255;
                        iArr[i22] = ((((i6 * (16711935 & i5)) >> 8) & 16711935) | ViewCompat.MEASURED_STATE_MASK) | ((((i5 >> 8) & 255) * i6) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    }
                }
            }
            for (i22 = 0; i22 < iArr.length; i22++) {
                iArr[i22] = fo.bl(iArr[i22], d);
            }
            if ((i4 == 0 ? 0 : this.am[i4 - 1]) == 0) {
                int i7;
                if (ap.ar == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.ax[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (ap.ar == 64 && i == 128) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 >> 1) + ((i5 >> 1) << 6)] & 255];
                            i22++;
                            i7++;
                        }
                    }
                } else if (ap.ar == 128 && i == 64) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 << 1) + ((i5 << 1) << 7)] & 255];
                            i22++;
                            i7++;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            i4++;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void ae() {
        this.ax = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(int i) {
        int i2;
        int[] iArr;
        if (this.ag == 1 || this.ag == 3) {
            i2 = this.ap * i;
            if (this.ag == 1) {
                i2 = -i2;
            }
            this.az = (i2 + this.az) & -1367529823;
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
        if (this.ag == 2 || this.ag == 4) {
            i2 = this.ap * i;
            if (this.ag == 2) {
                i2 = -i2;
            }
            this.au = (this.au + i2) & 127;
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                for (int i3 = 0; i3 < 16384; i3 += 128) {
                    for (int i4 = 0; i4 < 128; i4++) {
                        ac[i3 + i4] = this.ax[((i4 + i2) & 16383) + i3];
                    }
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ai(double d, int i, kh khVar) {
        int i2;
        for (int i22 : this.ae) {
            if (khVar.ap(i22, (byte) -3) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.ax = new int[i3];
        int i4 = 0;
        while (i4 < this.ae.length) {
            ef ap = la.ap(khVar, this.ae[i4], 1627087051);
            ap.ad();
            byte[] bArr = ap.ad;
            int[] iArr = ap.aq;
            int i5 = this.as[i4];
            if ((ViewCompat.MEASURED_STATE_MASK & i5) == 50331648) {
                for (i22 = 0; i22 < iArr.length; i22++) {
                    int i6 = iArr[i22];
                    if (i6 != 0 && (SupportMenu.USER_MASK & i6) == ((i6 >> 8) & SupportMenu.USER_MASK)) {
                        i6 &= 255;
                        iArr[i22] = ((((i6 * (16711935 & i5)) >> 8) & 16711935) | ViewCompat.MEASURED_STATE_MASK) | ((((i5 >> 8) & 255) * i6) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    }
                }
            }
            for (i22 = 0; i22 < iArr.length; i22++) {
                iArr[i22] = fo.bl(iArr[i22], d);
            }
            if ((i4 == 0 ? 0 : this.am[i4 - 1]) == 0) {
                int i7;
                if (ap.ar == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.ax[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (ap.ar == 64 && i == 128) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 >> 1) + ((i5 >> 1) << 6)] & 255];
                            i22++;
                            i7++;
                        }
                    }
                } else if (ap.ar == 128 && i == 64) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 << 1) + ((i5 << 1) << 7)] & 255];
                            i22++;
                            i7++;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            i4++;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aj(double d, int i, kh khVar) {
        int i2;
        for (int i22 : this.ae) {
            if (khVar.ap(i22, (byte) -82) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.ax = new int[i3];
        int i4 = 0;
        while (i4 < this.ae.length) {
            ef ap = la.ap(khVar, this.ae[i4], 1482918619);
            ap.ad();
            byte[] bArr = ap.ad;
            int[] iArr = ap.aq;
            int i5 = this.as[i4];
            if ((ViewCompat.MEASURED_STATE_MASK & i5) == 50331648) {
                for (i22 = 0; i22 < iArr.length; i22++) {
                    int i6 = iArr[i22];
                    if (i6 != 0 && (SupportMenu.USER_MASK & i6) == ((i6 >> 8) & SupportMenu.USER_MASK)) {
                        i6 &= 255;
                        iArr[i22] = ((((i6 * (16711935 & i5)) >> 8) & 16711935) | ViewCompat.MEASURED_STATE_MASK) | ((((i5 >> 8) & 255) * i6) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    }
                }
            }
            for (i22 = 0; i22 < iArr.length; i22++) {
                iArr[i22] = fo.bl(iArr[i22], d);
            }
            if ((i4 == 0 ? 0 : this.am[i4 - 1]) == 0) {
                int i7;
                if (ap.ar == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.ax[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (ap.ar == 64 && i == 128) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 >> 1) + ((i5 >> 1) << 6)] & 255];
                            i22++;
                            i7++;
                        }
                    }
                } else if (ap.ar == 128 && i == 64) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 << 1) + ((i5 << 1) << 7)] & 255];
                            i22++;
                            i7++;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            i4++;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void ak() {
        this.ax = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean al(double d, int i, kh khVar) {
        int i2;
        for (int i22 : this.ae) {
            if (khVar.ap(i22, (byte) -23) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.ax = new int[i3];
        int i4 = 0;
        while (i4 < this.ae.length) {
            ef ap = la.ap(khVar, this.ae[i4], 402744128);
            ap.ad();
            byte[] bArr = ap.ad;
            int[] iArr = ap.aq;
            int i5 = this.as[i4];
            if ((1901410787 & i5) == 50331648) {
                for (i22 = 0; i22 < iArr.length; i22++) {
                    int i6 = iArr[i22];
                    if (i6 != 0 && (SupportMenu.USER_MASK & i6) == ((i6 >> 8) & SupportMenu.USER_MASK)) {
                        i6 &= 255;
                        iArr[i22] = ((((i6 * (16711935 & i5)) >> 8) & 16711935) | ViewCompat.MEASURED_STATE_MASK) | ((((i5 >> 8) & 340878095) * i6) & -887858703);
                    }
                }
            }
            for (i22 = 0; i22 < iArr.length; i22++) {
                iArr[i22] = fo.bl(iArr[i22], d);
            }
            if ((i4 == 0 ? 0 : this.am[i4 - 1]) == 0) {
                int i7;
                if (ap.ar == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.ax[i22] = iArr[bArr[i22] & 892507988];
                    }
                } else if (ap.ar == 627334030 && i == -1911956907) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 >> 1) + ((i5 >> 1) << 6)] & -423383363];
                            i22++;
                            i7++;
                        }
                    }
                } else if (ap.ar == -1129031659 && i == -1698637571) {
                    i7 = 0;
                    for (i5 = 0; i5 < i; i5++) {
                        i22 = 0;
                        while (i22 < i) {
                            this.ax[i7] = iArr[bArr[(i22 << 1) + ((i5 << 1) << 7)] & -1748465740];
                            i22++;
                            i7++;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            i4++;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void am() {
        this.ax = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i) {
        int i2;
        int i3;
        int[] iArr;
        if (this.ag == 1 || this.ag == 3) {
            i2 = this.ap * i;
            if (this.ag == 1) {
                i2 = -i2;
            }
            this.az = -1499397201 & (this.az + i2);
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                for (i3 = 0; i3 < 16384; i3++) {
                    ac[i3] = this.ax[((i2 * 128) + i3) & 16383];
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
        if (this.ag == 2 || this.ag == 4) {
            i2 = this.ap * i;
            if (this.ag == 2) {
                i2 = -i2;
            }
            this.au = (this.au + i2) & 127;
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                for (int i4 = 0; i4 < 16384; i4 += 128) {
                    for (i3 = 0; i3 < 128; i3++) {
                        ac[i4 + i3] = this.ax[((i3 + i2) & 16383) + i4];
                    }
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq() {
        this.ax = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
        int i2;
        int i3;
        int[] iArr;
        if (this.ag == 1 || this.ag == 3) {
            i2 = this.ap * i;
            if (this.ag == 1) {
                i2 = -i2;
            }
            this.az = (this.az + i2) & 127;
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                for (i3 = 0; i3 < 16384; i3++) {
                    ac[i3] = this.ax[((i2 * 128) + i3) & 16383];
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
        if (this.ag == 2 || this.ag == 4) {
            i2 = this.ap * i;
            if (this.ag == 2) {
                i2 = -i2;
            }
            this.au = (this.au + i2) & 127;
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                for (int i4 = 0; i4 < 16384; i4 += 128) {
                    for (i3 = 0; i3 < 128; i3++) {
                        ac[i4 + i3] = this.ax[((i3 + i2) & 16383) + i4];
                    }
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(int i) {
        int i2;
        int i3;
        int[] iArr;
        if (this.ag == 1 || this.ag == 3) {
            i2 = this.ap * i;
            if (this.ag == 1) {
                i2 = -i2;
            }
            this.az = (this.az + i2) & 127;
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                for (i3 = 0; i3 < 16384; i3++) {
                    ac[i3] = this.ax[((i2 * 128) + i3) & 16383];
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
        if (this.ag == 2 || this.ag == 4) {
            i2 = this.ap * i;
            if (this.ag == 2) {
                i2 = -i2;
            }
            this.au = (this.au + i2) & 127;
            if (this.aw && this.ax != null) {
                if (ac == null || ac.length < this.ax.length) {
                    ac = new int[this.ax.length];
                }
                for (int i4 = 0; i4 < 16384; i4 += 128) {
                    for (i3 = 0; i3 < 128; i3++) {
                        ac[i4 + i3] = this.ax[((i3 + i2) & 16383) + i4];
                    }
                }
                iArr = this.ax;
                this.ax = ac;
                ac = iArr;
                this.aw = false;
            }
        }
    }
}
