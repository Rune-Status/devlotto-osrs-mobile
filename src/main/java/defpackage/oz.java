package defpackage;

import android.support.v4.view.ViewCompat;

/* renamed from: oz */
public class oz implements lk {
    static final oz ad = new oz(0, 0, Integer.class, new ob());
    static final oz aq = new oz(2, 1, Long.class, new or());
    static final oz ar = new oz(1, 2, String.class, new oc());
    public static final int bf = 4;
    public static final int bj = 47;
    static int ff;
    final od ae;
    final Class ai;
    public final int aj;
    final int al;

    oz(int i, int i2, Class cls, od odVar) {
        try {
            this.al = 1896374567 * i;
            this.aj = -2039487399 * i2;
            this.ai = cls;
            this.ae = odVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static od aa(Class cls) {
        oz ar = oz.ar(cls, -2036878829);
        if (ar != null) {
            return ar.ae;
        }
        throw new IllegalArgumentException();
    }

    static od ac(Class cls) {
        oz ar = oz.ar(cls, -1716647974);
        if (ar != null) {
            return ar.ae;
        }
        throw new IllegalArgumentException();
    }

    public static lk ad(lk[] lkVarArr, int i, byte b) {
        int i2 = 0;
        while (true) {
            try {
                int i3 = i2;
                if (i3 >= lkVarArr.length) {
                    return null;
                }
                lk lkVar = lkVarArr[i3];
                if (i == lkVar.ad(2131097861)) {
                    return lkVar;
                }
                i2 = i3 + 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("oz.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public static void ae(Object obj, lj ljVar, byte b) {
        try {
            oz.am(obj.getClass(), (byte) 26).ad(obj, ljVar, -1571036719);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static od af(Class cls) {
        oz ar = oz.ar(cls, -1632631004);
        if (ar != null) {
            return ar.ae;
        }
        throw new IllegalArgumentException();
    }

    public static oz[] ag() {
        return new oz[]{ar, ad, aq};
    }

    static od ah(Class cls) {
        oz ar = oz.ar(cls, -2072058176);
        if (ar != null) {
            return ar.ae;
        }
        throw new IllegalArgumentException();
    }

    static void ai(int i, mh mhVar, kv kvVar, int i2) {
        try {
            byte[] ae = kg.ad.ae(i, mhVar, 703776462);
            if (ae != null) {
                kvVar.ei(mhVar, i, ae, true, -1558165135);
                return;
            }
            kvVar.ei(mhVar, i, mhVar.ad(i, (byte) 19), true, -1558165135);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static String aj(int i) {
        try {
            return dc.rx.ae ? km.ac(hm.cg, (byte) -38) : hm.cg;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean aj(int i, byte b) {
        return ((i >> 20) & 1) != 0;
    }

    static final void ak(String str, int i) {
        try {
            iq.aq(30, "", str, 980622905);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static od am(Class cls, byte b) {
        try {
            oz ar = oz.ar(cls, -1677077723);
            if (ar != null) {
                return ar.ae;
            }
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static od ao(Class cls) {
        oz ar = oz.ar(cls, -1926979098);
        if (ar != null) {
            return ar.ae;
        }
        throw new IllegalArgumentException();
    }

    static void ao(boolean z, int i) {
        try {
            hm.cu = cp.ah(-108275838) * -1949278637;
            client.aq.abx((byte) 46).gl(1389414328);
            if (z) {
                hm.cg = "";
                hm.ch = "";
                gd.dc = 0;
                hw.du = "";
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A:{Catch:{ RuntimeException -> 0x0255 }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085 A:{Catch:{ RuntimeException -> 0x0255 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ee ap(int i, int i2, int i3, int i4, int i5, boolean z, short s) {
        ee eeVar;
        dh aq;
        bp as;
        if (i2 == -1) {
            i5 = 0;
        } else if (i5 == 2 && i2 != 1) {
            i5 = 1;
        }
        long j = (((long) i4) << 42) + ((((long) i5) << 40) + (((((long) i2) << 16) + ((long) i)) + (((long) i3) << 38)));
        if (!z) {
            try {
                eeVar = (ee) dh.az.ad(j);
                if (eeVar != null) {
                    return eeVar;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("oz.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        dh aq2 = gl.aq(i, 461362221);
        if (i2 > 1 && aq2.bn != null) {
            int i6 = 0;
            int i7 = -1;
            while (i6 < 10) {
                if (i2 >= aq2.bz[i6] && aq2.bz[i6] != 0) {
                    i7 = aq2.bn[i6];
                }
                i6++;
            }
            if (-1 != i7) {
                aq = gl.aq(i7, -833893925);
                as = aq.as(1, -1107666354);
                if (as != null) {
                    return null;
                }
                ee eeVar2;
                if (-1 != aq.bp * 518600683) {
                    eeVar = oz.ap(aq.by * 1269103785, 10, 1, 0, 0, true, (short) 3835);
                    if (eeVar == null) {
                        return null;
                    }
                    eeVar2 = eeVar;
                } else {
                    if (aq.ce * -755438885 != -1) {
                        eeVar = oz.ap(871627117 * aq.cb, i2, i3, i4, 0, false, (short) 709);
                        if (eeVar == null) {
                            return null;
                        }
                    } else if (aq.cc * 335744487 != -1) {
                        eeVar = oz.ap(-1499517591 * aq.cy, i2, 0, 0, 0, false, (short) 1284);
                        if (eeVar == null) {
                            return null;
                        }
                    } else {
                        eeVar2 = null;
                    }
                    eeVar2 = eeVar;
                }
                ee eeVar3 = new ee(36, 32);
                dh.aw.bm(eeVar3.ad, 36, 32, 1743383528);
                es esVar = (eb) dh.aw.ad(-601277067);
                be beVar = (be) dh.aw.aq(-1461375559);
                by aq3 = dh.aw.ar(-922209594).aq((byte) -61);
                beVar.bg(1306390321);
                beVar.bu(16, 16, -1456499884);
                beVar.bc(false, 1933603160);
                if (-1 != aq.cc * 335744487) {
                    esVar.aw(eeVar2, 0, 0, 16711935);
                }
                int i8 = aq.ab * 1131009745;
                if (z) {
                    i8 = (int) (((double) i8) * 1.5d);
                } else if (2 == i3) {
                    i8 = (int) (((double) i8) * 1.04d);
                }
                int i9 = bl.aa[aq.av * -982903351];
                int i10 = bl.ao[aq.av * -982903351];
                as.ai();
                aq3.ad(as, 0, aq.at * 1504316109, aq.bk * 2098879407, aq.av * -982903351, aq.ba * 1131163891, (((i9 * i8) >> 16) + ((as.bx * -1736982785) / 2)) + (aq.bs * -1844861847), (aq.bs * -1844861847) + ((i8 * i10) >> 16), 2142692552);
                if (aq.ce * -755438885 != -1) {
                    esVar.aw(eeVar2, 0, 0, 16711935);
                }
                if (i3 >= 1) {
                    eeVar3.ae(1);
                }
                if (i3 >= 2) {
                    eeVar3.ae(ViewCompat.MEASURED_SIZE_MASK);
                }
                if (i4 != 0) {
                    eeVar3.am(i4);
                }
                dh.aw.bm(eeVar3.ad, 36, 32, 1713570329);
                if (-1 != aq.bp * 518600683) {
                    esVar.aw(eeVar2, 0, 0, 16711935);
                }
                if (1 == i5 || (i5 == 2 && aq.bm * -1954437925 == 1)) {
                    dh.ax.ak(as.au(i2, -1775340770), 0, 9, 16776960, 1, esVar);
                    i7 = 0;
                } else {
                    i7 = 0;
                }
                while (i7 < eeVar3.ad.length) {
                    if (eeVar3.ad[i7] != 0) {
                        int[] iArr = eeVar3.ad;
                        iArr[i7] = iArr[i7] | ViewCompat.MEASURED_STATE_MASK;
                    }
                    i7++;
                }
                if (!z) {
                    dh.az.ar(eeVar3, j);
                }
                return eeVar3;
            }
        }
        aq = aq2;
        as = aq.as(1, -1107666354);
        if (as != null) {
        }
    }

    public static oz ap(Class cls) {
        oz[] aq = oz.aq(1707641523);
        for (oz ozVar : aq) {
            if (cls == ozVar.ai) {
                return ozVar;
            }
        }
        return null;
    }

    public static oz[] aq(int i) {
        try {
            oz ozVar = ar;
            oz ozVar2 = ad;
            oz ozVar3 = aq;
            return new oz[]{ozVar, ozVar2, ozVar3};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static oz ar(Class cls, int i) {
        try {
            oz[] aq = oz.aq(1707641523);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= aq.length) {
                    return null;
                }
                oz ozVar = aq[i3];
                if (cls == ozVar.ai) {
                    return ozVar;
                }
                i2 = i3 + 1;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static oz[] as() {
        return new oz[]{ar, ad, aq};
    }

    public static oz au(Class cls) {
        oz[] aq = oz.aq(1707641523);
        for (oz ozVar : aq) {
            if (cls == ozVar.ai) {
                return ozVar;
            }
        }
        return null;
    }

    public static void aw(Object obj, lj ljVar) {
        oz.am(obj.getClass(), (byte) 65).ad(obj, ljVar, -1571036719);
    }

    public static void ax(Object obj, lj ljVar) {
        oz.am(obj.getClass(), (byte) 19).ad(obj, ljVar, -1571036719);
    }

    public static oz az(Class cls) {
        oz[] aq = oz.aq(1707641523);
        for (oz ozVar : aq) {
            if (cls == ozVar.ai) {
                return ozVar;
            }
        }
        return null;
    }

    public Object ab(lj ljVar) {
        return this.ae.aq(ljVar, (byte) -70);
    }

    public int ad(int i) {
        try {
            return this.aj * -44489751;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.aj * -44489751;
    }

    public int aj() {
        return this.aj * -44489751;
    }

    public Object ak(lj ljVar, int i) {
        try {
            return this.ae.aq(ljVar, (byte) -9);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oz.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int al() {
        return this.aj * -44489751;
    }

    public Object an(lj ljVar) {
        return this.ae.aq(ljVar, (byte) -66);
    }

    public Object at(lj ljVar) {
        return this.ae.aq(ljVar, (byte) 26);
    }

    public Object av(lj ljVar) {
        return this.ae.aq(ljVar, (byte) -58);
    }

    public Object ay(lj ljVar) {
        return this.ae.aq(ljVar, (byte) 42);
    }
}
