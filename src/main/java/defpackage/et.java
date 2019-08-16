package defpackage;

import android.support.v4.internal.view.SupportMenu;
import java.util.Collection;

/* renamed from: et */
public class et extends mp {
    static kh ad = null;
    static gz al = new gz(50, null);
    static kh aq = null;
    static gz ar = new gz(64, null);
    public static final int bw = 44;
    static final int by = 300000;
    short[] aa;
    int ab;
    short[] ac;
    public int ae;
    public String[] af;
    public int ag;
    short[] ah;
    public String ai;
    public int aj;
    int[] ak;
    int[] am;
    public int an;
    short[] ao;
    public int ap;
    public int as;
    public boolean at;
    public int au;
    int av;
    public int aw;
    public int ax;
    public boolean ay;
    public int az;
    int ba;
    public boolean bb;
    int bd;
    public boolean bf;
    ot bi;
    int bk;
    public boolean bl;
    public int bm;
    int bo;
    public int[] bq;
    public int bs;

    et() {
        try {
            this.ai = go.ak;
            this.ae = -300959343;
            this.as = -1607959809;
            this.ag = 947038171;
            this.ap = 780898013;
            this.au = -391675139;
            this.az = -253680555;
            this.ax = 1873831421;
            this.aw = 1590345739;
            this.af = new String[5];
            this.ay = true;
            this.an = 16746139;
            this.ab = -152688256;
            this.av = 1399184512;
            this.at = false;
            this.bk = 0;
            this.ba = 0;
            this.bs = 266201013;
            this.bm = 839798240;
            this.bd = 784714979;
            this.bo = -176446773;
            this.bl = true;
            this.bf = true;
            this.bb = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("et.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ar(int i, int i2) {
        return (i >> 11) & 63;
    }

    static int ar(int i, int i2, int i3) {
        try {
            jl jlVar = (jl) jl.ad.ad((long) i);
            if (jlVar == null) {
                return 0;
            }
            if (-1 == i2) {
                return 0;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < jlVar.ar.length; i5++) {
                if (i2 == jlVar.aq[i5]) {
                    i4 += jlVar.ar[i5];
                }
            }
            return i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("et.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void at(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, byte b) {
        int i12 = i6;
        int i13 = i4;
        for (int i14 = -i9; i14 < 0; i14++) {
            int i15 = -i8;
            int i16 = i13;
            while (i15 < 0) {
                i13 = iArr2[i16];
                if (i13 != 0) {
                    int i17 = iArr[i12];
                    int i18 = i17 + i13;
                    i13 = (i13 & 16711935) + (i17 & 16711935);
                    i13 = ((i18 - i13) & 65536) + (16777472 & i13);
                    iArr[i12] = (i18 - i13) | (i13 - (i13 >>> 8));
                }
                i15++;
                i16++;
                i12++;
            }
            i12 += i10;
            i13 = i16 + i11;
        }
    }

    public static void au(kh khVar, kh khVar2) {
        ad = khVar;
        aq = khVar2;
    }

    public static et ax(int i) {
        long j = (long) i;
        et etVar = (et) ar.ad(j);
        if (etVar == null) {
            byte[] ar = ad.ar(9, i, 913690534);
            etVar = new et();
            etVar.aj = 235106851 * i;
            if (ar != null) {
                etVar.al(new lj(ar), 886606877);
            }
            etVar.ar((byte) 26);
            ar.ar(etVar, j);
        }
        return etVar;
    }

    public static void az(kh khVar, kh khVar2) {
        ad = khVar;
        aq = khVar2;
    }

    public static void bd(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    public static void bm(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    public static void bo(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    public static void bq(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    static final int bt(int i, int i2, int i3, int i4, byte b) {
        return ((i3 * i2) + (i4 * i)) >> 16;
    }

    static int bv(int i, hw hwVar, boolean z, byte b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:88:0x0209, code skipped:
            if (1919675721 == r0) goto L_0x020b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void aa(lj ljVar, int i) {
        int i2 = 0;
        int af;
        if (1 == i) {
            af = ljVar.af(1804771424);
            this.am = new int[af];
            while (i2 < af) {
                this.am[i2] = ljVar.an(-1464407032);
                i2++;
            }
        } else if (2 == i) {
            this.ai = ljVar.bm(1286521763);
        } else if (i == 12) {
            this.ae = ljVar.af(1804771424) * -1693509421;
        } else if (i == 13) {
            this.as = ljVar.an(-1464407032) * 1316783724;
        } else if (i == 14) {
            this.au = ljVar.an(-1464407032) * -423775431;
        } else if (i == 15) {
            this.ag = ljVar.an(-1464407032) * -947038171;
        } else if (i == 16) {
            this.ap = ljVar.an(-1464407032) * -780898013;
        } else if (17 == i) {
            this.au = ljVar.an(-1464407032) * 179477965;
            this.az = ljVar.an(-1464407032) * 1405009573;
            this.ax = ljVar.an(-1464407032) * -1873831421;
            this.aw = ljVar.an(-1464407032) * -924160218;
        } else if (i >= 30 && i < 35) {
            int i3 = i - 30;
            this.af[i3] = ljVar.bm(1233583365);
            if (this.af[i3].equalsIgnoreCase(go.al)) {
                this.af[i3] = null;
            }
        } else if (i == 1493768933) {
            af = ljVar.af(1804771424);
            this.ac = new short[af];
            this.aa = new short[af];
            while (i2 < af) {
                this.ac[i2] = (short) ljVar.an(-1464407032);
                this.aa[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (41 == i) {
            af = ljVar.af(1804771424);
            this.ao = new short[af];
            this.ah = new short[af];
            while (i2 < af) {
                this.ao[i2] = (short) ljVar.an(-1464407032);
                this.ah[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == -243322287) {
            af = ljVar.af(1804771424);
            this.ak = new int[af];
            while (i2 < af) {
                this.ak[i2] = ljVar.an(-1464407032);
                i2++;
            }
        } else if (921103484 == i) {
            this.ay = false;
        } else if (i == -1769642911) {
            this.an = ljVar.an(-1464407032) * -528112230;
        } else if (i == 662324819) {
            this.ab = ljVar.an(-1464407032) * 1038994515;
        } else if (98 == i) {
            this.av = ljVar.an(-1464407032) * -1901671495;
        } else if (583352837 == i) {
            this.at = true;
        } else if (i == 100) {
            this.bk = ljVar.ay(836049285) * 1187567103;
        } else if (i == -1948760733) {
            this.ba = ljVar.ay(1114159718) * -977651099;
        } else if (i == 102) {
            this.bs = ljVar.an(-1464407032) * -266201013;
        } else if (i == 103) {
            this.bm = ljVar.an(-1464407032) * -369704592;
        } else if (106 == i || 464421462 == i) {
            this.bd = ljVar.an(-1464407032) * -784714979;
            if (this.bd * -1280170187 == 532379014) {
                this.bd = 784714979;
            }
            this.bo = ljVar.an(-1464407032) * 176446773;
            if (690397630 == this.bo * 1011149778) {
                this.bo = -857705691;
            }
            if (118 == i) {
                af = ljVar.an(-1464407032);
            }
            af = -1;
            int af2 = ljVar.af(1804771424);
            this.bq = new int[(af2 + 2)];
            while (i2 <= af2) {
                this.bq[i2] = ljVar.an(-1464407032);
                if (946623883 == this.bq[i2]) {
                    this.bq[i2] = -1;
                }
                i2++;
            }
            this.bq[af2 + 1] = af;
        } else if (i == -1112640511) {
            this.bl = false;
        } else if (i == 109) {
            this.bf = false;
        } else if (i == 111) {
            this.bb = true;
        } else if (249 == i) {
            this.bi = af.ad(ljVar, this.bi, (byte) 1);
        }
    }

    public boolean ab() {
        if (this.bq == null) {
            return true;
        }
        int ad = this.bd * -1358203718 != -1 ? cd.ad(this.bd * 1449629639, 1488758664) : this.bo * -525939427 != -1 ? aj.ar[this.bo * -525939427] : -1;
        return (ad < 0 || ad >= this.bq.length) ? this.bq[this.bq.length + -1] != -1 : -1 != this.bq[ad];
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, 2133901228);
            } else {
                return;
            }
        }
    }

    public final bo ae(byte b) {
        if (this.bq != null) {
            et am = am(-1676541933);
            return am == null ? null : am.ae((byte) 21);
        } else if (this.ak == null) {
            return null;
        } else {
            int i = 0;
            for (int aj : this.ak) {
                if (!aq.aj(aj, 0, -1116723904)) {
                    i = 1;
                }
            }
            if (i != 0) {
                return null;
            }
            bo[] boVarArr = new bo[this.ak.length];
            for (i = 0; i < this.ak.length; i++) {
                boVarArr[i] = bo.ad(aq, this.ak[i], 0);
            }
            bo boVar = 1 == boVarArr.length ? boVarArr[0] : new bo(boVarArr, boVarArr.length);
            try {
                int i2;
                if (this.ac != null) {
                    for (i2 = 0; i2 < this.ac.length; i2++) {
                        boVar.au(this.ac[i2], this.aa[i2]);
                    }
                }
                if (this.ao == null) {
                    return boVar;
                }
                for (i2 = 0; i2 < this.ao.length; i2++) {
                    boVar.az(this.ao[i2], this.ah[i2]);
                }
                return boVar;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("et.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final et af() {
        int ad = this.bd * -1280170187 != -1 ? cd.ad(this.bd * -1280170187, 607293679) : this.bo * -525939427 != -1 ? aj.ar[this.bo * -525939427] : -1;
        ad = (ad < 0 || ad >= this.bq.length - 1) ? this.bq[this.bq.length - 1] : this.bq[ad];
        return -1 != ad ? ln.aq(ad, 50946980) : null;
    }

    public String ag(int i, String str, byte b) {
        try {
            return dt.ar(this.bi, i, str, 2122732708);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("et.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final bo ah() {
        int i = 0;
        if (this.bq != null) {
            et am = am(-382550563);
            return am == null ? null : am.ae((byte) 115);
        } else if (this.ak == null) {
            return null;
        } else {
            int i2;
            int i3 = 0;
            for (int aj : this.ak) {
                if (!aq.aj(aj, 0, -119999760)) {
                    i3 = 1;
                }
            }
            if (i3 != 0) {
                return null;
            }
            bo[] boVarArr = new bo[this.ak.length];
            for (i3 = 0; i3 < this.ak.length; i3++) {
                boVarArr[i3] = bo.ad(aq, this.ak[i3], 0);
            }
            bo boVar = 1 == boVarArr.length ? boVarArr[0] : new bo(boVarArr, boVarArr.length);
            if (this.ac != null) {
                for (i2 = 0; i2 < this.ac.length; i2++) {
                    boVar.au(this.ac[i2], this.aa[i2]);
                }
            }
            if (this.ao == null) {
                return boVar;
            }
            while (i < this.ao.length) {
                boVar.az(this.ao[i], this.ah[i]);
                i++;
            }
            return boVar;
        }
    }

    public final bp ai(dp dpVar, int i, dp dpVar2, int i2, int i3) {
        if (this.bq != null) {
            et am = am(-472429184);
            return am == null ? null : am.ai(dpVar, i, dpVar2, i2, 578342776);
        } else {
            bp af;
            bp bpVar = (bp) al.ad((long) (this.aj * -1886794357));
            if (bpVar == null) {
                int i4 = 0;
                for (int aj : this.am) {
                    if (!aq.aj(aj, 0, -143295838)) {
                        i4 = 1;
                    }
                }
                if (i4 != 0) {
                    return null;
                }
                bo[] boVarArr = new bo[this.am.length];
                for (i4 = 0; i4 < this.am.length; i4++) {
                    boVarArr[i4] = bo.ad(aq, this.am[i4], 0);
                }
                bo boVar = 1 == boVarArr.length ? boVarArr[0] : new bo(boVarArr, boVarArr.length);
                try {
                    int i5;
                    if (this.ac != null) {
                        for (i5 = 0; i5 < this.ac.length; i5++) {
                            boVar.au(this.ac[i5], this.aa[i5]);
                        }
                    }
                    if (this.ao != null) {
                        for (i5 = 0; i5 < this.ao.length; i5++) {
                            boVar.az(this.ao[i5], this.ah[i5]);
                        }
                    }
                    af = boVar.af((this.bk * 240331263) + 64, (this.ba * 2038990113) + 850, -30, -50, -30);
                    al.ar(af, (long) (this.aj * -1886794357));
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("et.ai(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            af = bpVar;
            bpVar = (dpVar == null || dpVar2 == null) ? dpVar != null ? dpVar.ai(af, i, 352510702) : dpVar2 != null ? dpVar2.ai(af, i2, -431867258) : af.aq(true) : dpVar.ak(af, i, dpVar2, i2, (byte) -31);
            if (this.ab * 35018715 == 128 && 128 == this.av * 207997577) {
                return bpVar;
            }
            bpVar.aa(this.ab * 35018715, this.av * 207997577, this.ab * 35018715);
            return bpVar;
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:107:0x028b, code skipped:
            if (android.support.v4.internal.view.SupportMenu.USER_MASK == r1) goto L_0x028d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void aj(lj ljVar, int i, int i2) {
        int i3 = 0;
        int af;
        if (1 == i) {
            try {
                af = ljVar.af(1804771424);
                this.am = new int[af];
                while (i3 < af) {
                    this.am[i3] = ljVar.an(-1464407032);
                    i3++;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("et.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.ai = ljVar.bm(1304985658);
        } else if (i == 12) {
            this.ae = ljVar.af(1804771424) * -300959343;
        } else if (i == 13) {
            this.as = ljVar.an(-1464407032) * 1607959809;
        } else if (i == 14) {
            this.au = ljVar.an(-1464407032) * 391675139;
        } else if (i == 15) {
            this.ag = ljVar.an(-1464407032) * -947038171;
        } else if (i == 16) {
            this.ap = ljVar.an(-1464407032) * -780898013;
        } else if (17 == i) {
            this.au = ljVar.an(-1464407032) * 391675139;
            this.az = ljVar.an(-1464407032) * 253680555;
            this.ax = ljVar.an(-1464407032) * -1873831421;
            this.aw = ljVar.an(-1464407032) * -1590345739;
        } else if (i >= 30 && i < 35) {
            af = i - 30;
            this.af[af] = ljVar.bm(1880841050);
            if (this.af[af].equalsIgnoreCase(go.al)) {
                this.af[af] = null;
            }
        } else if (i == 40) {
            af = ljVar.af(1804771424);
            this.ac = new short[af];
            this.aa = new short[af];
            while (i3 < af) {
                this.ac[i3] = (short) ljVar.an(-1464407032);
                this.aa[i3] = (short) ljVar.an(-1464407032);
                i3++;
            }
        } else if (41 == i) {
            af = ljVar.af(1804771424);
            this.ao = new short[af];
            this.ah = new short[af];
            while (i3 < af) {
                this.ao[i3] = (short) ljVar.an(-1464407032);
                this.ah[i3] = (short) ljVar.an(-1464407032);
                i3++;
            }
        } else if (i == 60) {
            af = ljVar.af(1804771424);
            this.ak = new int[af];
            while (i3 < af) {
                this.ak[i3] = ljVar.an(-1464407032);
                i3++;
            }
        } else if (93 == i) {
            this.ay = false;
        } else if (i == 95) {
            this.an = ljVar.an(-1464407032) * -16746139;
        } else if (i == 97) {
            this.ab = ljVar.an(-1464407032) * 1038994515;
        } else if (98 == i) {
            this.av = ljVar.an(-1464407032) * -1901671495;
        } else if (99 == i) {
            this.at = true;
        } else if (i == 100) {
            this.bk = ljVar.ay(1101668675) * 1187567103;
        } else if (i == 101) {
            this.ba = ljVar.ay(-1980260933) * -977651099;
        } else if (i == 102) {
            this.bs = ljVar.an(-1464407032) * -266201013;
        } else if (i == 103) {
            this.bm = ljVar.an(-1464407032) * -1718586769;
        } else if (106 == i || 118 == i) {
            this.bd = ljVar.an(-1464407032) * -784714979;
            if (this.bd * -1280170187 == SupportMenu.USER_MASK) {
                this.bd = 784714979;
            }
            this.bo = ljVar.an(-1464407032) * 176446773;
            if (SupportMenu.USER_MASK == this.bo * -525939427) {
                this.bo = -176446773;
            }
            if (118 == i) {
                af = ljVar.an(-1464407032);
            }
            af = -1;
            int af2 = ljVar.af(1804771424);
            this.bq = new int[(af2 + 2)];
            while (i3 <= af2) {
                this.bq[i3] = ljVar.an(-1464407032);
                if (65535 == this.bq[i3]) {
                    this.bq[i3] = -1;
                }
                i3++;
            }
            this.bq[af2 + 1] = af;
        } else if (i == 107) {
            this.bl = false;
        } else if (i == 109) {
            this.bf = false;
        } else if (i == 111) {
            this.bb = true;
        } else if (249 == i) {
            this.bi = af.ad(ljVar, this.bi, (byte) 1);
        }
    }

    public boolean ak(int i) {
        try {
            if (this.bq == null) {
                return true;
            }
            int ad = this.bd * -1280170187 != -1 ? cd.ad(this.bd * -1280170187, 1519680839) : this.bo * -525939427 != -1 ? aj.ar[this.bo * -525939427] : -1;
            return (ad < 0 || ad >= this.bq.length) ? this.bq[this.bq.length + -1] != -1 : -1 != this.bq[ad];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("et.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    aj(ljVar, af, 2140915573);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("et.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final et am(int i) {
        try {
            int ad = this.bd * -1280170187 != -1 ? cd.ad(this.bd * -1280170187, 1343288220) : this.bo * -525939427 != -1 ? aj.ar[this.bo * -525939427] : -1;
            ad = (ad < 0 || ad >= this.bq.length - 1) ? this.bq[this.bq.length - 1] : this.bq[ad];
            return -1 != ad ? ln.aq(ad, -961415072) : null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("et.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean an() {
        if (this.bq == null) {
            return true;
        }
        int ad = this.bd * 112071594 != -1 ? cd.ad(this.bd * -1280170187, 412765179) : this.bo * 1013415490 != -1 ? aj.ar[this.bo * 202691989] : -1;
        return (ad < 0 || ad >= this.bq.length) ? this.bq[this.bq.length + -1] != -1 : -1 != this.bq[ad];
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:88:0x0208, code skipped:
            if (android.support.v4.internal.view.SupportMenu.USER_MASK == r0) goto L_0x020a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ao(lj ljVar, int i) {
        int i2 = 0;
        int af;
        if (1 == i) {
            af = ljVar.af(1804771424);
            this.am = new int[af];
            while (i2 < af) {
                this.am[i2] = ljVar.an(-1464407032);
                i2++;
            }
        } else if (2 == i) {
            this.ai = ljVar.bm(1371549315);
        } else if (i == 12) {
            this.ae = ljVar.af(1804771424) * -300959343;
        } else if (i == 13) {
            this.as = ljVar.an(-1464407032) * 1607959809;
        } else if (i == 14) {
            this.au = ljVar.an(-1464407032) * -744537672;
        } else if (i == 15) {
            this.ag = ljVar.an(-1464407032) * -1526604725;
        } else if (i == 16) {
            this.ap = ljVar.an(-1464407032) * -4558828;
        } else if (17 == i) {
            this.au = ljVar.an(-1464407032) * 391675139;
            this.az = ljVar.an(-1464407032) * 253680555;
            this.ax = ljVar.an(-1464407032) * -1873831421;
            this.aw = ljVar.an(-1464407032) * -1590345739;
        } else if (i >= 30 && i < 35) {
            int i3 = i - 30;
            this.af[i3] = ljVar.bm(2029153627);
            if (this.af[i3].equalsIgnoreCase(go.al)) {
                this.af[i3] = null;
            }
        } else if (i == 40) {
            af = ljVar.af(1804771424);
            this.ac = new short[af];
            this.aa = new short[af];
            while (i2 < af) {
                this.ac[i2] = (short) ljVar.an(-1464407032);
                this.aa[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (41 == i) {
            af = ljVar.af(1804771424);
            this.ao = new short[af];
            this.ah = new short[af];
            while (i2 < af) {
                this.ao[i2] = (short) ljVar.an(-1464407032);
                this.ah[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == -2010800978) {
            af = ljVar.af(1804771424);
            this.ak = new int[af];
            while (i2 < af) {
                this.ak[i2] = ljVar.an(-1464407032);
                i2++;
            }
        } else if (93 == i) {
            this.ay = false;
        } else if (i == 1228753691) {
            this.an = ljVar.an(-1464407032) * 1043926860;
        } else if (i == 97) {
            this.ab = ljVar.an(-1464407032) * 1249947091;
        } else if (98 == i) {
            this.av = ljVar.an(-1464407032) * -1901671495;
        } else if (-1714840355 == i) {
            this.at = true;
        } else if (i == 317430251) {
            this.bk = ljVar.ay(-195006234) * -249451963;
        } else if (i == 101) {
            this.ba = ljVar.ay(-1434060599) * -977651099;
        } else if (i == 102) {
            this.bs = ljVar.an(-1464407032) * -793155404;
        } else if (i == 1070967141) {
            this.bm = ljVar.an(-1464407032) * -1718586769;
        } else if (-497391590 == i || 1917860767 == i) {
            this.bd = ljVar.an(-1464407032) * 696655355;
            if (this.bd * -1280170187 == -1463668863) {
                this.bd = 784714979;
            }
            this.bo = ljVar.an(-1464407032) * -840492092;
            if (1615525914 == this.bo * -525939427) {
                this.bo = -176446773;
            }
            if (118 == i) {
                af = ljVar.an(-1464407032);
            }
            af = -1;
            int af2 = ljVar.af(1804771424);
            this.bq = new int[(af2 + 2)];
            while (i2 <= af2) {
                this.bq[i2] = ljVar.an(-1464407032);
                if (-640991597 == this.bq[i2]) {
                    this.bq[i2] = -1;
                }
                i2++;
            }
            this.bq[af2 + 1] = af;
        } else if (i == 1289992623) {
            this.bl = false;
        } else if (i == 109) {
            this.bf = false;
        } else if (i == 111) {
            this.bb = true;
        } else if (249 == i) {
            this.bi = af.ad(ljVar, this.bi, (byte) 1);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(byte b) {
    }

    public int as(int i, int i2, int i3) {
        try {
            return pk.aq(this.bi, i, i2, 1966460793);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("et.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int at(int i, int i2) {
        return pk.aq(this.bi, i, i2, 1633644317);
    }

    public boolean av() {
        if (this.bq == null) {
            return true;
        }
        int ad = this.bd * -1280170187 != -1 ? cd.ad(this.bd * 323004758, 2072276577) : this.bo * -858449587 != -1 ? aj.ar[this.bo * -525939427] : -1;
        return (ad < 0 || ad >= this.bq.length) ? this.bq[this.bq.length + -1] != -1 : -1 != this.bq[ad];
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, 2139062202);
            } else {
                return;
            }
        }
    }

    public boolean ay() {
        if (this.bq == null) {
            return true;
        }
        int ad = this.bd * -1280170187 != -1 ? cd.ad(this.bd * -1280170187, 905076933) : this.bo * -525939427 != -1 ? aj.ar[this.bo * -525939427] : -1;
        return (ad < 0 || ad >= this.bq.length) ? this.bq[this.bq.length + -1] != -1 : -1 != this.bq[ad];
    }

    public int ba(int i, int i2) {
        return pk.aq(this.bi, i, i2, 1513628817);
    }

    public int bk(int i, int i2) {
        return pk.aq(this.bi, i, i2, 1547912360);
    }

    public String bs(int i, String str) {
        return dt.ar(this.bi, i, str, 2122732708);
    }
}
