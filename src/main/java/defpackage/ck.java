package defpackage;

import com.jagex.jagex3.client.input.softkeyboard.al;
import java.util.LinkedList;

/* renamed from: ck */
public abstract class ck {
    public static final int cj = 71;
    static int ld;
    int ad;
    int ae;
    byte[][][] ag;
    int ai;
    int aj;
    short[][][] ak;
    int al;
    int am;
    byte[][][] ap;
    int aq;
    int ar;
    short[][][] as;
    di[][][][] au;
    boolean ax;
    boolean az;

    ck() {
        try {
            this.ae = 1918794457;
            this.am = -382154643;
            LinkedList linkedList = new LinkedList();
            this.az = false;
            this.ax = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static al ay(int i) {
        try {
            al ac = client.aq.abx((byte) 14).ac(0, 2066806294);
            ac.at(hm.cg, 0, 1851888325);
            ac.at(hm.ch, 1, 1851888325);
            return ac;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static hj bq(int i) {
        try {
            hj hjVar = new hj();
            hjVar.ad = -1815215944;
            hjVar.aq = -2087671645;
            hjVar.ar = -1543602207;
            hjVar.al = 519987656;
            while (true) {
                int i2 = hjVar.al;
                int i3 = hjVar.ar;
                if (((hjVar.ar * -1826743065) - 1) * (hjVar.al * -507697637) >= ii.ai * 1909797369) {
                    hjVar.ar += 220514601;
                }
                if (((hjVar.al * -507697637) - 1) * (hjVar.ar * -1826743065) >= ii.ai * 1909797369) {
                    hjVar.al -= 737494035;
                }
                if ((hjVar.ar * -1826743065) * ((hjVar.al * -507697637) - 1) >= ii.ai * 1909797369) {
                    hjVar.al -= 737494035;
                }
                if (i2 * -507697637 == hjVar.al * -507697637 && i3 * -1826743065 == hjVar.ar * -1826743065) {
                    break;
                }
            }
            hjVar.aj = ((765 - ((hjVar.ad * -1025891283) * (hjVar.ar * -1826743065))) / ((hjVar.ar * -1826743065) + 1)) * -1535344979;
            if (hjVar.aj * -1320970971 > 5) {
                hjVar.aj = 913209697;
            }
            hjVar.ai = ((480 - ((hjVar.al * -507697637) * (hjVar.aq * -415854127))) / ((hjVar.al * -507697637) + 1)) * -1860385351;
            if (hjVar.ai * 1921233033 > 5) {
                hjVar.ai = -711992163;
            }
            hjVar.ae = (((765 - ((hjVar.ar * -1826743065) * (hjVar.ad * -1025891283))) - (((hjVar.ar * -1826743065) - 1) * (hjVar.aj * -1320970971))) / 2) * 289176225;
            hjVar.am = ((((hjVar.ar * -1826743065) * ((hjVar.aj * -1320970971) + (hjVar.ad * -1025891283))) + (hjVar.ae * 987359585)) - (hjVar.aj * -1320970971)) * -2085320479;
            hjVar.ak = (((480 - ((hjVar.al * -507697637) * (hjVar.aq * -415854127))) - (((hjVar.al * -507697637) - 1) * (hjVar.ai * 1921233033))) / 2) * 2059691019;
            return hjVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa() {
        short[][][] sArr = (short[][][]) null;
        this.ak = sArr;
        this.as = sArr;
        byte[][][] bArr = (byte[][][]) null;
        this.ag = bArr;
        this.ap = bArr;
        this.au = (di[][][][]) null;
        this.az = false;
        this.ax = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(int i, int i2, lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af != 0) {
            if ((af & 1) != 0) {
                ag(i, i2, ljVar, af, (byte) 16);
            } else {
                ap(i, i2, ljVar, af, 2018634595);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ac() {
        return this.az && this.ax;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ae(byte b) {
        try {
            return this.az && this.ax;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af(kh khVar) {
        if (!ae((byte) 6)) {
            byte[] ar = khVar.ar(this.ae * 1979161239, this.am * -1371701605, 1911796835);
            if (ar != null) {
                aq(new lj(ar), -743719316);
                this.az = true;
                this.ax = true;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(int i, int i2, lj ljVar, int i3, byte b) {
        Object obj = null;
        if ((i3 & 2) != 0) {
            obj = 1;
        }
        if (obj != null) {
            try {
                this.as[0][i][i2] = (short) ljVar.af(1804771424);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ck.ag(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        this.ak[0][i][i2] = (short) ljVar.af(1804771424);
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(kh khVar) {
        if (!ae((byte) 68)) {
            byte[] ar = khVar.ar(this.ae * 1979161239, this.am * -1371701605, 1553775007);
            if (ar != null) {
                aq(new lj(ar), -1710947074);
                this.az = true;
                this.ax = true;
            }
        }
    }

    public abstract void ai(lj ljVar);

    public abstract void aj(lj ljVar);

    /* Access modifiers changed, original: 0000 */
    public void ak(kh khVar, int i) {
        try {
            if (!ae((byte) 90)) {
                byte[] ar = khVar.ar(this.ae * 1979161239, this.am * -1371701605, 766609585);
                if (ar != null) {
                    aq(new lj(ar), -1087647913);
                    this.az = true;
                    this.ax = true;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(int i) {
        try {
            this.ak = (short[][][]) null;
            this.as = (short[][][]) null;
            this.ag = (byte[][][]) null;
            this.ap = (byte[][][]) null;
            this.au = (di[][][][]) null;
            this.az = false;
            this.ax = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an(int i, int i2, lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af != 0) {
            if ((af & 1) != 0) {
                ag(i, i2, ljVar, af, (byte) 16);
            } else {
                ap(i, i2, ljVar, af, 2018634595);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        short[][][] sArr = (short[][][]) null;
        this.ak = sArr;
        this.as = sArr;
        byte[][][] bArr = (byte[][][]) null;
        this.ag = bArr;
        this.ap = bArr;
        this.au = (di[][][][]) null;
        this.az = false;
        this.ax = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i, int i2, lj ljVar, int i3, int i4) {
        Object obj = (i3 & 2) != 0 ? 1 : null;
        Object obj2 = (i3 & 4) != 0 ? 1 : null;
        try {
            int af;
            int i5;
            this.ak[0][i][i2] = (short) ljVar.af(1804771424);
            if (obj != null) {
                af = ljVar.af(1804771424);
                for (i5 = 0; i5 < af; i5++) {
                    int af2 = ljVar.af(1804771424);
                    if (af2 != 0) {
                        this.as[i5][i][i2] = (short) af2;
                        af2 = ljVar.af(1804771424);
                        this.ag[i5][i][i2] = (byte) (af2 >> 2);
                        this.ap[i5][i][i2] = (byte) (af2 & 3);
                    }
                }
            }
            if (obj2 != null) {
                for (int i6 = 0; i6 < ((i3 & 24) >> 3) + 1; i6++) {
                    af = ljVar.af(1804771424);
                    if (af != 0) {
                        di[] diVarArr = new di[af];
                        this.au[i6][i][i2] = diVarArr;
                        for (i5 = 0; i5 < af; i5++) {
                            int bi = ljVar.bi(952828365);
                            int af3 = ljVar.af(1804771424);
                            diVarArr[i5] = new di(bi, af3 >> 2, af3 & 3);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void aq(lj ljVar, int i);

    /* Access modifiers changed, original: 0000 */
    public void as(int i, int i2, lj ljVar, int i3) {
        try {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                if ((af & 1) != 0) {
                    ag(i, i2, ljVar, af, (byte) 16);
                } else {
                    ap(i, i2, ljVar, af, 2018634595);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at(int i, int i2, lj ljVar, int i3) {
        if (((i3 & 2) != 0 ? 1 : 0) != 0) {
            this.as[0][i][i2] = (short) ljVar.af(1804771424);
        }
        this.ak[0][i][i2] = (short) ljVar.af(1804771424);
    }

    /* Access modifiers changed, original: 0000 */
    public int au(int i) {
        try {
            return this.ar * -293139945;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av(int i, int i2, lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af != 0) {
            if ((af & 1) != 0) {
                ag(i, i2, ljVar, af, (byte) 16);
            } else {
                ap(i, i2, ljVar, af, 2018634595);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aw() {
        return this.az && this.ax;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ax() {
        return this.az && this.ax;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(kh khVar) {
        if (!ae((byte) 80)) {
            byte[] ar = khVar.ar(this.ae * 1979161239, this.am * -1371701605, 2101317145);
            if (ar != null) {
                aq(new lj(ar), -16490193);
                this.az = true;
                this.ax = true;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int az(int i) {
        try {
            return this.al * 1871460315;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ck.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(int i, int i2, lj ljVar, int i3) {
        if (((i3 & 2) != 0 ? 1 : 0) != 0) {
            this.as[0][i][i2] = (short) ljVar.af(1804771424);
        }
        this.ak[0][i][i2] = (short) ljVar.af(1804771424);
    }

    /* Access modifiers changed, original: 0000 */
    public int bb() {
        return this.al * 1871460315;
    }

    /* Access modifiers changed, original: 0000 */
    public int bd() {
        return this.ar * -293139945;
    }

    /* Access modifiers changed, original: 0000 */
    public int bf() {
        return this.al * 1871460315;
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(int i, int i2, lj ljVar, int i3) {
        if (((i3 & 2) != 0 ? 1 : 0) != 0) {
            this.as[0][i][i2] = (short) ljVar.af(1804771424);
        }
        this.ak[0][i][i2] = (short) ljVar.af(1804771424);
    }

    /* Access modifiers changed, original: 0000 */
    public int bl() {
        return this.al * 1722495503;
    }

    /* Access modifiers changed, original: 0000 */
    public void bm(int i, int i2, lj ljVar, int i3) {
        int af;
        int i4 = 1;
        int i5 = (i3 & 2) != 0 ? 1 : 0;
        if ((i3 & 4) == 0) {
            i4 = 0;
        }
        this.ak[0][i][i2] = (short) ljVar.af(1804771424);
        if (i5 != 0) {
            af = ljVar.af(1804771424);
            for (i5 = 0; i5 < af; i5++) {
                int af2 = ljVar.af(1804771424);
                if (af2 != 0) {
                    this.as[i5][i][i2] = (short) af2;
                    af2 = ljVar.af(1804771424);
                    this.ag[i5][i][i2] = (byte) (af2 >> 2);
                    this.ap[i5][i][i2] = (byte) (af2 & 3);
                }
            }
        }
        if (i4 != 0) {
            for (i5 = 0; i5 < ((i3 & 24) >> 3) + 1; i5++) {
                af = ljVar.af(1804771424);
                if (af != 0) {
                    di[] diVarArr = new di[af];
                    this.au[i5][i][i2] = diVarArr;
                    for (i4 = 0; i4 < af; i4++) {
                        int bi = ljVar.bi(-388462431);
                        int af3 = ljVar.af(1804771424);
                        diVarArr[i4] = new di(bi, af3 >> 2, af3 & 3);
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bo() {
        return this.al * 1871460315;
    }

    /* Access modifiers changed, original: 0000 */
    public int bq() {
        return this.ar * -293139945;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(int i, int i2, lj ljVar, int i3) {
        int af;
        int i4 = 1;
        int i5 = (i3 & 2) != 0 ? 1 : 0;
        if ((i3 & 4) == 0) {
            i4 = 0;
        }
        this.ak[0][i][i2] = (short) ljVar.af(1804771424);
        if (i5 != 0) {
            af = ljVar.af(1804771424);
            for (i5 = 0; i5 < af; i5++) {
                int af2 = ljVar.af(1804771424);
                if (af2 != 0) {
                    this.as[i5][i][i2] = (short) af2;
                    af2 = ljVar.af(1804771424);
                    this.ag[i5][i][i2] = (byte) (af2 >> 2);
                    this.ap[i5][i][i2] = (byte) (af2 & 3);
                }
            }
        }
        if (i4 != 0) {
            for (i5 = 0; i5 < ((i3 & 24) >> 3) + 1; i5++) {
                af = ljVar.af(1804771424);
                if (af != 0) {
                    di[] diVarArr = new di[af];
                    this.au[i5][i][i2] = diVarArr;
                    for (i4 = 0; i4 < af; i4++) {
                        int bi = ljVar.bi(-136666687);
                        int af3 = ljVar.af(1804771424);
                        diVarArr[i4] = new di(bi, af3 >> 2, af3 & 3);
                    }
                }
            }
        }
    }
}
