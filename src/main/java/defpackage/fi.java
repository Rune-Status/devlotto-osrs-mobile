package defpackage;

/* renamed from: fi */
public class fi {
    public static final int ad = 1;
    public static final int ae = 7;
    public static final int ai = 6;
    public static final int al = 4;
    public static final int ao = 19;
    public static final int aq = 2;
    public static final int ar = 3;
    public static final int av = 25;
    public static final int aw = 16;
    public static final int ay = 22;
    public static final int az = 14;
    static final int bs = 3;
    static final int cr = 21;
    static final int[] cs = new int[]{16, 17, 18, 19, 20, 21, 22, 1, 2, 3, 4, 5, 6, 1001, 7, 8, 9, 10, 11, 12, 13, 14, 15, 44, 45, 46, 47, 48, 49, 50, 51, 1002, 1004, 1003};
    static final int gx = 512;

    fi() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fi.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ad(kh khVar, kh khVar2, byte b) {
        int i = 0;
        try {
            if (khVar.av("titlewide.jpg", "", 196244615)) {
                i = 1;
            }
            if (khVar2.av("logo_osrs", "", -764687326)) {
                i++;
            }
            if (khVar2.av("logo_deadman_mode", "", -477081523)) {
                i++;
            }
            if (khVar2.av("titlebox", "", -1733778581)) {
                i++;
            }
            if (khVar2.av("titlebutton", "", -2071123506)) {
                i++;
            }
            if (khVar2.av("titlebutton_large", "", -1570865553)) {
                i++;
            }
            if (khVar2.av("play_now_text", "", -1466204631)) {
                i++;
            }
            if (khVar2.av("titlebutton_wide42,1", "", -112280200)) {
                i++;
            }
            if (khVar2.av("runes", "", -874268)) {
                i++;
            }
            if (khVar2.av("title_mute", "", -290393341)) {
                i++;
            }
            if (khVar2.av("options_radio_buttons,0", "", -1019929154)) {
                i++;
            }
            if (khVar2.av("options_radio_buttons,2", "", -1197188491)) {
                i++;
            }
            if (khVar2.av("options_radio_buttons,4", "", -2068401141)) {
                i++;
            }
            if (khVar2.av("options_radio_buttons,6", "", -1931084823)) {
                i++;
            }
            if (khVar2.av("login_icons", "", -149585429)) {
                i++;
            }
            khVar2.av("sl_back", "", -2024859657);
            khVar2.av("sl_flags", "", -480776325);
            khVar2.av("sl_arrows", "", -551265155);
            khVar2.av("sl_stars", "", -269383032);
            khVar2.av("sl_button", "", -614134227);
            return i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fi.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean aq(int i) {
        int[] iArr = cs;
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    static boolean ar(int i) {
        int[] iArr = cs;
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    static void bd(int i) {
        int i2 = 0;
        try {
            int i3;
            client.eb.ad(1738471329);
            client.eb.ai.al = 0;
            client.eb.ae = null;
            client.eb.ap = null;
            client.eb.au = null;
            client.eb.az = null;
            client.eb.am = 0;
            client.eb.as = 0;
            client.cm = 0;
            gc.km.bt(275322493);
            client.pk = 0;
            client.os = 0;
            for (i3 = 0; i3 < 2048; i3++) {
                client.jz[i3] = null;
            }
            da.jc = null;
            for (ih ihVar : client.eg) {
                if (ihVar != null) {
                    ihVar.cp = -260026025;
                    ihVar.ci = false;
                }
            }
            ix.ae(601581707);
            he.ac(30, (byte) 102);
            while (i2 < 100) {
                client.nk[i2] = true;
                i2++;
            }
            cx.cu(-1909765752);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fi.bd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
