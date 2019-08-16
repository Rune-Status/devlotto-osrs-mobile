package defpackage;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.GmsVersion;
import com.jagex.mobilesdk.common.comms.CommsResult;
import java.lang.reflect.Array;
import java.util.Calendar;

/* renamed from: hl */
public class hl {
    static boolean aa = false;
    static final double ab = Math.log(2.0d);
    static final int ad = 500000;
    static int[] ae = new int[1000];
    static int ag = 0;
    static int ah = 0;
    static int[][] ai = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 5000}));
    static int[] aj = new int[5];
    static String[] ak = new String[1000];
    static String[] al = null;
    static boolean ao = false;
    static jw[] ap = new jw[50];
    static int[] ar = null;
    static int as = 0;
    static al au = null;
    static final String[] aw = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static Calendar ax = Calendar.getInstance();
    static ow ck = null;
    static kv dc = null;
    static kv dn = null;
    static final int kf = 1;
    static final int md = 31;
    static final int su = 2;
    public static int tk;

    hl() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hl.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String al(CharSequence charSequence, my myVar, int i) {
        if (charSequence == null) {
            return null;
        }
        int i2 = 0;
        try {
            int length = charSequence.length();
            while (i2 < length && dl.ar(charSequence.charAt(i2), (byte) 107)) {
                i2++;
            }
            while (length > i2 && dl.ar(charSequence.charAt(length - 1), (byte) 104)) {
                length--;
            }
            int i3 = length - i2;
            if (i3 < 1 || i3 > kg.ad(myVar, -671373441)) {
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder(i3);
            while (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (bh.aq(charAt, (byte) 48)) {
                    charAt = gc.aj(charAt, 1693467896);
                    if (charAt != 0) {
                        stringBuilder.append(charAt);
                    }
                }
                i2++;
            }
            return stringBuilder.length() != 0 ? stringBuilder.toString() : null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("hl.al(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public static int aq(lj ljVar, String str, byte b) {
        try {
            int i = ljVar.al;
            byte[] al = jn.al(str, 1379542044);
            ljVar.ao(al.length, 904242749);
            ljVar.al = (ks.ad.ad(al, 0, al.length, ljVar.ar, ljVar.al * -1631454091, 2137191086) * -879823907) + ljVar.al;
            return (ljVar.al * -1631454091) - (i * -1631454091);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hl.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Failed to extract finally block: empty outs */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05ab }} */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05ab }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05ab }} */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05ab }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Missing block: B:230:0x0566, code skipped:
            throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Missing block: B:245:0x05aa, code skipped:
            throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Missing block: B:359:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void be(il ilVar, int i) {
        hw aq;
        Throwable th;
        Throwable e;
        StringBuilder stringBuilder;
        Object[] objArr = ilVar.ad;
        if (gd.ad(ilVar.ap * 1800063618, 1840209101)) {
            in.ac = (dt) objArr[0];
            dy aq2 = jg.aq(in.ac.ad * 604627991, (byte) 5);
            aq = cm.aq(ilVar.ap * 1151259651, aq2.aj * -26196091, aq2.an * -345210295, (byte) 1);
        } else {
            aq = cq.ad(((Integer) objArr[0]).intValue(), (byte) 14);
        }
        if (aq != null) {
            ds.am = 0;
            as = 0;
            int[] iArr = aq.aq;
            int[] iArr2 = aq.ar;
            ag = 0;
            aa = false;
            int i2;
            int intValue;
            try {
                String str;
                ar = new int[(aq.aj * 486265393)];
                al = new String[(aq.ai * 1365609213)];
                int i3 = 0;
                int i4 = 0;
                i2 = 1;
                while (i2 < objArr.length) {
                    if (objArr[i2] instanceof Integer) {
                        intValue = ((Integer) objArr[i2]).intValue();
                        if (-2147483647 == intValue) {
                            intValue = 223244049 * ilVar.al;
                        }
                        if (-2147483646 == intValue) {
                            intValue = ilVar.aj * -1361467188;
                        }
                        if (intValue == -1833455068) {
                            intValue = ilVar.ar != null ? ilVar.ar.ao * -1227024251 : -1;
                        }
                        if (788767749 == intValue) {
                            intValue = 2001633253 * ilVar.ai;
                        }
                        if (-860942196 == intValue) {
                            intValue = ilVar.ar != null ? 1748091151 * ilVar.ar.ah : -1;
                        }
                        if (intValue == -2147483642) {
                            intValue = ilVar.ae != null ? ilVar.ae.ao * -1227024251 : -1;
                        }
                        if (-1954515092 == intValue) {
                            intValue = ilVar.ae != null ? 988026877 * ilVar.ae.ah : -1;
                        }
                        if (-702662296 == intValue) {
                            intValue = ilVar.am * 640021649;
                        }
                        if (-2147483639 == intValue) {
                            intValue = ilVar.ak * -79018687;
                        }
                        ar[i4] = intValue;
                        intValue = i4 + 1;
                    } else if (objArr[i2] instanceof String) {
                        str = (String) objArr[i2];
                        if (str.equals("event_opbase")) {
                            str = ilVar.as;
                        }
                        al[i3] = str;
                        i3++;
                        intValue = i4;
                    } else {
                        intValue = i4;
                    }
                    i2++;
                    i4 = intValue;
                }
                ah = ilVar.ag * -1070305979;
                i2 = -1;
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    i5++;
                    if (i5 <= i) {
                        i4 = i6 + 1;
                        i2 = iArr[i4];
                        int[] iArr3;
                        int[] iArr4;
                        int[] iArr5;
                        int i7;
                        String[] strArr;
                        if (i2 >= 1772633720) {
                            switch (fx.ar(i2, aq, aq.ar[i4] == 1, 1685303366)) {
                                case 0:
                                    if (aa) {
                                        ao = true;
                                        bz.hd(2055695659);
                                        ao = false;
                                        aa = false;
                                        return;
                                    }
                                    return;
                                case 1:
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    intValue = i4;
                                    break;
                            }
                            intValue = i4;
                        } else if (i2 == 0) {
                            try {
                                iArr3 = ae;
                                i3 = ds.am - 1803913662;
                                ds.am = i3;
                                iArr3[(i3 * -634853838) - 1] = iArr2[i4];
                                intValue = i4;
                            } catch (Exception e2) {
                                th = e2;
                                try {
                                    stringBuilder = new StringBuilder(30);
                                    stringBuilder.append("");
                                    stringBuilder.append(aq.gs);
                                    stringBuilder.append(" ");
                                    while (intValue >= 0) {
                                    }
                                    stringBuilder.append("");
                                    stringBuilder.append(i2);
                                    iv.ad(stringBuilder.toString(), th, 1692244937);
                                    if (aa) {
                                    }
                                } catch (Throwable th2) {
                                    if (aa) {
                                        ao = true;
                                        bz.hd(-1568357135);
                                        ao = false;
                                        aa = false;
                                    }
                                }
                            }
                        } else if (i2 == 1) {
                            intValue = iArr2[i4];
                            iArr4 = ae;
                            i6 = ds.am - 564452847;
                            ds.am = i6;
                            iArr4[(i6 * -85008281) - 1] = aj.ar[intValue];
                            intValue = i4;
                        } else if (i2 == 2) {
                            intValue = iArr2[i4];
                            iArr4 = aj.ar;
                            iArr5 = ae;
                            i7 = ds.am + 564452847;
                            ds.am = i7;
                            iArr4[intValue] = iArr5[i7 * 477603770];
                            cp.hg(intValue, -1370214581);
                            intValue = i4;
                        } else if (3 == i2) {
                            strArr = ak;
                            i3 = as - 1490481109;
                            as = i3;
                            strArr[(i3 * 166119696) - 1] = aq.al[i4];
                            intValue = i4;
                        } else {
                            hw hwVar;
                            String[] strArr2;
                            String[] strArr3;
                            jv jvVar;
                            if (6 == i2) {
                                intValue = iArr2[i4];
                            } else if (7 == i2) {
                                ds.am -= 569571732;
                                if (ae[(ds.am * -1178833655) + 1] != ae[ds.am * -757592335]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (8 == i2) {
                                ds.am -= 1214275807;
                                if (ae[ds.am * -2090757876] == ae[(ds.am * -757592335) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (i2 == 9) {
                                ds.am -= 460998819;
                                if (ae[ds.am * 1755817032] < ae[(ds.am * -1366469173) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (i2 == 10) {
                                ds.am += 1128905694;
                                if (ae[ds.am * 1871258764] > ae[(ds.am * -757592335) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (21 == i2) {
                                if (ag * 2007654799 != 0) {
                                    jw[] jwVarArr = ap;
                                    i4 = ag - 1490669514;
                                    ag = i4;
                                    jw jwVar = jwVarArr[i4 * 2007654799];
                                    hwVar = jwVar.ad;
                                    try {
                                        iArr4 = hwVar.aq;
                                        iArr3 = hwVar.ar;
                                        int i8 = jwVar.aq;
                                        ar = jwVar.ar;
                                        al = jwVar.al;
                                        i6 = i8 * -1370768725;
                                        iArr2 = iArr3;
                                        iArr = iArr4;
                                        aq = hwVar;
                                    } catch (Exception e3) {
                                        e2 = e3;
                                        th = e2;
                                        aq = hwVar;
                                        stringBuilder = new StringBuilder(30);
                                        stringBuilder.append("");
                                        stringBuilder.append(aq.gs);
                                        stringBuilder.append(" ");
                                        for (intValue = (ag * 25701079) - 1; intValue >= 0; intValue--) {
                                            stringBuilder.append("");
                                            stringBuilder.append(ap[intValue].ad.gs);
                                            stringBuilder.append(" ");
                                        }
                                        stringBuilder.append("");
                                        stringBuilder.append(i2);
                                        iv.ad(stringBuilder.toString(), th, 1692244937);
                                        if (aa) {
                                            ao = true;
                                            bz.hd(-871176723);
                                            ao = false;
                                            aa = false;
                                        }
                                        return;
                                    }
                                } else if (aa) {
                                    ao = true;
                                    bz.hd(-725658137);
                                    ao = false;
                                    aa = false;
                                    return;
                                } else {
                                    return;
                                }
                            } else if (i2 == 25) {
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i6 = ds.am - 1255099778;
                                ds.am = i6;
                                iArr4[(i6 * -757592335) - 1] = cd.ad(intValue, 1044169608);
                                intValue = i4;
                            } else if (i2 == 27) {
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i6 = ds.am - 1766857398;
                                ds.am = i6;
                                fl.aq(intValue, iArr4[i6 * -1144412780], (byte) -28);
                                intValue = i4;
                            } else if (i2 == 31) {
                                ds.am += 2031190279;
                                if (ae[ds.am * 673929859] <= ae[(ds.am * 1969279756) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (32 == i2) {
                                ds.am -= 1554631399;
                                if (ae[ds.am * 553287631] >= ae[(ds.am * -1555422586) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (i2 == 33) {
                                iArr3 = ae;
                                i3 = ds.am - 564452847;
                                ds.am = i3;
                                iArr3[(i3 * -757592335) - 1] = ar[iArr2[i4]];
                                intValue = i4;
                            } else if (i2 == 34) {
                                iArr3 = ar;
                                i3 = iArr2[i4];
                                iArr5 = ae;
                                i7 = ds.am + 564452847;
                                ds.am = i7;
                                iArr3[i3] = iArr5[i7 * -757592335];
                                intValue = i4;
                            } else if (i2 == -1462968312) {
                                strArr = ak;
                                i3 = as - 1490481109;
                                as = i3;
                                strArr[(i3 * 1922473378) - 1] = al[iArr2[i4]];
                                intValue = i4;
                            } else if (i2 == 36) {
                                strArr = al;
                                i3 = iArr2[i4];
                                strArr2 = ak;
                                i7 = as + 1031637806;
                                as = i7;
                                strArr[i3] = strArr2[i7 * -1883296125];
                                intValue = i4;
                            } else if (37 == i2) {
                                intValue = iArr2[i4];
                                as -= -1425003067 * intValue;
                                str = cl.ad(ak, as * 901707107, intValue, (byte) 77);
                                strArr3 = ak;
                                i6 = as + 130177611;
                                as = i6;
                                strArr3[(i6 * 1418535384) - 1] = str;
                                intValue = i4;
                            } else if (i2 == 38) {
                                ds.am += 564452847;
                                intValue = i4;
                            } else if (-1993022110 == i2) {
                                as += 1490481109;
                                intValue = i4;
                            } else if (40 == i2) {
                                hw ad = cq.ad(iArr2[i4], (byte) 97);
                                iArr2 = new int[(ad.aj * 486265393)];
                                String[] strArr4 = new String[(ad.ai * -827465766)];
                                for (intValue = 0; intValue < ad.ae * 476111189; intValue++) {
                                    iArr2[intValue] = ae[((ds.am * -1016303397) - (ad.ae * -1201445821)) + intValue];
                                }
                                for (intValue = 0; intValue < ad.am * -2109792803; intValue++) {
                                    strArr4[intValue] = ak[((as * -1883296125) - (ad.am * -1673603261)) + intValue];
                                }
                                ds.am -= ad.ae * 103394477;
                                as -= ad.am * 1192684519;
                                jw jwVar2 = new jw();
                                jwVar2.ad = aq;
                                jwVar2.aq = i4 * 1515614211;
                                jwVar2.ar = ar;
                                jwVar2.al = al;
                                jw[] jwVarArr2 = ap;
                                i6 = ag - 31154381;
                                ag = i6;
                                jwVarArr2[(-836903985 * i6) - 1] = jwVar2;
                                try {
                                    int[] iArr6 = ad.aq;
                                    iArr3 = ad.ar;
                                    ar = iArr2;
                                    al = strArr4;
                                    i6 = -1;
                                    iArr2 = iArr3;
                                    iArr = iArr6;
                                    aq = ad;
                                } catch (Exception e4) {
                                    e2 = e4;
                                    hwVar = ad;
                                    th = e2;
                                    aq = hwVar;
                                    stringBuilder = new StringBuilder(30);
                                    stringBuilder.append("");
                                    stringBuilder.append(aq.gs);
                                    stringBuilder.append(" ");
                                    while (intValue >= 0) {
                                    }
                                    stringBuilder.append("");
                                    stringBuilder.append(i2);
                                    iv.ad(stringBuilder.toString(), th, 1692244937);
                                    if (aa) {
                                    }
                                }
                            } else if (i2 == 42) {
                                iArr3 = ae;
                                i3 = ds.am + 1740296196;
                                ds.am = i3;
                                iArr3[(i3 * 1869024395) - 1] = ec.na.aq(iArr2[i4], -1619100397);
                                intValue = i4;
                            } else if (i2 == -238026012) {
                                jvVar = ec.na;
                                i3 = iArr2[i4];
                                iArr5 = ae;
                                i7 = ds.am + 564452847;
                                ds.am = i7;
                                jvVar.ad(i3, iArr5[i7 * -1987451947], -1227024251);
                                intValue = i4;
                            } else if (-2060377820 == i2) {
                                i6 = iArr2[i4] >> 16;
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i7 = ds.am - 1986887858;
                                ds.am = i7;
                                i7 = iArr4[i7 * 327064104];
                                if (i7 >= 0 && i7 <= -779133265) {
                                    aj[i6] = i7;
                                    intValue = (intValue & SupportMenu.USER_MASK) == -1438819798 ? 0 : -1;
                                    for (i3 = 0; i3 < i7; i3++) {
                                        ai[i6][i3] = intValue;
                                    }
                                    intValue = i4;
                                }
                            } else if (i2 == 1606171944) {
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i6 = ds.am - 123990472;
                                ds.am = i6;
                                i3 = iArr4[i6 * -863464882];
                                if (i3 >= 0) {
                                    if (i3 < aj[intValue]) {
                                        iArr5 = ae;
                                        i7 = ds.am + 874641611;
                                        ds.am = i7;
                                        iArr5[(i7 * -1738310715) - 1] = ai[intValue][i3];
                                        intValue = i4;
                                    }
                                }
                            } else if (i2 == -263192642) {
                                intValue = iArr2[i4];
                                ds.am += 397451735;
                                i3 = ae[ds.am * -1423462312];
                                if (i3 >= 0 && i3 < aj[intValue]) {
                                    ai[intValue][i3] = ae[(ds.am * -757592335) + 1];
                                    intValue = i4;
                                }
                            } else if (i2 == 47) {
                                str = ec.na.ai(iArr2[i4], (byte) -111);
                                if (str == null) {
                                    str = go.ak;
                                }
                                strArr3 = ak;
                                i6 = as + 303711342;
                                as = i6;
                                strArr3[(i6 * 2073796038) - 1] = str;
                                intValue = i4;
                            } else if (1794348129 == i2) {
                                jvVar = ec.na;
                                i3 = iArr2[i4];
                                strArr2 = ak;
                                i7 = as - 1112529397;
                                as = i7;
                                jvVar.aj(i3, strArr2[i7 * -1883296125], (byte) 4);
                                intValue = i4;
                            } else if (i2 == -279241562) {
                                str = ec.na.al(iArr2[i4], -1992220926);
                                strArr3 = ak;
                                i6 = as - 1490481109;
                                as = i6;
                                strArr3[(i6 * 99446153) - 1] = str;
                                intValue = i4;
                            } else if (i2 == 1298667814) {
                                jvVar = ec.na;
                                i3 = iArr2[i4];
                                strArr2 = ak;
                                i7 = as - 1065075311;
                                as = i7;
                                jvVar.ar(i3, strArr2[i7 * -1915617766], (byte) -27);
                                intValue = i4;
                            } else if (i2 == 60) {
                                ot otVar = aq.ak[iArr2[i4]];
                                iArr4 = ae;
                                i6 = ds.am + 564452847;
                                ds.am = i6;
                                ms msVar = (ms) otVar.ad((long) iArr4[i6 * 997035146]);
                                if (msVar != null) {
                                    intValue = msVar.ad + i4;
                                }
                                intValue = i4;
                            } else {
                                throw new IllegalStateException();
                            }
                            i6 = intValue + i4;
                        }
                        i6 = intValue;
                    } else {
                        try {
                            throw new RuntimeException();
                        } catch (Exception e22) {
                            th = e22;
                            stringBuilder = new StringBuilder(30);
                            stringBuilder.append("");
                            stringBuilder.append(aq.gs);
                            stringBuilder.append(" ");
                            while (intValue >= 0) {
                            }
                            stringBuilder.append("");
                            stringBuilder.append(i2);
                            iv.ad(stringBuilder.toString(), th, 1692244937);
                            if (aa) {
                            }
                        }
                    }
                }
                throw new RuntimeException();
            } catch (Exception e222) {
                th = e222;
                i2 = -1;
                stringBuilder = new StringBuilder(30);
                stringBuilder.append("");
                stringBuilder.append(aq.gs);
                stringBuilder.append(" ");
                while (intValue >= 0) {
                }
                stringBuilder.append("");
                stringBuilder.append(i2);
                iv.ad(stringBuilder.toString(), th, 1692244937);
                if (aa) {
                }
            }
        }
    }

    static int bh(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int i3;
        al aq;
        al alVar;
        int[] iArr;
        al ar;
        int[] iArr2;
        if (i == -1697820495) {
            ds.am += 454911434;
            i3 = ae[ds.am * -757592335];
            int i4 = ae[(ds.am * -913231361) + 1];
            int i5 = ae[(ds.am * 1149219842) + 2];
            if (i4 != 0) {
                aq = da.aq(i3, -550158556);
                if (aq.fo == null) {
                    aq.fo = new al[(i5 + 1)];
                }
                if (aq.fo.length <= i5) {
                    al[] alVarArr = new al[(i5 + 1)];
                    while (i2 < aq.fo.length) {
                        alVarArr[i2] = aq.fo[i2];
                        i2++;
                    }
                    aq.fo = alVarArr;
                }
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    if (aq.fo[i6] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("");
                        stringBuilder.append(i6);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                }
                alVar = new al();
                alVar.af = i4 * -54839481;
                i4 = aq.ao * 1;
                alVar.ao = i4;
                alVar.bc = i4 * -292084695;
                alVar.ah = -302675145 * i5;
                alVar.aa = true;
                aq.fo[i5] = alVar;
                if (z) {
                    lj.az = alVar;
                } else {
                    au = alVar;
                }
                da.gk(aq, (byte) 2);
                return 1;
            }
            throw new RuntimeException();
        } else if (101 == i) {
            alVar = z ? lj.az : au;
            aq = da.aq(alVar.ao * -1903801629, -550158556);
            aq.fo[alVar.ah * 988026877] = null;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (87250324 == i) {
            iArr = ae;
            i3 = ds.am - 1361093486;
            ds.am = i3;
            alVar = da.aq(iArr[i3 * 2062575516], -550158556);
            alVar.fo = null;
            da.gk(alVar, (byte) 2);
            return 1;
        } else if (i == 200) {
            ds.am += 1326448346;
            int i7 = ae[ds.am * -649317325];
            i3 = ae[(ds.am * -757592335) + 1];
            ar = gi.ar(i7, i3, -1201935479);
            if (ar == null || i3 == -1) {
                iArr2 = ae;
                i3 = ds.am + 1770837783;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = 1;
            if (z) {
                lj.az = ar;
                return 1;
            }
            au = ar;
            return 1;
        } else if (i != 201) {
            return 2;
        } else {
            iArr2 = ae;
            i3 = ds.am - 169258198;
            ds.am = i3;
            ar = da.aq(iArr2[i3 * -757592335], -550158556);
            if (ar != null) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = 1;
                if (z) {
                    lj.az = ar;
                    return 1;
                }
                au = ar;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am + 451268903;
            ds.am = i3;
            iArr2[(i3 * -807646766) - 1] = 0;
            return 1;
        }
    }

    static int bj(int i, hw hwVar, boolean z) {
        return i < 1000 ? ez.al(i, hwVar, z, (byte) -92) : i < 1100 ? jf.aj(i, hwVar, z, -1615504759) : i < 1200 ? db.ai(i, hwVar, z, -2001614084) : i < 1300 ? hd.ae(i, hwVar, z, (byte) -48) : i < af.al ? fu.am(i, hwVar, z, -225888490) : i < ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED ? al.ap(i, hwVar, z, (byte) 54) : i < 1600 ? di.au(i, hwVar, z, 1835403038) : i < 1700 ? cz.az(i, hwVar, z, (byte) -76) : i < 1800 ? bt.ax(i, hwVar, z, (byte) -73) : i < 1900 ? ho.aw(i, hwVar, z, (byte) 32) : i < 2000 ? fq.ac(i, hwVar, z, 2083874543) : i < 2100 ? jf.aj(i, hwVar, z, -627713232) : i < 2200 ? db.ai(i, hwVar, z, -183303563) : i < 2300 ? hd.ae(i, hwVar, z, (byte) -81) : i < 2400 ? fu.am(i, hwVar, z, 928473412) : i < 2500 ? al.ap(i, hwVar, z, (byte) 7) : i < 2600 ? fl.aa(i, hwVar, z, -402634497) : i < 2700 ? by.ao(i, hwVar, z, 717466964) : i < 2800 ? dq.ah(i, hwVar, z, 232404408) : i < 2900 ? ku.af(i, hwVar, z, -72075321) : i < 3000 ? fq.ac(i, hwVar, z, 1837463941) : i < 3200 ? ed.ay(i, hwVar, z, (byte) 30) : i < 3300 ? cr.an(i, hwVar, z, -1025141826) : i < 3400 ? al.ab(i, hwVar, z, 1035003050) : i < 3500 ? db.av(i, hwVar, z, -20716863) : i < 3700 ? fj.at(i, hwVar, z, 917920739) : i < 4000 ? ca.bk(i, hwVar, z, -1924663199) : i < 4100 ? fw.ba(i, hwVar, z, (byte) 5) : i < 4200 ? ag.bs(i, hwVar, z, 1179191580) : i < 4300 ? cs.bm(i, hwVar, z, (byte) 1) : i < 5100 ? dm.bq(i, hwVar, z, 1604427625) : i < 5400 ? nv.bd(i, hwVar, z, -1181956171) : i < 5600 ? ci.bo(i, hwVar, z, -1639372944) : i < 5700 ? dv.bl(i, hwVar, z, 1056252760) : i < 6300 ? ew.bi(i, hwVar, z, (byte) -101) : i < 6600 ? cz.bc(i, hwVar, z, -1883296125) : i < 6700 ? et.bv(i, hwVar, z, (byte) -117) : 2;
    }

    static int bn(int i, hw hwVar, boolean z) {
        int i2;
        al aq;
        int i3;
        al alVar;
        int[] iArr;
        int i4;
        int[] iArr2;
        if (i == 100) {
            ds.am += 1693358541;
            i2 = ae[ds.am * -757592335];
            int i5 = ae[(ds.am * -757592335) + 1];
            int i6 = ae[(ds.am * -757592335) + 2];
            if (i5 != 0) {
                aq = da.aq(i2, -550158556);
                if (aq.fo == null) {
                    aq.fo = new al[(i6 + 1)];
                }
                if (aq.fo.length <= i6) {
                    al[] alVarArr = new al[(i6 + 1)];
                    for (i3 = 0; i3 < aq.fo.length; i3++) {
                        alVarArr[i3] = aq.fo[i3];
                    }
                    aq.fo = alVarArr;
                }
                if (i6 > 0) {
                    int i7 = i6 - 1;
                    if (aq.fo[i7] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("");
                        stringBuilder.append(i7);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                }
                alVar = new al();
                alVar.af = i5 * 956087861;
                i5 = aq.ao * 1;
                alVar.ao = i5;
                alVar.bc = i5 * -1327606311;
                alVar.ah = -2139357867 * i6;
                alVar.aa = true;
                aq.fo[i6] = alVar;
                if (z) {
                    lj.az = alVar;
                } else {
                    au = alVar;
                }
                da.gk(aq, (byte) 2);
                return 1;
            }
            throw new RuntimeException();
        } else if (101 == i) {
            alVar = z ? lj.az : au;
            aq = da.aq(alVar.ao * -1227024251, -550158556);
            aq.fo[alVar.ah * 988026877] = null;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (102 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            alVar = da.aq(iArr[i2 * -757592335], -550158556);
            alVar.fo = null;
            da.gk(alVar, (byte) 2);
            return 1;
        } else if (i == 200) {
            ds.am += 1128905694;
            i3 = ae[ds.am * -757592335];
            i4 = ae[(ds.am * -757592335) + 1];
            alVar = gi.ar(i3, i4, -1201935479);
            if (alVar == null || i4 == -1) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = 0;
                return 1;
            }
            iArr2 = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr2[(i2 * -757592335) - 1] = 1;
            if (z) {
                lj.az = alVar;
                return 1;
            }
            au = alVar;
            return 1;
        } else if (i != 201) {
            return 2;
        } else {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            alVar = da.aq(iArr[i4 * -757592335], -550158556);
            if (alVar != null) {
                iArr2 = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr2[(i2 * -757592335) - 1] = 1;
                if (z) {
                    lj.az = alVar;
                    return 1;
                }
                au = alVar;
                return 1;
            }
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = 0;
            return 1;
        }
    }

    static int bp(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        int i3;
        al aq;
        boolean z2 = false;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            aq = da.aq(i3, -550158556);
            i2 = i3;
        } else {
            i2 = -1;
            aq = z ? lj.az : au;
        }
        int i4;
        int i5;
        if (i == 1100) {
            ds.am += 1128905694;
            bh.gb(aq, ae[ds.am * -757592335], ae[(ds.am * -757592335) + 1], 1627114275);
            return 1;
        } else if (i == 1101) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.br = iArr[i4 * -757592335] * -1732815777;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1102) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq.bt = iArr[i2 * -757592335] == 1;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1103 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.bz = iArr[i4 * -757592335] * -1784857337;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1104) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.bp = iArr[i4 * -757592335] * -1866717737;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1105 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cj = iArr[i4 * -757592335] * -1727679139;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1106) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cq = iArr[i4 * -757592335] * 1407698477;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1107) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.cn = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1108 == i) {
            aq.ce = -1360803229;
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cy = iArr[i4 * -757592335] * -927961631;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1109) {
            ds.am -= 908250214;
            aq.cx = ae[ds.am * -757592335] * 116822575;
            aq.ct = ae[(ds.am * -757592335) + 1] * 91905667;
            aq.ck = ae[(ds.am * -757592335) + 2] * -1944500353;
            aq.co = ae[(ds.am * -757592335) + 3] * -1450063701;
            aq.cu = ae[(ds.am * -757592335) + 4] * -1788635289;
            aq.cl = ae[(ds.am * -757592335) + 5] * 137430647;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1110 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            if (i3 == aq.cr * 102964449) {
                return 1;
            }
            aq.cr = i3 * 1131620129;
            aq.fb = 0;
            aq.fp = 0;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1111 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.cf = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1112 == i) {
            String[] strArr = ak;
            i4 = as + 1490481109;
            as = i4;
            String str = strArr[i4 * -1883296125];
            if (str.equals(aq.dm)) {
                return 1;
            }
            aq.dm = str;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1113) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.dd = iArr[i4 * -757592335] * -996713033;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1114 == i) {
            ds.am += 1693358541;
            aq.di = ae[ds.am * -757592335] * 332285219;
            aq.dl = ae[(ds.am * -757592335) + 1] * 452292553;
            aq.dv = ae[(ds.am * -757592335) + 2] * 970340041;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1115) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.dr = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1116 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cw = iArr[i4 * -757592335] * 1545275515;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1117) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cp = iArr[i4 * -757592335] * 1407371587;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1118 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.ci = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1119 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.cb = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1120) {
            ds.am += 1128905694;
            aq.bu = ae[ds.am * -757592335] * 1956842863;
            aq.bw = ae[(ds.am * -757592335) + 1] * 1451678031;
            da.gk(aq, (byte) 2);
            if (-1 == i2 || aq.af * 1845699613 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i2 >> 16], aq, false, 955604662);
            return 1;
        } else if (i == 1121) {
            al.fm(aq.ao * -1227024251, aq.ah * 988026877, -2079757400);
            client.lh = aq;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1122) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cm = iArr[i4 * -757592335] * -728785665;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1123) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.be = iArr[i4 * -757592335] * 1789727225;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1124) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.by = iArr[i4 * -757592335] * -995855343;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1125) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            ep epVar = (ep) oz.ad(ix.aq(2130903090), iArr[i4 * -757592335], (byte) 46);
            if (epVar == null) {
                return 1;
            }
            aq.bn = epVar;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1126) {
            iArr = ae;
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
            iArr = ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.cg = z2;
            return 1;
        }
    }

    /* JADX WARNING: Failed to extract finally block: empty outs */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02c5 A:{Catch:{ all -> 0x05a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A:{SYNTHETIC, RETURN, REMOVE} */
    /* JADX WARNING: Missing block: B:230:0x0560, code skipped:
            throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Missing block: B:245:0x05a3, code skipped:
            throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Missing block: B:359:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void br(il ilVar, int i) {
        hw aq;
        Throwable th;
        Throwable e;
        StringBuilder stringBuilder;
        Object[] objArr = ilVar.ad;
        if (gd.ad(ilVar.ap * 1151259651, 612229125)) {
            in.ac = (dt) objArr[0];
            dy aq2 = jg.aq(in.ac.ad * 604627991, (byte) 18);
            aq = cm.aq(ilVar.ap * 1151259651, aq2.aj * -1701077253, aq2.an * -345210295, (byte) 1);
        } else {
            aq = cq.ad(((Integer) objArr[0]).intValue(), (byte) 57);
        }
        if (aq != null) {
            ds.am = 0;
            as = 0;
            int[] iArr = aq.aq;
            int[] iArr2 = aq.ar;
            ag = 0;
            aa = false;
            int i2;
            int intValue;
            try {
                String str;
                ar = new int[(aq.aj * 486265393)];
                al = new String[(aq.ai * 666339847)];
                int i3 = 0;
                int i4 = 0;
                i2 = 1;
                while (i2 < objArr.length) {
                    if (objArr[i2] instanceof Integer) {
                        intValue = ((Integer) objArr[i2]).intValue();
                        if (-2147483647 == intValue) {
                            intValue = ilVar.al * 223244049;
                        }
                        if (-2147483646 == intValue) {
                            intValue = -256822851 * ilVar.aj;
                        }
                        if (intValue == -2147483645) {
                            intValue = ilVar.ar != null ? ilVar.ar.ao * -1227024251 : -1;
                        }
                        if (-2147483644 == intValue) {
                            intValue = ilVar.ai * -218151537;
                        }
                        if (-2147483643 == intValue) {
                            intValue = ilVar.ar != null ? ilVar.ar.ah * 988026877 : -1;
                        }
                        if (intValue == -2147483642) {
                            intValue = ilVar.ae != null ? -1227024251 * ilVar.ae.ao : -1;
                        }
                        if (-2147483641 == intValue) {
                            intValue = ilVar.ae != null ? ilVar.ae.ah * 988026877 : -1;
                        }
                        if (-2147483640 == intValue) {
                            intValue = ilVar.am * -1068594563;
                        }
                        if (-2147483639 == intValue) {
                            intValue = ilVar.ak * -79018687;
                        }
                        ar[i4] = intValue;
                        intValue = i4 + 1;
                    } else if (objArr[i2] instanceof String) {
                        str = (String) objArr[i2];
                        if (str.equals("event_opbase")) {
                            str = ilVar.as;
                        }
                        al[i3] = str;
                        i3++;
                        intValue = i4;
                    } else {
                        intValue = i4;
                    }
                    i2++;
                    i4 = intValue;
                }
                ah = ilVar.ag * -1070305979;
                i2 = -1;
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    i5++;
                    if (i5 <= i) {
                        i4 = i6 + 1;
                        i2 = iArr[i4];
                        int[] iArr3;
                        int[] iArr4;
                        int[] iArr5;
                        int i7;
                        String[] strArr;
                        if (i2 >= 100) {
                            switch (fx.ar(i2, aq, aq.ar[i4] == 1, 436146285)) {
                                case 0:
                                    if (aa) {
                                        ao = true;
                                        bz.hd(162237625);
                                        ao = false;
                                        aa = false;
                                        return;
                                    }
                                    return;
                                case 1:
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    intValue = i4;
                                    break;
                            }
                            intValue = i4;
                        } else if (i2 == 0) {
                            try {
                                iArr3 = ae;
                                i3 = ds.am - 564452847;
                                ds.am = i3;
                                iArr3[(i3 * -757592335) - 1] = iArr2[i4];
                                intValue = i4;
                            } catch (Exception e2) {
                                th = e2;
                                try {
                                    stringBuilder = new StringBuilder(30);
                                    stringBuilder.append("");
                                    stringBuilder.append(aq.gs);
                                    stringBuilder.append(" ");
                                    while (intValue >= 0) {
                                    }
                                    stringBuilder.append("");
                                    stringBuilder.append(i2);
                                    iv.ad(stringBuilder.toString(), th, 1692244937);
                                    if (aa) {
                                    }
                                } catch (Throwable th2) {
                                    if (aa) {
                                        ao = true;
                                        bz.hd(-105485252);
                                        ao = false;
                                        aa = false;
                                    }
                                }
                            }
                        } else if (i2 == 1) {
                            intValue = iArr2[i4];
                            iArr4 = ae;
                            i6 = ds.am - 564452847;
                            ds.am = i6;
                            iArr4[(i6 * -757592335) - 1] = aj.ar[intValue];
                            intValue = i4;
                        } else if (i2 == 2) {
                            intValue = iArr2[i4];
                            iArr4 = aj.ar;
                            iArr5 = ae;
                            i7 = ds.am + 564452847;
                            ds.am = i7;
                            iArr4[intValue] = iArr5[i7 * -757592335];
                            cp.hg(intValue, -1370214581);
                            intValue = i4;
                        } else if (3 == i2) {
                            strArr = ak;
                            i3 = as - 1490481109;
                            as = i3;
                            strArr[(i3 * -1883296125) - 1] = aq.al[i4];
                            intValue = i4;
                        } else {
                            hw hwVar;
                            String[] strArr2;
                            String[] strArr3;
                            jv jvVar;
                            if (6 == i2) {
                                intValue = iArr2[i4];
                            } else if (7 == i2) {
                                ds.am += 1128905694;
                                if (ae[(ds.am * -757592335) + 1] != ae[ds.am * -757592335]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (8 == i2) {
                                ds.am += 1128905694;
                                if (ae[ds.am * -757592335] == ae[(ds.am * -757592335) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (i2 == 9) {
                                ds.am += 1128905694;
                                if (ae[ds.am * -757592335] < ae[(ds.am * -757592335) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (i2 == 10) {
                                ds.am += 1128905694;
                                if (ae[ds.am * -757592335] > ae[(ds.am * -757592335) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (21 == i2) {
                                if (ag * 2007654799 != 0) {
                                    jw[] jwVarArr = ap;
                                    i4 = ag - 277192047;
                                    ag = i4;
                                    jw jwVar = jwVarArr[i4 * 2007654799];
                                    hwVar = jwVar.ad;
                                    try {
                                        iArr4 = hwVar.aq;
                                        iArr3 = hwVar.ar;
                                        int i8 = jwVar.aq;
                                        ar = jwVar.ar;
                                        al = jwVar.al;
                                        i6 = i8 * -1370768725;
                                        iArr2 = iArr3;
                                        iArr = iArr4;
                                        aq = hwVar;
                                    } catch (Exception e3) {
                                        e2 = e3;
                                        th = e2;
                                        aq = hwVar;
                                        stringBuilder = new StringBuilder(30);
                                        stringBuilder.append("");
                                        stringBuilder.append(aq.gs);
                                        stringBuilder.append(" ");
                                        for (intValue = (ag * 2007654799) - 1; intValue >= 0; intValue--) {
                                            stringBuilder.append("");
                                            stringBuilder.append(ap[intValue].ad.gs);
                                            stringBuilder.append(" ");
                                        }
                                        stringBuilder.append("");
                                        stringBuilder.append(i2);
                                        iv.ad(stringBuilder.toString(), th, 1692244937);
                                        if (aa) {
                                            ao = true;
                                            bz.hd(2049935942);
                                            ao = false;
                                            aa = false;
                                        }
                                        return;
                                    }
                                } else if (aa) {
                                    ao = true;
                                    bz.hd(450202832);
                                    ao = false;
                                    aa = false;
                                    return;
                                } else {
                                    return;
                                }
                            } else if (i2 == 25) {
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i6 = ds.am - 564452847;
                                ds.am = i6;
                                iArr4[(i6 * -757592335) - 1] = cd.ad(intValue, 1778973814);
                                intValue = i4;
                            } else if (i2 == 27) {
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i6 = ds.am + 564452847;
                                ds.am = i6;
                                fl.aq(intValue, iArr4[i6 * -757592335], (byte) -34);
                                intValue = i4;
                            } else if (i2 == 31) {
                                ds.am += 1128905694;
                                if (ae[ds.am * -757592335] <= ae[(ds.am * -757592335) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (32 == i2) {
                                ds.am += 1128905694;
                                if (ae[ds.am * -757592335] >= ae[(ds.am * -757592335) + 1]) {
                                    intValue = iArr2[i4];
                                }
                                intValue = i4;
                            } else if (i2 == 33) {
                                iArr3 = ae;
                                i3 = ds.am - 564452847;
                                ds.am = i3;
                                iArr3[(i3 * -757592335) - 1] = ar[iArr2[i4]];
                                intValue = i4;
                            } else if (i2 == 34) {
                                iArr3 = ar;
                                i3 = iArr2[i4];
                                iArr5 = ae;
                                i7 = ds.am + 564452847;
                                ds.am = i7;
                                iArr3[i3] = iArr5[i7 * -757592335];
                                intValue = i4;
                            } else if (i2 == 35) {
                                strArr = ak;
                                i3 = as - 1490481109;
                                as = i3;
                                strArr[(i3 * -1883296125) - 1] = al[iArr2[i4]];
                                intValue = i4;
                            } else if (i2 == 36) {
                                strArr = al;
                                i3 = iArr2[i4];
                                strArr2 = ak;
                                i7 = as + 1490481109;
                                as = i7;
                                strArr[i3] = strArr2[i7 * -1883296125];
                                intValue = i4;
                            } else if (37 == i2) {
                                intValue = iArr2[i4];
                                as -= -1490481109 * intValue;
                                str = cl.ad(ak, as * -1883296125, intValue, (byte) 121);
                                strArr3 = ak;
                                i6 = as - 1490481109;
                                as = i6;
                                strArr3[(i6 * -1883296125) - 1] = str;
                                intValue = i4;
                            } else if (i2 == 38) {
                                ds.am += 564452847;
                                intValue = i4;
                            } else if (39 == i2) {
                                as += 1490481109;
                                intValue = i4;
                            } else if (40 == i2) {
                                hw ad = cq.ad(iArr2[i4], (byte) 68);
                                iArr2 = new int[(ad.aj * 486265393)];
                                String[] strArr4 = new String[(ad.ai * 666339847)];
                                for (intValue = 0; intValue < ad.ae * 579501497; intValue++) {
                                    iArr2[intValue] = ae[((ds.am * -757592335) - (ad.ae * 579501497)) + intValue];
                                }
                                for (intValue = 0; intValue < ad.am * -2109792803; intValue++) {
                                    strArr4[intValue] = ak[((as * -1883296125) - (ad.am * -2109792803)) + intValue];
                                }
                                ds.am -= ad.ae * -827856055;
                                as -= ad.am * -975383521;
                                jw jwVar2 = new jw();
                                jwVar2.ad = aq;
                                jwVar2.aq = i4 * 1515614211;
                                jwVar2.ar = ar;
                                jwVar2.al = al;
                                jw[] jwVarArr2 = ap;
                                i6 = ag + 277192047;
                                ag = i6;
                                jwVarArr2[(2007654799 * i6) - 1] = jwVar2;
                                try {
                                    int[] iArr6 = ad.aq;
                                    iArr3 = ad.ar;
                                    ar = iArr2;
                                    al = strArr4;
                                    i6 = -1;
                                    iArr2 = iArr3;
                                    iArr = iArr6;
                                    aq = ad;
                                } catch (Exception e4) {
                                    e2 = e4;
                                    hwVar = ad;
                                    th = e2;
                                    aq = hwVar;
                                    stringBuilder = new StringBuilder(30);
                                    stringBuilder.append("");
                                    stringBuilder.append(aq.gs);
                                    stringBuilder.append(" ");
                                    while (intValue >= 0) {
                                    }
                                    stringBuilder.append("");
                                    stringBuilder.append(i2);
                                    iv.ad(stringBuilder.toString(), th, 1692244937);
                                    if (aa) {
                                    }
                                }
                            } else if (i2 == 42) {
                                iArr3 = ae;
                                i3 = ds.am - 564452847;
                                ds.am = i3;
                                iArr3[(i3 * -757592335) - 1] = ec.na.aq(iArr2[i4], -1619100397);
                                intValue = i4;
                            } else if (i2 == 43) {
                                jvVar = ec.na;
                                i3 = iArr2[i4];
                                iArr5 = ae;
                                i7 = ds.am + 564452847;
                                ds.am = i7;
                                jvVar.ad(i3, iArr5[i7 * -757592335], -1227024251);
                                intValue = i4;
                            } else if (44 == i2) {
                                i6 = iArr2[i4] >> 16;
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i7 = ds.am + 564452847;
                                ds.am = i7;
                                i7 = iArr4[i7 * -757592335];
                                if (i7 >= 0 && i7 <= 5000) {
                                    aj[i6] = i7;
                                    intValue = (intValue & SupportMenu.USER_MASK) == 105 ? 0 : -1;
                                    for (i3 = 0; i3 < i7; i3++) {
                                        ai[i6][i3] = intValue;
                                    }
                                    intValue = i4;
                                }
                            } else if (i2 == 45) {
                                intValue = iArr2[i4];
                                iArr4 = ae;
                                i6 = ds.am + 564452847;
                                ds.am = i6;
                                i3 = iArr4[i6 * -757592335];
                                if (i3 >= 0) {
                                    if (i3 < aj[intValue]) {
                                        iArr5 = ae;
                                        i7 = ds.am - 564452847;
                                        ds.am = i7;
                                        iArr5[(i7 * -757592335) - 1] = ai[intValue][i3];
                                        intValue = i4;
                                    }
                                }
                            } else if (i2 == 46) {
                                intValue = iArr2[i4];
                                ds.am += 1128905694;
                                i3 = ae[ds.am * -757592335];
                                if (i3 >= 0 && i3 < aj[intValue]) {
                                    ai[intValue][i3] = ae[(ds.am * -757592335) + 1];
                                    intValue = i4;
                                }
                            } else if (i2 == 47) {
                                str = ec.na.ai(iArr2[i4], (byte) -36);
                                if (str == null) {
                                    str = go.ak;
                                }
                                strArr3 = ak;
                                i6 = as - 1490481109;
                                as = i6;
                                strArr3[(i6 * -1883296125) - 1] = str;
                                intValue = i4;
                            } else if (48 == i2) {
                                jvVar = ec.na;
                                i3 = iArr2[i4];
                                strArr2 = ak;
                                i7 = as + 1490481109;
                                as = i7;
                                jvVar.aj(i3, strArr2[i7 * -1883296125], (byte) -98);
                                intValue = i4;
                            } else if (i2 == 49) {
                                str = ec.na.al(iArr2[i4], -1644417646);
                                strArr3 = ak;
                                i6 = as - 1490481109;
                                as = i6;
                                strArr3[(i6 * -1883296125) - 1] = str;
                                intValue = i4;
                            } else if (i2 == 50) {
                                jvVar = ec.na;
                                i3 = iArr2[i4];
                                strArr2 = ak;
                                i7 = as + 1490481109;
                                as = i7;
                                jvVar.ar(i3, strArr2[i7 * -1883296125], (byte) -2);
                                intValue = i4;
                            } else if (i2 == 60) {
                                ot otVar = aq.ak[iArr2[i4]];
                                iArr4 = ae;
                                i6 = ds.am + 564452847;
                                ds.am = i6;
                                ms msVar = (ms) otVar.ad((long) iArr4[i6 * -757592335]);
                                if (msVar != null) {
                                    intValue = msVar.ad + i4;
                                }
                                intValue = i4;
                            } else {
                                throw new IllegalStateException();
                            }
                            i6 = intValue + i4;
                        }
                        i6 = intValue;
                    } else {
                        try {
                            throw new RuntimeException();
                        } catch (Exception e22) {
                            th = e22;
                            stringBuilder = new StringBuilder(30);
                            stringBuilder.append("");
                            stringBuilder.append(aq.gs);
                            stringBuilder.append(" ");
                            while (intValue >= 0) {
                            }
                            stringBuilder.append("");
                            stringBuilder.append(i2);
                            iv.ad(stringBuilder.toString(), th, 1692244937);
                            if (aa) {
                            }
                        }
                    }
                }
                throw new RuntimeException();
            } catch (Exception e222) {
                th = e222;
                i2 = -1;
                stringBuilder = new StringBuilder(30);
                stringBuilder.append("");
                stringBuilder.append(aq.gs);
                stringBuilder.append(" ");
                while (intValue >= 0) {
                }
                stringBuilder.append("");
                stringBuilder.append(i2);
                iv.ad(stringBuilder.toString(), th, 1692244937);
                if (aa) {
                }
            }
        }
    }

    static int bt(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int i3;
        al aq;
        al alVar;
        int[] iArr;
        al ar;
        int[] iArr2;
        if (i == 100) {
            ds.am -= 598450988;
            i3 = ae[ds.am * 525540799];
            int i4 = ae[(ds.am * -757592335) + 1];
            int i5 = ae[(ds.am * 1139638858) + 2];
            if (i4 != 0) {
                aq = da.aq(i3, -550158556);
                if (aq.fo == null) {
                    aq.fo = new al[(i5 + 1)];
                }
                if (aq.fo.length <= i5) {
                    al[] alVarArr = new al[(i5 + 1)];
                    while (i2 < aq.fo.length) {
                        alVarArr[i2] = aq.fo[i2];
                        i2++;
                    }
                    aq.fo = alVarArr;
                }
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    if (aq.fo[i6] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("");
                        stringBuilder.append(i6);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                }
                alVar = new al();
                alVar.af = i4 * 956087861;
                i4 = aq.ao * 1;
                alVar.ao = i4;
                alVar.bc = i4 * -319185781;
                alVar.ah = -2139357867 * i5;
                alVar.aa = true;
                aq.fo[i5] = alVar;
                if (z) {
                    lj.az = alVar;
                } else {
                    au = alVar;
                }
                da.gk(aq, (byte) 2);
                return 1;
            }
            throw new RuntimeException();
        } else if (101 == i) {
            alVar = z ? lj.az : au;
            aq = da.aq(alVar.ao * 1405101851, -550158556);
            aq.fo[alVar.ah * -894967450] = null;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (2107259962 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            alVar = da.aq(iArr[i3 * 1793895046], -550158556);
            alVar.fo = null;
            da.gk(alVar, (byte) 2);
            return 1;
        } else if (i == 200) {
            ds.am += 1128905694;
            int i7 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * 862084014) + 1];
            ar = gi.ar(i7, i3, -1201935479);
            if (ar == null || i3 == -1) {
                iArr2 = ae;
                i3 = ds.am + 1099941509;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i3 = ds.am + 1492860386;
            ds.am = i3;
            iArr[(i3 * -173172610) - 1] = 1;
            if (z) {
                lj.az = ar;
                return 1;
            }
            au = ar;
            return 1;
        } else if (i != 145682263) {
            return 2;
        } else {
            iArr2 = ae;
            i3 = ds.am - 2025237846;
            ds.am = i3;
            ar = da.aq(iArr2[i3 * -757592335], -550158556);
            if (ar != null) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -206253961) - 1] = 1;
                if (z) {
                    lj.az = ar;
                    return 1;
                }
                au = ar;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am + 1745232167;
            ds.am = i3;
            iArr2[(i3 * -601693353) - 1] = 0;
            return 1;
        }
    }

    public static void bu(il ilVar) {
        ar.aq(ilVar, 2080822390, -1768146270);
    }

    public static void bw(il ilVar) {
        ar.aq(ilVar, ad, -1768146270);
    }

    static int by(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        al aq;
        boolean z2 = false;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            int i3 = iArr[i2 * -757592335];
            aq = da.aq(i3, -550158556);
            i2 = i3;
        } else {
            i2 = -1;
            aq = z ? lj.az : au;
        }
        int i4;
        if (i == 1000) {
            ds.am -= 2037155908;
            aq.ba = ae[ds.am * -757592335] * 1685885569;
            aq.bs = ae[(ds.am * -757592335) + 1] * -1450929481;
            aq.ab = ae[(ds.am * -757592335) + 2] * 1932562981;
            aq.av = ae[(ds.am * -757592335) + 3] * -122098513;
            da.gk(aq, (byte) 2);
            client.aq.fo(aq, 714194505);
            if (-1 == i2 || aq.af * 1845699613 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i2 >> 16], aq, false, -137813985);
            return 1;
        } else if (1001 == i) {
            ds.am -= 2037155908;
            aq.bm = ae[ds.am * -757592335] * -846283905;
            aq.bq = ae[(ds.am * -757592335) + 1] * -1937288673;
            aq.at = ae[(ds.am * -757592335) + 2] * -1629038693;
            aq.bk = ae[(ds.am * -757592335) + 3] * -458681677;
            da.gk(aq, (byte) 2);
            client.aq.fo(aq, 483047470);
            if (-1 == i2 || aq.af * 1845699613 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i2 >> 16], aq, false, 1190414645);
            return 1;
        } else if (i == 1003) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            boolean z3 = iArr[i2 * -757592335] == 1;
            if (z3 == aq.bv) {
                return 1;
            }
            aq.bv = z3;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (ce.cn == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            aq.gi = z2;
            return 1;
        } else if (i != PointerIconCompat.TYPE_CELL) {
            return 2;
        } else {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            aq.gn = z2;
            return 1;
        }
    }

    static int bz(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        al aq;
        boolean z2 = false;
        if (i >= -479514589) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            int i3 = iArr[i2 * -1234266584];
            aq = da.aq(i3, -550158556);
            i2 = i3;
        } else {
            i2 = -1;
            aq = z ? lj.az : au;
        }
        int i4;
        if (i == 1000) {
            ds.am -= 2037155908;
            aq.ba = ae[ds.am * -57448336] * -589489673;
            aq.bs = ae[(ds.am * -1597603674) + 1] * -1455793672;
            aq.ab = ae[(ds.am * -757592335) + 2] * -489440693;
            aq.av = ae[(ds.am * -1142653405) + 3] * 1526947453;
            da.gk(aq, (byte) 2);
            client.aq.fo(aq, 1640173494);
            if (-1 == i2 || aq.af * -827314867 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i2 >> 16], aq, false, -909834782);
            return 1;
        } else if (1001 == i) {
            ds.am += 1054013559;
            aq.bm = ae[ds.am * 182149384] * -846283905;
            aq.bq = ae[(ds.am * -757592335) + 1] * 1137381805;
            aq.at = ae[(ds.am * 1805735340) + 2] * -1629038693;
            aq.bk = ae[(ds.am * -757592335) + 3] * -458681677;
            da.gk(aq, (byte) 2);
            client.aq.fo(aq, 409513060);
            if (-1 == i2 || aq.af * 1640001160 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i2 >> 16], aq, false, -866539863);
            return 1;
        } else if (i == -1813198326) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            boolean z3 = iArr[i2 * -634339008] == 1;
            if (z3 == aq.bv) {
                return 1;
            }
            aq.bv = z3;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (ce.cn == i) {
            iArr = ae;
            i4 = ds.am - 1165374524;
            ds.am = i4;
            if (iArr[i4 * -577423120] == 1) {
                z2 = true;
            }
            aq.gi = z2;
            return 1;
        } else if (i != PointerIconCompat.TYPE_CELL) {
            return 2;
        } else {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            aq.gn = z2;
            return 1;
        }
    }

    static int ca(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static final void cb(al alVar, int i) {
        if (alVar.de != null) {
            if (alVar.gh == null) {
                alVar.gh = new int[alVar.de.length];
            }
            alVar.gh[i] = 545608863;
            return;
        }
        throw new RuntimeException();
    }

    static int cc(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        if (i == 2036325691) {
            iArr = ae;
            i2 = ds.am - 2011599152;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bd * 562220279;
            return 1;
        } else if (i == 1501) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bo * -1014301405;
            return 1;
        } else if (-1770407246 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -46162206) - 1] = alVar.bl * 1272191791;
            return 1;
        } else if (1503 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bf * 1027481992;
            return 1;
        } else if (i == 524268905) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bv ? 1 : 0;
            return 1;
        } else if (i != -1464474673) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bc * -2074805283;
            return 1;
        }
    }

    static int cd(int i, hw hwVar, boolean z) {
        al aq;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr = ae;
            int i2 = ds.am + 564452847;
            ds.am = i2;
            aq = da.aq(iArr[i2 * -757592335], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        if (i != 1927) {
            return 2;
        }
        if (ah * 407690037 >= 10) {
            throw new RuntimeException();
        } else if (aq.fh == null) {
            return 0;
        } else {
            il ilVar = new il();
            ilVar.ar = aq;
            ilVar.ad = aq.fh;
            ilVar.ag = (ah * -1775034995) - 1809830919;
            client.nx.aq(ilVar);
            return 1;
        }
    }

    static int ce(int i, hw hwVar, boolean z) {
        al aq;
        int[] iArr;
        int i2;
        Object[] objArr = null;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr2 = ae;
            int i3 = ds.am + 564452847;
            ds.am = i3;
            aq = da.aq(iArr2[i3 * -757592335], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        String[] strArr = ak;
        int i4 = as - 1569802087;
        as = i4;
        String str = strArr[i4 * -1883296125];
        if (str.length() <= 0 || str.charAt(str.length() - 1) != 43671) {
            iArr = null;
        } else {
            iArr = ae;
            int i5 = ds.am + 564452847;
            ds.am = i5;
            i5 = iArr[i5 * 31051547];
            if (i5 > 0) {
                iArr = new int[i5];
                while (true) {
                    i2 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    int[] iArr3 = ae;
                    int i6 = ds.am + 139484945;
                    ds.am = i6;
                    iArr[i2] = iArr3[i6 * -757592335];
                    i5 = i2;
                }
            } else {
                iArr = null;
            }
            str = str.substring(0, str.length() - 1);
        }
        Object[] objArr2 = new Object[(str.length() + 1)];
        for (i2 = objArr2.length - 1; i2 >= 1; i2--) {
            int i7;
            if (str.charAt(i2 - 1) == 17683) {
                String[] strArr2 = ak;
                i7 = as + 1490481109;
                as = i7;
                objArr2[i2] = strArr2[i7 * -1000695140];
            } else {
                int[] iArr4 = ae;
                i7 = ds.am + 1607298914;
                ds.am = i7;
                objArr2[i2] = new Integer(iArr4[i7 * -757592335]);
            }
        }
        int[] iArr5 = ae;
        i2 = ds.am + 564452847;
        ds.am = i2;
        i4 = iArr5[i2 * 1891523303];
        if (i4 != -1) {
            objArr2[0] = new Integer(i4);
            objArr = objArr2;
        }
        if (i == af.al) {
            aq.ea = objArr;
        } else if (i == 1401) {
            aq.en = objArr;
        } else if (i == -1267749008) {
            aq.ei = objArr;
        } else if (i == -2029282243) {
            aq.ey = objArr;
        } else if (2017913246 == i) {
            aq.ed = objArr;
        } else if (1405 == i) {
            aq.er = objArr;
        } else if (i == 761978398) {
            aq.ew = objArr;
        } else if (CommsResult.RESULT_PENDING_TRANSACTIONS_AVAILABLE == i) {
            aq.el = objArr;
            aq.eb = iArr;
        } else if (1408 == i) {
            aq.ex = objArr;
        } else if (570480828 == i) {
            aq.ej = objArr;
        } else if (i == 594440982) {
            aq.eu = objArr;
        } else if (-799370738 == i) {
            aq.ek = objArr;
        } else if (1649776237 == i) {
            aq.eg = objArr;
        } else if (-79822014 == i) {
            aq.ev = objArr;
            aq.ep = iArr;
        } else if (-1975089349 == i) {
            aq.em = objArr;
            aq.ef = iArr;
        } else if (552183290 == i) {
            aq.ee = objArr;
        } else if (1140003306 == i) {
            aq.es = objArr;
        } else if (-1531700329 == i) {
            aq.fq = objArr;
        } else if (1679468961 == i) {
            aq.fx = objArr;
        } else if (i == 761824442) {
            aq.ft = objArr;
        } else if (-598379172 == i) {
            aq.fw = objArr;
        } else if (-1802351352 == i) {
            aq.fn = objArr;
        } else if (i == 1423) {
            aq.fm = objArr;
        } else if (1424 == i) {
            aq.fs = objArr;
        } else if (215183150 == i) {
            aq.fy = objArr;
        } else if (1088945846 == i) {
            aq.fr = objArr;
        } else if (1427 != i) {
            return 2;
        } else {
            aq.fh = objArr;
        }
        aq.eh = true;
        return 1;
    }

    static int cf(int i, hw hwVar, boolean z) {
        al aq;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr = ae;
            int i2 = ds.am + 564452847;
            ds.am = i2;
            aq = da.aq(iArr[i2 * -757592335], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        if (i != -1894711750) {
            return 2;
        }
        if (ah * -1956660933 >= 10) {
            throw new RuntimeException();
        } else if (aq.fh == null) {
            return 0;
        } else {
            il ilVar = new il();
            ilVar.ar = aq;
            ilVar.ad = aq.fh;
            ilVar.ag = (ah * 2099397703) - 1809830919;
            client.nx.aq(ilVar);
            return 1;
        }
    }

    static int cg(int i, hw hwVar, boolean z) {
        al aq;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr = ae;
            int i2 = ds.am + 564452847;
            ds.am = i2;
            aq = da.aq(iArr[i2 * -757592335], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        if (i != 1927) {
            return 2;
        }
        if (ah * 407690037 >= 10) {
            throw new RuntimeException();
        } else if (aq.fh == null) {
            return 0;
        } else {
            il ilVar = new il();
            ilVar.ar = aq;
            ilVar.ad = aq.fh;
            ilVar.ag = (ah * -1775034995) - 1809830919;
            client.nx.aq(ilVar);
            return 1;
        }
    }

    static int ch(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static final void ci(al alVar, int i) {
        if (alVar.de != null) {
            if (alVar.gh == null) {
                alVar.gh = new int[alVar.de.length];
            }
            alVar.gh[i] = Integer.MAX_VALUE;
            return;
        }
        throw new RuntimeException();
    }

    static int cj(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        int i3;
        al aq;
        boolean z2 = false;
        if (i >= 23648400) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            aq = da.aq(i3, -550158556);
            i2 = i3;
        } else {
            i2 = -1;
            aq = z ? lj.az : au;
        }
        int i4;
        int i5;
        if (i == 1106351984) {
            ds.am -= 1333407779;
            bh.gb(aq, ae[ds.am * -1396073045], ae[(ds.am * -757592335) + 1], 1741475310);
            return 1;
        } else if (i == 1101) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.br = iArr[i4 * 669122761] * 272175751;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 719852313) {
            iArr = ae;
            i2 = ds.am + 1436444408;
            ds.am = i2;
            aq.bt = iArr[i2 * -41208932] == 1;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1103 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.bz = iArr[i4 * -2060566009] * -1784857337;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1925762212) {
            iArr = ae;
            i4 = ds.am + 804135654;
            ds.am = i4;
            aq.bp = iArr[i4 * -757592335] * -744231141;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1105 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cj = iArr[i4 * 1277284591] * -1201409342;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1106) {
            iArr = ae;
            i4 = ds.am - 419966733;
            ds.am = i4;
            aq.cq = iArr[i4 * 1106368302] * -480741789;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1107) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.cn = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1108 == i) {
            aq.ce = -1360803229;
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cy = iArr[i4 * 1914321947] * -927961631;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1109) {
            ds.am += 1057801123;
            aq.cx = ae[ds.am * -1904755666] * 116822575;
            aq.ct = ae[(ds.am * -327704928) + 1] * 91905667;
            aq.ck = ae[(ds.am * -757592335) + 2] * 625378095;
            aq.co = ae[(ds.am * -757592335) + 3] * -1450063701;
            aq.cu = ae[(ds.am * 1438487229) + 4] * -1788635289;
            aq.cl = ae[(ds.am * -1523475864) + 5] * -728599433;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1860686122 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * 161083802];
            if (i3 == aq.cr * -496841620) {
                return 1;
            }
            aq.cr = i3 * 1131620129;
            aq.fb = 0;
            aq.fp = 0;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1550358569 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.cf = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1112 == i) {
            String[] strArr = ak;
            i4 = as + 652945600;
            as = i4;
            String str = strArr[i4 * -1883296125];
            if (str.equals(aq.dm)) {
                return 1;
            }
            aq.dm = str;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == -1669693125) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.dd = iArr[i4 * -757592335] * -996713033;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1622744359 == i) {
            ds.am += 1693358541;
            aq.di = ae[ds.am * -757592335] * 332285219;
            aq.dl = ae[(ds.am * 2116526846) + 1] * -1547541938;
            aq.dv = ae[(ds.am * -300075426) + 2] * 970340041;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1115) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.dr = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1116 == i) {
            iArr = ae;
            i4 = ds.am + 317521986;
            ds.am = i4;
            aq.cw = iArr[i4 * -1781109472] * -2114440768;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1117) {
            iArr = ae;
            i4 = ds.am - 957323508;
            ds.am = i4;
            aq.cp = iArr[i4 * -123882807] * 1407371587;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1658705649 == i) {
            iArr = ae;
            i2 = ds.am - 1226108564;
            ds.am = i2;
            if (iArr[i2 * -1880697631] == 1) {
                z2 = true;
            }
            aq.ci = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (-1988915614 == i) {
            iArr = ae;
            i2 = ds.am + 100878335;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.cb = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1120) {
            ds.am += 1128905694;
            aq.bu = ae[ds.am * -757592335] * 1956842863;
            aq.bw = ae[(ds.am * 7397033) + 1] * 1451678031;
            da.gk(aq, (byte) 2);
            if (-1 == i2 || aq.af * 1656600726 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i2 >> 16], aq, false, -1049235463);
            return 1;
        } else if (i == 1121) {
            al.fm(aq.ao * -1227024251, aq.ah * 988026877, -2093127516);
            client.lh = aq;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 958528909) {
            iArr = ae;
            i4 = ds.am + 1274311688;
            ds.am = i4;
            aq.cm = iArr[i4 * -757592335] * -728785665;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1395716711) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.be = iArr[i4 * -289672850] * 1789727225;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1124) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.by = iArr[i4 * 76636068] * -995855343;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 322894821) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            ep epVar = (ep) oz.ad(ix.aq(2130903090), iArr[i4 * 1851901523], (byte) -9);
            if (epVar == null) {
                return 1;
            }
            aq.bn = epVar;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1126) {
            iArr = ae;
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
            iArr = ae;
            i5 = ds.am - 642280788;
            ds.am = i5;
            if (iArr[i5 * -1217250865] == 1) {
                z2 = true;
            }
            aq.cg = z2;
            return 1;
        }
    }

    static int ck(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        if (1700 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.fu * -1806633963;
            return 1;
        } else if (1701 == i) {
            if (-1 != alVar.fu * -1806633963) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = alVar.fc * -1405353077;
                return 1;
            }
            int[] iArr2 = ae;
            int i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = 0;
            return 1;
        } else if (1702 != i) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.ah * 988026877;
            return 1;
        }
    }

    static int cl(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        int i3;
        String[] strArr;
        if (1800 == i) {
            iArr = ae;
            i2 = ds.am - 128628061;
            ds.am = i2;
            iArr[(i2 * 1312619623) - 1] = et.ar(hs.hy(alVar, (byte) 102), -727586179);
            return 1;
        } else if (i == -2091143570) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * 929899846] - 1;
            if (alVar.dz == null || i3 >= alVar.dz.length || alVar.dz[i3] == null) {
                strArr = ak;
                i3 = as - 857253983;
                as = i3;
                strArr[(i3 * -2097443389) - 1] = "";
                return 1;
            }
            String[] strArr2 = ak;
            int i4 = as - 985808190;
            as = i4;
            strArr2[(i4 * -1883296125) - 1] = alVar.dz[i3];
            return 1;
        } else if (-1491048876 != i) {
            return 2;
        } else {
            if (alVar.dg == null) {
                strArr = ak;
                i3 = as - 1490481109;
                as = i3;
                strArr[(i3 * -1883296125) - 1] = "";
                return 1;
            }
            String[] strArr3 = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr3[(i2 * -1883296125) - 1] = alVar.dg;
            return 1;
        }
    }

    static int cm(int i, hw hwVar, boolean z) {
        int i2;
        al aq;
        int i3 = 0;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq = da.aq(iArr[i2 * 957323568], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        da.gk(aq, (byte) 2);
        if (1236494771 == i || i == 1623718349 || 1212 == i) {
            ds.am += 21139395;
            int i4 = ae[ds.am * -757592335];
            i2 = ae[(ds.am * -757592335) + 1];
            aq.fu = 316750653 * i4;
            aq.fc = i2 * -352121821;
            dh aq2 = gl.aq(i4, 1614725260);
            aq.ck = aq2.av * 1749847479;
            aq.co = aq2.at * 807558895;
            aq.cu = aq2.bk * -1880914010;
            aq.cx = aq2.ba * -800484707;
            aq.ct = aq2.bs * -1403539525;
            aq.cl = aq2.ab * 2000470311;
            if (-1693270697 == i) {
                aq.ch = 0;
            } else {
                i4 = i == -830171334 ? 1 : 0;
                if (1 == aq2.bm * -1589886059) {
                    i3 = 1;
                }
                if ((i4 | i3) != 0) {
                    aq.ch = 871841815;
                } else {
                    aq.ch = 1743683630;
                }
            }
            if (aq.cz * 1395420784 > 0) {
                aq.cl = ((aq.cl * 1193542398) / (aq.cz * -423299685)) * 137430647;
                return 1;
            } else if (aq.bm * 2059826880 <= 0) {
                return 1;
            } else {
                aq.cl = ((aq.cl * 1440114912) / (aq.bm * -700962700)) * 137430647;
                return 1;
            }
        } else if (1201 == i) {
            aq.ce = 1573360838;
            int[] iArr2 = ae;
            i3 = ds.am + 2058159851;
            ds.am = i3;
            aq.cy = iArr2[i3 * -757592335] * -927961631;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            aq.ce = 1320656580;
            aq.cy = da.jc.aq.ak(-1839682627) * -548337651;
            return 1;
        }
    }

    static int cn(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        al aq;
        boolean z2;
        boolean z3 = false;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq = da.aq(iArr[i2 * -757592335], -550158556);
            z2 = false;
        } else {
            aq = z ? lj.az : au;
            z2 = true;
        }
        int i3;
        int i4;
        String[] strArr;
        if (i == 1300) {
            iArr = ae;
            i3 = ds.am + 1846833207;
            ds.am = i3;
            i4 = iArr[i3 * -757592335] - 1;
            if (i4 < 0 || i4 > 9) {
                as += 1490481109;
                return 1;
            }
            String[] strArr2 = ak;
            i2 = as + 1490481109;
            as = i2;
            aq.ac(i4, strArr2[i2 * -1931303107], -675413399);
            return 1;
        } else if (i == -2034634107) {
            ds.am -= 1815789417;
            aq.dj = gi.ar(ae[ds.am * 381508398], ae[(ds.am * -804992094) + 1], -1201935479);
            return 1;
        } else if (-966618735 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq.ez = iArr[i2 * 1977297041] == 1;
            return 1;
        } else if (i == 1303) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            aq.et = iArr[i3 * -480690828] * -1973327624;
            return 1;
        } else if (i == -437606054) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            aq.eq = iArr[i3 * -757592335] * 50248067;
            return 1;
        } else if (-109238163 == i) {
            strArr = ak;
            i3 = as + 472829035;
            as = i3;
            aq.dg = strArr[i3 * 404970018];
            return 1;
        } else if (1306 == i) {
            strArr = ak;
            i3 = as - 1021359143;
            as = i3;
            aq.eo = strArr[i3 * -1883296125];
            return 1;
        } else if (i == 1307) {
            aq.dz = null;
            return 1;
        } else if (1308 == i) {
            iArr = ae;
            i2 = ds.am - 1053772878;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z3 = true;
            }
            aq.gv = z3;
            return 1;
        } else if (i == 1350) {
            int i5;
            byte[] bArr;
            byte[] bArr2;
            if (z2) {
                ds.am += 1349561174;
                i5 = 0;
                while (i5 < 10 && ae[(ds.am * 1243964299) + i5] >= 0) {
                    i5 += 2;
                }
                if (i5 > 0) {
                    i4 = i5 / 2;
                    bArr = new byte[i4];
                    bArr2 = new byte[i4];
                    i2 = i5;
                    while (true) {
                        i2 -= 2;
                        if (i2 < 0) {
                            break;
                        }
                        i5 = i2 / 2;
                        bArr[i5] = (byte) ae[(ds.am * -757592335) + i2];
                        bArr2[i5] = (byte) ae[((ds.am * -757592335) + i2) + 1];
                    }
                } else {
                    bArr2 = null;
                    bArr = null;
                }
            } else {
                ds.am += 1128905694;
                bArr2 = new byte[]{(byte) ae[(ds.am * -757592335) + 1]};
                bArr = new byte[]{(byte) ae[ds.am * -433285220]};
            }
            int[] iArr2 = ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            i2 = iArr2[i5 * -525465778] - 1;
            if (i2 < 0 || i2 > 9) {
                throw new RuntimeException();
            }
            iw.ak(aq, i2, bArr, bArr2, (byte) 38);
            return 1;
        } else if (i == -1261278514) {
            ds.am += 677493922;
            byte b = (byte) ae[ds.am * 260171233];
            byte b2 = (byte) ae[(ds.am * 221960065) + 1];
            iw.ak(aq, 10, new byte[]{b}, new byte[]{b2}, (byte) 98);
            return 1;
        } else if (-1431606390 == i) {
            ds.am -= 1179679762;
            i4 = ae[ds.am * -1100375016] - 1;
            i3 = ae[(ds.am * -757592335) + 1];
            i2 = ae[(ds.am * -590445853) + 2];
            if (i4 < 0 || i4 > 9) {
                throw new RuntimeException();
            }
            ni.as(aq, i4, i3, i2, 2113532217);
            return 1;
        } else if (2139509932 == i) {
            iArr = ae;
            i3 = ds.am + 1825086142;
            ds.am = i3;
            i4 = iArr[i3 * -757592335];
            int[] iArr3 = ae;
            i2 = ds.am + 787069674;
            ds.am = i2;
            ni.as(aq, 10, i4, iArr3[i2 * -757592335], 1827195318);
            return 1;
        } else if (-476648635 == i) {
            ds.am += 564452847;
            i4 = ae[ds.am * -757592335] - 1;
            if (i4 < 0 || i4 > 9) {
                throw new RuntimeException();
            }
            gg.ag(aq, i4, -2036700880);
            return 1;
        } else if (i != 1355) {
            return 2;
        } else {
            gg.ag(aq, 10, -2116110310);
            return 1;
        }
    }

    static int co(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        if (-1809873646 == i) {
            iArr = ae;
            i2 = ds.am + 2123532659;
            ds.am = i2;
            iArr[(i2 * 1079795485) - 1] = alVar.fu * -1806633963;
            return 1;
        } else if (1701 == i) {
            if (-1 != alVar.fu * -1806633963) {
                iArr = ae;
                i2 = ds.am - 1350120310;
                ds.am = i2;
                iArr[(i2 * -1708106433) - 1] = alVar.fc * -1328827391;
                return 1;
            }
            int[] iArr2 = ae;
            int i3 = ds.am - 1917000239;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = 0;
            return 1;
        } else if (1702 != i) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am + 212821480;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.ah * 988026877;
            return 1;
        }
    }

    static final void cp(al alVar, int i) {
        if (alVar.de != null) {
            if (alVar.gh == null) {
                alVar.gh = new int[alVar.de.length];
            }
            alVar.gh[i] = Integer.MAX_VALUE;
            return;
        }
        throw new RuntimeException();
    }

    static int cq(int i, hw hwVar, boolean z) {
        int i2;
        al aq;
        int i3 = 0;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq = da.aq(iArr[i2 * -757592335], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        da.gk(aq, (byte) 2);
        if (1200 == i || i == 1205 || 1212 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            int i4 = ae[(ds.am * -757592335) + 1];
            aq.fu = 316750653 * i2;
            aq.fc = i4 * -352121821;
            dh aq2 = gl.aq(i2, 2106784259);
            aq.ck = aq2.av * 1749847479;
            aq.co = aq2.at * 807558895;
            aq.cu = aq2.bk * 828120169;
            aq.cx = aq2.ba * -800484707;
            aq.ct = aq2.bs * -1403539525;
            aq.cl = aq2.ab * 2000470311;
            if (1205 == i) {
                aq.ch = 0;
            } else {
                i2 = i == 1212 ? 1 : 0;
                if (1 == aq2.bm * -1954437925) {
                    i3 = 1;
                }
                if ((i2 | i3) != 0) {
                    aq.ch = 871841815;
                } else {
                    aq.ch = 1743683630;
                }
            }
            i2 = -423299685;
            if (aq.cz * -423299685 > 0) {
                i3 = aq.cl * 1440114912;
                i4 = aq.cz;
            } else if (aq.bm * -499317633 <= 0) {
                return 1;
            } else {
                i3 = 1440114912 * aq.cl;
                i4 = aq.bm;
                i2 = -499317633;
            }
            aq.cl = (i3 / (i2 * i4)) * 137430647;
            return 1;
        } else if (1201 == i) {
            aq.ce = 1573360838;
            int[] iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            aq.cy = iArr2[i3 * -757592335] * -927961631;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            aq.ce = 212557609;
            aq.cy = da.jc.aq.ak(-1989157715) * -927961631;
            return 1;
        }
    }

    static int cr(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        if (i == ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bd * 562220279;
            return 1;
        } else if (i == 1501) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bo * -1014301405;
            return 1;
        } else if (1502 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bl * 1272191791;
            return 1;
        } else if (1503 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bf * 1813264797;
            return 1;
        } else if (i == 1504) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bv ? 1 : 0;
            return 1;
        } else if (i != 1505) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bc * -38514547;
            return 1;
        }
    }

    static int cs(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        if (i == -930721189) {
            iArr = ae;
            i2 = ds.am - 1856982230;
            ds.am = i2;
            iArr[(i2 * 862154680) - 1] = alVar.bd * 562220279;
            return 1;
        } else if (i == 1501) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bo * -1014301405;
            return 1;
        } else if (153181130 == i) {
            iArr = ae;
            i2 = ds.am - 909021558;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bl * 2090612430;
            return 1;
        } else if (1503 == i) {
            iArr = ae;
            i2 = ds.am - 509000654;
            ds.am = i2;
            iArr[(i2 * 123240195) - 1] = alVar.bf * 1813264797;
            return 1;
        } else if (i == 1504) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 165417314) - 1] = alVar.bv ? 1 : 0;
            return 1;
        } else if (i != 1505) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am + 1659425201;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bc * 324045275;
            return 1;
        }
    }

    static int ct(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        if (1600 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bg * 817114559;
            return 1;
        } else if (1601 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bx * -1344834291;
            return 1;
        } else if (1602 == i) {
            String[] strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = alVar.dm;
            return 1;
        } else if (i == 1603) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bu * -1004867185;
            return 1;
        } else if (i == 1604) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bw * 901029295;
            return 1;
        } else if (i == 1605) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cl * -491867321;
            return 1;
        } else if (i == 1606) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.ck * -1022461825;
            return 1;
        } else if (i == 1607) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cu * 2002818135;
            return 1;
        } else if (i == 1608) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.co * 1019998723;
            return 1;
        } else if (i == 1609) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bz * -39608137;
            return 1;
        } else if (1610 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.by * 1175387377;
            return 1;
        } else if (i == 1611) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.br * 1839990687;
            return 1;
        } else if (1612 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.be * 122478665;
            return 1;
        } else if (1613 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bn.ad(2143144622);
            return 1;
        } else if (1614 != i) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cg ? 1 : 0;
            return 1;
        }
    }

    static int cu(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        int i3;
        String[] strArr;
        if (1800 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = et.ar(hs.hy(alVar, (byte) 16), -1855463464);
            return 1;
        } else if (i == 1801) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335] - 1;
            if (alVar.dz == null || i3 >= alVar.dz.length || alVar.dz[i3] == null) {
                strArr = ak;
                i3 = as - 1490481109;
                as = i3;
                strArr[(i3 * -1883296125) - 1] = "";
                return 1;
            }
            String[] strArr2 = ak;
            int i4 = as - 1490481109;
            as = i4;
            strArr2[(i4 * -1883296125) - 1] = alVar.dz[i3];
            return 1;
        } else if (1802 != i) {
            return 2;
        } else {
            if (alVar.dg == null) {
                strArr = ak;
                i3 = as - 1490481109;
                as = i3;
                strArr[(i3 * -1883296125) - 1] = "";
                return 1;
            }
            String[] strArr3 = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr3[(i2 * -1883296125) - 1] = alVar.dg;
            return 1;
        }
    }

    static int cv(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        int i3;
        al aq;
        boolean z2 = false;
        if (i >= -2116658889) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            iArr = ae;
            i2 = ds.am + 1095544105;
            ds.am = i2;
            i3 = iArr[i2 * -323472353];
            aq = da.aq(i3, -550158556);
            i2 = i3;
        } else {
            i2 = -1;
            aq = z ? lj.az : au;
        }
        int i4;
        int i5;
        if (i == 1100) {
            ds.am += 1128905694;
            bh.gb(aq, ae[ds.am * -757592335], ae[(ds.am * -757592335) + 1], 2135375427);
            return 1;
        } else if (i == 403353700) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.br = iArr[i4 * -757592335] * 1867852178;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == -1875246663) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq.bt = iArr[i2 * -757592335] == 1;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1103 == i) {
            iArr = ae;
            i4 = ds.am + 492709257;
            ds.am = i4;
            aq.bz = iArr[i4 * -757592335] * -1784857337;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1131253912) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.bp = iArr[i4 * 1906406709] * -1866717737;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1105 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cj = iArr[i4 * -757592335] * -1727679139;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1106) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cq = iArr[i4 * -757592335] * -800079115;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1948781317) {
            iArr = ae;
            i2 = ds.am - 1957007058;
            ds.am = i2;
            if (iArr[i2 * -2003991132] == 1) {
                z2 = true;
            }
            aq.cn = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (-533320957 == i) {
            aq.ce = 1955601550;
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cy = iArr[i4 * -757592335] * -927961631;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1109) {
            ds.am -= 1553295330;
            aq.cx = ae[ds.am * 1111727722] * 116822575;
            aq.ct = ae[(ds.am * -757592335) + 1] * 91905667;
            aq.ck = ae[(ds.am * -743727971) + 2] * 1781310077;
            aq.co = ae[(ds.am * 1369989987) + 3] * 1027846422;
            aq.cu = ae[(ds.am * -1087475404) + 4] * -6105544;
            aq.cl = ae[(ds.am * -757592335) + 5] * -2090239922;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1215775393 == i) {
            iArr = ae;
            i2 = ds.am - 678701306;
            ds.am = i2;
            i3 = iArr[i2 * -1933812237];
            if (i3 == aq.cr * -157920017) {
                return 1;
            }
            aq.cr = i3 * -2140553444;
            aq.fb = 0;
            aq.fp = 0;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (-1269991233 == i) {
            iArr = ae;
            i2 = ds.am - 901486963;
            ds.am = i2;
            if (iArr[i2 * 1720439918] == 1) {
                z2 = true;
            }
            aq.cf = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (-1588930048 == i) {
            String[] strArr = ak;
            i4 = as + 1490481109;
            as = i4;
            String str = strArr[i4 * -1883296125];
            if (str.equals(aq.dm)) {
                return 1;
            }
            aq.dm = str;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1113) {
            iArr = ae;
            i4 = ds.am + 950476627;
            ds.am = i4;
            aq.dd = iArr[i4 * -757592335] * -996713033;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1114 == i) {
            ds.am += 1693358541;
            aq.di = ae[ds.am * -1127970871] * 332285219;
            aq.dl = ae[(ds.am * -757592335) + 1] * 452292553;
            aq.dv = ae[(ds.am * -823681456) + 2] * 108484789;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1115) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * -757592335] == 1) {
                z2 = true;
            }
            aq.dr = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1116 == i) {
            iArr = ae;
            i4 = ds.am - 1459437904;
            ds.am = i4;
            aq.cw = iArr[i4 * -757592335] * -450241457;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1117) {
            iArr = ae;
            i4 = ds.am - 816807419;
            ds.am = i4;
            aq.cp = iArr[i4 * 877475812] * 1407371587;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1118 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * 1211268953] == 1) {
                z2 = true;
            }
            aq.ci = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (1119 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            if (iArr[i2 * 160179009] == 1) {
                z2 = true;
            }
            aq.cb = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1120) {
            ds.am += 1262872124;
            aq.bu = ae[ds.am * 1816565783] * -2032666211;
            aq.bw = ae[(ds.am * 1455377406) + 1] * 394835716;
            da.gk(aq, (byte) 2);
            if (-1 == i2 || aq.af * -789232156 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i2 >> 16], aq, false, 1486496864);
            return 1;
        } else if (i == -1753867808) {
            al.fm(aq.ao * -1227024251, aq.ah * 988026877, -2112005209);
            client.lh = aq;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1122) {
            iArr = ae;
            i4 = ds.am + 1302488988;
            ds.am = i4;
            aq.cm = iArr[i4 * -757592335] * -728785665;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1123) {
            iArr = ae;
            i4 = ds.am - 1907113066;
            ds.am = i4;
            aq.be = iArr[i4 * -757592335] * 1789727225;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1124) {
            iArr = ae;
            i4 = ds.am - 49496313;
            ds.am = i4;
            aq.by = iArr[i4 * -835353765] * -995855343;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == -123545611) {
            iArr = ae;
            i4 = ds.am + 280932134;
            ds.am = i4;
            ep epVar = (ep) oz.ad(ix.aq(2130903090), iArr[i4 * 866658440], (byte) -62);
            if (epVar == null) {
                return 1;
            }
            aq.bn = epVar;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (i == 1126) {
            iArr = ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -625485572] == 1) {
                z2 = true;
            }
            aq.cv = z2;
            return 1;
        } else if (-868018193 != i) {
            return 2;
        } else {
            iArr = ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.cg = z2;
            return 1;
        }
    }

    static final void cw(al alVar, int i, int i2, int i3) {
        if (alVar.f0do != null) {
            alVar.f0do[i] = i2;
            alVar.dy[i] = i3;
            return;
        }
        throw new RuntimeException();
    }

    static int cx(int i, hw hwVar, boolean z) {
        al alVar = z ? lj.az : au;
        int[] iArr;
        int i2;
        if (2122258633 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bg * 817114559;
            return 1;
        } else if (2062848535 == i) {
            iArr = ae;
            i2 = ds.am + 51083048;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bx * -735997748;
            return 1;
        } else if (1869265978 == i) {
            String[] strArr = ak;
            i2 = as + 1331765845;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = alVar.dm;
            return 1;
        } else if (i == 391517282) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 1912055591) - 1] = alVar.bu * 1326192037;
            return 1;
        } else if (i == 585342795) {
            iArr = ae;
            i2 = ds.am + 530039648;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bw * 901029295;
            return 1;
        } else if (i == 2008055005) {
            iArr = ae;
            i2 = ds.am - 1185150301;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cl * -491867321;
            return 1;
        } else if (i == 371357455) {
            iArr = ae;
            i2 = ds.am + 978335042;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.ck * -1437994959;
            return 1;
        } else if (i == 1607) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cu * 628972761;
            return 1;
        } else if (i == 1937467356) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.co * 1019998723;
            return 1;
        } else if (i == 44163752) {
            iArr = ae;
            i2 = ds.am - 1451019295;
            ds.am = i2;
            iArr[(i2 * 303012009) - 1] = alVar.bz * -39608137;
            return 1;
        } else if (1610 == i) {
            iArr = ae;
            i2 = ds.am + 1334132639;
            ds.am = i2;
            iArr[(i2 * -299562258) - 1] = alVar.by * -1571889244;
            return 1;
        } else if (i == 1611) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -810848436) - 1] = alVar.br * -1914704130;
            return 1;
        } else if (1612 == i) {
            iArr = ae;
            i2 = ds.am + 491887161;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.be * 122478665;
            return 1;
        } else if (93295387 == i) {
            iArr = ae;
            i2 = ds.am + 1184350552;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bn.ad(2138980231);
            return 1;
        } else if (336177956 != i) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am - 2026571600;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cg ? 1 : 0;
            return 1;
        }
    }

    static int cy(int i, hw hwVar, boolean z) {
        al aq;
        int[] iArr;
        int i2;
        Object[] objArr = null;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr2 = ae;
            int i3 = ds.am + 564452847;
            ds.am = i3;
            aq = da.aq(iArr2[i3 * -757592335], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        String[] strArr = ak;
        int i4 = as - 680104326;
        as = i4;
        String str = strArr[i4 * -1883296125];
        if (str.length() <= 0 || str.charAt(str.length() - 1) != 38617) {
            iArr = null;
        } else {
            iArr = ae;
            int i5 = ds.am + 564452847;
            ds.am = i5;
            i5 = iArr[i5 * 1122406652];
            if (i5 > 0) {
                iArr = new int[i5];
                while (true) {
                    i2 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    int[] iArr3 = ae;
                    int i6 = ds.am + 2083661145;
                    ds.am = i6;
                    iArr[i2] = iArr3[i6 * -757592335];
                    i5 = i2;
                }
            } else {
                iArr = null;
            }
            str = str.substring(0, str.length() - 1);
        }
        Object[] objArr2 = new Object[(str.length() + 1)];
        for (i2 = objArr2.length - 1; i2 >= 1; i2--) {
            int i7;
            if (str.charAt(i2 - 1) == 's') {
                String[] strArr2 = ak;
                i7 = as - 1177067450;
                as = i7;
                objArr2[i2] = strArr2[i7 * 238817104];
            } else {
                int[] iArr4 = ae;
                i7 = ds.am + 564452847;
                ds.am = i7;
                objArr2[i2] = new Integer(iArr4[i7 * -757592335]);
            }
        }
        int[] iArr5 = ae;
        i2 = ds.am + 564452847;
        ds.am = i2;
        i4 = iArr5[i2 * -757592335];
        if (i4 != -1) {
            objArr2[0] = new Integer(i4);
            objArr = objArr2;
        }
        if (i == -1963751496) {
            aq.ea = objArr;
        } else if (i == -252142861) {
            aq.en = objArr;
        } else if (i == 1029532388) {
            aq.ei = objArr;
        } else if (i == -880580178) {
            aq.ey = objArr;
        } else if (833782246 == i) {
            aq.ed = objArr;
        } else if (-215623051 == i) {
            aq.er = objArr;
        } else if (i == CommsResult.RESULT_ACCOUNT_CREATION_ERROR) {
            aq.ew = objArr;
        } else if (-2101475708 == i) {
            aq.el = objArr;
            aq.eb = iArr;
        } else if (336393282 == i) {
            aq.ex = objArr;
        } else if (1409 == i) {
            aq.ej = objArr;
        } else if (i == 1410) {
            aq.eu = objArr;
        } else if (2052075237 == i) {
            aq.ek = objArr;
        } else if (335387781 == i) {
            aq.eg = objArr;
        } else if (1414 == i) {
            aq.ev = objArr;
            aq.ep = iArr;
        } else if (1415 == i) {
            aq.em = objArr;
            aq.ef = iArr;
        } else if (959297684 == i) {
            aq.ee = objArr;
        } else if (1417 == i) {
            aq.es = objArr;
        } else if (1418 == i) {
            aq.fq = objArr;
        } else if (-968309963 == i) {
            aq.fx = objArr;
        } else if (i == 649018119) {
            aq.ft = objArr;
        } else if (458233900 == i) {
            aq.fw = objArr;
        } else if (121536541 == i) {
            aq.fn = objArr;
        } else if (i == -590256364) {
            aq.fm = objArr;
        } else if (-1257454369 == i) {
            aq.fs = objArr;
        } else if (1425 == i) {
            aq.fy = objArr;
        } else if (636482966 == i) {
            aq.fr = objArr;
        } else if (1427 != i) {
            return 2;
        } else {
            aq.fh = objArr;
        }
        aq.eh = true;
        return 1;
    }

    static int cz(int i, hw hwVar, boolean z) {
        al aq;
        if (i >= 411091707) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            int[] iArr = ae;
            int i2 = ds.am + 946105519;
            ds.am = i2;
            aq = da.aq(iArr[i2 * -286164845], -550158556);
        } else {
            aq = z ? lj.az : au;
        }
        if (i != -81807618) {
            return 2;
        }
        if (ah * 504388250 >= 10) {
            throw new RuntimeException();
        } else if (aq.fh == null) {
            return 0;
        } else {
            il ilVar = new il();
            ilVar.ar = aq;
            ilVar.ad = aq.fh;
            ilVar.ag = (ah * -1775034995) - 100289413;
            client.nx.aq(ilVar);
            return 1;
        }
    }

    static int da(int i, hw hwVar, boolean z) {
        if (i == -1301560504) {
            ds.am += 1693358541;
            ij.bj(ae[ds.am * 1821152692], ae[(ds.am * -350163971) + 1], ae[(ds.am * -1229157288) + 2], (byte) -6);
            return 1;
        } else if (i == 3201) {
            int[] iArr = ae;
            int i2 = ds.am - 1466381360;
            ds.am = i2;
            eq.bh(iArr[i2 * -695284905], -1462722037);
            return 1;
        } else if (i != 3202) {
            return 2;
        } else {
            ds.am += 1128905694;
            ho.bt(ae[ds.am * -517670752], ae[(ds.am * -860546494) + 1], -1514030809);
            return 1;
        }
    }

    static int db(int i, hw hwVar, boolean z) {
        if (i == 3200) {
            ds.am += 1517134664;
            ij.bj(ae[ds.am * 2004825158], ae[(ds.am * -1189373735) + 1], ae[(ds.am * -757592335) + 2], (byte) 45);
            return 1;
        } else if (i == 3201) {
            int[] iArr = ae;
            int i2 = ds.am + 1543005458;
            ds.am = i2;
            eq.bh(iArr[i2 * -136901982], -1850515060);
            return 1;
        } else if (i != 134684748) {
            return 2;
        } else {
            ds.am += 1128905694;
            ho.bt(ae[ds.am * -757592335], ae[(ds.am * -666700792) + 1], -1514030809);
            return 1;
        }
    }

    static int dc(int i, hw hwVar, boolean z) {
        if (i == -468576766) {
            ds.am -= 1946790881;
            ij.bj(ae[ds.am * 517534056], ae[(ds.am * -757592335) + 1], ae[(ds.am * 1823184846) + 2], (byte) -17);
            return 1;
        } else if (i == 3201) {
            int[] iArr = ae;
            int i2 = ds.am + 564452847;
            ds.am = i2;
            eq.bh(iArr[i2 * -12044785], -459478163);
            return 1;
        } else if (i != 3202) {
            return 2;
        } else {
            ds.am += 1923328278;
            ho.bt(ae[ds.am * 1186590224], ae[(ds.am * -757592335) + 1], -1514030809);
            return 1;
        }
    }

    static int dd(int i, hw hwVar, boolean z) {
        int[] iArr = ae;
        int i2 = ds.am + 564452847;
        ds.am = i2;
        al aq = da.aq(iArr[i2 * -757592335], -550158556);
        int[] iArr2;
        int i3;
        if (2600 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bg * 817114559;
            return 1;
        } else if (i == 2601) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bx * -1344834291;
            return 1;
        } else if (2602 == i) {
            String[] strArr = ak;
            i3 = as - 1490481109;
            as = i3;
            strArr[(i3 * -1883296125) - 1] = aq.dm;
            return 1;
        } else if (i == 2603) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bu * -1004867185;
            return 1;
        } else if (2604 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bw * 901029295;
            return 1;
        } else if (i == 2605) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cl * -491867321;
            return 1;
        } else if (i == 2606) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.ck * -1022461825;
            return 1;
        } else if (2607 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cu * 2002818135;
            return 1;
        } else if (i == 2608) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.co * 1019998723;
            return 1;
        } else if (2609 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bz * -39608137;
            return 1;
        } else if (2610 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.by * 1175387377;
            return 1;
        } else if (2611 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.br * 1839990687;
            return 1;
        } else if (2612 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.be * 122478665;
            return 1;
        } else if (i == 2613) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bn.ad(2137693439);
            return 1;
        } else if (2614 != i) {
            return 2;
        } else {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cg ? 1 : 0;
            return 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int de(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int i3;
        int i4;
        char c;
        du duVar;
        String[] strArr;
        int[] iArr;
        if (i == 3400) {
            ds.am -= 1662656128;
            i3 = ae[ds.am * -1610436335];
            i4 = ae[(ds.am * -757592335) + 1];
            du aq = cr.aq(i3, -1161861065);
            c = aq.al;
            while (i2 < aq.ae * -1515050949) {
                if (aq.am[i2] == i4) {
                    String[] strArr2 = ak;
                    int i5 = as - 1490481109;
                    as = i5;
                    strArr2[(i5 * -1883296125) - 1] = aq.as[i2];
                    duVar = null;
                    break;
                }
                i2++;
            }
            duVar = aq;
            if (duVar != null) {
                strArr = ak;
                i4 = as + 1113756312;
                as = i4;
                strArr[(i4 * -1883296125) - 1] = duVar.aj;
            }
            return 1;
        } else if (132408727 == i) {
            ds.am += 7132185;
            c = ae[ds.am * -757592335];
            char c2 = ae[(ds.am * -757592335) + 1];
            i4 = ae[(ds.am * -757592335) + 2];
            int i6 = ae[(ds.am * 2047462175) + 3];
            du aq2 = cr.aq(i4, -189505460);
            if (c == aq2.ar && aq2.al == c2) {
                while (i2 < aq2.ae * 2047609755) {
                    if (aq2.am[i2] == i6) {
                        if (2763 == c2) {
                            String[] strArr3 = ak;
                            i6 = as + 1979090837;
                            as = i6;
                            strArr3[(i6 * -1883296125) - 1] = aq2.as[i2];
                            duVar = null;
                        } else {
                            int[] iArr2 = ae;
                            i6 = ds.am + 2044501364;
                            ds.am = i6;
                            iArr2[(i6 * 1816263136) - 1] = aq2.ak[i2];
                            duVar = null;
                        }
                        if (duVar != null) {
                            if ('s' == c2) {
                                strArr = ak;
                                i4 = as - 1490481109;
                                as = i4;
                                strArr[(i4 * -1883296125) - 1] = duVar.aj;
                                return 1;
                            }
                            iArr = ae;
                            i4 = ds.am - 564452847;
                            ds.am = i4;
                            iArr[(i4 * -757592335) - 1] = duVar.ai * 2077068103;
                        }
                        return 1;
                    }
                    i2++;
                }
                duVar = aq2;
                if (duVar != null) {
                }
                return 1;
            } else if (c2 == 37103) {
                String[] strArr4 = ak;
                i3 = as - 1632786135;
                as = i3;
                strArr4[(i3 * 858766764) - 1] = go.ak;
                return 1;
            } else {
                iArr = ae;
                i4 = ds.am - 270229324;
                ds.am = i4;
                iArr[(i4 * -1983654495) - 1] = 0;
                return 1;
            }
        } else if (i != -1792285482) {
            return 2;
        } else {
            int[] iArr3 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            duVar = cr.aq(iArr3[i3 * -106433115], -340792245);
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = duVar.aj(-781859085);
            return 1;
        }
    }

    static int df(int i, hw hwVar, boolean z) {
        if (i == 3200) {
            ds.am += 1693358541;
            ij.bj(ae[ds.am * 981653812], ae[(ds.am * 60459718) + 1], ae[(ds.am * 902989846) + 2], (byte) -49);
            return 1;
        } else if (i == 1042937797) {
            int[] iArr = ae;
            int i2 = ds.am + 1321378292;
            ds.am = i2;
            eq.bh(iArr[i2 * -757592335], -1829733639);
            return 1;
        } else if (i != -1979925206) {
            return 2;
        } else {
            ds.am += 1128905694;
            ho.bt(ae[ds.am * -757592335], ae[(ds.am * -1608843723) + 1], -1514030809);
            return 1;
        }
    }

    static int dg(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static int dh(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        if (i == -118830957) {
            iArr = ae;
            i3 = ds.am + 496324231;
            ds.am = i3;
            iArr[(i3 * -140547888) - 1] = client.bj * 515404400;
            return 1;
        } else if (3301 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2, i3, -1455848826);
            return 1;
        } else if (1676111034 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * 17922038];
            i3 = ae[(ds.am * -1205864241) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -703863482) - 1] = ih.aq(i2, i3, -1247085595);
            return 1;
        } else if (-326687347 == i) {
            ds.am += 1603147627;
            i2 = ae[ds.am * 451744375];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 1068178433;
            ds.am = i4;
            iArr2[(i4 * -1324068827) - 1] = et.ar(i2, i3, -1959541454);
            return 1;
        } else if (755601872 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * 1937248674) - 1] = dm.aq(i2, 43765678).ar * 114449353;
            return 1;
        } else if (i == 3305) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * 1827068813];
            iArr3 = ae;
            i5 = ds.am + 371264573;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kx[i2];
            return 1;
        } else if (3306 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am + 1838192834;
            ds.am = i5;
            iArr3[(i5 * -260638786) - 1] = client.kz[i2];
            return 1;
        } else if (3307 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am + 1900528017;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kq[i2];
            return 1;
        } else if (3308 == i) {
            i2 = am.jy;
            i3 = oz.ff;
            i5 = da.jc.bq;
            i4 = da.jc.bd;
            int i6 = cq.fz;
            int[] iArr4 = ae;
            int i7 = ds.am - 564452847;
            ds.am = i7;
            iArr4[(i7 * -757592335) - 1] = (((i2 * 1973701849) << 28) + (((i3 * 2060098323) + ((i5 * 1787753352) >> 7)) << 14)) + (((i4 * -1162911289) >> 7) + (i6 * 1286446182));
            return 1;
        } else if (i == 3309) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (i2 >> 14) & 234036676;
            return 1;
        } else if (i == 3310) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am + 661607018;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = i2 >> 28;
            return 1;
        } else if (-27313148 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 1689685356;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = i2 & 529605661;
            return 1;
        } else if (3312 == i) {
            iArr3 = ae;
            i5 = ds.am - 1531788086;
            ds.am = i5;
            if (client.ak) {
                i2 = 1;
            }
            iArr3[(i5 * -403825910) - 1] = i2;
            return 1;
        } else if (i == -1923489414) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -59043872) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2 + 1887561788, i3, 514998741);
            return 1;
        } else if (-1694992368 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -882554824) - 1] = ih.aq(i2 + 1470291093, i3, -1848077431);
            return 1;
        } else if (i == 3315) {
            ds.am += 266855596;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 678884053;
            ds.am = i4;
            iArr2[(i4 * -1565841055) - 1] = et.ar(i2 + 32768, i3, -1959541454);
            return 1;
        } else if (3316 == i) {
            if (client.lq * -408822943 >= 2) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = client.lq * -1985563254;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * 454160608) - 1] = 0;
            return 1;
        } else if (i == 3317) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -1112165342) - 1] = client.cm * 702155333;
            return 1;
        } else if (i == 1642753550) {
            iArr = ae;
            i3 = ds.am + 390159999;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.ar * -902976658;
            return 1;
        } else if (i == 3321) {
            iArr = ae;
            i3 = ds.am - 448793773;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.lm * 643501401;
            return 1;
        } else if (892545084 == i) {
            iArr = ae;
            i3 = ds.am - 467863180;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.ln * 104273820;
            return 1;
        } else if (-238779437 == i) {
            if (client.lc) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = 1;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am + 152190544;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 1279133304) {
            iArr = ae;
            i3 = ds.am - 1942211549;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.al * -925529453;
            return 1;
        } else if (3325 != i) {
            return 2;
        } else {
            ds.am -= 1582591213;
            i2 = ae[ds.am * -867029598];
            i3 = ae[(ds.am * -757592335) + 1];
            i5 = ae[(ds.am * 300047083) + 2];
            i4 = ae[(ds.am * -1561685287) + 3];
            int[] iArr5 = ae;
            int i8 = ds.am - 564452847;
            ds.am = i8;
            iArr5[(i8 * -757592335) - 1] = ((i2 + (i3 << 14)) + (i5 << 28)) + i4;
            return 1;
        }
    }

    static int di(int i, hw hwVar, boolean z) {
        int[] iArr = ae;
        int i2 = ds.am + 564452847;
        ds.am = i2;
        al aq = da.aq(iArr[i2 * -660193340], -550158556);
        int[] iArr2;
        int i3;
        String[] strArr;
        if (i == 1124832140) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = et.ar(hs.hy(aq, (byte) 39), 595958562);
            return 1;
        } else if (2801 == i) {
            iArr2 = ae;
            i3 = ds.am + 1124461208;
            ds.am = i3;
            i2 = iArr2[i3 * 228638490] - 1;
            if (aq.dz == null || i2 >= aq.dz.length || aq.dz[i2] == null) {
                strArr = ak;
                i2 = as + 678272798;
                as = i2;
                strArr[(i2 * -746262301) - 1] = "";
                return 1;
            }
            String[] strArr2 = ak;
            int i4 = as - 1490481109;
            as = i4;
            strArr2[(i4 * -1883296125) - 1] = aq.dz[i2];
            return 1;
        } else if (i != -1879318370) {
            return 2;
        } else {
            if (aq.dg == null) {
                strArr = ak;
                i2 = as - 918082639;
                as = i2;
                strArr[(i2 * 1385838302) - 1] = "";
                return 1;
            }
            String[] strArr3 = ak;
            i3 = as - 250259575;
            as = i3;
            strArr3[(i3 * 57122892) - 1] = aq.dg;
            return 1;
        }
    }

    static int dj(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        dh aq;
        String[] strArr;
        int i5;
        String[] strArr2;
        int[] iArr2;
        if (i == 4200) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            String[] strArr3 = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr3[(i4 * -1883296125) - 1] = gl.aq(i3, -185785574).ao;
            return 1;
        } else if (4201 == i) {
            ds.am += 1128905694;
            i3 = ae[ds.am * -757592335];
            i2 = ae[(ds.am * -757592335) + 1];
            aq = gl.aq(i3, 160292354);
            if (i2 >= 1 && i2 <= 5) {
                i2--;
                if (aq.bo[i2] != null) {
                    strArr = ak;
                    i5 = as - 1490481109;
                    as = i5;
                    strArr[(i5 * -1883296125) - 1] = aq.bo[i2];
                    return 1;
                }
            }
            strArr2 = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr2[(i2 * -1883296125) - 1] = "";
            return 1;
        } else if (4202 == i) {
            ds.am += 1128905694;
            i3 = ae[ds.am * -757592335];
            i2 = ae[(ds.am * -757592335) + 1];
            aq = gl.aq(i3, -1002487886);
            if (i2 >= 1 && i2 <= 5) {
                i2--;
                if (aq.bl[i2] != null) {
                    strArr = ak;
                    i5 = as - 1490481109;
                    as = i5;
                    strArr[(i5 * -1883296125) - 1] = aq.bl[i2];
                    return 1;
                }
            }
            strArr2 = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr2[(i2 * -1883296125) - 1] = "";
            return 1;
        } else if (i == 4203) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = gl.aq(i3, -1596340390).bq * -1195053793;
            return 1;
        } else {
            i3 = 0;
            int[] iArr3;
            dh aq2;
            if (4204 == i) {
                iArr2 = ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i2 = iArr2[i4 * -757592335];
                iArr3 = ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                if (gl.aq(i2, 34748939).bm * -1954437925 == 1) {
                    i3 = 1;
                }
                iArr3[(i5 * -757592335) - 1] = i3;
                return 1;
            } else if (i == 4205) {
                iArr = ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, -1770732670);
                if (aq2.bp * 518600683 != -1 || aq2.by * 1269103785 < 0) {
                    iArr2 = ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.by * 1269103785;
                return 1;
            } else if (4206 == i) {
                iArr = ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, -496831896);
                if (aq2.bp * 518600683 < 0 || aq2.by * 1269103785 < 0) {
                    iArr2 = ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.by * 1269103785;
                return 1;
            } else if (4207 == i) {
                iArr = ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i3 = iArr[i4 * -757592335];
                iArr3 = ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = gl.aq(i3, 156960731).bd ? 1 : 0;
                return 1;
            } else if (i == 4208) {
                iArr = ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, -1719659078);
                if (aq2.cc * 335744487 != -1 || aq2.cy * -1499517591 < 0) {
                    iArr2 = ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.cy * -1499517591;
                return 1;
            } else if (4209 == i) {
                iArr = ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, -587434979);
                if (aq2.cc * 335744487 < 0 || aq2.cy * -1499517591 < 0) {
                    iArr2 = ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.cy * -1499517591;
                return 1;
            } else if (4210 == i) {
                strArr2 = ak;
                i2 = as + 1490481109;
                as = i2;
                String str = strArr2[i2 * -1883296125];
                iArr = ae;
                i5 = ds.am + 564452847;
                ds.am = i5;
                gi.m218if(str, iArr[i5 * -757592335] == 1, 637697576);
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = if.rt * 697017025;
                return 1;
            } else if (i == 4211) {
                if (ib.ra == null || el.rj * 1948118835 >= if.rt * 697017025) {
                    iArr = ae;
                    i2 = ds.am - 564452847;
                    ds.am = i2;
                    iArr[(i2 * -757592335) - 1] = -1;
                    return 1;
                }
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                short[] sArr = ib.ra;
                i5 = el.rj - 1891392517;
                el.rj = i5;
                iArr[(i2 * -757592335) - 1] = sArr[(i5 * 1948118835) - 1] & SupportMenu.USER_MASK;
                return 1;
            } else if (i != 4212) {
                return 2;
            } else {
                el.rj = 0;
                return 1;
            }
        }
    }

    static int dk(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int i3;
        int[] iArr;
        int i4;
        int[] iArr2;
        int[] iArr3;
        int i5;
        int i6;
        if (2063039841 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * 1061771237) + 1];
            iArr = ae;
            i4 = ds.am - 704968750;
            ds.am = i4;
            iArr[(i4 * -1553315106) - 1] = i2 + i3;
            return 1;
        } else if (431477578 == i) {
            ds.am -= 1387320265;
            i2 = ae[ds.am * 1205183628];
            i3 = ae[(ds.am * -825675585) + 1];
            iArr = ae;
            i4 = ds.am - 241632674;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 - i3;
            return 1;
        } else if (i == 4002) {
            ds.am -= 496250967;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -110744496) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * 368696022) - 1] = i2 * i3;
            return 1;
        } else if (i == 4003) {
            ds.am += 1296720699;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -126176916) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 / i3;
            return 1;
        } else if (-1081466770 == i) {
            iArr2 = ae;
            i3 = ds.am + 1880438834;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am + 242993427;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (int) (Math.random() * ((double) i2));
            return 1;
        } else if (4005 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 490140682;
            ds.am = i5;
            iArr3[(i5 * 1709909646) - 1] = (int) (Math.random() * ((double) (i2 + 1)));
            return 1;
        } else if (4006 == i) {
            ds.am -= 1472703061;
            i2 = ae[ds.am * 2064028164];
            i3 = ae[(ds.am * -1691930145) + 1];
            i5 = ae[(ds.am * 1755310257) + 2];
            i4 = ae[(ds.am * 169769371) + 3];
            i6 = ae[(ds.am * -1212098453) + 4];
            int[] iArr4 = ae;
            int i7 = ds.am - 969359256;
            ds.am = i7;
            iArr4[(i7 * -247178813) - 1] = i2 + (((i3 - i2) * (i6 - i5)) / (i4 - i5));
            return 1;
        } else if (4007 == i) {
            ds.am -= 765369021;
            i2 = ae[ds.am * 153370392];
            i3 = ae[(ds.am * -79530613) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * 1062889713) - 1] = i2 + ((i3 * i2) / 100);
            return 1;
        } else if (4008 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -1161661521];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 | (1 << i3);
            return 1;
        } else if (i == -809635454) {
            ds.am -= 1327934620;
            i2 = ae[ds.am * 501746384];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -805902823) - 1] = i2 & (-1 - (1 << i3));
            return 1;
        } else if (i == -343797010) {
            ds.am -= 508114717;
            i3 = ae[ds.am * 87937205];
            i5 = ae[(ds.am * -757592335) + 1];
            int[] iArr5 = ae;
            i6 = ds.am + 1353028628;
            ds.am = i6;
            if ((i3 & (1 << i5)) != 0) {
                i2 = 1;
            }
            iArr5[(i6 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 331633929) {
            ds.am -= 372433903;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am + 1890590965;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 % i3;
            return 1;
        } else if (1079920352 == i) {
            ds.am += 875721401;
            i3 = ae[ds.am * -757592335];
            i5 = ae[(ds.am * 165882320) + 1];
            if (i3 == 0) {
                iArr3 = ae;
                i5 = ds.am + 1457033001;
                ds.am = i5;
                iArr3[(i5 * 770170313) - 1] = 0;
                return 1;
            }
            iArr2 = ae;
            i4 = ds.am - 1318974051;
            ds.am = i4;
            iArr2[(i4 * 814285529) - 1] = (int) Math.pow((double) i3, (double) i5);
            return 1;
        } else if (i == 4013) {
            ds.am -= 1822364;
            i3 = ae[ds.am * -757592335];
            i5 = ae[(ds.am * -339631637) + 1];
            if (i3 == 0) {
                iArr3 = ae;
                i5 = ds.am - 997463116;
                ds.am = i5;
                iArr3[(i5 * -393418879) - 1] = 0;
                return 1;
            }
            switch (i5) {
                case 0:
                    iArr2 = ae;
                    i3 = ds.am + 1903050603;
                    ds.am = i3;
                    iArr2[(i3 * -757592335) - 1] = Integer.MAX_VALUE;
                    return 1;
                case 1:
                    iArr2 = ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = i3;
                    return 1;
                case 2:
                    iArr2 = ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.sqrt((double) i3);
                    return 1;
                case 3:
                    iArr2 = ae;
                    i5 = ds.am - 1208377983;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.cbrt((double) i3);
                    return 1;
                case 4:
                    iArr2 = ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.sqrt(Math.sqrt((double) i3));
                    return 1;
                default:
                    iArr2 = ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = (int) Math.pow((double) i3, 1.0d / ((double) i5));
                    return 1;
            }
        } else if (-632979971 == i) {
            ds.am += 907549749;
            i2 = ae[ds.am * -1234290010];
            i3 = ae[(ds.am * 1037982865) + 1];
            iArr = ae;
            i4 = ds.am - 1001899577;
            ds.am = i4;
            iArr[(i4 * -630493555) - 1] = i2 & i3;
            return 1;
        } else if (i == 557871515) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -2146270693];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am + 1005726935;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 | i3;
            return 1;
        } else if (4018 != i) {
            return 2;
        } else {
            ds.am -= 325157335;
            long j = (long) ae[ds.am * -757592335];
            long j2 = (long) ae[(ds.am * -757592335) + 1];
            long j3 = (long) ae[(ds.am * -757592335) + 2];
            iArr2 = ae;
            int i8 = ds.am - 564452847;
            ds.am = i8;
            iArr2[(i8 * 2043127921) - 1] = (int) ((j * j3) / j2);
            return 1;
        }
    }

    static int dl(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static int dm(int i, hw hwVar, boolean z) {
        int[] iArr = ae;
        int i2 = ds.am + 564452847;
        ds.am = i2;
        al aq = da.aq(iArr[i2 * -757592335], -550158556);
        int[] iArr2;
        int i3;
        if (2600 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bg * 817114559;
            return 1;
        } else if (i == 2601) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bx * -1344834291;
            return 1;
        } else if (2602 == i) {
            String[] strArr = ak;
            i3 = as - 1490481109;
            as = i3;
            strArr[(i3 * -1883296125) - 1] = aq.dm;
            return 1;
        } else if (i == 2603) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bu * -1004867185;
            return 1;
        } else if (2604 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bw * 901029295;
            return 1;
        } else if (i == 2605) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cl * -491867321;
            return 1;
        } else if (i == 2606) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.ck * -1022461825;
            return 1;
        } else if (2607 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cu * 2002818135;
            return 1;
        } else if (i == 2608) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.co * 1019998723;
            return 1;
        } else if (2609 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bz * -39608137;
            return 1;
        } else if (2610 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.by * 1175387377;
            return 1;
        } else if (2611 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.br * 1839990687;
            return 1;
        } else if (2612 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.be * 122478665;
            return 1;
        } else if (i == 2613) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bn.ad(2144737215);
            return 1;
        } else if (2614 != i) {
            return 2;
        } else {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cg ? 1 : 0;
            return 1;
        }
    }

    static int dn(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        if (i == 3300) {
            iArr = ae;
            i3 = ds.am - 1270699068;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.bj * -2135492277;
            return 1;
        } else if (3301 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * 1366967225];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2, i3, -1195079224);
            return 1;
        } else if (3302 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * 268466703];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am + 136032674;
            ds.am = i4;
            iArr2[(i4 * -159619585) - 1] = ih.aq(i2, i3, -2122904040);
            return 1;
        } else if (-613521624 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * 1994569727];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 230452581;
            ds.am = i4;
            iArr2[(i4 * 1292546988) - 1] = et.ar(i2, i3, -1959541454);
            return 1;
        } else if (1718580080 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * 1808985193) - 1] = dm.aq(i2, 977186757).ar * -823135634;
            return 1;
        } else if (i == 3305) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 72752967;
            ds.am = i5;
            iArr3[(i5 * 193945073) - 1] = client.kx[i2];
            return 1;
        } else if (1367034443 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 91791179;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kz[i2];
            return 1;
        } else if (782467997 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kq[i2];
            return 1;
        } else if (1562771488 == i) {
            i2 = am.jy;
            i3 = oz.ff;
            i5 = da.jc.bq;
            i4 = da.jc.bd;
            int i6 = cq.fz;
            int[] iArr4 = ae;
            int i7 = ds.am - 564452847;
            ds.am = i7;
            iArr4[(i7 * -879246281) - 1] = (((i2 * 1973701849) << 28) + (((i3 * 1758535005) + ((i5 * -1444273727) >> 7)) << 14)) + (((i4 * -1398146980) >> 7) + (i6 * -1866366501));
            return 1;
        } else if (i == 3309) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 268971829;
            ds.am = i5;
            iArr3[(i5 * 80571805) - 1] = (i2 >> 14) & 1276837777;
            return 1;
        } else if (i == 2054955951) {
            iArr = ae;
            i3 = ds.am - 2070939729;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * 173481646) - 1] = i2 >> 28;
            return 1;
        } else if (3311 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -749782503];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -618145399) - 1] = i2 & 16383;
            return 1;
        } else if (3312 == i) {
            iArr3 = ae;
            i5 = ds.am + 378942430;
            ds.am = i5;
            if (client.ak) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 278464729) {
            ds.am += 454045203;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 1332685878;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2 - 581906489, i3, 1102733494);
            return 1;
        } else if (2002690157 == i) {
            ds.am -= 164979765;
            i2 = ae[ds.am * 1075051704];
            i3 = ae[(ds.am * -234846340) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * 211631808) - 1] = ih.aq(i2 + 32768, i3, -2146724105);
            return 1;
        } else if (i == 3315) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -1209232911) + 1];
            iArr2 = ae;
            i4 = ds.am - 723895119;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = et.ar(i2 + 32768, i3, -1959541454);
            return 1;
        } else if (1748272784 == i) {
            if (client.lq * -408822943 >= 2) {
                iArr = ae;
                i3 = ds.am - 119234133;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = client.lq * -408822943;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -1663977337) - 1] = 0;
            return 1;
        } else if (i == -616860689) {
            iArr = ae;
            i3 = ds.am + 147391526;
            ds.am = i3;
            iArr[(i3 * -1887106358) - 1] = client.cm * 559626184;
            return 1;
        } else if (i == -1098098512) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * 828743502) - 1] = client.ar * -2057254538;
            return 1;
        } else if (i == 3321) {
            iArr = ae;
            i3 = ds.am + 170216871;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.lm * 534827317;
            return 1;
        } else if (2017622953 == i) {
            iArr = ae;
            i3 = ds.am - 1386924470;
            ds.am = i3;
            iArr[(i3 * 148233741) - 1] = client.ln * 1534723747;
            return 1;
        } else if (3323 == i) {
            if (client.lc) {
                iArr = ae;
                i3 = ds.am + 192182640;
                ds.am = i3;
                iArr[(i3 * -1793223652) - 1] = 1;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * 813536416) - 1] = 0;
            return 1;
        } else if (i == -1988927056) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.al * -1838334517;
            return 1;
        } else if (3325 != i) {
            return 2;
        } else {
            ds.am -= 2037155908;
            i2 = ae[ds.am * -642436951];
            i3 = ae[(ds.am * -757592335) + 1];
            i5 = ae[(ds.am * -999375541) + 2];
            i4 = ae[(ds.am * -1096400490) + 3];
            int[] iArr5 = ae;
            int i8 = ds.am - 564452847;
            ds.am = i8;
            iArr5[(i8 * 823931317) - 1] = ((i2 + (i3 << 14)) + (i5 << 28)) + i4;
            return 1;
        }
    }

    /* renamed from: do */
    static int m221do(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        boolean z2;
        nx nxVar;
        String[] strArr;
        if (1170992576 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].al((byte) 58);
            return 1;
        } else if (1952540215 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -680001721];
            iArr2 = ae;
            i4 = ds.am - 1809504372;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].aq * 35911474;
            return 1;
        } else if (i == -1340078872) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * 1952376740) - 1] = client.rr[i2].ar * 1561048985;
            return 1;
        } else if (-1883700727 == i) {
            iArr = ae;
            i3 = ds.am + 869856970;
            ds.am = i3;
            i2 = iArr[i3 * -920350841];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].al * 1378077064;
            return 1;
        } else if (i == 3907) {
            iArr = ae;
            i3 = ds.am - 2005085401;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * 2040756770) - 1] = client.rr[i2].aj * -1488036989;
            return 1;
        } else if (315746640 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * 728614747];
            iArr2 = ae;
            i4 = ds.am - 1066250388;
            ds.am = i4;
            iArr2[(i4 * -2018968232) - 1] = client.rr[i2].ai * -1441369391;
            return 1;
        } else if (i == 3910) {
            iArr2 = ae;
            i4 = ds.am + 1672627848;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * 478981814]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 829064282;
            ds.am = i5;
            if (i3 == 0) {
                i2 = 1;
            }
            iArr3[(1186146423 * i5) - 1] = i2;
            return 1;
        } else if (i == 1616320485) {
            iArr2 = ae;
            i4 = ds.am - 274230588;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am + 1818189607;
            ds.am = i5;
            if (2 == i3) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (3912 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am + 1231047061;
            ds.am = i5;
            if (5 == i3) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 3913) {
            iArr2 = ae;
            i4 = ds.am + 1332714681;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * 1373721504]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 31934624;
            ds.am = i5;
            if (i3 == 1) {
                i2 = 1;
            }
            iArr3[(1720270333 * i5) - 1] = i2;
            return 1;
        } else if (1116471763 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -783309778] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.al, z2, -1749322068);
            return 1;
        } else if (3915 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.ar, z2, -2024975621);
            return 1;
        } else if (i == 3916) {
            ds.am += 1128905694;
            boolean z3 = ae[ds.am * 1150752110] == 1;
            if (ae[(ds.am * -757592335) + 1] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            client.ro.ad = z2;
            nc.rb.ad(client.ro, z3, -2051811166);
            return 1;
        } else if (-208560392 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.aq, z2, -1054278455);
            return 1;
        } else if (-1350827721 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -1328273502] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.aj, z2, -1223633103);
            return 1;
        } else if (3919 == i) {
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            if (nc.rb != null) {
                i2 = nc.rb.ad.size();
            }
            iArr2[(i4 * -256241077) - 1] = i2;
            return 1;
        } else if (3920 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ad * -63370896;
            return 1;
        } else if (i == 1964169603) {
            iArr = ae;
            i3 = ds.am - 1705469031;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * 1487171233]);
            strArr = ak;
            i4 = as + 64534993;
            as = i4;
            strArr[(i4 * -1452897392) - 1] = nxVar.ad((byte) -48);
            return 1;
        } else if (i == -740456098) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * 2088630683]);
            strArr = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr[(i4 * -1883296125) - 1] = nxVar.aq(-351035025);
            return 1;
        } else if (i == 821761408) {
            iArr = ae;
            i3 = ds.am + 1045278171;
            ds.am = i3;
            long ad = (gq.ad((byte) 98) - (dp.ri * 2485203017504217527L)) - (((nx) nc.rb.ad.get(iArr[i3 * 164185569])).aq * -3945319248063608953L);
            i2 = (int) (ad / 3600000);
            i5 = (int) ((ad - ((long) (1120433016 * i2))) / 60000);
            i3 = (int) (((ad - ((long) (531999096 * i2))) - ((long) (60000 * i5))) / 1000);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i2);
            stringBuilder.append(":");
            stringBuilder.append(i5 / 10);
            stringBuilder.append(i5 % 10);
            stringBuilder.append(":");
            stringBuilder.append(i3 / 10);
            stringBuilder.append(i3 % 10);
            String stringBuilder2 = stringBuilder.toString();
            strArr = ak;
            i4 = as - 479707077;
            as = i4;
            strArr[(i4 * -495030753) - 1] = stringBuilder2;
            return 1;
        } else if (1903291318 == i) {
            iArr = ae;
            i3 = ds.am - 1893650985;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -1836717071]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ar.al * 709251080;
            return 1;
        } else if (3925 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * 917509908) - 1] = nxVar.ar.ar * 1326890219;
            return 1;
        } else if (i != 425185342) {
            return 2;
        } else {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ar.aq * -1185757672;
            return 1;
        }
    }

    static int dp(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        if (i == 3300) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.bj * 2133672263;
            return 1;
        } else if (3301 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2, i3, -309847760);
            return 1;
        } else if (3302 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = ih.aq(i2, i3, -1144892153);
            return 1;
        } else if (3303 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = et.ar(i2, i3, -1959541454);
            return 1;
        } else if (3304 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = dm.aq(i2, 1263568261).ar * 136676209;
            return 1;
        } else if (i == 3305) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kx[i2];
            return 1;
        } else if (3306 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kz[i2];
            return 1;
        } else if (3307 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kq[i2];
            return 1;
        } else if (3308 == i) {
            i2 = am.jy;
            i3 = oz.ff;
            i5 = da.jc.bq;
            i4 = da.jc.bd;
            int i6 = cq.fz;
            int[] iArr4 = ae;
            int i7 = ds.am - 564452847;
            ds.am = i7;
            iArr4[(i7 * -757592335) - 1] = (((i2 * 1973701849) << 28) + (((i3 * 2060098323) + ((i5 * -1444273727) >> 7)) << 14)) + (((i4 * -1690563339) >> 7) + (i6 * -1866366501));
            return 1;
        } else if (i == 3309) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (i2 >> 14) & 16383;
            return 1;
        } else if (i == 3310) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = i2 >> 28;
            return 1;
        } else if (3311 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = i2 & 16383;
            return 1;
        } else if (3312 == i) {
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (client.ak) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 3313) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2 + 32768, i3, 1511992586);
            return 1;
        } else if (3314 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = ih.aq(i2 + 32768, i3, -1116331732);
            return 1;
        } else if (i == 3315) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = et.ar(i2 + 32768, i3, -1959541454);
            return 1;
        } else if (3316 == i) {
            if (client.lq * -408822943 >= 2) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = client.lq * -408822943;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 3317) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.cm * 702155333;
            return 1;
        } else if (i == 3318) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.ar * -2059975617;
            return 1;
        } else if (i == 3321) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.lm * 2056417909;
            return 1;
        } else if (3322 == i) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.ln * 1534723747;
            return 1;
        } else if (3323 == i) {
            if (client.lc) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = 1;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 3324) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.al * -925529453;
            return 1;
        } else if (3325 != i) {
            return 2;
        } else {
            ds.am -= 2037155908;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            i5 = ae[(ds.am * -757592335) + 2];
            i4 = ae[(ds.am * -757592335) + 3];
            int[] iArr5 = ae;
            int i8 = ds.am - 564452847;
            ds.am = i8;
            iArr5[(i8 * -757592335) - 1] = ((i2 + (i3 << 14)) + (i5 << 28)) + i4;
            return 1;
        }
    }

    static int dq(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        boolean z2;
        nx nxVar;
        String[] strArr;
        if (3903 == i) {
            iArr = ae;
            i3 = ds.am + 1461340019;
            ds.am = i3;
            i2 = iArr[i3 * -1371448909];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].al((byte) 77);
            return 1;
        } else if (3904 == i) {
            iArr = ae;
            i3 = ds.am - 47755402;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -375541809) - 1] = client.rr[i2].aq * 44255324;
            return 1;
        } else if (i == 289511282) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 1608985733;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].ar * 2145635385;
            return 1;
        } else if (896162662 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -301039295];
            iArr2 = ae;
            i4 = ds.am - 182679514;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].al * 840986365;
            return 1;
        } else if (i == 605292226) {
            iArr = ae;
            i3 = ds.am - 753936736;
            ds.am = i3;
            i2 = iArr[i3 * -768429094];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * 2141608496) - 1] = client.rr[i2].aj * -1488036989;
            return 1;
        } else if (3908 == i) {
            iArr = ae;
            i3 = ds.am - 1920503688;
            ds.am = i3;
            i2 = iArr[i3 * 892138988];
            iArr2 = ae;
            i4 = ds.am + 313724767;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].ai * 575399586;
            return 1;
        } else if (i == -552693057) {
            iArr2 = ae;
            i4 = ds.am - 1795561142;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * 1689880976]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am + 1304574931;
            ds.am = i5;
            if (i3 == 0) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 3911) {
            iArr2 = ae;
            i4 = ds.am - 507406972;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -257156023]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (2 == i3) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (1593465902 == i) {
            iArr2 = ae;
            i4 = ds.am - 2044305600;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (5 == i3) {
                i2 = 1;
            }
            iArr3[(276119287 * i5) - 1] = i2;
            return 1;
        } else if (i == 3913) {
            iArr2 = ae;
            i4 = ds.am + 1354645906;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am + 941207656;
            ds.am = i5;
            if (i3 == 1) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (-848863257 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * 1657295707] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.al, z2, -1880034583);
            return 1;
        } else if (3915 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.ar, z2, -1778239070);
            return 1;
        } else if (i == 1602888841) {
            ds.am += 1128905694;
            boolean z3 = ae[ds.am * -757592335] == 1;
            if (ae[(ds.am * -757592335) + 1] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            client.ro.ad = z2;
            nc.rb.ad(client.ro, z3, -2113834850);
            return 1;
        } else if (-2009696114 == i) {
            iArr2 = ae;
            i4 = ds.am + 1079849584;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.aq, z2, -1841662058);
            return 1;
        } else if (3918 == i) {
            iArr2 = ae;
            i4 = ds.am + 1614380593;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.aj, z2, -1366495475);
            return 1;
        } else if (-569888435 == i) {
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            if (nc.rb != null) {
                i2 = nc.rb.ad.size();
            }
            iArr2[(i4 * -757592335) - 1] = i2;
            return 1;
        } else if (547843819 == i) {
            iArr = ae;
            i3 = ds.am - 23831986;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -467138933]);
            iArr2 = ae;
            i4 = ds.am + 1021191777;
            ds.am = i4;
            iArr2[(i4 * -1093657929) - 1] = nxVar.ad * -44135447;
            return 1;
        } else if (i == 3921) {
            iArr = ae;
            i3 = ds.am + 890917735;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * 1954118822]);
            strArr = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr[(i4 * -1883296125) - 1] = nxVar.ad((byte) -27);
            return 1;
        } else if (i == 2019792003) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            strArr = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr[(i4 * -1883296125) - 1] = nxVar.aq(2017189962);
            return 1;
        } else if (i == 3923) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            long ad = (gq.ad((byte) 16) - (dp.ri * 2485203017504217527L)) - (((nx) nc.rb.ad.get(iArr[i3 * -757592335])).aq * -3945319248063608953L);
            i2 = (int) (ad / 3600000);
            i5 = (int) ((ad - ((long) (1548915490 * i2))) / 60000);
            i3 = (int) (((ad - ((long) (3600000 * i2))) - ((long) (-589236355 * i5))) / 1000);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i2);
            stringBuilder.append(":");
            stringBuilder.append(i5 / 10);
            stringBuilder.append(i5 % 10);
            stringBuilder.append(":");
            stringBuilder.append(i3 / 10);
            stringBuilder.append(i3 % 10);
            String stringBuilder2 = stringBuilder.toString();
            strArr = ak;
            i4 = as + 1629943352;
            as = i4;
            strArr[(i4 * 337078067) - 1] = stringBuilder2;
            return 1;
        } else if (1572127170 == i) {
            iArr = ae;
            i3 = ds.am - 1907360742;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * 588179822]);
            iArr2 = ae;
            i4 = ds.am + 245881543;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ar.al * 840986365;
            return 1;
        } else if (203112217 == i) {
            iArr = ae;
            i3 = ds.am + 1728765899;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am + 1536949912;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ar.ar * 1561048985;
            return 1;
        } else if (i != -2131899770) {
            return 2;
        } else {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am + 740039449;
            ds.am = i4;
            iArr2[(i4 * -1338778371) - 1] = nxVar.ar.aq * 1820061643;
            return 1;
        }
    }

    static int dr(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static int ds(int i, hw hwVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        int i3;
        String[] strArr;
        String[] strArr2;
        int i4;
        int[] iArr2;
        String str;
        int[] iArr3;
        int i5;
        if (i == 3600) {
            if (al.rd.ae * -2043213634 == 0) {
                iArr = ae;
                i2 = ds.am + 977965088;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -2;
                return 1;
            } else if (1 == al.rd.ae * -48485767) {
                iArr = ae;
                i2 = ds.am + 537031940;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            } else {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = al.rd.aj.aq((byte) -51);
                return 1;
            }
        } else if (-1104232987 == i) {
            iArr = ae;
            i2 = ds.am + 579695764;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            if (!al.rd.ad(-1279438975) || i3 < 0 || i3 >= al.rd.aj.aq((byte) -118)) {
                strArr = ak;
                i2 = as - 444050080;
                as = i2;
                strArr[(i2 * -1883296125) - 1] = "";
                strArr = ak;
                i2 = as - 985559915;
                as = i2;
                strArr[(i2 * 1858612169) - 1] = "";
                return 1;
            }
            eu euVar = (eu) al.rd.aj.ap(i3, 601786415);
            strArr2 = ak;
            i4 = as - 811438585;
            as = i4;
            strArr2[(i4 * -440420645) - 1] = euVar.am((byte) -62);
            strArr2 = ak;
            i4 = as - 889538436;
            as = i4;
            strArr2[(i4 * -142570668) - 1] = euVar.ak(-1711920435);
            return 1;
        } else if (3602 == i) {
            iArr = ae;
            i4 = ds.am - 417014599;
            ds.am = i4;
            i3 = iArr[i4 * -757592335];
            if (!al.rd.ad(-770168292) || i3 < 0 || i3 >= al.rd.aj.aq((byte) -100)) {
                iArr = ae;
                i4 = ds.am - 1231275672;
                ds.am = i4;
                iArr[(i4 * 728106613) - 1] = 0;
                return 1;
            }
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * 1200560681) - 1] = ((er) al.rd.aj.ap(i3, 601786415)).aj * 2073645097;
            return 1;
        } else if (3603 == i) {
            iArr = ae;
            i4 = ds.am - 1899157357;
            ds.am = i4;
            i3 = iArr[i4 * -757592335];
            if (!al.rd.ad(-1731652531) || i3 < 0 || i3 >= al.rd.aj.aq((byte) -85)) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * 676693027) - 1] = 0;
                return 1;
            }
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * 576895782) - 1] = ((er) al.rd.aj.ap(i3, 601786415)).ae * -1630896027;
            return 1;
        } else if (i == 3604) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            str = strArr[i2 * 306019869];
            iArr2 = ae;
            i4 = ds.am + 1472311764;
            ds.am = i4;
            dc.av(str, iArr2[i4 * -1806008567], -1116170966);
            return 1;
        } else if (3605 == i) {
            strArr = ak;
            i2 = as + 852476017;
            as = i2;
            al.rd.am(strArr[i2 * -1883296125], (short) 15624);
            return 1;
        } else if (3606 == i) {
            strArr = ak;
            i2 = as + 544425162;
            as = i2;
            al.rd.an(strArr[i2 * -1883296125], 286112755);
            return 1;
        } else if (i == 3607) {
            strArr = ak;
            i2 = as - 1199732004;
            as = i2;
            al.rd.aw(strArr[i2 * -1883296125], 1099239308);
            return 1;
        } else if (i == 401666097) {
            strArr = ak;
            i2 = as + 2023964880;
            as = i2;
            al.rd.ab(strArr[i2 * -1883296125], (byte) -11);
            return 1;
        } else if (i == 2063265668) {
            strArr = ak;
            i4 = as + 1490481109;
            as = i4;
            str = fw.ib(strArr[i4 * 1806202131], (byte) -1);
            iArr3 = ae;
            i5 = ds.am - 330165298;
            ds.am = i5;
            if (al.rd.ai(new en(str, client.am), false, 1808341733)) {
                i3 = 1;
            } else {
                boolean z3 = false;
            }
            iArr3[(-902209251 * i5) - 1] = i3;
            return 1;
        } else if (592997472 == i) {
            if (li.or != null) {
                strArr = ak;
                i2 = as - 1490481109;
                as = i2;
                strArr[(i2 * -1883296125) - 1] = li.or.as;
                return 1;
            }
            strArr = ak;
            i2 = as - 1634548004;
            as = i2;
            strArr[(i2 * -1366940535) - 1] = "";
            return 1;
        } else if (3612 == i) {
            if (li.or != null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -58902270) - 1] = li.or.aq((byte) -12);
                return 1;
            }
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 3613) {
            iArr = ae;
            i2 = ds.am + 636019838;
            ds.am = i2;
            i3 = iArr[i2 * 909174517];
            if (li.or == null || i3 >= li.or.aq((byte) -9)) {
                strArr = ak;
                i2 = as - 1856838113;
                as = i2;
                strArr[(i2 * -1883296125) - 1] = "";
                return 1;
            }
            strArr2 = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr2[(i4 * -1883296125) - 1] = li.or.ap(i3, 601786415).ae((byte) 1).ad(1213817489);
            return 1;
        } else if (852100415 == i) {
            iArr = ae;
            i4 = ds.am - 76548648;
            ds.am = i4;
            i3 = iArr[i4 * 1828348789];
            if (li.or == null || i3 >= li.or.aq((byte) -58)) {
                iArr = ae;
                i4 = ds.am - 1294216365;
                ds.am = i4;
                iArr[(i4 * 292526806) - 1] = 0;
                return 1;
            }
            iArr2 = ae;
            i4 = ds.am + 74314908;
            ds.am = i4;
            iArr2[(i4 * -1442984314) - 1] = ((er) li.or.ap(i3, 601786415)).bx(-886312257);
            return 1;
        } else if (3615 == i) {
            iArr = ae;
            i4 = ds.am - 1567177818;
            ds.am = i4;
            i3 = iArr[i4 * -757592335];
            if (li.or == null || i3 >= li.or.aq((byte) -24)) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = 0;
                return 1;
            }
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -2092141275) - 1] = ((er) li.or.ap(i3, 601786415)).ae * -1630896027;
            return 1;
        } else if (i == -152368921) {
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            if (li.or != null) {
                z2 = li.or.ap;
            }
            iArr[(i4 * -1851081947) - 1] = z2;
            return 1;
        } else if (i == 3617) {
            strArr = ak;
            i2 = as + 1469449254;
            as = i2;
            bl.hw(strArr[i2 * -1883296125], 3698931);
            return 1;
        } else if (i == -1748903550) {
            iArr = ae;
            i4 = ds.am - 1103396431;
            ds.am = i4;
            if (li.or != null) {
                z2 = li.or.au * true;
            }
            iArr[(i4 * -757592335) - 1] = z2;
            return 1;
        } else if (3619 == i) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            at.hm(strArr[i2 * -1883296125], (byte) 29);
            return 1;
        } else if (i == -1235190994) {
            hy.ho((byte) -88);
            return 1;
        } else if (1321526944 == i) {
            if (al.rd.ad(-1890476187)) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = al.rd.ai.aq((byte) -79);
                return 1;
            }
            iArr = ae;
            i2 = ds.am + 1429087882;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            return 1;
        } else if (i == 3622) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -843327788];
            if (!al.rd.ad(-1669551522) || i3 < 0 || i3 >= al.rd.ai.aq((byte) -58)) {
                strArr = ak;
                i2 = as - 321310454;
                as = i2;
                strArr[(i2 * -856137318) - 1] = "";
                strArr = ak;
                i2 = as - 1487333601;
                as = i2;
                strArr[(i2 * -1883296125) - 1] = "";
                return 1;
            }
            ey eyVar = (ey) al.rd.ai.ap(i3, 601786415);
            strArr2 = ak;
            i4 = as + 1625461560;
            as = i4;
            strArr2[(i4 * -1883296125) - 1] = eyVar.am((byte) -84);
            strArr2 = ak;
            i4 = as - 1990261628;
            as = i4;
            strArr2[(i4 * -1883296125) - 1] = eyVar.ak(-1630083167);
            return 1;
        } else if (1837156238 == i) {
            strArr = ak;
            i4 = as + 1490481109;
            as = i4;
            str = fw.ib(strArr[i4 * -1883296125], (byte) 88);
            iArr3 = ae;
            i5 = ds.am - 358381644;
            ds.am = i5;
            if (al.rd.ae(new en(str, client.am), 2044830623)) {
                z2 = true;
            }
            iArr3[(-1523079767 * i5) - 1] = z2;
            return 1;
        } else if (3624 == i) {
            iArr = ae;
            i4 = ds.am - 1583256440;
            ds.am = i4;
            i3 = iArr[i4 * 1901876117];
            if (li.or == null || i3 >= li.or.aq((byte) -108) || !li.or.ap(i3, 601786415).ae((byte) 1).equals(da.jc.ad)) {
                iArr = ae;
                i4 = ds.am - 2109363716;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -248783221) - 1] = 1;
            return 1;
        } else if (i == -2046438255) {
            if (li.or == null || li.or.ag == null) {
                strArr = ak;
                i2 = as - 1490481109;
                as = i2;
                strArr[(i2 * -1883296125) - 1] = "";
                return 1;
            }
            strArr = ak;
            i2 = as - 1380824417;
            as = i2;
            strArr[(i2 * -497664638) - 1] = li.or.ag;
            return 1;
        } else if (i == 3626) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = iArr[i4 * -757592335];
            if (li.or == null || i3 >= li.or.aq((byte) -74) || !((ed) li.or.ap(i3, 601786415)).ar(-832141741)) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * 1995816504) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i2 = ds.am + 1339526031;
            ds.am = i2;
            iArr[(i2 * 1132431724) - 1] = 1;
            return 1;
        } else if (i == -1053465139) {
            iArr = ae;
            i4 = ds.am + 188743178;
            ds.am = i4;
            i3 = iArr[i4 * -757592335];
            if (li.or == null || i3 >= li.or.aq((byte) -88) || !((ed) li.or.ap(i3, 601786415)).an((byte) 98)) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * 162121015) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i2 = ds.am + 34158321;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 1;
            return 1;
        } else if (i == -904052843) {
            al.rd.aj.ay(-1980566644);
            return 1;
        } else if (i == -1561423382) {
            iArr = ae;
            i4 = ds.am - 465719577;
            ds.am = i4;
            if (iArr[i4 * 284456998] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new jq(z2), 1884138483);
            return 1;
        } else if (3630 == i) {
            iArr = ae;
            i4 = ds.am + 199672394;
            ds.am = i4;
            if (iArr[i4 * -415323138] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new jf(z2), 2085121557);
            return 1;
        } else if (i == 3631) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new jn(z2), 1954706711);
            return 1;
        } else if (i == -1602481774) {
            iArr = ae;
            i4 = ds.am + 1507825088;
            ds.am = i4;
            if (iArr[i4 * -1579254938] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new jx(z2), 2121460360);
            return 1;
        } else if (2038777826 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * 556841142] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new kw(z2), 1962529938);
            return 1;
        } else if (i == -1731750043) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new jm(z2), 2135261118);
            return 1;
        } else if (3635 == i) {
            iArr = ae;
            i4 = ds.am - 1762769495;
            ds.am = i4;
            if (iArr[i4 * 302313377] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new js(z2), 1928709248);
            return 1;
        } else if (-91610091 == i) {
            iArr = ae;
            i4 = ds.am + 787184361;
            ds.am = i4;
            if (iArr[i4 * 1051926134] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new kt(z2), 1981597738);
            return 1;
        } else if (3637 == i) {
            iArr = ae;
            i4 = ds.am + 434243395;
            ds.am = i4;
            if (iArr[i4 * 1181413078] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new ku(z2), 2123514517);
            return 1;
        } else if (3638 == i) {
            iArr = ae;
            i4 = ds.am + 878293635;
            ds.am = i4;
            if (iArr[i4 * 125002734] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new ji(z2), 1965080956);
            return 1;
        } else if (3639 == i) {
            al.rd.aj.au(477174740);
            return 1;
        } else if (i == -1647337945) {
            al.rd.ai.ay(-1980566644);
            return 1;
        } else if (513853915 == i) {
            iArr = ae;
            i4 = ds.am - 1018283777;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            al.rd.ai.an(new jq(z2), 2131391165);
            return 1;
        } else if (-166712632 == i) {
            iArr = ae;
            i4 = ds.am - 545616780;
            ds.am = i4;
            if (iArr[i4 * -487513896] == 1) {
                z2 = true;
            }
            al.rd.ai.an(new jf(z2), 2083834283);
            return 1;
        } else if (i == 736501667) {
            al.rd.ai.au(1768726298);
            return 1;
        } else if (3644 == i) {
            if (li.or == null) {
                return 1;
            }
            li.or.ay(-1980566644);
            return 1;
        } else if (3645 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new jq(z2), 1955622691);
            return 1;
        } else if (i == 3646) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new jf(z2), 1932786007);
            return 1;
        } else if (3647 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -49920106] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new jn(z2), 2027497033);
            return 1;
        } else if (-743617892 == i) {
            iArr = ae;
            i4 = ds.am - 1610415;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new jx(z2), 2124326668);
            return 1;
        } else if (3649 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -651256268] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new kw(z2), 1881058669);
            return 1;
        } else if (2083424795 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new jm(z2), 2063452101);
            return 1;
        } else if (i == 278165821) {
            iArr = ae;
            i4 = ds.am - 231194211;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new js(z2), 2073137463);
            return 1;
        } else if (i == 3652) {
            iArr = ae;
            i4 = ds.am - 1763739725;
            ds.am = i4;
            if (iArr[i4 * -749675148] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new kt(z2), 1889206735);
            return 1;
        } else if (i == -1434772292) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new ku(z2), 2019144201);
            return 1;
        } else if (282135878 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new ji(z2), 1897299580);
            return 1;
        } else if (i == -1607534833) {
            if (li.or == null) {
                return 1;
            }
            li.or.au(136667122);
            return 1;
        } else if (3656 == i) {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            al.rd.aj.an(new je(z2), 2024243950);
            return 1;
        } else if (i != -1641790020) {
            return 2;
        } else {
            iArr = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (li.or == null) {
                return 1;
            }
            li.or.an(new je(z2), 2098707619);
            return 1;
        }
    }

    static int dt(int i, hw hwVar, boolean z) {
        int[] iArr = ae;
        int i2 = ds.am + 564452847;
        ds.am = i2;
        al aq = da.aq(iArr[i2 * -176994682], -550158556);
        int[] iArr2;
        int i3;
        if (2600 == i) {
            iArr2 = ae;
            i3 = ds.am + 808313208;
            ds.am = i3;
            iArr2[(i3 * 1076959482) - 1] = aq.bg * 817114559;
            return 1;
        } else if (i == 2601) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bx * -187642438;
            return 1;
        } else if (878937305 == i) {
            String[] strArr = ak;
            i3 = as + 199034043;
            as = i3;
            strArr[(i3 * -1883296125) - 1] = aq.dm;
            return 1;
        } else if (i == 718294810) {
            iArr2 = ae;
            i3 = ds.am - 1588729167;
            ds.am = i3;
            iArr2[(i3 * 667554618) - 1] = aq.bu * -1004867185;
            return 1;
        } else if (252583436 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * 1248693892) - 1] = aq.bw * 999133299;
            return 1;
        } else if (i == -1511644820) {
            iArr2 = ae;
            i3 = ds.am - 299399914;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cl * -491867321;
            return 1;
        } else if (i == -2061568980) {
            iArr2 = ae;
            i3 = ds.am + 228242033;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.ck * -1233838363;
            return 1;
        } else if (2607 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cu * 135278267;
            return 1;
        } else if (i == 2608) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -1187462519) - 1] = aq.co * -2042219400;
            return 1;
        } else if (2609 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.bz * -393072744;
            return 1;
        } else if (-766352581 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.by * 1175387377;
            return 1;
        } else if (885304535 == i) {
            iArr2 = ae;
            i3 = ds.am - 1620746928;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.br * 1839990687;
            return 1;
        } else if (-482030425 == i) {
            iArr2 = ae;
            i3 = ds.am - 1656885891;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.be * -475835217;
            return 1;
        } else if (i == 2613) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * 2084578807) - 1] = aq.bn.ad(2137616100);
            return 1;
        } else if (2614 != i) {
            return 2;
        } else {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.cg ? 1 : 0;
            return 1;
        }
    }

    static int du(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        if (i == 3300) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.bj * 2133672263;
            return 1;
        } else if (3301 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2, i3, -110691542);
            return 1;
        } else if (3302 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = ih.aq(i2, i3, -1254673272);
            return 1;
        } else if (3303 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = et.ar(i2, i3, -1959541454);
            return 1;
        } else if (3304 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = dm.aq(i2, 1685978807).ar * 136676209;
            return 1;
        } else if (i == 3305) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kx[i2];
            return 1;
        } else if (3306 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kz[i2];
            return 1;
        } else if (3307 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = client.kq[i2];
            return 1;
        } else if (3308 == i) {
            i2 = am.jy;
            i3 = oz.ff;
            i5 = da.jc.bq;
            i4 = da.jc.bd;
            int i6 = cq.fz;
            int[] iArr4 = ae;
            int i7 = ds.am - 564452847;
            ds.am = i7;
            iArr4[(i7 * -757592335) - 1] = (((i2 * 1973701849) << 28) + (((i3 * 2060098323) + ((i5 * -1444273727) >> 7)) << 14)) + (((i4 * -1690563339) >> 7) + (i6 * -1866366501));
            return 1;
        } else if (i == 3309) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (i2 >> 14) & 16383;
            return 1;
        } else if (i == 3310) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = i2 >> 28;
            return 1;
        } else if (3311 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = i2 & 16383;
            return 1;
        } else if (3312 == i) {
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (client.ak) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 3313) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = dg.ad(i2 + 32768, i3, -1395138752);
            return 1;
        } else if (3314 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = ih.aq(i2 + 32768, i3, -1993333575);
            return 1;
        } else if (i == 3315) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = et.ar(i2 + 32768, i3, -1959541454);
            return 1;
        } else if (3316 == i) {
            if (client.lq * -408822943 >= 2) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = client.lq * -408822943;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 3317) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.cm * 702155333;
            return 1;
        } else if (i == 3318) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.ar * -2059975617;
            return 1;
        } else if (i == 3321) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.lm * 2056417909;
            return 1;
        } else if (3322 == i) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.ln * 1534723747;
            return 1;
        } else if (3323 == i) {
            if (client.lc) {
                iArr = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = 1;
                return 1;
            }
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 3324) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.al * -925529453;
            return 1;
        } else if (3325 != i) {
            return 2;
        } else {
            ds.am -= 2037155908;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            i5 = ae[(ds.am * -757592335) + 2];
            i4 = ae[(ds.am * -757592335) + 3];
            int[] iArr5 = ae;
            int i8 = ds.am - 564452847;
            ds.am = i8;
            iArr5[(i8 * -757592335) - 1] = ((i2 + (i3 << 14)) + (i5 << 28)) + i4;
            return 1;
        }
    }

    static int dv(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static int dw(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static int dx(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int i3;
        int[] iArr;
        int i4;
        int[] iArr2;
        int[] iArr3;
        int i5;
        int i6;
        if (4000 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 + i3;
            return 1;
        } else if (4001 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 - i3;
            return 1;
        } else if (i == 4002) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 * i3;
            return 1;
        } else if (i == 4003) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 / i3;
            return 1;
        } else if (4004 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (int) (Math.random() * ((double) i2));
            return 1;
        } else if (4005 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (int) (Math.random() * ((double) (i2 + 1)));
            return 1;
        } else if (4006 == i) {
            ds.am -= 1472703061;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            i5 = ae[(ds.am * -757592335) + 2];
            i4 = ae[(ds.am * -757592335) + 3];
            i6 = ae[(ds.am * -757592335) + 4];
            int[] iArr4 = ae;
            int i7 = ds.am - 564452847;
            ds.am = i7;
            iArr4[(i7 * -757592335) - 1] = i2 + (((i3 - i2) * (i6 - i5)) / (i4 - i5));
            return 1;
        } else if (4007 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 + ((i3 * i2) / 100);
            return 1;
        } else if (4008 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 | (1 << i3);
            return 1;
        } else if (i == 4009) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 & (-1 - (1 << i3));
            return 1;
        } else if (i == 4010) {
            ds.am += 1128905694;
            i3 = ae[ds.am * -757592335];
            i5 = ae[(ds.am * -757592335) + 1];
            int[] iArr5 = ae;
            i6 = ds.am - 564452847;
            ds.am = i6;
            if ((i3 & (1 << i5)) != 0) {
                i2 = 1;
            }
            iArr5[(i6 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 4011) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 % i3;
            return 1;
        } else if (4012 == i) {
            ds.am += 1128905694;
            i3 = ae[ds.am * -757592335];
            i5 = ae[(ds.am * -757592335) + 1];
            if (i3 == 0) {
                iArr3 = ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = 0;
                return 1;
            }
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = (int) Math.pow((double) i3, (double) i5);
            return 1;
        } else if (i == 4013) {
            ds.am += 1128905694;
            i3 = ae[ds.am * -757592335];
            i5 = ae[(ds.am * -757592335) + 1];
            if (i3 == 0) {
                iArr3 = ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = 0;
                return 1;
            }
            switch (i5) {
                case 0:
                    iArr2 = ae;
                    i3 = ds.am - 564452847;
                    ds.am = i3;
                    iArr2[(i3 * -757592335) - 1] = Integer.MAX_VALUE;
                    return 1;
                case 1:
                    iArr2 = ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = i3;
                    return 1;
                case 2:
                    iArr2 = ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.sqrt((double) i3);
                    return 1;
                case 3:
                    iArr2 = ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.cbrt((double) i3);
                    return 1;
                case 4:
                    iArr2 = ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.sqrt(Math.sqrt((double) i3));
                    return 1;
                default:
                    iArr2 = ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = (int) Math.pow((double) i3, 1.0d / ((double) i5));
                    return 1;
            }
        } else if (4014 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 & i3;
            return 1;
        } else if (i == 4015) {
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 | i3;
            return 1;
        } else if (4018 != i) {
            return 2;
        } else {
            ds.am += 1693358541;
            long j = (long) ae[ds.am * -757592335];
            long j2 = (long) ae[(ds.am * -757592335) + 1];
            long j3 = (long) ae[(ds.am * -757592335) + 2];
            iArr2 = ae;
            int i8 = ds.am - 564452847;
            ds.am = i8;
            iArr2[(i8 * -757592335) - 1] = (int) ((j * j3) / j2);
            return 1;
        }
    }

    static int dy(int i, hw hwVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int i5;
        boolean z2;
        nx nxVar;
        String[] strArr;
        if (3903 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].al((byte) 35);
            return 1;
        } else if (3904 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].aq * -436588131;
            return 1;
        } else if (i == 3905) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].ar * 1561048985;
            return 1;
        } else if (3906 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].al * 840986365;
            return 1;
        } else if (i == 3907) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].aj * -1488036989;
            return 1;
        } else if (3908 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = client.rr[i2].ai * 1459349409;
            return 1;
        } else if (i == 3910) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (i3 == 0) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 3911) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (2 == i3) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (3912 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (5 == i3) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 3913) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = client.rr[iArr2[i4 * -757592335]].ar(-884885968);
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (i3 == 1) {
                i2 = 1;
            }
            iArr3[(i5 * -757592335) - 1] = i2;
            return 1;
        } else if (3914 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.al, z2, -1714294720);
            return 1;
        } else if (3915 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.ar, z2, -2013430159);
            return 1;
        } else if (i == 3916) {
            ds.am += 1128905694;
            boolean z3 = ae[ds.am * -757592335] == 1;
            if (ae[(ds.am * -757592335) + 1] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            client.ro.ad = z2;
            nc.rb.ad(client.ro, z3, -999213987);
            return 1;
        } else if (3917 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.aq, z2, -1758907268);
            return 1;
        } else if (3918 == i) {
            iArr2 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            if (iArr2[i4 * -757592335] == 1) {
                z2 = true;
            }
            if (nc.rb == null) {
                return 1;
            }
            nc.rb.ad(nz.aj, z2, -2128276213);
            return 1;
        } else if (3919 == i) {
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            if (nc.rb != null) {
                i2 = nc.rb.ad.size();
            }
            iArr2[(i4 * -757592335) - 1] = i2;
            return 1;
        } else if (3920 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ad * -44135447;
            return 1;
        } else if (i == 3921) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            strArr = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr[(i4 * -1883296125) - 1] = nxVar.ad((byte) -37);
            return 1;
        } else if (i == 3922) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            strArr = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr[(i4 * -1883296125) - 1] = nxVar.aq(61055617);
            return 1;
        } else if (i == 3923) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            long ad = (gq.ad((byte) -117) - (dp.ri * 2485203017504217527L)) - (((nx) nc.rb.ad.get(iArr[i3 * -757592335])).aq * -3945319248063608953L);
            i2 = (int) (ad / 3600000);
            ad -= (long) (3600000 * i2);
            i5 = (int) (ad / 60000);
            i3 = (int) ((ad - ((long) (60000 * i5))) / 1000);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i2);
            stringBuilder.append(":");
            stringBuilder.append(i5 / 10);
            stringBuilder.append(i5 % 10);
            stringBuilder.append(":");
            stringBuilder.append(i3 / 10);
            stringBuilder.append(i3 % 10);
            String stringBuilder2 = stringBuilder.toString();
            strArr = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr[(i4 * -1883296125) - 1] = stringBuilder2;
            return 1;
        } else if (3924 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ar.al * 840986365;
            return 1;
        } else if (3925 == i) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ar.ar * 1561048985;
            return 1;
        } else if (i != 3926) {
            return 2;
        } else {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            nxVar = (nx) nc.rb.ad.get(iArr[i3 * -757592335]);
            iArr2 = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = nxVar.ar.aq * -436588131;
            return 1;
        }
    }

    static int dz(int i, hw hwVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        int i3;
        String[] strArr;
        int i4;
        dh aq;
        String[] strArr2;
        int i5;
        String[] strArr3;
        int[] iArr2;
        int[] iArr3;
        dh aq2;
        if (i == 4200) {
            iArr = ae;
            i2 = ds.am + 1989677638;
            ds.am = i2;
            i3 = iArr[i2 * 1141738802];
            strArr = ak;
            i4 = as - 1490481109;
            as = i4;
            strArr[(i4 * 228497581) - 1] = gl.aq(i3, 1945025670).ao;
            return 1;
        } else if (4201 == i) {
            ds.am += 1128905694;
            i3 = ae[ds.am * 1279922222];
            i2 = ae[(ds.am * 808927056) + 1];
            aq = gl.aq(i3, -1701834706);
            if (i2 >= 1 && i2 <= 5) {
                i2--;
                if (aq.bo[i2] != null) {
                    strArr2 = ak;
                    i5 = as - 858394938;
                    as = i5;
                    strArr2[(i5 * -1883296125) - 1] = aq.bo[i2];
                    return 1;
                }
            }
            strArr3 = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr3[(i2 * -1798585619) - 1] = "";
            return 1;
        } else if (-786285499 == i) {
            ds.am += 1128905694;
            i3 = ae[ds.am * -757592335];
            i2 = ae[(ds.am * 34225597) + 1];
            aq = gl.aq(i3, 1823209451);
            if (i2 >= 1 && i2 <= 5) {
                i2--;
                if (aq.bl[i2] != null) {
                    strArr2 = ak;
                    i5 = as - 1490481109;
                    as = i5;
                    strArr2[(i5 * 1701203797) - 1] = aq.bl[i2];
                    return 1;
                }
            }
            strArr3 = ak;
            i2 = as + 650522027;
            as = i2;
            strArr3[(i2 * 1936113817) - 1] = "";
            return 1;
        } else if (i == -898763264) {
            iArr = ae;
            i2 = ds.am - 778805465;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            iArr2 = ae;
            i4 = ds.am - 60185714;
            ds.am = i4;
            iArr2[(i4 * 1303476202) - 1] = gl.aq(i3, 1570396279).bq * -1195053793;
            return 1;
        } else if (842471152 == i) {
            iArr2 = ae;
            i4 = ds.am - 1258193425;
            ds.am = i4;
            i2 = iArr2[i4 * 1676625122];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (gl.aq(i2, -994616567).bm * -1954437925 == 1) {
                z2 = true;
            }
            iArr3[(i5 * -757592335) - 1] = z2;
            return 1;
        } else if (i == 4205) {
            iArr = ae;
            i2 = ds.am - 1506134634;
            ds.am = i2;
            i3 = iArr[i2 * -395348967];
            aq2 = gl.aq(i3, -191885634);
            if (aq2.bp * -1584390227 != -1 || aq2.by * 592320554 < 0) {
                iArr2 = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr2[(i4 * -240057642) - 1] = i3;
                return 1;
            }
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = aq2.by * 687708514;
            return 1;
        } else if (4206 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -1984235128];
            aq2 = gl.aq(i3, -461971152);
            if (aq2.bp * 1951416261 < 0 || aq2.by * 1269103785 < 0) {
                iArr2 = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr2[(i4 * -1721750427) - 1] = i3;
                return 1;
            }
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * 490426653) - 1] = aq2.by * 1650319796;
            return 1;
        } else if (-315952630 == i) {
            iArr2 = ae;
            i4 = ds.am - 1890414473;
            ds.am = i4;
            i2 = iArr2[i4 * 839624719];
            iArr3 = ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            if (gl.aq(i2, 1990342197).bd) {
                z2 = true;
            }
            iArr3[(i5 * -757592335) - 1] = z2;
            return 1;
        } else if (i == 2098831021) {
            iArr = ae;
            i2 = ds.am + 188344549;
            ds.am = i2;
            i3 = iArr[i2 * -165067113];
            aq2 = gl.aq(i3, 247228429);
            if (aq2.cc * -822385594 != -1 || aq2.cy * -1117478649 < 0) {
                iArr2 = ae;
                i4 = ds.am + 1288086973;
                ds.am = i4;
                iArr2[(i4 * -2055867088) - 1] = i3;
                return 1;
            }
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * 1031399898) - 1] = aq2.cy * -1499517591;
            return 1;
        } else if (4209 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -869284439];
            aq2 = gl.aq(i3, 517977368);
            if (aq2.cc * 2031788405 < 0 || aq2.cy * 1255624086 < 0) {
                iArr2 = ae;
                i4 = ds.am - 2035869421;
                ds.am = i4;
                iArr2[(i4 * 1907180983) - 1] = i3;
                return 1;
            }
            iArr = ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = aq2.cy * 1178721684;
            return 1;
        } else if (203540707 == i) {
            strArr = ak;
            i4 = as + 1621023464;
            as = i4;
            String str = strArr[i4 * 2054868087];
            iArr3 = ae;
            i5 = ds.am - 699980937;
            ds.am = i5;
            if (iArr3[i5 * -1147534194] == 1) {
                z2 = true;
            }
            gi.m218if(str, z2, 1758341882);
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 1766361351) - 1] = if.rt * 697017025;
            return 1;
        } else if (i == 4211) {
            if (ib.ra == null || el.rj * 1948118835 >= if.rt * 697017025) {
                iArr = ae;
                i2 = ds.am - 199572869;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            short[] sArr = ib.ra;
            i5 = el.rj + 1282919788;
            el.rj = i5;
            iArr[(i2 * -757592335) - 1] = sArr[(i5 * -1470183393) - 1] & SupportMenu.USER_MASK;
            return 1;
        } else if (i != 4212) {
            return 2;
        } else {
            el.rj = 0;
            return 1;
        }
    }

    static int ea(int i, hw hwVar, boolean z) {
        if (5630 != i) {
            return 2;
        }
        client.ep = -1744733038;
        return 1;
    }

    static int eb(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static int ec(int i, hw hwVar, boolean z) {
        int i2;
        int i3;
        int[] iArr;
        if (i == 5504) {
            ds.am += 1128905694;
            i2 = ae[ds.am * 2136468993];
            i3 = ae[(ds.am * -17241911) + 1];
            if (!client.po) {
                hx.cm(i2, i3, (byte) 24);
            }
            return 1;
        } else if (254838925 == i) {
            iArr = ae;
            i3 = ds.am + 1850904596;
            ds.am = i3;
            iArr[(i3 * -1021850444) - 1] = client.hf * 1836060609;
            return 1;
        } else if (i == 5506) {
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.hq * 1091227615;
            return 1;
        } else if (i == -1448245117) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr[i3 * 1069904505];
            if (i2 < 0) {
                i2 = 0;
            }
            client.he = i2 * 651954147;
            return 1;
        } else if (1084678085 != i) {
            return 2;
        } else {
            iArr = ae;
            i3 = ds.am - 1324036713;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.he * 1604395462;
            return 1;
        }
    }

    static int ed(int i) {
        return (int) (((Math.log((double) i) / ab) - 7.0d) * 256.0d);
    }

    static int ee(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static void ef(int i, ag agVar, boolean z) {
        io.ai((byte) 10).aa(io.ai((byte) -78).bm(i, (byte) 10), new ag(da.jc.ab * -1300496125, ((da.jc.bq * -1444273727) >> 7) + (oz.ff * 2060098323), ((da.jc.bd * -1690563339) >> 7) + (cq.fz * -1866366501)), agVar, z, (byte) 81);
    }

    static int eg(int i) {
        return (int) (((Math.log((double) i) / ab) - 7.0d) * 256.0d);
    }

    static int eh(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        int[] iArr2;
        int i3;
        if (929495023 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 579391208) - 1] = el.ct(-1978181412);
            return 1;
        } else if (i == 1379438701) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            if (i2 != 1 && 2 != i2) {
                return 1;
            }
            cy.co(i2, 356474842);
            return 1;
        } else if (1224263104 == i) {
            iArr = ae;
            i2 = ds.am - 115977465;
            ds.am = i2;
            iArr[(i2 * -1058817591) - 1] = dc.rx.aj * -1491366983;
            return 1;
        } else if (-1091082188 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -1386099740];
            if (i2 != 1 && 2 != i2) {
                return 1;
            }
            dc.rx.aj = i2 * -575337847;
            gn.aj(-13450133);
            return 1;
        } else if (i != 5310) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am + 976164062;
            ds.am = i2;
            client.oy = Math.max(((float) iArr[i2 * 1626223779]) / 1000.0f, 1.77778f);
            client.aq.ck(el.ct(-961032099), (short) 13892);
            return 1;
        }
    }

    static int ei(int i) {
        return (int) Math.pow(2.0d, (double) ((((float) i) / 256.0f) + 7.0f));
    }

    static int ek(int i) {
        return (int) Math.pow(2.0d, (double) ((((float) i) / 256.0f) + 7.0f));
    }

    static int el(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static void em(int i) {
        if (i != -1 && cs.al(i, -2058729638)) {
            al[] alVarArr = dt.ae[i];
            for (al alVar : alVarArr) {
                if (alVar.ec != null) {
                    il ilVar = new il();
                    ilVar.ar = alVar;
                    ilVar.ad = alVar.ec;
                    ar.aq(ilVar, -1082736851, -1768146270);
                }
            }
        }
    }

    static int en(int i) {
        return (int) (((Math.log((double) i) / ab) - 7.0d) * 256.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int eo(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        if (5000 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.of * 1639794603;
            return 1;
        }
        i2 = 2;
        String[] strArr;
        String str;
        int i3;
        ip al;
        int i4;
        String[] strArr2;
        int i5;
        int i6;
        int[] iArr2;
        String toLowerCase;
        if (i == 5001) {
            ds.am += 1693358541;
            client.of = ae[ds.am * -757592335] * 2131458819;
            br.oq = fb.aq(ae[(ds.am * -757592335) + 1], (byte) -94);
            if (br.oq == null) {
                br.oq = pl.aq;
            }
            client.ov = ae[(ds.am * -757592335) + 2] * 1072427593;
            ns aq = ib.aq(no.aw, client.eb.aj, 1155766954);
            aq.ar.al(client.of * 1639794603, -557191458);
            aq.ar.al(br.oq.al * 684750963, -1636357236);
            aq.ar.al(client.ov * -942235655, -541537570);
            client.eb.ar(aq, 566314132);
            return 1;
        } else if (5002 == i) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            str = strArr[i2 * -1883296125];
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            ns aq2 = ib.aq(no.bv, client.eb.aj, 266224045);
            aq2.ar.al(hs.ag(str, (short) 16160) + 2, -1170342563);
            aq2.ar.ap(str, 635769462);
            aq2.ar.al(i2 - 1, 30725078);
            aq2.ar.al(i3, -168049720);
            client.eb.ar(aq2, -668897132);
            return 1;
        } else if (i == 5003) {
            ds.am += 1128905694;
            al = fo.al(ae[ds.am * -757592335], ae[(ds.am * -757592335) + 1], -1110852880);
            if (al != null) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.ad * -106728945;
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.aq * 1147003925;
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.al != null ? al.al : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.am != null ? al.am : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.ak != null ? al.ak : "";
                int[] iArr3 = ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                i6 = al.ar(1718315003) ? 1 : al.ai(2041308123) ? 2 : 0;
                iArr3[(i5 * -757592335) - 1] = i6;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 5004) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            al = es.aj(iArr[i3 * -757592335], -63520358);
            if (al != null) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.ar * -184196553;
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.aq * 1147003925;
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.al != null ? al.al : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.am != null ? al.am : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.ak != null ? al.ak : "";
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                if (al.ar(472759479)) {
                    i2 = 1;
                } else if (!al.ai(2070711964)) {
                    i2 = 0;
                }
                iArr[(i4 * -757592335) - 1] = i2;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            return 1;
        } else if (5005 == i) {
            if (br.oq == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = br.oq.al * 684750963;
            return 1;
        } else if (i == 5008) {
            String toLowerCase2;
            ns aq3;
            int i7;
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            str = strArr[i2 * -1883296125];
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i4 = iArr2[i3 * -757592335];
            toLowerCase = str.toLowerCase();
            i3 = 5;
            if (toLowerCase.startsWith(go.hi)) {
                str = str.substring(go.hi.length());
            } else {
                if (toLowerCase.startsWith(go.ha)) {
                    str = str.substring(go.ha.length());
                } else {
                    if (toLowerCase.startsWith(go.hv)) {
                        str = str.substring(go.hv.length());
                    } else {
                        if (toLowerCase.startsWith(go.hs)) {
                            str = str.substring(go.hs.length());
                        } else {
                            if (toLowerCase.startsWith(go.hm)) {
                                str = str.substring(go.hm.length());
                            } else {
                                if (toLowerCase.startsWith(go.hb)) {
                                    str = str.substring(go.hb.length());
                                } else {
                                    if (toLowerCase.startsWith(go.hn)) {
                                        i2 = 6;
                                        str = str.substring(go.hn.length());
                                    } else if (toLowerCase.startsWith(go.hj)) {
                                        i2 = 7;
                                        str = str.substring(go.hj.length());
                                    } else if (toLowerCase.startsWith(go.ic)) {
                                        i2 = 8;
                                        str = str.substring(go.ic.length());
                                    } else if (toLowerCase.startsWith(go.ie)) {
                                        i2 = 9;
                                        str = str.substring(go.ie.length());
                                    } else if (toLowerCase.startsWith(go.io)) {
                                        i2 = 10;
                                        str = str.substring(go.io.length());
                                    } else if (toLowerCase.startsWith(go.iq)) {
                                        i2 = 11;
                                        str = str.substring(go.iq.length());
                                    } else if (oc.ag != lz.ad) {
                                        if (toLowerCase.startsWith(go.hu)) {
                                            str = str.substring(go.hu.length());
                                        } else if (toLowerCase.startsWith(go.he)) {
                                            str = str.substring(go.he.length());
                                        } else if (toLowerCase.startsWith(go.hz)) {
                                            str = str.substring(go.hz.length());
                                        } else if (toLowerCase.startsWith(go.hw)) {
                                            str = str.substring(go.hw.length());
                                        } else if (toLowerCase.startsWith(go.ho)) {
                                            str = str.substring(go.ho.length());
                                        } else if (toLowerCase.startsWith(go.hy)) {
                                            str = str.substring(go.hy.length());
                                        } else if (toLowerCase.startsWith(go.hl)) {
                                            i2 = 6;
                                            str = str.substring(go.hl.length());
                                        } else if (toLowerCase.startsWith(go.id)) {
                                            i2 = 7;
                                            str = str.substring(go.id.length());
                                        } else if (toLowerCase.startsWith(go.f274if)) {
                                            i2 = 8;
                                            str = str.substring(go.f274if.length());
                                        } else if (toLowerCase.startsWith(go.iv)) {
                                            i2 = 9;
                                            str = str.substring(go.iv.length());
                                        } else if (toLowerCase.startsWith(go.iw)) {
                                            i2 = 10;
                                            str = str.substring(go.iw.length());
                                        } else if (toLowerCase.startsWith(go.ik)) {
                                            i2 = 11;
                                            str = str.substring(go.ik.length());
                                        }
                                    }
                                    toLowerCase2 = str.toLowerCase();
                                    if (toLowerCase2.startsWith(go.ix)) {
                                        str = str.substring(go.ix.length());
                                    } else {
                                        if (toLowerCase2.startsWith(go.ih)) {
                                            str = str.substring(go.ih.length());
                                        } else {
                                            if (toLowerCase2.startsWith(go.ir)) {
                                                str = str.substring(go.ir.length());
                                            } else {
                                                if (toLowerCase2.startsWith(go.ii)) {
                                                    str = str.substring(go.ii.length());
                                                } else {
                                                    if (toLowerCase2.startsWith(go.iy)) {
                                                        str = str.substring(go.iy.length());
                                                    } else {
                                                        if (lz.ad != oc.ag) {
                                                            if (toLowerCase2.startsWith(go.in)) {
                                                                str = str.substring(go.in.length());
                                                            } else if (toLowerCase2.startsWith(go.ib)) {
                                                                str = str.substring(go.ib.length());
                                                            } else if (toLowerCase2.startsWith(go.is)) {
                                                                str = str.substring(go.is.length());
                                                            } else if (toLowerCase2.startsWith(go.ig)) {
                                                                str = str.substring(go.ig.length());
                                                            } else if (toLowerCase2.startsWith(go.ip)) {
                                                                str = str.substring(go.ip.length());
                                                            }
                                                        }
                                                        i3 = 0;
                                                    }
                                                    aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                                                    aq3.ar.al(0, -361713942);
                                                    i7 = aq3.ar.al;
                                                    aq3.ar.al(i4, -1732452460);
                                                    aq3.ar.al(i2, -1734303515);
                                                    aq3.ar.al(i3, -1825183877);
                                                    hl.aq(aq3.ar, str, (byte) -99);
                                                    aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                                                    client.eb.ar(aq3, -958265827);
                                                    return 1;
                                                }
                                                i3 = 4;
                                                aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                                                aq3.ar.al(0, -361713942);
                                                i7 = aq3.ar.al;
                                                aq3.ar.al(i4, -1732452460);
                                                aq3.ar.al(i2, -1734303515);
                                                aq3.ar.al(i3, -1825183877);
                                                hl.aq(aq3.ar, str, (byte) -99);
                                                aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                                                client.eb.ar(aq3, -958265827);
                                                return 1;
                                            }
                                            i3 = 3;
                                            aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                                            aq3.ar.al(0, -361713942);
                                            i7 = aq3.ar.al;
                                            aq3.ar.al(i4, -1732452460);
                                            aq3.ar.al(i2, -1734303515);
                                            aq3.ar.al(i3, -1825183877);
                                            hl.aq(aq3.ar, str, (byte) -99);
                                            aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                                            client.eb.ar(aq3, -958265827);
                                            return 1;
                                        }
                                        i3 = 2;
                                        aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                                        aq3.ar.al(0, -361713942);
                                        i7 = aq3.ar.al;
                                        aq3.ar.al(i4, -1732452460);
                                        aq3.ar.al(i2, -1734303515);
                                        aq3.ar.al(i3, -1825183877);
                                        hl.aq(aq3.ar, str, (byte) -99);
                                        aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                                        client.eb.ar(aq3, -958265827);
                                        return 1;
                                    }
                                    i3 = 1;
                                    aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                                    aq3.ar.al(0, -361713942);
                                    i7 = aq3.ar.al;
                                    aq3.ar.al(i4, -1732452460);
                                    aq3.ar.al(i2, -1734303515);
                                    aq3.ar.al(i3, -1825183877);
                                    hl.aq(aq3.ar, str, (byte) -99);
                                    aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                                    client.eb.ar(aq3, -958265827);
                                    return 1;
                                }
                                i2 = 5;
                                toLowerCase2 = str.toLowerCase();
                                if (toLowerCase2.startsWith(go.ix)) {
                                }
                                i3 = 1;
                                aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                                aq3.ar.al(0, -361713942);
                                i7 = aq3.ar.al;
                                aq3.ar.al(i4, -1732452460);
                                aq3.ar.al(i2, -1734303515);
                                aq3.ar.al(i3, -1825183877);
                                hl.aq(aq3.ar, str, (byte) -99);
                                aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                                client.eb.ar(aq3, -958265827);
                                return 1;
                            }
                            i2 = 4;
                            toLowerCase2 = str.toLowerCase();
                            if (toLowerCase2.startsWith(go.ix)) {
                            }
                            i3 = 1;
                            aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                            aq3.ar.al(0, -361713942);
                            i7 = aq3.ar.al;
                            aq3.ar.al(i4, -1732452460);
                            aq3.ar.al(i2, -1734303515);
                            aq3.ar.al(i3, -1825183877);
                            hl.aq(aq3.ar, str, (byte) -99);
                            aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                            client.eb.ar(aq3, -958265827);
                            return 1;
                        }
                        i2 = 3;
                        toLowerCase2 = str.toLowerCase();
                        if (toLowerCase2.startsWith(go.ix)) {
                        }
                        i3 = 1;
                        aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                        aq3.ar.al(0, -361713942);
                        i7 = aq3.ar.al;
                        aq3.ar.al(i4, -1732452460);
                        aq3.ar.al(i2, -1734303515);
                        aq3.ar.al(i3, -1825183877);
                        hl.aq(aq3.ar, str, (byte) -99);
                        aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                        client.eb.ar(aq3, -958265827);
                        return 1;
                    }
                    i2 = 2;
                    toLowerCase2 = str.toLowerCase();
                    if (toLowerCase2.startsWith(go.ix)) {
                    }
                    i3 = 1;
                    aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                    aq3.ar.al(0, -361713942);
                    i7 = aq3.ar.al;
                    aq3.ar.al(i4, -1732452460);
                    aq3.ar.al(i2, -1734303515);
                    aq3.ar.al(i3, -1825183877);
                    hl.aq(aq3.ar, str, (byte) -99);
                    aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                    client.eb.ar(aq3, -958265827);
                    return 1;
                }
                i2 = 1;
                toLowerCase2 = str.toLowerCase();
                if (toLowerCase2.startsWith(go.ix)) {
                }
                i3 = 1;
                aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
                aq3.ar.al(0, -361713942);
                i7 = aq3.ar.al;
                aq3.ar.al(i4, -1732452460);
                aq3.ar.al(i2, -1734303515);
                aq3.ar.al(i3, -1825183877);
                hl.aq(aq3.ar, str, (byte) -99);
                aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
                client.eb.ar(aq3, -958265827);
                return 1;
            }
            i2 = 0;
            toLowerCase2 = str.toLowerCase();
            if (toLowerCase2.startsWith(go.ix)) {
            }
            i3 = 1;
            aq3 = ib.aq(no.dq, client.eb.aj, 65103672);
            aq3.ar.al(0, -361713942);
            i7 = aq3.ar.al;
            aq3.ar.al(i4, -1732452460);
            aq3.ar.al(i2, -1734303515);
            aq3.ar.al(i3, -1825183877);
            hl.aq(aq3.ar, str, (byte) -99);
            aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -74);
            client.eb.ar(aq3, -958265827);
            return 1;
        } else if (5009 == i) {
            as -= 1314005078;
            str = ak[as * -1883296125];
            toLowerCase = ak[(as * -1883296125) + 1];
            ns aq4 = ib.aq(no.at, client.eb.aj, -64567855);
            aq4.ar.aj(0, 666833306);
            i4 = aq4.ar.al;
            aq4.ar.ap(str, 635769462);
            hl.aq(aq4.ar, toLowerCase, (byte) -103);
            aq4.ar.ac((aq4.ar.al * -1631454091) - (i4 * -1631454091), 1854295833);
            client.eb.ar(aq4, 831779510);
            return 1;
        } else if (i == 5015) {
            str = (da.jc == null || da.jc.ad == null) ? "" : da.jc.ad.ad(-1926547522);
            String[] strArr3 = ak;
            i3 = as - 1490481109;
            as = i3;
            strArr3[(i3 * -1883296125) - 1] = str;
            return 1;
        } else if (5016 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.ov * -942235655;
            return 1;
        } else if (i == 5017) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i6 = iArr[i2 * -757592335];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = hx.ai(i6, (byte) -82);
            return 1;
        } else if (i == 5018) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i6 = iArr[i2 * -757592335];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = cn.ag(i6, (byte) 119);
            return 1;
        } else if (i == 5019) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i6 = iArr[i2 * -757592335];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = ay.as(i6, -1458848258);
            return 1;
        } else if (5020 == i) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            dl.cv(strArr[i2 * -1883296125], (short) -9345);
            return 1;
        } else if (i == 5021) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            client.on = strArr[i2 * -1883296125].toLowerCase().trim();
            return 1;
        } else if (i == 5022) {
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = client.on;
            return 1;
        } else if (i != 5023) {
            return 2;
        } else {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            System.out.println(strArr[i2 * -1883296125]);
            return 1;
        }
    }

    static void ep(int i) {
        if (i != -1 && cs.al(i, -2066188601)) {
            al[] alVarArr = dt.ae[i];
            for (al alVar : alVarArr) {
                if (alVar.ec != null) {
                    il ilVar = new il();
                    ilVar.ar = alVar;
                    ilVar.ad = alVar.ec;
                    ar.aq(ilVar, GmsVersion.VERSION_LONGHORN, -1768146270);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int eq(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        if (-325636674 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -1457715907) - 1] = client.of * 1639794603;
            return 1;
        }
        i2 = 2;
        String[] strArr;
        String str;
        int i3;
        ns aq;
        ip al;
        int i4;
        String[] strArr2;
        int i5;
        int i6;
        int i7;
        int[] iArr2;
        if (i == -787041210) {
            ds.am -= 1048313584;
            client.of = ae[ds.am * -757592335] * 823847703;
            br.oq = fb.aq(ae[(ds.am * -757592335) + 1], (byte) -97);
            if (br.oq == null) {
                br.oq = pl.aq;
            }
            client.ov = ae[(ds.am * -757592335) + 2] * 1072427593;
            ns aq2 = ib.aq(no.aw, client.eb.aj, 939807410);
            aq2.ar.al(client.of * 1639794603, -1234667800);
            aq2.ar.al(br.oq.al * 684750963, -579910276);
            aq2.ar.al(client.ov * -1233528663, -1267697947);
            client.eb.ar(aq2, 1360072123);
            return 1;
        } else if (21997959 == i) {
            strArr = ak;
            i2 = as - 1018298621;
            as = i2;
            str = strArr[i2 * -1883296125];
            ds.am += 451708833;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * 2108301064) + 1];
            aq = ib.aq(no.bv, client.eb.aj, -214560356);
            aq.ar.al(hs.ag(str, (short) 2335) + 2, -2042572929);
            aq.ar.ap(str, 635769462);
            aq.ar.al(i2 - 1, -484133627);
            aq.ar.al(i3, -955583889);
            client.eb.ar(aq, 1097157081);
            return 1;
        } else if (i == 5003) {
            ds.am += 1548641107;
            al = fo.al(ae[ds.am * -1040444976], ae[(ds.am * -882490601) + 1], -1454569870);
            if (al != null) {
                iArr = ae;
                i4 = ds.am + 492538136;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.ad * -106728945;
                iArr = ae;
                i4 = ds.am + 2023415105;
                ds.am = i4;
                iArr[(i4 * -760277008) - 1] = al.aq * 78030516;
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.al != null ? al.al : "";
                strArr2 = ak;
                i5 = 622396878 + as;
                as = i5;
                strArr2[(i5 * -1263040415) - 1] = al.am != null ? al.am : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * 2115130533) - 1] = al.ak != null ? al.ak : "";
                int[] iArr3 = ae;
                i5 = 1907649395 + ds.am;
                ds.am = i5;
                i6 = al.ar(1872260450) ? 1 : al.ai(2088195850) ? 2 : 0;
                iArr3[(613522524 * i5) - 1] = i6;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 435227937;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            iArr = ae;
            i2 = ds.am - 1451087691;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            strArr = ak;
            i2 = as + 1179731616;
            as = i2;
            strArr[(i2 * 1396128429) - 1] = "";
            strArr = ak;
            i2 = as - 858228099;
            as = i2;
            strArr[(i2 * -922331924) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * 35692174) - 1] = "";
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 1170781510) {
            iArr = ae;
            i7 = ds.am - 828603094;
            ds.am = i7;
            al = es.aj(iArr[i7 * -757592335], -63520358);
            if (al != null) {
                iArr = ae;
                i4 = ds.am - 188347788;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.ar * -184196553;
                iArr = ae;
                i4 = ds.am - 1421630043;
                ds.am = i4;
                iArr[(i4 * 430747112) - 1] = al.aq * 1147003925;
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.al != null ? al.al : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * 81138897) - 1] = al.am != null ? al.am : "";
                strArr2 = ak;
                i5 = 1849115174 + as;
                as = i5;
                strArr2[(i5 * 305958569) - 1] = al.ak != null ? al.ak : "";
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                if (al.ar(1387832212)) {
                    i2 = 1;
                } else if (!al.ai(2002871791)) {
                    i2 = 0;
                }
                iArr[(i4 * -757592335) - 1] = i2;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 1108343130;
            ds.am = i2;
            iArr[(i2 * 1211033031) - 1] = -1;
            iArr = ae;
            i2 = ds.am + 729946559;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            strArr = ak;
            i2 = as + 1261956102;
            as = i2;
            strArr[(i2 * -1334859202) - 1] = "";
            strArr = ak;
            i2 = as + 787533143;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 986532260;
            as = i2;
            strArr[(i2 * 2049709436) - 1] = "";
            iArr = ae;
            i2 = ds.am + 1519516745;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            return 1;
        } else if (5005 == i) {
            if (br.oq == null) {
                iArr = ae;
                i2 = ds.am - 1902940029;
                ds.am = i2;
                iArr[(i2 * -2054418146) - 1] = -1;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 1729805330) - 1] = br.oq.al * 684750963;
            return 1;
        } else if (i == 5008) {
            String toLowerCase;
            ns aq3;
            strArr = ak;
            i7 = as + 815303049;
            as = i7;
            str = strArr[i7 * 2038335976];
            int[] iArr4 = ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i4 = iArr4[i4 * -1789261899];
            String toLowerCase2 = str.toLowerCase();
            if (toLowerCase2.startsWith(go.hi)) {
                str = str.substring(go.hi.length());
            } else {
                if (toLowerCase2.startsWith(go.ha)) {
                    str = str.substring(go.ha.length());
                } else {
                    if (toLowerCase2.startsWith(go.hv)) {
                        str = str.substring(go.hv.length());
                    } else {
                        if (toLowerCase2.startsWith(go.hs)) {
                            str = str.substring(go.hs.length());
                        } else {
                            if (toLowerCase2.startsWith(go.hm)) {
                                str = str.substring(go.hm.length());
                            } else {
                                if (toLowerCase2.startsWith(go.hb)) {
                                    str = str.substring(go.hb.length());
                                } else {
                                    if (toLowerCase2.startsWith(go.hn)) {
                                        str = str.substring(go.hn.length());
                                    } else {
                                        if (toLowerCase2.startsWith(go.hj)) {
                                            i7 = 7;
                                            str = str.substring(go.hj.length());
                                        } else if (toLowerCase2.startsWith(go.ic)) {
                                            i7 = 8;
                                            str = str.substring(go.ic.length());
                                        } else if (toLowerCase2.startsWith(go.ie)) {
                                            i7 = 9;
                                            str = str.substring(go.ie.length());
                                        } else if (toLowerCase2.startsWith(go.io)) {
                                            i7 = 10;
                                            str = str.substring(go.io.length());
                                        } else if (toLowerCase2.startsWith(go.iq)) {
                                            i7 = 11;
                                            str = str.substring(go.iq.length());
                                        } else if (oc.ag != lz.ad) {
                                            if (toLowerCase2.startsWith(go.hu)) {
                                                str = str.substring(go.hu.length());
                                            } else if (toLowerCase2.startsWith(go.he)) {
                                                str = str.substring(go.he.length());
                                            } else if (toLowerCase2.startsWith(go.hz)) {
                                                str = str.substring(go.hz.length());
                                            } else if (toLowerCase2.startsWith(go.hw)) {
                                                str = str.substring(go.hw.length());
                                            } else if (toLowerCase2.startsWith(go.ho)) {
                                                str = str.substring(go.ho.length());
                                            } else if (toLowerCase2.startsWith(go.hy)) {
                                                str = str.substring(go.hy.length());
                                            } else if (toLowerCase2.startsWith(go.hl)) {
                                                str = str.substring(go.hl.length());
                                            } else if (toLowerCase2.startsWith(go.id)) {
                                                i7 = 7;
                                                str = str.substring(go.id.length());
                                            } else if (toLowerCase2.startsWith(go.f274if)) {
                                                i7 = 8;
                                                str = str.substring(go.f274if.length());
                                            } else if (toLowerCase2.startsWith(go.iv)) {
                                                i7 = 9;
                                                str = str.substring(go.iv.length());
                                            } else if (toLowerCase2.startsWith(go.iw)) {
                                                i7 = 10;
                                                str = str.substring(go.iw.length());
                                            } else if (toLowerCase2.startsWith(go.ik)) {
                                                i7 = 11;
                                                str = str.substring(go.ik.length());
                                            }
                                        }
                                        toLowerCase = str.toLowerCase();
                                        if (toLowerCase.startsWith(go.ix)) {
                                            if (toLowerCase.startsWith(go.ih)) {
                                                str = str.substring(go.ih.length());
                                            } else {
                                                if (toLowerCase.startsWith(go.ir)) {
                                                    str = str.substring(go.ir.length());
                                                } else {
                                                    if (toLowerCase.startsWith(go.ii)) {
                                                        str = str.substring(go.ii.length());
                                                    } else {
                                                        if (toLowerCase.startsWith(go.iy)) {
                                                            str = str.substring(go.iy.length());
                                                        } else {
                                                            if (lz.ad != oc.ag) {
                                                                if (toLowerCase.startsWith(go.in)) {
                                                                    str = str.substring(go.in.length());
                                                                } else if (toLowerCase.startsWith(go.ib)) {
                                                                    str = str.substring(go.ib.length());
                                                                } else if (toLowerCase.startsWith(go.is)) {
                                                                    str = str.substring(go.is.length());
                                                                } else if (toLowerCase.startsWith(go.ig)) {
                                                                    str = str.substring(go.ig.length());
                                                                } else if (toLowerCase.startsWith(go.ip)) {
                                                                    str = str.substring(go.ip.length());
                                                                }
                                                            }
                                                            i2 = 0;
                                                        }
                                                        i2 = 5;
                                                    }
                                                    i2 = 4;
                                                }
                                                i2 = 3;
                                            }
                                            aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                                            aq3.ar.al(0, -1003563049);
                                            i3 = aq3.ar.al;
                                            aq3.ar.al(i4, -1092051368);
                                            aq3.ar.al(i7, 17815462);
                                            aq3.ar.al(i2, -1198997401);
                                            hl.aq(aq3.ar, str, (byte) 5);
                                            aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                                            client.eb.ar(aq3, -673504420);
                                            return 1;
                                        }
                                        str = str.substring(go.ix.length());
                                        i2 = 1;
                                        aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                                        aq3.ar.al(0, -1003563049);
                                        i3 = aq3.ar.al;
                                        aq3.ar.al(i4, -1092051368);
                                        aq3.ar.al(i7, 17815462);
                                        aq3.ar.al(i2, -1198997401);
                                        hl.aq(aq3.ar, str, (byte) 5);
                                        aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                                        client.eb.ar(aq3, -673504420);
                                        return 1;
                                    }
                                    i7 = 6;
                                    toLowerCase = str.toLowerCase();
                                    if (toLowerCase.startsWith(go.ix)) {
                                    }
                                    i2 = 1;
                                    aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                                    aq3.ar.al(0, -1003563049);
                                    i3 = aq3.ar.al;
                                    aq3.ar.al(i4, -1092051368);
                                    aq3.ar.al(i7, 17815462);
                                    aq3.ar.al(i2, -1198997401);
                                    hl.aq(aq3.ar, str, (byte) 5);
                                    aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                                    client.eb.ar(aq3, -673504420);
                                    return 1;
                                }
                                i7 = 5;
                                toLowerCase = str.toLowerCase();
                                if (toLowerCase.startsWith(go.ix)) {
                                }
                                i2 = 1;
                                aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                                aq3.ar.al(0, -1003563049);
                                i3 = aq3.ar.al;
                                aq3.ar.al(i4, -1092051368);
                                aq3.ar.al(i7, 17815462);
                                aq3.ar.al(i2, -1198997401);
                                hl.aq(aq3.ar, str, (byte) 5);
                                aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                                client.eb.ar(aq3, -673504420);
                                return 1;
                            }
                            i7 = 4;
                            toLowerCase = str.toLowerCase();
                            if (toLowerCase.startsWith(go.ix)) {
                            }
                            i2 = 1;
                            aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                            aq3.ar.al(0, -1003563049);
                            i3 = aq3.ar.al;
                            aq3.ar.al(i4, -1092051368);
                            aq3.ar.al(i7, 17815462);
                            aq3.ar.al(i2, -1198997401);
                            hl.aq(aq3.ar, str, (byte) 5);
                            aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                            client.eb.ar(aq3, -673504420);
                            return 1;
                        }
                        i7 = 3;
                        toLowerCase = str.toLowerCase();
                        if (toLowerCase.startsWith(go.ix)) {
                        }
                        i2 = 1;
                        aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                        aq3.ar.al(0, -1003563049);
                        i3 = aq3.ar.al;
                        aq3.ar.al(i4, -1092051368);
                        aq3.ar.al(i7, 17815462);
                        aq3.ar.al(i2, -1198997401);
                        hl.aq(aq3.ar, str, (byte) 5);
                        aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                        client.eb.ar(aq3, -673504420);
                        return 1;
                    }
                    i7 = 2;
                    toLowerCase = str.toLowerCase();
                    if (toLowerCase.startsWith(go.ix)) {
                    }
                    i2 = 1;
                    aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                    aq3.ar.al(0, -1003563049);
                    i3 = aq3.ar.al;
                    aq3.ar.al(i4, -1092051368);
                    aq3.ar.al(i7, 17815462);
                    aq3.ar.al(i2, -1198997401);
                    hl.aq(aq3.ar, str, (byte) 5);
                    aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                    client.eb.ar(aq3, -673504420);
                    return 1;
                }
                i7 = 1;
                toLowerCase = str.toLowerCase();
                if (toLowerCase.startsWith(go.ix)) {
                }
                i2 = 1;
                aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
                aq3.ar.al(0, -1003563049);
                i3 = aq3.ar.al;
                aq3.ar.al(i4, -1092051368);
                aq3.ar.al(i7, 17815462);
                aq3.ar.al(i2, -1198997401);
                hl.aq(aq3.ar, str, (byte) 5);
                aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
                client.eb.ar(aq3, -673504420);
                return 1;
            }
            i7 = 0;
            toLowerCase = str.toLowerCase();
            if (toLowerCase.startsWith(go.ix)) {
            }
            i2 = 1;
            aq3 = ib.aq(no.dq, client.eb.aj, 1990533597);
            aq3.ar.al(0, -1003563049);
            i3 = aq3.ar.al;
            aq3.ar.al(i4, -1092051368);
            aq3.ar.al(i7, 17815462);
            aq3.ar.al(i2, -1198997401);
            hl.aq(aq3.ar, str, (byte) 5);
            aq3.ar.aa((aq3.ar.al * -1631454091) - (i3 * -740145698), (byte) 6);
            client.eb.ar(aq3, -673504420);
            return 1;
        } else if (5009 == i) {
            as -= 1314005078;
            str = ak[as * -1883296125];
            String str2 = ak[(as * 408140684) + 1];
            aq = ib.aq(no.at, client.eb.aj, 2007066037);
            aq.ar.aj(0, 917570183);
            i3 = aq.ar.al;
            aq.ar.ap(str, 635769462);
            hl.aq(aq.ar, str2, (byte) 60);
            aq.ar.ac((aq.ar.al * -175098918) - (i3 * 141985923), 1474983532);
            client.eb.ar(aq, 321894515);
            return 1;
        } else if (i == 5015) {
            str = (da.jc == null || da.jc.ad == null) ? "" : da.jc.ad.ad(-1875316069);
            String[] strArr3 = ak;
            i3 = as + 1760277770;
            as = i3;
            strArr3[(i3 * 1847849958) - 1] = str;
            return 1;
        } else if (-654726056 == i) {
            iArr = ae;
            i2 = ds.am - 1122030445;
            ds.am = i2;
            iArr[(i2 * -407711252) - 1] = client.ov * -942235655;
            return 1;
        } else if (i == 5017) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i6 = iArr[i2 * -568528859];
            iArr2 = ae;
            i3 = ds.am - 1830546388;
            ds.am = i3;
            iArr2[(i3 * -1857190383) - 1] = hx.ai(i6, (byte) -55);
            return 1;
        } else if (i == 5018) {
            iArr = ae;
            i2 = ds.am - 1261214440;
            ds.am = i2;
            i6 = iArr[i2 * 318184339];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * 72980724) - 1] = cn.ag(i6, (byte) 116);
            return 1;
        } else if (i == -1822165985) {
            iArr = ae;
            i2 = ds.am - 622875052;
            ds.am = i2;
            i6 = iArr[i2 * -757592335];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -2052229603) - 1] = ay.as(i6, -1458848258);
            return 1;
        } else if (1105936816 == i) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            dl.cv(strArr[i2 * -1883296125], (short) -3123);
            return 1;
        } else if (i == -423904196) {
            strArr = ak;
            i2 = as + 1496049905;
            as = i2;
            client.on = strArr[i2 * -1883296125].toLowerCase().trim();
            return 1;
        } else if (i == 88372254) {
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * 883170709) - 1] = client.on;
            return 1;
        } else if (i != 332183521) {
            return 2;
        } else {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            System.out.println(strArr[i2 * -1883296125]);
            return 1;
        }
    }

    static int er(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        if (6200 == i) {
            ds.am += 1128905694;
            client.qi = (short) kw.bf(ae[ds.am * -757592335], -1152733688);
            if (client.qi <= (short) 0) {
                client.qi = (short) 256;
            }
            client.qc = (short) kw.bf(ae[(ds.am * -757592335) + 1], -194892429);
            if (client.qc <= (short) 0) {
                client.qc = (short) 256;
            }
            return 1;
        } else if (i == 6201) {
            ds.am += 1128905694;
            client.qm = (short) ae[ds.am * -757592335];
            if (client.qm <= (short) 0) {
                client.qm = (short) 256;
            }
            client.qe = (short) ae[(ds.am * -757592335) + 1];
            if (client.qe <= (short) 0) {
                client.qe = (short) 320;
            }
            return 1;
        } else if (i == 6202) {
            ds.am -= 2037155908;
            client.qf = (short) ae[ds.am * -757592335];
            if (client.qf <= (short) 0) {
                client.qf = (short) 1;
            }
            client.qn = (short) ae[(ds.am * -757592335) + 1];
            if (client.qn <= (short) 0) {
                client.qn = Short.MAX_VALUE;
            } else if (client.qn < client.qf) {
                client.qn = client.qf;
            }
            client.qt = (short) ae[(ds.am * -757592335) + 2];
            if (client.qt <= (short) 0) {
                client.qt = (short) 1;
            }
            client.qv = (short) ae[(ds.am * -757592335) + 3];
            if (client.qv <= (short) 0) {
                client.qv = Short.MAX_VALUE;
                return 1;
            }
            if (client.qv < client.qt) {
                client.qv = client.qt;
            }
            return 1;
        } else if (i == 6203) {
            if (client.lw != null) {
                em.dd(0, 0, 1272191791 * client.lw.bl, 1813264797 * client.lw.bf, false, 5379157);
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = client.qr * 1271637141;
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = client.rh * -402617027;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            return 1;
        } else if (i == 6204) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.qm;
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.qe;
            return 1;
        } else if (i != 6205) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = gh.bb(client.qi, -1442248623);
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = gh.bb(client.qc, 648669928);
            return 1;
        }
    }

    static int et(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static int eu(int i, hw hwVar, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static void ev(int i) {
        if (i != -1 && cs.al(i, -2141626930)) {
            al[] alVarArr = dt.ae[i];
            for (al alVar : alVarArr) {
                if (alVar.ec != null) {
                    il ilVar = new il();
                    ilVar.ar = alVar;
                    ilVar.ad = alVar.ec;
                    ar.aq(ilVar, GmsVersion.VERSION_LONGHORN, -1768146270);
                }
            }
        }
    }

    static int ew(int i, hw hwVar, boolean z) {
        byte b = (byte) 0;
        int[] iArr;
        int i2;
        dm bm;
        String[] strArr;
        int i3;
        int[] iArr2;
        ag agVar;
        dm bm2;
        ag bi;
        ag agVar2;
        int[] iArr3;
        int i4;
        pd ai;
        boolean z2;
        cf cw;
        dy aq;
        if (i == 347575291) {
            io.ai((byte) -111).ap(am.jy * 954950489, ((da.jc.bq * 2018260422) >> 7) + (oz.ff * -1462259811), (-1866366501 * cq.fz) + ((1333499876 * da.jc.bd) >> 7), true, -394599043);
            return 1;
        } else if (6601 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i2 = iArr[i2 * -1087682429];
            String str = "";
            bm = io.ai((byte) -7).bm(i2, (byte) 55);
            if (bm != null) {
                str = bm.ac(-283962809);
            }
            strArr = ak;
            i3 = as - 1490481109;
            as = i3;
            strArr[(i3 * 1539599932) - 1] = str;
            return 1;
        } else if (727365038 == i) {
            iArr = ae;
            i2 = ds.am - 1090449240;
            ds.am = i2;
            io.ai((byte) 73).au(iArr[i2 * -1200160578], 2109893524);
            return 1;
        } else if (i == 392131797) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 121397608) - 1] = io.ai((byte) -93).bk((byte) -31);
            return 1;
        } else if (i == 6604) {
            iArr = ae;
            i2 = ds.am + 693744293;
            ds.am = i2;
            io.ai((byte) 62).ab(iArr[i2 * 121469433], -1543811476);
            return 1;
        } else if (i == 531247130) {
            iArr2 = ae;
            i3 = ds.am - 557417133;
            ds.am = i3;
            if (io.ai((byte) 86).bs((byte) 0)) {
                b = (byte) 1;
            }
            iArr2[(i3 * -757592335) - 1] = b;
            return 1;
        } else if (i == -231919537) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            agVar = new ag(iArr[i2 * -198549554]);
            io.ai((byte) 77).bq(agVar.aq * 1974728429, agVar.ar * 392806146, (byte) -2);
            return 1;
        } else if (6607 == i) {
            iArr = ae;
            i2 = ds.am - 483379460;
            ds.am = i2;
            agVar = new ag(iArr[i2 * -1182000851]);
            io.ai((byte) 79).bd(agVar.aq * -1822118049, agVar.ar * -1129812379, -2079750152);
            return 1;
        } else if (i == 6608) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            agVar = new ag(iArr[i2 * 1790399328]);
            io.ai((byte) 31).bo(agVar.ad * 435511160, agVar.aq * -1822118049, agVar.ar * 738029977, 1615324010);
            return 1;
        } else if (482498450 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            agVar = new ag(iArr[i2 * -1049822341]);
            io.ai((byte) -12).bl(agVar.ad * 1224907159, agVar.aq * -1822118049, agVar.ar * 738029977, (byte) -42);
            return 1;
        } else if (i == 6610) {
            iArr = ae;
            i2 = ds.am + 702826398;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = io.ai((byte) -34).bf((short) 18442);
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -155745909) - 1] = io.ai((byte) 31).bb(1897151909);
            return 1;
        } else if (i == 6611) {
            iArr2 = ae;
            i3 = ds.am - 1343828953;
            ds.am = i3;
            bm = io.ai((byte) -55).bm(iArr2[i3 * -757592335], (byte) 81);
            if (bm == null) {
                iArr2 = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr2[(i3 * -137233701) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i3 = ds.am - 1817829604;
            ds.am = i3;
            iArr[(i3 * -526220282) - 1] = bm.bk(-974164513).ad((byte) -19);
            return 1;
        } else if (6612 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            bm = io.ai((byte) -1).bm(iArr2[i3 * -757592335], (byte) 18);
            if (bm == null) {
                iArr2 = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                iArr2 = ae;
                i3 = ds.am - 224413947;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i3 = ds.am - 1984214218;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = ((bm.af(-1520890370) - bm.ah(-1821916464)) + 1) * 64;
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = ((bm.an(382019974) - bm.ay((byte) -1)) + 1) * -1780969993;
            return 1;
        } else if (6613 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            bm = io.ai((byte) 21).bm(iArr2[i3 * 94892165], (byte) 7);
            if (bm == null) {
                iArr2 = ae;
                i3 = ds.am + 926784357;
                ds.am = i3;
                iArr2[(i3 * -339573890) - 1] = 0;
                iArr2 = ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr2[(i3 * 1348381566) - 1] = 0;
                iArr2 = ae;
                i3 = ds.am - 2082667163;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                iArr2 = ae;
                i3 = ds.am - 1714506193;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                return 1;
            }
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = bm.ah(-1821916464) * 64;
            iArr = ae;
            i3 = ds.am - 63471351;
            ds.am = i3;
            iArr[(i3 * -229048734) - 1] = bm.ay((byte) 61) * -767486162;
            iArr = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * 1174857160) - 1] = ((bm.af(-1404609536) * -193638825) - 961522331) - 1;
            iArr = ae;
            i3 = ds.am - 1420812186;
            ds.am = i3;
            iArr[(i3 * 1769571348) - 1] = ((bm.an(-127142434) * 64) + 64) - 1;
            return 1;
        } else if (6614 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            bm2 = io.ai((byte) -123).bm(iArr[i2 * -757592335], (byte) 89);
            if (bm2 == null) {
                iArr = ae;
                i2 = ds.am + 320151348;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = bm2.ao(-1830959990);
            return 1;
        } else if (i == 6615) {
            bi = io.ai((byte) -40).bi((byte) -7);
            if (bi == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                iArr = ae;
                i2 = ds.am - 1372494614;
                ds.am = i2;
                iArr[(i2 * -2007983550) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 752002713;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = bi.aq * -1822118049;
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * 244215773) - 1] = bi.ar * 827205420;
            return 1;
        } else if (i == 890820160) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 119154694) - 1] = io.ai((byte) 23).az(-1418339655);
            return 1;
        } else if (i == -1951099392) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            agVar2 = new ag(iArr2[i3 * -757592335]);
            bm = io.ai((byte) -90).ax(900698749);
            if (bm == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -1655329035) - 1] = -1;
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr2 = bm.ag(agVar2.ad * -425438573, agVar2.aq * -1822118049, agVar2.ar * 211106560, (byte) -31);
            if (iArr2 == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr3 = ae;
            i4 = ds.am + 729975515;
            ds.am = i4;
            iArr3[(i4 * -837854863) - 1] = iArr2[0];
            iArr = ae;
            i3 = ds.am + 1059931426;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = iArr2[1];
            return 1;
        } else if (i == -304905105) {
            iArr = ae;
            i2 = ds.am - 235619956;
            ds.am = i2;
            agVar = new ag(iArr[i2 * -2043892442]);
            bm2 = io.ai((byte) -27).ax(1109993606);
            if (bm2 == null) {
                iArr = ae;
                i2 = ds.am + 1150017911;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            bi = bm2.ap(agVar.aq * -478161616, agVar.ar * 738029977, 1910639441);
            if (bi == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 290475725;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = bi.ad((byte) -28);
            return 1;
        } else if (i == 6619) {
            ds.am += 1128905694;
            gv.bx(ae[ds.am * 1027062070], new ag(ae[(ds.am * -757592335) + 1]), false, (short) -4078);
            return 1;
        } else if (i == 6620) {
            ds.am += 2124251361;
            gv.bx(ae[ds.am * -757592335], new ag(ae[(ds.am * -757592335) + 1]), true, (short) -4265);
            return 1;
        } else if (1126707186 == i) {
            ds.am += 78239340;
            i2 = ae[ds.am * -2121629977];
            agVar = new ag(ae[(ds.am * 1197975376) + 1]);
            bm = io.ai((byte) -37).bm(i2, (byte) 90);
            if (bm == null) {
                iArr2 = ae;
                i3 = ds.am + 1623326278;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                return 1;
            }
            int[] iArr4 = ae;
            int i5 = ds.am - 370759488;
            ds.am = i5;
            if (bm.ak(agVar.ad * 1224907159, agVar.aq * -175934329, agVar.ar * -1280544297, (byte) -32)) {
                b = (byte) 1;
            }
            iArr4[(i5 * -757592335) - 1] = b;
            return 1;
        } else if (i == 6622) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = io.ai((byte) 103).bc(1841349073);
            iArr = ae;
            i2 = ds.am - 1063894274;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = io.ai((byte) 88).bv(1495672104);
            return 1;
        } else if (6623 == i) {
            iArr2 = ae;
            i3 = ds.am + 1022550075;
            ds.am = i3;
            agVar2 = new ag(iArr2[i3 * -757592335]);
            bm2 = io.ai((byte) -11).ag(agVar2.ad * -1604591022, agVar2.aq * 700902675, agVar2.ar * 738029977, (byte) 0);
            if (bm2 == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -1294713907) - 1] = bm2.az(-364779650);
            return 1;
        } else if (i == 961118235) {
            ai = io.ai((byte) -52);
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            ai.bg(iArr2[i3 * -757592335], (byte) -40);
            return 1;
        } else if (i == 6625) {
            io.ai((byte) 8).bx((short) -5976);
            return 1;
        } else if (i == 6626) {
            ai = io.ai((byte) 40);
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            ai.bu(iArr2[i3 * -757592335], (byte) -68);
            return 1;
        } else if (-1786154167 == i) {
            io.ai((byte) 54).bw(-1206321079);
            return 1;
        } else if (i == -238706400) {
            iArr2 = ae;
            i3 = ds.am - 910097988;
            ds.am = i3;
            if (iArr2[i3 * -757592335] == 1) {
                z2 = true;
            }
            io.ai((byte) 86).br(z2, (byte) 119);
            return 1;
        } else if (1969773607 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            io.ai((byte) -44).be(iArr[i2 * -757592335], 2102955098);
            return 1;
        } else if (i == 6630) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            io.ai((byte) -38).bj(iArr[i2 * -757592335], (byte) 105);
            return 1;
        } else if (-437828598 == i) {
            io.ai((byte) 74).bh(1108859566);
            return 1;
        } else if (i == 99110443) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            if (iArr2[i3 * -226120232] == 1) {
                z2 = true;
            }
            io.ai((byte) 65).bt(z2, -847763736);
            return 1;
        } else if (-2077324190 == i) {
            ds.am += 1128905694;
            i2 = ae[ds.am * 1685878617];
            if (1 == ae[(ds.am * -757592335) + 1]) {
                z2 = true;
            }
            io.ai((byte) 14).bn(i2, z2, -822032235);
            return 1;
        } else if (6634 == i) {
            ds.am += 1148260488;
            i2 = ae[ds.am * -757592335];
            if (1 == ae[(ds.am * -757592335) + 1]) {
                z2 = true;
            }
            io.ai((byte) -24).bz(i2, z2, 1479349249);
            return 1;
        } else if (6635 == i) {
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            if (io.ai((byte) -47).by(964521726)) {
                z2 = true;
            }
            iArr2[(i3 * -757592335) - 1] = z2;
            return 1;
        } else if (6636 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = ae;
            i4 = ds.am + 579037348;
            ds.am = i4;
            if (io.ai((byte) -54).bp(i2, 1743905561)) {
                z2 = true;
            }
            iArr3[(-5152791 * i4) - 1] = z2;
            return 1;
        } else if (561934024 == i) {
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = ae;
            i4 = ds.am - 1020582975;
            ds.am = i4;
            if (io.ai((byte) 37).cv(i2, (byte) -64)) {
                b = (byte) 1;
            }
            iArr3[(-2071809561 * i4) - 1] = b;
            return 1;
        } else if (6638 == i) {
            ds.am -= 2141073778;
            bi = io.ai((byte) 66).cq(ae[ds.am * 248807575], new ag(ae[(ds.am * -757592335) + 1]), 1343868738);
            if (bi == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = bi.ad((byte) 23);
            return 1;
        } else if (i == 6639) {
            cw = io.ai((byte) -15).cw(16842994);
            if (cw == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = cw.aq((byte) -4);
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -1148810846) - 1] = cw.ad.ad((byte) -31);
            return 1;
        } else if (6640 == i) {
            cw = io.ai((byte) -62).cp((byte) 28);
            if (cw == null) {
                iArr = ae;
                i2 = ds.am + 2024026487;
                ds.am = i2;
                iArr[(i2 * -186239395) - 1] = -1;
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -1055371082) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -1488755139) - 1] = cw.aq((byte) -54);
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * 1626949496) - 1] = cw.ad.ad((byte) -46);
            return 1;
        } else if (i == -907519020) {
            iArr = ae;
            i2 = ds.am + 1043471379;
            ds.am = i2;
            aq = jg.aq(iArr[i2 * 804712859], (byte) 40);
            if (aq.am == null) {
                String[] strArr2 = ak;
                i2 = as - 1490481109;
                as = i2;
                strArr2[(i2 * -1593352869) - 1] = "";
                return 1;
            }
            strArr = ak;
            i3 = as - 697486697;
            as = i3;
            strArr[(i3 * -161676406) - 1] = aq.am;
            return 1;
        } else if (-1486135440 == i) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq = jg.aq(iArr[i2 * 942540831], (byte) 37);
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.as * 199325649;
            return 1;
        } else if (i == 1184637007) {
            iArr = ae;
            i2 = ds.am + 1158894075;
            ds.am = i2;
            aq = jg.aq(iArr[i2 * -757592335], (byte) 79);
            if (aq == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -554511367) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -1586706006) - 1] = aq.an * -1592790679;
            return 1;
        } else if (i == 6696) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            aq = jg.aq(iArr[i2 * -757592335], (byte) 47);
            if (aq == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * 1189292721) - 1] = -1;
                return 1;
            }
            iArr2 = ae;
            i3 = ds.am - 773870125;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = aq.ai * -584859817;
            return 1;
        } else if (i == -1370327998) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * 1644041848) - 1] = in.ac.ad * 1851575682;
            return 1;
        } else if (6698 == i) {
            iArr = ae;
            i2 = ds.am - 1890592776;
            ds.am = i2;
            iArr[(i2 * -2059930930) - 1] = in.ac.aq.ad((byte) 58);
            return 1;
        } else if (i != 6699) {
            return 2;
        } else {
            iArr = ae;
            i2 = ds.am + 701089517;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = in.ac.ar.ad((byte) 21);
            return 1;
        }
    }

    static void ex(int i, ag agVar, boolean z) {
        io.ai((byte) 30).aa(io.ai((byte) -4).bm(i, (byte) 74), new ag(da.jc.ab * -1300496125, ((da.jc.bq * -1444273727) >> 7) + (oz.ff * 1686658706), ((da.jc.bd * -1690563339) >> 7) + (cq.fz * 976883366)), agVar, z, (byte) 118);
    }

    static int ey(int i) {
        return (int) (((Math.log((double) i) / ab) - 7.0d) * 256.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int ez(int i, hw hwVar, boolean z) {
        int[] iArr;
        int i2;
        if (5000 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.of * 1639794603;
            return 1;
        }
        i2 = 2;
        String[] strArr;
        String str;
        int i3;
        ip al;
        int i4;
        String[] strArr2;
        int i5;
        int i6;
        int[] iArr2;
        String toLowerCase;
        if (i == 5001) {
            ds.am += 1693358541;
            client.of = ae[ds.am * -757592335] * 2131458819;
            br.oq = fb.aq(ae[(ds.am * -757592335) + 1], (byte) -39);
            if (br.oq == null) {
                br.oq = pl.aq;
            }
            client.ov = ae[(ds.am * -757592335) + 2] * 1072427593;
            ns aq = ib.aq(no.aw, client.eb.aj, 2121154154);
            aq.ar.al(client.of * 1639794603, -604007386);
            aq.ar.al(br.oq.al * 684750963, -1682673334);
            aq.ar.al(client.ov * -942235655, -1617817101);
            client.eb.ar(aq, -121744582);
            return 1;
        } else if (5002 == i) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            str = strArr[i2 * -1883296125];
            ds.am += 1128905694;
            i2 = ae[ds.am * -757592335];
            i3 = ae[(ds.am * -757592335) + 1];
            ns aq2 = ib.aq(no.bv, client.eb.aj, 240344035);
            aq2.ar.al(hs.ag(str, (short) -3093) + 2, -1592028119);
            aq2.ar.ap(str, 635769462);
            aq2.ar.al(i2 - 1, -980155556);
            aq2.ar.al(i3, 106562263);
            client.eb.ar(aq2, -855125999);
            return 1;
        } else if (i == 5003) {
            ds.am += 1128905694;
            al = fo.al(ae[ds.am * -757592335], ae[(ds.am * -757592335) + 1], 488693617);
            if (al != null) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.ad * -106728945;
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.aq * 1147003925;
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.al != null ? al.al : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.am != null ? al.am : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.ak != null ? al.ak : "";
                int[] iArr3 = ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                i6 = al.ar(-2124825981) ? 1 : al.ai(1968472354) ? 2 : 0;
                iArr3[(i5 * -757592335) - 1] = i6;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 5004) {
            iArr = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            al = es.aj(iArr[i3 * -757592335], -63520358);
            if (al != null) {
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.ar * -184196553;
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = al.aq * 1147003925;
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.al != null ? al.al : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.am != null ? al.am : "";
                strArr2 = ak;
                i5 = as - 1490481109;
                as = i5;
                strArr2[(i5 * -1883296125) - 1] = al.ak != null ? al.ak : "";
                iArr = ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                if (al.ar(-619590387)) {
                    i2 = 1;
                } else if (!al.ai(1976522633)) {
                    i2 = 0;
                }
                iArr[(i4 * -757592335) - 1] = i2;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = "";
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = 0;
            return 1;
        } else if (5005 == i) {
            if (br.oq == null) {
                iArr = ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = -1;
                return 1;
            }
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = br.oq.al * 684750963;
            return 1;
        } else if (i == 5008) {
            String toLowerCase2;
            ns aq3;
            int i7;
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            str = strArr[i2 * -1883296125];
            iArr2 = ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i4 = iArr2[i3 * -757592335];
            toLowerCase = str.toLowerCase();
            i3 = 5;
            if (toLowerCase.startsWith(go.hi)) {
                str = str.substring(go.hi.length());
            } else {
                if (toLowerCase.startsWith(go.ha)) {
                    str = str.substring(go.ha.length());
                } else {
                    if (toLowerCase.startsWith(go.hv)) {
                        str = str.substring(go.hv.length());
                    } else {
                        if (toLowerCase.startsWith(go.hs)) {
                            str = str.substring(go.hs.length());
                        } else {
                            if (toLowerCase.startsWith(go.hm)) {
                                str = str.substring(go.hm.length());
                            } else {
                                if (toLowerCase.startsWith(go.hb)) {
                                    str = str.substring(go.hb.length());
                                } else {
                                    if (toLowerCase.startsWith(go.hn)) {
                                        i2 = 6;
                                        str = str.substring(go.hn.length());
                                    } else if (toLowerCase.startsWith(go.hj)) {
                                        i2 = 7;
                                        str = str.substring(go.hj.length());
                                    } else if (toLowerCase.startsWith(go.ic)) {
                                        i2 = 8;
                                        str = str.substring(go.ic.length());
                                    } else if (toLowerCase.startsWith(go.ie)) {
                                        i2 = 9;
                                        str = str.substring(go.ie.length());
                                    } else if (toLowerCase.startsWith(go.io)) {
                                        i2 = 10;
                                        str = str.substring(go.io.length());
                                    } else if (toLowerCase.startsWith(go.iq)) {
                                        i2 = 11;
                                        str = str.substring(go.iq.length());
                                    } else if (oc.ag != lz.ad) {
                                        if (toLowerCase.startsWith(go.hu)) {
                                            str = str.substring(go.hu.length());
                                        } else if (toLowerCase.startsWith(go.he)) {
                                            str = str.substring(go.he.length());
                                        } else if (toLowerCase.startsWith(go.hz)) {
                                            str = str.substring(go.hz.length());
                                        } else if (toLowerCase.startsWith(go.hw)) {
                                            str = str.substring(go.hw.length());
                                        } else if (toLowerCase.startsWith(go.ho)) {
                                            str = str.substring(go.ho.length());
                                        } else if (toLowerCase.startsWith(go.hy)) {
                                            str = str.substring(go.hy.length());
                                        } else if (toLowerCase.startsWith(go.hl)) {
                                            i2 = 6;
                                            str = str.substring(go.hl.length());
                                        } else if (toLowerCase.startsWith(go.id)) {
                                            i2 = 7;
                                            str = str.substring(go.id.length());
                                        } else if (toLowerCase.startsWith(go.f274if)) {
                                            i2 = 8;
                                            str = str.substring(go.f274if.length());
                                        } else if (toLowerCase.startsWith(go.iv)) {
                                            i2 = 9;
                                            str = str.substring(go.iv.length());
                                        } else if (toLowerCase.startsWith(go.iw)) {
                                            i2 = 10;
                                            str = str.substring(go.iw.length());
                                        } else if (toLowerCase.startsWith(go.ik)) {
                                            i2 = 11;
                                            str = str.substring(go.ik.length());
                                        }
                                    }
                                    toLowerCase2 = str.toLowerCase();
                                    if (toLowerCase2.startsWith(go.ix)) {
                                        str = str.substring(go.ix.length());
                                    } else {
                                        if (toLowerCase2.startsWith(go.ih)) {
                                            str = str.substring(go.ih.length());
                                        } else {
                                            if (toLowerCase2.startsWith(go.ir)) {
                                                str = str.substring(go.ir.length());
                                            } else {
                                                if (toLowerCase2.startsWith(go.ii)) {
                                                    str = str.substring(go.ii.length());
                                                } else {
                                                    if (toLowerCase2.startsWith(go.iy)) {
                                                        str = str.substring(go.iy.length());
                                                    } else {
                                                        if (lz.ad != oc.ag) {
                                                            if (toLowerCase2.startsWith(go.in)) {
                                                                str = str.substring(go.in.length());
                                                            } else if (toLowerCase2.startsWith(go.ib)) {
                                                                str = str.substring(go.ib.length());
                                                            } else if (toLowerCase2.startsWith(go.is)) {
                                                                str = str.substring(go.is.length());
                                                            } else if (toLowerCase2.startsWith(go.ig)) {
                                                                str = str.substring(go.ig.length());
                                                            } else if (toLowerCase2.startsWith(go.ip)) {
                                                                str = str.substring(go.ip.length());
                                                            }
                                                        }
                                                        i3 = 0;
                                                    }
                                                    aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                                                    aq3.ar.al(0, -1813132512);
                                                    i7 = aq3.ar.al;
                                                    aq3.ar.al(i4, -1427153549);
                                                    aq3.ar.al(i2, -2093354538);
                                                    aq3.ar.al(i3, -209238971);
                                                    hl.aq(aq3.ar, str, (byte) 64);
                                                    aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                                                    client.eb.ar(aq3, 136659705);
                                                    return 1;
                                                }
                                                i3 = 4;
                                                aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                                                aq3.ar.al(0, -1813132512);
                                                i7 = aq3.ar.al;
                                                aq3.ar.al(i4, -1427153549);
                                                aq3.ar.al(i2, -2093354538);
                                                aq3.ar.al(i3, -209238971);
                                                hl.aq(aq3.ar, str, (byte) 64);
                                                aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                                                client.eb.ar(aq3, 136659705);
                                                return 1;
                                            }
                                            i3 = 3;
                                            aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                                            aq3.ar.al(0, -1813132512);
                                            i7 = aq3.ar.al;
                                            aq3.ar.al(i4, -1427153549);
                                            aq3.ar.al(i2, -2093354538);
                                            aq3.ar.al(i3, -209238971);
                                            hl.aq(aq3.ar, str, (byte) 64);
                                            aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                                            client.eb.ar(aq3, 136659705);
                                            return 1;
                                        }
                                        i3 = 2;
                                        aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                                        aq3.ar.al(0, -1813132512);
                                        i7 = aq3.ar.al;
                                        aq3.ar.al(i4, -1427153549);
                                        aq3.ar.al(i2, -2093354538);
                                        aq3.ar.al(i3, -209238971);
                                        hl.aq(aq3.ar, str, (byte) 64);
                                        aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                                        client.eb.ar(aq3, 136659705);
                                        return 1;
                                    }
                                    i3 = 1;
                                    aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                                    aq3.ar.al(0, -1813132512);
                                    i7 = aq3.ar.al;
                                    aq3.ar.al(i4, -1427153549);
                                    aq3.ar.al(i2, -2093354538);
                                    aq3.ar.al(i3, -209238971);
                                    hl.aq(aq3.ar, str, (byte) 64);
                                    aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                                    client.eb.ar(aq3, 136659705);
                                    return 1;
                                }
                                i2 = 5;
                                toLowerCase2 = str.toLowerCase();
                                if (toLowerCase2.startsWith(go.ix)) {
                                }
                                i3 = 1;
                                aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                                aq3.ar.al(0, -1813132512);
                                i7 = aq3.ar.al;
                                aq3.ar.al(i4, -1427153549);
                                aq3.ar.al(i2, -2093354538);
                                aq3.ar.al(i3, -209238971);
                                hl.aq(aq3.ar, str, (byte) 64);
                                aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                                client.eb.ar(aq3, 136659705);
                                return 1;
                            }
                            i2 = 4;
                            toLowerCase2 = str.toLowerCase();
                            if (toLowerCase2.startsWith(go.ix)) {
                            }
                            i3 = 1;
                            aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                            aq3.ar.al(0, -1813132512);
                            i7 = aq3.ar.al;
                            aq3.ar.al(i4, -1427153549);
                            aq3.ar.al(i2, -2093354538);
                            aq3.ar.al(i3, -209238971);
                            hl.aq(aq3.ar, str, (byte) 64);
                            aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                            client.eb.ar(aq3, 136659705);
                            return 1;
                        }
                        i2 = 3;
                        toLowerCase2 = str.toLowerCase();
                        if (toLowerCase2.startsWith(go.ix)) {
                        }
                        i3 = 1;
                        aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                        aq3.ar.al(0, -1813132512);
                        i7 = aq3.ar.al;
                        aq3.ar.al(i4, -1427153549);
                        aq3.ar.al(i2, -2093354538);
                        aq3.ar.al(i3, -209238971);
                        hl.aq(aq3.ar, str, (byte) 64);
                        aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                        client.eb.ar(aq3, 136659705);
                        return 1;
                    }
                    i2 = 2;
                    toLowerCase2 = str.toLowerCase();
                    if (toLowerCase2.startsWith(go.ix)) {
                    }
                    i3 = 1;
                    aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                    aq3.ar.al(0, -1813132512);
                    i7 = aq3.ar.al;
                    aq3.ar.al(i4, -1427153549);
                    aq3.ar.al(i2, -2093354538);
                    aq3.ar.al(i3, -209238971);
                    hl.aq(aq3.ar, str, (byte) 64);
                    aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                    client.eb.ar(aq3, 136659705);
                    return 1;
                }
                i2 = 1;
                toLowerCase2 = str.toLowerCase();
                if (toLowerCase2.startsWith(go.ix)) {
                }
                i3 = 1;
                aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
                aq3.ar.al(0, -1813132512);
                i7 = aq3.ar.al;
                aq3.ar.al(i4, -1427153549);
                aq3.ar.al(i2, -2093354538);
                aq3.ar.al(i3, -209238971);
                hl.aq(aq3.ar, str, (byte) 64);
                aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
                client.eb.ar(aq3, 136659705);
                return 1;
            }
            i2 = 0;
            toLowerCase2 = str.toLowerCase();
            if (toLowerCase2.startsWith(go.ix)) {
            }
            i3 = 1;
            aq3 = ib.aq(no.dq, client.eb.aj, 189632490);
            aq3.ar.al(0, -1813132512);
            i7 = aq3.ar.al;
            aq3.ar.al(i4, -1427153549);
            aq3.ar.al(i2, -2093354538);
            aq3.ar.al(i3, -209238971);
            hl.aq(aq3.ar, str, (byte) 64);
            aq3.ar.aa((aq3.ar.al * -1631454091) - (-1631454091 * i7), (byte) -16);
            client.eb.ar(aq3, 136659705);
            return 1;
        } else if (5009 == i) {
            as -= 1314005078;
            str = ak[as * -1883296125];
            toLowerCase = ak[(as * -1883296125) + 1];
            ns aq4 = ib.aq(no.at, client.eb.aj, 1052217380);
            aq4.ar.aj(0, 576045215);
            i4 = aq4.ar.al;
            aq4.ar.ap(str, 635769462);
            hl.aq(aq4.ar, toLowerCase, (byte) 36);
            aq4.ar.ac((aq4.ar.al * -1631454091) - (i4 * -1631454091), 953128405);
            client.eb.ar(aq4, -674700549);
            return 1;
        } else if (i == 5015) {
            str = (da.jc == null || da.jc.ad == null) ? "" : da.jc.ad.ad(2038309485);
            String[] strArr3 = ak;
            i3 = as - 1490481109;
            as = i3;
            strArr3[(i3 * -1883296125) - 1] = str;
            return 1;
        } else if (5016 == i) {
            iArr = ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.ov * -942235655;
            return 1;
        } else if (i == 5017) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i6 = iArr[i2 * -757592335];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = hx.ai(i6, (byte) -100);
            return 1;
        } else if (i == 5018) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i6 = iArr[i2 * -757592335];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = cn.ag(i6, (byte) 118);
            return 1;
        } else if (i == 5019) {
            iArr = ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i6 = iArr[i2 * -757592335];
            iArr2 = ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = ay.as(i6, -1458848258);
            return 1;
        } else if (5020 == i) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            dl.cv(strArr[i2 * -1883296125], (short) -6197);
            return 1;
        } else if (i == 5021) {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            client.on = strArr[i2 * -1883296125].toLowerCase().trim();
            return 1;
        } else if (i == 5022) {
            strArr = ak;
            i2 = as - 1490481109;
            as = i2;
            strArr[(i2 * -1883296125) - 1] = client.on;
            return 1;
        } else if (i != 5023) {
            return 2;
        } else {
            strArr = ak;
            i2 = as + 1490481109;
            as = i2;
            System.out.println(strArr[i2 * -1883296125]);
            return 1;
        }
    }
}
