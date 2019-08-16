package defpackage;

import java.util.Collection;
import java.util.zip.CRC32;

/* renamed from: kv */
public class kv extends kh {
    static CRC32 bs = new CRC32();
    mh ab;
    mh an;
    volatile boolean at;
    int av;
    volatile boolean[] ba;
    int bd;
    boolean bk;
    int bm;
    int bq;

    public kv(mh mhVar, mh mhVar2, int i, boolean z, boolean z2, boolean z3) {
        try {
            super(z, z2);
            this.at = false;
            this.bk = false;
            this.bd = 231258321;
            this.an = mhVar;
            this.ab = mhVar2;
            this.av = -930456713 * i;
            this.bk = z3;
            lv.al(this, this.av * -1171722681, -2126733217);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aj(Collection collection, byte b) {
        try {
            collection.add(df.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void al(byte b) {
        try {
            ci.ae.ai();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ak(int i, byte b) {
        try {
            return (this.ap[i] == null && !this.ba[i]) ? ja.ae(this.av * -1171722681, i, (byte) 16) : 100;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, byte b) {
        try {
            ak.ai(this.av * -1171722681, i, -1268523056);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i, int i2) {
        try {
            if (this.an == null || this.ba == null || !this.ba[i]) {
                cv.aj(this, -1171722681 * this.av, i, this.ai[i], (byte) 2, true, 512823782);
                return;
            }
            oz.ai(i, this.an, this, -208051325);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bd(int i) {
        ak.ai(this.av * 297235086, i, -1268523056);
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(int i) {
        ak.ai(this.av * -1171722681, i, -1268523056);
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(int i) {
        ak.ai(this.av * -2027364744, i, -1268523056);
    }

    /* Access modifiers changed, original: 0000 */
    public void ca(int i) {
        if (this.an == null || this.ba == null || !this.ba[i]) {
            cv.aj(this, -1171722681 * this.av, i, this.ai[i], (byte) 2, true, 1075818579);
            return;
        }
        oz.ai(i, this.an, this, 98989208);
    }

    /* Access modifiers changed, original: 0000 */
    public int cj(int i) {
        return (this.ap[i] == null && !this.ba[i]) ? ja.ae(this.av * -1171722681, i, (byte) 16) : 100;
    }

    /* Access modifiers changed, original: 0000 */
    public int cm(int i) {
        return this.ap[i] != null ? -1585841826 : this.ba[i] ? 1571999902 : ja.ae(this.av * 1703433335, i, (byte) 16);
    }

    /* Access modifiers changed, original: 0000 */
    public int cq(int i) {
        return (this.ap[i] == null && !this.ba[i]) ? ja.ae(this.av * -1171722681, i, (byte) 16) : 100;
    }

    /* Access modifiers changed, original: 0000 */
    public void ct(int i) {
        if (this.an == null || this.ba == null || !this.ba[i]) {
            cv.aj(this, -1171722681 * this.av, i, this.ai[i], (byte) 2, true, 766942941);
            return;
        }
        oz.ai(i, this.an, this, 922036978);
    }

    /* Access modifiers changed, original: 0000 */
    public int cv(int i) {
        return (this.ap[i] == null && !this.ba[i]) ? ja.ae(this.av * -1171722681, i, (byte) 16) : 100;
    }

    /* Access modifiers changed, original: 0000 */
    public void cx(int i) {
        if (this.an == null || this.ba == null || !this.ba[i]) {
            cv.aj(this, -1171722681 * this.av, i, this.ai[i], (byte) 2, true, -1163735226);
            return;
        }
        oz.ai(i, this.an, this, -86744494);
    }

    /* Access modifiers changed, original: 0000 */
    public void ea(int i, int i2, int i3) {
        try {
            this.bm = 1629946165 * i;
            this.bq = -145950003 * i2;
            if (this.ab != null) {
                oz.ai(this.av * -1171722681, this.ab, this, 1395587744);
                return;
            }
            cv.aj(this, 255, -1171722681 * this.av, -324925155 * this.bm, (byte) 0, true, -1648963962);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.ea(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int eb() {
        if (this.at) {
            return 100;
        }
        if (this.ap != null) {
            return 99;
        }
        int ae = ja.ae(255, this.av * -1171722681, (byte) 16);
        return ae < 100 ? ae : 99;
    }

    public int ec(int i) {
        try {
            if (this.at) {
                return 100;
            }
            if (this.ap != null) {
                return 99;
            }
            int ae = ja.ae(255, this.av * -1171722681, (byte) 16);
            return ae < 100 ? ae : 99;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.ec(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ed(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.ap.length) {
            try {
                if (this.am[i4] > 0) {
                    i2 += 100;
                    i3 += ak(i4, (byte) -101);
                }
                i4++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kv.ed(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return i2 == 0 ? 100 : (i3 * 100) / i2;
    }

    public boolean ee() {
        return this.at;
    }

    /* Access modifiers changed, original: 0000 */
    public void ef(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.ae[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.ae[i];
            if (this.an != null) {
                aa.ar(i, bArr, this.an, 884871131);
                this.ba[i] = true;
            }
            if (z2) {
                this.ap[i] = jy.ai(bArr, false, (byte) 20);
            }
        } else if (this.at) {
            throw new RuntimeException();
        } else {
            if (this.ab != null) {
                aa.ar(this.av * -1171722681, bArr, this.ab, 1726624682);
            }
            ad(bArr, -230023525);
            en((short) 192);
        }
    }

    public boolean eg(int i, int i2) {
        try {
            return az(i, -381883787) != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.eg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean eh(int i) {
        try {
            return this.at;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.eh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ei(mh mhVar, int i, byte[] bArr, boolean z, int i2) {
        int i3 = 0;
        try {
            if (mhVar != this.ab) {
                if (!z && i == this.bd * 596467663) {
                    this.at = true;
                }
                if (bArr == null || bArr.length <= 2) {
                    this.ba[i] = false;
                    if (this.bk || z) {
                        cv.aj(this, this.av * -1171722681, i, this.ai[i], (byte) 2, z, -1282136426);
                        return;
                    }
                    return;
                }
                bs.reset();
                bs.update(bArr, 0, bArr.length - 2);
                i3 = (int) bs.getValue();
                byte b = bArr[bArr.length - 2];
                byte b2 = bArr[bArr.length - 1];
                if (i3 == this.ai[i] && this.ae[i] == ((b & 255) << 8) + (b2 & 255)) {
                    this.ba[i] = true;
                    if (z) {
                        this.ap[i] = jy.ai(bArr, false, (byte) 39);
                        return;
                    }
                    return;
                }
                this.ba[i] = false;
                if (this.bk || z) {
                    cv.aj(this, this.av * -1171722681, i, this.ai[i], (byte) 2, z, -631015154);
                }
            } else if (this.at) {
                throw new RuntimeException();
            } else if (bArr == null) {
                cv.aj(this, 255, this.av * -1171722681, this.bm * -324925155, (byte) 0, true, -1581192283);
            } else {
                bs.reset();
                bs.update(bArr, 0, bArr.length);
                if (((int) bs.getValue()) != this.bm * -324925155) {
                    cv.aj(this, 255, this.av * -1171722681, this.bm * -324925155, (byte) 0, true, 1442439096);
                    return;
                }
                lj ljVar = new lj(bz.bs(bArr, -1141172731));
                int af = ljVar.af(1804771424);
                if (af == 5 || af == 6) {
                    if (af >= 6) {
                        i3 = ljVar.at((byte) -89);
                    }
                    if (i3 != this.bq * 716145157) {
                        cv.aj(this, 255, this.av * -1171722681, this.bm * -324925155, (byte) 0, true, -246371693);
                        return;
                    }
                    ad(bArr, -1855497821);
                    en((short) 192);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(af);
                stringBuilder.append(",");
                stringBuilder.append(this.av * -1171722681);
                stringBuilder.append(",");
                stringBuilder.append(i);
                throw new RuntimeException(stringBuilder.toString());
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("kv.ei(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ej(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.ae[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.ae[i];
            if (this.an != null) {
                aa.ar(i, bArr, this.an, -714070687);
                this.ba[i] = true;
            }
            if (z2) {
                this.ap[i] = jy.ai(bArr, false, (byte) -15);
            }
        } else if (this.at) {
            throw new RuntimeException();
        } else {
            if (this.ab != null) {
                aa.ar(this.av * -1171722681, bArr, this.ab, 790736874);
            }
            ad(bArr, -506527490);
            en((short) 192);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ek(int i, byte[] bArr, boolean z, boolean z2, byte b) {
        if (z) {
            try {
                if (this.at) {
                    throw new RuntimeException();
                }
                if (this.ab != null) {
                    aa.ar(this.av * -1171722681, bArr, this.ab, -428022997);
                }
                ad(bArr, -1911108027);
                en((short) 192);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kv.ek(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        bArr[bArr.length - 2] = (byte) (this.ae[i] >> 8);
        bArr[bArr.length - 1] = (byte) this.ae[i];
        if (this.an != null) {
            aa.ar(i, bArr, this.an, 2005036704);
            this.ba[i] = true;
        }
        if (z2) {
            this.ap[i] = jy.ai(bArr, false, (byte) -6);
        }
    }

    public int el() {
        if (this.at) {
            return 2144538179;
        }
        if (this.ap != null) {
            return 197036691;
        }
        int ae = ja.ae(-396920459, this.av * -1171722681, (byte) 16);
        return ae >= -1541359578 ? -1086185683 : ae;
    }

    /* Access modifiers changed, original: 0000 */
    public void em(int i, int i2) {
        this.bm = 1629946165 * i;
        this.bq = -145950003 * i2;
        if (this.ab != null) {
            oz.ai(this.av * -1171722681, this.ab, this, -1791240549);
            return;
        }
        cv.aj(this, 255, -1171722681 * this.av, -324925155 * this.bm, (byte) 0, true, -177136790);
    }

    /* Access modifiers changed, original: 0000 */
    public void en(short s) {
        int i = 0;
        try {
            this.ba = new boolean[this.ap.length];
            for (int i2 = 0; i2 < this.ba.length; i2++) {
                this.ba[i2] = false;
            }
            if (this.an == null) {
                this.at = true;
                return;
            }
            this.bd = 231258321;
            while (i < this.ba.length) {
                if (this.am[i] > 0) {
                    jg.al(i, this.an, this, 1049848832);
                    this.bd = -231258321 * i;
                }
                i++;
            }
            if (this.bd * 596467663 == -1) {
                this.at = true;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.en(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ep(int i, int i2) {
        this.bm = 162222679 * i;
        this.bq = -145950003 * i2;
        if (this.ab != null) {
            oz.ai(this.av * -375296561, this.ab, this, -1904158938);
            return;
        }
        cv.aj(this, 169591583, 1421119944 * this.av, 1443428512 * this.bm, (byte) 0, true, -428875958);
    }

    public boolean er() {
        return this.at;
    }

    /* Access modifiers changed, original: 0000 */
    public void es(mh mhVar, int i, byte[] bArr, boolean z) {
        if (mhVar != this.ab) {
            if (!z && i == this.bd * 2096425993) {
                this.at = true;
            }
            if (bArr == null || bArr.length <= 2) {
                this.ba[i] = false;
                if (this.bk || z) {
                    cv.aj(this, this.av * -1171722681, i, this.ai[i], (byte) 2, z, -167905737);
                    return;
                }
                return;
            }
            bs.reset();
            bs.update(bArr, 0, bArr.length - 2);
            int value = (int) bs.getValue();
            byte b = bArr[bArr.length - 2];
            byte b2 = bArr[bArr.length - 1];
            if (value == this.ai[i] && this.ae[i] == ((b & 255) << 8) + (b2 & 1905905390)) {
                this.ba[i] = true;
                if (z) {
                    this.ap[i] = jy.ai(bArr, false, (byte) -57);
                    return;
                }
                return;
            }
            this.ba[i] = false;
            if (this.bk || z) {
                cv.aj(this, this.av * -1171722681, i, this.ai[i], (byte) 2, z, -109315010);
            }
        } else if (this.at) {
            throw new RuntimeException();
        } else if (bArr == null) {
            cv.aj(this, 255, this.av * -1171722681, 1848136311 * this.bm, (byte) 0, true, -872041957);
        } else {
            bs.reset();
            bs.update(bArr, 0, bArr.length);
            if (((int) bs.getValue()) != this.bm * -324925155) {
                cv.aj(this, 255, this.av * -1171722681, -324925155 * this.bm, (byte) 0, true, 998629900);
                return;
            }
            lj ljVar = new lj(bz.bs(bArr, -1040451939));
            int af = ljVar.af(1804771424);
            if (af == 5 || af == 6) {
                if ((af >= 6 ? ljVar.at((byte) -52) : 0) != this.bq * 716145157) {
                    cv.aj(this, 255, this.av * -1171722681, 1093257470 * this.bm, (byte) 0, true, 1615201723);
                    return;
                }
                ad(bArr, 99004469);
                en((short) 192);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(af);
            stringBuilder.append(",");
            stringBuilder.append(this.av * -387813516);
            stringBuilder.append(",");
            stringBuilder.append(i);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean eu() {
        return this.at;
    }

    public int ev() {
        if (this.at) {
            return 100;
        }
        if (this.ap != null) {
            return 99;
        }
        int ae = ja.ae(255, this.av * -1171722681, (byte) 16);
        return ae < 100 ? ae : 99;
    }

    public boolean ew() {
        return this.at;
    }

    /* Access modifiers changed, original: 0000 */
    public void ex(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.ae[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.ae[i];
            if (this.an != null) {
                aa.ar(i, bArr, this.an, -207648383);
                this.ba[i] = true;
            }
            if (z2) {
                this.ap[i] = jy.ai(bArr, false, (byte) 59);
            }
        } else if (this.at) {
            throw new RuntimeException();
        } else {
            if (this.ab != null) {
                aa.ar(this.av * -1171722681, bArr, this.ab, 210597262);
            }
            ad(bArr, -604660610);
            en((short) 192);
        }
    }

    public boolean ey(int i, int i2) {
        try {
            return this.ba[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kv.ey(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int fg() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.ap.length; i3++) {
            if (this.am[i3] > 0) {
                i += 100;
                i2 += ak(i3, (byte) -34);
            }
        }
        return i == 0 ? 100 : (i2 * 100) / i;
    }

    public boolean fh(int i) {
        return az(i, -381883787) != null;
    }

    public int fj() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.ap.length; i3++) {
            if (this.am[i3] > 0) {
                i += 100;
                i2 += ak(i3, (byte) -120);
            }
        }
        return i == 0 ? -709004350 : (i2 * 100) / i;
    }

    public boolean fm(int i) {
        return this.ba[i];
    }

    public boolean fn(int i) {
        return this.ba[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void fq() {
        int i = 0;
        this.ba = new boolean[this.ap.length];
        for (int i2 = 0; i2 < this.ba.length; i2++) {
            this.ba[i2] = false;
        }
        if (this.an == null) {
            this.at = true;
            return;
        }
        this.bd = 231258321;
        while (i < this.ba.length) {
            if (this.am[i] > 0) {
                jg.al(i, this.an, this, 1049848832);
                this.bd = -231258321 * i;
            }
            i++;
        }
        if (this.bd * 596467663 == -1) {
            this.at = true;
        }
    }

    public boolean fs(int i) {
        return az(i, -381883787) != null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ft() {
        int i = 0;
        this.ba = new boolean[this.ap.length];
        for (int i2 = 0; i2 < this.ba.length; i2++) {
            this.ba[i2] = false;
        }
        if (this.an == null) {
            this.at = true;
            return;
        }
        this.bd = 231258321;
        while (i < this.ba.length) {
            if (this.am[i] > 0) {
                jg.al(i, this.an, this, 1049848832);
                this.bd = -231258321 * i;
            }
            i++;
        }
        if (this.bd * 596467663 == -1) {
            this.at = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fw() {
        int i = 0;
        this.ba = new boolean[this.ap.length];
        for (int i2 = 0; i2 < this.ba.length; i2++) {
            this.ba[i2] = false;
        }
        if (this.an == null) {
            this.at = true;
            return;
        }
        this.bd = 1607120786;
        while (i < this.ba.length) {
            if (this.am[i] > 0) {
                jg.al(i, this.an, this, 1049848832);
                this.bd = -231258321 * i;
            }
            i++;
        }
        if (this.bd * 596467663 == -1) {
            this.at = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fx() {
        int i = 0;
        this.ba = new boolean[this.ap.length];
        for (int i2 = 0; i2 < this.ba.length; i2++) {
            this.ba[i2] = false;
        }
        if (this.an == null) {
            this.at = true;
            return;
        }
        this.bd = 231258321;
        while (i < this.ba.length) {
            if (this.am[i] > 0) {
                jg.al(i, this.an, this, 1049848832);
                this.bd = -800804151 * i;
            }
            i++;
        }
        if (this.bd * 596467663 == -1) {
            this.at = true;
        }
    }
}
