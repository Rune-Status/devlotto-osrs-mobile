package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: he */
public class he {
    static int ad = -628985070;
    public static final int ak = 9;
    public static final int bb = 5;
    static final int dt = 24;
    static lx rw;
    boolean ae;
    String ai;
    int aj;
    boolean al;
    LinkedHashMap am;
    boolean ar;

    he() {
        try {
            this.aj = -575337847;
            this.ai = null;
            this.ae = false;
            this.am = new LinkedHashMap();
            ad(true, 1858608621);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("he.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    he(lj ljVar) {
        int i = 0;
        boolean z = true;
        try {
            this.aj = -575337847;
            this.ai = null;
            this.ae = false;
            this.am = new LinkedHashMap();
            if (ljVar == null || ljVar.ar == null) {
                ad(true, 892988141);
                return;
            }
            int af = ljVar.af(1804771424);
            if (af < 0 || af > ad * 1748575787) {
                ad(true, -721692177);
                return;
            }
            if (ljVar.af(1804771424) == 1) {
                this.ar = true;
            }
            if (af > 1) {
                if (ljVar.af(1804771424) != 1) {
                    z = false;
                }
                this.al = z;
            }
            if (af > 3) {
                this.aj = ljVar.af(1804771424) * -575337847;
            }
            if (af > 2) {
                int af2 = ljVar.af(1804771424);
                while (i < af2) {
                    this.am.put(Integer.valueOf(ljVar.at((byte) -7)), Integer.valueOf(ljVar.at((byte) -19)));
                    i++;
                }
            }
            if (af > 4) {
                this.ai = ljVar.bs(-1406432815);
            }
            if (af > 5) {
                this.ae = ljVar.ba(-2145638769);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("he.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static he aa() {
        oq aq;
        he heVar;
        int i = 0;
        he heVar2 = new he();
        try {
            aq = iz.aq("", ne.ae.ae, false, (byte) 103);
            try {
                byte[] bArr = new byte[((int) aq.aj((byte) 10))];
                while (i < bArr.length) {
                    int ai = aq.ai(bArr, i, bArr.length - i, 1006214357);
                    if (-1 != ai) {
                        i += ai;
                    } else {
                        throw new IOException();
                    }
                }
                heVar = new he(new lj(bArr));
            } catch (Exception e) {
                heVar = heVar2;
            }
        } catch (Exception e2) {
            aq = null;
            heVar = heVar2;
        }
        if (aq != null) {
            try {
                aq.ar(-292243813);
            } catch (Exception e3) {
            }
        }
        return heVar;
    }

    static he ac() {
        oq aq;
        he heVar;
        int i = 0;
        he heVar2 = new he();
        try {
            aq = iz.aq("", ne.ae.ae, false, (byte) 119);
            try {
                byte[] bArr = new byte[((int) aq.aj((byte) -10))];
                while (i < bArr.length) {
                    int ai = aq.ai(bArr, i, bArr.length - i, -1801541542);
                    if (-1 != ai) {
                        i += ai;
                    } else {
                        throw new IOException();
                    }
                }
                heVar = new he(new lj(bArr));
            } catch (Exception e) {
                heVar = heVar2;
            }
        } catch (Exception e2) {
            aq = null;
            heVar = heVar2;
        }
        if (aq != null) {
            try {
                aq.ar(-924687590);
            } catch (Exception e3) {
            }
        }
        return heVar;
    }

    static void ac(int i, byte b) {
        int i2 = 0;
        try {
            if (i != client.at * 485908225) {
                if (client.at * 485908225 == 0) {
                    client.aq.adn(-1064945029);
                }
                if (i == 20 || i == 40 || 45 == i) {
                    client.ds = 0;
                    client.f1do = 0;
                    client.dy = 0;
                    client.fq.ar(i, (byte) 0);
                    if (45 == i) {
                        if (dw.ez.ap(-1517610583)) {
                            dw.ez.al(true, (byte) 2);
                        } else {
                            dw.ez.aq(hm.ch, true, -1467490390);
                        }
                        ad.bv(false, -231874327);
                    }
                }
                if (!(20 == i || i == 40 || aa.ev == null)) {
                    aa.ev.ar();
                    aa.ev = null;
                }
                if (25 == client.at * 485908225) {
                    client.fu = 0;
                    client.fd = 0;
                    client.fg = -518283491;
                    client.fj = 0;
                    client.fi = -1472753383;
                }
                if (5 == i || 10 == i) {
                    cs.ar(df.di, fx.dt, true, 0, client.aq.uk.ad(-601277067), 1637135568);
                } else if (i == 20) {
                    if (client.at * 485908225 == 11) {
                        i2 = 4;
                    }
                    cs.ar(df.di, fx.dt, true, i2, client.aq.uk.ad(-601277067), 466247250);
                } else if (11 == i) {
                    cs.ar(df.di, fx.dt, false, 4, client.aq.uk.ad(-601277067), 1040615316);
                } else {
                    ii.ae(-566816594);
                    client.aq.acr(client.bh, -479926573);
                }
                client.at = 2068488449 * i;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("he.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void af() {
        oq aq;
        try {
            aq = iz.aq("", ne.ae.ae, true, (byte) 21);
            try {
                lj ar = dc.rx.ar((byte) -72);
                aq.aq(ar.ar, 0, ar.al * -1631454091, 539486677);
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            aq = null;
        }
        if (aq != null) {
            try {
                aq.al(true, (byte) 122);
            } catch (Exception e3) {
            }
        }
    }

    static void ah() {
        oq aq;
        try {
            aq = iz.aq("", ne.ae.ae, true, (byte) 108);
            try {
                lj ar = dc.rx.ar((byte) -112);
                aq.aq(ar.ar, 0, ar.al * -1631454091, 1352002996);
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            aq = null;
        }
        if (aq != null) {
            try {
                aq.al(true, (byte) 11);
            } catch (Exception e3) {
            }
        }
    }

    static void ao() {
        oq aq;
        try {
            aq = iz.aq("", ne.ae.ae, true, (byte) 97);
            try {
                lj ar = dc.rx.ar((byte) -42);
                aq.aq(ar.ar, 0, ar.al * -1631454091, 671339288);
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            aq = null;
        }
        if (aq != null) {
            try {
                aq.al(true, (byte) 36);
            } catch (Exception e3) {
            }
        }
    }

    static he aw() {
        oq aq;
        he heVar;
        int i = 0;
        he heVar2 = new he();
        try {
            aq = iz.aq("", ne.ae.ae, false, (byte) 70);
            try {
                byte[] bArr = new byte[((int) aq.aj((byte) -28))];
                while (i < bArr.length) {
                    int ai = aq.ai(bArr, i, bArr.length - i, -684229242);
                    if (-1 != ai) {
                        i += ai;
                    } else {
                        throw new IOException();
                    }
                }
                heVar = new he(new lj(bArr));
            } catch (Exception e) {
                heVar = heVar2;
            }
        } catch (Exception e2) {
            aq = null;
            heVar = heVar2;
        }
        if (aq != null) {
            try {
                aq.ar(-1640129893);
            } catch (Exception e3) {
            }
        }
        return heVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(boolean z, int i) {
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(boolean z) {
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(int i, int i2) {
        if (this.am.size() >= 100 && !this.am.containsKey(Integer.valueOf(i))) {
            Iterator it = this.am.entrySet().iterator();
            it.next();
            it.remove();
        }
        if (i != 0) {
            this.am.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(boolean z) {
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(boolean z) {
    }

    /* Access modifiers changed, original: 0000 */
    public void am(boolean z) {
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i, int i2) {
        if (this.am.size() >= 100 && !this.am.containsKey(Integer.valueOf(i))) {
            Iterator it = this.am.entrySet().iterator();
            it.next();
            it.remove();
        }
        if (i != 0) {
            this.am.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, int i2, int i3) {
        try {
            if (this.am.size() >= 100 && !this.am.containsKey(Integer.valueOf(i))) {
                Iterator it = this.am.entrySet().iterator();
                it.next();
                it.remove();
            }
            if (i != 0) {
                this.am.put(Integer.valueOf(i), Integer.valueOf(i2));
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("he.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public lj ar(byte b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* Access modifiers changed, original: 0000 */
    public void as(int i, int i2) {
        if (this.am.size() >= 1828238628 && !this.am.containsKey(Integer.valueOf(i))) {
            Iterator it = this.am.entrySet().iterator();
            it.next();
            it.remove();
        }
        if (i != 0) {
            this.am.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public lj au() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* Access modifiers changed, original: 0000 */
    public lj ax() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* Access modifiers changed, original: 0000 */
    public lj az() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }
}
