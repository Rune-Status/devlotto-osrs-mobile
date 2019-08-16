package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: fx */
public class fx implements fm {
    static boolean ag = false;
    static final int al = 100;
    static final int aq = 1000;
    static kv dt = null;
    static final int nd = 1;
    fm ad;
    Collection ai;
    Collection aj;
    final mf ar;

    public fx() {
        try {
            this.ar = new mf(fn.class, 1000);
            this.aj = new ArrayList(100);
            this.ai = new ArrayList(100);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ar(int i, hw hwVar, boolean z, int i2) {
        if (i >= 1000) {
            return i < 1100 ? jf.aj(i, hwVar, z, -794530993) : i < 1200 ? db.ai(i, hwVar, z, -983765068) : i < 1300 ? hd.ae(i, hwVar, z, (byte) -79) : i < af.al ? fu.am(i, hwVar, z, -1648611904) : i < ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED ? al.ap(i, hwVar, z, (byte) 10) : i < 1600 ? di.au(i, hwVar, z, -1094193922) : i < 1700 ? cz.az(i, hwVar, z, (byte) -119) : i < 1800 ? bt.ax(i, hwVar, z, (byte) -61) : i < 1900 ? ho.aw(i, hwVar, z, (byte) -60) : i < 2000 ? fq.ac(i, hwVar, z, 1931860252) : i < 2100 ? jf.aj(i, hwVar, z, -1111124322) : i < 2200 ? db.ai(i, hwVar, z, 1008764710) : i < 2300 ? hd.ae(i, hwVar, z, (byte) -81) : i < 2400 ? fu.am(i, hwVar, z, -93793541) : i < 2500 ? al.ap(i, hwVar, z, (byte) 33) : i < 2600 ? fl.aa(i, hwVar, z, 1531752261) : i < 2700 ? by.ao(i, hwVar, z, -1930654116) : i < 2800 ? dq.ah(i, hwVar, z, 526832495) : i < 2900 ? ku.af(i, hwVar, z, -965475295) : i < 3000 ? fq.ac(i, hwVar, z, 1763300473) : i < 3200 ? ed.ay(i, hwVar, z, (byte) 76) : i < 3300 ? cr.an(i, hwVar, z, 1683265835) : i < 3400 ? al.ab(i, hwVar, z, -637995005) : i < 3500 ? db.av(i, hwVar, z, -1332123319) : i < 3700 ? fj.at(i, hwVar, z, -316862239) : i < 4000 ? ca.bk(i, hwVar, z, -1924663199) : i < 4100 ? fw.ba(i, hwVar, z, (byte) 5) : i < 4200 ? ag.bs(i, hwVar, z, 629476262) : i < 4300 ? cs.bm(i, hwVar, z, (byte) 1) : i < 5100 ? dm.bq(i, hwVar, z, -526478364) : i < 5400 ? nv.bd(i, hwVar, z, 629504231) : i < 5600 ? ci.bo(i, hwVar, z, -1825124226) : i < 5700 ? dv.bl(i, hwVar, z, 1819425660) : i < 6300 ? ew.bi(i, hwVar, z, (byte) -124) : i < 6600 ? cz.bc(i, hwVar, z, -1883296125) : i < 6700 ? et.bv(i, hwVar, z, (byte) -84) : 2;
        } else {
            try {
                return ez.al(i, hwVar, z, (byte) -49);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fx.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    static final void dx(byte b) {
        try {
            cw.dq((byte) 54);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.dx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa() {
        synchronized (this) {
            Collection collection = this.ai;
            this.ai = this.aj;
            this.aj = collection;
        }
    }

    public final boolean ab() {
        aq(1740180406);
        boolean z = !this.ai.isEmpty();
        for (fn fnVar : this.ai) {
            if (this.ad != null) {
                fnVar.ad(this.ad, 1871938068);
            }
            this.ar.al(fnVar, 1625216938);
        }
        this.ai.clear();
        return z;
    }

    public final void ac(fm fmVar) {
        this.ad = fmVar;
    }

    public final void ad(fm fmVar, int i) {
        try {
            this.ad = fmVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae(int i, long j) {
        try {
            fn aj = aj(1499951190);
            aj.ad = fw.ae;
            aj.aq = -9397919 * i;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1730196776);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af(fn fnVar) {
        synchronized (this) {
            this.aj.add(fnVar);
        }
    }

    public boolean ag(int i, int i2, int i3, long j) {
        try {
            fn aj = aj(1819662718);
            aj.ad = fw.aj;
            aj.aq = -9397919 * i;
            aj.al = 2025661343 * i2;
            aj.aj = -2048204823 * i3;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1890386227);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(fn fnVar) {
        synchronized (this) {
            this.aj.add(fnVar);
        }
    }

    public boolean ai(int i, long j) {
        try {
            fn aj = aj(1614247665);
            aj.ad = fw.ai;
            aj.aq = -9397919 * i;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -2147143346);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public fn aj(int i) {
        try {
            return (fn) this.ar.ar((byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ak(int i, int i2, int i3, int i4, long j) {
        try {
            fn aj = aj(1229274539);
            aj.ad = fw.ar;
            aj.aq = -9397919 * i;
            aj.ar = -297758727 * i2;
            aj.al = 2025661343 * i3;
            aj.aj = -2048204823 * i4;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1743627824);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final boolean al(int i) {
        try {
            aq(1843785854);
            boolean z = !this.ai.isEmpty();
            for (fn fnVar : this.ai) {
                if (this.ad != null) {
                    fnVar.ad(this.ad, 965569682);
                }
                this.ar.al(fnVar, -1429217020);
            }
            this.ai.clear();
            return z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean am(char c, long j) {
        try {
            fn aj = aj(1271835520);
            aj.ad = fw.am;
            aj.aq = -9397919 * c;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1715973066);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final boolean an() {
        aq(965878895);
        boolean z = !this.ai.isEmpty();
        for (fn fnVar : this.ai) {
            if (this.ad != null) {
                fnVar.ad(this.ad, 2008160027);
            }
            this.ar.al(fnVar, -960552396);
        }
        this.ai.clear();
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        synchronized (this) {
            Collection collection = this.ai;
            this.ai = this.aj;
            this.aj = collection;
        }
    }

    public boolean ap(int i, int i2, long j) {
        try {
            fn aj = aj(1836914165);
            aj.ad = fw.ad;
            aj.al = 2025661343 * i;
            aj.aj = -2048204823 * i2;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1576488123);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i) {
        synchronized (this) {
            try {
                Collection collection = this.ai;
                this.ai = this.aj;
                this.aj = collection;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fx.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(fn fnVar, int i) {
        synchronized (this) {
            try {
                this.aj.add(fnVar);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fx.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean as(int i, int i2, int i3, int i4, long j) {
        try {
            fn aj = aj(1446883707);
            aj.ad = fw.al;
            aj.aq = -9397919 * i;
            aj.ar = -297758727 * i2;
            aj.al = 2025661343 * i3;
            aj.aj = -2048204823 * i4;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1490092048);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final boolean at() {
        aq(1560771423);
        boolean z = !this.ai.isEmpty();
        for (fn fnVar : this.ai) {
            if (this.ad != null) {
                fnVar.ad(this.ad, 647681582);
            }
            this.ar.al(fnVar, -765105863);
        }
        this.ai.clear();
        return z;
    }

    public boolean au(int i, long j) {
        try {
            fn aj = aj(1238693305);
            aj.ad = fw.aq;
            aj.aq = -9397919 * i;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1497378801);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final boolean av() {
        aq(1768959945);
        boolean z = !this.ai.isEmpty();
        for (fn fnVar : this.ai) {
            if (this.ad != null) {
                fnVar.ad(this.ad, 1986766034);
            }
            this.ar.al(fnVar, 1154611177);
        }
        this.ai.clear();
        return z;
    }

    public final void aw(fm fmVar) {
        this.ad = fmVar;
    }

    public final void ax(fm fmVar) {
        this.ad = fmVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(fn fnVar) {
        synchronized (this) {
            this.aj.add(fnVar);
        }
    }

    public boolean az(int i, long j) {
        try {
            fn aj = aj(1245014635);
            aj.ad = fw.ak;
            aj.aq = -9397919 * i;
            aj.ai = 7054403065017370487L * j;
            ar(aj, -1500083951);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fx.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public fn ba() {
        return (fn) this.ar.ar((byte) 0);
    }

    public boolean bb(int i, long j) {
        fn aj = aj(2141988838);
        aj.ad = fw.ai;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1955003311);
        return true;
    }

    public boolean bc(int i, long j) {
        fn aj = aj(1211216384);
        aj.ad = fw.ae;
        aj.aq = -378523597 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -2108042408);
        return true;
    }

    public boolean bd(int i, long j) {
        fn aj = aj(1931243801);
        aj.ad = fw.ai;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1590379307);
        return true;
    }

    public boolean be(int i, int i2, long j) {
        fn aj = aj(1026805659);
        aj.ad = fw.ad;
        aj.al = 2025661343 * i;
        aj.aj = -2048204823 * i2;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -2034825224);
        return true;
    }

    public boolean bf(int i, long j) {
        fn aj = aj(1660574765);
        aj.ad = fw.ai;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1794785592);
        return true;
    }

    public boolean bg(int i, int i2, int i3, int i4, long j) {
        fn aj = aj(1998925513);
        aj.ad = fw.ar;
        aj.aq = -9397919 * i;
        aj.ar = -297758727 * i2;
        aj.al = 2025661343 * i3;
        aj.aj = -2048204823 * i4;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1779735750);
        return true;
    }

    public boolean bh(int i, long j) {
        fn aj = aj(1323487253);
        aj.ad = fw.aq;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -2043739665);
        return true;
    }

    public boolean bi(int i, long j) {
        fn aj = aj(1760896935);
        aj.ad = fw.ae;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1707006370);
        return true;
    }

    public boolean bj(int i, int i2, long j) {
        fn aj = aj(1252516262);
        aj.ad = fw.ad;
        aj.al = 1629703834 * i;
        aj.aj = -674077328 * i2;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1811818212);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public fn bk() {
        return (fn) this.ar.ar((byte) 0);
    }

    public boolean bl(int i, long j) {
        fn aj = aj(2078536590);
        aj.ad = fw.ai;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1646543846);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public fn bm() {
        return (fn) this.ar.ar((byte) 0);
    }

    public boolean bn(int i, long j) {
        fn aj = aj(1301705795);
        aj.ad = fw.aq;
        aj.aq = -2025427805 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -2100169577);
        return true;
    }

    public boolean bo(int i, long j) {
        fn aj = aj(1357818230);
        aj.ad = fw.ai;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1860881852);
        return true;
    }

    public boolean bp(int i, long j) {
        fn aj = aj(1299282191);
        aj.ad = fw.ak;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1857761456);
        return true;
    }

    public boolean bq(int i, long j) {
        fn aj = aj(2021660318);
        aj.ad = fw.ai;
        aj.aq = -1360465918 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -2029936954);
        return true;
    }

    public boolean br(int i, int i2, int i3, int i4, long j) {
        fn aj = aj(1574488076);
        aj.ad = fw.al;
        aj.aq = -9397919 * i;
        aj.ar = -68866378 * i2;
        aj.al = -338486207 * i3;
        aj.aj = 1463056722 * i4;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1578186427);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public fn bs() {
        return (fn) this.ar.ar((byte) 0);
    }

    public boolean bt(int i, long j) {
        fn aj = aj(1974800332);
        aj.ad = fw.aq;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1555799811);
        return true;
    }

    public boolean bu(int i, int i2, int i3, int i4, long j) {
        fn aj = aj(1095576055);
        aj.ad = fw.ar;
        aj.aq = -9397919 * i;
        aj.ar = -2127929708 * i2;
        aj.al = -216661693 * i3;
        aj.aj = 903059210 * i4;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1819089488);
        return true;
    }

    public boolean bv(char c, long j) {
        fn aj = aj(2137737794);
        aj.ad = fw.am;
        aj.aq = 1053648437 * c;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1509003947);
        return true;
    }

    public boolean bw(int i, int i2, int i3, int i4, long j) {
        fn aj = aj(1629147806);
        aj.ad = fw.al;
        aj.aq = -9397919 * i;
        aj.ar = -518879221 * i2;
        aj.al = 2025661343 * i3;
        aj.aj = 279098634 * i4;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1840884465);
        return true;
    }

    public boolean bx(int i, int i2, int i3, int i4, long j) {
        fn aj = aj(2128531989);
        aj.ad = fw.ar;
        aj.aq = -9397919 * i;
        aj.ar = 1632452944 * i2;
        aj.al = -946914051 * i3;
        aj.aj = -2048204823 * i4;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1904841979);
        return true;
    }

    public boolean by(int i, long j) {
        fn aj = aj(2085865992);
        aj.ad = fw.ak;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -2033136033);
        return true;
    }

    public boolean bz(int i, long j) {
        fn aj = aj(1586688465);
        aj.ad = fw.aq;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1660376754);
        return true;
    }

    public boolean cj(int i, int i2, int i3, long j) {
        fn aj = aj(1527027392);
        aj.ad = fw.aj;
        aj.aq = -9397919 * i;
        aj.al = 2025661343 * i2;
        aj.aj = -2048204823 * i3;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1628512970);
        return true;
    }

    public boolean cm(int i, int i2, int i3, long j) {
        fn aj = aj(1780293162);
        aj.ad = fw.aj;
        aj.aq = -9397919 * i;
        aj.al = 2025661343 * i2;
        aj.aj = -2048204823 * i3;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1758237681);
        return true;
    }

    public boolean cq(int i, int i2, int i3, long j) {
        fn aj = aj(1843339968);
        aj.ad = fw.aj;
        aj.aq = -1178910617 * i;
        aj.al = 2025661343 * i2;
        aj.aj = -2048204823 * i3;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1947686949);
        return true;
    }

    public boolean cv(int i, long j) {
        fn aj = aj(1590380329);
        aj.ad = fw.ak;
        aj.aq = -9397919 * i;
        aj.ai = 7054403065017370487L * j;
        ar(aj, -1673023770);
        return true;
    }
}
