package defpackage;

import android.support.v4.view.MotionEventCompat;

/* renamed from: be */
public class be extends bl {
    public static final int am = 12;
    static final int ar = 1;
    int[] ad;

    public be(int[] iArr, int i, int i2) {
        try {
            al(iArr, i, i2, (byte) -124);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int aq(int i, int i2, byte b) {
        int i3;
        int i4;
        if (i2 > i) {
            i3 = i2;
            i4 = i;
            if (i4 == 0) {
                i2 = i3 % i4;
                i = i4;
            }
            return i3;
        }
        i3 = i;
        i4 = i2;
        if (i4 == 0) {
            return i3;
        }
        return i3;
    }

    /* Access modifiers changed, original: final */
    public final void ab(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i4;
        int i11 = i2 - i;
        int i12 = i6 - i4;
        int i13 = i3 - i;
        int i14 = i8 - i7;
        int i15 = i9 - i7;
        int i16 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i17 = i != i2 ? (i10 << 14) / i11 : 0;
        int i18 = i != i3 ? (i12 << 14) / i13 : 0;
        int i19 = (i13 * i10) - (i11 * i12);
        if (i19 != 0) {
            int i20 = (((i13 * i14) - (i11 * i15)) << 8) / i19;
            int i21 = (((i10 * i15) - (i12 * i14)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * -910957349) {
                        if (i3 > this.bf * 759869137) {
                            i3 = -756127890 * this.bf;
                        }
                        i19 = i > this.bf * 1611268227 ? -1928280456 * this.bf : i;
                        i22 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i19) {
                            i12 = i5 << 14;
                            if (i2 < 0) {
                                i22 -= i2 * i21;
                                i10 = i12 - (i2 * i16);
                                i23 = i12 - (i17 * i2);
                                i2 = 0;
                            } else {
                                i10 = i12;
                                i23 = i12;
                            }
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i24 -= i3 * i18;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i17 >= i16) && (i3 != i2 || i17 <= i18)) {
                                i25 = i19 - i3;
                                i19 = i3 - i2;
                                i11 = this.bg[i2];
                                while (true) {
                                    i26 = i10;
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2132429787);
                                    i23 += i17;
                                    i10 = i26 + i16;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i19 = i27;
                                }
                                i10 = i25;
                                while (true) {
                                    i25 = i10 - 1;
                                    if (i25 >= 0) {
                                        ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2139670068);
                                        i22 += i21;
                                        i11 += this.ah * 1956907281;
                                        i23 += i17;
                                        i10 = i25;
                                        i24 += i18;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i19 - i3;
                            i19 = i3 - i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2146389902);
                                i23 += i17;
                                i10 = i26 + i16;
                                i22 += i21;
                                i11 += this.ah * -1230114117;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2143580060);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1024341655;
                                    i23 += i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i11 = i5 << 14;
                        if (i2 < 0) {
                            i10 = i11 - (i2 * i17);
                            i23 = i11 - (i16 * i2);
                            i22 -= i2 * i21;
                            i2 = 0;
                        } else {
                            i23 = i11;
                            i10 = i11;
                        }
                        i24 = i4 << 14;
                        if (i19 < 0) {
                            i24 -= i19 * i18;
                            i19 = 0;
                        }
                        if (i17 < i16) {
                            i25 = i3 - i19;
                            i19 -= i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2131847464);
                                i10 = i26 + i17;
                                i23 += i16;
                                i22 += i21;
                                i11 += this.ah * 1286798457;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2133872295);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i3 - i19;
                        i19 -= i2;
                        i11 = this.bg[i2];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2140767653);
                            i10 = i26 + i17;
                            i23 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2143510945);
                                i22 += i21;
                                i11 += this.ah * -909799618;
                                i23 += i16;
                                i10 = i25;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * -1307963749;
                    }
                    i19 = i2 > this.bf * 651738037 ? this.bf * 651738037 : i2;
                    i22 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i19) {
                        i12 = i6 << 14;
                        if (i3 < 0) {
                            i22 -= i3 * i21;
                            i10 = i12 - (i3 * i18);
                            i23 = i12 - (i3 * i16);
                            i3 = 0;
                        } else {
                            i23 = i12;
                            i10 = i12;
                        }
                        i24 = i4 << 14;
                        if (i < 0) {
                            i24 -= i17 * i;
                            i = 0;
                        }
                        if (i16 < i18) {
                            i25 = i19 - i;
                            i19 = i - i3;
                            i11 = this.bg[i3];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2141175575);
                                i23 += i16;
                                i10 = i26 + i18;
                                i22 += i21;
                                i11 += this.ah * -266176763;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2134867358);
                                    i24 += i17;
                                    i22 += i21;
                                    i11 += this.ah * 973614139;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i19 - i;
                        i19 = i - i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2136414381);
                            i23 += i16;
                            i10 = i26 + i18;
                            i22 += i21;
                            i11 += this.ah * 240518378;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2134071966);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i16;
                                i10 = i25;
                                i24 += i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i22 -= i3 * i21;
                        i23 = i12 - (i18 * i3);
                        i10 = i12 - (i3 * i16);
                        i3 = 0;
                    } else {
                        i10 = i12;
                        i23 = i12;
                    }
                    i24 = i5 << 14;
                    if (i19 < 0) {
                        i24 -= i19 * i17;
                        i19 = 0;
                    }
                    if (i16 < i18) {
                        i25 = i - i19;
                        i19 -= i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2134440019);
                            i10 = i26 + i16;
                            i23 += i18;
                            i22 += i21;
                            i11 += this.ah * -729194079;
                            i19 = i27;
                        }
                        while (true) {
                            i25--;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2143870575);
                                i24 += i17;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i - i19;
                    i19 -= i3;
                    i11 = this.bg[i3];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2145635209);
                        i10 = i26 + i16;
                        i23 += i18;
                        i22 += i21;
                        i11 += this.ah * -278636047;
                        i19 = i27;
                    }
                    i10 = i25;
                    while (true) {
                        i25 = i10 - 1;
                        if (i25 >= 0) {
                            ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2142609265);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i18;
                            i10 = i25;
                            i24 += i17;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 439451278) {
                    i2 = -1227092648 * this.bf;
                }
                i19 = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
                i22 = ((i7 << 8) - (i4 * i20)) + i20;
                if (i2 < i19) {
                    i11 = i4 << 14;
                    if (i < 0) {
                        i24 = i11 - (i18 * i);
                        i10 = i11 - (i17 * i);
                        i22 -= i * i21;
                        i = 0;
                    } else {
                        i10 = i11;
                        i24 = i11;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i25 -= i2 * i16;
                        i2 = 0;
                    }
                    if ((i == i2 || i18 >= i17) && (i2 != i || i18 <= i16)) {
                        i23 = i19 - i2;
                        i19 = i2 - i;
                        i11 = this.bg[i];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i24 >> 14, i22, i20, 2143557516);
                            i24 += i18;
                            i10 = i26 + i17;
                            i22 += i21;
                            i11 += this.ah * 484574585;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ai(this.ad, i11, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2137260562);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i23;
                                i25 += i16;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i19 - i2;
                    i19 = i2 - i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i24 >> 14, i26 >> 14, i22, i20, 2144846646);
                        i24 += i18;
                        i10 = i26 + i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ai(this.ad, i11, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2136564178);
                            i25 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i23;
                            i24 += i18;
                        } else {
                            return;
                        }
                    }
                }
                i11 = i4 << 14;
                if (i < 0) {
                    i10 = i11 - (i * i18);
                    i25 = i11 - (i17 * i);
                    i22 -= i * i21;
                    i = 0;
                } else {
                    i25 = i11;
                    i10 = i11;
                }
                i23 = i6 << 14;
                if (i19 < 0) {
                    i23 -= i19 * i16;
                    i19 = 0;
                }
                if ((i19 == i || i18 >= i17) && (i != i19 || i16 <= i17)) {
                    i24 = i2 - i19;
                    i19 -= i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i25 >> 14, i26 >> 14, i22, i20, 2139205709);
                        i10 = i26 + i18;
                        i25 += i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    while (true) {
                        i24--;
                        if (i24 >= 0) {
                            ai(this.ad, i11, 0, 0, i25 >> 14, i23 >> 14, i22, i20, 2138718676);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i16;
                            i25 += i17;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i2 - i19;
                i19 -= i;
                i11 = this.bg[i];
                i26 = i10;
                i27 = i25;
                while (true) {
                    i25 = i19 - 1;
                    if (i25 < 0) {
                        break;
                    }
                    ai(this.ad, i11, 0, 0, i26 >> 14, i27 >> 14, i22, i20, 2142497520);
                    i27 += i17;
                    i22 += i21;
                    i11 += this.ah * 1956907281;
                    i19 = i25;
                    i26 += i18;
                }
                i19 = i24;
                i25 = i23;
                while (true) {
                    i23 = i19 - 1;
                    if (i23 >= 0) {
                        ai(this.ad, i11, 0, 0, i25 >> 14, i27 >> 14, i22, i20, 2144687958);
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i23;
                        i25 += i16;
                        i27 += i17;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void ad(byte b) {
    }

    public final void ae(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (i != i2) {
            try {
                i9 = ((i5 - i4) << 14) / (i2 - i);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("be.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        i9 = 0;
        int i10 = i3 != i2 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i11 = i != i3 ? ((i4 - i6) << 14) / (i - i3) : 0;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (i > i2 || i > i3) {
            if (i2 <= i3) {
                if (i2 < this.bf * 651738037) {
                    if (i3 > this.bf * 651738037) {
                        i3 = this.bf * 651738037;
                    }
                    i12 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                    if (i3 < i12) {
                        i13 = i5 << 14;
                        if (i2 < 0) {
                            i14 = i13 - (i2 * i10);
                            i15 = i13 - (i2 * i9);
                            i2 = 0;
                        } else {
                            i15 = i13;
                            i14 = i13;
                        }
                        i16 = i6 << 14;
                        if (i3 < 0) {
                            i16 -= i3 * i11;
                            i3 = 0;
                        }
                        if ((i3 == i2 || i9 >= i10) && (i3 != i2 || i9 <= i11)) {
                            i17 = i12 - i3;
                            i12 = i3 - i2;
                            i13 = this.bg[i2];
                            i18 = i14;
                            while (true) {
                                i19 = i12 - 1;
                                if (i19 < 0) {
                                    break;
                                }
                                am(this.ad, i13, i7, 0, i18 >> 14, i15 >> 14, (byte) 0);
                                i15 += i9;
                                i13 += this.ah * 1956907281;
                                i12 = i19;
                                i18 += i10;
                            }
                            int i20 = i17;
                            while (true) {
                                i17 = i20 - 1;
                                if (i17 >= 0) {
                                    am(this.ad, i13, i7, 0, i16 >> 14, i15 >> 14, (byte) 0);
                                    i13 += this.ah * 1956907281;
                                    i15 += i9;
                                    i16 += i11;
                                    i20 = i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i17 = i12 - i3;
                        i12 = i3 - i2;
                        i13 = this.bg[i2];
                        i18 = i14;
                        while (true) {
                            i19 = i12 - 1;
                            if (i19 < 0) {
                                break;
                            }
                            am(this.ad, i13, i7, 0, i15 >> 14, i18 >> 14, (byte) 0);
                            i15 += i9;
                            i13 += this.ah * 1956907281;
                            i12 = i19;
                            i18 += i10;
                        }
                        i14 = i17;
                        while (true) {
                            i17 = i14 - 1;
                            if (i17 >= 0) {
                                am(this.ad, i13, i7, 0, i15 >> 14, i16 >> 14, (byte) 0);
                                i16 += i11;
                                i13 += this.ah * 1956907281;
                                i15 += i9;
                                i14 = i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i5 << 14;
                    if (i2 < 0) {
                        i14 = i13 - (i2 * i9);
                        i15 = i13 - (i2 * i10);
                        i2 = 0;
                    } else {
                        i15 = i13;
                        i14 = i13;
                    }
                    i17 = i4 << 14;
                    if (i12 < 0) {
                        i17 -= i12 * i11;
                        i12 = 0;
                    }
                    if (i9 < i10) {
                        i16 = i3 - i12;
                        i12 -= i2;
                        i13 = this.bg[i2];
                        i18 = i14;
                        while (true) {
                            i19 = i12 - 1;
                            if (i19 < 0) {
                                break;
                            }
                            am(this.ad, i13, i7, 0, i18 >> 14, i15 >> 14, (byte) 0);
                            i15 += i10;
                            i13 += this.ah * 1956907281;
                            i12 = i19;
                            i18 += i9;
                        }
                        i14 = i16;
                        while (true) {
                            i16 = i14 - 1;
                            if (i16 >= 0) {
                                am(this.ad, i13, i7, 0, i17 >> 14, i15 >> 14, (byte) 0);
                                i17 += i11;
                                i13 += this.ah * 1956907281;
                                i15 += i10;
                                i14 = i16;
                            } else {
                                return;
                            }
                        }
                    }
                    i16 = i3 - i12;
                    i12 -= i2;
                    i13 = this.bg[i2];
                    i18 = i14;
                    while (true) {
                        i19 = i12 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        am(this.ad, i13, i7, 0, i15 >> 14, i18 >> 14, (byte) 0);
                        i15 += i10;
                        i13 += this.ah * 1956907281;
                        i12 = i19;
                        i18 += i9;
                    }
                    i14 = i16;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            am(this.ad, i13, i7, 0, i15 >> 14, i17 >> 14, (byte) 0);
                            i13 += this.ah * 1956907281;
                            i15 += i10;
                            i14 = i16;
                            i17 += i11;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < this.bf * 651738037) {
                if (i > this.bf * 651738037) {
                    i = this.bf * 651738037;
                }
                i12 = i2 > this.bf * 651738037 ? this.bf * 651738037 : i2;
                if (i < i12) {
                    i13 = i6 << 14;
                    if (i3 < 0) {
                        i14 = i13 - (i3 * i11);
                        i15 = i13 - (i3 * i10);
                        i3 = 0;
                    } else {
                        i15 = i13;
                        i14 = i13;
                    }
                    i17 = i4 << 14;
                    if (i < 0) {
                        i17 -= i * i9;
                        i = 0;
                    }
                    if (i10 < i11) {
                        i16 = i12 - i;
                        i12 = i - i3;
                        i13 = this.bg[i3];
                        i18 = i14;
                        while (true) {
                            i19 = i12 - 1;
                            if (i19 < 0) {
                                break;
                            }
                            am(this.ad, i13, i7, 0, i15 >> 14, i18 >> 14, (byte) 0);
                            i15 += i10;
                            i13 += this.ah * 1956907281;
                            i12 = i19;
                            i18 += i11;
                        }
                        i14 = i16;
                        while (true) {
                            i16 = i14 - 1;
                            if (i16 >= 0) {
                                am(this.ad, i13, i7, 0, i15 >> 14, i17 >> 14, (byte) 0);
                                i17 += i9;
                                i13 += this.ah * 1956907281;
                                i15 += i10;
                                i14 = i16;
                            } else {
                                return;
                            }
                        }
                    }
                    i16 = i12 - i;
                    i12 = i - i3;
                    i13 = this.bg[i3];
                    i18 = i14;
                    while (true) {
                        i19 = i12 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        am(this.ad, i13, i7, 0, i18 >> 14, i15 >> 14, (byte) 0);
                        i15 += i10;
                        i13 += this.ah * 1956907281;
                        i12 = i19;
                        i18 += i11;
                    }
                    i14 = i16;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            am(this.ad, i13, i7, 0, i17 >> 14, i15 >> 14, (byte) 0);
                            i13 += this.ah * 1956907281;
                            i15 += i10;
                            i14 = i16;
                            i17 += i9;
                        } else {
                            return;
                        }
                    }
                }
                i13 = i6 << 14;
                if (i3 < 0) {
                    i15 = i13 - (i3 * i11);
                    i14 = i13 - (i3 * i10);
                    i3 = 0;
                } else {
                    i14 = i13;
                    i15 = i13;
                }
                i16 = i5 << 14;
                if (i12 < 0) {
                    i16 -= i12 * i9;
                    i12 = 0;
                }
                if (i10 < i11) {
                    i17 = i - i12;
                    i12 -= i3;
                    i13 = this.bg[i3];
                    i18 = i14;
                    while (true) {
                        i19 = i12 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        am(this.ad, i13, i7, 0, i18 >> 14, i15 >> 14, (byte) 0);
                        i15 += i11;
                        i13 += this.ah * 1956907281;
                        i12 = i19;
                        i18 += i10;
                    }
                    i14 = i17;
                    while (true) {
                        i17 = i14 - 1;
                        if (i17 >= 0) {
                            am(this.ad, i13, i7, 0, i16 >> 14, i15 >> 14, (byte) 0);
                            i16 += i9;
                            i13 += this.ah * 1956907281;
                            i15 += i11;
                            i14 = i17;
                        } else {
                            return;
                        }
                    }
                }
                i17 = i - i12;
                i12 -= i3;
                i13 = this.bg[i3];
                i18 = i14;
                while (true) {
                    i19 = i12 - 1;
                    if (i19 < 0) {
                        break;
                    }
                    am(this.ad, i13, i7, 0, i15 >> 14, i18 >> 14, (byte) 0);
                    i15 += i11;
                    i13 += this.ah * 1956907281;
                    i12 = i19;
                    i18 += i10;
                }
                while (true) {
                    i17--;
                    if (i17 >= 0) {
                        am(this.ad, i13, i7, 0, i15 >> 14, i16 >> 14, (byte) 0);
                        i13 += this.ah * 1956907281;
                        i15 += i11;
                        i16 += i9;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bf * 651738037) {
            if (i2 > this.bf * 651738037) {
                i2 = this.bf * 651738037;
            }
            i12 = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
            if (i2 < i12) {
                i13 = i4 << 14;
                if (i < 0) {
                    i15 = i13 - (i * i11);
                    i14 = i13 - (i * i9);
                    i = 0;
                } else {
                    i14 = i13;
                    i15 = i13;
                }
                i17 = i5 << 14;
                if (i2 < 0) {
                    i17 -= i2 * i10;
                    i2 = 0;
                }
                if ((i == i2 || i11 >= i9) && (i2 != i || i11 <= i10)) {
                    i16 = i12 - i2;
                    i12 = i2 - i;
                    i13 = this.bg[i];
                    i18 = i14;
                    while (true) {
                        i19 = i12 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        am(this.ad, i13, i7, 0, i18 >> 14, i15 >> 14, (byte) 0);
                        i15 += i11;
                        i13 += this.ah * 1956907281;
                        i12 = i19;
                        i18 += i9;
                    }
                    i14 = i16;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            am(this.ad, i13, i7, 0, i17 >> 14, i15 >> 14, (byte) 0);
                            i13 += this.ah * 1956907281;
                            i15 += i11;
                            i14 = i16;
                            i17 += i10;
                        } else {
                            return;
                        }
                    }
                }
                i16 = i12 - i2;
                i12 = i2 - i;
                i13 = this.bg[i];
                i18 = i14;
                while (true) {
                    i19 = i12 - 1;
                    if (i19 < 0) {
                        break;
                    }
                    am(this.ad, i13, i7, 0, i15 >> 14, i18 >> 14, (byte) 0);
                    i15 += i11;
                    i13 += this.ah * 1956907281;
                    i12 = i19;
                    i18 += i9;
                }
                i14 = i16;
                while (true) {
                    i16 = i14 - 1;
                    if (i16 >= 0) {
                        am(this.ad, i13, i7, 0, i15 >> 14, i17 >> 14, (byte) 0);
                        i17 += i10;
                        i13 += this.ah * 1956907281;
                        i15 += i11;
                        i14 = i16;
                    } else {
                        return;
                    }
                }
            }
            i13 = i4 << 14;
            if (i < 0) {
                i14 = i13 - (i * i11);
                i16 = i13 - (i * i9);
                i = 0;
            } else {
                i16 = i13;
                i14 = i13;
            }
            i17 = i6 << 14;
            if (i12 < 0) {
                i17 -= i12 * i10;
                i12 = 0;
            }
            if ((i == i12 || i11 >= i9) && (i12 != i || i10 <= i9)) {
                i15 = i2 - i12;
                i12 -= i;
                i13 = this.bg[i];
                i18 = i14;
                while (true) {
                    i19 = i12 - 1;
                    if (i19 < 0) {
                        break;
                    }
                    am(this.ad, i13, i7, 0, i16 >> 14, i18 >> 14, (byte) 0);
                    i16 += i9;
                    i13 += this.ah * 1956907281;
                    i12 = i19;
                    i18 += i11;
                }
                i12 = i15;
                while (true) {
                    i15 = i12 - 1;
                    if (i15 >= 0) {
                        am(this.ad, i13, i7, 0, i16 >> 14, i17 >> 14, (byte) 0);
                        i13 += this.ah * 1956907281;
                        i12 = i15;
                        i16 += i9;
                        i17 += i10;
                    } else {
                        return;
                    }
                }
            }
            i15 = i2 - i12;
            i12 -= i;
            i13 = this.bg[i];
            i18 = i14;
            while (true) {
                i19 = i12 - 1;
                if (i19 < 0) {
                    break;
                }
                am(this.ad, i13, i7, 0, i18 >> 14, i16 >> 14, (byte) 0);
                i16 += i9;
                i13 += this.ah * 1956907281;
                i12 = i19;
                i18 += i11;
            }
            i12 = i15;
            while (true) {
                i15 = i12 - 1;
                if (i15 >= 0) {
                    am(this.ad, i13, i7, 0, i17 >> 14, i16 >> 14, (byte) 0);
                    i17 += i10;
                    i13 += this.ah * 1956907281;
                    i12 = i15;
                    i16 += i9;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void af(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, byte b) {
        try {
            if (this.at) {
                if (i5 > this.bl * 1505645037) {
                    i5 = this.bl * 1505645037;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i14 = i3 + i4;
                int i15 = i6 + (i4 * i7);
                int i16 = i5 - i4;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                if (this.ba) {
                    i17 = i4 - (this.bd * -1240378447);
                    i18 = i8 + (i17 * i11);
                    i19 = i9 + (i17 * i12);
                    i20 = i10 + (i17 * i13);
                    i21 = i20 >> 12;
                    if (i21 != 0) {
                        i22 = i18 / i21;
                        i23 = i19 / i21;
                    } else {
                        i22 = 0;
                        i23 = 0;
                    }
                    i17 = ((i13 * i16) + i20) >> 12;
                    if (i17 != 0) {
                        i21 = ((i11 * i16) + i18) / i17;
                        i17 = ((i12 * i16) + i19) / i17;
                    } else {
                        i21 = 0;
                        i17 = 0;
                    }
                    i18 = (i22 << 20) + i23;
                    i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 20);
                    i17 = i16 >> 3;
                    i22 = i7 << 3;
                    i21 = i15 >> 8;
                    if (this.bk) {
                        if (i17 > 0) {
                            do {
                                i19 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                i20 = i14 + 1;
                                iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                                i18 += i23;
                                i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                i19 = i20 + 1;
                                iArr[i20] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                                i18 += i23;
                                i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                i20 = i19 + 1;
                                iArr[i19] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                                i18 += i23;
                                i14 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                                i19 = i20 + 1;
                                iArr[i20] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                                i18 += i23;
                                i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                i20 = i19 + 1;
                                iArr[i19] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                                i18 += i23;
                                i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                i19 = i20 + 1;
                                iArr[i20] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                                i18 += i23;
                                i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                i20 = i19 + 1;
                                iArr[i19] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                                i18 += i23;
                                i19 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                                i14 = i20 + 1;
                                iArr[i20] = (((i21 * (i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                                i18 += i23;
                                i15 += i22;
                                i21 = i15 >> 8;
                                i17--;
                            } while (i17 > 0);
                            i22 = i21;
                            i17 = i18;
                            i15 = i14;
                        } else {
                            i22 = i21;
                            i17 = i18;
                            i15 = i14;
                        }
                        i18 = i16 & 7;
                        if (i18 > 0) {
                            i21 = i15;
                            while (true) {
                                i15 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                                iArr[i21] = ((((i15 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i22) & 16711680)) >> 8;
                                i17 += i23;
                                i18--;
                                if (i18 > 0) {
                                    i21++;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    if (i17 > 0) {
                        do {
                            i19 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            if (i19 != 0) {
                                iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i19 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            if (i19 != 0) {
                                iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i19 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            if (i19 != 0) {
                                iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i19 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            if (i19 != 0) {
                                iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i19 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            if (i19 != 0) {
                                iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i19 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            if (i19 != 0) {
                                iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i19 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            if (i19 != 0) {
                                iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i19 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            if (i19 != 0) {
                                iArr[i14] = (((i21 * (i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                            }
                            i14++;
                            i18 += i23;
                            i15 += i22;
                            i21 = i15 >> 8;
                            i17--;
                        } while (i17 > 0);
                        i22 = i21;
                        i17 = i18;
                        i15 = i14;
                    } else {
                        i22 = i21;
                        i17 = i18;
                        i15 = i14;
                    }
                    i18 = i16 & 7;
                    if (i18 > 0) {
                        i21 = i15;
                        do {
                            i15 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                            if (i15 != 0) {
                                iArr[i21] = ((((i15 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i22) & 16711680)) >> 8;
                            }
                            i21++;
                            i17 += i23;
                            i18--;
                        } while (i18 > 0);
                        return;
                    }
                    return;
                }
                i17 = i4 - (this.bd * -1240378447);
                i18 = i8 + (i11 * i17);
                i19 = i9 + (i12 * i17);
                i20 = i10 + (i17 * i13);
                i21 = i20 >> 14;
                if (i21 != 0) {
                    i22 = i18 / i21;
                    i23 = i19 / i21;
                } else {
                    i22 = 0;
                    i23 = 0;
                }
                i17 = ((i16 * i13) + i20) >> 14;
                if (i17 != 0) {
                    i21 = ((i11 * i16) + i18) / i17;
                    i17 = ((i12 * i16) + i19) / i17;
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i18 = (i22 << 18) + i23;
                i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 18);
                i17 = i16 >> 3;
                i22 = i7 << 3;
                i21 = i15 >> 8;
                if (this.bk) {
                    if (i17 > 0) {
                        do {
                            i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                            i20 = i14 + 1;
                            iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                            i18 += i23;
                            i14 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                            i19 = i20 + 1;
                            iArr[i20] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i18 += i23;
                            i14 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                            i20 = i19 + 1;
                            iArr[i19] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i18 += i23;
                            i14 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                            i19 = i20 + 1;
                            iArr[i20] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i18 += i23;
                            i14 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                            i20 = i19 + 1;
                            iArr[i19] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i18 += i23;
                            i14 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                            i19 = i20 + 1;
                            iArr[i20] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i18 += i23;
                            i14 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                            i20 = i19 + 1;
                            iArr[i19] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i18 += i23;
                            i19 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                            i14 = i20 + 1;
                            iArr[i20] = (((i21 * (i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                            i18 += i23;
                            i15 += i22;
                            i21 = i15 >> 8;
                            i17--;
                        } while (i17 > 0);
                        i22 = i21;
                        i17 = i18;
                        i15 = i14;
                    } else {
                        i22 = i21;
                        i17 = i18;
                        i15 = i14;
                    }
                    i18 = i16 & 7;
                    if (i18 > 0) {
                        i21 = i15;
                        while (true) {
                            i15 = iArr2[(i17 >>> 25) + (i17 & 16256)];
                            iArr[i21] = ((((i15 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i22) & 16711680)) >> 8;
                            i17 += i23;
                            i18--;
                            if (i18 > 0) {
                                i21++;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i17 > 0) {
                    do {
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i19 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i19 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i19 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                        if (i19 != 0) {
                            iArr[i14] = (((i21 * (i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i19) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i18 += i23;
                        i15 += i22;
                        i21 = i15 >> 8;
                        i17--;
                    } while (i17 > 0);
                    i22 = i21;
                    i17 = i18;
                    i15 = i14;
                } else {
                    i22 = i21;
                    i17 = i18;
                    i15 = i14;
                }
                i18 = i16 & 7;
                if (i18 > 0) {
                    i21 = i15;
                    do {
                        i15 = iArr2[(i17 & 16256) + (i17 >>> 25)];
                        if (i15 != 0) {
                            iArr[i21] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i15) * i22) & -16711936)) >> 8;
                        }
                        i21++;
                        i17 += i23;
                        i18--;
                    } while (i18 > 0);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ag() {
    }

    /* Access modifiers changed, original: final */
    public final void ah(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        try {
            int[] ar = il.ax.ar(i19, -504635651);
            int al;
            if (ar == null) {
                al = il.ax.al(i19, 1251016387);
                aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2136127478), kr.br(al, i8, 2132945733), kr.br(al, i9, 2142013672), (byte) 16);
                return;
            }
            this.ba = il.ax.ai(i19, (byte) 0);
            this.bk = il.ax.aj(i19, 1461581640);
            int i21 = i5 - i4;
            int i22 = i2 - i;
            int i23 = i6 - i4;
            int i24 = i3 - i;
            int i25 = i8 - i7;
            int i26 = i9 - i7;
            int i27 = i2 != i ? (i21 << 14) / i22 : 0;
            int i28 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
            int i29 = i != i3 ? ((i4 - i6) << 14) / (i - i3) : 0;
            al = (i21 * i24) - (i22 * i23);
            if (al != 0) {
                int i30 = (((i24 * i25) - (i22 * i26)) << 9) / al;
                int i31 = (((i21 * i26) - (i23 * i25)) << 9) / al;
                al = i10 - i11;
                i21 = i13 - i14;
                i22 = i16 - i17;
                i23 = i12 - i10;
                i24 = i15 - i13;
                i25 = i18 - i16;
                i26 = ((i23 * i13) - (i24 * i10)) << 14;
                int i32 = (int) ((((long) ((i16 * i24) - (i13 * i25))) << 14) / ((long) (this.bq * 1516652957)));
                int i33 = (int) ((((long) ((i25 * i10) - (i16 * i23))) << 14) / ((long) (this.bq * 1516652957)));
                int i34 = ((i13 * al) - (i21 * i10)) << 14;
                int i35 = (int) ((((long) ((i16 * i21) - (i22 * i13))) << 14) / ((long) (this.bq * 1516652957)));
                int i36 = (int) ((((long) ((i10 * i22) - (i16 * al))) << 14) / ((long) (this.bq * 1516652957)));
                int i37 = ((i21 * i23) - (al * i24)) << 14;
                int i38 = (int) ((((long) ((i24 * i22) - (i21 * i25))) << 14) / ((long) (this.bq * 1516652957)));
                int i39 = (int) ((((long) ((al * i25) - (i22 * i23))) << 14) / ((long) (this.bq * 1516652957)));
                int i40;
                int i41;
                int i42;
                int i43;
                int i44;
                int i45;
                int i46;
                if (i > i2 || i > i3) {
                    if (i2 <= i3) {
                        if (i2 < this.bf * 651738037) {
                            if (i3 > this.bf * 651738037) {
                                i3 = this.bf * 651738037;
                            }
                            i22 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                            i40 = ((i8 << 9) - (i5 * i30)) + i30;
                            if (i3 < i22) {
                                i23 = i5 << 14;
                                if (i2 < 0) {
                                    i40 -= i2 * i31;
                                    i21 = i23 - (i2 * i28);
                                    i41 = i23 - (i2 * i27);
                                    i2 = 0;
                                } else {
                                    i21 = i23;
                                    i41 = i23;
                                }
                                al = i6 << 14;
                                if (i3 < 0) {
                                    i3 = 0;
                                    i42 = al - (i3 * i29);
                                } else {
                                    i42 = al;
                                }
                                al = i2 - (this.bo * -1165057787);
                                i43 = i26 + (al * i33);
                                i34 += i36 * al;
                                i37 += al * i39;
                                if ((i3 == i2 || i27 >= i28) && (i2 != i3 || i27 <= i29)) {
                                    i44 = i22 - i3;
                                    al = i3 - i2;
                                    i24 = this.bg[i2];
                                    i45 = i21;
                                    while (true) {
                                        i46 = al - 1;
                                        if (i46 < 0) {
                                            break;
                                        }
                                        af(this.ad, ar, 0, 0, i24, i45 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -109);
                                        i41 += i27;
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        al = i46;
                                        i45 += i28;
                                    }
                                    al = i44;
                                    i46 = i42;
                                    while (true) {
                                        i42 = al - 1;
                                        if (i42 >= 0) {
                                            af(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -93);
                                            i40 += i31;
                                            i24 += this.ah * 1956907281;
                                            i43 += i33;
                                            i34 += i36;
                                            i37 += i39;
                                            al = i42;
                                            i46 += i29;
                                            i41 += i27;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i44 = i22 - i3;
                                al = i3 - i2;
                                i24 = this.bg[i2];
                                i45 = i21;
                                while (true) {
                                    i46 = al - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    af(this.ad, ar, 0, 0, i24, i41 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -70);
                                    i41 += i27;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i46;
                                    i45 += i28;
                                }
                                al = i44;
                                i46 = i42;
                                while (true) {
                                    i42 = al - 1;
                                    if (i42 >= 0) {
                                        af(this.ad, ar, 0, 0, i24, i41 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) 2);
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        al = i42;
                                        i46 += i29;
                                        i41 += i27;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            al = i5 << 14;
                            if (i2 < 0) {
                                i21 = al - (i27 * i2);
                                i42 = al - (i28 * i2);
                                i40 -= i2 * i31;
                                i2 = 0;
                            } else {
                                i21 = al;
                                i42 = al;
                            }
                            i44 = i4 << 14;
                            if (i22 < 0) {
                                i44 -= i22 * i29;
                                al = 0;
                            } else {
                                al = i22;
                            }
                            i22 = i2 - (this.bo * -1165057787);
                            i43 = i26 + (i33 * i22);
                            i34 += i36 * i22;
                            i37 += i22 * i39;
                            if (i27 < i28) {
                                i46 = i3 - al;
                                al -= i2;
                                i24 = this.bg[i2];
                                i45 = i21;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 < 0) {
                                        break;
                                    }
                                    af(this.ad, ar, 0, 0, i24, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -61);
                                    i42 += i28;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i41;
                                    i45 += i27;
                                }
                                i21 = i46;
                                while (true) {
                                    i46 = i21 - 1;
                                    if (i46 >= 0) {
                                        af(this.ad, ar, 0, 0, i24, i44 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -64);
                                        i44 += i29;
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i42 += i28;
                                        i21 = i46;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i46 = i3 - al;
                            al -= i2;
                            i24 = this.bg[i2];
                            i45 = i21;
                            while (true) {
                                i41 = al - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i24, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -23);
                                i42 += i28;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i41;
                                i45 += i27;
                            }
                            i22 = i46;
                            while (true) {
                                i46 = i22 - 1;
                                if (i46 >= 0) {
                                    af(this.ad, ar, 0, 0, i24, i42 >> 14, i44 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -37);
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i42 += i28;
                                    i44 += i29;
                                    i22 = i46;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (i3 < this.bf * 651738037) {
                        if (i > this.bf * 651738037) {
                            i = this.bf * 651738037;
                        }
                        i21 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                        i40 = ((i9 << 9) - (i30 * i6)) + i30;
                        if (i < i21) {
                            i23 = i6 << 14;
                            if (i3 < 0) {
                                i40 -= i3 * i31;
                                i22 = i23 - (i29 * i3);
                                i46 = i23 - (i28 * i3);
                                i3 = 0;
                            } else {
                                i22 = i23;
                                i46 = i23;
                            }
                            al = i4 << 14;
                            if (i < 0) {
                                i = 0;
                                i42 = al - (i * i27);
                            } else {
                                i42 = al;
                            }
                            al = i3 - (this.bo * -1165057787);
                            i43 = i26 + (i33 * al);
                            i34 += i36 * al;
                            i37 += al * i39;
                            if (i28 < i29) {
                                i44 = i21 - i;
                                al = i - i3;
                                i24 = this.bg[i3];
                                i45 = i22;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 < 0) {
                                        break;
                                    }
                                    af(this.ad, ar, 0, 0, i24, i46 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -48);
                                    i46 += i28;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i41;
                                    i45 += i29;
                                }
                                al = i44;
                                i41 = i42;
                                while (true) {
                                    i42 = al - 1;
                                    if (i42 >= 0) {
                                        af(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -37);
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        al = i42;
                                        i46 += i28;
                                        i41 += i27;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i44 = i21 - i;
                            al = i - i3;
                            i24 = this.bg[i3];
                            i45 = i22;
                            while (true) {
                                i41 = al - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i24, i45 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -26);
                                i46 += i28;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i41;
                                i45 += i29;
                            }
                            al = i44;
                            i41 = i42;
                            while (true) {
                                i42 = al - 1;
                                if (i42 >= 0) {
                                    af(this.ad, ar, 0, 0, i24, i41 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -127);
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i42;
                                    i46 += i28;
                                    i41 += i27;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i40 -= i3 * i31;
                            i46 = i23 - (i3 * i29);
                            al = i23 - (i28 * i3);
                            i3 = 0;
                        } else {
                            al = i23;
                            i46 = i23;
                        }
                        i44 = i5 << 14;
                        if (i21 < 0) {
                            i44 -= i21 * i27;
                            i22 = 0;
                        } else {
                            i22 = i21;
                        }
                        i21 = i3 - (this.bo * -1165057787);
                        i43 = i26 + (i21 * i33);
                        i34 += i36 * i21;
                        i37 += i21 * i39;
                        if (i28 < i29) {
                            i21 = i22 - i3;
                            i42 = i - i22;
                            i24 = this.bg[i3];
                            i45 = al;
                            while (true) {
                                i41 = i21 - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i24, i45 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -40);
                                i46 += i29;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i21 = i41;
                                i45 += i28;
                            }
                            al = i42;
                            while (true) {
                                i42 = al - 1;
                                if (i42 >= 0) {
                                    af(this.ad, ar, 0, 0, i24, i44 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -76);
                                    i44 += i27;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i42;
                                    i46 += i29;
                                } else {
                                    return;
                                }
                            }
                        }
                        i21 = i22 - i3;
                        i42 = i - i22;
                        i24 = this.bg[i3];
                        i41 = al;
                        while (true) {
                            i45 = i21 - 1;
                            if (i45 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -82);
                            i46 += i29;
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i41 += i28;
                            i21 = i45;
                        }
                        al = i42;
                        while (true) {
                            i42 = al - 1;
                            if (i42 >= 0) {
                                af(this.ad, ar, 0, 0, i24, i46 >> 14, i44 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -29);
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i42;
                                i44 += i27;
                                i46 += i29;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i < this.bf * 651738037) {
                    if (i2 > this.bf * 651738037) {
                        i2 = this.bf * 651738037;
                    }
                    al = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
                    i40 = ((i7 << 9) - (i30 * i4)) + i30;
                    if (i2 < al) {
                        i22 = i4 << 14;
                        if (i < 0) {
                            i42 = i22 - (i * i29);
                            i21 = i22 - (i * i27);
                            i40 -= i * i31;
                            i = 0;
                        } else {
                            i42 = i22;
                            i21 = i22;
                        }
                        i44 = i5 << 14;
                        if (i2 < 0) {
                            i44 -= i2 * i28;
                            i2 = 0;
                        }
                        i22 = i - (this.bo * -1165057787);
                        i43 = i26 + (i33 * i22);
                        i34 += i36 * i22;
                        i37 += i22 * i39;
                        if ((i2 == i || i29 >= i27) && (i != i2 || i29 <= i28)) {
                            i46 = al - i2;
                            al = i2 - i;
                            i24 = this.bg[i];
                            i45 = i21;
                            while (true) {
                                i41 = al - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i24, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -52);
                                i42 += i29;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i41;
                                i45 += i27;
                            }
                            i22 = i46;
                            while (true) {
                                i46 = i22 - 1;
                                if (i46 >= 0) {
                                    af(this.ad, ar, 0, 0, i24, i44 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -43);
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i42 += i29;
                                    i44 += i28;
                                    i22 = i46;
                                } else {
                                    return;
                                }
                            }
                        }
                        i46 = al - i2;
                        al = i2 - i;
                        i24 = this.bg[i];
                        i45 = i21;
                        while (true) {
                            i41 = al - 1;
                            if (i41 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i24, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -87);
                            i42 += i29;
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            al = i41;
                            i45 += i27;
                        }
                        i21 = i46;
                        while (true) {
                            i46 = i21 - 1;
                            if (i46 >= 0) {
                                af(this.ad, ar, 0, 0, i24, i42 >> 14, i44 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -13);
                                i44 += i28;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i42 += i29;
                                i21 = i46;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i4 << 14;
                    if (i < 0) {
                        i46 = i21 - (i27 * i);
                        i40 -= i * i31;
                        i22 = i21 - (i * i29);
                        i = 0;
                    } else {
                        i46 = i21;
                        i22 = i21;
                    }
                    i21 = i6 << 14;
                    if (al < 0) {
                        i21 -= al * i28;
                        al = 0;
                        i42 = i21;
                    } else {
                        i42 = i21;
                    }
                    i21 = i - (this.bo * -1165057787);
                    i43 = i26 + (i33 * i21);
                    i34 += i36 * i21;
                    i37 += i21 * i39;
                    if ((al == i || i29 >= i27) && (i != al || i28 <= i27)) {
                        i21 = al - i;
                        i44 = i2 - al;
                        i24 = this.bg[i];
                        al = i21;
                        i45 = i22;
                        while (true) {
                            i41 = al - 1;
                            if (i41 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i24, i46 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -3);
                            i46 += i27;
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            al = i41;
                            i45 += i29;
                        }
                        al = i44;
                        i41 = i42;
                        while (true) {
                            i42 = al - 1;
                            if (i42 >= 0) {
                                af(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -23);
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i42;
                                i46 += i27;
                                i41 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = al - i;
                    i44 = i2 - al;
                    i24 = this.bg[i];
                    al = i21;
                    i45 = i22;
                    while (true) {
                        i41 = al - 1;
                        if (i41 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i24, i45 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -75);
                        i46 += i27;
                        i40 += i31;
                        i24 += this.ah * 1956907281;
                        i43 += i33;
                        i34 += i36;
                        i37 += i39;
                        al = i41;
                        i45 += i29;
                    }
                    al = i44;
                    i41 = i42;
                    while (true) {
                        i42 = al - 1;
                        if (i42 >= 0) {
                            af(this.ad, ar, 0, 0, i24, i41 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, (byte) -64);
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            al = i42;
                            i46 += i27;
                            i41 += i28;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ai(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (this.at) {
                if (i5 > this.bl * 1505645037) {
                    i5 = this.bl * 1505645037;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i9 = i + i4;
                int i10 = i6 + (i7 * i4);
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                if (this.bs) {
                    i11 = i5 - i4;
                    i12 = i11 >> 2;
                    i13 = i7 << 2;
                    int i16;
                    if (this.bm * -481075153 == 0) {
                        if (i12 > 0) {
                            i14 = i12;
                            while (true) {
                                i15 = az[i10 >> 8];
                                i10 += i13;
                                i12 = i9 + 1;
                                iArr[i9] = i15;
                                i9 = i12 + 1;
                                iArr[i12] = i15;
                                i16 = i9 + 1;
                                iArr[i9] = i15;
                                i12 = i16 + 1;
                                iArr[i16] = i15;
                                i14--;
                                if (i14 <= 0) {
                                    break;
                                }
                                i9 = i12;
                            }
                            i14 = i10;
                        } else {
                            i14 = i10;
                            i12 = i9;
                        }
                        i10 = i11 & 3;
                        if (i10 > 0) {
                            i14 = az[i14 >> 8];
                            while (true) {
                                iArr[i12] = i14;
                                i10--;
                                if (i10 > 0) {
                                    i12++;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    i15 = -481075153 * this.bm;
                    i16 = 256 - (this.bm * -481075153);
                    if (i12 > 0) {
                        i14 = i12;
                        while (true) {
                            i12 = az[i10 >> 8];
                            i10 += i13;
                            int i17 = ((((16711935 & i12) * i16) >> 8) & 16711935) + ((((i12 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i16) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                            i12 = iArr[i9];
                            int i18 = i9 + 1;
                            iArr[i9] = ((((i12 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i15) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i12) * i15) >> 8) & 16711935) + i17);
                            i12 = iArr[i18];
                            i9 = i18 + 1;
                            iArr[i18] = ((((i12 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i15) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i12) * i15) >> 8) & 16711935) + i17);
                            i12 = iArr[i9];
                            i18 = i9 + 1;
                            iArr[i9] = ((((i12 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i15) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i12) * i15) >> 8) & 16711935) + i17);
                            i9 = iArr[i18];
                            i12 = i18 + 1;
                            iArr[i18] = ((((i9 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i15) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (i17 + ((((16711935 & i9) * i15) >> 8) & 16711935));
                            i14--;
                            if (i14 <= 0) {
                                break;
                            }
                            i9 = i12;
                        }
                        i14 = i10;
                    } else {
                        i14 = i10;
                        i12 = i9;
                    }
                    i10 = i11 & 3;
                    if (i10 > 0) {
                        i14 = az[i14 >> 8];
                        while (true) {
                            i9 = iArr[i12];
                            iArr[i12] = (((((i9 & 16711935) * i15) >> 8) & 16711935) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i16) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i14) * i16) >> 8) & 16711935))) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i15) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                            i10--;
                            if (i10 > 0) {
                                i12++;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i14 = i5 - i4;
                if (this.bm * -481075153 == 0) {
                    while (true) {
                        iArr[i9] = az[i10 >> 8];
                        i10 += i7;
                        i14--;
                        if (i14 > 0) {
                            i9++;
                        } else {
                            return;
                        }
                    }
                }
                i11 = -481075153 * this.bm;
                i13 = 256 - (this.bm * -481075153);
                i12 = i10;
                while (true) {
                    i10 = az[i12 >> 8];
                    i12 += i7;
                    i15 = iArr[i9];
                    iArr[i9] = ((((((i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i10) * i13) >> 8) & 16711935)) + ((((16711935 & i15) * i11) >> 8) & 16711935)) + ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    i10 = i14 - 1;
                    if (i10 > 0) {
                        i9++;
                        i14 = i10;
                    } else {
                        return;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, byte b) {
        int i10;
        int i11 = i5 - i4;
        int i12 = i2 - i;
        int i13 = i6 - i4;
        int i14 = i3 - i;
        int i15 = i8 - i7;
        int i16 = i9 - i7;
        if (i2 != i3) {
            try {
                i10 = ((i6 - i5) << 14) / (i3 - i2);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("be.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        i10 = 0;
        int i17 = i != i2 ? (i11 << 14) / i12 : 0;
        int i18 = i != i3 ? (i13 << 14) / i14 : 0;
        int i19 = (i14 * i11) - (i12 * i13);
        if (i19 != 0) {
            int i20 = (((i14 * i15) - (i12 * i16)) << 8) / i19;
            int i21 = (((i11 * i16) - (i13 * i15)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i19 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                        i22 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i19) {
                            i12 = i5 << 14;
                            if (i2 < 0) {
                                i23 = i12 - (i17 * i2);
                                i11 = i12 - (i2 * i10);
                                i22 -= i2 * i21;
                                i2 = 0;
                            } else {
                                i23 = i12;
                                i11 = i12;
                            }
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i24 -= i3 * i18;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i17 >= i10) && (i3 != i2 || i17 <= i18)) {
                                i25 = i19 - i3;
                                i19 = i3 - i2;
                                i12 = this.bg[i2];
                                i26 = i11;
                                while (true) {
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    ai(this.ad, i12, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2136475798);
                                    i23 += i17;
                                    i22 += i21;
                                    i12 += this.ah * 1956907281;
                                    i19 = i27;
                                    i26 += i10;
                                }
                                i19 = i25;
                                while (true) {
                                    i25 = i19 - 1;
                                    if (i25 >= 0) {
                                        ai(this.ad, i12, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2138667863);
                                        i22 += i21;
                                        i12 += this.ah * 1956907281;
                                        i19 = i25;
                                        i24 += i18;
                                        i23 += i17;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i19 - i3;
                            i19 = i3 - i2;
                            i12 = this.bg[i2];
                            i26 = i11;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i12, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2146825210);
                                i23 += i17;
                                i22 += i21;
                                i12 += this.ah * 1956907281;
                                i19 = i27;
                                i26 += i10;
                            }
                            i19 = i25;
                            while (true) {
                                i25 = i19 - 1;
                                if (i25 >= 0) {
                                    ai(this.ad, i12, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2134857494);
                                    i24 += i18;
                                    i22 += i21;
                                    i12 += this.ah * 1956907281;
                                    i19 = i25;
                                    i23 += i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i12 = i5 << 14;
                        if (i2 < 0) {
                            i11 = i12 - (i2 * i17);
                            i25 = i12 - (i10 * i2);
                            i22 -= i2 * i21;
                            i2 = 0;
                        } else {
                            i11 = i12;
                            i25 = i12;
                        }
                        i24 = i4 << 14;
                        if (i19 < 0) {
                            i24 -= i19 * i18;
                            i19 = 0;
                        }
                        if (i17 < i10) {
                            i23 = i3 - i19;
                            i19 -= i2;
                            i12 = this.bg[i2];
                            i26 = i11;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i12, 0, 0, i26 >> 14, i25 >> 14, i22, i20, 2143202828);
                                i25 += i10;
                                i22 += i21;
                                i12 += this.ah * 1956907281;
                                i19 = i27;
                                i26 += i17;
                            }
                            i11 = i23;
                            while (true) {
                                i23 = i11 - 1;
                                if (i23 >= 0) {
                                    ai(this.ad, i12, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2137327608);
                                    i24 += i18;
                                    i22 += i21;
                                    i12 += this.ah * 1956907281;
                                    i25 += i10;
                                    i11 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i3 - i19;
                        i19 -= i2;
                        i12 = this.bg[i2];
                        i26 = i11;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i12, 0, 0, i25 >> 14, i26 >> 14, i22, i20, 2141279650);
                            i25 += i10;
                            i22 += i21;
                            i12 += this.ah * 1956907281;
                            i19 = i27;
                            i26 += i17;
                        }
                        i13 = i23;
                        while (true) {
                            i23 = i13 - 1;
                            if (i23 >= 0) {
                                ai(this.ad, i12, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2138494386);
                                i22 += i21;
                                i12 += this.ah * 1956907281;
                                i25 += i10;
                                i24 += i18;
                                i13 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i11 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                    i22 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i11) {
                        i12 = i6 << 14;
                        if (i3 < 0) {
                            i22 -= i3 * i21;
                            i19 = i12 - (i3 * i18);
                            i24 = i12 - (i3 * i10);
                            i3 = 0;
                        } else {
                            i19 = i12;
                            i24 = i12;
                        }
                        i23 = i4 << 14;
                        if (i < 0) {
                            i23 -= i * i17;
                            i = 0;
                        }
                        if (i10 < i18) {
                            i25 = i11 - i;
                            i11 = i - i3;
                            i12 = this.bg[i3];
                            i27 = i19;
                            while (true) {
                                i26 = i11 - 1;
                                if (i26 < 0) {
                                    break;
                                }
                                ai(this.ad, i12, 0, 0, i24 >> 14, i27 >> 14, i22, i20, 2131245554);
                                i24 += i10;
                                i22 += i21;
                                i12 += this.ah * 1956907281;
                                i27 += i18;
                                i11 = i26;
                            }
                            i19 = i25;
                            while (true) {
                                i25 = i19 - 1;
                                if (i25 >= 0) {
                                    ai(this.ad, i12, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2145331971);
                                    i23 += i17;
                                    i22 += i21;
                                    i12 += this.ah * 1956907281;
                                    i19 = i25;
                                    i24 += i10;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i11 - i;
                        i11 = i - i3;
                        i12 = this.bg[i3];
                        i27 = i19;
                        while (true) {
                            i26 = i11 - 1;
                            if (i26 < 0) {
                                break;
                            }
                            ai(this.ad, i12, 0, 0, i27 >> 14, i24 >> 14, i22, i20, 2145720196);
                            i24 += i10;
                            i22 += i21;
                            i12 += this.ah * 1956907281;
                            i27 += i18;
                            i11 = i26;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i12, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2147043312);
                                i22 += i21;
                                i12 += this.ah * 1956907281;
                                i19 = i25;
                                i24 += i10;
                                i23 += i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i19 = i12 - (i3 * i10);
                        i24 = i12 - (i18 * i3);
                        i22 -= i3 * i21;
                        i3 = 0;
                    } else {
                        i19 = i12;
                        i24 = i12;
                    }
                    i25 = i5 << 14;
                    if (i11 < 0) {
                        i25 -= i11 * i17;
                        i11 = 0;
                    }
                    if (i10 < i18) {
                        i23 = i - i11;
                        i11 -= i3;
                        i12 = this.bg[i3];
                        i27 = i19;
                        while (true) {
                            i26 = i11 - 1;
                            if (i26 < 0) {
                                break;
                            }
                            ai(this.ad, i12, 0, 0, i27 >> 14, i24 >> 14, i22, i20, 2136818760);
                            i24 += i18;
                            i22 += i21;
                            i12 += this.ah * 1956907281;
                            i27 += i10;
                            i11 = i26;
                        }
                        i11 = i23;
                        while (true) {
                            i23 = i11 - 1;
                            if (i23 >= 0) {
                                ai(this.ad, i12, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2139081987);
                                i25 += i17;
                                i22 += i21;
                                i12 += this.ah * 1956907281;
                                i24 += i18;
                                i11 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i - i11;
                    i11 -= i3;
                    i12 = this.bg[i3];
                    i27 = i19;
                    while (true) {
                        i26 = i11 - 1;
                        if (i26 < 0) {
                            break;
                        }
                        ai(this.ad, i12, 0, 0, i24 >> 14, i27 >> 14, i22, i20, 2134840353);
                        i24 += i18;
                        i22 += i21;
                        i12 += this.ah * 1956907281;
                        i27 += i10;
                        i11 = i26;
                    }
                    while (true) {
                        i23--;
                        if (i23 >= 0) {
                            ai(this.ad, i12, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2145736168);
                            i22 += i21;
                            i12 += this.ah * 1956907281;
                            i25 += i17;
                            i24 += i18;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i19 = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
                i22 = ((i7 << 8) - (i4 * i20)) + i20;
                if (i2 < i19) {
                    i12 = i4 << 14;
                    if (i < 0) {
                        i25 = i12 - (i18 * i);
                        i11 = i12 - (i17 * i);
                        i22 -= i * i21;
                        i = 0;
                    } else {
                        i25 = i12;
                        i11 = i12;
                    }
                    i24 = i5 << 14;
                    if (i2 < 0) {
                        i24 -= i2 * i10;
                        i2 = 0;
                    }
                    if ((i == i2 || i18 >= i17) && (i2 != i || i18 <= i10)) {
                        i23 = i19 - i2;
                        i19 = i2 - i;
                        i12 = this.bg[i];
                        i26 = i11;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i12, 0, 0, i26 >> 14, i25 >> 14, i22, i20, 2134937905);
                            i25 += i18;
                            i22 += i21;
                            i12 += this.ah * 1956907281;
                            i19 = i27;
                            i26 += i17;
                        }
                        i13 = i23;
                        while (true) {
                            i23 = i13 - 1;
                            if (i23 >= 0) {
                                ai(this.ad, i12, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2135988153);
                                i22 += i21;
                                i12 += this.ah * 1956907281;
                                i25 += i18;
                                i24 += i10;
                                i13 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i19 - i2;
                    i19 = i2 - i;
                    i12 = this.bg[i];
                    i26 = i11;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i12, 0, 0, i25 >> 14, i26 >> 14, i22, i20, 2138511993);
                        i25 += i18;
                        i22 += i21;
                        i12 += this.ah * 1956907281;
                        i19 = i27;
                        i26 += i17;
                    }
                    i11 = i23;
                    while (true) {
                        i23 = i11 - 1;
                        if (i23 >= 0) {
                            ai(this.ad, i12, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2135674703);
                            i24 += i10;
                            i22 += i21;
                            i12 += this.ah * 1956907281;
                            i25 += i18;
                            i11 = i23;
                        } else {
                            return;
                        }
                    }
                }
                i12 = i4 << 14;
                if (i < 0) {
                    i11 = i12 - (i * i18);
                    i24 = i12 - (i17 * i);
                    i22 -= i * i21;
                    i = 0;
                } else {
                    i11 = i12;
                    i24 = i12;
                }
                i25 = i6 << 14;
                if (i19 < 0) {
                    i25 -= i19 * i10;
                    i19 = 0;
                }
                if ((i19 == i || i18 >= i17) && (i != i19 || i10 <= i17)) {
                    i23 = i2 - i19;
                    i19 -= i;
                    i12 = this.bg[i];
                    i26 = i11;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i12, 0, 0, i24 >> 14, i26 >> 14, i22, i20, 2140934443);
                        i24 += i17;
                        i22 += i21;
                        i12 += this.ah * 1956907281;
                        i19 = i27;
                        i26 += i18;
                    }
                    i13 = i23;
                    while (true) {
                        i23 = i13 - 1;
                        if (i23 >= 0) {
                            ai(this.ad, i12, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2131239319);
                            i22 += i21;
                            i12 += this.ah * 1956907281;
                            i25 += i10;
                            i24 += i17;
                            i13 = i23;
                        } else {
                            return;
                        }
                    }
                }
                i23 = i2 - i19;
                i19 -= i;
                i12 = this.bg[i];
                i26 = i11;
                while (true) {
                    i27 = i19 - 1;
                    if (i27 < 0) {
                        break;
                    }
                    ai(this.ad, i12, 0, 0, i26 >> 14, i24 >> 14, i22, i20, 2143456884);
                    i24 += i17;
                    i22 += i21;
                    i12 += this.ah * 1956907281;
                    i19 = i27;
                    i26 += i18;
                }
                i11 = i23;
                while (true) {
                    i23 = i11 - 1;
                    if (i23 >= 0) {
                        ai(this.ad, i12, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2131299718);
                        i25 += i10;
                        i22 += i21;
                        i12 += this.ah * 1956907281;
                        i24 += i17;
                        i11 = i23;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ak(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        try {
            int[] ar = il.ax.ar(i19, 686523509);
            int al;
            if (ar == null) {
                al = il.ax.al(i19, -1711959919);
                aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2142030299), kr.br(al, i8, 2146397287), kr.br(al, i9, 2139318407), (byte) 16);
                return;
            }
            this.ba = il.ax.ai(i19, (byte) 0);
            this.bk = il.ax.aj(i19, -1800381958);
            int i21 = i5 - i4;
            int i22 = i2 - i;
            int i23 = i6 - i4;
            int i24 = i3 - i;
            int i25 = i8 - i7;
            int i26 = i9 - i7;
            int i27 = i2 != i ? (i21 << 14) / i22 : 0;
            int i28 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
            int i29 = i3 != i ? ((i4 - i6) << 14) / (i - i3) : 0;
            al = (i21 * i24) - (i22 * i23);
            if (al != 0) {
                int i30 = (((i24 * i25) - (i22 * i26)) << 9) / al;
                int i31 = (((i21 * i26) - (i25 * i23)) << 9) / al;
                al = i10 - i11;
                i21 = i13 - i14;
                i22 = i16 - i17;
                i23 = i12 - i10;
                i24 = i15 - i13;
                i25 = i18 - i16;
                i26 = ((i23 * i13) - (i10 * i24)) << 14;
                int i32 = (int) (((((long) ((i24 * i16) - (i13 * i25))) << 3) << 14) / ((long) (this.bq * 1516652957)));
                int i33 = (int) ((((long) ((i25 * i10) - (i23 * i16))) << 14) / ((long) (this.bq * 1516652957)));
                int i34 = ((i13 * al) - (i10 * i21)) << 14;
                int i35 = (int) (((((long) ((i21 * i16) - (i22 * i13))) << 3) << 14) / ((long) (this.bq * 1516652957)));
                int i36 = (int) ((((long) ((i22 * i10) - (i16 * al))) << 14) / ((long) (this.bq * 1516652957)));
                int i37 = ((i21 * i23) - (i24 * al)) << 14;
                int i38 = (int) (((((long) ((i24 * i22) - (i21 * i25))) << 3) << 14) / ((long) (this.bq * 1516652957)));
                int i39 = (int) ((((long) ((al * i25) - (i23 * i22))) << 14) / ((long) (this.bq * 1516652957)));
                int i40;
                int i41;
                int i42;
                int i43;
                int i44;
                int i45;
                int i46;
                if (i > i2 || i > i3) {
                    if (i2 <= i3) {
                        if (i2 < this.bf * 651738037) {
                            if (i3 > this.bf * 651738037) {
                                i3 = this.bf * 651738037;
                            }
                            i22 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                            i40 = ((i8 << 9) - (i30 * i5)) + i30;
                            if (i3 < i22) {
                                i23 = i5 << 14;
                                if (i2 < 0) {
                                    i40 -= i2 * i31;
                                    i21 = i23 - (i28 * i2);
                                    i41 = i23 - (i2 * i27);
                                    i2 = 0;
                                } else {
                                    i21 = i23;
                                    i41 = i23;
                                }
                                al = i6 << 14;
                                if (i3 < 0) {
                                    i3 = 0;
                                    i42 = al - (i3 * i29);
                                } else {
                                    i42 = al;
                                }
                                al = i2 - (this.bo * -1165057787);
                                i43 = i26 + (al * i33);
                                i34 += i36 * al;
                                i37 += al * i39;
                                if ((i3 == i2 || i27 >= i28) && (i2 != i3 || i27 <= i29)) {
                                    i44 = i22 - i3;
                                    al = i3 - i2;
                                    i24 = this.bg[i2];
                                    i45 = i21;
                                    while (true) {
                                        i46 = al - 1;
                                        if (i46 < 0) {
                                            break;
                                        }
                                        ao(this.ad, ar, 0, 0, i24, i45 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1907713476);
                                        i41 += i27;
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        al = i46;
                                        i45 += i28;
                                    }
                                    al = i44;
                                    i46 = i42;
                                    while (true) {
                                        i42 = al - 1;
                                        if (i42 >= 0) {
                                            ao(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 95438821);
                                            i40 += i31;
                                            i24 += this.ah * 1956907281;
                                            i43 += i33;
                                            i34 += i36;
                                            i37 += i39;
                                            al = i42;
                                            i46 += i29;
                                            i41 += i27;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i44 = i22 - i3;
                                al = i3 - i2;
                                i24 = this.bg[i2];
                                i45 = i21;
                                while (true) {
                                    i46 = al - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    ao(this.ad, ar, 0, 0, i24, i41 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 2097179838);
                                    i41 += i27;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i46;
                                    i45 += i28;
                                }
                                al = i44;
                                i46 = i42;
                                while (true) {
                                    i42 = al - 1;
                                    if (i42 >= 0) {
                                        ao(this.ad, ar, 0, 0, i24, i41 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 513889386);
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        al = i42;
                                        i46 += i29;
                                        i41 += i27;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            al = i5 << 14;
                            if (i2 < 0) {
                                i21 = al - (i27 * i2);
                                i42 = al - (i28 * i2);
                                i40 -= i2 * i31;
                                i2 = 0;
                            } else {
                                i21 = al;
                                i42 = al;
                            }
                            i44 = i4 << 14;
                            if (i22 < 0) {
                                i44 -= i22 * i29;
                                al = 0;
                            } else {
                                al = i22;
                            }
                            i22 = i2 - (this.bo * -1165057787);
                            i43 = i26 + (i22 * i33);
                            i34 += i22 * i36;
                            i37 += i22 * i39;
                            if (i27 < i28) {
                                i46 = i3 - al;
                                al -= i2;
                                i24 = this.bg[i2];
                                i45 = i21;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 < 0) {
                                        break;
                                    }
                                    ao(this.ad, ar, 0, 0, i24, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 541950680);
                                    i42 += i28;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i41;
                                    i45 += i27;
                                }
                                i21 = i46;
                                while (true) {
                                    i46 = i21 - 1;
                                    if (i46 >= 0) {
                                        ao(this.ad, ar, 0, 0, i24, i44 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1391294152);
                                        i44 += i29;
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i42 += i28;
                                        i21 = i46;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i46 = i3 - al;
                            al -= i2;
                            i24 = this.bg[i2];
                            i45 = i21;
                            while (true) {
                                i41 = al - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i24, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -1131455696);
                                i42 += i28;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i41;
                                i45 += i27;
                            }
                            i22 = i46;
                            while (true) {
                                i46 = i22 - 1;
                                if (i46 >= 0) {
                                    ao(this.ad, ar, 0, 0, i24, i42 >> 14, i44 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -873598949);
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i42 += i28;
                                    i44 += i29;
                                    i22 = i46;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (i3 < this.bf * 651738037) {
                        if (i > this.bf * 651738037) {
                            i = this.bf * 651738037;
                        }
                        i21 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                        i40 = ((i9 << 9) - (i30 * i6)) + i30;
                        if (i < i21) {
                            i23 = i6 << 14;
                            if (i3 < 0) {
                                i40 -= i3 * i31;
                                i22 = i23 - (i29 * i3);
                                i46 = i23 - (i28 * i3);
                                i3 = 0;
                            } else {
                                i22 = i23;
                                i46 = i23;
                            }
                            al = i4 << 14;
                            if (i < 0) {
                                i = 0;
                                i42 = al - (i * i27);
                            } else {
                                i42 = al;
                            }
                            al = i3 - (this.bo * -1165057787);
                            i43 = i26 + (al * i33);
                            i34 += i36 * al;
                            i37 += al * i39;
                            if (i28 < i29) {
                                i44 = i21 - i;
                                al = i - i3;
                                i24 = this.bg[i3];
                                i45 = i22;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 < 0) {
                                        break;
                                    }
                                    ao(this.ad, ar, 0, 0, i24, i46 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -570360947);
                                    i46 += i28;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i41;
                                    i45 += i29;
                                }
                                al = i44;
                                i41 = i42;
                                while (true) {
                                    i42 = al - 1;
                                    if (i42 >= 0) {
                                        ao(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 835426330);
                                        i40 += i31;
                                        i24 += this.ah * 1956907281;
                                        i43 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        al = i42;
                                        i46 += i28;
                                        i41 += i27;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i44 = i21 - i;
                            al = i - i3;
                            i24 = this.bg[i3];
                            i45 = i22;
                            while (true) {
                                i41 = al - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i24, i45 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1983401592);
                                i46 += i28;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i41;
                                i45 += i29;
                            }
                            al = i44;
                            i41 = i42;
                            while (true) {
                                i42 = al - 1;
                                if (i42 >= 0) {
                                    ao(this.ad, ar, 0, 0, i24, i41 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 2108520990);
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i42;
                                    i46 += i28;
                                    i41 += i27;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i40 -= i3 * i31;
                            i46 = i23 - (i3 * i29);
                            al = i23 - (i3 * i28);
                            i3 = 0;
                        } else {
                            al = i23;
                            i46 = i23;
                        }
                        i44 = i5 << 14;
                        if (i21 < 0) {
                            i44 -= i21 * i27;
                            i22 = 0;
                        } else {
                            i22 = i21;
                        }
                        i21 = i3 - (this.bo * -1165057787);
                        i43 = i26 + (i21 * i33);
                        i34 += i36 * i21;
                        i37 += i21 * i39;
                        if (i28 < i29) {
                            i21 = i22 - i3;
                            i42 = i - i22;
                            i24 = this.bg[i3];
                            i45 = al;
                            while (true) {
                                i41 = i21 - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i24, i45 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -1376899588);
                                i46 += i29;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i21 = i41;
                                i45 += i28;
                            }
                            al = i42;
                            while (true) {
                                i42 = al - 1;
                                if (i42 >= 0) {
                                    ao(this.ad, ar, 0, 0, i24, i44 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -651892386);
                                    i44 += i27;
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    al = i42;
                                    i46 += i29;
                                } else {
                                    return;
                                }
                            }
                        }
                        i21 = i22 - i3;
                        i42 = i - i22;
                        i24 = this.bg[i3];
                        i41 = al;
                        while (true) {
                            i45 = i21 - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -654492124);
                            i46 += i29;
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            i41 += i28;
                            i21 = i45;
                        }
                        al = i42;
                        while (true) {
                            i42 = al - 1;
                            if (i42 >= 0) {
                                ao(this.ad, ar, 0, 0, i24, i46 >> 14, i44 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 1839485736);
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i42;
                                i44 += i27;
                                i46 += i29;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i < this.bf * 651738037) {
                    if (i2 > this.bf * 651738037) {
                        i2 = this.bf * 651738037;
                    }
                    al = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
                    i40 = ((i7 << 9) - (i4 * i30)) + i30;
                    if (i2 < al) {
                        i22 = i4 << 14;
                        if (i < 0) {
                            i42 = i22 - (i29 * i);
                            i21 = i22 - (i * i27);
                            i40 -= i * i31;
                            i = 0;
                        } else {
                            i42 = i22;
                            i21 = i22;
                        }
                        i44 = i5 << 14;
                        if (i2 < 0) {
                            i44 -= i2 * i28;
                            i2 = 0;
                        }
                        i22 = i - (this.bo * -1165057787);
                        i43 = i26 + (i33 * i22);
                        i34 += i36 * i22;
                        i37 += i22 * i39;
                        if ((i == i2 || i29 >= i27) && (i2 != i || i29 <= i28)) {
                            i46 = al - i2;
                            al = i2 - i;
                            i24 = this.bg[i];
                            i45 = i21;
                            while (true) {
                                i41 = al - 1;
                                if (i41 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i24, i45 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 851018438);
                                i42 += i29;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i41;
                                i45 += i27;
                            }
                            i22 = i46;
                            while (true) {
                                i46 = i22 - 1;
                                if (i46 >= 0) {
                                    ao(this.ad, ar, 0, 0, i24, i44 >> 14, i42 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -1265322096);
                                    i40 += i31;
                                    i24 += this.ah * 1956907281;
                                    i43 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i42 += i29;
                                    i44 += i28;
                                    i22 = i46;
                                } else {
                                    return;
                                }
                            }
                        }
                        i46 = al - i2;
                        al = i2 - i;
                        i24 = this.bg[i];
                        i45 = i21;
                        while (true) {
                            i41 = al - 1;
                            if (i41 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i24, i42 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 750132023);
                            i42 += i29;
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            al = i41;
                            i45 += i27;
                        }
                        i21 = i46;
                        while (true) {
                            i46 = i21 - 1;
                            if (i46 >= 0) {
                                ao(this.ad, ar, 0, 0, i24, i42 >> 14, i44 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 34719878);
                                i44 += i28;
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                i42 += i29;
                                i21 = i46;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i4 << 14;
                    if (i < 0) {
                        i46 = i21 - (i * i27);
                        i40 -= i * i31;
                        i22 = i21 - (i29 * i);
                        i = 0;
                    } else {
                        i46 = i21;
                        i22 = i21;
                    }
                    i21 = i6 << 14;
                    if (al < 0) {
                        i21 -= al * i28;
                        al = 0;
                        i42 = i21;
                    } else {
                        i42 = i21;
                    }
                    i21 = i - (this.bo * -1165057787);
                    i43 = i26 + (i33 * i21);
                    i34 += i21 * i36;
                    i37 += i21 * i39;
                    if ((al == i || i29 >= i27) && (i != al || i28 <= i27)) {
                        i21 = al - i;
                        i44 = i2 - al;
                        i24 = this.bg[i];
                        al = i21;
                        i45 = i22;
                        while (true) {
                            i41 = al - 1;
                            if (i41 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i24, i46 >> 14, i45 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 758755368);
                            i46 += i27;
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            al = i41;
                            i45 += i29;
                        }
                        al = i44;
                        i41 = i42;
                        while (true) {
                            i42 = al - 1;
                            if (i42 >= 0) {
                                ao(this.ad, ar, 0, 0, i24, i46 >> 14, i41 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -1250698239);
                                i40 += i31;
                                i24 += this.ah * 1956907281;
                                i43 += i33;
                                i34 += i36;
                                i37 += i39;
                                al = i42;
                                i46 += i27;
                                i41 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = al - i;
                    i44 = i2 - al;
                    i24 = this.bg[i];
                    al = i21;
                    i45 = i22;
                    while (true) {
                        i41 = al - 1;
                        if (i41 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i24, i45 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, -290925919);
                        i46 += i27;
                        i40 += i31;
                        i24 += this.ah * 1956907281;
                        i43 += i33;
                        i34 += i36;
                        i37 += i39;
                        al = i41;
                        i45 += i29;
                    }
                    al = i44;
                    i41 = i42;
                    while (true) {
                        i42 = al - 1;
                        if (i42 >= 0) {
                            ao(this.ad, ar, 0, 0, i24, i41 >> 14, i46 >> 14, i40, i30, i43, i34, i37, i32, i35, i38, 2953783);
                            i40 += i31;
                            i24 += this.ah * 1956907281;
                            i43 += i33;
                            i34 += i36;
                            i37 += i39;
                            al = i42;
                            i46 += i27;
                            i41 += i28;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void al(int[] iArr, int i, int i2, byte b) {
        try {
            this.ad = iArr;
            this.ah = 1312753 * i;
            this.af = 547905375 * i2;
            bv(0, 0, i, i2, 451116027);
            bg(1159265769);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(int[] iArr, int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            if (this.at) {
                if (i5 > this.bl * 1505645037) {
                    i5 = this.bl * 1505645037;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i6 = i + i4;
                int i7 = i5 - i4;
                int i8 = i7 >> 2;
                int i9;
                if (this.bm * -481075153 == 0) {
                    while (true) {
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                        i9 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i9 + 1;
                        iArr[i9] = i2;
                        i9 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i9 + 1;
                        iArr[i9] = i2;
                    }
                    i8 = i7 & 3;
                    while (true) {
                        i8--;
                        if (i8 >= 0) {
                            iArr[i6] = i2;
                            i6++;
                        } else {
                            return;
                        }
                    }
                } else if (this.bm * -481075153 == 254) {
                    while (true) {
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                        i9 = i6 + 1;
                        iArr[i6] = iArr[i9];
                        i6 = i9 + 1;
                        iArr[i9] = iArr[i6];
                        i9 = i6 + 1;
                        iArr[i6] = iArr[i9];
                        i6 = i9 + 1;
                        iArr[i9] = iArr[i6];
                    }
                    i7 &= 3;
                    while (true) {
                        i7--;
                        if (i7 >= 0) {
                            i8 = i6 + 1;
                            iArr[i6] = iArr[i8];
                            i6 = i8;
                        } else {
                            return;
                        }
                    }
                } else {
                    i9 = this.bm * -481075153;
                    int i10 = 256 - (this.bm * -481075153);
                    i10 = (((i10 * (16711935 & i2)) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i2) * i10) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    while (true) {
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                        int i11 = iArr[i6];
                        int i12 = i6 + 1;
                        iArr[i6] = ((((i11 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i11) * i9) >> 8) & 16711935) + i10);
                        i6 = iArr[i12];
                        i11 = i12 + 1;
                        iArr[i12] = (((((i6 & 16711935) * i9) >> 8) & 16711935) + i10) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        i6 = iArr[i11];
                        i12 = i11 + 1;
                        iArr[i11] = (((((i6 & 16711935) * i9) >> 8) & 16711935) + i10) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        i6 = iArr[i12];
                        iArr[i12] = ((((i6 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i6) * i9) >> 8) & 16711935) + i10);
                        i6 = i12 + 1;
                    }
                    i8 = i7 & 3;
                    while (true) {
                        i8--;
                        if (i8 >= 0) {
                            i7 = iArr[i6];
                            iArr[i6] = (((((i7 & 16711935) * i9) >> 8) & 16711935) + i10) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i7) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                            i6++;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void an(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i4;
        int i11 = i2 - i;
        int i12 = i6 - i4;
        int i13 = i3 - i;
        int i14 = i8 - i7;
        int i15 = i9 - i7;
        int i16 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i17 = i != i2 ? (i10 << 14) / i11 : 0;
        int i18 = i != i3 ? (i12 << 14) / i13 : 0;
        int i19 = (i13 * i10) - (i11 * i12);
        if (i19 != 0) {
            int i20 = (((i13 * i14) - (i11 * i15)) << 8) / i19;
            int i21 = (((i10 * i15) - (i12 * i14)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i19 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                        i22 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i19) {
                            i12 = i5 << 14;
                            if (i2 < 0) {
                                i22 -= i2 * i21;
                                i10 = i12 - (i2 * i16);
                                i23 = i12 - (i17 * i2);
                                i2 = 0;
                            } else {
                                i10 = i12;
                                i23 = i12;
                            }
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i24 -= i3 * i18;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i17 >= i16) && (i3 != i2 || i17 <= i18)) {
                                i25 = i19 - i3;
                                i19 = i3 - i2;
                                i11 = this.bg[i2];
                                while (true) {
                                    i26 = i10;
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2130942861);
                                    i23 += i17;
                                    i10 = i26 + i16;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i19 = i27;
                                }
                                i10 = i25;
                                while (true) {
                                    i25 = i10 - 1;
                                    if (i25 >= 0) {
                                        ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2136233667);
                                        i22 += i21;
                                        i11 += this.ah * 1956907281;
                                        i23 += i17;
                                        i10 = i25;
                                        i24 += i18;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i19 - i3;
                            i19 = i3 - i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2133316907);
                                i23 += i17;
                                i10 = i26 + i16;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2133428757);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i11 = i5 << 14;
                        if (i2 < 0) {
                            i10 = i11 - (i2 * i17);
                            i23 = i11 - (i16 * i2);
                            i22 -= i2 * i21;
                            i2 = 0;
                        } else {
                            i23 = i11;
                            i10 = i11;
                        }
                        i24 = i4 << 14;
                        if (i19 < 0) {
                            i24 -= i19 * i18;
                            i19 = 0;
                        }
                        if (i17 < i16) {
                            i25 = i3 - i19;
                            i19 -= i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2135856175);
                                i10 = i26 + i17;
                                i23 += i16;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2142697900);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i3 - i19;
                        i19 -= i2;
                        i11 = this.bg[i2];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2132841022);
                            i10 = i26 + i17;
                            i23 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2144950627);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i16;
                                i10 = i25;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i19 = i2 > this.bf * 651738037 ? this.bf * 651738037 : i2;
                    i22 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i19) {
                        i12 = i6 << 14;
                        if (i3 < 0) {
                            i22 -= i3 * i21;
                            i10 = i12 - (i3 * i18);
                            i23 = i12 - (i3 * i16);
                            i3 = 0;
                        } else {
                            i23 = i12;
                            i10 = i12;
                        }
                        i24 = i4 << 14;
                        if (i < 0) {
                            i24 -= i17 * i;
                            i = 0;
                        }
                        if (i16 < i18) {
                            i25 = i19 - i;
                            i19 = i - i3;
                            i11 = this.bg[i3];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2142845238);
                                i23 += i16;
                                i10 = i26 + i18;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2146392003);
                                    i24 += i17;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i19 - i;
                        i19 = i - i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2141019739);
                            i23 += i16;
                            i10 = i26 + i18;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2133498766);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i16;
                                i10 = i25;
                                i24 += i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i22 -= i3 * i21;
                        i23 = i12 - (i18 * i3);
                        i10 = i12 - (i3 * i16);
                        i3 = 0;
                    } else {
                        i10 = i12;
                        i23 = i12;
                    }
                    i24 = i5 << 14;
                    if (i19 < 0) {
                        i24 -= i19 * i17;
                        i19 = 0;
                    }
                    if (i16 < i18) {
                        i25 = i - i19;
                        i19 -= i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2143445213);
                            i10 = i26 + i16;
                            i23 += i18;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        while (true) {
                            i25--;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2143648932);
                                i24 += i17;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i - i19;
                    i19 -= i3;
                    i11 = this.bg[i3];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2135331941);
                        i10 = i26 + i16;
                        i23 += i18;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    i10 = i25;
                    while (true) {
                        i25 = i10 - 1;
                        if (i25 >= 0) {
                            ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2142270059);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i18;
                            i10 = i25;
                            i24 += i17;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i19 = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
                i22 = ((i7 << 8) - (i4 * i20)) + i20;
                if (i2 < i19) {
                    i11 = i4 << 14;
                    if (i < 0) {
                        i24 = i11 - (i18 * i);
                        i10 = i11 - (i17 * i);
                        i22 -= i * i21;
                        i = 0;
                    } else {
                        i10 = i11;
                        i24 = i11;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i25 -= i2 * i16;
                        i2 = 0;
                    }
                    if ((i == i2 || i18 >= i17) && (i2 != i || i18 <= i16)) {
                        i23 = i19 - i2;
                        i19 = i2 - i;
                        i11 = this.bg[i];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i24 >> 14, i22, i20, 2133062010);
                            i24 += i18;
                            i10 = i26 + i17;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ai(this.ad, i11, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2140082156);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i23;
                                i25 += i16;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i19 - i2;
                    i19 = i2 - i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i24 >> 14, i26 >> 14, i22, i20, 2140571679);
                        i24 += i18;
                        i10 = i26 + i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ai(this.ad, i11, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2139645842);
                            i25 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i23;
                            i24 += i18;
                        } else {
                            return;
                        }
                    }
                }
                i11 = i4 << 14;
                if (i < 0) {
                    i10 = i11 - (i * i18);
                    i25 = i11 - (i17 * i);
                    i22 -= i * i21;
                    i = 0;
                } else {
                    i25 = i11;
                    i10 = i11;
                }
                i23 = i6 << 14;
                if (i19 < 0) {
                    i23 -= i19 * i16;
                    i19 = 0;
                }
                if ((i19 == i || i18 >= i17) && (i != i19 || i16 <= i17)) {
                    i24 = i2 - i19;
                    i19 -= i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i25 >> 14, i26 >> 14, i22, i20, 2143744171);
                        i10 = i26 + i18;
                        i25 += i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    while (true) {
                        i24--;
                        if (i24 >= 0) {
                            ai(this.ad, i11, 0, 0, i25 >> 14, i23 >> 14, i22, i20, 2147155697);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i16;
                            i25 += i17;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i2 - i19;
                i19 -= i;
                i11 = this.bg[i];
                i26 = i10;
                i27 = i25;
                while (true) {
                    i25 = i19 - 1;
                    if (i25 < 0) {
                        break;
                    }
                    ai(this.ad, i11, 0, 0, i26 >> 14, i27 >> 14, i22, i20, 2133701221);
                    i27 += i17;
                    i22 += i21;
                    i11 += this.ah * 1956907281;
                    i19 = i25;
                    i26 += i18;
                }
                i19 = i24;
                i25 = i23;
                while (true) {
                    i23 = i19 - 1;
                    if (i23 >= 0) {
                        ai(this.ad, i11, 0, 0, i25 >> 14, i27 >> 14, i22, i20, 2146258249);
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i23;
                        i25 += i16;
                        i27 += i17;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x06a3 A:{LOOP_END, LOOP:0: B:26:0x008d->B:168:0x06a3} */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x01b7 A:{SYNTHETIC, EDGE_INSN: B:201:0x01b7->B:34:0x01b7 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x06bc A:{LOOP_END, LOOP:2: B:42:0x01e7->B:174:0x06bc} */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0321 A:{SYNTHETIC, EDGE_INSN: B:203:0x0321->B:74:0x0321 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0693  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A:{Catch:{ RuntimeException -> 0x0665 }} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x06e5 A:{LOOP_END, LOOP:4: B:97:0x03a7->B:187:0x06e5} */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04d1 A:{SYNTHETIC, EDGE_INSN: B:205:0x04d1->B:105:0x04d1 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x037f A:{Catch:{ RuntimeException -> 0x0665 }} */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ao(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        try {
            if (this.at) {
                if (i5 > this.bl * 1505645037) {
                    i5 = this.bl * 1505645037;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i15 = i3 + i4;
                int i16 = i6 + (i4 * i7);
                int i17 = i5 - i4;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29;
                int i30;
                int i31;
                if (this.ba) {
                    i18 = i4 - (this.bd * -1240378447);
                    i19 = i8 + ((i11 >> 3) * i18);
                    i20 = i9 + ((i12 >> 3) * i18);
                    i21 = i10 + (i18 * (i13 >> 3));
                    i18 = i21 >> 12;
                    if (i18 != 0) {
                        i22 = i19 / i18;
                        i18 = i20 / i18;
                        if (i22 >= 0) {
                            if (i22 > 4032) {
                                i23 = i18;
                                i24 = 4032;
                            } else {
                                i23 = i18;
                                i24 = i22;
                            }
                            i25 = i19 + i11;
                            i19 = i20 + i12;
                            i26 = i21 + i13;
                            i18 = i26 >> 12;
                            if (i18 == 0) {
                                i22 = i25 / i18;
                                i18 = i19 / i18;
                                if (i22 < 0) {
                                    i22 = 0;
                                } else if (i22 > 4032) {
                                    i22 = 4032;
                                }
                            } else {
                                i22 = 0;
                                i18 = 0;
                            }
                            i27 = ((i18 - i23) >> 3) + (((i22 - i24) >> 3) << 20);
                            i21 = i17 >> 3;
                            i28 = i7 << 3;
                            i20 = i16 >> 8;
                            i29 = (i24 << 20) + i23;
                            if (this.bk) {
                                if (i21 > 0) {
                                    i23 = i18;
                                    i24 = i16;
                                    while (true) {
                                        i18 = iArr2[(i29 & 4032) + (i29 >>> 26)];
                                        if (i18 != 0) {
                                            iArr[i15] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i18) * i20) & -16711936)) >> 8;
                                        }
                                        i18 = i15 + 1;
                                        i15 = i29 + i27;
                                        i16 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i16) * i20) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i27;
                                        i16 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i16) * i20) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i27;
                                        i16 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i16) * i20) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i27;
                                        i16 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & 16711935) * i20) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i16) * i20) & 16711680)) >> 8;
                                        }
                                        i18++;
                                        i15 += i27;
                                        i16 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & 16711935) * i20) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i16) * i20) & 16711680)) >> 8;
                                        }
                                        i18++;
                                        i15 += i27;
                                        i16 = iArr2[(i15 & 4032) + (i15 >>> 26)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i16) * i20) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i27;
                                        i15 = iArr2[(i15 >>> 26) + (i15 & 4032)];
                                        if (i15 != 0) {
                                            iArr[i18] = ((((i15 & 16711935) * i20) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i20) & 16711680)) >> 8;
                                        }
                                        i15 = i18 + 1;
                                        i25 += i11;
                                        i19 += i12;
                                        i26 += i13;
                                        i20 = i26 >> 12;
                                        if (i20 != 0) {
                                            i18 = i25 / i20;
                                            i20 = i19 / i20;
                                            if (i18 >= 0) {
                                                if (i18 > 4032) {
                                                    i18 = 4032;
                                                    i16 = i20;
                                                } else {
                                                    i16 = i20;
                                                }
                                                i29 = i23 + (i22 << 20);
                                                i27 = ((i16 - i23) >> 3) + (((i18 - i22) >> 3) << 20);
                                                i24 += i28;
                                                i20 = i24 >> 8;
                                                i21--;
                                                if (i21 > 0) {
                                                    break;
                                                }
                                                i22 = i18;
                                                i23 = i16;
                                            }
                                        } else {
                                            i20 = 0;
                                        }
                                        i18 = 0;
                                        i16 = i20;
                                        i29 = i23 + (i22 << 20);
                                        i27 = ((i16 - i23) >> 3) + (((i18 - i22) >> 3) << 20);
                                        i24 += i28;
                                        i20 = i24 >> 8;
                                        i21--;
                                        if (i21 > 0) {
                                        }
                                    }
                                    i22 = i29;
                                    i18 = i15;
                                } else {
                                    i22 = i29;
                                    i18 = i15;
                                }
                                i15 = i17 & 7;
                                if (i15 > 0) {
                                    do {
                                        i19 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                                        if (i19 != 0) {
                                            iArr[i18] = ((((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i19) * i20) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i22 += i27;
                                        i15--;
                                    } while (i15 > 0);
                                    return;
                                }
                                return;
                            }
                            if (i21 > 0) {
                                i23 = i22;
                                i24 = i18;
                                i30 = i16;
                                i31 = i21;
                                while (true) {
                                    i18 = iArr2[(i29 & 4032) + (i29 >>> 26)];
                                    i22 = i15 + 1;
                                    iArr[i15] = ((((i18 & 16711935) * i20) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i20) & 16711680)) >> 8;
                                    i18 = i29 + i27;
                                    i15 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                    i16 = i22 + 1;
                                    iArr[i22] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i15) * i20) & -16711936)) >> 8;
                                    i18 += i27;
                                    i22 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                    i15 = i16 + 1;
                                    iArr[i16] = ((((i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i22) * i20) & -16711936)) >> 8;
                                    i18 += i27;
                                    i22 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                                    i16 = i15 + 1;
                                    iArr[i15] = ((((i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i22) * i20) & -16711936)) >> 8;
                                    i18 += i27;
                                    i22 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                    i15 = i16 + 1;
                                    iArr[i16] = ((((i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i22) * i20) & -16711936)) >> 8;
                                    i18 += i27;
                                    i22 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                                    i16 = i15 + 1;
                                    iArr[i15] = ((((i22 & 16711935) * i20) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i22) * i20) & 16711680)) >> 8;
                                    i18 += i27;
                                    i22 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                                    i15 = i16 + 1;
                                    iArr[i16] = ((((i22 & 16711935) * i20) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i22) * i20) & 16711680)) >> 8;
                                    i18 += i27;
                                    i22 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                                    i18 = i15 + 1;
                                    iArr[i15] = ((((i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20) & 16711680) + (((16711935 & i22) * i20) & -16711936)) >> 8;
                                    i25 += i11;
                                    i22 = i19 + i12;
                                    i26 += i13;
                                    i15 = i26 >> 12;
                                    if (i15 != 0) {
                                        i16 = i25 / i15;
                                        i15 = i22 / i15;
                                        if (i16 >= 0) {
                                            if (i16 > 4032) {
                                                i16 = 4032;
                                                i21 = i15;
                                            } else {
                                                i21 = i15;
                                            }
                                            i29 = (i23 << 20) + i24;
                                            i27 = (((i16 - i23) >> 3) << 20) + ((i21 - i24) >> 3);
                                            i30 += i28;
                                            i20 = i30 >> 8;
                                            i31--;
                                            if (i31 > 0) {
                                                break;
                                            }
                                            i15 = i18;
                                            i19 = i22;
                                            i23 = i16;
                                            i24 = i21;
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    i16 = 0;
                                    i21 = i15;
                                    i29 = (i23 << 20) + i24;
                                    i27 = (((i16 - i23) >> 3) << 20) + ((i21 - i24) >> 3);
                                    i30 += i28;
                                    i20 = i30 >> 8;
                                    i31--;
                                    if (i31 > 0) {
                                    }
                                }
                                i19 = i17;
                                i22 = i29;
                            } else {
                                i18 = i15;
                                i19 = i17;
                                i22 = i29;
                            }
                            i15 = i19 & 7;
                            if (i15 > 0) {
                                while (true) {
                                    i19 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                                    iArr[i18] = ((((i19 & 16711935) * i20) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i20) & 16711680)) >> 8;
                                    i22 += i27;
                                    i15--;
                                    if (i15 > 0) {
                                        i18++;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                    }
                    i18 = 0;
                    i23 = i18;
                    i24 = 0;
                    i25 = i19 + i11;
                    i19 = i20 + i12;
                    i26 = i21 + i13;
                    i18 = i26 >> 12;
                    if (i18 == 0) {
                    }
                    i27 = ((i18 - i23) >> 3) + (((i22 - i24) >> 3) << 20);
                    i21 = i17 >> 3;
                    i28 = i7 << 3;
                    i20 = i16 >> 8;
                    i29 = (i24 << 20) + i23;
                    if (this.bk) {
                    }
                } else {
                    i18 = i4 - (this.bd * -1240378447);
                    i19 = i8 + ((i11 >> 3) * i18);
                    i24 = i9 + ((i12 >> 3) * i18);
                    i21 = i10 + (i18 * (i13 >> 3));
                    i18 = i21 >> 14;
                    if (i18 != 0) {
                        i22 = i19 / i18;
                        i18 = i24 / i18;
                        if (i22 >= 0) {
                            if (i22 > 16256) {
                                i25 = i18;
                                i23 = 16256;
                            } else {
                                i25 = i18;
                                i23 = i22;
                            }
                            i20 = i19 + i11;
                            i19 = i24 + i12;
                            i26 = i21 + i13;
                            i18 = i26 >> 14;
                            if (i18 == 0) {
                                i22 = i20 / i18;
                                i18 = i19 / i18;
                                if (i22 < 0) {
                                    i22 = 0;
                                } else if (i22 > 16256) {
                                    i22 = 16256;
                                }
                            } else {
                                i22 = 0;
                                i18 = 0;
                            }
                            i29 = (i23 << 18) + i25;
                            i25 = ((i18 - i25) >> 3) + (((i22 - i23) >> 3) << 18);
                            i30 = i17 >> 3;
                            i28 = i7 << 3;
                            i23 = i16 >> 8;
                            if (this.bk) {
                                if (i30 > 0) {
                                    i24 = i18;
                                    i21 = i16;
                                    while (true) {
                                        i18 = iArr2[(i29 >>> 25) + (i29 & 16256)];
                                        if (i18 != 0) {
                                            iArr[i15] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i18) * i23) & -16711936)) >> 8;
                                        }
                                        i18 = i15 + 1;
                                        i15 = i29 + i25;
                                        i16 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i16) * i23) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i25;
                                        i16 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i16) * i23) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i25;
                                        i16 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i16) * i23) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i25;
                                        i16 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & 16711935) * i23) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i16) * i23) & 16711680)) >> 8;
                                        }
                                        i18++;
                                        i15 += i25;
                                        i16 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & 16711935) * i23) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i16) * i23) & 16711680)) >> 8;
                                        }
                                        i18++;
                                        i15 += i25;
                                        i16 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                                        if (i16 != 0) {
                                            iArr[i18] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i16) * i23) & -16711936)) >> 8;
                                        }
                                        i18++;
                                        i15 += i25;
                                        i15 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                                        if (i15 != 0) {
                                            iArr[i18] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i15) * i23) & -16711936)) >> 8;
                                        }
                                        i15 = i18 + 1;
                                        i20 += i11;
                                        i19 += i12;
                                        i26 += i13;
                                        i25 = i26 >> 14;
                                        if (i25 != 0) {
                                            i18 = i20 / i25;
                                            i16 = i19 / i25;
                                            if (i18 < 0) {
                                                i18 = 0;
                                            } else if (i18 > 16256) {
                                                i18 = 16256;
                                            }
                                        } else {
                                            i16 = 0;
                                            i18 = 0;
                                        }
                                        i29 = (i22 << 18) + i24;
                                        i25 = ((i16 - i24) >> 3) + (((i18 - i22) >> 3) << 18);
                                        i21 += i28;
                                        i23 = i21 >> 8;
                                        i30--;
                                        if (i30 <= 0) {
                                            break;
                                        }
                                        i22 = i18;
                                        i24 = i16;
                                    }
                                    i22 = i29;
                                } else {
                                    i22 = i29;
                                }
                                i18 = i17 & 7;
                                if (i18 > 0) {
                                    do {
                                        i19 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                                        if (i19 != 0) {
                                            iArr[i15] = ((((i19 & 16711935) * i23) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i23) & 16711680)) >> 8;
                                        }
                                        i15++;
                                        i22 += i25;
                                        i18--;
                                    } while (i18 > 0);
                                    return;
                                }
                                return;
                            }
                            if (i30 > 0) {
                                i24 = i22;
                                i21 = i18;
                                i31 = i30;
                                i27 = i16;
                                while (true) {
                                    i18 = iArr2[(i29 & 16256) + (i29 >>> 25)];
                                    i22 = i15 + 1;
                                    iArr[i15] = ((((i18 & 16711935) * i23) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i23) & 16711680)) >> 8;
                                    i18 = i29 + i25;
                                    i15 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                                    i16 = i22 + 1;
                                    iArr[i22] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i15) * i23) & -16711936)) >> 8;
                                    i18 += i25;
                                    i22 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                                    i15 = i16 + 1;
                                    iArr[i16] = ((((i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i22) * i23) & -16711936)) >> 8;
                                    i18 += i25;
                                    i22 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                                    i16 = i15 + 1;
                                    iArr[i15] = ((((i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i22) * i23) & -16711936)) >> 8;
                                    i18 += i25;
                                    i22 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                                    i15 = i16 + 1;
                                    iArr[i16] = ((((i22 & 16711935) * i23) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i22) * i23) & 16711680)) >> 8;
                                    i18 += i25;
                                    i22 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                                    i16 = i15 + 1;
                                    iArr[i15] = ((((i22 & 16711935) * i23) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i22) * i23) & 16711680)) >> 8;
                                    i18 += i25;
                                    i22 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                                    i30 = i16 + 1;
                                    iArr[i16] = ((((i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i22) * i23) & -16711936)) >> 8;
                                    i18 += i25;
                                    i18 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                                    i15 = i30 + 1;
                                    iArr[i30] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i23) & 16711680) + (((16711935 & i18) * i23) & -16711936)) >> 8;
                                    i22 = i20 + i11;
                                    i18 = i19 + i12;
                                    i26 += i13;
                                    i19 = i26 >> 14;
                                    if (i19 != 0) {
                                        i16 = i22 / i19;
                                        i19 = i18 / i19;
                                        if (i16 >= 0) {
                                            if (i16 > 16256) {
                                                i16 = 16256;
                                                i30 = i19;
                                            } else {
                                                i30 = i19;
                                            }
                                            i29 = (i24 << 18) + i21;
                                            i25 = ((i30 - i21) >> 3) + (((i16 - i24) >> 3) << 18);
                                            i27 += i28;
                                            i23 = i27 >> 8;
                                            i31--;
                                            if (i31 > 0) {
                                                break;
                                            }
                                            i19 = i18;
                                            i20 = i22;
                                            i24 = i16;
                                            i21 = i30;
                                        }
                                    } else {
                                        i19 = 0;
                                    }
                                    i16 = 0;
                                    i30 = i19;
                                    i29 = (i24 << 18) + i21;
                                    i25 = ((i30 - i21) >> 3) + (((i16 - i24) >> 3) << 18);
                                    i27 += i28;
                                    i23 = i27 >> 8;
                                    i31--;
                                    if (i31 > 0) {
                                    }
                                }
                                i22 = i15;
                                i18 = i29;
                            } else {
                                i22 = i15;
                                i18 = i29;
                            }
                            i15 = i17 & 7;
                            if (i15 > 0) {
                                while (true) {
                                    i19 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                                    iArr[i22] = ((((i19 & 16711935) * i23) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i23) & 16711680)) >> 8;
                                    i18 += i25;
                                    i15--;
                                    if (i15 > 0) {
                                        i22++;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                    }
                    i18 = 0;
                    i25 = i18;
                    i23 = 0;
                    i20 = i19 + i11;
                    i19 = i24 + i12;
                    i26 = i21 + i13;
                    i18 = i26 >> 14;
                    if (i18 == 0) {
                    }
                    i29 = (i23 << 18) + i25;
                    i25 = ((i18 - i25) >> 3) + (((i22 - i23) >> 3) << 18);
                    i30 = i17 >> 3;
                    i28 = i7 << 3;
                    i23 = i16 >> 8;
                    if (this.bk) {
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("be.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ap() {
    }

    public void as() {
    }

    /* Access modifiers changed, original: final */
    public final void at(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i4;
        int i11 = i2 - i;
        int i12 = i6 - i4;
        int i13 = i3 - i;
        int i14 = i8 - i7;
        int i15 = i9 - i7;
        int i16 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i17 = i != i2 ? (i10 << 14) / i11 : 0;
        int i18 = i != i3 ? (i12 << 14) / i13 : 0;
        int i19 = (i13 * i10) - (i11 * i12);
        if (i19 != 0) {
            int i20 = (((i13 * i14) - (i11 * i15)) << 8) / i19;
            int i21 = (((i10 * i15) - (i12 * i14)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i19 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                        i22 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i19) {
                            i12 = i5 << 14;
                            if (i2 < 0) {
                                i22 -= i2 * i21;
                                i10 = i12 - (i2 * i16);
                                i23 = i12 - (i17 * i2);
                                i2 = 0;
                            } else {
                                i10 = i12;
                                i23 = i12;
                            }
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i24 -= i3 * i18;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i17 >= i16) && (i3 != i2 || i17 <= i18)) {
                                i25 = i19 - i3;
                                i19 = i3 - i2;
                                i11 = this.bg[i2];
                                while (true) {
                                    i26 = i10;
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2144985790);
                                    i23 += i17;
                                    i10 = i26 + i16;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i19 = i27;
                                }
                                i10 = i25;
                                while (true) {
                                    i25 = i10 - 1;
                                    if (i25 >= 0) {
                                        ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2131381765);
                                        i22 += i21;
                                        i11 += this.ah * 1956907281;
                                        i23 += i17;
                                        i10 = i25;
                                        i24 += i18;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i19 - i3;
                            i19 = i3 - i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2133615149);
                                i23 += i17;
                                i10 = i26 + i16;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2141826837);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i11 = i5 << 14;
                        if (i2 < 0) {
                            i10 = i11 - (i2 * i17);
                            i23 = i11 - (i16 * i2);
                            i22 -= i2 * i21;
                            i2 = 0;
                        } else {
                            i23 = i11;
                            i10 = i11;
                        }
                        i24 = i4 << 14;
                        if (i19 < 0) {
                            i24 -= i19 * i18;
                            i19 = 0;
                        }
                        if (i17 < i16) {
                            i25 = i3 - i19;
                            i19 -= i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2131563830);
                                i10 = i26 + i17;
                                i23 += i16;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2137805097);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i3 - i19;
                        i19 -= i2;
                        i11 = this.bg[i2];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2135226711);
                            i10 = i26 + i17;
                            i23 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2139818705);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i16;
                                i10 = i25;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i19 = i2 > this.bf * 651738037 ? this.bf * 651738037 : i2;
                    i22 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i19) {
                        i12 = i6 << 14;
                        if (i3 < 0) {
                            i22 -= i3 * i21;
                            i10 = i12 - (i3 * i18);
                            i23 = i12 - (i3 * i16);
                            i3 = 0;
                        } else {
                            i23 = i12;
                            i10 = i12;
                        }
                        i24 = i4 << 14;
                        if (i < 0) {
                            i24 -= i17 * i;
                            i = 0;
                        }
                        if (i16 < i18) {
                            i25 = i19 - i;
                            i19 = i - i3;
                            i11 = this.bg[i3];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2136307807);
                                i23 += i16;
                                i10 = i26 + i18;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2134853560);
                                    i24 += i17;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i19 - i;
                        i19 = i - i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2147137015);
                            i23 += i16;
                            i10 = i26 + i18;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2144605539);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i16;
                                i10 = i25;
                                i24 += i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i22 -= i3 * i21;
                        i23 = i12 - (i18 * i3);
                        i10 = i12 - (i3 * i16);
                        i3 = 0;
                    } else {
                        i10 = i12;
                        i23 = i12;
                    }
                    i24 = i5 << 14;
                    if (i19 < 0) {
                        i24 -= i19 * i17;
                        i19 = 0;
                    }
                    if (i16 < i18) {
                        i25 = i - i19;
                        i19 -= i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2134848398);
                            i10 = i26 + i16;
                            i23 += i18;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        while (true) {
                            i25--;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2139163256);
                                i24 += i17;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i - i19;
                    i19 -= i3;
                    i11 = this.bg[i3];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2143360228);
                        i10 = i26 + i16;
                        i23 += i18;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    i10 = i25;
                    while (true) {
                        i25 = i10 - 1;
                        if (i25 >= 0) {
                            ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2147330449);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i18;
                            i10 = i25;
                            i24 += i17;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i19 = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
                i22 = ((i7 << 8) - (i4 * i20)) + i20;
                if (i2 < i19) {
                    i11 = i4 << 14;
                    if (i < 0) {
                        i24 = i11 - (i18 * i);
                        i10 = i11 - (i17 * i);
                        i22 -= i * i21;
                        i = 0;
                    } else {
                        i10 = i11;
                        i24 = i11;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i25 -= i2 * i16;
                        i2 = 0;
                    }
                    if ((i == i2 || i18 >= i17) && (i2 != i || i18 <= i16)) {
                        i23 = i19 - i2;
                        i19 = i2 - i;
                        i11 = this.bg[i];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i24 >> 14, i22, i20, 2131090204);
                            i24 += i18;
                            i10 = i26 + i17;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ai(this.ad, i11, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2134469458);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i23;
                                i25 += i16;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i19 - i2;
                    i19 = i2 - i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i24 >> 14, i26 >> 14, i22, i20, 2142415974);
                        i24 += i18;
                        i10 = i26 + i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ai(this.ad, i11, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2134512036);
                            i25 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i23;
                            i24 += i18;
                        } else {
                            return;
                        }
                    }
                }
                i11 = i4 << 14;
                if (i < 0) {
                    i10 = i11 - (i * i18);
                    i25 = i11 - (i17 * i);
                    i22 -= i * i21;
                    i = 0;
                } else {
                    i25 = i11;
                    i10 = i11;
                }
                i23 = i6 << 14;
                if (i19 < 0) {
                    i23 -= i19 * i16;
                    i19 = 0;
                }
                if ((i19 == i || i18 >= i17) && (i != i19 || i16 <= i17)) {
                    i24 = i2 - i19;
                    i19 -= i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i25 >> 14, i26 >> 14, i22, i20, 2137960585);
                        i10 = i26 + i18;
                        i25 += i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    while (true) {
                        i24--;
                        if (i24 >= 0) {
                            ai(this.ad, i11, 0, 0, i25 >> 14, i23 >> 14, i22, i20, 2137350403);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i16;
                            i25 += i17;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i2 - i19;
                i19 -= i;
                i11 = this.bg[i];
                i26 = i10;
                i27 = i25;
                while (true) {
                    i25 = i19 - 1;
                    if (i25 < 0) {
                        break;
                    }
                    ai(this.ad, i11, 0, 0, i26 >> 14, i27 >> 14, i22, i20, 2140938466);
                    i27 += i17;
                    i22 += i21;
                    i11 += this.ah * 1956907281;
                    i19 = i25;
                    i26 += i18;
                }
                i19 = i24;
                i25 = i23;
                while (true) {
                    i23 = i19 - 1;
                    if (i23 >= 0) {
                        ai(this.ad, i11, 0, 0, i25 >> 14, i27 >> 14, i22, i20, 2145899302);
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i23;
                        i25 += i16;
                        i27 += i17;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void au() {
    }

    /* Access modifiers changed, original: final */
    public final void av(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i4;
        int i11 = i2 - i;
        int i12 = i6 - i4;
        int i13 = i3 - i;
        int i14 = i8 - i7;
        int i15 = i9 - i7;
        int i16 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i17 = i != i2 ? (i10 << 14) / i11 : 0;
        int i18 = i != i3 ? (i12 << 14) / i13 : 0;
        int i19 = (i13 * i10) - (i11 * i12);
        if (i19 != 0) {
            int i20 = (((i13 * i14) - (i11 * i15)) << 8) / i19;
            int i21 = (((i10 * i15) - (i12 * i14)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i19 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                        i22 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i19) {
                            i12 = i5 << 14;
                            if (i2 < 0) {
                                i22 -= i2 * i21;
                                i10 = i12 - (i2 * i16);
                                i23 = i12 - (i17 * i2);
                                i2 = 0;
                            } else {
                                i10 = i12;
                                i23 = i12;
                            }
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i24 -= i3 * i18;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i17 >= i16) && (i3 != i2 || i17 <= i18)) {
                                i25 = i19 - i3;
                                i19 = i3 - i2;
                                i11 = this.bg[i2];
                                while (true) {
                                    i26 = i10;
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2134502937);
                                    i23 += i17;
                                    i10 = i26 + i16;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i19 = i27;
                                }
                                i10 = i25;
                                while (true) {
                                    i25 = i10 - 1;
                                    if (i25 >= 0) {
                                        ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2136976527);
                                        i22 += i21;
                                        i11 += this.ah * 1956907281;
                                        i23 += i17;
                                        i10 = i25;
                                        i24 += i18;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i19 - i3;
                            i19 = i3 - i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2136158915);
                                i23 += i17;
                                i10 = i26 + i16;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2141639715);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i17;
                                } else {
                                    return;
                                }
                            }
                        }
                        i11 = i5 << 14;
                        if (i2 < 0) {
                            i10 = i11 - (i2 * i17);
                            i23 = i11 - (i16 * i2);
                            i22 -= i2 * i21;
                            i2 = 0;
                        } else {
                            i23 = i11;
                            i10 = i11;
                        }
                        i24 = i4 << 14;
                        if (i19 < 0) {
                            i24 -= i19 * i18;
                            i19 = 0;
                        }
                        if (i17 < i16) {
                            i25 = i3 - i19;
                            i19 -= i2;
                            i11 = this.bg[i2];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2130921281);
                                i10 = i26 + i17;
                                i23 += i16;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2145207435);
                                    i24 += i18;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i3 - i19;
                        i19 -= i2;
                        i11 = this.bg[i2];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2142507565);
                            i10 = i26 + i17;
                            i23 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2137214620);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i16;
                                i10 = i25;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i19 = i2 > this.bf * 651738037 ? this.bf * 651738037 : i2;
                    i22 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i19) {
                        i12 = i6 << 14;
                        if (i3 < 0) {
                            i22 -= i3 * i21;
                            i10 = i12 - (i3 * i18);
                            i23 = i12 - (i3 * i16);
                            i3 = 0;
                        } else {
                            i23 = i12;
                            i10 = i12;
                        }
                        i24 = i4 << 14;
                        if (i < 0) {
                            i24 -= i17 * i;
                            i = 0;
                        }
                        if (i16 < i18) {
                            i25 = i19 - i;
                            i19 = i - i3;
                            i11 = this.bg[i3];
                            while (true) {
                                i26 = i10;
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2136706934);
                                i23 += i16;
                                i10 = i26 + i18;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i27;
                            }
                            while (true) {
                                i25--;
                                if (i25 >= 0) {
                                    ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2142924439);
                                    i24 += i17;
                                    i22 += i21;
                                    i11 += this.ah * 1956907281;
                                    i23 += i16;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i19 - i;
                        i19 = i - i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2133783525);
                            i23 += i16;
                            i10 = i26 + i18;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i10 = i25;
                        while (true) {
                            i25 = i10 - 1;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2135987439);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i16;
                                i10 = i25;
                                i24 += i17;
                            } else {
                                return;
                            }
                        }
                    }
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i22 -= i3 * i21;
                        i23 = i12 - (i18 * i3);
                        i10 = i12 - (i3 * i16);
                        i3 = 0;
                    } else {
                        i10 = i12;
                        i23 = i12;
                    }
                    i24 = i5 << 14;
                    if (i19 < 0) {
                        i24 -= i19 * i17;
                        i19 = 0;
                    }
                    if (i16 < i18) {
                        i25 = i - i19;
                        i19 -= i3;
                        i11 = this.bg[i3];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i23 >> 14, i22, i20, 2133995933);
                            i10 = i26 + i16;
                            i23 += i18;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        while (true) {
                            i25--;
                            if (i25 >= 0) {
                                ai(this.ad, i11, 0, 0, i24 >> 14, i23 >> 14, i22, i20, 2139041736);
                                i24 += i17;
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i23 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i - i19;
                    i19 -= i3;
                    i11 = this.bg[i3];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i23 >> 14, i26 >> 14, i22, i20, 2142748643);
                        i10 = i26 + i16;
                        i23 += i18;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    i10 = i25;
                    while (true) {
                        i25 = i10 - 1;
                        if (i25 >= 0) {
                            ai(this.ad, i11, 0, 0, i23 >> 14, i24 >> 14, i22, i20, 2141933364);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i18;
                            i10 = i25;
                            i24 += i17;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i19 = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
                i22 = ((i7 << 8) - (i4 * i20)) + i20;
                if (i2 < i19) {
                    i11 = i4 << 14;
                    if (i < 0) {
                        i24 = i11 - (i18 * i);
                        i10 = i11 - (i17 * i);
                        i22 -= i * i21;
                        i = 0;
                    } else {
                        i10 = i11;
                        i24 = i11;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i25 -= i2 * i16;
                        i2 = 0;
                    }
                    if ((i == i2 || i18 >= i17) && (i2 != i || i18 <= i16)) {
                        i23 = i19 - i2;
                        i19 = i2 - i;
                        i11 = this.bg[i];
                        while (true) {
                            i26 = i10;
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            ai(this.ad, i11, 0, 0, i26 >> 14, i24 >> 14, i22, i20, 2141873792);
                            i24 += i18;
                            i10 = i26 + i17;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                ai(this.ad, i11, 0, 0, i25 >> 14, i24 >> 14, i22, i20, 2136037624);
                                i22 += i21;
                                i11 += this.ah * 1956907281;
                                i19 = i23;
                                i25 += i16;
                                i24 += i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i19 - i2;
                    i19 = i2 - i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i24 >> 14, i26 >> 14, i22, i20, 2143490221);
                        i24 += i18;
                        i10 = i26 + i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            ai(this.ad, i11, 0, 0, i24 >> 14, i25 >> 14, i22, i20, 2147026976);
                            i25 += i16;
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i19 = i23;
                            i24 += i18;
                        } else {
                            return;
                        }
                    }
                }
                i11 = i4 << 14;
                if (i < 0) {
                    i10 = i11 - (i * i18);
                    i25 = i11 - (i17 * i);
                    i22 -= i * i21;
                    i = 0;
                } else {
                    i25 = i11;
                    i10 = i11;
                }
                i23 = i6 << 14;
                if (i19 < 0) {
                    i23 -= i19 * i16;
                    i19 = 0;
                }
                if ((i19 == i || i18 >= i17) && (i != i19 || i16 <= i17)) {
                    i24 = i2 - i19;
                    i19 -= i;
                    i11 = this.bg[i];
                    while (true) {
                        i26 = i10;
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        ai(this.ad, i11, 0, 0, i25 >> 14, i26 >> 14, i22, i20, 2133845393);
                        i10 = i26 + i18;
                        i25 += i17;
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i27;
                    }
                    while (true) {
                        i24--;
                        if (i24 >= 0) {
                            ai(this.ad, i11, 0, 0, i25 >> 14, i23 >> 14, i22, i20, 2142709355);
                            i22 += i21;
                            i11 += this.ah * 1956907281;
                            i23 += i16;
                            i25 += i17;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i2 - i19;
                i19 -= i;
                i11 = this.bg[i];
                i26 = i10;
                i27 = i25;
                while (true) {
                    i25 = i19 - 1;
                    if (i25 < 0) {
                        break;
                    }
                    ai(this.ad, i11, 0, 0, i26 >> 14, i27 >> 14, i22, i20, 2142291350);
                    i27 += i17;
                    i22 += i21;
                    i11 += this.ah * 1956907281;
                    i19 = i25;
                    i26 += i18;
                }
                i19 = i24;
                i25 = i23;
                while (true) {
                    i23 = i19 - 1;
                    if (i23 >= 0) {
                        ai(this.ad, i11, 0, 0, i25 >> 14, i27 >> 14, i22, i20, 2142581291);
                        i22 += i21;
                        i11 += this.ah * 1956907281;
                        i19 = i23;
                        i25 += i16;
                        i27 += i17;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void ay(int[] iArr, int i, int i2) {
        this.ad = iArr;
        this.ah = 1589253835 * i;
        this.af = 547905375 * i2;
        bv(0, 0, i, i2, -703804510);
        bg(837894217);
    }

    /* Access modifiers changed, original: final */
    public final void ba(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.at) {
            if (i5 > this.bl * 1505645037) {
                i5 = this.bl * 1505645037;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = i6 + (i7 * i4);
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            if (this.bs) {
                i10 = i5 - i4;
                i11 = i10 >> 2;
                i12 = i7 << 2;
                if (this.bm * -481075153 == 0) {
                    if (i11 > 0) {
                        do {
                            i13 = az[i9 >> 8];
                            i9 += i12;
                            i14 = i8 + 1;
                            iArr[i8] = i13;
                            i8 = i14 + 1;
                            iArr[i14] = i13;
                            i14 = i8 + 1;
                            iArr[i8] = i13;
                            i8 = i14 + 1;
                            iArr[i14] = i13;
                            i11--;
                        } while (i11 > 0);
                    }
                    i11 = i10 & 3;
                    if (i11 > 0) {
                        i9 = az[i9 >> 8];
                        while (true) {
                            iArr[i8] = i9;
                            i11--;
                            if (i11 > 0) {
                                i8++;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i13 = this.bm * -481075153;
                i14 = 256 - (this.bm * -481075153);
                if (i11 > 0) {
                    do {
                        int i15 = az[i9 >> 8];
                        i9 += i12;
                        i15 = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i14) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i15) * i14) >> 8) & 16711935);
                        int i16 = iArr[i8];
                        int i17 = i8 + 1;
                        iArr[i8] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i16) * i13) >> 8) & 16711935) + i15);
                        i8 = iArr[i17];
                        i16 = i17 + 1;
                        iArr[i17] = ((((i8 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i8) * i13) >> 8) & 16711935) + i15);
                        i8 = iArr[i16];
                        i17 = i16 + 1;
                        iArr[i16] = ((((i8 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i8) * i13) >> 8) & 16711935) + i15);
                        i16 = iArr[i17];
                        i8 = i17 + 1;
                        iArr[i17] = (i15 + ((((16711935 & i16) * i13) >> 8) & 16711935)) + ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        i11--;
                    } while (i11 > 0);
                }
                i11 = i10 & 3;
                if (i11 > 0) {
                    i9 = az[i9 >> 8];
                    while (true) {
                        i10 = iArr[i8];
                        iArr[i8] = (((((i10 & 16711935) * i13) >> 8) & 16711935) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i14) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i9) * i14) >> 8) & 16711935))) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        i11--;
                        if (i11 > 0) {
                            i8++;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i11 = i5 - i4;
            if (this.bm * -481075153 == 0) {
                i10 = i8;
                while (true) {
                    iArr[i10] = az[i9 >> 8];
                    i9 += i7;
                    i8 = i11 - 1;
                    if (i8 > 0) {
                        i10++;
                        i11 = i8;
                    } else {
                        return;
                    }
                }
            }
            i10 = this.bm * -481075153;
            i12 = 256 - (this.bm * -481075153);
            while (true) {
                i13 = az[i9 >> 8];
                i9 += i7;
                i14 = iArr[i8];
                iArr[i8] = ((((((i13 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i13) * i12) >> 8) & 16711935)) + ((((16711935 & i14) * i10) >> 8) & 16711935)) + ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i10) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                i11--;
                if (i11 > 0) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bk(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.at) {
            if (i5 > this.bl * 1505645037) {
                i5 = this.bl * 1505645037;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = i6 + (i7 * i4);
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            if (this.bs) {
                i10 = i5 - i4;
                i11 = i10 >> 2;
                i12 = i7 << 2;
                if (this.bm * -481075153 == 0) {
                    if (i11 > 0) {
                        do {
                            i13 = az[i9 >> 8];
                            i9 += i12;
                            i14 = i8 + 1;
                            iArr[i8] = i13;
                            i8 = i14 + 1;
                            iArr[i14] = i13;
                            i14 = i8 + 1;
                            iArr[i8] = i13;
                            i8 = i14 + 1;
                            iArr[i14] = i13;
                            i11--;
                        } while (i11 > 0);
                    }
                    i11 = i10 & 3;
                    if (i11 > 0) {
                        i9 = az[i9 >> 8];
                        while (true) {
                            iArr[i8] = i9;
                            i11--;
                            if (i11 > 0) {
                                i8++;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i13 = this.bm * -481075153;
                i14 = 256 - (this.bm * -481075153);
                if (i11 > 0) {
                    do {
                        int i15 = az[i9 >> 8];
                        i9 += i12;
                        i15 = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i14) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i15) * i14) >> 8) & 16711935);
                        int i16 = iArr[i8];
                        int i17 = i8 + 1;
                        iArr[i8] = ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i16) * i13) >> 8) & 16711935) + i15);
                        i8 = iArr[i17];
                        i16 = i17 + 1;
                        iArr[i17] = ((((i8 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i8) * i13) >> 8) & 16711935) + i15);
                        i8 = iArr[i16];
                        i17 = i16 + 1;
                        iArr[i16] = ((((i8 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i8) * i13) >> 8) & 16711935) + i15);
                        i16 = iArr[i17];
                        i8 = i17 + 1;
                        iArr[i17] = (i15 + ((((16711935 & i16) * i13) >> 8) & 16711935)) + ((((i16 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        i11--;
                    } while (i11 > 0);
                }
                i11 = i10 & 3;
                if (i11 > 0) {
                    i9 = az[i9 >> 8];
                    while (true) {
                        i10 = iArr[i8];
                        iArr[i8] = (((((i10 & 16711935) * i13) >> 8) & 16711935) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i14) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i9) * i14) >> 8) & 16711935))) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i13) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        i11--;
                        if (i11 > 0) {
                            i8++;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i11 = i5 - i4;
            if (this.bm * -481075153 == 0) {
                i10 = i8;
                while (true) {
                    iArr[i10] = az[i9 >> 8];
                    i9 += i7;
                    i8 = i11 - 1;
                    if (i8 > 0) {
                        i10++;
                        i11 = i8;
                    } else {
                        return;
                    }
                }
            }
            i10 = this.bm * -481075153;
            i12 = 256 - (this.bm * -481075153);
            while (true) {
                i13 = az[i9 >> 8];
                i9 += i7;
                i14 = iArr[i8];
                iArr[i8] = ((((((i13 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i13) * i12) >> 8) & 16711935)) + ((((16711935 & i14) * i10) >> 8) & 16711935)) + ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i10) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                i11--;
                if (i11 > 0) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bm(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (this.at) {
            if (i5 > this.bl * 1505645037) {
                i5 = this.bl * 1505645037;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i6 = i + i4;
            int i7 = i5 - i4;
            int i8 = i7 >> 2;
            int i9;
            if (this.bm * -481075153 == 0) {
                while (true) {
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                    i9 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i9 + 1;
                    iArr[i9] = i2;
                    i9 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i9 + 1;
                    iArr[i9] = i2;
                }
                i8 = i7 & 3;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        iArr[i6] = i2;
                        i6++;
                    } else {
                        return;
                    }
                }
            } else if (this.bm * -481075153 == 254) {
                while (true) {
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                    i9 = i6 + 1;
                    iArr[i6] = iArr[i9];
                    i6 = i9 + 1;
                    iArr[i9] = iArr[i6];
                    i9 = i6 + 1;
                    iArr[i6] = iArr[i9];
                    i6 = i9 + 1;
                    iArr[i9] = iArr[i6];
                }
                i8 = i7 & 3;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        i7 = i6 + 1;
                        iArr[i6] = iArr[i7];
                        i6 = i7;
                    } else {
                        return;
                    }
                }
            } else {
                i9 = this.bm * -481075153;
                int i10 = 256 - (this.bm * -481075153);
                i10 = (((i10 * (16711935 & i2)) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i2) * i10) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                while (true) {
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                    int i11 = iArr[i6];
                    int i12 = i6 + 1;
                    iArr[i6] = ((((i11 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i11) * i9) >> 8) & 16711935) + i10);
                    i6 = iArr[i12];
                    i11 = i12 + 1;
                    iArr[i12] = (((((i6 & 16711935) * i9) >> 8) & 16711935) + i10) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    i6 = iArr[i11];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i6 & 16711935) * i9) >> 8) & 16711935) + i10) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    i6 = iArr[i12];
                    iArr[i12] = ((((i6 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (((((16711935 & i6) * i9) >> 8) & 16711935) + i10);
                    i6 = i12 + 1;
                }
                i8 = i7 & 3;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        i7 = iArr[i6];
                        iArr[i6] = (((((i7 & 16711935) * i9) >> 8) & 16711935) + i10) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i7) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        i6++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] ar = il.ax.ar(i19, 1192395230);
        int al;
        if (ar == null) {
            al = il.ax.al(i19, -611038289);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2131516597), kr.br(al, i8, 2144146300), kr.br(al, i9, 2139485280), (byte) 16);
            return;
        }
        this.ba = il.ax.ai(i19, (byte) 0);
        this.bk = il.ax.aj(i19, 724677644);
        int i20 = i5 - i4;
        int i21 = i2 - i;
        int i22 = i6 - i4;
        int i23 = i3 - i;
        int i24 = i8 - i7;
        int i25 = i9 - i7;
        int i26 = i2 != i ? (i20 << 14) / i21 : 0;
        int i27 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i28 = i3 != i ? ((i4 - i6) << 14) / (i - i3) : 0;
        al = (i20 * i23) - (i21 * i22);
        if (al != 0) {
            int i29 = (((i23 * i24) - (i21 * i25)) << 9) / al;
            int i30 = (((i20 * i25) - (i24 * i22)) << 9) / al;
            al = i10 - i11;
            i20 = i13 - i14;
            i21 = i16 - i17;
            i22 = i12 - i10;
            i23 = i15 - i13;
            i24 = i18 - i16;
            i25 = ((i22 * i13) - (i10 * i23)) << 14;
            int i31 = (int) (((((long) ((i23 * i16) - (i13 * i24))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i32 = (int) ((((long) ((i24 * i10) - (i22 * i16))) << 14) / ((long) (this.bq * 1516652957)));
            int i33 = ((i13 * al) - (i10 * i20)) << 14;
            int i34 = (int) (((((long) ((i20 * i16) - (i21 * i13))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i35 = (int) ((((long) ((i21 * i10) - (i16 * al))) << 14) / ((long) (this.bq * 1516652957)));
            int i36 = ((i20 * i22) - (i23 * al)) << 14;
            int i37 = (int) (((((long) ((i23 * i21) - (i20 * i24))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i38 = (int) ((((long) ((al * i24) - (i22 * i21))) << 14) / ((long) (this.bq * 1516652957)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i20 = i > this.bf * 651738037 ? 651738037 * this.bf : i;
                        i39 = ((i8 << 9) - (i29 * i5)) + i29;
                        if (i3 < i20) {
                            i22 = i5 << 14;
                            if (i2 < 0) {
                                i39 -= i2 * i30;
                                i21 = i22 - (i27 * i2);
                                i40 = i22 - (i2 * i26);
                                i2 = 0;
                            } else {
                                i21 = i22;
                                i40 = i22;
                            }
                            al = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = al - (i3 * i28);
                            } else {
                                i41 = al;
                            }
                            al = i2 - (this.bo * -1165057787);
                            i42 = i25 + (al * i32);
                            i33 += i35 * al;
                            i36 += al * i38;
                            if ((i3 == i2 || i26 >= i27) && (i2 != i3 || i26 <= i28)) {
                                i43 = i20 - i3;
                                al = i3 - i2;
                                i23 = this.bg[i2];
                                i44 = i21;
                                while (true) {
                                    i45 = al - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    ao(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1103746404);
                                    i40 += i26;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i45;
                                    i44 += i27;
                                }
                                al = i43;
                                i45 = i41;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 >= 0) {
                                        ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1367902851);
                                        i39 += i30;
                                        i23 += this.ah * 1956907281;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        al = i41;
                                        i45 += i28;
                                        i40 += i26;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i20 - i3;
                            al = i3 - i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i21;
                                i45 = al - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1020439312);
                                i40 += i26;
                                i21 = i44 + i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i45;
                            }
                            al = i43;
                            i45 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -961458080);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i28;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        al = i5 << 14;
                        if (i2 < 0) {
                            i22 = al - (i26 * i2);
                            i43 = al - (i27 * i2);
                            i39 -= i2 * i30;
                            i2 = 0;
                        } else {
                            i22 = al;
                            i43 = al;
                        }
                        i21 = i4 << 14;
                        if (i20 < 0) {
                            al = 0;
                            i41 = i21 - (i20 * i28);
                        } else {
                            al = i20;
                            i41 = i21;
                        }
                        i20 = i2 - (this.bo * -1165057787);
                        i42 = i25 + (i20 * i32);
                        i33 += i20 * i35;
                        i36 += i20 * i38;
                        if (i26 < i27) {
                            i45 = i3 - al;
                            al -= i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i22;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1203070878);
                                i22 = i44 + i26;
                                i43 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            while (true) {
                                i45--;
                                if (i45 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1344768735);
                                    i41 += i28;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i27;
                                } else {
                                    return;
                                }
                            }
                        }
                        i45 = i3 - al;
                        al -= i2;
                        i23 = this.bg[i2];
                        i44 = i22;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -973584828);
                            i43 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 197060323);
                                i41 += i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i27;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i20 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                    i39 = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i20) {
                        i22 = i6 << 14;
                        if (i3 < 0) {
                            i39 -= i3 * i30;
                            i21 = i22 - (i28 * i3);
                            i45 = i22 - (i27 * i3);
                            i3 = 0;
                        } else {
                            i21 = i22;
                            i45 = i22;
                        }
                        al = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = al - (i * i26);
                        } else {
                            i41 = al;
                        }
                        al = i3 - (this.bo * -1165057787);
                        i42 = i25 + (al * i32);
                        i33 += i35 * al;
                        i36 += al * i38;
                        if (i27 < i28) {
                            i43 = i20 - i;
                            al = i - i3;
                            i23 = this.bg[i3];
                            while (true) {
                                i44 = i21;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 135420128);
                                i45 += i27;
                                i21 = i44 + i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            al = i43;
                            i40 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -480348667);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i27;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i20 - i;
                        al = i - i3;
                        i23 = this.bg[i3];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1532189284);
                            i45 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i28;
                        }
                        al = i43;
                        i40 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1661806411);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i27;
                                i40 += i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i6 << 14;
                    if (i3 < 0) {
                        i39 -= i3 * i30;
                        i40 = i21 - (i3 * i28);
                        i22 = i21 - (i3 * i27);
                        i3 = 0;
                    } else {
                        i22 = i21;
                        i40 = i21;
                    }
                    i21 = i5 << 14;
                    if (i20 < 0) {
                        al = 0;
                        i41 = i21 - (i20 * i26);
                    } else {
                        al = i20;
                        i41 = i21;
                    }
                    i20 = i3 - (this.bo * -1165057787);
                    i42 = i25 + (i20 * i32);
                    i33 += i35 * i20;
                    i36 += i20 * i38;
                    if (i27 < i28) {
                        i20 = al - i3;
                        i43 = i - al;
                        i23 = this.bg[i3];
                        al = i20;
                        while (true) {
                            i44 = i22;
                            i45 = al - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1012170159);
                            i22 = i44 + i27;
                            i40 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i45;
                        }
                        al = i43;
                        i45 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1546202876);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i26;
                                i40 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i20 = al - i3;
                    i43 = i - al;
                    i23 = this.bg[i3];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i45 = al - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 321316790);
                        i40 += i28;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i45;
                        i44 += i27;
                    }
                    al = i43;
                    i45 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 35106652);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i28;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i20 = i3 > this.bf * 651738037 ? 651738037 * this.bf : i3;
                i39 = ((i7 << 9) - (i4 * i29)) + i29;
                if (i2 < i20) {
                    al = i4 << 14;
                    if (i < 0) {
                        i43 = al - (i28 * i);
                        i21 = al - (i * i26);
                        i39 -= i * i30;
                        i = 0;
                    } else {
                        i43 = al;
                        i21 = al;
                    }
                    al = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = al - (i2 * i27);
                    } else {
                        i41 = al;
                    }
                    al = i - (this.bo * -1165057787);
                    i42 = i25 + (i32 * al);
                    i33 += i35 * al;
                    i36 += al * i38;
                    if ((i == i2 || i28 >= i26) && (i2 != i || i28 <= i27)) {
                        i45 = i20 - i2;
                        al = i2 - i;
                        i23 = this.bg[i];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -692385351);
                            i43 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -906641285);
                                i41 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i45 = i20 - i2;
                    al = i2 - i;
                    i23 = this.bg[i];
                    while (true) {
                        i44 = i21;
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -469079834);
                        i43 += i28;
                        i21 = i44 + i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                    }
                    while (true) {
                        i45--;
                        if (i45 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -914503369);
                            i41 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i28;
                        } else {
                            return;
                        }
                    }
                }
                al = i4 << 14;
                if (i < 0) {
                    i45 = al - (i * i26);
                    i39 -= i * i30;
                    i22 = al - (i28 * i);
                    i = 0;
                } else {
                    i45 = al;
                    i22 = al;
                }
                i21 = i6 << 14;
                if (i20 < 0) {
                    al = 0;
                    i41 = i21 - (i20 * i27);
                } else {
                    al = i20;
                    i41 = i21;
                }
                i20 = i - (this.bo * -1165057787);
                i42 = i25 + (i32 * i20);
                i33 += i20 * i35;
                i36 += i20 * i38;
                if ((al == i || i28 >= i26) && (i != al || i27 <= i26)) {
                    i20 = al - i;
                    i43 = i2 - al;
                    i23 = this.bg[i];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1494071152);
                        i45 += i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                        i44 += i28;
                    }
                    al = i43;
                    i40 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1153726388);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i27;
                        } else {
                            return;
                        }
                    }
                }
                i20 = al - i;
                i43 = i2 - al;
                i23 = this.bg[i];
                al = i20;
                while (true) {
                    i44 = i22;
                    i40 = al - 1;
                    if (i40 < 0) {
                        break;
                    }
                    ao(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -950238789);
                    i22 = i44 + i28;
                    i45 += i26;
                    i39 += i30;
                    i23 += this.ah * 1956907281;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    al = i40;
                }
                al = i43;
                i40 = i41;
                while (true) {
                    i41 = al - 1;
                    if (i41 >= 0) {
                        ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 904095194);
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i41;
                        i45 += i26;
                        i40 += i27;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void bs(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i != i2 ? ((i5 - i4) << 14) / (i2 - i) : 0;
        int i9 = i3 != i2 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i10 = i != i3 ? ((i4 - i6) << 14) / (i - i3) : 0;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i > i2 || i > i3) {
            if (i2 <= i3) {
                if (i2 < this.bf * 651738037) {
                    if (i3 > this.bf * 651738037) {
                        i3 = this.bf * 651738037;
                    }
                    i11 = i > this.bf * 651738037 ? this.bf * 651738037 : i;
                    if (i3 < i11) {
                        i12 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i12 - (i2 * i8);
                            i14 = i12 - (i2 * i9);
                            i2 = 0;
                        } else {
                            i14 = i12;
                            i13 = i12;
                        }
                        i15 = i6 << 14;
                        if (i3 < 0) {
                            i15 -= i3 * i10;
                            i3 = 0;
                        }
                        if ((i3 == i2 || i8 >= i9) && (i3 != i2 || i8 <= i10)) {
                            i16 = i11 - i3;
                            i11 = i3 - i2;
                            i12 = this.bg[i2];
                            while (true) {
                                i17 = i14;
                                i18 = i11 - 1;
                                if (i18 < 0) {
                                    break;
                                }
                                am(this.ad, i12, i7, 0, i17 >> 14, i13 >> 14, (byte) 0);
                                i13 += i8;
                                i14 = i17 + i9;
                                i12 += this.ah * 1956907281;
                                i11 = i18;
                            }
                            i14 = i16;
                            while (true) {
                                i16 = i14 - 1;
                                if (i16 >= 0) {
                                    am(this.ad, i12, i7, 0, i15 >> 14, i13 >> 14, (byte) 0);
                                    i12 += this.ah * 1956907281;
                                    i13 += i8;
                                    i14 = i16;
                                    i15 += i10;
                                } else {
                                    return;
                                }
                            }
                        }
                        i16 = i11 - i3;
                        i11 = i3 - i2;
                        i12 = this.bg[i2];
                        while (true) {
                            i17 = i14;
                            i18 = i11 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            am(this.ad, i12, i7, 0, i13 >> 14, i17 >> 14, (byte) 0);
                            i13 += i8;
                            i14 = i17 + i9;
                            i12 += this.ah * 1956907281;
                            i11 = i18;
                        }
                        while (true) {
                            i16--;
                            if (i16 >= 0) {
                                am(this.ad, i12, i7, 0, i13 >> 14, i15 >> 14, (byte) 0);
                                i15 += i10;
                                i12 += this.ah * 1956907281;
                                i13 += i8;
                            } else {
                                return;
                            }
                        }
                    }
                    i12 = i5 << 14;
                    if (i2 < 0) {
                        i14 = i12 - (i2 * i8);
                        i13 = i12 - (i2 * i9);
                        i2 = 0;
                    } else {
                        i13 = i12;
                        i14 = i12;
                    }
                    i15 = i4 << 14;
                    if (i11 < 0) {
                        i15 -= i11 * i10;
                        i11 = 0;
                    }
                    if (i8 < i9) {
                        i16 = i3 - i11;
                        i11 -= i2;
                        i12 = this.bg[i2];
                        while (true) {
                            i17 = i14;
                            i18 = i11 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            am(this.ad, i12, i7, 0, i17 >> 14, i13 >> 14, (byte) 0);
                            i14 = i17 + i8;
                            i13 += i9;
                            i12 += this.ah * 1956907281;
                            i11 = i18;
                        }
                        while (true) {
                            i16--;
                            if (i16 >= 0) {
                                am(this.ad, i12, i7, 0, i15 >> 14, i13 >> 14, (byte) 0);
                                i15 += i10;
                                i12 += this.ah * 1956907281;
                                i13 += i9;
                            } else {
                                return;
                            }
                        }
                    }
                    i16 = i3 - i11;
                    i11 -= i2;
                    i12 = this.bg[i2];
                    while (true) {
                        i17 = i14;
                        i18 = i11 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        am(this.ad, i12, i7, 0, i13 >> 14, i17 >> 14, (byte) 0);
                        i14 = i17 + i8;
                        i13 += i9;
                        i12 += this.ah * 1956907281;
                        i11 = i18;
                    }
                    i14 = i16;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            am(this.ad, i12, i7, 0, i13 >> 14, i15 >> 14, (byte) 0);
                            i12 += this.ah * 1956907281;
                            i13 += i9;
                            i14 = i16;
                            i15 += i10;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < this.bf * 651738037) {
                if (i > this.bf * 651738037) {
                    i = this.bf * 651738037;
                }
                i11 = i2 > this.bf * 651738037 ? this.bf * 651738037 : i2;
                if (i < i11) {
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i14 = i12 - (i3 * i10);
                        i13 = i12 - (i3 * i9);
                        i3 = 0;
                    } else {
                        i13 = i12;
                        i14 = i12;
                    }
                    i15 = i4 << 14;
                    if (i < 0) {
                        i15 -= i * i8;
                        i = 0;
                    }
                    if (i9 < i10) {
                        i16 = i11 - i;
                        i11 = i - i3;
                        i12 = this.bg[i3];
                        while (true) {
                            i17 = i14;
                            i18 = i11 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            am(this.ad, i12, i7, 0, i13 >> 14, i17 >> 14, (byte) 0);
                            i13 += i9;
                            i14 = i17 + i10;
                            i12 += this.ah * 1956907281;
                            i11 = i18;
                        }
                        while (true) {
                            i16--;
                            if (i16 >= 0) {
                                am(this.ad, i12, i7, 0, i13 >> 14, i15 >> 14, (byte) 0);
                                i15 += i8;
                                i12 += this.ah * 1956907281;
                                i13 += i9;
                            } else {
                                return;
                            }
                        }
                    }
                    i16 = i11 - i;
                    i11 = i - i3;
                    i12 = this.bg[i3];
                    while (true) {
                        i17 = i14;
                        i18 = i11 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        am(this.ad, i12, i7, 0, i17 >> 14, i13 >> 14, (byte) 0);
                        i13 += i9;
                        i14 = i17 + i10;
                        i12 += this.ah * 1956907281;
                        i11 = i18;
                    }
                    i14 = i16;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            am(this.ad, i12, i7, 0, i15 >> 14, i13 >> 14, (byte) 0);
                            i12 += this.ah * 1956907281;
                            i13 += i9;
                            i14 = i16;
                            i15 += i8;
                        } else {
                            return;
                        }
                    }
                }
                i12 = i6 << 14;
                if (i3 < 0) {
                    i14 = i12 - (i3 * i9);
                    i13 = i12 - (i3 * i10);
                    i3 = 0;
                } else {
                    i13 = i12;
                    i14 = i12;
                }
                i15 = i5 << 14;
                if (i11 < 0) {
                    i15 -= i11 * i8;
                    i11 = 0;
                }
                if (i9 < i10) {
                    i16 = i - i11;
                    i11 -= i3;
                    i12 = this.bg[i3];
                    while (true) {
                        i17 = i14;
                        i18 = i11 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        am(this.ad, i12, i7, 0, i17 >> 14, i13 >> 14, (byte) 0);
                        i14 = i17 + i9;
                        i13 += i10;
                        i12 += this.ah * 1956907281;
                        i11 = i18;
                    }
                    while (true) {
                        i16--;
                        if (i16 >= 0) {
                            am(this.ad, i12, i7, 0, i15 >> 14, i13 >> 14, (byte) 0);
                            i15 += i8;
                            i12 += this.ah * 1956907281;
                            i13 += i10;
                        } else {
                            return;
                        }
                    }
                }
                i16 = i - i11;
                i11 -= i3;
                i12 = this.bg[i3];
                while (true) {
                    i17 = i14;
                    i18 = i11 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    am(this.ad, i12, i7, 0, i13 >> 14, i17 >> 14, (byte) 0);
                    i14 = i17 + i9;
                    i13 += i10;
                    i12 += this.ah * 1956907281;
                    i11 = i18;
                }
                i14 = i16;
                while (true) {
                    i16 = i14 - 1;
                    if (i16 >= 0) {
                        am(this.ad, i12, i7, 0, i13 >> 14, i15 >> 14, (byte) 0);
                        i12 += this.ah * 1956907281;
                        i13 += i10;
                        i14 = i16;
                        i15 += i8;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bf * 651738037) {
            if (i2 > this.bf * 651738037) {
                i2 = this.bf * 651738037;
            }
            i11 = i3 > this.bf * 651738037 ? this.bf * 651738037 : i3;
            int i19;
            if (i2 < i11) {
                i19 = i4 << 14;
                if (i < 0) {
                    i14 = i19 - (i * i8);
                    i13 = i19 - (i * i10);
                    i = 0;
                } else {
                    i13 = i19;
                    i14 = i19;
                }
                i15 = i5 << 14;
                if (i2 < 0) {
                    i15 -= i2 * i9;
                    i2 = 0;
                }
                if ((i == i2 || i10 >= i8) && (i2 != i || i10 <= i9)) {
                    i16 = i11 - i2;
                    i11 = i2 - i;
                    i12 = this.bg[i];
                    while (true) {
                        i17 = i14;
                        i18 = i11 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        am(this.ad, i12, i7, 0, i17 >> 14, i13 >> 14, (byte) 0);
                        i13 += i10;
                        i14 = i17 + i8;
                        i12 += this.ah * 1956907281;
                        i11 = i18;
                    }
                    i14 = i16;
                    while (true) {
                        i16 = i14 - 1;
                        if (i16 >= 0) {
                            am(this.ad, i12, i7, 0, i15 >> 14, i13 >> 14, (byte) 0);
                            i12 += this.ah * 1956907281;
                            i13 += i10;
                            i14 = i16;
                            i15 += i9;
                        } else {
                            return;
                        }
                    }
                }
                i16 = i11 - i2;
                i11 = i2 - i;
                i12 = this.bg[i];
                while (true) {
                    i17 = i14;
                    i18 = i11 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    am(this.ad, i12, i7, 0, i13 >> 14, i17 >> 14, (byte) 0);
                    i13 += i10;
                    i14 = i17 + i8;
                    i12 += this.ah * 1956907281;
                    i11 = i18;
                }
                while (true) {
                    i16--;
                    if (i16 >= 0) {
                        am(this.ad, i12, i7, 0, i13 >> 14, i15 >> 14, (byte) 0);
                        i15 += i9;
                        i12 += this.ah * 1956907281;
                        i13 += i10;
                    } else {
                        return;
                    }
                }
            }
            i19 = i4 << 14;
            if (i < 0) {
                i13 = i19 - (i * i8);
                i14 = i19 - (i * i10);
                i = 0;
            } else {
                i14 = i19;
                i13 = i19;
            }
            i15 = i6 << 14;
            if (i11 < 0) {
                i15 -= i11 * i9;
                i11 = 0;
            }
            if ((i == i11 || i10 >= i8) && (i11 != i || i9 <= i8)) {
                i16 = i2 - i11;
                i11 -= i;
                i12 = this.bg[i];
                while (true) {
                    i17 = i14;
                    i18 = i11 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    am(this.ad, i12, i7, 0, i13 >> 14, i17 >> 14, (byte) 0);
                    i14 = i17 + i10;
                    i13 += i8;
                    i12 += this.ah * 1956907281;
                    i11 = i18;
                }
                i14 = i16;
                while (true) {
                    i16 = i14 - 1;
                    if (i16 >= 0) {
                        am(this.ad, i12, i7, 0, i13 >> 14, i15 >> 14, (byte) 0);
                        i12 += this.ah * 1956907281;
                        i13 += i8;
                        i14 = i16;
                        i15 += i9;
                    } else {
                        return;
                    }
                }
            }
            i16 = i2 - i11;
            i11 -= i;
            i12 = this.bg[i];
            while (true) {
                i17 = i14;
                i18 = i11 - 1;
                if (i18 < 0) {
                    break;
                }
                am(this.ad, i12, i7, 0, i17 >> 14, i13 >> 14, (byte) 0);
                i14 = i17 + i10;
                i13 += i8;
                i12 += this.ah * 1956907281;
                i11 = i18;
            }
            while (true) {
                i16--;
                if (i16 >= 0) {
                    am(this.ad, i12, i7, 0, i15 >> 14, i13 >> 14, (byte) 0);
                    i15 += i9;
                    i12 += this.ah * 1956907281;
                    i13 += i8;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dg(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.at) {
            if (i5 > this.bl * 1505645037) {
                i5 = this.bl * 1505645037;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i4 * i7);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            if (this.ba) {
                i17 = i4 - (this.bd * 109817637);
                i18 = i8 + (i17 * i11);
                i19 = i9 + (i17 * i12);
                i20 = i10 + (i17 * i13);
                i21 = i20 >> 12;
                if (i21 != 0) {
                    i22 = i18 / i21;
                    i23 = i19 / i21;
                } else {
                    i22 = 0;
                    i23 = 0;
                }
                i17 = ((i13 * i16) + i20) >> 12;
                if (i17 != 0) {
                    i21 = ((i11 * i16) + i18) / i17;
                    i17 = ((i12 * i16) + i19) / i17;
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i18 = (i22 << 20) + i23;
                i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 20);
                i22 = i16 >> 3;
                i19 = i7 << 3;
                i21 = i15 >> 8;
                if (this.bk) {
                    if (i22 > 0) {
                        i17 = i14;
                        while (true) {
                            i14 = iArr2[(i18 >>> 26) + (183705871 & i18)];
                            i20 = i17 + 1;
                            iArr[i17] = ((((i14 & -688904622) * i21) & -306236068) + (((-1846315522 & i14) * i21) & -16711936)) >> 8;
                            i17 = i18 + i23;
                            i14 = iArr2[(i17 >>> 26) + (361328189 & i17)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 168282159) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (1344929368 & i17)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 16711935) * i21) & -16711936) + (((-586178812 & i14) * i21) & 16711680)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(1385969256 & i17) + (i17 >>> 26)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & -1306722717) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (-771678144 & i17)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 1046287240) * i21) & -16711936) + (((-1503359343 & i14) * i21) & 1159630638)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i14) * i21) & 1164474944)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (1417800219 & i17)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 1439256126) * i21) & -16711936) + (((-249641188 & i14) * i21) & 16711680)) >> 8;
                            i14 = i17 + i23;
                            i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                            i17 = i20 + 1;
                            iArr[i20] = (((i21 * (i18 & 1611338374)) & -1960793020) + (((590036771 & i18) * i21) & -16711936)) >> 8;
                            i14 += i23;
                            i15 += i19;
                            i21 = i15 >> 8;
                            i22--;
                            if (i22 <= 0) {
                                break;
                            }
                            i18 = i14;
                        }
                        i22 = i21;
                        i18 = i14;
                        i15 = i17;
                    } else {
                        i22 = i21;
                        i15 = i14;
                    }
                    i14 = i16 & 7;
                    if (i14 > 0) {
                        i17 = i18;
                        i21 = i15;
                        while (true) {
                            i18 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                            iArr[i21] = ((((i18 & 686543018) * i22) & -16711936) + (((-1198805463 & i18) * i22) & -462188114)) >> 8;
                            i17 += i23;
                            i14--;
                            if (i14 > 0) {
                                i21++;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i22 > 0) {
                    do {
                        i17 = iArr2[(i18 >>> 26) + (-173680800 & i18)];
                        if (i17 != 0) {
                            iArr[i14] = ((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((1885890390 & i17) * i21) & -1287999818)) >> 8;
                        }
                        i17 = i14 + 1;
                        i14 = i18 + i23;
                        i18 = iArr2[(-382213386 & i14) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 967737868) * i21) & -16711936) + (((178890192 & i18) * i21) & 1821182359)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 >>> 26) + (-2114012877 & i14)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & -1009051708) * i21) & 1182730464) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i21) & 180339043)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(-1064318885 & i14) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 16711935) * i21) & 677496448) + (((1661229965 & i18) * i21) & -816003480)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 16711935) * i21) & 387101648) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i21) & 16711680)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & -865868523) + (((16711935 & i18) * i21) & -16711936)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 >>> 26) + (1262216276 & i14)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i18) * i21) & 1054337292)) >> 8;
                        }
                        i17++;
                        i18 = i14 + i23;
                        i14 = iArr2[(-293288517 & i18) + (i18 >>> 26)];
                        if (i14 != 0) {
                            iArr[i17] = (((i21 * (i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((1225711537 & i14) * i21) & -408171026)) >> 8;
                        }
                        i14 = i17 + 1;
                        i18 += i23;
                        i15 += i19;
                        i21 = i15 >> 8;
                        i22--;
                    } while (i22 > 0);
                    i15 = i21;
                    i17 = i18;
                } else {
                    i15 = i21;
                    i17 = i18;
                }
                i18 = i16 & 7;
                if (i18 > 0) {
                    i21 = i14;
                    while (true) {
                        i14 = iArr2[(-2008811259 & i17) + (i17 >>> 26)];
                        if (i14 != 0) {
                            iArr[i21] = ((((i14 & 184278337) * i15) & 1149993722) + (((-521172666 & i14) * i15) & 16711680)) >> 8;
                        }
                        i21++;
                        i17 += i23;
                        i14 = i18 - 1;
                        if (i14 > 0) {
                            i18 = i14;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i17 = i4 - (this.bd * -501037853);
            i18 = i8 + (i11 * i17);
            i19 = i9 + (i12 * i17);
            i20 = i10 + (i17 * i13);
            i21 = i20 >> 14;
            if (i21 != 0) {
                i22 = i18 / i21;
                i23 = i19 / i21;
            } else {
                i22 = 0;
                i23 = 0;
            }
            i17 = ((i16 * i13) + i20) >> 14;
            if (i17 != 0) {
                i21 = ((i11 * i16) + i18) / i17;
                i17 = ((i12 * i16) + i19) / i17;
            } else {
                i21 = 0;
                i17 = 0;
            }
            i18 = (i22 << 18) + i23;
            i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 18);
            i22 = i16 >> 3;
            i19 = i7 << 3;
            i17 = i15 >> 8;
            if (this.bk) {
                if (i22 > 0) {
                    i21 = i18;
                    while (true) {
                        i18 = iArr2[(1658652574 & i21) + (i21 >>> 25)];
                        i20 = i14 + 1;
                        iArr[i14] = ((((i18 & -376239974) * i17) & -16711936) + (((2132915718 & i18) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(676309025 & i21) + (i21 >>> 25)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & 16711935) * i17) & -16711936) + (((-823626813 & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 16787428) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & -1377557574)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(617259136 & i21) + (i21 >>> 25)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 1341497507)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (1286969320 & i21)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 16711935) * i17) & 369098946) + (((1295313901 & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & 16711935) * i17) & 1967395047) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 1032774086) * i17) & -16711936) + (((123374824 & i14) * i17) & -1371124228)) >> 8;
                        i21 += i23;
                        i18 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i14 = i20 + 1;
                        iArr[i20] = (((i17 * (i18 & -1165568249)) & -1005930085) + (((16711935 & i18) * i17) & -2098674755)) >> 8;
                        i21 += i23;
                        i15 += i19;
                        i17 = i15 >> 8;
                        i18 = i22 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i22 = i18;
                    }
                    i15 = i17;
                } else {
                    i15 = i17;
                    i21 = i18;
                }
                i18 = i16 & 7;
                if (i18 > 0) {
                    i17 = i21;
                    while (true) {
                        i21 = iArr2[(i17 >>> 25) + (1786288581 & i17)];
                        iArr[i14] = ((((i21 & 1012332161) * i15) & -470732467) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i21) * i15) & 16711680)) >> 8;
                        i17 += i23;
                        i18--;
                        if (i18 > 0) {
                            i14++;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i22 > 0) {
                do {
                    i21 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i21 != 0) {
                        iArr[i14] = ((((i21 & -1458235081) * i17) & 16711680) + (((-1749354887 & i21) * i17) & -16711936)) >> 8;
                    }
                    i21 = i14 + 1;
                    i14 = i18 + i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & -154497180) * i17) & 1234237217) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & 16711680)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & -984555625) * i17) & -1085682064) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & -1087906045)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 804511903) * i17) & 2044611130) + (((16711935 & i18) * i17) & -649483880)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(1384758959 & i14) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 829387934) * i17) & -16711936) + (((1950562883 & i18) * i17) & 151472805)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(-2121617443 & i14) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 9714438) + (((-243669531 & i18) * i17) & -16711936)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                    }
                    i21++;
                    i18 = i14 + i23;
                    i14 = iArr2[(i18 >>> 25) + (1071621171 & i18)];
                    if (i14 != 0) {
                        iArr[i21] = (((i17 * (i14 & 616712493)) & 16711680) + (((60130254 & i14) * i17) & -1454749243)) >> 8;
                    }
                    i14 = i21 + 1;
                    i18 += i23;
                    i15 += i19;
                    i17 = i15 >> 8;
                    i22--;
                } while (i22 > 0);
                i15 = i17;
                i21 = i18;
            } else {
                i15 = i17;
                i21 = i18;
            }
            i18 = i16 & 7;
            if (i18 > 0) {
                i17 = i21;
                while (true) {
                    i21 = iArr2[(1756292069 & i17) + (i17 >>> 25)];
                    if (i21 != 0) {
                        iArr[i14] = ((((i21 & 1308359890) * i15) & 16711680) + (((16711935 & i21) * i15) & -16711936)) >> 8;
                    }
                    i21 = i14 + 1;
                    i17 += i23;
                    i18--;
                    if (i18 > 0) {
                        i14 = i21;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dk(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] ar = il.ax.ar(i19, 1745096990);
        int al;
        if (ar == null) {
            al = il.ax.al(i19, 1228625620);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2132430101), kr.br(al, i8, 2139580556), kr.br(al, i9, 2131211832), (byte) 16);
            return;
        }
        this.ba = il.ax.ai(i19, (byte) 0);
        this.bk = il.ax.aj(i19, 920600480);
        int i20 = i5 - i4;
        int i21 = i2 - i;
        int i22 = i6 - i4;
        int i23 = i3 - i;
        int i24 = i8 - i7;
        int i25 = i9 - i7;
        int i26 = i2 != i ? (i20 << 14) / i21 : 0;
        int i27 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i28 = i != i3 ? ((i4 - i6) << 14) / (i - i3) : 0;
        al = (i20 * i23) - (i21 * i22);
        if (al != 0) {
            int i29 = (((i23 * i24) - (i21 * i25)) << 9) / al;
            int i30 = (((i20 * i25) - (i22 * i24)) << 9) / al;
            al = i10 - i11;
            i20 = i13 - i14;
            i21 = i16 - i17;
            i22 = i12 - i10;
            i23 = i15 - i13;
            i24 = i18 - i16;
            i25 = ((i22 * i13) - (i23 * i10)) << 14;
            int i31 = (int) ((((long) ((i16 * i23) - (i13 * i24))) << 14) / ((long) (this.bq * 1516652957)));
            int i32 = (int) ((((long) ((i24 * i10) - (i16 * i22))) << 14) / ((long) (this.bq * -1875552952)));
            int i33 = ((i13 * al) - (i20 * i10)) << 14;
            int i34 = (int) ((((long) ((i16 * i20) - (i21 * i13))) << 14) / ((long) (this.bq * 1516652957)));
            int i35 = (int) ((((long) ((i10 * i21) - (i16 * al))) << 14) / ((long) (this.bq * -1723651208)));
            int i36 = ((i20 * i22) - (al * i23)) << 14;
            int i37 = (int) ((((long) ((i23 * i21) - (i20 * i24))) << 14) / ((long) (this.bq * 1516652957)));
            int i38 = (int) ((((long) ((al * i24) - (i21 * i22))) << 14) / ((long) (this.bq * 1516652957)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i20 = i > this.bf * 651738037 ? -466021073 * this.bf : i;
                        i39 = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i20) {
                            i22 = i5 << 14;
                            if (i2 < 0) {
                                i39 -= i2 * i30;
                                i21 = i22 - (i2 * i27);
                                i40 = i22 - (i2 * i26);
                                i2 = 0;
                            } else {
                                i21 = i22;
                                i40 = i22;
                            }
                            al = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = al - (i3 * i28);
                            } else {
                                i41 = al;
                            }
                            al = i2 - (this.bo * -1165057787);
                            i42 = i25 + (al * i32);
                            i33 += i35 * al;
                            i36 += al * i38;
                            if ((i3 == i2 || i26 >= i27) && (i2 != i3 || i26 <= i28)) {
                                i43 = i20 - i3;
                                al = i3 - i2;
                                i23 = this.bg[i2];
                                i44 = i21;
                                while (true) {
                                    i45 = al - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    af(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -115);
                                    i40 += i26;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i45;
                                    i44 += i27;
                                }
                                al = i43;
                                i45 = i41;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 >= 0) {
                                        af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -12);
                                        i39 += i30;
                                        i23 += this.ah * 862960313;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        al = i41;
                                        i45 += i28;
                                        i40 += i26;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i20 - i3;
                            al = i3 - i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i21;
                                i45 = al - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -50);
                                i40 += i26;
                                i21 = i44 + i27;
                                i39 += i30;
                                i23 += this.ah * 394365264;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i45;
                            }
                            al = i43;
                            i45 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -54);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i28;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        al = i5 << 14;
                        if (i2 < 0) {
                            i22 = al - (i26 * i2);
                            i45 = al - (i27 * i2);
                            i39 -= i2 * i30;
                            i2 = 0;
                        } else {
                            i22 = al;
                            i45 = al;
                        }
                        i21 = i4 << 14;
                        if (i20 < 0) {
                            al = 0;
                            i41 = i21 - (i20 * i28);
                        } else {
                            al = i20;
                            i41 = i21;
                        }
                        i20 = i2 - (this.bo * -1165057787);
                        i42 = i25 + (i32 * i20);
                        i33 += i35 * i20;
                        i36 += i20 * i38;
                        if (i26 < i27) {
                            i40 = i3 - al;
                            al -= i2;
                            i23 = this.bg[i2];
                            i44 = i22;
                            i43 = i45;
                            while (true) {
                                i45 = al - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -110);
                                i43 += i27;
                                i39 += i30;
                                i23 += this.ah * 1966727357;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i45;
                                i44 += i26;
                            }
                            i20 = i40;
                            while (true) {
                                i45 = i20 - 1;
                                if (i45 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -18);
                                    i41 += i28;
                                    i39 += i30;
                                    i23 += this.ah * -1883182556;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i27;
                                    i20 = i45;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i3 - al;
                        al -= i2;
                        i23 = this.bg[i2];
                        i44 = i22;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -55);
                            i45 += i27;
                            i39 += i30;
                            i23 += this.ah * -1043003591;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        al = i43;
                        i40 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -106);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i27;
                                i40 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = 1799577094 * this.bf;
                    }
                    i20 = i2 > this.bf * 651738037 ? this.bf * 376957941 : i2;
                    i39 = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i20) {
                        i22 = i6 << 14;
                        if (i3 < 0) {
                            i39 -= i3 * i30;
                            i21 = i22 - (i28 * i3);
                            i45 = i22 - (i27 * i3);
                            i3 = 0;
                        } else {
                            i21 = i22;
                            i45 = i22;
                        }
                        al = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = al - (i * i26);
                        } else {
                            i41 = al;
                        }
                        al = i3 - (this.bo * -1883146786);
                        i42 = i25 + (i32 * al);
                        i33 += i35 * al;
                        i36 += al * i38;
                        if (i27 < i28) {
                            i43 = i20 - i;
                            al = i - i3;
                            i23 = this.bg[i3];
                            while (true) {
                                i44 = i21;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -47);
                                i45 += i27;
                                i21 = i44 + i28;
                                i39 += i30;
                                i23 += this.ah * -2004325756;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            al = i43;
                            i40 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -3);
                                    i39 += i30;
                                    i23 += this.ah * 1148498875;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i27;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i20 - i;
                        al = i - i3;
                        i23 = this.bg[i3];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -54);
                            i45 += i27;
                            i39 += i30;
                            i23 += this.ah * 980479143;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i28;
                        }
                        al = i43;
                        i40 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -9);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i27;
                                i40 += i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i6 << 14;
                    if (i3 < 0) {
                        i39 -= i3 * i30;
                        i40 = i21 - (i3 * i28);
                        i22 = i21 - (i27 * i3);
                        i3 = 0;
                    } else {
                        i22 = i21;
                        i40 = i21;
                    }
                    i21 = i5 << 14;
                    if (i20 < 0) {
                        al = 0;
                        i41 = i21 - (i20 * i26);
                    } else {
                        al = i20;
                        i41 = i21;
                    }
                    i20 = i3 - (this.bo * -1079379678);
                    i42 = i25 + (i20 * i32);
                    i33 += i35 * i20;
                    i36 += i20 * i38;
                    if (i27 < i28) {
                        i20 = al - i3;
                        i43 = i - al;
                        i23 = this.bg[i3];
                        al = i20;
                        while (true) {
                            i44 = i22;
                            i45 = al - 1;
                            if (i45 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -116);
                            i22 = i44 + i27;
                            i39 += i30;
                            i23 += this.ah * -390383956;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i40 += i28;
                            al = i45;
                        }
                        al = i43;
                        i45 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -126);
                                i39 += i30;
                                i23 += this.ah * 1600679230;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i26;
                                i40 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i20 = al - i3;
                    i43 = i - al;
                    i23 = this.bg[i3];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i45 = al - 1;
                        if (i45 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -39);
                        i40 += i28;
                        i39 += i30;
                        i23 += this.ah * 1257609634;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i45;
                        i44 += i27;
                    }
                    al = i43;
                    i45 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -60);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i28;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i20 = i3 > this.bf * 651738037 ? 651738037 * this.bf : i3;
                i39 = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i20) {
                    al = i4 << 14;
                    if (i < 0) {
                        i43 = al - (i * i28);
                        i21 = al - (i * i26);
                        i39 -= i * i30;
                        i = 0;
                    } else {
                        i43 = al;
                        i21 = al;
                    }
                    al = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = al - (i2 * i27);
                    } else {
                        i41 = al;
                    }
                    al = i - (this.bo * 1883500171);
                    i42 = i25 + (i32 * al);
                    i33 += i35 * al;
                    i36 += al * i38;
                    if ((i2 == i || i28 >= i26) && (i != i2 || i28 <= i27)) {
                        i45 = i20 - i2;
                        al = i2 - i;
                        i23 = this.bg[i];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -91);
                            i43 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -103);
                                i41 += i27;
                                i39 += i30;
                                i23 += this.ah * -1181044801;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i45 = i20 - i2;
                    al = i2 - i;
                    i23 = this.bg[i];
                    while (true) {
                        i44 = i21;
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -26);
                        i43 += i28;
                        i21 = i44 + i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                    }
                    while (true) {
                        i45--;
                        if (i45 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -88);
                            i41 += i27;
                            i39 += i30;
                            i23 += this.ah * 1101813695;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i28;
                        } else {
                            return;
                        }
                    }
                }
                al = i4 << 14;
                if (i < 0) {
                    i45 = al - (i26 * i);
                    i39 -= i * i30;
                    i22 = al - (i * i28);
                    i = 0;
                } else {
                    i45 = al;
                    i22 = al;
                }
                i21 = i6 << 14;
                if (i20 < 0) {
                    al = 0;
                    i41 = i21 - (i20 * i27);
                } else {
                    al = i20;
                    i41 = i21;
                }
                i20 = i - (this.bo * 587435110);
                i42 = i25 + (i32 * i20);
                i33 += i35 * i20;
                i36 += i20 * i38;
                if ((al == i || i28 >= i26) && (i != al || i27 <= i26)) {
                    i20 = al - i;
                    i43 = i2 - al;
                    i23 = this.bg[i];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -67);
                        i45 += i26;
                        i39 += i30;
                        i23 += this.ah * -94665153;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                        i44 += i28;
                    }
                    al = i43;
                    i40 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -58);
                            i39 += i30;
                            i23 += this.ah * 872141559;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i27;
                        } else {
                            return;
                        }
                    }
                }
                i20 = al - i;
                i43 = i2 - al;
                i23 = this.bg[i];
                al = i20;
                while (true) {
                    i44 = i22;
                    i40 = al - 1;
                    if (i40 < 0) {
                        break;
                    }
                    af(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -5);
                    i22 = i44 + i28;
                    i45 += i26;
                    i39 += i30;
                    i23 += this.ah * 1956907281;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    al = i40;
                }
                al = i43;
                i40 = i41;
                while (true) {
                    i41 = al - 1;
                    if (i41 >= 0) {
                        af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -4);
                        i39 += i30;
                        i23 += this.ah * 589871649;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i41;
                        i45 += i26;
                        i40 += i27;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: do */
    public final void m3do(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] ar = il.ax.ar(i19, 732088999);
        int al;
        if (ar == null) {
            al = il.ax.al(i19, 1879713187);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2133338004), kr.br(al, i8, 2143351738), kr.br(al, i9, 2131056304), (byte) 16);
            return;
        }
        this.ba = il.ax.ai(i19, (byte) 0);
        this.bk = il.ax.aj(i19, 1368247363);
        int i20 = i5 - i4;
        int i21 = i2 - i;
        int i22 = i6 - i4;
        int i23 = i3 - i;
        int i24 = i8 - i7;
        int i25 = i9 - i7;
        int i26 = i2 != i ? (i20 << 14) / i21 : 0;
        int i27 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i28 = i3 != i ? ((i4 - i6) << 14) / (i - i3) : 0;
        al = (i20 * i23) - (i21 * i22);
        if (al != 0) {
            int i29 = (((i23 * i24) - (i21 * i25)) << 9) / al;
            int i30 = (((i20 * i25) - (i24 * i22)) << 9) / al;
            al = i10 - i11;
            i20 = i13 - i14;
            i21 = i16 - i17;
            i22 = i12 - i10;
            i23 = i15 - i13;
            i24 = i18 - i16;
            i25 = ((i22 * i13) - (i10 * i23)) << 14;
            int i31 = (int) (((((long) ((i23 * i16) - (i13 * i24))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i32 = (int) ((((long) ((i24 * i10) - (i22 * i16))) << 14) / ((long) (this.bq * 1516652957)));
            int i33 = ((i13 * al) - (i10 * i20)) << 14;
            int i34 = (int) (((((long) ((i20 * i16) - (i21 * i13))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i35 = (int) ((((long) ((i21 * i10) - (i16 * al))) << 14) / ((long) (this.bq * 1516652957)));
            int i36 = ((i20 * i22) - (i23 * al)) << 14;
            int i37 = (int) (((((long) ((i23 * i21) - (i20 * i24))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i38 = (int) ((((long) ((al * i24) - (i22 * i21))) << 14) / ((long) (this.bq * 1516652957)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i20 = i > this.bf * 651738037 ? 651738037 * this.bf : i;
                        i39 = ((i8 << 9) - (i29 * i5)) + i29;
                        if (i3 < i20) {
                            i22 = i5 << 14;
                            if (i2 < 0) {
                                i39 -= i2 * i30;
                                i21 = i22 - (i27 * i2);
                                i40 = i22 - (i2 * i26);
                                i2 = 0;
                            } else {
                                i21 = i22;
                                i40 = i22;
                            }
                            al = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = al - (i3 * i28);
                            } else {
                                i41 = al;
                            }
                            al = i2 - (this.bo * -1165057787);
                            i42 = i25 + (al * i32);
                            i33 += i35 * al;
                            i36 += al * i38;
                            if ((i3 == i2 || i26 >= i27) && (i2 != i3 || i26 <= i28)) {
                                i43 = i20 - i3;
                                al = i3 - i2;
                                i23 = this.bg[i2];
                                i44 = i21;
                                while (true) {
                                    i45 = al - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    ao(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1394943154);
                                    i40 += i26;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i45;
                                    i44 += i27;
                                }
                                al = i43;
                                i45 = i41;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 >= 0) {
                                        ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 996005027);
                                        i39 += i30;
                                        i23 += this.ah * 1956907281;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        al = i41;
                                        i45 += i28;
                                        i40 += i26;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i20 - i3;
                            al = i3 - i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i21;
                                i45 = al - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -305206586);
                                i40 += i26;
                                i21 = i44 + i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i45;
                            }
                            al = i43;
                            i45 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1255009673);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i28;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        al = i5 << 14;
                        if (i2 < 0) {
                            i22 = al - (i26 * i2);
                            i43 = al - (i27 * i2);
                            i39 -= i2 * i30;
                            i2 = 0;
                        } else {
                            i22 = al;
                            i43 = al;
                        }
                        i21 = i4 << 14;
                        if (i20 < 0) {
                            al = 0;
                            i41 = i21 - (i20 * i28);
                        } else {
                            al = i20;
                            i41 = i21;
                        }
                        i20 = i2 - (this.bo * -1165057787);
                        i42 = i25 + (i20 * i32);
                        i33 += i20 * i35;
                        i36 += i20 * i38;
                        if (i26 < i27) {
                            i45 = i3 - al;
                            al -= i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i22;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -683070039);
                                i22 = i44 + i26;
                                i43 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            while (true) {
                                i45--;
                                if (i45 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 71433987);
                                    i41 += i28;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i27;
                                } else {
                                    return;
                                }
                            }
                        }
                        i45 = i3 - al;
                        al -= i2;
                        i23 = this.bg[i2];
                        i44 = i22;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 720634503);
                            i43 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1491431128);
                                i41 += i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i27;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i20 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                    i39 = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i20) {
                        i22 = i6 << 14;
                        if (i3 < 0) {
                            i39 -= i3 * i30;
                            i21 = i22 - (i28 * i3);
                            i45 = i22 - (i27 * i3);
                            i3 = 0;
                        } else {
                            i21 = i22;
                            i45 = i22;
                        }
                        al = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = al - (i * i26);
                        } else {
                            i41 = al;
                        }
                        al = i3 - (this.bo * -1165057787);
                        i42 = i25 + (al * i32);
                        i33 += i35 * al;
                        i36 += al * i38;
                        if (i27 < i28) {
                            i43 = i20 - i;
                            al = i - i3;
                            i23 = this.bg[i3];
                            while (true) {
                                i44 = i21;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 2035540816);
                                i45 += i27;
                                i21 = i44 + i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            al = i43;
                            i40 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -965510751);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i27;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i20 - i;
                        al = i - i3;
                        i23 = this.bg[i3];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 37662767);
                            i45 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i28;
                        }
                        al = i43;
                        i40 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -753715368);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i27;
                                i40 += i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i6 << 14;
                    if (i3 < 0) {
                        i39 -= i3 * i30;
                        i40 = i21 - (i3 * i28);
                        i22 = i21 - (i3 * i27);
                        i3 = 0;
                    } else {
                        i22 = i21;
                        i40 = i21;
                    }
                    i21 = i5 << 14;
                    if (i20 < 0) {
                        al = 0;
                        i41 = i21 - (i20 * i26);
                    } else {
                        al = i20;
                        i41 = i21;
                    }
                    i20 = i3 - (this.bo * -1165057787);
                    i42 = i25 + (i20 * i32);
                    i33 += i35 * i20;
                    i36 += i20 * i38;
                    if (i27 < i28) {
                        i20 = al - i3;
                        i43 = i - al;
                        i23 = this.bg[i3];
                        al = i20;
                        while (true) {
                            i44 = i22;
                            i45 = al - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -581751399);
                            i22 = i44 + i27;
                            i40 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i45;
                        }
                        al = i43;
                        i45 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -1313302825);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i26;
                                i40 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i20 = al - i3;
                    i43 = i - al;
                    i23 = this.bg[i3];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i45 = al - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1971309366);
                        i40 += i28;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i45;
                        i44 += i27;
                    }
                    al = i43;
                    i45 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -355656446);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i28;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i20 = i3 > this.bf * 651738037 ? 651738037 * this.bf : i3;
                i39 = ((i7 << 9) - (i4 * i29)) + i29;
                if (i2 < i20) {
                    al = i4 << 14;
                    if (i < 0) {
                        i43 = al - (i28 * i);
                        i21 = al - (i * i26);
                        i39 -= i * i30;
                        i = 0;
                    } else {
                        i43 = al;
                        i21 = al;
                    }
                    al = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = al - (i2 * i27);
                    } else {
                        i41 = al;
                    }
                    al = i - (this.bo * -1165057787);
                    i42 = i25 + (i32 * al);
                    i33 += i35 * al;
                    i36 += al * i38;
                    if ((i == i2 || i28 >= i26) && (i2 != i || i28 <= i27)) {
                        i45 = i20 - i2;
                        al = i2 - i;
                        i23 = this.bg[i];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -981961278);
                            i43 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 534900239);
                                i41 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i45 = i20 - i2;
                    al = i2 - i;
                    i23 = this.bg[i];
                    while (true) {
                        i44 = i21;
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 471753288);
                        i43 += i28;
                        i21 = i44 + i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                    }
                    while (true) {
                        i45--;
                        if (i45 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1793883567);
                            i41 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i28;
                        } else {
                            return;
                        }
                    }
                }
                al = i4 << 14;
                if (i < 0) {
                    i45 = al - (i * i26);
                    i39 -= i * i30;
                    i22 = al - (i28 * i);
                    i = 0;
                } else {
                    i45 = al;
                    i22 = al;
                }
                i21 = i6 << 14;
                if (i20 < 0) {
                    al = 0;
                    i41 = i21 - (i20 * i27);
                } else {
                    al = i20;
                    i41 = i21;
                }
                i20 = i - (this.bo * -1165057787);
                i42 = i25 + (i32 * i20);
                i33 += i20 * i35;
                i36 += i20 * i38;
                if ((al == i || i28 >= i26) && (i != al || i27 <= i26)) {
                    i20 = al - i;
                    i43 = i2 - al;
                    i23 = this.bg[i];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -992808129);
                        i45 += i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                        i44 += i28;
                    }
                    al = i43;
                    i40 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -568094500);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i27;
                        } else {
                            return;
                        }
                    }
                }
                i20 = al - i;
                i43 = i2 - al;
                i23 = this.bg[i];
                al = i20;
                while (true) {
                    i44 = i22;
                    i40 = al - 1;
                    if (i40 < 0) {
                        break;
                    }
                    ao(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -346576540);
                    i22 = i44 + i28;
                    i45 += i26;
                    i39 += i30;
                    i23 += this.ah * 1956907281;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    al = i40;
                }
                al = i43;
                i40 = i41;
                while (true) {
                    i41 = al - 1;
                    if (i41 >= 0) {
                        ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -539091007);
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i41;
                        i45 += i26;
                        i40 += i27;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] ar = il.ax.ar(i19, -697190401);
        int al;
        if (ar == null) {
            al = il.ax.al(i19, 926660985);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2138085532), kr.br(al, i8, 2141825558), kr.br(al, i9, 2136726304), (byte) 16);
            return;
        }
        this.ba = il.ax.ai(i19, (byte) 0);
        this.bk = il.ax.aj(i19, 2061852243);
        int i20 = i5 - i4;
        int i21 = i2 - i;
        int i22 = i6 - i4;
        int i23 = i3 - i;
        int i24 = i8 - i7;
        int i25 = i9 - i7;
        int i26 = i2 != i ? (i20 << 14) / i21 : 0;
        int i27 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i28 = i != i3 ? ((i4 - i6) << 14) / (i - i3) : 0;
        al = (i20 * i23) - (i21 * i22);
        if (al != 0) {
            int i29 = (((i23 * i24) - (i21 * i25)) << 9) / al;
            int i30 = (((i20 * i25) - (i22 * i24)) << 9) / al;
            al = i10 - i11;
            i20 = i13 - i14;
            i21 = i16 - i17;
            i22 = i12 - i10;
            i23 = i15 - i13;
            i24 = i18 - i16;
            i25 = ((i22 * i13) - (i23 * i10)) << 14;
            int i31 = (int) ((((long) ((i16 * i23) - (i13 * i24))) << 14) / ((long) (this.bq * 1516652957)));
            int i32 = (int) ((((long) ((i24 * i10) - (i16 * i22))) << 14) / ((long) (this.bq * 1516652957)));
            int i33 = ((i13 * al) - (i20 * i10)) << 14;
            int i34 = (int) ((((long) ((i16 * i20) - (i21 * i13))) << 14) / ((long) (this.bq * 1516652957)));
            int i35 = (int) ((((long) ((i10 * i21) - (i16 * al))) << 14) / ((long) (this.bq * 1516652957)));
            int i36 = ((i20 * i22) - (al * i23)) << 14;
            int i37 = (int) ((((long) ((i23 * i21) - (i20 * i24))) << 14) / ((long) (this.bq * 1516652957)));
            int i38 = (int) ((((long) ((al * i24) - (i21 * i22))) << 14) / ((long) (this.bq * 1516652957)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i20 = i > this.bf * 651738037 ? 651738037 * this.bf : i;
                        i39 = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i20) {
                            i22 = i5 << 14;
                            if (i2 < 0) {
                                i39 -= i2 * i30;
                                i21 = i22 - (i2 * i27);
                                i40 = i22 - (i2 * i26);
                                i2 = 0;
                            } else {
                                i21 = i22;
                                i40 = i22;
                            }
                            al = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = al - (i3 * i28);
                            } else {
                                i41 = al;
                            }
                            al = i2 - (this.bo * -1165057787);
                            i42 = i25 + (al * i32);
                            i33 += i35 * al;
                            i36 += al * i38;
                            if ((i3 == i2 || i26 >= i27) && (i2 != i3 || i26 <= i28)) {
                                i43 = i20 - i3;
                                al = i3 - i2;
                                i23 = this.bg[i2];
                                i44 = i21;
                                while (true) {
                                    i45 = al - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    af(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -31);
                                    i40 += i26;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i45;
                                    i44 += i27;
                                }
                                al = i43;
                                i45 = i41;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 >= 0) {
                                        af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -92);
                                        i39 += i30;
                                        i23 += this.ah * 1956907281;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        al = i41;
                                        i45 += i28;
                                        i40 += i26;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i20 - i3;
                            al = i3 - i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i21;
                                i45 = al - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -93);
                                i40 += i26;
                                i21 = i44 + i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i45;
                            }
                            al = i43;
                            i45 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -122);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i28;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        al = i5 << 14;
                        if (i2 < 0) {
                            i22 = al - (i26 * i2);
                            i43 = al - (i27 * i2);
                            i39 -= i2 * i30;
                            i2 = 0;
                        } else {
                            i22 = al;
                            i43 = al;
                        }
                        i21 = i4 << 14;
                        if (i20 < 0) {
                            al = 0;
                            i41 = i21 - (i20 * i28);
                        } else {
                            al = i20;
                            i41 = i21;
                        }
                        i20 = i2 - (this.bo * -1165057787);
                        i42 = i25 + (i32 * i20);
                        i33 += i35 * i20;
                        i36 += i20 * i38;
                        if (i26 < i27) {
                            i45 = i3 - al;
                            al -= i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i22;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -104);
                                i22 = i44 + i26;
                                i43 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            while (true) {
                                i45--;
                                if (i45 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) 6);
                                    i41 += i28;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i27;
                                } else {
                                    return;
                                }
                            }
                        }
                        i45 = i3 - al;
                        al -= i2;
                        i23 = this.bg[i2];
                        i44 = i22;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -103);
                            i43 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -119);
                                i41 += i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i27;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i20 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                    i39 = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i20) {
                        i22 = i6 << 14;
                        if (i3 < 0) {
                            i39 -= i3 * i30;
                            i21 = i22 - (i28 * i3);
                            i45 = i22 - (i27 * i3);
                            i3 = 0;
                        } else {
                            i21 = i22;
                            i45 = i22;
                        }
                        al = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = al - (i * i26);
                        } else {
                            i41 = al;
                        }
                        al = i3 - (this.bo * -1165057787);
                        i42 = i25 + (i32 * al);
                        i33 += i35 * al;
                        i36 += al * i38;
                        if (i27 < i28) {
                            i43 = i20 - i;
                            al = i - i3;
                            i23 = this.bg[i3];
                            while (true) {
                                i44 = i21;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -48);
                                i45 += i27;
                                i21 = i44 + i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            al = i43;
                            i40 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -24);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i27;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i20 - i;
                        al = i - i3;
                        i23 = this.bg[i3];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -86);
                            i45 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i28;
                        }
                        al = i43;
                        i40 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -100);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i27;
                                i40 += i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i6 << 14;
                    if (i3 < 0) {
                        i39 -= i3 * i30;
                        i40 = i21 - (i3 * i28);
                        i22 = i21 - (i27 * i3);
                        i3 = 0;
                    } else {
                        i22 = i21;
                        i40 = i21;
                    }
                    i21 = i5 << 14;
                    if (i20 < 0) {
                        al = 0;
                        i41 = i21 - (i20 * i26);
                    } else {
                        al = i20;
                        i41 = i21;
                    }
                    i20 = i3 - (this.bo * -1165057787);
                    i42 = i25 + (i20 * i32);
                    i33 += i35 * i20;
                    i36 += i20 * i38;
                    if (i27 < i28) {
                        i20 = al - i3;
                        i43 = i - al;
                        i23 = this.bg[i3];
                        al = i20;
                        while (true) {
                            i44 = i22;
                            i45 = al - 1;
                            if (i45 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -38);
                            i22 = i44 + i27;
                            i40 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i45;
                        }
                        al = i43;
                        i45 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -6);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i26;
                                i40 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i20 = al - i3;
                    i43 = i - al;
                    i23 = this.bg[i3];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i45 = al - 1;
                        if (i45 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -30);
                        i40 += i28;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i45;
                        i44 += i27;
                    }
                    al = i43;
                    i45 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -21);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i28;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i20 = i3 > this.bf * 651738037 ? 651738037 * this.bf : i3;
                i39 = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i20) {
                    al = i4 << 14;
                    if (i < 0) {
                        i43 = al - (i * i28);
                        i21 = al - (i * i26);
                        i39 -= i * i30;
                        i = 0;
                    } else {
                        i43 = al;
                        i21 = al;
                    }
                    al = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = al - (i2 * i27);
                    } else {
                        i41 = al;
                    }
                    al = i - (this.bo * -1165057787);
                    i42 = i25 + (i32 * al);
                    i33 += i35 * al;
                    i36 += al * i38;
                    if ((i2 == i || i28 >= i26) && (i != i2 || i28 <= i27)) {
                        i45 = i20 - i2;
                        al = i2 - i;
                        i23 = this.bg[i];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) 2);
                            i43 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -8);
                                i41 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i45 = i20 - i2;
                    al = i2 - i;
                    i23 = this.bg[i];
                    while (true) {
                        i44 = i21;
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -62);
                        i43 += i28;
                        i21 = i44 + i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                    }
                    while (true) {
                        i45--;
                        if (i45 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -27);
                            i41 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i28;
                        } else {
                            return;
                        }
                    }
                }
                al = i4 << 14;
                if (i < 0) {
                    i45 = al - (i26 * i);
                    i39 -= i * i30;
                    i22 = al - (i * i28);
                    i = 0;
                } else {
                    i45 = al;
                    i22 = al;
                }
                i21 = i6 << 14;
                if (i20 < 0) {
                    al = 0;
                    i41 = i21 - (i20 * i27);
                } else {
                    al = i20;
                    i41 = i21;
                }
                i20 = i - (this.bo * -1165057787);
                i42 = i25 + (i32 * i20);
                i33 += i35 * i20;
                i36 += i20 * i38;
                if ((al == i || i28 >= i26) && (i != al || i27 <= i26)) {
                    i20 = al - i;
                    i43 = i2 - al;
                    i23 = this.bg[i];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -1);
                        i45 += i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                        i44 += i28;
                    }
                    al = i43;
                    i40 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -127);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i27;
                        } else {
                            return;
                        }
                    }
                }
                i20 = al - i;
                i43 = i2 - al;
                i23 = this.bg[i];
                al = i20;
                while (true) {
                    i44 = i22;
                    i40 = al - 1;
                    if (i40 < 0) {
                        break;
                    }
                    af(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -49);
                    i22 = i44 + i28;
                    i45 += i26;
                    i39 += i30;
                    i23 += this.ah * 1956907281;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    al = i40;
                }
                al = i43;
                i40 = i41;
                while (true) {
                    i41 = al - 1;
                    if (i41 >= 0) {
                        af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -99);
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i41;
                        i45 += i26;
                        i40 += i27;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ds(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] ar = il.ax.ar(i19, -1078538389);
        int al;
        if (ar == null) {
            al = il.ax.al(i19, 1289319318);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2144018120), kr.br(al, i8, 2138583049), kr.br(al, i9, 2135704146), (byte) 16);
            return;
        }
        this.ba = il.ax.ai(i19, (byte) 0);
        this.bk = il.ax.aj(i19, 1516292532);
        int i20 = i5 - i4;
        int i21 = i2 - i;
        int i22 = i6 - i4;
        int i23 = i3 - i;
        int i24 = i8 - i7;
        int i25 = i9 - i7;
        int i26 = i2 != i ? (i20 << 14) / i21 : 0;
        int i27 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i28 = i3 != i ? ((i4 - i6) << 14) / (i - i3) : 0;
        al = (i20 * i23) - (i21 * i22);
        if (al != 0) {
            int i29 = (((i23 * i24) - (i21 * i25)) << 9) / al;
            int i30 = (((i20 * i25) - (i24 * i22)) << 9) / al;
            al = i10 - i11;
            i20 = i13 - i14;
            i21 = i16 - i17;
            i22 = i12 - i10;
            i23 = i15 - i13;
            i24 = i18 - i16;
            i25 = ((i22 * i13) - (i10 * i23)) << 14;
            int i31 = (int) (((((long) ((i23 * i16) - (i13 * i24))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i32 = (int) ((((long) ((i24 * i10) - (i22 * i16))) << 14) / ((long) (this.bq * 1516652957)));
            int i33 = ((i13 * al) - (i10 * i20)) << 14;
            int i34 = (int) (((((long) ((i20 * i16) - (i21 * i13))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i35 = (int) ((((long) ((i21 * i10) - (i16 * al))) << 14) / ((long) (this.bq * 1516652957)));
            int i36 = ((i20 * i22) - (i23 * al)) << 14;
            int i37 = (int) (((((long) ((i23 * i21) - (i20 * i24))) << 3) << 14) / ((long) (this.bq * 1516652957)));
            int i38 = (int) ((((long) ((al * i24) - (i22 * i21))) << 14) / ((long) (this.bq * 1516652957)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i20 = i > this.bf * 651738037 ? 651738037 * this.bf : i;
                        i39 = ((i8 << 9) - (i29 * i5)) + i29;
                        if (i3 < i20) {
                            i22 = i5 << 14;
                            if (i2 < 0) {
                                i39 -= i2 * i30;
                                i21 = i22 - (i27 * i2);
                                i40 = i22 - (i2 * i26);
                                i2 = 0;
                            } else {
                                i21 = i22;
                                i40 = i22;
                            }
                            al = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = al - (i3 * i28);
                            } else {
                                i41 = al;
                            }
                            al = i2 - (this.bo * -1165057787);
                            i42 = i25 + (al * i32);
                            i33 += i35 * al;
                            i36 += al * i38;
                            if ((i3 == i2 || i26 >= i27) && (i2 != i3 || i26 <= i28)) {
                                i43 = i20 - i3;
                                al = i3 - i2;
                                i23 = this.bg[i2];
                                i44 = i21;
                                while (true) {
                                    i45 = al - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    ao(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1185488859);
                                    i40 += i26;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i45;
                                    i44 += i27;
                                }
                                al = i43;
                                i45 = i41;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 >= 0) {
                                        ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 810439661);
                                        i39 += i30;
                                        i23 += this.ah * 1956907281;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        al = i41;
                                        i45 += i28;
                                        i40 += i26;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i20 - i3;
                            al = i3 - i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i21;
                                i45 = al - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1168961037);
                                i40 += i26;
                                i21 = i44 + i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i45;
                            }
                            al = i43;
                            i45 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 581108397);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i28;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        al = i5 << 14;
                        if (i2 < 0) {
                            i22 = al - (i26 * i2);
                            i43 = al - (i27 * i2);
                            i39 -= i2 * i30;
                            i2 = 0;
                        } else {
                            i22 = al;
                            i43 = al;
                        }
                        i21 = i4 << 14;
                        if (i20 < 0) {
                            al = 0;
                            i41 = i21 - (i20 * i28);
                        } else {
                            al = i20;
                            i41 = i21;
                        }
                        i20 = i2 - (this.bo * -1165057787);
                        i42 = i25 + (i20 * i32);
                        i33 += i20 * i35;
                        i36 += i20 * i38;
                        if (i26 < i27) {
                            i45 = i3 - al;
                            al -= i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i22;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1603593567);
                                i22 = i44 + i26;
                                i43 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            while (true) {
                                i45--;
                                if (i45 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 377305414);
                                    i41 += i28;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i27;
                                } else {
                                    return;
                                }
                            }
                        }
                        i45 = i3 - al;
                        al -= i2;
                        i23 = this.bg[i2];
                        i44 = i22;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1422485501);
                            i43 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1632360037);
                                i41 += i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i27;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i20 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                    i39 = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i20) {
                        i22 = i6 << 14;
                        if (i3 < 0) {
                            i39 -= i3 * i30;
                            i21 = i22 - (i28 * i3);
                            i45 = i22 - (i27 * i3);
                            i3 = 0;
                        } else {
                            i21 = i22;
                            i45 = i22;
                        }
                        al = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = al - (i * i26);
                        } else {
                            i41 = al;
                        }
                        al = i3 - (this.bo * -1165057787);
                        i42 = i25 + (al * i32);
                        i33 += i35 * al;
                        i36 += al * i38;
                        if (i27 < i28) {
                            i43 = i20 - i;
                            al = i - i3;
                            i23 = this.bg[i3];
                            while (true) {
                                i44 = i21;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                ao(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1076844476);
                                i45 += i27;
                                i21 = i44 + i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            al = i43;
                            i40 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 254736913);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i27;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i20 - i;
                        al = i - i3;
                        i23 = this.bg[i3];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1395525256);
                            i45 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i28;
                        }
                        al = i43;
                        i40 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -616375446);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i27;
                                i40 += i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i6 << 14;
                    if (i3 < 0) {
                        i39 -= i3 * i30;
                        i40 = i21 - (i3 * i28);
                        i22 = i21 - (i3 * i27);
                        i3 = 0;
                    } else {
                        i22 = i21;
                        i40 = i21;
                    }
                    i21 = i5 << 14;
                    if (i20 < 0) {
                        al = 0;
                        i41 = i21 - (i20 * i26);
                    } else {
                        al = i20;
                        i41 = i21;
                    }
                    i20 = i3 - (this.bo * -1165057787);
                    i42 = i25 + (i20 * i32);
                    i33 += i35 * i20;
                    i36 += i20 * i38;
                    if (i27 < i28) {
                        i20 = al - i3;
                        i43 = i - al;
                        i23 = this.bg[i3];
                        al = i20;
                        while (true) {
                            i44 = i22;
                            i45 = al - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 328743479);
                            i22 = i44 + i27;
                            i40 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i45;
                        }
                        al = i43;
                        i45 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1304651962);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i26;
                                i40 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i20 = al - i3;
                    i43 = i - al;
                    i23 = this.bg[i3];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i45 = al - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -19845819);
                        i40 += i28;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i45;
                        i44 += i27;
                    }
                    al = i43;
                    i45 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -4653337);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i28;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i20 = i3 > this.bf * 651738037 ? 651738037 * this.bf : i3;
                i39 = ((i7 << 9) - (i4 * i29)) + i29;
                if (i2 < i20) {
                    al = i4 << 14;
                    if (i < 0) {
                        i43 = al - (i28 * i);
                        i21 = al - (i * i26);
                        i39 -= i * i30;
                        i = 0;
                    } else {
                        i43 = al;
                        i21 = al;
                    }
                    al = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = al - (i2 * i27);
                    } else {
                        i41 = al;
                    }
                    al = i - (this.bo * -1165057787);
                    i42 = i25 + (i32 * al);
                    i33 += i35 * al;
                    i36 += al * i38;
                    if ((i == i2 || i28 >= i26) && (i2 != i || i28 <= i27)) {
                        i45 = i20 - i2;
                        al = i2 - i;
                        i23 = this.bg[i];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            ao(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -513997449);
                            i43 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                ao(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1023237197);
                                i41 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i45 = i20 - i2;
                    al = i2 - i;
                    i23 = this.bg[i];
                    while (true) {
                        i44 = i21;
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 280818673);
                        i43 += i28;
                        i21 = i44 + i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                    }
                    while (true) {
                        i45--;
                        if (i45 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 888320531);
                            i41 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i28;
                        } else {
                            return;
                        }
                    }
                }
                al = i4 << 14;
                if (i < 0) {
                    i45 = al - (i * i26);
                    i39 -= i * i30;
                    i22 = al - (i28 * i);
                    i = 0;
                } else {
                    i45 = al;
                    i22 = al;
                }
                i21 = i6 << 14;
                if (i20 < 0) {
                    al = 0;
                    i41 = i21 - (i20 * i27);
                } else {
                    al = i20;
                    i41 = i21;
                }
                i20 = i - (this.bo * -1165057787);
                i42 = i25 + (i32 * i20);
                i33 += i20 * i35;
                i36 += i20 * i38;
                if ((al == i || i28 >= i26) && (i != al || i27 <= i26)) {
                    i20 = al - i;
                    i43 = i2 - al;
                    i23 = this.bg[i];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        ao(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -167795553);
                        i45 += i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                        i44 += i28;
                    }
                    al = i43;
                    i40 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            ao(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 1177521851);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i27;
                        } else {
                            return;
                        }
                    }
                }
                i20 = al - i;
                i43 = i2 - al;
                i23 = this.bg[i];
                al = i20;
                while (true) {
                    i44 = i22;
                    i40 = al - 1;
                    if (i40 < 0) {
                        break;
                    }
                    ao(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, 459203223);
                    i22 = i44 + i28;
                    i45 += i26;
                    i39 += i30;
                    i23 += this.ah * 1956907281;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    al = i40;
                }
                al = i43;
                i40 = i41;
                while (true) {
                    i41 = al - 1;
                    if (i41 >= 0) {
                        ao(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, -614614970);
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i41;
                        i45 += i26;
                        i40 += i27;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dw(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.at) {
            if (i5 > this.bl * 1505645037) {
                i5 = this.bl * 1505645037;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i4 * i7);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            if (this.ba) {
                i17 = i4 - (this.bd * -1240378447);
                i18 = i8 + (i17 * i11);
                i19 = i9 + (i17 * i12);
                i20 = i10 + (i17 * i13);
                i21 = i20 >> 12;
                if (i21 != 0) {
                    i22 = i18 / i21;
                    i23 = i19 / i21;
                } else {
                    i22 = 0;
                    i23 = 0;
                }
                i17 = ((i13 * i16) + i20) >> 12;
                if (i17 != 0) {
                    i21 = ((i11 * i16) + i18) / i17;
                    i17 = ((i12 * i16) + i19) / i17;
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i18 = (i22 << 20) + i23;
                i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 20);
                i22 = i16 >> 3;
                i19 = i7 << 3;
                i21 = i15 >> 8;
                if (this.bk) {
                    if (i22 > 0) {
                        i17 = i14;
                        while (true) {
                            i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i20 = i17 + 1;
                            iArr[i17] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i17 = i18 + i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & 16711680)) >> 8;
                            i14 = i17 + i23;
                            i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                            i17 = i20 + 1;
                            iArr[i20] = (((i21 * (i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i18) * i21) & -16711936)) >> 8;
                            i14 += i23;
                            i15 += i19;
                            i21 = i15 >> 8;
                            i22--;
                            if (i22 <= 0) {
                                break;
                            }
                            i18 = i14;
                        }
                        i22 = i21;
                        i18 = i14;
                        i15 = i17;
                    } else {
                        i22 = i21;
                        i15 = i14;
                    }
                    i14 = i16 & 7;
                    if (i14 > 0) {
                        i17 = i18;
                        i21 = i15;
                        while (true) {
                            i18 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                            iArr[i21] = ((((i18 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i22) & 16711680)) >> 8;
                            i17 += i23;
                            i14--;
                            if (i14 > 0) {
                                i21++;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i22 > 0) {
                    do {
                        i17 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                        if (i17 != 0) {
                            iArr[i14] = ((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i17) * i21) & -16711936)) >> 8;
                        }
                        i17 = i14 + 1;
                        i14 = i18 + i23;
                        i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i21) & 16711680)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i21) & 16711680)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i21) & 16711680)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 16711935) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i21) & 16711680)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i18) * i21) & -16711936)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i18) * i21) & -16711936)) >> 8;
                        }
                        i17++;
                        i18 = i14 + i23;
                        i14 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                        if (i14 != 0) {
                            iArr[i17] = (((i21 * (i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                        }
                        i14 = i17 + 1;
                        i18 += i23;
                        i15 += i19;
                        i21 = i15 >> 8;
                        i22--;
                    } while (i22 > 0);
                    i15 = i21;
                    i17 = i18;
                } else {
                    i15 = i21;
                    i17 = i18;
                }
                i18 = i16 & 7;
                if (i18 > 0) {
                    i21 = i14;
                    while (true) {
                        i14 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                        if (i14 != 0) {
                            iArr[i21] = ((((i14 & 16711935) * i15) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i15) & 16711680)) >> 8;
                        }
                        i21++;
                        i17 += i23;
                        i14 = i18 - 1;
                        if (i14 > 0) {
                            i18 = i14;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i17 = i4 - (this.bd * -1240378447);
            i18 = i8 + (i11 * i17);
            i19 = i9 + (i12 * i17);
            i20 = i10 + (i17 * i13);
            i21 = i20 >> 14;
            if (i21 != 0) {
                i22 = i18 / i21;
                i23 = i19 / i21;
            } else {
                i22 = 0;
                i23 = 0;
            }
            i17 = ((i16 * i13) + i20) >> 14;
            if (i17 != 0) {
                i21 = ((i11 * i16) + i18) / i17;
                i17 = ((i12 * i16) + i19) / i17;
            } else {
                i21 = 0;
                i17 = 0;
            }
            i18 = (i22 << 18) + i23;
            i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 18);
            i22 = i16 >> 3;
            i19 = i7 << 3;
            i17 = i15 >> 8;
            if (this.bk) {
                if (i22 > 0) {
                    i21 = i18;
                    while (true) {
                        i18 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i20 = i14 + 1;
                        iArr[i14] = ((((i18 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i18 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i14 = i20 + 1;
                        iArr[i20] = (((i17 * (i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                        i21 += i23;
                        i15 += i19;
                        i17 = i15 >> 8;
                        i18 = i22 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i22 = i18;
                    }
                    i15 = i17;
                } else {
                    i15 = i17;
                    i21 = i18;
                }
                i18 = i16 & 7;
                if (i18 > 0) {
                    i17 = i21;
                    while (true) {
                        i21 = iArr2[(i17 >>> 25) + (i17 & 16256)];
                        iArr[i14] = ((((i21 & 16711935) * i15) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i21) * i15) & 16711680)) >> 8;
                        i17 += i23;
                        i18--;
                        if (i18 > 0) {
                            i14++;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i22 > 0) {
                do {
                    i21 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i21 != 0) {
                        iArr[i14] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 16711680) + (((16711935 & i21) * i17) & -16711936)) >> 8;
                    }
                    i21 = i14 + 1;
                    i14 = i18 + i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & 16711680)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & 16711680)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & 16711680)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                    }
                    i21++;
                    i18 = i14 + i23;
                    i14 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                    if (i14 != 0) {
                        iArr[i21] = (((i17 * (i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((16711935 & i14) * i17) & -16711936)) >> 8;
                    }
                    i14 = i21 + 1;
                    i18 += i23;
                    i15 += i19;
                    i17 = i15 >> 8;
                    i22--;
                } while (i22 > 0);
                i15 = i17;
                i21 = i18;
            } else {
                i15 = i17;
                i21 = i18;
            }
            i18 = i16 & 7;
            if (i18 > 0) {
                i17 = i21;
                while (true) {
                    i21 = iArr2[(i17 & 16256) + (i17 >>> 25)];
                    if (i21 != 0) {
                        iArr[i14] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i15) & 16711680) + (((16711935 & i21) * i15) & -16711936)) >> 8;
                    }
                    i21 = i14 + 1;
                    i17 += i23;
                    i18--;
                    if (i18 > 0) {
                        i14 = i21;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] ar = il.ax.ar(i19, 1884975729);
        int al;
        if (ar == null) {
            al = il.ax.al(i19, 397293868);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i7, 2145949817), kr.br(al, i8, 2140042355), kr.br(al, i9, 2140344844), (byte) 16);
            return;
        }
        this.ba = il.ax.ai(i19, (byte) 0);
        this.bk = il.ax.aj(i19, -1445202568);
        int i20 = i5 - i4;
        int i21 = i2 - i;
        int i22 = i6 - i4;
        int i23 = i3 - i;
        int i24 = i8 - i7;
        int i25 = i9 - i7;
        int i26 = i2 != i ? (i20 << 14) / i21 : 0;
        int i27 = i2 != i3 ? ((i6 - i5) << 14) / (i3 - i2) : 0;
        int i28 = i != i3 ? ((i4 - i6) << 14) / (i - i3) : 0;
        al = (i20 * i23) - (i21 * i22);
        if (al != 0) {
            int i29 = (((i23 * i24) - (i21 * i25)) << 9) / al;
            int i30 = (((i20 * i25) - (i22 * i24)) << 9) / al;
            al = i10 - i11;
            i20 = i13 - i14;
            i21 = i16 - i17;
            i22 = i12 - i10;
            i23 = i15 - i13;
            i24 = i18 - i16;
            i25 = ((i22 * i13) - (i23 * i10)) << 14;
            int i31 = (int) ((((long) ((i16 * i23) - (i13 * i24))) << 14) / ((long) (this.bq * 1516652957)));
            int i32 = (int) ((((long) ((i24 * i10) - (i16 * i22))) << 14) / ((long) (this.bq * 1516652957)));
            int i33 = ((i13 * al) - (i20 * i10)) << 14;
            int i34 = (int) ((((long) ((i16 * i20) - (i21 * i13))) << 14) / ((long) (this.bq * 1516652957)));
            int i35 = (int) ((((long) ((i10 * i21) - (i16 * al))) << 14) / ((long) (this.bq * 1516652957)));
            int i36 = ((i20 * i22) - (al * i23)) << 14;
            int i37 = (int) ((((long) ((i23 * i21) - (i20 * i24))) << 14) / ((long) (this.bq * 1516652957)));
            int i38 = (int) ((((long) ((al * i24) - (i21 * i22))) << 14) / ((long) (this.bq * 1516652957)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bf * 651738037) {
                        if (i3 > this.bf * 651738037) {
                            i3 = this.bf * 651738037;
                        }
                        i20 = i > this.bf * 651738037 ? 651738037 * this.bf : i;
                        i39 = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i20) {
                            i22 = i5 << 14;
                            if (i2 < 0) {
                                i39 -= i2 * i30;
                                i21 = i22 - (i2 * i27);
                                i40 = i22 - (i2 * i26);
                                i2 = 0;
                            } else {
                                i21 = i22;
                                i40 = i22;
                            }
                            al = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = al - (i3 * i28);
                            } else {
                                i41 = al;
                            }
                            al = i2 - (this.bo * -1165057787);
                            i42 = i25 + (al * i32);
                            i33 += i35 * al;
                            i36 += al * i38;
                            if ((i3 == i2 || i26 >= i27) && (i2 != i3 || i26 <= i28)) {
                                i43 = i20 - i3;
                                al = i3 - i2;
                                i23 = this.bg[i2];
                                i44 = i21;
                                while (true) {
                                    i45 = al - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    af(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -30);
                                    i40 += i26;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i45;
                                    i44 += i27;
                                }
                                al = i43;
                                i45 = i41;
                                while (true) {
                                    i41 = al - 1;
                                    if (i41 >= 0) {
                                        af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) 5);
                                        i39 += i30;
                                        i23 += this.ah * 1956907281;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        al = i41;
                                        i45 += i28;
                                        i40 += i26;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i20 - i3;
                            al = i3 - i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i21;
                                i45 = al - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -15);
                                i40 += i26;
                                i21 = i44 + i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i45;
                            }
                            al = i43;
                            i45 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -120);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i28;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        al = i5 << 14;
                        if (i2 < 0) {
                            i22 = al - (i26 * i2);
                            i43 = al - (i27 * i2);
                            i39 -= i2 * i30;
                            i2 = 0;
                        } else {
                            i22 = al;
                            i43 = al;
                        }
                        i21 = i4 << 14;
                        if (i20 < 0) {
                            al = 0;
                            i41 = i21 - (i20 * i28);
                        } else {
                            al = i20;
                            i41 = i21;
                        }
                        i20 = i2 - (this.bo * -1165057787);
                        i42 = i25 + (i32 * i20);
                        i33 += i35 * i20;
                        i36 += i20 * i38;
                        if (i26 < i27) {
                            i45 = i3 - al;
                            al -= i2;
                            i23 = this.bg[i2];
                            while (true) {
                                i44 = i22;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -112);
                                i22 = i44 + i26;
                                i43 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            while (true) {
                                i45--;
                                if (i45 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -7);
                                    i41 += i28;
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i27;
                                } else {
                                    return;
                                }
                            }
                        }
                        i45 = i3 - al;
                        al -= i2;
                        i23 = this.bg[i2];
                        i44 = i22;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -58);
                            i43 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -53);
                                i41 += i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i27;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bf * 651738037) {
                    if (i > this.bf * 651738037) {
                        i = this.bf * 651738037;
                    }
                    i20 = i2 > this.bf * 651738037 ? 651738037 * this.bf : i2;
                    i39 = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i20) {
                        i22 = i6 << 14;
                        if (i3 < 0) {
                            i39 -= i3 * i30;
                            i21 = i22 - (i28 * i3);
                            i45 = i22 - (i27 * i3);
                            i3 = 0;
                        } else {
                            i21 = i22;
                            i45 = i22;
                        }
                        al = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = al - (i * i26);
                        } else {
                            i41 = al;
                        }
                        al = i3 - (this.bo * -1165057787);
                        i42 = i25 + (i32 * al);
                        i33 += i35 * al;
                        i36 += al * i38;
                        if (i27 < i28) {
                            i43 = i20 - i;
                            al = i - i3;
                            i23 = this.bg[i3];
                            while (true) {
                                i44 = i21;
                                i40 = al - 1;
                                if (i40 < 0) {
                                    break;
                                }
                                af(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -96);
                                i45 += i27;
                                i21 = i44 + i28;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i40;
                            }
                            al = i43;
                            i40 = i41;
                            while (true) {
                                i41 = al - 1;
                                if (i41 >= 0) {
                                    af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -10);
                                    i39 += i30;
                                    i23 += this.ah * 1956907281;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    al = i41;
                                    i45 += i27;
                                    i40 += i26;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i20 - i;
                        al = i - i3;
                        i23 = this.bg[i3];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -103);
                            i45 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i28;
                        }
                        al = i43;
                        i40 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -9);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i27;
                                i40 += i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i21 = i6 << 14;
                    if (i3 < 0) {
                        i39 -= i3 * i30;
                        i40 = i21 - (i3 * i28);
                        i22 = i21 - (i27 * i3);
                        i3 = 0;
                    } else {
                        i22 = i21;
                        i40 = i21;
                    }
                    i21 = i5 << 14;
                    if (i20 < 0) {
                        al = 0;
                        i41 = i21 - (i20 * i26);
                    } else {
                        al = i20;
                        i41 = i21;
                    }
                    i20 = i3 - (this.bo * -1165057787);
                    i42 = i25 + (i20 * i32);
                    i33 += i35 * i20;
                    i36 += i20 * i38;
                    if (i27 < i28) {
                        i20 = al - i3;
                        i43 = i - al;
                        i23 = this.bg[i3];
                        al = i20;
                        while (true) {
                            i44 = i22;
                            i45 = al - 1;
                            if (i45 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -2);
                            i22 = i44 + i27;
                            i40 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i45;
                        }
                        al = i43;
                        i45 = i41;
                        while (true) {
                            i41 = al - 1;
                            if (i41 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -51);
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                al = i41;
                                i45 += i26;
                                i40 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i20 = al - i3;
                    i43 = i - al;
                    i23 = this.bg[i3];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i45 = al - 1;
                        if (i45 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i40 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -80);
                        i40 += i28;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i45;
                        i44 += i27;
                    }
                    al = i43;
                    i45 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -48);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i28;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bf * 651738037) {
                if (i2 > this.bf * 651738037) {
                    i2 = this.bf * 651738037;
                }
                i20 = i3 > this.bf * 651738037 ? 651738037 * this.bf : i3;
                i39 = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i20) {
                    al = i4 << 14;
                    if (i < 0) {
                        i43 = al - (i * i28);
                        i21 = al - (i * i26);
                        i39 -= i * i30;
                        i = 0;
                    } else {
                        i43 = al;
                        i21 = al;
                    }
                    al = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = al - (i2 * i27);
                    } else {
                        i41 = al;
                    }
                    al = i - (this.bo * -1165057787);
                    i42 = i25 + (i32 * al);
                    i33 += i35 * al;
                    i36 += al * i38;
                    if ((i2 == i || i28 >= i26) && (i != i2 || i28 <= i27)) {
                        i45 = i20 - i2;
                        al = i2 - i;
                        i23 = this.bg[i];
                        i44 = i21;
                        while (true) {
                            i40 = al - 1;
                            if (i40 < 0) {
                                break;
                            }
                            af(this.ad, ar, 0, 0, i23, i44 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -46);
                            i43 += i28;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i40;
                            i44 += i26;
                        }
                        while (true) {
                            i45--;
                            if (i45 >= 0) {
                                af(this.ad, ar, 0, 0, i23, i41 >> 14, i43 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -84);
                                i41 += i27;
                                i39 += i30;
                                i23 += this.ah * 1956907281;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i28;
                            } else {
                                return;
                            }
                        }
                    }
                    i45 = i20 - i2;
                    al = i2 - i;
                    i23 = this.bg[i];
                    while (true) {
                        i44 = i21;
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i43 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -23);
                        i43 += i28;
                        i21 = i44 + i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                    }
                    while (true) {
                        i45--;
                        if (i45 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i43 >> 14, i41 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -124);
                            i41 += i27;
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i28;
                        } else {
                            return;
                        }
                    }
                }
                al = i4 << 14;
                if (i < 0) {
                    i45 = al - (i26 * i);
                    i39 -= i * i30;
                    i22 = al - (i * i28);
                    i = 0;
                } else {
                    i45 = al;
                    i22 = al;
                }
                i21 = i6 << 14;
                if (i20 < 0) {
                    al = 0;
                    i41 = i21 - (i20 * i27);
                } else {
                    al = i20;
                    i41 = i21;
                }
                i20 = i - (this.bo * -1165057787);
                i42 = i25 + (i32 * i20);
                i33 += i35 * i20;
                i36 += i20 * i38;
                if ((al == i || i28 >= i26) && (i != al || i27 <= i26)) {
                    i20 = al - i;
                    i43 = i2 - al;
                    i23 = this.bg[i];
                    al = i20;
                    i44 = i22;
                    while (true) {
                        i40 = al - 1;
                        if (i40 < 0) {
                            break;
                        }
                        af(this.ad, ar, 0, 0, i23, i45 >> 14, i44 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -87);
                        i45 += i26;
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i40;
                        i44 += i28;
                    }
                    al = i43;
                    i40 = i41;
                    while (true) {
                        i41 = al - 1;
                        if (i41 >= 0) {
                            af(this.ad, ar, 0, 0, i23, i45 >> 14, i40 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -25);
                            i39 += i30;
                            i23 += this.ah * 1956907281;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            al = i41;
                            i45 += i26;
                            i40 += i27;
                        } else {
                            return;
                        }
                    }
                }
                i20 = al - i;
                i43 = i2 - al;
                i23 = this.bg[i];
                al = i20;
                while (true) {
                    i44 = i22;
                    i40 = al - 1;
                    if (i40 < 0) {
                        break;
                    }
                    af(this.ad, ar, 0, 0, i23, i44 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -87);
                    i22 = i44 + i28;
                    i45 += i26;
                    i39 += i30;
                    i23 += this.ah * 1956907281;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    al = i40;
                }
                al = i43;
                i40 = i41;
                while (true) {
                    i41 = al - 1;
                    if (i41 >= 0) {
                        af(this.ad, ar, 0, 0, i23, i40 >> 14, i45 >> 14, i39, i29, i42, i33, i36, i31, i34, i37, (byte) -120);
                        i39 += i30;
                        i23 += this.ah * 1956907281;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        al = i41;
                        i45 += i26;
                        i40 += i27;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0206 A:{LOOP_END, LOOP:0: B:25:0x008d->B:50:0x0206} */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x01b7 A:{SYNTHETIC, EDGE_INSN: B:192:0x01b7->B:32:0x01b7 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0388 A:{LOOP_END, LOOP:2: B:54:0x0215->B:97:0x0388} */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x034f A:{SYNTHETIC, EDGE_INSN: B:194:0x034f->B:85:0x034f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x055c A:{LOOP_END, LOOP:4: B:112:0x03e4->B:137:0x055c} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x050e A:{SYNTHETIC, EDGE_INSN: B:196:0x050e->B:119:0x050e ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dy(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.at) {
            if (i5 > this.bl * 1505645037) {
                i5 = this.bl * 1505645037;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i4 * i7);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            if (this.ba) {
                i17 = i4 - (this.bd * -1240378447);
                i18 = i8 + ((i11 >> 3) * i17);
                i19 = i9 + ((i12 >> 3) * i17);
                i20 = i10 + (i17 * (i13 >> 3));
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                    if (i21 >= 0) {
                        if (i21 > 4032) {
                            i22 = i17;
                            i23 = 4032;
                        } else {
                            i22 = i17;
                            i23 = i21;
                        }
                        i24 = i18 + i11;
                        i18 = i19 + i12;
                        i25 = i20 + i13;
                        i17 = i25 >> 12;
                        if (i17 == 0) {
                            i21 = i24 / i17;
                            i17 = i18 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 4032) {
                                i21 = 4032;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i26 = ((i17 - i22) >> 3) + (((i21 - i23) >> 3) << 20);
                        i20 = i16 >> 3;
                        i27 = i7 << 3;
                        i19 = i15 >> 8;
                        i28 = (i23 << 20) + i22;
                        if (this.bk) {
                            if (i20 > 0) {
                                i22 = i17;
                                i23 = i15;
                                while (true) {
                                    i17 = iArr2[(i28 & 4032) + (i28 >>> 26)];
                                    if (i17 != 0) {
                                        iArr[i14] = ((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i17) * i19) & -16711936)) >> 8;
                                    }
                                    i17 = i14 + 1;
                                    i14 = i28 + i26;
                                    i15 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i15) * i19) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i26;
                                    i15 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i15) * i19) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i26;
                                    i15 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i15) * i19) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i26;
                                    i15 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & 16711935) * i19) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i19) & 16711680)) >> 8;
                                    }
                                    i17++;
                                    i14 += i26;
                                    i15 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & 16711935) * i19) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i19) & 16711680)) >> 8;
                                    }
                                    i17++;
                                    i14 += i26;
                                    i15 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i15) * i19) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i26;
                                    i14 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                                    if (i14 != 0) {
                                        iArr[i17] = ((((i14 & 16711935) * i19) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i19) & 16711680)) >> 8;
                                    }
                                    i14 = i17 + 1;
                                    i24 += i11;
                                    i18 += i12;
                                    i25 += i13;
                                    i19 = i25 >> 12;
                                    if (i19 != 0) {
                                        i17 = i24 / i19;
                                        i19 = i18 / i19;
                                        if (i17 >= 0) {
                                            if (i17 > 4032) {
                                                i17 = 4032;
                                                i15 = i19;
                                            } else {
                                                i15 = i19;
                                            }
                                            i28 = (i21 << 20) + i22;
                                            i26 = (((i17 - i21) >> 3) << 20) + ((i15 - i22) >> 3);
                                            i23 += i27;
                                            i19 = i23 >> 8;
                                            i20--;
                                            if (i20 > 0) {
                                                break;
                                            }
                                            i21 = i17;
                                            i22 = i15;
                                        }
                                    } else {
                                        i19 = 0;
                                    }
                                    i17 = 0;
                                    i15 = i19;
                                    i28 = (i21 << 20) + i22;
                                    i26 = (((i17 - i21) >> 3) << 20) + ((i15 - i22) >> 3);
                                    i23 += i27;
                                    i19 = i23 >> 8;
                                    i20--;
                                    if (i20 > 0) {
                                    }
                                }
                                i21 = i28;
                                i17 = i14;
                            } else {
                                i21 = i28;
                                i17 = i14;
                            }
                            i14 = i16 & 7;
                            if (i14 > 0) {
                                do {
                                    i18 = iArr2[(i21 & 4032) + (i21 >>> 26)];
                                    if (i18 != 0) {
                                        iArr[i17] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i18) * i19) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i21 += i26;
                                    i14--;
                                } while (i14 > 0);
                                return;
                            }
                            return;
                        }
                        if (i20 > 0) {
                            i22 = i21;
                            i23 = i17;
                            i29 = i15;
                            i30 = i20;
                            while (true) {
                                i17 = iArr2[(i28 & 4032) + (i28 >>> 26)];
                                i21 = i14 + 1;
                                iArr[i14] = ((((i17 & 16711935) * i19) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i17) * i19) & 16711680)) >> 8;
                                i17 = i28 + i26;
                                i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                                i15 = i21 + 1;
                                iArr[i21] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i14) * i19) & -16711936)) >> 8;
                                i17 += i26;
                                i21 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                                i14 = i15 + 1;
                                iArr[i15] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i21) * i19) & -16711936)) >> 8;
                                i17 += i26;
                                i21 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                                i15 = i14 + 1;
                                iArr[i14] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i21) * i19) & -16711936)) >> 8;
                                i17 += i26;
                                i21 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                                i14 = i15 + 1;
                                iArr[i15] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i21) * i19) & -16711936)) >> 8;
                                i17 += i26;
                                i21 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                                i15 = i14 + 1;
                                iArr[i14] = ((((i21 & 16711935) * i19) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i21) * i19) & 16711680)) >> 8;
                                i17 += i26;
                                i21 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                                i14 = i15 + 1;
                                iArr[i15] = ((((i21 & 16711935) * i19) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i21) * i19) & 16711680)) >> 8;
                                i17 += i26;
                                i21 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                                i17 = i14 + 1;
                                iArr[i14] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) & 16711680) + (((16711935 & i21) * i19) & -16711936)) >> 8;
                                i24 += i11;
                                i21 = i18 + i12;
                                i25 += i13;
                                i14 = i25 >> 12;
                                if (i14 != 0) {
                                    i15 = i24 / i14;
                                    i14 = i21 / i14;
                                    if (i15 >= 0) {
                                        if (i15 > 4032) {
                                            i15 = 4032;
                                            i20 = i14;
                                        } else {
                                            i20 = i14;
                                        }
                                        i28 = (i22 << 20) + i23;
                                        i26 = (((i15 - i22) >> 3) << 20) + ((i20 - i23) >> 3);
                                        i29 += i27;
                                        i19 = i29 >> 8;
                                        i30--;
                                        if (i30 > 0) {
                                            break;
                                        }
                                        i14 = i17;
                                        i18 = i21;
                                        i22 = i15;
                                        i23 = i20;
                                    }
                                } else {
                                    i14 = 0;
                                }
                                i15 = 0;
                                i20 = i14;
                                i28 = (i22 << 20) + i23;
                                i26 = (((i15 - i22) >> 3) << 20) + ((i20 - i23) >> 3);
                                i29 += i27;
                                i19 = i29 >> 8;
                                i30--;
                                if (i30 > 0) {
                                }
                            }
                            i18 = i16;
                            i21 = i28;
                        } else {
                            i17 = i14;
                            i18 = i16;
                            i21 = i28;
                        }
                        i14 = i18 & 7;
                        if (i14 > 0) {
                            while (true) {
                                i18 = iArr2[(i21 >>> 26) + (i21 & 4032)];
                                iArr[i17] = ((((i18 & 16711935) * i19) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i19) & 16711680)) >> 8;
                                i21 += i26;
                                i14--;
                                if (i14 > 0) {
                                    i17++;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                i17 = 0;
                i22 = i17;
                i23 = 0;
                i24 = i18 + i11;
                i18 = i19 + i12;
                i25 = i20 + i13;
                i17 = i25 >> 12;
                if (i17 == 0) {
                }
                i26 = ((i17 - i22) >> 3) + (((i21 - i23) >> 3) << 20);
                i20 = i16 >> 3;
                i27 = i7 << 3;
                i19 = i15 >> 8;
                i28 = (i23 << 20) + i22;
                if (this.bk) {
                }
            } else {
                i17 = i4 - (this.bd * -1240378447);
                i18 = i8 + ((i11 >> 3) * i17);
                i23 = i9 + ((i12 >> 3) * i17);
                i20 = i10 + (i17 * (i13 >> 3));
                i17 = i20 >> 14;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i23 / i17;
                    if (i21 >= 0) {
                        if (i21 > 16256) {
                            i24 = i17;
                            i22 = 16256;
                        } else {
                            i24 = i17;
                            i22 = i21;
                        }
                        i19 = i18 + i11;
                        i18 = i23 + i12;
                        i25 = i20 + i13;
                        i17 = i25 >> 14;
                        if (i17 == 0) {
                            i21 = i19 / i17;
                            i17 = i18 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 16256) {
                                i21 = 16256;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i28 = (i22 << 18) + i24;
                        i24 = ((i17 - i24) >> 3) + (((i21 - i22) >> 3) << 18);
                        i29 = i16 >> 3;
                        i27 = i7 << 3;
                        i22 = i15 >> 8;
                        if (this.bk) {
                            if (i29 > 0) {
                                i23 = i17;
                                i20 = i15;
                                while (true) {
                                    i17 = iArr2[(i28 >>> 25) + (i28 & 16256)];
                                    if (i17 != 0) {
                                        iArr[i14] = ((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i17) * i22) & -16711936)) >> 8;
                                    }
                                    i17 = i14 + 1;
                                    i14 = i28 + i24;
                                    i15 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i15) * i22) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i24;
                                    i15 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i15) * i22) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i24;
                                    i15 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i15) * i22) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i24;
                                    i15 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i22) & 16711680)) >> 8;
                                    }
                                    i17++;
                                    i14 += i24;
                                    i15 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i22) & 16711680)) >> 8;
                                    }
                                    i17++;
                                    i14 += i24;
                                    i15 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                                    if (i15 != 0) {
                                        iArr[i17] = ((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i15) * i22) & -16711936)) >> 8;
                                    }
                                    i17++;
                                    i14 += i24;
                                    i14 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                                    if (i14 != 0) {
                                        iArr[i17] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i14) * i22) & -16711936)) >> 8;
                                    }
                                    i14 = i17 + 1;
                                    i19 += i11;
                                    i18 += i12;
                                    i25 += i13;
                                    i24 = i25 >> 14;
                                    if (i24 != 0) {
                                        i17 = i19 / i24;
                                        i15 = i18 / i24;
                                        if (i17 < 0) {
                                            i17 = 0;
                                        } else if (i17 > 16256) {
                                            i17 = 16256;
                                        }
                                    } else {
                                        i15 = 0;
                                        i17 = 0;
                                    }
                                    i28 = (i21 << 18) + i23;
                                    i24 = ((i15 - i23) >> 3) + (((i17 - i21) >> 3) << 18);
                                    i20 += i27;
                                    i22 = i20 >> 8;
                                    i29--;
                                    if (i29 <= 0) {
                                        break;
                                    }
                                    i21 = i17;
                                    i23 = i15;
                                }
                                i17 = i14;
                                i21 = i28;
                            } else {
                                i17 = i14;
                                i21 = i28;
                            }
                            i14 = i16 & 7;
                            if (i14 > 0) {
                                do {
                                    i18 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                                    if (i18 != 0) {
                                        iArr[i17] = ((((i18 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i22) & 16711680)) >> 8;
                                    }
                                    i17++;
                                    i21 += i24;
                                    i14--;
                                } while (i14 > 0);
                                return;
                            }
                            return;
                        }
                        if (i29 > 0) {
                            i23 = i21;
                            i20 = i17;
                            i30 = i29;
                            i26 = i15;
                            while (true) {
                                i17 = iArr2[(i28 & 16256) + (i28 >>> 25)];
                                i21 = i14 + 1;
                                iArr[i14] = ((((i17 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i17) * i22) & 16711680)) >> 8;
                                i17 = i28 + i24;
                                i14 = iArr2[(i17 >>> 25) + (i17 & 16256)];
                                i15 = i21 + 1;
                                iArr[i21] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i14) * i22) & -16711936)) >> 8;
                                i17 += i24;
                                i21 = iArr2[(i17 & 16256) + (i17 >>> 25)];
                                i14 = i15 + 1;
                                iArr[i15] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i17 += i24;
                                i21 = iArr2[(i17 & 16256) + (i17 >>> 25)];
                                i15 = i14 + 1;
                                iArr[i14] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i17 += i24;
                                i21 = iArr2[(i17 >>> 25) + (i17 & 16256)];
                                i14 = i15 + 1;
                                iArr[i15] = ((((i21 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i21) * i22) & 16711680)) >> 8;
                                i17 += i24;
                                i21 = iArr2[(i17 >>> 25) + (i17 & 16256)];
                                i15 = i14 + 1;
                                iArr[i14] = ((((i21 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i21) * i22) & 16711680)) >> 8;
                                i17 += i24;
                                i21 = iArr2[(i17 & 16256) + (i17 >>> 25)];
                                i29 = i15 + 1;
                                iArr[i15] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i21) * i22) & -16711936)) >> 8;
                                i17 += i24;
                                i17 = iArr2[(i17 >>> 25) + (i17 & 16256)];
                                i14 = i29 + 1;
                                iArr[i29] = ((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i22) & 16711680) + (((16711935 & i17) * i22) & -16711936)) >> 8;
                                i21 = i19 + i11;
                                i17 = i18 + i12;
                                i25 += i13;
                                i18 = i25 >> 14;
                                if (i18 != 0) {
                                    i15 = i21 / i18;
                                    i18 = i17 / i18;
                                    if (i15 >= 0) {
                                        if (i15 > 16256) {
                                            i15 = 16256;
                                            i29 = i18;
                                        } else {
                                            i29 = i18;
                                        }
                                        i28 = (i23 << 18) + i20;
                                        i24 = ((i29 - i20) >> 3) + (((i15 - i23) >> 3) << 18);
                                        i26 += i27;
                                        i22 = i26 >> 8;
                                        i30--;
                                        if (i30 > 0) {
                                            break;
                                        }
                                        i18 = i17;
                                        i19 = i21;
                                        i23 = i15;
                                        i20 = i29;
                                    }
                                } else {
                                    i18 = 0;
                                }
                                i15 = 0;
                                i29 = i18;
                                i28 = (i23 << 18) + i20;
                                i24 = ((i29 - i20) >> 3) + (((i15 - i23) >> 3) << 18);
                                i26 += i27;
                                i22 = i26 >> 8;
                                i30--;
                                if (i30 > 0) {
                                }
                            }
                            i21 = i14;
                            i17 = i28;
                        } else {
                            i21 = i14;
                            i17 = i28;
                        }
                        i14 = i16 & 7;
                        if (i14 > 0) {
                            while (true) {
                                i18 = iArr2[(i17 >>> 25) + (i17 & 16256)];
                                iArr[i21] = ((((i18 & 16711935) * i22) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i22) & 16711680)) >> 8;
                                i17 += i24;
                                i14--;
                                if (i14 > 0) {
                                    i21++;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                i17 = 0;
                i24 = i17;
                i22 = 0;
                i19 = i18 + i11;
                i18 = i23 + i12;
                i25 = i20 + i13;
                i17 = i25 >> 14;
                if (i17 == 0) {
                }
                i28 = (i22 << 18) + i24;
                i24 = ((i17 - i24) >> 3) + (((i21 - i22) >> 3) << 18);
                i29 = i16 >> 3;
                i27 = i7 << 3;
                i22 = i15 >> 8;
                if (this.bk) {
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dz(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.at) {
            if (i5 > this.bl * -1427371952) {
                i5 = this.bl * 1505645037;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i4 * i7);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            if (this.ba) {
                i17 = i4 - (this.bd * 2021815747);
                i18 = i8 + (i17 * i11);
                i19 = i9 + (i17 * i12);
                i20 = i10 + (i17 * i13);
                i21 = i20 >> 12;
                if (i21 != 0) {
                    i22 = i18 / i21;
                    i23 = i19 / i21;
                } else {
                    i22 = 0;
                    i23 = 0;
                }
                i17 = ((i13 * i16) + i20) >> 12;
                if (i17 != 0) {
                    i21 = ((i11 * i16) + i18) / i17;
                    i17 = ((i12 * i16) + i19) / i17;
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i18 = (i22 << 20) + i23;
                i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 20);
                i22 = i16 >> 3;
                i19 = i7 << 3;
                i21 = i15 >> 8;
                if (this.bk) {
                    if (i22 > 0) {
                        i17 = i14;
                        while (true) {
                            i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i20 = i17 + 1;
                            iArr[i17] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & -1998502947) + (((16711935 & i14) * i21) & 759970111)) >> 8;
                            i17 = i18 + i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & 1730500630) * i21) & 16711680) + (((16711935 & i14) * i21) & 1883225677)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 1931280135) * i21) & -984168430) + (((203645711 & i14) * i21) & 563937153)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & 1690237812) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i21) & -390416693)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 1168568786) * i21) & -16711936) + (((547760729 & i14) * i21) & 1063319348)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (2010879077 & i17)];
                            i18 = i20 + 1;
                            iArr[i20] = ((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i17 += i23;
                            i14 = iArr2[(i17 >>> 26) + (i17 & 4032)];
                            i20 = i18 + 1;
                            iArr[i18] = ((((i14 & 1260695895) * i21) & -1918690465) + (((-807969383 & i14) * i21) & -871830083)) >> 8;
                            i14 = i17 + i23;
                            i18 = iArr2[(1098463141 & i14) + (i14 >>> 26)];
                            i17 = i20 + 1;
                            iArr[i20] = (((i21 * (i18 & 858285431)) & 902884859) + (((1023491759 & i18) * i21) & 446534489)) >> 8;
                            i14 += i23;
                            i15 += i19;
                            i21 = i15 >> 8;
                            i22--;
                            if (i22 <= 0) {
                                break;
                            }
                            i18 = i14;
                        }
                        i22 = i21;
                        i18 = i14;
                        i15 = i17;
                    } else {
                        i22 = i21;
                        i15 = i14;
                    }
                    i14 = i16 & 7;
                    if (i14 > 0) {
                        i17 = i18;
                        i21 = i15;
                        while (true) {
                            i18 = iArr2[(-1660053303 & i17) + (i17 >>> 26)];
                            iArr[i21] = ((((i18 & 16711935) * i22) & -441635294) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i22) & -284145620)) >> 8;
                            i17 += i23;
                            i14--;
                            if (i14 > 0) {
                                i21++;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i22 > 0) {
                    do {
                        i17 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                        if (i17 != 0) {
                            iArr[i14] = ((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & 16711680) + (((16711935 & i17) * i21) & -1609398068)) >> 8;
                        }
                        i17 = i14 + 1;
                        i14 = i18 + i23;
                        i18 = iArr2[(-1324154949 & i14) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 4807086) * i21) & -16711936) + (((-513306639 & i18) * i21) & -1907146515)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 >>> 26) + (-869819752 & i14)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 798730412) * i21) & -16711936) + (((796206885 & i18) * i21) & 16711680)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(51490344 & i14) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 766324838) * i21) & 5038135) + (((-1749892025 & i18) * i21) & 1448324605)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & 1403167357) * i21) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i21) & 16711680)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(194894480 & i14) + (i14 >>> 26)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & -437685548) + (((16711935 & i18) * i21) & -16711936)) >> 8;
                        }
                        i17++;
                        i14 += i23;
                        i18 = iArr2[(i14 >>> 26) + (-434776919 & i14)];
                        if (i18 != 0) {
                            iArr[i17] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i21) & -266928909) + (((1438055005 & i18) * i21) & -670192747)) >> 8;
                        }
                        i17++;
                        i18 = i14 + i23;
                        i14 = iArr2[(-1525444073 & i18) + (i18 >>> 26)];
                        if (i14 != 0) {
                            iArr[i17] = (((i21 * (i14 & 2131283373)) & 260101878) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                        }
                        i14 = i17 + 1;
                        i18 += i23;
                        i15 += i19;
                        i21 = i15 >> 8;
                        i22--;
                    } while (i22 > 0);
                    i15 = i21;
                    i17 = i18;
                } else {
                    i15 = i21;
                    i17 = i18;
                }
                i18 = i16 & 7;
                if (i18 > 0) {
                    i21 = i14;
                    while (true) {
                        i14 = iArr2[(i17 & 4032) + (i17 >>> 26)];
                        if (i14 != 0) {
                            iArr[i21] = ((((i14 & 16711935) * i15) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i15) & 16711680)) >> 8;
                        }
                        i21++;
                        i17 += i23;
                        i14 = i18 - 1;
                        if (i14 > 0) {
                            i18 = i14;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i17 = i4 - (this.bd * -267584827);
            i18 = i8 + (i11 * i17);
            i19 = i9 + (i12 * i17);
            i20 = i10 + (i17 * i13);
            i21 = i20 >> 14;
            if (i21 != 0) {
                i22 = i18 / i21;
                i23 = i19 / i21;
            } else {
                i22 = 0;
                i23 = 0;
            }
            i17 = ((i16 * i13) + i20) >> 14;
            if (i17 != 0) {
                i21 = ((i11 * i16) + i18) / i17;
                i17 = ((i12 * i16) + i19) / i17;
            } else {
                i21 = 0;
                i17 = 0;
            }
            i18 = (i22 << 18) + i23;
            i23 = ((i17 - i23) / i16) + (((i21 - i22) / i16) << 18);
            i22 = i16 >> 3;
            i19 = i7 << 3;
            i17 = i15 >> 8;
            if (this.bk) {
                if (i22 > 0) {
                    i21 = i18;
                    while (true) {
                        i18 = iArr2[(-185262382 & i21) + (i21 >>> 25)];
                        i20 = i14 + 1;
                        iArr[i14] = ((((i18 & 16711935) * i17) & -49552587) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & -1988102680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & -1199241072) * i17) & 1751731749) + (((-1135977673 & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(-400886889 & i21) + (i21 >>> 25)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 1859435851) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & -847200386) * i17) & -1464407032) + (((-362960790 & i14) * i17) & 16711680)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (1180857495 & i21)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 1527652720) * i17) & -16711936) + (((-1576949277 & i14) * i17) & -614341345)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (-2094969938 & i21)];
                        i18 = i20 + 1;
                        iArr[i20] = ((((i14 & 16711935) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17) & 1556377290)) >> 8;
                        i21 += i23;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i20 = i18 + 1;
                        iArr[i18] = ((((i14 & 16711935) * i17) & -245739182) + (((1376014340 & i14) * i17) & 2146540979)) >> 8;
                        i21 += i23;
                        i18 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i14 = i20 + 1;
                        iArr[i20] = (((i17 * (i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) & 16711680) + (((-515411780 & i18) * i17) & -16711936)) >> 8;
                        i21 += i23;
                        i15 += i19;
                        i17 = i15 >> 8;
                        i18 = i22 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i22 = i18;
                    }
                    i15 = i17;
                } else {
                    i15 = i17;
                    i21 = i18;
                }
                i18 = i16 & 7;
                if (i18 > 0) {
                    i17 = i21;
                    while (true) {
                        i21 = iArr2[(i17 >>> 25) + (1634152659 & i17)];
                        iArr[i14] = ((((i21 & 16711935) * i15) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i21) * i15) & -1441600937)) >> 8;
                        i17 += i23;
                        i18--;
                        if (i18 > 0) {
                            i14++;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i22 > 0) {
                do {
                    i21 = iArr2[(1612970932 & i18) + (i18 >>> 25)];
                    if (i21 != 0) {
                        iArr[i14] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 1855137524) + (((563281513 & i21) * i17) & 1197517298)) >> 8;
                    }
                    i21 = i14 + 1;
                    i14 = i18 + i23;
                    i18 = iArr2[(824155924 & i14) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 1065603538) * i17) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) & 16672339)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & -1848479052) * i17) & -16711936) + (((-1069418275 & i18) * i17) & 16711680)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(-300671397 & i14) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 1990308678) * i17) & -572511867) + (((16711935 & i18) * i17) & 1385698521)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & 16711935) * i17) & -238859189) + (((-529353808 & i18) * i17) & -282172236)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & 1776677240) + (((16711935 & i18) * i17) & -1149708881)) >> 8;
                    }
                    i21++;
                    i14 += i23;
                    i18 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i18 != 0) {
                        iArr[i21] = ((((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i17) & -1934708392) + (((16711935 & i18) * i17) & 2106691160)) >> 8;
                    }
                    i21++;
                    i18 = i14 + i23;
                    i14 = iArr2[(i18 >>> 25) + (1427754222 & i18)];
                    if (i14 != 0) {
                        iArr[i21] = (((i17 * (i14 & 1473666556)) & -2001219629) + (((16711935 & i14) * i17) & -436561299)) >> 8;
                    }
                    i14 = i21 + 1;
                    i18 += i23;
                    i15 += i19;
                    i17 = i15 >> 8;
                    i22--;
                } while (i22 > 0);
                i15 = i17;
                i21 = i18;
            } else {
                i15 = i17;
                i21 = i18;
            }
            i18 = i16 & 7;
            if (i18 > 0) {
                i17 = i21;
                while (true) {
                    i21 = iArr2[(i17 & 16256) + (i17 >>> 25)];
                    if (i21 != 0) {
                        iArr[i14] = ((((i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i15) & 16711680) + (((16711935 & i21) * i15) & -16711936)) >> 8;
                    }
                    i21 = i14 + 1;
                    i17 += i23;
                    i18--;
                    if (i18 > 0) {
                        i14 = i21;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
