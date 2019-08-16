package defpackage;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.media.session.PlaybackStateCompat;
import com.android.billingclient.BuildConfig;
import com.jagex.oldscape.osrenderer.ad;
import java.util.Calendar;
import java.util.Date;

/* renamed from: ar */
public class ar implements aq {
    static final int ad = 0;
    static final int af = 25;
    static final int ak = 10;
    static final String ar = "passwordchoice.ws";
    static og de = null;
    static final int qs = 5;

    public static int ak(CharSequence charSequence, int i) {
        try {
            int i2 = 0;
            for (int i3 = 0; i3 < charSequence.length(); i3++) {
                i2 = ((i2 << 5) - i2) + je.ad(charSequence.charAt(i3), -70223121);
            }
            return i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ar.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b A:{Catch:{ all -> 0x01d3, RuntimeException -> 0x01e8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:362:? A:{SYNTHETIC, RETURN, Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0711 A:{Catch:{ all -> 0x01d3, RuntimeException -> 0x01e8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b A:{Catch:{ all -> 0x01d3, RuntimeException -> 0x01e8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0711 A:{Catch:{ all -> 0x01d3, RuntimeException -> 0x01e8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:362:? A:{SYNTHETIC, RETURN, Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b A:{Catch:{ all -> 0x01d3, RuntimeException -> 0x01e8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:362:? A:{SYNTHETIC, RETURN, Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0711 A:{Catch:{ all -> 0x01d3, RuntimeException -> 0x01e8 }} */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Missing block: B:243:0x0587, code skipped:
            throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Missing block: B:256:0x05c6, code skipped:
            throw new java.lang.RuntimeException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void aq(il ilVar, int i, int i2) {
        Throwable th;
        Throwable e;
        StringBuilder stringBuilder;
        try {
            hw aq;
            Object[] objArr = ilVar.ad;
            if (gd.ad(ilVar.ap * 1151259651, -930952494)) {
                in.ac = (dt) objArr[0];
                dy aq2 = jg.aq(in.ac.ad * 604627991, (byte) 51);
                aq = cm.aq(ilVar.ap * 1151259651, aq2.aj * -1701077253, aq2.an * -345210295, (byte) 1);
            } else {
                aq = cq.ad(((Integer) objArr[0]).intValue(), (byte) 100);
            }
            if (aq != null) {
                ds.am = 0;
                hl.as = 0;
                int[] iArr = aq.aq;
                int[] iArr2 = aq.ar;
                hl.ag = 0;
                hl.aa = false;
                int i3;
                int intValue;
                try {
                    String str;
                    hl.ar = new int[(aq.aj * 486265393)];
                    hl.al = new String[(aq.ai * 666339847)];
                    int i4 = 0;
                    int i5 = 0;
                    i3 = 1;
                    while (i3 < objArr.length) {
                        if (objArr[i3] instanceof Integer) {
                            intValue = ((Integer) objArr[i3]).intValue();
                            if (-2147483647 == intValue) {
                                intValue = 223244049 * ilVar.al;
                            }
                            if (-2147483646 == intValue) {
                                intValue = ilVar.aj * -256822851;
                            }
                            if (intValue == -2147483645) {
                                intValue = ilVar.ar != null ? ilVar.ar.ao * -1227024251 : -1;
                            }
                            if (-2147483644 == intValue) {
                                intValue = -218151537 * ilVar.ai;
                            }
                            if (-2147483643 == intValue) {
                                intValue = ilVar.ar != null ? ilVar.ar.ah * 988026877 : -1;
                            }
                            if (intValue == -2147483642) {
                                intValue = ilVar.ae != null ? ilVar.ae.ao * -1227024251 : -1;
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
                            hl.ar[i5] = intValue;
                            intValue = i5 + 1;
                        } else if (objArr[i3] instanceof String) {
                            str = (String) objArr[i3];
                            if (str.equals("event_opbase")) {
                                str = ilVar.as;
                            }
                            hl.al[i4] = str;
                            i4++;
                            intValue = i5;
                        } else {
                            intValue = i5;
                        }
                        i3++;
                        i5 = intValue;
                    }
                    hl.ah = ilVar.ag * -1070305979;
                    i3 = -1;
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        i6++;
                        if (i6 <= i) {
                            i5 = i7 + 1;
                            i3 = iArr[i5];
                            if (i3 < 100) {
                                int[] iArr3;
                                int[] iArr4;
                                int[] iArr5;
                                int i8;
                                String[] strArr;
                                if (i3 == 0) {
                                    try {
                                        iArr3 = hl.ae;
                                        i4 = ds.am - 564452847;
                                        ds.am = i4;
                                        iArr3[(i4 * -757592335) - 1] = iArr2[i5];
                                    } catch (Exception e2) {
                                        th = e2;
                                    }
                                } else if (i3 == 1) {
                                    intValue = iArr2[i5];
                                    iArr4 = hl.ae;
                                    i7 = ds.am - 564452847;
                                    ds.am = i7;
                                    iArr4[(i7 * -757592335) - 1] = aj.ar[intValue];
                                } else if (i3 == 2) {
                                    intValue = iArr2[i5];
                                    iArr4 = aj.ar;
                                    iArr5 = hl.ae;
                                    i8 = ds.am + 564452847;
                                    ds.am = i8;
                                    iArr4[intValue] = iArr5[i8 * -757592335];
                                    cp.hg(intValue, -1370214581);
                                } else if (3 == i3) {
                                    strArr = hl.ak;
                                    i4 = hl.as - 1490481109;
                                    hl.as = i4;
                                    strArr[(i4 * -1883296125) - 1] = aq.al[i5];
                                } else {
                                    hw hwVar;
                                    String[] strArr2;
                                    String[] strArr3;
                                    jv jvVar;
                                    if (6 == i3) {
                                        intValue = iArr2[i5];
                                    } else if (7 == i3) {
                                        ds.am += 1128905694;
                                        if (hl.ae[(ds.am * -757592335) + 1] != hl.ae[ds.am * -757592335]) {
                                            intValue = iArr2[i5];
                                        }
                                    } else if (8 == i3) {
                                        ds.am += 1128905694;
                                        if (hl.ae[ds.am * -757592335] == hl.ae[(ds.am * -757592335) + 1]) {
                                            intValue = iArr2[i5];
                                        }
                                    } else if (i3 == 9) {
                                        ds.am += 1128905694;
                                        if (hl.ae[ds.am * -757592335] < hl.ae[(ds.am * -757592335) + 1]) {
                                            intValue = iArr2[i5];
                                        }
                                    } else if (i3 == 10) {
                                        ds.am += 1128905694;
                                        if (hl.ae[ds.am * -757592335] > hl.ae[(ds.am * -757592335) + 1]) {
                                            intValue = iArr2[i5];
                                        }
                                    } else if (21 == i3) {
                                        if (hl.ag * 2007654799 != 0) {
                                            jw[] jwVarArr = hl.ap;
                                            i5 = hl.ag - 277192047;
                                            hl.ag = i5;
                                            jw jwVar = jwVarArr[i5 * 2007654799];
                                            hwVar = jwVar.ad;
                                            try {
                                                iArr4 = hwVar.aq;
                                                iArr3 = hwVar.ar;
                                                int i9 = jwVar.aq;
                                                hl.ar = jwVar.ar;
                                                hl.al = jwVar.al;
                                                i7 = i9 * -1370768725;
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
                                                while (intValue >= 0) {
                                                }
                                                stringBuilder.append("");
                                                stringBuilder.append(i3);
                                                iv.ad(stringBuilder.toString(), th, 1692244937);
                                                if (hl.aa) {
                                                }
                                            }
                                        } else if (hl.aa) {
                                            hl.ao = true;
                                            bz.hd(-362188460);
                                            hl.ao = false;
                                            hl.aa = false;
                                            return;
                                        } else {
                                            return;
                                        }
                                    } else if (i3 == 25) {
                                        intValue = iArr2[i5];
                                        iArr4 = hl.ae;
                                        i7 = ds.am - 564452847;
                                        ds.am = i7;
                                        iArr4[(i7 * -757592335) - 1] = cd.ad(intValue, 1032502526);
                                    } else if (i3 == 27) {
                                        intValue = iArr2[i5];
                                        iArr4 = hl.ae;
                                        i7 = ds.am + 564452847;
                                        ds.am = i7;
                                        fl.aq(intValue, iArr4[i7 * -757592335], Byte.MIN_VALUE);
                                    } else if (i3 == 31) {
                                        ds.am += 1128905694;
                                        if (hl.ae[ds.am * -757592335] <= hl.ae[(ds.am * -757592335) + 1]) {
                                            intValue = iArr2[i5];
                                        }
                                    } else if (32 == i3) {
                                        ds.am += 1128905694;
                                        if (hl.ae[ds.am * -757592335] >= hl.ae[(ds.am * -757592335) + 1]) {
                                            intValue = iArr2[i5];
                                        }
                                    } else if (i3 == 33) {
                                        iArr3 = hl.ae;
                                        i4 = ds.am - 564452847;
                                        ds.am = i4;
                                        iArr3[(i4 * -757592335) - 1] = hl.ar[iArr2[i5]];
                                    } else if (i3 == 34) {
                                        iArr3 = hl.ar;
                                        i4 = iArr2[i5];
                                        iArr5 = hl.ae;
                                        i8 = ds.am + 564452847;
                                        ds.am = i8;
                                        iArr3[i4] = iArr5[i8 * -757592335];
                                    } else if (i3 == 35) {
                                        strArr = hl.ak;
                                        i4 = hl.as - 1490481109;
                                        hl.as = i4;
                                        strArr[(i4 * -1883296125) - 1] = hl.al[iArr2[i5]];
                                    } else if (i3 == 36) {
                                        strArr = hl.al;
                                        i4 = iArr2[i5];
                                        strArr2 = hl.ak;
                                        i8 = hl.as + 1490481109;
                                        hl.as = i8;
                                        strArr[i4] = strArr2[i8 * -1883296125];
                                    } else if (37 == i3) {
                                        intValue = iArr2[i5];
                                        hl.as -= -1490481109 * intValue;
                                        str = cl.ad(hl.ak, hl.as * -1883296125, intValue, (byte) 67);
                                        strArr3 = hl.ak;
                                        i7 = hl.as - 1490481109;
                                        hl.as = i7;
                                        strArr3[(i7 * -1883296125) - 1] = str;
                                    } else if (i3 == 38) {
                                        ds.am += 564452847;
                                    } else if (39 == i3) {
                                        hl.as += 1490481109;
                                    } else if (40 == i3) {
                                        hw ad = cq.ad(iArr2[i5], (byte) 81);
                                        iArr2 = new int[(ad.aj * 486265393)];
                                        String[] strArr4 = new String[(ad.ai * 666339847)];
                                        for (intValue = 0; intValue < ad.ae * 579501497; intValue++) {
                                            iArr2[intValue] = hl.ae[((ds.am * -757592335) - (ad.ae * 579501497)) + intValue];
                                        }
                                        for (intValue = 0; intValue < ad.am * -2109792803; intValue++) {
                                            strArr4[intValue] = hl.ak[((hl.as * -1883296125) - (ad.am * -2109792803)) + intValue];
                                        }
                                        ds.am -= ad.ae * -827856055;
                                        hl.as -= ad.am * -975383521;
                                        jw jwVar2 = new jw();
                                        jwVar2.ad = aq;
                                        jwVar2.aq = i5 * 1515614211;
                                        jwVar2.ar = hl.ar;
                                        jwVar2.al = hl.al;
                                        jw[] jwVarArr2 = hl.ap;
                                        i7 = hl.ag + 277192047;
                                        hl.ag = i7;
                                        jwVarArr2[(2007654799 * i7) - 1] = jwVar2;
                                        try {
                                            int[] iArr6 = ad.aq;
                                            iArr3 = ad.ar;
                                            hl.ar = iArr2;
                                            hl.al = strArr4;
                                            i7 = -1;
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
                                            stringBuilder.append(i3);
                                            iv.ad(stringBuilder.toString(), th, 1692244937);
                                            if (hl.aa) {
                                            }
                                        }
                                    } else if (i3 == 42) {
                                        iArr3 = hl.ae;
                                        i4 = ds.am - 564452847;
                                        ds.am = i4;
                                        iArr3[(i4 * -757592335) - 1] = ec.na.aq(iArr2[i5], -1619100397);
                                        intValue = i5;
                                    } else if (i3 == 43) {
                                        jvVar = ec.na;
                                        i4 = iArr2[i5];
                                        iArr5 = hl.ae;
                                        i8 = ds.am + 564452847;
                                        ds.am = i8;
                                        jvVar.ad(i4, iArr5[i8 * -757592335], -1227024251);
                                        intValue = i5;
                                    } else if (44 == i3) {
                                        i7 = iArr2[i5] >> 16;
                                        intValue = iArr2[i5];
                                        iArr4 = hl.ae;
                                        i8 = ds.am + 564452847;
                                        ds.am = i8;
                                        i8 = iArr4[i8 * -757592335];
                                        if (i8 >= 0 && i8 <= 5000) {
                                            hl.aj[i7] = i8;
                                            intValue = (intValue & SupportMenu.USER_MASK) == 105 ? 0 : -1;
                                            for (i4 = 0; i4 < i8; i4++) {
                                                hl.ai[i7][i4] = intValue;
                                            }
                                            intValue = i5;
                                        }
                                    } else if (i3 == 45) {
                                        intValue = iArr2[i5];
                                        iArr4 = hl.ae;
                                        i7 = ds.am + 564452847;
                                        ds.am = i7;
                                        i4 = iArr4[i7 * -757592335];
                                        if (i4 >= 0) {
                                            if (i4 < hl.aj[intValue]) {
                                                iArr5 = hl.ae;
                                                i8 = ds.am - 564452847;
                                                ds.am = i8;
                                                iArr5[(i8 * -757592335) - 1] = hl.ai[intValue][i4];
                                                intValue = i5;
                                            }
                                        }
                                    } else if (i3 == 46) {
                                        intValue = iArr2[i5];
                                        ds.am += 1128905694;
                                        i4 = hl.ae[ds.am * -757592335];
                                        if (i4 >= 0 && i4 < hl.aj[intValue]) {
                                            hl.ai[intValue][i4] = hl.ae[(ds.am * -757592335) + 1];
                                            intValue = i5;
                                        }
                                    } else if (i3 == 47) {
                                        str = ec.na.ai(iArr2[i5], Byte.MIN_VALUE);
                                        if (str == null) {
                                            str = go.ak;
                                        }
                                        strArr3 = hl.ak;
                                        i7 = hl.as - 1490481109;
                                        hl.as = i7;
                                        strArr3[(i7 * -1883296125) - 1] = str;
                                        intValue = i5;
                                    } else if (48 == i3) {
                                        jvVar = ec.na;
                                        i4 = iArr2[i5];
                                        strArr2 = hl.ak;
                                        i8 = hl.as + 1490481109;
                                        hl.as = i8;
                                        jvVar.aj(i4, strArr2[i8 * -1883296125], (byte) -70);
                                        intValue = i5;
                                    } else if (i3 == 49) {
                                        str = ec.na.al(iArr2[i5], -319828359);
                                        strArr3 = hl.ak;
                                        i7 = hl.as - 1490481109;
                                        hl.as = i7;
                                        strArr3[(i7 * -1883296125) - 1] = str;
                                        intValue = i5;
                                    } else if (i3 == 50) {
                                        jvVar = ec.na;
                                        i4 = iArr2[i5];
                                        strArr2 = hl.ak;
                                        i8 = hl.as + 1490481109;
                                        hl.as = i8;
                                        jvVar.ar(i4, strArr2[i8 * -1883296125], (byte) 31);
                                        intValue = i5;
                                    } else if (i3 == 60) {
                                        ot otVar = aq.ak[iArr2[i5]];
                                        iArr4 = hl.ae;
                                        i7 = ds.am + 564452847;
                                        ds.am = i7;
                                        ms msVar = (ms) otVar.ad((long) iArr4[i7 * -757592335]);
                                        if (msVar != null) {
                                            intValue = msVar.ad + i5;
                                        }
                                        intValue = i5;
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                    i7 = intValue + i5;
                                }
                                intValue = i5;
                            } else {
                                switch (fx.ar(i3, aq, aq.ar[i5] == 1, 585043321)) {
                                    case 0:
                                        if (hl.aa) {
                                            hl.ao = true;
                                            bz.hd(-1595445000);
                                            hl.ao = false;
                                            hl.aa = false;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        break;
                                    case 2:
                                        throw new IllegalStateException();
                                    default:
                                        intValue = i5;
                                        break;
                                }
                                intValue = i5;
                            }
                            i7 = intValue;
                        } else {
                            try {
                                throw new RuntimeException();
                            } catch (Exception e22) {
                                th = e22;
                                stringBuilder = new StringBuilder(30);
                                stringBuilder.append("");
                                stringBuilder.append(aq.gs);
                                stringBuilder.append(" ");
                                for (intValue = (hl.ag * 2007654799) - 1; intValue >= 0; intValue--) {
                                    stringBuilder.append("");
                                    stringBuilder.append(hl.ap[intValue].ad.gs);
                                    stringBuilder.append(" ");
                                }
                                stringBuilder.append("");
                                stringBuilder.append(i3);
                                iv.ad(stringBuilder.toString(), th, 1692244937);
                                if (hl.aa) {
                                    hl.ao = true;
                                    bz.hd(-1528152518);
                                    hl.ao = false;
                                    hl.aa = false;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    throw new RuntimeException();
                } catch (Exception e222) {
                    th = e222;
                    i3 = -1;
                    stringBuilder = new StringBuilder(30);
                    stringBuilder.append("");
                    stringBuilder.append(aq.gs);
                    stringBuilder.append(" ");
                    while (intValue >= 0) {
                    }
                    stringBuilder.append("");
                    stringBuilder.append(i3);
                    iv.ad(stringBuilder.toString(), th, 1692244937);
                    if (hl.aa) {
                    }
                }
            }
        } catch (RuntimeException e5) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("ar.aq(");
            stringBuilder.append(')');
            throw mv.aq(e5, stringBuilder.toString());
        } catch (Throwable th2) {
            if (hl.aa) {
                hl.ao = true;
                bz.hd(-1915485591);
                hl.ao = false;
                hl.aa = false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x011c A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01a1 A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062 A:{Catch:{ Exception -> 0x01d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e5 A:{Catch:{ Exception -> 0x01f9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x020a A:{Catch:{ Exception -> 0x021e }} */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x022f A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0250 A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02c8 A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02d9 A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02ec A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02fd A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x030e A:{Catch:{ RuntimeException -> 0x0323 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ad ad(byte b) {
        String toLowerCase;
        String property;
        String property2;
        boolean z;
        int i;
        int i2;
        int indexOf;
        int i3;
        int i4;
        int maxMemory;
        int availableProcessors;
        String str;
        Calendar instance;
        int i5;
        int i6;
        String str2;
        String cq;
        String cn;
        String bt;
        String substring;
        String cj;
        int i7;
        int bp;
        int bz;
        int by;
        int[] cv;
        int bn;
        try {
            String toLowerCase2;
            int i8 = mc.ax.startsWith("win") ? 1 : mc.ax.startsWith("mac") ? 2 : mc.ax.startsWith("linux") ? 3 : 4;
            try {
                toLowerCase = System.getProperty("os.arch").toLowerCase();
            } catch (Exception e) {
                toLowerCase = "";
            }
            try {
                toLowerCase2 = System.getProperty("os.version").toLowerCase();
            } catch (Exception e2) {
                toLowerCase2 = "";
            }
            try {
                property = System.getProperty("java.vendor");
                try {
                    property2 = System.getProperty("java.version");
                } catch (Exception e3) {
                    property2 = BuildConfig.VERSION_NAME;
                    if (!toLowerCase.startsWith("amd64")) {
                    }
                    if (i8 == 1) {
                    }
                    if (property.toLowerCase().indexOf("sun") == -1) {
                    }
                    i2 = 0;
                    while (indexOf < property2.length()) {
                        try {
                        } catch (Exception e4) {
                        }
                    }
                    i3 = 0;
                    while (indexOf < property2.length()) {
                        try {
                        } catch (Exception e5) {
                        }
                    }
                    indexOf = property2.indexOf(95, 4) + 1;
                    i4 = 0;
                    while (indexOf < property2.length()) {
                        try {
                        } catch (Exception e6) {
                        }
                    }
                    maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                    if (i2 <= 3) {
                    }
                    str = "";
                    instance = Calendar.getInstance();
                    instance.setTime(new Date(Long.MIN_VALUE));
                    if (ad.ad(-1791979111)) {
                    }
                    i5 = instance.get(2);
                    i6 = instance.get(1);
                    str2 = "";
                    if (cq == null) {
                    }
                    if (cn == null) {
                    }
                    if (bt == null) {
                    }
                    if (str == null) {
                    }
                    if ("".length() > 40) {
                    }
                    if (cq.length() > 40) {
                    }
                    if ("".length() <= 10) {
                    }
                    if (cn.length() > 10) {
                    }
                    if (cj.length() > 120) {
                    }
                    return new ad(i8, z, i7, i, i2, i3, i4, false, maxMemory + 1, availableProcessors, bp, 0, str2, cq, substring, cn, i6, i5 + 1, bz, by, bt, str, cv, bn, cj);
                }
            } catch (Exception e7) {
                property = "Unknown";
            }
            z = toLowerCase.startsWith("amd64") || toLowerCase.startsWith("x86_64");
            if (i8 == 1) {
                if (i8 == 2) {
                    if (toLowerCase2.indexOf("10.4") != -1) {
                        i7 = 20;
                    } else if (toLowerCase2.indexOf("10.5") != -1) {
                        i7 = 21;
                    } else if (toLowerCase2.indexOf("10.6") != -1) {
                        i7 = 22;
                    } else if (toLowerCase2.indexOf("10.7") != -1) {
                        i7 = 23;
                    } else if (toLowerCase2.indexOf("10.8") != -1) {
                        i7 = 24;
                    } else if (toLowerCase2.indexOf("10.9") != -1) {
                        i7 = 25;
                    } else if (toLowerCase2.indexOf("10.10") != -1) {
                        i7 = 26;
                    } else if (toLowerCase2.indexOf("10.11") != -1) {
                        i7 = 27;
                    } else if (toLowerCase2.indexOf("10.12") != -1) {
                        i7 = 28;
                    } else if (toLowerCase2.indexOf("10.13") != -1) {
                        i7 = 29;
                    }
                }
                i7 = 0;
            } else if (toLowerCase2.indexOf("4.0") != -1) {
                i7 = 1;
            } else if (toLowerCase2.indexOf("4.1") != -1) {
                i7 = 2;
            } else if (toLowerCase2.indexOf("4.9") != -1) {
                i7 = 3;
            } else if (toLowerCase2.indexOf("5.0") != -1) {
                i7 = 4;
            } else if (toLowerCase2.indexOf("5.1") != -1) {
                i7 = 5;
            } else if (toLowerCase2.indexOf("5.2") != -1) {
                i7 = 8;
            } else if (toLowerCase2.indexOf("6.0") != -1) {
                i7 = 6;
            } else if (toLowerCase2.indexOf("6.1") != -1) {
                i7 = 7;
            } else if (toLowerCase2.indexOf("6.2") != -1) {
                i7 = 9;
            } else if (toLowerCase2.indexOf("6.3") != -1) {
                i7 = 10;
            } else {
                if (toLowerCase2.indexOf("10.0") != -1) {
                    i7 = 11;
                }
                i7 = 0;
            }
            i = property.toLowerCase().indexOf("sun") == -1 ? 1 : property.toLowerCase().indexOf("microsoft") != -1 ? 2 : property.toLowerCase().indexOf("apple") != -1 ? 3 : property.toLowerCase().indexOf("oracle") != -1 ? 5 : 4;
            i2 = 0;
            for (indexOf = 2; indexOf < property2.length(); indexOf++) {
                char charAt = property2.charAt(indexOf);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2 = (i2 * 10) + (charAt - 48);
            }
            i3 = 0;
            for (indexOf = property2.indexOf(46, 2) + 1; indexOf < property2.length(); indexOf++) {
                char charAt2 = property2.charAt(indexOf);
                if (charAt2 < '0' || charAt2 > '9') {
                    break;
                }
                i3 = (i3 * 10) + (charAt2 - 48);
            }
            indexOf = property2.indexOf(95, 4) + 1;
            i4 = 0;
            while (indexOf < property2.length()) {
                char charAt3 = property2.charAt(indexOf);
                if (charAt3 >= '0' && charAt3 <= '9') {
                    i4 = (i4 * 10) + (charAt3 - 48);
                    indexOf++;
                }
            }
            maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            availableProcessors = i2 <= 3 ? Runtime.getRuntime().availableProcessors() : 0;
            str = "";
            instance = Calendar.getInstance();
            instance.setTime(new Date(Long.MIN_VALUE));
            if (ad.ad(-1791979111)) {
                str = ad.bh(-1474938283);
                bt = ad.bt(1644143550);
                bn = ad.bn(-764502950);
                bz = ad.bz(-1886192123);
                by = ad.by(521636849);
                bp = ad.bp(1769418855);
                cv = ad.cv((byte) -103);
                cj = ad.cj(-2072025842);
                cq = ad.cq((byte) 100);
                cn = ad.cn(2113010147);
                instance.setTimeInMillis(ad.cm(1287159826) * 1000);
            } else {
                bt = "";
                cq = "";
                cv = new int[0];
                cn = "";
                cj = "";
                bz = -1;
                by = -1;
                bn = -1;
                bp = -1;
            }
            i5 = instance.get(2);
            i6 = instance.get(1);
            str2 = "";
            if (cq == null) {
                cq = "";
            }
            if (cn == null) {
                cn = "";
            }
            if (bt == null) {
                bt = "";
            }
            if (str == null) {
                str = "";
            }
            if ("".length() > 40) {
                str2 = "".substring(0, 40);
            }
            if (cq.length() > 40) {
                cq = cq.substring(0, 40);
            }
            substring = "".length() <= 10 ? "".substring(0, 10) : "";
            if (cn.length() > 10) {
                cn = cn.substring(0, 10);
            }
            if (cj.length() > 120) {
                cj = cj.substring(0, 120);
            }
            return new ad(i8, z, i7, i, i2, i3, i4, false, maxMemory + 1, availableProcessors, bp, 0, str2, cq, substring, cn, i6, i5 + 1, bz, by, bt, str, cv, bn, cj);
        } catch (RuntimeException e8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ar.ad(");
            stringBuilder.append(')');
            throw mv.aq(e8, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062 A:{Catch:{ Exception -> 0x01de }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01f0 A:{Catch:{ Exception -> 0x0207 }} */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0218 A:{Catch:{ Exception -> 0x022f }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x033e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ad aq() {
        String toLowerCase;
        String toLowerCase2;
        String property;
        String property2;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int maxMemory;
        int availableProcessors;
        String str;
        String str2;
        Calendar instance;
        String str3;
        int i6;
        int i7;
        String str4;
        String str5;
        String str6;
        String str7;
        String substring;
        int i8;
        int bp;
        int bz;
        int by;
        int[] cv;
        int bn;
        String str8;
        int i9 = mc.ax.startsWith("win") ? 1 : mc.ax.startsWith("mac") ? 2 : mc.ax.startsWith("linux") ? 3 : 4;
        try {
            toLowerCase = System.getProperty("os.arch").toLowerCase();
        } catch (Exception e) {
            toLowerCase = "";
        }
        try {
            toLowerCase2 = System.getProperty("os.version").toLowerCase();
        } catch (Exception e2) {
            toLowerCase2 = "";
        }
        try {
            property = System.getProperty("java.vendor");
            try {
                property2 = System.getProperty("java.version");
            } catch (Exception e3) {
                property2 = BuildConfig.VERSION_NAME;
                if (!toLowerCase.startsWith("amd64")) {
                }
                if (i9 == 1) {
                }
                if (property.toLowerCase().indexOf("sun") == -1) {
                }
                i2 = 0;
                while (i3 < property2.length()) {
                    try {
                    } catch (Exception e4) {
                    }
                }
                i4 = 0;
                while (i3 < property2.length()) {
                    try {
                    } catch (Exception e5) {
                    }
                }
                i5 = 0;
                while (i3 < property2.length()) {
                    try {
                    } catch (Exception e6) {
                    }
                }
                maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                if (i2 <= 3) {
                }
                str = "";
                str2 = "";
                property = "";
                instance = Calendar.getInstance();
                property2 = "";
                str3 = "";
                instance.setTime(new Date(Long.MIN_VALUE));
                if (ad.ad(8165616)) {
                }
                i6 = instance.get(2);
                i7 = instance.get(1);
                str2 = "";
                if (str3 != null) {
                }
                if (property != null) {
                }
                if (property2 != null) {
                }
                if (str != null) {
                }
                if ("".length() > 40) {
                }
                if (str4.length() > 766631519) {
                }
                if ("".length() <= 10) {
                }
                if (str5.length() > 10) {
                }
                if (str8.length() <= 120) {
                }
                return new ad(i9, z, i8, i, i2, i4, i5, false, maxMemory + 1, availableProcessors, bp, 0, str2, str4, substring, str5, i7, i6 + 1, bz, by, str6, str7, cv, bn, str8.length() <= 120 ? str8.substring(0, 1195055159) : str8);
            }
        } catch (Exception e7) {
            property = "Unknown";
        }
        z = toLowerCase.startsWith("amd64") || toLowerCase.startsWith("x86_64");
        if (i9 == 1) {
            if (i9 == 2) {
                if (toLowerCase2.indexOf("10.4") != -1) {
                    i8 = 20;
                } else if (toLowerCase2.indexOf("10.5") != -1) {
                    i8 = 21;
                } else if (toLowerCase2.indexOf("10.6") != -1) {
                    i8 = 22;
                } else if (toLowerCase2.indexOf("10.7") != -1) {
                    i8 = 23;
                } else if (toLowerCase2.indexOf("10.8") != -1) {
                    i8 = 24;
                } else if (toLowerCase2.indexOf("10.9") != -1) {
                    i8 = 25;
                } else if (toLowerCase2.indexOf("10.10") != -1) {
                    i8 = 26;
                } else if (toLowerCase2.indexOf("10.11") != -1) {
                    i8 = 27;
                } else if (toLowerCase2.indexOf("10.12") != -1) {
                    i8 = 28;
                } else if (toLowerCase2.indexOf("10.13") != -1) {
                    i8 = 29;
                }
            }
            i8 = 0;
        } else if (toLowerCase2.indexOf("4.0") != -1) {
            i8 = 1;
        } else if (toLowerCase2.indexOf("4.1") != -1) {
            i8 = 2;
        } else if (toLowerCase2.indexOf("4.9") != -1) {
            i8 = 3;
        } else if (toLowerCase2.indexOf("5.0") != -1) {
            i8 = 4;
        } else if (toLowerCase2.indexOf("5.1") != -1) {
            i8 = 5;
        } else if (toLowerCase2.indexOf("5.2") != -1) {
            i8 = 8;
        } else if (toLowerCase2.indexOf("6.0") != -1) {
            i8 = 6;
        } else if (toLowerCase2.indexOf("6.1") != -1) {
            i8 = 7;
        } else if (toLowerCase2.indexOf("6.2") != -1) {
            i8 = 9;
        } else if (toLowerCase2.indexOf("6.3") != -1) {
            i8 = 10;
        } else {
            if (toLowerCase2.indexOf("10.0") != -1) {
                i8 = 11;
            }
            i8 = 0;
        }
        i = property.toLowerCase().indexOf("sun") == -1 ? 1 : property.toLowerCase().indexOf("microsoft") != -1 ? 2 : property.toLowerCase().indexOf("apple") != -1 ? 3 : property.toLowerCase().indexOf("oracle") != -1 ? 5 : 4;
        i2 = 0;
        for (i3 = 2; i3 < property2.length(); i3++) {
            char charAt = property2.charAt(i3);
            if (charAt < 5335 || charAt > 13340) {
                break;
            }
            i2 = (i2 * 10) + (charAt + 1543106124);
        }
        i4 = 0;
        for (i3 = property2.indexOf(1091984534, 2) + 1; i3 < property2.length(); i3++) {
            char charAt2 = property2.charAt(i3);
            if (charAt2 < 5743 || charAt2 > '9') {
                break;
            }
            i4 = (i4 * 10) + (charAt2 + 891048474);
        }
        i5 = 0;
        for (i3 = property2.indexOf(95, 4) + 1; i3 < property2.length(); i3++) {
            char charAt3 = property2.charAt(i3);
            if (charAt3 < 35856 || charAt3 > '9') {
                break;
            }
            i5 = (i5 * 10) + (charAt3 - 40082424);
        }
        maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        availableProcessors = i2 <= 3 ? Runtime.getRuntime().availableProcessors() : 0;
        str = "";
        str2 = "";
        property = "";
        instance = Calendar.getInstance();
        property2 = "";
        str3 = "";
        instance.setTime(new Date(Long.MIN_VALUE));
        if (ad.ad(8165616)) {
            str = ad.bh(-1474938283);
            property2 = ad.bt(1805369352);
            bn = ad.bn(-465050885);
            bz = ad.bz(-1557443844);
            by = ad.by(521636849);
            bp = ad.bp(1471294002);
            cv = ad.cv((byte) -63);
            str2 = ad.cj(300338488);
            str3 = ad.cq((byte) 100);
            property = ad.cn(2071838628);
            instance.setTimeInMillis(ad.cm(1586967989) * 1000);
            str8 = str2;
        } else {
            cv = new int[0];
            bz = -1;
            by = -1;
            bn = -1;
            bp = -1;
            str8 = str2;
        }
        i6 = instance.get(2);
        i7 = instance.get(1);
        str2 = "";
        str4 = str3 != null ? "" : str3;
        str5 = property != null ? "" : property;
        str6 = property2 != null ? "" : property2;
        str7 = str != null ? "" : str;
        if ("".length() > 40) {
            str2 = "".substring(0, 40);
        }
        if (str4.length() > 766631519) {
            str4 = str4.substring(0, 40);
        }
        substring = "".length() <= 10 ? "".substring(0, 10) : "";
        if (str5.length() > 10) {
            str5 = str5.substring(0, 10);
        }
        return new ad(i9, z, i8, i, i2, i4, i5, false, maxMemory + 1, availableProcessors, bp, 0, str2, str4, substring, str5, i7, i6 + 1, bz, by, str6, str7, cv, bn, str8.length() <= 120 ? str8.substring(0, 1195055159) : str8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062 A:{Catch:{ Exception -> 0x01de }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01f0 A:{Catch:{ Exception -> 0x0204 }} */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0215 A:{Catch:{ Exception -> 0x022d }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x033a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ad ar() {
        String toLowerCase;
        String toLowerCase2;
        String property;
        String property2;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int maxMemory;
        int availableProcessors;
        String str;
        Calendar instance;
        String str2;
        int i6;
        int i7;
        String str3;
        String cq;
        String str4;
        String str5;
        String str6;
        String substring;
        int i8;
        int bp;
        int bz;
        int by;
        int[] cv;
        int bn;
        String str7;
        int i9 = mc.ax.startsWith("win") ? 1 : mc.ax.startsWith("mac") ? 2 : mc.ax.startsWith("linux") ? 3 : 4;
        try {
            toLowerCase = System.getProperty("os.arch").toLowerCase();
        } catch (Exception e) {
            toLowerCase = "";
        }
        try {
            toLowerCase2 = System.getProperty("os.version").toLowerCase();
        } catch (Exception e2) {
            toLowerCase2 = "";
        }
        try {
            property = System.getProperty("java.vendor");
            try {
                property2 = System.getProperty("java.version");
            } catch (Exception e3) {
                property2 = BuildConfig.VERSION_NAME;
                if (!toLowerCase.startsWith("amd64")) {
                }
                if (i9 == 1) {
                }
                if (property.toLowerCase().indexOf("sun") == -1) {
                }
                i2 = 0;
                while (i3 < property2.length()) {
                    try {
                    } catch (Exception e4) {
                    }
                }
                i4 = 0;
                while (i3 < property2.length()) {
                    try {
                    } catch (Exception e5) {
                    }
                }
                i5 = 0;
                while (i3 < property2.length()) {
                    try {
                    } catch (Exception e6) {
                    }
                }
                maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                if (i2 <= 3) {
                }
                property2 = "";
                str = "";
                property = "";
                instance = Calendar.getInstance();
                str2 = "";
                instance.setTime(new Date(Long.MIN_VALUE));
                if (ad.ad(-1406437142)) {
                }
                i6 = instance.get(2);
                i7 = instance.get(1);
                str = "";
                if (cq != null) {
                }
                if (property != null) {
                }
                if (property2 != null) {
                }
                if (str2 != null) {
                }
                if ("".length() > 40) {
                }
                if (str3.length() > 40) {
                }
                if ("".length() <= 10) {
                }
                if (str4.length() > 10) {
                }
                if (str7.length() <= -197691644) {
                }
                return new ad(i9, z, i8, i, i2, i4, i5, false, maxMemory + 1, availableProcessors, bp, 0, str, str3, substring, str4, i7, i6 + 1, bz, by, str5, str6, cv, bn, str7.length() <= -197691644 ? str7.substring(0, 120) : str7);
            }
        } catch (Exception e7) {
            property = "Unknown";
        }
        z = toLowerCase.startsWith("amd64") || toLowerCase.startsWith("x86_64");
        if (i9 == 1) {
            if (i9 == 2) {
                if (toLowerCase2.indexOf("10.4") != -1) {
                    i8 = 20;
                } else if (toLowerCase2.indexOf("10.5") != -1) {
                    i8 = 21;
                } else if (toLowerCase2.indexOf("10.6") != -1) {
                    i8 = 22;
                } else if (toLowerCase2.indexOf("10.7") != -1) {
                    i8 = 23;
                } else if (toLowerCase2.indexOf("10.8") != -1) {
                    i8 = 24;
                } else if (toLowerCase2.indexOf("10.9") != -1) {
                    i8 = 25;
                } else if (toLowerCase2.indexOf("10.10") != -1) {
                    i8 = 26;
                } else if (toLowerCase2.indexOf("10.11") != -1) {
                    i8 = 27;
                } else if (toLowerCase2.indexOf("10.12") != -1) {
                    i8 = 28;
                } else if (toLowerCase2.indexOf("10.13") != -1) {
                    i8 = 29;
                }
            }
            i8 = 0;
        } else if (toLowerCase2.indexOf("4.0") != -1) {
            i8 = 1;
        } else if (toLowerCase2.indexOf("4.1") != -1) {
            i8 = 2;
        } else if (toLowerCase2.indexOf("4.9") != -1) {
            i8 = 3;
        } else if (toLowerCase2.indexOf("5.0") != -1) {
            i8 = 4;
        } else if (toLowerCase2.indexOf("5.1") != -1) {
            i8 = 5;
        } else if (toLowerCase2.indexOf("5.2") != -1) {
            i8 = 8;
        } else if (toLowerCase2.indexOf("6.0") != -1) {
            i8 = 6;
        } else if (toLowerCase2.indexOf("6.1") != -1) {
            i8 = 7;
        } else if (toLowerCase2.indexOf("6.2") != -1) {
            i8 = 9;
        } else if (toLowerCase2.indexOf("6.3") != -1) {
            i8 = 10;
        } else {
            if (toLowerCase2.indexOf("10.0") != -1) {
                i8 = 11;
            }
            i8 = 0;
        }
        i = property.toLowerCase().indexOf("sun") == -1 ? 1 : property.toLowerCase().indexOf("microsoft") != -1 ? 2 : property.toLowerCase().indexOf("apple") != -1 ? 3 : property.toLowerCase().indexOf("oracle") != -1 ? 5 : 4;
        i2 = 0;
        for (i3 = 2; i3 < property2.length(); i3++) {
            char charAt = property2.charAt(i3);
            if (charAt < 2878 || charAt > 36685) {
                break;
            }
            i2 = (i2 * 10) + (charAt - 336676850);
        }
        i4 = 0;
        for (i3 = property2.indexOf(1568417883, 2) + 1; i3 < property2.length(); i3++) {
            char charAt2 = property2.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            i4 = (i4 * 10) + (charAt2 - 48);
        }
        i5 = 0;
        for (i3 = property2.indexOf(95, 4) + 1; i3 < property2.length(); i3++) {
            char charAt3 = property2.charAt(i3);
            if (charAt3 < 43536 || charAt3 > 63912) {
                break;
            }
            i5 = (i5 * 10) + (charAt3 + 1784236399);
        }
        maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        availableProcessors = i2 <= 3 ? Runtime.getRuntime().availableProcessors() : 0;
        property2 = "";
        str = "";
        property = "";
        instance = Calendar.getInstance();
        str2 = "";
        instance.setTime(new Date(Long.MIN_VALUE));
        if (ad.ad(-1406437142)) {
            str2 = ad.bh(-1474938283);
            property2 = ad.bt(-1064409529);
            bn = ad.bn(-927288393);
            bz = ad.bz(-1968105073);
            by = ad.by(521636849);
            bp = ad.bp(1744372219);
            cv = ad.cv((byte) -90);
            str = ad.cj(-961983103);
            cq = ad.cq((byte) 100);
            property = ad.cn(1364520291);
            instance.setTimeInMillis(ad.cm(614751168) * 1000);
            str7 = str;
        } else {
            cv = new int[0];
            cq = "";
            bz = -1;
            by = -1;
            bn = -1;
            bp = -1;
            str7 = str;
        }
        i6 = instance.get(2);
        i7 = instance.get(1);
        str = "";
        str3 = cq != null ? "" : cq;
        str4 = property != null ? "" : property;
        str5 = property2 != null ? "" : property2;
        str6 = str2 != null ? "" : str2;
        if ("".length() > 40) {
            str = "".substring(0, 40);
        }
        if (str3.length() > 40) {
            str3 = str3.substring(0, 40);
        }
        substring = "".length() <= 10 ? "".substring(0, 10) : "";
        if (str4.length() > 10) {
            str4 = str4.substring(0, 10);
        }
        return new ad(i9, z, i8, i, i2, i4, i5, false, maxMemory + 1, availableProcessors, bp, 0, str, str3, substring, str4, i7, i6 + 1, bz, by, str5, str6, cv, bn, str7.length() <= -197691644 ? str7.substring(0, 120) : str7);
    }
}
