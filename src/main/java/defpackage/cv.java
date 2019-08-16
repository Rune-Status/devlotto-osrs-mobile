package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

/* renamed from: cv */
public class cv implements bg {
    static lj ab = null;
    public static final int ac = 9;
    public static final int ax = 62;
    public static final int by = 57;
    static final int bz = 12;
    public static final int cl = 98;
    bx[] ad;
    kh ae;
    int ai;
    double aj;
    int al;
    fy aq;
    int ar;

    public cv(kh khVar, kh khVar2, int i, double d, int i2) {
        try {
            this.aq = new fy();
            this.al = 0;
            this.aj = 1.0d;
            this.ai = 1975217792;
            this.ae = khVar2;
            this.ar = -1626462711 * i;
            this.al = this.ar * -1588449817;
            this.aj = d;
            this.ai = 887846621 * i2;
            int[] az = khVar.az(0, -381883787);
            int length = az.length;
            this.ad = new bx[khVar.ax(0, (byte) 55)];
            for (int i3 = 0; i3 < length; i3++) {
                this.ad[az[i3]] = new bx(new lj(khVar.ar(0, az[i3], 950480187)));
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ad(long j) {
        try {
            nh.ar.setTime(new Date(j));
            int i = nh.ar.get(7);
            int i2 = nh.ar.get(5);
            int i3 = nh.ar.get(2);
            int i4 = nh.ar.get(1);
            int i5 = nh.ar.get(11);
            int i6 = nh.ar.get(12);
            int i7 = nh.ar.get(13);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(nh.aq[i - 1]);
            stringBuilder.append(", ");
            stringBuilder.append(i2 / 10);
            stringBuilder.append(i2 % 10);
            stringBuilder.append("-");
            stringBuilder.append(nh.ad[0][i3]);
            stringBuilder.append("-");
            stringBuilder.append(i4);
            stringBuilder.append(" ");
            stringBuilder.append(i5 / 10);
            stringBuilder.append(i5 % 10);
            stringBuilder.append(":");
            stringBuilder.append(i6 / 10);
            stringBuilder.append(i6 % 10);
            stringBuilder.append(":");
            stringBuilder.append(i7 / 10);
            stringBuilder.append(i7 % 10);
            stringBuilder.append(" GMT");
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("cv.ad(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public static void ai(byte b) {
        try {
            mc.ag.ad((byte) 14);
            for (int i = 0; i < mc.aj * 142370929; i++) {
                im.au[i].ad((byte) 125);
            }
            mc.ap.ad((byte) 39);
            mc.as.ad((byte) 47);
            mc.ag = null;
            im.au = null;
            mc.ap = null;
            mc.as = null;
        } catch (Exception e) {
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.ai(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    static void aj(kv kvVar, int i, int i2, int i3, byte b, boolean z, int i4) {
        long j = (long) ((i << 16) + i2);
        try {
            if (((kx) kk.am.ad(j)) == null && ((kx) kk.as.ad(j)) == null) {
                kx kxVar = (kx) kk.au.ad(j);
                if (kxVar == null) {
                    if (!z) {
                        if (((kx) kk.ax.ad(j)) != null) {
                            return;
                        }
                    }
                    kxVar = new kx();
                    kxVar.ad = kvVar;
                    kxVar.aq = 188947553 * i3;
                    kxVar.ar = b;
                    if (z) {
                        kk.am.aq(kxVar, j);
                        kk.ak += 1465262209;
                        return;
                    }
                    kk.ap.ad(kxVar);
                    kk.au.aq(kxVar, j);
                    kk.az += 916684535;
                } else if (z) {
                    kxVar.di();
                    kk.am.aq(kxVar, j);
                    kk.az -= 916684535;
                    kk.ak += 1465262209;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean ar(String str, int i) {
        if (str == null) {
            return false;
        }
        try {
            URL url = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            return false;
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.ar(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    static void bw(int i) {
        try {
            client.aq.abx((byte) 103).gs(ki.ae, 2130809692);
            hm.cu = -1883735691;
            lv.bs(go.kj, go.kr, go.ky, -1804322940);
            aa bx = client.aq.abx((byte) 123).bx(-1768888766);
            if (bx != null) {
                dw.ez.ao(null, (byte) 0);
                bx.ae((byte) 53);
                return;
            }
            dw.ez.ao(new au(false, 2), (byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.bw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aa(int i) {
        return this.ad[i].ai;
    }

    public int ab() {
        return this.ad.length;
    }

    public int ac(int i) {
        return this.ad[i] != null ? this.ad[i].aj : 0;
    }

    public bx ad(int i, int i2) {
        try {
            return this.ad[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ae(int i) {
        try {
            return this.ad.length;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean af(int i) {
        return 64 == this.ai * 680923509;
    }

    public int[] ag(int i) {
        bx bxVar = this.ad[i];
        if (bxVar != null) {
            if (bxVar.ax != null) {
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            } else if (bxVar.ad(this.aj, this.ai * 852720101, this.ae)) {
                if (this.al * -1540182283 == 0) {
                    ((bx) this.aq.ai()).aq();
                } else {
                    this.al += 631904481;
                }
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            }
        }
        return null;
    }

    public boolean ah(int i) {
        return 2065030615 == this.ai * 680923509;
    }

    public boolean ai(int i, byte b) {
        try {
            return 64 == this.ai * 680923509;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aj(int i, int i2) {
        try {
            return this.ad[i].ai;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public bx ak(int i) {
        return this.ad[i];
    }

    public int al(int i, int i2) {
        try {
            return this.ad[i] != null ? this.ad[i].aj : 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public bx am(int i) {
        return this.ad[i];
    }

    public int an() {
        return this.ad.length;
    }

    public boolean ao(int i) {
        return this.ad[i].ai;
    }

    public int[] ap(int i) {
        bx bxVar = this.ad[i];
        if (bxVar != null) {
            if (bxVar.ax != null) {
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            } else if (bxVar.ad(this.aj, this.ai * 680923509, this.ae)) {
                if (this.al * -1720003361 == 0) {
                    ((bx) this.aq.ai()).aq();
                } else {
                    this.al += 631904481;
                }
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            }
        }
        return null;
    }

    public int[][] aq(int i) {
        try {
            int[][] iArr = new int[this.ad.length][];
            for (int i2 = 0; i2 < this.ad.length; i2++) {
                bx bxVar = this.ad[i2];
                if (bxVar != null) {
                    if (!bxVar.ad(this.aj, this.ai * 680923509, this.ae)) {
                        return (int[][]) null;
                    }
                    iArr[i2] = Arrays.copyOf(bxVar.ax, bxVar.ax.length);
                }
            }
            return iArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int[] ar(int i, int i2) {
        try {
            bx bxVar = this.ad[i];
            if (bxVar != null) {
                if (bxVar.ax != null) {
                    this.aq.ar(bxVar);
                    bxVar.aw = true;
                    return bxVar.ax;
                } else if (bxVar.ad(this.aj, this.ai * 680923509, this.ae)) {
                    if (this.al * -1720003361 == 0) {
                        ((bx) this.aq.ai()).aq();
                    } else {
                        this.al += 631904481;
                    }
                    this.aq.ar(bxVar);
                    bxVar.aw = true;
                    return bxVar.ax;
                }
            }
            return null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int[][] as() {
        int[][] iArr = new int[this.ad.length][];
        for (int i = 0; i < this.ad.length; i++) {
            bx bxVar = this.ad[i];
            if (bxVar != null) {
                if (!bxVar.ad(this.aj, this.ai * 1873243731, this.ae)) {
                    return (int[][]) null;
                }
                iArr[i] = Arrays.copyOf(bxVar.ax, bxVar.ax.length);
            }
        }
        return iArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void at(double d) {
        try {
            this.aj = d;
            bk(-76635718);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int[] au(int i) {
        bx bxVar = this.ad[i];
        if (bxVar != null) {
            if (bxVar.ax != null) {
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            } else if (bxVar.ad(this.aj, this.ai * 680923509, this.ae)) {
                if (this.al * -1720003361 == 0) {
                    ((bx) this.aq.ai()).aq();
                } else {
                    this.al += 631904481;
                }
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            }
        }
        return null;
    }

    public int av(int i) {
        try {
            bx[] bxVarArr = this.ad;
            int i2 = 0;
            int i3 = 0;
            for (bx bxVar : bxVarArr) {
                int i4;
                if (bxVar == null) {
                    i4 = i2;
                } else if (bxVar.ae == null) {
                    i4 = i2;
                } else {
                    i4 = bxVar.ae.length + i2;
                    int[] iArr = bxVar.ae;
                    i2 = i3;
                    for (int i32 : iArr) {
                        if (this.ae.ai(i32, (byte) 78)) {
                            i2++;
                        }
                    }
                    i32 = i2;
                }
                i2 = i4;
            }
            return i2 == 0 ? 0 : (i32 * 100) / i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cv.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int aw(int i) {
        return this.ad[i] != null ? this.ad[i].aj : 0;
    }

    public int ax(int i) {
        return this.ad[i] != null ? this.ad[i].aj : 0;
    }

    public boolean ay(int i) {
        return -356911796 == this.ai * -248391932;
    }

    public int[] az(int i) {
        bx bxVar = this.ad[i];
        if (bxVar != null) {
            if (bxVar.ax != null) {
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            } else if (bxVar.ad(this.aj, this.ai * 680923509, this.ae)) {
                if (this.al * -1720003361 == 0) {
                    ((bx) this.aq.ai()).aq();
                } else {
                    this.al += 631904481;
                }
                this.aq.ar(bxVar);
                bxVar.aw = true;
                return bxVar.ax;
            }
        }
        return null;
    }

    public void ba(int i, int i2) {
        int i3 = 0;
        while (i3 < this.ad.length) {
            try {
                bx bxVar = this.ad[i3];
                if (!(bxVar == null || bxVar.ag == 0)) {
                    bxVar.ar(i);
                }
                i3++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cv.ba(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void bb() {
        for (int i = 0; i < this.ad.length; i++) {
            if (this.ad[i] != null) {
                this.ad[i].aq();
            }
        }
        this.aq = new fy();
        this.al = this.ar * -1588449817;
    }

    public void bc() {
        for (int i = 0; i < this.ad.length; i++) {
            if (this.ad[i] != null) {
                this.ad[i].aq();
            }
        }
        this.aq = new fy();
        this.al = this.ar * -1588449817;
    }

    /* Access modifiers changed, original: 0000 */
    public void bd(double d) {
        this.aj = d;
        bk(-938814520);
    }

    public void bf() {
        for (int i = 0; i < this.ad.length; i++) {
            if (this.ad[i] != null) {
                this.ad[i].aq();
            }
        }
        this.aq = new fy();
        this.al = this.ar * -1056878439;
    }

    public void bi() {
        for (int i = 0; i < this.ad.length; i++) {
            if (this.ad[i] != null) {
                this.ad[i].aq();
            }
        }
        this.aq = new fy();
        this.al = this.ar * 1229085582;
    }

    public void bk(int i) {
        int i2 = 0;
        while (i2 < this.ad.length) {
            try {
                if (this.ad[i2] != null) {
                    this.ad[i2].aq();
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cv.bk(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        this.aq = new fy();
        this.al = this.ar * -1588449817;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(double d) {
        this.aj = d;
        bk(-612343420);
    }

    public int bm() {
        bx[] bxVarArr = this.ad;
        int i = 0;
        int i2 = 0;
        for (bx bxVar : bxVarArr) {
            if (!(bxVar == null || bxVar.ae == null)) {
                int length = bxVar.ae.length + i;
                int[] iArr = bxVar.ae;
                for (int ai : iArr) {
                    if (this.ae.ai(ai, (byte) 19)) {
                        i2++;
                    }
                }
                i = length;
            }
        }
        return i == 0 ? 0 : (i2 * 100) / i;
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(double d) {
        this.aj = d;
        bk(-1196890681);
    }

    public int bq() {
        bx[] bxVarArr = this.ad;
        int i = 0;
        int i2 = 0;
        for (bx bxVar : bxVarArr) {
            if (!(bxVar == null || bxVar.ae == null)) {
                int length = bxVar.ae.length + i;
                int[] iArr = bxVar.ae;
                for (int ai : iArr) {
                    if (this.ae.ai(ai, (byte) 68)) {
                        i2++;
                    }
                }
                i = length;
            }
        }
        return i == 0 ? 0 : (i2 * 100) / i;
    }

    public int bs() {
        bx[] bxVarArr = this.ad;
        int i = 0;
        int i2 = 0;
        for (bx bxVar : bxVarArr) {
            if (!(bxVar == null || bxVar.ae == null)) {
                int length = bxVar.ae.length + i;
                int[] iArr = bxVar.ae;
                for (int ai : iArr) {
                    if (this.ae.ai(ai, (byte) 73)) {
                        i2++;
                    }
                }
                i = length;
            }
        }
        return i == 0 ? 0 : (i2 * 100) / i;
    }
}
