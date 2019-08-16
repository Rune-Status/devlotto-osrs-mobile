package defpackage;

import java.util.HashMap;
import java.util.Hashtable;

/* renamed from: lr */
public class lr {
    public static final int ae = 6;
    static final int fz = 22;
    kh ad;
    kh aq;
    HashMap ar;

    public lr(kh khVar, kh khVar2) {
        try {
            this.ad = khVar;
            this.aq = khVar2;
            this.ar = new HashMap();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lr.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ad(int i, Hashtable hashtable, int i2) {
        if (i == 0) {
            try {
                hashtable.put("err_missing_config", "Missing com.jagex.config setting");
                hashtable.put("err_invalid_config", "Invalid com.jagex.config setting");
                hashtable.put("loading_config", "Loading configuration");
                hashtable.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
                hashtable.put("err_decode_config", "Error decoding configuration");
                hashtable.put("loaderbox_initial", "Loading...");
                hashtable.put("error", "Error");
                hashtable.put("quit", "Quit");
                hashtable.put("alreadyopen", "Please close your existing game before loading another one");
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lr.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public static int au(long j) {
        return (int) ((j >>> 17) & 4294967295L);
    }

    public HashMap ad(lq[] lqVarArr, int i) {
        try {
            HashMap hashMap = new HashMap();
            for (Object obj : lqVarArr) {
                if (this.ar.containsKey(obj)) {
                    hashMap.put(obj, this.ar.get(obj));
                } else {
                    oi ag = ay.ag(this.ad, this.aq, obj.ae, "", -1787825489);
                    if (ag != null) {
                        this.ar.put(obj, ag);
                        hashMap.put(obj, ag);
                    }
                }
            }
            return hashMap;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lr.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public HashMap aq(lq[] lqVarArr) {
        HashMap hashMap = new HashMap();
        for (Object obj : lqVarArr) {
            if (this.ar.containsKey(obj)) {
                hashMap.put(obj, this.ar.get(obj));
            } else {
                oi ag = ay.ag(this.ad, this.aq, obj.ae, "", -2124903687);
                if (ag != null) {
                    this.ar.put(obj, ag);
                    hashMap.put(obj, ag);
                }
            }
        }
        return hashMap;
    }

    public HashMap ar(lq[] lqVarArr) {
        HashMap hashMap = new HashMap();
        for (Object obj : lqVarArr) {
            if (this.ar.containsKey(obj)) {
                hashMap.put(obj, this.ar.get(obj));
            } else {
                oi ag = ay.ag(this.ad, this.aq, obj.ae, "", -1957264388);
                if (ag != null) {
                    this.ar.put(obj, ag);
                    hashMap.put(obj, ag);
                }
            }
        }
        return hashMap;
    }
}
