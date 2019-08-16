package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

/* renamed from: ib */
public final class ib extends mb {
    static fy ad = new fy();
    static final int ba = 127;
    /* renamed from: do */
    static final int f275do = 3;
    static int mx;
    static short[] ra;
    protected static long to;
    int ae;
    int ag;
    int ai;
    int aj;
    hf ak;
    int al;
    int am;
    int[] ap;
    int aq;
    int ar;
    int as;
    int au;
    dx ax;
    hf az;

    ib() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ib.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x001f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void aa(int i, int i2, int i3, int i4) {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (-1 != ibVar.am * 1046754583 || ibVar.ap != null) {
                    int i5;
                    if (i2 > ibVar.aj * 1473036269) {
                        i5 = i2 - (ibVar.aj * 1473036269);
                    } else if (i2 < ibVar.ar * 1319686961) {
                        i5 = (ibVar.ar * 1319686961) - i2;
                    } else {
                        i5 = 0;
                        if (i3 <= ibVar.ai * -1743535669) {
                            i5 += i3 - (ibVar.ai * -1743535669);
                        } else if (i3 < ibVar.al * -1701208527) {
                            i5 += (ibVar.al * -1701208527) - i3;
                        }
                        if (i5 - 64 <= ibVar.ae * 473397289 || client.pp * 1070201509 == 0 || ibVar.aq * -1403904653 != i) {
                            if (ibVar.ak != null) {
                                gd.pf.aq(ibVar.ak);
                                ibVar.ak = null;
                            }
                            if (ibVar.az == null) {
                                gd.pf.aq(ibVar.az);
                                ibVar.az = null;
                            }
                        } else {
                            hp ad;
                            i5 -= 64;
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            i5 = (((ibVar.ae * 473397289) - i5) * (client.pp * 1070201509)) / (ibVar.ae * 473397289);
                            if (ibVar.ak != null) {
                                ibVar.ak.ap(i5);
                            } else if (ibVar.am * 1046754583 >= 0) {
                                ad = hp.ad(av.cg, ibVar.am * 1046754583, 0);
                                if (ad != null) {
                                    hf ar = hf.ar(ad.aq().ad(dk.px), 100, i5);
                                    ar.as(-1);
                                    gd.pf.ad(ar);
                                    ibVar.ak = ar;
                                }
                            }
                            if (ibVar.az != null) {
                                ibVar.az.ap(i5);
                                if (!ibVar.az.ke()) {
                                    ibVar.az = null;
                                }
                            } else if (ibVar.ap != null) {
                                int i6 = ibVar.au - (1690418027 * i4);
                                ibVar.au = i6;
                                if (i6 * 1008441667 <= 0) {
                                    ad = hp.ad(av.cg, ibVar.ap[(int) (Math.random() * ((double) ibVar.ap.length))], 0);
                                    if (ad != null) {
                                        hf ar2 = hf.ar(ad.aq().ad(dk.px), 100, i5);
                                        ar2.as(0);
                                        gd.pf.ad(ar2);
                                        ibVar.az = ar2;
                                        ibVar.au = ((ibVar.as * 510766937) + ((int) (Math.random() * ((double) ((ibVar.ag * -761423773) - (ibVar.as * 510766937)))))) * 1690418027;
                                    }
                                }
                            }
                        }
                    }
                    i5 += 0;
                    if (i3 <= ibVar.ai * -1743535669) {
                    }
                    if (i5 - 64 <= ibVar.ae * 473397289) {
                    }
                    if (ibVar.ak != null) {
                    }
                    if (ibVar.az == null) {
                    }
                }
                ae = ad.ak();
            } else {
                return;
            }
        }
    }

    static void ac(int i, int i2, int i3, dx dxVar, int i4) {
        ib ibVar = new ib();
        ibVar.aq = 937054139 * i;
        ibVar.ar = -825038720 * i2;
        ibVar.al = -1652725632 * i3;
        int i5 = dxVar.ac * -506944577;
        int i6 = dxVar.aa * -814811101;
        if (1 == i4 || 3 == i4) {
            i5 = dxVar.aa * -814811101;
            i6 = dxVar.ac * -506944577;
        }
        ibVar.aj = (i5 + i2) * -1799218417;
        ibVar.ai = (i3 + i6) * 630172614;
        ibVar.am = dxVar.bj * 1677448867;
        ibVar.ae = dxVar.bh * -308829824;
        ibVar.as = dxVar.bt * 1054880863;
        ibVar.ag = dxVar.bn * 743980819;
        ibVar.ap = dxVar.bz;
        if (dxVar.bw != null) {
            ibVar.ax = dxVar;
            ibVar.ar(1448327594);
        }
        ad.aq(ibVar);
        if (ibVar.ap != null) {
            ibVar.au = ((ibVar.as * 510766937) + ((int) (Math.random() * ((double) ((ibVar.ag * -761423773) - (ibVar.as * -913482030)))))) * 1690418027;
        }
    }

    static void ae() {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (ibVar.ak != null) {
                    gd.pf.aq(ibVar.ak);
                    ibVar.ak = null;
                }
                if (ibVar.az != null) {
                    gd.pf.aq(ibVar.az);
                    ibVar.az = null;
                }
                ae = ad.ak();
            } else {
                ad.ad();
                return;
            }
        }
    }

    public static byte[] ae(Object obj, boolean z, int i) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                return z ? li.am(bArr, -1989589265) : bArr;
            } else if (obj instanceof nc) {
                return ((nc) obj).ad((byte) 38);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ib.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ag() {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (ibVar.ax != null) {
                    ibVar.ar(627823299);
                }
                ae = ad.ak();
            } else {
                return;
            }
        }
    }

    static void ai() {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (ibVar.ak != null) {
                    gd.pf.aq(ibVar.ak);
                    ibVar.ak = null;
                }
                if (ibVar.az != null) {
                    gd.pf.aq(ibVar.az);
                    ibVar.az = null;
                }
                ae = ad.ak();
            } else {
                ad.ad();
                return;
            }
        }
    }

    static void aj(int i, int i2, int i3, boolean z, int i4, boolean z2, int i5) {
        if (i < i2) {
            try {
                int i6 = (i2 + i) / 2;
                ii iiVar = ii.aj[i6];
                ii.aj[i6] = ii.aj[i2];
                ii.aj[i2] = iiVar;
                int i7 = i;
                for (int i8 = i; i8 < i2; i8++) {
                    if (cx.ai(ii.aj[i8], iiVar, i3, z, i4, z2, (byte) 32) <= 0) {
                        ii iiVar2 = ii.aj[i8];
                        ii.aj[i8] = ii.aj[i7];
                        ii.aj[i7] = iiVar2;
                        i6 = i7 + 1;
                    } else {
                        i6 = i7;
                    }
                    i7 = i6;
                }
                ii.aj[i2] = ii.aj[i7];
                ii.aj[i7] = iiVar;
                ib.aj(i, i7 - 1, i3, z, i4, z2, 1963496575);
                ib.aj(i7 + 1, i2, i3, z, i4, z2, 1915874092);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ib.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    static void ak() {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (ibVar.ax != null) {
                    ibVar.ar(572189817);
                }
                ae = ad.ak();
            } else {
                return;
            }
        }
    }

    static void am() {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (ibVar.ak != null) {
                    gd.pf.aq(ibVar.ak);
                    ibVar.ak = null;
                }
                if (ibVar.az != null) {
                    gd.pf.aq(ibVar.az);
                    ibVar.az = null;
                }
                ae = ad.ak();
            } else {
                ad.ad();
                return;
            }
        }
    }

    static void ap() {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (ibVar.ax != null) {
                    ibVar.ar(1401446897);
                }
                ae = ad.ak();
            } else {
                return;
            }
        }
    }

    public static ns aq(no noVar, mj mjVar, int i) {
        try {
            lv lvVar;
            ns ad = ci.ad(-2139931090);
            ad.ad = noVar;
            ad.aq = noVar.dg * -1133827239;
            if (ad.aq * 1850281161 == -1) {
                lvVar = new lv(la.ae);
            } else {
                if (-2 == ad.aq * 1850281161) {
                    ad.ar = new lv(10000);
                } else if (ad.aq * 1850281161 <= 18) {
                    lvVar = new lv(20);
                } else if (ad.aq * 1850281161 <= 98) {
                    lvVar = new lv(100);
                } else {
                    ad.ar = new lv(la.ae);
                }
                ad.ar.jh(mjVar, (byte) -65);
                ad.ar.jz(ad.ad.dw * -95871395, 41807352);
                ad.al = 0;
                return ad;
            }
            ad.ar = lvVar;
            ad.ar.jh(mjVar, (byte) -65);
            ad.ar.jz(ad.ad.dw * -95871395, 41807352);
            ad.al = 0;
            return ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ib.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static String ar(Throwable th, int i) throws IOException {
        try {
            StringBuilder stringBuilder;
            String stringBuilder2;
            if (th instanceof pn) {
                pn pnVar = (pn) th;
                stringBuilder = new StringBuilder();
                stringBuilder.append(pnVar.ai);
                stringBuilder.append(" | ");
                stringBuilder2 = stringBuilder.toString();
                th = pnVar.ae;
            } else {
                stringBuilder2 = "";
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
            String readLine = bufferedReader.readLine();
            String str = stringBuilder2;
            while (true) {
                stringBuilder2 = bufferedReader.readLine();
                if (stringBuilder2 == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("| ");
                    stringBuilder.append(readLine);
                    return stringBuilder.toString();
                }
                StringBuilder stringBuilder3;
                int indexOf = stringBuilder2.indexOf(40);
                int i2 = indexOf + 1;
                int indexOf2 = stringBuilder2.indexOf(41, i2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    String substring = stringBuilder2.substring(i2, indexOf2);
                    indexOf2 = substring.indexOf(".java:");
                    if (indexOf2 >= 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(substring.substring(0, indexOf2));
                        stringBuilder.append(substring.substring(indexOf2 + 5));
                        stringBuilder2 = stringBuilder.toString();
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(str);
                        stringBuilder3.append(stringBuilder2);
                        stringBuilder3.append(' ');
                        str = stringBuilder3.toString();
                    } else {
                        stringBuilder2 = stringBuilder2.substring(0, indexOf);
                    }
                }
                stringBuilder2 = stringBuilder2.trim();
                stringBuilder2 = stringBuilder2.substring(stringBuilder2.lastIndexOf(32) + 1);
                stringBuilder2 = stringBuilder2.substring(stringBuilder2.lastIndexOf(9) + 1);
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str);
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(' ');
                str = stringBuilder3.toString();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("ib.ar(");
            stringBuilder4.append(')');
            throw mv.aq(e, stringBuilder4.toString());
        }
    }

    static void as() {
        mb ae = ad.ae();
        while (true) {
            ib ibVar = (ib) ae;
            if (ibVar != null) {
                if (ibVar.ax != null) {
                    ibVar.ar(693319034);
                }
                ae = ad.ak();
            } else {
                return;
            }
        }
    }

    static void aw(int i, int i2, int i3, dx dxVar, int i4) {
        ib ibVar = new ib();
        ibVar.aq = 937054139 * i;
        ibVar.ar = 744677934 * i2;
        ibVar.al = 827459063 * i3;
        int i5 = dxVar.ac * -506944577;
        int i6 = dxVar.aa * -1029781367;
        if (1 == i4 || 3 == i4) {
            i5 = -1501936158 * dxVar.aa;
            i6 = dxVar.ac * -506944577;
        }
        ibVar.aj = (i5 + i2) * 1119548032;
        ibVar.ai = (i3 + i6) * 1680732544;
        ibVar.am = dxVar.bj * 426043500;
        ibVar.ae = dxVar.bh * 255460174;
        ibVar.as = dxVar.bt * 1054880863;
        ibVar.ag = dxVar.bn * 743980819;
        ibVar.ap = dxVar.bz;
        if (dxVar.bw != null) {
            ibVar.ax = dxVar;
            ibVar.ar(-1435158141);
        }
        ad.aq(ibVar);
        if (ibVar.ap != null) {
            ibVar.au = ((ibVar.as * 510766937) + ((int) (Math.random() * ((double) ((ibVar.ag * -520591758) - (ibVar.as * -992847052)))))) * 889897892;
        }
    }

    static void ax(int i, int i2, int i3, dx dxVar, int i4) {
        ib ibVar = new ib();
        ibVar.aq = 937054139 * i;
        ibVar.ar = -825038720 * i2;
        ibVar.al = -1652725632 * i3;
        int i5 = dxVar.ac * -506944577;
        int i6 = dxVar.aa * -814811101;
        if (1 == i4 || 3 == i4) {
            i5 = dxVar.aa * -814811101;
            i6 = dxVar.ac * -506944577;
        }
        ibVar.aj = (i5 + i2) * 1119548032;
        ibVar.ai = (i3 + i6) * 1680732544;
        ibVar.am = dxVar.bj * 1677448867;
        ibVar.ae = dxVar.bh * -308829824;
        ibVar.as = dxVar.bt * 1054880863;
        ibVar.ag = dxVar.bn * 743980819;
        ibVar.ap = dxVar.bz;
        if (dxVar.bw != null) {
            ibVar.ax = dxVar;
            ibVar.ar(-947226834);
        }
        ad.aq(ibVar);
        if (ibVar.ap != null) {
            ibVar.au = ((ibVar.as * 510766937) + ((int) (Math.random() * ((double) ((ibVar.ag * -761423773) - (ibVar.as * 510766937)))))) * 1690418027;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
        try {
            int i2 = this.am;
            dx ap = this.ax.ap(1367084511);
            if (ap != null) {
                this.am = ap.bj * 1677448867;
                this.ae = ap.bh * -308829824;
                this.as = ap.bt * 1054880863;
                this.ag = ap.bn * 743980819;
                this.ap = ap.bz;
            } else {
                this.am = 312454489;
                this.ae = 0;
                this.as = 0;
                this.ag = 0;
                this.ap = null;
            }
            if (this.am * 1046754583 != i2 * 1046754583 && this.ak != null) {
                gd.pf.aq(this.ak);
                this.ak = null;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ib.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au() {
        int i = this.am;
        dx ap = this.ax.ap(-118425578);
        if (ap != null) {
            this.am = ap.bj * 1677448867;
            this.ae = ap.bh * -308829824;
            this.as = ap.bt * 1714429618;
            this.ag = ap.bn * -1733878191;
            this.ap = ap.bz;
        } else {
            this.am = 312454489;
            this.ae = 0;
            this.as = 0;
            this.ag = 0;
            this.ap = null;
        }
        if (this.am * -1093182358 != i * 324389853 && this.ak != null) {
            gd.pf.aq(this.ak);
            this.ak = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az() {
        int i = this.am;
        dx ap = this.ax.ap(-802768393);
        if (ap != null) {
            this.am = ap.bj * 1677448867;
            this.ae = ap.bh * -380304271;
            this.as = ap.bt * 1054880863;
            this.ag = ap.bn * -599266078;
            this.ap = ap.bz;
        } else {
            this.am = 312454489;
            this.ae = 0;
            this.as = 0;
            this.ag = 0;
            this.ap = null;
        }
        if (this.am * 1046754583 != i * 1046754583 && this.ak != null) {
            gd.pf.aq(this.ak);
            this.ak = null;
        }
    }
}
