package defpackage;

/* renamed from: hw */
public class hw extends mp {
    static gz ad = new gz(128, null);
    static final String ap = "Failed to contact server. Please check your Internet connection.";
    static String du;
    static ee gv;
    int ae;
    int ai;
    int aj;
    ot[] ak;
    String[] al;
    int am;
    int[] aq;
    int[] ar;

    hw() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static hw ae(int i) {
        long j = (long) i;
        hw hwVar = (hw) ad.ad(j);
        if (hwVar != null) {
            return hwVar;
        }
        byte[] ar = at.dr.ar(i, 0, 1021731418);
        if (ar == null) {
            return null;
        }
        hwVar = is.al(ar, 2094799765);
        ad.ar(hwVar, j);
        return hwVar;
    }

    /* renamed from: ae */
    static void m223ae(int i) {
        try {
            it.ad.clear();
            it.aq.ar();
            it.ar.ad();
            it.al = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hw.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void af(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i4;
        for (int i13 = -i7; i13 < 0; i13++) {
            int i14 = i2;
            int i15 = -i6;
            while (i15 < 0) {
                int i16 = iArr2[(i14 >> 16) + ((i3 >> 16) * i10)];
                if (i16 != 0) {
                    iArr[i12] = i16;
                }
                i14 += i8;
                i15++;
                i12++;
            }
            i3 += i9;
            i12 += i5;
        }
    }

    static hw ag(int i, int i2) {
        long j = (long) (i << 16);
        hw hwVar = (hw) ad.ad(j);
        if (hwVar != null) {
            return hwVar;
        }
        int af = at.dr.af(String.valueOf(i), -608339520);
        if (af == -1) {
            return null;
        }
        byte[] as = at.dr.as(af, (byte) 0);
        if (as != null) {
            if (as.length <= 1) {
                return null;
            }
            hwVar = is.al(as, -1645487284);
            if (hwVar != null) {
                ad.ar(hwVar, j);
                return hwVar;
            }
        }
        return null;
    }

    static hw ai(int i) {
        long j = (long) i;
        hw hwVar = (hw) ad.ad(j);
        if (hwVar != null) {
            return hwVar;
        }
        byte[] ar = at.dr.ar(i, 0, 1084650552);
        if (ar == null) {
            return null;
        }
        hwVar = is.al(ar, 1015348994);
        ad.ar(hwVar, j);
        return hwVar;
    }

    static hw ak(int i, int i2, int i3) {
        hw ar = ch.ar(dt.ad(i2, i, (byte) 51), i, -783751410);
        if (ar != null) {
            return ar;
        }
        ar = ch.ar(ir.aq(i3, i, (short) 8456), i, -1172579929);
        return ar == null ? null : ar;
    }

    static hw am(int i, int i2, int i3) {
        hw ar = ch.ar(dt.ad(i2, i, (byte) 35), i, 1926095416);
        if (ar != null) {
            return ar;
        }
        ar = ch.ar(ir.aq(i3, i, (short) 17592), i, 1393563507);
        return ar == null ? null : ar;
    }

    static hw ap(int i, int i2) {
        long j = (long) (i << 16);
        hw hwVar = (hw) ad.ad(j);
        if (hwVar != null) {
            return hwVar;
        }
        int af = at.dr.af(String.valueOf(i), -1654582348);
        if (af == -1) {
            return null;
        }
        byte[] as = at.dr.as(af, (byte) 0);
        if (as != null) {
            if (as.length <= 1) {
                return null;
            }
            hwVar = is.al(as, 1892529661);
            if (hwVar != null) {
                ad.ar(hwVar, j);
                return hwVar;
            }
        }
        return null;
    }

    static hw as(int i, int i2, int i3) {
        hw ar = ch.ar(dt.ad(i2, i, (byte) 107), i, 981767546);
        if (ar != null) {
            return ar;
        }
        ar = ch.ar(ir.aq(i3, i, (short) 22961), i, -1183369935);
        return ar == null ? null : ar;
    }

    static hw au(byte[] bArr) {
        int i;
        hw hwVar = new hw();
        lj ljVar = new lj(bArr);
        ljVar.al = (ljVar.ar.length - 2) * -879823907;
        int length = ((ljVar.ar.length - 2) - ljVar.an(-1464407032)) - 12;
        ljVar.al = -325216980 * length;
        int at = ljVar.at((byte) -5);
        hwVar.aj = ljVar.an(-1464407032) * -34584879;
        hwVar.ai = ljVar.an(-1464407032) * 566655912;
        hwVar.ae = ljVar.an(-1464407032) * 982808713;
        hwVar.am = ljVar.an(-1464407032) * -118480267;
        int af = ljVar.af(1804771424);
        if (af > 0) {
            hwVar.ak = hwVar.aj(af, -1716112248);
            for (int i2 = 0; i2 < af; i2++) {
                int an = ljVar.an(-1464407032);
                ot otVar = new ot(an > 0 ? la.ar(an, 1506325928) : 1);
                hwVar.ak[i2] = otVar;
                for (i = an; i > 0; i--) {
                    otVar.aq(new ms(ljVar.at((byte) -8)), (long) ljVar.at((byte) -26));
                }
            }
        }
        ljVar.al = 0;
        ljVar.bs(-1406432815);
        hwVar.aq = new int[at];
        hwVar.ar = new int[at];
        hwVar.al = new String[at];
        i = 0;
        while (ljVar.al * -36227380 < length) {
            int an2 = ljVar.an(-1464407032);
            if (an2 == 3) {
                hwVar.al[i] = ljVar.bm(1074717378);
            } else if (an2 >= 1777406714 || 21 == an2 || an2 == -1983706155 || 453042095 == an2) {
                hwVar.ar[i] = ljVar.af(1804771424);
            } else {
                hwVar.ar[i] = ljVar.at((byte) -2);
            }
            hwVar.aq[i] = an2;
            i++;
        }
        return hwVar;
    }

    static hw az(byte[] bArr) {
        int i;
        hw hwVar = new hw();
        lj ljVar = new lj(bArr);
        ljVar.al = (ljVar.ar.length - 2) * -879823907;
        int length = ((ljVar.ar.length - 2) - ljVar.an(-1464407032)) - 12;
        ljVar.al = -879823907 * length;
        int at = ljVar.at((byte) -113);
        hwVar.aj = ljVar.an(-1464407032) * -34584879;
        hwVar.ai = ljVar.an(-1464407032) * -1093680201;
        hwVar.ae = ljVar.an(-1464407032) * 1874896098;
        hwVar.am = ljVar.an(-1464407032) * -118480267;
        int af = ljVar.af(1804771424);
        if (af > 0) {
            hwVar.ak = hwVar.aj(af, -999539759);
            for (int i2 = 0; i2 < af; i2++) {
                int an = ljVar.an(-1464407032);
                ot otVar = new ot(an > 0 ? la.ar(an, -455990464) : 1);
                hwVar.ak[i2] = otVar;
                for (i = an; i > 0; i--) {
                    otVar.aq(new ms(ljVar.at((byte) -56)), (long) ljVar.at((byte) -96));
                }
            }
        }
        ljVar.al = 0;
        ljVar.bs(-1406432815);
        hwVar.aq = new int[at];
        hwVar.ar = new int[at];
        hwVar.al = new String[at];
        i = 0;
        while (ljVar.al * -1719562137 < length) {
            int an2 = ljVar.an(-1464407032);
            if (an2 == 3) {
                hwVar.al[i] = ljVar.bm(2013360707);
            } else if (an2 >= 505857350 || 21 == an2 || an2 == 38 || 541555654 == an2) {
                hwVar.ar[i] = ljVar.af(1804771424);
            } else {
                hwVar.ar[i] = ljVar.at((byte) -36);
            }
            hwVar.aq[i] = an2;
            i++;
        }
        return hwVar;
    }

    /* Access modifiers changed, original: 0000 */
    public ot[] ac(int i) {
        return new ot[i];
    }

    /* Access modifiers changed, original: 0000 */
    public ot[] aj(int i, int i2) {
        try {
            return new ot[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hw.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ot[] aw(int i) {
        return new ot[i];
    }

    /* Access modifiers changed, original: 0000 */
    public ot[] ax(int i) {
        return new ot[i];
    }
}
