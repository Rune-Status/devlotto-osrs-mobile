package defpackage;

/* renamed from: kw */
public class kw extends eo {
    static final int ai = 36;
    public static final int az = 16;
    final boolean aq;

    public kw(boolean z) {
        try {
            this.aq = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, int i) {
        try {
            dw.ad = khVar;
            dw.aq = khVar2;
            dw.ar = dw.ad.ax(3, (byte) 5) * 507495737;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kw.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int bf(int i, int i2) {
        try {
            return (int) Math.pow(2.0d, (double) ((((float) i) / 256.0f) + 7.0f));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kw.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void hr(al alVar, byte b) {
        try {
            int i = alVar.an * 365070409;
            if (324 == i) {
                if (client.rq * 1173780027 == -1) {
                    client.rq = alVar.cj * 198898831;
                    client.rf = alVar.cm * -1053429369;
                }
                if (client.re.ar) {
                    alVar.cj = client.rq * 1044884079;
                } else {
                    alVar.cj = client.rf * 431728133;
                }
            } else if (i == 325) {
                if (client.rq * 1173780027 == -1) {
                    client.rq = alVar.cj * 198898831;
                    client.rf = alVar.cm * -1053429369;
                }
                if (client.re.ar) {
                    alVar.cj = client.rf * 431728133;
                } else {
                    alVar.cj = client.rq * 1044884079;
                }
            } else if (i == 327) {
                alVar.ck = 382723178;
                alVar.co = (((int) (Math.sin(((double) (client.bj * 2133672263)) / 40.0d) * 256.0d)) & 2047) * -1450063701;
                alVar.ce = 1785918447;
                alVar.cy = 0;
            } else if (328 == i) {
                alVar.ck = 382723178;
                alVar.co = (((int) (Math.sin(((double) (client.bj * 2133672263)) / 40.0d) * 256.0d)) & 2047) * -1450063701;
                alVar.ce = 1785918447;
                alVar.cy = -927961631;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kw.hr(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ap((er) obj, (er) obj2, -418410736);
    }

    /* Access modifiers changed, original: 0000 */
    public int ap(er erVar, er erVar2, int i) {
        try {
            if (erVar.aj * -356714521 != 0) {
                if (erVar2.aj * -356714521 == 0) {
                    return this.aq ? -1 : 1;
                }
            } else if (erVar2.aj * -356714521 != 0) {
                return this.aq ? 1 : -1;
            }
            return aq(erVar, erVar2, 2102122503);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kw.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int au(er erVar, er erVar2) {
        if (erVar.aj * 27346275 != 0) {
            if (erVar2.aj * -356714521 == 0) {
                return this.aq ? -1 : 1;
            }
        } else if (erVar2.aj * -356714521 != 0) {
            return this.aq ? 1 : -1;
        }
        return aq(erVar, erVar2, 1252687704);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ap((er) obj, (er) obj2, -418410736);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kw.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
