package defpackage;

import java.util.Comparator;

/* renamed from: jq */
public class jq implements Comparator {
    final boolean ad;

    public jq(boolean z) {
        try {
            this.ad = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(eg egVar, eg egVar2, byte b) {
        try {
            return this.ad ? egVar.aq(egVar2, 1201773513) : egVar2.aq(egVar, 1945775880);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((eg) obj, (eg) obj2, (byte) -65);
    }

    /* Access modifiers changed, original: 0000 */
    public int ai(eg egVar, eg egVar2) {
        return this.ad ? egVar.aq(egVar2, 1908655509) : egVar2.aq(egVar, 1837261717);
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(eg egVar, eg egVar2) {
        return this.ad ? egVar.aq(egVar2, 1155505082) : egVar2.aq(egVar, 1020582489);
    }

    /* Access modifiers changed, original: 0000 */
    public int al(eg egVar, eg egVar2) {
        return this.ad ? egVar.aq(egVar2, 2137041203) : egVar2.aq(egVar, 1154767608);
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(eg egVar, eg egVar2) {
        return this.ad ? egVar.aq(egVar2, 1001142061) : egVar2.aq(egVar, 2141803985);
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(eg egVar, eg egVar2) {
        return this.ad ? egVar.aq(egVar2, 1676092245) : egVar2.aq(egVar, 1442889404);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((eg) obj, (eg) obj2, (byte) 51);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jq.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jq.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
