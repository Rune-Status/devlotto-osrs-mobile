package defpackage;

import java.net.URL;

/* renamed from: jp */
public class jp {
    static al ia;
    static ld tz;
    final URL ad;
    volatile byte[] al;
    final jo aq;
    volatile boolean ar;

    jp(URL url, jo joVar) {
        try {
            this.ad = url;
            this.aq = joVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jp.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(byte b) {
        try {
            this.ar = true;
            if (this.aq != null) {
                this.aq.ad(this, (short) 10017);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jp.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ai() {
        return this.ar;
    }

    public boolean aj() {
        return this.ar;
    }

    /* Access modifiers changed, original: 0000 */
    public void al() {
        this.ar = true;
        if (this.aq != null) {
            this.aq.ad(this, (short) 10752);
        }
    }

    public boolean aq(short s) {
        try {
            return this.ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jp.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public byte[] ar(int i) {
        try {
            return this.al;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jp.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
