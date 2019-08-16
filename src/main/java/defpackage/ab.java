package defpackage;

/* renamed from: ab */
public final class ab {
    @Deprecated
    public static final int au = 15;
    static int[] az = null;
    public static final int bg = 41;
    static int dr;
    int ad;
    long ae;
    br ai;
    br aj;
    br al;
    int am;
    int aq;
    int ar;

    ab() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ab.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ar(int i, int i2) {
        try {
            return i >= gh.af.ab * -179691827 && i <= gh.ay.ab * -179691827;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ab.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void as(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, bc bcVar, gs[] gsVarArr, int i8) {
        try {
            lj ljVar = new lj(bArr);
            int i9 = -1;
            while (true) {
                int bf = ljVar.bf((byte) -77);
                if (bf != 0) {
                    int i10 = i9 + bf;
                    i9 = 0;
                    while (true) {
                        bf = ljVar.bl(2131034147);
                        if (bf == 0) {
                            break;
                        }
                        int i11 = i9 + (bf - 1);
                        bf = i11 & 63;
                        i9 = (i11 >> 6) & 63;
                        int af = ljVar.af(1804771424);
                        int i12 = af & 3;
                        if ((i11 >> 12) == i4 && i9 >= i5 && i9 < i5 + 8 && bf >= i6 && bf < i6 + 8) {
                            dx aq = aj.aq(i10, 355162714);
                            i9 &= 7;
                            bf &= 7;
                            int ar = i2 + ij.ar(i9, bf, i7, -506944577 * aq.ac, -814811101 * aq.aa, i12, 671848770);
                            int al = i3 + lt.al(i9, bf, i7, -506944577 * aq.ac, -814811101 * aq.aa, i12, 2032989548);
                            if (ar > 0 && al > 0 && ar < 103 && al < 103) {
                                i9 = 2 == (in.aq[1][ar][al] & 2) ? i - 1 : i;
                                dd.ag(i, ar, al, i10, (i7 + i12) & 3, af >> 2, bcVar, i9 >= 0 ? gsVarArr[i9] : null, 1618559504);
                                i9 = i11;
                            }
                        }
                        i9 = i11;
                    }
                    i9 = i10;
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ab.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ay(byte[] bArr, int i) {
        try {
            int i2;
            lj ljVar = new lj(bArr);
            ljVar.al = (bArr.length - 2) * -879823907;
            fq.ad = ljVar.an(-1464407032) * 1359789851;
            fq.al = new int[(fq.ad * 268010259)];
            fq.aj = new int[(fq.ad * 268010259)];
            dv.ai = new int[(fq.ad * 268010259)];
            fq.ae = new int[(fq.ad * 268010259)];
            eh.ak = new byte[(fq.ad * 268010259)][];
            ljVar.al = ((bArr.length - 7) - (fq.ad * 2144082072)) * -879823907;
            fq.aq = ljVar.an(-1464407032) * 669342557;
            fq.ar = ljVar.an(-1464407032) * 2038805949;
            int af = (ljVar.af(1804771424) & 255) + 1;
            for (i2 = 0; i2 < fq.ad * 268010259; i2++) {
                fq.al[i2] = ljVar.an(-1464407032);
            }
            for (i2 = 0; i2 < fq.ad * 268010259; i2++) {
                fq.aj[i2] = ljVar.an(-1464407032);
            }
            for (i2 = 0; i2 < fq.ad * 268010259; i2++) {
                dv.ai[i2] = ljVar.an(-1464407032);
            }
            for (i2 = 0; i2 < fq.ad * 268010259; i2++) {
                fq.ae[i2] = ljVar.an(-1464407032);
            }
            ljVar.al = (((bArr.length - 7) - (fq.ad * 2144082072)) - ((af - 1) * 3)) * -879823907;
            fq.am = new int[af];
            for (i2 = 1; i2 < af; i2++) {
                fq.am[i2] = ljVar.av((byte) 6);
                if (fq.am[i2] == 0) {
                    fq.am[i2] = 1;
                }
            }
            ljVar.al = 0;
            for (int i3 = 0; i3 < fq.ad * 268010259; i3++) {
                int i4 = dv.ai[i3];
                int i5 = fq.ae[i3];
                af = i5 * i4;
                byte[] bArr2 = new byte[af];
                eh.ak[i3] = bArr2;
                i2 = ljVar.af(1804771424);
                if (i2 == 0) {
                    for (i2 = 0; i2 < af; i2++) {
                        bArr2[i2] = ljVar.ay(2133458976);
                    }
                } else if (1 == i2) {
                    for (af = 0; af < i4; af++) {
                        for (i2 = 0; i2 < i5; i2++) {
                            bArr2[(i4 * i2) + af] = ljVar.ay(-1075931299);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ab.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void br(int i, byte b) {
        try {
            hm.cu = -1520097142;
            hm.cs = 2090691123 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ab.br(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
