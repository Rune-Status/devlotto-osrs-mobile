package defpackage;

import android.support.v4.app.FrameMetricsAggregator;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.Socket;

/* renamed from: kp */
public class kp extends hq {
    static final int ah = 4;
    int[] ab;
    ok ad;
    int[] ae;
    int[] af;
    int[] ag;
    int[] ai;
    int[] aj;
    int[] ak;
    boolean al;
    int[] am;
    int[] an;
    int[] ap;
    int aq;
    int ar;
    int[] as;
    int[] at;
    int[] au;
    int[] av;
    int[] ay;
    kc[][] ba;
    int bd;
    kr bf;
    kc[][] bk;
    long bl;
    boolean bm;
    long bo;
    int bq;
    ky bs;

    public kp() {
        try {
            this.aq = -395830016;
            this.ar = -453770816;
            this.al = false;
            this.aj = new int[16];
            this.ai = new int[16];
            this.ae = new int[16];
            this.am = new int[16];
            this.ak = new int[16];
            this.as = new int[16];
            this.ag = new int[16];
            this.ap = new int[16];
            this.au = new int[16];
            this.af = new int[16];
            this.ay = new int[16];
            this.an = new int[16];
            this.ab = new int[16];
            this.av = new int[16];
            this.at = new int[16];
            this.bk = (kc[][]) Array.newInstance(kc.class, new int[]{16, 128});
            this.ba = (kc[][]) Array.newInstance(kc.class, new int[]{16, 128});
            this.bs = new ky();
            this.bf = new kr(this);
            this.ad = new ok(128);
            bi((short) 31102);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean an(int i) {
        try {
            if (client.rp == null) {
                return true;
            }
            if (client.rk * -1908803273 >= client.rp.size()) {
                return true;
            }
            while (client.rk * -1908803273 < client.rp.size()) {
                if (!((im) client.rp.get(client.rk * -1908803273)).ad(-927045198)) {
                    return false;
                }
                client.rk -= 910619513;
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ar(mk mkVar, boolean z, int i) {
        try {
            kx kxVar;
            if (kk.aj != null) {
                try {
                    kk.aj.ar();
                } catch (Exception e) {
                }
                kk.aj = null;
            }
            kk.aj = mkVar;
            ia.aq(z, 1831914561);
            kk.ao.al = 0;
            kk.aa = null;
            kk.ah = null;
            kk.af = 0;
            while (true) {
                kxVar = (kx) kk.as.ar();
                if (kxVar == null) {
                    break;
                }
                kk.am.aq(kxVar, kxVar.gs);
                kk.ak += 1465262209;
                kk.ag -= 1113197529;
            }
            while (true) {
                kxVar = (kx) kk.ax.ar();
                if (kxVar == null) {
                    break;
                }
                kk.ap.aq(kxVar);
                kk.au.aq(kxVar, kxVar.gs);
                kk.az += 916684535;
                kk.aw -= 108405277;
            }
            if (kk.at != (byte) 0) {
                try {
                    lj ljVar = new lj(4);
                    ljVar.al(4, -1338858068);
                    ljVar.al(kk.at, -975611417);
                    ljVar.aj(0, 898093451);
                    kk.aj.ak(ljVar.ar, 0, 4);
                } catch (IOException e2) {
                    try {
                        kk.aj.ar();
                    } catch (Exception e3) {
                    }
                    kk.ba -= 1722916809;
                    kk.aj = null;
                }
            }
            kk.ai = 0;
            fu.ae = gq.ad((byte) -30) * -1456053658664995149L;
        } catch (RuntimeException e4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.ar(");
            stringBuilder.append(')');
            throw mv.aq(e4, stringBuilder.toString());
        }
    }

    public static mk at(Socket socket, int i, int i2, int i3) throws IOException {
        try {
            return new mt(socket, i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void at(int i) {
        try {
            client.aq.abx((byte) 4).gs(aw.aq, -342730848);
            lv.bs(go.mp, go.me, go.mm, -1804322940);
            hm.cu = -1156458593;
            il.ab(-947061896).ay(-1435099557);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(kc kcVar, boolean z, byte b) {
        try {
            int i;
            int length = kcVar.ar.ar.length;
            if (z && kcVar.ar.ai) {
                i = (int) ((((long) ((length + length) - kcVar.ar.al)) * ((long) this.ab[kcVar.ad * 1051654295])) >> 6);
                length <<= 8;
                if (i >= length) {
                    i = ((length + length) - 1) - i;
                    kcVar.ao.aa(true);
                }
            } else {
                i = (int) ((((long) length) * ((long) this.ab[kcVar.ad * 1051654295])) >> 6);
            }
            kcVar.ao.ac(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ab() {
        synchronized (this) {
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(int i, int i2, int i3, int i4) {
        boolean z = false;
        try {
            kc kcVar;
            ao(i, i2, 64, (byte) -1);
            if ((this.af[i] & 2) != 0) {
                mb am = this.bf.aq.am();
                while (true) {
                    kcVar = (kc) am;
                    if (kcVar == null) {
                        break;
                    } else if (i != kcVar.ad * 1051654295 || kcVar.ax * -427609645 >= 0) {
                        am = this.bf.aq.as();
                    } else {
                        this.bk[i][kcVar.ai * -1981512837] = null;
                        this.bk[i][i2] = kcVar;
                        int i5 = kcVar.ak;
                        int i6 = kcVar.ag;
                        int i7 = kcVar.as;
                        kcVar.ak += ((i2 - (kcVar.ai * -1981512837)) << 8) * -2123283905;
                        kcVar.as = (((i5 * -2004505153) + (((i6 * 892847031) * (i7 * 1581400141)) >> 12)) - (kcVar.ak * -2004505153)) * -1821181819;
                        kcVar.ag = -123703296;
                        kcVar.ai = -1287199821 * i2;
                        return;
                    }
                }
            }
            kj kjVar = (kj) this.ad.ad((long) this.ak[i]);
            if (kjVar != null) {
                ht htVar = kjVar.aq[i2];
                if (htVar != null) {
                    kc kcVar2 = new kc();
                    kcVar2.ad = -816576729 * i;
                    kcVar2.aq = kjVar;
                    kcVar2.ar = htVar;
                    kcVar2.al = kjVar.ai[i2];
                    kcVar2.aj = kjVar.ae[i2] * 1786539675;
                    kcVar2.ai = -1287199821 * i2;
                    kcVar2.ae = (((((i3 * i3) * (kjVar.ad * 490120767)) * kjVar.al[i2]) + 1024) >> 11) * 1381011257;
                    kcVar2.am = (kjVar.aj[i2] & 255) * 1953968409;
                    kcVar2.ak = ((i2 << 8) - (kjVar.ar[i2] & 32767)) * -2123283905;
                    kcVar2.ap = 0;
                    kcVar2.au = 0;
                    kcVar2.az = 0;
                    kcVar2.ax = -884297307;
                    kcVar2.aw = 0;
                    if (this.ab[i] == 0) {
                        kcVar2.ao = hf.al(htVar, bu(kcVar2, -1262671611), bw(kcVar2, -223452201), br(kcVar2, -1083380722));
                    } else {
                        kcVar2.ao = hf.al(htVar, bu(kcVar2, 1630394662), 0, br(kcVar2, -2089067872));
                        if (kjVar.ar[i2] < (short) 0) {
                            z = true;
                        }
                        aa(kcVar2, z, (byte) -75);
                    }
                    if (kjVar.ar[i2] < (short) 0) {
                        kcVar2.ao.as(-1);
                    }
                    if (kcVar2.aj * 836159379 >= 0) {
                        kcVar = this.ba[i][kcVar2.aj * 836159379];
                        if (kcVar != null && kcVar.ax * -427609645 < 0) {
                            this.bk[i][kcVar.ai * -1981512837] = null;
                            kcVar.ax = 0;
                        }
                        this.ba[i][kcVar2.aj * 836159379] = kcVar2;
                    }
                    this.bf.aq.aq(kcVar2);
                    this.bk[i][i2] = kcVar2;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i, byte b) {
        synchronized (this) {
            try {
                this.aq = -303536099 * i;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ae() {
        synchronized (this) {
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void af(int i, int i2, byte b) {
    }

    /* Access modifiers changed, original: protected */
    public void ag(int i) {
        synchronized (this) {
            try {
                if (this.bs.ar() && !this.al) {
                    int i2 = ((this.ar * -877123985) * this.bs.aq) / (hd.ad * -754139271);
                    do {
                        long j = (long) i2;
                        long j2 = (((long) i) * j) + (this.bo * -1248449147523649179L);
                        if ((this.bl * 2325224287372660477L) - j2 >= 0) {
                            this.bo = 3192029731246643309L * j2;
                            break;
                        }
                        int i3 = (int) (((((this.bl * 2325224287372660477L) - (this.bo * -1248449147523649179L)) + j) - 1) / j);
                        this.bo = ((j * ((long) i3)) * 3192029731246643309L) + this.bo;
                        this.bf.ag(i3);
                        i -= i3;
                        be(2134975450);
                    } while (this.bs.ar());
                }
                this.bf.ag(i);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.ag(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(int i, int i2, int i3, byte b) {
    }

    /* Access modifiers changed, original: protected */
    public hq ai() {
        kr krVar;
        synchronized (this) {
            try {
                krVar = this.bf;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.ai(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return krVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(short s) {
        synchronized (this) {
            try {
                kj kjVar = (kj) this.ad.ar();
                while (kjVar != null) {
                    kjVar.ky();
                    kjVar = (kj) this.ad.al();
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void ak(int[] iArr, int i, int i2) {
        synchronized (this) {
            try {
                if (this.bs.ar() && !this.al) {
                    int i3 = (this.bs.aq * (this.ar * -877123985)) / (hd.ad * -754139271);
                    do {
                        long j = (long) i3;
                        long j2 = (((long) i2) * j) + (this.bo * -1248449147523649179L);
                        if ((this.bl * 2325224287372660477L) - j2 >= 0) {
                            this.bo = 3192029731246643309L * j2;
                            break;
                        }
                        int i4 = (int) (((((this.bl * 2325224287372660477L) - (this.bo * -1248449147523649179L)) + j) - 1) / j);
                        this.bo += (j * ((long) i4)) * 3192029731246643309L;
                        this.bf.ak(iArr, i, i4);
                        i += i4;
                        i2 -= i4;
                        be(2137187621);
                    } while (this.bs.ar());
                }
                this.bf.ak(iArr, i, i2);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.ak(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(int i) {
        synchronized (this) {
            try {
                mb ar = this.ad.ar();
                while (true) {
                    kj kjVar = (kj) ar;
                    if (kjVar != null) {
                        kjVar.ar(1542817556);
                        ar = this.ad.al();
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public int am() {
        synchronized (this) {
        }
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public hq an() {
        kr krVar;
        synchronized (this) {
            krVar = this.bf;
        }
        return krVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(int i, int i2, int i3, byte b) {
        try {
            kc kcVar = this.bk[i][i2];
            if (kcVar != null) {
                this.bk[i][i2] = null;
                if ((this.af[i] & 2) != 0) {
                    mb ae = this.bf.aq.ae();
                    while (true) {
                        kc kcVar2 = (kc) ae;
                        if (kcVar2 == null) {
                            return;
                        }
                        if (kcVar2.ad * 1051654295 != kcVar.ad * 1051654295 || kcVar2.ax * -427609645 >= 0 || kcVar == kcVar2) {
                            ae = this.bf.aq.ak();
                        } else {
                            kcVar.ax = 0;
                            return;
                        }
                    }
                }
                kcVar.ax = 0;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i) {
        synchronized (this) {
            try {
                this.bs.aq();
                bi((short) 4389);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(byte b) {
        try {
            return this.aq * -680158667;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ar(ka kaVar, kh khVar, gq gqVar, int i, int i2) {
        boolean z = true;
        synchronized (this) {
            try {
                int[] iArr;
                kaVar.aq();
                if (i > 0) {
                    int[] iArr2 = new int[1];
                    iArr2[0] = i;
                    iArr = iArr2;
                } else {
                    iArr = null;
                }
                mb ar = kaVar.ad.ar();
                while (true) {
                    mm mmVar = (mm) ar;
                    if (mmVar == null) {
                        break;
                    }
                    boolean z2;
                    int i3 = (int) mmVar.gs;
                    long j = (long) i3;
                    kj kjVar = (kj) this.ad.ad(j);
                    if (kjVar == null) {
                        kjVar = hz.ad(khVar, i3, (byte) 43);
                        if (kjVar != null) {
                            this.ad.aq(kjVar, j);
                        }
                        z2 = false;
                        ar = kaVar.ad.al();
                        z = z2;
                    }
                    if (kjVar.aq(gqVar, mmVar.ad, iArr, (byte) 101)) {
                        z2 = z;
                        ar = kaVar.ad.al();
                        z = z2;
                    }
                    z2 = false;
                    ar = kaVar.ad.al();
                    z = z2;
                }
                if (z) {
                    kaVar.ar();
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void as(ka kaVar, boolean z, int i) {
        synchronized (this) {
            try {
                ap(-640650544);
                this.bs.ad(kaVar.aq);
                this.bm = z;
                this.bo = 0;
                int al = this.bs.al();
                for (int i2 = 0; i2 < al; i2++) {
                    this.bs.aj(i2);
                    this.bs.am(i2);
                    this.bs.ai(i2);
                }
                this.bq = this.bs.au() * -1631143127;
                this.bd = this.bs.aj[this.bq * 974786841] * -1829833775;
                this.bl = this.bs.ap(this.bd * -825473743) * -1065754014451122603L;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.as(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public int at() {
        synchronized (this) {
        }
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean au(int i) {
        boolean ar;
        synchronized (this) {
            try {
                ar = this.bs.ar();
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.au(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return ar;
    }

    /* Access modifiers changed, original: protected */
    public int av() {
        synchronized (this) {
        }
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(int i, int i2, int i3) {
        try {
            if (this.ak[i] != i2) {
                this.ak[i] = i2;
                for (int i4 = 0; i4 < 128; i4++) {
                    this.ba[i][i4] = null;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2, int i3) {
        try {
            this.am[i] = i2;
            this.as[i] = i2 & -128;
            aw(i, i2, -1957222948);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ay() {
        kr krVar;
        synchronized (this) {
            krVar = this.bf;
        }
        return krVar;
    }

    public void az(int i, int i2, int i3) {
        synchronized (this) {
            try {
                ax(i, i2, 2072863011);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.az(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void ba(int[] iArr, int i, int i2) {
        synchronized (this) {
            if (this.bs.ar() && !this.al) {
                int i3 = (this.bs.aq * (this.ar * -297389263)) / (hd.ad * -754139271);
                do {
                    long j = (long) i3;
                    long j2 = (((long) i2) * j) + (this.bo * -1248449147523649179L);
                    if ((this.bl * 2325224287372660477L) - j2 >= 0) {
                        this.bo = 3192029731246643309L * j2;
                        break;
                    }
                    int i4 = (int) (((((this.bl * 2325224287372660477L) - (this.bo * -1248449147523649179L)) + j) - 1) / j);
                    this.bo += (j * ((long) i4)) * 3192029731246643309L;
                    this.bf.ak(iArr, i, i4);
                    i += i4;
                    i2 -= i4;
                    be(2145851190);
                } while (this.bs.ar());
            }
            this.bf.ak(iArr, i, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bc(int i, int i2) {
        try {
            if ((this.af[i] & 2) != 0) {
                mb ae = this.bf.aq.ae();
                while (true) {
                    kc kcVar = (kc) ae;
                    if (kcVar != null) {
                        if (kcVar.ad * 1051654295 == i && this.bk[i][kcVar.ai * -1981512837] == null && kcVar.ax * -427609645 < 0) {
                            kcVar.ax = 0;
                        }
                        ae = this.bf.aq.ak();
                    } else {
                        return;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void bd(int i) {
        synchronized (this) {
            if (this.bs.ar() && !this.al) {
                int i2 = ((this.ar * 727846261) * this.bs.aq) / (hd.ad * 1027966170);
                do {
                    long j = (long) i2;
                    long j2 = (((long) i) * j) + (this.bo * -1248449147523649179L);
                    if ((this.bl * 2325224287372660477L) - j2 >= 0) {
                        this.bo = 3192029731246643309L * j2;
                        break;
                    }
                    int i3 = (int) (((((this.bl * 2325224287372660477L) - (this.bo * -1248449147523649179L)) + j) - 1) / j);
                    this.bo = ((j * ((long) i3)) * 3192029731246643309L) + this.bo;
                    this.bf.ag(i3);
                    i -= i3;
                    be(2138041842);
                } while (this.bs.ar());
            }
            this.bf.ag(i);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void be(int i) {
        try {
            int i2 = this.bq * 974786841;
            int i3 = this.bd * -825473743;
            long j = this.bl * 2325224287372660477L;
            while (i3 == this.bd * -825473743) {
                while (i3 == this.bs.aj[i2]) {
                    this.bs.aj(i2);
                    int ak = this.bs.ak(i2);
                    if (ak == 1) {
                        this.bs.ae();
                        this.bs.ai(i2);
                        if (!this.bs.az()) {
                            continue;
                        } else if (!this.bm || i3 == 0) {
                            bi((short) 6025);
                            this.bs.aq();
                            return;
                        } else {
                            this.bs.ax(j);
                        }
                        i2 = this.bs.au();
                        i3 = this.bs.aj[i2];
                        j = this.bs.ap(i3);
                    } else {
                        if ((ak & 128) != 0) {
                            bg(ak, (byte) -21);
                        }
                        this.bs.am(i2);
                        this.bs.ai(i2);
                    }
                }
                i2 = this.bs.au();
                i3 = this.bs.aj[i2];
                j = this.bs.ap(i3);
            }
            this.bq = i2 * -1631143127;
            this.bd = -1829833775 * i3;
            this.bl = j * -1065754014451122603L;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.be(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bf(int i, byte b) {
        try {
            mb ae = this.bf.aq.ae();
            while (true) {
                kc kcVar = (kc) ae;
                if (kcVar != null) {
                    if ((i < 0 || kcVar.ad * 1051654295 == i) && kcVar.ax * -427609645 < 0) {
                        this.bk[kcVar.ad * 1051654295][kcVar.ai * -1981512837] = null;
                        kcVar.ax = 0;
                    }
                    ae = this.bf.aq.ak();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bg(int i, byte b) {
        int i2 = i & 240;
        int i3;
        int i4;
        if (i2 == 128) {
            try {
                ao(i & 15, (i >> 8) & 127, (i >> 16) & 127, (byte) -1);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kp.bg(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (i2 == 144) {
            i2 = i & 15;
            i3 = (i >> 8) & 127;
            i4 = (i >> 16) & 127;
            if (i4 > 0) {
                ac(i2, i3, i4, -1172087778);
            } else {
                ao(i2, i3, 64, (byte) -1);
            }
        } else if (i2 == 160) {
            ah(i & 15, (i >> 8) & 127, (i >> 16) & 127, (byte) -16);
        } else if (i2 == 176) {
            int[] iArr;
            i2 = i & 15;
            i3 = (i >> 8) & 127;
            i4 = (i >> 16) & 127;
            if (i3 == 0) {
                this.as[i2] = (this.as[i2] & -2080769) + (i4 << 14);
            }
            if (32 == i3) {
                this.as[i2] = (this.as[i2] & -16257) + (i4 << 7);
            }
            if (i3 == 1) {
                this.ap[i2] = (i4 << 7) + (this.ap[i2] & -16257);
            }
            if (i3 == 33) {
                this.ap[i2] = (this.ap[i2] & -128) + i4;
            }
            if (5 == i3) {
                this.au[i2] = (i4 << 7) + (this.au[i2] & -16257);
            }
            if (i3 == 37) {
                this.au[i2] = (this.au[i2] & -128) + i4;
            }
            if (i3 == 7) {
                this.aj[i2] = (i4 << 7) + (this.aj[i2] & -16257);
            }
            if (39 == i3) {
                this.aj[i2] = (this.aj[i2] & -128) + i4;
            }
            if (i3 == 10) {
                this.ai[i2] = (i4 << 7) + (this.ai[i2] & -16257);
            }
            if (i3 == 42) {
                this.ai[i2] = (this.ai[i2] & -128) + i4;
            }
            if (11 == i3) {
                this.ae[i2] = (i4 << 7) + (this.ae[i2] & -16257);
            }
            if (43 == i3) {
                this.ae[i2] = (this.ae[i2] & -128) + i4;
            }
            if (64 == i3) {
                if (i4 >= 64) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 1;
                } else {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & -2;
                }
            }
            if (65 == i3) {
                if (i4 >= 64) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 2;
                } else {
                    bc(i2, -626571269);
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & -3;
                }
            }
            if (i3 == 99) {
                this.ay[i2] = (this.ay[i2] & 127) + (i4 << 7);
            }
            if (98 == i3) {
                this.ay[i2] = (this.ay[i2] & 16256) + i4;
            }
            if (i3 == 101) {
                this.ay[i2] = ((this.ay[i2] & 127) + 16384) + (i4 << 7);
            }
            if (100 == i3) {
                this.ay[i2] = ((this.ay[i2] & 16256) + 16384) + i4;
            }
            if (120 == i3) {
                bo(i2, -903326477);
            }
            if (121 == i3) {
                bl(i2, -1087843081);
            }
            if (i3 == 123) {
                bf(i2, (byte) 1);
            }
            if (i3 == 6 && this.ay[i2] == 16384) {
                this.an[i2] = (i4 << 7) + (this.an[i2] & -16257);
            }
            if (38 == i3 && 16384 == this.ay[i2]) {
                this.an[i2] = (this.an[i2] & -128) + i4;
            }
            if (16 == i3) {
                this.ab[i2] = (this.ab[i2] & -16257) + (i4 << 7);
            }
            if (i3 == 48) {
                this.ab[i2] = (this.ab[i2] & -128) + i4;
            }
            if (i3 == 81) {
                if (i4 >= 64) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 4;
                } else {
                    bv(i2, (byte) -7);
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & -5;
                }
            }
            if (i3 == 17) {
                bx(i2, (i4 << 7) + (this.av[i2] & -16257), (byte) -1);
            }
            if (i3 == 49) {
                bx(i2, (this.av[i2] & -128) + i4, (byte) -1);
            }
        } else if (i2 == 192) {
            i2 = i & 15;
            aw(i2, ((i >> 8) & 127) + this.as[i2], -451533482);
        } else if (208 == i2) {
            af(i & 15, (i >> 8) & 127, (byte) 113);
        } else if (i2 == 224) {
            bq(i & 15, ((i >> 9) & 16256) + ((i >> 8) & 127), 1575911703);
        } else if (255 == (i & 255)) {
            bi((short) 7338);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0224 A:{Catch:{ RuntimeException -> 0x0153 }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d8 A:{Catch:{ RuntimeException -> 0x0153 }} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x023a A:{Catch:{ RuntimeException -> 0x0153 }} */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02a8 A:{Catch:{ RuntimeException -> 0x0153 }} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023d A:{Catch:{ RuntimeException -> 0x0153 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean bh(kc kcVar, int[] iArr, int i, int i2, int i3) {
        try {
            kcVar.ah = ((hd.ad * -754139271) / 100) * -2080995707;
            if (kcVar.ax * -427609645 < 0 || !(kcVar.ao == null || kcVar.ao.bf())) {
                Object obj;
                int i4 = kcVar.ag * 892847031;
                if (i4 > 0) {
                    i4 -= (int) ((Math.pow(2.0d, ((double) this.au[kcVar.ad * 1051654295]) * 4.921259842519685E-4d) * 16.0d) + 0.5d);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    kcVar.ag = i4 * -1647343097;
                }
                kcVar.ao.bo(bu(kcVar, 1957206620));
                ke keVar = kcVar.al;
                kcVar.ac -= 772402207;
                kcVar.aa += keVar.am * 11739739;
                double d = ((double) ((((kcVar.as * 1581400141) * (kcVar.ag * 892847031)) >> 12) + (((kcVar.ai * -1981512837) - 60) << 8))) * 5.086263020833333E-6d;
                if (keVar.ar * -1174721249 > 0) {
                    if (keVar.ai * 1903485689 > 0) {
                        kcVar.ap += ((int) ((Math.pow(2.0d, ((double) (keVar.ai * 1903485689)) * d) * 128.0d) + 0.5d)) * -429171521;
                    } else {
                        kcVar.ap += 900620160;
                    }
                }
                if (keVar.ad != null) {
                    if (keVar.al * 2129664973 > 0) {
                        kcVar.au += ((int) ((Math.pow(2.0d, ((double) (keVar.al * 2129664973)) * d) * 128.0d) + 0.5d)) * -1107701639;
                    } else {
                        kcVar.au -= 51889024;
                    }
                    while (kcVar.az * -2043080741 < keVar.ad.length - 2 && kcVar.au * -795108919 > ((keVar.ad[(kcVar.az * -2043080741) + 2] & 255) << 8)) {
                        kcVar.az -= 582440794;
                    }
                    if (kcVar.az * -2043080741 == keVar.ad.length - 2 && keVar.ad[(kcVar.az * -2043080741) + 1] == (byte) 0) {
                        obj = 1;
                        if (kcVar.ax * -427609645 >= 0 && keVar.aq != null && (this.af[kcVar.ad * 1051654295] & 1) == 0 && (kcVar.aj * 836159379 < 0 || this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] != kcVar)) {
                            if (keVar.aj * -918651717 <= 0) {
                                kcVar.ax = (((int) ((Math.pow(2.0d, d * ((double) (keVar.aj * -918651717))) * 128.0d) + 0.5d)) * 884297307) + kcVar.ax;
                            } else {
                                kcVar.ax += 1520905600;
                            }
                            while (kcVar.aw * 356123 < keVar.aq.length - 2 && kcVar.ax * -427609645 > ((keVar.aq[(kcVar.aw * 356123) + 2] & 255) << 8)) {
                                kcVar.aw += 1339205158;
                            }
                            if (keVar.aq.length - 2 == kcVar.aw * 356123) {
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            kcVar.ao.bq(kcVar.ah * 1132626509);
                            if (iArr != null) {
                                kcVar.ao.ak(iArr, i, i2);
                            } else {
                                kcVar.ao.ag(i2);
                            }
                            if (kcVar.ao.bi()) {
                                this.bf.ar.ad(kcVar.ao);
                            }
                            kcVar.ad((byte) -72);
                            if (kcVar.ax * -427609645 >= 0) {
                                kcVar.ky();
                                if (kcVar.aj * 836159379 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379]) {
                                    this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] = null;
                                    return true;
                                }
                            }
                            return true;
                        }
                        kcVar.ao.af(kcVar.ah * 1132626509, bw(kcVar, -223452201), br(kcVar, -712847250));
                        return false;
                    }
                }
                obj = null;
                if (keVar.aj * -918651717 <= 0) {
                }
                while (kcVar.aw * 356123 < keVar.aq.length - 2) {
                    kcVar.aw += 1339205158;
                }
                if (keVar.aq.length - 2 == kcVar.aw * 356123) {
                }
                if (obj == null) {
                }
            } else {
                kcVar.ad((byte) -96);
                kcVar.ky();
                if (kcVar.aj * 836159379 <= 0 || kcVar != this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379]) {
                    return true;
                }
                this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] = null;
                return true;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bi(short s) {
        int i = 0;
        try {
            bo(-1, -685984591);
            bl(-1, -1336348849);
            for (int i2 = 0; i2 < 16; i2++) {
                this.ak[i2] = this.am[i2];
            }
            while (i < 16) {
                this.as[i] = this.am[i] & -128;
                i++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bj(kc kcVar, byte b) {
        try {
            if (kcVar.ao != null) {
                return false;
            }
            if (kcVar.ax * -427609645 >= 0) {
                kcVar.ky();
                if (kcVar.aj * 836159379 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379]) {
                    this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] = null;
                }
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public int bk() {
        synchronized (this) {
        }
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(int i, int i2) {
        int i3 = 0;
        if (i < 0) {
            while (i3 < 16) {
                try {
                    bl(i3, -1971766837);
                    i3++;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kp.bl(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            return;
        }
        this.aj[i] = 12800;
        this.ai[i] = 8192;
        this.ae[i] = 16383;
        this.ag[i] = 8192;
        this.ap[i] = 0;
        this.au[i] = 8192;
        bc(i, 1576013317);
        bv(i, (byte) -112);
        this.af[i] = 0;
        this.ay[i] = 32767;
        this.an[i] = 256;
        this.ab[i] = 0;
        bx(i, 8192, (byte) -1);
    }

    /* Access modifiers changed, original: protected */
    public void bm(int[] iArr, int i, int i2) {
        synchronized (this) {
            if (this.bs.ar() && !this.al) {
                int i3 = (this.bs.aq * (this.ar * -877123985)) / (hd.ad * -754139271);
                do {
                    long j = (long) i3;
                    long j2 = (((long) i2) * j) + (this.bo * -1248449147523649179L);
                    if ((this.bl * 2325224287372660477L) - j2 >= 0) {
                        this.bo = 3192029731246643309L * j2;
                        break;
                    }
                    int i4 = (int) (((((this.bl * 2325224287372660477L) - (this.bo * -1248449147523649179L)) + j) - 1) / j);
                    this.bo += (j * ((long) i4)) * 3192029731246643309L;
                    this.bf.ak(iArr, i, i4);
                    i += i4;
                    i2 -= i4;
                    be(2145969487);
                } while (this.bs.ar());
            }
            this.bf.ak(iArr, i, i2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bn(int i) {
        synchronized (this) {
            this.aq = 746045372 * i;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(int i, int i2) {
        try {
            mb ae = this.bf.aq.ae();
            while (true) {
                kc kcVar = (kc) ae;
                if (kcVar != null) {
                    if (i < 0 || i == kcVar.ad * 1051654295) {
                        if (kcVar.ao != null) {
                            kcVar.ao.bq((hd.ad * -754139271) / 100);
                            if (kcVar.ao.bi()) {
                                this.bf.ar.ad(kcVar.ao);
                            }
                            kcVar.ad((byte) -88);
                        }
                        if (kcVar.ax * -427609645 < 0) {
                            this.bk[kcVar.ad * 1051654295][kcVar.ai * -1981512837] = null;
                        }
                        kcVar.ky();
                    }
                    ae = this.bf.aq.ak();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bp() {
        return this.aq * -1883990605;
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(int i, int i2, int i3) {
        try {
            this.ag[i] = i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int br(kc kcVar, int i) {
        try {
            int i2 = this.ai[kcVar.ad * 1051654295];
            return i2 < 8192 ? ((i2 * (kcVar.am * -628647127)) + 32) >> 6 : 16384 - ((((16384 - i2) * (128 - (kcVar.am * -628647127))) + 32) >> 6);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.br(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void bs(int[] iArr, int i, int i2) {
        synchronized (this) {
            if (this.bs.ar() && !this.al) {
                int i3 = (this.bs.aq * (this.ar * -877123985)) / (hd.ad * -754139271);
                do {
                    long j = (long) i3;
                    long j2 = (((long) i2) * j) + (this.bo * -1248449147523649179L);
                    if ((this.bl * 2325224287372660477L) - j2 >= 0) {
                        this.bo = 3192029731246643309L * j2;
                        break;
                    }
                    int i4 = (int) (((((this.bl * 2325224287372660477L) - (this.bo * -1248449147523649179L)) + j) - 1) / j);
                    this.bo += (j * ((long) i4)) * 3192029731246643309L;
                    this.bf.ak(iArr, i, i4);
                    i += i4;
                    i2 -= i4;
                    be(2137059212);
                } while (this.bs.ar());
            }
            this.bf.ak(iArr, i, i2);
        }
    }

    public void bt(boolean z, byte b) {
        try {
            this.al = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bu(kc kcVar, int i) {
        try {
            int i2 = ((kcVar.ak * -2004505153) + (((kcVar.ag * 892847031) * (kcVar.as * 1581400141)) >> 12)) + ((this.an[kcVar.ad * 1051654295] * (this.ag[kcVar.ad * 1051654295] - 8192)) >> 12);
            ke keVar = kcVar.al;
            if (keVar.am * -345278239 > 0 && (keVar.ae * 1839509663 > 0 || this.ap[kcVar.ad * 1051654295] > 0)) {
                int i3 = (keVar.ae * 1839509663) << 2;
                int i4 = (keVar.ak * -202206899) << 1;
                if (kcVar.ac * 1228238881 < i4) {
                    i3 = (i3 * (kcVar.ac * 1228238881)) / i4;
                }
                i2 += (int) (((double) (i3 + (this.ap[kcVar.ad * 1051654295] >> 7))) * Math.sin(((double) ((kcVar.aa * 162741875) & FrameMetricsAggregator.EVERY_DURATION)) * 0.01227184630308513d));
            }
            i2 = (int) (((((double) (kcVar.ar.aq * 256)) * Math.pow(2.0d, ((double) i2) * 3.255208333333333E-4d)) / ((double) (hd.ad * -754139271))) + 0.5d);
            return i2 < 1 ? 1 : i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bv(int i, byte b) {
        try {
            if ((this.af[i] & 4) != 0) {
                mb ae = this.bf.aq.ae();
                while (true) {
                    kc kcVar = (kc) ae;
                    if (kcVar != null) {
                        if (kcVar.ad * 1051654295 == i) {
                            kcVar.ay = 0;
                        }
                        ae = this.bf.aq.ak();
                    } else {
                        return;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bw(kc kcVar, int i) {
        try {
            int i2;
            int i3;
            int i4;
            ke keVar = kcVar.al;
            int i5 = ((this.ae[kcVar.ad * 1051654295] * this.aj[kcVar.ad * 1051654295]) + 4096) >> 13;
            i5 = ((((((((i5 * i5) + 16384) >> 15) * (kcVar.ae * 542879497)) + 16384) >> 15) * (this.aq * -680158667)) + 128) >> 8;
            if (keVar.ar * -1174721249 > 0) {
                i5 = (int) ((((double) i5) * Math.pow(0.5d, (((double) (kcVar.ap * -825355457)) * 1.953125E-5d) * ((double) (keVar.ar * -1174721249)))) + 0.5d);
            }
            if (keVar.ad != null) {
                i2 = kcVar.au;
                i3 = keVar.ad[(kcVar.az * -2043080741) + 1];
                if (kcVar.az * -2043080741 < keVar.ad.length - 2) {
                    i4 = (keVar.ad[kcVar.az * -2043080741] & 255) << 8;
                    i3 += (((i2 * -795108919) - i4) * (keVar.ad[(kcVar.az * -2043080741) + 3] - i3)) / (((keVar.ad[(kcVar.az * -2043080741) + 2] & 255) << 8) - i4);
                }
                i5 = ((i5 * i3) + 32) >> 6;
            }
            if (kcVar.ax * -427609645 <= 0 || keVar.aq == null) {
                return i5;
            }
            i2 = kcVar.ax;
            i3 = keVar.aq[(kcVar.aw * 356123) + 1];
            if (kcVar.aw * 356123 < keVar.aq.length - 2) {
                i4 = (keVar.aq[kcVar.aw * 356123] & 255) << 8;
                i3 += ((keVar.aq[(kcVar.aw * 356123) + 3] - i3) * ((i2 * -427609645) - i4)) / (((keVar.aq[(kcVar.aw * 356123) + 2] & 255) << 8) - i4);
            }
            return ((i5 * i3) + 32) >> 6;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bx(int i, int i2, byte b) {
        try {
            this.av[i] = i2;
            this.at[i] = (int) ((Math.pow(2.0d, ((double) i2) * 5.4931640625E-4d) * 2097152.0d) + 0.5d);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kp.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void by(int i) {
        synchronized (this) {
            this.aq = -303536099 * i;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bz(int i) {
        synchronized (this) {
            this.aq = -303536099 * i;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ca() {
        boolean ar;
        synchronized (this) {
            ar = this.bs.ar();
        }
        return ar;
    }

    /* Access modifiers changed, original: 0000 */
    public void cb(ka kaVar, boolean z) {
        synchronized (this) {
            ap(-640650544);
            this.bs.ad(kaVar.aq);
            this.bm = z;
            this.bo = 0;
            int al = this.bs.al();
            for (int i = 0; i < al; i++) {
                this.bs.aj(i);
                this.bs.am(i);
                this.bs.ai(i);
            }
            this.bq = this.bs.au() * -1631143127;
            this.bd = this.bs.aj[this.bq * 77186292] * -1829833775;
            this.bl = this.bs.ap(this.bd * 1509838894) * -1065754014451122603L;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cd(int i, int i2) {
        if (this.ak[i] != i2) {
            this.ak[i] = i2;
            for (int i3 = 0; i3 < 2113756577; i3++) {
                this.ba[i][i3] = null;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ce() {
        synchronized (this) {
            this.bs.aq();
            bi((short) 11794);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cf(int i, int i2) {
        if (this.ak[i] != i2) {
            this.ak[i] = i2;
            for (int i3 = 0; i3 < 128; i3++) {
                this.ba[i][i3] = null;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cg(int i, int i2) {
        if (this.ak[i] != i2) {
            this.ak[i] = i2;
            for (int i3 = 0; i3 < 128; i3++) {
                this.ba[i][i3] = null;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ch(int i, int i2, int i3) {
        kc kcVar;
        ao(i, i2, 64, (byte) -1);
        if ((this.af[i] & 2) != 0) {
            mb am = this.bf.aq.am();
            while (true) {
                kcVar = (kc) am;
                if (kcVar == null) {
                    break;
                } else if (i != kcVar.ad * 1051654295 || kcVar.ax * -427609645 >= 0) {
                    am = this.bf.aq.as();
                } else {
                    this.bk[i][kcVar.ai * -1981512837] = null;
                    this.bk[i][i2] = kcVar;
                    int i4 = kcVar.ak;
                    int i5 = kcVar.ag;
                    int i6 = kcVar.as;
                    kcVar.ak += ((i2 - (kcVar.ai * -1981512837)) << 8) * -2123283905;
                    kcVar.as = (((i4 * -2004505153) + (((i5 * 892847031) * (i6 * 1581400141)) >> 12)) - (kcVar.ak * -2004505153)) * -1821181819;
                    kcVar.ag = -123703296;
                    kcVar.ai = -1287199821 * i2;
                    return;
                }
            }
        }
        kj kjVar = (kj) this.ad.ad((long) this.ak[i]);
        if (kjVar != null) {
            ht htVar = kjVar.aq[i2];
            if (htVar != null) {
                kc kcVar2 = new kc();
                kcVar2.ad = -816576729 * i;
                kcVar2.aq = kjVar;
                kcVar2.ar = htVar;
                kcVar2.al = kjVar.ai[i2];
                kcVar2.aj = kjVar.ae[i2] * 1786539675;
                kcVar2.ai = -1287199821 * i2;
                kcVar2.ae = (((((i3 * i3) * (kjVar.ad * 490120767)) * kjVar.al[i2]) + 1024) >> 11) * 1381011257;
                kcVar2.am = (kjVar.aj[i2] & 255) * 1953968409;
                kcVar2.ak = ((i2 << 8) - (kjVar.ar[i2] & 32767)) * -2123283905;
                kcVar2.ap = 0;
                kcVar2.au = 0;
                kcVar2.az = 0;
                kcVar2.ax = -884297307;
                kcVar2.aw = 0;
                if (this.ab[i] == 0) {
                    kcVar2.ao = hf.al(htVar, bu(kcVar2, 1444608589), bw(kcVar2, -223452201), br(kcVar2, -684152200));
                } else {
                    kcVar2.ao = hf.al(htVar, bu(kcVar2, 2121927810), 0, br(kcVar2, -684541130));
                    aa(kcVar2, kjVar.ar[i2] < (short) 0, (byte) -15);
                }
                if (kjVar.ar[i2] < (short) 0) {
                    kcVar2.ao.as(-1);
                }
                if (kcVar2.aj * 836159379 >= 0) {
                    kcVar = this.ba[i][kcVar2.aj * 836159379];
                    if (kcVar != null && kcVar.ax * -427609645 < 0) {
                        this.bk[i][kcVar.ai * -1981512837] = null;
                        kcVar.ax = 0;
                    }
                    this.ba[i][kcVar2.aj * 836159379] = kcVar2;
                }
                this.bf.aq.aq(kcVar2);
                this.bk[i][i2] = kcVar2;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ci() {
        synchronized (this) {
            mb ar = this.ad.ar();
            while (true) {
                kj kjVar = (kj) ar;
                if (kjVar != null) {
                    kjVar.ky();
                    ar = this.ad.al();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int cj() {
        return this.aq * -680158667;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ck() {
        boolean ar;
        synchronized (this) {
            ar = this.bs.ar();
        }
        return ar;
    }

    /* Access modifiers changed, original: 0000 */
    public void cl(int i, int i2) {
        this.am[i] = i2;
        this.as[i] = i2 & -128;
        aw(i, i2, -1637957885);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cm(ka kaVar, kh khVar, gq gqVar, int i) {
        boolean z = true;
        synchronized (this) {
            int[] iArr;
            kaVar.aq();
            if (i > 0) {
                int[] iArr2 = new int[1];
                iArr2[0] = i;
                iArr = iArr2;
            } else {
                iArr = null;
            }
            mb ar = kaVar.ad.ar();
            while (true) {
                mm mmVar = (mm) ar;
                if (mmVar == null) {
                    break;
                }
                boolean z2;
                int i2 = (int) mmVar.gs;
                long j = (long) i2;
                kj kjVar = (kj) this.ad.ad(j);
                if (kjVar == null) {
                    kjVar = hz.ad(khVar, i2, (byte) -100);
                    if (kjVar != null) {
                        this.ad.aq(kjVar, j);
                    }
                    z2 = false;
                    ar = kaVar.ad.al();
                    z = z2;
                }
                if (kjVar.aq(gqVar, mmVar.ad, iArr, (byte) 101)) {
                    z2 = z;
                    ar = kaVar.ad.al();
                    z = z2;
                }
                z2 = false;
                ar = kaVar.ad.al();
                z = z2;
            }
            if (z) {
                kaVar.ar();
            }
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void cn() {
        synchronized (this) {
            kj kjVar = (kj) this.ad.ar();
            while (kjVar != null) {
                kjVar.ar(1542817556);
                kjVar = (kj) this.ad.al();
            }
        }
    }

    public void co(int i, int i2) {
        synchronized (this) {
            ax(i, i2, 2038228868);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cp() {
        synchronized (this) {
            mb ar = this.ad.ar();
            while (true) {
                kj kjVar = (kj) ar;
                if (kjVar != null) {
                    kjVar.ky();
                    ar = this.ad.al();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cq(ka kaVar, kh khVar, gq gqVar, int i) {
        boolean z = true;
        synchronized (this) {
            int[] iArr;
            kaVar.aq();
            if (i > 0) {
                int[] iArr2 = new int[1];
                iArr2[0] = i;
                iArr = iArr2;
            } else {
                iArr = null;
            }
            mb ar = kaVar.ad.ar();
            while (true) {
                mm mmVar = (mm) ar;
                if (mmVar == null) {
                    break;
                }
                boolean z2;
                int i2 = (int) mmVar.gs;
                long j = (long) i2;
                kj kjVar = (kj) this.ad.ad(j);
                if (kjVar == null) {
                    kjVar = hz.ad(khVar, i2, (byte) 52);
                    if (kjVar != null) {
                        this.ad.aq(kjVar, j);
                    }
                    z2 = false;
                    ar = kaVar.ad.al();
                    z = z2;
                }
                if (kjVar.aq(gqVar, mmVar.ad, iArr, (byte) 101)) {
                    z2 = z;
                    ar = kaVar.ad.al();
                    z = z2;
                }
                z2 = false;
                ar = kaVar.ad.al();
                z = z2;
            }
            if (z) {
                kaVar.ar();
            }
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ct() {
        boolean ar;
        synchronized (this) {
            ar = this.bs.ar();
        }
        return ar;
    }

    public void cu(int i, int i2) {
        synchronized (this) {
            ax(i, i2, 1993181721);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int cv() {
        return this.aq * -680158667;
    }

    /* Access modifiers changed, original: 0000 */
    public void cw() {
        synchronized (this) {
            mb ar = this.ad.ar();
            while (true) {
                kj kjVar = (kj) ar;
                if (kjVar != null) {
                    kjVar.ky();
                    ar = this.ad.al();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cx() {
        boolean ar;
        synchronized (this) {
            ar = this.bs.ar();
        }
        return ar;
    }

    /* Access modifiers changed, original: 0000 */
    public void cz(int i, int i2) {
        this.am[i] = i2;
        this.as[i] = i2 & -128;
        aw(i, i2, -1188271046);
    }

    /* Access modifiers changed, original: 0000 */
    public void da(int i, int i2) {
    }

    /* Access modifiers changed, original: 0000 */
    public void db(int i, int i2) {
        this.ag[i] = i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void dc(int i) {
        mb ae = this.bf.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if (i < 0 || i == kcVar.ad * 1051654295) {
                    if (kcVar.ao != null) {
                        kcVar.ao.bq((hd.ad * -754139271) / 100);
                        if (kcVar.ao.bi()) {
                            this.bf.ar.ad(kcVar.ao);
                        }
                        kcVar.ad((byte) -45);
                    }
                    if (kcVar.ax * -427609645 < 0) {
                        this.bk[kcVar.ad * 1051654295][kcVar.ai * -1981512837] = null;
                    }
                    kcVar.ky();
                }
                ae = this.bf.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dd(int i, int i2, int i3) {
        kc kcVar;
        ao(i, i2, -1770185258, (byte) -1);
        if ((this.af[i] & 2) != 0) {
            mb am = this.bf.aq.am();
            while (true) {
                kcVar = (kc) am;
                if (kcVar == null) {
                    break;
                } else if (i != kcVar.ad * 1051654295 || kcVar.ax * -427609645 >= 0) {
                    am = this.bf.aq.as();
                } else {
                    this.bk[i][kcVar.ai * -1981512837] = null;
                    this.bk[i][i2] = kcVar;
                    int i4 = kcVar.ak;
                    int i5 = kcVar.ag;
                    int i6 = kcVar.as;
                    kcVar.ak += ((i2 - (kcVar.ai * 604155476)) << 8) * -2123283905;
                    kcVar.as = (((i4 * -1842458716) + (((i5 * 892847031) * (i6 * -1552523631)) >> 12)) - (kcVar.ak * -2004505153)) * 899838854;
                    kcVar.ag = -123703296;
                    kcVar.ai = -1992604116 * i2;
                    return;
                }
            }
        }
        kj kjVar = (kj) this.ad.ad((long) this.ak[i]);
        if (kjVar != null) {
            ht htVar = kjVar.aq[i2];
            if (htVar != null) {
                kc kcVar2 = new kc();
                kcVar2.ad = -939931584 * i;
                kcVar2.aq = kjVar;
                kcVar2.ar = htVar;
                kcVar2.al = kjVar.ai[i2];
                kcVar2.aj = kjVar.ae[i2] * 1425897026;
                kcVar2.ai = -503131220 * i2;
                kcVar2.ae = (((((i3 * i3) * (kjVar.ad * 1347535597)) * kjVar.al[i2]) + 1024) >> 11) * -1406478325;
                kcVar2.am = (kjVar.aj[i2] & 255) * 1438982964;
                kcVar2.ak = ((i2 << 8) - (kjVar.ar[i2] & 1767991288)) * -627723501;
                kcVar2.ap = 0;
                kcVar2.au = 0;
                kcVar2.az = 0;
                kcVar2.ax = -884297307;
                kcVar2.aw = 0;
                if (this.ab[i] == 0) {
                    kcVar2.ao = hf.al(htVar, bu(kcVar2, -828469946), bw(kcVar2, -223452201), br(kcVar2, -2047330581));
                } else {
                    kcVar2.ao = hf.al(htVar, bu(kcVar2, 2122102624), 0, br(kcVar2, -704471173));
                    aa(kcVar2, kjVar.ar[i2] < (short) 0, (byte) -95);
                }
                if (kjVar.ar[i2] < (short) 0) {
                    kcVar2.ao.as(-1);
                }
                if (kcVar2.aj * 836159379 >= 0) {
                    kcVar = this.ba[i][kcVar2.aj * -816708573];
                    if (kcVar != null && kcVar.ax * -893995266 < 0) {
                        this.bk[i][kcVar.ai * -1981512837] = null;
                        kcVar.ax = 0;
                    }
                    this.ba[i][kcVar2.aj * 836159379] = kcVar2;
                }
                this.bf.aq.aq(kcVar2);
                this.bk[i][i2] = kcVar2;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void de(int i) {
        int i2 = 0;
        if (i < 0) {
            while (i2 < 16) {
                bl(i2, 1118154262);
                i2++;
            }
            return;
        }
        this.aj[i] = -406402661;
        this.ai[i] = -862353745;
        this.ae[i] = 16383;
        this.ag[i] = 8192;
        this.ap[i] = 0;
        this.au[i] = 8192;
        bc(i, 340879859);
        bv(i, (byte) -10);
        this.af[i] = 0;
        this.ay[i] = -994904944;
        this.an[i] = 256;
        this.ab[i] = 0;
        bx(i, 8192, (byte) -1);
    }

    /* Access modifiers changed, original: 0000 */
    public void df(int i, int i2) {
    }

    /* Access modifiers changed, original: 0000 */
    public void dg(int i) {
        if ((this.af[i] & 4) != 0) {
            mb ae = this.bf.aq.ae();
            while (true) {
                kc kcVar = (kc) ae;
                if (kcVar != null) {
                    if (kcVar.ad * 1051654295 == i) {
                        kcVar.ay = 0;
                    }
                    ae = this.bf.aq.ak();
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dh(int i) {
        int i2 = 0;
        if (i < 0) {
            while (i2 < 16) {
                bl(i2, 1391410380);
                i2++;
            }
            return;
        }
        this.aj[i] = -802660825;
        this.ai[i] = 212969562;
        this.ae[i] = -983032581;
        this.ag[i] = 8192;
        this.ap[i] = 0;
        this.au[i] = -152626808;
        bc(i, 588958883);
        bv(i, (byte) -100);
        this.af[i] = 0;
        this.ay[i] = 32767;
        this.an[i] = 256;
        this.ab[i] = 0;
        bx(i, 566520340, (byte) -1);
    }

    /* Access modifiers changed, original: 0000 */
    public void di(int i, int i2, int i3) {
    }

    /* Access modifiers changed, original: 0000 */
    public void dj(int i) {
        int i2 = 1243488493 & i;
        int i3;
        int i4;
        if (i2 == 128) {
            ao(i & 15, (i >> 8) & 127, (i >> 16) & -1205555092, (byte) -1);
        } else if (i2 == 144) {
            i2 = i & 15;
            i3 = (i >> 8) & 127;
            i4 = (i >> 16) & -107025326;
            if (i4 > 0) {
                ac(i2, i3, i4, -1172087778);
            } else {
                ao(i2, i3, 64, (byte) -1);
            }
        } else if (i2 == 160) {
            ah(i & 15, (i >> 8) & 127, (i >> 16) & 127, (byte) 35);
        } else if (i2 == 1676554356) {
            int[] iArr;
            i2 = i & 15;
            i3 = (i >> 8) & 728805575;
            i4 = (i >> 16) & 705515060;
            if (i3 == 0) {
                this.as[i2] = (this.as[i2] & -2080769) + (i4 << 14);
            }
            if (2026547374 == i3) {
                this.as[i2] = (this.as[i2] & 1816054424) + (i4 << 7);
            }
            if (i3 == 1) {
                this.ap[i2] = (i4 << 7) + (this.ap[i2] & 1793242722);
            }
            if (i3 == 33) {
                this.ap[i2] = (this.ap[i2] & -128) + i4;
            }
            if (5 == i3) {
                this.au[i2] = (i4 << 7) + (this.au[i2] & -214741637);
            }
            if (i3 == 37) {
                this.au[i2] = (this.au[i2] & -1612653304) + i4;
            }
            if (i3 == 7) {
                this.aj[i2] = (i4 << 7) + (this.aj[i2] & -16257);
            }
            if (1955212476 == i3) {
                this.aj[i2] = (this.aj[i2] & 1487191137) + i4;
            }
            if (i3 == 10) {
                this.ai[i2] = (i4 << 7) + (this.ai[i2] & -16257);
            }
            if (i3 == 759217849) {
                this.ai[i2] = (this.ai[i2] & -1340499455) + i4;
            }
            if (11 == i3) {
                this.ae[i2] = (i4 << 7) + (this.ae[i2] & -1218930767);
            }
            if (43 == i3) {
                this.ae[i2] = (this.ae[i2] & -128) + i4;
            }
            if (64 == i3) {
                if (i4 >= 883774106) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 1;
                } else {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & -901184707;
                }
            }
            if (1921922851 == i3) {
                if (i4 >= 64) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 2;
                } else {
                    bc(i2, -1106060603);
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & -3;
                }
            }
            if (i3 == 99) {
                this.ay[i2] = (this.ay[i2] & 127) + (i4 << 7);
            }
            if (98 == i3) {
                this.ay[i2] = (this.ay[i2] & -650415832) + i4;
            }
            if (i3 == 255072716) {
                this.ay[i2] = ((this.ay[i2] & 127) - 401729738) + (i4 << 7);
            }
            if (100 == i3) {
                this.ay[i2] = ((this.ay[i2] & 16256) + 16384) + i4;
            }
            if (120 == i3) {
                bo(i2, 1082192888);
            }
            if (121 == i3) {
                bl(i2, -1636227864);
            }
            if (i3 == -374948151) {
                bf(i2, (byte) 1);
            }
            if (i3 == 6 && this.ay[i2] == 16384) {
                this.an[i2] = (i4 << 7) + (this.an[i2] & -16257);
            }
            if (-892335735 == i3 && 16384 == this.ay[i2]) {
                this.an[i2] = (this.an[i2] & 1541105493) + i4;
            }
            if (16 == i3) {
                this.ab[i2] = (this.ab[i2] & -16257) + (i4 << 7);
            }
            if (i3 == 995574156) {
                this.ab[i2] = (this.ab[i2] & -2077641050) + i4;
            }
            if (i3 == -1879282777) {
                if (i4 >= -1606222454) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 4;
                } else {
                    bv(i2, (byte) -67);
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & -5;
                }
            }
            if (i3 == 17) {
                bx(i2, (i4 << 7) + (this.av[i2] & 1604473593), (byte) -1);
            }
            if (i3 == 220606473) {
                bx(i2, (this.av[i2] & -128) + i4, (byte) -1);
            }
        } else if (i2 == 192) {
            i2 = i & 15;
            aw(i2, ((i >> 8) & -1207413219) + this.as[i2], -536989430);
        } else if (-1877916429 == i2) {
            af(i & 15, (i >> 8) & 127, (byte) 93);
        } else if (i2 == 224) {
            bq(i & 15, ((i >> 9) & 16256) + ((i >> 8) & -467780908), 1575911703);
        } else if (255 == (i & 255)) {
            bi((short) 16490);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dk(int i) {
        if ((this.af[i] & 2) != 0) {
            mb ae = this.bf.aq.ae();
            while (true) {
                kc kcVar = (kc) ae;
                if (kcVar != null) {
                    if (kcVar.ad * 1051654295 == i && this.bk[i][kcVar.ai * 478803574] == null && kcVar.ax * 1114262421 < 0) {
                        kcVar.ax = 0;
                    }
                    ae = this.bf.aq.ak();
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dl(int i, int i2, int i3) {
    }

    /* Access modifiers changed, original: 0000 */
    public void dm(kc kcVar, boolean z) {
        int i;
        int length = kcVar.ar.ar.length;
        if (z && kcVar.ar.ai) {
            i = (int) ((((long) ((length + length) - kcVar.ar.al)) * ((long) this.ab[kcVar.ad * 1051654295])) >> 6);
            length <<= 8;
            if (i >= length) {
                i = ((length + length) - 1) - i;
                kcVar.ao.aa(true);
            }
        } else {
            i = (int) ((((long) length) * ((long) this.ab[kcVar.ad * 1051654295])) >> 6);
        }
        kcVar.ao.ac(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void dn(int i) {
        int i2 = 0;
        if (i < 0) {
            while (i2 < 16) {
                bl(i2, -422553390);
                i2++;
            }
            return;
        }
        this.aj[i] = 12800;
        this.ai[i] = 8192;
        this.ae[i] = 16383;
        this.ag[i] = 8192;
        this.ap[i] = 0;
        this.au[i] = 8192;
        bc(i, 743869908);
        bv(i, (byte) -103);
        this.af[i] = 0;
        this.ay[i] = 32767;
        this.an[i] = 256;
        this.ab[i] = 0;
        bx(i, 8192, (byte) -1);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: do */
    public void m227do(int i) {
        mb ae = this.bf.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if ((i < 0 || kcVar.ad * 682311723 == i) && kcVar.ax * 1398497886 < 0) {
                    this.bk[kcVar.ad * 1051654295][kcVar.ai * -1981512837] = null;
                    kcVar.ax = 0;
                }
                ae = this.bf.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dp(int i) {
        int i2 = 0;
        if (i < 0) {
            while (i2 < 16) {
                bl(i2, -1695517764);
                i2++;
            }
            return;
        }
        this.aj[i] = 12800;
        this.ai[i] = 8192;
        this.ae[i] = 16383;
        this.ag[i] = 8192;
        this.ap[i] = 0;
        this.au[i] = 8192;
        bc(i, -460548168);
        bv(i, (byte) -110);
        this.af[i] = 0;
        this.ay[i] = 32767;
        this.an[i] = 256;
        this.ab[i] = 0;
        bx(i, 8192, (byte) -1);
    }

    /* Access modifiers changed, original: 0000 */
    public void dq() {
        int i = 0;
        bo(-1, -317858925);
        bl(-1, -1725244176);
        for (int i2 = 0; i2 < 16; i2++) {
            this.ak[i2] = this.am[i2];
        }
        while (i < 16) {
            this.as[i] = this.am[i] & -128;
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dr(int i, int i2) {
    }

    /* Access modifiers changed, original: 0000 */
    public void ds(int i) {
        mb ae = this.bf.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if ((i < 0 || kcVar.ad * 1051654295 == i) && kcVar.ax * -427609645 < 0) {
                    this.bk[kcVar.ad * 1051654295][kcVar.ai * -1981512837] = null;
                    kcVar.ax = 0;
                }
                ae = this.bf.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dt(int i, int i2, int i3) {
        kc kcVar = this.bk[i][i2];
        if (kcVar != null) {
            this.bk[i][i2] = null;
            if ((this.af[i] & 2) != 0) {
                mb ae = this.bf.aq.ae();
                while (true) {
                    kc kcVar2 = (kc) ae;
                    if (kcVar2 == null) {
                        return;
                    }
                    if (kcVar2.ad * 1051654295 != kcVar.ad * 1051654295 || kcVar2.ax * -427609645 >= 0 || kcVar == kcVar2) {
                        ae = this.bf.aq.ak();
                    } else {
                        kcVar.ax = 0;
                        return;
                    }
                }
            }
            kcVar.ax = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void du(int i) {
        mb ae = this.bf.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if (i < 0 || i == kcVar.ad * 1051654295) {
                    if (kcVar.ao != null) {
                        kcVar.ao.bq((hd.ad * -754139271) / 100);
                        if (kcVar.ao.bi()) {
                            this.bf.ar.ad(kcVar.ao);
                        }
                        kcVar.ad((byte) -11);
                    }
                    if (kcVar.ax * -427609645 < 0) {
                        this.bk[kcVar.ad * 1051654295][kcVar.ai * -1981512837] = null;
                    }
                    kcVar.ky();
                }
                ae = this.bf.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dv(int i, int i2, int i3) {
    }

    /* Access modifiers changed, original: 0000 */
    public void dw(int i) {
        if ((this.af[i] & 2) != 0) {
            mb ae = this.bf.aq.ae();
            while (true) {
                kc kcVar = (kc) ae;
                if (kcVar != null) {
                    if (kcVar.ad * 1051654295 == i && this.bk[i][kcVar.ai * -1981512837] == null && kcVar.ax * -427609645 < 0) {
                        kcVar.ax = 0;
                    }
                    ae = this.bf.aq.ak();
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dx() {
        int i = 0;
        bo(-1, -615942814);
        bl(-1, -315199953);
        for (int i2 = 0; i2 < 16; i2++) {
            this.ak[i2] = this.am[i2];
        }
        while (i < 16) {
            this.as[i] = this.am[i] & -128;
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dy(int i) {
        mb ae = this.bf.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if ((i < 0 || kcVar.ad * 1051654295 == i) && kcVar.ax * -427609645 < 0) {
                    this.bk[kcVar.ad * 1051654295][kcVar.ai * -1981512837] = null;
                    kcVar.ax = 0;
                }
                ae = this.bf.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dz(int i) {
        int i2 = -2009472197 & i;
        int i3;
        int i4;
        if (i2 == -733228717) {
            ao(i & 15, (i >> 8) & -2146676379, (i >> 16) & 127, (byte) -1);
        } else if (i2 == 144) {
            i2 = i & 15;
            i3 = (i >> 8) & 127;
            i4 = (i >> 16) & 1750951989;
            if (i4 > 0) {
                ac(i2, i3, i4, -1172087778);
            } else {
                ao(i2, i3, 64, (byte) -1);
            }
        } else if (i2 == 160) {
            ah(i & 15, (i >> 8) & 127, (i >> 16) & 1657362108, (byte) 17);
        } else if (i2 == 176) {
            int[] iArr;
            i2 = i & 15;
            i3 = (i >> 8) & 127;
            i4 = (i >> 16) & -705834843;
            if (i3 == 0) {
                this.as[i2] = (this.as[i2] & -2121786494) + (i4 << 14);
            }
            if (32 == i3) {
                this.as[i2] = (this.as[i2] & 1538019119) + (i4 << 7);
            }
            if (i3 == 1) {
                this.ap[i2] = (i4 << 7) + (this.ap[i2] & -16257);
            }
            if (i3 == 33) {
                this.ap[i2] = (this.ap[i2] & -986755784) + i4;
            }
            if (5 == i3) {
                this.au[i2] = (i4 << 7) + (this.au[i2] & -16257);
            }
            if (i3 == 204360458) {
                this.au[i2] = (this.au[i2] & 837712390) + i4;
            }
            if (i3 == 7) {
                this.aj[i2] = (i4 << 7) + (this.aj[i2] & 1733573805);
            }
            if (-259592119 == i3) {
                this.aj[i2] = (this.aj[i2] & 669778688) + i4;
            }
            if (i3 == 10) {
                this.ai[i2] = (i4 << 7) + (this.ai[i2] & -1426237654);
            }
            if (i3 == 42) {
                this.ai[i2] = (this.ai[i2] & 348644516) + i4;
            }
            if (11 == i3) {
                this.ae[i2] = (i4 << 7) + (this.ae[i2] & -775317915);
            }
            if (-266727732 == i3) {
                this.ae[i2] = (this.ae[i2] & -128) + i4;
            }
            if (64 == i3) {
                if (i4 >= 192402224) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 1;
                } else {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & 749685235;
                }
            }
            if (65 == i3) {
                if (i4 >= 64) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 2;
                } else {
                    bc(i2, -141957382);
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & -1968143320;
                }
            }
            if (i3 == 99) {
                this.ay[i2] = (this.ay[i2] & 127) + (i4 << 7);
            }
            if (2112997084 == i3) {
                this.ay[i2] = (this.ay[i2] & 16256) + i4;
            }
            if (i3 == 647494543) {
                this.ay[i2] = ((this.ay[i2] & 127) + 16384) + (i4 << 7);
            }
            if (100 == i3) {
                this.ay[i2] = ((this.ay[i2] & 767421311) + 428561751) + i4;
            }
            if (1401028209 == i3) {
                bo(i2, -278940403);
            }
            if (121 == i3) {
                bl(i2, 192363430);
            }
            if (i3 == 123) {
                bf(i2, (byte) 1);
            }
            if (i3 == 6 && this.ay[i2] == 16384) {
                this.an[i2] = (i4 << 7) + (this.an[i2] & -16257);
            }
            if (-547424343 == i3 && 1202746052 == this.ay[i2]) {
                this.an[i2] = (this.an[i2] & -128) + i4;
            }
            if (16 == i3) {
                this.ab[i2] = (this.ab[i2] & -16257) + (i4 << 7);
            }
            if (i3 == 48) {
                this.ab[i2] = (this.ab[i2] & -128) + i4;
            }
            if (i3 == 927162408) {
                if (i4 >= -1089999036) {
                    iArr = this.af;
                    iArr[i2] = iArr[i2] | 4;
                } else {
                    bv(i2, (byte) -97);
                    iArr = this.af;
                    iArr[i2] = iArr[i2] & 1395477345;
                }
            }
            if (i3 == 17) {
                bx(i2, (i4 << 7) + (this.av[i2] & -16257), (byte) -1);
            }
            if (i3 == 331618167) {
                bx(i2, (this.av[i2] & -1700169478) + i4, (byte) -1);
            }
        } else if (i2 == 192) {
            i2 = i & 15;
            aw(i2, ((i >> 8) & -989762287) + this.as[i2], -145111739);
        } else if (208 == i2) {
            af(i & 15, (i >> 8) & 127, (byte) 52);
        } else if (i2 == 260125787) {
            bq(i & 15, ((i >> 9) & -637944201) + ((i >> 8) & 127), 1575911703);
        } else if (255 == (i & 255)) {
            bi((short) 2335);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ea(kc kcVar) {
        int i;
        int i2 = ((this.an[kcVar.ad * 1051654295] * (this.ag[kcVar.ad * -1254630664] - 1392313765)) >> 12) + ((kcVar.ak * -2004505153) + (((kcVar.ag * 1315356280) * (kcVar.as * 1963076524)) >> 12));
        ke keVar = kcVar.al;
        if (keVar.am * -1696012266 <= 0 || (keVar.ae * 1839509663 <= 0 && this.ap[kcVar.ad * 1051654295] <= 0)) {
            i = i2;
        } else {
            i = (keVar.ae * -1467174358) << 2;
            int i3 = (keVar.ak * -1160075621) << 1;
            if (kcVar.ac * -154491153 < i3) {
                i = (i * (kcVar.ac * 1228238881)) / i3;
            }
            i = ((int) (Math.sin(((double) (-1928828282 & (kcVar.aa * -463625164))) * 0.01227184630308513d) * ((double) (i + (this.ap[kcVar.ad * -218492217] >> 7))))) + i2;
        }
        i = (int) (((Math.pow(2.0d, ((double) i) * 3.255208333333333E-4d) * ((double) (kcVar.ar.aq * 2062216288))) / ((double) (hd.ad * -754139271))) + 0.5d);
        return i < 1 ? 1 : i;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean eb(kc kcVar, int[] iArr, int i, int i2) {
        kcVar.ah = ((hd.ad * 256462239) / 1718975720) * 1770781113;
        if (kcVar.ax * 141198461 < 0 || !(kcVar.ao == null || kcVar.ao.bf())) {
            Object obj;
            int i3 = kcVar.ag * 892847031;
            if (i3 > 0) {
                i3 -= (int) ((Math.pow(2.0d, ((double) this.au[kcVar.ad * 1051654295]) * 4.921259842519685E-4d) * 16.0d) + 0.5d);
                if (i3 < 0) {
                    i3 = 0;
                }
                kcVar.ag = i3 * -1647343097;
            }
            kcVar.ao.bo(bu(kcVar, -737363390));
            ke keVar = kcVar.al;
            kcVar.ac -= 524746059;
            kcVar.aa += keVar.am * 11739739;
            double d = ((double) ((((kcVar.as * 177573992) * (kcVar.ag * 2010611861)) >> 12) + (((kcVar.ai * -1981512837) - 60) << 8))) * 5.086263020833333E-6d;
            if (keVar.ar * -1822217711 > 0) {
                if (keVar.ai * 1903485689 > 0) {
                    kcVar.ap += ((int) ((Math.pow(2.0d, ((double) (keVar.ai * 141051529)) * d) * 128.0d) + 0.5d)) * -429171521;
                } else {
                    kcVar.ap += 900620160;
                }
            }
            if (keVar.ad != null) {
                if (keVar.al * 2129664973 > 0) {
                    kcVar.au += ((int) ((Math.pow(2.0d, ((double) (keVar.al * 2129664973)) * d) * 128.0d) + 0.5d)) * -1107701639;
                } else {
                    kcVar.au -= 2051562066;
                }
                while (kcVar.az * 63106682 < keVar.ad.length - 2 && kcVar.au * 1637048997 > ((keVar.ad[(kcVar.az * -1623398731) + 2] & 270234203) << 8)) {
                    kcVar.az += 1306885733;
                }
                if (kcVar.az * -2043080741 == keVar.ad.length - 2 && keVar.ad[(kcVar.az * -515130072) + 1] == (byte) 0) {
                    obj = 1;
                    if (kcVar.ax * -427609645 >= 0 && keVar.aq != null && (this.af[kcVar.ad * -1883235680] & 1) == 0 && (kcVar.aj * -474809328 < 0 || this.ba[kcVar.ad * 1051654295][kcVar.aj * 137664550] != kcVar)) {
                        if (keVar.aj * -945199779 <= 0) {
                            kcVar.ax = (((int) ((Math.pow(2.0d, d * ((double) (keVar.aj * -918651717))) * 128.0d) + 0.5d)) * 884297307) + kcVar.ax;
                        } else {
                            kcVar.ax -= 1071674900;
                        }
                        while (kcVar.aw * 356123 < keVar.aq.length - 2 && kcVar.ax * -427609645 > ((keVar.aq[(kcVar.aw * 301105877) + 2] & 1582676188) << 8)) {
                            kcVar.aw += 1339205158;
                        }
                        if (keVar.aq.length - 2 == kcVar.aw * 356123) {
                            obj = 1;
                        }
                    }
                    if (obj == null) {
                        kcVar.ao.bq(kcVar.ah * 1132626509);
                        if (iArr != null) {
                            kcVar.ao.ak(iArr, i, i2);
                        } else {
                            kcVar.ao.ag(i2);
                        }
                        if (kcVar.ao.bi()) {
                            this.bf.ar.ad(kcVar.ao);
                        }
                        kcVar.ad((byte) -15);
                        if (kcVar.ax * 1600987059 >= 0) {
                            kcVar.ky();
                            if (kcVar.aj * 1802048407 > 0 && kcVar == this.ba[kcVar.ad * 1039148682][kcVar.aj * 836159379]) {
                                this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] = null;
                            }
                        }
                        return true;
                    }
                    kcVar.ao.af(kcVar.ah * 1132626509, bw(kcVar, -223452201), br(kcVar, -634800131));
                    return false;
                }
            }
            obj = null;
            if (keVar.aj * -945199779 <= 0) {
            }
            while (kcVar.aw * 356123 < keVar.aq.length - 2) {
                kcVar.aw += 1339205158;
            }
            if (keVar.aq.length - 2 == kcVar.aw * 356123) {
            }
            if (obj == null) {
            }
        } else {
            kcVar.ad((byte) -15);
            kcVar.ky();
            if (kcVar.aj * 836159379 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * -320948383]) {
                this.ba[kcVar.ad * 238787064][kcVar.aj * 836159379] = null;
            }
            return true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ec(kc kcVar) {
        int i;
        int i2 = ((this.an[kcVar.ad * 1051654295] * (this.ag[kcVar.ad * 580525861] - 8192)) >> 12) + ((kcVar.ak * -2004505153) + (((kcVar.ag * 892847031) * (kcVar.as * 1581400141)) >> 12));
        ke keVar = kcVar.al;
        if (keVar.am * -345278239 <= 0 || (keVar.ae * 1839509663 <= 0 && this.ap[kcVar.ad * 1051654295] <= 0)) {
            i = i2;
        } else {
            i = (keVar.ae * 1839509663) << 2;
            int i3 = (keVar.ak * -202206899) << 1;
            if (kcVar.ac * -329748538 < i3) {
                i = (i * (kcVar.ac * 107898411)) / i3;
            }
            i = ((int) (Math.sin(((double) (-1009884988 & (kcVar.aa * 162741875))) * 0.01227184630308513d) * ((double) (i + (this.ap[kcVar.ad * 391476844] >> 7))))) + i2;
        }
        i = (int) (((Math.pow(2.0d, ((double) i) * 3.255208333333333E-4d) * ((double) (kcVar.ar.aq * 256))) / ((double) (hd.ad * 986497471))) + 0.5d);
        return i < 1 ? 1 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public int ed(kc kcVar) {
        int i = this.ai[kcVar.ad * 1051654295];
        return i < 170596485 ? ((i * (kcVar.am * -628647127)) + 32) >> 6 : 16384 - ((((16384 - i) * (128 - (kcVar.am * -628647127))) + 32) >> 6);
    }

    /* Access modifiers changed, original: 0000 */
    public void ee() {
        int i = this.bq * 974786841;
        int i2 = this.bd * -825473743;
        long j = this.bl * 2325224287372660477L;
        while (i2 == this.bd * -825473743) {
            while (i2 == this.bs.aj[i]) {
                this.bs.aj(i);
                int ak = this.bs.ak(i);
                if (ak == 1) {
                    this.bs.ae();
                    this.bs.ai(i);
                    if (!this.bs.az()) {
                        continue;
                    } else if (!this.bm || i2 == 0) {
                        bi((short) 22373);
                        this.bs.aq();
                        return;
                    } else {
                        this.bs.ax(j);
                    }
                    i = this.bs.au();
                    i2 = this.bs.aj[i];
                    j = this.bs.ap(i2);
                } else {
                    if ((ak & 128) != 0) {
                        bg(ak, (byte) -49);
                    }
                    this.bs.am(i);
                    this.bs.ai(i);
                }
            }
            i = this.bs.au();
            i2 = this.bs.aj[i];
            j = this.bs.ap(i2);
        }
        this.bq = i * -1631143127;
        this.bd = i2 * -1829833775;
        this.bl = j * -1065754014451122603L;
    }

    public void ef(boolean z) {
        this.al = z;
    }

    /* Access modifiers changed, original: 0000 */
    public int eg(kc kcVar) {
        int i = this.ai[kcVar.ad * 1051654295];
        return i < 8192 ? ((i * (kcVar.am * -628647127)) + 32) >> 6 : 16384 - ((((16384 - i) * (128 - (kcVar.am * -628647127))) + 32) >> 6);
    }

    /* Access modifiers changed, original: 0000 */
    public int eh(kc kcVar) {
        int i;
        int i2 = ((this.an[kcVar.ad * 1051654295] * (this.ag[kcVar.ad * 521902482] - 8192)) >> 12) + ((kcVar.ak * -2004505153) + (((kcVar.ag * 1348492271) * (kcVar.as * 1195123710)) >> 12));
        ke keVar = kcVar.al;
        if (keVar.am * 235651047 <= 0 || (keVar.ae * -1172471960 <= 0 && this.ap[kcVar.ad * -1662226692] <= 0)) {
            i = i2;
        } else {
            i = (keVar.ae * 475762037) << 2;
            int i3 = (keVar.ak * -202206899) << 1;
            if (kcVar.ac * 1228238881 < i3) {
                i = (i * (kcVar.ac * 2010152457)) / i3;
            }
            i = ((int) (Math.sin(((double) ((kcVar.aa * -1127216737) & FrameMetricsAggregator.EVERY_DURATION)) * 0.01227184630308513d) * ((double) (i + (this.ap[kcVar.ad * 1051654295] >> 7))))) + i2;
        }
        i = (int) (((Math.pow(2.0d, ((double) i) * 3.255208333333333E-4d) * ((double) (kcVar.ar.aq * 256))) / ((double) (hd.ad * -754139271))) + 0.5d);
        return i < 1 ? 1 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public int ei(kc kcVar) {
        int i;
        int i2;
        int i3;
        ke keVar = kcVar.al;
        int i4 = ((this.ae[kcVar.ad * 1051654295] * this.aj[kcVar.ad * -783353516]) + 2023697651) >> 13;
        i4 = ((((((((i4 * i4) - 1406306490) >> 15) * (kcVar.ae * 124842766)) - 399264726) >> 15) * (this.aq * -680158667)) + 780642114) >> 8;
        if (keVar.ar * -1724516279 > 0) {
            i4 = (int) ((((double) i4) * Math.pow(0.5d, (((double) (kcVar.ap * 1001219647)) * 1.953125E-5d) * ((double) (keVar.ar * -1103448094)))) + 0.5d);
        }
        if (keVar.ad != null) {
            i = kcVar.au;
            i2 = keVar.ad[(kcVar.az * -2043080741) + 1];
            if (kcVar.az * 1367467897 < keVar.ad.length - 2) {
                i3 = (keVar.ad[kcVar.az * -2043080741] & 83089625) << 8;
                i2 += (((i * 1768224201) - i3) * (keVar.ad[(kcVar.az * -2043080741) + 3] - i2)) / (((keVar.ad[(kcVar.az * -1695042749) + 2] & 255) << 8) - i3);
            }
            i4 = ((i4 * i2) + 32) >> 6;
        }
        if (kcVar.ax * -427609645 <= 0 || keVar.aq == null) {
            return i4;
        }
        i = kcVar.ax;
        i2 = keVar.aq[(kcVar.aw * -584018587) + 1];
        if (kcVar.aw * 735549491 < keVar.aq.length - 2) {
            i3 = (keVar.aq[kcVar.aw * 356123] & -579171292) << 8;
            i2 += ((keVar.aq[(kcVar.aw * 1298785091) + 3] - i2) * ((i * -126678137) - i3)) / (((582214605 & keVar.aq[(kcVar.aw * 356123) + 2]) << 8) - i3);
        }
        return ((i4 * i2) + 32) >> 6;
    }

    /* Access modifiers changed, original: 0000 */
    public int ek(kc kcVar) {
        int i;
        int i2;
        int i3;
        ke keVar = kcVar.al;
        int i4 = ((this.ae[kcVar.ad * 1051654295] * this.aj[kcVar.ad * 1051654295]) + 4096) >> 13;
        i4 = ((((((((i4 * i4) + 16384) >> 15) * (kcVar.ae * 542879497)) + 16384) >> 15) * (this.aq * -680158667)) + 128) >> 8;
        if (keVar.ar * -1174721249 > 0) {
            i4 = (int) ((((double) i4) * Math.pow(0.5d, (((double) (kcVar.ap * -825355457)) * 1.953125E-5d) * ((double) (keVar.ar * -1174721249)))) + 0.5d);
        }
        if (keVar.ad != null) {
            i = kcVar.au;
            i2 = keVar.ad[(kcVar.az * -2043080741) + 1];
            if (kcVar.az * -2043080741 < keVar.ad.length - 2) {
                i3 = (keVar.ad[kcVar.az * -2043080741] & 255) << 8;
                i2 += (((i * -795108919) - i3) * (keVar.ad[(kcVar.az * -2043080741) + 3] - i2)) / (((keVar.ad[(kcVar.az * -2043080741) + 2] & 255) << 8) - i3);
            }
            i4 = ((i4 * i2) + 32) >> 6;
        }
        if (kcVar.ax * -427609645 <= 0 || keVar.aq == null) {
            return i4;
        }
        i = kcVar.ax;
        i2 = keVar.aq[(kcVar.aw * 356123) + 1];
        if (kcVar.aw * 356123 < keVar.aq.length - 2) {
            i3 = (keVar.aq[kcVar.aw * 356123] & 255) << 8;
            i2 += ((keVar.aq[(kcVar.aw * 356123) + 3] - i2) * ((i * -427609645) - i3)) / (((keVar.aq[(kcVar.aw * 356123) + 2] & 255) << 8) - i3);
        }
        return ((i4 * i2) + 32) >> 6;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean el(kc kcVar, int[] iArr, int i, int i2) {
        kcVar.ah = ((hd.ad * 1034083175) / 100) * -96856214;
        if (kcVar.ax * -427609645 < 0 || !(kcVar.ao == null || kcVar.ao.bf())) {
            Object obj;
            int i3 = kcVar.ag * 892847031;
            if (i3 > 0) {
                i3 -= (int) ((Math.pow(2.0d, ((double) this.au[kcVar.ad * 1051654295]) * 4.921259842519685E-4d) * 16.0d) + 0.5d);
                if (i3 < 0) {
                    i3 = 0;
                }
                kcVar.ag = i3 * -1647343097;
            }
            kcVar.ao.bo(bu(kcVar, 1016564538));
            ke keVar = kcVar.al;
            kcVar.ac += 478358834;
            kcVar.aa += keVar.am * 170636730;
            double d = 5.086263020833333E-6d * ((double) ((((kcVar.as * 1581400141) * (kcVar.ag * 892847031)) >> 12) + (((kcVar.ai * -1981512837) - 1656236505) << 8)));
            if (keVar.ar * 657664437 > 0) {
                if (keVar.ai * 1903485689 > 0) {
                    kcVar.ap += ((int) ((Math.pow(2.0d, ((double) (keVar.ai * 1903485689)) * d) * 128.0d) + 0.5d)) * -1073810914;
                } else {
                    kcVar.ap += 142947541;
                }
            }
            if (keVar.ad != null) {
                int i4;
                if (keVar.al * 218517379 > 0) {
                    i4 = kcVar.au;
                    i3 = ((int) ((Math.pow(2.0d, ((double) (keVar.al * 1147022462)) * d) * 128.0d) + 0.5d)) * -1107701639;
                } else {
                    i4 = kcVar.au;
                    i3 = 319433541;
                }
                kcVar.au = i3 + i4;
                while (kcVar.az * -639808278 < keVar.ad.length - 2 && kcVar.au * -795108919 > ((keVar.ad[(kcVar.az * -355615357) + 2] & 255) << 8)) {
                    kcVar.az += 1373763758;
                }
                if (kcVar.az * 723608403 == keVar.ad.length - 2 && keVar.ad[(kcVar.az * 667716379) + 1] == (byte) 0) {
                    obj = 1;
                    if (kcVar.ax * -522033147 >= 0 && keVar.aq != null && (this.af[kcVar.ad * 1051654295] & 1) == 0 && (kcVar.aj * -1078685368 < 0 || this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] != kcVar)) {
                        if (keVar.aj * -918651717 <= 0) {
                            kcVar.ax += ((int) ((Math.pow(2.0d, d * ((double) (keVar.aj * -918651717))) * 128.0d) + 0.5d)) * 884297307;
                        } else {
                            kcVar.ax += 1520905600;
                        }
                        while (kcVar.aw * 732249272 < keVar.aq.length - 2 && kcVar.ax * -111452194 > ((keVar.aq[(kcVar.aw * 1699941879) + 2] & 44514522) << 8)) {
                            kcVar.aw += 1062608697;
                        }
                        if (keVar.aq.length - 2 == kcVar.aw * 356123) {
                            obj = 1;
                        }
                    }
                    if (obj == null) {
                        kcVar.ao.bq(kcVar.ah * 1132626509);
                        if (iArr != null) {
                            kcVar.ao.ak(iArr, i, i2);
                        } else {
                            kcVar.ao.ag(i2);
                        }
                        if (kcVar.ao.bi()) {
                            this.bf.ar.ad(kcVar.ao);
                        }
                        kcVar.ad((byte) -118);
                        if (kcVar.ax * 1112746587 >= 0) {
                            kcVar.ky();
                            if (kcVar.aj * -1957170752 > 0 && kcVar == this.ba[kcVar.ad * 520052008][kcVar.aj * -187438458]) {
                                this.ba[kcVar.ad * -579057813][kcVar.aj * 327743676] = null;
                            }
                        }
                        return true;
                    }
                    kcVar.ao.af(kcVar.ah * -857908457, bw(kcVar, -223452201), br(kcVar, -1165843979));
                    return false;
                }
            }
            obj = null;
            if (keVar.aj * -918651717 <= 0) {
            }
            while (kcVar.aw * 732249272 < keVar.aq.length - 2) {
                kcVar.aw += 1062608697;
            }
            if (keVar.aq.length - 2 == kcVar.aw * 356123) {
            }
            if (obj == null) {
            }
        } else {
            kcVar.ad((byte) -68);
            kcVar.ky();
            if (kcVar.aj * -1645658479 > 0 && kcVar == this.ba[kcVar.ad * 1055152045][kcVar.aj * -420258648]) {
                this.ba[kcVar.ad * -1123232346][kcVar.aj * -1852411114] = null;
            }
            return true;
        }
    }

    public void em(boolean z) {
        this.al = z;
    }

    /* Access modifiers changed, original: 0000 */
    public int en(kc kcVar) {
        int i;
        int i2;
        int i3;
        ke keVar = kcVar.al;
        int i4 = ((this.ae[kcVar.ad * -649186452] * this.aj[kcVar.ad * -171374846]) + 4096) >> 13;
        i4 = ((((((((i4 * i4) - 458659632) >> 15) * (kcVar.ae * 542879497)) + 1038459101) >> 15) * (this.aq * -680158667)) - 186419713) >> 8;
        if (keVar.ar * -1174721249 > 0) {
            i4 = (int) ((((double) i4) * Math.pow(0.5d, (((double) (kcVar.ap * -380384416)) * 1.953125E-5d) * ((double) (keVar.ar * -1720358404)))) + 0.5d);
        }
        if (keVar.ad != null) {
            i = kcVar.au;
            i2 = keVar.ad[(kcVar.az * -2043080741) + 1];
            if (kcVar.az * 1763216739 < keVar.ad.length - 2) {
                i3 = (keVar.ad[kcVar.az * -2043080741] & 264461558) << 8;
                i2 += (((i * -795108919) - i3) * (keVar.ad[(kcVar.az * -2043080741) + 3] - i2)) / (((keVar.ad[(kcVar.az * -1815036481) + 2] & 255) << 8) - i3);
            }
            i4 = ((i4 * i2) - 1089893473) >> 6;
        }
        if (kcVar.ax * -427609645 <= 0 || keVar.aq == null) {
            return i4;
        }
        i = kcVar.ax;
        i2 = keVar.aq[(kcVar.aw * 764090881) + 1];
        if (kcVar.aw * -391453726 < keVar.aq.length - 2) {
            i3 = (keVar.aq[kcVar.aw * -586648804] & 255) << 8;
            i2 += ((keVar.aq[(kcVar.aw * 190445273) + 3] - i2) * ((i * -5692364) - i3)) / (((399302909 & keVar.aq[(kcVar.aw * 356123) + 2]) << 8) - i3);
        }
        return ((i4 * i2) - 1430222127) >> 6;
    }

    /* Access modifiers changed, original: 0000 */
    public void eo(int i, int i2) {
        this.av[i] = i2;
        this.at[i] = (int) ((Math.pow(2.0d, ((double) i2) * 5.4931640625E-4d) * 2097152.0d) + 0.5d);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ep(kc kcVar, int[] iArr, int i, int i2) {
        kcVar.ah = ((hd.ad * -1275162089) / 595606112) * -2080995707;
        if (kcVar.ax * -427609645 < 0 || !(kcVar.ao == null || kcVar.ao.bf())) {
            Object obj;
            int i3 = kcVar.ag * 1085714622;
            if (i3 > 0) {
                i3 -= (int) ((Math.pow(2.0d, ((double) this.au[kcVar.ad * 1430810104]) * 4.921259842519685E-4d) * 16.0d) + 0.5d);
                if (i3 < 0) {
                    i3 = 0;
                }
                kcVar.ag = i3 * 1654876422;
            }
            kcVar.ao.bo(bu(kcVar, -832942527));
            ke keVar = kcVar.al;
            kcVar.ac -= 1230154561;
            kcVar.aa += keVar.am * 1121551220;
            double d = ((double) ((((kcVar.as * 2125648489) * (kcVar.ag * -1740878369)) >> 12) + (((kcVar.ai * 2107911844) + 1016901156) << 8))) * 5.086263020833333E-6d;
            if (keVar.ar * -1174721249 > 0) {
                if (keVar.ai * 1903485689 > 0) {
                    kcVar.ap += ((int) ((Math.pow(2.0d, ((double) (keVar.ai * -54305797)) * d) * 128.0d) + 0.5d)) * -429171521;
                } else {
                    kcVar.ap += 900620160;
                }
            }
            if (keVar.ad != null) {
                if (keVar.al * 476290528 > 0) {
                    kcVar.au += ((int) ((Math.pow(2.0d, ((double) (keVar.al * -282759627)) * d) * 128.0d) + 0.5d)) * -1107701639;
                } else {
                    kcVar.au -= 51889024;
                }
                while (kcVar.az * -2043080741 < keVar.ad.length - 2 && kcVar.au * -795108919 > ((keVar.ad[(kcVar.az * -2043080741) + 2] & -1613135472) << 8)) {
                    kcVar.az += 457940326;
                }
                if (kcVar.az * -2043080741 == keVar.ad.length - 2 && keVar.ad[(kcVar.az * -1202766394) + 1] == (byte) 0) {
                    obj = 1;
                    if (kcVar.ax * 1949860555 >= 0 && keVar.aq != null && (this.af[kcVar.ad * 388400349] & 1) == 0 && (kcVar.aj * 836159379 < 0 || this.ba[kcVar.ad * 565248221][kcVar.aj * -259260093] != kcVar)) {
                        if (keVar.aj * -918651717 <= 0) {
                            kcVar.ax = (((int) ((Math.pow(2.0d, d * ((double) (keVar.aj * -532382868))) * 128.0d) + 0.5d)) * -229959731) + kcVar.ax;
                        } else {
                            kcVar.ax -= 265527317;
                        }
                        while (kcVar.aw * 1054936291 < keVar.aq.length - 2 && kcVar.ax * -427609645 > ((keVar.aq[(kcVar.aw * 356123) + 2] & 255) << 8)) {
                            kcVar.aw += 1339205158;
                        }
                        if (keVar.aq.length - 2 == kcVar.aw * 356123) {
                            obj = 1;
                        }
                    }
                    if (obj == null) {
                        kcVar.ao.bq(kcVar.ah * -1187793979);
                        if (iArr != null) {
                            kcVar.ao.ak(iArr, i, i2);
                        } else {
                            kcVar.ao.ag(i2);
                        }
                        if (kcVar.ao.bi()) {
                            this.bf.ar.ad(kcVar.ao);
                        }
                        kcVar.ad((byte) -101);
                        if (kcVar.ax * 461907527 >= 0) {
                            kcVar.ky();
                            if (kcVar.aj * 836159379 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * -208375704]) {
                                this.ba[kcVar.ad * 1051654295][kcVar.aj * 1421849247] = null;
                            }
                        }
                        return true;
                    }
                    kcVar.ao.af(kcVar.ah * -2146030867, bw(kcVar, -223452201), br(kcVar, -1946590898));
                    return false;
                }
            }
            obj = null;
            if (keVar.aj * -918651717 <= 0) {
            }
            while (kcVar.aw * 1054936291 < keVar.aq.length - 2) {
                kcVar.aw += 1339205158;
            }
            if (keVar.aq.length - 2 == kcVar.aw * 356123) {
            }
            if (obj == null) {
            }
        } else {
            kcVar.ad((byte) -55);
            kcVar.ky();
            if (kcVar.aj * -564002034 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * -1165399255]) {
                this.ba[kcVar.ad * 408479552][kcVar.aj * 836159379] = null;
            }
            return true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void eq(int i, int i2) {
        this.av[i] = i2;
        this.at[i] = (int) ((Math.pow(2.0d, ((double) i2) * 5.4931640625E-4d) * 2097152.0d) + 0.5d);
    }

    /* Access modifiers changed, original: 0000 */
    public void er() {
        int i = this.bq * -1494620588;
        int i2 = this.bd * -825473743;
        long j = this.bl * 2325224287372660477L;
        while (i2 == this.bd * -825473743) {
            while (i2 == this.bs.aj[i]) {
                this.bs.aj(i);
                int ak = this.bs.ak(i);
                if (ak == 1) {
                    this.bs.ae();
                    this.bs.ai(i);
                    if (!this.bs.az()) {
                        continue;
                    } else if (!this.bm || i2 == 0) {
                        bi((short) 24830);
                        this.bs.aq();
                        return;
                    } else {
                        this.bs.ax(j);
                    }
                    i = this.bs.au();
                    i2 = this.bs.aj[i];
                    j = this.bs.ap(i2);
                } else {
                    if ((ak & 128) != 0) {
                        bg(ak, (byte) -48);
                    }
                    this.bs.am(i);
                    this.bs.ai(i);
                }
            }
            i = this.bs.au();
            i2 = this.bs.aj[i];
            j = this.bs.ap(i2);
        }
        this.bq = i * 126926491;
        this.bd = i2 * -1829833775;
        this.bl = j * -1065754014451122603L;
    }

    /* Access modifiers changed, original: 0000 */
    public void et(int i, int i2) {
        this.av[i] = i2;
        this.at[i] = (int) ((Math.pow(2.0d, ((double) i2) * 5.4931640625E-4d) * 2097152.0d) + 0.5d);
    }

    /* Access modifiers changed, original: 0000 */
    public void eu() {
        int i = this.bq * 974786841;
        int i2 = this.bd * -825473743;
        long j = this.bl * 2325224287372660477L;
        while (i2 == this.bd * -825473743) {
            while (i2 == this.bs.aj[i]) {
                this.bs.aj(i);
                int ak = this.bs.ak(i);
                if (ak == 1) {
                    this.bs.ae();
                    this.bs.ai(i);
                    if (!this.bs.az()) {
                        continue;
                    } else if (!this.bm || i2 == 0) {
                        bi((short) 31838);
                        this.bs.aq();
                        return;
                    } else {
                        this.bs.ax(j);
                    }
                    i = this.bs.au();
                    i2 = this.bs.aj[i];
                    j = this.bs.ap(i2);
                } else {
                    if ((ak & 128) != 0) {
                        bg(ak, (byte) -34);
                    }
                    this.bs.am(i);
                    this.bs.ai(i);
                }
            }
            i = this.bs.au();
            i2 = this.bs.aj[i];
            j = this.bs.ap(i2);
        }
        this.bq = i * -1631143127;
        this.bd = i2 * -1829833775;
        this.bl = j * -1065754014451122603L;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ev(kc kcVar, int[] iArr, int i, int i2) {
        kcVar.ah = ((hd.ad * -754139271) / 100) * -2080995707;
        if (kcVar.ax * -427609645 < 0 || !(kcVar.ao == null || kcVar.ao.bf())) {
            Object obj;
            int i3 = kcVar.ag * 892847031;
            if (i3 > 0) {
                i3 -= (int) ((Math.pow(2.0d, ((double) this.au[kcVar.ad * 1051654295]) * 4.921259842519685E-4d) * 16.0d) + 0.5d);
                if (i3 < 0) {
                    i3 = 0;
                }
                kcVar.ag = i3 * -1647343097;
            }
            kcVar.ao.bo(bu(kcVar, -31488176));
            ke keVar = kcVar.al;
            kcVar.ac -= 772402207;
            kcVar.aa += keVar.am * 11739739;
            double d = ((double) ((((kcVar.as * 1581400141) * (kcVar.ag * 892847031)) >> 12) + (((kcVar.ai * -1981512837) - 60) << 8))) * 5.086263020833333E-6d;
            if (keVar.ar * -1174721249 > 0) {
                if (keVar.ai * 1903485689 > 0) {
                    kcVar.ap += ((int) ((Math.pow(2.0d, ((double) (keVar.ai * 1903485689)) * d) * 128.0d) + 0.5d)) * -429171521;
                } else {
                    kcVar.ap += 900620160;
                }
            }
            if (keVar.ad != null) {
                if (keVar.al * 2129664973 > 0) {
                    kcVar.au += ((int) ((Math.pow(2.0d, ((double) (keVar.al * 2129664973)) * d) * 128.0d) + 0.5d)) * -1107701639;
                } else {
                    kcVar.au -= 51889024;
                }
                while (kcVar.az * -2043080741 < keVar.ad.length - 2 && kcVar.au * -795108919 > ((keVar.ad[(kcVar.az * -2043080741) + 2] & 255) << 8)) {
                    kcVar.az -= 582440794;
                }
                if (kcVar.az * -2043080741 == keVar.ad.length - 2 && keVar.ad[(kcVar.az * -2043080741) + 1] == (byte) 0) {
                    obj = 1;
                    if (kcVar.ax * -427609645 >= 0 && keVar.aq != null && (this.af[kcVar.ad * 1051654295] & 1) == 0 && (kcVar.aj * 836159379 < 0 || this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] != kcVar)) {
                        if (keVar.aj * -918651717 <= 0) {
                            kcVar.ax = (((int) ((Math.pow(2.0d, d * ((double) (keVar.aj * -918651717))) * 128.0d) + 0.5d)) * 884297307) + kcVar.ax;
                        } else {
                            kcVar.ax += 1520905600;
                        }
                        while (kcVar.aw * 356123 < keVar.aq.length - 2 && kcVar.ax * -427609645 > ((keVar.aq[(kcVar.aw * 356123) + 2] & 255) << 8)) {
                            kcVar.aw += 1339205158;
                        }
                        if (keVar.aq.length - 2 == kcVar.aw * 356123) {
                            obj = 1;
                        }
                    }
                    if (obj == null) {
                        kcVar.ao.bq(kcVar.ah * 1132626509);
                        if (iArr != null) {
                            kcVar.ao.ak(iArr, i, i2);
                        } else {
                            kcVar.ao.ag(i2);
                        }
                        if (kcVar.ao.bi()) {
                            this.bf.ar.ad(kcVar.ao);
                        }
                        kcVar.ad((byte) -98);
                        if (kcVar.ax * -427609645 >= 0) {
                            kcVar.ky();
                            if (kcVar.aj * 836159379 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379]) {
                                this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] = null;
                            }
                        }
                        return true;
                    }
                    kcVar.ao.af(kcVar.ah * 1132626509, bw(kcVar, -223452201), br(kcVar, -1556369280));
                    return false;
                }
            }
            obj = null;
            if (keVar.aj * -918651717 <= 0) {
            }
            while (kcVar.aw * 356123 < keVar.aq.length - 2) {
                kcVar.aw += 1339205158;
            }
            if (keVar.aq.length - 2 == kcVar.aw * 356123) {
            }
            if (obj == null) {
            }
        } else {
            kcVar.ad((byte) -96);
            kcVar.ky();
            if (kcVar.aj * 836159379 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379]) {
                this.ba[kcVar.ad * 1051654295][kcVar.aj * 836159379] = null;
            }
            return true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ew(kc kcVar) {
        if (kcVar.ao != null) {
            return false;
        }
        if (kcVar.ax * 1028491706 >= 0) {
            kcVar.ky();
            if (kcVar.aj * 836159379 > 0 && kcVar == this.ba[kcVar.ad * 1051654295][kcVar.aj * 298051958]) {
                this.ba[kcVar.ad * -1971527782][kcVar.aj * 836159379] = null;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public int ey(kc kcVar) {
        int i = this.ai[kcVar.ad * 352358450];
        return i < 8192 ? ((i * (kcVar.am * -628647127)) + 32) >> 6 : 1133329800 - ((((1962115494 - i) * (128 - (kcVar.am * -582451667))) + 32) >> 6);
    }

    /* Access modifiers changed, original: 0000 */
    public void ez(int i, int i2) {
        this.av[i] = i2;
        this.at[i] = (int) ((Math.pow(2.0d, ((double) i2) * 5.4931640625E-4d) * 2097152.0d) + 0.5d);
    }
}
