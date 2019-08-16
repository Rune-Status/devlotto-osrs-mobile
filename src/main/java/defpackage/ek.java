package defpackage;

/* renamed from: ek */
public class ek extends ez {
    static final int ae = 400;
    public static final int am = 100;
    final my ak;

    public ek(my myVar) {
        try {
            super(ae);
            this.ak = myVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ek.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void er(int i, int i2, int i3) {
        try {
            fy fyVar = client.kk[am.jy * 1973701849][i][i2];
            if (fyVar == null) {
                ce.fk.ay(am.jy * 1973701849, i, i2);
                return;
            }
            long j = -99999999;
            mb mbVar = null;
            for (mb mbVar2 = (ja) fyVar.ae(); mbVar2 != null; mbVar2 = (ja) fyVar.ak()) {
                mb mbVar3;
                dh aq = gl.aq(mbVar2.ad * -1830817693, 1692103247);
                long j2 = (long) (aq.bq * -1195053793);
                if (aq.bm * -1954437925 == 1) {
                    j2 *= (long) ((mbVar2.aq * 583844683) + 1);
                }
                if (j2 > j) {
                    mbVar3 = mbVar2;
                    j = j2;
                } else {
                    mbVar3 = mbVar;
                }
                mbVar = mbVar3;
            }
            if (mbVar == null) {
                ce.fk.ay(am.jy * 1973701849, i, i2);
                return;
            }
            fyVar.ar(mbVar);
            br brVar = null;
            br brVar2 = null;
            for (br brVar3 = (ja) fyVar.ae(); brVar3 != null; ja brVar32 = (ja) fyVar.ak()) {
                if (brVar32.ad * -1830817693 != mbVar.ad * -1830817693) {
                    if (brVar2 == null) {
                        brVar2 = brVar32;
                    }
                    if (brVar2.ad * -1830817693 != brVar32.ad * -1830817693 && brVar == null) {
                        brVar = brVar32;
                    }
                }
            }
            j = ip.az(i, i2, 3, false, 0, 1447487734);
            ce.fk.am(am.jy * 1973701849, i, i2, nh.dg((i * 128) + 64, (i2 * 128) + 64, am.jy * 1973701849, -1671438991), mbVar, j, brVar2, brVar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ek.er(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg[] af(int i, int i2) {
        try {
            return new ey[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ek.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg ah(byte b) {
        try {
            return new ey();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ek.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg cb() {
        return new ey();
    }

    /* Access modifiers changed, original: 0000 */
    public eg[] cc(int i) {
        return new ey[i];
    }

    /* Access modifiers changed, original: 0000 */
    public eg ce() {
        return new ey();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A:{Catch:{ RuntimeException -> 0x0068 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cx(lj ljVar, int i, int i2) {
        while (ljVar.al * -1631454091 < i) {
            try {
                Object obj = (ljVar.af(1804771424) & 1) == 1 ? 1 : null;
                en enVar = new en(ljVar.bm(1275388097), this.ak);
                en enVar2 = new en(ljVar.bm(1742555100), this.ak);
                ljVar.bm(1135458635);
                if (enVar.aq((short) -25888)) {
                    eg egVar;
                    eg egVar2 = (ey) ai(enVar, 702186531);
                    if (obj != null) {
                        egVar = (ey) ai(enVar2, 593378069);
                        if (!(egVar == null || egVar == egVar2)) {
                            if (egVar2 != null) {
                                ak(egVar, (byte) 102);
                            }
                            if (egVar == null) {
                                az(egVar, enVar, enVar2, 2056476826);
                            } else if (aq((byte) -94) < ae) {
                                ((ey) ag(enVar, enVar2, 1702147441)).ad = aq((byte) -92) * -98807679;
                            }
                        }
                    }
                    egVar = egVar2;
                    if (egVar == null) {
                    }
                } else {
                    throw new IllegalStateException();
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ek.cx(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg cy() {
        return new ey();
    }
}
