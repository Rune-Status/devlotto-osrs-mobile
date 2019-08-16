package defpackage;

import android.content.Intent;

/* renamed from: lo */
public class lo {
    public static final String ag = "gscD0G";
    static final int am = 128;
    static ee[] ge;
    String ad = "";
    String aq = "";
    String[] ar = new String[0];

    static final void gp(al alVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 8;
        try {
            if (client.gf) {
                client.gy = -1179298400;
            } else {
                client.gy = 0;
            }
            client.gf = false;
            if (client.bh.ad == io.ae) {
                if (i5 < i || i5 >= i + 16 || i6 < i2 || i6 >= i2 + 16) {
                    int i9;
                    if (i5 >= i && i5 < i + 16) {
                        i9 = i2 + i3;
                        if (i6 >= i9 - 16 && i6 < i9) {
                            alVar.bx += 1542817556;
                            da.gk(alVar, (byte) 2);
                        }
                    }
                    if (i5 >= i - (client.gy * -2006496987) && i5 < (i + 16) + (client.gy * -2006496987) && i6 >= i2 + 16 && i6 < (i2 + i3) - 16) {
                        int i10 = i3 - 32;
                        i9 = (i3 * i10) / i4;
                        if (i9 >= 8) {
                            i8 = i9;
                        }
                        alVar.bx = (((i4 - i3) * (((i6 - i2) - 16) - (i8 / 2))) / (i10 - i8)) * 1459446213;
                        da.gk(alVar, (byte) 2);
                        client.gf = true;
                    }
                } else {
                    alVar.bx -= 1542817556;
                    da.gk(alVar, (byte) 2);
                }
            }
            if (client.nh * 1403805393 != 0 && i5 >= i - (alVar.bl * 1272191791) && i6 >= i2 && i5 < i + 16 && i6 <= i3 + i2) {
                alVar.bx += client.nh * -881196943;
                da.gk(alVar, (byte) 2);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lo.gp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public lx ad(Intent intent, int i) {
        try {
            if (intent.hasExtra(lx.ad)) {
                this.ad = intent.getStringExtra(lx.ad);
            }
            if (intent.hasExtra(ma.aq)) {
                this.aq = intent.getStringExtra(ma.aq);
                this.ar = this.aq.split(" ");
            }
            return this.ad.equalsIgnoreCase("newsAction") ? new la(this.ar) : new le();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lo.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public lx ai(Intent intent) {
        if (intent.hasExtra(lx.ad)) {
            this.ad = intent.getStringExtra(lx.ad);
        }
        if (intent.hasExtra(ma.aq)) {
            this.aq = intent.getStringExtra(ma.aq);
            this.ar = this.aq.split(" ");
        }
        return this.ad.equalsIgnoreCase("newsAction") ? new la(this.ar) : new le();
    }

    public lx aj(Intent intent) {
        if (intent.hasExtra(lx.ad)) {
            this.ad = intent.getStringExtra(lx.ad);
        }
        if (intent.hasExtra(ma.aq)) {
            this.aq = intent.getStringExtra(ma.aq);
            this.ar = this.aq.split(" ");
        }
        return this.ad.equalsIgnoreCase("newsAction") ? new la(this.ar) : new le();
    }

    public lx al(Intent intent) {
        if (intent.hasExtra(lx.ad)) {
            this.ad = intent.getStringExtra(lx.ad);
        }
        if (intent.hasExtra(ma.aq)) {
            this.aq = intent.getStringExtra(ma.aq);
            this.ar = this.aq.split(" ");
        }
        return this.ad.equalsIgnoreCase("newsAction") ? new la(this.ar) : new le();
    }

    public lx aq(Intent intent) {
        if (intent.hasExtra(lx.ad)) {
            this.ad = intent.getStringExtra(lx.ad);
        }
        if (intent.hasExtra(ma.aq)) {
            this.aq = intent.getStringExtra(ma.aq);
            this.ar = this.aq.split(" ");
        }
        return this.ad.equalsIgnoreCase("newsAction") ? new la(this.ar) : new le();
    }

    public lx ar(Intent intent) {
        if (intent.hasExtra(lx.ad)) {
            this.ad = intent.getStringExtra(lx.ad);
        }
        if (intent.hasExtra(ma.aq)) {
            this.aq = intent.getStringExtra(ma.aq);
            this.ar = this.aq.split(" ");
        }
        return this.ad.equalsIgnoreCase("newsAction") ? new la(this.ar) : new le();
    }
}
