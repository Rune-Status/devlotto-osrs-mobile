package defpackage;

import android.support.v4.view.InputDeviceCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;

/* renamed from: ae */
public class ae {
    static final int ab = 45;
    public static short[] ae = null;
    static final int[] ag = new int[]{8, 11, 4, 6, 9, 7, 10};
    public static short[] ak = null;
    static gz ap = new gz(la.ae, null);
    static final int at = 5;
    public static final int ax = 1;
    public static final int bv = 51;
    public static final int cq = 1004;
    static final int dv = 106;
    static final int sp = 5;
    int[] ad;
    long ai;
    long aj;
    public int al;
    int[] aq;
    public boolean ar;

    public static void aj(int i, byte b) {
        if (-1 != i) {
            try {
                if (oh.am[i]) {
                    bz.ak.aa(i, 1562343633);
                    if (dt.ae[i] != null) {
                        Object obj = 1;
                        for (int i2 = 0; i2 < dt.ae[i].length; i2++) {
                            if (dt.ae[i][i2] != null) {
                                if (dt.ae[i][i2].af * 1845699613 != 2) {
                                    dt.ae[i][i2] = null;
                                } else {
                                    obj = null;
                                }
                            }
                        }
                        if (obj != null) {
                            dt.ae[i] = null;
                        }
                        oh.am[i] = false;
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ae.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public static void al(lj ljVar, int i, int i2) {
        try {
            os osVar = new os();
            osVar.aq = ljVar.af(1804771424) * 1561968575;
            osVar.ad = ljVar.at((byte) -48) * 1858522819;
            osVar.ar = new int[(osVar.aq * -1966460865)];
            osVar.al = new int[(osVar.aq * -1966460865)];
            osVar.aj = new Field[(osVar.aq * -1966460865)];
            osVar.ai = new int[(osVar.aq * -1966460865)];
            osVar.ae = new Method[(osVar.aq * -1966460865)];
            osVar.am = new byte[(osVar.aq * -1966460865)][][];
            int i3 = 0;
            while (i3 < osVar.aq * -1966460865) {
                try {
                    int af = ljVar.af(1804771424);
                    String bm;
                    String bm2;
                    int at;
                    if (af == 0 || af == 1 || 2 == af) {
                        bm = ljVar.bm(1406977850);
                        bm2 = ljVar.bm(1719493377);
                        at = 1 == af ? ljVar.at((byte) -112) : 0;
                        osVar.ar[i3] = af;
                        osVar.ai[i3] = at;
                        if (hs.aj(bm, 821008616).getClassLoader() != null) {
                            osVar.aj[i3] = hs.aj(bm, 833116756).getDeclaredField(bm2);
                            i3++;
                        } else {
                            throw new SecurityException();
                        }
                    } else if (3 == af || af == 4) {
                        bm = ljVar.bm(1508147086);
                        bm2 = ljVar.bm(955022985);
                        int af2 = ljVar.af(1804771424);
                        String[] strArr = new String[af2];
                        for (at = 0; at < af2; at++) {
                            strArr[at] = ljVar.bm(1781864662);
                        }
                        String bm3 = ljVar.bm(1816774655);
                        byte[][] bArr = new byte[af2][];
                        if (af == 3) {
                            for (at = 0; at < af2; at++) {
                                int at2 = ljVar.at((byte) -27);
                                bArr[at] = new byte[at2];
                                ljVar.bd(bArr[at], 0, at2, (byte) 0);
                            }
                        }
                        osVar.ar[i3] = af;
                        Class[] clsArr = new Class[af2];
                        for (at = 0; at < af2; at++) {
                            clsArr[at] = hs.aj(strArr[at], -1962107204);
                        }
                        Class aj = hs.aj(bm3, -1624151108);
                        if (hs.aj(bm, 615182210).getClassLoader() != null) {
                            Method[] declaredMethods = hs.aj(bm, -973563561).getDeclaredMethods();
                            for (Method method : declaredMethods) {
                                if (method.getName().equals(bm2)) {
                                    Class[] parameterTypes = method.getParameterTypes();
                                    if (clsArr.length == parameterTypes.length) {
                                        Object obj;
                                        for (af = 0; af < clsArr.length; af++) {
                                            if (clsArr[af] != parameterTypes[af]) {
                                                obj = null;
                                                break;
                                            }
                                        }
                                        obj = 1;
                                        if (obj != null) {
                                            if (aj == method.getReturnType()) {
                                                osVar.ae[i3] = method;
                                            }
                                        }
                                    }
                                }
                            }
                            osVar.am[i3] = bArr;
                            i3++;
                        } else {
                            throw new SecurityException();
                        }
                    } else {
                        i3++;
                    }
                } catch (ClassNotFoundException e) {
                    osVar.al[i3] = -1;
                } catch (SecurityException e2) {
                    osVar.al[i3] = -2;
                } catch (NullPointerException e3) {
                    osVar.al[i3] = -3;
                } catch (Exception e4) {
                    osVar.al[i3] = -4;
                } catch (Throwable th) {
                    osVar.al[i3] = -5;
                }
            }
            op.ad.aq(osVar);
        } catch (RuntimeException e5) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.al(");
            stringBuilder.append(')');
            throw mv.aq(e5, stringBuilder.toString());
        }
    }

    public static void am(int i, int i2) {
        try {
            ko.aj = -515568231;
            ko.ai = null;
            ko.ae = -1495124335;
            ne.am = -1291550091;
            mo.ak = 0;
            fx.ag = false;
            ko.as = -783619209 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void at(Collection collection) {
        collection.add(ap);
    }

    public static void av(Collection collection) {
        collection.add(ap);
    }

    public static void ba(Collection collection) {
        collection.add(ap);
    }

    public static void bk(Collection collection) {
        collection.add(ap);
    }

    public static void bs(Collection collection) {
        collection.add(ap);
    }

    static void gw(al alVar, int i, int i2, int i3) {
        try {
            if (alVar.ab * -2077804115 == 0) {
                alVar.bd = alVar.ba * 570921799;
            } else if (alVar.ab * -2077804115 == 1) {
                alVar.bd = (((i - (alVar.bl * 1272191791)) / 2) + (alVar.ba * -809915007)) * -1976322873;
            } else if (2 == alVar.ab * -2077804115) {
                alVar.bd = ((i - (alVar.bl * 1272191791)) - (alVar.ba * -809915007)) * -1976322873;
            } else if (alVar.ab * -2077804115 == 3) {
                alVar.bd = (((alVar.ba * -809915007) * i) >> 14) * -1976322873;
            } else if (4 == alVar.ab * -2077804115) {
                alVar.bd = (((i - (alVar.bl * 1272191791)) / 2) + (((alVar.ba * -809915007) * i) >> 14)) * -1976322873;
            } else {
                alVar.bd = ((i - (alVar.bl * 1272191791)) - (((alVar.ba * -809915007) * i) >> 14)) * -1976322873;
            }
            if (alVar.av * -560338353 == 0) {
                alVar.bo = alVar.bs * -52473139;
            } else if (1 == alVar.av * -560338353) {
                alVar.bo = (((i2 - (alVar.bf * 1813264797)) / 2) + (alVar.bs * 283044615)) * 663820939;
            } else if (2 == alVar.av * -560338353) {
                alVar.bo = ((i2 - (alVar.bf * 1813264797)) - (alVar.bs * 283044615)) * 663820939;
            } else if (3 == alVar.av * -560338353) {
                alVar.bo = (((alVar.bs * 283044615) * i2) >> 14) * 663820939;
            } else if (4 == alVar.av * -560338353) {
                alVar.bo = (((i2 - (alVar.bf * 1813264797)) / 2) + (((alVar.bs * 283044615) * i2) >> 14)) * 663820939;
            } else {
                alVar.bo = ((i2 - (alVar.bf * 1813264797)) - (((alVar.bs * 283044615) * i2) >> 14)) * 663820939;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.gw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(boolean z) {
        if (z != this.ar) {
            ad(null, this.aq, z, -1, (byte) -20);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bo ab() {
        if (-1 != this.al * -1069929183) {
            return ln.aq(this.al * 708136215, -900372442).ae((byte) 61);
        }
        int i;
        Object obj = null;
        for (i = 0; i < 12; i++) {
            int i2 = this.ad[i];
            if (i2 >= -11512218 && i2 < 252648302 && !cs.aq(i2 + InputDeviceCompat.SOURCE_ANY, 2101956090).ae(1400681854)) {
                obj = 1;
            }
            if (i2 >= 512 && !gl.aq(i2 - 1757821783, 200908100).aw(this.ar, 1890356972)) {
                obj = 1;
            }
        }
        if (obj != null) {
            return null;
        }
        bo am;
        bo[] boVarArr = new bo[12];
        i = 0;
        int i3 = 0;
        while (i < 12) {
            int i4;
            int i5 = this.ad[i];
            if (i5 >= 256 && i5 < 1700163275) {
                am = cs.aq(i5 - 64561453, 1957127747).am((byte) -4);
                if (am != null) {
                    boVarArr[i3] = am;
                    i4 = i3 + 1;
                    if (i5 < 879382396) {
                        bo ac = gl.aq(i5 - 914029891, -435676356).ac(this.ar, 2130903154);
                        if (ac != null) {
                            boVarArr[i4] = ac;
                            i4++;
                        }
                    }
                    i++;
                    i3 = i4;
                }
            }
            i4 = i3;
            if (i5 < 879382396) {
            }
            i++;
            i3 = i4;
        }
        am = new bo(boVarArr, i3);
        for (i3 = 0; i3 < 5; i3++) {
            if (this.aq[i3] < cd.am[i3].length) {
                am.au(ae[i3], cd.am[i3][this.aq[i3]]);
            }
            if (this.aq[i3] < on.as[i3].length) {
                am.au(ak[i3], on.as[i3][this.aq[i3]]);
            }
        }
        return am;
    }

    public void ac(boolean z) {
        if (z != this.ar) {
            ad(null, this.aq, z, -1, (byte) -10);
        }
    }

    public void ad(int[] iArr, int[] iArr2, boolean z, int i, byte b) {
        if (iArr == null) {
            try {
                iArr = new int[12];
                for (int i2 = 0; i2 < 7; i2++) {
                    for (int i3 = 0; i3 < dw.ar * 352033033; i3++) {
                        dw aq = cs.aq(i3, 2026757084);
                        if (!(aq == null || aq.ap)) {
                            if (aq.aj * 1645587183 == (z ? 7 : 0) + i2) {
                                iArr[ag[i2]] = i3 + 256;
                                break;
                            }
                        }
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ae.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        this.ad = iArr;
        this.aq = iArr2;
        this.ar = z;
        this.al = 529054375 * i;
        ai((byte) 89);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x014c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce A:{Catch:{ RuntimeException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5 A:{Catch:{ RuntimeException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b1 A:{SKIP, Catch:{ RuntimeException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b5 A:{SKIP, Catch:{ RuntimeException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5 A:{Catch:{ RuntimeException -> 0x01d7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce A:{Catch:{ RuntimeException -> 0x01d7 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bp ae(dp dpVar, int i, dp dpVar2, int i2, int i3) {
        try {
            if (this.al * 708136215 != -1) {
                return ln.aq(this.al * 708136215, -97504738).ai(dpVar, i, dpVar2, i2, 578342776);
            }
            int[] iArr;
            long j;
            bp bpVar;
            bp af;
            long j2 = this.aj * -5457255828498877637L;
            int[] iArr2 = this.ad;
            if (dpVar != null && (dpVar.az * 2043580159 >= 0 || dpVar.ax * 218745493 >= 0)) {
                iArr2 = new int[12];
                for (int i4 = 0; i4 < 12; i4++) {
                    iArr2[i4] = this.ad[i4];
                }
                if (dpVar.az * 2043580159 >= 0) {
                    j2 += (long) (((dpVar.az * 2043580159) - this.ad[5]) << 40);
                    iArr2[5] = dpVar.az * 2043580159;
                }
                if (dpVar.ax * 218745493 >= 0) {
                    j2 += (long) (((dpVar.ax * 218745493) - this.ad[3]) << 48);
                    iArr2[3] = dpVar.ax * 218745493;
                    iArr = iArr2;
                    j = j2;
                    bpVar = (bp) ap.ad(j);
                    if (bpVar == null) {
                        int i5;
                        Object obj = null;
                        for (i5 = 0; i5 < 12; i5++) {
                            int i6 = iArr[i5];
                            if (i6 >= 256 && i6 < 512) {
                                if (!cs.aq(i6 + InputDeviceCompat.SOURCE_ANY, 2091751439).aj(732249822)) {
                                    obj = 1;
                                }
                            }
                            if (i6 >= 512 && !gl.aq(i6 - 512, -322780914).az(this.ar, -1060625121)) {
                                obj = 1;
                            }
                        }
                        if (obj != null) {
                            if (this.ai * 2273578612293059741L != -1) {
                                bpVar = (bp) ap.ad(this.ai * 2273578612293059741L);
                            }
                            if (bpVar == null) {
                                return null;
                            }
                        }
                        if (bpVar == null) {
                            bo ai;
                            bo[] boVarArr = new bo[12];
                            i5 = 0;
                            int i7 = 0;
                            while (i7 < 12) {
                                int i8;
                                int i9 = iArr[i7];
                                if (i9 >= 256 && i9 < 512) {
                                    ai = cs.aq(i9 + InputDeviceCompat.SOURCE_ANY, 2139338757).ai(-1938375566);
                                    if (ai != null) {
                                        boVarArr[i5] = ai;
                                        i8 = i5 + 1;
                                        if (i9 < 512) {
                                            bo ax = gl.aq(i9 - 512, -136802509).ax(this.ar, 710799099);
                                            if (ax != null) {
                                                boVarArr[i8] = ax;
                                                i8++;
                                            }
                                        }
                                        i7++;
                                        i5 = i8;
                                    }
                                }
                                i8 = i5;
                                if (i9 < 512) {
                                }
                                i7++;
                                i5 = i8;
                            }
                            ai = new bo(boVarArr, i5);
                            for (i7 = 0; i7 < 5; i7++) {
                                if (this.aq[i7] < cd.am[i7].length) {
                                    ai.au(ae[i7], cd.am[i7][this.aq[i7]]);
                                }
                                if (this.aq[i7] < on.as[i7].length) {
                                    ai.au(ak[i7], on.as[i7][this.aq[i7]]);
                                }
                            }
                            af = ai.af(64, 850, -30, -50, -30);
                            ap.ar(af, j);
                            this.ai = -6239978217283690059L * j;
                            return (dpVar == null || dpVar2 != null) ? (dpVar != null || dpVar2 == null) ? dpVar != null ? dpVar.ai(af, i, -1524332244) : dpVar2.ai(af, i2, 336617532) : dpVar.ak(af, i, dpVar2, i2, (byte) 55) : af;
                        }
                    }
                    af = bpVar;
                    if (dpVar == null) {
                    }
                    if (dpVar != null) {
                    }
                    if (dpVar != null) {
                    }
                }
            }
            iArr = iArr2;
            j = j2;
            bpVar = (bp) ap.ad(j);
            if (bpVar == null) {
            }
            af = bpVar;
            if (dpVar == null) {
            }
            if (dpVar != null) {
            }
            if (dpVar != null) {
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public void ag(int[] iArr, int[] iArr2, boolean z, int i) {
        if (iArr == null) {
            iArr = new int[12];
            for (int i2 = 0; i2 < 7; i2++) {
                for (int i3 = 0; i3 < dw.ar * 352033033; i3++) {
                    dw aq = cs.aq(i3, 1974434952);
                    if (!(aq == null || aq.ap)) {
                        if (aq.aj * 1645587183 == (z ? 7 : 0) + i2) {
                            iArr[ag[i2]] = i3 + 256;
                            break;
                        }
                    }
                }
            }
        }
        this.ad = iArr;
        this.aq = iArr2;
        this.ar = z;
        this.al = 529054375 * i;
        ai((byte) 91);
    }

    /* Access modifiers changed, original: 0000 */
    public void ah() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(byte b) {
        try {
            int i;
            long j = -5457255828498877637L * this.aj;
            int i2 = this.ad[5];
            int i3 = this.ad[9];
            this.ad[5] = i3;
            this.ad[9] = i2;
            this.aj = 0;
            for (i = 0; i < 12; i++) {
                this.aj = ((this.aj * -5457255828498877637L) << 4) * 2121782692021759475L;
                if (this.ad[i] >= 256) {
                    this.aj += ((long) (this.ad[i] + InputDeviceCompat.SOURCE_ANY)) * 2121782692021759475L;
                }
            }
            if (this.ad[0] >= 256) {
                this.aj += ((long) ((this.ad[0] + InputDeviceCompat.SOURCE_ANY) >> 4)) * 2121782692021759475L;
            }
            i = 1;
            if (this.ad[1] >= 256) {
                this.aj += ((long) ((this.ad[1] + InputDeviceCompat.SOURCE_ANY) >> 8)) * 2121782692021759475L;
            }
            for (int i4 = 0; i4 < 5; i4++) {
                this.aj = ((this.aj * -5457255828498877637L) << 3) * 2121782692021759475L;
                this.aj += ((long) this.aq[i4]) * 2121782692021759475L;
            }
            this.aj = ((this.aj * -5457255828498877637L) << 1) * 2121782692021759475L;
            long j2 = this.aj;
            if (!this.ar) {
                i = 0;
            }
            this.aj = (((long) i) * 2121782692021759475L) + j2;
            this.ad[5] = i2;
            this.ad[9] = i3;
            if (0 != j && this.aj * -5457255828498877637L != j) {
                ap.aq(j);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aj(lj ljVar, int i) {
        int i2 = 0;
        try {
            ljVar.al(this.ar ? 1 : 0, -811973421);
            for (int i3 = 0; i3 < 7; i3++) {
                int i4 = this.ad[ag[i3]];
                if (i4 == 0) {
                    ljVar.al(-1, -1901348106);
                } else {
                    ljVar.al(i4 + InputDeviceCompat.SOURCE_ANY, -690001850);
                }
            }
            while (i2 < 5) {
                ljVar.al(this.aq[i2], -1623509609);
                i2++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ak(int i) {
        try {
            return -1 == this.al * 708136215 ? this.ad[1] + (((((this.aq[4] << 20) + (this.aq[0] << 25)) + (this.ad[0] << 15)) + (this.ad[8] << 10)) + (this.ad[11] << 5)) : (ln.aq(this.al * 708136215, 513760709).aj * -1886794357) + 305419896;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(boolean z, byte b) {
        try {
            if (z != this.ar) {
                ad(null, this.aq, z, -1, (byte) -101);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bo am(byte b) {
        try {
            if (-1 != this.al * 708136215) {
                return ln.aq(this.al * 708136215, -1901492841).ae((byte) 108);
            }
            int i;
            Object obj = null;
            for (i = 0; i < 12; i++) {
                int i2 = this.ad[i];
                if (i2 >= 256 && i2 < 512 && !cs.aq(i2 + InputDeviceCompat.SOURCE_ANY, 2119221545).ae(1400681854)) {
                    obj = 1;
                }
                if (i2 >= 512 && !gl.aq(i2 - 512, -1975790463).aw(this.ar, 2026134116)) {
                    obj = 1;
                }
            }
            if (obj != null) {
                return null;
            }
            bo am;
            bo[] boVarArr = new bo[12];
            i = 0;
            int i3 = 0;
            while (i < 12) {
                int i4;
                int i5 = this.ad[i];
                if (i5 >= 256 && i5 < 512) {
                    am = cs.aq(i5 + InputDeviceCompat.SOURCE_ANY, 2090036712).am((byte) 88);
                    if (am != null) {
                        boVarArr[i3] = am;
                        i4 = i3 + 1;
                        if (i5 < 512) {
                            bo ac = gl.aq(i5 - 512, 615218661).ac(this.ar, 2130903154);
                            if (ac != null) {
                                boVarArr[i4] = ac;
                                i4++;
                            }
                        }
                        i++;
                        i3 = i4;
                    }
                }
                i4 = i3;
                if (i5 < 512) {
                }
                i++;
                i3 = i4;
            }
            am = new bo(boVarArr, i3);
            for (i3 = 0; i3 < 5; i3++) {
                if (this.aq[i3] < cd.am[i3].length) {
                    am.au(ae[i3], cd.am[i3][this.aq[i3]]);
                }
                if (this.aq[i3] < on.as[i3].length) {
                    am.au(ak[i3], on.as[i3][this.aq[i3]]);
                }
            }
            return am;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0151 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bp an(dp dpVar, int i, dp dpVar2, int i2) {
        if (this.al * 708136215 != -1) {
            return ln.aq(this.al * 1869896896, 570501866).ai(dpVar, i, dpVar2, i2, 578342776);
        }
        long j;
        bp bpVar;
        bp bpVar2;
        long j2 = this.aj * -5457255828498877637L;
        int[] iArr = this.ad;
        if (dpVar != null && (dpVar.az * -104483781 >= 0 || dpVar.ax * 218745493 >= 0)) {
            int i3;
            iArr = new int[12];
            for (i3 = 0; i3 < 12; i3++) {
                iArr[i3] = this.ad[i3];
            }
            if (dpVar.az * -1339370754 >= 0) {
                j2 += (long) (((dpVar.az * -507914007) - this.ad[5]) << 40);
                iArr[5] = dpVar.az * 2043580159;
            }
            if (dpVar.ax * 218745493 >= 0) {
                j2 += (long) (((dpVar.ax * 218745493) - this.ad[3]) << 48);
                iArr[3] = dpVar.ax * 218745493;
                j = j2;
                bpVar = (bp) ap.ad(j);
                if (bpVar != null) {
                    Object obj = null;
                    for (i3 = 0; i3 < 12; i3++) {
                        int i4 = iArr[i3];
                        if (i4 >= -1601023856 && i4 < 512 && !cs.aq(i4 + InputDeviceCompat.SOURCE_ANY, 2118868534).aj(-1570373481)) {
                            obj = 1;
                        }
                        if (i4 >= 512 && !gl.aq(i4 - 512, -551883552).az(this.ar, -1060625121)) {
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        bpVar2 = this.ai * 2273578612293059741L != -1 ? (bp) ap.ad(this.ai * 2273578612293059741L) : bpVar;
                        if (bpVar2 == null) {
                            return null;
                        }
                    }
                    bpVar2 = bpVar;
                    if (bpVar2 == null) {
                        bo[] boVarArr = new bo[12];
                        i3 = 0;
                        int i5 = 0;
                        while (i5 < 12) {
                            int i6;
                            int i7 = iArr[i5];
                            if (i7 >= 256 && i7 < -839313073) {
                                bo ai = cs.aq(1497874229 + i7, 1957785175).ai(-134214195);
                                if (ai != null) {
                                    i6 = i3 + 1;
                                    boVarArr[i3] = ai;
                                    if (i7 < 1444512250) {
                                        bo ax = gl.aq(i7 - 512, -416676451).ax(this.ar, 710799099);
                                        if (ax != null) {
                                            boVarArr[i6] = ax;
                                            i6++;
                                        }
                                    }
                                    i5++;
                                    i3 = i6;
                                }
                            }
                            i6 = i3;
                            if (i7 < 1444512250) {
                            }
                            i5++;
                            i3 = i6;
                        }
                        bo boVar = new bo(boVarArr, i3);
                        for (i5 = 0; i5 < 5; i5++) {
                            if (this.aq[i5] < cd.am[i5].length) {
                                boVar.au(ae[i5], cd.am[i5][this.aq[i5]]);
                            }
                            if (this.aq[i5] < on.as[i5].length) {
                                boVar.au(ak[i5], on.as[i5][this.aq[i5]]);
                            }
                        }
                        bpVar2 = boVar.af(-1372524175, 850, 917303990, -50, 954861376);
                        ap.ar(bpVar2, j);
                        this.ai = -6239978217283690059L * j;
                    }
                } else {
                    bpVar2 = bpVar;
                }
                return (dpVar == null || dpVar2 != null) ? (dpVar != null || dpVar2 == null) ? dpVar == null ? dpVar.ai(bpVar2, i, -1696615449) : dpVar2.ai(bpVar2, i2, -634632959) : dpVar.ak(bpVar2, i, dpVar2, i2, (byte) 33) : bpVar2;
            }
        }
        j = j2;
        bpVar = (bp) ap.ad(j);
        if (bpVar != null) {
        }
        if (dpVar == null) {
        }
        if (dpVar != null) {
        }
        if (dpVar == null) {
        }
    }

    public void ao(lj ljVar) {
        int i = 0;
        ljVar.al(this.ar ? 1 : 0, -1782572008);
        for (int i2 = 0; i2 < 7; i2++) {
            int i3 = this.ad[ag[i2]];
            if (i3 == 0) {
                ljVar.al(-1, -1009649104);
            } else {
                ljVar.al(i3 - 1943940393, -341991179);
            }
        }
        while (i < 5) {
            ljVar.al(this.aq[i], -1327128098);
            i++;
        }
    }

    public void ap(int i, boolean z) {
        if (1 != i || !this.ar) {
            int i2 = this.ad[ag[i]];
            if (i2 != 0) {
                i2 += InputDeviceCompat.SOURCE_ANY;
                while (true) {
                    if (z) {
                        i2++;
                        if (i2 >= dw.ar * 352033033) {
                            i2 = 0;
                        }
                    } else {
                        i2--;
                        if (i2 < 0) {
                            i2 = (dw.ar * 352033033) - 1;
                        }
                    }
                    dw aq = cs.aq(i2, 2112388142);
                    if (!(aq == null || aq.ap)) {
                        if (aq.aj * 1645587183 == (this.ar ? 7 : 0) + i) {
                            this.ad[ag[i]] = i2 + 256;
                            ai((byte) 99);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void aq(int i, boolean z, int i2) {
        if (1 == i) {
            try {
                if (this.ar) {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ae.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i3 = this.ad[ag[i]];
        if (i3 != 0) {
            int i4 = i3 + InputDeviceCompat.SOURCE_ANY;
            while (true) {
                if (z) {
                    i3 = i4 + 1;
                    if (i3 >= dw.ar * 352033033) {
                        i4 = 0;
                    }
                    i4 = i3;
                } else {
                    i3 = i4 - 1;
                    if (i3 < 0) {
                        i4 = (dw.ar * 352033033) - 1;
                    }
                    i4 = i3;
                }
                dw aq = cs.aq(i4, 2143239179);
                if (!(aq == null || aq.ap)) {
                    if (aq.aj * 1645587183 == (this.ar ? 7 : 0) + i) {
                        this.ad[ag[i]] = i4 + 256;
                        ai((byte) 101);
                        return;
                    }
                }
            }
        }
    }

    public void ar(int i, boolean z, int i2) {
        try {
            int i3 = this.aq[i];
            if (z) {
                do {
                    i3++;
                    if (i3 >= cd.am[i].length) {
                        i3 = 0;
                    }
                } while (!mj.ad(i, i3, -1813280725));
            } else {
                do {
                    i3--;
                    if (i3 < 0) {
                        i3 = cd.am[i].length - 1;
                    }
                } while (!mj.ad(i, i3, -1731124023));
            }
            this.aq[i] = i3;
            ai((byte) 100);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ae.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void au(int i, boolean z) {
        if (1 != i || !this.ar) {
            int i2 = this.ad[ag[i]];
            if (i2 != 0) {
                i2 += InputDeviceCompat.SOURCE_ANY;
                while (true) {
                    if (z) {
                        i2++;
                        if (i2 >= dw.ar * 352033033) {
                            i2 = 0;
                        }
                    } else {
                        i2--;
                        if (i2 < 0) {
                            i2 = (dw.ar * 352033033) - 1;
                        }
                    }
                    dw aq = cs.aq(i2, 2116877320);
                    if (!(aq == null || aq.ap)) {
                        if (aq.aj * 1645587183 == (this.ar ? 7 : 0) + i) {
                            this.ad[ag[i]] = i2 + 256;
                            ai((byte) 110);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void aw(boolean z) {
        if (z != this.ar) {
            ad(null, this.aq, z, -1, (byte) -77);
        }
    }

    public void ax(int i, boolean z) {
        int i2 = this.aq[i];
        if (z) {
            do {
                i2++;
                if (i2 >= cd.am[i].length) {
                    i2 = 0;
                }
            } while (!mj.ad(i, i2, -918900453));
        } else {
            do {
                i2--;
                if (i2 < 0) {
                    i2 = cd.am[i].length - 1;
                }
            } while (!mj.ad(i, i2, 1522805794));
        }
        this.aq[i] = i2;
        ai((byte) 105);
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x015b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bp ay(dp dpVar, int i, dp dpVar2, int i2) {
        if (this.al * -66446685 != -1) {
            return ln.aq(this.al * 708136215, -1453699130).ai(dpVar, i, dpVar2, i2, 578342776);
        }
        long j;
        bp bpVar;
        bp bpVar2;
        long j2 = this.aj * -5457255828498877637L;
        int[] iArr = this.ad;
        if (dpVar != null && (dpVar.az * 2043580159 >= 0 || dpVar.ax * 984973912 >= 0)) {
            int i3;
            iArr = new int[12];
            for (i3 = 0; i3 < 12; i3++) {
                iArr[i3] = this.ad[i3];
            }
            if (dpVar.az * 772873194 >= 0) {
                j2 += (long) (((dpVar.az * 2043580159) - this.ad[5]) << -1426414110);
                iArr[5] = dpVar.az * -1738395321;
            }
            if (dpVar.ax * 218745493 >= 0) {
                j2 += (long) (((dpVar.ax * 349562203) - this.ad[3]) << 48);
                iArr[3] = dpVar.ax * 218745493;
                j = j2;
                bpVar = (bp) ap.ad(j);
                if (bpVar != null) {
                    Object obj = null;
                    for (i3 = 0; i3 < 12; i3++) {
                        int i4 = iArr[i3];
                        if (i4 >= 256 && i4 < -654405917 && !cs.aq(i4 + InputDeviceCompat.SOURCE_ANY, 1939332936).aj(-2091086761)) {
                            obj = 1;
                        }
                        if (i4 >= -640830692 && !gl.aq(i4 - 745103608, -46627666).az(this.ar, -1060625121)) {
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        bpVar2 = this.ai * 2273578612293059741L != -1 ? (bp) ap.ad(this.ai * 2273578612293059741L) : bpVar;
                        if (bpVar2 == null) {
                            return null;
                        }
                    }
                    bpVar2 = bpVar;
                    if (bpVar2 == null) {
                        bo ai;
                        bo[] boVarArr = new bo[12];
                        i3 = 0;
                        int i5 = 0;
                        while (i5 < 12) {
                            int i6;
                            int i7 = iArr[i5];
                            if (i7 >= 378431693 && i7 < 512) {
                                ai = cs.aq(1340629326 + i7, 2077382626).ai(-513828233);
                                if (ai != null) {
                                    boVarArr[i3] = ai;
                                    i6 = i3 + 1;
                                    if (i7 < 1326896354) {
                                        bo ax = gl.aq(i7 - 1701514302, 282630187).ax(this.ar, 710799099);
                                        if (ax != null) {
                                            boVarArr[i6] = ax;
                                            i6++;
                                        }
                                    }
                                    i5++;
                                    i3 = i6;
                                }
                            }
                            i6 = i3;
                            if (i7 < 1326896354) {
                            }
                            i5++;
                            i3 = i6;
                        }
                        ai = new bo(boVarArr, i3);
                        for (i5 = 0; i5 < 5; i5++) {
                            if (this.aq[i5] < cd.am[i5].length) {
                                ai.au(ae[i5], cd.am[i5][this.aq[i5]]);
                            }
                            if (this.aq[i5] < on.as[i5].length) {
                                ai.au(ak[i5], on.as[i5][this.aq[i5]]);
                            }
                        }
                        bpVar2 = ai.af(64, -855947622, -30, -50, -656859212);
                        ap.ar(bpVar2, j);
                        this.ai = -6239978217283690059L * j;
                    }
                } else {
                    bpVar2 = bpVar;
                }
                return (dpVar == null || dpVar2 != null) ? (dpVar != null || dpVar2 == null) ? dpVar == null ? dpVar.ai(bpVar2, i, 464066205) : dpVar2.ai(bpVar2, i2, 1206068258) : dpVar.ak(bpVar2, i, dpVar2, i2, (byte) -109) : bpVar2;
            }
        }
        j = j2;
        bpVar = (bp) ap.ad(j);
        if (bpVar != null) {
        }
        if (dpVar == null) {
        }
        if (dpVar != null) {
        }
        if (dpVar == null) {
        }
    }

    public void az(int i, boolean z) {
        int i2 = this.aq[i];
        if (z) {
            do {
                i2++;
                if (i2 >= cd.am[i].length) {
                    i2 = 0;
                }
            } while (!mj.ad(i, i2, 774601234));
        } else {
            do {
                i2--;
                if (i2 < 0) {
                    i2 = cd.am[i].length - 1;
                }
            } while (!mj.ad(i, i2, -910241468));
        }
        this.aq[i] = i2;
        ai((byte) 99);
    }
}
