package defpackage;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.ViewCompat;
import com.jagex.oldscape.osrenderer.ad;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bt */
public class bt extends by {
    public static final String ap = "gsu6PD";
    static final int bw = 16;
    public static final int cb = 84;
    int[] ad;
    List ai;
    int aj;
    int[] aq;
    int[] ar;

    bt(at atVar) {
        try {
            super(atVar);
            this.ad = new int[4700];
            this.aq = new int[4700];
            this.ar = new int[4700];
            this.ai = new LinkedList();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ax(int i, hw hwVar, boolean z, byte b) {
        al alVar;
        if (z) {
            try {
                alVar = lj.az;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bt.ax(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        alVar = hl.au;
        int[] iArr;
        int i2;
        if (1700 == i) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.fu * -1806633963;
            return 1;
        } else if (1701 == i) {
            if (-1 != alVar.fu * -1806633963) {
                iArr = hl.ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = alVar.fc * -1405353077;
                return 1;
            }
            int[] iArr2 = hl.ae;
            int i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = 0;
            return 1;
        } else if (1702 != i) {
            return 2;
        } else {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.ah * 988026877;
            return 1;
        }
    }

    static boolean bf(dx dxVar, byte b) {
        try {
            if (dxVar.bw != null) {
                int[] iArr = dxVar.bw;
                for (int aq : iArr) {
                    if (-1 != aj.aq(aq, 15637077).bm * 906580321) {
                        return true;
                    }
                }
            } else if (-1 != dxVar.bm * 906580321) {
                return true;
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void bw(byte b) {
    }

    static final void bz(byte b) {
        try {
            if (client.ou * -748083697 != am.jy * 1973701849) {
                client.ou = am.jy * 119375511;
                bt.eh(am.jy * 1973701849, (byte) 66);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.bz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void eh(int i, byte b) {
        try {
            int i2;
            int i3;
            int i4;
            int[] iArr = ix.oj.ad;
            int length = iArr.length;
            for (i2 = 0; i2 < length; i2++) {
                iArr[i2] = ViewCompat.MEASURED_STATE_MASK;
            }
            for (int i5 = 1; i5 < 103; i5++) {
                length = ((103 - i5) * 2048) + 24628;
                for (int i6 = 1; i6 < 103; i6++) {
                    if ((in.aq[i][i6][i5] & 24) == 0) {
                        ce.fk.bf(iArr, length, 512, i, i6, i5);
                    }
                    if (i < 3) {
                        i3 = i + 1;
                        if ((in.aq[i3][i6][i5] & 8) != 0) {
                            ce.fk.bf(iArr, length, 512, i3, i6, i5);
                        }
                    }
                    length += 4;
                }
            }
            int random = ((((((int) (Math.random() * 20.0d)) + 238) - 10) << 16) + (((((int) (Math.random() * 20.0d)) + 238) - 10) << 8)) + ((((int) (Math.random() * 20.0d)) + 238) - 10);
            i3 = ((((int) (Math.random() * 20.0d)) + 238) - 10) << 16;
            for (length = 1; length < 103; length++) {
                for (i4 = 1; i4 < 103; i4++) {
                    if ((in.aq[i][i4][length] & 24) == 0) {
                        fq.ec(i, i4, length, random, i3, 1778733522);
                    }
                    if (i < 3) {
                        i2 = i + 1;
                        if ((in.aq[i2][i4][length] & 8) != 0) {
                            fq.ec(i2, i4, length, random, i3, 1445055971);
                        }
                    }
                }
            }
            client.om = 0;
            for (i4 = 0; i4 < 104; i4++) {
                for (i2 = 0; i2 < 104; i2++) {
                    long bm = ce.fk.bm(am.jy * 1973701849, i4, i2);
                    if (bm != 0) {
                        length = aj.aq(lr.au(bm), 482866761).bm * 906580321;
                        if (length >= 0) {
                            client.op[client.om * -2074463383] = jg.aq(length, (byte) 64).ai(false, -931092104);
                            client.ok[client.om * -2074463383] = i4;
                            client.ot[client.om * -2074463383] = i2;
                            client.om += 996510937;
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.eh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void et(boolean z, lv lvVar, byte b) {
        try {
            client.gw = z;
            int an;
            int i;
            int i2;
            int i3;
            if (client.gw) {
                int i4;
                int cp = lvVar.cp(1018261402);
                int ci = lvVar.ci(-1763636469);
                Object obj = lvVar.af(1804771424) == 1 ? 1 : null;
                an = lvVar.an(-1464407032);
                lvVar.jt(1153685242);
                i = 0;
                while (true) {
                    i4 = i;
                    if (i4 >= 4) {
                        break;
                    }
                    i = 0;
                    while (true) {
                        i2 = i;
                        if (i2 >= 13) {
                            break;
                        }
                        for (i = 0; i < 13; i++) {
                            if (lvVar.jm(1, -1713009004) == 1) {
                                client.gp[i4][i2][i] = lvVar.jm(26, -1804198292);
                            } else {
                                client.gp[i4][i2][i] = -1;
                            }
                        }
                        i = i2 + 1;
                    }
                    i = i4 + 1;
                }
                lvVar.js(-374235205);
                lh.fo = (int[][]) Array.newInstance(Integer.TYPE, new int[]{an, 4});
                for (i2 = 0; i2 < an; i2++) {
                    for (i = 0; i < 4; i++) {
                        lh.fo[i2][i] = lvVar.at((byte) -19);
                    }
                }
                gi.fc = new int[an];
                hb.fb = new int[an];
                je.fp = new int[an];
                em.fe = new byte[an][];
                bq.fl = new byte[an][];
                i = 0;
                i4 = 0;
                while (true) {
                    i2 = i;
                    if (i2 >= 4) {
                        break;
                    }
                    an = 0;
                    while (an < 13) {
                        i = i4;
                        for (int i5 = 0; i5 < 13; i5++) {
                            i4 = client.gp[i2][an][i5];
                            if (i4 != -1) {
                                i4 = (((i4 >> 3) & 2047) / 8) + ((((i4 >> 14) & 1023) / 8) << 8);
                                for (i3 = 0; i3 < i; i3++) {
                                    if (gi.fc[i3] == i4) {
                                        i4 = -1;
                                        break;
                                    }
                                }
                                if (i4 != -1) {
                                    gi.fc[i] = i4;
                                    i3 = (i4 >> 8) & 255;
                                    i4 &= 255;
                                    int[] iArr = hb.fb;
                                    kv kvVar = dh.ch;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("m");
                                    stringBuilder.append(i3);
                                    stringBuilder.append("_");
                                    stringBuilder.append(i4);
                                    iArr[i] = kvVar.af(stringBuilder.toString(), 16106789);
                                    iArr = je.fp;
                                    kvVar = dh.ch;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("l");
                                    stringBuilder.append(i3);
                                    stringBuilder.append("_");
                                    stringBuilder.append(i4);
                                    iArr[i] = kvVar.af(stringBuilder.toString(), -197398376);
                                    i++;
                                }
                            }
                        }
                        an++;
                        i4 = i;
                    }
                    i = i2 + 1;
                }
                ca.eq(ci, cp, obj == null, -552331955);
                return;
            }
            int i6;
            an = lvVar.ci(-1763636469);
            i3 = lvVar.cp(946822088);
            i2 = lvVar.an(-1464407032);
            lh.fo = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i2, 4});
            for (i6 = 0; i6 < i2; i6++) {
                for (i = 0; i < 4; i++) {
                    lh.fo[i6][i] = lvVar.at((byte) -16);
                }
            }
            gi.fc = new int[i2];
            hb.fb = new int[i2];
            je.fp = new int[i2];
            em.fe = new byte[i2][];
            bq.fl = new byte[i2][];
            Object obj2 = ((i3 / 8 == 48 || i3 / 8 == 49) && an / 8 == 48) ? 1 : null;
            Object obj3 = (48 == i3 / 8 && 148 == an / 8) ? 1 : obj2;
            i6 = (i3 - 6) / 8;
            i = 0;
            while (i6 <= (i3 + 6) / 8) {
                i2 = (an - 6) / 8;
                while (i2 <= (an + 6) / 8) {
                    if (obj3 == null || !(49 == i2 || i2 == 149 || 147 == i2 || 50 == i6 || (i6 == 49 && 47 == i2))) {
                        gi.fc[i] = (i6 << 8) + i2;
                        int[] iArr2 = hb.fb;
                        kv kvVar2 = dh.ch;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("m");
                        stringBuilder2.append(i6);
                        stringBuilder2.append("_");
                        stringBuilder2.append(i2);
                        iArr2[i] = kvVar2.af(stringBuilder2.toString(), -1215792632);
                        iArr2 = je.fp;
                        kvVar2 = dh.ch;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("l");
                        stringBuilder2.append(i6);
                        stringBuilder2.append("_");
                        stringBuilder2.append(i2);
                        iArr2[i] = kvVar2.af(stringBuilder2.toString(), -1645905160);
                        i++;
                    }
                    i2++;
                }
                i6++;
            }
            ca.eq(i3, an, true, -1357034585);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("bt.et(");
            stringBuilder3.append(')');
            throw mv.aq(e, stringBuilder3.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aa(int i) {
        this.aj = 639683531 * i;
        this.ai.size();
        aj(1549185943);
    }

    /* Access modifiers changed, original: final */
    public final boolean ab(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (bpVar.bc >= 1600) {
            return false;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.bo.bd;
        int i15 = this.bo.bo;
        int i16 = ae[i];
        int i17 = am[i];
        for (i9 = 0; i9 < bpVar.aj; i9++) {
            i10 = bpVar.ai[i9];
            i11 = bpVar.ae[i9];
            i12 = bpVar.am[i9];
            if (i != 0) {
                i13 = ((i12 * i17) - (i10 * i16)) >> 16;
                i10 = ((i10 * i17) + (i12 * i16)) >> 16;
            } else {
                i13 = i12;
            }
            i10 += i6;
            i12 = i11 + i7;
            i13 += i8;
            i11 = ((i13 * i5) - (i10 * i4)) >> 16;
            int i18 = ((i11 * i3) + (i12 * i2)) >> 16;
            if (i18 >= 1420165342) {
                this.aw[i9] = (((((i10 * i5) + (i13 * i4)) >> 16) * (this.bo.bq * -825780405)) / i18) + (-56209013 * i14);
                this.ac[i9] = (((this.bo.bq * 917992666) * (((i12 * i3) - (i11 * i2)) >> 16)) / i18) + (-915095829 * i15);
            } else {
                int[] iArr = this.aw;
                this.ac[i9] = -1;
                iArr[i9] = -1;
            }
        }
        i9 = 0;
        while (true) {
            i11 = i9;
            if (i11 >= bpVar.ak) {
                return false;
            }
            if (455539786 != bpVar.ax[i11]) {
                i9 = bpVar.as[i11];
                i10 = bpVar.ag[i11];
                i13 = bpVar.ap[i11];
                i12 = this.aw[i9];
                i14 = this.aw[i10];
                i15 = this.aw[i13];
                if (!(-1 == i12 || -1 == i14 || -1 == i15 || !dz.an(this.ac[i9], this.ac[i10], this.ac[i13], i12, i14, i15, 5, -1270973766))) {
                    return true;
                }
            }
            i9 = i11 + 1;
        }
    }

    /* Access modifiers changed, original: final */
    public final void ac(int i) {
        this.aj = 639683531 * i;
        this.ai.size();
        aj(-1314973242);
    }

    public final void ad(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Throwable e;
        StringBuilder stringBuilder;
        try {
            int i9 = 0;
            this.an[0] = -1;
            if (!(2 == bpVar.bf || bpVar.bf == 1)) {
                bpVar.ae();
            }
            int i10 = this.bo.bd * -1240378447;
            int i11 = this.bo.bo;
            int i12 = ae[i];
            int i13 = am[i];
            int i14 = ae[i2];
            int i15 = am[i2];
            int i16 = ae[i3];
            int i17 = am[i3];
            int i18 = ae[i4];
            int i19 = am[i4];
            while (true) {
                int i20 = i9;
                if (i20 < bpVar.aj) {
                    i9 = bpVar.ai[i20];
                    int i21 = bpVar.ae[i20];
                    try {
                        int i22;
                        int i23;
                        int i24 = bpVar.am[i20];
                        if (i3 != 0) {
                            i22 = ((i21 * i17) - (i9 * i16)) >> 16;
                            i9 = ((i9 * i17) + (i21 * i16)) >> 16;
                        } else {
                            i22 = i21;
                        }
                        if (i != 0) {
                            i21 = ((i24 * i13) + (i22 * i12)) >> 16;
                            i23 = ((i22 * i13) - (i24 * i12)) >> 16;
                        } else {
                            i23 = i22;
                            i21 = i24;
                        }
                        if (i2 != 0) {
                            i22 = ((i21 * i15) - (i9 * i14)) >> 16;
                            i9 = ((i9 * i15) + (i21 * i14)) >> 16;
                        } else {
                            i22 = i21;
                        }
                        i9 += i5;
                        i21 = i23 + i6;
                        i22 += i7;
                        i23 = ((i21 * i19) - (i22 * i18)) >> 16;
                        i22 = ((i22 * i19) + (i21 * i18)) >> 16;
                        this.aa[i20] = i22 - (((i6 * i18) + (i19 * i7)) >> 16);
                        this.aw[i20] = (((this.bo.bq * 1516652957) * i9) / i22) + i10;
                        this.ac[i20] = (-1165057787 * i11) + (((this.bo.bq * 1516652957) * i23) / i22);
                        if (bpVar.af > 0) {
                            this.ao[i20] = i9;
                            this.ah[i20] = i23;
                            this.af[i20] = i22;
                        }
                        i9 = i20 + 1;
                    } catch (RuntimeException e2) {
                        e = e2;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("bt.ad(");
                        stringBuilder.append(')');
                        throw mv.aq(e, stringBuilder.toString());
                    }
                }
                try {
                    am(bpVar, false, false, 0);
                    return;
                } catch (Exception e3) {
                    return;
                }
            }
        } catch (RuntimeException e4) {
            e = e4;
            stringBuilder = new StringBuilder();
            stringBuilder.append("bt.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ae(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.an[0] = -1;
        if (!(2 == bpVar.bf || bpVar.bf == 1)) {
            bpVar.ae();
        }
        int i8 = this.bo.bd * -1496668263;
        int i9 = this.bo.bo;
        int i10 = ae[i];
        int i11 = am[i];
        int i12 = ae[i2];
        int i13 = am[i2];
        int i14 = ae[i3];
        int i15 = am[i3];
        int i16 = ae[i4];
        int i17 = am[i4];
        for (int i18 = 0; i18 < bpVar.aj; i18++) {
            int i19;
            int i20;
            int i21 = bpVar.ai[i18];
            int i22 = bpVar.ae[i18];
            int i23 = bpVar.am[i18];
            if (i3 != 0) {
                i19 = ((i22 * i15) - (i21 * i14)) >> 16;
                i21 = ((i21 * i15) + (i22 * i14)) >> 16;
            } else {
                i19 = i22;
            }
            if (i != 0) {
                i22 = ((i23 * i11) + (i19 * i10)) >> 16;
                i20 = ((i19 * i11) - (i23 * i10)) >> 16;
            } else {
                i20 = i19;
                i22 = i23;
            }
            if (i2 != 0) {
                i19 = ((i22 * i13) - (i21 * i12)) >> 16;
                i21 = ((i21 * i13) + (i22 * i12)) >> 16;
            } else {
                i19 = i22;
            }
            i21 += i5;
            i22 = i20 + i6;
            i19 += i7;
            i20 = ((i22 * i17) - (i19 * i16)) >> 16;
            i19 = ((i19 * i17) + (i22 * i16)) >> 16;
            this.aa[i18] = i19 - (((i6 * i16) + (i17 * i7)) >> 16);
            this.aw[i18] = (((this.bo.bq * 1516652957) * i21) / i19) + i8;
            this.ac[i18] = (-2091573327 * i9) + (((this.bo.bq * 1670888896) * i20) / i19);
            if (bpVar.af > 0) {
                this.ao[i18] = i21;
                this.ah[i18] = i20;
                this.af[i18] = i19;
            }
        }
        try {
            am(bpVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: final */
    public final void af() {
        int i = this.aj;
        Iterator it = this.ai.iterator();
        while (it.hasNext()) {
            bp bpVar = (bp) it.next();
            if ((728662499 * i) - 100 >= bpVar.bo) {
                ag(bpVar, -2057567296);
                bpVar.bo = -1;
                bpVar.bd = true;
                it.remove();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(bp bpVar, int i) {
        try {
            ad.bb(bpVar.bq, 1989916812);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ah() {
        int i = this.aj;
        Iterator it = this.ai.iterator();
        while (it.hasNext()) {
            bp bpVar = (bp) it.next();
            if ((728662499 * i) - 100 >= bpVar.bo) {
                ag(bpVar, -2057567296);
                bpVar.bo = -1;
                bpVar.bd = true;
                it.remove();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean ai(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b) {
        try {
            if (bpVar.bc >= 1600) {
                return false;
            }
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14 = this.bo.bd;
            int i15 = this.bo.bo;
            int i16 = ae[i];
            int i17 = am[i];
            for (i9 = 0; i9 < bpVar.aj; i9++) {
                i10 = bpVar.ai[i9];
                i11 = bpVar.ae[i9];
                i12 = bpVar.am[i9];
                if (i != 0) {
                    i13 = ((i12 * i17) - (i10 * i16)) >> 16;
                    i10 = ((i10 * i17) + (i12 * i16)) >> 16;
                } else {
                    i13 = i12;
                }
                i10 += i6;
                i12 = i11 + i7;
                i13 += i8;
                i11 = ((i13 * i5) - (i10 * i4)) >> 16;
                int i18 = ((i11 * i3) + (i12 * i2)) >> 16;
                if (i18 >= 50) {
                    this.aw[i9] = (((((i10 * i5) + (i13 * i4)) >> 16) * (this.bo.bq * 1516652957)) / i18) + (-1240378447 * i14);
                    this.ac[i9] = (((this.bo.bq * 1516652957) * (((i12 * i3) - (i11 * i2)) >> 16)) / i18) + (-1165057787 * i15);
                } else {
                    int[] iArr = this.aw;
                    this.ac[i9] = -1;
                    iArr[i9] = -1;
                }
            }
            for (i11 = 0; i11 < bpVar.ak; i11++) {
                if (-2 != bpVar.ax[i11]) {
                    i10 = bpVar.as[i11];
                    i13 = bpVar.ag[i11];
                    i12 = bpVar.ap[i11];
                    i9 = this.aw[i10];
                    i14 = this.aw[i13];
                    i15 = this.aw[i12];
                    if (!(-1 == i9 || -1 == i14 || -1 == i15 || !dz.an(this.ac[i10], this.ac[i13], this.ac[i12], i9, i14, i15, 5, -922974889))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(int i) {
        try {
            int i2 = this.aj;
            Iterator it = this.ai.iterator();
            while (it.hasNext()) {
                bp bpVar = (bp) it.next();
                if ((728662499 * i2) - 100 >= bpVar.bo) {
                    ag(bpVar, -2057567296);
                    bpVar.bo = -1;
                    bpVar.bd = true;
                    it.remove();
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ak(bp bpVar, int i, int i2) {
        try {
            int i3 = bpVar.as[i];
            int i4 = bpVar.ag[i];
            int i5 = bpVar.ap[i];
            this.bo.at = this.az[i];
            if (bpVar.ac == null) {
                this.bo.bm = 0;
            } else {
                this.bo.bm = (bpVar.ac[i] & 255) * 767944399;
            }
            if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
                int i6;
                int i7;
                int i8;
                if (bpVar.aa == null || bpVar.aa[i] == (byte) -1) {
                    i6 = i4;
                    i7 = i3;
                    i8 = i5;
                } else {
                    i8 = bpVar.aa[i] & 255;
                    i7 = bpVar.ay[i8];
                    i6 = bpVar.an[i8];
                    i8 = bpVar.ab[i8];
                }
                float f = (float) this.ad[i7];
                float f2 = (float) this.aq[i7];
                float f3 = (float) this.ar[i7];
                float f4 = ((float) this.ad[i6]) - f;
                float f5 = ((float) this.aq[i6]) - f2;
                float f6 = ((float) this.ar[i6]) - f3;
                float f7 = ((float) this.ad[i8]) - f;
                float f8 = ((float) this.aq[i8]) - f2;
                float f9 = ((float) this.ar[i8]) - f3;
                float f10 = ((float) this.ad[i3]) - f;
                float f11 = ((float) this.aq[i3]) - f2;
                float f12 = ((float) this.ar[i3]) - f3;
                float f13 = ((float) this.ad[i4]) - f;
                float f14 = ((float) this.aq[i4]) - f2;
                float f15 = ((float) this.ar[i4]) - f3;
                f = ((float) this.ad[i5]) - f;
                f2 = ((float) this.aq[i5]) - f2;
                f3 = ((float) this.ar[i5]) - f3;
                float f16 = (f5 * f9) - (f8 * f6);
                float f17 = (f7 * f6) - (f4 * f9);
                float f18 = (f8 * f4) - (f7 * f5);
                float f19 = (f18 * f8) - (f17 * f9);
                float f20 = (f16 * f9) - (f18 * f7);
                float f21 = (f7 * f17) - (f8 * f16);
                float f22 = 1.0f / ((f6 * f21) + ((f4 * f19) + (f5 * f20)));
                float f23 = ((f12 * f21) + ((f11 * f20) + (f19 * f10))) * f22;
                float f24 = ((f15 * f21) + ((f20 * f14) + (f19 * f13))) * f22;
                f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
                f20 = (f18 * f5) - (f17 * f6);
                f6 = (f6 * f16) - (f18 * f4);
                f4 = (f4 * f17) - (f5 * f16);
                f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
                f11 = f9 * ((f12 * f4) + ((f11 * f6) + (f10 * f20)));
                f12 = f9 * ((f15 * f4) + ((f20 * f13) + (f14 * f6)));
                f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
                f6 = f24 - f23;
                if (f6 > 0.99f && f6 < 1.1f) {
                    f24 = 1.0f;
                }
                f6 = f19 - f24;
                if (f6 > 0.99f && f6 < 1.1f) {
                    f19 = 1.0f;
                }
                f6 = f23 - f19;
                if (f6 > 0.99f && f6 < 1.1f) {
                    f23 = 1.0f;
                }
                f6 = f23 - f24;
                if (f6 > 0.99f && f6 < 1.1f) {
                    f23 = 1.0f;
                }
                f6 = f24 - f19;
                if (f6 > 0.99f && f6 < 1.1f) {
                    f24 = 1.0f;
                }
                f6 = f19 - f23;
                if (f6 > 0.99f && f6 < 1.1f) {
                    f19 = 1.0f;
                }
                if (bpVar.ax[i] == -1) {
                    ((at) this.bo).ak(this.ah[i3], this.ah[i4], this.ah[i5], this.ao[i3], this.ao[i4], this.ao[i5], this.af[i3], this.af[i4], this.af[i5], bpVar.au[i], bpVar.au[i], bpVar.au[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -169495832);
                } else {
                    ((at) this.bo).ak(this.ah[i3], this.ah[i4], this.ah[i5], this.ao[i3], this.ao[i4], this.ao[i5], this.af[i3], this.af[i4], this.af[i5], bpVar.au[i], bpVar.az[i], bpVar.ax[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -246442042);
                }
            } else if (-1 == bpVar.ax[i]) {
                ((at) this.bo).ai(this.ac[i3], this.ac[i4], this.ac[i5], this.aw[i3], this.aw[i4], this.aw[i5], ak[bpVar.au[i]], 126313426);
            } else {
                ((at) this.bo).aj(this.ac[i3], this.ac[i4], this.ac[i5], this.aw[i3], this.aw[i4], this.aw[i5], bpVar.au[i], bpVar.az[i], bpVar.ax[i], (byte) 96);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void al(int i, int i2) {
        try {
            this.aj = 639683531 * i;
            this.ai.size();
            aj(91511731);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:148:?, code skipped:
            r6 = r18.av[r9];
            r13 = r18.at[r9];
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:149:0x03de, code skipped:
            if (r3 >= r6) goto L_0x0462;
     */
    /* JADX WARNING: Missing block: B:150:0x03e0, code skipped:
            ak(r19, r13[r3], 2138202314);
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:175:0x0462, code skipped:
            r9 = r9 + 1;
            r3 = r2;
            r6 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void am(bp bpVar, boolean z, boolean z2, long j) {
        try {
            if (bpVar.bc < 1600) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int[] iArr;
                int[] iArr2;
                for (i = 0; i < bpVar.bc; i++) {
                    this.an[i] = 0;
                }
                boolean z3 = z2;
                for (i2 = 0; i2 < bpVar.ak; i2++) {
                    if (-2 != bpVar.ax[i2]) {
                        i3 = bpVar.as[i2];
                        int i11 = bpVar.ag[i2];
                        int i12 = bpVar.ap[i2];
                        i4 = this.aw[i3];
                        i5 = this.aw[i11];
                        i6 = this.aw[i12];
                        int[] iArr3;
                        if (z && (i4 == -5000 || -5000 == i5 || -5000 == i6)) {
                            i = this.ao[i3];
                            i7 = this.ao[i11];
                            i8 = this.ao[i12];
                            i4 = this.ah[i3];
                            i5 = this.ah[i11];
                            i6 = this.ah[i12];
                            i9 = this.af[i3];
                            i10 = this.af[i11];
                            i -= i7;
                            i8 -= i7;
                            i4 -= i5;
                            i6 -= i5;
                            i9 -= i10;
                            int i13 = this.af[i12] - i10;
                            if ((((i * i6) - (i8 * i4)) * i10) + ((i7 * ((i13 * i4) - (i9 * i6))) + (i5 * ((i9 * i8) - (i13 * i)))) > 0) {
                                this.ax[i2] = true;
                                i = bpVar.bv + ((this.aa[i12] + (this.aa[i3] + this.aa[i11])) / 3);
                                iArr = this.ab[i];
                                iArr3 = this.an;
                                i4 = iArr3[i];
                                iArr3[i] = i4 + 1;
                                iArr[i4] = i2;
                            }
                        } else {
                            boolean z4;
                            if (!z3) {
                                z4 = z3;
                            } else if (dz.an(this.ac[i3], this.ac[i11], this.ac[i12], i4, i5, i6, 0, 2992256)) {
                                aw.aw(j);
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (((this.ac[i12] - this.ac[i11]) * (i4 - i5)) - ((i6 - i5) * (this.ac[i3] - this.ac[i11])) > 0) {
                                this.ax[i2] = false;
                                if (i4 < 0 || i5 < 0 || i6 < 0 || i4 > this.bo.bl * 1505645037 || i5 > this.bo.bl * 1505645037 || i6 > this.bo.bl * 1505645037) {
                                    this.az[i2] = true;
                                } else {
                                    this.az[i2] = false;
                                }
                                i7 = bpVar.bv + (((this.aa[i11] + this.aa[i3]) + this.aa[i12]) / 3);
                                iArr3 = this.ab[i7];
                                iArr2 = this.an;
                                i5 = iArr2[i7];
                                iArr2[i7] = i5 + 1;
                                iArr3[i5] = i2;
                                z3 = z4;
                            } else {
                                z3 = z4;
                            }
                        }
                    }
                }
                if (bpVar.aw == null) {
                    for (i7 = bpVar.bc - 1; i7 >= 0; i7--) {
                        i8 = this.an[i7];
                        if (i8 > 0) {
                            iArr2 = this.ab[i7];
                            for (i = 0; i < i8; i++) {
                                ak(bpVar, iArr2[i], 1763940352);
                            }
                        }
                    }
                    return;
                }
                int[] iArr4;
                for (i = 0; i < 12; i++) {
                    this.av[i] = 0;
                    this.bs[i] = 0;
                }
                for (i7 = bpVar.bc - 1; i7 >= 0; i7--) {
                    i8 = this.an[i7];
                    if (i8 > 0) {
                        iArr2 = this.ab[i7];
                        for (i = 0; i < i8; i++) {
                            i5 = iArr2[i];
                            byte b = bpVar.aw[i5];
                            int[] iArr5 = this.av;
                            i10 = iArr5[b];
                            iArr5[b] = i10 + 1;
                            this.at[b][i10] = i5;
                            if (b < (byte) 10) {
                                int[] iArr6 = this.bs;
                                iArr6[b] = iArr6[b] + i7;
                            } else if (b == (byte) 10) {
                                this.bk[i10] = i7;
                            } else {
                                this.ba[i10] = i7;
                            }
                        }
                    }
                }
                i3 = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[2] + this.bs[1]) / (this.av[2] + this.av[1]) : 0;
                i2 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[4] + this.av[3]) : 0;
                int i14 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[8] + this.bs[6]) / (this.av[8] + this.av[6]) : 0;
                i8 = this.av[10];
                iArr2 = this.at[10];
                iArr = this.bk;
                if (i8 == 0) {
                    i8 = this.av[11];
                    iArr2 = this.at[11];
                    iArr = this.ba;
                }
                i5 = 0;
                i10 = 0;
                i6 = i8 > 0 ? iArr[0] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                while (i10 < 10) {
                    iArr4 = iArr;
                    while (i10 == 0 && r7 > i3) {
                        i7 = i5 + 1;
                        ak(bpVar, iArr2[i5], 1642142839);
                        if (i8 == i7 && this.at[11] != iArr2) {
                            i8 = this.av[11];
                            iArr2 = this.at[11];
                            iArr4 = this.ba;
                            i7 = 0;
                        }
                        if (i7 < i8) {
                            i6 = iArr4[i7];
                            i5 = i7;
                        } else {
                            i6 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                            i5 = i7;
                        }
                    }
                    iArr = iArr2;
                    while (i10 == 3 && r7 > i2) {
                        i4 = i5 + 1;
                        ak(bpVar, iArr[i5], 1885820710);
                        if (i4 == i8 && iArr != this.at[11]) {
                            i8 = this.av[11];
                            iArr = this.at[11];
                            iArr4 = this.ba;
                            i4 = 0;
                        }
                        if (i4 < i8) {
                            i6 = iArr4[i4];
                            i5 = i4;
                        } else {
                            i6 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                            i5 = i4;
                        }
                    }
                    while (true) {
                        iArr2 = iArr;
                        i9 = i5;
                        if (i10 != 5 || r7 <= i14) {
                            break;
                        }
                        i5 = i9 + 1;
                        ak(bpVar, iArr2[i9], 1730121588);
                        if (i5 != i8 || this.at[11] == iArr2) {
                            iArr = iArr2;
                        } else {
                            i8 = this.av[11];
                            iArr = this.at[11];
                            iArr4 = this.ba;
                            i5 = 0;
                        }
                        i6 = i5 < i8 ? iArr4[i5] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    }
                }
                iArr4 = iArr2;
                while (-1000 != i6) {
                    i4 = i5 + 1;
                    ak(bpVar, iArr4[i5], 1817667213);
                    if (i8 == i4 && this.at[11] != iArr4) {
                        iArr4 = this.at[11];
                        i8 = this.av[11];
                        iArr = this.ba;
                        i4 = 0;
                    }
                    if (i4 < i8) {
                        i6 = iArr[i4];
                        i5 = i4;
                    } else {
                        i6 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i5 = i4;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean an(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (bpVar.bc >= 1600) {
            return false;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.bo.bd;
        int i15 = this.bo.bo;
        int i16 = ae[i];
        int i17 = am[i];
        for (i9 = 0; i9 < bpVar.aj; i9++) {
            i10 = bpVar.ai[i9];
            i11 = bpVar.ae[i9];
            i12 = bpVar.am[i9];
            if (i != 0) {
                i13 = ((i12 * i17) - (i10 * i16)) >> 16;
                i10 = ((i10 * i17) + (i12 * i16)) >> 16;
            } else {
                i13 = i12;
            }
            i10 += i6;
            i12 = i11 + i7;
            i13 += i8;
            i11 = ((i13 * i5) - (i10 * i4)) >> 16;
            int i18 = ((i11 * i3) + (i12 * i2)) >> 16;
            if (i18 >= 50) {
                this.aw[i9] = (((((i10 * i5) + (i13 * i4)) >> 16) * (this.bo.bq * 1516652957)) / i18) + (-1240378447 * i14);
                this.ac[i9] = (((this.bo.bq * 1516652957) * (((i12 * i3) - (i11 * i2)) >> 16)) / i18) + (-1165057787 * i15);
            } else {
                int[] iArr = this.aw;
                this.ac[i9] = -1;
                iArr[i9] = -1;
            }
        }
        i9 = 0;
        while (true) {
            i11 = i9;
            if (i11 >= bpVar.ak) {
                return false;
            }
            if (-2 != bpVar.ax[i11]) {
                i9 = bpVar.as[i11];
                i10 = bpVar.ag[i11];
                i13 = bpVar.ap[i11];
                i12 = this.aw[i9];
                i14 = this.aw[i10];
                i15 = this.aw[i13];
                if (!(-1 == i12 || -1 == i14 || -1 == i15 || !dz.an(this.ac[i9], this.ac[i10], this.ac[i13], i12, i14, i15, 5, 662265114))) {
                    return true;
                }
            }
            i9 = i11 + 1;
        }
    }

    /* Access modifiers changed, original: final */
    public final void ao(int i) {
        this.aj = 639683531 * i;
        this.ai.size();
        aj(-889620875);
    }

    /* Access modifiers changed, original: final */
    public final void ap(int i) {
        this.aj = 639683531 * i;
        this.ai.size();
        aj(-1270023863);
    }

    public final void aq(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            int i10 = 0;
            this.an[0] = -1;
            if (!(2 == bpVar.bf || 1 == bpVar.bf)) {
                bpVar.ae();
            }
            int i11 = this.bo.bd * -1240378447;
            int i12 = this.bo.bo;
            int i13 = ae[i];
            int i14 = am[i];
            int i15 = ae[i2];
            int i16 = am[i2];
            int i17 = ae[i3];
            int i18 = am[i3];
            int i19 = ae[i4];
            int i20 = am[i4];
            while (true) {
                int i21 = i10;
                if (i21 < bpVar.aj) {
                    int i22;
                    int i23;
                    i10 = bpVar.ai[i21];
                    int i24 = bpVar.ae[i21];
                    int i25 = bpVar.am[i21];
                    if (i3 != 0) {
                        i22 = ((i24 * i18) - (i10 * i17)) >> 16;
                        i10 = ((i10 * i18) + (i24 * i17)) >> 16;
                    } else {
                        i22 = i24;
                    }
                    if (i != 0) {
                        i24 = ((i25 * i14) + (i22 * i13)) >> 16;
                        i23 = ((i22 * i14) - (i25 * i13)) >> 16;
                    } else {
                        i23 = i22;
                        i24 = i25;
                    }
                    if (i2 != 0) {
                        i22 = ((i24 * i16) - (i10 * i15)) >> 16;
                        i10 = ((i10 * i16) + (i24 * i15)) >> 16;
                    } else {
                        i22 = i24;
                    }
                    i10 += i5;
                    i24 = i23 + i6;
                    i22 += i7;
                    i23 = ((i24 * i20) - (i22 * i19)) >> 16;
                    i22 = ((i22 * i20) + (i24 * i19)) >> 16;
                    this.aa[i21] = i22 - (((i19 * i6) + (i20 * i7)) >> 16);
                    this.aw[i21] = (((this.bo.bq * 1516652957) * i10) / i8) + i11;
                    this.ac[i21] = (-1165057787 * i12) + (((this.bo.bq * 1516652957) * i23) / i8);
                    if (bpVar.af > 0) {
                        this.ao[i21] = i10;
                        this.ah[i21] = i23;
                        this.af[i21] = i22;
                    }
                    i10 = i21 + 1;
                } else {
                    try {
                        am(bpVar, false, false, 0);
                        return;
                    } catch (Exception e) {
                        return;
                    }
                }
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.aq(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public void ar(br brVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        try {
            if (bl) {
                System.nanoTime();
                bp ab = brVar.ab();
                if (ab != null) {
                    if (1 != ab.bf) {
                        ab.ai();
                    }
                    ab.aj(i);
                    int i9 = (ab.bi * i3) >> 16;
                    int i10 = (ab.bi * i2) >> 16;
                    int i11 = ((i8 * i5) - (i4 * i6)) >> 16;
                    int i12 = ((i2 * i7) + (i3 * i11)) >> 16;
                    int i13 = i9 + i12;
                    if (i13 > 50 && i12 < 3500) {
                        int i14 = ((i6 * i5) + (i4 * i8)) >> 16;
                        int i15 = (i14 - ab.bi) * (this.bo.bq * 1516652957);
                        if (i15 / i13 < this.bo.bi * -47170121) {
                            int i16 = (this.bo.bq * 1516652957) * (ab.bi + i14);
                            if (i16 / i13 > this.bo.bb * 1843169487) {
                                int i17 = ((i3 * i7) - (i11 * i2)) >> 16;
                                int i18 = (i10 + i17) * (this.bo.bq * 1516652957);
                                if (i18 / i13 > this.bo.bc * 1753792739) {
                                    int i19 = (i17 - (i10 + (((ab.bx * -1736982785) * i3) >> 16))) * (this.bo.bq * 1516652957);
                                    if (i19 / i13 < this.bo.bv * 76466725) {
                                        int ao = iu.ao(2044830623);
                                        int ah = hn.ah(-895392211);
                                        boolean ac = cz.ac((byte) 62);
                                        if (ai.ar(j) && ac) {
                                            boolean ay;
                                            if (bu.ad) {
                                                ay = kh.ay(ab, i6, i7, i8, this, 2064092904);
                                            } else {
                                                int i20;
                                                i9 = i12 - i9;
                                                int i21 = i9 <= 50 ? 50 : i9;
                                                if (i14 > 0) {
                                                    i10 = i16 / i21;
                                                    i11 = i15 / i13;
                                                } else {
                                                    i10 = i16 / i13;
                                                    i11 = i15 / i21;
                                                }
                                                if (i17 > 0) {
                                                    i9 = i19 / i13;
                                                    i20 = i18 / i21;
                                                } else {
                                                    i20 = i18 / i13;
                                                    i9 = i19 / i21;
                                                }
                                                i21 = ao - (this.bo.bd * -1240378447);
                                                i13 = ah - (this.bo.bo * -1165057787);
                                                ay = i21 > i11 && i21 < i10 && i13 > i9 && i13 < i20;
                                            }
                                            if (ay && (ab.bs || ai(ab, i, i2, i3, i4, i5, i6, i7, i8, (byte) 6))) {
                                                aw.aw(j);
                                            }
                                        }
                                        i16 = ae[i];
                                        i17 = am[i];
                                        if (ab.bc < 1600) {
                                            if (ab.bd) {
                                                as(ab, -1537912330);
                                            }
                                            ad.bc(ab.bq, j, ab.bc, ab.bv, i2, i3, i4, i5, i16, i17, i6, i7, i8, i12, false, -697886621);
                                            if (!ab.bl) {
                                                if (ab.bo == -1) {
                                                    this.ai.add(ab);
                                                }
                                                ab.bo = this.aj * 728662499;
                                            }
                                            System.nanoTime();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(bp bpVar, int i) {
        try {
            ad.bf(bpVar.bq, bpVar.bd, bpVar.bl, bpVar.aj, bpVar.ak, bpVar.af, bpVar.ai, bpVar.ae, bpVar.am, bpVar.as, bpVar.ag, bpVar.ap, bpVar.au, bpVar.az, bpVar.ax, bpVar.ay, bpVar.an, bpVar.ab, bpVar.ac, bpVar.ao, bpVar.aa, bpVar.aw, bpVar.bk, bpVar.ba, -1435577817);
            bpVar.bd = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bt.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean at(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (bpVar.bc >= -420659627) {
            return false;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.bo.bd;
        int i15 = this.bo.bo;
        int i16 = ae[i];
        int i17 = am[i];
        for (i9 = 0; i9 < bpVar.aj; i9++) {
            i10 = bpVar.ai[i9];
            i11 = bpVar.ae[i9];
            i12 = bpVar.am[i9];
            if (i != 0) {
                i13 = ((i12 * i17) - (i10 * i16)) >> 16;
                i10 = ((i10 * i17) + (i12 * i16)) >> 16;
            } else {
                i13 = i12;
            }
            i10 += i6;
            i12 = i11 + i7;
            i13 += i8;
            i11 = ((i13 * i5) - (i10 * i4)) >> 16;
            int i18 = ((i11 * i3) + (i12 * i2)) >> 16;
            if (i18 >= 50) {
                this.aw[i9] = (((((i10 * i5) + (i13 * i4)) >> 16) * (this.bo.bq * 1516652957)) / i18) + (-1240378447 * i14);
                this.ac[i9] = (((this.bo.bq * 1516652957) * (((i12 * i3) - (i11 * i2)) >> 16)) / i18) + (1378455081 * i15);
            } else {
                int[] iArr = this.aw;
                this.ac[i9] = -1;
                iArr[i9] = -1;
            }
        }
        i9 = 0;
        while (true) {
            i11 = i9;
            if (i11 >= bpVar.ak) {
                return false;
            }
            if (-1049367498 != bpVar.ax[i11]) {
                i9 = bpVar.as[i11];
                i10 = bpVar.ag[i11];
                i13 = bpVar.ap[i11];
                i12 = this.aw[i9];
                i14 = this.aw[i10];
                i15 = this.aw[i13];
                if (!(-1 == i12 || -1 == i14 || -1 == i15 || !dz.an(this.ac[i9], this.ac[i10], this.ac[i13], i12, i14, i15, 5, -1086113240))) {
                    return true;
                }
            }
            i9 = i11 + 1;
        }
    }

    public final void au(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.an[0] = -1;
        if (!(2 == bpVar.bf || 1 == bpVar.bf)) {
            bpVar.ae();
        }
        int i9 = this.bo.bd * -142280058;
        int i10 = this.bo.bo;
        int i11 = ae[i];
        int i12 = am[i];
        int i13 = ae[i2];
        int i14 = am[i2];
        int i15 = ae[i3];
        int i16 = am[i3];
        int i17 = ae[i4];
        int i18 = am[i4];
        for (int i19 = 0; i19 < bpVar.aj; i19++) {
            int i20;
            int i21;
            int i22 = bpVar.ai[i19];
            int i23 = bpVar.ae[i19];
            int i24 = bpVar.am[i19];
            if (i3 != 0) {
                i20 = ((i23 * i16) - (i22 * i15)) >> 16;
                i22 = ((i22 * i16) + (i23 * i15)) >> 16;
            } else {
                i20 = i23;
            }
            if (i != 0) {
                i23 = ((i24 * i12) + (i20 * i11)) >> 16;
                i21 = ((i20 * i12) - (i24 * i11)) >> 16;
            } else {
                i21 = i20;
                i23 = i24;
            }
            if (i2 != 0) {
                i20 = ((i23 * i14) - (i22 * i13)) >> 16;
                i22 = ((i22 * i14) + (i23 * i13)) >> 16;
            } else {
                i20 = i23;
            }
            i22 += i5;
            i23 = i21 + i6;
            i20 += i7;
            i21 = ((i23 * i18) - (i20 * i17)) >> 16;
            i20 = ((i20 * i18) + (i23 * i17)) >> 16;
            this.aa[i19] = i20 - (((i17 * i6) + (i18 * i7)) >> 16);
            this.aw[i19] = (((this.bo.bq * 1516652957) * i22) / i8) + i9;
            this.ac[i19] = (-1165057787 * i10) + (((this.bo.bq * 1516652957) * i21) / i8);
            if (bpVar.af > 0) {
                this.ao[i19] = i22;
                this.ah[i19] = i21;
                this.af[i19] = i20;
            }
        }
        try {
            am(bpVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean av(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (bpVar.bc >= 1600) {
            return false;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.bo.bd;
        int i15 = this.bo.bo;
        int i16 = ae[i];
        int i17 = am[i];
        for (i9 = 0; i9 < bpVar.aj; i9++) {
            i10 = bpVar.ai[i9];
            i11 = bpVar.ae[i9];
            i12 = bpVar.am[i9];
            if (i != 0) {
                i13 = ((i12 * i17) - (i10 * i16)) >> 16;
                i10 = ((i10 * i17) + (i12 * i16)) >> 16;
            } else {
                i13 = i12;
            }
            i10 += i6;
            i12 = i11 + i7;
            i13 += i8;
            i11 = ((i13 * i5) - (i10 * i4)) >> 16;
            int i18 = ((i11 * i3) + (i12 * i2)) >> 16;
            if (i18 >= 50) {
                this.aw[i9] = (((((i10 * i5) + (i13 * i4)) >> 16) * (this.bo.bq * 1516652957)) / i18) + (-1240378447 * i14);
                this.ac[i9] = (((this.bo.bq * 1516652957) * (((i12 * i3) - (i11 * i2)) >> 16)) / i18) + (-1165057787 * i15);
            } else {
                int[] iArr = this.aw;
                this.ac[i9] = -1;
                iArr[i9] = -1;
            }
        }
        i9 = 0;
        while (true) {
            i11 = i9;
            if (i11 >= bpVar.ak) {
                return false;
            }
            if (-2 != bpVar.ax[i11]) {
                i9 = bpVar.as[i11];
                i10 = bpVar.ag[i11];
                i13 = bpVar.ap[i11];
                i12 = this.aw[i9];
                i14 = this.aw[i10];
                i15 = this.aw[i13];
                if (!(-1 == i12 || -1 == i14 || -1 == i15 || !dz.an(this.ac[i9], this.ac[i10], this.ac[i13], i12, i14, i15, 5, 847165066))) {
                    return true;
                }
            }
            i9 = i11 + 1;
        }
    }

    public void aw(br brVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        if (bl) {
            System.nanoTime();
            bp ab = brVar.ab();
            if (ab != null) {
                if (1 != ab.bf) {
                    ab.ai();
                }
                ab.aj(i);
                int i9 = (ab.bi * i3) >> 16;
                int i10 = (ab.bi * i2) >> 16;
                int i11 = ((i8 * i5) - (i4 * i6)) >> 16;
                int i12 = ((i2 * i7) + (i3 * i11)) >> 16;
                int i13 = i9 + i12;
                if (i13 > -2086455052 && i12 < -781334443) {
                    int i14 = ((i6 * i5) + (i4 * i8)) >> 16;
                    int i15 = (i14 - ab.bi) * (this.bo.bq * 1516652957);
                    int i16 = i15 / i13;
                    if (i16 < this.bo.bi * -47170121) {
                        int i17 = (ab.bi + i14) * (this.bo.bq * 1516652957);
                        int i18 = i17 / i13;
                        if (i18 > this.bo.bb * 1843169487) {
                            int i19 = ((i3 * i7) - (i11 * i2)) >> 16;
                            int i20 = (this.bo.bq * 1516652957) * (i10 + i19);
                            i11 = i20 / i13;
                            if (i11 > this.bo.bc * 1078819128) {
                                int i21 = (this.bo.bq * 1516652957) * (i19 - (i10 + (((ab.bx * -857264079) * i3) >> 16)));
                                i10 = i21 / i13;
                                if (i10 < this.bo.bv * 76466725) {
                                    i13 = iu.ao(2044830623);
                                    int ah = hn.ah(1643998073);
                                    boolean ac = cz.ac((byte) -73);
                                    if (ai.ar(j) && ac) {
                                        boolean ay;
                                        if (bu.ad) {
                                            ay = kh.ay(ab, i6, i7, i8, this, 2019167578);
                                        } else {
                                            i9 = i12 - i9;
                                            if (i9 <= 50) {
                                                i9 = -371852065;
                                            }
                                            if (i14 > 0) {
                                                i18 = i17 / i9;
                                            } else {
                                                i16 = i15 / i9;
                                            }
                                            if (i19 > 0) {
                                                i11 = i20 / i9;
                                            } else {
                                                i10 = i21 / i9;
                                            }
                                            i9 = i13 - (this.bo.bd * 1885854375);
                                            i13 = ah - (this.bo.bo * 1064432834);
                                            ay = i9 > i16 && i9 < i18 && i13 > i10 && i13 < i11;
                                        }
                                        if (ay && (ab.bs || ai(ab, i, i2, i3, i4, i5, i6, i7, i8, (byte) -83))) {
                                            aw.aw(j);
                                        }
                                    }
                                    i19 = ae[i];
                                    i20 = am[i];
                                    if (ab.bc < -64211692) {
                                        if (ab.bd) {
                                            as(ab, -1537912330);
                                        }
                                        ad.bc(ab.bq, j, ab.bc, ab.bv, i2, i3, i4, i5, i19, i20, i6, i7, i8, i12, false, -454954259);
                                        if (!ab.bl) {
                                            if (ab.bo == -1) {
                                                this.ai.add(ab);
                                            }
                                            ab.bo = this.aj * 1759373937;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void ax(br brVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        if (bl) {
            System.nanoTime();
            bp ab = brVar.ab();
            if (ab != null) {
                if (1 != ab.bf) {
                    ab.ai();
                }
                ab.aj(i);
                int i9 = (ab.bi * i3) >> 16;
                int i10 = (ab.bi * i2) >> 16;
                int i11 = ((i8 * i5) - (i4 * i6)) >> 16;
                int i12 = ((i2 * i7) + (i3 * i11)) >> 16;
                int i13 = i9 + i12;
                if (i13 > 1221249018 && i12 < 3500) {
                    int i14 = ((i6 * i5) + (i4 * i8)) >> 16;
                    int i15 = (i14 - ab.bi) * (this.bo.bq * 590392041);
                    int i16 = i15 / i13;
                    if (i16 < this.bo.bi * -47170121) {
                        int i17 = (ab.bi + i14) * (this.bo.bq * 1516652957);
                        int i18 = i17 / i13;
                        if (i18 > this.bo.bb * 303580301) {
                            int i19 = ((i3 * i7) - (i11 * i2)) >> 16;
                            int i20 = (this.bo.bq * -157448914) * (i10 + i19);
                            i11 = i20 / i13;
                            if (i11 > this.bo.bc * 1753792739) {
                                int i21 = (this.bo.bq * -1799753349) * (i19 - (i10 + (((ab.bx * -1786721272) * i3) >> 16)));
                                i10 = i21 / i13;
                                if (i10 < this.bo.bv * -1099071186) {
                                    i13 = iu.ao(2044830623);
                                    int ah = hn.ah(320974106);
                                    boolean ac = cz.ac((byte) -14);
                                    if (ai.ar(j) && ac) {
                                        boolean ay;
                                        if (bu.ad) {
                                            ay = kh.ay(ab, i6, i7, i8, this, 2146894558);
                                        } else {
                                            i9 = i12 - i9;
                                            if (i9 <= 2026956069) {
                                                i9 = 50;
                                            }
                                            if (i14 > 0) {
                                                i18 = i17 / i9;
                                            } else {
                                                i16 = i15 / i9;
                                            }
                                            if (i19 > 0) {
                                                i11 = i20 / i9;
                                            } else {
                                                i10 = i21 / i9;
                                            }
                                            i9 = i13 - (this.bo.bd * -1240378447);
                                            i13 = ah - (this.bo.bo * 1069987534);
                                            ay = i9 > i16 && i9 < i18 && i13 > i10 && i13 < i11;
                                        }
                                        if (ay && (ab.bs || ai(ab, i, i2, i3, i4, i5, i6, i7, i8, (byte) -11))) {
                                            aw.aw(j);
                                        }
                                    }
                                    i19 = ae[i];
                                    i20 = am[i];
                                    if (ab.bc < 1600) {
                                        if (ab.bd) {
                                            as(ab, -1537912330);
                                        }
                                        ad.bc(ab.bq, j, ab.bc, ab.bv, i2, i3, i4, i5, i19, i20, i6, i7, i8, i12, false, -357757062);
                                        if (!ab.bl) {
                                            if (ab.bo == -1) {
                                                this.ai.add(ab);
                                            }
                                            ab.bo = this.aj * 728662499;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ay() {
        int i = this.aj;
        Iterator it = this.ai.iterator();
        while (it.hasNext()) {
            bp bpVar = (bp) it.next();
            if ((728662499 * i) - 100 >= bpVar.bo) {
                ag(bpVar, -2057567296);
                bpVar.bo = -1;
                bpVar.bd = true;
                it.remove();
            }
        }
    }

    public final void az(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.an[0] = -1;
        if (!(2 == bpVar.bf || 1 == bpVar.bf)) {
            bpVar.ae();
        }
        int i9 = this.bo.bd * -2134068742;
        int i10 = this.bo.bo;
        int i11 = ae[i];
        int i12 = am[i];
        int i13 = ae[i2];
        int i14 = am[i2];
        int i15 = ae[i3];
        int i16 = am[i3];
        int i17 = ae[i4];
        int i18 = am[i4];
        for (int i19 = 0; i19 < bpVar.aj; i19++) {
            int i20;
            int i21;
            int i22 = bpVar.ai[i19];
            int i23 = bpVar.ae[i19];
            int i24 = bpVar.am[i19];
            if (i3 != 0) {
                i20 = ((i23 * i16) - (i22 * i15)) >> 16;
                i22 = ((i22 * i16) + (i23 * i15)) >> 16;
            } else {
                i20 = i23;
            }
            if (i != 0) {
                i23 = ((i24 * i12) + (i20 * i11)) >> 16;
                i21 = ((i20 * i12) - (i24 * i11)) >> 16;
            } else {
                i21 = i20;
                i23 = i24;
            }
            if (i2 != 0) {
                i20 = ((i23 * i14) - (i22 * i13)) >> 16;
                i22 = ((i22 * i14) + (i23 * i13)) >> 16;
            } else {
                i20 = i23;
            }
            i22 += i5;
            i23 = i21 + i6;
            i20 += i7;
            i21 = ((i23 * i18) - (i20 * i17)) >> 16;
            i20 = ((i20 * i18) + (i23 * i17)) >> 16;
            this.aa[i19] = i20 - (((i17 * i6) + (i18 * i7)) >> 16);
            this.aw[i19] = (((this.bo.bq * 1936828318) * i22) / i8) + i9;
            this.ac[i19] = (-1165057787 * i10) + (((this.bo.bq * 1516652957) * i21) / i8);
            if (bpVar.af > 0) {
                this.ao[i19] = i22;
                this.ah[i19] = i21;
                this.af[i19] = i20;
            }
        }
        try {
            am(bpVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: final */
    public final void ba(bp bpVar, boolean z, boolean z2, long j) {
        if (bpVar.bc < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < bpVar.bc; i++) {
                this.an[i] = 0;
            }
            i = 0;
            while (true) {
                i2 = i;
                if (i2 >= bpVar.ak) {
                    break;
                }
                if (-2 != bpVar.ax[i2]) {
                    i3 = bpVar.as[i2];
                    i4 = bpVar.ag[i2];
                    i5 = bpVar.ap[i2];
                    i6 = this.aw[i3];
                    i7 = this.aw[i4];
                    int i12 = this.aw[i5];
                    int[] iArr2;
                    if (z && (i6 == -5000 || -5000 == i7 || -5000 == i12)) {
                        i = this.ao[i3];
                        i8 = this.ao[i4];
                        i9 = this.ao[i5];
                        i6 = this.ah[i3];
                        i7 = this.ah[i4];
                        i12 = this.ah[i5];
                        i10 = this.af[i3];
                        i11 = this.af[i4];
                        i -= i8;
                        i9 -= i8;
                        i6 -= i7;
                        i12 -= i7;
                        i10 -= i11;
                        int i13 = this.af[i5] - i11;
                        if ((((i * i12) - (i9 * i6)) * i11) + ((i8 * ((i13 * i6) - (i10 * i12))) + (i7 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.ax[i2] = true;
                            i = bpVar.bv + ((this.aa[i5] + (this.aa[i3] + this.aa[i4])) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    } else {
                        if (z2 && dz.an(this.ac[i3], this.ac[i4], this.ac[i5], i6, i7, i12, 0, -2073056317)) {
                            aw.aw(j);
                            z2 = false;
                        }
                        if (((this.ac[i5] - this.ac[i4]) * (i6 - i7)) - ((i12 - i7) * (this.ac[i3] - this.ac[i4])) > 0) {
                            this.ax[i2] = false;
                            if (i6 < 0 || i7 < 0 || i12 < 0 || i6 > this.bo.bl * 1505645037 || i7 > this.bo.bl * 1505645037 || i12 > this.bo.bl * 1505645037) {
                                this.az[i2] = true;
                            } else {
                                this.az[i2] = false;
                            }
                            i = bpVar.bv + (((this.aa[i4] + this.aa[i3]) + this.aa[i5]) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    }
                }
                i = i2 + 1;
            }
            int[] iArr3;
            if (bpVar.aw == null) {
                for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                    i9 = this.an[i8];
                    if (i9 > 0) {
                        iArr3 = this.ab[i8];
                        for (i = 0; i < i9; i++) {
                            ak(bpVar, iArr3[i], 1492896635);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            for (i = 0; i < 12; i++) {
                this.av[i] = 0;
                this.bs[i] = 0;
            }
            for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                i9 = this.an[i8];
                if (i9 > 0) {
                    iArr3 = this.ab[i8];
                    for (i = 0; i < i9; i++) {
                        i7 = iArr3[i];
                        byte b = bpVar.aw[i7];
                        int[] iArr5 = this.av;
                        i11 = iArr5[b];
                        iArr5[b] = i11 + 1;
                        this.at[b][i11] = i7;
                        if (b < (byte) 10) {
                            iArr4 = this.bs;
                            iArr4[b] = iArr4[b] + i8;
                        } else if (b == (byte) 10) {
                            this.bk[i11] = i8;
                        } else {
                            this.ba[i11] = i8;
                        }
                    }
                }
            }
            i = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[2] + this.bs[1]) / (this.av[2] + this.av[1]) : 0;
            i8 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[4] + this.av[3]) : 0;
            i9 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[8] + this.bs[6]) / (this.av[8] + this.av[6]) : 0;
            i10 = this.av[10];
            int[] iArr6 = this.at[10];
            iArr4 = this.bk;
            if (i10 == 0) {
                i10 = this.av[11];
                iArr6 = this.at[11];
                iArr4 = this.ba;
            }
            i6 = i10 > 0 ? iArr4[0] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            i11 = 0;
            i5 = 0;
            while (i5 < 10) {
                int[] iArr7;
                i2 = i11;
                i3 = i10;
                i4 = i6;
                while (i5 == 0 && r12 > i) {
                    i6 = i2 + 1;
                    ak(bpVar, iArr6[i2], 2016091762);
                    if (i3 == i6 && this.at[11] != iArr6) {
                        i3 = this.av[11];
                        iArr6 = this.at[11];
                        iArr4 = this.ba;
                        i6 = 0;
                    }
                    if (i6 < i3) {
                        i4 = iArr4[i6];
                        i2 = i6;
                    } else {
                        i4 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i2 = i6;
                    }
                }
                iArr3 = iArr4;
                i10 = i2;
                i11 = i3;
                while (i5 == 3 && r12 > i8) {
                    i7 = i10 + 1;
                    ak(bpVar, iArr6[i10], 1915459788);
                    if (i7 == i11 && iArr6 != this.at[11]) {
                        i11 = this.av[11];
                        iArr6 = this.at[11];
                        iArr3 = this.ba;
                        i7 = 0;
                    }
                    if (i7 < i11) {
                        i4 = iArr3[i7];
                        i10 = i7;
                    } else {
                        i4 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i10 = i7;
                    }
                }
                while (true) {
                    iArr4 = iArr3;
                    i3 = i10;
                    i2 = i11;
                    if (i5 != 5 || i4 <= i9) {
                        i10 = this.av[i5];
                        iArr7 = this.at[i5];
                    } else {
                        i10 = i3 + 1;
                        ak(bpVar, iArr6[i3], 2025088539);
                        if (i10 != i2 || this.at[11] == iArr6) {
                            iArr3 = iArr4;
                            i11 = i2;
                        } else {
                            i11 = this.av[11];
                            iArr4 = this.at[11];
                            iArr3 = this.ba;
                            i10 = 0;
                            iArr6 = iArr4;
                        }
                        i4 = i10 < i11 ? iArr3[i10] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    }
                }
                i10 = this.av[i5];
                iArr7 = this.at[i5];
                for (i6 = 0; i6 < i10; i6++) {
                    ak(bpVar, iArr7[i6], 1992701282);
                }
                i5++;
                i10 = i2;
                i11 = i3;
                i6 = i4;
            }
            int[] iArr8 = iArr4;
            iArr = iArr6;
            i9 = i10;
            i2 = i6;
            while (-1000 != i2) {
                i6 = i11 + 1;
                ak(bpVar, iArr[i11], 2147113671);
                if (i9 == i6 && this.at[11] != iArr) {
                    iArr = this.at[11];
                    i9 = this.av[11];
                    iArr8 = this.ba;
                    i6 = 0;
                }
                if (i6 < i9) {
                    i11 = i6;
                    i2 = iArr8[i6];
                } else {
                    i11 = i6;
                    i2 = -1000;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bb(bp bpVar) {
        ad.bf(bpVar.bq, bpVar.bd, bpVar.bl, bpVar.aj, bpVar.ak, bpVar.af, bpVar.ai, bpVar.ae, bpVar.am, bpVar.as, bpVar.ag, bpVar.ap, bpVar.au, bpVar.az, bpVar.ax, bpVar.ay, bpVar.an, bpVar.ab, bpVar.ac, bpVar.ao, bpVar.aa, bpVar.aw, bpVar.bk, bpVar.ba, 1591041938);
        bpVar.bd = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void bc(bp bpVar) {
        ad.bb(bpVar.bq, 1989916812);
    }

    /* Access modifiers changed, original: final */
    public final void bd(bp bpVar, int i) {
        int i2 = bpVar.as[i];
        int i3 = bpVar.ag[i];
        int i4 = bpVar.ap[i];
        this.bo.at = this.az[i];
        if (bpVar.ac == null) {
            this.bo.bm = 0;
        } else {
            this.bo.bm = (bpVar.ac[i] & 255) * 767944399;
        }
        if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (bpVar.aa == null || bpVar.aa[i] == (byte) -1) {
                i5 = i3;
                i6 = i2;
                i7 = i4;
            } else {
                i7 = bpVar.aa[i] & 255;
                i6 = bpVar.ay[i7];
                i5 = bpVar.an[i7];
                i7 = bpVar.ab[i7];
            }
            float f = (float) this.ad[i6];
            float f2 = (float) this.aq[i6];
            float f3 = (float) this.ar[i6];
            float f4 = ((float) this.ad[i5]) - f;
            float f5 = ((float) this.aq[i5]) - f2;
            float f6 = ((float) this.ar[i5]) - f3;
            float f7 = ((float) this.ad[i7]) - f;
            float f8 = ((float) this.aq[i7]) - f2;
            float f9 = ((float) this.ar[i7]) - f3;
            float f10 = ((float) this.ad[i2]) - f;
            float f11 = ((float) this.aq[i2]) - f2;
            float f12 = ((float) this.ar[i2]) - f3;
            float f13 = ((float) this.ad[i3]) - f;
            float f14 = ((float) this.aq[i3]) - f2;
            float f15 = ((float) this.ar[i3]) - f3;
            f = ((float) this.ad[i4]) - f;
            f2 = ((float) this.aq[i4]) - f2;
            f3 = ((float) this.ar[i4]) - f3;
            float f16 = (f5 * f9) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f8 * f4) - (f7 * f5);
            float f19 = (f18 * f8) - (f17 * f9);
            float f20 = (f16 * f9) - (f18 * f7);
            float f21 = (f7 * f17) - (f8 * f16);
            float f22 = 1.0f / ((f6 * f21) + ((f4 * f19) + (f5 * f20)));
            float f23 = ((f12 * f21) + ((f11 * f20) + (f19 * f10))) * f22;
            float f24 = ((f15 * f21) + ((f20 * f14) + (f19 * f13))) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f18 * f5) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = f9 * ((f12 * f4) + ((f11 * f6) + (f10 * f20)));
            f12 = f9 * ((f15 * f4) + ((f20 * f13) + (f14 * f6)));
            f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
            f6 = f24 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            f6 = f23 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f23 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f24 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            if (bpVar.ax[i] == -1) {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.au[i], bpVar.au[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -1973438468);
            } else {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -1330754899);
            }
        } else if (-1 == bpVar.ax[i]) {
            ((at) this.bo).ai(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], ak[bpVar.au[i]], 1971727673);
        } else {
            ((at) this.bo).aj(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], Byte.MAX_VALUE);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bf(bp bpVar) {
        ad.bf(bpVar.bq, bpVar.bd, bpVar.bl, bpVar.aj, bpVar.ak, bpVar.af, bpVar.ai, bpVar.ae, bpVar.am, bpVar.as, bpVar.ag, bpVar.ap, bpVar.au, bpVar.az, bpVar.ax, bpVar.ay, bpVar.an, bpVar.ab, bpVar.ac, bpVar.ao, bpVar.aa, bpVar.aw, bpVar.bk, bpVar.ba, 1044880544);
        bpVar.bd = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void bg(bp bpVar) {
        ad.bb(bpVar.bq, 1989916812);
    }

    /* Access modifiers changed, original: 0000 */
    public void bi(bp bpVar) {
        ad.bb(bpVar.bq, 1989916812);
    }

    /* Access modifiers changed, original: final */
    public final void bk(bp bpVar, boolean z, boolean z2, long j) {
        if (bpVar.bc < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < bpVar.bc; i++) {
                this.an[i] = 0;
            }
            i = 0;
            while (true) {
                i2 = i;
                if (i2 >= bpVar.ak) {
                    break;
                }
                if (-2 != bpVar.ax[i2]) {
                    i3 = bpVar.as[i2];
                    i4 = bpVar.ag[i2];
                    i5 = bpVar.ap[i2];
                    i6 = this.aw[i3];
                    i7 = this.aw[i4];
                    int i12 = this.aw[i5];
                    int[] iArr2;
                    if (z && (i6 == -5000 || -5000 == i7 || -5000 == i12)) {
                        i = this.ao[i3];
                        i8 = this.ao[i4];
                        i9 = this.ao[i5];
                        i6 = this.ah[i3];
                        i7 = this.ah[i4];
                        i12 = this.ah[i5];
                        i10 = this.af[i3];
                        i11 = this.af[i4];
                        i -= i8;
                        i9 -= i8;
                        i6 -= i7;
                        i12 -= i7;
                        i10 -= i11;
                        int i13 = this.af[i5] - i11;
                        if ((((i * i12) - (i9 * i6)) * i11) + ((i8 * ((i13 * i6) - (i10 * i12))) + (i7 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.ax[i2] = true;
                            i = bpVar.bv + ((this.aa[i5] + (this.aa[i3] + this.aa[i4])) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    } else {
                        if (z2 && dz.an(this.ac[i3], this.ac[i4], this.ac[i5], i6, i7, i12, 0, -1188783084)) {
                            aw.aw(j);
                            z2 = false;
                        }
                        if (((this.ac[i5] - this.ac[i4]) * (i6 - i7)) - ((i12 - i7) * (this.ac[i3] - this.ac[i4])) > 0) {
                            this.ax[i2] = false;
                            if (i6 < 0 || i7 < 0 || i12 < 0 || i6 > this.bo.bl * 1505645037 || i7 > this.bo.bl * 1505645037 || i12 > this.bo.bl * 1505645037) {
                                this.az[i2] = true;
                            } else {
                                this.az[i2] = false;
                            }
                            i = bpVar.bv + (((this.aa[i4] + this.aa[i3]) + this.aa[i5]) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    }
                }
                i = i2 + 1;
            }
            int[] iArr3;
            if (bpVar.aw == null) {
                for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                    i9 = this.an[i8];
                    if (i9 > 0) {
                        iArr3 = this.ab[i8];
                        for (i = 0; i < i9; i++) {
                            ak(bpVar, iArr3[i], 1964053254);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            for (i = 0; i < 12; i++) {
                this.av[i] = 0;
                this.bs[i] = 0;
            }
            for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                i9 = this.an[i8];
                if (i9 > 0) {
                    iArr3 = this.ab[i8];
                    for (i = 0; i < i9; i++) {
                        i7 = iArr3[i];
                        byte b = bpVar.aw[i7];
                        int[] iArr5 = this.av;
                        i11 = iArr5[b];
                        iArr5[b] = i11 + 1;
                        this.at[b][i11] = i7;
                        if (b < (byte) 10) {
                            iArr4 = this.bs;
                            iArr4[b] = iArr4[b] + i8;
                        } else if (b == (byte) 10) {
                            this.bk[i11] = i8;
                        } else {
                            this.ba[i11] = i8;
                        }
                    }
                }
            }
            i = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[2] + this.bs[1]) / (this.av[2] + this.av[1]) : 0;
            i8 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[4] + this.av[3]) : 0;
            i9 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[8] + this.bs[6]) / (this.av[8] + this.av[6]) : 0;
            i10 = this.av[10];
            int[] iArr6 = this.at[10];
            iArr4 = this.bk;
            if (i10 == 0) {
                i10 = this.av[11];
                iArr6 = this.at[11];
                iArr4 = this.ba;
            }
            i6 = i10 > 0 ? iArr4[0] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            i11 = 0;
            i5 = 0;
            while (i5 < 10) {
                int[] iArr7;
                i2 = i11;
                i3 = i10;
                i4 = i6;
                while (i5 == 0 && r12 > i) {
                    i6 = i2 + 1;
                    ak(bpVar, iArr6[i2], 1886018338);
                    if (i3 == i6 && this.at[11] != iArr6) {
                        i3 = this.av[11];
                        iArr6 = this.at[11];
                        iArr4 = this.ba;
                        i6 = 0;
                    }
                    if (i6 < i3) {
                        i4 = iArr4[i6];
                        i2 = i6;
                    } else {
                        i4 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i2 = i6;
                    }
                }
                iArr3 = iArr4;
                i10 = i2;
                i11 = i3;
                while (i5 == 3 && r12 > i8) {
                    i7 = i10 + 1;
                    ak(bpVar, iArr6[i10], 1593493841);
                    if (i7 == i11 && iArr6 != this.at[11]) {
                        i11 = this.av[11];
                        iArr6 = this.at[11];
                        iArr3 = this.ba;
                        i7 = 0;
                    }
                    if (i7 < i11) {
                        i4 = iArr3[i7];
                        i10 = i7;
                    } else {
                        i4 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i10 = i7;
                    }
                }
                while (true) {
                    iArr4 = iArr3;
                    i3 = i10;
                    i2 = i11;
                    if (i5 != 5 || i4 <= i9) {
                        i10 = this.av[i5];
                        iArr7 = this.at[i5];
                    } else {
                        i10 = i3 + 1;
                        ak(bpVar, iArr6[i3], 1672192952);
                        if (i10 != i2 || this.at[11] == iArr6) {
                            iArr3 = iArr4;
                            i11 = i2;
                        } else {
                            i11 = this.av[11];
                            iArr4 = this.at[11];
                            iArr3 = this.ba;
                            i10 = 0;
                            iArr6 = iArr4;
                        }
                        i4 = i10 < i11 ? iArr3[i10] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    }
                }
                i10 = this.av[i5];
                iArr7 = this.at[i5];
                for (i6 = 0; i6 < i10; i6++) {
                    ak(bpVar, iArr7[i6], 2003446787);
                }
                i5++;
                i10 = i2;
                i11 = i3;
                i6 = i4;
            }
            int[] iArr8 = iArr4;
            iArr = iArr6;
            i9 = i10;
            i2 = i6;
            while (-1000 != i2) {
                i6 = i11 + 1;
                ak(bpVar, iArr[i11], 1850663855);
                if (i9 == i6 && this.at[11] != iArr) {
                    iArr = this.at[11];
                    i9 = this.av[11];
                    iArr8 = this.ba;
                    i6 = 0;
                }
                if (i6 < i9) {
                    i11 = i6;
                    i2 = iArr8[i6];
                } else {
                    i11 = i6;
                    i2 = -1000;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(bp bpVar) {
        ad.bf(bpVar.bq, bpVar.bd, bpVar.bl, bpVar.aj, bpVar.ak, bpVar.af, bpVar.ai, bpVar.ae, bpVar.am, bpVar.as, bpVar.ag, bpVar.ap, bpVar.au, bpVar.az, bpVar.ax, bpVar.ay, bpVar.an, bpVar.ab, bpVar.ac, bpVar.ao, bpVar.aa, bpVar.aw, bpVar.bk, bpVar.ba, -1867398937);
        bpVar.bd = false;
    }

    /* Access modifiers changed, original: final */
    public final void bm(bp bpVar, int i) {
        int i2 = bpVar.as[i];
        int i3 = bpVar.ag[i];
        int i4 = bpVar.ap[i];
        this.bo.at = this.az[i];
        if (bpVar.ac == null) {
            this.bo.bm = 0;
        } else {
            this.bo.bm = (bpVar.ac[i] & 294926929) * 767944399;
        }
        if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (bpVar.aa == null || bpVar.aa[i] == (byte) -1) {
                i5 = i3;
                i6 = i2;
                i7 = i4;
            } else {
                i7 = bpVar.aa[i] & -594804994;
                i6 = bpVar.ay[i7];
                i5 = bpVar.an[i7];
                i7 = bpVar.ab[i7];
            }
            float f = (float) this.ad[i6];
            float f2 = (float) this.aq[i6];
            float f3 = (float) this.ar[i6];
            float f4 = ((float) this.ad[i5]) - f;
            float f5 = ((float) this.aq[i5]) - f2;
            float f6 = ((float) this.ar[i5]) - f3;
            float f7 = ((float) this.ad[i7]) - f;
            float f8 = ((float) this.aq[i7]) - f2;
            float f9 = ((float) this.ar[i7]) - f3;
            float f10 = ((float) this.ad[i2]) - f;
            float f11 = ((float) this.aq[i2]) - f2;
            float f12 = ((float) this.ar[i2]) - f3;
            float f13 = ((float) this.ad[i3]) - f;
            float f14 = ((float) this.aq[i3]) - f2;
            float f15 = ((float) this.ar[i3]) - f3;
            f = ((float) this.ad[i4]) - f;
            f2 = ((float) this.aq[i4]) - f2;
            f3 = ((float) this.ar[i4]) - f3;
            float f16 = (f5 * f9) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f8 * f4) - (f7 * f5);
            float f19 = (f18 * f8) - (f17 * f9);
            float f20 = (f16 * f9) - (f18 * f7);
            float f21 = (f7 * f17) - (f8 * f16);
            float f22 = 1.0f / ((f6 * f21) + ((f4 * f19) + (f5 * f20)));
            float f23 = ((f12 * f21) + ((f11 * f20) + (f19 * f10))) * f22;
            float f24 = ((f15 * f21) + ((f20 * f14) + (f19 * f13))) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f18 * f5) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = f9 * ((f12 * f4) + ((f11 * f6) + (f10 * f20)));
            f12 = f9 * ((f15 * f4) + ((f20 * f13) + (f14 * f6)));
            f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
            f6 = f24 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            f6 = f23 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f23 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f24 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            if (bpVar.ax[i] == -1) {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.au[i], bpVar.au[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -80363440);
            } else {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -2055728267);
            }
        } else if (-1 == bpVar.ax[i]) {
            ((at) this.bo).ai(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], ak[bpVar.au[i]], 202432828);
        } else {
            ((at) this.bo).aj(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], (byte) 9);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(bp bpVar) {
        ad.bf(bpVar.bq, bpVar.bd, bpVar.bl, bpVar.aj, bpVar.ak, bpVar.af, bpVar.ai, bpVar.ae, bpVar.am, bpVar.as, bpVar.ag, bpVar.ap, bpVar.au, bpVar.az, bpVar.ax, bpVar.ay, bpVar.an, bpVar.ab, bpVar.ac, bpVar.ao, bpVar.aa, bpVar.aw, bpVar.bk, bpVar.ba, 295955328);
        bpVar.bd = false;
    }

    /* Access modifiers changed, original: final */
    public final void bq(bp bpVar, int i) {
        int i2 = bpVar.as[i];
        int i3 = bpVar.ag[i];
        int i4 = bpVar.ap[i];
        this.bo.at = this.az[i];
        if (bpVar.ac == null) {
            this.bo.bm = 0;
        } else {
            this.bo.bm = (bpVar.ac[i] & 255) * 767944399;
        }
        if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (bpVar.aa == null || bpVar.aa[i] == (byte) -1) {
                i5 = i3;
                i6 = i2;
                i7 = i4;
            } else {
                i7 = bpVar.aa[i] & 255;
                i6 = bpVar.ay[i7];
                i5 = bpVar.an[i7];
                i7 = bpVar.ab[i7];
            }
            float f = (float) this.ad[i6];
            float f2 = (float) this.aq[i6];
            float f3 = (float) this.ar[i6];
            float f4 = ((float) this.ad[i5]) - f;
            float f5 = ((float) this.aq[i5]) - f2;
            float f6 = ((float) this.ar[i5]) - f3;
            float f7 = ((float) this.ad[i7]) - f;
            float f8 = ((float) this.aq[i7]) - f2;
            float f9 = ((float) this.ar[i7]) - f3;
            float f10 = ((float) this.ad[i2]) - f;
            float f11 = ((float) this.aq[i2]) - f2;
            float f12 = ((float) this.ar[i2]) - f3;
            float f13 = ((float) this.ad[i3]) - f;
            float f14 = ((float) this.aq[i3]) - f2;
            float f15 = ((float) this.ar[i3]) - f3;
            f = ((float) this.ad[i4]) - f;
            f2 = ((float) this.aq[i4]) - f2;
            f3 = ((float) this.ar[i4]) - f3;
            float f16 = (f5 * f9) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f8 * f4) - (f7 * f5);
            float f19 = (f18 * f8) - (f17 * f9);
            float f20 = (f16 * f9) - (f18 * f7);
            float f21 = (f7 * f17) - (f8 * f16);
            float f22 = 1.0f / ((f6 * f21) + ((f4 * f19) + (f5 * f20)));
            float f23 = ((f12 * f21) + ((f11 * f20) + (f19 * f10))) * f22;
            float f24 = ((f15 * f21) + ((f20 * f14) + (f19 * f13))) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f18 * f5) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = f9 * ((f12 * f4) + ((f11 * f6) + (f10 * f20)));
            f12 = f9 * ((f15 * f4) + ((f20 * f13) + (f14 * f6)));
            f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
            f6 = f24 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            f6 = f23 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f23 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f24 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            if (bpVar.ax[i] == -1) {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.au[i], bpVar.au[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -878667904);
            } else {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -118876559);
            }
        } else if (-1 == bpVar.ax[i]) {
            ((at) this.bo).ai(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], ak[bpVar.au[i]], -550737827);
        } else {
            ((at) this.bo).aj(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], (byte) 77);
        }
    }

    /* Access modifiers changed, original: final */
    public final void bs(bp bpVar, int i) {
        int i2 = bpVar.as[i];
        int i3 = bpVar.ag[i];
        int i4 = bpVar.ap[i];
        this.bo.at = this.az[i];
        if (bpVar.ac == null) {
            this.bo.bm = 0;
        } else {
            this.bo.bm = (bpVar.ac[i] & 255) * 767944399;
        }
        if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (bpVar.aa == null || bpVar.aa[i] == (byte) -1) {
                i5 = i3;
                i6 = i2;
                i7 = i4;
            } else {
                i7 = bpVar.aa[i] & 255;
                i6 = bpVar.ay[i7];
                i5 = bpVar.an[i7];
                i7 = bpVar.ab[i7];
            }
            float f = (float) this.ad[i6];
            float f2 = (float) this.aq[i6];
            float f3 = (float) this.ar[i6];
            float f4 = ((float) this.ad[i5]) - f;
            float f5 = ((float) this.aq[i5]) - f2;
            float f6 = ((float) this.ar[i5]) - f3;
            float f7 = ((float) this.ad[i7]) - f;
            float f8 = ((float) this.aq[i7]) - f2;
            float f9 = ((float) this.ar[i7]) - f3;
            float f10 = ((float) this.ad[i2]) - f;
            float f11 = ((float) this.aq[i2]) - f2;
            float f12 = ((float) this.ar[i2]) - f3;
            float f13 = ((float) this.ad[i3]) - f;
            float f14 = ((float) this.aq[i3]) - f2;
            float f15 = ((float) this.ar[i3]) - f3;
            f = ((float) this.ad[i4]) - f;
            f2 = ((float) this.aq[i4]) - f2;
            f3 = ((float) this.ar[i4]) - f3;
            float f16 = (f5 * f9) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f8 * f4) - (f7 * f5);
            float f19 = (f18 * f8) - (f17 * f9);
            float f20 = (f16 * f9) - (f18 * f7);
            float f21 = (f7 * f17) - (f8 * f16);
            float f22 = 1.0f / ((f6 * f21) + ((f4 * f19) + (f5 * f20)));
            float f23 = ((f12 * f21) + ((f11 * f20) + (f19 * f10))) * f22;
            float f24 = ((f15 * f21) + ((f20 * f14) + (f19 * f13))) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f18 * f5) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = f9 * ((f12 * f4) + ((f11 * f6) + (f10 * f20)));
            f12 = f9 * ((f15 * f4) + ((f20 * f13) + (f14 * f6)));
            f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
            f6 = f24 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            f6 = f23 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f23 - f24;
            if (f6 > 0.99f && f6 < 1.1f) {
                f23 = 1.0f;
            }
            f6 = f24 - f19;
            if (f6 > 0.99f && f6 < 1.1f) {
                f24 = 1.0f;
            }
            f6 = f19 - f23;
            if (f6 > 0.99f && f6 < 1.1f) {
                f19 = 1.0f;
            }
            if (bpVar.ax[i] == -1) {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.au[i], bpVar.au[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -1341709947);
            } else {
                ((at) this.bo).ak(this.ah[i2], this.ah[i3], this.ah[i4], this.ao[i2], this.ao[i3], this.ao[i4], this.af[i2], this.af[i3], this.af[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], f23, f24, f19, f11, f12, f13, bpVar.ao[i], -460407814);
            }
        } else if (-1 == bpVar.ax[i]) {
            ((at) this.bo).ai(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], ak[bpVar.au[i]], 1365012151);
        } else {
            ((at) this.bo).aj(this.ac[i2], this.ac[i3], this.ac[i4], this.aw[i2], this.aw[i3], this.aw[i4], bpVar.au[i], bpVar.az[i], bpVar.ax[i], (byte) 8);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bv(bp bpVar) {
        ad.bb(bpVar.bq, 1989916812);
    }
}
