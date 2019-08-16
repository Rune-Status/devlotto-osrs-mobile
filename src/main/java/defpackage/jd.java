package defpackage;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.jagex.oldscape.osrenderer.ad;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: jd */
public abstract class jd implements Runnable {
    static ef an = null;
    public static final int ap = 11;
    static mi sd;
    static jd sl;
    static long sn;
    static boolean st;
    static int sw;
    static long[] ta = new long[32];
    static long[] tq = new long[32];
    protected static int tv = 0;
    static final long ty = (TimeUnit.MILLISECONDS.toNanos(20) * -8156462924965926717L);
    static volatile boolean ug = true;
    static jr uq = new jr();
    static int uz = 866479740;
    int td;
    int tf;
    protected float tg;
    protected int th;
    int tj;
    int tn;
    protected int tp;
    int tr;
    int tt;
    int tu;
    int tw;
    boolean ua;
    volatile boolean ub;
    int uc;
    URL ud;
    protected fx ue;
    protected ew uk;
    jh up;
    final jy us;
    bn uu;
    HashMap uv;
    jb ux;

    protected jd() {
        try {
            this.tu = 0;
            this.tt = 0;
            this.ub = true;
            this.ua = false;
            this.ue = new fx();
            this.us = new jy();
            this.uv = new HashMap();
            this.uc = -218868687;
            mo moVar = new mo(Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            dh.aj(new hr(), 1306747865);
            this.us.ad(this.ue, -1120299528);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ad(int i, int i2, int i3) {
        try {
            dj aq = ds.aq(i, 1763934893);
            if (aq == null) {
                return i2;
            }
            if (aq.ae * 681932363 >= 0) {
                return (aq.ae * 681932363) | ViewCompat.MEASURED_STATE_MASK;
            }
            if (aq.aj * 1610744207 >= 0) {
                return bl.az[db.aq(il.ax.al(aq.aj * 1610744207, -260237961), 96, (byte) 18)] | ViewCompat.MEASURED_STATE_MASK;
            } else if (16711935 == aq.al * -1977739369) {
                return i2;
            } else {
                return bl.az[db.aq(kb.ar(aq.am * -385196275, aq.ak * -947154665, aq.as * 1306106505, 1956907281), 96, (byte) 36)] | ViewCompat.MEASURED_STATE_MASK;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static ee aea(byte[] bArr) {
        return hr.um.aa(bArr, -313737874);
    }

    static ee aef(byte[] bArr) {
        return hr.um.aa(bArr, -313737874);
    }

    static ee aek(byte[] bArr) {
        return hr.um.aa(bArr, -313737874);
    }

    static ee aeo(byte[] bArr) {
        return hr.um.aa(bArr, -313737874);
    }

    static ee aev(byte[] bArr) {
        return hr.um.aa(bArr, -313737874);
    }

    static ee aey(byte[] bArr) {
        return hr.um.aa(bArr, -313737874);
    }

    protected static final void agf() {
        int i;
        jp.tz.aq(-73036795);
        for (i = 0; i < 32; i++) {
            ta[i] = 0;
        }
        for (i = 0; i < 32; i++) {
            tq[i] = 0;
        }
        ds.tm = 0;
    }

    protected static final void agi() {
        int i;
        jp.tz.aq(-73036795);
        for (i = 0; i < 32; i++) {
            ta[i] = 0;
        }
        for (i = 0; i < 32; i++) {
            tq[i] = 0;
        }
        ds.tm = 0;
    }

    protected static final void agn() {
        int i;
        jp.tz.aq(-73036795);
        for (i = 0; i < 1853727006; i++) {
            ta[i] = 0;
        }
        for (i = 0; i < 302129658; i++) {
            tq[i] = 0;
        }
        ds.tm = 0;
    }

    protected static final void agx() {
        int i;
        jp.tz.aq(-73036795);
        for (i = 0; i < 32; i++) {
            ta[i] = 0;
        }
        for (i = 0; i < 32; i++) {
            tq[i] = 0;
        }
        ds.tm = 0;
    }

    protected static final boolean ahb() {
        return uq.ap(-1982668322);
    }

    protected static final void ahj() {
        ea.tl = null;
        cd.uh = null;
        az.ut = null;
        uq.au((byte) -4);
    }

    public abstract void aba();

    public final void abc(int i, int i2) {
        try {
            this.uc = 218868687 * i;
            uq.ad(i, (byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.abc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void abf(lp lpVar, int i) {
        try {
            hr.um = lpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.abf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void abg();

    public final int abh(byte b) {
        try {
            return this.uc * -729711825;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.abh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final int abp(int i) {
        try {
            float aw = hr.um.aw(2121693044);
            return aw < 0.0f ? -1 : (int) (aw * ((float) (jw.tx * -1083397279)));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.abp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void abt();

    public final lp abx(byte b) {
        try {
            return hr.um;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.abx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aca(byte b) {
        try {
            int[] af = ad.af(467090742);
            for (int i = 0; i < af.length / 2; i++) {
                int i2 = i * 2;
                int i3 = af[i2];
                i2 = af[i2 + 1];
                long ad = gq.ad((byte) -41);
                switch (i3) {
                    case 0:
                        i2 = hr.um.ax(i2, -1608521272);
                        if (i2 < 0) {
                            break;
                        }
                        this.ue.ai(i2, ad);
                        break;
                    case 1:
                        i2 = hr.um.ax(i2, 749409505);
                        if (i2 < 0) {
                            break;
                        }
                        this.ue.ae(i2, ad);
                        break;
                    case 2:
                        if (i2 <= 0) {
                            break;
                        }
                        this.ue.am((char) i2, ad);
                        break;
                    default:
                        break;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.aca(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public String acc(String str, int i) {
        try {
            return (String) this.uv.get(str);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void acd(byte b) {
        try {
            ow add = add(105084381);
            this.tp = Math.max(add.ar * 62653529, this.tr * -2044314521) * 2014987303;
            this.th = Math.max(add.al * -2054690887, this.td * -1950818899) * 922273793;
            if (this.tp * 834595735 <= 0) {
                this.tp = 2014987303;
            }
            if (this.th * -448317439 <= 0) {
                this.th = 922273793;
            }
            hl.tk = Math.min(this.tp * 834595735, this.tf * -1412908477) * 2040412821;
            jw.tx = Math.min(this.th * -448317439, this.tn * 958937687) * -1173669727;
            this.tu = (((this.tp * 834595735) - (hl.tk * 1350811837)) / 2) * -1085944269;
            this.tt = 0;
            if (this.uk == null) {
                this.uk = new jz(hl.tk * 1350811837, jw.tx * -1083397279);
            } else {
                this.uk.al(hl.tk * 1350811837, jw.tx * -1083397279, -1723924659);
            }
            this.ub = true;
            cl((byte) -76);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public URL ace(int i) {
        try {
            return this.ud;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.ace(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void acf(String str, int i) {
    }

    public void acg(int i, byte b) {
        try {
            if (this.uk != null) {
                this.uk.ak(i, (byte) 8);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ach(int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        try {
            String property;
            Thread.currentThread().setName("NXT");
            sl = this;
            hl.tk = 2040412821 * i;
            jw.tx = -1173669727 * i2;
            this.tr = 1277632343 * i;
            this.td = 920292901 * i2;
            pn.ar = 997954135 * i5;
            ai.al = 739177361 * i6;
            this.uu = fw.ar(294635745);
            mi.sm = new mr();
            mi.sm.ai(this, 1, -922199892);
            try {
                property = System.getProperty("os.name");
            } catch (Exception e) {
                property = "Unknown";
            }
            property.toLowerCase();
        } catch (Exception e2) {
            try {
                iv.ad(null, e2, 1692244937);
            } catch (RuntimeException e3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jd.ach(");
                stringBuilder.append(')');
                throw mv.aq(e3, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public bw aci(int i) {
        try {
            return this.uk.ar(-1633180775);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.aci(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void acj(int i) {
        try {
            int i2 = this.tu;
            i2 = this.tt;
            i2 = this.tp;
            i2 = hl.tk;
            i2 = this.th;
            i2 = jw.tx;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void ack(int i, int i2, int i3) {
        try {
            if (!(i == this.tf * -1412908477 && this.tn * 958937687 == i2)) {
                ady(-52093235);
            }
            this.tf = 1736041067 * i;
            this.tn = 429740391 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.ack(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void acl(int i, String str, int i2) {
        try {
            this.uv.put(Integer.toString(i), str);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void acm(byte b) {
        try {
            adu((byte) 90);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final fx acn(int i) {
        try {
            return this.ue;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void aco(int i) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void acp(int i, int i2, int i3, int i4, byte b) {
        try {
            ach(i, i2, 0, 0, i3, i4, (byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void acq(int i) {
        try {
            acy(1584340833);
            while (ad.at((short) -29791)) {
                act(-1345959401);
            }
            acm((byte) 1);
        } catch (pn e) {
            iv.ad(null, e, 1692244937);
            throw new RuntimeException(e.al((byte) 12));
        } catch (Exception e2) {
            iv.ad(null, e2, 1692244937);
            throw new RuntimeException(e2);
        }
    }

    public final void acr(fm fmVar, int i) {
        try {
            this.ue.ad(fmVar, -975646751);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acr(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void acs(boolean z, int i) {
        try {
            this.uu.ao(z, 2073515494);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void act(int i) {
        try {
            this.uu.ah(1789541176);
            aca((byte) 80);
            this.us.ak(hr.um, 1350811837 * hl.tk, -1083397279 * jw.tx, this.tj * -433683967, this.tw * 1569557487, (byte) 19);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.act(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void acu(byte b) {
    }

    /* Access modifiers changed, original: protected */
    public void acv(byte b) {
    }

    /* Access modifiers changed, original: protected */
    public boolean acw(int i) {
        try {
            String host = this.ux.ai(-89306855).getHost();
            if (host.equals("jagex.com") || host.endsWith(".jagex.com") || host.equals("runescape.com") || host.endsWith(".runescape.com") || host.endsWith("127.0.0.1")) {
                return true;
            }
            while (host.length() > 0 && host.charAt(host.length() - 1) >= '0' && host.charAt(host.length() - 1) <= '9') {
                host = host.substring(0, host.length() - 1);
            }
            if (host.endsWith("192.168.1.")) {
                return true;
            }
            adz(mi.ae, -869091968);
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public mx acx(byte b) {
        try {
            if (this.up == null) {
                this.up = new jh();
            }
            return this.up;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void acy(int i) {
        try {
            this.uu.ai(1001793557);
            ad.bg((byte) -68);
            this.tj = ad.ab((byte) -65) * -337805823;
            this.tw = ad.av(-1152796281) * 402588431;
            this.tg = ((float) (this.tj * -433683967)) / ((float) (this.tw * 1569557487));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.acy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean acz(String str, short s) {
        try {
            this.ud = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            try {
                e.printStackTrace();
                return false;
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jd.acz(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032 A:{Splitter:B:1:0x0001, ExcHandler: pn (r0_18 'e' java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:8:0x0032, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            defpackage.iv.ad(null, r0, 1692244937);
            r0 = r0.al((byte) -106);
     */
    /* JADX WARNING: Missing block: B:41:0x014e, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:42:0x014f, code skipped:
            defpackage.iv.ad(null, r0, 1692244937);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ad() {
        Throwable e = null;
        long j;
        try {
            if (!hr.um.au(-1038546587)) {
                ade(false, -636584825);
                adh(false, -1254574164);
            } else if (adt((byte) -40)) {
                pn.ad = ace(-783174150);
                as((byte) 45);
                sn = 0;
                st = false;
                au(1722134867);
                this.uk = new jz(hl.tk * 1350811837, jw.tx * -1083397279);
                jp.tz = ip.ad((byte) -19);
                j = 0;
                while (true) {
                    if (0 != sn * 3455982638216615277L && gq.ad((byte) 16) >= sn * 3455982638216615277L) {
                        break;
                    }
                    long nanoTime = System.nanoTime();
                    long j2 = nanoTime / (ty * 2683488820213499883L);
                    ds.tm = Math.min((int) (j2 - j), 10) * -1067042893;
                    for (int i = 0; i < ds.tm * 67194747; i++) {
                        adw(-2085121833);
                    }
                    ib.to = gq.ad((byte) 62) * -3940384991735917943L;
                    adr(((float) (nanoTime - ((ty * 2683488820213499883L) * j2))) / ((float) (ty * 2683488820213499883L)), 1783298520);
                    j = j2;
                }
                ado(-1389448088);
                if (e != null) {
                    throw new RuntimeException(e);
                }
            } else {
                ade(false, -1248522048);
                adh(true, -1049666669);
            }
        } catch (Exception e2) {
            ade(false, -1195704650);
            long ad = gq.ad((byte) -1);
            while (true) {
                sw -= 1769215831;
                ck(0, (short) 32194);
                j = gq.ad((byte) -12);
                kh.ad(10 - (j - ad));
                adj(-2106134124);
                if (this.uk != null) {
                    ads(933863550);
                }
                if (200 == sw * 1418410905) {
                    hr.um.at((byte) 104);
                }
                ad = j;
            }
        } catch (pn e3) {
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void ada(int i, String str, boolean z, int i2) {
        try {
            if (ie.tc == null) {
                ie.tc = (oi) hr.um.ao(ml.aq, 418450558);
            }
            uq.ar(i, str, ie.tc, this.tg, this.uk, (byte) -54);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.ada(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean adc(int i) {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public ow add(int i) {
        try {
            return new ow(this.tj * -433683967, this.tw * 1569557487);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.add(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ade(boolean z, int i) {
        try {
            ea.tl = (ef[]) hr.um.ao(ml.ad, 1583630670);
            cd.uh = (ef) hr.um.ao(ml.al, 1237540228);
            az.ut = (ef) hr.um.ao(ml.aj, 664526287);
            uq.aq(ea.tl, cd.uh, az.ut, -1243198045);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.ade(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void adf(int i) {
        synchronized (this) {
            try {
                dk.uf = ug;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jd.adf(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void adg(jb jbVar, short s) {
        try {
            this.ux = jbVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void adh(boolean z, int i) {
        try {
            long ad = gq.ad((byte) 93);
            int i2 = 0;
            while (i2 < 500) {
                ck(0, (short) 9840);
                long ad2 = gq.ad((byte) 61);
                kh.ad(10 - (ad2 - ad));
                adj(-2106134124);
                if (this.uk != null) {
                    adk(((((500 - i2) - 1) * 10) / 1000) + 1, z, (byte) 59);
                }
                i2++;
                ad = ad2;
            }
            this.ux = new jb(this.ux.ai(1101219480));
            mi.sm.ai(this, 1, 1698100948);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void adi(int i) {
        try {
            sw -= 1769215831;
            if (ie.tc == null) {
                ie.tc = (oi) hr.um.ao(ml.aq, 668051808);
            }
            if (ie.tc != null) {
                uq.ai(sd, ie.tc, this.uk, this.tg, -2116684339);
            }
            if (mi.ai == sd && sw * 1418410905 == 200) {
                hr.um.at((byte) 108);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void adj(int i) {
        try {
            ow add = add(1437102532);
            if (add.ar * 62653529 != this.tj * -433683967 || this.tw * 1569557487 != add.al * -2054690887 || this.ua) {
                acd((byte) 5);
                this.ua = false;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void adk(int i, boolean z, byte b) {
        try {
            if (ie.tc == null) {
                ie.tc = (oi) hr.um.ao(ml.aq, 767939433);
            }
            if (ie.tc == null) {
                return;
            }
            if (z) {
                uq.am(i, ie.tc, this.uk, this.tg, -350023779);
                return;
            }
            uq.ae(i, ie.tc, this.uk, this.tg, -847356622);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public lw adl(byte b) {
        try {
            return hr.um;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public int adm(int i) {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void adn(int i) {
    }

    /* Access modifiers changed, original: final */
    public final void ado(int i) {
        synchronized (this) {
            try {
                if (st) {
                    return;
                }
                st = true;
                try {
                    aw(-1676905463);
                } catch (Exception e) {
                }
                if (mi.sm != null) {
                    try {
                        mi.sm.ar(-1312820209);
                    } catch (Exception e2) {
                    }
                }
                ae(-645918780);
            } catch (RuntimeException e3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jd.ado(");
                stringBuilder.append(')');
                throw mv.aq(e3, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean adp(int i) {
        try {
            return sd != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void adr(float f, int i) {
        try {
            int i2;
            long ad = gq.ad((byte) -11);
            long j = ta[ch.te * -1494948189];
            ta[ch.te * -1494948189] = ad;
            ch.te = (((ch.te * -1494948189) + 1) & 31) * 92929291;
            if (0 != j && ad > j) {
                i2 = (int) (ad - j);
                tv = (((i2 >> 1) + 32000) / i2) * -1999208327;
            }
            i2 = uz - 1630354613;
            uz = i2;
            if ((i2 * -1462423965) - 1 > 50) {
                uz -= 86647974;
                this.ub = true;
            }
            adj(-2106134124);
            ax(this.ub, f, -1234210901);
            if (this.ub) {
                acj(171340488);
            }
            this.ub = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adr(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ads(int i) {
        try {
            if (ie.tc == null) {
                ie.tc = (oi) hr.um.ao(ml.aq, 1990260972);
            }
            if (ie.tc != null) {
                uq.as(ie.tc, this.uk, this.tg, (byte) 9);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.ads(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean adt(byte b) {
        while (!this.ux.ad(0, (byte) -24)) {
            try {
                kh.ad(10);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jd.adt(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        for (Entry entry : this.ux.aj(237583840).aq.entrySet()) {
            acl(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), -1761829413);
        }
        String str = (String) this.ux.aj(2079012814).ad.get("codebase");
        return str == null ? false : acz(str, (short) 8250);
    }

    public final void adu(byte b) {
        try {
            if (sl == this && !st) {
                sn = gq.ad((byte) 26) * -1099009541310989211L;
                kh.ad(5000);
                ado(465553311);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void adw(int i) {
        try {
            long ad = gq.ad((byte) -56);
            long j = tq[cf.ts * -2004239789];
            tq[cf.ts * -2004239789] = ad;
            cf.ts = (((cf.ts * -2004239789) + 1) & 31) * -1331258917;
            if (j != 0) {
            }
            adf(88193015);
            az(-66885959);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void adx(byte b) {
        try {
            this.us.as((byte) 4);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ady(int i) {
        try {
            this.ua = true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.ady(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void adz(mi miVar, int i) {
        try {
            if (!adp(1934787322)) {
                sd = miVar;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jd.adz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void ae(int i);

    public final lp aeb() {
        return hr.um;
    }

    public void aec(int i) {
        if (this.uk != null) {
            this.uk.ak(i, (byte) 8);
        }
    }

    /* Access modifiers changed, original: protected */
    public void aed(String str) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void aee(int i, int i2) {
        if (!(i == this.tf * -1412908477 && this.tn * 958937687 == i2)) {
            ady(-31401863);
        }
        this.tf = 1736041067 * i;
        this.tn = 429740391 * i2;
    }

    public final int aeg() {
        float aw = hr.um.aw(1773239230);
        return aw < 0.0f ? -1 : (int) (aw * ((float) (jw.tx * -1083397279)));
    }

    public final int aeh() {
        return this.uc * -729711825;
    }

    /* Access modifiers changed, original: protected */
    public void aei() {
    }

    /* Access modifiers changed, original: protected */
    public bw aej() {
        return this.uk.ar(1986549635);
    }

    public final void ael(lp lpVar) {
        hr.um = lpVar;
    }

    /* Access modifiers changed, original: protected */
    public void aem() {
    }

    public final int aen() {
        float aw = hr.um.aw(594991162);
        return aw < 0.0f ? -1 : (int) (aw * ((float) (jw.tx * -1083397279)));
    }

    public final lp aep() {
        return hr.um;
    }

    /* Access modifiers changed, original: protected */
    public void aeq(String str) {
    }

    public void aer(int i) {
        if (this.uk != null) {
            this.uk.ak(i, (byte) 8);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void aes(int i, int i2) {
        if (!(i == this.tf * -1412908477 && this.tn * 1601232568 == i2)) {
            ady(-465399761);
        }
        this.tf = -849530549 * i;
        this.tn = 429740391 * i2;
    }

    public void aet(int i) {
        if (this.uk != null) {
            this.uk.ak(i, (byte) 8);
        }
    }

    public final int aeu() {
        float aw = hr.um.aw(-1106358513);
        return aw < 0.0f ? -1 : (int) (aw * ((float) (jw.tx * 2143594597)));
    }

    public final void aew(lp lpVar) {
        hr.um = lpVar;
    }

    /* Access modifiers changed, original: protected */
    public void aex(String str) {
    }

    /* Access modifiers changed, original: protected */
    public mx aez() {
        if (this.up == null) {
            this.up = new jh();
        }
        return this.up;
    }

    /* Access modifiers changed, original: final */
    public final void afa() {
        this.uu.ah(-1645526126);
        aca((byte) 101);
        this.us.ak(hr.um, 1350811837 * hl.tk, -1259384107 * jw.tx, this.tj * -433683967, this.tw * 1569557487, (byte) 95);
    }

    /* Access modifiers changed, original: final */
    public final void afb() {
        this.uu.ai(-297298816);
        ad.bg((byte) -95);
        this.tj = ad.ab((byte) -33) * -337805823;
        this.tw = ad.av(-1388197876) * 402588431;
        this.tg = ((float) (this.tj * -433683967)) / ((float) (this.tw * 1569557487));
    }

    /* Access modifiers changed, original: final */
    public final void afc() {
        adu((byte) 97);
    }

    /* Access modifiers changed, original: final */
    public final void afd() {
        ow add = add(-66760022);
        this.tp = Math.max(add.ar * 62653529, this.tr * -2044314521) * 2014987303;
        this.th = Math.max(add.al * -2054690887, this.td * -1950818899) * 922273793;
        if (this.tp * 834595735 <= 0) {
            this.tp = 2014987303;
        }
        if (this.th * -448317439 <= 0) {
            this.th = 922273793;
        }
        hl.tk = Math.min(this.tp * 834595735, this.tf * -1412908477) * 2040412821;
        jw.tx = Math.min(this.th * -448317439, this.tn * 958937687) * -1173669727;
        this.tu = (((this.tp * 834595735) - (hl.tk * 1350811837)) / 2) * -1085944269;
        this.tt = 0;
        if (this.uk == null) {
            this.uk = new jz(hl.tk * 1350811837, jw.tx * -1083397279);
        } else {
            this.uk.al(hl.tk * 1350811837, jw.tx * -1083397279, -1794098780);
        }
        this.ub = true;
        cl((byte) -28);
    }

    /* Access modifiers changed, original: protected|final */
    public final void afe() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void aff() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void afg() {
    }

    public final void afh(boolean z) {
        this.uu.ao(z, 1837693679);
    }

    /* Access modifiers changed, original: final */
    public final void afi(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            String property;
            Thread.currentThread().setName("NXT");
            sl = this;
            hl.tk = 2040412821 * i;
            jw.tx = -1173669727 * i2;
            this.tr = 1277632343 * i;
            this.td = 920292901 * i2;
            pn.ar = 997954135 * i5;
            ai.al = 739177361 * i6;
            this.uu = fw.ar(-486837441);
            mi.sm = new mr();
            mi.sm.ai(this, 1, 1525824342);
            try {
                property = System.getProperty("os.name");
            } catch (Exception e) {
                property = "Unknown";
            }
            property.toLowerCase();
        } catch (Exception e2) {
            iv.ad(null, e2, 1692244937);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void afj(int i, int i2, int i3, int i4) {
        ach(i, i2, 0, 0, i3, i4, (byte) 0);
    }

    public final fx afk() {
        return this.ue;
    }

    /* Access modifiers changed, original: protected|final */
    public final void afl(int i, int i2, int i3, int i4) {
        ach(i, i2, 0, 0, i3, i4, (byte) 0);
    }

    /* Access modifiers changed, original: final */
    public final void afm() {
        this.uu.ai(1095633763);
        ad.bg((byte) -89);
        this.tj = ad.ab((byte) 25) * -337805823;
        this.tw = ad.av(-429273699) * 402588431;
        this.tg = ((float) (this.tj * -433683967)) / ((float) (this.tw * 1569557487));
    }

    /* Access modifiers changed, original: final */
    public final void afn() {
        this.uu.ah(1622463549);
        aca((byte) 37);
        this.us.ak(hr.um, 1350811837 * hl.tk, -1083397279 * jw.tx, -399317060 * this.tj, -641254285 * this.tw, (byte) 73);
    }

    public final fx afo() {
        return this.ue;
    }

    /* Access modifiers changed, original: final */
    public final void afp() {
        adu((byte) 98);
    }

    /* Access modifiers changed, original: protected|final */
    public final void afq() {
    }

    public final void afr(boolean z) {
        this.uu.ao(z, 1624175251);
    }

    /* Access modifiers changed, original: protected|final */
    public final void afs() {
    }

    public final void aft(boolean z) {
        this.uu.ao(z, 2048186271);
    }

    /* Access modifiers changed, original: 0000 */
    public void afu() {
        int[] af = ad.af(-1822255625);
        for (int i = 0; i < af.length / 2; i++) {
            int i2 = i * 2;
            int i3 = af[i2];
            i2 = af[i2 + 1];
            long ad = gq.ad((byte) -21);
            switch (i3) {
                case 0:
                    i2 = hr.um.ax(i2, -411407778);
                    if (i2 < 0) {
                        break;
                    }
                    this.ue.ai(i2, ad);
                    break;
                case 1:
                    i2 = hr.um.ax(i2, 691631017);
                    if (i2 < 0) {
                        break;
                    }
                    this.ue.ae(i2, ad);
                    break;
                case 2:
                    if (i2 <= 0) {
                        break;
                    }
                    this.ue.am((char) i2, ad);
                    break;
                default:
                    break;
            }
        }
    }

    public final void afv() {
        try {
            acy(-8998671);
            while (ad.at((short) -29368)) {
                act(-565451543);
            }
            acm((byte) 1);
        } catch (pn e) {
            iv.ad(null, e, 1692244937);
            throw new RuntimeException(e.al((byte) 32));
        } catch (Exception e2) {
            iv.ad(null, e2, 1692244937);
            throw new RuntimeException(e2);
        }
    }

    public final void afw() {
        try {
            acy(1614744743);
            while (ad.at((short) -18522)) {
                act(-1162566927);
            }
            acm((byte) 1);
        } catch (pn e) {
            iv.ad(null, e, 1692244937);
            throw new RuntimeException(e.al((byte) 78));
        } catch (Exception e2) {
            iv.ad(null, e2, 1692244937);
            throw new RuntimeException(e2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void afx() {
        adu((byte) 126);
    }

    /* Access modifiers changed, original: final */
    public final void afy(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            String property;
            Thread.currentThread().setName("NXT");
            sl = this;
            hl.tk = 2040412821 * i;
            jw.tx = 545606636 * i2;
            this.tr = 4850318 * i;
            this.td = -1833568679 * i2;
            pn.ar = 997954135 * i5;
            ai.al = 739177361 * i6;
            this.uu = fw.ar(-437421173);
            mi.sm = new mr();
            mi.sm.ai(this, 1, -884303959);
            try {
                property = System.getProperty("os.name");
            } catch (Exception e) {
                property = "Unknown";
            }
            property.toLowerCase();
        } catch (Exception e2) {
            iv.ad(null, e2, 1692244937);
        }
    }

    /* Access modifiers changed, original: final */
    public final void afz() {
        ow add = add(1946715431);
        this.tp = Math.max(add.ar * 62653529, this.tr * -2044314521) * 2014987303;
        this.th = Math.max(add.al * -2054690887, this.td * -1950818899) * 922273793;
        if (this.tp * 834595735 <= 0) {
            this.tp = 2014987303;
        }
        if (this.th * -448317439 <= 0) {
            this.th = 922273793;
        }
        hl.tk = Math.min(this.tp * 834595735, this.tf * -1412908477) * 2040412821;
        jw.tx = Math.min(this.th * -448317439, this.tn * 958937687) * -1173669727;
        this.tu = (((this.tp * 834595735) - (hl.tk * 1350811837)) / 2) * -1085944269;
        this.tt = 0;
        if (this.uk == null) {
            this.uk = new jz(hl.tk * 1350811837, jw.tx * -1083397279);
        } else {
            this.uk.al(hl.tk * 1350811837, jw.tx * -1083397279, -325987470);
        }
        this.ub = true;
        cl((byte) 2);
    }

    /* Access modifiers changed, original: final */
    public final void aga() {
        ow add = add(-763037095);
        if (add.ar * 165843611 != this.tj * -433683967 || this.tw * -721017053 != add.al * -2054690887 || this.ua) {
            acd((byte) 5);
            this.ua = false;
        }
    }

    /* Access modifiers changed, original: protected */
    public String agb(String str) {
        return (String) this.uv.get(str);
    }

    /* Access modifiers changed, original: final */
    public final void agc() {
        synchronized (this) {
            if (st) {
                return;
            }
            st = true;
            try {
                aw(-1830927141);
            } catch (Exception e) {
            }
            if (mi.sm != null) {
                try {
                    mi.sm.ar(-1843985413);
                } catch (Exception e2) {
                }
            }
            ae(-645918780);
        }
    }

    /* Access modifiers changed, original: final */
    public final void agd() {
        ow add = add(-1213268139);
        if (add.ar * 788356369 != this.tj * -433683967 || this.tw * -327023149 != add.al * 251560872 || this.ua) {
            acd((byte) 5);
            this.ua = false;
        }
    }

    /* Access modifiers changed, original: protected */
    public URL age() {
        return this.ud;
    }

    /* Access modifiers changed, original: 0000 */
    public void agg() {
        long ad = gq.ad((byte) 103);
        long j = tq[cf.ts * -2004239789];
        tq[cf.ts * -1013917696] = ad;
        cf.ts = (((cf.ts * -2004239789) + 1) & 207115278) * -451845171;
        if (j != 0) {
        }
        adf(88193015);
        az(1701269920);
    }

    /* Access modifiers changed, original: 0000 */
    public void agh() {
        long ad = gq.ad((byte) -38);
        long j = tq[cf.ts * -2004239789];
        tq[cf.ts * -745740745] = ad;
        cf.ts = (((cf.ts * 1104991382) + 1) & 294324880) * -1593330988;
        adf(88193015);
        az(-711758684);
    }

    /* Access modifiers changed, original: protected */
    public String agj(String str) {
        return (String) this.uv.get(str);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean agk(String str) {
        try {
            this.ud = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void agl() {
        int[] af = ad.af(-227253983);
        for (int i = 0; i < af.length / 2; i++) {
            int i2 = i * 2;
            int i3 = af[i2];
            i2 = af[i2 + 1];
            long ad = gq.ad((byte) -28);
            switch (i3) {
                case 0:
                    i2 = hr.um.ax(i2, 1259459949);
                    if (i2 < 0) {
                        break;
                    }
                    this.ue.ai(i2, ad);
                    break;
                case 1:
                    i2 = hr.um.ax(i2, 1818724868);
                    if (i2 < 0) {
                        break;
                    }
                    this.ue.ae(i2, ad);
                    break;
                case 2:
                    if (i2 <= 0) {
                        break;
                    }
                    this.ue.am((char) i2, ad);
                    break;
                default:
                    break;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void agm() {
        synchronized (this) {
            dk.uf = ug;
        }
    }

    public void ago(jb jbVar) {
        this.ux = jbVar;
    }

    /* Access modifiers changed, original: final */
    public final void agp() {
        ow add = add(-1877758493);
        if (add.ar * 62653529 != this.tj * -138949674 || this.tw * 1569557487 != add.al * 1256401250 || this.ua) {
            acd((byte) 5);
            this.ua = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void agq() {
        this.ua = true;
    }

    /* Access modifiers changed, original: protected */
    public URL agr() {
        return this.ud;
    }

    /* Access modifiers changed, original: 0000 */
    public void ags(float f) {
        int i;
        long ad = gq.ad((byte) 42);
        long j = ta[ch.te * -1010995061];
        ta[ch.te * -1494948189] = ad;
        ch.te = (((ch.te * -1494948189) + 1) & -301173715) * 92929291;
        if (0 != j && ad > j) {
            i = (int) (ad - j);
            tv = (((i >> 1) + 32000) / i) * -1999208327;
        }
        i = uz - 2039143580;
        uz = i;
        if ((i * 246981182) - 1 > 50) {
            uz -= 86647974;
            this.ub = true;
        }
        adj(-2106134124);
        ax(this.ub, f, -362101155);
        if (this.ub) {
            acj(-782079409);
        }
        this.ub = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void agt() {
        long ad = gq.ad((byte) -79);
        long j = tq[cf.ts * -2004239789];
        tq[cf.ts * -2004239789] = ad;
        cf.ts = (((cf.ts * 1890305830) + 1) & -1384197993) * 1629168747;
        if (j != 0) {
        }
        adf(88193015);
        az(728661190);
    }

    /* Access modifiers changed, original: 0000 */
    public void agu() {
        synchronized (this) {
            dk.uf = ug;
        }
    }

    /* Access modifiers changed, original: protected */
    public URL agv() {
        return this.ud;
    }

    /* Access modifiers changed, original: 0000 */
    public void agw() {
        synchronized (this) {
            dk.uf = ug;
        }
    }

    /* Access modifiers changed, original: protected */
    public int agy() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void agz(int i, String str) {
        this.uv.put(Integer.toString(i), str);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean aha(boolean z) {
        ea.tl = (ef[]) hr.um.ao(ml.ad, 331842536);
        cd.uh = (ef) hr.um.ao(ml.al, 734960926);
        az.ut = (ef) hr.um.ao(ml.aj, 592444343);
        uq.aq(ea.tl, cd.uh, az.ut, -963066281);
        return true;
    }

    public void ahc() {
        this.us.as((byte) 4);
    }

    /* Access modifiers changed, original: final */
    public final void ahd(boolean z) {
        long ad = gq.ad((byte) -14);
        int i = 0;
        while (i < 500) {
            ck(0, (short) 7330);
            long ad2 = gq.ad((byte) 12);
            kh.ad(10 - (ad2 - ad));
            adj(-2106134124);
            if (this.uk != null) {
                adk(((((500 - i) - 1) * 10) / 1000) + 1, z, (byte) 36);
            }
            i++;
            ad = ad2;
        }
        this.ux = new jb(this.ux.ai(1770993279));
        mi.sm.ai(this, 1, -1856494527);
    }

    public final void ahe() {
        if (sl == this && !st) {
            sn = gq.ad((byte) 35) * -1099009541310989211L;
            kh.ad(5000);
            ado(-540009100);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ahf(int i, boolean z) {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1427520930);
        }
        if (ie.tc == null) {
            return;
        }
        if (z) {
            uq.am(i, ie.tc, this.uk, this.tg, -1832600266);
            return;
        }
        uq.ae(i, ie.tc, this.uk, this.tg, -847356622);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ahg(boolean z) {
        ea.tl = (ef[]) hr.um.ao(ml.ad, 592385910);
        cd.uh = (ef) hr.um.ao(ml.al, 1890555534);
        az.ut = (ef) hr.um.ao(ml.aj, 785135904);
        uq.aq(ea.tl, cd.uh, az.ut, 1882611881);
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void ahh(boolean z) {
        long ad = gq.ad((byte) -33);
        int i = 0;
        while (i < 1410716406) {
            ck(0, (short) 4375);
            long ad2 = gq.ad((byte) -81);
            kh.ad(10 - (ad2 - ad));
            adj(-2106134124);
            if (this.uk != null) {
                adk(((((500 - i) - 1) * 10) / 2041059015) + 1, z, (byte) 19);
            }
            i++;
            ad = ad2;
        }
        this.ux = new jb(this.ux.ai(-2072535095));
        mi.sm.ai(this, 1, 1372722478);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ahi() {
        return sd != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ahk(boolean z) {
        ea.tl = (ef[]) hr.um.ao(ml.ad, 1759499531);
        cd.uh = (ef) hr.um.ao(ml.al, 1657959261);
        az.ut = (ef) hr.um.ao(ml.aj, 796061923);
        uq.aq(ea.tl, cd.uh, az.ut, 1094469897);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ahl(boolean z) {
        ea.tl = (ef[]) hr.um.ao(ml.ad, 870904963);
        cd.uh = (ef) hr.um.ao(ml.al, 339759587);
        az.ut = (ef) hr.um.ao(ml.aj, 1272188061);
        uq.aq(ea.tl, cd.uh, az.ut, -198581190);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void ahm(int i, String str, boolean z) {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1132434661);
        }
        uq.ar(i, str, ie.tc, this.tg, this.uk, (byte) -90);
    }

    public final void ahn() {
        if (sl == this && !st) {
            sn = gq.ad((byte) -70) * -1099009541310989211L;
            kh.ad(5000);
            ado(-110985765);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aho() {
        while (!this.ux.ad(0, (byte) -3)) {
            kh.ad(10);
        }
        for (Entry entry : this.ux.aj(1639869301).aq.entrySet()) {
            acl(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), -1761829413);
        }
        String str = (String) this.ux.aj(-756434377).ad.get("codebase");
        return str == null ? false : acz(str, (short) 8250);
    }

    /* Access modifiers changed, original: protected|final */
    public final void ahp() {
    }

    /* Access modifiers changed, original: protected */
    public void ahq(mi miVar) {
        if (!adp(1369929882)) {
            sd = miVar;
        }
    }

    /* Access modifiers changed, original: final */
    public final void ahr(int i, boolean z) {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 813541054);
        }
        if (ie.tc == null) {
            return;
        }
        if (z) {
            uq.am(i, ie.tc, this.uk, this.tg, 1283503767);
            return;
        }
        uq.ae(i, ie.tc, this.uk, this.tg, -847356622);
    }

    /* Access modifiers changed, original: protected */
    public void ahs() {
        sw += 1649408118;
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1690826316);
        }
        if (ie.tc != null) {
            uq.ai(sd, ie.tc, this.uk, this.tg, -1698131740);
        }
        if (mi.ai == sd && sw * 1418410905 == 200) {
            hr.um.at((byte) 91);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void aht() {
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ahu() {
        while (!this.ux.ad(0, (byte) -30)) {
            kh.ad(10);
        }
        for (Entry entry : this.ux.aj(-1123798575).aq.entrySet()) {
            acl(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), -1761829413);
        }
        String str = (String) this.ux.aj(671124928).ad.get("codebase");
        return str == null ? false : acz(str, (short) 8250);
    }

    /* Access modifiers changed, original: final */
    public final void ahv(boolean z) {
        long ad = gq.ad((byte) -76);
        int i = 0;
        while (i < 474486876) {
            ck(0, (short) 30949);
            long ad2 = gq.ad((byte) -102);
            kh.ad(10 - (ad2 - ad));
            adj(-2106134124);
            if (this.uk != null) {
                adk(((((500 - i) - 1) * 10) / 1000) + 1, z, (byte) 98);
            }
            i++;
            ad = ad2;
        }
        this.ux = new jb(this.ux.ai(-2100406722));
        mi.sm.ai(this, 1, -1001848518);
    }

    /* Access modifiers changed, original: protected|final */
    public final void ahw() {
    }

    /* Access modifiers changed, original: final */
    public final void ahx(int i, boolean z) {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1655421115);
        }
        if (ie.tc == null) {
            return;
        }
        if (z) {
            uq.am(i, ie.tc, this.uk, this.tg, -1664109880);
            return;
        }
        uq.ae(i, ie.tc, this.uk, this.tg, -847356622);
    }

    /* Access modifiers changed, original: protected|final */
    public final void ahy(int i, String str, boolean z) {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1682411239);
        }
        uq.ar(i, str, ie.tc, this.tg, this.uk, (byte) -31);
    }

    /* Access modifiers changed, original: final */
    public final void ahz(boolean z) {
        long ad = gq.ad((byte) -63);
        int i = 0;
        while (i < 171172122) {
            ck(0, (short) 5337);
            long ad2 = gq.ad((byte) 38);
            kh.ad(10 - (ad2 - ad));
            adj(-2106134124);
            if (this.uk != null) {
                adk(((((500 - i) - 1) * 10) / 1000) + 1, z, (byte) 20);
            }
            i++;
            ad = ad2;
        }
        this.ux = new jb(this.ux.ai(1377075263));
        mi.sm.ai(this, 1, 1185252818);
    }

    /* Access modifiers changed, original: 0000 */
    public ow aia() {
        return new ow(this.tj * -433683967, this.tw * 1569557487);
    }

    /* Access modifiers changed, original: protected */
    public lw aig() {
        return hr.um;
    }

    /* Access modifiers changed, original: protected */
    public lw aim() {
        return hr.um;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ain() {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public ow aio() {
        return new ow(this.tj * -481682130, this.tw * 1310210207);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean air() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void ais(int i, boolean z) {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1250569438);
        }
        if (ie.tc == null) {
            return;
        }
        if (z) {
            uq.am(i, ie.tc, this.uk, this.tg, -256356519);
            return;
        }
        uq.ae(i, ie.tc, this.uk, this.tg, -847356622);
    }

    /* Access modifiers changed, original: final */
    public final void aiv() {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1642232863);
        }
        if (ie.tc != null) {
            uq.as(ie.tc, this.uk, this.tg, (byte) 9);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean aiw() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public lw aix() {
        return hr.um;
    }

    /* Access modifiers changed, original: final */
    public final void aiy() {
        if (ie.tc == null) {
            ie.tc = (oi) hr.um.ao(ml.aq, 1418900442);
        }
        if (ie.tc != null) {
            uq.as(ie.tc, this.uk, this.tg, (byte) 9);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ow aiz() {
        return new ow(this.tj * -433683967, this.tw * 1569557487);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032 A:{Splitter:B:1:0x0001, ExcHandler: pn (r0_18 'e' java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:8:0x0032, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            defpackage.iv.ad(null, r0, 1692244937);
            r0 = r0.al((byte) -29);
     */
    /* JADX WARNING: Missing block: B:33:0x0102, code skipped:
            ade(false, -137106931);
            r0 = defpackage.gq.ad((byte) 33);
     */
    /* JADX WARNING: Missing block: B:34:0x010f, code skipped:
            sw -= 1769215831;
            ck(0, (short) 12593);
            r2 = defpackage.gq.ad((byte) -75);
            defpackage.kh.ad(10 - (r2 - r0));
            adj(-2106134124);
     */
    /* JADX WARNING: Missing block: B:35:0x0134, code skipped:
            if (r10.uk != null) goto L_0x0136;
     */
    /* JADX WARNING: Missing block: B:36:0x0136, code skipped:
            ads(933863550);
     */
    /* JADX WARNING: Missing block: B:38:0x0144, code skipped:
            if (200 == (sw * 1418410905)) goto L_0x0146;
     */
    /* JADX WARNING: Missing block: B:39:0x0146, code skipped:
            defpackage.hr.um.at((byte) 108);
     */
    /* JADX WARNING: Missing block: B:40:0x014d, code skipped:
            r0 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void aq() {
        Throwable e = null;
        try {
            if (!hr.um.au(-581611191)) {
                ade(false, -675989055);
                adh(false, 66557718);
            } else if (adt((byte) -32)) {
                pn.ad = ace(955962929);
                as((byte) 103);
                sn = 0;
                st = false;
                au(1722134867);
                this.uk = new jz(hl.tk * 1350811837, jw.tx * -1083397279);
                jp.tz = ip.ad((byte) -78);
                long j = 0;
                while (true) {
                    if (0 != sn * 3455982638216615277L && gq.ad((byte) -62) >= sn * 3455982638216615277L) {
                        break;
                    }
                    long nanoTime = System.nanoTime();
                    long j2 = nanoTime / (ty * 2683488820213499883L);
                    ds.tm = Math.min((int) (j2 - j), 10) * -1067042893;
                    for (int i = 0; i < ds.tm * 67194747; i++) {
                        adw(-2092199556);
                    }
                    ib.to = gq.ad((byte) -25) * -3940384991735917943L;
                    adr(((float) (nanoTime - ((ty * 2683488820213499883L) * j2))) / ((float) (ty * 2683488820213499883L)), 184347031);
                    j = j2;
                }
                ado(-803019163);
                if (e != null) {
                    throw new RuntimeException(e);
                }
            } else {
                ade(false, -1055997431);
                adh(true, -1712560532);
            }
        } catch (pn e2) {
        } catch (Exception e3) {
            e = e3;
            iv.ad(null, e, 1692244937);
        }
    }

    public abstract void as(byte b);

    public abstract void au(int i);

    public abstract void aw(int i);

    public abstract void ax(boolean z, float f, int i);

    public abstract void az(int i);

    public abstract void ck(int i, short s);

    public abstract void cl(byte b);

    public abstract void ja();

    public abstract void jb();

    public abstract void jc();

    public abstract void jd();

    public abstract void jh();

    public abstract void jj(boolean z, float f);

    public abstract void jk();

    public abstract void jm();

    public abstract void jr();

    public abstract void jt();

    public abstract void ju();

    public abstract void jy(boolean z, float f);

    public abstract void jz();

    public abstract void og();

    public abstract void ok(int i);

    public abstract void op(int i);

    public abstract void ot(int i);

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032 A:{Splitter:B:1:0x0001, ExcHandler: pn (r0_18 'e' java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:8:0x0032, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            defpackage.iv.ad(null, r0, 1692244937);
            r0 = r0.al((byte) -61);
     */
    /* JADX WARNING: Missing block: B:33:0x0101, code skipped:
            ade(false, 1916691613);
            r0 = defpackage.gq.ad((byte) -19);
     */
    /* JADX WARNING: Missing block: B:34:0x010e, code skipped:
            sw -= 1769215831;
            ck(0, (short) 30421);
            r2 = defpackage.gq.ad((byte) 18);
            defpackage.kh.ad(10 - (r2 - r0));
            adj(-2106134124);
     */
    /* JADX WARNING: Missing block: B:35:0x0133, code skipped:
            if (r10.uk != null) goto L_0x0135;
     */
    /* JADX WARNING: Missing block: B:36:0x0135, code skipped:
            ads(933863550);
     */
    /* JADX WARNING: Missing block: B:38:0x0143, code skipped:
            if (200 == (sw * 1418410905)) goto L_0x0145;
     */
    /* JADX WARNING: Missing block: B:39:0x0145, code skipped:
            defpackage.hr.um.at((byte) 104);
     */
    /* JADX WARNING: Missing block: B:40:0x014c, code skipped:
            r0 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        Throwable e = null;
        try {
            if (!hr.um.au(-1271515996)) {
                ade(false, -1364692340);
                adh(false, -744820256);
            } else if (adt((byte) -19)) {
                pn.ad = ace(-114689322);
                as((byte) 115);
                sn = 0;
                st = false;
                au(1722134867);
                this.uk = new jz(hl.tk * 1350811837, jw.tx * -1083397279);
                jp.tz = ip.ad((byte) -58);
                long j = 0;
                while (true) {
                    if (0 != sn * 3455982638216615277L && gq.ad((byte) -6) >= sn * 3455982638216615277L) {
                        break;
                    }
                    long nanoTime = System.nanoTime();
                    long j2 = nanoTime / (ty * 2683488820213499883L);
                    ds.tm = Math.min((int) (j2 - j), 10) * -1067042893;
                    for (int i = 0; i < ds.tm * 67194747; i++) {
                        adw(-2146146091);
                    }
                    ib.to = gq.ad((byte) 67) * -3940384991735917943L;
                    adr(((float) (nanoTime - ((ty * 2683488820213499883L) * j2))) / ((float) (ty * 2683488820213499883L)), 1421516130);
                    j = j2;
                }
                ado(-63673642);
                if (e != null) {
                    throw new RuntimeException(e);
                }
            } else {
                ade(false, -9476203);
                adh(true, -2021970420);
            }
        } catch (pn e2) {
        } catch (Exception e3) {
            e = e3;
            iv.ad(null, e, 1692244937);
        }
    }
}
