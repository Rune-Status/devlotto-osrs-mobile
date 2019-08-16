package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: fz */
public class fz implements Iterable, Collection {
    mb ad = new mb();
    mb aq;

    public static void af(mb mbVar, mb mbVar2) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = mbVar2;
        mbVar.gu = mbVar2.gu;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public static void ah(mb mbVar, mb mbVar2) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = mbVar2;
        mbVar.gu = mbVar2.gu;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public static void al(mb mbVar, mb mbVar2) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = mbVar2;
        mbVar.gu = mbVar2.gu;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public static void ay(mb mbVar, mb mbVar2) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = mbVar2;
        mbVar.gu = mbVar2.gu;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public void aa(mb mbVar) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = this.ad;
        mbVar.gu = this.ad.gu;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public mb ab() {
        return ai(null);
    }

    public void ac(mb mbVar) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = this.ad.ge;
        mbVar.gu = this.ad;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public void ad() {
        while (this.ad.gu != this.ad) {
            this.ad.gu.ky();
        }
    }

    public boolean add(Object obj) {
        return ag((mb) obj);
    }

    public boolean addAll(Collection collection) {
        throw new RuntimeException();
    }

    public mb ae() {
        mb mbVar = this.aq;
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ag(mb mbVar) {
        aq(mbVar);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public mb ai(mb mbVar) {
        if (mbVar == null) {
            mbVar = this.ad.gu;
        }
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    public mb aj() {
        return ai(null);
    }

    public boolean ak() {
        return this.ad.gu == this.ad;
    }

    /* Access modifiers changed, original: 0000 */
    public int am() {
        int i = 0;
        for (mb mbVar = this.ad.gu; mbVar != this.ad; mbVar = mbVar.gu) {
            i++;
        }
        return i;
    }

    public mb an() {
        return ai(null);
    }

    public void ao(mb mbVar) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = this.ad;
        mbVar.gu = this.ad.gu;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public void ap() {
        while (this.ad.gu != this.ad) {
            this.ad.gu.ky();
        }
    }

    public void aq(mb mbVar) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = this.ad.ge;
        mbVar.gu = this.ad;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public void ar(mb mbVar) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = this.ad;
        mbVar.gu = this.ad.gu;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    /* Access modifiers changed, original: 0000 */
    public mb[] as() {
        mb[] mbVarArr = new mb[am()];
        int i = 0;
        mb mbVar = this.ad.gu;
        while (mbVar != this.ad) {
            mbVarArr[i] = mbVar;
            mbVar = mbVar.gu;
            i++;
        }
        return mbVarArr;
    }

    public mb at() {
        return ai(null);
    }

    public void au() {
        while (this.ad.gu != this.ad) {
            this.ad.gu.ky();
        }
    }

    public mb av() {
        return ai(null);
    }

    public void aw(mb mbVar) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mbVar.ge = this.ad.ge;
        mbVar.gu = this.ad;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
    }

    public void ax() {
        while (this.ad.gu != this.ad) {
            this.ad.gu.ky();
        }
    }

    public void az() {
        while (this.ad.gu != this.ad) {
            this.ad.gu.ky();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public mb ba(mb mbVar) {
        if (mbVar == null) {
            mbVar = this.ad.gu;
        }
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    /* Access modifiers changed, original: 0000 */
    public int bb() {
        int i = 0;
        for (mb mbVar = this.ad.gu; mbVar != this.ad; mbVar = mbVar.gu) {
            i++;
        }
        return i;
    }

    public boolean bc() {
        return this.ad.gu == this.ad;
    }

    public mb bd() {
        mb mbVar = this.aq;
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    public boolean be(Object obj) {
        throw new RuntimeException();
    }

    /* Access modifiers changed, original: 0000 */
    public int bf() {
        int i = 0;
        for (mb mbVar = this.ad.gu; mbVar != this.ad; mbVar = mbVar.gu) {
            i++;
        }
        return i;
    }

    public int bg() {
        return am();
    }

    public Object[] bh(Object[] objArr) {
        mb mbVar = this.ad.gu;
        int i = 0;
        while (mbVar != this.ad) {
            objArr[i] = mbVar;
            mbVar = mbVar.gu;
            i++;
        }
        return objArr;
    }

    public boolean bi() {
        return this.ad.gu == this.ad;
    }

    public Object[] bj() {
        return as();
    }

    /* Access modifiers changed, original: 0000 */
    public mb bk(mb mbVar) {
        if (mbVar == null) {
            mbVar = this.ad.gu;
        }
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    /* Access modifiers changed, original: 0000 */
    public int bl() {
        int i = 0;
        for (mb mbVar = this.ad.gu; mbVar != this.ad; mbVar = mbVar.gu) {
            i++;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public mb bm(mb mbVar) {
        if (mbVar == null) {
            mbVar = this.ad.gu;
        }
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    public Object[] bn(Object[] objArr) {
        mb mbVar = this.ad.gu;
        int i = 0;
        while (mbVar != this.ad) {
            objArr[i] = mbVar;
            mbVar = mbVar.gu;
            i++;
        }
        return objArr;
    }

    public mb bo() {
        mb mbVar = this.aq;
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    public boolean bp(Object obj) {
        throw new RuntimeException();
    }

    public mb bq() {
        mb mbVar = this.aq;
        if (mbVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mbVar.gu;
        return mbVar;
    }

    public boolean br(Object obj) {
        throw new RuntimeException();
    }

    public Iterator bs() {
        return new fa(this);
    }

    public Object[] bt(Object[] objArr) {
        mb mbVar = this.ad.gu;
        int i = 0;
        while (mbVar != this.ad) {
            objArr[i] = mbVar;
            mbVar = mbVar.gu;
            i++;
        }
        return objArr;
    }

    public boolean bu() {
        return ak();
    }

    /* Access modifiers changed, original: 0000 */
    public mb[] bv() {
        mb[] mbVarArr = new mb[am()];
        mb mbVar = this.ad.gu;
        int i = 0;
        while (mbVar != this.ad) {
            mbVarArr[i] = mbVar;
            mbVar = mbVar.gu;
            i++;
        }
        return mbVarArr;
    }

    public boolean bw(Object obj) {
        throw new RuntimeException();
    }

    public int bx() {
        return am();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean by(mb mbVar) {
        aq(mbVar);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bz(mb mbVar) {
        aq(mbVar);
        return true;
    }

    public boolean cb(Object obj) {
        return ag((mb) obj);
    }

    public boolean ce(Object obj) {
        return ag((mb) obj);
    }

    public boolean ci(Object obj) {
        return ag((mb) obj);
    }

    public boolean cj(Collection collection) {
        throw new RuntimeException();
    }

    public void clear() {
        ad();
    }

    public boolean cm(Collection collection) {
        throw new RuntimeException();
    }

    public void cn() {
        ad();
    }

    public boolean contains(Object obj) {
        throw new RuntimeException();
    }

    public boolean containsAll(Collection collection) {
        throw new RuntimeException();
    }

    public void cp() {
        ad();
    }

    public boolean cq(Collection collection) {
        throw new RuntimeException();
    }

    public boolean cv(Collection collection) {
        throw new RuntimeException();
    }

    public void cw() {
        ad();
    }

    public boolean cy(Object obj) {
        return ag((mb) obj);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fz.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ff() {
        return super.hashCode();
    }

    public int fr() {
        return super.hashCode();
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        try {
            return super.hashCode();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fz.hashCode(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean isEmpty() {
        return ak();
    }

    public Iterator iterator() {
        return new fa(this);
    }

    public boolean remove(Object obj) {
        throw new RuntimeException();
    }

    public boolean removeAll(Collection collection) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection collection) {
        throw new RuntimeException();
    }

    public int size() {
        return am();
    }

    public Object[] toArray() {
        return as();
    }

    public Object[] toArray(Object[] objArr) {
        mb mbVar = this.ad.gu;
        int i = 0;
        while (mbVar != this.ad) {
            objArr[i] = mbVar;
            mbVar = mbVar.gu;
            i++;
        }
        return objArr;
    }
}
