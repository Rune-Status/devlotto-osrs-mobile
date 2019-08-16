package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.fm;
import defpackage.lp;
import defpackage.mv;
import java.util.ArrayList;
import java.util.List;

public class al {
    public static final int aj = 3;
    public static final int al = 2;
    public static final int aq = 0;
    public static final int ar = 1;
    final lp ae;
    public final ad ai;
    int ak;
    final List am;

    public al(lp lpVar) {
        try {
            this.ai = new ad();
            this.am = new ArrayList();
            this.ae = lpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(int i, int i2) {
        try {
            this.ak = 1598503443 * i;
            this.ae.bm(new ai(this, i), -1501512283);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ab(byte b) {
        try {
            synchronized (this.am) {
                for (int i = 0; i < this.am.size(); i++) {
                    if (((aq) this.am.get(i)).aj((byte) 79)) {
                        return i;
                    }
                }
                return -1;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ac() {
        this.ae.bm(new ak(this), 1576162776);
    }

    public void ad(int i) {
    }

    public void ae() {
    }

    public void af(fm fmVar, int i) {
        try {
            this.ai.ad(fmVar, 566976266);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ag() {
    }

    public void ah(aq aqVar, int i) {
        try {
            synchronized (this.am) {
                aqVar.bg(this.am.size(), (byte) 56);
                this.am.add(aqVar);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ai() {
    }

    public void aj(byte b) {
        try {
            this.ae.bm(new ak(this), 1806179329);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak() {
    }

    public void al(int i) {
    }

    public void am() {
    }

    public void an(int i, byte b) {
        try {
            this.ae.bm(new ar(this, i), -1193057884);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ao(int i) {
        try {
            return this.ak * 1512808475;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ap() {
    }

    public void aq(int i) {
    }

    public void ar(int i) {
    }

    public void as() {
    }

    public void at(String str, int i, int i2) {
        try {
            this.ae.bm(new aj(this, str, i), 1795911393);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void au() {
    }

    public void av(String str, int i) {
        try {
            at(str, 0, 1851888325);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aw() {
        this.ae.bm(new ak(this), 1272585537);
    }

    public void ax() {
    }

    public void ay(int i) {
        try {
            an(0, (byte) 65);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void az() {
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(int i, int i2, int i3) {
        try {
            this.ae.bm(new ae(this, i, i2), -834725611);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bb(fm fmVar) {
        this.ai.ad(fmVar, -1148845494);
    }

    public void bc() {
        an(0, (byte) 101);
    }

    public void bd(int i) {
        this.ak = 1346492161 * i;
        this.ae.bm(new ai(this, i), 1865477704);
    }

    public void be(int i) {
        this.ae.bm(new ar(this, i), -1025205526);
    }

    public void bf(aq aqVar) {
        synchronized (this.am) {
            aqVar.bg(this.am.size(), (byte) -55);
            this.am.add(aqVar);
        }
    }

    public void bg() {
        an(0, (byte) 57);
    }

    public int bh() {
        synchronized (this.am) {
            for (int i = 0; i < this.am.size(); i++) {
                if (((aq) this.am.get(i)).aj((byte) 19)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void bi(fm fmVar) {
        this.ai.ad(fmVar, -257433323);
    }

    public int bj() {
        synchronized (this.am) {
            for (int i = 0; i < this.am.size(); i++) {
                if (((aq) this.am.get(i)).aj((byte) 23)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void bk(int i, int i2) {
        try {
            ba(i, 0, 2005728532);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bl(aq aqVar) {
        synchronized (this.am) {
            aqVar.bg(this.am.size(), (byte) -2);
            this.am.add(aqVar);
        }
    }

    public void bm(int i) {
        this.ak = 1598503443 * i;
        this.ae.bm(new ai(this, i), 1096506325);
    }

    public int bn() {
        synchronized (this.am) {
            for (int i = 0; i < this.am.size(); i++) {
                if (((aq) this.am.get(i)).aj((byte) 82)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void bo(aq aqVar) {
        synchronized (this.am) {
            aqVar.bg(this.am.size(), (byte) -84);
            this.am.add(aqVar);
        }
    }

    public void bp(int i) {
        ba(i, 0, 1989326340);
    }

    public void bq(int i) {
        this.ak = 1598503443 * i;
        this.ae.bm(new ai(this, i), 297015452);
    }

    public void br(int i) {
        this.ae.bm(new ar(this, i), 789615656);
    }

    public void bs(int i) {
        try {
            this.ae.bm(new am(this), 273903119);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/al.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bt() {
        synchronized (this.am) {
            for (int i = 0; i < this.am.size(); i++) {
                if (((aq) this.am.get(i)).aj((byte) 49)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void bu(int i) {
        this.ae.bm(new ar(this, i), -869100799);
    }

    public void bv() {
        an(0, (byte) 13);
    }

    public void bw(int i) {
        this.ae.bm(new ar(this, i), -1231114042);
    }

    public void bx(int i) {
        this.ae.bm(new ar(this, i), -1743138504);
    }

    public void by(String str, int i) {
        this.ae.bm(new aj(this, str, i), -2026658194);
    }

    public void bz(String str) {
        at(str, 0, 1851888325);
    }

    public void cb() {
        this.ae.bm(new am(this), 1514415027);
    }

    public void ce() {
        this.ae.bm(new am(this), -1598043258);
    }

    public void ci() {
        this.ae.bm(new am(this), -2054126511);
    }

    public void cj(int i) {
        ba(i, 0, 997213807);
    }

    /* Access modifiers changed, original: 0000 */
    public void cm(int i, int i2) {
        this.ae.bm(new ae(this, i, i2), -2093307620);
    }

    /* Access modifiers changed, original: 0000 */
    public void cn(int i, int i2) {
        this.ae.bm(new ae(this, i, i2), -1006202121);
    }

    public void cp() {
        this.ae.bm(new am(this), 2134526861);
    }

    /* Access modifiers changed, original: 0000 */
    public void cq(int i, int i2) {
        this.ae.bm(new ae(this, i, i2), -1291197211);
    }

    public void cv(int i) {
        ba(i, 0, 929258777);
    }

    /* Access modifiers changed, original: 0000 */
    public void cw(int i, int i2) {
        this.ae.bm(new ae(this, i, i2), 1146468807);
    }
}
