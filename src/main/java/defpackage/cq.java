package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* renamed from: cq */
public class cq extends dm {
    public static final int bk = 27;
    public static final int cb = 1009;
    public static final int dq = 1;
    static int fz;
    HashSet ad;
    HashSet aq;
    List ar;

    cq() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static hw ad(int i, byte b) {
        try {
            long j = (long) i;
            hw hwVar = (hw) hw.ad.ad(j);
            if (hwVar != null) {
                return hwVar;
            }
            byte[] ar = at.dr.ar(i, 0, 1055242684);
            if (ar == null) {
                return null;
            }
            hwVar = is.al(ar, -661538991);
            hw.ad.ar(hwVar, j);
            return hwVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ak(Collection collection, byte b) {
        try {
            collection.add(dy.al);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cq.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void al(int i, int i2, int i3, int i4, int i5) {
        try {
            jl jlVar;
            long j = (long) i;
            jl jlVar2 = (jl) jl.ad.ad(j);
            if (jlVar2 == null) {
                jlVar2 = new jl();
                jl.ad.aq(jlVar2, j);
                jlVar = jlVar2;
            } else {
                jlVar = jlVar2;
            }
            if (jlVar.aq.length <= i2) {
                int i6 = i2 + 1;
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                for (i6 = 0; i6 < jlVar.aq.length; i6++) {
                    iArr[i6] = jlVar.aq[i6];
                    iArr2[i6] = jlVar.ar[i6];
                }
                for (i6 = jlVar.aq.length; i6 < i2; i6++) {
                    iArr[i6] = -1;
                    iArr2[i6] = 0;
                }
                jlVar.aq = iArr;
                jlVar.ar = iArr2;
            }
            jlVar.aq[i2] = i3;
            jlVar.ar[i2] = i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cq.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void in(int i) {
        try {
            if (1 == client.ha * -1897849765) {
                client.hj = true;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cq.in(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(lj ljVar, lj ljVar2, int i, boolean z, int i2) {
        int i3 = 0;
        try {
            int i4;
            ae(ljVar, i, -578498222);
            int an = ljVar2.an(-1464407032);
            this.ad = new HashSet(an);
            for (i4 = 0; i4 < an; i4++) {
                cb cbVar = new cb();
                try {
                    cbVar.ad(ljVar2, -737586984);
                    this.ad.add(cbVar);
                } catch (IllegalStateException e) {
                }
            }
            i4 = ljVar2.an(-1464407032);
            this.aq = new HashSet(i4);
            while (i3 < i4) {
                cz czVar = new cz();
                try {
                    czVar.ad(ljVar2, -173311323);
                    this.aq.add(czVar);
                } catch (IllegalStateException e2) {
                }
                i3++;
            }
            aq(ljVar2, z, 1813264797);
        } catch (RuntimeException e3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e3, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(lj ljVar, boolean z) {
        this.ar = new LinkedList();
        int an = ljVar.an(-1464407032);
        for (int i = 0; i < an; i++) {
            int bi = ljVar.bi(-349523545);
            ag agVar = new ag(ljVar.at((byte) -4));
            Object obj = ljVar.af(1804771424) == 1 ? 1 : null;
            if (z || obj == null) {
                this.ar.add(new cg(null, agVar, bi, null));
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(lj ljVar, boolean z) {
        this.ar = new LinkedList();
        int an = ljVar.an(-1464407032);
        for (int i = 0; i < an; i++) {
            int bi = ljVar.bi(2112900529);
            ag agVar = new ag(ljVar.at((byte) -73));
            Object obj = ljVar.af(1804771424) == 1 ? 1 : null;
            if (z || obj == null) {
                this.ar.add(new cg(null, agVar, bi, null));
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, lj ljVar2, int i, boolean z) {
        int i2;
        int i3 = 0;
        ae(ljVar, i, 556957387);
        int an = ljVar2.an(-1464407032);
        this.ad = new HashSet(an);
        for (i2 = 0; i2 < an; i2++) {
            cb cbVar = new cb();
            try {
                cbVar.ad(ljVar2, -737586984);
                this.ad.add(cbVar);
            } catch (IllegalStateException e) {
            }
        }
        i2 = ljVar2.an(-1464407032);
        this.aq = new HashSet(i2);
        while (i3 < i2) {
            cz czVar = new cz();
            try {
                czVar.ad(ljVar2, -34649828);
                this.aq.add(czVar);
            } catch (IllegalStateException e2) {
            }
            i3++;
        }
        aq(ljVar2, z, 1813264797);
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(lj ljVar, boolean z, int i) {
        try {
            this.ar = new LinkedList();
            int an = ljVar.an(-1464407032);
            for (int i2 = 0; i2 < an; i2++) {
                int bi = ljVar.bi(-732730913);
                ag agVar = new ag(ljVar.at((byte) -39));
                Object obj = ljVar.af(1804771424) == 1 ? 1 : null;
                if (z || obj == null) {
                    this.ar.add(new cg(null, agVar, bi, null));
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cq.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, lj ljVar2, int i, boolean z) {
        int i2;
        int i3 = 0;
        ae(ljVar, i, -438238291);
        int an = ljVar2.an(-1464407032);
        this.ad = new HashSet(an);
        for (i2 = 0; i2 < an; i2++) {
            cb cbVar = new cb();
            try {
                cbVar.ad(ljVar2, -737586984);
                this.ad.add(cbVar);
            } catch (IllegalStateException e) {
            }
        }
        i2 = ljVar2.an(-1464407032);
        this.aq = new HashSet(i2);
        while (i3 < i2) {
            cz czVar = new cz();
            try {
                czVar.ad(ljVar2, -148409051);
                this.aq.add(czVar);
            } catch (IllegalStateException e2) {
            }
            i3++;
        }
        aq(ljVar2, z, 1813264797);
    }
}
