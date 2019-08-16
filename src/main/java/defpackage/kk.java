package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;

/* renamed from: kk */
public class kk {
    static kx aa = null;
    static final int ad = 4096;
    static final int ae = 256;
    static int af = 0;
    static int ag = 0;
    static lj ah = null;
    static int ai = 0;
    static mk aj = null;
    static int ak = 0;
    static ok am = new ok(4096);
    static CRC32 an = new CRC32();
    static lj ao = new lj(8);
    static fv ap = new fv();
    static final int aq = 32;
    static final int ar = 256;
    static ok as = new ok(32);
    static byte at = (byte) 0;
    static ok au = new ok(4096);
    static kv[] av = new kv[256];
    static int aw = 0;
    static ok ax = new ok(4096);
    static int az = 0;
    public static int ba = 0;
    public static int bk = 0;

    kk() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kk.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aa(kv kvVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((kx) am.ad(j)) == null && ((kx) as.ad(j)) == null) {
            kx kxVar = (kx) au.ad(j);
            if (kxVar != null) {
                if (z) {
                    kxVar.di();
                    am.aq(kxVar, j);
                    az -= 916684535;
                    ak += 1465262209;
                }
            } else if (z || ((kx) ax.ad(j)) == null) {
                kxVar = new kx();
                kxVar.ad = kvVar;
                kxVar.aq = 188947553 * i3;
                kxVar.ar = b;
                if (z) {
                    am.aq(kxVar, j);
                    ak += 1465262209;
                    return;
                }
                ap.ad(kxVar);
                au.aq(kxVar, j);
                az += 916684535;
            }
        }
    }

    static int ab(int i, int i2) {
        return (aa == null || aa.gs != ((long) ((i << 16) + i2))) ? 0 : ((ah.al * 1694802239) / (ah.ar.length - aa.ar)) + 1;
    }

    static void ac(kv kvVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((kx) am.ad(j)) == null && ((kx) as.ad(j)) == null) {
            kx kxVar = (kx) au.ad(j);
            if (kxVar != null) {
                if (z) {
                    kxVar.di();
                    am.aq(kxVar, j);
                    az -= 916684535;
                    ak += 1465262209;
                }
            } else if (z || ((kx) ax.ad(j)) == null) {
                kxVar = new kx();
                kxVar.ad = kvVar;
                kxVar.aq = 188947553 * i3;
                kxVar.ar = b;
                if (z) {
                    am.aq(kxVar, j);
                    ak += 1465262209;
                    return;
                }
                ap.ad(kxVar);
                au.aq(kxVar, j);
                az += 916684535;
            }
        }
    }

    static void af(int i, int i2) {
        kx kxVar = (kx) au.ad((long) ((i << 16) + i2));
        if (kxVar != null) {
            ap.aq(kxVar);
        }
    }

    public static boolean ag() {
        long ad = gq.ad((byte) -72);
        int i = (int) (ad - (fu.ae * 467660746495633531L));
        fu.ae = ad * -1456053658664995149L;
        if (i > -1285903177) {
            i = -1289010500;
        }
        ai = (i * -1489688052) + ai;
        if (aw * 1534079784 == 0 && ag * -745028503 == 0 && az * -1006905 == 0 && ak * -89514111 == 0) {
            return true;
        }
        if (aj == null) {
            return false;
        }
        if (ai * 620940134 <= 1974129523) {
            kx kxVar;
            lj ljVar;
            while (ag * -2036459178 < 200 && ak * -89514111 > 0) {
                kxVar = (kx) am.ar();
                ljVar = new lj(4);
                ljVar.al(1, -1529017886);
                ljVar.ai((int) kxVar.gs, 1971396096);
                aj.ak(ljVar.ar, 0, 4);
                as.aq(kxVar, kxVar.gs);
                ak += 1735123585;
                ag += 1147622598;
            }
            while (aw * 1858318389 < -277324062 && az * -1990868786 > 0) {
                try {
                    kxVar = (kx) ap.ar();
                    ljVar = new lj(4);
                    ljVar.al(0, -704783671);
                    ljVar.ai((int) kxVar.gs, 2005953485);
                    aj.ak(ljVar.ar, 0, 4);
                    kxVar.di();
                    ax.aq(kxVar, kxVar.gs);
                    az -= 916684535;
                    aw += 1169431200;
                } catch (IOException e) {
                    try {
                        aj.ar();
                    } catch (Exception e2) {
                    }
                    ba += 2091164463;
                    aj = null;
                    return false;
                }
            }
            int i2 = 0;
            while (i2 < 100) {
                i = aj.aj();
                if (i < 0) {
                    throw new IOException();
                } else if (i == 0) {
                    return true;
                } else {
                    ai = 0;
                    int i3 = aa == null ? 8 : af * -1493206193 == 0 ? 1 : 0;
                    int i4;
                    byte[] bArr;
                    int i5;
                    lj ljVar2;
                    if (i3 <= 0) {
                        i3 = ah.ar.length - aa.ar;
                        i4 = -1133626003 - (af * 1763254753);
                        if (i4 > i3 - (ah.al * -1631454091)) {
                            i4 = i3 - (ah.al * -1631454091);
                        }
                        if (i4 > i) {
                            i4 = i;
                        }
                        aj.ae(ah.ar, ah.al * 1009183353, i4);
                        if (at != (byte) 0) {
                            for (i = 0; i < i4; i++) {
                                bArr = ah.ar;
                                i5 = (ah.al * -1631454091) + i;
                                bArr[i5] = (byte) (bArr[i5] ^ at);
                            }
                        }
                        ljVar2 = ah;
                        ljVar2.al += -1436428807 * i4;
                        af += i4 * 162817840;
                        if (ah.al * -1631454091 != i3) {
                            if (-1344842460 != af * 1763254753) {
                                break;
                            }
                            af = 0;
                        } else {
                            if (16711935 == aa.gs) {
                                cv.ab = ah;
                                for (i = 0; i < 256; i++) {
                                    kv kvVar = av[i];
                                    if (kvVar != null) {
                                        cv.ab.al = (1568751399 * i) - 104152239;
                                        kvVar.ea(cv.ab.at((byte) -119), cv.ab.at((byte) -86), 1932111899);
                                    }
                                }
                            } else {
                                an.reset();
                                an.update(ah.ar, 0, i3);
                                if (((int) an.getValue()) != aa.aq * 819896737) {
                                    try {
                                        aj.ar();
                                    } catch (Exception e3) {
                                    }
                                    bk += 2122135495;
                                    aj = null;
                                    at = (byte) ((int) ((Math.random() * 255.0d) + 1.0d));
                                    return false;
                                }
                                bk = 0;
                                ba = 0;
                                aa.ad.ek((int) (aa.gs & 65535), ah.ar, (aa.gs & 16711680) == 16711680, ac.ac, (byte) 6);
                            }
                            aa.ky();
                            if (ac.ac) {
                                ag -= 611993012;
                            } else {
                                aw += 2068550219;
                            }
                            af = 0;
                            aa = null;
                            ah = null;
                        }
                    } else {
                        i4 = i3 - (ao.al * 602832480);
                        if (i4 > i) {
                            i4 = i;
                        }
                        aj.ae(ao.ar, ao.al * -1631454091, i4);
                        if (at != (byte) 0) {
                            for (i = 0; i < i4; i++) {
                                bArr = ao.ar;
                                i5 = (ao.al * 2047958535) + i;
                                bArr[i5] = (byte) (bArr[i5] ^ at);
                            }
                        }
                        ljVar2 = ao;
                        ljVar2.al = (i4 * -429992036) + ljVar2.al;
                        if (ao.al * -1631454091 < i3) {
                            return true;
                        }
                        if (aa == null) {
                            kx kxVar2;
                            ao.al = 0;
                            i = ao.af(1804771424);
                            i4 = ao.an(-1464407032);
                            i3 = ao.af(1804771424);
                            int at = ao.at((byte) -85);
                            long j = (long) ((i << 16) + i4);
                            kxVar = (kx) as.ad(j);
                            ac.ac = true;
                            if (kxVar == null) {
                                kxVar = (kx) ax.ad(j);
                                ac.ac = false;
                                kxVar2 = kxVar;
                            } else {
                                kxVar2 = kxVar;
                            }
                            if (kxVar2 != null) {
                                i = i3 == 0 ? 5 : 9;
                                aa = kxVar2;
                                ah = new lj((i + at) + aa.ar);
                                ah.al(i3, -1308068653);
                                ah.ae(at, (byte) 35);
                                af = 91736377;
                                ao.al = 0;
                            } else {
                                throw new IOException();
                            }
                        } else if (af * -1668227135 == 0) {
                            if ((byte) -1 == ao.ar[0]) {
                                af = 857399841;
                                ao.al = 0;
                            } else {
                                aa = null;
                            }
                        }
                    }
                    i2++;
                }
            }
            return true;
        }
        throw new IOException();
    }

    static void ah(int i, int i2) {
        kx kxVar = (kx) au.ad((long) ((i << 16) + i2));
        if (kxVar != null) {
            ap.aq(kxVar);
        }
    }

    static int an(int i, int i2) {
        return (aa == null || aa.gs != ((long) ((i << 16) + i2))) ? 0 : ((ah.al * 1694802239) / (ah.ar.length - aa.ar)) + 1;
    }

    static void ao(int i, int i2) {
        kx kxVar = (kx) au.ad((long) ((i << 16) + i2));
        if (kxVar != null) {
            ap.aq(kxVar);
        }
    }

    public static void ap(mk mkVar, boolean z) {
        kx kxVar;
        if (aj != null) {
            try {
                aj.ar();
            } catch (Exception e) {
            }
            aj = null;
        }
        aj = mkVar;
        ia.aq(z, 1831914561);
        ao.al = 0;
        aa = null;
        ah = null;
        af = 0;
        while (true) {
            kxVar = (kx) as.ar();
            if (kxVar == null) {
                break;
            }
            am.aq(kxVar, kxVar.gs);
            ak -= 1031015288;
            ag -= 1364177783;
        }
        while (true) {
            kxVar = (kx) ax.ar();
            if (kxVar == null) {
                break;
            }
            ap.aq(kxVar);
            au.aq(kxVar, kxVar.gs);
            az += 916684535;
            aw -= 108405277;
        }
        if (at != (byte) 0) {
            try {
                lj ljVar = new lj(4);
                ljVar.al(4, -1687402505);
                ljVar.al(at, -17336952);
                ljVar.aj(0, 1245313371);
                aj.ak(ljVar.ar, 0, 4);
            } catch (IOException e2) {
                try {
                    aj.ar();
                } catch (Exception e3) {
                }
                ba -= 1722916809;
                aj = null;
            }
        }
        ai = 0;
        fu.ae = gq.ad((byte) 21) * -1456053658664995149L;
    }

    public static boolean as() {
        long ad = gq.ad((byte) -16);
        int i = (int) (ad - (fu.ae * 467660746495633531L));
        fu.ae = ad * -1456053658664995149L;
        if (i > 200) {
            i = 200;
        }
        ai = (i * 600499979) + ai;
        if (aw * 1858318389 == 0 && ag * -745028503 == 0 && az * -1006905 == 0 && ak * -89514111 == 0) {
            return true;
        }
        if (aj == null) {
            return false;
        }
        if (ai * 501951651 <= 30000) {
            kx kxVar;
            lj ljVar;
            while (ag * -745028503 < 200 && ak * -89514111 > 0) {
                kxVar = (kx) am.ar();
                ljVar = new lj(4);
                ljVar.al(1, -1135351557);
                ljVar.ai((int) kxVar.gs, 2022003437);
                aj.ak(ljVar.ar, 0, 4);
                as.aq(kxVar, kxVar.gs);
                ak -= 1465262209;
                ag += 1113197529;
            }
            while (aw * 1858318389 < 200 && az * -1006905 > 0) {
                try {
                    kxVar = (kx) ap.ar();
                    ljVar = new lj(4);
                    ljVar.al(0, -657513553);
                    ljVar.ai((int) kxVar.gs, 1962963477);
                    aj.ak(ljVar.ar, 0, 4);
                    kxVar.di();
                    ax.aq(kxVar, kxVar.gs);
                    az -= 916684535;
                    aw += 108405277;
                } catch (IOException e) {
                    try {
                        aj.ar();
                    } catch (Exception e2) {
                    }
                    ba -= 1722916809;
                    aj = null;
                    return false;
                }
            }
            int i2 = 0;
            while (i2 < 100) {
                i = aj.aj();
                if (i < 0) {
                    throw new IOException();
                } else if (i == 0) {
                    return true;
                } else {
                    ai = 0;
                    int i3 = aa == null ? 8 : af * 1763254753 == 0 ? 1 : 0;
                    int i4;
                    byte[] bArr;
                    int i5;
                    lj ljVar2;
                    if (i3 <= 0) {
                        i3 = ah.ar.length - aa.ar;
                        i4 = 512 - (af * 1763254753);
                        if (i4 > i3 - (ah.al * -1631454091)) {
                            i4 = i3 - (ah.al * -1631454091);
                        }
                        if (i4 > i) {
                            i4 = i;
                        }
                        aj.ae(ah.ar, ah.al * -1631454091, i4);
                        if (at != (byte) 0) {
                            for (i = 0; i < i4; i++) {
                                bArr = ah.ar;
                                i5 = (ah.al * -1631454091) + i;
                                bArr[i5] = (byte) (bArr[i5] ^ at);
                            }
                        }
                        ljVar2 = ah;
                        ljVar2.al += -879823907 * i4;
                        af += i4 * 857399841;
                        if (ah.al * -1631454091 != i3) {
                            if (512 != af * 1763254753) {
                                break;
                            }
                            af = 0;
                        } else {
                            if (16711935 == aa.gs) {
                                cv.ab = ah;
                                for (i = 0; i < 256; i++) {
                                    kv kvVar = av[i];
                                    if (kvVar != null) {
                                        cv.ab.al = (1551343336 * i) - 104152239;
                                        kvVar.ea(cv.ab.at((byte) -22), cv.ab.at((byte) -87), 1710725006);
                                    }
                                }
                            } else {
                                an.reset();
                                an.update(ah.ar, 0, i3);
                                if (((int) an.getValue()) != aa.aq * -1756067935) {
                                    try {
                                        aj.ar();
                                    } catch (Exception e3) {
                                    }
                                    bk += 1838471215;
                                    aj = null;
                                    at = (byte) ((int) ((Math.random() * 255.0d) + 1.0d));
                                    return false;
                                }
                                bk = 0;
                                ba = 0;
                                aa.ad.ek((int) (aa.gs & 65535), ah.ar, (aa.gs & 16711680) == 16711680, ac.ac, (byte) -52);
                            }
                            aa.ky();
                            if (ac.ac) {
                                ag -= 1113197529;
                            } else {
                                aw -= 108405277;
                            }
                            af = 0;
                            aa = null;
                            ah = null;
                        }
                    } else {
                        i4 = i3 - (ao.al * -1631454091);
                        if (i4 > i) {
                            i4 = i;
                        }
                        aj.ae(ao.ar, ao.al * -1631454091, i4);
                        if (at != (byte) 0) {
                            for (i = 0; i < i4; i++) {
                                bArr = ao.ar;
                                i5 = (ao.al * -1631454091) + i;
                                bArr[i5] = (byte) (bArr[i5] ^ at);
                            }
                        }
                        ljVar2 = ao;
                        ljVar2.al = (i4 * -879823907) + ljVar2.al;
                        if (ao.al * -1631454091 < i3) {
                            return true;
                        }
                        if (aa == null) {
                            kx kxVar2;
                            ao.al = 0;
                            i = ao.af(1804771424);
                            i4 = ao.an(-1464407032);
                            i3 = ao.af(1804771424);
                            int at = ao.at((byte) -6);
                            long j = (long) ((i << 16) + i4);
                            kxVar = (kx) as.ad(j);
                            ac.ac = true;
                            if (kxVar == null) {
                                kxVar = (kx) ax.ad(j);
                                ac.ac = false;
                                kxVar2 = kxVar;
                            } else {
                                kxVar2 = kxVar;
                            }
                            if (kxVar2 != null) {
                                i = i3 == 0 ? 5 : 9;
                                aa = kxVar2;
                                ah = new lj((i + at) + aa.ar);
                                ah.al(i3, -1298201340);
                                ah.ae(at, (byte) 81);
                                af = -1730735864;
                                ao.al = 0;
                            } else {
                                throw new IOException();
                            }
                        } else if (af * 1763254753 == 0) {
                            if ((byte) -1 == ao.ar[0]) {
                                af = 857399841;
                                ao.al = 0;
                            } else {
                                aa = null;
                            }
                        }
                    }
                    i2++;
                }
            }
            return true;
        }
        throw new IOException();
    }

    public static int at(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = ((ag * -745028503) + (ak * -89514111)) + 0;
        }
        return z2 ? i + ((az * -1006905) + (aw * 1858318389)) : i;
    }

    public static void au(mk mkVar, boolean z) {
        kx kxVar;
        if (aj != null) {
            try {
                aj.ar();
            } catch (Exception e) {
            }
            aj = null;
        }
        aj = mkVar;
        ia.aq(z, 1831914561);
        ao.al = 0;
        aa = null;
        ah = null;
        af = 0;
        while (true) {
            kxVar = (kx) as.ar();
            if (kxVar == null) {
                break;
            }
            am.aq(kxVar, kxVar.gs);
            ak += 1165398443;
            ag -= 1395435843;
        }
        while (true) {
            kxVar = (kx) ax.ar();
            if (kxVar == null) {
                break;
            }
            ap.aq(kxVar);
            au.aq(kxVar, kxVar.gs);
            az += 916684535;
            aw += 932349968;
        }
        if (at != (byte) 0) {
            try {
                lj ljVar = new lj(4);
                ljVar.al(4, -2094988938);
                ljVar.al(at, -42291045);
                ljVar.aj(0, 2026270290);
                aj.ak(ljVar.ar, 0, 4);
            } catch (IOException e2) {
                try {
                    aj.ar();
                } catch (Exception e3) {
                }
                ba -= 1282538722;
                aj = null;
            }
        }
        ai = 0;
        fu.ae = gq.ad((byte) -37) * -1456053658664995149L;
    }

    static int av(int i, int i2) {
        return (aa == null || aa.gs != ((long) ((i << 16) + i2))) ? 0 : ((ah.al * 1694802239) / (ah.ar.length - aa.ar)) + 1;
    }

    static void aw(kv kvVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((kx) am.ad(j)) == null && ((kx) as.ad(j)) == null) {
            kx kxVar = (kx) au.ad(j);
            if (kxVar != null) {
                if (z) {
                    kxVar.di();
                    am.aq(kxVar, j);
                    az -= 916684535;
                    ak += 1465262209;
                }
            } else if (z || ((kx) ax.ad(j)) == null) {
                kxVar = new kx();
                kxVar.ad = kvVar;
                kxVar.aq = 188947553 * i3;
                kxVar.ar = b;
                if (z) {
                    am.aq(kxVar, j);
                    ak += 1465262209;
                    return;
                }
                ap.ad(kxVar);
                au.aq(kxVar, j);
                az += 916684535;
            }
        }
    }

    static void ax(kv kvVar, int i) {
        if (cv.ab != null) {
            cv.ab.al = (1551343336 * i) - 431879135;
            kvVar.ea(cv.ab.at((byte) -40), cv.ab.at((byte) -56), 1308860100);
            return;
        }
        cv.aj(null, 1891677728, 255, 0, (byte) 0, true, -1026682638);
        av[i] = kvVar;
    }

    static void ay(int i, int i2) {
        kx kxVar = (kx) au.ad((long) ((i << 16) + i2));
        if (kxVar != null) {
            ap.aq(kxVar);
        }
    }

    static void az(kv kvVar, int i) {
        if (cv.ab != null) {
            cv.ab.al = (1551343336 * i) - 104152239;
            kvVar.ea(cv.ab.at((byte) -117), cv.ab.at((byte) -72), 1459636712);
            return;
        }
        cv.aj(null, 255, 255, 0, (byte) 0, true, -1515555401);
        av[i] = kvVar;
    }

    public static int ba(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = ((ag * -745028503) + (ak * -89514111)) + 0;
        }
        return z2 ? i + ((az * -1006905) + (aw * 1858318389)) : i;
    }

    public static int bk(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = ((ag * -745028503) + (ak * -89514111)) + 0;
        }
        return z2 ? i + ((az * -1006905) + (aw * 1858318389)) : i;
    }

    public static void bm() {
        if (aj != null) {
            aj.ar();
        }
        fu.ae = 0;
        ai = 0;
        am = new ok(4096);
        ak = 0;
        as = new ok(32);
        ag = 0;
        ap = new fv();
        au = new ok(4096);
        az = 0;
        ax = new ok(4096);
        aw = 0;
        ac.ac = false;
        aa = null;
        ao = new lj(8);
        ah = null;
        af = 0;
        cv.ab = null;
        av = new kv[256];
        at = (byte) 0;
        bk = 0;
        ba = 0;
    }

    public static void bs() {
        if (aj != null) {
            aj.ar();
        }
        fu.ae = 0;
        ai = 0;
        am = new ok(4096);
        ak = 0;
        as = new ok(32);
        ag = 0;
        ap = new fv();
        au = new ok(4096);
        az = 0;
        ax = new ok(4096);
        aw = 0;
        ac.ac = false;
        aa = null;
        ao = new lj(8);
        ah = null;
        af = 0;
        cv.ab = null;
        av = new kv[256];
        at = (byte) 0;
        bk = 0;
        ba = 0;
    }

    static void ic(String str, int i) {
        StringBuilder stringBuilder;
        try {
            client.au = str;
            try {
                String acc = client.aq.acc(nr.au.ah, 2147029583);
                String acc2 = client.aq.acc(nr.az.ah, 2128375596);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(acc);
                stringBuilder2.append("settings=");
                stringBuilder2.append(str);
                stringBuilder2.append("; version=1; path=/; domain=");
                stringBuilder2.append(acc2);
                acc = stringBuilder2.toString();
                if (str.length() == 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(acc);
                    stringBuilder.append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0");
                    acc = stringBuilder.toString();
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(acc);
                    stringBuilder.append("; Expires=");
                    stringBuilder.append(cv.ad(gq.ad((byte) -24) + 94608000000L));
                    stringBuilder.append("; Max-Age=");
                    stringBuilder.append(on.ad);
                    acc = stringBuilder.toString();
                }
                client client = client.aq;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("document.cookie=\"");
                stringBuilder2.append(acc);
                stringBuilder2.append("\"");
                ju.ad(client, stringBuilder2.toString(), -662889999);
            } catch (Throwable th) {
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("kk.ic(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
