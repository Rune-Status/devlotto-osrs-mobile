package defpackage;

/* renamed from: dd */
public final class dd {
    static final int aj = 37748736;
    public static final int ao = 66;
    static jp as = null;
    static final int jx = 4;
    int ad;
    int al;
    int aq;
    int ar;
    final /* synthetic */ cw this$0;

    dd(cw cwVar) {
        try {
            this.this$0 = cwVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dd.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ad(kh khVar, kh khVar2, int i) {
        int i2 = 0;
        try {
            dy.ad = khVar2;
            if (!khVar.am(1631873133)) {
                return false;
            }
            dy.ar = khVar.ax(35, (byte) 23) * 1866360171;
            dy.aq = new dy[(dy.ar * -494231741)];
            while (i2 < dy.ar * -494231741) {
                byte[] ar = khVar.ar(35, i2, 998681081);
                dy.aq[i2] = new dy(i2);
                if (ar != null) {
                    dy.aq[i2].ar(new lj(ar), -229292486);
                    dy.aq[i2].aj(-2093492928);
                }
                i2++;
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dd.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ag(int i, int i2, int i3, int i4, int i5, int i6, bc bcVar, gs gsVar, int i7) {
        try {
            if (!client.as || (in.aq[0][i2][i3] & 2) != 0 || (in.aq[i][i2][i3] & 16) == 0) {
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                if (i < in.ar * 474821241) {
                    in.ar = 1544460233 * i;
                }
                dx aq = aj.aq(i4, -904020347);
                if (1 == i5 || i5 == 3) {
                    i8 = aq.ac * -506944577;
                    i9 = aq.aa * -814811101;
                } else {
                    i8 = aq.aa * -814811101;
                    i9 = aq.ac * -506944577;
                }
                if (i9 + i2 <= 104) {
                    i10 = ((i9 + 1) >> 1) + i2;
                    i11 = (i9 >> 1) + i2;
                } else {
                    i10 = i2 + 1;
                    i11 = i2;
                }
                if (i3 + i8 <= 104) {
                    i12 = (i8 >> 1) + i3;
                    i13 = ((i8 + 1) >> 1) + i3;
                } else {
                    i13 = i3 + 1;
                    i12 = i3;
                }
                int[][] iArr = in.ad[i];
                int i14 = (iArr[i10][i13] + ((iArr[i10][i12] + iArr[i11][i12]) + iArr[i11][i13])) >> 2;
                int i15 = (i2 << 7) + (i9 << 6);
                int i16 = (i8 << 6) + (i3 << 7);
                long az = ip.az(i2, i3, 2, aq.af * -541605539 == 0, i4, -981388651);
                int i17 = (i5 << 6) + i6;
                if (1 == aq.bu * 980388571) {
                    i17 += 256;
                }
                if (aq.aw((byte) -54)) {
                    gs.al(i, i2, i3, aq, i5, 329903697);
                }
                br am;
                int[] iArr2;
                br am2;
                br hnVar;
                br am3;
                long bk;
                if (22 == i6) {
                    if (!client.as || aq.af * -541605539 != 0 || 1 == aq.ao * -1334322195 || aq.bg) {
                        br am4 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.am(22, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 22, i5, i, i2, i3, aq.av * 198827039, true, null);
                        bcVar.ae(i, i2, i3, i14, am4, az, i17);
                        if (aq.ao * -1334322195 == 1 && gsVar != null) {
                            gsVar.aj(i2, i3, -35313037);
                        }
                    }
                } else if (10 == i6 || i6 == 11) {
                    int i18;
                    am = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(10, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 10, i5, i, i2, i3, aq.av * 198827039, true, null);
                    if (am != null) {
                        if (bcVar.ag(i, i2, i3, i14, i9, i8, am, 11 == i6 ? 256 : 0, az, i17) && aq.bo) {
                            byte b = (byte) 15;
                            if (am instanceof bp) {
                                b = ((bp) am).am() / 4;
                                if (b > (byte) 30) {
                                    b = (byte) 30;
                                }
                            }
                            for (i12 = 0; i12 <= i9; i12++) {
                                for (i10 = 0; i10 <= i8; i10++) {
                                    i18 = i12 + i2;
                                    int i19 = i10 + i3;
                                    if (b > in.am[i][i18][i19]) {
                                        in.am[i][i18][i19] = (byte) b;
                                    }
                                }
                            }
                            i18 = i8;
                            if (aq.ao * -1334322195 != 0 && gsVar != null) {
                                gsVar.ar(i2, i3, i9, i18, aq.ah, 1558333618);
                                return;
                            }
                        }
                    }
                    i18 = i8;
                    if (aq.ao * -1334322195 != 0) {
                    }
                } else if (i6 >= 12) {
                    am = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(i6, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, i6, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.ag(i, i2, i3, i14, 1, 1, am, 0, az, i17);
                    if (i6 >= 12 && i6 <= 17 && i6 != 13 && i > 0) {
                        iArr2 = hj.ax[i][i2];
                        iArr2[i3] = iArr2[i3] | 2340;
                    }
                    if (aq.ao * -1334322195 != 0 && gsVar != null) {
                        gsVar.ar(i2, i3, i9, i8, aq.ah, 2085822182);
                    }
                } else if (i6 == 0) {
                    am2 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.am(0, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 0, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.ak(i, i2, i3, i14, am2, null, in.ao[i5], 0, az, i17);
                    if (i5 == 0) {
                        if (aq.bo) {
                            in.am[i][i2][i3] = (byte) 50;
                            in.am[i][i2][i3 + 1] = (byte) 50;
                        }
                        if (aq.ab) {
                            iArr2 = hj.ax[i][i2];
                            iArr2[i3] = iArr2[i3] | 585;
                        }
                    } else if (i5 == 1) {
                        if (aq.bo) {
                            i12 = i3 + 1;
                            in.am[i][i2][i12] = (byte) 50;
                            in.am[i][i2 + 1][i12] = (byte) 50;
                        }
                        if (aq.ab) {
                            iArr2 = hj.ax[i][i2];
                            i12 = i3 + 1;
                            iArr2[i12] = iArr2[i12] | 1170;
                        }
                    } else if (2 == i5) {
                        if (aq.bo) {
                            i12 = i2 + 1;
                            in.am[i][i12][i3] = (byte) 50;
                            in.am[i][i12][i3 + 1] = (byte) 50;
                        }
                        if (aq.ab) {
                            iArr2 = hj.ax[i][i2 + 1];
                            iArr2[i3] = iArr2[i3] | 585;
                        }
                    } else if (3 == i5) {
                        if (aq.bo) {
                            in.am[i][i2][i3] = (byte) 50;
                            in.am[i][i2 + 1][i3] = (byte) 50;
                        }
                        if (aq.ab) {
                            iArr2 = hj.ax[i][i2];
                            iArr2[i3] = iArr2[i3] | 1170;
                        }
                    }
                    if (!(aq.ao * -1334322195 == 0 || gsVar == null)) {
                        gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                    }
                    if (aq.at * -664024581 != 16) {
                        bcVar.ac(i, i2, i3, aq.at * -664024581);
                    }
                } else if (i6 == 1) {
                    am2 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(1, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 1, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.ak(i, i2, i3, i14, am2, null, in.ah[i5], 0, az, i17);
                    if (aq.bo) {
                        if (i5 == 0) {
                            in.am[i][i2][i3 + 1] = (byte) 50;
                        } else if (1 == i5) {
                            in.am[i][i2 + 1][i3 + 1] = (byte) 50;
                        } else if (i5 == 2) {
                            in.am[i][i2 + 1][i3] = (byte) 50;
                        } else if (3 == i5) {
                            in.am[i][i2][i3] = (byte) 50;
                        }
                    }
                    if (aq.ao * -1334322195 != 0 && gsVar != null) {
                        gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                    }
                } else if (i6 == 2) {
                    br am5;
                    int i20 = (i5 + 1) & 3;
                    if (-1 == aq.av * 198827039 && aq.bw == null) {
                        am = aq.am(2, i5 + 4, iArr, i15, i14, i16, (byte) 8);
                        am5 = aq.am(2, i20, iArr, i15, i14, i16, (byte) 8);
                        am2 = am;
                    } else {
                        hnVar = new hn(i4, 2, i5 + 4, i, i2, i3, aq.av * 198827039, true, null);
                        am5 = new hn(i4, 2, i20, i, i2, i3, aq.av * 198827039, true, null);
                        am2 = hnVar;
                    }
                    bcVar.ak(i, i2, i3, i14, am2, am5, in.ao[i5], in.ao[i20], az, i17);
                    if (aq.ab) {
                        if (i5 == 0) {
                            iArr2 = hj.ax[i][i2];
                            iArr2[i3] = iArr2[i3] | 585;
                            iArr2 = hj.ax[i][i2];
                            i12 = i3 + 1;
                            iArr2[i12] = iArr2[i12] | 1170;
                        } else if (1 == i5) {
                            iArr2 = hj.ax[i][i2];
                            i12 = i3 + 1;
                            iArr2[i12] = iArr2[i12] | 1170;
                            iArr2 = hj.ax[i][i2 + 1];
                            iArr2[i3] = iArr2[i3] | 585;
                        } else if (2 == i5) {
                            iArr2 = hj.ax[i][i2 + 1];
                            iArr2[i3] = iArr2[i3] | 585;
                            iArr2 = hj.ax[i][i2];
                            iArr2[i3] = iArr2[i3] | 1170;
                        } else if (i5 == 3) {
                            iArr2 = hj.ax[i][i2];
                            iArr2[i3] = iArr2[i3] | 1170;
                            iArr2 = hj.ax[i][i2];
                            iArr2[i3] = iArr2[i3] | 585;
                        }
                    }
                    if (!(aq.ao * -1334322195 == 0 || gsVar == null)) {
                        gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                    }
                    if (aq.at * -664024581 != 16) {
                        bcVar.ac(i, i2, i3, aq.at * -664024581);
                    }
                } else if (i6 == 3) {
                    am2 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(3, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 3, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.ak(i, i2, i3, i14, am2, null, in.ah[i5], 0, az, i17);
                    if (aq.bo) {
                        if (i5 == 0) {
                            in.am[i][i2][i3 + 1] = (byte) 50;
                        } else if (i5 == 1) {
                            in.am[i][i2 + 1][i3 + 1] = (byte) 50;
                        } else if (i5 == 2) {
                            in.am[i][i2 + 1][i3] = (byte) 50;
                        } else if (3 == i5) {
                            in.am[i][i2][i3] = (byte) 50;
                        }
                    }
                    if (aq.ao * -1334322195 != 0 && gsVar != null) {
                        gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                    }
                } else if (i6 == 9) {
                    am = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(i6, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, i6, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.ag(i, i2, i3, i14, 1, 1, am, 0, az, i17);
                    if (!(aq.ao * -1334322195 == 0 || gsVar == null)) {
                        gsVar.ar(i2, i3, i9, i8, aq.ah, 1488978115);
                    }
                    if (aq.at * -664024581 != 16) {
                        bcVar.ac(i, i2, i3, aq.at * -664024581);
                    }
                } else if (4 == i6) {
                    am3 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.am(4, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 4, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.as(i, i2, i3, i14, am3, null, in.ao[i5], 0, 0, 0, az, i17);
                } else if (i6 == 5) {
                    bk = bcVar.bk(i, i2, i3);
                    i8 = bk != 0 ? aj.aq(lr.au(bk), -966199496).at * -664024581 : 16;
                    am3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(4, i5, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 4, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.as(i, i2, i3, i14, am3, null, in.ao[i5], 0, i8 * in.af[i5], i8 * in.ay[i5], az, i17);
                } else if (i6 == 6) {
                    bk = bcVar.bk(i, i2, i3);
                    i8 = bk != 0 ? (aj.aq(lr.au(bk), 59396406).at * -664024581) / 2 : 8;
                    am3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(4, i5 + 4, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 4, i5 + 4, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.as(i, i2, i3, i14, am3, null, 256, i5, in.an[i5] * i8, in.ab[i5] * i8, az, i17);
                } else if (7 == i6) {
                    int i21 = (i5 + 2) & 3;
                    am3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(4, i21 + 4, iArr, i15, i14, i16, (byte) 8) : new hn(i4, 4, i21 + 4, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.as(i, i2, i3, i14, am3, null, 256, i21, 0, 0, az, i17);
                } else if (i6 == 8) {
                    br am6;
                    bk = bcVar.bk(i, i2, i3);
                    int i22 = 0 != bk ? (aj.aq(lr.au(bk), -851732834).at * -664024581) / 2 : 8;
                    i9 = (i5 + 2) & 3;
                    if (-1 == aq.av * 198827039 && aq.bw == null) {
                        am3 = aq.am(4, i5 + 4, iArr, i15, i14, i16, (byte) 8);
                        am6 = aq.am(4, i9 + 4, iArr, i15, i14, i16, (byte) 8);
                    } else {
                        hnVar = new hn(i4, 4, i5 + 4, i, i2, i3, aq.av * 198827039, true, null);
                        am6 = new hn(i4, 4, i9 + 4, i, i2, i3, aq.av * 198827039, true, null);
                        am3 = hnVar;
                    }
                    bcVar.as(i, i2, i3, i14, am3, am6, 256, i5, in.an[i5] * i22, i22 * in.ab[i5], az, i17);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dd.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dz aq(int i, int i2) {
        try {
            long j = (long) i;
            dz dzVar = (dz) dz.ar.ad(j);
            if (dzVar == null) {
                byte[] ar = oc.ad.ar(13, i, 2050825560);
                dzVar = new dz();
                dzVar.aj = 784557271 * i;
                if (ar != null) {
                    dzVar.ar(new lj(ar), (byte) -17);
                }
                dz.ar.ar(dzVar, j);
            }
            return dzVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dd.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
