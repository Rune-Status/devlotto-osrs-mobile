package defpackage;

/* renamed from: ig */
public class ig extends mb {
    static final int ad = 4;
    static final int aj = 9274487;
    static final int aq = 4;
    static final int ay = 200;
    public static final int co = 96;
    static jg fx;
    fz al;
    dg ar;

    ig(dg dgVar) {
        try {
            this.al = new fz();
            this.ar = dgVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static ef al(kh khVar, int i, int i2, int i3) {
        try {
            return !bv.ah(khVar, i, i2, -1962858434) ? null : an.aw(-835773464);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static fe[] aq(int i) {
        try {
            fe feVar = fe.ar;
            fe feVar2 = fe.aj;
            fe feVar3 = fe.al;
            fe feVar4 = fe.ai;
            fe feVar5 = fe.aq;
            fe feVar6 = fe.ad;
            return new fe[]{feVar, feVar2, feVar3, feVar4, feVar5, feVar6};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static char ar(byte b, byte b2) {
        StringBuilder stringBuilder;
        int i = b & 255;
        if (i != 0) {
            if (i >= 128 && i < 160) {
                try {
                    i = ki.ad[i - 128];
                    if (i == 0) {
                        i = 63;
                    }
                } catch (RuntimeException e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ig.ar(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            return (char) i;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(Integer.toString(i, 16));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static int cn(float f, int i) {
        try {
            return ((int) (((float) (client.hq * 1091227615)) + (((float) (client.hh * -509637623)) * f))) & 2047;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.cn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final int ev(int i) {
        try {
            return client.ed * -1087962683;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.ev(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i, int i2, int i3, int i4, byte b) {
        mb mbVar = null;
        int i5 = 0;
        try {
            mb mbVar2 = (hy) this.al.aj();
            while (mbVar2 != null) {
                i5++;
                if (i == mbVar2.ad * 213864831) {
                    mbVar2.ad(i, i2, i3, i4, -812209375);
                    return;
                }
                if (mbVar2.ad * 213864831 <= i) {
                    mbVar = mbVar2;
                }
                hy mbVar22 = (hy) this.al.ae();
            }
            if (mbVar != null) {
                fz.al(new hy(i, i2, i3, i4), mbVar);
                if (i5 >= 4) {
                    this.al.aj().ky();
                }
            } else if (i5 < 4) {
                this.al.ar(new hy(i, i2, i3, i4));
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public hy ae(int i) {
        hy hyVar = (hy) this.al.aj();
        if (hyVar != null) {
            if (hyVar.ad * 213864831 > i) {
                return null;
            }
            hy hyVar2;
            while (true) {
                hyVar2 = hyVar;
                hyVar = (hy) this.al.ae();
                if (hyVar != null && hyVar.ad * -1827167605 <= i) {
                    hyVar2.ky();
                }
            }
            if (((hyVar2.al * 865224279) + (hyVar2.ad * 1456747855)) + (this.ar.ap * 1256351561) > i) {
                return hyVar2;
            }
            hyVar2.ky();
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ag() {
        return this.al.ak();
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i, int i2, int i3, int i4) {
        int i5 = 0;
        mb mbVar = (hy) this.al.aj();
        mb mbVar2 = null;
        while (mbVar != null) {
            i5++;
            if (i == mbVar.ad * 213864831) {
                mbVar.ad(i, i2, i3, i4, 1537567322);
                return;
            }
            if (mbVar.ad * 213864831 <= i) {
                mbVar2 = mbVar;
            }
            hy mbVar3 = (hy) this.al.ae();
        }
        if (mbVar2 != null) {
            fz.al(new hy(i, i2, i3, i4), mbVar2);
            if (i5 >= 4) {
                this.al.aj().ky();
            }
        } else if (i5 < 4) {
            this.al.ar(new hy(i, i2, i3, i4));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i, int i2, int i3, int i4) {
        int i5 = 0;
        mb mbVar = (hy) this.al.aj();
        mb mbVar2 = null;
        while (mbVar != null) {
            i5++;
            if (i == mbVar.ad * 213864831) {
                mbVar.ad(i, i2, i3, i4, -991102560);
                return;
            }
            if (mbVar.ad * 370884430 <= i) {
                mbVar2 = mbVar;
            }
            hy mbVar3 = (hy) this.al.ae();
        }
        if (mbVar2 != null) {
            fz.al(new hy(i, i2, i3, i4), mbVar2);
            if (i5 >= 4) {
                this.al.aj().ky();
            }
        } else if (i5 < 4) {
            this.al.ar(new hy(i, i2, i3, i4));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public hy ak(int i) {
        hy hyVar = (hy) this.al.aj();
        if (hyVar == null) {
            return null;
        }
        if (hyVar.ad * 213864831 > i) {
            return null;
        }
        hy hyVar2;
        while (true) {
            hyVar2 = hyVar;
            hyVar = (hy) this.al.ae();
            if (hyVar != null && hyVar.ad * 213864831 <= i) {
                hyVar2.ky();
            }
        }
        if (((hyVar2.al * 865224279) + (hyVar2.ad * 213864831)) + (this.ar.ap * 1256351561) > i) {
            return hyVar2;
        }
        hyVar2.ky();
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void al(int i, int i2, int i3, int i4) {
        int i5 = 0;
        mb mbVar = (hy) this.al.aj();
        mb mbVar2 = null;
        while (mbVar != null) {
            i5++;
            if (i == mbVar.ad * 213864831) {
                mbVar.ad(i, i2, i3, i4, -56741180);
                return;
            }
            if (mbVar.ad * 213864831 <= i) {
                mbVar2 = mbVar;
            }
            hy mbVar3 = (hy) this.al.ae();
        }
        if (mbVar2 != null) {
            fz.al(new hy(i, i2, i3, i4), mbVar2);
            if (i5 >= 4) {
                this.al.aj().ky();
            }
        } else if (i5 < 4) {
            this.al.ar(new hy(i, i2, i3, i4));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public hy am(int i) {
        hy hyVar = (hy) this.al.aj();
        if (hyVar == null) {
            return null;
        }
        if (hyVar.ad * 213864831 > i) {
            return null;
        }
        hy hyVar2;
        while (true) {
            hyVar2 = hyVar;
            hyVar = (hy) this.al.ae();
            if (hyVar != null && hyVar.ad * 213864831 <= i) {
                hyVar2.ky();
            }
        }
        if (((hyVar2.al * 865224279) + (hyVar2.ad * 213864831)) + (this.ar.ap * 1256351561) > i) {
            return hyVar2;
        }
        hyVar2.ky();
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ap() {
        return this.al.ak();
    }

    /* Access modifiers changed, original: 0000 */
    public hy aq(int i, byte b) {
        try {
            hy hyVar = (hy) this.al.aj();
            if (hyVar == null) {
                return null;
            }
            if (hyVar.ad * 213864831 > i) {
                return null;
            }
            mb ae = this.al.ae();
            hy hyVar2 = hyVar;
            while (true) {
                hyVar = (hy) ae;
                if (hyVar != null && hyVar.ad * 213864831 <= i) {
                    hyVar2.ky();
                    ae = this.al.ae();
                    hyVar2 = hyVar;
                }
            }
            if (((hyVar2.al * 865224279) + (hyVar2.ad * 213864831)) + (this.ar.ap * 1256351561) > i) {
                return hyVar2;
            }
            hyVar2.ky();
            return null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ar(byte b) {
        try {
            return this.al.ak();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ig.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean as() {
        return this.al.ak();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean au() {
        return this.al.ak();
    }
}
