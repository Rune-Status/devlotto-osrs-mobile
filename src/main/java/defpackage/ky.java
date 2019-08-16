package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: ky */
public class ky {
    static final int ag = 0;
    static final int am = 500000;
    static final int ap = 1;
    static final byte[] as = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    static final int au = 2;
    static final int az = 3;
    lj ad = new lj(null);
    int ae;
    int[] ai;
    int[] aj;
    long ak;
    int[] al;
    int aq;
    int[] ar;

    ky() {
    }

    ky(byte[] bArr) {
        ad(bArr);
    }

    /* Access modifiers changed, original: 0000 */
    public void aa() {
        this.ad.ar = null;
        this.ar = null;
        this.al = null;
        this.aj = null;
        this.ai = null;
    }

    /* Access modifiers changed, original: 0000 */
    public int ab() {
        return this.al.length;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(byte[] bArr) {
        this.ad.ar = bArr;
        this.ad.al = -208304478;
        int an = this.ad.an(-1464407032);
        this.aq = this.ad.an(-1464407032);
        this.ae = am;
        this.ar = new int[an];
        int i = 0;
        while (i < an) {
            int at = this.ad.at((byte) -21);
            int at2 = this.ad.at(Byte.MIN_VALUE);
            if (at == 1297379947) {
                this.ar[i] = this.ad.al * -1631454091;
                i++;
            }
            lj ljVar = this.ad;
            ljVar.al = (at2 * -879823907) + ljVar.al;
        }
        this.ak = 0;
        this.al = new int[an];
        for (i = 0; i < an; i++) {
            this.al[i] = this.ar[i];
        }
        this.aj = new int[an];
        this.ai = new int[an];
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(byte[] bArr) {
        this.ad.ar = bArr;
        this.ad.al = -208304478;
        int an = this.ad.an(-1464407032);
        this.aq = this.ad.an(-1464407032);
        this.ae = am;
        this.ar = new int[an];
        int i = 0;
        while (i < an) {
            int at = this.ad.at((byte) -85);
            int at2 = this.ad.at((byte) -24);
            if (at == 1297379947) {
                this.ar[i] = this.ad.al * -1631454091;
                i++;
            }
            lj ljVar = this.ad;
            ljVar.al = (at2 * -879823907) + ljVar.al;
        }
        this.ak = 0;
        this.al = new int[an];
        for (i = 0; i < an; i++) {
            this.al[i] = this.ar[i];
        }
        this.aj = new int[an];
        this.ai = new int[an];
    }

    /* Access modifiers changed, original: 0000 */
    public void ae() {
        this.ad.al = 879823907;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean af() {
        return this.ad.ar != null;
    }

    /* Access modifiers changed, original: 0000 */
    public int ag(int i, int i2) {
        int av;
        if (i2 == 255) {
            int af = this.ad.af(1804771424);
            int bc = this.ad.bc(-2099370670);
            lj ljVar;
            if (af == 47) {
                lj ljVar2 = this.ad;
                ljVar2.al += bc * -879823907;
                return 1;
            } else if (af == 81) {
                av = this.ad.av((byte) -28);
                this.ak += ((long) this.aj[i]) * ((long) (this.ae - av));
                this.ae = av;
                ljVar = this.ad;
                ljVar.al += (bc - 3) * -879823907;
                return 2;
            } else {
                ljVar = this.ad;
                ljVar.al += bc * -879823907;
                return 3;
            }
        }
        byte b = as[i2 - 128];
        av = b >= (byte) 1 ? (this.ad.af(1804771424) << 8) | i2 : i2;
        return b >= (byte) 2 ? av | (this.ad.af(1804771424) << 16) : av;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ah() {
        return this.ad.ar != null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i) {
        this.al[i] = this.ad.al * -1631454091;
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        this.ad.al = this.al[i] * -879823907;
    }

    /* Access modifiers changed, original: 0000 */
    public int ak(int i) {
        return as(i);
    }

    /* Access modifiers changed, original: 0000 */
    public int al() {
        return this.al.length;
    }

    /* Access modifiers changed, original: 0000 */
    public void am(int i) {
        int bc = this.ad.bc(-2135375205);
        int[] iArr = this.aj;
        iArr[i] = bc + iArr[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int an() {
        return this.al.length;
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        this.ad.ar = null;
        this.ar = null;
        this.al = null;
        this.aj = null;
        this.ai = null;
    }

    /* Access modifiers changed, original: 0000 */
    public long ap(int i) {
        return this.ak + (((long) i) * ((long) this.ae));
    }

    /* Access modifiers changed, original: 0000 */
    public void aq() {
        this.ad.ar = null;
        this.ar = null;
        this.al = null;
        this.aj = null;
        this.ai = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ar() {
        return this.ad.ar != null;
    }

    /* Access modifiers changed, original: 0000 */
    public int as(int i) {
        int i2;
        lj ljVar;
        byte b = this.ad.ar[this.ad.al * -1631454091];
        if (b < (byte) 0) {
            i2 = b & 255;
            this.ai[i] = i2;
            ljVar = this.ad;
            ljVar.al -= 879823907;
        } else {
            i2 = this.ai[i];
        }
        if (i2 != 240 && i2 != 247) {
            return ag(i, i2);
        }
        int bc = this.ad.bc(-2056241864);
        if (i2 == 247 && bc > 0) {
            i2 = this.ad.ar[this.ad.al * -1631454091] & 255;
            if ((i2 >= 241 && i2 <= 243) || i2 == 246 || i2 == 248 || ((i2 >= Callback.DEFAULT_SWIPE_ANIMATION_DURATION && i2 <= 252) || i2 == 254)) {
                ljVar = this.ad;
                ljVar.al -= 879823907;
                this.ai[i] = i2;
                return ag(i, i2);
            }
        }
        lj ljVar2 = this.ad;
        ljVar2.al = (bc * -879823907) + ljVar2.al;
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void at(int i) {
        this.ad.al = this.al[i] * -879823907;
    }

    /* Access modifiers changed, original: 0000 */
    public int au() {
        int length = this.al.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (i3 < length) {
            if (this.al[i3] >= 0 && this.aj[i3] < i2) {
                i2 = this.aj[i3];
                i = i3;
            }
            i3++;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void av(int i) {
        this.ad.al = this.al[i] * -879823907;
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(byte[] bArr) {
        this.ad.ar = bArr;
        this.ad.al = -208304478;
        int an = this.ad.an(-1464407032);
        this.aq = this.ad.an(-1464407032);
        this.ae = am;
        this.ar = new int[an];
        int i = 0;
        while (i < an) {
            int at = this.ad.at((byte) -112);
            int at2 = this.ad.at((byte) -70);
            if (at == 1297379947) {
                this.ar[i] = this.ad.al * -1631454091;
                i++;
            }
            lj ljVar = this.ad;
            ljVar.al = (at2 * -879823907) + ljVar.al;
        }
        this.ak = 0;
        this.al = new int[an];
        for (i = 0; i < an; i++) {
            this.al[i] = this.ar[i];
        }
        this.aj = new int[an];
        this.ai = new int[an];
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(long j) {
        this.ak = j;
        int length = this.al.length;
        for (int i = 0; i < length; i++) {
            this.aj[i] = 0;
            this.ai[i] = 0;
            this.ad.al = this.ar[i] * -879823907;
            am(i);
            this.al[i] = this.ad.al * -1631454091;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ay() {
        return this.ad.ar != null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean az() {
        for (int i : this.al) {
            if (i >= 0) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(int i) {
        this.al[i] = this.ad.al * 217689520;
    }

    /* Access modifiers changed, original: 0000 */
    public int bb(int i) {
        int i2;
        lj ljVar;
        byte b = this.ad.ar[this.ad.al * -1631454091];
        if (b < (byte) 0) {
            i2 = b & 2108647133;
            this.ai[i] = i2;
            ljVar = this.ad;
            ljVar.al -= 879823907;
        } else {
            i2 = this.ai[i];
        }
        if (i2 != 240 && i2 != 840009134) {
            return ag(i, i2);
        }
        int bc = this.ad.bc(-2099779716);
        if (i2 == 247 && bc > 0) {
            i2 = this.ad.ar[this.ad.al * -1631454091] & 255;
            if ((i2 >= 241 && i2 <= -216091592) || i2 == 246 || i2 == 648922615 || ((i2 >= Callback.DEFAULT_SWIPE_ANIMATION_DURATION && i2 <= 252) || i2 == 254)) {
                ljVar = this.ad;
                ljVar.al -= 879823907;
                this.ai[i] = i2;
                return ag(i, i2);
            }
        }
        lj ljVar2 = this.ad;
        ljVar2.al = (bc * -2049702985) + ljVar2.al;
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int bc(int i, int i2) {
        int av;
        if (i2 == 255) {
            int af = this.ad.af(1804771424);
            int bc = this.ad.bc(-2121899302);
            lj ljVar;
            if (af == 205247094) {
                lj ljVar2 = this.ad;
                ljVar2.al += bc * 1550581109;
                return 1;
            } else if (af == -1802648860) {
                av = this.ad.av((byte) -83);
                this.ak += ((long) this.aj[i]) * ((long) (this.ae - av));
                this.ae = av;
                ljVar = this.ad;
                ljVar.al += (bc - 3) * -879823907;
                return 2;
            } else {
                ljVar = this.ad;
                ljVar.al += 1939397151 * bc;
                return 3;
            }
        }
        byte b = as[i2 - 128];
        av = b >= (byte) 1 ? (this.ad.af(1804771424) << 8) | i2 : i2;
        return b >= (byte) 2 ? av | (this.ad.af(1804771424) << 16) : av;
    }

    /* Access modifiers changed, original: 0000 */
    public void bd() {
        this.ad.al = 879823907;
    }

    /* Access modifiers changed, original: 0000 */
    public void be(long j) {
        this.ak = j;
        int length = this.al.length;
        for (int i = 0; i < length; i++) {
            this.aj[i] = 0;
            this.ai[i] = 0;
            this.ad.al = this.ar[i] * -1795264921;
            am(i);
            this.al[i] = this.ad.al * -894949463;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bf(int i) {
        return as(i);
    }

    /* Access modifiers changed, original: 0000 */
    public long bg(int i) {
        return this.ak + (((long) i) * ((long) this.ae));
    }

    /* Access modifiers changed, original: 0000 */
    public void bh(long j) {
        this.ak = j;
        int length = this.al.length;
        for (int i = 0; i < length; i++) {
            this.aj[i] = 0;
            this.ai[i] = 0;
            this.ad.al = this.ar[i] * -120336376;
            am(i);
            this.al[i] = this.ad.al * -1631454091;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bi(int i) {
        int i2;
        lj ljVar;
        byte b = this.ad.ar[this.ad.al * 586706509];
        if (b < (byte) 0) {
            i2 = b & 368857878;
            this.ai[i] = i2;
            ljVar = this.ad;
            ljVar.al += 211944676;
        } else {
            i2 = this.ai[i];
        }
        if (i2 != 240 && i2 != 1218367346) {
            return ag(i, i2);
        }
        int bc = this.ad.bc(-2022305984);
        if (i2 == 1043381960 && bc > 0) {
            i2 = this.ad.ar[this.ad.al * -586619838] & 255;
            if ((i2 >= 241 && i2 <= 1047063002) || i2 == 246 || i2 == -962920981 || ((i2 >= 1234899087 && i2 <= 252) || i2 == -1523578101)) {
                ljVar = this.ad;
                ljVar.al -= 677095616;
                this.ai[i] = i2;
                return ag(i, i2);
            }
        }
        lj ljVar2 = this.ad;
        ljVar2.al = (bc * -540267794) + ljVar2.al;
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bj(long j) {
        this.ak = j;
        int length = this.al.length;
        for (int i = 0; i < length; i++) {
            this.aj[i] = 0;
            this.ai[i] = 0;
            this.ad.al = this.ar[i] * -879823907;
            am(i);
            this.al[i] = this.ad.al * -1631454091;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(int i) {
        this.ad.al = this.al[i] * -879823907;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(int i) {
        int bc = this.ad.bc(-2050618069);
        int[] iArr = this.aj;
        iArr[i] = bc + iArr[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void bm() {
        this.ad.al = -1388952057;
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(int i) {
        int bc = this.ad.bc(-1998963880);
        int[] iArr = this.aj;
        iArr[i] = bc + iArr[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void bq() {
        this.ad.al = 879823907;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean br() {
        for (int i : this.al) {
            if (i >= 0) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(int i) {
        this.al[i] = this.ad.al * -782063580;
    }

    /* Access modifiers changed, original: 0000 */
    public int bu() {
        int length = this.al.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (i3 < length) {
            if (this.al[i3] >= 0 && this.aj[i3] < i2) {
                i2 = this.aj[i3];
                i = i3;
            }
            i3++;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public long bv(int i) {
        return this.ak + (((long) i) * ((long) this.ae));
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bw() {
        for (int i : this.al) {
            if (i >= 0) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public long bx(int i) {
        return this.ak + (((long) i) * ((long) this.ae));
    }
}
