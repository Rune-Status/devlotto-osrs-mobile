package defpackage;

import android.support.v4.app.NotificationManagerCompat;

/* renamed from: db */
public class db extends mp {
    static kh ad = null;
    static final int al = 4;
    static gz aq = new gz(64, null);
    public static final int bx = 42;
    static String ej;
    public boolean ar;

    db() {
        try {
            this.ar = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("db.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(kh khVar) {
        ad = khVar;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:88:0x0263=Splitter:B:88:0x0263, B:102:0x02b3=Splitter:B:102:0x02b3, B:145:0x03c6=Splitter:B:145:0x03c6, B:24:0x007a=Splitter:B:24:0x007a, B:66:0x01cb=Splitter:B:66:0x01cb, B:153:0x03dc=Splitter:B:153:0x03dc, B:44:0x00fd=Splitter:B:44:0x00fd, B:110:0x02cd=Splitter:B:110:0x02cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int ai(int i, hw hwVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        int i4;
        al aq;
        boolean z2 = false;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            try {
                iArr = hl.ae;
                i3 = ds.am + 564452847;
                ds.am = i3;
                i4 = iArr[i3 * -757592335];
                aq = da.aq(i4, -550158556);
                i3 = i4;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("db.ai(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        i3 = -1;
        aq = z ? lj.az : hl.au;
        int i5;
        if (i == 1100) {
            ds.am += 1128905694;
            bh.gb(aq, hl.ae[ds.am * -757592335], hl.ae[(ds.am * -757592335) + 1], 1738101847);
            return 1;
        } else if (i == 1101) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.br = iArr[i5 * -757592335] * -1732815777;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1102) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.bt = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1103 == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.bz = iArr[i5 * -757592335] * -1784857337;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1104) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.bp = iArr[i5 * -757592335] * -1866717737;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1105 == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.cj = iArr[i5 * -757592335] * -1727679139;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1106) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.cq = iArr[i5 * -757592335] * 1407698477;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1107) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.cn = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1108 == i) {
            aq.ce = -1360803229;
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.cy = iArr[i5 * -757592335] * -927961631;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1109) {
            ds.am -= 908250214;
            aq.cx = hl.ae[ds.am * -757592335] * 116822575;
            aq.ct = hl.ae[(ds.am * -757592335) + 1] * 91905667;
            aq.ck = hl.ae[(ds.am * -757592335) + 2] * -1944500353;
            aq.co = hl.ae[(ds.am * -757592335) + 3] * -1450063701;
            aq.cu = hl.ae[(ds.am * -757592335) + 4] * -1788635289;
            aq.cl = hl.ae[(ds.am * -757592335) + 5] * 137430647;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1110 == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            i4 = iArr[i5 * -757592335];
            if (i4 == aq.cr * 102964449) {
                return 1;
            }
            aq.cr = i4 * 1131620129;
            aq.fb = 0;
            aq.fp = 0;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1111 == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.cf = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1112 == i) {
            String[] strArr = hl.ak;
            i5 = hl.as + 1490481109;
            hl.as = i5;
            String str = strArr[i5 * -1883296125];
            if (str.equals(aq.dm)) {
                return 1;
            }
            aq.dm = str;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1113) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.dd = iArr[i5 * -757592335] * -996713033;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1114 == i) {
            ds.am += 1693358541;
            aq.di = hl.ae[ds.am * -757592335] * 332285219;
            aq.dl = hl.ae[(ds.am * -757592335) + 1] * 452292553;
            aq.dv = hl.ae[(ds.am * -757592335) + 2] * 970340041;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1115) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.dr = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1116 == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.cw = iArr[i5 * -757592335] * 1545275515;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1117) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.cp = iArr[i5 * -757592335] * 1407371587;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1118 == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.ci = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1119 == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.cb = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1120) {
            ds.am += 1128905694;
            aq.bu = hl.ae[ds.am * -757592335] * 1956842863;
            aq.bw = hl.ae[(ds.am * -757592335) + 1] * 1451678031;
            da.gk(aq, (byte) 2);
            if (-1 == i3 || aq.af * 1845699613 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i3 >> 16], aq, false, -109315422);
            return 1;
        } else if (i == 1121) {
            al.fm(aq.ao * -1227024251, aq.ah * 988026877, -2084184731);
            client.lh = aq;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1122) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.cm = iArr[i5 * -757592335] * -728785665;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1123) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.be = iArr[i5 * -757592335] * 1789727225;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1124) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.by = iArr[i5 * -757592335] * -995855343;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1125) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            ep epVar = (ep) oz.ad(ix.aq(2130903090), iArr[i5 * -757592335], (byte) -10);
            if (epVar == null) {
                return 1;
            }
            aq.bn = epVar;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1126) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.cv = z2;
            return 1;
        } else if (1127 != i) {
            return 2;
        } else {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.cg = iArr[i5 * -757592335] == 1;
            return 1;
        }
    }

    public static void ai(kh khVar) {
        ad = khVar;
    }

    public static void aj(kh khVar) {
        ad = khVar;
    }

    public static db am(int i) {
        long j = (long) i;
        db dbVar = (db) aq.ad(j);
        if (dbVar == null) {
            byte[] ar = ad.ar(19, i, 713981483);
            dbVar = new db();
            if (ar != null) {
                dbVar.ar(new lj(ar), (byte) 102);
            }
            aq.ar(dbVar, j);
        }
        return dbVar;
    }

    static int aq(int i, int i2, byte b) {
        if (-2 == i) {
            return 12345678;
        }
        if (i == -1) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 127) {
                i2 = 127;
            }
            return 127 - i2;
        }
        try {
            int i3 = ((i & 127) * i2) / 128;
            if (i3 < 2) {
                i3 = 2;
            } else if (i3 > 126) {
                i3 = 126;
            }
            return i3 + (65408 & i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("db.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de A:{Catch:{ RuntimeException -> 0x0155 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int av(int i, hw hwVar, boolean z, int i2) {
        int i3;
        int i4;
        char c;
        int i5;
        du duVar;
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        if (i == 3400) {
            try {
                ds.am += 1128905694;
                i3 = hl.ae[ds.am * -757592335];
                i4 = hl.ae[(ds.am * -757592335) + 1];
                du aq = cr.aq(i3, -1051215379);
                c = aq.al;
                for (i5 = 0; i5 < aq.ae * 2047609755; i5++) {
                    if (aq.am[i5] == i4) {
                        String[] strArr2 = hl.ak;
                        int i6 = hl.as - 1490481109;
                        hl.as = i6;
                        strArr2[(i6 * -1883296125) - 1] = aq.as[i5];
                        duVar = null;
                        break;
                    }
                }
                duVar = aq;
                if (duVar == null) {
                    return 1;
                }
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = duVar.aj;
                return 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("db.av(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (3408 == i) {
            ds.am -= 2037155908;
            c = hl.ae[ds.am * -757592335];
            char c2 = hl.ae[(ds.am * -757592335) + 1];
            i5 = hl.ae[(ds.am * -757592335) + 2];
            int i7 = hl.ae[(ds.am * -757592335) + 3];
            duVar = cr.aq(i5, -723579029);
            if (c == duVar.ar && duVar.al == c2) {
                for (i4 = 0; i4 < duVar.ae * 2047609755; i4++) {
                    if (duVar.am[i4] == i7) {
                        if ('s' == c2) {
                            String[] strArr3 = hl.ak;
                            i7 = hl.as - 1490481109;
                            hl.as = i7;
                            strArr3[(i7 * -1883296125) - 1] = duVar.as[i4];
                            duVar = null;
                        } else {
                            int[] iArr3 = hl.ae;
                            i7 = ds.am - 564452847;
                            ds.am = i7;
                            iArr3[(i7 * -757592335) - 1] = duVar.ak[i4];
                            duVar = null;
                        }
                        if (duVar != null) {
                            return 1;
                        }
                        if ('s' == c2) {
                            strArr = hl.ak;
                            i4 = hl.as - 1490481109;
                            hl.as = i4;
                            strArr[(i4 * -1883296125) - 1] = duVar.aj;
                            return 1;
                        }
                        iArr = hl.ae;
                        i4 = ds.am - 564452847;
                        ds.am = i4;
                        iArr[(i4 * -757592335) - 1] = duVar.ai * 915542723;
                        return 1;
                    }
                }
                if (duVar != null) {
                }
            } else if (c2 == 's') {
                String[] strArr4 = hl.ak;
                i3 = hl.as - 1490481109;
                hl.as = i3;
                strArr4[(i3 * -1883296125) - 1] = go.ak;
                return 1;
            } else {
                iArr2 = hl.ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                return 1;
            }
        } else if (i != 3411) {
            return 2;
        } else {
            iArr2 = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            duVar = cr.aq(iArr2[i3 * -757592335], -1474884840);
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = duVar.aj(-787102868);
            return 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, -543930290);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, -543930290);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        if (2 == i) {
            try {
                this.ar = true;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("db.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(lj ljVar, int i) {
        if (2 == i) {
            this.ar = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, byte b) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, -543930290);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("db.ar(");
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
                al(ljVar, af, -543930290);
            } else {
                return;
            }
        }
    }
}
