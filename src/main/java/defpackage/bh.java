package defpackage;

/* renamed from: bh */
public final class bh {
    static final int sj = -2;
    static final int tb = 32;
    int ad;
    int ai;
    public long aj;
    public br al;
    int aq;
    int ar;

    bh() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void am(int i) {
        try {
            if (!client.eo || hm.cg == null || hm.cg.length() <= 0) {
                di.as(-226295157);
            } else {
                bq.ag(2141299247);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bh.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final boolean aq(char c, byte b) {
        try {
            if (Character.isISOControl(c)) {
                return false;
            }
            if (fo.az(c, -1344390353)) {
                return true;
            }
            char[] cArr = mv.ar;
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
            cArr = mv.al;
            for (char c22 : cArr) {
                if (c22 == c) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bh.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean aq(int i) {
        try {
            return ((os) op.ad.aj()) != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bh.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void es(int i, int i2, int i3) {
        try {
            ce.fk.bc(am.jy * 1973701849, i, i2, false);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bh.es(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static String fc(String str, al alVar, int i) {
        StringBuilder stringBuilder;
        try {
            if (str.indexOf("%") != -1) {
                for (int i2 = 1; i2 <= 5; i2++) {
                    while (true) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("%");
                        stringBuilder.append(i2);
                        int indexOf = str.indexOf(stringBuilder.toString());
                        if (indexOf == -1) {
                            break;
                        }
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str.substring(0, indexOf));
                        stringBuilder2.append(bm.go(iv.gi(alVar, i2 - 1, 2086483520), (byte) 23));
                        stringBuilder2.append(str.substring(indexOf + 2));
                        str = stringBuilder2.toString();
                    }
                }
            }
            return str;
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("bh.fc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void gb(al alVar, int i, int i2, int i3) {
        try {
            alVar.bg = 1115865663 * i;
            if (alVar.bg * 817114559 > (alVar.bu * -1004867185) - (alVar.bl * 1272191791)) {
                alVar.bg = (alVar.bu * 911069233) - (alVar.bl * 1370115729);
            }
            if (alVar.bg * 817114559 < 0) {
                alVar.bg = 0;
            }
            alVar.bx = 1459446213 * i2;
            if (alVar.bx * -1344834291 > (alVar.bw * 901029295) - (alVar.bf * 1813264797)) {
                alVar.bx = (alVar.bw * 1672455851) - (alVar.bf * -2087857455);
            }
            if (alVar.bx * -1344834291 < 0) {
                alVar.bx = 0;
            }
            da.gk(alVar, (byte) 2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bh.gb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
