package defpackage;

/* renamed from: fb */
public class fb implements lk {
    public static final fb ad = new fb(0);
    public static final int ak = 17;
    public static final fb al = new fb(3);
    static final fb aq = new fb(1);
    static final fb ar = new fb(2);
    public static final int bf = 41;
    final int aj;

    fb(int i) {
        try {
            this.aj = 295963025 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final short am(float f, float f2, int i, int i2, int i3) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    public static pl aq(int i, byte b) {
        try {
            pl[] ad = mw.ad(-1536524741);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= ad.length) {
                    return null;
                }
                pl plVar = ad[i3];
                if (plVar.al * 684750963 == i) {
                    return plVar;
                }
                i2 = i3 + 1;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fb.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static fb[] ar() {
        return new fb[]{al, aq, ad, ar};
    }

    static final void ge(al[] alVarArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            try {
                int i4 = i3;
                if (i4 < alVarArr.length) {
                    al alVar = alVarArr[i4];
                    if (alVar != null) {
                        il ilVar;
                        if (alVar.af * 1845699613 == 0) {
                            if (alVar.fo != null) {
                                fb.ge(alVar.fo, i, 1806325212);
                            }
                            is isVar = (is) client.kd.ad((long) (alVar.ao * -1227024251));
                            if (isVar != null) {
                                ag.gu(isVar.ad * 1810639839, i, -2064555906);
                            }
                        }
                        if (i == 0 && alVar.fm != null) {
                            ilVar = new il();
                            ilVar.ar = alVar;
                            ilVar.ad = alVar.fm;
                            dm.ad(ilVar, 1851088690);
                        }
                        if (i == 1 && alVar.fs != null) {
                            if (alVar.ah * 988026877 >= 0) {
                                al aq = da.aq(alVar.ao * -1227024251, -550158556);
                                if (aq != null) {
                                    if (aq.fo != null) {
                                        if (alVar.ah * 988026877 < aq.fo.length) {
                                            if (aq.fo[alVar.ah * 988026877] != alVar) {
                                            }
                                        }
                                    }
                                }
                            }
                            ilVar = new il();
                            ilVar.ar = alVar;
                            ilVar.ad = alVar.fs;
                            dm.ad(ilVar, -1877876104);
                        }
                    }
                    i3 = i4 + 1;
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fb.ge(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public int ad(int i) {
        try {
            return this.aj * -1440753807;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fb.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.aj * 854226744;
    }

    public int aj() {
        return this.aj * 662455595;
    }

    public int al() {
        return this.aj * -1440753807;
    }
}
