package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* renamed from: ie */
public class ie {
    static final int ad = 100;
    static final int de = 1;
    static oi tc;
    ip[] aq;
    int ar;

    ie() {
        try {
            this.aq = new ip[100];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ie.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(lw lwVar, String str, String str2, int i, int i2, int i3) throws IOException {
        try {
            mc.aj = -926787439 * i2;
            aw.az = 207718299 * i;
            mc.ac = lwVar.fj(1149644894);
            mc.al = lwVar.fg(str, str2, i, (byte) -51);
            try {
                jl.aw = System.getProperty("os.name");
            } catch (Exception e) {
                jl.aw = "Unknown";
            }
            mc.ax = jl.aw.toLowerCase();
            kq.ad(mc.al, -1861833744);
            io.ar(lwVar.fi(i, -1243130824), (byte) 86);
            mc.ag = new of(new oq(iq.aq("main_file_cache.dat2", (byte) -74), "rw", 1048576000), 5200, 0);
            mc.ap = new of(new oq(iq.aq("main_file_cache.idx255", (byte) 43), "rw", PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), 6000, 0);
            im.au = new of[(mc.aj * 142370929)];
            for (int i4 = 0; i4 < mc.aj * 142370929; i4++) {
                of[] ofVarArr = im.au;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("main_file_cache.idx");
                stringBuilder.append(i4);
                ofVarArr[i4] = new of(new oq(iq.aq(stringBuilder.toString(), (byte) -40), "rw", PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), 6000, 0);
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ie.ad(");
            stringBuilder2.append(')');
            throw mv.aq(e2, stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ip ad(int i, String str, String str2, String str3, int i2) {
        try {
            ip ipVar = this.aq[99];
            for (int i3 = this.ar * 1089451477; i3 > 0; i3--) {
                if (i3 != 100) {
                    this.aq[i3] = this.aq[i3 - 1];
                }
            }
            if (ipVar == null) {
                ipVar = new ip(i, str, str3, str2);
            } else {
                ipVar.ky();
                ipVar.di();
                ipVar.ad(i, str, str3, str2, 1439843849);
            }
            this.aq[0] = ipVar;
            if (this.ar * 1089451477 < 100) {
                this.ar -= 1588864131;
            }
            return ipVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ie.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ip ae(int i) {
        return (i < 0 || i >= this.ar * 1089451477) ? null : this.aq[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int ag() {
        return this.ar * 1089451477;
    }

    /* Access modifiers changed, original: 0000 */
    public ip ai(int i, String str, String str2, String str3) {
        ip ipVar = this.aq[99];
        for (int i2 = this.ar * 1089451477; i2 > 0; i2--) {
            if (i2 != 100) {
                this.aq[i2] = this.aq[i2 - 1];
            }
        }
        if (ipVar == null) {
            ipVar = new ip(i, str, str3, str2);
        } else {
            ipVar.ky();
            ipVar.di();
            ipVar.ad(i, str, str3, str2, 1439843849);
        }
        this.aq[0] = ipVar;
        if (this.ar * 1089451477 < 100) {
            this.ar -= 1588864131;
        }
        return ipVar;
    }

    /* Access modifiers changed, original: 0000 */
    public ip aj(int i, String str, String str2, String str3) {
        ip ipVar = this.aq[99];
        for (int i2 = this.ar * 1089451477; i2 > 0; i2--) {
            if (i2 != 100) {
                this.aq[i2] = this.aq[i2 - 1];
            }
        }
        if (ipVar == null) {
            ipVar = new ip(i, str, str3, str2);
        } else {
            ipVar.ky();
            ipVar.di();
            ipVar.ad(i, str, str3, str2, 1439843849);
        }
        this.aq[0] = ipVar;
        if (this.ar * 1089451477 < 100) {
            this.ar -= 1588864131;
        }
        return ipVar;
    }

    /* Access modifiers changed, original: 0000 */
    public ip ak(int i) {
        return (i < 0 || i >= this.ar * -1945606545) ? null : this.aq[i];
    }

    /* Access modifiers changed, original: 0000 */
    public ip al(int i, String str, String str2, String str3) {
        ip ipVar = this.aq[99];
        for (int i2 = this.ar * 1089451477; i2 > 0; i2--) {
            if (i2 != 100) {
                this.aq[i2] = this.aq[i2 - 1];
            }
        }
        if (ipVar == null) {
            ipVar = new ip(i, str, str3, str2);
        } else {
            ipVar.ky();
            ipVar.di();
            ipVar.ad(i, str, str3, str2, 1439843849);
        }
        this.aq[0] = ipVar;
        if (this.ar * 1904215050 < 100) {
            this.ar -= 1588864131;
        }
        return ipVar;
    }

    /* Access modifiers changed, original: 0000 */
    public ip am(int i) {
        return (i < 0 || i >= this.ar * 1089451477) ? null : this.aq[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int ap() {
        return this.ar * -272056776;
    }

    /* Access modifiers changed, original: 0000 */
    public ip aq(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < this.ar * 1089451477) {
                    return this.aq[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ie.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(byte b) {
        try {
            return this.ar * 1089451477;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ie.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ip as(int i) {
        return (i < 0 || i >= this.ar * 1089451477) ? null : this.aq[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int au() {
        return this.ar * -59878022;
    }
}
