package defpackage;

import java.util.Collection;

/* renamed from: dw */
public class dw extends mp {
    static kh ad;
    static gz al = new gz(64, null);
    static kh aq;
    public static int ar;
    public static if ez;
    short[] ae;
    int[] ag;
    int[] ai;
    public int aj;
    short[] ak;
    short[] am;
    public boolean ap;
    short[] as;

    dw() {
        try {
            this.aj = -1675936783;
            this.ag = new int[]{-1, -1, -1, -1, -1};
            this.ap = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dw aa(int i) {
        long j = (long) i;
        dw dwVar = (dw) al.ad(j);
        if (dwVar == null) {
            byte[] ar = ad.ar(3, i, 1278223672);
            dwVar = new dw();
            if (ar != null) {
                dwVar.ar(new lj(ar), 1344489653);
            }
            al.ar(dwVar, j);
        }
        return dwVar;
    }

    public static dw ac(int i) {
        long j = (long) i;
        dw dwVar = (dw) al.ad(j);
        if (dwVar == null) {
            byte[] ar = ad.ar(3, i, 2099235831);
            dwVar = new dw();
            if (ar != null) {
                dwVar.ar(new lj(ar), -1419136347);
            }
            al.ar(dwVar, j);
        }
        return dwVar;
    }

    public static void ag(kh khVar, kh khVar2) {
        ad = khVar;
        aq = khVar2;
        ar = ad.ax(3, (byte) 28) * 507495737;
    }

    public static void ap(kh khVar, kh khVar2) {
        ad = khVar;
        aq = khVar2;
        ar = ad.ax(3, (byte) 105) * 942350042;
    }

    public static void as(kh khVar, kh khVar2) {
        ad = khVar;
        aq = khVar2;
        ar = ad.ax(3, (byte) 18) * 507495737;
    }

    public static void au(kh khVar, kh khVar2) {
        ad = khVar;
        aq = khVar2;
        ar = ad.ax(3, (byte) 49) * 1941456908;
    }

    static void av(boolean z, int i) {
        try {
            hm.cz = go.il;
            hm.cd = go.it;
            hm.cf = go.ij;
            hm.cu = 396410022;
            if (z) {
                hm.ch = "";
            }
            ki.ai((byte) 10);
            ck.ay(-2117050765);
            bh.am(1754511252);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dw.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dw aw(int i) {
        long j = (long) i;
        dw dwVar = (dw) al.ad(j);
        if (dwVar == null) {
            byte[] ar = ad.ar(3, i, 1822985416);
            dwVar = new dw();
            if (ar != null) {
                dwVar.ar(new lj(ar), 1099884316);
            }
            al.ar(dwVar, j);
        }
        return dwVar;
    }

    public static dw ax(int i) {
        long j = (long) i;
        dw dwVar = (dw) al.ad(j);
        if (dwVar == null) {
            byte[] ar = ad.ar(3, i, 2037310113);
            dwVar = new dw();
            if (ar != null) {
                dwVar.ar(new lj(ar), 1283008247);
            }
            al.ar(dwVar, j);
        }
        return dwVar;
    }

    public static dw az(int i) {
        long j = (long) i;
        dw dwVar = (dw) al.ad(j);
        if (dwVar == null) {
            byte[] ar = ad.ar(3, i, 2101777246);
            dwVar = new dw();
            if (ar != null) {
                dwVar.ar(new lj(ar), 1648289958);
            }
            al.ar(dwVar, j);
        }
        return dwVar;
    }

    public static oi az(byte[] bArr, byte[] bArr2, int i) {
        try {
            ab.ay(bArr, 761824442);
            return cu.ao(bArr2, -2016462584);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dw.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bd(Collection collection) {
        collection.add(al);
    }

    public static void bo(Collection collection) {
        collection.add(al);
    }

    public boolean ab() {
        boolean z = true;
        if (this.ai != null) {
            for (int aj : this.ai) {
                if (!aq.aj(aj, 0, 819795708)) {
                    z = false;
                }
            }
        }
        return z;
    }

    public boolean ae(int i) {
        boolean z = true;
        int i2 = 0;
        while (i2 < 5) {
            try {
                if (!(-1 == this.ag[i2] || aq.aj(this.ag[i2], 0, -1129009927))) {
                    z = false;
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dw.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void af(lj ljVar, int i) {
        int i2 = 0;
        int af;
        if (1 == i) {
            this.aj = ljVar.af(1804771424) * 1675936783;
        } else if (2 == i) {
            af = ljVar.af(1804771424);
            this.ai = new int[af];
            while (i2 < af) {
                this.ai[i2] = ljVar.an(-1464407032);
                i2++;
            }
        } else if (3 == i) {
            this.ap = true;
        } else if (i == 40) {
            af = ljVar.af(1804771424);
            this.ae = new short[af];
            this.am = new short[af];
            while (i2 < af) {
                this.ae[i2] = (short) ljVar.an(-1464407032);
                this.am[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == 41) {
            af = ljVar.af(1804771424);
            this.ak = new short[af];
            this.as = new short[af];
            while (i2 < af) {
                this.ak[i2] = (short) ljVar.an(-1464407032);
                this.as[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i >= 60 && i < 70) {
            this.ag[i - 60] = ljVar.an(-1464407032);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 2135660241);
            } else {
                return;
            }
        }
    }

    public bo ai(int i) {
        int i2 = 0;
        if (this.ai == null) {
            return null;
        }
        bo[] boVarArr = new bo[this.ai.length];
        for (int i3 = 0; i3 < this.ai.length; i3++) {
            boVarArr[i3] = bo.ad(aq, this.ai[i3], 0);
        }
        bo boVar = boVarArr.length == 1 ? boVarArr[0] : new bo(boVarArr, boVarArr.length);
        try {
            if (this.ae != null) {
                for (int i4 = 0; i4 < this.ae.length; i4++) {
                    boVar.au(this.ae[i4], this.am[i4]);
                }
            }
            if (this.ak == null) {
                return boVar;
            }
            while (i2 < this.ak.length) {
                boVar.az(this.ak[i2], this.as[i2]);
                i2++;
            }
            return boVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dw.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aj(int i) {
        boolean z = true;
        try {
            if (this.ai != null) {
                for (int aj : this.ai) {
                    if (!aq.aj(aj, 0, 1542412207)) {
                        z = false;
                    }
                }
            }
            return z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dw.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        int i3 = 0;
        int af;
        if (1 == i) {
            try {
                this.aj = ljVar.af(1804771424) * 1675936783;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dw.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            af = ljVar.af(1804771424);
            this.ai = new int[af];
            while (i3 < af) {
                this.ai[i3] = ljVar.an(-1464407032);
                i3++;
            }
        } else if (3 == i) {
            this.ap = true;
        } else if (i == 40) {
            af = ljVar.af(1804771424);
            this.ae = new short[af];
            this.am = new short[af];
            while (i3 < af) {
                this.ae[i3] = (short) ljVar.an(-1464407032);
                this.am[i3] = (short) ljVar.an(-1464407032);
                i3++;
            }
        } else if (i == 41) {
            af = ljVar.af(1804771424);
            this.ak = new short[af];
            this.as = new short[af];
            while (i3 < af) {
                this.ak[i3] = (short) ljVar.an(-1464407032);
                this.as[i3] = (short) ljVar.an(-1464407032);
                i3++;
            }
        } else if (i >= 60 && i < 70) {
            this.ag[i - 60] = ljVar.an(-1464407032);
        }
    }

    public bo am(byte b) {
        try {
            bo[] boVarArr = new bo[5];
            int i = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                if (this.ag[i2] != -1) {
                    boVarArr[i] = bo.ad(aq, this.ag[i2], 0);
                    i++;
                }
            }
            bo boVar = new bo(boVarArr, i);
            if (this.ae != null) {
                for (i = 0; i < this.ae.length; i++) {
                    boVar.au(this.ae[i], this.am[i]);
                }
            }
            if (this.ak != null) {
                for (i = 0; i < this.ak.length; i++) {
                    boVar.az(this.ak[i], this.as[i]);
                }
            }
            return boVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dw.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean an() {
        boolean z = true;
        if (this.ai != null) {
            for (int aj : this.ai) {
                if (!aq.aj(aj, 0, 1926020047)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 2141254155);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, 2133106129);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dw.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public bo at() {
        int i = 0;
        if (this.ai == null) {
            return null;
        }
        bo[] boVarArr = new bo[this.ai.length];
        for (int i2 = 0; i2 < this.ai.length; i2++) {
            boVarArr[i2] = bo.ad(aq, this.ai[i2], 0);
        }
        bo boVar = boVarArr.length == 1 ? boVarArr[0] : new bo(boVarArr, boVarArr.length);
        if (this.ae != null) {
            for (int i3 = 0; i3 < this.ae.length; i3++) {
                boVar.au(this.ae[i3], this.am[i3]);
            }
        }
        if (this.ak == null) {
            return boVar;
        }
        while (i < this.ak.length) {
            boVar.az(this.ak[i], this.as[i]);
            i++;
        }
        return boVar;
    }

    public boolean av() {
        boolean z = true;
        if (this.ai != null) {
            for (int aj : this.ai) {
                if (!aq.aj(aj, 0, 974498051)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(lj ljVar, int i) {
        int i2 = 0;
        int af;
        if (1 == i) {
            this.aj = ljVar.af(1804771424) * 1675936783;
        } else if (2 == i) {
            af = ljVar.af(1804771424);
            this.ai = new int[af];
            while (i2 < af) {
                this.ai[i2] = ljVar.an(-1464407032);
                i2++;
            }
        } else if (3 == i) {
            this.ap = true;
        } else if (i == 295278393) {
            af = ljVar.af(1804771424);
            this.ae = new short[af];
            this.am = new short[af];
            while (i2 < af) {
                this.ae[i2] = (short) ljVar.an(-1464407032);
                this.am[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == 41) {
            af = ljVar.af(1804771424);
            this.ak = new short[af];
            this.as = new short[af];
            while (i2 < af) {
                this.ak[i2] = (short) ljVar.an(-1464407032);
                this.as[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i >= -674681079 && i < 70) {
            this.ag[i - 60] = ljVar.an(-1464407032);
        }
    }

    public boolean ba() {
        boolean z = true;
        int i = 0;
        while (i < 5) {
            if (!(-1 == this.ag[i] || aq.aj(this.ag[i], 0, 766468213))) {
                z = false;
            }
            i++;
        }
        return z;
    }

    public bo bk() {
        int i = 0;
        if (this.ai == null) {
            return null;
        }
        bo[] boVarArr = new bo[this.ai.length];
        for (int i2 = 0; i2 < this.ai.length; i2++) {
            boVarArr[i2] = bo.ad(aq, this.ai[i2], 0);
        }
        bo boVar = boVarArr.length == 1 ? boVarArr[0] : new bo(boVarArr, boVarArr.length);
        if (this.ae != null) {
            for (int i3 = 0; i3 < this.ae.length; i3++) {
                boVar.au(this.ae[i3], this.am[i3]);
            }
        }
        if (this.ak == null) {
            return boVar;
        }
        while (i < this.ak.length) {
            boVar.az(this.ak[i], this.as[i]);
            i++;
        }
        return boVar;
    }

    public boolean bm() {
        boolean z = true;
        int i = 0;
        while (i < 5) {
            if (!(-1 == this.ag[i] || aq.aj(this.ag[i], 0, 636529450))) {
                z = false;
            }
            i++;
        }
        return z;
    }

    public boolean bq() {
        boolean z = true;
        int i = 0;
        while (i < 5) {
            if (!(-1 == this.ag[i] || aq.aj(this.ag[i], 0, 883715578))) {
                z = false;
            }
            i++;
        }
        return z;
    }

    public boolean bs() {
        boolean z = true;
        int i = 0;
        while (i < 5) {
            if (!(-1 == this.ag[i] || aq.aj(this.ag[i], 0, -288577390))) {
                z = false;
            }
            i++;
        }
        return z;
    }
}
