package defpackage;

/* renamed from: jl */
public class jl extends mb {
    static ok ad = new ok(32);
    static final int ag = 0;
    static String aw;
    int[] aq;
    int[] ar;

    jl() {
        try {
            this.aq = new int[]{-1};
            this.ar = new int[]{0};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jl.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aa(int i) {
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar != null) {
            jlVar.ky();
        }
    }

    static void ac(int i) {
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar != null) {
            jlVar.ky();
        }
    }

    static void af() {
        ad = new ok(32);
    }

    static int ag(int i, int i2) {
        int i3 = 0;
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar == null || -1 == i2) {
            return 0;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i5 >= jlVar.ar.length) {
                return i4;
            }
            if (i2 == jlVar.aq[i5]) {
                i4 += jlVar.ar[i5];
            }
            i3 = i5 + 1;
        }
    }

    static void ah() {
        ad = new ok(32);
    }

    static int ak(int i, int i2) {
        int i3 = 0;
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar == null || -1 == i2) {
            return 0;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i5 >= jlVar.ar.length) {
                return i4;
            }
            if (i2 == jlVar.aq[i5]) {
                i4 += jlVar.ar[i5];
            }
            i3 = i5 + 1;
        }
    }

    static int am(int i, int i2) {
        jl jlVar = (jl) ad.ad((long) i);
        return jlVar == null ? -1 : i2 >= 0 ? i2 >= jlVar.aq.length ? -1 : jlVar.aq[i2] : -1;
    }

    static void ao() {
        ad = new ok(1721337022);
    }

    static void ap(int i, int i2, int i3, int i4) {
        long j = (long) i;
        jl jlVar = (jl) ad.ad(j);
        if (jlVar == null) {
            jlVar = new jl();
            ad.aq(jlVar, j);
        }
        if (jlVar.aq.length <= i2) {
            int i5 = i2 + 1;
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            for (i5 = 0; i5 < jlVar.aq.length; i5++) {
                iArr[i5] = jlVar.aq[i5];
                iArr2[i5] = jlVar.ar[i5];
            }
            for (i5 = jlVar.aq.length; i5 < i2; i5++) {
                iArr[i5] = -1;
                iArr2[i5] = 0;
            }
            jlVar.aq = iArr;
            jlVar.ar = iArr2;
        }
        jlVar.aq[i2] = i3;
        jlVar.ar[i2] = i4;
    }

    static int as(int i, int i2) {
        int i3 = 0;
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar == null || -1 == i2) {
            return 0;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i5 >= jlVar.ar.length) {
                return i4;
            }
            if (i2 == jlVar.aq[i5]) {
                i4 += jlVar.ar[i5];
            }
            i3 = i5 + 1;
        }
    }

    static void au(int i, int i2, int i3, int i4) {
        long j = (long) i;
        jl jlVar = (jl) ad.ad(j);
        if (jlVar == null) {
            jlVar = new jl();
            ad.aq(jlVar, j);
        }
        if (jlVar.aq.length <= i2) {
            int i5 = i2 + 1;
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            for (i5 = 0; i5 < jlVar.aq.length; i5++) {
                iArr[i5] = jlVar.aq[i5];
                iArr2[i5] = jlVar.ar[i5];
            }
            for (i5 = jlVar.aq.length; i5 < i2; i5++) {
                iArr[i5] = -1;
                iArr2[i5] = 0;
            }
            jlVar.aq = iArr;
            jlVar.ar = iArr2;
        }
        jlVar.aq[i2] = i3;
        jlVar.ar[i2] = i4;
    }

    static void aw(int i) {
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar != null) {
            for (int i2 = 0; i2 < jlVar.aq.length; i2++) {
                jlVar.aq[i2] = -1;
                jlVar.ar[i2] = 0;
            }
        }
    }

    static void ax(int i) {
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar != null) {
            for (int i2 = 0; i2 < jlVar.aq.length; i2++) {
                jlVar.aq[i2] = -1;
                jlVar.ar[i2] = 0;
            }
        }
    }

    static void az(int i) {
        jl jlVar = (jl) ad.ad((long) i);
        if (jlVar != null) {
            for (int i2 = 0; i2 < jlVar.aq.length; i2++) {
                jlVar.aq[i2] = -1;
                jlVar.ar[i2] = 0;
            }
        }
    }
}
