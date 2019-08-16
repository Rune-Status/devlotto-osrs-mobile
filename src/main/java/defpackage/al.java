package defpackage;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import com.jagex.mobilesdk.common.comms.CommsResult;
import java.util.Collection;

/* renamed from: al */
public class al extends mb {
    public static boolean ac = false;
    public static final int ad = 1337;
    public static final int aj = 1401;
    public static final int aq = 1338;
    public static final int ar = 1339;
    static kh as;
    static gz au = new gz(200, null);
    static gz aw = new gz(8, null);
    static gz ax = new gz(20, null);
    static gz az = new gz(50, null);
    static int mq;
    public static hs rd;
    public boolean aa = false;
    public int ab = 0;
    public int af;
    public int ah = 2139357867;
    public int an = 0;
    public int ao = 1386012595;
    public int at = 0;
    public int av = 0;
    public int ay = 0;
    public int ba = 0;
    public int bb = 900145735;
    public int bc = 712641979;
    public int bd = 0;
    public int be = 0;
    public int bf = 0;
    public int bg = 0;
    public int bh = 0;
    public int bi = 662805627;
    public int bj = 0;
    public int bk = 0;
    public int bl = 0;
    public int bm = 0;
    public ep bn = ep.ad;
    public int bo = 0;
    public int bp = -1866717737;
    public int bq = 0;
    public int br = 0;
    public int bs = 0;
    public boolean bt = false;
    public int bu = 0;
    public boolean bv = false;
    public int bw = 0;
    public int bx = 0;
    public int by = 0;
    public int bz = 0;
    public int ca = -2119627447;
    public boolean cb;
    int cc = -1821975169;
    public int cd = 0;
    public int ce = -1360803229;
    public boolean cf = false;
    public boolean cg = false;
    public int ch = 1743683630;
    public boolean ci;
    public int cj = 1727679139;
    public int ck = 0;
    public int cl = 858162812;
    public int cm = 728785665;
    public boolean cn = false;
    public int co = 0;
    public int cp = 0;
    public int cq = 0;
    public int cr = -1131620129;
    int cs = -1158082685;
    public int ct = 0;
    public int cu = 0;
    public boolean cv = false;
    public int cw = 0;
    public int cx = 0;
    public int cy = 927961631;
    public int cz = 0;
    public int da = 0;
    public int[] db;
    public int[] dc;
    public int dd = 996713033;
    public byte[][] de;
    public int df = 0;
    public String dg = "";
    public boolean dh = false;
    public int di = 0;
    public al dj = null;
    public int dl = 0;
    public String dm = "";
    public int dn = 0;
    /* renamed from: do */
    public int[] f0do;
    public String[] dp;
    public boolean dr = false;
    public byte[][] ds;
    public String dt = "";
    public int[] du;
    public int dv = 0;
    public int[] dy;
    public String[] dz;
    public Object[] ea;
    public int[] eb;
    public Object[] ec;
    public Object[] ed;
    public Object[] ee;
    public int[] ef;
    public Object[] eg;
    public boolean eh = false;
    public Object[] ei;
    public Object[] ej;
    public Object[] ek;
    public Object[] el;
    public Object[] em;
    public Object[] en;
    public String eo = "";
    public int[] ep;
    public int eq = 0;
    public Object[] er;
    public Object[] es;
    public int et = 0;
    public Object[] eu;
    public Object[] ev;
    public Object[] ew;
    public Object[] ex;
    public Object[] ey;
    public boolean ez = false;
    public int[] fa;
    public int fb = 0;
    public int fc = 0;
    public String fd = "";
    public boolean fe = false;
    public int[][] ff;
    public String fg = go.aj;
    public Object[] fh;
    public int[] fi;
    public int[] fj;
    public int fk = -824673647;
    public boolean fl = false;
    public Object[] fm;
    public Object[] fn;
    public al[] fo;
    public int fp = 0;
    public Object[] fq;
    public Object[] fr;
    public Object[] fs;
    public Object[] ft;
    public int fu = -316750653;
    public int fv = -356290543;
    public Object[] fw;
    public Object[] fx;
    public Object[] fy;
    public int[] fz;
    public int gc = 0;
    public int[] gh;
    public boolean gi = false;
    public int gl = -1120922161;
    public boolean gn = false;
    public int go = -806054709;
    public int gp = 0;
    public boolean gv = false;
    public int gw = 0;

    public static void aa(kh khVar, kh khVar2, kh khVar3, kh khVar4) {
        bz.ak = khVar;
        as = khVar2;
        aw.ag = khVar3;
        cf.ap = khVar4;
        dt.ae = new al[bz.ak.aw(397821861)][];
        oh.am = new boolean[bz.ak.aw(-1453303622)];
    }

