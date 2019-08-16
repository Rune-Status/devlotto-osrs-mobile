package defpackage;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;

/* renamed from: cx */
public class cx {
    public static final int bf = 36;
    static ee gn;
    String ad;
    ca al;
    int aq;
    int ar;

    cx(String str, int i, int i2, ca caVar) {
        try {
            this.ad = str;
            this.aq = 373450357 * i;
            this.ar = 988129277 * i2;
            this.al = caVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ai(ii iiVar, ii iiVar2, int i, boolean z, int i2, boolean z2, byte b) {
        try {
            int ae = jc.ae(iiVar, iiVar2, i, z, 1636841683);
            if (ae != 0) {
                return z ? -ae : ae;
            } else {
                if (i2 == -1) {
                    return 0;
                }
                ae = jc.ae(iiVar, iiVar2, i2, z2, 1636841683);
                return z2 ? -ae : ae;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ns ar(byte b) {
        try {
            ns ad = ci.ad(-1884205402);
            ad.ad = null;
            ad.aq = 0;
            ad.ar = new lv(5000);
            return ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ar(lv lvVar, int i) {
        int i2 = 0;
        try {
            int i3;
            int i4;
            byte[] bArr;
            lvVar.jt(1153685242);
            int i5 = 0;
            for (i3 = 0; i3 < hz.ai * -1076782851; i3++) {
                i4 = hz.ae[i3];
                if ((hz.ar[i4] & 1) == 0) {
                    if (i5 > 0) {
                        i5--;
                        bArr = hz.ar;
                        bArr[i4] = (byte) (bArr[i4] | 2);
                    } else if (lvVar.jm(1, -1870484368) == 0) {
                        i5 = ia.al(lvVar, -1411192024);
                        bArr = hz.ar;
                        bArr[i4] = (byte) (bArr[i4] | 2);
                    } else {
                        al.aj(lvVar, i4, -1140818974);
                    }
                }
            }
            lvVar.js(-586113240);
            if (i5 == 0) {
                lvVar.jt(1153685242);
                for (i3 = 0; i3 < hz.ai * -1076782851; i3++) {
                    i4 = hz.ae[i3];
                    if ((hz.ar[i4] & 1) != 0) {
                        if (i5 > 0) {
                            i5--;
                            bArr = hz.ar;
                            bArr[i4] = (byte) (bArr[i4] | 2);
                        } else if (lvVar.jm(1, 350522875) == 0) {
                            i5 = ia.al(lvVar, -1650182600);
                            bArr = hz.ar;
                            bArr[i4] = (byte) (bArr[i4] | 2);
                        } else {
                            al.aj(lvVar, i4, 326403877);
                        }
                    }
                }
                lvVar.js(1711555072);
                if (i5 == 0) {
                    lvVar.jt(1153685242);
                    for (i3 = 0; i3 < hz.am * 1674041529; i3++) {
                        i4 = hz.ak[i3];
                        if ((hz.ar[i4] & 1) != 0) {
                            if (i5 > 0) {
                                i5--;
                                bArr = hz.ar;
                                bArr[i4] = (byte) (bArr[i4] | 2);
                            } else if (lvVar.jm(1, -597105496) == 0) {
                                i5 = ia.al(lvVar, -1225380758);
                                bArr = hz.ar;
                                bArr[i4] = (byte) (bArr[i4] | 2);
                            } else if (ay.ai(lvVar, i4, (byte) -82)) {
                                bArr = hz.ar;
                                bArr[i4] = (byte) (bArr[i4] | 2);
                            }
                        }
                    }
                    lvVar.js(-132517171);
                    if (i5 == 0) {
                        lvVar.jt(1153685242);
                        while (i2 < hz.am * 1674041529) {
                            i3 = hz.ak[i2];
                            if ((hz.ar[i3] & 1) == 0) {
                                byte[] bArr2;
                                if (i5 > 0) {
                                    i5--;
                                    bArr2 = hz.ar;
                                    bArr2[i3] = (byte) (bArr2[i3] | 2);
                                } else if (lvVar.jm(1, -1178548558) == 0) {
                                    i5 = ia.al(lvVar, -1939276383);
                                    bArr2 = hz.ar;
                                    bArr2[i3] = (byte) (bArr2[i3] | 2);
                                } else if (ay.ai(lvVar, i3, (byte) -29)) {
                                    bArr2 = hz.ar;
                                    bArr2[i3] = (byte) (bArr2[i3] | 2);
                                }
                            }
                            i2++;
                        }
                        lvVar.js(-152532801);
                        if (i5 == 0) {
                            hz.ai = 0;
                            hz.am = 0;
                            for (i5 = 1; i5 < 2048; i5++) {
                                byte[] bArr3 = hz.ar;
                                bArr3[i5] = (byte) (bArr3[i5] >> 1);
                                int[] iArr;
                                if (client.jz[i5] != null) {
                                    iArr = hz.ae;
                                    i2 = hz.ai + 1600734293;
                                    hz.ai = i2;
                                    iArr[(i2 * -1076782851) - 1] = i5;
                                } else {
                                    iArr = hz.ak;
                                    i2 = hz.am - 178737783;
                                    hz.am = i2;
                                    iArr[(i2 * 1674041529) - 1] = i5;
                                }
                            }
                            return;
                        }
                        throw new RuntimeException();
                    }
                    throw new RuntimeException();
                }
                throw new RuntimeException();
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void be(dp dpVar, int i, int i2, int i3, int i4) {
        try {
            if (client.pq * 924362057 < 50 && client.pp * 1070201509 != 0 && dpVar.ak != null && i < dpVar.ak.length) {
                int i5 = dpVar.ak[i];
                if (i5 != 0) {
                    client.pe[client.pq * 924362057] = i5 >> 8;
                    client.pg[client.pq * 924362057] = (i5 >> 4) & 7;
                    client.pi[client.pq * 924362057] = 0;
                    client.ps[client.pq * 924362057] = null;
                    int i6 = ((i2 - 64) / 128) << 16;
                    client.pr[client.pq * 924362057] = (i5 & 15) + (i6 + (((i3 - 64) / 128) << 8));
                    client.pq -= 1650893575;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.be(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void cu(int i) {
        try {
            ns aq = ib.aq(no.bb, client.eb.aj, 1472911190);
            aq.ar.al(el.ct(1427053082), -1810297196);
            aq.ar.aj(hl.tk * 1350811837, 265362003);
            aq.ar.aj(jw.tx * -1083397279, -1125808669);
            client.eb.ar(aq, 497110634);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.cu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c1 A:{Catch:{ RuntimeException -> 0x0327 }} */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01df A:{Catch:{ RuntimeException -> 0x0327 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0202 A:{Catch:{ RuntimeException -> 0x0327 }} */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0225 A:{Catch:{ RuntimeException -> 0x0327 }} */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0255 A:{Catch:{ RuntimeException -> 0x0327 }} */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0306 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b2 A:{Catch:{ RuntimeException -> 0x0327 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void dy(int i, int i2, int i3, int i4, int i5) {
        try {
            int i6;
            int i7;
            es ad = client.aq.uk.ad(-601277067);
            client.ie = 0;
            int i8 = hz.ai * -1076782851;
            int[] iArr = hz.ae;
            int i9 = 0;
            int i10 = -1;
            Object obj = null;
            int i11 = -1;
            while (i9 < (client.ed * -1087962683) + i8) {
                Object obj2;
                ih ihVar;
                if (i9 < i8) {
                    ihVar = client.jz[iArr[i9]];
                    if (client.kw * 1452663617 == iArr[i9]) {
                        obj2 = 1;
                        i6 = i10;
                        i7 = i9;
                    } else {
                        if (da.jc == ihVar) {
                            obj2 = obj;
                            i6 = i9;
                            i7 = i11;
                        }
                        fg.m213do(ihVar, i9, i, i2, i3, i4, (byte) -10);
                        obj2 = obj;
                        i6 = i10;
                        i7 = i11;
                    }
                } else {
                    ihVar = client.eg[client.er[i9 - i8]];
                    fg.m213do(ihVar, i9, i, i2, i3, i4, (byte) -10);
                    obj2 = obj;
                    i6 = i10;
                    i7 = i11;
                }
                i9++;
                obj = obj2;
                i10 = i6;
                i11 = i7;
            }
            if (client.jt && i10 != -1) {
                fg.m213do(da.jc, i10, i, i2, i3, i4, (byte) -62);
            }
            if (obj != null) {
                fg.m213do(client.jz[client.kw * 1452663617], i11, i, i2, i3, i4, (byte) -35);
            }
            for (int i12 = 0; i12 < client.ie * 1711909053; i12++) {
                i7 = client.io[i12];
                int i13 = client.iw[i12];
                int i14 = client.ik[i12];
                int i15 = client.iq[i12];
                Object obj3 = 1;
                while (obj3 != null) {
                    i6 = 0;
                    obj3 = null;
                    while (i6 < i12) {
                        if (i13 + 2 > client.iw[i6] - client.iq[i6] && i13 - i15 < client.iw[i6] + 2 && i7 - i14 < client.ik[i6] + client.io[i6] && i14 + i7 > client.io[i6] - client.ik[i6] && client.iw[i6] - client.iq[i6] < i13) {
                            i13 = client.iw[i6] - client.iq[i6];
                            obj3 = 1;
                        }
                        i6++;
                    }
                }
                client.ig = client.io[i12] * -2017756437;
                client.iw[i12] = i13;
                client.iy = i13 * -289370865;
                String str = client.ir[i12];
                if (client.lz * 1217719153 == 0) {
                    i13 = client.in[i12] < 6 ? client.oh[client.in[i12]] : 16776960;
                    if (6 == client.in[i12]) {
                        i13 = (client.ii * -1259311449) % 20 < 10 ? 16711680 : 16776960;
                    }
                    if (7 == client.in[i12]) {
                        i13 = (client.ii * -1259311449) % 20 < 10 ? 255 : SupportMenu.USER_MASK;
                    }
                    if (client.in[i12] == 8) {
                        i13 = (client.ii * -1259311449) % 20 < 10 ? 45056 : 8454016;
                    }
                    if (9 == client.in[i12]) {
                        i6 = 150 - client.ib[i12];
                        if (i6 < 50) {
                            i13 = 16711680 + (i6 * kr.ae);
                        } else if (i6 < 100) {
                            i13 = 16776960 - ((i6 - 50) * 327680);
                        } else if (i6 < 150) {
                            i13 = MotionEventCompat.ACTION_POINTER_INDEX_MASK + ((i6 - 100) * 5);
                        }
                    }
                    if (10 == client.in[i12]) {
                        i6 = 150 - client.ib[i12];
                        if (i6 < 50) {
                            i13 = 16711680 + (i6 * 5);
                        } else if (i6 < 100) {
                            i13 = 16711935 - ((i6 - 50) * 327680);
                        } else if (i6 < 150) {
                            i13 = i6 - 100;
                            i13 = ((327680 * i13) + 255) - (i13 * 5);
                        }
                    }
                    if (11 == client.in[i12]) {
                        i6 = 150 - client.ib[i12];
                        if (i6 < 50) {
                            i13 = ViewCompat.MEASURED_SIZE_MASK - (i6 * 327685);
                        } else if (i6 < 100) {
                            i14 = ((i6 - 50) * 327685) + MotionEventCompat.ACTION_POINTER_INDEX_MASK;
                            if (client.ih[i12] == 0) {
                                lh.fs.ap(str, (client.ig * 186539459) + i, (client.iy * -639843857) + i2, i14, 0, ad);
                            }
                            if (1 == client.ih[i12]) {
                                lh.fs.az(str, (client.ig * 186539459) + i, (client.iy * -639843857) + i2, i14, 0, client.ii * -1259311449, ad);
                            }
                            if (client.ih[i12] == 2) {
                                lh.fs.ax(str, (client.ig * 186539459) + i, (client.iy * -639843857) + i2, i14, 0, client.ii * -1259311449, ad);
                            }
                            if (3 == client.ih[i12]) {
                                lh.fs.aw(str, i + (client.ig * 186539459), (client.iy * -639843857) + i2, i14, 0, client.ii * -1259311449, 150 - client.ib[i12], ad);
                            }
                            if (client.ih[i12] == 4) {
                                i6 = ((150 - client.ib[i12]) * (lh.fs.al(str) + 100)) / 150;
                                i8 = i2 + i4;
                                ad.ew(((client.ig * 186539459) + i) - 50, i2, ((186539459 * client.ig) + i) + 50, i8, -1196674865);
                                lh.fs.ak(str, (((client.ig * 186539459) + i) + 50) - i6, (client.iy * -639843857) + i2, i14, 0, ad);
                                ad.ee(i, i2, i + i3, i8, 1816814832);
                            }
                            if (client.ih[i12] != 5) {
                                i13 = 150 - client.ib[i12];
                                if (i13 < 25) {
                                    i13 -= 25;
                                } else if (i13 > 125) {
                                    i13 -= 125;
                                } else {
                                    i7 = 0;
                                    i11 = i + i3;
                                    ad.ew(i, (((client.iy * -639843857) + i2) - lh.fs.ae) - 1, i11, ((client.iy * -639843857) + i2) + 5, -1305491317);
                                    lh.fs.ap(str, (client.ig * 186539459) + i, i7 + ((client.iy * -639843857) + i2), i14, 0, ad);
                                    ad.ee(i, i2, i11, i4 + i2, 1798615180);
                                }
                                i7 = i13;
                                i11 = i + i3;
                                ad.ew(i, (((client.iy * -639843857) + i2) - lh.fs.ae) - 1, i11, ((client.iy * -639843857) + i2) + 5, -1305491317);
                                lh.fs.ap(str, (client.ig * 186539459) + i, i7 + ((client.iy * -639843857) + i2), i14, 0, ad);
                                ad.ee(i, i2, i11, i4 + i2, 1798615180);
                            }
                        } else if (i6 < 150) {
                            i13 = ViewCompat.MEASURED_SIZE_MASK - ((i6 - 100) * 327680);
                        }
                    }
                    i14 = i13;
                    if (client.ih[i12] == 0) {
                    }
                    if (1 == client.ih[i12]) {
                    }
                    if (client.ih[i12] == 2) {
                    }
                    if (3 == client.ih[i12]) {
                    }
                    if (client.ih[i12] == 4) {
                    }
                    if (client.ih[i12] != 5) {
                    }
                } else {
                    lh.fs.ap(str, (client.ig * 186539459) + i, (client.iy * -639843857) + i2, 16776960, 0, ad);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.dy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void io(lj ljVar, int i) {
        try {
            if (client.ek != null) {
                ljVar.ax(client.ek, 0, client.ek.length, 784767021);
                return;
            }
            byte[] al = ml.al((byte) 79);
            ljVar.ax(al, 0, al.length, 603359013);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cx.io(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
