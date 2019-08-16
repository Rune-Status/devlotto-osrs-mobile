package defpackage;

/* renamed from: az */
public class az {
    static final int ac = 1170;
    static ef[] gs;
    public static int ke;
    static ef ut;
    final boolean ad;

    public az(boolean z) {
        try {
            this.ad = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("az.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void eg(int i) {
        try {
            iw iwVar = (iw) client.kh.ae();
            while (iwVar != null) {
                if (iwVar.ap * -1874610465 > 0) {
                    iwVar.ap -= 1452639519;
                }
                if (iwVar.ap * -1874610465 != 0) {
                    if (iwVar.ag * 1199426141 > 0) {
                        iwVar.ag -= 941578741;
                    }
                    if (iwVar.ag * 1199426141 == 0 && iwVar.ar * -222192123 >= 1 && iwVar.al * -1360125291 >= 1 && iwVar.ar * -222192123 <= 102 && iwVar.al * -1360125291 <= 102 && (iwVar.am * 374957319 < 0 || cl.ay(iwVar.am * 374957319, iwVar.as * 893119185, -714439650))) {
                        gl.ed(iwVar.ad * -110986715, iwVar.aq * -469654451, iwVar.ar * -222192123, iwVar.al * -1360125291, iwVar.am * 374957319, iwVar.ak * -1751252443, iwVar.as * 893119185, 633021611);
                        iwVar.ag = -941578741;
                        if (iwVar.am * 374957319 == iwVar.aj * -1496430321 && iwVar.aj * -1496430321 == -1) {
                            iwVar.ky();
                        } else if (iwVar.am * 374957319 == iwVar.aj * -1496430321 && iwVar.ak * -1751252443 == iwVar.ai * 1747153281 && iwVar.ae * -963675785 == iwVar.as * 893119185) {
                            iwVar.ky();
                        }
                    }
                } else if (iwVar.aj * -1496430321 < 0 || cl.ay(iwVar.aj * -1496430321, iwVar.ae * -963675785, -492233653)) {
                    gl.ed(iwVar.ad * -110986715, iwVar.aq * -469654451, iwVar.ar * -222192123, iwVar.al * -1360125291, iwVar.aj * -1496430321, iwVar.ai * 1747153281, iwVar.ae * -963675785, -258878596);
                    iwVar.ky();
                }
                iwVar = (iw) client.kh.ak();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("az.eg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ad(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("az.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean al() {
        return this.ad;
    }

    public boolean aq() {
        return this.ad;
    }

    public boolean ar() {
        return this.ad;
    }
}
