package defpackage;

/* renamed from: bm */
public final class bm {
    static final int ag = 50;
    int ad;
    public br ae;
    public br ai;
    int aj;
    int ak;
    int al;
    public long am;
    int aq;
    int ar;

    bm() {
        try {
            this.am = 0;
            this.ak = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bm.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int af(int i, int i2, int i3, int i4) {
        int i5;
        if (i3 > 179) {
            try {
                i5 = i2 / 2;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bm.af(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        i5 = i2;
        if (i3 > 192) {
            i5 /= 2;
        }
        if (i3 > 217) {
            i5 /= 2;
        }
        if (i3 > 243) {
            i5 /= 2;
        }
        return (((i5 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static void fe(al[] alVarArr, al alVar, boolean z, int i) {
        int i2 = 901029295;
        try {
            int i3;
            int i4 = alVar.bu * -1004867185 != 0 ? -1004867185 * alVar.bu : alVar.bl * 1272191791;
            if (alVar.bw * 901029295 != 0) {
                i3 = alVar.bw;
            } else {
                i3 = alVar.bf;
                i2 = 1813264797;
            }
            int i5 = i3 * i2;
            cc.fk(alVarArr, alVar.ao * -1227024251, i4, i5, z, -2111930782);
            if (alVar.fo != null) {
                cc.fk(alVar.fo, alVar.ao * -1227024251, i4, i5, z, 268246837);
            }
            is isVar = (is) client.kd.ad((long) (alVar.ao * -1227024251));
            if (isVar != null) {
                io.fl(isVar.ad * 1810639839, i4, i5, z, 148090949);
            }
            i2 = alVar.an;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bm.fe(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final String go(int i, byte b) {
        if (i >= 999999999) {
            return "*";
        }
        try {
            return Integer.toString(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bm.go(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
