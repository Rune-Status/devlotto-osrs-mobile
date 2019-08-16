package defpackage;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

/* renamed from: iu */
public class iu implements Callable {
    iu() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iu.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ad(int i) {
        try {
            long ad = gq.ad((byte) -1);
            int i2 = (int) (ad - (fu.ae * 467660746495633531L));
            fu.ae = ad * -1456053658664995149L;
            if (i2 > 200) {
                i2 = 200;
            }
            kk.ai = (i2 * 600499979) + kk.ai;
            if (kk.aw * 1858318389 == 0 && kk.ag * -745028503 == 0 && kk.az * -1006905 == 0 && kk.ak * -89514111 == 0) {
                return true;
            }
            if (kk.aj == null) {
                return false;
            }
            if (kk.ai * 501951651 <= 30000) {
                kx kxVar;
                lj ljVar;
                while (kk.ag * -745028503 < 200 && kk.ak * -89514111 > 0) {
                    kxVar = (kx) kk.am.ar();
                    ljVar = new lj(4);
                    ljVar.al(1, -703796696);
                    ljVar.ai((int) kxVar.gs, 2046986607);
                    kk.aj.ak(ljVar.ar, 0, 4);
                    kk.as.aq(kxVar, kxVar.gs);
                    kk.ak -= 1465262209;
                    kk.ag += 1113197529;
                }
                while (kk.aw * 1858318389 < 200 && kk.az * -1006905 > 0) {
                    try {
                        kxVar = (kx) kk.ap.ar();
                        ljVar = new lj(4);
                        ljVar.al(0, -2091540671);
                        ljVar.ai((int) kxVar.gs, 2000391168);
                        kk.aj.ak(ljVar.ar, 0, 4);
                        kxVar.di();
                        kk.ax.aq(kxVar, kxVar.gs);
                        kk.az -= 916684535;
                        kk.aw += 108405277;
                    } catch (IOException e) {
                        try {
                            kk.aj.ar();
                        } catch (Exception e2) {
                        }
                        kk.ba -= 1722916809;
                        kk.aj = null;
                        return false;
                    }
                }
                int i3 = 0;
                while (i3 < 100) {
                    i2 = kk.aj.aj();
                    if (i2 < 0) {
                        throw new IOException();
                    } else if (i2 == 0) {
                        return true;
                    } else {
                        kk.ai = 0;
                        int i4 = kk.aa == null ? 8 : kk.af * 1763254753 == 0 ? 1 : 0;
                        int i5;
                        byte[] bArr;
                        int i6;
                        lj ljVar2;
                        if (i4 <= 0) {
                            i4 = kk.ah.ar.length - kk.aa.ar;
                            i5 = 512 - (kk.af * 1763254753);
                            if (i5 > i4 - (kk.ah.al * -1631454091)) {
                                i5 = i4 - (kk.ah.al * -1631454091);
                            }
                            if (i5 > i2) {
                                i5 = i2;
                            }
                            kk.aj.ae(kk.ah.ar, kk.ah.al * -1631454091, i5);
                            if (kk.at != (byte) 0) {
                                for (i2 = 0; i2 < i5; i2++) {
                                    bArr = kk.ah.ar;
                                    i6 = (kk.ah.al * -1631454091) + i2;
                                    bArr[i6] = (byte) (bArr[i6] ^ kk.at);
                                }
                            }
                            ljVar2 = kk.ah;
                            ljVar2.al += -879823907 * i5;
                            kk.af += i5 * 857399841;
                            if (kk.ah.al * -1631454091 != i4) {
                                if (512 != kk.af * 1763254753) {
                                    break;
                                }
                                kk.af = 0;
                            } else {
                                if (16711935 == kk.aa.gs) {
                                    cv.ab = kk.ah;
                                    for (i2 = 0; i2 < 256; i2++) {
                                        kv kvVar = kk.av[i2];
                                        if (kvVar != null) {
                                            cv.ab.al = (1551343336 * i2) - 104152239;
                                            kvVar.ea(cv.ab.at((byte) -16), cv.ab.at((byte) -14), -168791378);
                                        }
                                    }
                                } else {
                                    kk.an.reset();
                                    kk.an.update(kk.ah.ar, 0, i4);
                                    if (((int) kk.an.getValue()) != kk.aa.aq * -1756067935) {
                                        try {
                                            kk.aj.ar();
                                        } catch (Exception e3) {
                                        }
                                        kk.bk += 1838471215;
                                        kk.aj = null;
                                        kk.at = (byte) ((int) ((Math.random() * 255.0d) + 1.0d));
                                        return false;
                                    }
                                    kk.bk = 0;
                                    kk.ba = 0;
                                    kk.aa.ad.ek((int) (kk.aa.gs & 65535), kk.ah.ar, (kk.aa.gs & 16711680) == 16711680, ac.ac, (byte) -70);
                                }
                                kk.aa.ky();
                                if (ac.ac) {
                                    kk.ag -= 1113197529;
                                } else {
                                    kk.aw -= 108405277;
                                }
                                kk.af = 0;
                                kk.aa = null;
                                kk.ah = null;
                            }
                        } else {
                            i5 = i4 - (kk.ao.al * -1631454091);
                            if (i5 > i2) {
                                i5 = i2;
                            }
                            kk.aj.ae(kk.ao.ar, kk.ao.al * -1631454091, i5);
                            if (kk.at != (byte) 0) {
                                for (i2 = 0; i2 < i5; i2++) {
                                    bArr = kk.ao.ar;
                                    i6 = (kk.ao.al * -1631454091) + i2;
                                    bArr[i6] = (byte) (bArr[i6] ^ kk.at);
                                }
                            }
                            ljVar2 = kk.ao;
                            ljVar2.al = (i5 * -879823907) + ljVar2.al;
                            if (kk.ao.al * -1631454091 < i4) {
                                return true;
                            }
                            if (kk.aa == null) {
                                kx kxVar2;
                                kk.ao.al = 0;
                                i2 = kk.ao.af(1804771424);
                                i5 = kk.ao.an(-1464407032);
                                i4 = kk.ao.af(1804771424);
                                int at = kk.ao.at((byte) -76);
                                long j = (long) ((i2 << 16) + i5);
                                kxVar = (kx) kk.as.ad(j);
                                ac.ac = true;
                                if (kxVar == null) {
                                    kxVar = (kx) kk.ax.ad(j);
                                    ac.ac = false;
                                    kxVar2 = kxVar;
                                } else {
                                    kxVar2 = kxVar;
                                }
                                if (kxVar2 != null) {
                                    i2 = i4 == 0 ? 5 : 9;
                                    kk.aa = kxVar2;
                                    kk.ah = new lj((i2 + at) + kk.aa.ar);
                                    kk.ah.al(i4, -1589521791);
                                    kk.ah.ae(at, (byte) 68);
                                    kk.af = -1730735864;
                                    kk.ao.al = 0;
                                } else {
                                    throw new IOException();
                                }
                            } else if (kk.af * 1763254753 == 0) {
                                if ((byte) -1 == kk.ao.ar[0]) {
                                    kk.af = 857399841;
                                    kk.ao.al = 0;
                                } else {
                                    kk.aa = null;
                                }
                            }
                        }
                        i3++;
                    }
                }
                return true;
            }
            throw new IOException();
        } catch (RuntimeException e4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iu.ad(");
            stringBuilder.append(')');
            throw mv.aq(e4, stringBuilder.toString());
        }
    }

    static SecureRandom aj() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }

    static SecureRandom al() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }

    static final int ao(int i) {
        try {
            return bu.al * 1111875095;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iu.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static SecureRandom aq() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }

    static SecureRandom ar() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }

    public static int as(CharSequence charSequence, int i) {
        try {
            int i2 = 0;
            for (int i3 = 0; i3 < charSequence.length(); i3++) {
                i2 = ((i2 << 5) - i2) + charSequence.charAt(i3);
            }
            return i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iu.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public Object ae() {
        return gd.ad((byte) 13);
    }

    public Object ai() {
        return gd.ad((byte) 22);
    }

    public Object am() {
        return gd.ad((byte) 17);
    }

    public Object call() {
        try {
            return gd.ad((byte) 25);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iu.call(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
