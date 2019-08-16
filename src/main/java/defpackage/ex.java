package defpackage;

import com.jagex.oldscape.osrenderer.ad;

/* renamed from: ex */
public abstract class ex extends ew {
    public static final int ag = 9;
    public static final int ao = 8;
    public static final int bu = 43;
    protected bn ad;
    protected bf aj;
    protected el al;
    protected em aq;
    protected at ar;

    protected ex() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aq(String[] strArr, short[] sArr, int i, int i2, int i3) {
        if (i < i2) {
            try {
                int i4 = (i + i2) / 2;
                String str = strArr[i4];
                strArr[i4] = strArr[i2];
                strArr[i2] = str;
                short s = sArr[i4];
                sArr[i4] = sArr[i2];
                sArr[i2] = s;
                i4 = i;
                for (int i5 = i; i5 < i2; i5++) {
                    if (str != null) {
                        if (strArr[i5] != null) {
                            if (strArr[i5].compareTo(str) >= (i5 & 1)) {
                            }
                        }
                    }
                    String str2 = strArr[i5];
                    strArr[i5] = strArr[i4];
                    strArr[i4] = str2;
                    short s2 = sArr[i5];
                    sArr[i5] = sArr[i4];
                    sArr[i4] = s2;
                    i4++;
                }
                strArr[i2] = strArr[i4];
                strArr[i4] = str;
                sArr[i2] = sArr[i4];
                sArr[i4] = s;
                ex.aq(strArr, sArr, i, i4 - 1, 352412105);
                ex.aq(strArr, sArr, i4 + 1, i2, -1052061308);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ex.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    static void bu(int i) {
        try {
            client.aq.abx((byte) 19).gs(ey.ai, -877567865);
            hm.cu = 825591517;
            lv.bs(go.kv, go.kg, go.kx, -1804322940);
            aa bx = client.aq.abx((byte) 14).bx(-1756732209);
            if (bx == null || !bx.dy(-1882265596)) {
                dw.ez.ac(new ac(false, 3), 2036406976);
                return;
            }
            dw.ez.ac(null, 40299946);
            bx.ai((byte) -117);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.bu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final boolean gh(al alVar, byte b) {
        try {
            if (alVar.fz == null) {
                return false;
            }
            for (int i = 0; i < alVar.fz.length; i++) {
                int gi = iv.gi(alVar, i, 2086483520);
                int i2 = alVar.fa[i];
                if (alVar.fz[i] == 2) {
                    if (gi >= i2) {
                        return false;
                    }
                } else if (alVar.fz[i] == 3) {
                    if (gi <= i2) {
                        return false;
                    }
                } else if (4 == alVar.fz[i]) {
                    if (i2 == gi) {
                        return false;
                    }
                } else if (i2 != gi) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.gh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ab(int i, int i2) {
        this.al.aw(i, i2, 2130903253);
        this.aq.er(this.al.ar, this.al.aq(1480841786), this.al.ar(1912634199), -2086019476);
    }

    public es ad(int i) {
        try {
            return this.aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ae(int i, int i2, int i3) {
        try {
            this.al.aw(i, i2, 2130903253);
            this.aq.er(this.al.ar, this.al.aq(1480841786), this.al.ar(449773282), -1953657282);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public es ag() {
        return this.aq;
    }

    public void ai(int i, int i2, int i3, int i4, int i5) {
        try {
            this.al.ac(i, i2, i3, i4, (byte) -50);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak(int i, byte b) {
        try {
            ad.bo(i, 100102307);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(int i, int i2, int i3) {
        try {
            this.al.az(i, i2, (byte) -114);
            this.aq.er(this.al.ar, i, i2, -1912056002);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void am(int i) {
        try {
            this.al.ad(1998238617).ae(240941788);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void an(int i, int i2, int i3, int i4) {
        this.al.ac(i, i2, i3, i4, (byte) -114);
    }

    public bl ap() {
        return this.ar;
    }

    public bl aq(int i) {
        try {
            return this.ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public bw ar(int i) {
        try {
            return this.aj;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(float f, int i) {
        try {
            this.ad.al(f, 202797059);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ex.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void at() {
        this.al.ad(1464560765).ae(96711177);
    }

    public bw au() {
        return this.aj;
    }

    public void av(int i, int i2) {
        this.al.aw(i, i2, 2130903253);
        this.aq.er(this.al.ar, this.al.aq(1480841786), this.al.ar(1371973056), -2132733079);
    }

    public void aw(int i, int i2) {
        this.al.az(i, i2, (byte) -90);
        this.aq.er(this.al.ar, i, i2, -2089802076);
    }

    public void ax(int i, int i2) {
        this.al.az(i, i2, (byte) -112);
        this.aq.er(this.al.ar, i, i2, -2121268461);
    }

    public void ay(int i, int i2, int i3, int i4) {
        this.al.ac(i, i2, i3, i4, (byte) -77);
    }

    public void az(int i, int i2) {
        this.al.az(i, i2, (byte) -27);
        this.aq.er(this.al.ar, i, i2, -2050951291);
    }

    public void ba(float f) {
        this.ad.al(f, -1478630952);
    }

    public void bk(float f) {
        this.ad.al(f, 979281674);
    }

    public void bs(int i) {
        ad.bo(i, -357467485);
    }
}
