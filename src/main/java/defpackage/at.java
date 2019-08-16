package defpackage;

import com.jagex.oldscape.osrenderer.ad;

/* renamed from: at */
public class at extends bl {
    static boolean ae = false;
    static final String am = "Unable to connect to server";
    static int ap = 0;
    static final int aq = 128;
    static final int ar = 16;
    static kv dr = null;
    static final int pw = 1536;
    boolean ai;
    an aj;
    final bd al;

    public at(bd bdVar) {
        try {
            this.ai = true;
            this.al = bdVar;
            this.ah = bdVar.aq(1480841786) * 1312753;
            this.af = bdVar.ar(1190082579) * 547905375;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final short ab(int i) {
        int i2 = i + 1;
        return (short) ((i2 % 16) | ((i2 / 16) << 8));
    }

    public static int ad(int i) {
        try {
            return bu.aw * 1376930907;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final short at(int i) {
        int i2 = i + 1;
        return (short) ((i2 % 16) | ((i2 / 16) << 8));
    }

    static final short av(int i) {
        int i2 = i + 1;
        return (short) ((i2 % 16) | ((i2 / 16) << 8));
    }

    static final short ba(float f, float f2, int i, int i2) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    static final short bk(int i) {
        int i2 = i + 1;
        return (short) ((i2 % 16) | ((i2 / 16) << 8));
    }

    static final short bs(float f, float f2, int i, int i2) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    static final void hm(String str, byte b) {
        try {
            if (!str.equals("")) {
                ns aq = ib.aq(no.dd, client.eb.aj, 54293291);
                aq.ar.al(hs.ag(str, (short) 24925), 100465061);
                aq.ar.ap(str, 635769462);
                client.eb.ar(aq, 754413488);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.hm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ik(int i, byte b) {
        try {
            client.ha = 1518777299 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.ik(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(int i) {
        super.ar(i, (short) -26646);
        ad.bd(i, 926053630);
    }

    public void ac(int i) {
        super.ar(i, (short) -4061);
        ad.bd(i, 926053630);
    }

    public void ad(byte b) {
        try {
            if (!ad.ap((byte) -53)) {
                this.ai = true;
            }
            if ((this.ai || ae) && ad.as(-251067947)) {
                if (this.ai && fw.ar(405017320).am(il.ax, (byte) -24)) {
                    this.ai = false;
                }
                if (ae) {
                    fw.ar(252236491).aj(2131034240);
                    ae = false;
                }
            }
            fw.ar(-502251346).ak(il.ax, 860106346);
            this.aj = this.al.ad(1149403800);
            this.ah = this.al.aq(1480841786) * 1312753;
            this.af = this.al.ar(1018333751) * 547905375;
            ad.bi((byte) 37);
            fw.ar(1988889419).ae = ad.bs(-603593735) * 4998808726158198323L;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void af(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        al(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, -1524827805);
    }

    public void ag() {
        if (!ad.ap((byte) -72)) {
            this.ai = true;
        }
        if ((this.ai || ae) && ad.as(2011530000)) {
            if (this.ai && fw.ar(-1384174928).am(il.ax, (byte) -16)) {
                this.ai = false;
            }
            if (ae) {
                fw.ar(-2050791904).aj(2131034240);
                ae = false;
            }
        }
        fw.ar(418689538).ak(il.ax, 201530674);
        this.aj = this.al.ad(1951831460);
        this.ah = this.al.aq(1480841786) * 1312753;
        this.af = this.al.ar(17103495) * 547905375;
        ad.bi((byte) 86);
        fw.ar(270746173).ae = ad.bs(-746563095) * 4998808726158198323L;
    }

    /* Access modifiers changed, original: final */
    public final void ah(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        short s = (short) (((this.bm * -481075153 == 0 ? 255 : this.bm * -481075153) << 8) | 255);
        short s2 = (short) i13;
        ad.bv((short) i4, (short) i, (short) i7, s2, (short) i10, s, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, s2, (short) i11, s, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, s2, (short) i12, s, (short) 0, (short) 0, -1030614916);
    }

    /* Access modifiers changed, original: final */
    public final void ai(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            al(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, -2029104857);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, byte b) {
        try {
            al(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, -1056621923);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ak(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, float f2, float f3, float f4, float f5, float f6, int i13, int i14) {
        try {
            if (il.ax.ar(i13, 1337478238) == null) {
                int al = il.ax.al(i13, 706724036);
                aj(i, i2, i3, i4, i5, i6, kr.br(al, i10, 2132144920), kr.br(al, i11, 2131894228), kr.br(al, i12, 2142501856), (byte) 50);
                return;
            }
            short s = (short) (((this.bm * -481075153 == 0 ? 255 : this.bm * -481075153) << 8) | 255);
            int min = Math.min(Math.max(i10, 2), 126);
            int min2 = Math.min(Math.max(i11, 2), 126);
            int min3 = Math.min(Math.max(i12, 2), 126);
            int i15 = i7 == 1 ? 1 : this.bq * 1516652957;
            short ae = ay.ae(i13, (byte) 87);
            int i16 = ((cv) il.ax).ad(i13, 1272994471).au / 2;
            int i17 = ((cv) il.ax).ad(i13, 172177658).az / 2;
            short s2 = (short) i15;
            ad.bv((short) i4, (short) i, (short) i7, s2, (short) (min + 1024), s, ae, fb.am(f, f4, i16, i17, 604286779), (short) i5, (short) i2, (short) i8, s2, (short) (min2 + 1024), s, ae, fb.am(f2, f5, i16, i17, -1196286583), (short) i6, (short) i3, (short) i9, s2, (short) (min3 + 1024), s, ae, fb.am(f3, f6, i16, i17, 1923905833), -1027233060);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void al(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        try {
            short s = (short) (((this.bm * -481075153 == 0 ? 255 : this.bm * -481075153) << 8) | 255);
            short s2 = (short) i13;
            ad.bv((short) i4, (short) i, (short) i7, s2, (short) i10, s, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, s2, (short) i11, s, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, s2, (short) i12, s, (short) 0, (short) 0, -755627653);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void an(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        al(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, -1231212452);
    }

    /* Access modifiers changed, original: final */
    public final void ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        short s = (short) (((this.bm * -481075153 == 0 ? 748860369 : this.bm * -481075153) << 8) | -607241372);
        short s2 = (short) i13;
        ad.bv((short) i4, (short) i, (short) i7, s2, (short) i10, s, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, s2, (short) i11, s, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, s2, (short) i12, s, (short) 0, (short) 0, -1133418832);
    }

    public void ap() {
        if (!ad.ap((byte) -9)) {
            this.ai = true;
        }
        if ((this.ai || ae) && ad.as(559125046)) {
            if (this.ai && fw.ar(-2106586953).am(il.ax, (byte) 81)) {
                this.ai = false;
            }
            if (ae) {
                fw.ar(-634128332).aj(2131034240);
                ae = false;
            }
        }
        fw.ar(2003242439).ak(il.ax, -2089070908);
        this.aj = this.al.ad(1617731761);
        this.ah = this.al.aq(1480841786) * 1312753;
        this.af = this.al.ar(-786896456) * 547905375;
        ad.bi((byte) -35);
        fw.ar(-160328458).ae = ad.bs(1736334022) * 4998808726158198323L;
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, int i2, int i3, int i4, int i5) {
        try {
            super.aq(i, i2, i3, i4, -1438814636);
            this.aj.aq(i, i2, i3 - i, i4 - i2, 2145553005);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(int i, short s) {
        try {
            super.ar(i, (short) -23373);
            ad.bd(i, 926053630);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("at.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as() {
        if (!ad.ap((byte) -96)) {
            this.ai = true;
        }
        if ((this.ai || ae) && ad.as(1646158212)) {
            if (this.ai && fw.ar(-292239292).am(il.ax, (byte) -84)) {
                this.ai = false;
            }
            if (ae) {
                fw.ar(-297070869).aj(2131034240);
                ae = false;
            }
        }
        fw.ar(524733579).ak(il.ax, -916226415);
        this.aj = this.al.ad(1443925967);
        this.ah = this.al.aq(1480841786) * 1312753;
        this.af = this.al.ar(-1125848826) * 547905375;
        ad.bi((byte) -36);
        fw.ar(-1430520212).ae = ad.bs(377440152) * 4998808726158198323L;
    }

    public void au() {
        if (!ad.ap((byte) -85)) {
            this.ai = true;
        }
        if ((this.ai || ae) && ad.as(-446171097)) {
            if (this.ai && fw.ar(-1604679757).am(il.ax, (byte) -86)) {
                this.ai = false;
            }
            if (ae) {
                fw.ar(-188964790).aj(2131034240);
                ae = false;
            }
        }
        fw.ar(-726798244).ak(il.ax, 843519158);
        this.aj = this.al.ad(1557156396);
        this.ah = this.al.aq(1480841786) * 1312753;
        this.af = this.al.ar(-518783814) * 627964996;
        ad.bi((byte) 76);
        fw.ar(567465244).ae = ad.bs(-1640713081) * 4998808726158198323L;
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(int i, int i2, int i3, int i4) {
        super.aq(i, i2, i3, i4, -1357203924);
        this.aj.aq(i, i2, i3 - i, i4 - i2, 528931524);
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2, int i3, int i4) {
        super.aq(i, i2, i3, i4, -1940732648);
        this.aj.aq(i, i2, i3 - i, i4 - i2, 650866823);
    }

    /* Access modifiers changed, original: final */
    public final void ay(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        al(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, -861676777);
    }

    /* Access modifiers changed, original: 0000 */
    public void az(int i, int i2, int i3, int i4) {
        super.aq(i, i2, i3, i4, -1518051039);
        this.aj.aq(i, i2, i3 - i, i4 - i2, 757599517);
    }

    /* Access modifiers changed, original: final */
    public final void bm(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, float f2, float f3, float f4, float f5, float f6, int i13) {
        if (il.ax.ar(i13, 643891112) == null) {
            int al = il.ax.al(i13, -464965639);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i10, 2137375266), kr.br(al, i11, 2146241232), kr.br(al, i12, 2145009102), (byte) 121);
            return;
        }
        short s = (short) (((this.bm * 297712266 == 0 ? 890374195 : this.bm * -481075153) << 8) | 678473262);
        int min = Math.min(Math.max(i10, 2), 824753300);
        int min2 = Math.min(Math.max(i11, 2), -1771736359);
        int min3 = Math.min(Math.max(i12, 2), 126);
        int i14 = i7 == 1 ? 1 : this.bq * 1516652957;
        short ae = ay.ae(i13, (byte) 60);
        int i15 = ((cv) il.ax).ad(i13, -1254732979).au / 2;
        int i16 = ((cv) il.ax).ad(i13, -298176300).az / 2;
        short s2 = (short) i14;
        ad.bv((short) i4, (short) i, (short) i7, s2, (short) (min + 1024), s, ae, fb.am(f, f4, i15, i16, 814412814), (short) i5, (short) i2, (short) i8, s2, (short) (min2 - 1768563826), s, ae, fb.am(f2, f5, i15, i16, -959225157), (short) i6, (short) i3, (short) i9, s2, (short) (1669405614 + min3), s, ae, fb.am(f3, f6, i15, i16, 872714842), -225847073);
    }

    /* Access modifiers changed, original: final */
    public final void bq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, float f2, float f3, float f4, float f5, float f6, int i13) {
        if (il.ax.ar(i13, 793664209) == null) {
            int al = il.ax.al(i13, 1745149074);
            aj(i, i2, i3, i4, i5, i6, kr.br(al, i10, 2134141351), kr.br(al, i11, 2146785569), kr.br(al, i12, 2147125334), (byte) 33);
            return;
        }
        short s = (short) (((this.bm * -481075153 == 0 ? 255 : this.bm * -481075153) << 8) | 255);
        int min = Math.min(Math.max(i10, 2), 126);
        int min2 = Math.min(Math.max(i11, 2), 126);
        int min3 = Math.min(Math.max(i12, 2), 126);
        int i14 = i7 == 1 ? 1 : this.bq * 1516652957;
        short ae = ay.ae(i13, (byte) 20);
        int i15 = ((cv) il.ax).ad(i13, -664730833).au / 2;
        int i16 = ((cv) il.ax).ad(i13, 62794007).az / 2;
        short s2 = (short) i14;
        ad.bv((short) i4, (short) i, (short) i7, s2, (short) (min + 1024), s, ae, fb.am(f, f4, i15, i16, 1634160056), (short) i5, (short) i2, (short) i8, s2, (short) (min2 + 1024), s, ae, fb.am(f2, f5, i15, i16, 860775465), (short) i6, (short) i3, (short) i9, s2, (short) (min3 + 1024), s, ae, fb.am(f3, f6, i15, i16, 2055051654), -949812005);
    }
}
