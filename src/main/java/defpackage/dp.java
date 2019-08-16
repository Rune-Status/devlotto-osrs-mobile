package defpackage;

import android.support.v4.internal.view.SupportMenu;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

/* renamed from: dp */
public class dp extends mp {
    static gz aj = new gz(100, null);
    static gz al = new gz(64, null);
    static kh aq = null;
    static kh ar = null;
    static final int cc = 1;
    static long ri;
    public int aa;
    public int ac;
    int[] ae;
    int[] ag;
    public int[] ai;
    public int[] ak;
    public int[] am;
    public int ao;
    public boolean ap;
    public int as;
    public int au;
    public int aw;
    public int ax;
    public int az;

    dp() {
        try {
            this.as = -1033718859;
            this.ap = false;
            this.au = -2015141925;
            this.az = -1666216191;
            this.ax = 1044139843;
            this.aw = -277174803;
            this.ac = 758130595;
            this.aa = 307259059;
            this.ao = -986026970;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dp aa(int i) {
        long j = (long) i;
        dp dpVar = (dp) al.ad(j);
        if (dpVar == null) {
            byte[] ar = ce.ad.ar(12, i, 1329716807);
            dpVar = new dp();
            if (ar != null) {
                dpVar.ar(new lj(ar), -1446318759);
            }
            dpVar.aj(1367327448);
            al.ar(dpVar, j);
        }
        return dpVar;
    }

    public static dp ac(int i) {
        long j = (long) i;
        dp dpVar = (dp) al.ad(j);
        if (dpVar == null) {
            byte[] ar = ce.ad.ar(12, i, 814825359);
            dpVar = new dp();
            if (ar != null) {
                dpVar.ar(new lj(ar), -1446318759);
            }
            dpVar.aj(1805896618);
            al.ar(dpVar, j);
        }
        return dpVar;
    }

    public static void ar(lv lvVar, int i) {
        try {
            os osVar = (os) op.ad.aj();
            if (osVar != null) {
                int i2 = lvVar.al;
                lvVar.ae(osVar.ad * -950939157, (byte) 26);
                for (int i3 = 0; i3 < osVar.aq * -1966460865; i3++) {
                    if (osVar.al[i3] != 0) {
                        lvVar.al(osVar.al[i3], -1312310313);
                    } else {
                        try {
                            int i4 = osVar.ar[i3];
                            int i5;
                            if (i4 == 0) {
                                i5 = osVar.aj[i3].getInt(null);
                                lvVar.al(0, -971201036);
                                lvVar.ae(i5, (byte) 113);
                            } else if (1 == i4) {
                                osVar.aj[i3].setInt(null, osVar.ai[i3]);
                                lvVar.al(0, -1455247202);
                            } else if (i4 == 2) {
                                i5 = osVar.aj[i3].getModifiers();
                                lvVar.al(0, -1215197930);
                                lvVar.ae(i5, (byte) 95);
                            }
                            if (i4 == 3) {
                                Method method = osVar.ae[i3];
                                byte[][] bArr = osVar.am[i3];
                                Object[] objArr = new Object[bArr.length];
                                for (i4 = 0; i4 < bArr.length; i4++) {
                                    objArr[i4] = new ObjectInputStream(new ByteArrayInputStream(bArr[i4])).readObject();
                                }
                                Object invoke = method.invoke(null, objArr);
                                if (invoke == null) {
                                    lvVar.al(0, -210050240);
                                } else if (invoke instanceof Number) {
                                    lvVar.al(1, 60635087);
                                    lvVar.ak(((Number) invoke).longValue());
                                } else if (invoke instanceof String) {
                                    lvVar.al(2, 72448825);
                                    lvVar.ap((String) invoke, 635769462);
                                } else {
                                    lvVar.al(4, -406015077);
                                }
                            } else if (4 == i4) {
                                i4 = osVar.ae[i3].getModifiers();
                                lvVar.al(0, 177216705);
                                lvVar.ae(i4, (byte) 94);
                            }
                        } catch (ClassNotFoundException e) {
                            lvVar.al(-10, -435011986);
                        } catch (InvalidClassException e2) {
                            lvVar.al(-11, -765702556);
                        } catch (StreamCorruptedException e3) {
                            lvVar.al(-12, -677235925);
                        } catch (OptionalDataException e4) {
                            lvVar.al(-13, -274134732);
                        } catch (IllegalAccessException e5) {
                            lvVar.al(-14, -2054776960);
                        } catch (IllegalArgumentException e6) {
                            lvVar.al(-15, -114254447);
                        } catch (InvocationTargetException e7) {
                            lvVar.al(-16, -1883999523);
                        } catch (SecurityException e8) {
                            lvVar.al(-17, -1131995083);
                        } catch (IOException e9) {
                            lvVar.al(-18, -239854605);
                        } catch (NullPointerException e10) {
                            lvVar.al(-19, -682981152);
                        } catch (Exception e11) {
                            lvVar.al(-20, -2095605369);
                        } catch (Throwable th) {
                            lvVar.al(-21, -705866973);
                        }
                    }
                }
                lvVar.br(-1631454091 * i2, 1725603643);
                osVar.ky();
            }
        } catch (RuntimeException e12) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.ar(");
            stringBuilder.append(')');
            throw mv.aq(e12, stringBuilder.toString());
        }
    }

    public static void au(kh khVar, kh khVar2, kh khVar3) {
        ce.ad = khVar;
        aq = khVar2;
        ar = khVar3;
    }

    public static dp aw(int i) {
        long j = (long) i;
        dp dpVar = (dp) al.ad(j);
        if (dpVar == null) {
            byte[] ar = ce.ad.ar(12, i, 2047611043);
            dpVar = new dp();
            if (ar != null) {
                dpVar.ar(new lj(ar), -1446318759);
            }
            dpVar.aj(1773525990);
            al.ar(dpVar, j);
        }
        return dpVar;
    }

    public static void ax(kh khVar, kh khVar2, kh khVar3) {
        ce.ad = khVar;
        aq = khVar2;
        ar = khVar3;
    }

    public static void az(kh khVar, kh khVar2, kh khVar3) {
        ce.ad = khVar;
        aq = khVar2;
        ar = khVar3;
    }

    static ba bg(int i) {
        long j = (long) i;
        ba baVar = (ba) aj.ad(j);
        if (baVar == null) {
            baVar = is.ad(aq, ar, i, false, 1038639486);
            if (baVar != null) {
                aj.ar(baVar, j);
            }
        }
        return baVar;
    }

    public static void bu(Collection collection) {
        collection.add(al);
        collection.add(aj);
    }

    static ba bv(int i) {
        long j = (long) i;
        ba baVar = (ba) aj.ad(j);
        if (baVar == null) {
            baVar = is.ad(aq, ar, i, false, 1314900876);
            if (baVar != null) {
                aj.ar(baVar, j);
            }
        }
        return baVar;
    }

    public static void bw(Collection collection) {
        collection.add(al);
        collection.add(aj);
    }

    public static void bx(Collection collection) {
        collection.add(al);
        collection.add(aj);
    }

    static void hb(int i, byte b) {
        try {
            mb ar = client.nf.ar();
            while (true) {
                ms msVar = (ms) ar;
                if (msVar != null) {
                    if (((long) i) == ((msVar.gs >> 48) & 65535)) {
                        msVar.ky();
                    }
                    ar = client.nf.al();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.hb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ab() {
        if (-1 == this.ac * 451705290) {
            if (this.ag != null) {
                this.ac = -1516261190;
            } else {
                this.ac = 0;
            }
        }
        if (-1 != this.aa * 952452997) {
            return;
        }
        if (this.ag != null) {
            this.aa = -614518118;
        } else {
            this.aa = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public bp ae(bp bpVar, int i, int i2, int i3) {
        try {
            int i4 = this.ai[i];
            ba ag = ep.ag(i4 >> 16, -1646787004);
            int i5 = SupportMenu.USER_MASK & i4;
            if (ag == null) {
                return bpVar.aq(true);
            }
            bp aq = bpVar.aq(!ag.aq(i5, 952792904));
            int i6 = i2 & 3;
            if (1 == i6) {
                aq.ax();
            } else if (i6 == 2) {
                aq.az();
            } else if (3 == i6) {
                aq.au();
            }
            aq.as(ag, i5);
            if (i6 == 1) {
                aq.au();
                return aq;
            } else if (i6 == 2) {
                aq.az();
                return aq;
            } else if (i6 != 3) {
                return aq;
            } else {
                aq.ax();
                return aq;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af(lj ljVar, int i) {
        int i2 = 0;
        int an;
        int i3;
        if (i == 1) {
            an = ljVar.an(-1464407032);
            this.am = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.am[i3] = ljVar.an(-1464407032);
            }
            this.ai = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.ai[i3] = ljVar.an(-1464407032);
            }
            while (i2 < an) {
                this.ai[i2] = (ljVar.an(-1464407032) << 16) + this.ai[i2];
                i2++;
            }
        } else if (2 == i) {
            this.as = ljVar.an(-1464407032) * 1033718859;
        } else if (3 == i) {
            i3 = ljVar.af(1804771424);
            this.ag = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ag[i2] = ljVar.af(1804771424);
                i2++;
            }
            this.ag[i3] = 9999999;
        } else if (4 == i) {
            this.ap = true;
        } else if (i == 5) {
            this.au = ljVar.af(1804771424) * -403028385;
        } else if (6 == i) {
            this.az = ljVar.an(-1464407032) * 1666216191;
        } else if (i == 7) {
            this.ax = ljVar.an(-1464407032) * -1044139843;
        } else if (8 == i) {
            this.aw = ljVar.af(1804771424) * 517802351;
        } else if (i == 9) {
            this.ac = ljVar.af(1804771424) * -758130595;
        } else if (i == 10) {
            this.aa = ljVar.af(1804771424) * -307259059;
        } else if (i == 11) {
            this.ao = ljVar.af(1804771424) * -493013485;
        } else if (i == 12) {
            an = ljVar.af(1804771424);
            this.ae = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.ae[i3] = ljVar.an(-1464407032);
            }
            while (i2 < an) {
                this.ae[i2] = (ljVar.an(-1464407032) << 16) + this.ae[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = ljVar.af(1804771424);
            this.ak = new int[i3];
            while (i2 < i3) {
                this.ak[i2] = ljVar.av((byte) -45);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 0);
            } else {
                return;
            }
        }
    }

    public bp ai(bp bpVar, int i, int i2) {
        boolean z = true;
        try {
            int i3 = this.ai[i];
            ba ag = ep.ag(i3 >> 16, -1992387286);
            i3 &= SupportMenu.USER_MASK;
            if (ag == null) {
                return bpVar.aq(true);
            }
            if (ag.aq(i3, 952792904)) {
                z = false;
            }
            bp aq = bpVar.aq(z);
            aq.as(ag, i3);
            return aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        try {
            if (-1 == this.ac * -1282229259) {
                if (this.ag != null) {
                    this.ac = -1516261190;
                } else {
                    this.ac = 0;
                }
            }
            if (-1 != this.aa * 952452997) {
                return;
            }
            if (this.ag != null) {
                this.aa = -614518118;
            } else {
                this.aa = 0;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public bp ak(bp bpVar, int i, dp dpVar, int i2, byte b) {
        int i3 = 1;
        try {
            int i4 = this.ai[i];
            ba ag = ep.ag(i4 >> 16, -1183616821);
            i4 &= SupportMenu.USER_MASK;
            if (ag == null) {
                return dpVar.ai(bpVar, i2, 2131922102);
            }
            int i5 = dpVar.ai[i2];
            ba ag2 = ep.ag(i5 >> 16, -1108570606);
            i5 &= SupportMenu.USER_MASK;
            bp aq;
            if (ag2 == null) {
                aq = bpVar.aq(ag.aq(i4, 952792904) ^ 1);
                aq.as(ag, i4);
                return aq;
            }
            int i6 = !ag.aq(i4, 952792904) ? 1 : 0;
            if (ag2.aq(i5, 952792904)) {
                i3 = 0;
            }
            aq = bpVar.aq(i3 & i6);
            aq.ag(ag, i4, ag2, i5, this.ag);
            return aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, byte b) {
        int i2 = 0;
        int an;
        int i3;
        if (i == 1) {
            try {
                an = ljVar.an(-1464407032);
                this.am = new int[an];
                for (i3 = 0; i3 < an; i3++) {
                    this.am[i3] = ljVar.an(-1464407032);
                }
                this.ai = new int[an];
                for (i3 = 0; i3 < an; i3++) {
                    this.ai[i3] = ljVar.an(-1464407032);
                }
                while (i2 < an) {
                    this.ai[i2] = (ljVar.an(-1464407032) << 16) + this.ai[i2];
                    i2++;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dp.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.as = ljVar.an(-1464407032) * 1033718859;
        } else if (3 == i) {
            i3 = ljVar.af(1804771424);
            this.ag = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ag[i2] = ljVar.af(1804771424);
                i2++;
            }
            this.ag[i3] = 9999999;
        } else if (4 == i) {
            this.ap = true;
        } else if (i == 5) {
            this.au = ljVar.af(1804771424) * -403028385;
        } else if (6 == i) {
            this.az = ljVar.an(-1464407032) * 1666216191;
        } else if (i == 7) {
            this.ax = ljVar.an(-1464407032) * -1044139843;
        } else if (8 == i) {
            this.aw = ljVar.af(1804771424) * 517802351;
        } else if (i == 9) {
            this.ac = ljVar.af(1804771424) * -758130595;
        } else if (i == 10) {
            this.aa = ljVar.af(1804771424) * -307259059;
        } else if (i == 11) {
            this.ao = ljVar.af(1804771424) * -493013485;
        } else if (i == 12) {
            an = ljVar.af(1804771424);
            this.ae = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.ae[i3] = ljVar.an(-1464407032);
            }
            while (i2 < an) {
                this.ae[i2] = (ljVar.an(-1464407032) << 16) + this.ae[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = ljVar.af(1804771424);
            this.ak = new int[i3];
            while (i2 < i3) {
                this.ak[i2] = ljVar.av((byte) -10);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public bp am(bp bpVar, int i, byte b) {
        boolean z = true;
        try {
            int i2 = this.ai[i];
            ba ag = ep.ag(i2 >> 16, -1764457651);
            i2 &= SupportMenu.USER_MASK;
            if (ag == null) {
                return bpVar.ar(true);
            }
            if (ag.aq(i2, 952792904)) {
                z = false;
            }
            bp ar = bpVar.ar(z);
            ar.as(ag, i2);
            return ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an(lj ljVar, int i) {
        int i2 = 0;
        int an;
        int i3;
        if (i == 1) {
            an = ljVar.an(-1464407032);
            this.am = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.am[i3] = ljVar.an(-1464407032);
            }
            this.ai = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.ai[i3] = ljVar.an(-1464407032);
            }
            while (i2 < an) {
                this.ai[i2] = (ljVar.an(-1464407032) << 16) + this.ai[i2];
                i2++;
            }
        } else if (2 == i) {
            this.as = ljVar.an(-1464407032) * 1033718859;
        } else if (3 == i) {
            i3 = ljVar.af(1804771424);
            this.ag = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ag[i2] = ljVar.af(1804771424);
                i2++;
            }
            this.ag[i3] = 9999999;
        } else if (4 == i) {
            this.ap = true;
        } else if (i == 5) {
            this.au = ljVar.af(1804771424) * -403028385;
        } else if (6 == i) {
            this.az = ljVar.an(-1464407032) * -1873735518;
        } else if (i == 7) {
            this.ax = ljVar.an(-1464407032) * -1044139843;
        } else if (8 == i) {
            this.aw = ljVar.af(1804771424) * -790618377;
        } else if (i == 9) {
            this.ac = ljVar.af(1804771424) * -758130595;
        } else if (i == 10) {
            this.aa = ljVar.af(1804771424) * -307259059;
        } else if (i == 11) {
            this.ao = ljVar.af(1804771424) * 2146516815;
        } else if (i == 12) {
            an = ljVar.af(1804771424);
            this.ae = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.ae[i3] = ljVar.an(-1464407032);
            }
            while (i2 < an) {
                this.ae[i2] = (ljVar.an(-1464407032) << 16) + this.ae[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = ljVar.af(1804771424);
            this.ak = new int[i3];
            while (i2 < i3) {
                this.ak[i2] = ljVar.av((byte) -21);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 0);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, (byte) 0);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dp.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public bp as(bp bpVar, int i, int i2) {
        int i3 = true;
        try {
            int i4 = this.ai[i];
            ba ag = ep.ag(i4 >> 16, -1304626752);
            int i5 = i4 & SupportMenu.USER_MASK;
            if (ag == null) {
                return bpVar.aq(true);
            }
            int i6;
            ba baVar = null;
            if (this.ae == null || i >= this.ae.length) {
                i6 = 0;
            } else {
                i6 = this.ae[i];
                baVar = ep.ag(i6 >> 16, -1047004788);
                i6 &= SupportMenu.USER_MASK;
            }
            bp aq;
            if (baVar == null || SupportMenu.USER_MASK == i6) {
                boolean z;
                if (ag.aq(i5, 952792904)) {
                    z = false;
                }
                aq = bpVar.aq(z);
                aq.as(ag, i5);
                return aq;
            }
            if (ag.aq(i5, 952792904)) {
                i3 = 0;
            }
            aq = bpVar.aq(i3 & (baVar.aq(i6, 952792904) ^ 1));
            aq.as(ag, i5);
            aq.as(baVar, i6);
            return aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dp.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at() {
        if (-1 == this.ac * -1282229259) {
            if (this.ag != null) {
                this.ac = -1516261190;
            } else {
                this.ac = 0;
            }
        }
        if (-1 != this.aa * 952452997) {
            return;
        }
        if (this.ag != null) {
            this.aa = -614518118;
        } else {
            this.aa = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av() {
        if (-1 == this.ac * -939971111) {
            if (this.ag != null) {
                this.ac = 1429762021;
            } else {
                this.ac = 0;
            }
        }
        if (-1 != this.aa * 952452997) {
            return;
        }
        if (this.ag != null) {
            this.aa = -614518118;
        } else {
            this.aa = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(lj ljVar, int i) {
        int i2 = 0;
        int an;
        int i3;
        if (i == 1) {
            an = ljVar.an(-1464407032);
            this.am = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.am[i3] = ljVar.an(-1464407032);
            }
            this.ai = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.ai[i3] = ljVar.an(-1464407032);
            }
            while (i2 < an) {
                this.ai[i2] = (ljVar.an(-1464407032) << 16) + this.ai[i2];
                i2++;
            }
        } else if (2 == i) {
            this.as = ljVar.an(-1464407032) * 1033718859;
        } else if (3 == i) {
            i3 = ljVar.af(1804771424);
            this.ag = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ag[i2] = ljVar.af(1804771424);
                i2++;
            }
            this.ag[i3] = 9999999;
        } else if (4 == i) {
            this.ap = true;
        } else if (i == 5) {
            this.au = ljVar.af(1804771424) * 1732367229;
        } else if (6 == i) {
            this.az = ljVar.an(-1464407032) * 1666216191;
        } else if (i == 7) {
            this.ax = ljVar.an(-1464407032) * -1813644563;
        } else if (8 == i) {
            this.aw = ljVar.af(1804771424) * -229338385;
        } else if (i == 9) {
            this.ac = ljVar.af(1804771424) * 1291687911;
        } else if (i == 10) {
            this.aa = ljVar.af(1804771424) * -1173995553;
        } else if (i == 11) {
            this.ao = ljVar.af(1804771424) * -493013485;
        } else if (i == 12) {
            an = ljVar.af(1804771424);
            this.ae = new int[an];
            for (i3 = 0; i3 < an; i3++) {
                this.ae[i3] = ljVar.an(-1464407032);
            }
            while (i2 < an) {
                this.ae[i2] = (ljVar.an(-1464407032) << 16) + this.ae[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = ljVar.af(1804771424);
            this.ak = new int[i3];
            while (i2 < i3) {
                this.ak[i2] = ljVar.av((byte) -50);
                i2++;
            }
        }
    }

    public bp ba(bp bpVar, int i) {
        boolean z = true;
        int i2 = this.ai[i];
        ba ag = ep.ag(i2 >> 16, -1446328234);
        i2 &= SupportMenu.USER_MASK;
        if (ag == null) {
            return bpVar.aq(true);
        }
        if (ag.aq(i2, 952792904)) {
            z = false;
        }
        bp aq = bpVar.aq(z);
        aq.as(ag, i2);
        return aq;
    }

    public bp bb(bp bpVar, int i, dp dpVar, int i2) {
        int i3 = 1;
        int i4 = this.ai[i];
        ba ag = ep.ag(i4 >> 16, -1669609572);
        int i5 = i4 & SupportMenu.USER_MASK;
        if (ag == null) {
            return dpVar.ai(bpVar, i2, -977081997);
        }
        i4 = dpVar.ai[i2];
        ba ag2 = ep.ag(i4 >> 16, -1621149832);
        int i6 = i4 & SupportMenu.USER_MASK;
        bp aq;
        if (ag2 == null) {
            aq = bpVar.aq(ag.aq(i5, 952792904) ^ 1);
            aq.as(ag, i5);
            return aq;
        }
        i4 = !ag.aq(i5, 952792904) ? 1 : 0;
        if (ag2.aq(i6, 952792904)) {
            i3 = 0;
        }
        aq = bpVar.aq(i4 & i3);
        aq.ag(ag, i5, ag2, i6, this.ag);
        return aq;
    }

    public bp bc(bp bpVar, int i) {
        int i2 = true;
        int i3 = this.ai[i];
        ba ag = ep.ag(i3 >> 16, -2092328629);
        int i4 = i3 & 827081981;
        if (ag == null) {
            return bpVar.aq(true);
        }
        ba baVar;
        int i5;
        if (this.ae == null || i >= this.ae.length) {
            baVar = null;
            i5 = 0;
        } else {
            int i6 = this.ae[i];
            i5 = i6 & SupportMenu.USER_MASK;
            baVar = ep.ag(i6 >> 16, -2046462818);
        }
        bp aq;
        if (baVar == null || SupportMenu.USER_MASK == i5) {
            boolean z;
            if (ag.aq(i4, 952792904)) {
                z = false;
            }
            aq = bpVar.aq(z);
            aq.as(ag, i4);
            return aq;
        }
        i3 = !ag.aq(i4, 952792904) ? 1 : 0;
        if (baVar.aq(i5, 952792904)) {
            i2 = 0;
        }
        aq = bpVar.aq(i3 & i2);
        aq.as(ag, i4);
        aq.as(baVar, i5);
        return aq;
    }

    /* Access modifiers changed, original: 0000 */
    public bp bd(bp bpVar, int i) {
        boolean z = true;
        int i2 = this.ai[i];
        ba ag = ep.ag(i2 >> 16, -1229891458);
        i2 &= SupportMenu.USER_MASK;
        if (ag == null) {
            return bpVar.ar(true);
        }
        if (ag.aq(i2, 952792904)) {
            z = false;
        }
        bp ar = bpVar.ar(z);
        ar.as(ag, i2);
        return ar;
    }

    public bp bf(bp bpVar, int i, dp dpVar, int i2) {
        int i3 = this.ai[i];
        ba ag = ep.ag(i3 >> 16, -1153354797);
        int i4 = i3 & SupportMenu.USER_MASK;
        if (ag == null) {
            return dpVar.ai(bpVar, i2, -523243041);
        }
        i3 = dpVar.ai[i2];
        ba ag2 = ep.ag(i3 >> 16, -1616243288);
        int i5 = i3 & SupportMenu.USER_MASK;
        bp aq;
        if (ag2 == null) {
            aq = bpVar.aq(ag.aq(i4, 952792904) ^ 1);
            aq.as(ag, i4);
            return aq;
        }
        aq = bpVar.aq((!ag.aq(i4, 952792904) ? 1 : 0) & (ag2.aq(i5, 952792904) ^ 1));
        aq.ag(ag, i4, ag2, i5, this.ag);
        return aq;
    }

    public bp bi(bp bpVar, int i) {
        int i2 = true;
        int i3 = this.ai[i];
        ba ag = ep.ag(i3 >> 16, -1848402331);
        int i4 = i3 & SupportMenu.USER_MASK;
        if (ag == null) {
            return bpVar.aq(true);
        }
        ba baVar;
        int i5;
        if (this.ae == null || i >= this.ae.length) {
            baVar = null;
            i5 = 0;
        } else {
            int i6 = this.ae[i];
            i5 = i6 & SupportMenu.USER_MASK;
            baVar = ep.ag(i6 >> 16, -1855564743);
        }
        bp aq;
        if (baVar == null || 1917644917 == i5) {
            boolean z;
            if (ag.aq(i4, 952792904)) {
                z = false;
            }
            aq = bpVar.aq(z);
            aq.as(ag, i4);
            return aq;
        }
        i3 = !ag.aq(i4, 952792904) ? 1 : 0;
        if (baVar.aq(i5, 952792904)) {
            i2 = 0;
        }
        aq = bpVar.aq(i3 & i2);
        aq.as(ag, i4);
        aq.as(baVar, i5);
        return aq;
    }

    public bp bk(bp bpVar, int i) {
        int i2 = this.ai[i];
        ba ag = ep.ag(i2 >> 16, -1480279456);
        int i3 = SupportMenu.USER_MASK & i2;
        if (ag == null) {
            return bpVar.aq(true);
        }
        bp aq = bpVar.aq(ag.aq(i3, 952792904) ^ 1);
        aq.as(ag, i3);
        return aq;
    }

    public bp bl(bp bpVar, int i, dp dpVar, int i2) {
        int i3 = 1;
        int i4 = this.ai[i];
        ba ag = ep.ag(i4 >> 16, -1725332589);
        int i5 = 208058817 & i4;
        if (ag == null) {
            return dpVar.ai(bpVar, i2, -1935515688);
        }
        i4 = dpVar.ai[i2];
        ba ag2 = ep.ag(i4 >> 16, -2039984820);
        int i6 = -389661589 & i4;
        bp aq;
        if (ag2 == null) {
            aq = bpVar.aq(ag.aq(i5, 952792904) ^ 1);
            aq.as(ag, i5);
            return aq;
        }
        i4 = !ag.aq(i5, 952792904) ? 1 : 0;
        if (ag2.aq(i6, 952792904)) {
            i3 = 0;
        }
        aq = bpVar.aq(i4 & i3);
        aq.ag(ag, i5, ag2, i6, this.ag);
        return aq;
    }

    public bp bm(bp bpVar, int i) {
        boolean z = true;
        int i2 = this.ai[i];
        ba ag = ep.ag(i2 >> 16, -1262205756);
        i2 &= -1748490163;
        if (ag == null) {
            return bpVar.aq(true);
        }
        if (ag.aq(i2, 952792904)) {
            z = false;
        }
        bp aq = bpVar.aq(z);
        aq.as(ag, i2);
        return aq;
    }

    /* Access modifiers changed, original: 0000 */
    public bp bo(bp bpVar, int i) {
        int i2 = this.ai[i];
        ba ag = ep.ag(i2 >> 16, -1158454895);
        int i3 = SupportMenu.USER_MASK & i2;
        if (ag == null) {
            return bpVar.ar(true);
        }
        bp ar = bpVar.ar(ag.aq(i3, 952792904) ^ 1);
        ar.as(ag, i3);
        return ar;
    }

    /* Access modifiers changed, original: 0000 */
    public bp bq(bp bpVar, int i, int i2) {
        int i3 = this.ai[i];
        ba ag = ep.ag(i3 >> 16, -1427156296);
        int i4 = 1799953618 & i3;
        if (ag == null) {
            return bpVar.aq(true);
        }
        bp aq = bpVar.aq(!ag.aq(i4, 952792904));
        int i5 = i2 & 3;
        if (1 == i5) {
            aq.ax();
        } else if (i5 == 2) {
            aq.az();
        } else if (3 == i5) {
            aq.au();
        }
        aq.as(ag, i4);
        if (i5 == 1) {
            aq.au();
            return aq;
        } else if (i5 == 2) {
            aq.az();
            return aq;
        } else if (i5 != 3) {
            return aq;
        } else {
            aq.ax();
            return aq;
        }
    }

    public bp bs(bp bpVar, int i) {
        boolean z = true;
        int i2 = this.ai[i];
        ba ag = ep.ag(i2 >> 16, -1232418335);
        i2 &= SupportMenu.USER_MASK;
        if (ag == null) {
            return bpVar.aq(true);
        }
        if (ag.aq(i2, 952792904)) {
            z = false;
        }
        bp aq = bpVar.aq(z);
        aq.as(ag, i2);
        return aq;
    }
}
