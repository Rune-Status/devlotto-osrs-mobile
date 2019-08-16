package defpackage;

import android.support.v4.view.MotionEventCompat;
import java.lang.reflect.Array;

/* renamed from: ba */
public class ba extends mp {
    static final int ak = 3500;
    static final int am = 50;
    public static final int ao = 19;
    public static final int cd = 100;
    bk[] ad;

    ba(kh khVar, kh khVar2, int i, boolean z) {
        try {
            fy fyVar = new fy();
            this.ad = new bk[khVar.ax(i, (byte) 101)];
            int[] az = khVar.az(i, -381883787);
            for (int i2 = 0; i2 < az.length; i2++) {
                byte[] ar = khVar.ar(i, az[i2], 1916880811);
                int i3 = (ar[1] & 255) | ((ar[0] & 255) << 8);
                bj bjVar = (bj) fyVar.ae();
                while (bjVar != null) {
                    if (bjVar.ad * 449302543 == i3) {
                        break;
                    }
                    bjVar = (bj) fyVar.ak();
                }
                bjVar = null;
                if (bjVar == null) {
                    bjVar = new bj(i3, z ? khVar2.ag(0, i3, (byte) -4) : khVar2.ag(i3, 0, (byte) 19));
                    fyVar.aq(bjVar);
                }
                this.ad[az[i2]] = new bk(ar, bjVar);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ba.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ad(int i) {
        try {
            in.ar = -1717259589;
            am.al = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
            in.aj = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
            fk.ai = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
            ja.ae = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
            hj.ax = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, 105, 105});
            in.am = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 105, 105});
            in.ak = (int[][]) Array.newInstance(Integer.TYPE, new int[]{105, 105});
            in.as = new int[104];
            bz.ag = new int[104];
            in.ap = new int[104];
            cg.au = new int[104];
            ab.az = new int[104];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ba.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ba aj(kh khVar, kh khVar2, int i, boolean z) {
        int[] az = khVar.az(i, -381883787);
        int i2 = 1;
        for (int ag : az) {
            int ag2;
            byte[] ag3 = khVar.ag(i, ag2, (byte) -10);
            if (ag3 != null) {
                ag2 = (ag3[1] & 255) | ((ag3[0] & 255) << 8);
                if ((z ? khVar2.ag(0, ag2, (byte) -15) : khVar2.ag(ag2, 0, (byte) -11)) != null) {
                }
            }
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        try {
            return new ba(khVar, khVar2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    public static ba al(kh khVar, kh khVar2, int i, boolean z) {
        int[] az = khVar.az(i, -381883787);
        int i2 = 1;
        for (int ag : az) {
            int ag2;
            byte[] ag3 = khVar.ag(i, ag2, (byte) 22);
            if (ag3 != null) {
                ag2 = (ag3[1] & 255) | ((ag3[0] & 255) << 8);
                if ((z ? khVar2.ag(0, ag2, (byte) 100) : khVar2.ag(ag2, 0, (byte) -24)) != null) {
                }
            }
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        try {
            return new ba(khVar, khVar2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    public static dr aq(int i, int i2) {
        try {
            long j = (long) i;
            dr drVar = (dr) dr.al.ad(j);
            if (drVar == null) {
                byte[] ar = dr.ad.ar(32, i, 1946998890);
                drVar = new dr();
                if (ar != null) {
                    drVar.ar(new lj(ar), -907787660);
                }
                dr.al.ar(drVar, j);
            }
            return drVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ba.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ba ar(kh khVar, kh khVar2, int i, boolean z) {
        int[] az = khVar.az(i, -381883787);
        int i2 = 1;
        for (int ag : az) {
            int ag2;
            byte[] ag3 = khVar.ag(i, ag2, (byte) -18);
            if (ag3 != null) {
                ag2 = (ag3[1] & 255) | ((ag3[0] & 255) << 8);
                if ((z ? khVar2.ag(0, ag2, (byte) -24) : khVar2.ag(ag2, 0, (byte) -9)) != null) {
                }
            }
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        try {
            return new ba(khVar, khVar2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    static void bd(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, short s) {
        int i12 = 256 - i11;
        int i13 = i4;
        for (int i14 = -i7; i14 < 0; i14++) {
            int i15 = i2;
            int i16 = -i6;
            while (i16 < 0) {
                int i17 = iArr2[(i15 >> 16) + ((i3 >> 16) * i10)];
                if (i17 != 0) {
                    int i18 = iArr[i13];
                    iArr[i13] = (((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12)) & 16711680) + (-16711936 & (((16711935 & i17) * i11) + ((16711935 & i18) * i12)))) >> 8;
                }
                i15 += i8;
                i16++;
                i13++;
            }
            i3 += i9;
            i13 += i5;
        }
    }

    static final void dj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            int i9;
            int dz = eh.dz(i6, i7, (byte) 82);
            int i10 = (2048 - i4) & 2047;
            int i11 = (2048 - i5) & 2047;
            int i12 = 0;
            if (i10 != 0) {
                i9 = bl.aa[i10];
                int i13 = bl.ao[i10];
                dz = ((dz * i13) + (i9 * 0)) >> 16;
                i9 = ((i13 * 0) - (i9 * dz)) >> 16;
            } else {
                i9 = 0;
            }
            if (i11 != 0) {
                i12 = bl.aa[i11];
                i11 = bl.ao[i11];
                i10 = ((dz * i11) - (i12 * 0)) >> 16;
                i12 = ((i12 * dz) + (i11 * 0)) >> 16;
            } else {
                i10 = dz;
            }
            ep.hp = (i - i12) * 2022292187;
            fj.hc = (i2 - i9) * -158868505;
            cc.hg = (i3 - i10) * 660629861;
            ay.hr = -823462203 * i4;
            gs.hd = 1300170237 * i5;
            if (client.ha * -1897849765 != 1 || client.lq * -408822943 < 2 || (client.bj * 2133672263) % 50 != 0) {
                return;
            }
            if (((da.jc.bq * -1444273727) >> 7) != ((eo.hv * 1897176415) >> 7) || ((cl.hs * 1983928325) >> 7) != ((da.jc.bd * -1690563339) >> 7)) {
                ap.iw((oz.ff * 2060098323) + ((eo.hv * 1897176415) >> 7), (cq.fz * -1866366501) + ((cl.hs * 1983928325) >> 7), da.jc.ab * -1300496125, true, (byte) 117);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ba.dj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae(int i) {
        return this.ad[i].ag;
    }

    public boolean ai(int i) {
        return this.ad[i].ag;
    }

    /* renamed from: aq */
    public boolean m1aq(int i, int i2) {
        try {
            return this.ad[i].ag;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ba.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
