package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.jagex.oldscape.osrenderer.ad;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

/* renamed from: bn */
public class bn implements Runnable {
    static final float ad = 0.8f;
    static bn aq = null;
    static final int as = 3;
    static kv cd;
    mo ac;
    public long ae;
    LinkedList ag;
    mo ai;
    volatile float aj;
    boolean ak;
    volatile boolean al;
    Object am;
    SynchronousQueue ap;
    volatile boolean ar;
    int[] au;
    int[] aw;
    int[] ax;
    int[][] az;

    bn() {
        try {
            this.ar = true;
            this.al = true;
            this.aj = ad;
            this.ai = new mo(Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            this.ak = false;
            this.ag = new LinkedList();
            this.ap = new SynchronousQueue();
            this.ac = new mo(Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            ad.aq(12126077);
            at.ae = true;
            ae((byte) -30);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static bn af() {
        synchronized (bn.class) {
            try {
                if (aq == null) {
                    aq = new bn();
                }
                bn bnVar = aq;
                return bnVar;
            } finally {
                Object obj = bn.class;
            }
        }
    }

    public static void ai(Collection collection, int i) {
        try {
            collection.add(dz.ar);
            collection.add(dz.al);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dk aq(int i, byte b) {
        try {
            long j = (long) i;
            dk dkVar = (dk) dk.ar.ad(j);
            if (dkVar == null) {
                byte[] ar = dk.ad.ar(16, i, 1452175390);
                dkVar = new dk();
                if (ar != null) {
                    dkVar.ar(new lj(ar), (byte) -18);
                }
                dk.ar.ar(dkVar, j);
            }
            return dkVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ax(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i2;
        int i9 = i;
        for (int i10 = -i4; i10 < 0; i10++) {
            int i11 = (i8 + i3) - 3;
            while (i8 < i11) {
                int i12 = i8 + 1;
                int i13 = i9 + 1;
                iArr[i8] = iArr2[i9];
                i9 = i12 + 1;
                i8 = i13 + 1;
                iArr[i12] = iArr2[i13];
                i12 = i9 + 1;
                i13 = i8 + 1;
                iArr[i9] = iArr2[i8];
                i8 = i12 + 1;
                i9 = i13 + 1;
                iArr[i12] = iArr2[i13];
            }
            while (i8 < i11 + 3) {
                iArr[i8] = iArr2[i9];
                i8++;
                i9++;
            }
            i8 += i5;
            i9 += i6;
        }
    }

    /* Access modifiers changed, original: final */
    public final void aa(int i) {
        try {
            Object au = au(1893062646);
            if (au != null) {
                if (this.ak) {
                    ad.am((byte) 119);
                    this.ak = false;
                } else {
                    ad.ar(au, -433683967);
                    this.ak = true;
                }
            }
            if (this.ak) {
                ac(-1850798916);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ab(float f) {
        this.aj = f;
        ((cv) il.ax).at((double) this.aj);
        at.ae = true;
    }

    /* Access modifiers changed, original: final */
    public final void ac(int i) {
        try {
            int[] iArr;
            int[][] iArr2;
            int[][] iArr3 = (int[][]) null;
            synchronized (this) {
                if (this.au != null) {
                    int[] iArr4 = this.au;
                    this.au = null;
                    iArr = iArr4;
                } else {
                    iArr = null;
                }
                if (this.az != null) {
                    iArr2 = this.az;
                    this.az = (int[][]) null;
                } else {
                    iArr2 = iArr3;
                }
            }
            if (iArr != null) {
                ad.aa(iArr, 1758560974);
            }
            if (iArr2 != null) {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    if (iArr2[i2] != null) {
                        ad.ac(i2, iArr2[i2], 1726631635);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad() {
        while (this.ar) {
            ah(574159793);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ae(byte b) {
        int i = 0;
        while (i < 3) {
            try {
                this.ag.add(new an());
                i++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bn.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b A:{Splitter:B:0:0x0000, ExcHandler: RuntimeException (r0_6 'e' java.lang.RuntimeException)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:5:0x001b, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:6:0x001c, code skipped:
            r1 = new java.lang.StringBuilder();
            r1.append("bn.ag(");
            r1.append(')');
     */
    /* JADX WARNING: Missing block: B:7:0x0033, code skipped:
            throw defpackage.mv.aq(r0, r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final an ag(an anVar, int i) {
        while (true) {
            try {
                this.ac.ad((long) anVar.ai(-1943803301));
                this.ap.put(anVar);
                while (true) {
                    break;
                }
            } catch (InterruptedException e) {
            } catch (RuntimeException e2) {
            }
        }
        return (an) this.ap.take();
    }

    public final void ah(int i) {
        try {
            ad.ak((byte) 111);
            aa(720485367);
            if (this.ak) {
                aw(1242227905);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ai(int i) {
        try {
            ad.ar(null, -433683967);
            ad.an(-37280785);
            this.ak = true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(int i) {
        try {
            ed.bd((double) this.aj);
            synchronized (this) {
                this.au = Arrays.copyOf(bl.az, bl.az.length);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(bg bgVar, int i) {
        try {
            if (this.ax != null) {
                int ae = bgVar.ae(-2107537282);
                for (int i2 = 0; i2 < ae; i2++) {
                    bx ad = bgVar.ad(i2, -1256480433);
                    if (ad != null) {
                        this.ax[i2] = ad.au / 2;
                        this.aw[i2] = ad.az / 2;
                    }
                }
                ad.bm(ae, this.ax, this.aw, 2146553641);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void al(float f, int i) {
        try {
            this.aj = f;
            ((cv) il.ax).at((double) this.aj);
            at.ae = true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean am(bg bgVar, byte b) {
        boolean z;
        synchronized (this) {
            try {
                this.az = bgVar.aq(-1866440691);
                if (this.az == null) {
                    z = false;
                } else {
                    this.ax = new int[this.az.length];
                    this.aw = new int[this.az.length];
                    z = true;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bn.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return z;
    }

    public final void an(float f) {
        this.aj = f;
        ((cv) il.ax).at((double) this.aj);
        at.ae = true;
    }

    public void ao(boolean z, int i) {
        try {
            this.al = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ap(an anVar, int i) {
        try {
            if (this.ag.size() < 3) {
                this.ag.add(anVar);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aq() {
        while (this.ar) {
            ah(371762457);
        }
    }

    public an as(int i) {
        try {
            return (an) this.ag.removeFirst();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void at() {
        ad.ar(null, -433683967);
        ad.an(-1831783666);
        this.ak = true;
    }

    /* Access modifiers changed, original: final */
    public final Object au(int i) {
        Object obj = null;
        synchronized (this) {
            try {
                if (this.am != null) {
                    obj = this.am;
                    this.am = null;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bn.au(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return obj;
    }

    /* Access modifiers changed, original: final */
    public final void av() {
        ed.bd((double) this.aj);
        synchronized (this) {
            this.au = Arrays.copyOf(bl.az, bl.az.length);
        }
    }

    /* Access modifiers changed, original: final */
    public final void aw(int i) {
        try {
            an az = az(-882052397);
            if (az != null) {
                System.nanoTime();
                az.al(-675414203);
                ax(1401258646);
                az.aj(this.al, (byte) -117);
                ap(az, 1697363169);
                this.ai.ad(az.as * 7736195914922860921L);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bn.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ax(int i) {
        while (true) {
            try {
                this.ap.put(this.ag.removeFirst());
                return;
            } catch (InterruptedException e) {
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bn.ax(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    public final void ay(float f) {
        this.aj = f;
        ((cv) il.ax).at((double) this.aj);
        at.ae = true;
    }

    /* Access modifiers changed, original: final */
    public final an az(int i) {
        while (true) {
            try {
                return (an) this.ap.take();
            } catch (InterruptedException e) {
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bn.az(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ba() {
        for (int i = 0; i < 3; i++) {
            this.ag.add(new an());
        }
    }

    public an bb() {
        return (an) this.ag.removeFirst();
    }

    public final an bc(an anVar) {
        while (true) {
            try {
                this.ac.ad((long) anVar.ai(-2110444777));
                this.ap.put(anVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (an) this.ap.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (an) this.ap.take();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bd(bg bgVar) {
        boolean z;
        synchronized (this) {
            this.az = bgVar.aq(-1866440691);
            if (this.az == null) {
                z = false;
            } else {
                this.ax = new int[this.az.length];
                this.aw = new int[this.az.length];
                z = true;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    public final void be() {
        while (true) {
            try {
                this.ap.put(this.ag.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    public an bf() {
        return (an) this.ag.removeFirst();
    }

    /* Access modifiers changed, original: final */
    public final void bg(an anVar) {
        if (this.ag.size() < 3) {
            this.ag.add(anVar);
        }
    }

    /* Access modifiers changed, original: final */
    public final void bh() {
        an az = az(605575136);
        if (az != null) {
            System.nanoTime();
            az.al(-675414203);
            ax(1401258646);
            az.aj(this.al, (byte) -106);
            ap(az, 2124194159);
            this.ai.ad(az.as * 7736195914922860921L);
        }
    }

    public final an bi(an anVar) {
        while (true) {
            try {
                this.ac.ad((long) anVar.ai(-1969030892));
                this.ap.put(anVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (an) this.ap.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (an) this.ap.take();
    }

    /* Access modifiers changed, original: final */
    public final void bj() {
        while (true) {
            try {
                this.ap.put(this.ag.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    public final void bk() {
        ad.ar(null, -433683967);
        ad.an(1106974063);
        this.ak = true;
    }

    public an bl() {
        return (an) this.ag.removeFirst();
    }

    /* Access modifiers changed, original: final */
    public final void bm() {
        for (int i = 0; i < 3; i++) {
            this.ag.add(new an());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bn() {
        int[] iArr;
        int[][] iArr2;
        int[][] iArr3 = (int[][]) null;
        synchronized (this) {
            if (this.au != null) {
                int[] iArr4 = this.au;
                this.au = null;
                iArr = iArr4;
            } else {
                iArr = null;
            }
            if (this.az != null) {
                iArr2 = this.az;
                this.az = (int[][]) null;
            } else {
                iArr2 = iArr3;
            }
        }
        if (iArr != null) {
            ad.aa(iArr, 1671330730);
        }
        if (iArr2 != null) {
            for (int i = 0; i < iArr2.length; i++) {
                if (iArr2[i] != null) {
                    ad.ac(i, iArr2[i], 893068205);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(bg bgVar) {
        if (this.ax != null) {
            int ae = bgVar.ae(986686101);
            for (int i = 0; i < ae; i++) {
                bx ad = bgVar.ad(i, 1096145417);
                if (ad != null) {
                    this.ax[i] = ad.au / 2;
                    this.aw[i] = ad.az / 2;
                }
            }
            ad.bm(ae, this.ax, this.aw, 2133891203);
        }
    }

    public void bp(boolean z) {
        this.al = z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bq(bg bgVar) {
        synchronized (this) {
            this.az = bgVar.aq(-1866440691);
            if (this.az == null) {
                return false;
            }
            this.ax = new int[this.az.length];
            this.aw = new int[this.az.length];
            return true;
        }
    }

    /* Access modifiers changed, original: final */
    public final an br() {
        while (true) {
            try {
                break;
            } catch (InterruptedException e) {
            }
        }
        return (an) this.ap.take();
    }

    /* Access modifiers changed, original: final */
    public final void bs() {
        for (int i = 0; i < 3; i++) {
            this.ag.add(new an());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bt() {
        int[] iArr;
        int[][] iArr2;
        int[][] iArr3 = (int[][]) null;
        synchronized (this) {
            if (this.au != null) {
                int[] iArr4 = this.au;
                this.au = null;
                iArr = iArr4;
            } else {
                iArr = null;
            }
            if (this.az != null) {
                iArr2 = this.az;
                this.az = (int[][]) null;
            } else {
                iArr2 = iArr3;
            }
        }
        if (iArr != null) {
            ad.aa(iArr, 1528760163);
        }
        if (iArr2 != null) {
            for (int i = 0; i < iArr2.length; i++) {
                if (iArr2[i] != null) {
                    ad.ac(i, iArr2[i], -1772141652);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bu(an anVar) {
        if (this.ag.size() < 3) {
            this.ag.add(anVar);
        }
    }

    public final an bv(an anVar) {
        while (true) {
            try {
                this.ac.ad((long) anVar.ai(-2033933199));
                this.ap.put(anVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (an) this.ap.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (an) this.ap.take();
    }

    /* Access modifiers changed, original: final */
    public final Object bw() {
        Object obj = null;
        synchronized (this) {
            if (this.am != null) {
                obj = this.am;
                this.am = null;
            }
        }
        return obj;
    }

    /* Access modifiers changed, original: final */
    public final void bx(an anVar) {
        if (this.ag.size() < 3) {
            this.ag.add(anVar);
        }
    }

    /* Access modifiers changed, original: final */
    public final void by() {
        Object au = au(581400309);
        if (au != null) {
            if (this.ak) {
                ad.am((byte) 14);
                this.ak = false;
            } else {
                ad.ar(au, -433683967);
                this.ak = true;
            }
        }
        if (this.ak) {
            ac(-1850798916);
        }
    }

    /* Access modifiers changed, original: final */
    public final void bz() {
        int[] iArr;
        int[][] iArr2;
        int[][] iArr3 = (int[][]) null;
        synchronized (this) {
            if (this.au != null) {
                int[] iArr4 = this.au;
                this.au = null;
                iArr = iArr4;
            } else {
                iArr = null;
            }
            if (this.az != null) {
                iArr2 = this.az;
                this.az = (int[][]) null;
            } else {
                iArr2 = iArr3;
            }
        }
        if (iArr != null) {
            ad.aa(iArr, 1138002537);
        }
        if (iArr2 != null) {
            for (int i = 0; i < iArr2.length; i++) {
                if (iArr2[i] != null) {
                    ad.ac(i, iArr2[i], -106055872);
                }
            }
        }
    }

    public final void cj() {
        ad.ak((byte) 52);
        aa(761089881);
        if (this.ak) {
            aw(329640632);
        }
    }

    public final void cm() {
        ad.ak((byte) 108);
        aa(635177620);
        if (this.ak) {
            aw(1296693576);
        }
    }

    public void cv(boolean z) {
        this.al = z;
    }

    public void run() {
        while (this.ar) {
            try {
                ah(-1600733248);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bn.run(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }
}
