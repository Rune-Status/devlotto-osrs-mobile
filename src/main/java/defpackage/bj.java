package defpackage;

/* renamed from: bj */
public class bj extends mb {
    static final int bf = 4;
    int ad;
    int[] ai;
    int[] aj;
    int[][] al;
    int aq;
    int[] ar;

    bj(int i, byte[] bArr) {
        int i2 = 0;
        try {
            int i3;
            this.ad = 1723670255 * i;
            lj ljVar = new lj(bArr);
            this.aq = ljVar.af(1804771424) * 772107549;
            this.ar = new int[(this.aq * 1039842613)];
            this.al = new int[(this.aq * 1039842613)][];
            this.aj = new int[(this.aq * -88263424)];
            this.ai = new int[(this.aq * 1039842613)];
            for (i3 = 0; i3 < this.aq * 1039842613; i3++) {
                this.ar[i3] = ljVar.af(1804771424);
            }
            for (i3 = 0; i3 < this.aq * 1039842613; i3++) {
                this.al[i3] = new int[ljVar.af(1804771424)];
            }
            for (i3 = 0; i3 < this.aq * 1039842613; i3++) {
                for (int i4 = 0; i4 < this.al[i3].length; i4++) {
                    int[] iArr = this.aj;
                    int[] iArr2 = this.al[i3];
                    int af = ljVar.af(1804771424);
                    iArr2[i4] = af;
                    iArr[(i3 * 256) + i4] = af;
                }
            }
            while (i2 < this.aq * 1039842613) {
                this.ai[i2] = this.al[i2].length;
                i2++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ap(String str, int i) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(go.hk);
            stringBuilder.append(str);
            stringBuilder.append(go.hh);
            oz.ak(stringBuilder.toString(), -769293814);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("bj.ap(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public static boolean au(CharSequence charSequence, byte b) {
        try {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (!hb.ap(charSequence.charAt(i), 1580024322)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bj.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final is hf(int i, int i2, int i3, byte b) {
        try {
            is isVar = new is();
            isVar.ad = 1164922911 * i2;
            isVar.aq = 2132698751 * i3;
            client.kd.aq(isVar, (long) i);
            it.gx(i2, 1746678869);
            al aq = da.aq(i, -550158556);
            da.gk(aq, (byte) 2);
            if (client.lh != null) {
                da.gk(client.lh, (byte) 2);
                client.lh = null;
            }
            gc.km.bz(859460203);
            bm.fe(dt.ae[i >> 16], aq, false, 1004595905);
            bw.bg(i2, (short) 255);
            if (client.ka * 676917989 != -1) {
                ag.gu(client.ka * 676917989, 1, 59714438);
            }
            return isVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bj.hf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
