package defpackage;

/* renamed from: id */
public final class id extends br {
    int ad;
    dp ae;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int aq;
    int ar;
    boolean as;

    id(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            this.am = 0;
            this.ak = 0;
            this.as = false;
            this.ad = -1073716797 * i;
            this.ar = -1114211223 * i2;
            this.al = 1462771009 * i3;
            this.aj = -188460391 * i4;
            this.ai = -1010986051 * i5;
            this.aq = (i7 + i6) * -196141257;
            int i8 = dd.aq(this.ad * 1816827627, 812886062).ae * -1443510939;
            if (i8 != -1) {
                this.as = false;
                this.ae = gn.aq(i8, 2064094479);
                return;
            }
            this.as = true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bp ab() {
        try {
            dz aq = dd.aq(this.ad * 1816827627, 812886062);
            bp aj = !this.as ? aq.aj(this.am * -328196553, (byte) -81) : aq.aj(-1, (byte) 11);
            return aj == null ? null : aj;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ad(int i, int i2) {
        try {
            if (!this.as) {
                this.ak += i * 852556319;
                while (this.ak * -1383857697 > this.ae.am[this.am * -328196553]) {
                    this.ak -= this.ae.am[this.am * -328196553] * 852556319;
                    this.am += 1435498375;
                    if (this.am * -328196553 >= this.ae.ai.length) {
                        this.as = true;
                        return;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void al(int i) {
        if (!this.as) {
            this.ak += i * 852556319;
            while (this.ak * -1383857697 > this.ae.am[this.am * -328196553]) {
                this.ak -= this.ae.am[this.am * -328196553] * 852556319;
                this.am += 1435498375;
                if (this.am * -328196553 >= this.ae.ai.length) {
                    this.as = true;
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void aq(int i) {
        if (!this.as) {
            this.ak += i * 852556319;
            while (this.ak * -1383857697 > this.ae.am[this.am * -328196553]) {
                this.ak -= this.ae.am[this.am * -328196553] * 852556319;
                this.am += 1435498375;
                if (this.am * -328196553 >= this.ae.ai.length) {
                    this.as = true;
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ar(int i) {
        if (!this.as) {
            this.ak += i * 852556319;
            while (this.ak * -1383857697 > this.ae.am[this.am * -328196553]) {
                this.ak -= this.ae.am[this.am * -328196553] * 852556319;
                this.am += 1435498375;
                if (this.am * -328196553 >= this.ae.ai.length) {
                    this.as = true;
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dd() {
        dz aq = dd.aq(this.ad * 1816827627, 812886062);
        bp aj = !this.as ? aq.aj(this.am * -328196553, (byte) 13) : aq.aj(-1, (byte) -8);
        return aj == null ? null : aj;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dm() {
        dz aq = dd.aq(this.ad * 1816827627, 812886062);
        bp aj = !this.as ? aq.aj(this.am * -328196553, (byte) -3) : aq.aj(-1, (byte) -15);
        return aj == null ? null : aj;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dt() {
        dz aq = dd.aq(this.ad * 1816827627, 812886062);
        bp aj = !this.as ? aq.aj(this.am * -328196553, (byte) -54) : aq.aj(-1, (byte) -42);
        return aj == null ? null : aj;
    }
}
