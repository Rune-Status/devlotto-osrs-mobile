package defpackage;

import java.util.Collection;

/* renamed from: gn */
public abstract class gn {
    public static final int am = 10;
    static final int by = 13;
    static kv cf = null;
    static final int hb = 16;
    static int iz = 0;
    static final int nn = 2;
    public int ad;
    public int al;
    public int aq;
    public int ar;

    protected gn() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ai(Collection collection, int i) {
        try {
            collection.add(du.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gn.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A:{Splitter:B:0:0x0000, ExcHandler: RuntimeException (r0_6 'e' java.lang.RuntimeException)} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A:{Splitter:B:0:0x0000, ExcHandler: RuntimeException (r0_6 'e' java.lang.RuntimeException)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:10:0x0030, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            r1 = new java.lang.StringBuilder();
            r1.append("gn.aj(");
            r1.append(')');
     */
    /* JADX WARNING: Missing block: B:12:0x0048, code skipped:
            throw defpackage.mv.aq(r0, r1.toString());
     */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void aj(int i) {
        oq aq;
        try {
            aq = iz.aq("", ne.ae.ae, true, (byte) 23);
            lj ar = dc.rx.ar((byte) -57);
            aq.aq(ar.ar, 0, ar.al * -1631454091, -519612186);
        } catch (Exception e) {
            aq = null;
        } catch (RuntimeException e2) {
        }
        if (aq != null) {
            aq.al(true, (byte) 11);
        }
    }

    public static dp aq(int i, int i2) {
        try {
            long j = (long) i;
            dp dpVar = (dp) dp.al.ad(j);
            if (dpVar == null) {
                byte[] ar = ce.ad.ar(12, i, 1057548112);
                dpVar = new dp();
                if (ar != null) {
                    dpVar.ar(new lj(ar), -1446318759);
                }
                dpVar.aj(1566759120);
                dp.al.ar(dpVar, j);
            }
            return dpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gn.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static im av(int i) {
        try {
            return (client.rp == null || client.rk * -1908803273 >= client.rp.size()) ? null : (im) client.rp.get(client.rk * -1908803273);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gn.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract boolean ad(int i, int i2, int i3, gs gsVar, byte b);

    public abstract boolean aq(int i, int i2, int i3, gs gsVar);

    public abstract boolean ar(int i, int i2, int i3, gs gsVar);
}
