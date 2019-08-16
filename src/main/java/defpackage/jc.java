package defpackage;

/* renamed from: jc */
public class jc implements Comparable {
    int ad;

    jc(int i, String str) {
        try {
            this.ad = 772904581 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jc.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ae(ii iiVar, ii iiVar2, int i, boolean z, int i2) {
        if (1 == i) {
            try {
                int i3 = 2040602315 * iiVar.au;
                int i4 = iiVar2.au * 2040602315;
                if (!z) {
                    if (-1 == i3) {
                        i3 = 2001;
                    }
                    if (-1 == i4) {
                        i4 = 2001;
                    }
                }
                return i3 - i4;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jc.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (i == 2) {
            return (iiVar.aw * -2015421483) - (iiVar2.aw * -2015421483);
        } else {
            if (i == 3) {
                return iiVar.ax.equals("-") ? iiVar2.ax.equals("-") ? 0 : z ? -1 : 1 : iiVar2.ax.equals("-") ? !z ? -1 : 1 : iiVar.ax.compareTo(iiVar2.ax);
            } else {
                if (4 == i) {
                    if (iiVar.au(1921542003)) {
                        return iiVar2.au(2107549525) ? 0 : 1;
                    } else {
                        if (iiVar2.au(1896083469)) {
                            return -1;
                        }
                    }
                } else if (i == 5) {
                    if (iiVar.ag(-2055887364)) {
                        return iiVar2.ag(-1892560766) ? 0 : 1;
                    } else {
                        if (iiVar2.ag(-1835554439)) {
                            return -1;
                        }
                    }
                } else if (i == 6) {
                    if (iiVar.ap((byte) 0)) {
                        return iiVar2.ap((byte) 0) ? 0 : 1;
                    } else {
                        if (iiVar2.ap((byte) 0)) {
                            return -1;
                        }
                    }
                } else if (i != 7) {
                    return (iiVar.ag * -936955627) - (iiVar2.ag * -936955627);
                } else if (iiVar.as(2132219467)) {
                    return iiVar2.as(2132523382) ? 0 : 1;
                } else {
                    if (iiVar2.as(2133128733)) {
                        return -1;
                    }
                }
                return 0;
            }
        }
    }

    public static ee ai(kh khVar, int i, int i2, byte b) {
        try {
            return !bv.ah(khVar, i, i2, -1392223055) ? null : ad.aa(-753931553);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jc.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int au(int i, int i2, int i3, int i4) {
        try {
            return (in.aq[i][i2][i3] & 8) != 0 ? 0 : (i <= 0 || (in.aq[1][i2][i3] & 2) == 0) ? i : i - 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jc.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(jc jcVar, int i) {
        try {
            return (this.ad * -327355827) - (jcVar.ad * -327355827);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jc.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj) {
        return ad((jc) obj, 1894783911);
    }

    public int ap(Object obj) {
        return ad((jc) obj, -2067635217);
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(jc jcVar) {
        return (this.ad * -327355827) - (jcVar.ad * 1511769129);
    }

    public int as(Object obj) {
        return ad((jc) obj, 35206806);
    }

    public int au(Object obj) {
        return ad((jc) obj, 374496555);
    }

    public int compareTo(Object obj) {
        try {
            return ad((jc) obj, -1676224332);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jc.compareTo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
