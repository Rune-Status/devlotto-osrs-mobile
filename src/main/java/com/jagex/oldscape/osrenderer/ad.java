package com.jagex.oldscape.osrenderer;

import defpackage.mv;

public class ad {
    static boolean ad;

    ad() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aa(int[] iArr, int i) {
        try {
            zv.jn(iArr);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ab(byte b) {
        try {
            return zv.xm();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ac(int i, int[] iArr, int i2) {
        try {
            zv.fc(i, iArr);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ad(int i) {
        try {
            return ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(short s) {
        try {
            zv.hb();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int[] af(int i) {
        try {
            return zv.op();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ag(int i) {
        try {
            zv.sf();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ah(byte b) {
        try {
            zv.sq();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ai(boolean z, int i) {
        try {
            zv.nh(z);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aj(int i) {
        try {
            zv.fo();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ak(byte b) {
        try {
            zv.sd();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void al(byte b) {
        try {
            zv.bp();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void am(byte b) {
        try {
            zv.zt();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void an(int i) {
        try {
            zv.pn();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ao(boolean z, int i) {
        try {
            zv.gc(z);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ap(byte b) {
        try {
            return zv.em();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aq(int i) {
        try {
            if (!ad) {
                try {
                    if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                        System.loadLibrary("osrenderer");
                    } else {
                        System.loadLibrary("windows/x64/OSRenderer");
                    }
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                }
                ad = true;
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.aq(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public static void ar(Object obj, int i) {
        try {
            zv.xp(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean as(int i) {
        try {
            return zv.se();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean at(short s) {
        try {
            return zv.va();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void au(int i, int i2, int i3) {
        try {
            zv.cc(i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int av(int i) {
        try {
            return zv.hn();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aw(int[] iArr, int i) {
        try {
            zv.vm(iArr);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ax(int i, int i2, int i3, int i4, int i5) {
        try {
            zv.ex(i, i2, i3, i4);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int[] ay(int i) {
        try {
            return zv.xl();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void az(int i, int i2, byte b) {
        try {
            zv.cu(i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ba(int[] iArr, int i, byte b) {
        try {
            return zv.jq(iArr, i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bb(int i, int i2) {
        try {
            return zv.eh(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean bc(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z, int i14) {
        try {
            return zv.qs(i, j, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, z);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bd(int i, int i2) {
        try {
            zv.pe(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int be(int i) {
        try {
            return zv.ev();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.be(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bf(int i, boolean z, boolean z2, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int[] iArr12, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3, int[] iArr13, int[] iArr14, int i5) {
        try {
            return zv.oh(i, z, z2, i2, i3, i4, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, bArr, sArr, bArr2, bArr3, iArr13, iArr14);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean bg(byte b) {
        try {
            return zv.od();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String bh(int i) {
        try {
            return zv.cp();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bi(byte b) {
        try {
            return zv.nc();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bj(int i) {
        try {
            return zv.pv();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bk(int i) {
        try {
            return zv.mz();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bl(int i) {
        try {
            zv.ft();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bm(int i, int[] iArr, int[] iArr2, int i2) {
        try {
            zv.nb(i, iArr, iArr2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bn(int i) {
        try {
            return zv.ds();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bo(int i, int i2) {
        try {
            zv.fl(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bp(int i) {
        try {
            return zv.ys();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bq(int i, int i2, int i3) {
        try {
            zv.id(i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void br(int[] iArr, int i, int i2) {
        try {
            zv.oe(iArr, i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.br(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static long bs(int i) {
        try {
            return zv.fg();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String bt(int i) {
        try {
            return zv.rp();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bu(int i) {
        try {
            zv.uk();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bv(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18, short s19, short s20, short s21, short s22, short s23, short s24, int i) {
        try {
            zv.ro(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bw(int i) {
        try {
            zv.ho();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void bx(int i) {
        try {
            zv.to();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int by(int i) {
        try {
            return zv.nq();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.by(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int bz(int i) {
        try {
            return zv.qp();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.bz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ca() {
        zv.hb();
    }

    public static void cb() {
        zv.bp();
    }

    public static void cc() {
        zv.fo();
    }

    public static boolean cd() {
        return zv.se();
    }

    public static void ce() {
        zv.fo();
    }

    public static boolean cf() {
        return zv.em();
    }

    public static boolean cg() {
        return zv.em();
    }

    public static void ch(int i, int i2) {
        zv.cc(i, i2);
    }

    public static void ci() {
        zv.bp();
    }

    public static String cj(int i) {
        try {
            return zv.tn();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.cj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ck() {
        zv.zt();
    }

    public static void cl() {
        zv.sd();
    }

    public static long cm(int i) {
        try {
            return zv.xe();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.cm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String cn(int i) {
        try {
            return zv.si();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.cn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void co() {
        zv.zt();
    }

    public static void cp(Object obj) {
        zv.xp(obj);
    }

    public static String cq(byte b) {
        try {
            return zv.oa();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.cq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void cr() {
        zv.hb();
    }

    public static void cs(boolean z) {
        zv.nh(z);
    }

    public static void ct() {
        zv.zt();
    }

    public static void cu() {
        zv.sd();
    }

    public static int[] cv(byte b) {
        try {
            return zv.sp();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/osrenderer/ad.cv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean cw() {
        return ad;
    }

    public static void cx() {
        zv.hb();
    }

    public static void cy() {
        zv.fo();
    }

    public static boolean cz() {
        return zv.se();
    }

    public static void da(int i, int i2, int i3, int i4) {
        zv.ex(i, i2, i3, i4);
    }

    public static void db(int[] iArr) {
        zv.vm(iArr);
    }

    public static void dc(int[] iArr) {
        zv.vm(iArr);
    }

    public static void dd(int i, int i2) {
        zv.cc(i, i2);
    }

    public static void de(int[] iArr) {
        zv.jn(iArr);
    }

    public static void df(int i, int i2, int i3, int i4) {
        zv.ex(i, i2, i3, i4);
    }

    public static void dg() {
        zv.sq();
    }

    public static void dh(int i, int[] iArr) {
        zv.fc(i, iArr);
    }

    public static void di(int i, int i2) {
        zv.cu(i, i2);
    }

    public static void dj() {
        zv.sq();
    }

    public static void dk(boolean z) {
        zv.gc(z);
    }

    public static void dl(int i, int i2, int i3, int i4) {
        zv.ex(i, i2, i3, i4);
    }

    public static void dm(int i, int i2) {
        zv.cu(i, i2);
    }

    public static void dn(int i, int[] iArr) {
        zv.fc(i, iArr);
    }

    /* renamed from: do */
    public static void m208do(int[] iArr) {
        zv.jn(iArr);
    }

    public static void dp(int[] iArr) {
        zv.vm(iArr);
    }

    public static void dq(int[] iArr) {
        zv.jn(iArr);
    }

    public static void dr(int i, int i2, int i3, int i4) {
        zv.ex(i, i2, i3, i4);
    }

    public static void ds(int[] iArr) {
        zv.jn(iArr);
    }

    public static void dt(int i, int i2) {
        zv.cu(i, i2);
    }

    public static void du(int[] iArr) {
        zv.vm(iArr);
    }

    public static void dv(int i, int i2) {
        zv.cu(i, i2);
    }

    public static void dw() {
        zv.sq();
    }

    public static void dx(boolean z) {
        zv.gc(z);
    }

    public static void dy(int[] iArr) {
        zv.jn(iArr);
    }

    public static void dz() {
        zv.sq();
    }

    public static int ea() {
        return zv.xm();
    }

    public static long eb() {
        return zv.fg();
    }

    public static int ec() {
        return zv.xm();
    }

    public static int ed(int[] iArr, int i) {
        return zv.jq(iArr, i);
    }

    public static long ee() {
        return zv.fg();
    }

    public static void ef(int i, int i2) {
        zv.id(i, i2);
    }

    public static int eg(int[] iArr, int i) {
        return zv.jq(iArr, i);
    }

    public static int eh() {
        return zv.xm();
    }

    public static int ei() {
        return zv.hn();
    }

    public static void ej(int i, int i2) {
        zv.id(i, i2);
    }

    public static int ek() {
        return zv.hn();
    }

    public static long el() {
        return zv.fg();
    }

    public static void em(int i, int i2) {
        zv.id(i, i2);
    }

    public static boolean en() {
        return zv.va();
    }

    public static void eo() {
        zv.pn();
    }

    public static void ep(int i, int[] iArr, int[] iArr2) {
        zv.nb(i, iArr, iArr2);
    }

    public static int[] eq() {
        return zv.op();
    }

    public static int er(int[] iArr, int i) {
        return zv.jq(iArr, i);
    }

    public static void es(int i) {
        zv.pe(i);
    }

    public static int[] et() {
        return zv.op();
    }

    public static int eu(int[] iArr, int i) {
        return zv.jq(iArr, i);
    }

    public static long ev() {
        return zv.fg();
    }

    public static long ew() {
        return zv.fg();
    }

    public static void ex(int i, int i2) {
        zv.id(i, i2);
    }

    public static int ey() {
        return zv.mz();
    }

    public static int[] ez() {
        return zv.op();
    }

    public static boolean fb(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z) {
        return zv.qs(i, j, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, z);
    }

    public static int fc() {
        return zv.nc();
    }

    public static void fe(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18, short s19, short s20, short s21, short s22, short s23, short s24) {
        zv.ro(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
    }

    public static int fg(int i, boolean z, boolean z2, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int[] iArr12, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3, int[] iArr13, int[] iArr14) {
        return zv.oh(i, z, z2, i2, i3, i4, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, bArr, sArr, bArr2, bArr3, iArr13, iArr14);
    }

    public static int fh(int i, boolean z, boolean z2, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int[] iArr12, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3, int[] iArr13, int[] iArr14) {
        return zv.oh(i, z, z2, i2, i3, i4, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, bArr, sArr, bArr2, bArr3, iArr13, iArr14);
    }

    public static int fi(int i) {
        return zv.eh(i);
    }

    public static int fj(int i, boolean z, boolean z2, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int[] iArr12, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3, int[] iArr13, int[] iArr14) {
        return zv.oh(i, z, z2, i2, i3, i4, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, bArr, sArr, bArr2, bArr3, iArr13, iArr14);
    }

    public static void fk(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18, short s19, short s20, short s21, short s22, short s23, short s24) {
        zv.ro(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
    }

    public static void fl(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18, short s19, short s20, short s21, short s22, short s23, short s24) {
        zv.ro(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
    }

    public static void fm() {
        zv.ft();
    }

    public static void fn() {
        zv.ft();
    }

    public static void fo(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18, short s19, short s20, short s21, short s22, short s23, short s24) {
        zv.ro(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
    }

    public static boolean fp(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z) {
        return zv.qs(i, j, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, z);
    }

    public static void fq(int i) {
        zv.fl(i);
    }

    public static void fs() {
        zv.ft();
    }

    public static void ft() {
        zv.ft();
    }

    public static int fu(int i) {
        return zv.eh(i);
    }

    public static void fw() {
        zv.ft();
    }

    public static void fx(int i) {
        zv.fl(i);
    }

    public static String ga() {
        return zv.cp();
    }

    public static int gb() {
        return zv.pv();
    }

    public static boolean gc() {
        return zv.od();
    }

    public static int gd() {
        return zv.qp();
    }

    public static int ge() {
        return zv.ev();
    }

    public static int gf() {
        return zv.ds();
    }

    public static String gg() {
        return zv.rp();
    }

    public static void gh() {
        zv.uk();
    }

    public static void gi() {
        zv.uk();
    }

    public static int gj() {
        return zv.pv();
    }

    public static String gk() {
        return zv.cp();
    }

    public static boolean gl() {
        return zv.od();
    }

    public static String gm() {
        return zv.cp();
    }

    public static void gn() {
        zv.uk();
    }

    public static void go() {
        zv.to();
    }

    public static boolean gp() {
        return zv.od();
    }

    public static int gq() {
        return zv.ds();
    }

    public static int gr() {
        return zv.pv();
    }

    public static void gs(int[] iArr, int i) {
        zv.oe(iArr, i);
    }

    public static String gt() {
        return zv.cp();
    }

    public static void gu(int[] iArr, int i) {
        zv.oe(iArr, i);
    }

    public static void gv() {
        zv.uk();
    }

    public static boolean gw() {
        return zv.od();
    }

    public static int gx() {
        return zv.qp();
    }

    public static int gy() {
        return zv.qp();
    }

    public static int gz() {
        return zv.pv();
    }

    public static String ha() {
        return zv.si();
    }

    public static int hc() {
        return zv.qp();
    }

    public static int[] hd() {
        return zv.sp();
    }

    public static String he() {
        return zv.si();
    }

    public static int[] hf() {
        return zv.sp();
    }

    public static int hg() {
        return zv.ys();
    }

    public static long hh() {
        return zv.xe();
    }

    public static String hi() {
        return zv.oa();
    }

    public static String hk() {
        return zv.tn();
    }

    public static int hp() {
        return zv.qp();
    }

    public static String hq() {
        return zv.tn();
    }

    public static int[] hr() {
        return zv.sp();
    }

    public static long ht() {
        return zv.xe();
    }

    public static String hu() {
        return zv.oa();
    }

    public static long hx() {
        return zv.xe();
    }
}
