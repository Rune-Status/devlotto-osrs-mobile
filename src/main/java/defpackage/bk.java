package defpackage;

/* renamed from: bk */
public class bk {
    static int[] ad = new int[500];
    static int[] al = new int[500];
    static int[] aq = new int[500];
    static int[] ar = new int[500];
    int[] ae;
    boolean ag = false;
    int ai = -1;
    bj aj = null;
    int[] ak;
    int[] am;
    int[] as;

    bk(byte[] bArr, bj bjVar) {
        int i = -1;
        this.aj = bjVar;
        lj ljVar = new lj(bArr);
        lj ljVar2 = new lj(bArr);
        ljVar.al = -1759647814;
        int af = ljVar.af(1804771424);
        ljVar2.al = ((ljVar.al * -1631454091) + af) * -879823907;
        int i2 = 0;
        for (int i3 = 0; i3 < af; i3++) {
            int af2 = ljVar.af(1804771424);
            if (af2 > 0) {
                if (this.aj.ar[i3] != 0) {
                    for (int i4 = i3 - 1; i4 > i; i4--) {
                        if (this.aj.ar[i4] == 0) {
                            ad[i2] = i4;
                            aq[i2] = 0;
                            ar[i2] = 0;
                            al[i2] = 0;
                            i2++;
                            break;
                        }
                    }
                }
                ad[i2] = i3;
                boolean z = this.aj.ar[i3] == 3 ? true : false;
                if ((af2 & 1) != 0) {
                    aq[i2] = ljVar2.bo((byte) 8);
                } else {
                    aq[i2] = z;
                }
                if ((af2 & 2) != 0) {
                    ar[i2] = ljVar2.bo((byte) -116);
                } else {
                    ar[i2] = z;
                }
                if ((af2 & 4) != 0) {
                    al[i2] = ljVar2.bo((byte) -54);
                } else {
                    al[i2] = z;
                }
                i2++;
                if (this.aj.ar[i3] == 5) {
                    this.ag = true;
                }
                i = i3;
            }
        }
        if (ljVar2.al * -1631454091 == bArr.length) {
            this.ai = i2;
            this.ae = new int[i2];
            this.am = new int[i2];
            this.ak = new int[i2];
            this.as = new int[i2];
            for (i = 0; i < i2; i++) {
                this.ae[i] = ad[i];
                this.am[i] = aq[i];
                this.ak[i] = ar[i];
                this.as[i] = al[i];
            }
            return;
        }
        throw new RuntimeException();
    }
}
