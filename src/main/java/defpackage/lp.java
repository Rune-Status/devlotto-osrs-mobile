package defpackage;

import com.jagex.jagex3.client.input.softkeyboard.al;
import java.io.File;
import java.util.Map;

/* renamed from: lp */
public abstract class lp implements lw {
    public static final String ac = "name";
    static final int[] av = new int[]{0, 0};
    static final String ax = "random.dat";
    boolean ab;
    protected aa af;
    protected al ah;
    protected boolean an;
    protected lu ay;

    protected lp() {
        try {
            this.ab = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract ee aa(byte[] bArr, int i);

    public abstract al ac(int i, int i2);

    public boolean ag(int i) {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void aj(int i) {
        try {
            this.ab = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ak(int i) {
        return -1;
    }

    /* Access modifiers changed, original: protected */
    public void al(byte b) {
        try {
            this.ab = true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract int am(int i);

    public abstract Object ao(ml mlVar, int i);

    public int[] ap(int i) {
        try {
            return av;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean as(byte b) {
        return true;
    }

    public abstract void at(byte b);

    public boolean au(int i) {
        return true;
    }

    public float aw(int i) {
        return -1.0f;
    }

    public int ax(int i, int i2) {
        return i;
    }

    public abstract String az(byte b);

    public abstract void ba(boolean z, int i);

    public abstract int bb(String str, int i, byte b);

    public abstract void bc(String str, String str2, byte b);

    public abstract void bd(String str, String str2, int i);

    public abstract String bf(String str, String str2, byte b);

    public abstract void bg(String str, String str2, String str3, int i);

    public abstract void bi(String[] strArr, byte b);

    public abstract void bk(int i);

    public abstract boolean bl(String str, boolean z, int i);

    public abstract void bm(Runnable runnable, int i);

    public abstract void bo(String str, int i, byte b);

    /* Access modifiers changed, original: protected */
    public void bp() {
        this.ab = false;
    }

    public abstract void bq(String str, boolean z, int i);

    public abstract aa bx(int i);

    /* Access modifiers changed, original: protected */
    public void by() {
        this.ab = false;
    }

    /* Access modifiers changed, original: protected */
    public void bz() {
        this.ab = true;
    }

    public boolean ca() {
        return true;
    }

    public abstract int cb();

    public abstract int cc();

    public boolean cd() {
        return true;
    }

    public abstract int ce();

    public abstract String cf();

    public abstract String cg();

    public abstract String ch();

    public abstract int ci();

    public boolean ck() {
        return true;
    }

    public boolean cl() {
        return true;
    }

    public int[] co() {
        return av;
    }

    public int cr() {
        return -1;
    }

    public int cs() {
        return -1;
    }

    public boolean ct() {
        return true;
    }

    public int[] cu() {
        return av;
    }

    /* Access modifiers changed, original: protected */
    public void cv() {
        this.ab = false;
    }

    public boolean cx() {
        return true;
    }

    public abstract int cy();

    public boolean cz() {
        return true;
    }

    public abstract ee da(byte[] bArr);

    public abstract ee db(byte[] bArr);

    public abstract ee dc(byte[] bArr);

    public int dd(int i) {
        return i;
    }

    public abstract al df(int i);

    public abstract al di(int i);

    public abstract al dl(int i);

    public int dm(int i) {
        return i;
    }

    public abstract Object dn(ml mlVar);

    public abstract Object dp(ml mlVar);

    public abstract al dr(int i);

    public float dt() {
        return -1.0f;
    }

    public abstract Object du(ml mlVar);

    public float dv() {
        return -1.0f;
    }

    public abstract String eb(String str, String str2);

    public abstract void ec(boolean z);

    public abstract void ed(String str, String str2);

    public abstract boolean ee(String str, boolean z);

    public abstract void ef(String[] strArr);

    public abstract void eg(String str, boolean z);

    public abstract void eh(boolean z);

    public abstract boolean el(String str, boolean z);

    public abstract int em(String str, int i);

    public abstract void en(Runnable runnable);

    public abstract void eo();

    public abstract String ep(String str, String str2);

    public abstract void eq();

    public abstract void er(String str, int i);

    public abstract void et();

    public abstract boolean eu(String str, boolean z);

    public abstract String ev(String str, String str2);

    public abstract boolean ew(String str, boolean z);

    public abstract void ey(Runnable runnable);

    public abstract void ez();

    public File fb() {
        return new File(az((byte) -2));
    }

    public File fc(String str, String str2, int i) {
        return new File(az((byte) -115));
    }

    public File fe(int i) {
        return new File(az((byte) -22), ax);
    }

    public File fg(String str, String str2, int i, byte b) {
        try {
            return new File(az((byte) -30));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.fg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void fh(String str, String str2);

    public File fi(int i, int i2) {
        try {
            return new File(az((byte) -10), ax);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.fi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public File fj(int i) {
        try {
            return new File(az((byte) -96));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.fj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fk(int i) {
        try {
            return this.an;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.fk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fl(byte b) {
        try {
            return this.ab;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.fl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void fm(String str, String str2);

    public abstract aa fn();

    public File fo() {
        return new File(az((byte) -123));
    }

    public File fp() {
        return new File(az((byte) -74));
    }

    public abstract void fq(String str, String str2, String str3);

    public abstract void fs(String str, String str2);

    public abstract aa ft();

    public File fu(String str, String str2, int i) {
        return new File(az((byte) -85));
    }

    public abstract aa fw();

    public abstract void fx(String str, String str2, String str3);

    public boolean ga() {
        return this.an;
    }

    public boolean gb() {
        return this.an;
    }

    public void gc(int i) {
        try {
            bq("mglwnafh", true, -486851409);
            this.an = true;
            if (this.af != null) {
                this.af.au((byte) -1);
                this.af.az(1121295864);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.gc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void gd() {
    }

    public void ge(int i) {
    }

    public boolean gf() {
        return true;
    }

    public boolean gg() {
        return true;
    }

    public boolean gh(byte b) {
        try {
            return this.ah != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.gh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void gi(int i) {
        try {
            String str = (String) ao(ml.ar, 668381185);
            if (str != null) {
                bc("Software Licence", str, (byte) -56);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.gi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean gj() {
        return this.an;
    }

    public void gk() {
        bq("mglwnafh", true, 117036354);
        this.an = true;
        if (this.af != null) {
            this.af.au((byte) -1);
            this.af.az(1121295864);
        }
    }

    public void gl(int i) {
        try {
            if (this.ah != null) {
                this.ah.aj((byte) -73);
                this.ah = null;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.gl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void gm() {
        bq("mglwnafh", true, 1926711401);
        this.an = true;
        if (this.af != null) {
            this.af.au((byte) -1);
            this.af.az(1121295864);
        }
    }

    public String gn(String str, int i) {
        try {
            if (str.contains("?m=") || str.contains("&m=")) {
                return str;
            }
            boolean contains = str.contains("?");
            boolean bl = bl(ft.aw, false, -1578394982);
            StringBuilder stringBuilder;
            if (contains) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(bl ? "&m=1" : "&m=0");
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(bl ? "?m=1" : "?m=0");
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("lp.gn(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public al go(int i) {
        try {
            return this.ah;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.go(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void gp(int i) {
    }

    public boolean gq() {
        return true;
    }

    public boolean gr() {
        return this.an;
    }

    public void gs(String str, int i) {
        try {
            gu(str, null, -1916571769);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.gs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean gt() {
        return this.an;
    }

    /* Access modifiers changed, original: 0000 */
    public void gu(String str, Map map, int i) {
        try {
            if (this.af != null) {
                this.af.ah(str, map, 1377457847);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.gu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public lu gv(int i) {
        try {
            return this.ay;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lp.gv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean gw(int i) {
        return true;
    }

    public void gx() {
    }

    public void gy() {
    }

    public boolean gz() {
        return this.ab;
    }

    public String ha(String str) {
        if (str.contains("?m=") || str.contains("&m=")) {
            return str;
        }
        StringBuilder stringBuilder;
        String str2;
        boolean contains = str.contains("?");
        boolean bl = bl(ft.aw, false, -523479695);
        if (contains) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str2 = bl ? "&m=1" : "&m=0";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str2 = bl ? "?m=1" : "?m=0";
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public void hb() {
    }

    public void hc() {
        if (this.ah != null) {
            this.ah.aj((byte) 34);
            this.ah = null;
        }
    }

    public al hd() {
        return this.ah;
    }

    public String he(String str) {
        if (str.contains("?m=") || str.contains("&m=")) {
            return str;
        }
        StringBuilder stringBuilder;
        String str2;
        boolean contains = str.contains("?");
        boolean bl = bl(ft.aw, false, -932263052);
        if (contains) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str2 = bl ? "&m=1" : "&m=0";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str2 = bl ? "?m=1" : "?m=0";
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public al hf() {
        return this.ah;
    }

    public void hg() {
        if (this.ah != null) {
            this.ah.aj((byte) -10);
            this.ah = null;
        }
    }

    public boolean hh() {
        return this.ah != null;
    }

    public void hi() {
        String str = (String) ao(ml.ar, 1994590752);
        if (str != null) {
            bc("Software Licence", str, (byte) -46);
        }
    }

    public boolean hk() {
        return this.ah != null;
    }

    /* Access modifiers changed, original: 0000 */
    public void hm(String str, Map map) {
        if (this.af != null) {
            this.af.ah(str, map, 1740074023);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ho(String str, Map map) {
        if (this.af != null) {
            this.af.ah(str, map, -1985582088);
        }
    }

    public void hp() {
        if (this.ah != null) {
            this.ah.aj((byte) 22);
            this.ah = null;
        }
    }

    public al hq() {
        return this.ah;
    }

    public void hr() {
        if (this.ah != null) {
            this.ah.aj((byte) 49);
            this.ah = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void hs(String str, Map map) {
        if (this.af != null) {
            this.af.ah(str, map, 1913514111);
        }
    }

    public boolean ht() {
        return this.ah != null;
    }

    public void hu() {
        String str = (String) ao(ml.ar, 1934290314);
        if (str != null) {
            bc("Software Licence", str, (byte) -35);
        }
    }

    public lu hv() {
        return this.ay;
    }

    /* Access modifiers changed, original: 0000 */
    public void hw(String str, Map map) {
        if (this.af != null) {
            this.af.ah(str, map, 615052819);
        }
    }

    public boolean hx() {
        return this.ah != null;
    }

    /* Access modifiers changed, original: 0000 */
    public void hz(String str, Map map) {
        if (this.af != null) {
            this.af.ah(str, map, -889168955);
        }
    }
}
