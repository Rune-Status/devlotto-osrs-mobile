package defpackage;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: cw */
public final class cw {
    static kv dd = null;
    static int dl = 0;
    static final int ki = 2;
    boolean ad;
    HashMap ae;
    final HashMap ag;
    ci[][] ai;
    HashMap aj;
    final kh ak;
    ee al;
    ef[] am;
    int ap;
    boolean aq;
    cq ar;
    final kh as;
    int au;
    public int aw;
    int ax;
    int az;

    public cw(ef[] efVarArr, HashMap hashMap, kh khVar, kh khVar2) {
        try {
            this.ad = false;
            this.aq = false;
            this.ae = new HashMap();
            this.aw = 0;
            this.am = efVarArr;
            this.ag = hashMap;
            this.ak = khVar;
            this.as = khVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static ef[] ax(int i) {
        try {
            ef[] efVarArr = new ef[(fq.ad * 268010259)];
            ca.ab((byte) 118);
            for (int i2 = 0; i2 < fq.ad * 268010259; i2++) {
                ef efVar = new ef();
                efVarArr[i2] = efVar;
                efVar.ae = fq.aq * 1679085813;
                efVar.am = fq.ar * -1789448811;
                efVar.aj = fq.al[i2];
                efVar.ai = fq.aj[i2];
                efVar.ar = dv.ai[i2];
                efVar.al = fq.ae[i2];
                efVar.aq = fq.am;
                efVar.ad = eh.ak[i2];
            }
            jn.an(-927208927);
            return efVarArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void dq(byte b) {
        try {
            client.jo = 0;
            int i = (oz.ff * 2060098323) + ((da.jc.bq * -1444273727) >> 7);
            int i2 = ((da.jc.bd * -1690563339) >> 7) + (cq.fz * -1866366501);
            if (i >= 3053 && i <= 3156 && i2 >= 3056 && i2 <= 3136) {
                client.jo = 1202965777;
            }
            if (i >= 3072 && i <= 3118 && i2 >= 9492 && i2 <= 9535) {
                client.jo = 1202965777;
            }
            if (client.jo * 34128881 == 1 && i >= 3139 && i <= 3199 && i2 >= 3008 && i2 <= 3062) {
                client.jo = 0;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.dq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void aa() {
        this.aj = null;
    }

    public void ab(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar) {
        if (this.al != null) {
            esVar.ah(this.al, i, i2, i3, i4, -1251881802);
            if (i5 > 0 && i5 % i6 < i6 / 2) {
                if (this.aj == null) {
                    as(1843147455);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<cf> list = (List) this.aj.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (cf cfVar : list) {
                            esVar.ap(((((cfVar.ad.aq * -1590589723) - (this.ap * 2003251747)) * i3) / (this.az * 2007937929)) + i, i2 + (i4 - ((((cfVar.ad.ar * 738029977) - (this.au * 1480031565)) * i4) / (this.ax * 1836171511))), 2, -2074520872, -1952038969);
                        }
                    }
                }
            }
        }
    }

    public final void ac() {
        this.aj = null;
    }

    public void ad(kh khVar, String str, boolean z, byte b) {
        try {
            if (!this.aq) {
                this.ad = false;
                this.aq = true;
                System.nanoTime();
                int ay = khVar.ay(khVar.af(ch.ad.ai, 1277405401), str, (byte) 43);
                lj ljVar = new lj(khVar.ab(ch.ad.ai, str, (byte) -53));
                lj ljVar2 = new lj(khVar.ab(ch.aq.ai, str, (byte) -41));
                System.nanoTime();
                System.nanoTime();
                this.ar = new cq();
                try {
                    this.ar.ad(ljVar, ljVar2, ay, z, 540583225);
                    this.ar.ab(1965912103);
                    this.ar.av((byte) 114);
                    this.ar.at(-1958620042);
                    this.ap = this.ar.ah(-1821916464) * 1761829568;
                    this.au = this.ar.ay((byte) -49) * 1627447616;
                    this.az = ((this.ar.af(-1873597868) - this.ar.ah(-1821916464)) + 1) * -7158464;
                    this.ax = ((this.ar.an(101974285) - this.ar.ay((byte) -4)) + 1) * 1857970240;
                    int af = (this.ar.af(-2111189717) - this.ar.ah(-1821916464)) + 1;
                    ay = (this.ar.an(2026583555) - this.ar.ay((byte) -38)) + 1;
                    System.nanoTime();
                    System.nanoTime();
                    kv.al((byte) 124);
                    this.ai = (ci[][]) Array.newInstance(ci.class, new int[]{af, ay});
                    Iterator it = this.ar.ad.iterator();
                    while (it.hasNext()) {
                        cb cbVar = (cb) it.next();
                        int i = cbVar.ar * -293139945;
                        int i2 = cbVar.al * 1871460315;
                        int ah = i - this.ar.ah(-1821916464);
                        int ay2 = i2 - this.ar.ay((byte) 8);
                        this.ai[ah][ay2] = new ci(i, i2, this.ar.aa(1383875533), this.ag);
                        this.ai[ah][ay2].ae(cbVar, this.ar.ar, (byte) 16);
                    }
                    for (int i3 = 0; i3 < af; i3++) {
                        for (int i4 = 0; i4 < ay; i4++) {
                            if (this.ai[i3][i4] == null) {
                                this.ai[i3][i4] = new ci(this.ar.ah(-1821916464) + i3, this.ar.ay((byte) -7) + i4, this.ar.aa(363152549), this.ag);
                                this.ai[i3][i4].am(this.ar.aq, this.ar.ar, 1436303982);
                            }
                        }
                    }
                    System.nanoTime();
                    System.nanoTime();
                    if (khVar.an(ch.ar.ai, str, 2095682589)) {
                        this.al = ey.ad(khVar.ab(ch.ar.ai, str, (byte) -47), 374347326);
                    }
                    System.nanoTime();
                    khVar.ac(976770869);
                    khVar.ao(454987553);
                    this.ad = true;
                } catch (IllegalStateException e) {
                }
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.ad(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public dd ae(int i, int i2, int i3, int i4, byte b) {
        try {
            dd ddVar = new dd(this);
            int i5 = this.ap;
            int i6 = this.au;
            i5 = ((i5 * 2003251747) + i) / 64;
            i6 = ((i6 * 1480031565) + i2) / 64;
            int i7 = ((this.au * 1480031565) + i4) / 64;
            ddVar.ad = (((((this.ap * 2003251747) + i3) / 64) - i5) + 1) * -1705542401;
            ddVar.aq = ((i7 - i6) + 1) * 370847685;
            ddVar.ar = (i5 - this.ar.ah(-1821916464)) * 95241993;
            ddVar.al = (i6 - this.ar.ay((byte) -34)) * 879762489;
            if (ddVar.ar * 817264441 < 0) {
                ddVar.ad += ddVar.ar * -1243652665;
                ddVar.ar = 0;
            }
            if (ddVar.ar * 817264441 > this.ai.length - (ddVar.ad * -845184257)) {
                ddVar.ad = (this.ai.length - (ddVar.ar * 817264441)) * -1705542401;
            }
            if (ddVar.al * -861203959 < 0) {
                ddVar.aq += ddVar.al * 199428077;
                ddVar.al = 0;
            }
            if (ddVar.al * -861203959 > this.ai[0].length - (ddVar.aq * 800519949)) {
                ddVar.aq = (this.ai[0].length - (ddVar.al * -861203959)) * 370847685;
            }
            ddVar.ad = Math.min(ddVar.ad * -845184257, this.ai.length) * -1705542401;
            ddVar.aq = Math.min(ddVar.aq * 800519949, this.ai[0].length) * 370847685;
            return ddVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void af(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar) {
        int i11;
        dd ae = ae(i, i2, i3, i4, (byte) 4);
        int ag = (int) (ag(i7 - i5, i3 - i, (byte) 0) * 64.0f);
        int i12 = this.ap;
        int i13 = this.au;
        int i14 = ae.ar * 817264441;
        while (true) {
            i11 = i14;
            if (i11 >= (ae.ar * 817264441) + (ae.ad * 1906868212)) {
                break;
            }
            i14 = ae.al * -908225887;
            while (true) {
                int i15 = i14;
                if (i15 >= (ae.aq * 1208018992) + (ae.al * -861203959)) {
                    break;
                }
                if (z) {
                    this.ai[i11][i15].ag(1331659032);
                }
                this.ai[i11][i15].aw(((((this.ai[i11][i15].am * -1854416192) - ((2003251747 * i12) + i)) * ag) / 64) + i5, i8 - (((((this.ai[i11][i15].ak * 1181309376) - ((1480031565 * i13) + i2)) - 1599310911) * ag) / 64), ag, hashSet, esVar, (byte) -37);
                i14 = i15 + 1;
            }
            i14 = i11 + 1;
        }
        if (hashSet2 != null && i9 > 0) {
            i14 = ae.ar * -780033313;
            while (true) {
                int i16 = i14;
                if (i16 < (ae.ad * -845184257) + (ae.ar * 817264441)) {
                    i14 = ae.al * -861203959;
                    while (true) {
                        i11 = i14;
                        if (i11 >= (ae.al * -861203959) + (ae.aq * 800519949)) {
                            break;
                        }
                        this.ai[i16][i11].ac(hashSet2, i9, i10, esVar, (byte) 7);
                        i14 = i11 + 1;
                    }
                    i14 = i16 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float ag(int i, int i2, byte b) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        try {
            float round = (float) Math.round(f);
            return Math.abs(round - f) >= 0.05f ? f : round;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ah(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar) {
        int i11;
        dd ae = ae(i, i2, i3, i4, (byte) 4);
        int ag = (int) (ag(i7 - i5, i3 - i, (byte) 0) * 64.0f);
        int i12 = this.ap;
        int i13 = this.au;
        int i14 = ae.ar * 817264441;
        while (true) {
            i11 = i14;
            if (i11 >= (ae.ar * 817264441) + (ae.ad * -845184257)) {
                break;
            }
            i14 = ae.al * -861203959;
            while (true) {
                int i15 = i14;
                if (i15 >= (ae.aq * 800519949) + (ae.al * -861203959)) {
                    break;
                }
                if (z) {
                    this.ai[i11][i15].ag(-1529973802);
                }
                this.ai[i11][i15].aw(((((this.ai[i11][i15].am * -1854416192) - ((2003251747 * i12) + i)) * ag) / 64) + i5, i8 - (((((this.ai[i11][i15].ak * 1181309376) - ((1480031565 * i13) + i2)) + 64) * ag) / 64), ag, hashSet, esVar, (byte) 16);
                i14 = i15 + 1;
            }
            i14 = i11 + 1;
        }
        if (hashSet2 != null && i9 > 0) {
            i14 = ae.ar * 817264441;
            while (true) {
                int i16 = i14;
                if (i16 < (ae.ad * -845184257) + (ae.ar * 817264441)) {
                    i14 = ae.al * -861203959;
                    while (true) {
                        i11 = i14;
                        if (i11 >= (ae.al * -861203959) + (ae.aq * 800519949)) {
                            break;
                        }
                        this.ai[i16][i11].ac(hashSet2, i9, i10, esVar, (byte) 7);
                        i14 = i11 + 1;
                    }
                    i14 = i16 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public List ai(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, byte b) {
        try {
            LinkedList linkedList = new LinkedList();
            if (!this.ad) {
                return linkedList;
            }
            dd ae = ae(i, i2, i3, i4, (byte) 4);
            int ag = (int) (ag(i7, i3 - i, (byte) 0) * 64.0f);
            int i11 = this.ap;
            int i12 = this.au;
            int i13 = ae.ar * 817264441;
            while (true) {
                int i14 = i13;
                if (i14 >= (ae.ad * -845184257) + (ae.ar * 817264441)) {
                    return linkedList;
                }
                i13 = ae.al * -861203959;
                while (true) {
                    int i15 = i13;
                    if (i15 >= (ae.aq * 800519949) + (ae.al * -861203959)) {
                        break;
                    }
                    List bc = this.ai[i14][i15].bc(((((this.ai[i14][i15].am * -1854416192) - ((2003251747 * i11) + i)) * ag) / 64) + i5, (i8 + i6) - (((((this.ai[i14][i15].ak * 1181309376) - ((1480031565 * i12) + i2)) + 64) * ag) / 64), ag, i9, i10, -1453762976);
                    if (!bc.isEmpty()) {
                        linkedList.addAll(bc);
                    }
                    i13 = i15 + 1;
                }
                i13 = i14 + 1;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aj(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar, int i7) {
        try {
            if (this.al != null) {
                esVar.ah(this.al, i, i2, i3, i4, 875351769);
                if (i5 > 0 && i5 % i6 < i6 / 2) {
                    if (this.aj == null) {
                        as(2029784408);
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        List<cf> list = (List) this.aj.get(Integer.valueOf(((Integer) it.next()).intValue()));
                        if (list != null) {
                            for (cf cfVar : list) {
                                esVar.ap(((((cfVar.ad.aq * -1822118049) - (this.ap * 2003251747)) * i3) / (this.az * 1805560893)) + i, i2 + (i4 - ((((cfVar.ad.ar * 738029977) - (this.au * 1480031565)) * i4) / (this.ax * 1980712577))), 2, 16776960, -1952038969);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public HashMap ak(byte b) {
        try {
            as(1785380359);
            return this.aj;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void al(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar, int i11) {
        try {
            int i12;
            dd ae = ae(i, i2, i3, i4, (byte) 4);
            int ag = (int) (ag(i7 - i5, i3 - i, (byte) 0) * 64.0f);
            int i13 = this.ap;
            int i14 = this.au;
            int i15 = ae.ar * 817264441;
            while (true) {
                int i16 = i15;
                if (i16 >= (ae.ar * 817264441) + (ae.ad * -845184257)) {
                    break;
                }
                for (i12 = ae.al * -861203959; i12 < (ae.aq * 800519949) + (ae.al * -861203959); i12++) {
                    if (z) {
                        this.ai[i16][i12].ag(1228664272);
                    }
                    this.ai[i16][i12].aw(((((this.ai[i16][i12].am * -1854416192) - ((2003251747 * i13) + i)) * ag) / 64) + i5, i8 - (((((this.ai[i16][i12].ak * 1181309376) - ((1480031565 * i14) + i2)) + 64) * ag) / 64), ag, hashSet, esVar, (byte) -43);
                }
                i15 = i16 + 1;
            }
            if (hashSet2 != null && i9 > 0) {
                i15 = ae.ar * 817264441;
                while (true) {
                    i12 = i15;
                    if (i12 < (ae.ad * -845184257) + (ae.ar * 817264441)) {
                        i15 = ae.al * -861203959;
                        while (true) {
                            int i17 = i15;
                            if (i17 >= (ae.al * -861203959) + (ae.aq * 800519949)) {
                                break;
                            }
                            this.ai[i12][i17].ac(hashSet2, i9, i10, esVar, (byte) 7);
                            i15 = i17 + 1;
                        }
                        i15 = i12 + 1;
                    } else {
                        return;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean am(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void an(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar) {
        if (this.al != null) {
            esVar.ah(this.al, i, i2, i3, i4, -417575037);
            if (i5 > 0 && i5 % i6 < i6 / 2) {
                if (this.aj == null) {
                    as(1417446170);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<cf> list = (List) this.aj.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (cf cfVar : list) {
                            esVar.ap(((((cfVar.ad.aq * -1822118049) - (this.ap * 2003251747)) * i3) / (this.az * 1805560893)) + i, i2 + (i4 - ((((cfVar.ad.ar * 738029977) - (this.au * 1480031565)) * i4) / (this.ax * 1980712577))), 2, 16776960, -1952038969);
                        }
                    }
                }
            }
        }
    }

    public final void ao() {
        this.aj = null;
    }

    public void ap(kh khVar, String str, boolean z) {
        if (!this.aq) {
            this.ad = false;
            this.aq = true;
            System.nanoTime();
            int ay = khVar.ay(khVar.af(ch.ad.ai, 1172129084), str, (byte) -37);
            lj ljVar = new lj(khVar.ab(ch.ad.ai, str, (byte) -64));
            lj ljVar2 = new lj(khVar.ab(ch.aq.ai, str, (byte) -13));
            System.nanoTime();
            System.nanoTime();
            this.ar = new cq();
            try {
                this.ar.ad(ljVar, ljVar2, ay, z, -1562083773);
                this.ar.ab(1818975955);
                this.ar.av((byte) 16);
                this.ar.at(524796869);
                this.ap = this.ar.ah(-1821916464) * 1761829568;
                this.au = this.ar.ay((byte) 72) * 1627447616;
                this.az = ((this.ar.af(-2005331562) - this.ar.ah(-1821916464)) + 1) * -7158464;
                this.ax = ((this.ar.an(320836964) - this.ar.ay((byte) -8)) + 1) * 1857970240;
                int af = (this.ar.af(-1682669769) - this.ar.ah(-1821916464)) + 1;
                ay = (this.ar.an(618478001) - this.ar.ay((byte) -39)) + 1;
                System.nanoTime();
                System.nanoTime();
                kv.al((byte) 32);
                this.ai = (ci[][]) Array.newInstance(ci.class, new int[]{af, ay});
                Iterator it = this.ar.ad.iterator();
                while (it.hasNext()) {
                    cb cbVar = (cb) it.next();
                    int i = cbVar.ar * -293139945;
                    int i2 = cbVar.al * 1871460315;
                    int ah = i - this.ar.ah(-1821916464);
                    int ay2 = i2 - this.ar.ay((byte) 38);
                    this.ai[ah][ay2] = new ci(i, i2, this.ar.aa(1784778899), this.ag);
                    this.ai[ah][ay2].ae(cbVar, this.ar.ar, (byte) 16);
                }
                for (int i3 = 0; i3 < af; i3++) {
                    for (int i4 = 0; i4 < ay; i4++) {
                        if (this.ai[i3][i4] == null) {
                            this.ai[i3][i4] = new ci(this.ar.ah(-1821916464) + i3, this.ar.ay((byte) -108) + i4, this.ar.aa(1723247787), this.ag);
                            this.ai[i3][i4].am(this.ar.aq, this.ar.ar, 1436303982);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (khVar.an(ch.ar.ai, str, -140093868)) {
                    this.al = ey.ad(khVar.ab(ch.ar.ai, str, (byte) -109), -628021306);
                }
                System.nanoTime();
                khVar.ac(2042060065);
                khVar.ao(-1907972144);
                this.ad = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public final void aq(int i) {
        try {
            this.aj = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ar(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, es esVar, byte b) {
        try {
            int i9;
            int i10;
            dd ae = ae(i, i2, i3, i4, (byte) 4);
            float ag = ag(i7 - i5, i3 - i, (byte) 0);
            int ceil = (int) Math.ceil((double) ag);
            this.aw = 1418705503 * ceil;
            if (!this.ae.containsKey(Integer.valueOf(ceil))) {
                ct ctVar = new ct(ceil);
                ctVar.al(1333942502);
                this.ae.put(Integer.valueOf(ceil), ctVar);
            }
            int i11 = ae.ar;
            int i12 = ae.ad;
            int i13 = ae.al;
            int i14 = ae.aq;
            int i15 = ae.ar * 817264441;
            while (true) {
                i9 = i15;
                if (i9 > ((817264441 * i11) + (-845184257 * i12)) - 1) {
                    break;
                }
                for (i10 = ae.al * -861203959; i10 <= ((-861203959 * i13) + (800519949 * i14)) - 1; i10++) {
                    this.ai[i9][i10].ax(ceil, (ct) this.ae.get(Integer.valueOf(ceil)), this.am, this.ak, this.as, 794789104);
                }
                i15 = i9 + 1;
            }
            int i16 = (int) (64.0f * ag);
            i9 = this.ap;
            int i17 = this.au;
            i15 = ae.ar * 817264441;
            while (true) {
                i10 = i15;
                if (i10 < (ae.ar * 817264441) + (ae.ad * -845184257)) {
                    i15 = ae.al * -861203959;
                    while (true) {
                        int i18 = i15;
                        if (i18 >= (ae.aq * 800519949) + (ae.al * -861203959)) {
                            break;
                        }
                        this.ai[i10][i18].ai(((((this.ai[i10][i18].am * -1854416192) - ((2003251747 * i9) + i)) * i16) / 64) + i5, i8 - (((((this.ai[i10][i18].ak * 1181309376) - ((1480031565 * i17) + i2)) + 64) * i16) / 64), i16, esVar, (byte) -111);
                        i15 = i18 + 1;
                    }
                    i15 = i10 + 1;
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(int i) {
        try {
            if (this.aj == null) {
                this.aj = new HashMap();
            }
            this.aj.clear();
            for (int i2 = 0; i2 < this.ai.length; i2++) {
                for (ci bv : this.ai[i2]) {
                    for (cf cfVar : bv.bv((byte) -98)) {
                        if (cfVar.ai(722915474)) {
                            int aq = cfVar.aq((byte) -40);
                            if (this.aj.containsKey(Integer.valueOf(aq))) {
                                ((List) this.aj.get(Integer.valueOf(aq))).add(cfVar);
                            } else {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(cfVar);
                                this.aj.put(Integer.valueOf(aq), linkedList);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cw.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public List at(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.ad) {
            return linkedList;
        }
        dd ae = ae(i, i2, i3, i4, (byte) 4);
        int ag = (int) (ag(i7, i3 - i, (byte) 0) * 64.0f);
        int i11 = this.ap;
        int i12 = this.au;
        int i13 = ae.ar * 817264441;
        while (true) {
            int i14 = i13;
            if (i14 >= (ae.ad * -845184257) + (ae.ar * 817264441)) {
                return linkedList;
            }
            i13 = ae.al * -1612165483;
            while (true) {
                int i15 = i13;
                if (i15 >= (ae.aq * 800519949) + (ae.al * -861203959)) {
                    break;
                }
                List bc = this.ai[i14][i15].bc(((((this.ai[i14][i15].am * -635141551) - ((2003251747 * i11) + i)) * ag) / -132602356) + i5, (i8 + i6) - (((((this.ai[i14][i15].ak * 425989858) - ((1480031565 * i12) + i2)) + 64) * ag) / 64), ag, i9, i10, -2078160013);
                if (!bc.isEmpty()) {
                    linkedList.addAll(bc);
                }
                i13 = i15 + 1;
            }
            i13 = i14 + 1;
        }
    }

    public void au(kh khVar, String str, boolean z) {
        if (!this.aq) {
            this.ad = false;
            this.aq = true;
            System.nanoTime();
            int ay = khVar.ay(khVar.af(ch.ad.ai, 937133881), str, (byte) 93);
            lj ljVar = new lj(khVar.ab(ch.ad.ai, str, (byte) -105));
            lj ljVar2 = new lj(khVar.ab(ch.aq.ai, str, (byte) -59));
            System.nanoTime();
            System.nanoTime();
            this.ar = new cq();
            try {
                this.ar.ad(ljVar, ljVar2, ay, z, -806406896);
                this.ar.ab(1836407394);
                this.ar.av((byte) 25);
                this.ar.at(-439971022);
                this.ap = this.ar.ah(-1821916464) * 1761829568;
                this.au = this.ar.ay((byte) 5) * 1627447616;
                this.az = ((this.ar.af(-1826000449) - this.ar.ah(-1821916464)) + 1) * -7158464;
                this.ax = ((this.ar.an(456015255) - this.ar.ay((byte) 7)) + 1) * 1857970240;
                int af = (this.ar.af(-1101490362) - this.ar.ah(-1821916464)) + 1;
                ay = (this.ar.an(716460241) - this.ar.ay((byte) 43)) + 1;
                System.nanoTime();
                System.nanoTime();
                kv.al((byte) -92);
                this.ai = (ci[][]) Array.newInstance(ci.class, new int[]{af, ay});
                Iterator it = this.ar.ad.iterator();
                while (it.hasNext()) {
                    cb cbVar = (cb) it.next();
                    int i = cbVar.ar * -293139945;
                    int i2 = cbVar.al * 1871460315;
                    int ah = i - this.ar.ah(-1821916464);
                    int ay2 = i2 - this.ar.ay((byte) 116);
                    this.ai[ah][ay2] = new ci(i, i2, this.ar.aa(2132616856), this.ag);
                    this.ai[ah][ay2].ae(cbVar, this.ar.ar, (byte) 16);
                }
                for (int i3 = 0; i3 < af; i3++) {
                    for (int i4 = 0; i4 < ay; i4++) {
                        if (this.ai[i3][i4] == null) {
                            this.ai[i3][i4] = new ci(this.ar.ah(-1821916464) + i3, this.ar.ay((byte) -19) + i4, this.ar.aa(1326605674), this.ag);
                            this.ai[i3][i4].am(this.ar.aq, this.ar.ar, 1436303982);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (khVar.an(ch.ar.ai, str, 1931315904)) {
                    this.al = ey.ad(khVar.ab(ch.ar.ai, str, (byte) -109), -803845606);
                }
                System.nanoTime();
                khVar.ac(480603567);
                khVar.ao(414799403);
                this.ad = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public void av(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar) {
        if (this.al != null) {
            esVar.ah(this.al, i, i2, i3, i4, -1489074874);
            if (i5 > 0 && i5 % i6 < i6 / 2) {
                if (this.aj == null) {
                    as(1812167487);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<cf> list = (List) this.aj.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (cf cfVar : list) {
                            esVar.ap(((((cfVar.ad.aq * 233958975) - (this.ap * 2003251747)) * i3) / (this.az * 1805560893)) + i, i2 + (i4 - ((((cfVar.ad.ar * 738029977) - (this.au * -2097043771)) * i4) / (this.ax * 1136788607))), 2, 16776960, -1952038969);
                        }
                    }
                }
            }
        }
    }

    public final void aw() {
        this.aj = null;
    }

    public final void ax() {
        this.aj = null;
    }

    public final void ay(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar) {
        int i11;
        dd ae = ae(i, i2, i3, i4, (byte) 4);
        int ag = (int) (ag(i7 - i5, i3 - i, (byte) 0) * 64.0f);
        int i12 = this.ap;
        int i13 = this.au;
        int i14 = ae.ar * 817264441;
        while (true) {
            i11 = i14;
            if (i11 >= (ae.ar * 817264441) + (ae.ad * -845184257)) {
                break;
            }
            i14 = ae.al * -861203959;
            while (true) {
                int i15 = i14;
                if (i15 >= (ae.aq * 800519949) + (ae.al * -861203959)) {
                    break;
                }
                if (z) {
                    this.ai[i11][i15].ag(1520501415);
                }
                this.ai[i11][i15].aw(((((this.ai[i11][i15].am * -1854416192) - ((2003251747 * i12) + i)) * ag) / 64) + i5, i8 - (((((this.ai[i11][i15].ak * 1181309376) - ((1480031565 * i13) + i2)) + 64) * ag) / 64), ag, hashSet, esVar, (byte) -57);
                i14 = i15 + 1;
            }
            i14 = i11 + 1;
        }
        if (hashSet2 != null && i9 > 0) {
            i14 = ae.ar * 817264441;
            while (true) {
                int i16 = i14;
                if (i16 < (ae.ad * -845184257) + (ae.ar * 817264441)) {
                    i14 = ae.al * -861203959;
                    while (true) {
                        i11 = i14;
                        if (i11 >= (ae.al * -861203959) + (ae.aq * 800519949)) {
                            break;
                        }
                        this.ai[i16][i11].ac(hashSet2, i9, i10, esVar, (byte) 7);
                        i14 = i11 + 1;
                    }
                    i14 = i16 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void az(kh khVar, String str, boolean z) {
        if (!this.aq) {
            this.ad = false;
            this.aq = true;
            System.nanoTime();
            int ay = khVar.ay(khVar.af(ch.ad.ai, 675719709), str, (byte) 59);
            lj ljVar = new lj(khVar.ab(ch.ad.ai, str, (byte) -43));
            lj ljVar2 = new lj(khVar.ab(ch.aq.ai, str, (byte) -21));
            System.nanoTime();
            System.nanoTime();
            this.ar = new cq();
            try {
                this.ar.ad(ljVar, ljVar2, ay, z, -1251630137);
                this.ar.ab(1959658416);
                this.ar.av((byte) 84);
                this.ar.at(-1467711924);
                this.ap = this.ar.ah(-1821916464) * 827717275;
                this.au = this.ar.ay((byte) -7) * 26048861;
                this.az = ((this.ar.af(-1231767015) - this.ar.ah(-1821916464)) + 1) * -304811696;
                this.ax = ((this.ar.an(1411852816) - this.ar.ay((byte) -2)) + 1) * 896994348;
                int af = (this.ar.af(-1828854547) - this.ar.ah(-1821916464)) + 1;
                ay = (this.ar.an(-867495389) - this.ar.ay((byte) 55)) + 1;
                System.nanoTime();
                System.nanoTime();
                kv.al((byte) -22);
                this.ai = (ci[][]) Array.newInstance(ci.class, new int[]{af, ay});
                Iterator it = this.ar.ad.iterator();
                while (it.hasNext()) {
                    cb cbVar = (cb) it.next();
                    int i = cbVar.ar * -293139945;
                    int i2 = cbVar.al * -442581232;
                    int ah = i - this.ar.ah(-1821916464);
                    int ay2 = i2 - this.ar.ay((byte) 17);
                    this.ai[ah][ay2] = new ci(i, i2, this.ar.aa(442051758), this.ag);
                    this.ai[ah][ay2].ae(cbVar, this.ar.ar, (byte) 16);
                }
                for (int i3 = 0; i3 < af; i3++) {
                    for (int i4 = 0; i4 < ay; i4++) {
                        if (this.ai[i3][i4] == null) {
                            this.ai[i3][i4] = new ci(this.ar.ah(-1821916464) + i3, this.ar.ay((byte) 22) + i4, this.ar.aa(1516475410), this.ag);
                            this.ai[i3][i4].am(this.ar.aq, this.ar.ar, 1436303982);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (khVar.an(ch.ar.ai, str, -1998050072)) {
                    this.al = ey.ad(khVar.ab(ch.ar.ai, str, (byte) -44), -1431510969);
                }
                System.nanoTime();
                khVar.ac(-45844077);
                khVar.ao(1337229597);
                this.ad = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public List ba(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.ad) {
            return linkedList;
        }
        dd ae = ae(i, i2, i3, i4, (byte) 4);
        int ag = (int) (ag(i7, i3 - i, (byte) 0) * 64.0f);
        int i11 = this.ap;
        int i12 = this.au;
        int i13 = ae.ar * 817264441;
        while (true) {
            int i14 = i13;
            if (i14 >= (ae.ad * -845184257) + (ae.ar * 817264441)) {
                return linkedList;
            }
            i13 = ae.al * -861203959;
            while (true) {
                int i15 = i13;
                if (i15 >= (ae.aq * 800519949) + (ae.al * -861203959)) {
                    break;
                }
                List bc = this.ai[i14][i15].bc(((((this.ai[i14][i15].am * -1854416192) - ((2003251747 * i11) + i)) * ag) / 64) + i5, (i8 + i6) - (((((this.ai[i14][i15].ak * 1181309376) - ((1480031565 * i12) + i2)) + 64) * ag) / 64), ag, i9, i10, -1975025383);
                if (!bc.isEmpty()) {
                    linkedList.addAll(bc);
                }
                i13 = i15 + 1;
            }
            i13 = i14 + 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bb() {
        if (this.aj == null) {
            this.aj = new HashMap();
        }
        this.aj.clear();
        for (int i = 0; i < this.ai.length; i++) {
            for (ci bv : this.ai[i]) {
                for (cf cfVar : bv.bv((byte) -82)) {
                    if (cfVar.ai(1390249646)) {
                        int aq = cfVar.aq((byte) -33);
                        if (this.aj.containsKey(Integer.valueOf(aq))) {
                            ((List) this.aj.get(Integer.valueOf(aq))).add(cfVar);
                        } else {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(cfVar);
                            this.aj.put(Integer.valueOf(aq), linkedList);
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float bc(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        float round = (float) Math.round(f);
        return Math.abs(round - f) >= 0.05f ? f : round;
    }

    public boolean bd() {
        return this.ad;
    }

    public HashMap bf() {
        as(2066592834);
        return this.aj;
    }

    /* Access modifiers changed, original: 0000 */
    public void bi() {
        if (this.aj == null) {
            this.aj = new HashMap();
        }
        this.aj.clear();
        for (int i = 0; i < this.ai.length; i++) {
            for (ci bv : this.ai[i]) {
                for (cf cfVar : bv.bv((byte) -25)) {
                    if (cfVar.ai(708154394)) {
                        int aq = cfVar.aq((byte) 5);
                        if (this.aj.containsKey(Integer.valueOf(aq))) {
                            ((List) this.aj.get(Integer.valueOf(aq))).add(cfVar);
                        } else {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(cfVar);
                            this.aj.put(Integer.valueOf(aq), linkedList);
                        }
                    }
                }
            }
        }
    }

    public List bk(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.ad) {
            return linkedList;
        }
        dd ae = ae(i, i2, i3, i4, (byte) 4);
        int ag = (int) (ag(i7, i3 - i, (byte) 0) * 64.0f);
        int i11 = this.ap;
        int i12 = this.au;
        int i13 = ae.ar * 1013451731;
        while (true) {
            int i14 = i13;
            if (i14 >= (ae.ad * -845184257) + (ae.ar * -1750500129)) {
                return linkedList;
            }
            i13 = ae.al * 2145450683;
            while (true) {
                int i15 = i13;
                if (i15 >= (ae.aq * 800519949) + (ae.al * -861203959)) {
                    break;
                }
                List bc = this.ai[i14][i15].bc(((((this.ai[i14][i15].am * -1854416192) - ((1121682664 * i11) + i)) * ag) / 64) + i5, (i8 + i6) - (((((this.ai[i14][i15].ak * 1181309376) - ((-1910918928 * i12) + i2)) + 701016852) * ag) / 1877235442), ag, i9, i10, -970676113);
                if (!bc.isEmpty()) {
                    linkedList.addAll(bc);
                }
                i13 = i15 + 1;
            }
            i13 = i14 + 1;
        }
    }

    public HashMap bl() {
        as(1954133862);
        return this.aj;
    }

    /* Access modifiers changed, original: 0000 */
    public dd bm(int i, int i2, int i3, int i4) {
        dd ddVar = new dd(this);
        int i5 = this.ap;
        int i6 = this.au;
        i5 = ((i5 * 2003251747) + i) / 64;
        i6 = ((i6 * 1480031565) + i2) / -100763407;
        int i7 = ((this.au * 1480031565) + i4) / 64;
        ddVar.ad = (((((this.ap * 2003251747) + i3) / 64) - i5) + 1) * -1705542401;
        ddVar.aq = ((i7 - i6) + 1) * 529008049;
        ddVar.ar = (i5 - this.ar.ah(-1821916464)) * 95241993;
        ddVar.al = (i6 - this.ar.ay((byte) 24)) * 879762489;
        if (ddVar.ar * 817264441 < 0) {
            ddVar.ad += ddVar.ar * -1243652665;
            ddVar.ar = 0;
        }
        if (ddVar.ar * 817264441 > this.ai.length - (ddVar.ad * 1031961182)) {
            ddVar.ad = (this.ai.length - (ddVar.ar * 817264441)) * -1705542401;
        }
        if (ddVar.al * -861203959 < 0) {
            ddVar.aq += ddVar.al * 199428077;
            ddVar.al = 0;
        }
        if (ddVar.al * 1690830046 > this.ai[0].length - (ddVar.aq * -1208587473)) {
            ddVar.aq = (this.ai[0].length - (ddVar.al * -861203959)) * 370847685;
        }
        ddVar.ad = Math.min(ddVar.ad * -962844060, this.ai.length) * -190690584;
        ddVar.aq = Math.min(ddVar.aq * 334176965, this.ai[0].length) * 370847685;
        return ddVar;
    }

    public boolean bo() {
        return this.ad;
    }

    /* Access modifiers changed, original: 0000 */
    public dd bq(int i, int i2, int i3, int i4) {
        dd ddVar = new dd(this);
        int i5 = this.ap;
        int i6 = this.au;
        i5 = ((i5 * 2003251747) + i) / 64;
        i6 = ((i6 * 1480031565) + i2) / 64;
        int i7 = ((this.au * 1480031565) + i4) / 64;
        ddVar.ad = (((((this.ap * 2003251747) + i3) / 64) - i5) + 1) * -1705542401;
        ddVar.aq = ((i7 - i6) + 1) * 370847685;
        ddVar.ar = (i5 - this.ar.ah(-1821916464)) * 95241993;
        ddVar.al = (i6 - this.ar.ay((byte) -21)) * 879762489;
        if (ddVar.ar * 817264441 < 0) {
            ddVar.ad += ddVar.ar * -1243652665;
            ddVar.ar = 0;
        }
        if (ddVar.ar * 817264441 > this.ai.length - (ddVar.ad * -845184257)) {
            ddVar.ad = (this.ai.length - (ddVar.ar * 817264441)) * -1705542401;
        }
        if (ddVar.al * -861203959 < 0) {
            ddVar.aq += ddVar.al * 199428077;
            ddVar.al = 0;
        }
        if (ddVar.al * -861203959 > this.ai[0].length - (ddVar.aq * 800519949)) {
            ddVar.aq = (this.ai[0].length - (ddVar.al * -861203959)) * 370847685;
        }
        ddVar.ad = Math.min(ddVar.ad * -845184257, this.ai.length) * -1705542401;
        ddVar.aq = Math.min(ddVar.aq * 800519949, this.ai[0].length) * 370847685;
        return ddVar;
    }

    /* Access modifiers changed, original: 0000 */
    public dd bs(int i, int i2, int i3, int i4) {
        dd ddVar = new dd(this);
        int i5 = this.ap;
        int i6 = this.au;
        i5 = ((i5 * 2003251747) + i) / 64;
        i6 = ((i6 * 1480031565) + i2) / 64;
        int i7 = ((this.au * 1480031565) + i4) / 64;
        ddVar.ad = (((((this.ap * 2003251747) + i3) / 64) - i5) + 1) * -1705542401;
        ddVar.aq = ((i7 - i6) + 1) * 370847685;
        ddVar.ar = (i5 - this.ar.ah(-1821916464)) * 95241993;
        ddVar.al = (i6 - this.ar.ay((byte) -12)) * 879762489;
        if (ddVar.ar * 817264441 < 0) {
            ddVar.ad += ddVar.ar * -1243652665;
            ddVar.ar = 0;
        }
        if (ddVar.ar * 817264441 > this.ai.length - (ddVar.ad * -845184257)) {
            ddVar.ad = (this.ai.length - (ddVar.ar * 817264441)) * -1705542401;
        }
        if (ddVar.al * -861203959 < 0) {
            ddVar.aq += ddVar.al * 199428077;
            ddVar.al = 0;
        }
        if (ddVar.al * -861203959 > this.ai[0].length - (ddVar.aq * 800519949)) {
            ddVar.aq = (this.ai[0].length - (ddVar.al * -861203959)) * 370847685;
        }
        ddVar.ad = Math.min(ddVar.ad * -845184257, this.ai.length) * -1705542401;
        ddVar.aq = Math.min(ddVar.aq * 800519949, this.ai[0].length) * 370847685;
        return ddVar;
    }

    /* Access modifiers changed, original: 0000 */
    public float bv(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        float round = (float) Math.round(f);
        return Math.abs(round - f) >= 0.05f ? f : round;
    }
}
