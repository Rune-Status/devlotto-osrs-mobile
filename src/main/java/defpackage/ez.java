package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: ez */
public abstract class ez {
    static final int ac = 65536;
    static final int ah = 1;
    public static final int an = 23;
    public static final int ba = 29;
    static final int bk = 19136800;
    final int ad;
    Comparator ai;
    HashMap aj;
    HashMap al;
    int aq;
    eg[] ar;

    ez(int i) {
        try {
            this.aq = 0;
            this.ai = null;
            this.ad = 1501400061 * i;
            this.ar = af(i, 510569613);
            this.al = new HashMap(i / 8);
            this.aj = new HashMap(i / 8);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int al(int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i >= 65536) {
            i3 = i >>> 16;
            i4 = 16;
        } else {
            i4 = 0;
            i3 = i;
        }
        if (i3 >= 256) {
            i3 >>>= 8;
            i4 += 8;
        }
        if (i3 >= 16) {
            i3 >>>= 4;
            i4 += 4;
        }
        if (i3 >= 4) {
            i3 >>>= 2;
            i4 += 2;
        }
        if (i3 >= 1) {
            i3 >>>= 1;
            i4++;
        }
        return i4 + i3;
    }

    static int al(int i, hw hwVar, boolean z, byte b) {
        int i2;
        int i3;
        int i4;
        al alVar;
        int[] iArr;
        int[] iArr2;
        if (i == 100) {
            try {
                ds.am += 1693358541;
                i2 = hl.ae[ds.am * -757592335];
                i3 = hl.ae[(ds.am * -757592335) + 1];
                int i5 = hl.ae[(ds.am * -757592335) + 2];
                if (i3 != 0) {
                    al aq = da.aq(i2, -550158556);
                    if (aq.fo == null) {
                        aq.fo = new al[(i5 + 1)];
                    }
                    if (aq.fo.length <= i5) {
                        al[] alVarArr = new al[(i5 + 1)];
                        for (i2 = 0; i2 < aq.fo.length; i2++) {
                            alVarArr[i2] = aq.fo[i2];
                        }
                        aq.fo = alVarArr;
                    }
                    if (i5 > 0) {
                        i4 = i5 - 1;
                        if (aq.fo[i4] == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("");
                            stringBuilder.append(i4);
                            throw new RuntimeException(stringBuilder.toString());
                        }
                    }
                    alVar = new al();
                    alVar.af = 956087861 * i3;
                    i4 = aq.ao * 1;
                    alVar.ao = i4;
                    alVar.bc = i4 * -1327606311;
                    alVar.ah = -2139357867 * i5;
                    alVar.aa = true;
                    aq.fo[i5] = alVar;
                    if (z) {
                        lj.az = alVar;
                    } else {
                        hl.au = alVar;
                    }
                    da.gk(aq, (byte) 2);
                    return 1;
                }
                throw new RuntimeException();
            } catch (RuntimeException e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("ez.al(");
                stringBuilder2.append(')');
                throw mv.aq(e, stringBuilder2.toString());
            }
        } else if (101 == i) {
            alVar = z ? lj.az : hl.au;
            al aq2 = da.aq(alVar.ao * -1227024251, -550158556);
            aq2.fo[alVar.ah * 988026877] = null;
            da.gk(aq2, (byte) 2);
            return 1;
        } else if (102 == i) {
            iArr = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            alVar = da.aq(iArr[i4 * -757592335], -550158556);
            alVar.fo = null;
            da.gk(alVar, (byte) 2);
            return 1;
        } else if (i == 200) {
            ds.am += 1128905694;
            i2 = hl.ae[ds.am * -757592335];
            i4 = hl.ae[(ds.am * -757592335) + 1];
            alVar = gi.ar(i2, i4, -1201935479);
            if (alVar == null || i4 == -1) {
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = 0;
                return 1;
            }
            iArr2 = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = 1;
            if (z) {
                lj.az = alVar;
                return 1;
            }
            hl.au = alVar;
            return 1;
        } else if (i != 201) {
            return 2;
        } else {
            iArr = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            alVar = da.aq(iArr[i4 * -757592335], -550158556);
            if (alVar != null) {
                iArr2 = hl.ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 1;
                if (z) {
                    lj.az = alVar;
                    return 1;
                }
                hl.au = alVar;
                return 1;
            }
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = 0;
            return 1;
        }
    }

    /* Access modifiers changed, original: final */
    public final void aa(eg egVar, byte b) {
        try {
            this.al.put(egVar.aq, egVar);
            if (egVar.ar != null) {
                eg egVar2 = (eg) this.aj.put(egVar.ar, egVar);
                if (egVar2 != null && egVar != egVar2) {
                    egVar2.ar = null;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ab() {
        this.aq = 0;
        Arrays.fill(this.ar, null);
        this.al.clear();
        this.aj.clear();
    }

    /* Access modifiers changed, original: final */
    public final void ac(eg egVar, byte b) {
        try {
            eg[] egVarArr = this.ar;
            int i = this.aq + 649829949;
            this.aq = i;
            egVarArr[(i * -2116458219) - 1] = egVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad(int i) {
        try {
            this.aq = 0;
            Arrays.fill(this.ar, null);
            this.al.clear();
            this.aj.clear();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg ae(en enVar, int i) {
        try {
            return !enVar.aq((short) -967) ? null : (eg) this.aj.get(enVar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract eg[] af(int i, int i2);

    /* Access modifiers changed, original: 0000 */
    public eg ag(en enVar, en enVar2, int i) {
        try {
            if (ai(enVar, 1582893724) == null) {
                eg ah = ah((byte) 8);
                ah.az(enVar, enVar2, -2124803200);
                ac(ah, (byte) -30);
                aa(ah, (byte) -84);
                return ah;
            }
            throw new IllegalStateException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract eg ah(byte b);

    /* Access modifiers changed, original: 0000 */
    public eg ai(en enVar, int i) {
        try {
            return !enVar.aq((short) 269) ? null : (eg) this.al.get(enVar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public eg aj(en enVar, byte b) {
        try {
            eg ai = ai(enVar, 957482792);
            return ai != null ? ai : ae(enVar, 1878499211);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ak(eg egVar, byte b) {
        try {
            int ax = ax(egVar, 62385843);
            if (-1 != ax) {
                ao(ax, (byte) 106);
                aw(egVar, 1765931368);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean al(en enVar, byte b) {
        try {
            return !enVar.aq((short) -20356) ? false : this.al.containsKey(enVar) ? true : this.aj.containsKey(enVar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final boolean am(en enVar, byte b) {
        try {
            eg ai = ai(enVar, 1885077830);
            if (ai == null) {
                return false;
            }
            ak(ai, (byte) 56);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void an(Comparator comparator, int i) {
        try {
            if (this.ai == null) {
                this.ai = comparator;
            } else if (this.ai instanceof eo) {
                ((eo) this.ai).ad(comparator, (byte) -26);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ao(int i, byte b) {
        try {
            this.aq -= 649829949;
            if (i < this.aq * -2116458219) {
                System.arraycopy(this.ar, i + 1, this.ar, i, (this.aq * -2116458219) - i);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final eg ap(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < this.aq * -2116458219) {
                    return this.ar[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ez.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public int aq(byte b) {
        try {
            return this.aq * -2116458219;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ar(byte b) {
        try {
            return this.aq * -2116458219 == this.ad * -368498347;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg as(en enVar, int i) {
        try {
            return ag(enVar, null, 799381577);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean at() {
        return this.aq * -2116458219 == this.ad * -368498347;
    }

    public final void au(int i) {
        try {
            if (this.ai == null) {
                Arrays.sort(this.ar, 0, this.aq * -2116458219);
            } else {
                Arrays.sort(this.ar, 0, this.aq * -2116458219, this.ai);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean av() {
        return this.aq * -2116458219 == this.ad * -368498347;
    }

    /* Access modifiers changed, original: final */
    public final void aw(eg egVar, int i) {
        try {
            if (this.al.remove(egVar.aq) == null) {
                throw new IllegalStateException();
            } else if (egVar.ar != null) {
                this.aj.remove(egVar.ar);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final int ax(eg egVar, int i) {
        int i2 = 0;
        while (i2 < this.aq * -2116458219) {
            try {
                if (this.ar[i2] == egVar) {
                    return i2;
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ez.ax(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return -1;
    }

    public final void ay(int i) {
        try {
            this.ai = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void az(eg egVar, en enVar, en enVar2, int i) {
        try {
            aw(egVar, 992116565);
            egVar.az(enVar, enVar2, -2124803200);
            aa(egVar, (byte) -105);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ez.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ba() {
        return this.aq * -2116458219 == this.ad * -368498347;
    }

    public final boolean bb(en enVar) {
        eg ai = ai(enVar, 1120302026);
        if (ai == null) {
            return false;
        }
        ak(ai, (byte) 38);
        return true;
    }

    public final boolean bc(en enVar) {
        eg ai = ai(enVar, -132888801);
        if (ai == null) {
            return false;
        }
        ak(ai, (byte) 43);
        return true;
    }

    public eg bd(en enVar) {
        eg ai = ai(enVar, -167103582);
        return ai != null ? ai : ae(enVar, 927367099);
    }

    /* Access modifiers changed, original: 0000 */
    public eg be(en enVar, en enVar2) {
        if (ai(enVar, 483183259) == null) {
            eg ah = ah((byte) 8);
            ah.az(enVar, enVar2, -2124803200);
            ac(ah, (byte) -1);
            aa(ah, (byte) -114);
            return ah;
        }
        throw new IllegalStateException();
    }

    /* Access modifiers changed, original: 0000 */
    public eg bf(en enVar) {
        return !enVar.aq((short) -663) ? null : (eg) this.aj.get(enVar);
    }

    /* Access modifiers changed, original: final */
    public final void bg(eg egVar) {
        int ax = ax(egVar, -583243598);
        if (-1 != ax) {
            ao(ax, (byte) 84);
            aw(egVar, 1331344738);
        }
    }

    public final eg bh(int i) {
        if (i >= 0 && i < this.aq * -2116458219) {
            return this.ar[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final boolean bi(en enVar) {
        eg ai = ai(enVar, 1773575438);
        if (ai == null) {
            return false;
        }
        ak(ai, (byte) 43);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public eg bj(en enVar, en enVar2) {
        if (ai(enVar, 1917547553) == null) {
            eg ah = ah((byte) 8);
            ah.az(enVar, enVar2, -2124803200);
            ac(ah, (byte) -115);
            aa(ah, (byte) -52);
            return ah;
        }
        throw new IllegalStateException();
    }

    public boolean bk() {
        return this.aq * -2116458219 == this.ad * -368498347;
    }

    /* Access modifiers changed, original: 0000 */
    public eg bl(en enVar) {
        return !enVar.aq((short) -10080) ? null : (eg) this.aj.get(enVar);
    }

    public boolean bm(en enVar) {
        return !enVar.aq((short) -26088) ? false : this.al.containsKey(enVar) ? true : this.aj.containsKey(enVar);
    }

    public final void bn() {
        if (this.ai == null) {
            Arrays.sort(this.ar, 0, this.aq * -2116458219);
        } else {
            Arrays.sort(this.ar, 0, this.aq * -2116458219, this.ai);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg bo(en enVar) {
        return !enVar.aq((short) -1275) ? null : (eg) this.al.get(enVar);
    }

    /* Access modifiers changed, original: final */
    public final int bp(eg egVar) {
        for (int i = 0; i < this.aq * -1456070890; i++) {
            if (this.ar[i] == egVar) {
                return i;
            }
        }
        return -1;
    }

    public eg bq(en enVar) {
        eg ai = ai(enVar, 979547223);
        return ai != null ? ai : ae(enVar, -2097806743);
    }

    /* Access modifiers changed, original: 0000 */
    public eg br(en enVar) {
        return ag(enVar, null, -78156517);
    }

    public boolean bs(en enVar) {
        return !enVar.aq((short) -17375) ? false : this.al.containsKey(enVar) ? true : this.aj.containsKey(enVar);
    }

    public final void bt() {
        if (this.ai == null) {
            Arrays.sort(this.ar, 0, this.aq * -2116458219);
        } else {
            Arrays.sort(this.ar, 0, this.aq * -2116458219, this.ai);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg bu(en enVar) {
        return ag(enVar, null, -1211146367);
    }

    /* Access modifiers changed, original: final */
    public final void bv(eg egVar) {
        int ax = ax(egVar, 1556617773);
        if (-1 != ax) {
            ao(ax, (byte) 50);
            aw(egVar, 1341239084);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg bw(en enVar) {
        return ag(enVar, null, -1834943416);
    }

    /* Access modifiers changed, original: final */
    public final void bx(eg egVar) {
        int ax = ax(egVar, 827556805);
        if (-1 != ax) {
            ao(ax, (byte) 76);
            aw(egVar, 2118186616);
        }
    }

    /* Access modifiers changed, original: final */
    public final void by(eg egVar, en enVar, en enVar2) {
        aw(egVar, 1918305599);
        egVar.az(enVar, enVar2, -2124803200);
        aa(egVar, (byte) -116);
    }

    /* Access modifiers changed, original: final */
    public final void bz(eg egVar, en enVar, en enVar2) {
        aw(egVar, 1020150521);
        egVar.az(enVar, enVar2, -2124803200);
        aa(egVar, (byte) -41);
    }

    public final void ca(Comparator comparator) {
        if (this.ai == null) {
            this.ai = comparator;
        } else if (this.ai instanceof eo) {
            ((eo) this.ai).ad(comparator, (byte) -71);
        }
    }

    public abstract eg cb();

    public abstract eg[] cc(int i);

    public abstract eg ce();

    /* Access modifiers changed, original: final */
    public final void ci(int i) {
        this.aq -= 649829949;
        if (i < this.aq * -2116458219) {
            System.arraycopy(this.ar, i + 1, this.ar, i, (this.aq * -2116458219) - i);
        }
    }

    /* Access modifiers changed, original: final */
    public final void cj(eg egVar) {
        if (this.al.remove(egVar.aq) == null) {
            throw new IllegalStateException();
        } else if (egVar.ar != null) {
            this.aj.remove(egVar.ar);
        }
    }

    /* Access modifiers changed, original: final */
    public final void cm(eg egVar) {
        eg[] egVarArr = this.ar;
        int i = this.aq + 649829949;
        this.aq = i;
        egVarArr[(i * -152248618) - 1] = egVar;
    }

    /* Access modifiers changed, original: final */
    public final void cn(eg egVar) {
        this.al.put(egVar.aq, egVar);
        if (egVar.ar != null) {
            eg egVar2 = (eg) this.aj.put(egVar.ar, egVar);
            if (egVar2 != null && egVar != egVar2) {
                egVar2.ar = null;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cp(int i) {
        this.aq -= 649829949;
        if (i < this.aq * -2116458219) {
            System.arraycopy(this.ar, i + 1, this.ar, i, (this.aq * -2116458219) - i);
        }
    }

    /* Access modifiers changed, original: final */
    public final void cq(eg egVar) {
        this.al.put(egVar.aq, egVar);
        if (egVar.ar != null) {
            eg egVar2 = (eg) this.aj.put(egVar.ar, egVar);
            if (egVar2 != null && egVar != egVar2) {
                egVar2.ar = null;
            }
        }
    }

    public final void cr(Comparator comparator) {
        if (this.ai == null) {
            this.ai = comparator;
        } else if (this.ai instanceof eo) {
            ((eo) this.ai).ad(comparator, (byte) 43);
        }
    }

    public final void cs() {
        this.ai = null;
    }

    /* Access modifiers changed, original: final */
    public final int cv(eg egVar) {
        for (int i = 0; i < this.aq * -2116458219; i++) {
            if (this.ar[i] == egVar) {
                return i;
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: final */
    public final void cw(int i) {
        this.aq -= 649829949;
        if (i < this.aq * -2116458219) {
            System.arraycopy(this.ar, i + 1, this.ar, i, (this.aq * -2116458219) - i);
        }
    }

    public abstract eg cy();
}
