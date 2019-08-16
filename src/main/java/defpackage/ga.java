package defpackage;

/* renamed from: ga */
public class ga {
    static final int[] ad = new int[]{256, 128, 86, 64};
    static int[] ag;
    static boolean[] ap;
    static final float[] aq = new float[]{1.0649863E-7f, 1.1341951E-7f, 1.2079015E-7f, 1.2863978E-7f, 1.369995E-7f, 1.459025E-7f, 1.5538409E-7f, 1.6548181E-7f, 1.7623574E-7f, 1.8768856E-7f, 1.998856E-7f, 2.128753E-7f, 2.2670913E-7f, 2.4144197E-7f, 2.5713223E-7f, 2.7384212E-7f, 2.9163792E-7f, 3.1059022E-7f, 3.307741E-7f, 3.5226967E-7f, 3.7516213E-7f, 3.995423E-7f, 4.255068E-7f, 4.5315863E-7f, 4.8260745E-7f, 5.1397E-7f, 5.4737063E-7f, 5.829419E-7f, 6.208247E-7f, 6.611694E-7f, 7.041359E-7f, 7.4989464E-7f, 7.98627E-7f, 8.505263E-7f, 9.057983E-7f, 9.646621E-7f, 1.0273513E-6f, 1.0941144E-6f, 1.1652161E-6f, 1.2409384E-6f, 1.3215816E-6f, 1.4074654E-6f, 1.4989305E-6f, 1.5963394E-6f, 1.7000785E-6f, 1.8105592E-6f, 1.9282195E-6f, 2.053526E-6f, 2.1869757E-6f, 2.3290977E-6f, 2.4804558E-6f, 2.6416496E-6f, 2.813319E-6f, 2.9961443E-6f, 3.1908505E-6f, 3.39821E-6f, 3.619045E-6f, 3.8542307E-6f, 4.1047006E-6f, 4.371447E-6f, 4.6555283E-6f, 4.958071E-6f, 5.280274E-6f, 5.623416E-6f, 5.988857E-6f, 6.3780467E-6f, 6.7925284E-6f, 7.2339453E-6f, 7.704048E-6f, 8.2047E-6f, 8.737888E-6f, 9.305725E-6f, 9.910464E-6f, 1.0554501E-5f, 1.1240392E-5f, 1.1970856E-5f, 1.2748789E-5f, 1.3577278E-5f, 1.4459606E-5f, 1.5399271E-5f, 1.6400005E-5f, 1.7465769E-5f, 1.8600793E-5f, 1.9809577E-5f, 2.1096914E-5f, 2.2467912E-5f, 2.3928002E-5f, 2.5482977E-5f, 2.7139005E-5f, 2.890265E-5f, 3.078091E-5f, 3.2781227E-5f, 3.4911533E-5f, 3.718028E-5f, 3.9596467E-5f, 4.2169668E-5f, 4.491009E-5f, 4.7828602E-5f, 5.0936775E-5f, 5.424693E-5f, 5.7772202E-5f, 6.152657E-5f, 6.552491E-5f, 6.9783084E-5f, 7.4317984E-5f, 7.914758E-5f, 8.429104E-5f, 8.976875E-5f, 9.560242E-5f, 1.0181521E-4f, 1.0843174E-4f, 1.1547824E-4f, 1.2298267E-4f, 1.3097477E-4f, 1.3948625E-4f, 1.4855085E-4f, 1.5820454E-4f, 1.6848555E-4f, 1.7943469E-4f, 1.9109536E-4f, 2.0351382E-4f, 2.167393E-4f, 2.3082423E-4f, 2.4582449E-4f, 2.6179955E-4f, 2.7881275E-4f, 2.9693157E-4f, 3.1622787E-4f, 3.3677815E-4f, 3.5866388E-4f, 3.8197188E-4f, 4.0679457E-4f, 4.3323037E-4f, 4.613841E-4f, 4.913675E-4f, 5.2329927E-4f, 5.573062E-4f, 5.935231E-4f, 6.320936E-4f, 6.731706E-4f, 7.16917E-4f, 7.635063E-4f, 8.1312325E-4f, 8.6596457E-4f, 9.2223985E-4f, 9.821722E-4f, 0.0010459992f, 0.0011139743f, 0.0011863665f, 0.0012634633f, 0.0013455702f, 0.0014330129f, 0.0015261382f, 0.0016253153f, 0.0017309374f, 0.0018434235f, 0.0019632196f, 0.0020908006f, 0.0022266726f, 0.0023713743f, 0.0025254795f, 0.0026895993f, 0.0028643848f, 0.0030505287f, 0.003248769f, 0.0034598925f, 0.0036847359f, 0.0039241905f, 0.0041792067f, 0.004450795f, 0.004740033f, 0.005048067f, 0.0053761187f, 0.005725489f, 0.0060975635f, 0.0064938175f, 0.0069158226f, 0.0073652514f, 0.007843887f, 0.008353627f, 0.008896492f, 0.009474637f, 0.010090352f, 0.01074608f, 0.011444421f, 0.012188144f, 0.012980198f, 0.013823725f, 0.014722068f, 0.015678791f, 0.016697686f, 0.017782796f, 0.018938422f, 0.020169148f, 0.021479854f, 0.022875736f, 0.02436233f, 0.025945531f, 0.027631618f, 0.029427277f, 0.031339627f, 0.03337625f, 0.035545226f, 0.037855156f, 0.0403152f, 0.042935107f, 0.045725275f, 0.048696756f, 0.05186135f, 0.05523159f, 0.05882085f, 0.062643364f, 0.06671428f, 0.07104975f, 0.075666964f, 0.08058423f, 0.08582105f, 0.09139818f, 0.097337745f, 0.1036633f, 0.11039993f, 0.11757434f, 0.12521498f, 0.13335215f, 0.14201812f, 0.15124726f, 0.16107617f, 0.1715438f, 0.18269168f, 0.19456401f, 0.20720787f, 0.22067343f, 0.23501402f, 0.25028655f, 0.26655158f, 0.28387362f, 0.3023213f, 0.32196787f, 0.34289113f, 0.36517414f, 0.3889052f, 0.41417846f, 0.44109413f, 0.4697589f, 0.50028646f, 0.53279793f, 0.5674221f, 0.6042964f, 0.64356697f, 0.6853896f, 0.72993004f, 0.777365f, 0.8278826f, 0.88168305f, 0.9389798f, 1.0f};
    static int[] as;
    int[] ae;
    int[] ai;
    int[] aj;
    int[][] ak;
    int al;
    int[] am;
    int[] ar;

