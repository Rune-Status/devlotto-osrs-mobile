package defpackage;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.Comparator;

/* renamed from: iv */
public class iv implements Comparator {
    static final float ae = 3.0f;
    static final int aq = 100;
    static final int be = 7;
    static final int ce = 24;
    static final int em = 9226041;
    boolean ad;

    iv() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(String str, Throwable th, int i) {
        StringBuilder stringBuilder;
        String str2 = "";
        if (th != null) {
            try {
                str2 = ib.ar(th, -1575153604);
            } catch (Exception e) {
                return;
            } catch (RuntimeException e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("iv.ad(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
        if (str != null) {
            if (th != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(" | ");
                str2 = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            str2 = stringBuilder.toString();
        }
        PrintStream printStream = System.out;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Error: ");
        stringBuilder2.append(str2);
        printStream.println(stringBuilder2.toString());
        str2 = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
        if (pn.ad != null) {
            URL url = pn.ad;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("clienterror.ws?cv=");
            stringBuilder2.append(pn.ar * -1079281305);
            stringBuilder2.append("&cs=");
            stringBuilder2.append(ai.al * -868864655);
            stringBuilder2.append("&u=");
            stringBuilder2.append(pn.aq);
            stringBuilder2.append("&v1=");
            stringBuilder2.append(mr.ad);
            stringBuilder2.append("&v2=");
            stringBuilder2.append(mr.aq);
            stringBuilder2.append("&e=");
            stringBuilder2.append(str2);
            stringBuilder2.append("&ct=");
            stringBuilder2.append(pn.aj * -316098831);
            stringBuilder2.append("&e=");
            stringBuilder2.append(str2);
            DataInputStream dataInputStream = new DataInputStream(new URL(url, stringBuilder2.toString()).openStream());
            dataInputStream.read();
            dataInputStream.close();
        }
    }

    static void ai(int i, int i2) {
        try {
            jl jlVar = (jl) jl.ad.ad((long) i);
            if (jlVar != null) {
                jlVar.ky();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iv.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static double[] ar(double d, double d2, int i, int i2) {
        try {
            double[] dArr = new double[((i * 2) + 1)];
            int i3 = -i;
            int i4 = 0;
            while (i3 <= i) {
                dArr[i4] = ov.aq((double) i3, d, d2);
                i3++;
                i4++;
            }
            return dArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iv.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Missing block: B:124:0x0185, code skipped:
            if (r2 != 0) goto L_0x0188;
     */
    /* JADX WARNING: Missing block: B:125:0x0187, code skipped:
            r1 = r1 + r4;
     */
    /* JADX WARNING: Missing block: B:127:0x0189, code skipped:
            if (1 != r2) goto L_0x018c;
     */
    /* JADX WARNING: Missing block: B:128:0x018b, code skipped:
            r1 = r1 - r4;
     */
    /* JADX WARNING: Missing block: B:130:0x018d, code skipped:
            if (r2 != 2) goto L_0x0192;
     */
    /* JADX WARNING: Missing block: B:131:0x018f, code skipped:
            if (r4 == 0) goto L_0x0192;
     */
    /* JADX WARNING: Missing block: B:133:?, code skipped:
            r1 = r1 / r4;
     */
    /* JADX WARNING: Missing block: B:135:0x0193, code skipped:
            if (r2 != 3) goto L_0x0011;
     */
    /* JADX WARNING: Missing block: B:136:0x0195, code skipped:
            r1 = r1 * r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final int gi(al alVar, int i, int i2) {
        try {
            if (alVar.ff == null || i >= alVar.ff.length) {
                return -2;
            }
            try {
                int[] iArr = alVar.ff[i];
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i3 + 1;
                        int i7 = iArr[i3];
                        if (i7 == 0) {
                            return i4;
                        }
                        int i8;
                        int i9;
                        al aq;
                        if (1 == i7) {
                            i3 = client.kx[iArr[i6]];
                            i6++;
                        } else {
                            i3 = 0;
                        }
                        if (2 == i7) {
                            i3 = client.kz[iArr[i6]];
                            i6++;
                        }
                        if (i7 == 3) {
                            i3 = client.kq[iArr[i6]];
                            i6++;
                        }
                        if (4 == i7) {
                            i8 = i6 + 1;
                            i9 = i8 + 1;
                            aq = da.aq(iArr[i8] + (iArr[i6] << 16), -550158556);
                            i6 = i9 + 1;
                            i9 = iArr[i9];
                            if (-1 != i9) {
                                if (!gl.aq(i9, -1299231257).bd || client.ak) {
                                    for (i8 = 0; i8 < aq.fj.length; i8++) {
                                        if (i9 + 1 == aq.fj[i8]) {
                                            i3 += aq.fi[i8];
                                        }
                                    }
                                }
                            }
                        }
                        if (5 == i7) {
                            i8 = i6 + 1;
                            i3 = aj.ar[iArr[i6]];
                        } else {
                            i8 = i6;
                        }
                        if (6 == i7) {
                            i3 = fl.ar[client.kz[iArr[i8]] - 1];
                            i8++;
                        }
                        if (7 == i7) {
                            i3 = (aj.ar[iArr[i8]] * 100) / 46875;
                            i8++;
                        }
                        if (i7 == 8) {
                            i3 = da.jc.ae * -1589952451;
                        }
                        if (9 == i7) {
                            for (i6 = 0; i6 < 25; i6++) {
                                if (fl.aq[i6]) {
                                    i3 += client.kz[i6];
                                }
                            }
                            i6 = i3;
                        } else {
                            i6 = i3;
                        }
                        if (i7 == 10) {
                            i3 = i8 + 1;
                            i9 = i3 + 1;
                            aq = da.aq(iArr[i3] + (iArr[i8] << 16), -550158556);
                            i8 = i9 + 1;
                            i9 = iArr[i9];
                            if (i9 != -1) {
                                if (!gl.aq(i9, 877210745).bd || client.ak) {
                                    for (int i10 : aq.fj) {
                                        if (i10 == i9 + 1) {
                                            i6 = 999999999;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (i7 == 11) {
                            i6 = 2056417909 * client.lm;
                        }
                        if (12 == i7) {
                            i6 = client.ln * 1534723747;
                        }
                        if (i7 == 13) {
                            i6 = i8 + 1;
                            i3 = aj.ar[iArr[i8]];
                            i8 = i6 + 1;
                            i6 = (i3 & (1 << iArr[i6])) != 0 ? 1 : 0;
                        }
                        if (14 == i7) {
                            i3 = i8 + 1;
                            i6 = cd.ad(iArr[i8], 619137831);
                        } else {
                            i3 = i8;
                        }
                        i8 = i7 == 15 ? 1 : 0;
                        if (i7 == 16) {
                            i8 = 2;
                        }
                        if (17 == i7) {
                            i8 = 3;
                        }
                        if (i7 == 18) {
                            i6 = (oz.ff * 2060098323) + ((da.jc.bq * -1444273727) >> 7);
                        }
                        if (i7 == 19) {
                            i6 = ((da.jc.bd * -1690563339) >> 7) + (cq.fz * -1866366501);
                        }
                        if (20 == i7) {
                            i6 = iArr[i3];
                            i3++;
                        }
                        if (i8 == 0) {
                            break;
                        }
                        i5 = i8;
                    }
                }
            } catch (Exception e) {
                return -1;
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iv.gi(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(nx nxVar, nx nxVar2, int i) {
        try {
            if (nxVar.ad * -44135447 == nxVar2.ad * -44135447) {
                return 0;
            }
            if (this.ad) {
                if (nxVar.ad * -44135447 == client.ar * -2059975617) {
                    return -1;
                }
                if (client.ar * -2059975617 == nxVar2.ad * -44135447) {
                    return 1;
                }
            }
            return nxVar.ad * -44135447 >= nxVar2.ad * -44135447 ? 1 : -1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iv.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((nx) obj, (nx) obj2, 315173388);
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(nx nxVar, nx nxVar2) {
        if (nxVar.ad * -44135447 == nxVar2.ad * -44135447) {
            return 0;
        }
        if (this.ad) {
            if (nxVar.ad * -44135447 == client.ar * -2059975617) {
                return -1;
            }
            if (client.ar * -2059975617 == nxVar2.ad * -44135447) {
                return 1;
            }
        }
        return nxVar.ad * -44135447 >= nxVar2.ad * -44135447 ? 1 : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public int al(nx nxVar, nx nxVar2) {
        if (nxVar.ad * -44135447 == nxVar2.ad * -44135447) {
            return 0;
        }
        if (this.ad) {
            if (nxVar.ad * -44135447 == client.ar * -2059975617) {
                return -1;
            }
            if (client.ar * -2059975617 == nxVar2.ad * -44135447) {
                return 1;
            }
        }
        return nxVar.ad * -44135447 >= nxVar2.ad * -44135447 ? 1 : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(nx nxVar, nx nxVar2) {
        if (nxVar.ad * -44135447 == nxVar2.ad * -44135447) {
            return 0;
        }
        if (this.ad) {
            if (nxVar.ad * -44135447 == client.ar * -2059975617) {
                return -1;
            }
            if (client.ar * -2059975617 == nxVar2.ad * -44135447) {
                return 1;
            }
        }
        return nxVar.ad * -44135447 >= nxVar2.ad * -44135447 ? 1 : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(nx nxVar, nx nxVar2) {
        if (nxVar.ad * 2101107312 == nxVar2.ad * -369182103) {
            return 0;
        }
        if (this.ad) {
            if (nxVar.ad * 1702385080 == client.ar * -2059975617) {
                return -1;
            }
            if (client.ar * -2059975617 == nxVar2.ad * -1005338288) {
                return 1;
            }
        }
        return nxVar.ad * -500459679 >= nxVar2.ad * -364770198 ? 1 : -1;
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((nx) obj, (nx) obj2, 315173388);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iv.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iv.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
