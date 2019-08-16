package defpackage;

/* renamed from: ej */
public class ej extends ew {
    eb ad;
    be aq;
    ah ar;

    public ej() {
        try {
            this.ad = new eb(0, 0);
            this.aq = new be(this.ad.ad, 0, 0);
            this.ar = new ah(this.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, byte b) {
        try {
            de.ad = khVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0055=Splitter:B:25:0x0055, B:6:0x000b=Splitter:B:6:0x000b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static String am(int i, int i2, boolean z, int i3) {
        int i4 = 2;
        if (i2 < 2 || i2 > 36) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!z || i < 0) {
            try {
                return Integer.toString(i, i2);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("ej.am(");
                stringBuilder2.append(')');
                throw mv.aq(e, stringBuilder2.toString());
            }
        } else {
            int i5 = i / i2;
            while (i5 != 0) {
                i5 /= i2;
                i4++;
            }
            char[] cArr = new char[i4];
            cArr[0] = '+';
            i5 = i4 - 1;
            while (i5 > 0) {
                i4 = i / i2;
                int i6 = i - (i4 * i2);
                if (i6 >= 10) {
                    cArr[i5] = (char) (i6 + 87);
                } else {
                    cArr[i5] = (char) (i6 + 48);
                }
                i5--;
                i = i4;
            }
            return new String(cArr);
        }
    }

    static final boolean am(byte[] bArr, int i, int i2, int i3) {
        try {
            lj ljVar = new lj(bArr);
            int i4 = -1;
            boolean z = true;
            while (true) {
                int bf = ljVar.bf((byte) -48);
                if (bf == 0) {
                    return z;
                }
                int i5 = i4 + bf;
                i4 = 0;
                Object obj = null;
                while (true) {
                    if (obj == null) {
                        int bl = ljVar.bl(2131034147);
                        if (bl == 0) {
                            break;
                        }
                        i4 += bl - 1;
                        bl = ljVar.af(1804771424);
                        int i6 = ((i4 >> 6) & 63) + i;
                        int i7 = (i4 & 63) + i2;
                        if (i6 > 0 && i7 > 0 && i6 < 103 && i7 < 103) {
                            dx aq = aj.aq(i5, -88823785);
                            if ((bl >> 2) != 22 || !client.as || aq.af * -541605539 != 0 || 1 == aq.ao * -1334322195 || aq.bg) {
                                if (!aq.ae(1006047266)) {
                                    client.fj -= 171957039;
                                    z = false;
                                }
                                obj = 1;
                            }
                        }
                    } else if (ljVar.bl(2131034147) == 0) {
                        break;
                    } else {
                        ljVar.af(1804771424);
                    }
                }
                i4 = i5;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void bf(int i) {
        try {
            client.eb.aj(-1136706600);
            bv.bi((byte) 28);
            ce.fk.ad();
            for (int i2 = 0; i2 < 4; i2++) {
                client.gc[i2].ad((byte) 0);
            }
            System.gc();
            ae.am(2, 2098724239);
            client.pl = -325394341;
            client.pv = false;
            hv.ad(-493063643);
            he.ac(10, (byte) 102);
            aa bx = hr.um.bx(-1182114852);
            if (bx != null) {
                bx.ab((byte) 27);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ab(int i, int i2) {
        throw new Error("");
    }

    public es ad(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ae(int i, int i2, int i3) {
        try {
            throw new Error("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public es ag() {
        return this.ad;
    }

    public void ai(int i, int i2, int i3, int i4, int i5) {
        try {
            throw new Error("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(int i, int i2, int i3) {
        try {
            bm(new int[(i * i2)], i, i2, 1596335844);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void am(int i) {
    }

    public void an(int i, int i2, int i3, int i4) {
        throw new Error("");
    }

    public bl ap() {
        return this.aq;
    }

    public bl aq(int i) {
        try {
            return this.aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public bw ar(int i) {
        try {
            return this.ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(float f, int i) {
    }

    public void at() {
    }

    public bw au() {
        return this.ar;
    }

    public void av(int i, int i2) {
        throw new Error("");
    }

    public void aw(int i, int i2) {
        bm(new int[(i * i2)], i, i2, 2079884354);
    }

    public void ax(int i, int i2) {
        bm(new int[(i * i2)], i, i2, 1432853264);
    }

    public void ay(int i, int i2, int i3, int i4) {
        throw new Error("");
    }

    public void az(int i, int i2) {
        bm(new int[(i * i2)], i, i2, 978806189);
    }

    public void ba(float f) {
    }

    public void bd(int[] iArr, int i, int i2) {
        this.ad.er(iArr, i, i2, -2076358243);
        this.aq.al(iArr, i, i2, (byte) -27);
    }

    public void bk(float f) {
    }

    public void bm(int[] iArr, int i, int i2, int i3) {
        try {
            this.ad.er(iArr, i, i2, -2121373491);
            this.aq.al(iArr, i, i2, (byte) -63);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bo(ee eeVar) {
        bm(eeVar.ad, eeVar.aq, eeVar.ar, 1877681805);
    }

    public void bq(ee eeVar, byte b) {
        try {
            bm(eeVar.ad, eeVar.aq, eeVar.ar, 1820291045);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ej.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