    static int ab(int i, hw hwVar, boolean z, int i2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public static al ab(int i) {
        int i2 = i >> 16;
        int i3 = SupportMenu.USER_MASK & i;
        return ((dt.ae[i2] == null || dt.ae[i2][i3] == null) && !cs.al(i2, -2087446945)) ? null : dt.ae[i2][i3];
    }

    public static void af(kh khVar, kh khVar2, kh khVar3, kh khVar4) {
        bz.ak = khVar;
        as = khVar2;
        aw.ag = khVar3;
        cf.ap = khVar4;
        dt.ae = new al[bz.ak.aw(-861412679)][];
        oh.am = new boolean[bz.ak.aw(-227397373)];
    }

    public static void ah(kh khVar, kh khVar2, kh khVar3, kh khVar4) {
        bz.ak = khVar;
        as = khVar2;
        aw.ag = khVar3;
        cf.ap = khVar4;
        dt.ae = new al[bz.ak.aw(-184092690)][];
        oh.am = new boolean[bz.ak.aw(-1009349247)];
    }

    static void aj(lv lvVar, int i, int i2) {
        try {
            int i3;
            Object obj = lvVar.jm(1, -155234551) == 1 ? 1 : null;
            if (obj != null) {
                int[] iArr = hz.az;
                i3 = hz.au - 825632607;
                hz.au = i3;
                iArr[(i3 * -1082782879) - 1] = i;
            }
            int jm = lvVar.jm(2, 1851028927);
            hv hvVar = client.jz[i];
            int jm2;
            int jm3;
            if (jm == 0) {
                if (obj != null) {
                    hvVar.ba = false;
                } else if (client.jj * 869197827 != i) {
                    hz.as[i] = ((hvVar.dc[0] + (cq.fz * -1866366501)) >> 13) + (((((oz.ff * 2060098323) + hvVar.db[0]) >> 13) << 14) + ((hvVar.ab * -1300496125) << 28));
                    if (hvVar.cb * 773750935 != -1) {
                        hz.ag[i] = hvVar.cb * 773750935;
                    } else {
                        hz.ag[i] = hvVar.dl * 786971385;
                    }
                    hz.ap[i] = hvVar.cp * -298920551;
                    client.jz[i] = null;
                    if (lvVar.jm(1, 355636373) != 0) {
                        ay.ai(lvVar, i, (byte) -56);
                    }
                } else {
                    throw new RuntimeException();
                }
            } else if (1 == jm) {
                jm2 = lvVar.jm(3, -758386015);
                i3 = hvVar.db[0];
                jm = hvVar.dc[0];
                if (jm2 == 0) {
                    i3--;
                    jm--;
                } else if (1 == jm2) {
                    jm--;
                } else if (2 == jm2) {
                    i3++;
                    jm--;
                } else if (3 == jm2) {
                    i3--;
                } else if (4 == jm2) {
                    i3++;
                } else if (jm2 == 5) {
                    i3--;
                    jm++;
                } else if (6 == jm2) {
                    jm++;
                } else if (7 == jm2) {
                    i3++;
                    jm++;
                }
                if (i == client.jj * 869197827 && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                    hvVar.as(i3, jm, (short) 16256);
                    hvVar.ba = false;
                } else if (obj != null) {
                    hvVar.ba = true;
                    hvVar.bs = i3 * -1904527823;
                    hvVar.bm = jm * 2090764291;
                } else {
                    hvVar.ba = false;
                    hvVar.ak(i3, jm, hz.al[i], (short) -27544);
                }
            } else if (2 == jm) {
                jm2 = lvVar.jm(4, -244495147);
                i3 = hvVar.db[0];
                jm = hvVar.dc[0];
                if (jm2 == 0) {
                    i3 -= 2;
                    jm -= 2;
                } else if (jm2 == 1) {
                    i3--;
                    jm -= 2;
                } else if (2 == jm2) {
                    jm -= 2;
                } else if (jm2 == 3) {
                    i3++;
                    jm -= 2;
                } else if (jm2 == 4) {
                    i3 += 2;
                    jm -= 2;
                } else if (jm2 == 5) {
                    i3 -= 2;
                    jm--;
                } else if (6 == jm2) {
                    i3 += 2;
                    jm--;
                } else if (jm2 == 7) {
                    i3 -= 2;
                } else if (jm2 == 8) {
                    i3 += 2;
                } else if (jm2 == 9) {
                    i3 -= 2;
                    jm++;
                } else if (jm2 == 10) {
                    i3 += 2;
                    jm++;
                } else if (jm2 == 11) {
                    i3 -= 2;
                    jm += 2;
                } else if (12 == jm2) {
                    i3--;
                    jm += 2;
                } else if (jm2 == 13) {
                    jm += 2;
                } else if (jm2 == 14) {
                    i3++;
                    jm += 2;
                } else if (jm2 == 15) {
                    i3 += 2;
                    jm += 2;
                }
                if (i == client.jj * 869197827 && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                    hvVar.as(i3, jm, (short) 16256);
                    hvVar.ba = false;
                } else if (obj != null) {
                    hvVar.ba = true;
                    hvVar.bs = i3 * -1904527823;
                    hvVar.bm = jm * 2090764291;
                } else {
                    hvVar.ba = false;
                    hvVar.ak(i3, jm, hz.al[i], (short) 5117);
                }
            } else if (lvVar.jm(1, -1630118647) == 0) {
                jm3 = lvVar.jm(12, 1027576185);
                jm = (jm3 >> 5) & 31;
                i3 = jm > 15 ? jm - 32 : jm;
                jm = jm3 & 31;
                if (jm > 15) {
                    jm -= 32;
                }
                i3 += hvVar.db[0];
                jm += hvVar.dc[0];
                if (client.jj * 869197827 == i && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                    hvVar.as(i3, jm, (short) 16256);
                    hvVar.ba = false;
                } else if (obj != null) {
                    hvVar.ba = true;
                    hvVar.bs = i3 * -1904527823;
                    hvVar.bm = jm * 2090764291;
                } else {
                    hvVar.ba = false;
                    hvVar.ak(i3, jm, hz.al[i], (short) -28967);
                }
                hvVar.ab = ((byte) (((hvVar.ab * -1300496125) + (jm3 >> 10)) & 3)) * -762089045;
                if (i == client.jj * 869197827) {
                    am.jy = hvVar.ab * -23215301;
                }
            } else {
                jm = lvVar.jm(30, 814558161);
                i3 = ((((oz.ff * 2060098323) + hvVar.db[0]) + ((jm >> 14) & 16383)) & 16383) - (oz.ff * 2060098323);
                jm3 = (((jm & 16383) + (hvVar.dc[0] + (cq.fz * -1866366501))) & 16383) - (cq.fz * -1866366501);
                if (client.jj * 869197827 == i && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                    hvVar.as(i3, jm3, (short) 16256);
                    hvVar.ba = false;
                } else if (obj != null) {
                    hvVar.ba = true;
                    hvVar.bs = i3 * -1904527823;
                    hvVar.bm = 2090764291 * jm3;
                } else {
                    hvVar.ba = false;
                    hvVar.ak(i3, jm3, hz.al[i], (short) -19645);
                }
                hvVar.ab = ((byte) (((jm >> 28) + (hvVar.ab * -1300496125)) & 3)) * -762089045;
                if (client.jj * 869197827 == i) {
                    am.jy = hvVar.ab * -23215301;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static al an(int i) {
        int i2 = i >> 16;
        int i3 = 656362334 & i;
        return ((dt.ae[i2] == null || dt.ae[i2][i3] == null) && !cs.al(i2, -2086861099)) ? null : dt.ae[i2][i3];
    }

    public static void ao(kh khVar, kh khVar2, kh khVar3, kh khVar4) {
        bz.ak = khVar;
        as = khVar2;
        aw.ag = khVar3;
        cf.ap = khVar4;
        dt.ae = new al[bz.ak.aw(416952607)][];
        oh.am = new boolean[bz.ak.aw(-1065699330)];
    }

    static int ap(int i, hw hwVar, boolean z, byte b) {
        int i2;
        al aq;
        String str;
        int[] iArr;
        int[] iArr2;
        int i3;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            try {
                int[] iArr3 = hl.ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                aq = da.aq(iArr3[i2 * -757592335], -550158556);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("al.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        aq = z ? lj.az : hl.au;
        String[] strArr = hl.ak;
        i2 = hl.as + 1490481109;
        hl.as = i2;
        String str2 = strArr[i2 * -1883296125];
        if (str2.length() <= 0 || str2.charAt(str2.length() - 1) != 'Y') {
            str = str2;
            iArr = null;
        } else {
            iArr2 = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i3 = iArr2[i3 * -757592335];
            if (i3 > 0) {
                iArr2 = new int[i3];
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    int[] iArr4 = hl.ae;
                    int i5 = ds.am + 564452847;
                    ds.am = i5;
                    iArr2[i4] = iArr4[i5 * -757592335];
                    i3 = i4;
                }
            } else {
                iArr2 = null;
            }
            str = str2.substring(0, str2.length() - 1);
            iArr = iArr2;
        }
        Object[] objArr = new Object[(str.length() + 1)];
        i2 = objArr.length;
        while (true) {
            i2--;
            int i6;
            if (i2 < 1) {
                break;
            } else if (str.charAt(i2 - 1) == 's') {
                String[] strArr2 = hl.ak;
                i6 = hl.as + 1490481109;
                hl.as = i6;
                objArr[i2] = strArr2[i6 * -1883296125];
            } else {
                int[] iArr5 = hl.ae;
                i6 = ds.am + 564452847;
                ds.am = i6;
                objArr[i2] = new Integer(iArr5[i6 * -757592335]);
            }
        }
        iArr2 = hl.ae;
        i3 = ds.am + 564452847;
        ds.am = i3;
        i2 = iArr2[i3 * -757592335];
        if (i2 != -1) {
            objArr[0] = new Integer(i2);
        } else {
            objArr = null;
        }
        if (i == af.al) {
            aq.ea = objArr;
        } else if (i == 1401) {
            aq.en = objArr;
        } else if (i == 1402) {
            aq.ei = objArr;
        } else if (i == CommsResult.RESULT_JAGEX_ACCESS_ERROR) {
            aq.ey = objArr;
        } else if (CommsResult.RESULT_NOT_AUTHORIZED == i) {
            aq.ed = objArr;
        } else if (1405 == i) {
            aq.er = objArr;
        } else if (i == CommsResult.RESULT_ACCOUNT_CREATION_ERROR) {
            aq.ew = objArr;
        } else if (CommsResult.RESULT_PENDING_TRANSACTIONS_AVAILABLE == i) {
            aq.el = objArr;
            aq.eb = iArr;
        } else if (1408 == i) {
            aq.ex = objArr;
        } else if (1409 == i) {
            aq.ej = objArr;
        } else if (i == 1410) {
            aq.eu = objArr;
        } else if (1411 == i) {
            aq.ek = objArr;
        } else if (1412 == i) {
            aq.eg = objArr;
        } else if (1414 == i) {
            aq.ev = objArr;
            aq.ep = iArr;
        } else if (1415 == i) {
            aq.em = objArr;
            aq.ef = iArr;
        } else if (1416 == i) {
            aq.ee = objArr;
        } else if (1417 == i) {
            aq.es = objArr;
        } else if (1418 == i) {
            aq.fq = objArr;
        } else if (1419 == i) {
            aq.fx = objArr;
        } else if (i == 1420) {
            aq.ft = objArr;
        } else if (1421 == i) {
            aq.fw = objArr;
        } else if (1422 == i) {
            aq.fn = objArr;
        } else if (i == 1423) {
            aq.fm = objArr;
        } else if (1424 == i) {
            aq.fs = objArr;
        } else if (1425 == i) {
            aq.fy = objArr;
        } else if (1426 == i) {
            aq.fr = objArr;
        } else if (1427 != i) {
            return 2;
        } else {
            aq.fh = objArr;
        }
        aq.eh = true;
        return 1;
    }

    public static al at(int i, int i2) {
        al aq = da.aq(i, -550158556);
        return i2 == -1 ? aq : (aq == null || aq.fo == null || i2 >= aq.fo.length) ? null : aq.fo[i2];
    }

    public static al av(int i) {
        int i2 = i >> 16;
        int i3 = SupportMenu.USER_MASK & i;
        return ((dt.ae[i2] == null || dt.ae[i2][i3] == null) && !cs.al(i2, -2062673635)) ? null : dt.ae[i2][i3];
    }

    public static void ay(kh khVar, kh khVar2, kh khVar3, kh khVar4) {
        bz.ak = khVar;
        as = khVar2;
        aw.ag = khVar3;
        cf.ap = khVar4;
        dt.ae = new al[bz.ak.aw(296421026)][];
        oh.am = new boolean[bz.ak.aw(647382796)];
    }

    public static void ba(int i) {
        if (-1 != i && oh.am[i]) {
            bz.ak.aa(i, 1146827831);
            if (dt.ae[i] != null) {
                boolean z = true;
                for (int i2 = 0; i2 < dt.ae[i].length; i2++) {
                    if (dt.ae[i][i2] != null) {
                        if (dt.ae[i][i2].af * 1845699613 != 2) {
                            dt.ae[i][i2] = null;
                        } else {
                            z = false;
                        }
                    }
                }
                if (z) {
                    dt.ae[i] = null;
                }
                oh.am[i] = false;
            }
        }
    }

    public static void bk(int i) {
        if (-1 != i && oh.am[i]) {
            bz.ak.aa(i, 1311745556);
            if (dt.ae[i] != null) {
                boolean z = true;
                for (int i2 = 0; i2 < dt.ae[i].length; i2++) {
                    if (dt.ae[i][i2] != null) {
                        if (dt.ae[i][i2].af * 1845699613 != 2) {
                            dt.ae[i][i2] = null;
                        } else {
                            z = false;
                        }
                    }
                }
                if (z) {
                    dt.ae[i] = null;
                }
                oh.am[i] = false;
            }
        }
    }

    public static void bp(Collection collection) {
        collection.add(au);
        collection.add(az);
        collection.add(ax);
        collection.add(aw);
    }

    public static void by(Collection collection) {
        collection.add(au);
        collection.add(az);
        collection.add(ax);
        collection.add(aw);
    }

    static void fm(int i, int i2, int i3) {
        try {
            ns aq = ib.aq(no.co, client.eb.aj, 1258051541);
            aq.ar.cr(i, (byte) 1);
            aq.ar.cq(i2, -838706881);
            client.eb.ar(aq, -1421843844);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.fm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ac(int i, String str, int i2) {
        try {
            if (this.dz == null || this.dz.length <= i) {
                String[] strArr = new String[(i + 1)];
                if (this.dz != null) {
                    for (int i3 = 0; i3 < this.dz.length; i3++) {
                        strArr[i3] = this.dz[i3];
                    }
                }
                this.dz = strArr;
            }
            this.dz[i] = str;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(lj ljVar, short s) {
        boolean z = true;
        try {
            ljVar.af(1804771424);
            this.aa = true;
            this.af = ljVar.af(1804771424) * 956087861;
            this.an = ljVar.an(-1464407032) * 533195257;
            this.ba = ljVar.ab(1794396023) * 1685885569;
            this.bs = ljVar.ab(-54771821) * -1450929481;
            this.bm = ljVar.an(-1464407032) * -846283905;
            if (this.af * 1845699613 == 9) {
                this.bq = ljVar.ab(12174184) * -1937288673;
            } else {
                this.bq = ljVar.an(-1464407032) * -1937288673;
            }
            this.at = ljVar.ay(-811213732) * -1629038693;
            this.bk = ljVar.ay(232212180) * -458681677;
            this.ab = ljVar.ay(836638204) * 1932562981;
            this.av = ljVar.ay(92408784) * -122098513;
            this.bc = ljVar.an(-1464407032) * -712641979;
            if (SupportMenu.USER_MASK == this.bc * -38514547) {
                this.bc = 712641979;
            } else {
                this.bc = (((this.ao * -1227024251) & SupportMenu.CATEGORY_MASK) + (this.bc * -38514547)) * -712641979;
            }
            this.bv = ljVar.af(1804771424) == 1;
            if (this.af * 1845699613 == 0) {
                this.bu = ljVar.an(-1464407032) * 1956842863;
                this.bw = ljVar.an(-1464407032) * 1451678031;
                this.gi = ljVar.af(1804771424) == 1;
            }
            if (this.af * 1845699613 == 5) {
                this.cj = ljVar.at((byte) -88) * -1727679139;
                this.cq = ljVar.an(-1464407032) * 1407698477;
                this.cn = ljVar.af(1804771424) == 1;
                this.bz = ljVar.af(1804771424) * -1784857337;
                this.cw = ljVar.af(1804771424) * 1545275515;
                this.cp = ljVar.at((byte) -94) * 1407371587;
                this.ci = ljVar.af(1804771424) == 1;
                this.cb = ljVar.af(1804771424) == 1;
            }
            if (this.af * 1845699613 == 6) {
                this.ce = -1360803229;
                this.cy = ljVar.an(-1464407032) * -927961631;
                if (this.cy * 484480545 == SupportMenu.USER_MASK) {
                    this.cy = 927961631;
                }
                this.cx = ljVar.ab(-1989952429) * 116822575;
                this.ct = ljVar.ab(-1765804537) * 91905667;
                this.ck = ljVar.an(-1464407032) * -1944500353;
                this.co = ljVar.an(-1464407032) * -1450063701;
                this.cu = ljVar.an(-1464407032) * -1788635289;
                this.cl = ljVar.an(-1464407032) * 137430647;
                this.cr = ljVar.an(-1464407032) * 1131620129;
                if (SupportMenu.USER_MASK == this.cr * 102964449) {
                    this.cr = -1131620129;
                }
                this.cf = ljVar.af(1804771424) == 1;
                ljVar.an(-1464407032);
                if (this.at * 538883731 != 0) {
                    this.cz = ljVar.an(-1464407032) * -1923061613;
                }
                if (this.bk * -606212997 != 0) {
                    ljVar.an(-1464407032);
                }
            }
            if (4 == this.af * 1845699613) {
                this.dd = ljVar.an(-1464407032) * -996713033;
                if (SupportMenu.USER_MASK == this.dd * 906432519) {
                    this.dd = 996713033;
                }
                this.dm = ljVar.bm(1489770512);
                this.dv = ljVar.af(1804771424) * 970340041;
                this.di = ljVar.af(1804771424) * 332285219;
                this.dl = ljVar.af(1804771424) * 452292553;
                this.dr = ljVar.af(1804771424) == 1;
                this.br = ljVar.at((byte) -81) * -1732815777;
            }
            if (3 == this.af * 1845699613) {
                this.br = ljVar.at((byte) -80) * -1732815777;
                this.bt = ljVar.af(1804771424) == 1;
                this.bz = ljVar.af(1804771424) * -1784857337;
            }
            if (this.af * 1845699613 == 9) {
                this.bp = ljVar.af(1804771424) * -1866717737;
                this.br = ljVar.at((byte) -16) * -1732815777;
                this.cv = ljVar.af(1804771424) == 1;
            }
            this.dn = ljVar.av((byte) -2) * -1502416797;
            this.dg = ljVar.bm(1615816570);
            int af = ljVar.af(1804771424);
            if (af > 0) {
                this.dz = new String[af];
                for (int i = 0; i < af; i++) {
                    this.dz[i] = ljVar.bm(1611119643);
                }
            }
            this.et = ljVar.af(1804771424) * -1776379629;
            this.eq = ljVar.af(1804771424) * 50248067;
            if (ljVar.af(1804771424) != 1) {
                z = false;
            }
            this.ez = z;
            this.eo = ljVar.bm(1435575661);
            this.ec = am(ljVar, (byte) 12);
            this.ey = am(ljVar, (byte) 12);
            this.ed = am(ljVar, (byte) 12);
            this.ew = am(ljVar, (byte) 12);
            this.ee = am(ljVar, (byte) 12);
            this.el = am(ljVar, (byte) 12);
            this.ev = am(ljVar, (byte) 12);
            this.em = am(ljVar, (byte) 12);
            this.ex = am(ljVar, (byte) 12);
            this.ej = am(ljVar, (byte) 12);
            this.eg = am(ljVar, (byte) 12);
            this.ea = am(ljVar, (byte) 12);
            this.ek = am(ljVar, (byte) 12);
            this.ei = am(ljVar, (byte) 12);
            this.en = am(ljVar, (byte) 12);
            this.er = am(ljVar, (byte) 12);
            this.eu = am(ljVar, (byte) 12);
            this.es = am(ljVar, (byte) 12);
            this.eb = ak(ljVar, (byte) 101);
            this.ep = ak(ljVar, (byte) 17);
            this.ef = ak(ljVar, (byte) 50);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ee ag(boolean z, int i) {
        try {
            ac = false;
            int i2 = z ? this.cm * -1608031489 : this.cj * 882525941;
            if (i2 == -1) {
                return null;
            }
            long j = (long) i2;
            long j2 = (long) (this.cw * 320050867);
            long j3 = 1;
            long j4 = this.ci ? 1 : 0;
            if (!this.cb) {
                j3 = 0;
            }
            j4 = (((long) (this.cp * -416281749)) << 40) + ((j3 << 39) + ((j4 << 38) + (j + (j2 << 36))));
            ee eeVar = (ee) au.ad(j4);
            if (eeVar != null) {
                return eeVar;
            }
            eeVar = jc.ai(aw.ag, i2, 0, (byte) 1);
            if (eeVar == null) {
                ac = true;
                return null;
            }
            if (this.ci) {
                eeVar.ai();
            }
            if (this.cb) {
                eeVar.aj();
            }
            if (this.cw * 320050867 > 0) {
                eeVar.al(this.cw * 320050867);
            }
            if (this.cw * 320050867 >= 1) {
                eeVar.ae(1);
            }
            if (this.cw * 320050867 >= 2) {
                eeVar.ae(ViewCompat.MEASURED_SIZE_MASK);
            }
            if (this.cp * -416281749 != 0) {
                eeVar.am(this.cp * -416281749);
            }
            au.ar(eeVar, j4);
            return eeVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(lj ljVar, byte b) {
        try {
            int i;
            String bm;
            this.aa = false;
            this.af = ljVar.af(1804771424) * 956087861;
            this.ay = ljVar.af(1804771424) * -333552487;
            this.an = ljVar.an(-1464407032) * 533195257;
            this.ba = ljVar.ab(2096208706) * 1685885569;
            this.bs = ljVar.ab(-1077691863) * -1450929481;
            this.bm = ljVar.an(-1464407032) * -846283905;
            this.bq = ljVar.an(-1464407032) * -1937288673;
            this.bz = ljVar.af(1804771424) * -1784857337;
            this.bc = ljVar.an(-1464407032) * -712641979;
            if (SupportMenu.USER_MASK == this.bc * -38514547) {
                this.bc = 712641979;
            } else {
                this.bc = (((this.ao * -1227024251) & SupportMenu.CATEGORY_MASK) + (this.bc * -38514547)) * -712641979;
            }
            this.fv = ljVar.an(-1464407032) * 356290543;
            if (this.fv * -1632338161 == SupportMenu.USER_MASK) {
                this.fv = -356290543;
            }
            int af = ljVar.af(1804771424);
            if (af > 0) {
                this.fz = new int[af];
                this.fa = new int[af];
                for (i = 0; i < af; i++) {
                    this.fz[i] = ljVar.af(1804771424);
                    this.fa[i] = ljVar.an(-1464407032);
                }
            }
            int af2 = ljVar.af(1804771424);
            if (af2 > 0) {
                this.ff = new int[af2][];
                for (af = 0; af < af2; af++) {
                    int an = ljVar.an(-1464407032);
                    this.ff[af] = new int[an];
                    for (i = 0; i < an; i++) {
                        this.ff[af][i] = ljVar.an(-1464407032);
                        if (this.ff[af][i] == 65535) {
                            this.ff[af][i] = -1;
                        }
                    }
                }
            }
            if (this.af * 1845699613 == 0) {
                this.bw = ljVar.an(-1464407032) * 1451678031;
                this.bv = ljVar.af(1804771424) == 1;
            }
            if (1 == this.af * 1845699613) {
                ljVar.an(-1464407032);
                ljVar.af(1804771424);
            }
            if (2 == this.af * 1845699613) {
                this.fj = new int[((this.bq * 1542957535) * (this.bm * -499317633))];
                this.fi = new int[((this.bm * -499317633) * (this.bq * 1542957535))];
                if (ljVar.af(1804771424) == 1) {
                    this.dn = ((this.dn * 1715409227) | 268435456) * -1502416797;
                }
                if (ljVar.af(1804771424) == 1) {
                    this.dn = ((this.dn * 1715409227) | 1073741824) * -1502416797;
                }
                if (ljVar.af(1804771424) == 1) {
                    this.dn = ((this.dn * 1715409227) | Integer.MIN_VALUE) * -1502416797;
                }
                if (ljVar.af(1804771424) == 1) {
                    this.dn = ((this.dn * 1715409227) | ol.ae) * -1502416797;
                }
                this.df = ljVar.af(1804771424) * 1006956111;
                this.da = ljVar.af(1804771424) * -1748835231;
                this.db = new int[20];
                this.dc = new int[20];
                this.du = new int[20];
                for (i = 0; i < 20; i++) {
                    if (ljVar.af(1804771424) == 1) {
                        this.db[i] = ljVar.ab(-1473667951);
                        this.dc[i] = ljVar.ab(1854326727);
                        this.du[i] = ljVar.at((byte) 2);
                    } else {
                        this.du[i] = -1;
                    }
                }
                this.dp = new String[5];
                for (i = 0; i < 5; i++) {
                    bm = ljVar.bm(1500848222);
                    if (bm.length() > 0) {
                        this.dp[i] = bm;
                        this.dn = ((this.dn * 1715409227) | (1 << (i + 23))) * -1502416797;
                    }
                }
            }
            if (3 == this.af * 1845699613) {
                this.bt = ljVar.af(1804771424) == 1;
            }
            if (4 == this.af * 1845699613 || this.af * 1845699613 == 1) {
                this.di = ljVar.af(1804771424) * 332285219;
                this.dl = ljVar.af(1804771424) * 452292553;
                this.dv = ljVar.af(1804771424) * 970340041;
                this.dd = ljVar.an(-1464407032) * -996713033;
                if (SupportMenu.USER_MASK == this.dd * 906432519) {
                    this.dd = 996713033;
                }
                this.dr = ljVar.af(1804771424) == 1;
            }
            if (this.af * 1845699613 == 4) {
                this.dm = ljVar.bm(1523402209);
                this.dt = ljVar.bm(2104837699);
            }
            if (this.af * 1845699613 == 1 || this.af * 1845699613 == 3 || 4 == this.af * 1845699613) {
                this.br = ljVar.at((byte) -68) * -1732815777;
            }
            if (3 == this.af * 1845699613 || this.af * 1845699613 == 4) {
                this.be = ljVar.at((byte) -52) * 1789727225;
                this.bj = ljVar.at((byte) -27) * 327925085;
                this.bh = ljVar.at((byte) -39) * -1476243825;
            }
            if (5 == this.af * 1845699613) {
                this.cj = ljVar.at((byte) -12) * -1727679139;
                this.cm = ljVar.at((byte) -56) * -728785665;
            }
            if (this.af * 1845699613 == 6) {
                this.ce = -1360803229;
                this.cy = ljVar.an(-1464407032) * -927961631;
                if (SupportMenu.USER_MASK == this.cy * 484480545) {
                    this.cy = 927961631;
                }
                this.cc = -1821975169;
                this.cs = ljVar.an(-1464407032) * 1158082685;
                if (this.cs * 1416497365 == SupportMenu.USER_MASK) {
                    this.cs = -1158082685;
                }
                this.cr = ljVar.an(-1464407032) * 1131620129;
                if (this.cr * 102964449 == SupportMenu.USER_MASK) {
                    this.cr = -1131620129;
                }
                this.ca = ljVar.an(-1464407032) * 2119627447;
                if (this.ca * -1965389049 == SupportMenu.USER_MASK) {
                    this.ca = -2119627447;
                }
                this.cl = ljVar.an(-1464407032) * 137430647;
                this.ck = ljVar.an(-1464407032) * -1944500353;
                this.co = ljVar.an(-1464407032) * -1450063701;
            }
            if (7 == this.af * 1845699613) {
                this.fj = new int[((this.bm * -499317633) * (this.bq * 1542957535))];
                this.fi = new int[((this.bm * -499317633) * (this.bq * 1542957535))];
                this.di = ljVar.af(1804771424) * 332285219;
                this.dd = ljVar.an(-1464407032) * -996713033;
                if (this.dd * 906432519 == SupportMenu.USER_MASK) {
                    this.dd = 996713033;
                }
                this.dr = ljVar.af(1804771424) == 1;
                this.br = ljVar.at((byte) -116) * -1732815777;
                this.df = ljVar.ab(1292092792) * 1006956111;
                this.da = ljVar.ab(955871762) * -1748835231;
                if (1 == ljVar.af(1804771424)) {
                    this.dn = ((this.dn * 1715409227) | 1073741824) * -1502416797;
                }
                this.dp = new String[5];
                for (i = 0; i < 5; i++) {
                    bm = ljVar.bm(1128907861);
                    if (bm.length() > 0) {
                        this.dp[i] = bm;
                        this.dn = ((this.dn * 1715409227) | (1 << (i + 23))) * -1502416797;
                    }
                }
            }
            if (this.af * 1845699613 == 8) {
                this.dm = ljVar.bm(1403528606);
            }
            if (this.ay * 1113829289 == 2 || 2 == this.af * 1845699613) {
                this.eo = ljVar.bm(1300445248);
                this.fd = ljVar.bm(1277687402);
                this.dn = (((ljVar.an(-1464407032) & 63) << 11) | (this.dn * 1715409227)) * -1502416797;
            }
            if (1 == this.ay * 1113829289 || 4 == this.ay * 1113829289 || this.ay * 1113829289 == 5 || this.ay * 1113829289 == 6) {
                this.fg = ljVar.bm(1097622294);
                if (this.fg.length() == 0) {
                    if (this.ay * 1113829289 == 1) {
                        this.fg = go.aj;
                    }
                    if (4 == this.ay * 1113829289) {
                        this.fg = go.ai;
                    }
                    if (this.ay * 1113829289 == 5) {
                        this.fg = go.ai;
                    }
                    if (6 == this.ay * 1113829289) {
                        this.fg = go.ae;
                    }
                }
            }
            if (this.ay * 1113829289 == 1 || 4 == this.ay * 1113829289 || 5 == this.ay * 1113829289) {
                this.dn = ((this.dn * 1715409227) | 4194304) * -1502416797;
            }
            if (this.ay * 1113829289 == 6) {
                this.dn = ((this.dn * 1715409227) | 1) * -1502416797;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int[] ak(lj ljVar, byte b) {
        try {
            int af = ljVar.af(1804771424);
            if (af == 0) {
                return null;
            }
            int[] iArr = new int[af];
            for (int i = 0; i < af; i++) {
                iArr[i] = ljVar.at((byte) -41);
            }
            return iArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] am(lj ljVar, byte b) {
        try {
            int af = ljVar.af(1804771424);
            if (af == 0) {
                return null;
            }
            Object[] objArr = new Object[af];
            for (int i = 0; i < af; i++) {
                int af2 = ljVar.af(1804771424);
                if (af2 == 0) {
                    objArr[i] = new Integer(ljVar.at((byte) -48));
                } else if (af2 == 1) {
                    objArr[i] = ljVar.bm(1039522118);
                }
            }
            this.eh = true;
            return objArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public oi ap(int i) {
        try {
            ac = false;
            if (this.dd * 906432519 == -1) {
                return null;
            }
            oi oiVar = (oi) ax.ad((long) (this.dd * 906432519));
            if (oiVar != null) {
                return oiVar;
            }
            oiVar = hy.ae(aw.ag, cf.ap, this.dd * 906432519, 0, (short) -3616);
            if (oiVar != null) {
                ax.ar(oiVar, (long) (this.dd * 906432519));
                return oiVar;
            }
            ac = true;
            return oiVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(int i, int i2, int i3) {
        try {
            int i4 = this.fj[i2];
            this.fj[i2] = this.fj[i];
            this.fj[i] = i4;
            i4 = this.fi[i2];
            this.fi[i2] = this.fi[i];
            this.fi[i] = i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ee au(int i, int i2) {
        ee eeVar = null;
        try {
            ac = false;
            if (i >= 0 && i < this.du.length) {
                int i3 = this.du[i];
                if (i3 != -1) {
                    long j = (long) i3;
                    eeVar = (ee) au.ad(j);
                    if (eeVar == null) {
                        eeVar = jc.ai(aw.ag, i3, 0, (byte) 42);
                        if (eeVar != null) {
                            au.ar(eeVar, j);
                        } else {
                            ac = true;
                        }
                    }
                }
            }
            return eeVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public as ax(boolean z, int i) {
        try {
            if (this.cm * -1608031489 == -1) {
                z = false;
            }
            int i2 = z ? this.cm * -1608031489 : 882525941 * this.cj;
            if (-1 == i2) {
                return null;
            }
            long j = (long) (this.cp * -416281749);
            long j2 = 1;
            long j3 = this.cb ? 1 : 0;
            if (!this.ci) {
                j2 = 0;
            }
            long j4 = (j << 40) + (((j2 << 38) + ((((long) (this.cw * 320050867)) << 36) + ((long) i2))) + (j3 << 39));
            as asVar = (as) aw.ad(j4);
            if (asVar != null) {
                return asVar;
            }
            ee ag = ag(z, -1883296125);
            if (ag == null) {
                return null;
            }
            ee aq = ag.aq();
            int[] iArr = new int[aq.ar];
            int[] iArr2 = new int[aq.ar];
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < aq.ar) {
                    int i5;
                    int i6;
                    i3 = aq.aq;
                    for (i5 = 0; i5 < aq.aq; i5++) {
                        if (aq.ad[(aq.aq * i4) + i5] == 0) {
                            i6 = i5;
                            break;
                        }
                    }
                    i6 = 0;
                    for (i5 = aq.aq - 1; i5 >= i6; i5--) {
                        if (aq.ad[(aq.aq * i4) + i5] == 0) {
                            i3 = i5 + 1;
                            break;
                        }
                    }
                    iArr[i4] = i6;
                    iArr2[i4] = i3 - i6;
                    i3 = i4 + 1;
                } else {
                    asVar = new as(aq.aq, aq.ar, iArr2, iArr, i2);
                    aw.ar(asVar, j4);
                    return asVar;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public bp az(dp dpVar, int i, boolean z, ae aeVar, int i2) {
        try {
            int i3;
            int i4;
            ac = false;
            if (z) {
                i3 = this.cs * 1416497365;
                i4 = 1116922495 * this.cc;
            } else {
                i3 = this.cy * 484480545;
                i4 = 734594891 * this.ce;
            }
            if (i4 == 0) {
                return null;
            }
            if (i4 == 1 && i3 == -1) {
                return null;
            }
            long j = (long) ((i4 << 16) + i3);
            bp bpVar = (bp) az.ad(j);
            if (bpVar == null) {
                bo ad;
                if (1 == i4) {
                    ad = bo.ad(as, i3, 0);
                    if (ad == null) {
                        ac = true;
                        return null;
                    }
                    bpVar = ad.af(64, ox.aj, -50, -10, -50);
                }
                if (i4 == 2) {
                    ad = ln.aq(i3, -1634974144).ae((byte) 67);
                    if (ad == null) {
                        ac = true;
                        return null;
                    }
                    bpVar = ad.af(64, ox.aj, -50, -10, -50);
                }
                if (3 == i4) {
                    if (aeVar == null) {
                        return null;
                    }
                    ad = aeVar.am((byte) -10);
                    if (ad == null) {
                        ac = true;
                        return null;
                    }
                    bpVar = ad.af(64, ox.aj, -50, -10, -50);
                }
                if (4 == i4) {
                    dh aq = gl.aq(i3, 2066516368);
                    ad = aq.ak(10, -372662975);
                    if (ad == null) {
                        ac = true;
                        return null;
                    }
                    bpVar = ad.af((aq.cq * 709263737) + 64, (aq.cn * -1537678021) + ox.aj, -50, -10, -50);
                }
                az.ar(bpVar, j);
            }
            return dpVar != null ? dpVar.as(bpVar, i, 1482732320) : bpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("al.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int[] bb(lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af == 0) {
            return null;
        }
        int[] iArr = new int[af];
        for (int i = 0; i < af; i++) {
            iArr[i] = ljVar.at((byte) -36);
        }
        return iArr;
    }

    public void bc(int i, int i2) {
        int i3 = this.fj[i2];
        this.fj[i2] = this.fj[i];
        this.fj[i] = i3;
        i3 = this.fi[i2];
        this.fi[i2] = this.fi[i];
        this.fi[i] = i3;
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] bd(lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af == 0) {
            return null;
        }
        Object[] objArr = new Object[af];
        for (int i = 0; i < af; i++) {
            int af2 = ljVar.af(1804771424);
            if (af2 == 0) {
                objArr[i] = new Integer(ljVar.at((byte) -67));
            } else if (af2 == 1) {
                objArr[i] = ljVar.bm(1207274512);
            }
        }
        this.eh = true;
        return objArr;
    }

    public ee be(int i) {
        ee eeVar = null;
        ac = false;
        if (i >= 0 && i < this.du.length) {
            int i2 = this.du[i];
            if (i2 != -1) {
                long j = (long) i2;
                eeVar = (ee) au.ad(j);
                if (eeVar == null) {
                    eeVar = jc.ai(aw.ag, i2, 0, (byte) 14);
                    if (eeVar != null) {
                        au.ar(eeVar, j);
                    } else {
                        ac = true;
                    }
                }
            }
        }
        return eeVar;
    }

    /* Access modifiers changed, original: 0000 */
    public int[] bf(lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af == 0) {
            return null;
        }
        int[] iArr = new int[af];
        for (int i = 0; i < af; i++) {
            iArr[i] = ljVar.at((byte) -20);
        }
        return iArr;
    }

    public void bg(int i, int i2) {
        int i3 = this.fj[i2];
        this.fj[i2] = this.fj[i];
        this.fj[i] = i3;
        i3 = this.fi[i2];
        this.fi[i2] = this.fi[i];
        this.fi[i] = i3;
    }

    public bp bh(dp dpVar, int i, boolean z, ae aeVar) {
        int i2;
        int i3;
        ac = false;
        if (z) {
            i2 = this.cs * 1416497365;
            i3 = 607792801 * this.cc;
        } else {
            i2 = this.cy * 1650873649;
            i3 = 734594891 * this.ce;
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1 && i2 == -1) {
            return null;
        }
        long j = (long) ((i3 << 16) + i2);
        bp bpVar = (bp) az.ad(j);
        if (bpVar == null) {
            bo ad;
            if (1 == i3) {
                ad = bo.ad(as, i2, 0);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(1047245639, ox.aj, -1058690829, -1891907858, 1850460273);
            }
            if (i3 == 2) {
                ad = ln.aq(i2, 556458513).ae((byte) 118);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(-1974020622, ox.aj, 1821805254, -89831245, -50);
            }
            if (3 == i3) {
                if (aeVar == null) {
                    return null;
                }
                ad = aeVar.am((byte) -43);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(-694986344, 863865572, -50, -1498004252, -50);
            }
            if (4 == i3) {
                dh aq = gl.aq(i2, -378845782);
                ad = aq.ak(10, -1402388770);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af((aq.cq * 1526558890) - 1357007228, (aq.cn * 1295357516) + 401042462, -451898291, -10, -50);
            }
            az.ar(bpVar, j);
        }
        return dpVar != null ? dpVar.as(bpVar, i, -1905277600) : bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public int[] bi(lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af == 0) {
            return null;
        }
        int[] iArr = new int[af];
        for (int i = 0; i < af; i++) {
            iArr[i] = ljVar.at((byte) -122);
        }
        return iArr;
    }

    public ee bj(int i) {
        ee eeVar = null;
        ac = false;
        if (i >= 0 && i < this.du.length) {
            int i2 = this.du[i];
            if (i2 != -1) {
                long j = (long) i2;
                eeVar = (ee) au.ad(j);
                if (eeVar == null) {
                    eeVar = jc.ai(aw.ag, i2, 0, (byte) -32);
                    if (eeVar != null) {
                        au.ar(eeVar, j);
                    } else {
                        ac = true;
                    }
                }
            }
        }
        return eeVar;
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] bl(lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af == 0) {
            return null;
        }
        Object[] objArr = new Object[af];
        for (int i = 0; i < af; i++) {
            int af2 = ljVar.af(1804771424);
            if (af2 == 0) {
                objArr[i] = new Integer(ljVar.at((byte) -25));
            } else if (af2 == 1) {
                objArr[i] = ljVar.bm(1759840513);
            }
        }
        this.eh = true;
        return objArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void bm(lj ljVar) {
        boolean z = true;
        ljVar.af(1804771424);
        this.aa = true;
        this.af = ljVar.af(1804771424) * -642674885;
        this.an = ljVar.an(-1464407032) * 533195257;
        this.ba = ljVar.ab(-1052558333) * 1685885569;
        this.bs = ljVar.ab(1428709565) * -1450929481;
        this.bm = ljVar.an(-1464407032) * -846283905;
        if (this.af * 1845699613 == 9) {
            this.bq = ljVar.ab(1817798349) * -147659857;
        } else {
            this.bq = ljVar.an(-1464407032) * 508900521;
        }
        this.at = ljVar.ay(762139202) * 850639867;
        this.bk = ljVar.ay(1514836435) * -1326585665;
        this.ab = ljVar.ay(-294419555) * 1932562981;
        this.av = ljVar.ay(-457913412) * -122098513;
        this.bc = ljVar.an(-1464407032) * -712641979;
        if (2065733272 == this.bc * -545118908) {
            this.bc = 712641979;
        } else {
            this.bc = (((this.ao * 1273713762) & SupportMenu.CATEGORY_MASK) + (this.bc * -38514547)) * 2100344074;
        }
        this.bv = ljVar.af(1804771424) == 1;
        if (this.af * -1168274959 == 0) {
            this.bu = ljVar.an(-1464407032) * 1491978591;
            this.bw = ljVar.an(-1464407032) * 1451678031;
            this.gi = ljVar.af(1804771424) == 1;
        }
        if (this.af * 1238429041 == 5) {
            this.cj = ljVar.at((byte) -32) * 779188727;
            this.cq = ljVar.an(-1464407032) * 1240156691;
            this.cn = ljVar.af(1804771424) == 1;
            this.bz = ljVar.af(1804771424) * -1784857337;
            this.cw = ljVar.af(1804771424) * 1545275515;
            this.cp = ljVar.at((byte) -3) * 1407371587;
            this.ci = ljVar.af(1804771424) == 1;
            this.cb = ljVar.af(1804771424) == 1;
        }
        if (this.af * 1845699613 == 6) {
            this.ce = -1360803229;
            this.cy = ljVar.an(-1464407032) * -927961631;
            if (this.cy * -1429113810 == SupportMenu.USER_MASK) {
                this.cy = -1801939016;
            }
            this.cx = ljVar.ab(-1919138474) * 116822575;
            this.ct = ljVar.ab(1707903072) * -1630939947;
            this.ck = ljVar.an(-1464407032) * -1391753310;
            this.co = ljVar.an(-1464407032) * 737959016;
            this.cu = ljVar.an(-1464407032) * -1788635289;
            this.cl = ljVar.an(-1464407032) * 137430647;
            this.cr = ljVar.an(-1464407032) * 1131620129;
            if (-223262763 == this.cr * -977741478) {
                this.cr = -1131620129;
            }
            this.cf = ljVar.af(1804771424) == 1;
            ljVar.an(-1464407032);
            if (this.at * 538883731 != 0) {
                this.cz = ljVar.an(-1464407032) * 361900913;
            }
            if (this.bk * -1464408124 != 0) {
                ljVar.an(-1464407032);
            }
        }
        if (4 == this.af * 1845699613) {
            this.dd = ljVar.an(-1464407032) * -996713033;
            if (SupportMenu.USER_MASK == this.dd * -525000781) {
                this.dd = 1155894115;
            }
            this.dm = ljVar.bm(1258575269);
            this.dv = ljVar.af(1804771424) * -821798446;
            this.di = ljVar.af(1804771424) * 332285219;
            this.dl = ljVar.af(1804771424) * 1565728112;
            this.dr = ljVar.af(1804771424) == 1;
            this.br = ljVar.at((byte) -120) * -1732815777;
        }
        if (3 == this.af * -1411020361) {
            this.br = ljVar.at((byte) -123) * -1732815777;
            this.bt = ljVar.af(1804771424) == 1;
            this.bz = ljVar.af(1804771424) * 1870242376;
        }
        if (this.af * 434121624 == 9) {
            this.bp = ljVar.af(1804771424) * -1866717737;
            this.br = ljVar.at((byte) -25) * -1732815777;
            this.cv = ljVar.af(1804771424) == 1;
        }
        this.dn = ljVar.av((byte) -108) * -1610942384;
        this.dg = ljVar.bm(1781176540);
        int af = ljVar.af(1804771424);
        if (af > 0) {
            this.dz = new String[af];
            for (int i = 0; i < af; i++) {
                this.dz[i] = ljVar.bm(1304200260);
            }
        }
        this.et = ljVar.af(1804771424) * -1776379629;
        this.eq = ljVar.af(1804771424) * 50248067;
        if (ljVar.af(1804771424) != 1) {
            z = false;
        }
        this.ez = z;
        this.eo = ljVar.bm(1053837472);
        this.ec = am(ljVar, (byte) 12);
        this.ey = am(ljVar, (byte) 12);
        this.ed = am(ljVar, (byte) 12);
        this.ew = am(ljVar, (byte) 12);
        this.ee = am(ljVar, (byte) 12);
        this.el = am(ljVar, (byte) 12);
        this.ev = am(ljVar, (byte) 12);
        this.em = am(ljVar, (byte) 12);
        this.ex = am(ljVar, (byte) 12);
        this.ej = am(ljVar, (byte) 12);
        this.eg = am(ljVar, (byte) 12);
        this.ea = am(ljVar, (byte) 12);
        this.ek = am(ljVar, (byte) 12);
        this.ei = am(ljVar, (byte) 12);
        this.en = am(ljVar, (byte) 12);
        this.er = am(ljVar, (byte) 12);
        this.eu = am(ljVar, (byte) 12);
        this.es = am(ljVar, (byte) 12);
        this.eb = ak(ljVar, (byte) 8);
        this.ep = ak(ljVar, (byte) 81);
        this.ef = ak(ljVar, (byte) 5);
    }

    public bp bn(dp dpVar, int i, boolean z, ae aeVar) {
        int i2;
        int i3;
        ac = false;
        if (z) {
            i2 = this.cs * 1416497365;
            i3 = 1116922495 * this.cc;
        } else {
            i2 = this.cy * 484480545;
            i3 = 734594891 * this.ce;
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1 && i2 == -1) {
            return null;
        }
        long j = (long) ((i3 << 16) + i2);
        bp bpVar = (bp) az.ad(j);
        if (bpVar == null) {
            bo ad;
            if (1 == i3) {
                ad = bo.ad(as, i2, 0);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(64, ox.aj, -50, -10, -50);
            }
            if (i3 == 2) {
                ad = ln.aq(i2, -81003877).ae((byte) 90);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(64, ox.aj, -50, -10, -50);
            }
            if (3 == i3) {
                if (aeVar == null) {
                    return null;
                }
                ad = aeVar.am((byte) -39);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(64, ox.aj, -50, -10, -50);
            }
            if (4 == i3) {
                dh aq = gl.aq(i2, -1978101050);
                ad = aq.ak(10, -491072434);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af((aq.cq * 709263737) + 64, (aq.cn * -1537678021) + ox.aj, -50, -10, -50);
            }
            az.ar(bpVar, j);
        }
        return dpVar != null ? dpVar.as(bpVar, i, -1757310231) : bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] bo(lj ljVar) {
        int af = ljVar.af(1804771424);
        if (af == 0) {
            return null;
        }
        Object[] objArr = new Object[af];
        for (int i = 0; i < af; i++) {
            int af2 = ljVar.af(1804771424);
            if (af2 == 0) {
                objArr[i] = new Integer(ljVar.at((byte) -71));
            } else if (af2 == 1) {
                objArr[i] = ljVar.bm(2117780785);
            }
        }
        this.eh = true;
        return objArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(lj ljVar) {
        boolean z = true;
        ljVar.af(1804771424);
        this.aa = true;
        this.af = ljVar.af(1804771424) * 956087861;
        this.an = ljVar.an(-1464407032) * 533195257;
        this.ba = ljVar.ab(984000128) * 1685885569;
        this.bs = ljVar.ab(-210318139) * -1450929481;
        this.bm = ljVar.an(-1464407032) * -846283905;
        if (this.af * 1845699613 == 9) {
            this.bq = ljVar.ab(-1473129332) * -1937288673;
        } else {
            this.bq = ljVar.an(-1464407032) * -1937288673;
        }
        this.at = ljVar.ay(369327007) * -1629038693;
        this.bk = ljVar.ay(-849548320) * -458681677;
        this.ab = ljVar.ay(-1547104747) * 1932562981;
        this.av = ljVar.ay(1655752438) * -122098513;
        this.bc = ljVar.an(-1464407032) * -712641979;
        if (SupportMenu.USER_MASK == this.bc * -38514547) {
            this.bc = 712641979;
        } else {
            this.bc = (((this.ao * -1227024251) & SupportMenu.CATEGORY_MASK) + (this.bc * -38514547)) * -712641979;
        }
        this.bv = ljVar.af(1804771424) == 1;
        if (this.af * 1845699613 == 0) {
            this.bu = ljVar.an(-1464407032) * 1956842863;
            this.bw = ljVar.an(-1464407032) * 1451678031;
            this.gi = ljVar.af(1804771424) == 1;
        }
        if (this.af * 1845699613 == 5) {
            this.cj = ljVar.at((byte) -112) * -1727679139;
            this.cq = ljVar.an(-1464407032) * 1407698477;
            this.cn = ljVar.af(1804771424) == 1;
            this.bz = ljVar.af(1804771424) * -1784857337;
            this.cw = ljVar.af(1804771424) * 1545275515;
            this.cp = ljVar.at((byte) -19) * 1407371587;
            this.ci = ljVar.af(1804771424) == 1;
            this.cb = ljVar.af(1804771424) == 1;
        }
        if (this.af * 1845699613 == 6) {
            this.ce = -1360803229;
            this.cy = ljVar.an(-1464407032) * -927961631;
            if (this.cy * 484480545 == SupportMenu.USER_MASK) {
                this.cy = 927961631;
            }
            this.cx = ljVar.ab(2101104601) * 116822575;
            this.ct = ljVar.ab(16382413) * 91905667;
            this.ck = ljVar.an(-1464407032) * -1944500353;
            this.co = ljVar.an(-1464407032) * -1450063701;
            this.cu = ljVar.an(-1464407032) * -1788635289;
            this.cl = ljVar.an(-1464407032) * 137430647;
            this.cr = ljVar.an(-1464407032) * 1131620129;
            if (SupportMenu.USER_MASK == this.cr * 102964449) {
                this.cr = -1131620129;
            }
            this.cf = ljVar.af(1804771424) == 1;
            ljVar.an(-1464407032);
            if (this.at * 538883731 != 0) {
                this.cz = ljVar.an(-1464407032) * -1923061613;
            }
            if (this.bk * -606212997 != 0) {
                ljVar.an(-1464407032);
            }
        }
        if (4 == this.af * 1845699613) {
            this.dd = ljVar.an(-1464407032) * -996713033;
            if (SupportMenu.USER_MASK == this.dd * 906432519) {
                this.dd = 996713033;
            }
            this.dm = ljVar.bm(1663424691);
            this.dv = ljVar.af(1804771424) * 970340041;
            this.di = ljVar.af(1804771424) * 332285219;
            this.dl = ljVar.af(1804771424) * 452292553;
            this.dr = ljVar.af(1804771424) == 1;
            this.br = ljVar.at((byte) -120) * -1732815777;
        }
        if (3 == this.af * 1845699613) {
            this.br = ljVar.at((byte) -49) * -1732815777;
            this.bt = ljVar.af(1804771424) == 1;
            this.bz = ljVar.af(1804771424) * -1784857337;
        }
        if (this.af * 1845699613 == 9) {
            this.bp = ljVar.af(1804771424) * -1866717737;
            this.br = ljVar.at((byte) -100) * -1732815777;
            this.cv = ljVar.af(1804771424) == 1;
        }
        this.dn = ljVar.av((byte) -105) * -1502416797;
        this.dg = ljVar.bm(2068653999);
        int af = ljVar.af(1804771424);
        if (af > 0) {
            this.dz = new String[af];
            for (int i = 0; i < af; i++) {
                this.dz[i] = ljVar.bm(947578753);
            }
        }
        this.et = ljVar.af(1804771424) * -1776379629;
        this.eq = ljVar.af(1804771424) * 50248067;
        if (ljVar.af(1804771424) != 1) {
            z = false;
        }
        this.ez = z;
        this.eo = ljVar.bm(1405504861);
        this.ec = am(ljVar, (byte) 12);
        this.ey = am(ljVar, (byte) 12);
        this.ed = am(ljVar, (byte) 12);
        this.ew = am(ljVar, (byte) 12);
        this.ee = am(ljVar, (byte) 12);
        this.el = am(ljVar, (byte) 12);
        this.ev = am(ljVar, (byte) 12);
        this.em = am(ljVar, (byte) 12);
        this.ex = am(ljVar, (byte) 12);
        this.ej = am(ljVar, (byte) 12);
        this.eg = am(ljVar, (byte) 12);
        this.ea = am(ljVar, (byte) 12);
        this.ek = am(ljVar, (byte) 12);
        this.ei = am(ljVar, (byte) 12);
        this.en = am(ljVar, (byte) 12);
        this.er = am(ljVar, (byte) 12);
        this.eu = am(ljVar, (byte) 12);
        this.es = am(ljVar, (byte) 12);
        this.eb = ak(ljVar, (byte) 68);
        this.ep = ak(ljVar, (byte) 91);
        this.ef = ak(ljVar, (byte) 41);
    }

    public oi br() {
        ac = false;
        if (this.dd * 906432519 == -1) {
            return null;
        }
        oi oiVar = (oi) ax.ad((long) (this.dd * 906432519));
        if (oiVar != null) {
            return oiVar;
        }
        oiVar = hy.ae(aw.ag, cf.ap, this.dd * 906432519, 0, (short) -23429);
        if (oiVar != null) {
            ax.ar(oiVar, (long) (this.dd * 906432519));
            return oiVar;
        }
        ac = true;
        return oiVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(lj ljVar) {
        boolean z = true;
        ljVar.af(1804771424);
        this.aa = true;
        this.af = ljVar.af(1804771424) * 956087861;
        this.an = ljVar.an(-1464407032) * 533195257;
        this.ba = ljVar.ab(921678062) * 1685885569;
        this.bs = ljVar.ab(-2077475440) * -1450929481;
        this.bm = ljVar.an(-1464407032) * -846283905;
        if (this.af * 1845699613 == 9) {
            this.bq = ljVar.ab(132430496) * -1937288673;
        } else {
            this.bq = ljVar.an(-1464407032) * -1937288673;
        }
        this.at = ljVar.ay(1093820180) * -1629038693;
        this.bk = ljVar.ay(-2109026055) * -458681677;
        this.ab = ljVar.ay(1794264544) * 1932562981;
        this.av = ljVar.ay(149053778) * -122098513;
        this.bc = ljVar.an(-1464407032) * -712641979;
        if (SupportMenu.USER_MASK == this.bc * -38514547) {
            this.bc = 712641979;
        } else {
            this.bc = (((this.ao * -1227024251) & SupportMenu.CATEGORY_MASK) + (this.bc * -38514547)) * -712641979;
        }
        this.bv = ljVar.af(1804771424) == 1;
        if (this.af * 1845699613 == 0) {
            this.bu = ljVar.an(-1464407032) * 1956842863;
            this.bw = ljVar.an(-1464407032) * 1451678031;
            this.gi = ljVar.af(1804771424) == 1;
        }
        if (this.af * 1845699613 == 5) {
            this.cj = ljVar.at((byte) -81) * -1727679139;
            this.cq = ljVar.an(-1464407032) * 1407698477;
            this.cn = ljVar.af(1804771424) == 1;
            this.bz = ljVar.af(1804771424) * -1784857337;
            this.cw = ljVar.af(1804771424) * 1545275515;
            this.cp = ljVar.at((byte) -70) * 1407371587;
            this.ci = ljVar.af(1804771424) == 1;
            this.cb = ljVar.af(1804771424) == 1;
        }
        if (this.af * 1845699613 == 6) {
            this.ce = -1360803229;
            this.cy = ljVar.an(-1464407032) * -927961631;
            if (this.cy * 484480545 == SupportMenu.USER_MASK) {
                this.cy = 927961631;
            }
            this.cx = ljVar.ab(827158597) * 116822575;
            this.ct = ljVar.ab(-13806507) * 91905667;
            this.ck = ljVar.an(-1464407032) * -1944500353;
            this.co = ljVar.an(-1464407032) * -1450063701;
            this.cu = ljVar.an(-1464407032) * -1788635289;
            this.cl = ljVar.an(-1464407032) * 137430647;
            this.cr = ljVar.an(-1464407032) * 1131620129;
            if (SupportMenu.USER_MASK == this.cr * 102964449) {
                this.cr = -1131620129;
            }
            this.cf = ljVar.af(1804771424) == 1;
            ljVar.an(-1464407032);
            if (this.at * 538883731 != 0) {
                this.cz = ljVar.an(-1464407032) * -1923061613;
            }
            if (this.bk * -606212997 != 0) {
                ljVar.an(-1464407032);
            }
        }
        if (4 == this.af * 1845699613) {
            this.dd = ljVar.an(-1464407032) * -996713033;
            if (SupportMenu.USER_MASK == this.dd * 906432519) {
                this.dd = 996713033;
            }
            this.dm = ljVar.bm(1633139070);
            this.dv = ljVar.af(1804771424) * 970340041;
            this.di = ljVar.af(1804771424) * 332285219;
            this.dl = ljVar.af(1804771424) * 452292553;
            this.dr = ljVar.af(1804771424) == 1;
            this.br = ljVar.at((byte) -19) * -1732815777;
        }
        if (3 == this.af * 1845699613) {
            this.br = ljVar.at((byte) -44) * -1732815777;
            this.bt = ljVar.af(1804771424) == 1;
            this.bz = ljVar.af(1804771424) * -1784857337;
        }
        if (this.af * 1845699613 == 9) {
            this.bp = ljVar.af(1804771424) * -1866717737;
            this.br = ljVar.at((byte) -88) * -1732815777;
            this.cv = ljVar.af(1804771424) == 1;
        }
        this.dn = ljVar.av((byte) -92) * -1502416797;
        this.dg = ljVar.bm(1060600943);
        int af = ljVar.af(1804771424);
        if (af > 0) {
            this.dz = new String[af];
            for (int i = 0; i < af; i++) {
                this.dz[i] = ljVar.bm(1982906469);
            }
        }
        this.et = ljVar.af(1804771424) * -1776379629;
        this.eq = ljVar.af(1804771424) * 50248067;
        if (ljVar.af(1804771424) != 1) {
            z = false;
        }
        this.ez = z;
        this.eo = ljVar.bm(1493884005);
        this.ec = am(ljVar, (byte) 12);
        this.ey = am(ljVar, (byte) 12);
        this.ed = am(ljVar, (byte) 12);
        this.ew = am(ljVar, (byte) 12);
        this.ee = am(ljVar, (byte) 12);
        this.el = am(ljVar, (byte) 12);
        this.ev = am(ljVar, (byte) 12);
        this.em = am(ljVar, (byte) 12);
        this.ex = am(ljVar, (byte) 12);
        this.ej = am(ljVar, (byte) 12);
        this.eg = am(ljVar, (byte) 12);
        this.ea = am(ljVar, (byte) 12);
        this.ek = am(ljVar, (byte) 12);
        this.ei = am(ljVar, (byte) 12);
        this.en = am(ljVar, (byte) 12);
        this.er = am(ljVar, (byte) 12);
        this.eu = am(ljVar, (byte) 12);
        this.es = am(ljVar, (byte) 12);
        this.eb = ak(ljVar, (byte) 12);
        this.ep = ak(ljVar, (byte) 110);
        this.ef = ak(ljVar, (byte) 86);
    }

    public bp bt(dp dpVar, int i, boolean z, ae aeVar) {
        int i2;
        int i3;
        ac = false;
        if (z) {
            i2 = this.cs * -105304272;
            i3 = -753167349 * this.cc;
        } else {
            i2 = this.cy * 484480545;
            i3 = 734594891 * this.ce;
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1 && i2 == -1) {
            return null;
        }
        long j = (long) ((i3 << 16) + i2);
        bp bpVar = (bp) az.ad(j);
        if (bpVar == null) {
            bo ad;
            if (1 == i3) {
                ad = bo.ad(as, i2, 0);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(64, 384081674, -652940699, -10, -1399678200);
            }
            if (i3 == 2) {
                ad = ln.aq(i2, -2083989952).ae((byte) 99);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(64, ox.aj, 1679318531, 1698931006, -412571038);
            }
            if (3 == i3) {
                if (aeVar == null) {
                    return null;
                }
                ad = aeVar.am((byte) -44);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af(-670967497, ox.aj, 298776628, -10, 1558348911);
            }
            if (4 == i3) {
                dh aq = gl.aq(i2, 2051249975);
                ad = aq.ak(10, 465071914);
                if (ad == null) {
                    ac = true;
                    return null;
                }
                bpVar = ad.af((aq.cq * 709263737) + 64, (aq.cn * -1537678021) + 836627749, -58844277, -10, -50);
            }
            az.ar(bpVar, j);
        }
        return dpVar != null ? dpVar.as(bpVar, i, 1411451500) : bpVar;
    }

    public ee bu(boolean z) {
        ac = false;
        int i = z ? this.cm * -1608031489 : this.cj * 882525941;
        if (i == -1) {
            return null;
        }
        long j = (long) i;
        long j2 = (long) (this.cw * -1221057017);
        long j3 = 0;
        long j4 = this.ci ? 1 : 0;
        if (this.cb) {
            j3 = 1;
        }
        j3 = (((long) (this.cp * -416281749)) << 40) + (((j4 << 38) + (j + (j2 << 1830633550))) + (j3 << 39));
        ee eeVar = (ee) au.ad(j3);
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aw.ag, i, 0, (byte) 45);
        if (eeVar == null) {
            ac = true;
            return null;
        }
        if (this.ci) {
            eeVar.ai();
        }
        if (this.cb) {
            eeVar.aj();
        }
        if (this.cw * 320050867 > 0) {
            eeVar.al(this.cw * 320050867);
        }
        if (this.cw * 320050867 >= 1) {
            eeVar.ae(1);
        }
        if (this.cw * -1256201771 >= 2) {
            eeVar.ae(ViewCompat.MEASURED_SIZE_MASK);
        }
        if (this.cp * -1361740761 != 0) {
            eeVar.am(this.cp * -416281749);
        }
        au.ar(eeVar, j3);
        return eeVar;
    }

    public void bv(int i, int i2) {
        int i3 = this.fj[i2];
        this.fj[i2] = this.fj[i];
        this.fj[i] = i3;
        i3 = this.fi[i2];
        this.fi[i2] = this.fi[i];
        this.fi[i] = i3;
    }

    public ee bw(boolean z) {
        ac = false;
        int i = z ? this.cm * -1608031489 : this.cj * 882525941;
        if (i == -1) {
            return null;
        }
        long j = (long) i;
        long j2 = (long) (this.cw * 320050867);
        long j3 = 1;
        long j4 = this.ci ? 1 : 0;
        if (!this.cb) {
            j3 = 0;
        }
        j3 = (((long) (this.cp * -416281749)) << 40) + (((j4 << 38) + (j + (j2 << 36))) + (j3 << 39));
        ee eeVar = (ee) au.ad(j3);
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aw.ag, i, 0, (byte) 20);
        if (eeVar == null) {
            ac = true;
            return null;
        }
        if (this.ci) {
            eeVar.ai();
        }
        if (this.cb) {
            eeVar.aj();
        }
        if (this.cw * 320050867 > 0) {
            eeVar.al(this.cw * 320050867);
        }
        if (this.cw * 320050867 >= 1) {
            eeVar.ae(1);
        }
        if (this.cw * 320050867 >= 2) {
            eeVar.ae(ViewCompat.MEASURED_SIZE_MASK);
        }
        if (this.cp * -416281749 != 0) {
            eeVar.am(this.cp * -416281749);
        }
        au.ar(eeVar, j3);
        return eeVar;
    }

    public void bx(int i, int i2) {
        int i3 = this.fj[i2];
        this.fj[i2] = this.fj[i];
        this.fj[i] = i3;
        i3 = this.fi[i2];
        this.fi[i2] = this.fi[i];
        this.fi[i] = i3;
    }

    public as bz(boolean z) {
        long j = 0;
        if (this.cm * -1608031489 == -1) {
            z = false;
        }
        int i = z ? this.cm * -1608031489 : 882525941 * this.cj;
        if (-1 == i) {
            return null;
        }
        long j2 = (long) (this.cp * -416281749);
        long j3 = this.cb ? 1 : 0;
        if (this.ci) {
            j = 1;
        }
        j2 = (j2 << 40) + ((j3 << 39) + ((j << 38) + ((((long) (this.cw * 320050867)) << 36) + ((long) i))));
        as asVar = (as) aw.ad(j2);
        if (asVar != null) {
            return asVar;
        }
        ee ag = ag(z, -1883296125);
        if (ag == null) {
            return null;
        }
        ee aq = ag.aq();
        int[] iArr = new int[aq.ar];
        int[] iArr2 = new int[aq.ar];
        for (int i2 = 0; i2 < aq.ar; i2++) {
            int i3 = aq.aq;
            int i4 = 0;
            while (i4 < aq.aq) {
                if (aq.ad[(aq.aq * i2) + i4] == 0) {
                    break;
                }
                i4++;
            }
            i4 = 0;
            for (int i5 = aq.aq - 1; i5 >= i4; i5--) {
                if (aq.ad[(aq.aq * i2) + i5] == 0) {
                    i3 = i5 + 1;
                    break;
                }
            }
            iArr[i2] = i4;
            iArr2[i2] = i3 - i4;
        }
        asVar = new as(aq.aq, aq.ar, iArr2, iArr, i);
        aw.ar(asVar, j2);
        return asVar;
    }

    public void cj(int i, String str) {
        if (this.dz == null || this.dz.length <= i) {
            String[] strArr = new String[(i + 1)];
            if (this.dz != null) {
                for (int i2 = 0; i2 < this.dz.length; i2++) {
                    strArr[i2] = this.dz[i2];
                }
            }
            this.dz = strArr;
        }
        this.dz[i] = str;
    }

    public void cm(int i, String str) {
        if (this.dz == null || this.dz.length <= i) {
            String[] strArr = new String[(i + 1)];
            if (this.dz != null) {
                for (int i2 = 0; i2 < this.dz.length; i2++) {
                    strArr[i2] = this.dz[i2];
                }
            }
            this.dz = strArr;
        }
        this.dz[i] = str;
    }

    public void cv(int i, String str) {
        if (this.dz == null || this.dz.length <= i) {
            String[] strArr = new String[(i + 1)];
            if (this.dz != null) {
                for (int i2 = 0; i2 < this.dz.length; i2++) {
                    strArr[i2] = this.dz[i2];
                }
            }
            this.dz = strArr;
        }
        this.dz[i] = str;
    }
}
