package defpackage;

/* renamed from: gm */
public class gm {
    int ad;
    int[] al;
    int aq;
    int[] ar;

    gm() {
        gy.al(16);
        this.ad = gy.ar() != 0 ? gy.al(4) + 1 : 1;
        if (gy.ar() != 0) {
            gy.al(8);
        }
        gy.al(2);
        if (this.ad > 1) {
            this.aq = gy.al(4);
        }
        this.ar = new int[this.ad];
        this.al = new int[this.ad];
        for (int i = 0; i < this.ad; i++) {
            gy.al(8);
            this.ar[i] = gy.al(8);
            this.al[i] = gy.al(8);
        }
    }
}
