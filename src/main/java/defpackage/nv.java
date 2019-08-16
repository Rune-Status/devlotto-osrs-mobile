package defpackage;

import java.util.Comparator;

/* renamed from: nv */
final class nv implements Comparator {
    static final int ad = 0;
    public static final int ap = 14;

    nv() {
    }

    static int bd(int i, hw hwVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        int[] iArr2;
        int i4;
        if (5306 == i) {
            try {
                iArr = hl.ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = el.ct(823098017);
                return 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("nv.bd(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (i == 5307) {
            iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = iArr2[i4 * -757592335];
            if (i3 != 1 && 2 != i3) {
                return 1;
            }
            cy.co(i3, -160619443);
            return 1;
        } else if (5308 == i) {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = dc.rx.aj * -1491366983;
            return 1;
        } else if (5309 == i) {
            iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = iArr2[i4 * -757592335];
            if (i3 != 1 && 2 != i3) {
                return 1;
            }
            dc.rx.aj = i3 * -575337847;
            gn.aj(-13450133);
            return 1;
        } else if (i != 5310) {
            return 2;
        } else {
            iArr = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            client.oy = Math.max(((float) iArr[i3 * -757592335]) / 1000.0f, 1.77778f);
            client.aq.ck(el.ct(-1759476782), (short) 23693);
            return 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(nx nxVar, nx nxVar2, int i) {
        try {
            if (nxVar.ad * -44135447 < nxVar2.ad * -44135447) {
                return -1;
            }
            return nxVar.ad * -44135447 == nxVar2.ad * -44135447 ? 0 : 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nv.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((nx) obj, (nx) obj2, 1274132383);
    }

    /* Access modifiers changed, original: 0000 */
    public int ai(nx nxVar, nx nxVar2) {
        return nxVar.ad * -44135447 < nxVar2.ad * -44135447 ? -1 : nxVar.ad * -44135447 == nxVar2.ad * -44135447 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(nx nxVar, nx nxVar2) {
        return nxVar.ad * -44135447 < nxVar2.ad * -44135447 ? -1 : nxVar.ad * -44135447 == nxVar2.ad * -44135447 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int al(nx nxVar, nx nxVar2) {
        return nxVar.ad * -44135447 < nxVar2.ad * -44135447 ? -1 : nxVar.ad * 1080241688 == nxVar2.ad * -1197969724 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(nx nxVar, nx nxVar2) {
        return nxVar.ad * 1623968846 < nxVar2.ad * -432571693 ? -1 : nxVar.ad * -44135447 == nxVar2.ad * -44135447 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(nx nxVar, nx nxVar2) {
        return nxVar.ad * -44135447 < nxVar2.ad * -44135447 ? -1 : nxVar.ad * -44135447 == nxVar2.ad * -44135447 ? 0 : 1;
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((nx) obj, (nx) obj2, 1274132383);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nv.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nv.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
