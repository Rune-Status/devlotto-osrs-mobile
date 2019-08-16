package defpackage;

import android.support.v4.view.MotionEventCompat;

/* renamed from: es */
public abstract class es {
    static final int am = 4;
    static final int as = 8;
    public static final int bh = 48;
    public int[] ad;
    public int ae;
    public int ai;
    public int aj;
    public int al;
    public int aq;
    public int ar;

    es(int i, int i2) {
        try {
            this(new int[(i * i2)], i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    es(int[] iArr, int i, int i2) {
        try {
            this.al = 0;
            this.aj = 0;
            this.ai = 0;
            this.ae = 0;
            er(iArr, i, i2, -2121448369);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static ip aj(int i, int i2) {
        try {
            return (ip) it.aq.ad((long) i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void al(int i, boolean z, int i2, boolean z2, int i3) {
        try {
            if (ii.aj != null) {
                ib.aj(0, ii.aj.length - 1, i, z, i2, z2, 2147036350);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void aa(ef efVar, int i, int i2, byte b);

    public abstract void ab(ee eeVar, int i, int i2, int i3, short s);

    public abstract void ad(int i);

    public abstract void ae(int i, int i2, int i3, int i4, int i5);

    public abstract void ag(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void ah(ee eeVar, int i, int i2, int i3, int i4, int i5);

    public abstract void ai(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z, int i8);

    public abstract void aj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b);

    public abstract void ak(int i, int i2, int i3, int i4, int i5);

    public abstract void al(int i, int i2, int i3, int i4, int i5, byte b);

    public abstract void am(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void ap(int i, int i2, int i3, int i4, int i5);

    public abstract void aq(int i);

    public abstract void ar(int i, int i2, int i3, int i4, int i5, int i6, byte b);

    public abstract void as(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void au(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void aw(ee eeVar, int i, int i2, int i3);

    public abstract void ay(ef efVar, int i, int i2, int i3, int i4, int i5);

    public abstract void az(ee eeVar, int i, int i2, int i3);

    public abstract void bb(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, byte b);

    public abstract void bc();

    public abstract void be(int i, int i2, int i3, int i4, int i5);

    public abstract void bf(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8);

    public abstract void bg();

    public abstract void bh(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void bi(ee eeVar, int i, int i2, int i3, int i4, byte b);

    public abstract void bj(int i, int i2, int i3, int i4, int i5);

    public abstract void bk(ee eeVar, int i, int i2, int i3, int i4, byte b);

    public abstract void bl(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, int i9);

    public abstract void bn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void bo(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, int i7);

    public abstract void bp(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z);

    public abstract void bq(ee eeVar, int i, int i2, int i3, int i4, int i5, byte b);

    public abstract void br(int i, int i2, int i3, int i4, int i5);

    public abstract void bs(ee eeVar, int i, int i2, int i3, byte b);

    public abstract void bt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void bu(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void bv();

    public abstract void bw(int i, int i2, int i3, int i4, int i5);

    public abstract void bx(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void by(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z);

    public abstract void bz(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void ca(int i, int i2, int i3, int i4, int i5);

    public abstract void cb(int i, int i2, int i3, int i4, int i5);

    public abstract void cc(int i, int i2, int i3, int i4, int i5);

    public abstract void ce(int i, int i2, int i3, int i4, int i5);

    public abstract void cg(ef efVar, int i, int i2);

    public abstract void ch(ef efVar, int i, int i2);

    public abstract void ci(int i, int i2, int i3, int i4, int i5);

    public abstract void cj(int i, int i2, int i3, int i4);

    public abstract void ck(ee eeVar, int i, int i2);

    public abstract void cl(ee eeVar, int i, int i2);

    public abstract void cm(int i, int i2, int i3, int i4, int i5);

    public abstract void cn(int i, int i2, int i3, int i4);

    public abstract void co(ee eeVar, int i, int i2);

    public abstract void cp(int i, int i2, int i3, int i4);

    public abstract void cq(int i, int i2, int i3, int i4, int i5);

    public abstract void cr(int i, int i2, int i3, int i4);

    public abstract void cs(int i, int i2, int i3, int i4, int i5);

    public abstract void ct(ee eeVar, int i, int i2);

    public abstract void cv(int i, int i2, int i3, int i4);

    public abstract void cw(int i, int i2, int i3, int i4);

    public abstract void cx(int i, int i2, int i3, int i4, int i5);

    public abstract void cy(int i, int i2, int i3, int i4, int i5);

    public abstract void cz(ee eeVar, int i, int i2);

    public abstract void da(ee eeVar, int i, int i2, int i3);

    public abstract void dh(ee eeVar, int i, int i2, int i3, int i4);

    public abstract void dm(ee eeVar, int i, int i2, int i3, int i4);

    public abstract void dn(ee eeVar, int i, int i2, int i3, int i4);

    /* renamed from: do */
    public abstract void m209do(ee eeVar, int i, int i2, int i3);

    public abstract void dq(ee eeVar, int i, int i2, int i3, int i4, int i5);

    public abstract void dr(ef efVar, int i, int i2, int i3, int i4);

    public abstract void dt(ee eeVar, int i, int i2, int i3, int i4);

    public abstract void dv(ee eeVar, int i, int i2, int i3, int i4);

    public abstract void dx(ee eeVar, int i, int i2, int i3, int i4, int i5);

    public abstract void ea(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7);

    public final void eb(int[] iArr, int i) {
        try {
            this.ai = iArr[0] * -925958701;
            this.al = iArr[1] * 1157699915;
            this.ae = iArr[2] * -19504919;
            this.aj = iArr[3] * 2107600209;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.eb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void ec(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7);

    public abstract void ed(ee eeVar, int i, int i2, int i3, int i4);

    public final void ee(int i, int i2, int i3, int i4, int i5) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            if (i3 > this.aq * 1462922907) {
                i3 = this.aq * 1462922907;
            }
            if (i4 > this.ar * -1622836677) {
                i4 = this.ar * -1622836677;
            }
            this.ai = -925958701 * i;
            this.al = 1157699915 * i2;
            this.ae = -19504919 * i3;
            this.aj = 2107600209 * i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.ee(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ef(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            am(i, i2, i3, i5, i6, -2055439724);
            am(i, (i2 + i4) - 1, i3, i5, i6, -949581128);
            if (i4 >= 3) {
                int i8 = i2 + 1;
                int i9 = i4 - 2;
                as(i, i8, i9, i5, i6, -1436865461);
                as((i + i3) - 1, i8, i9, i5, i6, -2089251440);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.ef(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void eg(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void eh(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2);

    public abstract void ei(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6);

    public void ej(ee eeVar, int i, int i2, int i3, int i4, short s) {
        try {
            bb(eeVar, eeVar.ai << 3, eeVar.ae << 3, i << 4, i2 << 4, i3, i4, (byte) -13);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.ej(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void ek(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7);

    public final void el(int[] iArr, int i) {
        try {
            iArr[0] = this.ai * 1947951707;
            iArr[1] = this.al * -709973917;
            iArr[2] = this.ae * 428635993;
            iArr[3] = this.aj * 157809585;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.el(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void em(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            ae(i, i2, i3, i5, 569718743);
            ae(i, (i2 + i4) - 1, i3, i5, 1537380447);
            ak(i, i2, i4, i5, -2060891821);
            ak((i3 + i) - 1, i2, i4, i5, -456126641);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.em(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void en(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void eo(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2);

    public void ep(int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        if (i3 > 0 && i4 > 0) {
            int i7 = 0;
            try {
                int i8 = 65536 / i4;
                if (i < this.ai * 1947951707) {
                    i3 -= (this.ai * 1947951707) - i;
                    i = this.ai * 1947951707;
                }
                if (i2 < this.al * -709973917) {
                    i7 = (((this.al * -709973917) - i2) * i8) + 0;
                    i4 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i + i3 > this.ae * 428635993) {
                    i3 = (this.ae * 428635993) - i;
                }
                if (i2 + i4 > this.aj * 157809585) {
                    i4 = (this.aj * 157809585) - i2;
                }
                int i9 = this.aq;
                int i10 = ((this.aq * 1462922907) * i2) + i;
                int i11 = i7;
                for (int i12 = -i4; i12 < 0; i12++) {
                    int i13 = (65536 - i11) >> 8;
                    int i14 = i11 >> 8;
                    i7 = -i3;
                    while (i7 < 0) {
                        this.ad[i10] = ((16711680 & (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i14) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i13))) + (-16711936 & (((16711935 & i5) * i13) + ((16711935 & i6) * i14)))) >>> 8;
                        i7++;
                        i10++;
                    }
                    i10 += (1462922907 * i9) - i3;
                    i11 += i8;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("es.ep(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public abstract void eq(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2);

    /* Access modifiers changed, original: 0000 */
    public void er(int[] iArr, int i, int i2, int i3) {
        try {
            this.ad = iArr;
            this.aq = 1194379155 * i;
            this.ar = 1971146483 * i2;
            eu(-1181446935);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.er(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void es(int[] iArr, int i, int i2) {
        this.ad = iArr;
        this.aq = 1194379155 * i;
        this.ar = -593304654 * i2;
        eu(-1181446935);
    }

    public abstract void et(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2);

    public final void eu(int i) {
        try {
            this.ai = 0;
            this.al = 0;
            this.ae = this.aq * -2047685869;
            this.aj = this.ar * -1280586837;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.eu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ev(int i, int i2, int i3, int i4) {
        try {
            if (i >= this.ai * 1947951707 && i2 >= this.al * -709973917 && i < this.ae * 428635993 && i2 < this.aj * 157809585) {
                this.ad[((this.aq * 1462922907) * i2) + i] = i3;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.ev(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ew(int i, int i2, int i3, int i4, int i5) {
        try {
            if (this.ai * 1947951707 < i) {
                this.ai = -925958701 * i;
            }
            if (this.al * -709973917 < i2) {
                this.al = 1157699915 * i2;
            }
            if (this.ae * 428635993 > i3) {
                this.ae = -19504919 * i3;
            }
            if (this.aj * 157809585 > i4) {
                this.aj = 2107600209 * i4;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.ew(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ex(int i, int i2, int i3, int[] iArr, int[] iArr2, byte b) {
        try {
            int i4 = ((this.aq * 1462922907) * i2) + i;
            int i5 = 0;
            while (true) {
                int i6 = i4;
                int i7 = i5;
                if (i7 < iArr.length) {
                    i5 = iArr[i7] + i6;
                    i4 = -iArr2[i7];
                    while (i4 < 0) {
                        this.ad[i5] = i3;
                        i4++;
                        i5++;
                    }
                    i4 = (this.aq * 1462922907) + i6;
                    i5 = i7 + 1;
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("es.ex(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void ey(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void ez(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2);

    public void fb(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            int i7 = 0;
            int i8 = 65536 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i7 = (((this.al * -709973917) - i2) * i8) + 0;
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i + i3 > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i9 = this.aq;
            int i10 = ((this.aq * 1462922907) * i2) + i;
            int i11 = i7;
            for (int i12 = -i4; i12 < 0; i12++) {
                int i13 = (65536 - i11) >> 8;
                int i14 = i11 >> 8;
                i7 = -i3;
                while (i7 < 0) {
                    this.ad[i10] = ((16711680 & (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i14) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i13))) + (-16711936 & (((16711935 & i5) * i13) + ((16711935 & i6) * i14)))) >>> 8;
                    i7++;
                    i10++;
                }
                i10 += (1462922907 * i9) - i3;
                i11 += i8;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fc(int i, int i2, int i3) {
        if (i >= this.ai * 1947951707 && i2 >= this.al * -709973917 && i < this.ae * 460045999 && i2 < this.aj * 617069793) {
            this.ad[((this.aq * 400417040) * i2) + i] = i3;
        }
    }

    public void fe(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            int i7 = 0;
            int i8 = -176665774 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * 706194480) {
                i7 = (((this.al * 1521909642) - i2) * i8) + 0;
                i4 -= (this.al * 1035025100) - i2;
                i2 = this.al * -709973917;
            }
            if (i + i3 > this.ae * -1135356035) {
                i3 = (this.ae * 497259213) - i;
            }
            if (i2 + i4 > this.aj * -1005791106) {
                i4 = (this.aj * -1394309936) - i2;
            }
            int i9 = this.aq;
            int i10 = ((this.aq * 1199988489) * i2) + i;
            int i11 = i7;
            for (int i12 = -i4; i12 < 0; i12++) {
                int i13 = (62256881 - i11) >> 8;
                int i14 = i11 >> 8;
                i7 = -i3;
                while (i7 < 0) {
                    this.ad[i10] = (((((-26629055 & i6) * i14) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i13)) & 16711680) + (-16711936 & (((1327803688 & i5) * i13) + ((16711935 & i6) * i14)))) >>> 8;
                    i7++;
                    i10++;
                }
                i10 += (-246429153 * i9) - i3;
                i11 += i8;
            }
        }
    }

    public final void fg(int[] iArr) {
        iArr[0] = this.ai * 1947951707;
        iArr[1] = this.al * -1227962630;
        iArr[2] = this.ae * 428635993;
        iArr[3] = this.aj * 93689773;
    }

    public final void fh(int i, int i2, int i3, int i4) {
        if (this.ai * 1842876855 < i) {
            this.ai = -288340326 * i;
        }
        if (this.al * -709973917 < i2) {
            this.al = 719721374 * i2;
        }
        if (this.ae * 428635993 > i3) {
            this.ae = -19504919 * i3;
        }
        if (this.aj * 157809585 > i4) {
            this.aj = -490269392 * i4;
        }
    }

    public final void fi(int[] iArr) {
        iArr[0] = this.ai * 1391977367;
        iArr[1] = this.al * -572883104;
        iArr[2] = this.ae * 1200224694;
        iArr[3] = this.aj * 1258083895;
    }

    public final void fj(int[] iArr) {
        iArr[0] = this.ai * 1947951707;
        iArr[1] = this.al * -709973917;
        iArr[2] = this.ae * 428635993;
        iArr[3] = this.aj * 157809585;
    }

    public final void fk(int i, int i2, int i3, int i4, int i5) {
        ae(i, i2, i3, i5, 697596359);
        ae(i, (i2 + i4) - 1, i3, i5, 1624431623);
        ak(i, i2, i4, i5, -623253127);
        ak((i3 + i) - 1, i2, i4, i5, 292373608);
    }

    public final void fl(int i, int i2, int i3, int i4, int i5) {
        ae(i, i2, i3, i5, 1679228026);
        ae(i, (i2 + i4) - 1, i3, i5, 430252926);
        ak(i, i2, i4, i5, -1306584138);
        ak((i3 + i) - 1, i2, i4, i5, -1125705659);
    }

    public final void fm(int i, int i2, int i3, int i4) {
        if (this.ai * 1947951707 < i) {
            this.ai = -925958701 * i;
        }
        if (this.al * -709973917 < i2) {
            this.al = 1157699915 * i2;
        }
        if (this.ae * 428635993 > i3) {
            this.ae = -19504919 * i3;
        }
        if (this.aj * 157809585 > i4) {
            this.aj = 2107600209 * i4;
        }
    }

    public final void fn(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.aq * -707796599) {
            i3 = this.aq * 1462922907;
        }
        if (i4 > this.ar * -1622836677) {
            i4 = 275141341 * this.ar;
        }
        this.ai = -925958701 * i;
        this.al = -1394146367 * i2;
        this.ae = -283424622 * i3;
        this.aj = 2107600209 * i4;
    }

    public void fo(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            int i7 = 0;
            int i8 = 65536 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i7 = (((this.al * -709973917) - i2) * i8) + 0;
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i + i3 > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i9 = this.aq;
            int i10 = ((this.aq * 1462922907) * i2) + i;
            int i11 = i7;
            for (int i12 = -i4; i12 < 0; i12++) {
                int i13 = (65536 - i11) >> 8;
                int i14 = i11 >> 8;
                i7 = -i3;
                while (i7 < 0) {
                    this.ad[i10] = ((16711680 & (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i14) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i13))) + (-16711936 & (((16711935 & i5) * i13) + ((16711935 & i6) * i14)))) >>> 8;
                    i7++;
                    i10++;
                }
                i10 += (1462922907 * i9) - i3;
                i11 += i8;
            }
        }
    }

    public void fp(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            int i7 = 0;
            int i8 = 65536 / i4;
            if (i < this.ai * 472994538) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i7 = (((this.al * -709973917) - i2) * i8) + 0;
                i4 -= (this.al * -1922522148) - i2;
                i2 = this.al * 1956379419;
            }
            if (i + i3 > this.ae * -130031633) {
                i3 = (this.ae * 1948089014) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i9 = this.aq;
            int i10 = ((this.aq * 1462922907) * i2) + i;
            int i11 = i7;
            for (int i12 = -i4; i12 < 0; i12++) {
                int i13 = (-1368345642 - i11) >> 8;
                int i14 = i11 >> 8;
                i7 = -i3;
                while (i7 < 0) {
                    this.ad[i10] = (((((395907143 & i6) * i14) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i13)) & 16711680) + (-16711936 & (((1382540952 & i5) * i13) + ((-1540263543 & i6) * i14)))) >>> 8;
                    i7++;
                    i10++;
                }
                i10 += (1587749536 * i9) - i3;
                i11 += i8;
            }
        }
    }

    public final void fq() {
        this.ai = 0;
        this.al = 0;
        this.ae = this.aq * -2047685869;
        this.aj = this.ar * -1280586837;
    }

    public final void fs(int i, int i2, int i3, int i4) {
        if (this.ai * 1947951707 < i) {
            this.ai = -925958701 * i;
        }
        if (this.al * -709973917 < i2) {
            this.al = 1157699915 * i2;
        }
        if (this.ae * 428635993 > i3) {
            this.ae = -19504919 * i3;
        }
        if (this.aj * 157809585 > i4) {
            this.aj = 2107600209 * i4;
        }
    }

    public final void ft(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.aq * -947530911) {
            i3 = this.aq * 1420934255;
        }
        if (i4 > this.ar * -1622836677) {
            i4 = -1091547250 * this.ar;
        }
        this.ai = 1908568586 * i;
        this.al = 329305911 * i2;
        this.ae = -19504919 * i3;
        this.aj = -137748519 * i4;
    }

    public final void fu(int[] iArr) {
        this.ai = iArr[0] * -925958701;
        this.al = iArr[1] * 1157699915;
        this.ae = iArr[2] * -19504919;
        this.aj = iArr[3] * 2107600209;
    }

    public final void fw(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.aq * 1462922907) {
            i3 = this.aq * 1462922907;
        }
        if (i4 > this.ar * -1622836677) {
            i4 = this.ar * -1622836677;
        }
        this.ai = -925958701 * i;
        this.al = 1157699915 * i2;
        this.ae = -19504919 * i3;
        this.aj = 2107600209 * i4;
    }

    public final void fx(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.aq * 1462922907) {
            i3 = this.aq * 1462922907;
        }
        if (i4 > this.ar * -1622836677) {
            i4 = this.ar * -1622836677;
        }
        this.ai = -925958701 * i;
        this.al = 1157699915 * i2;
        this.ae = -19504919 * i3;
        this.aj = 2107600209 * i4;
    }

    public final void gc(int i, int i2, int i3, int i4, int i5, int i6) {
        am(i, i2, i3, i5, i6, -1160094263);
        am(i, (i2 + i4) - 1, i3, i5, i6, -1909205995);
        if (i4 >= 3) {
            int i7 = i2 + 1;
            int i8 = i4 - 2;
            as(i, i7, i8, i5, i6, -862084075);
            as((i + i3) - 1, i7, i8, i5, i6, -140740135);
        }
    }

    public void gl(ee eeVar, int i, int i2, int i3, int i4) {
        bb(eeVar, eeVar.ai << 3, eeVar.ae << 3, i << 4, i2 << 4, i3, i4, (byte) -122);
    }

    public void go(ee eeVar, int i, int i2, int i3, int i4) {
        bb(eeVar, eeVar.ai << 3, eeVar.ae << 3, i << 4, i2 << 4, i3, i4, (byte) -127);
    }

    public void gp(ee eeVar, int i, int i2, int i3, int i4) {
        bb(eeVar, eeVar.ai << 3, eeVar.ae << 3, i << 4, i2 << 4, i3, i4, (byte) -98);
    }

    public final void gw(int i, int i2, int i3, int i4, int i5, int i6) {
        am(i, i2, i3, i5, i6, -1126927567);
        am(i, (i2 + i4) - 1, i3, i5, i6, -2019490454);
        if (i4 >= 3) {
            int i7 = i2 + 1;
            int i8 = i4 - 2;
            as(i, i7, i8, i5, i6, 1672941067);
            as((i + i3) - 1, i7, i8, i5, i6, 903414826);
        }
    }
}
