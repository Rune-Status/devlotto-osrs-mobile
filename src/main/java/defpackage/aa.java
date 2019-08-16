package defpackage;

import java.util.Map;

/* renamed from: aa */
public abstract class aa {
    static final String ac = "/mobile/play";
    public static final int bt = 65;
    static mk ev;
    protected final String aa;
    protected boolean ab;
    protected boolean af;
    protected final String ah;
    public boolean an;
    protected final String ao;
    public ax ay;

    protected aa(String str, String str2, String str3) {
        try {
            this.af = false;
            this.an = false;
            this.ab = false;
            this.aa = str;
            this.ao = str2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append("m=account-creation/g=oldscape/create_account?mod=os-mobile&ssl=1&dest=");
            stringBuilder.append(ac);
            this.ah = stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("aa.<init>(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public static boolean ad(int i, int i2) {
        return (i & 1) != 0;
    }

    static void ar(int i, byte[] bArr, mh mhVar, int i2) {
        try {
            kz kzVar = new kz();
            kzVar.ad = 0;
            kzVar.gs = (long) i;
            kzVar.aq = bArr;
            kzVar.ar = mhVar;
            kg.ad.az(kzVar, 1697221504);
            kg.ad.aj(1461488151);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aa.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void as(byte b) {
        int i = 0;
        try {
            if (ko.aj * -557713751 == 1) {
                int aq = ji.al.aq((byte) 112);
                if (aq <= 0 || !ji.al.au(-965403136)) {
                    ji.al.ap(-640650544);
                    ji.al.aj((short) -7800);
                    if (ko.ai != null) {
                        ko.aj = -1031136462;
                    } else {
                        ko.aj = 0;
                    }
                    di.ap = null;
                    ko.au = null;
                    return;
                }
                aq -= ko.as * 655711815;
                if (aq >= 0) {
                    i = aq;
                }
                ji.al.ad(i, (byte) 124);
            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
                ji.al.ap(-640650544);
                ko.aj = 0;
                di.ap = null;
                ko.au = null;
                ko.ai = null;
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("aa.as(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    public abstract void aa(long j);

    public abstract void ab(byte b);

    public abstract void ac(String str, byte b);

    public abstract boolean ad(int i);

    public abstract void ae(byte b);

    public abstract az af(int i);

    public abstract void ag(cm cmVar, boolean z, int i);

    public abstract void ah(String str, Map map, int i);

    public abstract void ai(byte b);

    public abstract void ak(int i);

    public abstract boolean al(int i);

    public boolean am(int i) {
        return false;
    }

    public abstract void an(int i);

    public abstract void ao(String str, int i);

    public abstract void ap(int i, int i2, int i3);

    public abstract void aq(byte b);

    public abstract void ar(String str, String str2, String str3, String str4, short s);

    public abstract void as(int i);

    public abstract boolean at(int i);

    public abstract void au(byte b);

    public abstract boolean av(int i);

    public abstract void aw(byte b);

    public abstract void ax(int i);

    public abstract void ay(int i);

    public abstract void az(int i);

    public abstract void bc();

    public abstract void bd(String str, String str2, String str3, String str4);

    public boolean be() {
        return false;
    }

    public abstract void bg();

    public abstract void bh();

    public abstract void bj();

    public abstract boolean bk(byte b);

    public abstract boolean bl();

    public abstract void bm();

    public abstract void bn();

    public abstract boolean bo();

    public abstract void bp(cm cmVar, boolean z);

    public abstract void bq();

    public boolean br() {
        return false;
    }

    public abstract boolean bs();

    public abstract void bt();

    public abstract void bu();

    public abstract void bv();

    public abstract void bw();

    public abstract void bx();

    public abstract void by(cm cmVar, boolean z);

    public abstract void bz();

    public abstract void ca(long j);

    public abstract void cb();

    public abstract void cc(long j);

    public abstract az cd();

    public abstract void ce(String str);

    public abstract az cf();

    public abstract az cg();

    public abstract void ch();

    public abstract void ci();

    public abstract void cj(int i, int i2);

    public abstract void ck(String str, Map map);

    public abstract void cl(String str, Map map);

    public abstract void cm();

    public abstract void cn();

    public abstract void co(String str, Map map);

    public abstract void cp();

    public abstract void cq();

    public abstract void cr(long j);

    public abstract void cs(long j);

    public abstract void ct(String str);

    public abstract void cu(String str, Map map);

    public abstract void cv(int i, int i2);

    public abstract void cw();

    public abstract void cx(long j);

    public abstract void cy(String str);

    public abstract void cz(String str, Map map);

    public abstract boolean da();

    public abstract boolean db();

    public abstract boolean dc();

    public abstract void dd();

    public abstract void df();

    public boolean dg() {
        return false;
    }

    public abstract void di();

    public ax dj() {
        return this.ay;
    }

    public boolean dk() {
        return false;
    }

    public abstract void dl();

    public abstract void dm();

    /* renamed from: do */
    public abstract boolean m0do();

    public abstract boolean dp();

    public ax dq(int i) {
        try {
            return this.ay;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aa.dq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void dr();

    public abstract void dt();

    public abstract boolean du();

    public abstract void dv();

    public boolean dw() {
        return false;
    }

    public void dx(boolean z, byte b) {
        try {
            this.ab = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aa.dx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean dy(int i) {
        return false;
    }

    public boolean dz() {
        return false;
    }

    public void eh(boolean z) {
        this.ab = z;
    }

    public void eo(boolean z) {
        this.ab = z;
    }

    public ax eq() {
        return this.ay;
    }

    public ax et() {
        return this.ay;
    }

    public ax ez() {
        return this.ay;
    }
}
