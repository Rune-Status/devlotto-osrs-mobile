package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: nz */
public class nz {
    public static Comparator aj = new nf();
    public static Comparator al = new nt();
    public static Comparator aq = new nm();
    public static Comparator ar = new ng();
    public final List ad;

    static {
        nv nvVar = new nv();
    }

    public nz(lj ljVar, boolean z) {
        byte b = (byte) 1;
        int i = 0;
        try {
            int an = ljVar.an(-1464407032);
            if ((ljVar.af(1804771424) == 1 ? (byte) 1 : (byte) 0) == (byte) 0) {
                b = (byte) 0;
            }
            int an2 = ljVar.an(-1464407032);
            this.ad = new ArrayList(an2);
            while (i < an2) {
                this.ad.add(new nx(ljVar, b, an));
                i++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int al(CharSequence charSequence, byte b) {
        try {
            return kb.ai(charSequence, 10, true, (byte) 54);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nz.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad(Comparator comparator, boolean z, int i) {
        if (z) {
            try {
                Collections.sort(this.ad, comparator);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("nz.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        Collections.sort(this.ad, Collections.reverseOrder(comparator));
    }

    public void aq(Comparator comparator, boolean z) {
        if (z) {
            Collections.sort(this.ad, comparator);
        } else {
            Collections.sort(this.ad, Collections.reverseOrder(comparator));
        }
    }
}