    ga() {
        int i = 2;
        if (gy.al(16) == 1) {
            int i2;
            int al;
            int al2;
            int al3 = gy.al(5);
            this.aj = new int[al3];
            int i3 = 0;
            for (i2 = 0; i2 < al3; i2++) {
                al = gy.al(4);
                this.aj[i2] = al;
                if (al >= i3) {
                    i3 = al + 1;
                }
            }
            this.ai = new int[i3];
            this.ae = new int[i3];
            this.am = new int[i3];
            this.ak = new int[i3][];
            for (al = 0; al < i3; al++) {
                this.ai[al] = gy.al(3) + 1;
                int[] iArr = this.ae;
                al2 = gy.al(2);
                iArr[al] = al2;
                if (al2 != 0) {
                    this.am[al] = gy.al(8);
                }
                al2 = 1 << al2;
                int[] iArr2 = new int[al2];
                this.ak[al] = iArr2;
                for (i2 = 0; i2 < al2; i2++) {
                    iArr2[i2] = gy.al(8) - 1;
                }
            }
            this.al = gy.al(2) + 1;
            al = gy.al(4);
            i3 = 2;
            for (i2 = 0; i2 < al3; i2++) {
                i3 += this.ai[this.aj[i2]];
            }
            this.ar = new int[i3];
            this.ar[0] = 0;
            this.ar[1] = 1 << al;
            for (i2 = 0; i2 < al3; i2++) {
                al2 = this.aj[i2];
                i3 = 0;
                while (i3 < this.ai[al2]) {
                    this.ar[i] = gy.al(al);
                    i3++;
                    i++;
                }
            }
            if (as == null || as.length < i) {
                as = new int[i];
                ag = new int[i];
                ap = new boolean[i];
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    static int ad(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 >= i2 || i6 <= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int ag(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = -1608740666;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 <= i2 || i6 >= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int ak(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = 1966255060;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 >= i2 || i6 <= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int am(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = -222699953;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 >= i2 || i6 <= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int ap(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 <= i2 || i6 >= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int aq(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 <= i2 || i6 >= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int as(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 <= i2 || i6 >= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int au(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 <= i2 || i6 >= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int ax(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = 453543886;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 <= i2 || i6 >= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    static int az(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            if (i6 <= i2 || i6 >= i4) {
                i6 = i4;
            } else {
                i3 = i5;
            }
            i5++;
            i4 = i6;
        }
        return i3;
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(int i, int i2, int i3, int i4, float[] fArr, int i5) {
        int i6 = i4 - i2;
        int i7 = i3 - i;
        int i8 = i6 < 0 ? -i6 : i6;
        int i9 = i6 / i7;
        int i10 = 0;
        int i11 = i6 < 0 ? i9 - 1 : i9 + 1;
        i6 = i9 < 0 ? -i9 : i9;
        fArr[i] = fArr[i] * aq[i2];
        if (i3 <= i5) {
            i5 = i3;
        }
        while (true) {
            i++;
            if (i < i5) {
                int i12;
                i10 += i8 - (i6 * i7);
                if (i10 >= i7) {
                    i10 -= i7;
                    i12 = i2 + i11;
                } else {
                    i12 = i2 + i9;
                }
                fArr[i] = fArr[i] * aq[i12];
                i2 = i12;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(float[] fArr, int i) {
        int i2;
        int ar;
        int i3;
        int i4;
        int length = this.ar.length;
        int i5 = ad[this.al - 1];
        boolean[] zArr = ap;
        ap[1] = true;
        zArr[0] = true;
        for (i2 = 2; i2 < length; i2++) {
            int ad = ga.ad(as, i2);
            int aq = ga.aq(as, i2);
            ar = ar(as[ad], ag[ad], as[aq], ag[aq], as[i2]);
            i3 = ag[i2];
            i4 = i5 - ar;
            int i6 = i4 < ar ? i4 : ar;
            if (i3 != 0) {
                boolean[] zArr2 = ap;
                ap[aq] = true;
                zArr2[ad] = true;
                ap[i2] = true;
                if (i3 >= (i6 << 1)) {
                    ag[i2] = i4 > ar ? (i3 - ar) + ar : ((ar - i3) + i4) - 1;
                } else {
                    ag[i2] = (i3 & 1) != 0 ? ar - ((i3 + 1) / 2) : (i3 / 2) + ar;
                }
            } else {
                ap[i2] = false;
                ag[i2] = ar;
            }
        }
        aj(0, length - 1);
        ar = ag[0] * this.al;
        i2 = 1;
        i4 = 0;
        while (i2 < length) {
            int i7;
            if (ap[i2]) {
                i3 = as[i2];
                i7 = this.al * ag[i2];
                al(i4, ar, i3, i7, fArr, i);
                if (i3 >= i) {
                    return;
                }
            } else {
                i3 = i4;
                i7 = ar;
            }
            ar = i7;
            i2++;
            i4 = i3;
        }
        float f = aq[ar];
        while (i4 < i) {
            fArr[i4] = fArr[i4] * f;
            i4++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(int i, int i2, int i3, int i4, float[] fArr, int i5) {
        int i6 = i4 - i2;
        int i7 = i3 - i;
        int i8 = i6 < 0 ? -i6 : i6;
        int i9 = i6 / i7;
        int i10 = 0;
        int i11 = i6 < 0 ? i9 - 1 : i9 + 1;
        i6 = i9 < 0 ? -i9 : i9;
        fArr[i] = fArr[i] * aq[i2];
        if (i3 <= i5) {
            i5 = i3;
        }
        while (true) {
            i++;
            if (i < i5) {
                int i12;
                i10 += i8 - (i6 * i7);
                if (i10 >= i7) {
                    i10 -= i7;
                    i12 = i2 + i11;
                } else {
                    i12 = i2 + i9;
                }
                fArr[i] = fArr[i] * aq[i12];
                i2 = i12;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(float[] fArr, int i) {
        int i2;
        int ar;
        int i3;
        int i4;
        int length = this.ar.length;
        int i5 = ad[this.al - 1];
        boolean[] zArr = ap;
        ap[1] = true;
        zArr[0] = true;
        for (i2 = 2; i2 < length; i2++) {
            int ad = ga.ad(as, i2);
            int aq = ga.aq(as, i2);
            ar = ar(as[ad], ag[ad], as[aq], ag[aq], as[i2]);
            i3 = ag[i2];
            i4 = i5 - ar;
            int i6 = i4 < ar ? i4 : ar;
            if (i3 != 0) {
                boolean[] zArr2 = ap;
                ap[aq] = true;
                zArr2[ad] = true;
                ap[i2] = true;
                if (i3 >= (i6 << 1)) {
                    ag[i2] = i4 > ar ? (i3 - ar) + ar : ((ar - i3) + i4) - 1;
                } else {
                    ag[i2] = (i3 & 1) != 0 ? ar - ((i3 + 1) / 2) : (i3 / 2) + ar;
                }
            } else {
                ap[i2] = false;
                ag[i2] = ar;
            }
        }
        aj(0, length - 1);
        ar = ag[0] * this.al;
        i2 = 1;
        i4 = 0;
        while (i2 < length) {
            int i7;
            if (ap[i2]) {
                i3 = as[i2];
                i7 = this.al * ag[i2];
                al(i4, ar, i3, i7, fArr, i);
                if (i3 >= i) {
                    return;
                }
            } else {
                i3 = i4;
                i7 = ar;
            }
            ar = i7;
            i2++;
            i4 = i3;
        }
        float f = aq[ar];
        while (i4 < i) {
            fArr[i4] = fArr[i4] * f;
            i4++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af(int i, int i2) {
        if (i < i2) {
            int i3 = as[i];
            int i4 = ag[i];
            boolean z = ap[i];
            int i5 = i;
            for (int i6 = i + 1; i6 <= i2; i6++) {
                int i7 = as[i6];
                if (i7 < i3) {
                    as[i5] = i7;
                    ag[i5] = ag[i6];
                    ap[i5] = ap[i6];
                    i5++;
                    as[i6] = as[i5];
                    ag[i6] = ag[i5];
                    ap[i6] = ap[i5];
                }
            }
            as[i5] = i3;
            ag[i5] = i4;
            ap[i5] = z;
            aj(i, i5 - 1);
            aj(i5 + 1, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(int i, int i2) {
        if (i < i2) {
            int i3 = as[i];
            int i4 = ag[i];
            boolean z = ap[i];
            int i5 = i;
            for (int i6 = i + 1; i6 <= i2; i6++) {
                int i7 = as[i6];
                if (i7 < i3) {
                    as[i5] = i7;
                    ag[i5] = ag[i6];
                    ap[i5] = ap[i6];
                    i5++;
                    as[i6] = as[i5];
                    ag[i6] = ag[i5];
                    ap[i6] = ap[i5];
                }
            }
            as[i5] = i3;
            ag[i5] = i4;
            ap[i5] = z;
            aj(i, i5 - 1);
            aj(i5 + 1, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ai() {
        if ((gy.ar() != 0 ? 1 : 0) == 0) {
            return false;
        }
        int i;
        int length = this.ar.length;
        for (i = 0; i < length; i++) {
            as[i] = this.ar[i];
        }
        i = ez.al(ad[this.al - 1] - 1, 628235391);
        ag[0] = gy.al(i);
        ag[1] = gy.al(i);
        length = 2;
        for (int i2 : this.aj) {
            int i3 = this.ai[i2];
            int i4 = this.ae[i2];
            int ar = i4 > 0 ? gy.ap[this.am[i2]].ar() : 0;
            int i5 = 0;
            while (i5 < i3) {
                int i6 = this.ak[i2][((1 << i4) - 1) & ar];
                int i7 = ar >>> i4;
                ag[length] = i6 >= 0 ? gy.ap[i6].ar() : 0;
                i5++;
                length++;
                ar = i7;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i, int i2) {
        if (i < i2) {
            int i3 = as[i];
            int i4 = ag[i];
            boolean z = ap[i];
            int i5 = i;
            for (int i6 = i + 1; i6 <= i2; i6++) {
                int i7 = as[i6];
                if (i7 < i3) {
                    as[i5] = i7;
                    ag[i5] = ag[i6];
                    ap[i5] = ap[i6];
                    i5++;
                    as[i6] = as[i5];
                    ag[i6] = ag[i5];
                    ap[i6] = ap[i5];
                }
            }
            as[i5] = i3;
            ag[i5] = i4;
            ap[i5] = z;
            aj(i, i5 - 1);
            aj(i5 + 1, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(int i, int i2, int i3, int i4, float[] fArr, int i5) {
        int i6 = i4 - i2;
        int i7 = i3 - i;
        int i8 = i6 < 0 ? -i6 : i6;
        int i9 = i6 / i7;
        int i10 = 0;
        int i11 = i6 < 0 ? i9 - 1 : i9 + 1;
        i6 = i9 < 0 ? -i9 : i9;
        fArr[i] = fArr[i] * aq[i2];
        if (i3 <= i5) {
            i5 = i3;
        }
        while (true) {
            i++;
            if (i < i5) {
                int i12;
                i10 += i8 - (i6 * i7);
                if (i10 >= i7) {
                    i10 -= i7;
                    i12 = i2 + i11;
                } else {
                    i12 = i2 + i9;
                }
                fArr[i] = fArr[i] * aq[i12];
                i2 = i12;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean an() {
        if ((gy.ar() != 0 ? 1 : 0) == 0) {
            return false;
        }
        int i;
        int length = this.ar.length;
        for (i = 0; i < length; i++) {
            as[i] = this.ar[i];
        }
        i = ez.al(ad[this.al - 1] - 1, 628235391);
        ag[0] = gy.al(i);
        ag[1] = gy.al(i);
        length = 2;
        for (int i2 : this.aj) {
            int i3 = this.ai[i2];
            int i4 = this.ae[i2];
            int ar = i4 > 0 ? gy.ap[this.am[i2]].ar() : 0;
            int i5 = 0;
            while (i5 < i3) {
                int i6 = this.ak[i2][((1 << i4) - 1) & ar];
                int i7 = ar >>> i4;
                ag[length] = i6 >= 0 ? gy.ap[i6].ar() : 0;
                i5++;
                length++;
                ar = i7;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(int i, int i2, int i3, int i4, float[] fArr, int i5) {
        int i6 = i4 - i2;
        int i7 = i3 - i;
        int i8 = i6 < 0 ? -i6 : i6;
        int i9 = i6 / i7;
        int i10 = 0;
        int i11 = i6 < 0 ? i9 - 1 : i9 + 1;
        i6 = i9 < 0 ? -i9 : i9;
        fArr[i] = fArr[i] * aq[i2];
        if (i3 <= i5) {
            i5 = i3;
        }
        while (true) {
            i++;
            if (i < i5) {
                int i12;
                i10 += i8 - (i6 * i7);
                if (i10 >= i7) {
                    i10 -= i7;
                    i12 = i2 + i11;
                } else {
                    i12 = i2 + i9;
                }
                fArr[i] = fArr[i] * aq[i12];
                i2 = i12;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(int i, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        int i7 = ((i6 < 0 ? -i6 : i6) * (i5 - i)) / (i3 - i);
        return i6 < 0 ? i2 - i7 : i7 + i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void at(float[] fArr, int i) {
        int i2;
        int ar;
        int i3;
        int i4;
        int length = this.ar.length;
        int i5 = ad[this.al - 1];
        boolean[] zArr = ap;
        ap[1] = true;
        zArr[0] = true;
        for (i2 = 2; i2 < length; i2++) {
            int ad = ga.ad(as, i2);
            int aq = ga.aq(as, i2);
            ar = ar(as[ad], ag[ad], as[aq], ag[aq], as[i2]);
            i3 = ag[i2];
            i4 = i5 - ar;
            int i6 = i4 < ar ? i4 : ar;
            if (i3 != 0) {
                boolean[] zArr2 = ap;
                ap[aq] = true;
                zArr2[ad] = true;
                ap[i2] = true;
                if (i3 >= (i6 << 1)) {
                    ag[i2] = i4 > ar ? (i3 - ar) + ar : ((ar - i3) + i4) - 1;
                } else {
                    ag[i2] = (i3 & 1) != 0 ? ar - ((i3 + 1) / 2) : (i3 / 2) + ar;
                }
            } else {
                ap[i2] = false;
                ag[i2] = ar;
            }
        }
        aj(0, length - 1);
        ar = ag[0] * this.al;
        i2 = 1;
        i4 = 0;
        while (i2 < length) {
            int i7;
            if (ap[i2]) {
                i3 = as[i2];
                i7 = this.al * ag[i2];
                al(i4, ar, i3, i7, fArr, i);
                if (i3 >= i) {
                    return;
                }
            } else {
                i3 = i4;
                i7 = ar;
            }
            ar = i7;
            i2++;
            i4 = i3;
        }
        float f = aq[ar];
        while (i4 < i) {
            fArr[i4] = fArr[i4] * f;
            i4++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av(float[] fArr, int i) {
        int i2;
        int ar;
        int i3;
        int i4;
        int length = this.ar.length;
        int i5 = ad[this.al - 1];
        boolean[] zArr = ap;
        ap[1] = true;
        zArr[0] = true;
        for (i2 = 2; i2 < length; i2++) {
            int ad = ga.ad(as, i2);
            int aq = ga.aq(as, i2);
            ar = ar(as[ad], ag[ad], as[aq], ag[aq], as[i2]);
            i3 = ag[i2];
            i4 = i5 - ar;
            int i6 = i4 < ar ? i4 : ar;
            if (i3 != 0) {
                boolean[] zArr2 = ap;
                ap[aq] = true;
                zArr2[ad] = true;
                ap[i2] = true;
                if (i3 >= (i6 << 1)) {
                    ag[i2] = i4 > ar ? (i3 - ar) + ar : ((ar - i3) + i4) - 1;
                } else {
                    ag[i2] = (i3 & 1) != 0 ? ar - ((i3 + 1) / 2) : (i3 / 2) + ar;
                }
            } else {
                ap[i2] = false;
                ag[i2] = ar;
            }
        }
        aj(0, length - 1);
        ar = ag[0] * this.al;
        i2 = 1;
        i4 = 0;
        while (i2 < length) {
            int i7;
            if (ap[i2]) {
                i3 = as[i2];
                i7 = this.al * ag[i2];
                al(i4, ar, i3, i7, fArr, i);
                if (i3 >= i) {
                    return;
                }
            } else {
                i3 = i4;
                i7 = ar;
            }
            ar = i7;
            i2++;
            i4 = i3;
        }
        float f = aq[ar];
        while (i4 < i) {
            fArr[i4] = fArr[i4] * f;
            i4++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aw(int i, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        int i7 = ((i6 < 0 ? -i6 : i6) * (i5 - i)) / (i3 - i);
        return i6 < 0 ? i2 - i7 : i7 + i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(int i, int i2) {
        if (i < i2) {
            int i3 = as[i];
            int i4 = ag[i];
            boolean z = ap[i];
            int i5 = i;
            for (int i6 = i + 1; i6 <= i2; i6++) {
                int i7 = as[i6];
                if (i7 < i3) {
                    as[i5] = i7;
                    ag[i5] = ag[i6];
                    ap[i5] = ap[i6];
                    i5++;
                    as[i6] = as[i5];
                    ag[i6] = ag[i5];
                    ap[i6] = ap[i5];
                }
            }
            as[i5] = i3;
            ag[i5] = i4;
            ap[i5] = z;
            aj(i, i5 - 1);
            aj(i5 + 1, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(float[] fArr, int i) {
        int i2;
        int ar;
        int i3;
        int i4;
        int length = this.ar.length;
        int i5 = ad[this.al - 1];
        boolean[] zArr = ap;
        ap[1] = true;
        zArr[0] = true;
        for (i2 = 2; i2 < length; i2++) {
            int ad = ga.ad(as, i2);
            int aq = ga.aq(as, i2);
            ar = ar(as[ad], ag[ad], as[aq], ag[aq], as[i2]);
            i3 = ag[i2];
            i4 = i5 - ar;
            int i6 = i4 < ar ? i4 : ar;
            if (i3 != 0) {
                boolean[] zArr2 = ap;
                ap[aq] = true;
                zArr2[ad] = true;
                ap[i2] = true;
                if (i3 >= (i6 << 1)) {
                    ag[i2] = i4 > ar ? (i3 - ar) + ar : ((ar - i3) + i4) - 1;
                } else {
                    ag[i2] = (i3 & 1) != 0 ? ar - ((i3 + 1) / 2) : (i3 / 2) + ar;
                }
            } else {
                ap[i2] = false;
                ag[i2] = ar;
            }
        }
        aj(0, length - 1);
        ar = ag[0] * this.al;
        i2 = 1;
        i4 = 0;
        while (i2 < length) {
            int i7;
            if (ap[i2]) {
                i3 = as[i2];
                i7 = this.al * ag[i2];
                al(i4, ar, i3, i7, fArr, i);
                if (i3 >= i) {
                    return;
                }
            } else {
                i3 = i4;
                i7 = ar;
            }
            ar = i7;
            i2++;
            i4 = i3;
        }
        float f = aq[ar];
        while (i4 < i) {
            fArr[i4] = fArr[i4] * f;
            i4++;
        }
    }
}
