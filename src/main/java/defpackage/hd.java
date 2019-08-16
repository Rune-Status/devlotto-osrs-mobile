package defpackage;

import android.support.v4.app.NotificationManagerCompat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: hd */
public abstract class hd {
    public static int ad = 0;
    static gd ai = null;
    static int aj = 0;
    static hh ak = null;
    static ScheduledExecutorService al = null;
    static boolean aq = false;
    static final int ax = 3;
    static mk ct;
    static kp pn;
    hq[] af;
    int[] ag;
    int ah;
    hq ap;
    boolean as;
    int au;
    hq[] ay;
    int az;

    hd() {
        try {
            this.as = false;
            this.au = -937696928;
            gq.ad((byte) -111);
            this.ah = 0;
            this.af = new hq[8];
            this.ay = new hq[8];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hd.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void ab(int i, boolean z, int i2) {
        if (i < 8000 || i > 48000) {
            throw new IllegalArgumentException();
        }
        ad = 1345223369 * i;
        aq = z;
        aj = -1762088173 * i2;
    }

    static int ad(byte[] bArr, int i, int i2, int i3) {
        int i4 = -1;
        while (i < i2) {
            try {
                i4 = (i4 >>> 8) ^ lj.aj[(bArr[i] ^ i4) & 255];
                i++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hd.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return i4;
    }

    static int ae(int i, hw hwVar, boolean z, byte b) {
        al aq;
        int i2 = 0;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            try {
                int[] iArr = hl.ae;
                int i3 = ds.am + 564452847;
                ds.am = i3;
                aq = da.aq(iArr[i3 * -757592335], -550158556);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hd.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        aq = z ? lj.az : hl.au;
        da.gk(aq, (byte) 2);
        int i4;
        if (1200 == i || i == 1205 || 1212 == i) {
            ds.am += 1128905694;
            i4 = hl.ae[ds.am * -757592335];
            int i5 = hl.ae[(ds.am * -757592335) + 1];
            aq.fu = 316750653 * i4;
            aq.fc = i5 * -352121821;
            dh aq2 = gl.aq(i4, -1829135359);
            aq.ck = aq2.av * 1749847479;
            aq.co = aq2.at * 807558895;
            aq.cu = aq2.bk * 828120169;
            aq.cx = aq2.ba * -800484707;
            aq.ct = aq2.bs * -1403539525;
            aq.cl = aq2.ab * 2000470311;
            if (1205 == i) {
                aq.ch = 0;
            } else {
                i4 = i == 1212 ? 1 : 0;
                if (1 == aq2.bm * -1954437925) {
                    i2 = 1;
                }
                if ((i2 | i4) != 0) {
                    aq.ch = 871841815;
                } else {
                    aq.ch = 1743683630;
                }
            }
            if (aq.cz * -423299685 > 0) {
                aq.cl = ((aq.cl * 1440114912) / (aq.cz * -423299685)) * 137430647;
                return 1;
            } else if (aq.bm * -499317633 <= 0) {
                return 1;
            } else {
                aq.cl = ((aq.cl * 1440114912) / (aq.bm * -499317633)) * 137430647;
                return 1;
            }
        } else if (1201 == i) {
            aq.ce = 1573360838;
            int[] iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.cy = iArr2[i4 * -757592335] * -927961631;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            aq.ce = 212557609;
            aq.cy = da.jc.aq.ak(-539746020) * -927961631;
            return 1;
        }
    }

    public static final void af(hh hhVar) {
        ak = hhVar;
    }

    public static final void ah(hh hhVar) {
        ak = hhVar;
    }

    public static final void an(int i, boolean z, int i2) {
        if (i < 8000 || i > 48000) {
            throw new IllegalArgumentException();
        }
        ad = 1243444144 * i;
        aq = z;
        aj = -1762088173 * i2;
    }

    public static final hd at(mr mrVar, int i, int i2) {
        int i3 = 2;
        if (ad * -754139271 == 0) {
            throw new IllegalStateException();
        } else if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        } else {
            if (i2 < 641732572) {
                i2 = 256;
            }
            try {
                hd ad = ak.ad(-1098271136);
                if (!aq) {
                    i3 = 1;
                }
                ad.ag = new int[(i3 * 256)];
                ad.aw(971842681);
                ad.az = ((i2 & -1024) + 1024) * 1225497753;
                if (ad.az * 1742034145 > -25779276) {
                    ad.az = -1144504320;
                }
                ad.ac(ad.az * -1196953955, -134091409);
                if (aj * 1436800795 > 0 && ai == null) {
                    ai = new gd();
                    al = Executors.newScheduledThreadPool(1);
                    al.scheduleAtFixedRate(ai, 0, 1, TimeUnit.MILLISECONDS);
                }
                if (ai == null) {
                    return ad;
                }
                if (ai.ad[i] == null) {
                    ai.ad[i] = ad;
                    return ad;
                }
                throw new IllegalArgumentException();
            } catch (Throwable th) {
                return new gg();
            }
        }
    }

    public static final hd av(mr mrVar, int i, int i2) {
        int i3 = 2;
        if (ad * -1674171584 == 0) {
            throw new IllegalStateException();
        } else if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        } else {
            if (i2 < -2005460235) {
                i2 = -1682938815;
            }
            try {
                hd ad = ak.ad(1367204461);
                if (!aq) {
                    i3 = 1;
                }
                ad.ag = new int[(i3 * 256)];
                ad.aw(-1393349638);
                ad.az = ((i2 & -1024) + 901152259) * 2038624033;
                if (ad.az * 1299508550 > 1198177229) {
                    ad.az = 2070311125;
                }
                ad.ac(ad.az * -1151422874, -134091409);
                if (aj * -1136754335 > 0 && ai == null) {
                    ai = new gd();
                    al = Executors.newScheduledThreadPool(1);
                    al.scheduleAtFixedRate(ai, 0, 1, TimeUnit.MILLISECONDS);
                }
                if (ai == null) {
                    return ad;
                }
                if (ai.ad[i] == null) {
                    ai.ad[i] = ad;
                    return ad;
                }
                throw new IllegalArgumentException();
            } catch (Throwable th) {
                return new gg();
            }
        }
    }

    public static final void ay(hh hhVar) {
        ak = hhVar;
    }

    public static final hd bk(mr mrVar, int i, int i2) {
        int i3 = 2;
        if (ad * -754139271 == 0) {
            throw new IllegalStateException();
        } else if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        } else {
            if (i2 < 256) {
                i2 = 256;
            }
            try {
                hd ad = ak.ad(1278834524);
                if (!aq) {
                    i3 = 1;
                }
                ad.ag = new int[(i3 * 256)];
                ad.aw(-2048668456);
                ad.az = ((i2 & -1024) + 1024) * 2038624033;
                if (ad.az * 1742034145 > 16384) {
                    ad.az = -1144504320;
                }
                ad.ac(ad.az * 1742034145, -134091409);
                if (aj * 1436800795 > 0 && ai == null) {
                    ai = new gd();
                    al = Executors.newScheduledThreadPool(1);
                    al.scheduleAtFixedRate(ai, 0, 1, TimeUnit.MILLISECONDS);
                }
                if (ai == null) {
                    return ad;
                }
                if (ai.ad[i] == null) {
                    ai.ad[i] = ad;
                    return ad;
                }
                throw new IllegalArgumentException();
            } catch (Throwable th) {
                return new gg();
            }
        }
    }

    static void bk(int i, int i2, int i3) {
        try {
            int[] iArr = new int[9];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = ((i4 * 32) + 128) + 15;
                iArr[i4] = (bl.aa[i5] * eh.dz(ao.at(i5, 1531436874), i2, (byte) 82)) >> 16;
            }
            bc.bb(iArr, 500, 800, (i * 334) / i2, 334);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hd.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void bu(hq hqVar) {
        hqVar.ao = false;
        if (hqVar.aa != null) {
            hqVar.aa.ad = 0;
        }
        hq ai = hqVar.ai();
        while (ai != null) {
            fw.az(ai, -1457190477);
            ai = hqVar.ae();
        }
    }

    static final void bx(hq hqVar) {
        hqVar.ao = false;
        if (hqVar.aa != null) {
            hqVar.aa.ad = 0;
        }
        hq ai = hqVar.ai();
        while (ai != null) {
            fw.az(ai, -341104054);
            ai = hqVar.ae();
        }
    }

    static final void ei(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        try {
            iw iwVar = (iw) client.kh.ae();
            while (iwVar != null) {
                if (iwVar.ad * -110986715 == i && i2 == iwVar.ar * -222192123 && iwVar.al * -1360125291 == i3 && i4 == iwVar.aq * -469654451) {
                    break;
                }
                iwVar = (iw) client.kh.ak();
            }
            iwVar = null;
            if (iwVar == null) {
                iwVar = new iw();
                iwVar.ad = -674557523 * i;
                iwVar.aq = 668873861 * i4;
                iwVar.ar = 198606541 * i2;
                iwVar.al = -1660380995 * i3;
                kh.ey(iwVar, -1313935668);
                client.kh.aq(iwVar);
            }
            iwVar.am = -1921582921 * i5;
            iwVar.as = -158421455 * i6;
            iwVar.ak = 74205613 * i7;
            iwVar.ag = 941578741 * i8;
            iwVar.ap = 1452639519 * i9;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hd.ei(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(int i) {
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(int i, int i2) throws Exception {
    }

    public abstract void ad(int i);

    public final void ag(int i) {
        synchronized (this) {
            try {
                if (ai != null) {
                    Object obj = 1;
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (this == ai.ad[i2]) {
                            ai.ad[i2] = null;
                        }
                        if (ai.ad[i2] != null) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        al.shutdownNow();
                        al = null;
                        ai = null;
                    }
                }
                aa(-495295011);
                this.ag = null;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hd.ag(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void ak(byte b) {
    }

    public abstract void al();

    public final void am(hq hqVar, byte b) {
        synchronized (this) {
            try {
                this.ap = hqVar;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hd.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(byte b) throws Exception {
    }

    public void ap(boolean z, byte b) {
        try {
            this.as = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hd.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void aq();

    public abstract void ar();

    public final void as(byte b) {
        synchronized (this) {
            try {
                ao((byte) 0);
            } catch (Exception e) {
                try {
                    aa(-778341741);
                    gq.ad((byte) 6);
                } catch (RuntimeException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("hd.as(");
                    stringBuilder.append(')');
                    throw mv.aq(e2, stringBuilder.toString());
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void au(int[] iArr, int i) {
        mq.as(iArr, 0, aq ? i << 1 : i);
        this.ah -= 1126572377 * i;
        if (this.ap != null && this.ah * -350349591 <= 0) {
            int i2;
            hq ai;
            this.ah += ((ad * -754139271) >> 4) * 1126572377;
            fw.az(this.ap, 1108042098);
            ax(this.ap, this.ap.bb(), 1360605652);
            int i3 = 255;
            int i4 = 7;
            int i5 = 0;
            loop0:
            while (i3 != 0) {
                int i6;
                if (i4 < 0) {
                    i6 = i4 & 3;
                    i2 = -(i4 >> 2);
                } else {
                    i2 = 0;
                    i6 = i4;
                }
                int i7 = i6;
                int i8 = i2;
                int i9 = (i3 >>> i6) & 286331153;
                while (i9 != 0) {
                    if ((i9 & 1) == 0) {
                        i2 = i5;
                        i6 = i3;
                    } else {
                        int i10 = 1 << i7;
                        i6 = i3 & i10;
                        hq hqVar = this.af[i7];
                        hq hqVar2 = null;
                        i2 = i5;
                        while (hqVar != null) {
                            gt gtVar = hqVar.aa;
                            if (gtVar == null || gtVar.ad <= i8) {
                                hqVar.ao = true;
                                int am = hqVar.am();
                                int i11 = i2 + am;
                                if (gtVar != null) {
                                    gtVar.ad += am;
                                }
                                if (i11 >= this.au * -813468509) {
                                    break loop0;
                                }
                                ai = hqVar.ai();
                                if (ai != null) {
                                    i5 = hqVar.ac;
                                    while (ai != null) {
                                        ax(ai, (ai.bb() * i5) >> 8, 1642679449);
                                        ai = hqVar.ae();
                                    }
                                }
                                hq hqVar3 = hqVar.aw;
                                hqVar.aw = null;
                                if (hqVar2 == null) {
                                    this.af[i7] = hqVar3;
                                } else {
                                    hqVar2.aw = hqVar3;
                                }
                                if (hqVar3 == null) {
                                    this.ay[i7] = hqVar2;
                                }
                                hqVar = hqVar3;
                                i2 = i11;
                            } else {
                                i6 |= i10;
                                hqVar2 = hqVar;
                                hqVar = hqVar.aw;
                            }
                        }
                        continue;
                    }
                    i9 >>>= 4;
                    i3 = i6;
                    i7 += 4;
                    i8++;
                    i5 = i2;
                }
                i4--;
            }
            i2 = 0;
            while (true) {
                i4 = i2;
                if (i4 >= 8) {
                    break;
                }
                ai = this.af[i4];
                hq[] hqVarArr = this.af;
                this.ay[i4] = null;
                hqVarArr[i4] = null;
                while (ai != null) {
                    hq hqVar4 = ai.aw;
                    ai.aw = null;
                    ai = hqVar4;
                }
                i2 = i4 + 1;
            }
        }
        if (this.ah * -350349591 < 0) {
            this.ah = 0;
        }
        if (this.ap != null) {
            this.ap.ak(iArr, 0, i);
        }
        gq.ad((byte) -46);
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(int i) throws Exception {
    }

    /* Access modifiers changed, original: final */
    public final void ax(hq hqVar, int i, int i2) {
        int i3 = i >> 5;
        try {
            hq hqVar2 = this.ay[i3];
            if (hqVar2 == null) {
                this.af[i3] = hqVar;
            } else {
                hqVar2.aw = hqVar;
            }
            this.ay[i3] = hqVar;
            hqVar.ac = i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hd.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ba(hq hqVar) {
        synchronized (this) {
            this.ap = hqVar;
        }
    }

    public final void bb() {
        synchronized (this) {
            if (ai != null) {
                Object obj = 1;
                for (int i = 0; i < 2; i++) {
                    if (this == ai.ad[i]) {
                        ai.ad[i] = null;
                    }
                    if (ai.ad[i] != null) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    al.shutdownNow();
                    al = null;
                    ai = null;
                }
            }
            aa(-752987514);
            this.ag = null;
        }
    }

    public void bc(boolean z) {
        this.as = z;
    }

    public final void bd() {
        synchronized (this) {
            try {
                ao((byte) 0);
            } catch (Exception e) {
                aa(-1653791509);
                gq.ad((byte) 35);
            }
        }
        return;
    }

    /* Access modifiers changed, original: 0000 */
    public void be() {
    }

    public final void bf() {
        synchronized (this) {
            if (ai != null) {
                Object obj = 1;
                for (int i = 0; i < 2; i++) {
                    if (this == ai.ad[i]) {
                        ai.ad[i] = null;
                    }
                    if (ai.ad[i] != null) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    al.shutdownNow();
                    al = null;
                    ai = null;
                }
            }
            aa(-657788669);
            this.ag = null;
        }
    }

    public void bg(boolean z) {
        this.as = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void bh() throws Exception {
    }

    public final void bi() {
        synchronized (this) {
            if (ai != null) {
                Object obj = 1;
                for (int i = 0; i < 2; i++) {
                    if (this == ai.ad[i]) {
                        ai.ad[i] = null;
                    }
                    if (ai.ad[i] != null) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    al.shutdownNow();
                    al = null;
                    ai = null;
                }
            }
            aa(-1641483559);
            this.ag = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bj() {
    }

    public final void bl() {
        synchronized (this) {
            if (ai != null) {
                Object obj = 1;
                for (int i = 0; i < 2; i++) {
                    if (this == ai.ad[i]) {
                        ai.ad[i] = null;
                    }
                    if (ai.ad[i] != null) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    al.shutdownNow();
                    al = null;
                    ai = null;
                }
            }
            aa(-2140859118);
            this.ag = null;
        }
    }

    public final void bm() {
    }

    /* Access modifiers changed, original: 0000 */
    public void bn(int i) throws Exception {
    }

    public final void bo() {
        synchronized (this) {
            try {
                ao((byte) 0);
            } catch (Exception e) {
                aa(-95735678);
                gq.ad((byte) 69);
            }
        }
        return;
    }

    public final void bq() {
    }

    /* Access modifiers changed, original: 0000 */
    public void br() throws Exception {
    }

    public final void bs(hq hqVar) {
        synchronized (this) {
            this.ap = hqVar;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bt() throws Exception {
    }

    public void bv(boolean z) {
        this.as = z;
    }

    /* Access modifiers changed, original: final */
    public final void bw(hq hqVar, int i) {
        int i2 = i >> 5;
        hq hqVar2 = this.ay[i2];
        if (hqVar2 == null) {
            this.af[i2] = hqVar;
        } else {
            hqVar2.aw = hqVar;
        }
        this.ay[i2] = hqVar;
        hqVar.ac = i;
    }

    /* Access modifiers changed, original: 0000 */
    public void bz(int i) throws Exception {
    }
}
