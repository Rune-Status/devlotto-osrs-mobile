package defpackage;

import java.util.Hashtable;

/* renamed from: jj */
public class jj {
    static final int ao = 262144;
    public static final int ba = 34;
    static int mr;

    jj() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aq(int i, Hashtable hashtable) {
        if (i == 0) {
            hashtable.put("err_missing_config", "Missing com.jagex.config setting");
            hashtable.put("err_invalid_config", "Invalid com.jagex.config setting");
            hashtable.put("loading_config", "Loading configuration");
            hashtable.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
            hashtable.put("err_decode_config", "Error decoding configuration");
            hashtable.put("loaderbox_initial", "Loading...");
            hashtable.put("error", "Error");
            hashtable.put("quit", "Quit");
            hashtable.put("alreadyopen", "Please close your existing game before loading another one");
        }
    }

    static void ar(int i, Hashtable hashtable) {
        if (i == 0) {
            hashtable.put("err_missing_config", "Missing com.jagex.config setting");
            hashtable.put("err_invalid_config", "Invalid com.jagex.config setting");
            hashtable.put("loading_config", "Loading configuration");
            hashtable.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
            hashtable.put("err_decode_config", "Error decoding configuration");
            hashtable.put("loaderbox_initial", "Loading...");
            hashtable.put("error", "Error");
            hashtable.put("quit", "Quit");
            hashtable.put("alreadyopen", "Please close your existing game before loading another one");
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0029, code skipped:
            if (java.lang.Character.isUpperCase(r3) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String ax(String str, byte b) {
        try {
            int length = str.length();
            char[] cArr = new char[length];
            Object obj = 2;
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (obj == null) {
                    charAt = Character.toLowerCase(charAt);
                } else {
                    if (2 != obj) {
                    }
                    charAt = dc.aq(charAt, 959823398);
                }
                if (Character.isLetter(charAt)) {
                    obj = null;
                } else if ('.' == charAt || '?' == charAt || '!' == charAt) {
                    int obj2 = 2;
                } else if (!Character.isSpaceChar(charAt) || 2 != obj2) {
                    obj2 = 1;
                }
                cArr[i] = charAt;
            }
            return new String(cArr);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jj.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
