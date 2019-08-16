package defpackage;

/* renamed from: kh */
public abstract class kh {
    static int aa = 0;
    static final String ad = ",";
    static lf az = new lf();
    static final int dk = 1;
    boolean ac;
    int[] ae;
    pk[] ag;
    int[] ai;
    pk aj;
    int[][] ak;
    int[] al;
    int[] am;
    Object[] ap;
    int aq;
    int[] ar;
    int[][] as;
    Object[][] au;
    boolean aw;
    public int ax;

    kh(boolean z, boolean z2) {
        try {
            this.aw = z;
            this.ac = z2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void ad(long j) {
        if (j > 0) {
            if (0 == j % 10) {
                try {
                    bw.aq(j - 1);
                    bw.aq(1);
                    return;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kh.ad(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            bw.aq(j);
        }
    }

    static final boolean ay(bp bpVar, int i, int i2, int i3, by byVar, int i4) {
        try {
            if (!cz.ac((byte) -14)) {
                return false;
            }
            ja.af(byVar.bo, (byte) 56);
            int i5 = bpVar.bg;
            int i6 = bpVar.bu;
            int i7 = bpVar.bw;
            int i8 = bpVar.br;
            int i9 = bpVar.be;
            int i10 = bpVar.bj;
            i5 = (bu.ae * 2125111239) - (i5 + i);
            i6 = (bu.am * -888442541) - (i6 + i2);
            i7 = (bf.ak * -2118544869) - (i7 + i3);
            if (Math.abs(i5) > (bw.au * 492533351) + i8) {
                return false;
            }
            if (Math.abs(i6) > (is.az * -1683742263) + i9) {
                return false;
            }
            if (Math.abs(i7) > (ix.ax * -165110221) + i10) {
                return false;
            }
            if (Math.abs(((bu.ag * -2051275399) * i7) - ((at.ap * 1432195737) * i6)) > ((ix.ax * -165110221) * i9) + ((is.az * -1683742263) * i10)) {
                return false;
            }
            if (Math.abs(((at.ap * 1432195737) * i5) - (i7 * (mf.as * 1828759055))) > (i10 * (bw.au * 492533351)) + ((ix.ax * -165110221) * i8)) {
                return false;
            }
            return Math.abs((i6 * (mf.as * 1828759055)) - (i5 * (bu.ag * -2051275399))) <= ((is.az * -1683742263) * i8) + ((bw.au * 492533351) * i9);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void bn(int i) {
        try {
            if (dl.ob) {
                if (li.or != null) {
                    li.or.au(1043292746);
                }
                af.hv((byte) 109);
                dl.ob = false;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.bn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final byte[] eo(byte[] bArr) {
        lj ljVar = new lj(bArr);
        int af = ljVar.af(1804771424);
        int at = ljVar.at((byte) -8);
        byte[] bArr2;
        if (at < 0 || (aa * 1776694925 != 0 && at > aa * 1776694925)) {
            throw new RuntimeException();
        } else if (af == 0) {
            bArr2 = new byte[at];
            ljVar.bd(bArr2, 0, at, (byte) 0);
            return bArr2;
        } else {
            int at2 = ljVar.at((byte) 0);
            if (at2 < 0 || (aa * 1776694925 != 0 && at2 > aa * 1776694925)) {
                throw new RuntimeException();
            }
            bArr2 = new byte[at2];
            if (1 == af) {
                kl.ad(bArr2, at2, bArr, at, 9);
                return bArr2;
            }
            az.ad(ljVar, bArr2, (byte) 1);
            return bArr2;
        }
    }

    static final void ey(iw iwVar, int i) {
        int i2 = -1;
        try {
            int i3;
            int i4;
            long bk = iwVar.aq * -469654451 == 0 ? ce.fk.bk(iwVar.ad * -110986715, iwVar.ar * -222192123, iwVar.al * -1360125291) : 0;
            if (1 == iwVar.aq * -469654451) {
                bk = ce.fk.ba(iwVar.ad * -110986715, iwVar.ar * -222192123, iwVar.al * -1360125291);
            }
            if (iwVar.aq * -469654451 == 2) {
                bk = ce.fk.bs(iwVar.ad * -110986715, iwVar.ar * -222192123, iwVar.al * -1360125291);
            }
            if (3 == iwVar.aq * -469654451) {
                bk = ce.fk.bm(iwVar.ad * -110986715, iwVar.ar * -222192123, iwVar.al * -1360125291);
            }
            if (bk != 0) {
                i2 = ce.fk.bq(iwVar.ad * -110986715, iwVar.ar * -222192123, iwVar.al * -1360125291, bk);
                i3 = (i2 >> 6) & 3;
                i4 = i2 & 31;
                i2 = lr.au(bk);
            } else {
                i3 = 0;
                i4 = 0;
            }
            iwVar.aj = -1925478929 * i2;
            iwVar.ae = -540463033 * i4;
            iwVar.ai = i3 * 734973569;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ey(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(int i, int i2) {
        int i3 = 0;
        while (i3 < this.au[i].length) {
            try {
                this.au[i][i3] = null;
                i3++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kh.aa(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public byte[] ab(String str, String str2, byte b) {
        try {
            String toLowerCase = str.toLowerCase();
            String toLowerCase2 = str2.toLowerCase();
            int ad = this.aj.ad(ar.ak(toLowerCase, 1602626727), -2040425923);
            return ar(ad, this.ag[ad].ad(ar.ak(toLowerCase2, 1526854866), -2040425923), 1329365413);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ac(int i) {
        int i2 = 0;
        while (i2 < this.ap.length) {
            try {
                this.ap[i2] = null;
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kh.ac(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(byte[] bArr, int i) {
        try {
            this.ax = ed.aq(bArr, bArr.length, -150470724) * -1827189971;
            lj ljVar = new lj(bz.bs(bArr, 709005715));
            int af = ljVar.af(1804771424);
            if (af < 5 || af > 7) {
                throw new RuntimeException("");
            }
            int i2;
            int i3;
            int i4;
            if (af >= 6) {
                ljVar.at((byte) -92);
            }
            int af2 = ljVar.af(1804771424);
            if (af >= 7) {
                this.aq = ljVar.bb(1542774803) * 887752697;
            } else {
                this.aq = ljVar.an(-1464407032) * 887752697;
            }
            this.ar = new int[(this.aq * -1315698103)];
            if (af >= 7) {
                i2 = -1;
                i3 = 0;
                for (i4 = 0; i4 < this.aq * -1315698103; i4++) {
                    i3 += ljVar.bb(1542774803);
                    this.ar[i4] = i3;
                    if (this.ar[i4] > i2) {
                        i2 = this.ar[i4];
                    }
                }
            } else {
                i2 = -1;
                i3 = 0;
                for (i4 = 0; i4 < this.aq * -1315698103; i4++) {
                    i3 += ljVar.an(-1464407032);
                    this.ar[i4] = i3;
                    if (this.ar[i4] > i2) {
                        i2 = this.ar[i4];
                    }
                }
            }
            int i5 = i2 + 1;
            this.ai = new int[i5];
            this.ae = new int[i5];
            this.am = new int[i5];
            this.ak = new int[i5][];
            this.ap = new Object[i5];
            this.au = new Object[i5][];
            if (af2 != 0) {
                this.al = new int[i5];
                for (i3 = 0; i3 < this.aq * -1315698103; i3++) {
                    this.al[this.ar[i3]] = ljVar.at((byte) -26);
                }
                this.aj = new pk(this.al);
            }
            for (i3 = 0; i3 < this.aq * -1315698103; i3++) {
                this.ai[this.ar[i3]] = ljVar.at((byte) -119);
            }
            for (i3 = 0; i3 < this.aq * -1315698103; i3++) {
                this.ae[this.ar[i3]] = ljVar.at((byte) -104);
            }
            for (i3 = 0; i3 < this.aq * -1315698103; i3++) {
                this.am[this.ar[i3]] = ljVar.an(-1464407032);
            }
            int i6;
            int i7;
            if (af < 7) {
                i3 = 0;
                while (true) {
                    af = i3;
                    if (af >= this.aq * -1315698103) {
                        break;
                    }
                    i6 = this.ar[af];
                    i7 = this.am[i6];
                    this.ak[i6] = new int[i7];
                    i3 = -1;
                    i4 = 0;
                    for (i2 = 0; i2 < i7; i2++) {
                        i4 += ljVar.an(-1464407032);
                        this.ak[i6][i2] = i4;
                        if (i4 > i3) {
                            i3 = i4;
                        }
                    }
                    this.au[i6] = new Object[(i3 + 1)];
                    i3 = af + 1;
                }
            } else {
                i3 = 0;
                while (true) {
                    af = i3;
                    if (af >= this.aq * -1315698103) {
                        break;
                    }
                    i6 = this.ar[af];
                    i7 = this.am[i6];
                    this.ak[i6] = new int[i7];
                    i3 = -1;
                    i4 = 0;
                    for (i2 = 0; i2 < i7; i2++) {
                        i4 += ljVar.bb(1542774803);
                        this.ak[i6][i2] = i4;
                        if (i4 > i3) {
                            i3 = i4;
                        }
                    }
                    this.au[i6] = new Object[(i3 + 1)];
                    i3 = af + 1;
                }
            }
            if (af2 != 0) {
                this.as = new int[i5][];
                this.ag = new pk[i5];
                for (i4 = 0; i4 < this.aq * -1315698103; i4++) {
                    i2 = this.ar[i4];
                    af = this.am[i2];
                    this.as[i2] = new int[this.au[i2].length];
                    for (i3 = 0; i3 < af; i3++) {
                        this.as[i2][this.ak[i2][i3]] = ljVar.at((byte) -69);
                    }
                    this.ag[i2] = new pk(this.as[i2]);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae(int i, int i2) {
        try {
            if (this.ap[i] != null) {
                return true;
            }
            au(i, 870403903);
            return this.ap[i] != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int af(String str, int i) {
        try {
            return this.aj.ad(ar.ak(str.toLowerCase(), 1592007672), -2040425923);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public byte[] ag(int i, int i2, byte b) {
        if (i < 0) {
            return null;
        }
        try {
            if (i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
                return null;
            }
            if (this.au[i][i2] == null && !ah(i, null, (byte) 96)) {
                au(i, -260286161);
                if (!ah(i, null, (byte) 69)) {
                    return null;
                }
            }
            return ib.ae(this.au[i][i2], false, 1156386649);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ah(int i, int[] iArr, byte b) {
        boolean z;
        byte[] ae;
        try {
            z = false;
            if (this.ap[i] == null) {
                return false;
            }
            int i2;
            Object obj;
            int i3 = this.am[i];
            int[] iArr2 = this.ak[i];
            Object[] objArr = this.au[i];
            for (i2 = 0; i2 < i3; i2++) {
                if (objArr[iArr2[i2]] == null) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
            if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
                ae = ib.ae(this.ap[i], false, 1049905635);
            } else {
                ae = ib.ae(this.ap[i], true, -2075209900);
                lj ljVar = new lj(ae);
                ljVar.bu(iArr, 5, ljVar.ar.length, -702431081);
            }
            byte[] bs = bz.bs(ae, -830602937);
            if (this.aw) {
                this.ap[i] = null;
            }
            if (i3 > 1) {
                int i4;
                int length = bs.length - 1;
                int i5 = bs[length] & 255;
                lj ljVar2 = new lj(bs);
                int[] iArr3 = new int[i3];
                int i6 = (length - ((i5 * i3) * 4)) * -879823907;
                ljVar2.al = i6;
                for (i4 = 0; i4 < i5; i4++) {
                    length = 0;
                    for (i2 = 0; i2 < i3; i2++) {
                        length += ljVar2.at((byte) -105);
                        iArr3[i2] = iArr3[i2] + length;
                    }
                }
                byte[][] bArr = new byte[i3][];
                for (length = 0; length < i3; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                ljVar2.al = i6;
                i4 = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    length = 0;
                    for (i2 = 0; i2 < i3; i2++) {
                        length += ljVar2.at((byte) -66);
                        System.arraycopy(bs, i4, bArr[i2], iArr3[i2], length);
                        iArr3[i2] = iArr3[i2] + length;
                        i4 += length;
                    }
                }
                for (length = 0; length < i3; length++) {
                    if (this.ac) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = jy.ai(bArr[length], false, (byte) 7);
                    }
                }
            } else if (this.ac) {
                objArr[iArr2[0]] = bs;
            } else {
                objArr[iArr2[0]] = jy.ai(bs, false, (byte) -37);
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            if (iArr != null) {
                z = true;
            }
            stringBuilder.append(z);
            stringBuilder.append(ad);
            stringBuilder.append(i);
            stringBuilder.append(ad);
            stringBuilder.append(ae.length);
            stringBuilder.append(ad);
            stringBuilder.append(ed.aq(ae, ae.length, -150470724));
            stringBuilder.append(ad);
            stringBuilder.append(ed.aq(ae, ae.length - 2, -150470724));
            stringBuilder.append(ad);
            stringBuilder.append(this.ai[i]);
            stringBuilder.append(ad);
            stringBuilder.append(this.ax * 1888894117);
            throw mv.aq(e, stringBuilder.toString());
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("kh.ah(");
            stringBuilder2.append(')');
            throw mv.aq(e2, stringBuilder2.toString());
        }
    }

    public boolean ai(int i, byte b) {
        try {
            if (this.au.length == 1) {
                return aj(0, i, 646733454);
            }
            if (1 == this.au[i].length) {
                return aj(i, 0, -1518537728);
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aj(int i, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        try {
            if (i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
                return false;
            }
            if (this.au[i][i2] != null) {
                return true;
            }
            if (this.ap[i] != null) {
                return true;
            }
            au(i, 657580948);
            return this.ap[i] != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ak(int i, byte b) {
        try {
            return this.ap[i] != null ? 100 : 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Missing block: B:16:0x0034, code skipped:
            if (ah(r4, r6, (byte) 61) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] al(int i, int i2, int[] iArr, int i3) {
        byte[] bArr = null;
        if (i >= 0) {
            try {
                if (i < this.au.length && this.au[i] != null && i2 >= 0 && i2 < this.au[i].length) {
                    if (this.au[i][i2] == null && !ah(i, iArr, (byte) 96)) {
                        au(i, 439429123);
                    }
                    bArr = ib.ae(this.au[i][i2], false, 1111827910);
                    if (this.ac) {
                        this.au[i][i2] = null;
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kh.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return bArr;
    }

    public boolean am(int i) {
        boolean z = true;
        int i2 = 0;
        while (i2 < this.ar.length) {
            try {
                int i3 = this.ar[i2];
                if (this.ap[i3] == null) {
                    au(i3, -1406006257);
                    if (this.ap[i3] == null) {
                        z = false;
                    }
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kh.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return z;
    }

    public boolean an(String str, String str2, int i) {
        try {
            String toLowerCase = str.toLowerCase();
            String toLowerCase2 = str2.toLowerCase();
            int ad = this.aj.ad(ar.ak(toLowerCase, 1243966780), -2040425923);
            return ad >= 0 && this.ag[ad].ad(ar.ak(toLowerCase2, 536800364), -2040425923) >= 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ao(int i) {
        int i2 = 0;
        while (i2 < this.au.length) {
            try {
                if (this.au[i2] != null) {
                    for (int i3 = 0; i3 < this.au[i2].length; i3++) {
                        this.au[i2][i3] = null;
                    }
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kh.ao(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public byte[] ap(int i, byte b) {
        try {
            if (this.au.length == 1) {
                return ag(0, i, (byte) 4);
            }
            if (1 == this.au[i].length) {
                return ag(i, 0, (byte) -25);
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, byte b) {
    }

    public byte[] ar(int i, int i2, int i3) {
        try {
            return al(i, i2, null, -854818973);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public byte[] as(int i, byte b) {
        try {
            if (this.au.length == 1) {
                return ar(0, i, 1687261377);
            }
            if (1 == this.au[i].length) {
                return ar(i, 0, 952790108);
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean at(String str, byte b) {
        try {
            return ae(this.aj.ad(ar.ak(str.toLowerCase(), -361201564), -2040425923), 468635377);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i, int i2) {
    }

    public boolean av(String str, String str2, int i) {
        try {
            String toLowerCase = str.toLowerCase();
            String toLowerCase2 = str2.toLowerCase();
            int ad = this.aj.ad(ar.ak(toLowerCase, 1584896193), -2040425923);
            return aj(ad, this.ag[ad].ad(ar.ak(toLowerCase2, 1289886513), -2040425923), -317272696);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int aw(int i) {
        try {
            return this.au.length;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ax(int i, byte b) {
        try {
            return this.au[i].length;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ay(int i, String str, byte b) {
        try {
            return this.ag[i].ad(ar.ak(str.toLowerCase(), 1138997650), -2040425923);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int[] az(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < this.ak.length) {
                    return this.ak[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kh.az(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return null;
    }

    public int ba(String str, byte b) {
        try {
            return ak(this.aj.ad(ar.ak(str.toLowerCase(), -524547813), -2040425923), (byte) -23);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public byte[] bb(int i, int i2) {
        return al(i, i2, null, -2010634486);
    }

    public byte[] bc(int i, int i2) {
        return al(i, i2, null, 1808807981);
    }

    /* Access modifiers changed, original: 0000 */
    public void bd(int i) {
    }

    public boolean be(int i, int i2) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return false;
        }
        if (this.au[i][i2] != null) {
            return true;
        }
        if (this.ap[i] != null) {
            return true;
        }
        au(i, 1394173648);
        return this.ap[i] != null;
    }

    public byte[] bf(int i, int i2) {
        return al(i, i2, null, 1944379905);
    }

    public byte[] bg(int i, int i2) {
        return al(i, i2, null, -768989752);
    }

    public boolean bh(int i, int i2) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return false;
        }
        if (this.au[i][i2] != null) {
            return true;
        }
        if (this.ap[i] != null) {
            return true;
        }
        au(i, 612654673);
        return this.ap[i] != null;
    }

    public byte[] bi(int i, int i2) {
        return al(i, i2, null, -1924268960);
    }

    public boolean bj(int i, int i2) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return false;
        }
        if (this.au[i][i2] != null) {
            return true;
        }
        if (this.ap[i] != null) {
            return true;
        }
        au(i, 1551846930);
        return this.ap[i] != null;
    }

    public void bk(String str, int i) {
        try {
            int ad = this.aj.ad(ar.ak(str.toLowerCase(), -201184991), -2040425923);
            if (ad >= 0) {
                aq(ad, (byte) -13);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kh.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(int i) {
    }

    /* Access modifiers changed, original: 0000 */
    public void bm(byte[] bArr) {
        this.ax = ed.aq(bArr, bArr.length, -150470724) * -1827189971;
        lj ljVar = new lj(bz.bs(bArr, 449252841));
        int af = ljVar.af(1804771424);
        if (af < 5 || af > 7) {
            throw new RuntimeException("");
        }
        int i;
        int i2;
        int i3;
        if (af >= 6) {
            ljVar.at((byte) -2);
        }
        int af2 = ljVar.af(1804771424);
        if (af >= 7) {
            this.aq = ljVar.bb(1542774803) * -1587837144;
        } else {
            this.aq = ljVar.an(-1464407032) * -539582987;
        }
        this.ar = new int[(this.aq * -1315698103)];
        if (af >= 7) {
            i = -1;
            i2 = 0;
            for (i3 = 0; i3 < this.aq * -869485779; i3++) {
                i2 += ljVar.bb(1542774803);
                this.ar[i3] = i2;
                if (this.ar[i3] > i) {
                    i = this.ar[i3];
                }
            }
        } else {
            i = -1;
            i2 = 0;
            for (i3 = 0; i3 < this.aq * -1315698103; i3++) {
                i2 += ljVar.an(-1464407032);
                this.ar[i3] = i2;
                if (this.ar[i3] > i) {
                    i = this.ar[i3];
                }
            }
        }
        int i4 = i + 1;
        this.ai = new int[i4];
        this.ae = new int[i4];
        this.am = new int[i4];
        this.ak = new int[i4][];
        this.ap = new Object[i4];
        this.au = new Object[i4][];
        if (af2 != 0) {
            this.al = new int[i4];
            for (i2 = 0; i2 < this.aq * 325136982; i2++) {
                this.al[this.ar[i2]] = ljVar.at((byte) -31);
            }
            this.aj = new pk(this.al);
        }
        for (i2 = 0; i2 < this.aq * 321720726; i2++) {
            this.ai[this.ar[i2]] = ljVar.at((byte) -33);
        }
        for (i2 = 0; i2 < this.aq * 1350850539; i2++) {
            this.ae[this.ar[i2]] = ljVar.at((byte) -66);
        }
        for (i2 = 0; i2 < this.aq * -2065568569; i2++) {
            this.am[this.ar[i2]] = ljVar.an(-1464407032);
        }
        int i5;
        int i6;
        if (af >= 7) {
            for (i2 = 0; i2 < this.aq * 2018209881; i2++) {
                i5 = this.ar[i2];
                i6 = this.am[i5];
                this.ak[i5] = new int[i6];
                i3 = -1;
                i = 0;
                for (af = 0; af < i6; af++) {
                    i += ljVar.bb(1542774803);
                    this.ak[i5][af] = i;
                    if (i > i3) {
                        i3 = i;
                    }
                }
                this.au[i5] = new Object[(i3 + 1)];
            }
        } else {
            for (i2 = 0; i2 < this.aq * 306338918; i2++) {
                i5 = this.ar[i2];
                i6 = this.am[i5];
                this.ak[i5] = new int[i6];
                i3 = -1;
                i = 0;
                for (af = 0; af < i6; af++) {
                    i += ljVar.an(-1464407032);
                    this.ak[i5][af] = i;
                    if (i > i3) {
                        i3 = i;
                    }
                }
                this.au[i5] = new Object[(i3 + 1)];
            }
        }
        if (af2 != 0) {
            this.as = new int[i4][];
            this.ag = new pk[i4];
            for (i2 = 0; i2 < this.aq * -1315698103; i2++) {
                i = this.ar[i2];
                af = this.am[i];
                this.as[i] = new int[this.au[i].length];
                for (i3 = 0; i3 < af; i3++) {
                    this.as[i][this.ak[i][i3]] = ljVar.at((byte) -41);
                }
                this.ag[i] = new pk(this.as[i]);
            }
        }
    }

    /* renamed from: bn */
    public boolean m225bn(int i) {
        if (this.au.length == 1) {
            return aj(0, i, -792593378);
        }
        if (1 == this.au[i].length) {
            return aj(i, 0, 227231616);
        }
        throw new RuntimeException();
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(int i) {
    }

    public boolean bp(int i) {
        if (this.ap[i] != null) {
            return true;
        }
        au(i, 521219941);
        return this.ap[i] != null;
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(byte[] bArr) {
        this.ax = ed.aq(bArr, bArr.length, -150470724) * -1827189971;
        lj ljVar = new lj(bz.bs(bArr, -62197815));
        int af = ljVar.af(1804771424);
        if (af < 5 || af > 7) {
            throw new RuntimeException("");
        }
        int i;
        int i2;
        int i3;
        if (af >= 6) {
            ljVar.at((byte) -12);
        }
        int af2 = ljVar.af(1804771424);
        if (af >= 7) {
            this.aq = ljVar.bb(1542774803) * 437639402;
        } else {
            this.aq = ljVar.an(-1464407032) * 887752697;
        }
        this.ar = new int[(this.aq * -1315698103)];
        if (af >= 7) {
            i = 0;
            i2 = -1;
            for (i3 = 0; i3 < this.aq * 64984344; i3++) {
                i += ljVar.bb(1542774803);
                this.ar[i3] = i;
                if (this.ar[i3] > i2) {
                    i2 = this.ar[i3];
                }
            }
        } else {
            i = 0;
            i2 = -1;
            for (i3 = 0; i3 < this.aq * -1315698103; i3++) {
                i += ljVar.an(-1464407032);
                this.ar[i3] = i;
                if (this.ar[i3] > i2) {
                    i2 = this.ar[i3];
                }
            }
        }
        int i4 = i2 + 1;
        this.ai = new int[i4];
        this.ae = new int[i4];
        this.am = new int[i4];
        this.ak = new int[i4][];
        this.ap = new Object[i4];
        this.au = new Object[i4][];
        if (af2 != 0) {
            this.al = new int[i4];
            for (i = 0; i < this.aq * -1315698103; i++) {
                this.al[this.ar[i]] = ljVar.at((byte) -39);
            }
            this.aj = new pk(this.al);
        }
        for (i = 0; i < this.aq * -1697981342; i++) {
            this.ai[this.ar[i]] = ljVar.at((byte) -65);
        }
        for (i = 0; i < this.aq * -1315698103; i++) {
            this.ae[this.ar[i]] = ljVar.at((byte) -17);
        }
        for (i = 0; i < this.aq * -630019722; i++) {
            this.am[this.ar[i]] = ljVar.an(-1464407032);
        }
        int i5;
        int i6;
        if (af >= 7) {
            for (i = 0; i < this.aq * 1294225988; i++) {
                i5 = this.ar[i];
                i6 = this.am[i5];
                this.ak[i5] = new int[i6];
                i3 = -1;
                i2 = 0;
                for (af = 0; af < i6; af++) {
                    i2 += ljVar.bb(1542774803);
                    this.ak[i5][af] = i2;
                    if (i2 > i3) {
                        i3 = i2;
                    }
                }
                this.au[i5] = new Object[(i3 + 1)];
            }
        } else {
            for (i = 0; i < this.aq * -1315698103; i++) {
                i5 = this.ar[i];
                i6 = this.am[i5];
                this.ak[i5] = new int[i6];
                i3 = -1;
                i2 = 0;
                for (af = 0; af < i6; af++) {
                    i2 += ljVar.an(-1464407032);
                    this.ak[i5][af] = i2;
                    if (i2 > i3) {
                        i3 = i2;
                    }
                }
                this.au[i5] = new Object[(i3 + 1)];
            }
        }
        if (af2 != 0) {
            this.as = new int[i4][];
            this.ag = new pk[i4];
            for (i = 0; i < this.aq * -1315698103; i++) {
                i2 = this.ar[i];
                af = this.am[i2];
                this.as[i2] = new int[this.au[i2].length];
                for (i3 = 0; i3 < af; i3++) {
                    this.as[i2][this.ak[i2][i3]] = ljVar.at((byte) -119);
                }
                this.ag[i2] = new pk(this.as[i2]);
            }
        }
    }

    public byte[] br(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return null;
        }
        if (this.au[i][i2] == null && !ah(i, iArr, (byte) 96)) {
            au(i, 1267787254);
            if (!ah(i, iArr, (byte) 61)) {
                return null;
            }
        }
        byte[] ae = ib.ae(this.au[i][i2], false, -1375106450);
        if (this.ac) {
            this.au[i][i2] = null;
        }
        return ae;
    }

    public boolean bt(int i) {
        if (this.au.length == 1) {
            return aj(0, i, 209460561);
        }
        if (1 == this.au[i].length) {
            return aj(i, 0, 967571775);
        }
        throw new RuntimeException();
    }

    public byte[] bu(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return null;
        }
        if (this.au[i][i2] == null && !ah(i, iArr, (byte) 92)) {
            au(i, 1821997720);
            if (!ah(i, iArr, (byte) 54)) {
                return null;
            }
        }
        byte[] ae = ib.ae(this.au[i][i2], false, -1066891950);
        if (this.ac) {
            this.au[i][i2] = null;
        }
        return ae;
    }

    public byte[] bv(int i, int i2) {
        return al(i, i2, null, -584315241);
    }

    public byte[] bw(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return null;
        }
        if (this.au[i][i2] == null && !ah(i, iArr, (byte) 58)) {
            au(i, 484627966);
            if (!ah(i, iArr, (byte) 80)) {
                return null;
            }
        }
        byte[] ae = ib.ae(this.au[i][i2], false, -570987068);
        if (this.ac) {
            this.au[i][i2] = null;
        }
        return ae;
    }

    public byte[] bx(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return null;
        }
        if (this.au[i][i2] == null && !ah(i, iArr, (byte) 83)) {
            au(i, -932604216);
            if (!ah(i, iArr, (byte) 9)) {
                return null;
            }
        }
        byte[] ae = ib.ae(this.au[i][i2], false, 526420454);
        if (this.ac) {
            this.au[i][i2] = null;
        }
        return ae;
    }

    public boolean by(int i) {
        if (this.ap[i] != null) {
            return true;
        }
        au(i, 1346123666);
        return this.ap[i] != null;
    }

    public boolean bz(int i) {
        if (this.ap[i] != null) {
            return true;
        }
        au(i, 1035272585);
        return this.ap[i] != null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ca(int i) {
    }

    public byte[] cb(int i, int i2) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return null;
        }
        if (this.au[i][i2] == null && !ah(i, null, (byte) 93)) {
            au(i, 1094902950);
            if (!ah(i, null, (byte) 30)) {
                return null;
            }
        }
        return ib.ae(this.au[i][i2], false, 1003090877);
    }

    public byte[] cc(int i) {
        if (this.au.length == 1) {
            return ag(0, i, (byte) 14);
        }
        if (1 == this.au[i].length) {
            return ag(i, 0, (byte) -35);
        }
        throw new RuntimeException();
    }

    public int cd() {
        return this.au.length;
    }

    public byte[] ce(int i) {
        if (this.au.length == 1) {
            return ag(0, i, (byte) 2);
        }
        if (1 == this.au[i].length) {
            return ag(i, 0, (byte) -4);
        }
        throw new RuntimeException();
    }

    public int cf() {
        return this.au.length;
    }

    public int cg() {
        return this.au.length;
    }

    public void ch() {
        for (int i = 0; i < this.ap.length; i++) {
            this.ap[i] = null;
        }
    }

    public byte[] ci(int i, int i2) {
        if (i < 0 || i >= this.au.length || this.au[i] == null || i2 < 0 || i2 >= this.au[i].length) {
            return null;
        }
        if (this.au[i][i2] == null && !ah(i, null, (byte) 46)) {
            au(i, -652766537);
            if (!ah(i, null, (byte) 117)) {
                return null;
            }
        }
        return ib.ae(this.au[i][i2], false, -670913171);
    }

    /* Access modifiers changed, original: 0000 */
    public int cj(int i) {
        return this.ap[i] != null ? 100 : 0;
    }

    public int[] ck(int i) {
        return (i < 0 || i >= this.ak.length) ? null : this.ak[i];
    }

    public int cl(int i) {
        return this.au[i].length;
    }

    /* Access modifiers changed, original: 0000 */
    public int cm(int i) {
        return this.ap[i] != null ? 100 : 0;
    }

    public byte[] cn(int i) {
        if (this.au.length == 1) {
            return ar(0, i, 1814497556);
        }
        if (1 == this.au[i].length) {
            return ar(i, 0, 1972632864);
        }
        throw new RuntimeException();
    }

    public int co(int i) {
        return this.au[i].length;
    }

    public byte[] cp(int i) {
        if (this.au.length == 1) {
            return ar(0, i, 779231086);
        }
        if (1 == this.au[i].length) {
            return ar(i, 0, 1217304766);
        }
        throw new RuntimeException();
    }

    /* Access modifiers changed, original: 0000 */
    public int cq(int i) {
        return this.ap[i] != null ? 100 : 0;
    }

    public byte[] cr(int i) {
        if (this.au.length == 1) {
            return ag(0, i, (byte) -30);
        }
        if (1 == this.au[i].length) {
            return ag(i, 0, (byte) -22);
        }
        throw new RuntimeException();
    }

    public byte[] cs(int i) {
        if (this.au.length == 1) {
            return ag(0, i, (byte) -26);
        }
        if (1 == this.au[i].length) {
            return ag(i, 0, (byte) 62);
        }
        throw new RuntimeException();
    }

    /* Access modifiers changed, original: 0000 */
    public void ct(int i) {
    }

    public int cu(int i) {
        return this.au[i].length;
    }

    /* Access modifiers changed, original: 0000 */
    public int cv(int i) {
        return this.ap[i] != null ? 100 : 0;
    }

    public byte[] cw(int i) {
        if (this.au.length == 1) {
            return ar(0, i, 2013990562);
        }
        if (1 == this.au[i].length) {
            return ar(i, 0, 931547489);
        }
        throw new RuntimeException();
    }

    /* Access modifiers changed, original: 0000 */
    public void cx(int i) {
    }

    public byte[] cy(int i) {
        if (this.au.length == 1) {
            return ag(0, i, (byte) 36);
        }
        if (1 == this.au[i].length) {
            return ag(i, 0, (byte) 88);
        }
        throw new RuntimeException();
    }

    public int cz() {
        return this.au.length;
    }

    public void da() {
        for (int i = 0; i < this.au.length; i++) {
            if (this.au[i] != null) {
                for (int i2 = 0; i2 < this.au[i].length; i2++) {
                    this.au[i][i2] = null;
                }
            }
        }
    }

    public int db(String str) {
        return this.aj.ad(ar.ak(str.toLowerCase(), 609107555), -2040425923);
    }

    public int dc(String str) {
        return this.aj.ad(ar.ak(str.toLowerCase(), 2042801542), -2040425923);
    }

    public void dd() {
        for (int i = 0; i < this.ap.length; i++) {
            this.ap[i] = null;
        }
    }

    public boolean de(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, -315881155), -2040425923);
        return ad >= 0 && this.ag[ad].ad(ar.ak(toLowerCase2, 1778079080), -2040425923) >= 0;
    }

    public void df() {
        for (int i = 0; i < this.au.length; i++) {
            if (this.au[i] != null) {
                for (int i2 = 0; i2 < this.au[i].length; i2++) {
                    this.au[i][i2] = null;
                }
            }
        }
    }

    public boolean dg(String str) {
        return ae(this.aj.ad(ar.ak(str.toLowerCase(), -447969032), -2040425923), -954869906);
    }

    public boolean dh(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, 1616928175), -2040425923);
        return ad >= 0 && this.ag[ad].ad(ar.ak(toLowerCase2, 151622660), -2040425923) >= 0;
    }

    public void di(int i) {
        for (int i2 = 0; i2 < this.au[i].length; i2++) {
            this.au[i][i2] = null;
        }
    }

    public void dj(String str) {
        int ad = this.aj.ad(ar.ak(str.toLowerCase(), -61401676), -2040425923);
        if (ad >= 0) {
            aq(ad, (byte) -24);
        }
    }

    public boolean dk(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, 1457703676), -2040425923);
        return aj(ad, this.ag[ad].ad(ar.ak(toLowerCase2, 705117351), -2040425923), -22655384);
    }

    public void dl(int i) {
        for (int i2 = 0; i2 < this.au[i].length; i2++) {
            this.au[i][i2] = null;
        }
    }

    public void dm() {
        for (int i = 0; i < this.ap.length; i++) {
            this.ap[i] = null;
        }
    }

    public int dn(int i, String str) {
        return this.ag[i].ad(ar.ak(str.toLowerCase(), 375357214), -2040425923);
    }

    /* renamed from: do */
    public byte[] m226do(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, 338903763), -2040425923);
        return ar(ad, this.ag[ad].ad(ar.ak(toLowerCase2, 215126780), -2040425923), 1981436150);
    }

    public int dp(int i, String str) {
        return this.ag[i].ad(ar.ak(str.toLowerCase(), -325620692), -2040425923);
    }

    public byte[] dq(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, 973060529), -2040425923);
        return ar(ad, this.ag[ad].ad(ar.ak(toLowerCase2, 1944438029), -2040425923), 1405481343);
    }

    public void dr() {
        for (int i = 0; i < this.au.length; i++) {
            if (this.au[i] != null) {
                for (int i2 = 0; i2 < this.au[i].length; i2++) {
                    this.au[i][i2] = null;
                }
            }
        }
    }

    public byte[] ds(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, -549770800), -2040425923);
        return ar(ad, this.ag[ad].ad(ar.ak(toLowerCase2, -455669785), -2040425923), 1556812687);
    }

    public void dt() {
        for (int i = 0; i < this.ap.length; i++) {
            this.ap[i] = null;
        }
    }

    public int du(String str) {
        return this.aj.ad(ar.ak(str.toLowerCase(), -125323139), -2040425923);
    }

    public void dv(int i) {
        for (int i2 = 0; i2 < this.au[i].length; i2++) {
            this.au[i][i2] = null;
        }
    }

    public boolean dw(String str) {
        return ae(this.aj.ad(ar.ak(str.toLowerCase(), 1224028026), -2040425923), -711842574);
    }

    public boolean dx(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, 772976868), -2040425923);
        return aj(ad, this.ag[ad].ad(ar.ak(toLowerCase2, 398171570), -2040425923), 1533491073);
    }

    public byte[] dy(String str, String str2) {
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int ad = this.aj.ad(ar.ak(toLowerCase, 1093826330), -2040425923);
        return ar(ad, this.ag[ad].ad(ar.ak(toLowerCase2, 2120454115), -2040425923), 1625884069);
    }

    public void dz(String str) {
        int ad = this.aj.ad(ar.ak(str.toLowerCase(), 2145091688), -2040425923);
        if (ad >= 0) {
            aq(ad, (byte) 2);
        }
    }

    public int eq(String str) {
        return ak(this.aj.ad(ar.ak(str.toLowerCase(), 476953851), -2040425923), (byte) -11);
    }

    public int et(String str) {
        return ak(this.aj.ad(ar.ak(str.toLowerCase(), 2059214086), -2040425923), (byte) -54);
    }

    public int ez(String str) {
        return ak(this.aj.ad(ar.ak(str.toLowerCase(), 1218365210), -2040425923), (byte) -110);
    }
}
