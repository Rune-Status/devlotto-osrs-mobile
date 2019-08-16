package defpackage;

import java.util.Locale;

@lc
@lg
/* renamed from: lz */
public class lz implements lk {
    public static final lz ad = new lz("EN", "en", "English", lh.ad, 0, "GB");
    static final lz ae = new lz("ES_MX", "es-mx", "Spanish (Latin American)", lh.ad, 6, "MX");
    static final lz[] ag;
    public static final lz ai = new lz("ES", "es", "Spanish", lh.al, 5, "ES");
    static final lz aj = new lz("NL", "nl", "Dutch", lh.al, 4, "NL");
    static final lz al = new lz("PT", "pt", "Portuguese", lh.ad, 3, "BR");
    static final lz aq = new lz("DE", "de", "German", lh.ad, 1, "DE");
    public static final lz ar = new lz("FR", "fr", "French", lh.ad, 2, "FR");
    static boolean mu;
    final String ak;
    final String am;
    final int as;

    static {
        int i = 0;
        lz[] aq = lz.aq(1723551982);
        ag = new lz[aq.length];
        while (i < aq.length) {
            lz lzVar = aq[i];
            if (ag[lzVar.as * 725029339] == null) {
                ag[lzVar.as * 725029339] = lzVar;
                i++;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    lz(String str, String str2, String str3, lh lhVar, int i, String str4) {
        try {
            this.am = str;
            this.ak = str2;
            this.as = 545030739 * i;
            Locale locale;
            if (str4 != null) {
                locale = new Locale(str2.substring(0, 2), str4);
            } else {
                locale = new Locale(str2.substring(0, 2));
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, int i) {
        try {
            et.ad = khVar;
            et.aq = khVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static lz ae(int i, short s) {
        if (i >= 0) {
            try {
                if (i < ag.length) {
                    return ag[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lz.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return null;
    }

    public static lz ag(int i) {
        return (i < 0 || i >= ag.length) ? null : ag[i];
    }

    public static lz ak(int i) {
        return (i < 0 || i >= ag.length) ? null : ag[i];
    }

    static lz[] aq(int i) {
        try {
            lz lzVar = ar;
            lz lzVar2 = aq;
            lz lzVar3 = ad;
            lz lzVar4 = ai;
            lz lzVar5 = aj;
            lz lzVar6 = al;
            lz lzVar7 = ae;
            return new lz[]{lzVar, lzVar2, lzVar3, lzVar4, lzVar5, lzVar6, lzVar7};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static lz as(int i) {
        return (i < 0 || i >= ag.length) ? null : ag[i];
    }

    static final void da(int i) {
        try {
            id idVar = (id) client.kg.ae();
            while (idVar != null) {
                if (am.jy * 1973701849 != idVar.ar * 1190581209 || idVar.as) {
                    idVar.ky();
                } else if (client.bj * 2133672263 >= idVar.aq * 636405383) {
                    idVar.ad(client.gi * 1546702779, -948048024);
                    if (idVar.as) {
                        idVar.ky();
                    } else {
                        ce.fk.ap(idVar.ar * 1190581209, 1408463553 * idVar.al, -1722424919 * idVar.aj, -962871403 * idVar.ai, 60, idVar, 0, -1, false);
                    }
                }
                idVar = (id) client.kg.ak();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.da(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int dc(int i) {
        try {
            return dc.rx.ar ? am.jy * 1973701849 : (nh.dg(ep.hp * 1722134867, cc.hg * -91971475, am.jy * 1973701849, -1259576960) - (fj.hc * 1470433239) >= 800 || (in.aq[am.jy * 1973701849][(ep.hp * 1722134867) >> 7][(cc.hg * -91971475) >> 7] & 4) == 0) ? 3 : am.jy * 1973701849;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.dc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void gr(al alVar, byte b) {
        try {
            if (client.mi == null && !gc.km.cv((byte) -66)) {
                client.bh.ao = true;
                client.mi = alVar;
                mu = true;
                jj.mr = alVar.bg * 124826507;
                ho.mj = alVar.bx * 630438017;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.gr(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.as * 725029339;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.as * 725029339;
    }

    public int aj() {
        return this.as * -1414534428;
    }

    public int al() {
        return this.as * 725029339;
    }

    /* Access modifiers changed, original: 0000 */
    public String am() {
        return this.ak;
    }

    /* Access modifiers changed, original: 0000 */
    public String ar(int i) {
        try {
            return this.ak;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String fa() {
        return ar(1175237163).toLowerCase(Locale.ENGLISH);
    }

    public String fd() {
        return ar(1974631678).toLowerCase(Locale.ENGLISH);
    }

    public String fv() {
        return ar(1396900053).toLowerCase(Locale.ENGLISH);
    }

    public String fz() {
        return ar(2093765755).toLowerCase(Locale.ENGLISH);
    }

    public String toString() {
        try {
            return ar(1128546894).toLowerCase(Locale.ENGLISH);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lz.toString(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
