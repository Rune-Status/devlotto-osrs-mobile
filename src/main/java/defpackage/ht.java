package defpackage;

/* renamed from: ht */
public class ht extends gt {
    public boolean ai;
    int aj;
    public int al;
    public int aq;
    public byte[] ar;

    ht(int i, byte[] bArr, int i2, int i3) {
        this.aq = i;
        this.ar = bArr;
        this.al = i2;
        this.aj = i3;
    }

    ht(int i, byte[] bArr, int i2, int i3, boolean z) {
        this.aq = i;
        this.ar = bArr;
        this.al = i2;
        this.aj = i3;
        this.ai = z;
    }

    public ht ad(hx hxVar) {
        int ar;
        this.ar = hxVar.ad(this.ar, (short) 28492);
        this.aq = hxVar.aq(this.aq, -200962294);
        if (this.al == this.aj) {
            ar = hxVar.ar(this.al, 1999302058);
            this.aj = ar;
        } else {
            this.al = hxVar.ar(this.al, 1485832878);
            this.aj = hxVar.ar(this.aj, 1661060204);
            if (this.al == this.aj) {
                ar = this.al - 1;
            }
            return this;
        }
        this.al = ar;
        return this;
    }

    public ht al(hx hxVar) {
        this.ar = hxVar.ad(this.ar, (short) 31652);
        this.aq = hxVar.aq(this.aq, -1145503195);
        if (this.al == this.aj) {
            int ar = hxVar.ar(this.al, 1654855271);
            this.aj = ar;
            this.al = ar;
        } else {
            this.al = hxVar.ar(this.al, 1409840244);
            this.aj = hxVar.ar(this.aj, 1245185125);
            if (this.al == this.aj) {
                this.al--;
            }
        }
        return this;
    }

    public ht aq(hx hxVar) {
        int ar;
        this.ar = hxVar.ad(this.ar, (short) 27553);
        this.aq = hxVar.aq(this.aq, -368592245);
        if (this.al == this.aj) {
            ar = hxVar.ar(this.al, 1924487266);
            this.aj = ar;
        } else {
            this.al = hxVar.ar(this.al, 1364742527);
            this.aj = hxVar.ar(this.aj, 1329615915);
            if (this.al == this.aj) {
                ar = this.al - 1;
            }
            return this;
        }
        this.al = ar;
        return this;
    }

    public ht ar(hx hxVar) {
        this.ar = hxVar.ad(this.ar, (short) 27709);
        this.aq = hxVar.aq(this.aq, -380450504);
        if (this.al == this.aj) {
            int ar = hxVar.ar(this.al, 1702341015);
            this.aj = ar;
            this.al = ar;
        } else {
            this.al = hxVar.ar(this.al, 2066013165);
            this.aj = hxVar.ar(this.aj, 1496179635);
            if (this.al == this.aj) {
                this.al--;
            }
        }
        return this;
    }
}
