package defpackage;

/* renamed from: fw */
public class fw {
    static final fw ad = new fw(0);
    static final fw ae = new fw(1);
    static final int af = 1048576;
    static final String ag = "No Internet connection available. Please check your settings.";
    static final fw ai = new fw(5);
    static final fw aj = new fw(8);
    static final fw ak = new fw(6);
    static final fw al = new fw(4);
    static final fw am = new fw(3);
    static final fw aq = new fw(2);
    static final fw ar = new fw(7);
    static long bp = 0;
    static final int br = 6;
    public static int ix;
    final int as;

    fw(int i) {
        try {
            this.as = 1482708175 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean aq(int i, int i2) {
        try {
            return (i >= gh.ad.ab * -179691827 && i <= gh.al.ab * -179691827) || gh.aj.ab * -179691827 == i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fw.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static bn ar(int i) {
        bn bnVar;
        synchronized (fw.class) {
            try {
                if (bn.aq == null) {
                    bn.aq = new bn();
                }
                bnVar = bn.aq;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fw.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            } catch (Throwable th) {
                Class cls = fw.class;
            }
        }
        return bnVar;
    }

    static final void az(hq hqVar, int i) {
        try {
            hqVar.ao = false;
            if (hqVar.aa != null) {
                hqVar.aa.ad = 0;
            }
            hq ai = hqVar.ai();
            while (ai != null) {
                fw.az(ai, 782793986);
                ai = hqVar.ae();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fw.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ba(int i, hw hwVar, boolean z, byte b) {
        StringBuilder stringBuilder;
        int i2 = 0;
        int i3;
        int[] iArr;
        int i4;
        int[] iArr2;
        int[] iArr3;
        int i5;
        int i6;
        if (4000 == i) {
            try {
                ds.am += 1128905694;
                i2 = hl.ae[ds.am * -757592335];
                i3 = hl.ae[(ds.am * -757592335) + 1];
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = i2 + i3;
                return 1;
            } catch (RuntimeException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("fw.ba(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (4001 == i) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 - i3;
            return 1;
        } else if (i == 4002) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 * i3;
            return 1;
        } else if (i == 4003) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 / i3;
            return 1;
        } else if (4004 == i) {
            iArr2 = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (int) (Math.random() * ((double) i2));
            return 1;
        } else if (4005 == i) {
            iArr2 = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i2 = iArr2[i3 * -757592335];
            iArr3 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr3[(i5 * -757592335) - 1] = (int) (Math.random() * ((double) (i2 + 1)));
            return 1;
        } else if (4006 == i) {
            ds.am -= 1472703061;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            i5 = hl.ae[(ds.am * -757592335) + 2];
            i4 = hl.ae[(ds.am * -757592335) + 3];
            i6 = hl.ae[(ds.am * -757592335) + 4];
            int[] iArr4 = hl.ae;
            int i7 = ds.am - 564452847;
            ds.am = i7;
            iArr4[(i7 * -757592335) - 1] = i2 + (((i3 - i2) * (i6 - i5)) / (i4 - i5));
            return 1;
        } else if (4007 == i) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 + ((i3 * i2) / 100);
            return 1;
        } else if (4008 == i) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 | (1 << i3);
            return 1;
        } else if (i == 4009) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 & (-1 - (1 << i3));
            return 1;
        } else if (i == 4010) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i5 = hl.ae[(ds.am * -757592335) + 1];
            int[] iArr5 = hl.ae;
            i6 = ds.am - 564452847;
            ds.am = i6;
            if ((i3 & (1 << i5)) != 0) {
                i2 = 1;
            }
            iArr5[(i6 * -757592335) - 1] = i2;
            return 1;
        } else if (i == 4011) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 % i3;
            return 1;
        } else if (4012 == i) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i5 = hl.ae[(ds.am * -757592335) + 1];
            if (i3 == 0) {
                iArr3 = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = 0;
                return 1;
            }
            iArr2 = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = (int) Math.pow((double) i3, (double) i5);
            return 1;
        } else if (i == 4013) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i5 = hl.ae[(ds.am * -757592335) + 1];
            if (i3 == 0) {
                iArr3 = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = 0;
                return 1;
            }
            switch (i5) {
                case 0:
                    iArr2 = hl.ae;
                    i3 = ds.am - 564452847;
                    ds.am = i3;
                    iArr2[(i3 * -757592335) - 1] = Integer.MAX_VALUE;
                    return 1;
                case 1:
                    iArr2 = hl.ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = i3;
                    return 1;
                case 2:
                    iArr2 = hl.ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.sqrt((double) i3);
                    return 1;
                case 3:
                    iArr2 = hl.ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.cbrt((double) i3);
                    return 1;
                case 4:
                    iArr2 = hl.ae;
                    i5 = ds.am - 564452847;
                    ds.am = i5;
                    iArr2[(i5 * -757592335) - 1] = (int) Math.sqrt(Math.sqrt((double) i3));
                    return 1;
                default:
                    iArr2 = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = (int) Math.pow((double) i3, 1.0d / ((double) i5));
                    return 1;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("fw.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        } else if (4014 == i) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 & i3;
            return 1;
        } else if (i == 4015) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i3 = hl.ae[(ds.am * -757592335) + 1];
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = i2 | i3;
            return 1;
        } else if (4018 != i) {
            return 2;
        } else {
            ds.am += 1693358541;
            long j = (long) hl.ae[ds.am * -757592335];
            long j2 = (long) hl.ae[(ds.am * -757592335) + 1];
            long j3 = (long) hl.ae[(ds.am * -757592335) + 2];
            iArr2 = hl.ae;
            int i8 = ds.am - 564452847;
            ds.am = i8;
            iArr2[(i8 * -757592335) - 1] = (int) ((j * j3) / j2);
            return 1;
        }
    }

    static final int db(int i) {
        try {
            if (dc.rx.ar) {
                return am.jy * 1973701849;
            }
            int i2 = 3;
            if (ay.hr * 1914902541 < 310) {
                int i3;
                int i4;
                if (client.ha * -1897849765 == 1) {
                    i3 = (cl.hs * 1983928325) >> 7;
                    i4 = (eo.hv * 1897176415) >> 7;
                } else {
                    i3 = (da.jc.bd * -1690563339) >> 7;
                    i4 = (da.jc.bq * -1444273727) >> 7;
                }
                int i5 = (ep.hp * 1722134867) >> 7;
                int i6 = (cc.hg * -91971475) >> 7;
                if (i5 < 0 || i6 < 0 || i5 >= 104 || i6 >= 104) {
                    return am.jy * 1973701849;
                }
                if (i4 < 0 || i3 < 0 || i4 >= 104 || i3 >= 104) {
                    return am.jy * 1973701849;
                }
                if ((in.aq[am.jy * 1973701849][i5][i6] & 4) != 0) {
                    i2 = am.jy * 1973701849;
                }
                int i7 = i4 > i5 ? i4 - i5 : i5 - i4;
                int i8 = i3 > i6 ? i3 - i6 : i6 - i3;
                int i9 = 32768;
                int i10;
                if (i7 > i8) {
                    i10 = (i8 * 65536) / i7;
                    i8 = i5;
                    i7 = i6;
                    while (i4 != i8) {
                        if (i8 < i4) {
                            i8++;
                        } else if (i8 > i4) {
                            i8--;
                        }
                        if ((in.aq[am.jy * 1973701849][i8][i7] & 4) != 0) {
                            i2 = am.jy * 1973701849;
                        }
                        i9 += i10;
                        if (i9 >= 65536) {
                            i9 -= 65536;
                            if (i7 < i3) {
                                i7++;
                            } else if (i7 > i3) {
                                i7--;
                            }
                            if ((in.aq[am.jy * 1973701849][i8][i7] & 4) != 0) {
                                i2 = am.jy * 1973701849;
                            }
                        }
                    }
                } else if (i8 > 0) {
                    i10 = (i7 * 65536) / i8;
                    i8 = i6;
                    i7 = i5;
                    while (i8 != i3) {
                        if (i8 < i3) {
                            i8++;
                        } else if (i8 > i3) {
                            i8--;
                        }
                        if ((in.aq[am.jy * 1973701849][i7][i8] & 4) != 0) {
                            i2 = am.jy * 1973701849;
                        }
                        i6 = i9 + i10;
                        if (i6 >= 65536) {
                            i6 -= 65536;
                            if (i7 < i4) {
                                i7++;
                            } else if (i7 > i4) {
                                i7--;
                            }
                            if ((in.aq[am.jy * 1973701849][i7][i8] & 4) != 0) {
                                i2 = am.jy * 1973701849;
                                i9 = i6;
                            }
                        }
                        i9 = i6;
                    }
                }
            }
            return (da.jc.bq * -1444273727 < 0 || da.jc.bd * -1690563339 < 0 || da.jc.bq * -1444273727 >= 13312 || da.jc.bd * -1690563339 >= 13312) ? am.jy * 1973701849 : (in.aq[am.jy * 1973701849][(da.jc.bq * -1444273727) >> 7][(da.jc.bd * -1690563339) >> 7] & 4) != 0 ? am.jy * 1973701849 : i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fw.db(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static String ib(String str, byte b) {
        try {
            gc[] aq = df.aq((byte) 0);
            for (gc gcVar : aq) {
                if (gcVar.am * -961938565 != -1 && str.startsWith(lb.ad(gcVar.am * -961938565, -397767113))) {
                    return str.substring(Integer.toString(gcVar.am * -961938565).length() + 6);
                }
            }
            return str;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fw.ib(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
