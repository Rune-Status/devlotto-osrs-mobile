package defpackage;

import java.util.Collection;

/* renamed from: ap */
public class ap {
    public static final int ad = 0;
    public static final int ae = 6;
    public static final int ai = 5;
    public static final int aj = 4;
    public static final int al = 3;
    public static final int aq = 1;
    public static final int ar = 2;
    static final String au = "Automatically retrying in %s...";
    final int ak;
    final String am;

    public ap(String str, int i) {
        try {
            this.am = str;
            this.ak = -461219579 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ap.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ay(Collection collection, int i) {
        try {
            collection.add(dh.ap);
            collection.add(dh.au);
            collection.add(dh.az);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ap.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void iw(int i, int i2, int i3, boolean z, byte b) {
        try {
            ns aq = ib.aq(no.ce, client.eb.aj, 2072315660);
            aq.ar.cs(z ? client.hl * -1917984551 : 0, 1465770985);
            aq.ar.cm(i2, (byte) -43);
            aq.ar.bh(i3, (byte) 80);
            aq.ar.aj(i, 992631509);
            client.eb.ar(aq, -1015262965);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ap.iw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.ak * -1233810483;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ap.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String ae() {
        return this.am;
    }

    public String ai() {
        return this.am;
    }

    public int aj() {
        return this.ak * -1233810483;
    }

    public int al() {
        return this.ak * 122914811;
    }

    public String am() {
        return this.am;
    }

    public String aq(int i) {
        try {
            return this.am;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ap.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ar() {
        return this.ak * -1233810483;
    }
}
