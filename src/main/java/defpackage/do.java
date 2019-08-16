package defpackage;

import java.util.Collection;

/* renamed from: do */
public class do extends mp {
    static kh ad = null;
    static final int ag = 3;
    public static final int am = 7;
    static gz aq = new gz(64, null);
    static kv dp;
    static String es;
    public int aj;
    public int al;
    public int ar;

    do() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("do.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(kh khVar) {
        ad = khVar;
    }

    static final void ai(int i, int i2, int i3, byte b) {
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        for (i4 = 0; i4 < 8; i4++) {
            i5 = 0;
            while (i5 < 8) {
                try {
                    in.ad[i][i2 + i4][i3 + i5] = 0;
                    i5++;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("do.ai(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
        }
        if (i2 > 0) {
            for (i5 = 1; i5 < 8; i5++) {
                i4 = i3 + i5;
                in.ad[i][i2][i4] = in.ad[i][i2 - 1][i4];
            }
        }
        if (i3 > 0) {
            while (i7 < 8) {
                i6 = i2 + i7;
                in.ad[i][i6][i3] = in.ad[i][i6][i3 - 1];
                i7++;
            }
        }
        if (i2 > 0) {
            i5 = i2 - 1;
            if (in.ad[i][i5][i3] != 0) {
                in.ad[i][i2][i3] = in.ad[i][i5][i3];
                return;
            }
        }
        if (i3 > 0) {
            i5 = i3 - 1;
            if (in.ad[i][i2][i5] != 0) {
                in.ad[i][i2][i3] = in.ad[i][i2][i5];
                return;
            }
        }
        if (i2 > 0 && i3 > 0) {
            i5 = i2 - 1;
            i6 = i3 - 1;
            if (in.ad[i][i5][i6] != 0) {
                in.ad[i][i2][i3] = in.ad[i][i5][i6];
            }
        }
    }

    public static void ai(kh khVar) {
        ad = khVar;
    }

    public static void ap(Collection collection) {
        collection.add(aq);
    }

    public static void au(Collection collection) {
        collection.add(aq);
    }

    public static void az(Collection collection) {
        collection.add(aq);
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(lj ljVar, int i) {
        if (1 == i) {
            this.ar = ljVar.an(-1464407032) * 58968923;
            this.al = ljVar.af(1804771424) * 1339844455;
            this.aj = ljVar.af(1804771424) * 2095121601;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, -1796558802);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        if (1 == i) {
            try {
                this.ar = ljVar.an(-1464407032) * 58968923;
                this.al = ljVar.af(1804771424) * 1339844455;
                this.aj = ljVar.af(1804771424) * 2095121601;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("do.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 2046077451);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, -1073371975);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("do.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 1083621015);
            } else {
                return;
            }
        }
    }
}
