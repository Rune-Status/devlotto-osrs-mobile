package defpackage;

/* renamed from: gl */
public class gl {
    public static final int aa = 65;
    public static final int ae = 31;
    public static final int ai = 29;
    public static final int al = 21;
    public static final int aq = 6;
    public static final int ar = 15;
    public static final int au = 57;

    gl() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gl.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ab(boolean z, byte b) {
        try {
            if (z != if.as) {
                ak.af(1890352362);
                if.as = z;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gl.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int aj(CharSequence charSequence, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5 = i2 - i;
        int i6 = 0;
        while (i6 < i5) {
            try {
                char charAt = charSequence.charAt(i6 + i);
                if ((charAt > 0 && charAt < 128) || (charAt >= 160 && charAt <= 255)) {
                    bArr[i3 + i6] = (byte) charAt;
                } else if (8364 == charAt) {
                    bArr[i3 + i6] = Byte.MIN_VALUE;
                } else if (8218 == charAt) {
                    bArr[i6 + i3] = (byte) -126;
                } else if (402 == charAt) {
                    bArr[i3 + i6] = (byte) -125;
                } else if (8222 == charAt) {
                    bArr[i3 + i6] = (byte) -124;
                } else if (8230 == charAt) {
                    bArr[i6 + i3] = (byte) -123;
                } else if (charAt == 8224) {
                    bArr[i6 + i3] = (byte) -122;
                } else if (charAt == 8225) {
                    bArr[i3 + i6] = (byte) -121;
                } else if (charAt == 710) {
                    bArr[i3 + i6] = (byte) -120;
                } else if (8240 == charAt) {
                    bArr[i3 + i6] = (byte) -119;
                } else if (352 == charAt) {
                    bArr[i3 + i6] = (byte) -118;
                } else if (8249 == charAt) {
                    bArr[i3 + i6] = (byte) -117;
                } else if (338 == charAt) {
                    bArr[i3 + i6] = (byte) -116;
                } else if (381 == charAt) {
                    bArr[i6 + i3] = (byte) -114;
                } else if (charAt == 8216) {
                    bArr[i3 + i6] = (byte) -111;
                } else if (charAt == 8217) {
                    bArr[i3 + i6] = (byte) -110;
                } else if (8220 == charAt) {
                    bArr[i3 + i6] = (byte) -109;
                } else if (8221 == charAt) {
                    bArr[i3 + i6] = (byte) -108;
                } else if (8226 == charAt) {
                    bArr[i6 + i3] = (byte) -107;
                } else if (charAt == 8211) {
                    bArr[i6 + i3] = (byte) -106;
                } else if (8212 == charAt) {
                    bArr[i3 + i6] = (byte) -105;
                } else if (charAt == 732) {
                    bArr[i6 + i3] = (byte) -104;
                } else if (charAt == 8482) {
                    bArr[i6 + i3] = (byte) -103;
                } else if (charAt == 353) {
                    bArr[i3 + i6] = (byte) -102;
                } else if (8250 == charAt) {
                    bArr[i3 + i6] = (byte) -101;
                } else if (charAt == 339) {
                    bArr[i6 + i3] = (byte) -100;
                } else if (382 == charAt) {
                    bArr[i3 + i6] = (byte) -98;
                } else if (charAt == 376) {
                    bArr[i3 + i6] = (byte) -97;
                } else {
                    bArr[i6 + i3] = (byte) 63;
                }
                i6++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("gl.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return i5;
    }

    public static dh aq(int i, int i2) {
        Object obj = null;
        try {
            long j = (long) i;
            dh dhVar = (dh) dh.ap.ad(j);
            if (dhVar == null) {
                byte[] ar = ai.am.ar(10, i, 1827313907);
                dhVar = new dh();
                dhVar.ac = 1005713433 * i;
                if (ar != null) {
                    dhVar.al(new lj(ar), 2050436803);
                }
                dhVar.ar((byte) 16);
                if (-1 != dhVar.bp * 518600683) {
                    dhVar.ai(gl.aq(dhVar.bp * 518600683, 670828484), gl.aq(dhVar.by * 1269103785, -729102658), 1345632632);
                }
                if (-1 != dhVar.ce * -755438885) {
                    dhVar.ae(gl.aq(dhVar.ce * -755438885, 1955684344), gl.aq(dhVar.cb * 871627117, 521973972), (byte) 2);
                }
                if (-1 != dhVar.cc * 335744487) {
                    dhVar.am(gl.aq(dhVar.cc * 335744487, -219454275), gl.aq(dhVar.cy * -1499517591, -1816064064), 597035633);
                }
                if (!if.as && dhVar.bd) {
                    dhVar.ao = go.ad;
                    dhVar.ci = false;
                    dhVar.bo = null;
                    dhVar.bl = null;
                    dhVar.bb = -1802556621;
                    dhVar.cw = 0;
                    if (dhVar.cp != null) {
                        for (mb al = dhVar.cp.al(); al != null; al = dhVar.cp.aj()) {
                            if (dy.aq((int) al.gs, 2139526884).ai) {
                                al.ky();
                            } else {
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            dhVar.cp = null;
                        }
                    }
                }
                dh.ap.ar(dhVar, j);
            }
            return dhVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gl.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static fo aq(int i, byte b) {
        try {
            fo[] ad = er.ad(-1813233184);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= ad.length) {
                    return null;
                }
                fo foVar = ad[i3];
                if (foVar.ai * 421678263 == i) {
                    return foVar;
                }
                i2 = i3 + 1;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gl.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ed(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 >= 1 && i4 >= 1 && i3 <= 102 && i4 <= 102) {
            try {
                if (!client.as || i == am.jy * 1973701849) {
                    int bq;
                    long bk = i2 == 0 ? ce.fk.bk(i, i3, i4) : 0;
                    if (1 == i2) {
                        bk = ce.fk.ba(i, i3, i4);
                    }
                    if (i2 == 2) {
                        bk = ce.fk.bs(i, i3, i4);
                    }
                    if (3 == i2) {
                        bk = ce.fk.bm(i, i3, i4);
                    }
                    if (0 != bk) {
                        bq = ce.fk.bq(i, i3, i4, bk);
                        int au = lr.au(bk);
                        int i9 = (bq >> 6) & 3;
                        if (i2 == 0) {
                            ce.fk.aa(i, i3, i4);
                            dx aq = aj.aq(au, 1628676672);
                            if (aq.ao * -1334322195 != 0) {
                                client.gc[i].ae(i3, i4, bq & 31, i9, aq.ah, 1974856969);
                            }
                        }
                        if (i2 == 1) {
                            ce.fk.ao(i, i3, i4);
                        }
                        if (2 == i2) {
                            ce.fk.ah(i, i3, i4);
                            dx aq2 = aj.aq(au, -1675201801);
                            if ((aq2.ac * -506944577) + i3 <= 103 && (aq2.ac * -506944577) + i4 <= 103 && (aq2.aa * -814811101) + i3 <= 103 && (aq2.aa * -814811101) + i4 <= 103) {
                                if (aq2.ao * -1334322195 != 0) {
                                    client.gc[i].am(i3, i4, aq2.ac * -506944577, aq2.aa * -814811101, i9, aq2.ah, 677256482);
                                }
                            } else {
                                return;
                            }
                        }
                        if (3 == i2) {
                            ce.fk.af(i, i3, i4);
                            if (aj.aq(au, -305492259).ao * -1334322195 == 1) {
                                client.gc[i].as(i3, i4, -1431153507);
                            }
                        }
                    }
                    if (i5 >= 0) {
                        bq = (i >= 3 || (in.aq[1][i3][i4] & 2) != 2) ? i : i + 1;
                        ad.an(i, bq, i3, i4, i5, i6, i7, ce.fk, client.gc[i], -253373888);
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("gl.ed(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }
}
