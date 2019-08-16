package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: jv */
public class jv {
    static final int ad = 2;
    static final String aq = "2";
    public static final int bb = 48;
    public static final int ce = 85;
    long ae;
    boolean ai;
    @Deprecated
    String[] aj;
    Map al;
    boolean[] ar;

    jv() {
        int i = 0;
        try {
            this.ai = false;
            int ax = bn.cd.ax(19, (byte) 117);
            this.al = new HashMap();
            this.ar = new boolean[ax];
            for (int i2 = 0; i2 < ax; i2++) {
                this.ar[i2] = mw.aq(i2, -1137916491).ar;
            }
            if (bn.cd.eg(15, 394798477)) {
                i = bn.cd.ax(15, (byte) 9);
            }
            this.aj = new String[i];
            as(766454905);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bo(int i) {
        try {
            if (ce.rm == null) {
                ce.rm = new ArrayList(100);
            }
            ce.rm.clear();
            gn.ai(ce.rm, -2120827286);
            ho.ak(ce.rm, (byte) 17);
            kv.aj(ce.rm, (byte) -15);
            dj.ax(ce.rm, (byte) -16);
            hz.ap(ce.rm, 1115994735);
            ap.ay(ce.rm, -1826743065);
            bi.ap(ce.rm, 902629948);
            bn.ai(ce.rm, -136812494);
            lq.aj(ce.rm, 389876483);
            fs.aj(ce.rm, 1369890842);
            li.ap(ce.rm, -862446793);
            du.ae(ce.rm, 1866452054);
            ct.am(ce.rm, (short) 20956);
            av.ae(ce.rm, (byte) 38);
            cq.ak(ce.rm, (byte) 54);
            gp.as(ce.rm, -1466527981);
            ey.aw(ce.rm, -1760327165);
            ce.rm.add(hw.ad);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aa(int i) {
        Object obj = this.al.get(Integer.valueOf(i));
        return obj instanceof Integer ? ((Integer) obj).intValue() : -1;
    }

    /* Access modifiers changed, original: 0000 */
    @Deprecated
    public void ab(int i, String str) {
        this.aj[i] = str;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(int i, int i2) {
        this.al.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.ar[i]) {
            this.ai = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i, int i2, int i3) {
        try {
            this.al.put(Integer.valueOf(i), Integer.valueOf(i2));
            if (this.ar[i]) {
                this.ai = true;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(byte b) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.ar.length) {
            try {
                if (!this.ar[i2]) {
                    this.al.remove(Integer.valueOf(i2));
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jv.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        while (i < this.aj.length) {
            this.aj[i] = null;
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af(int i, String str) {
        this.al.put(Integer.valueOf(i), str);
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(int i) {
        try {
            if (this.ai && this.ae * -7397544156856482855L < gq.ad((byte) -63) - 60000) {
                ak((byte) 111);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(int i, String str) {
        this.al.put(Integer.valueOf(i), str);
    }

    /* Access modifiers changed, original: 0000 */
    @Deprecated
    public String ai(int i, byte b) {
        try {
            return this.aj[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    @Deprecated
    public void aj(int i, String str, byte b) {
        try {
            this.aj[i] = str;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c A:{Catch:{ Exception -> 0x00af, all -> 0x00e0, RuntimeException -> 0x00e8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c A:{Catch:{ Exception -> 0x00af, all -> 0x00e0, RuntimeException -> 0x00e8 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ak(byte b) {
        int e = null;
        int i = 632522373;
        oq am;
        try {
            Entry entry;
            Object value;
            boolean z;
            am = am(true, 632522373);
            Iterator it = this.al.entrySet().iterator();
            if (it.hasNext()) {
                entry = (Entry) it.next();
                if (this.ar[((Integer) entry.getKey()).intValue()]) {
                    boolean z2;
                    value = entry.getValue();
                    boolean z3 = z + 3;
                    if (value instanceof Integer) {
                        z2 = z3 + 4;
                    } else {
                        z = value instanceof String;
                        if (z) {
                            e = (String) value;
                        } else {
                            z2 = z3;
                        }
                    }
                    i++;
                    z = z2;
                    if (it.hasNext()) {
                    }
                }
                if (it.hasNext()) {
                }
            }
            it = new lj((int) z);
            it.al(2, -1098299300);
            it.aj(i, 1003226667);
            i = this.al.entrySet().iterator();
            while (i.hasNext()) {
                entry = (Entry) i.next();
                int intValue = ((Integer) entry.getKey()).intValue();
                z = this.ar[intValue];
                if (z) {
                    it.aj(intValue, -511147124);
                    value = entry.getValue();
                    z = true;
                    it.al(oz.ar(value.getClass(), -1871045675).aj * -44489751, -958786249);
                    oz.ae(value, it, (byte) 4);
                }
            }
            i = it.al * -1631454091;
            z = true;
            am.aq(it.ar, 0, i, 1994740801);
            am.ar(-282277928);
        } catch (Exception e2) {
            e = e2;
            try {
                am.ar(e);
            } catch (Exception e3) {
            }
            this.ai = false;
            this.ae = gq.ad((byte) -54) * -8855003767225660311L;
        } catch (RuntimeException e4) {
            e = e4;
            i = "jv.ak(";
            new StringBuilder().append(i);
            throw e;
        } finally {
            try {
                am.ar(-276172215);
            } catch (Exception e5) {
            }
        }
        this.ai = false;
        this.ae = gq.ad((byte) -54) * -8855003767225660311L;
    }

    /* Access modifiers changed, original: 0000 */
    public String al(int i, int i2) {
        try {
            Object obj = this.al.get(Integer.valueOf(i));
            return obj instanceof String ? (String) obj : "";
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public oq am(boolean z, int i) {
        try {
            return iz.aq(aq, ne.ae.ae, z, (byte) 62);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String an(int i) {
        Object obj = this.al.get(Integer.valueOf(i));
        return obj instanceof String ? (String) obj : "";
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(int i, String str) {
        this.al.put(Integer.valueOf(i), str);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ap(int i) {
        try {
            return this.ai;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(int i, int i2) {
        try {
            Object obj = this.al.get(Integer.valueOf(i));
            return obj instanceof Integer ? ((Integer) obj).intValue() : -1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i, String str, byte b) {
        try {
            this.al.put(Integer.valueOf(i), str);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jv.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016 A:{Catch:{ Exception -> 0x002a, all -> 0x00f7, RuntimeException -> 0x00ff }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void as(int i) {
        Map map = 2;
        int e = 0;
        byte b = (byte) 0;
        oq am;
        int i2;
        try {
            int i3;
            am = am(false, -44370603);
            int i4 = new byte[((int) am.aj(b))];
            i2 = e;
            int length = i4.length;
            if (i2 >= length) {
                i3 = 1369796120;
                length = am.ai(i4, i2, i4.length - i2, 1369796120);
                if (i3 != length) {
                    i2 += length;
                    int length2 = i4.length;
                    if (i2 >= length2) {
                    }
                }
                throw new EOFException();
            }
            length2 = new lj((byte[]) i4);
            i3 = -1631454091;
            i4 = 1;
            if (length2.ar.length - (length2.al * -1631454091) < 1) {
                try {
                    am.ar(-654713534);
                    return;
                } catch (Exception e2) {
                    return;
                }
            }
            i2 = length2.af(1804771424);
            if (i2 < 0 || i2 > map) {
                try {
                    am.ar(-1303811547);
                    return;
                } catch (Exception e3) {
                    return;
                }
            }
            if (i2 >= map) {
                i4 = length2.an(-1464407032);
                for (i2 = e; i2 < i4; i2++) {
                    i3 = length2.an(-1464407032);
                    Object ak = ((oz) oz.ad(oz.aq(1707641523), length2.af(1804771424), (byte) 18)).ak((lj) length2, 956206685);
                    map = this.ar[i3];
                    if (map != null) {
                        map = this.al;
                        i3 = Integer.valueOf(i3);
                        map.put(i3, ak);
                    }
                }
            } else {
                i4 = length2.an(-1464407032);
                for (i2 = e; i2 < i4; i2++) {
                    i3 = length2.an(-1464407032);
                    map = length2.at((byte) -75);
                    if (this.ar[i3]) {
                        Map map2 = this.al;
                        i3 = Integer.valueOf(i3);
                        map = Integer.valueOf(map);
                        map2.put(i3, map);
                    }
                }
                i2 = length2.an(-1464407032);
                while (e < i2) {
                    length2.an(-1464407032);
                    i4 = 2070796384;
                    length2.bm(2070796384);
                    e++;
                }
            }
            am.ar(-1099434373);
            this.ai = false;
        } catch (Exception e4) {
            e = e4;
            try {
                am.ar(e);
            } catch (Exception e5) {
            }
            this.ai = false;
        } catch (RuntimeException e6) {
            e = e6;
            am = "jv.as(";
            new StringBuilder().append(am);
            throw e;
        } finally {
            i2 = -1339231037;
            try {
                am.ar(-1339231037);
            } catch (Exception e7) {
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    @Deprecated
    public String at(int i) {
        return this.aj[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i, int i2) {
        this.al.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.ar[i]) {
            this.ai = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    @Deprecated
    public String av(int i) {
        return this.aj[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(int i, int i2) {
        this.al.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.ar[i]) {
            this.ai = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2) {
        this.al.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.ar[i]) {
            this.ai = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String ay(int i) {
        Object obj = this.al.get(Integer.valueOf(i));
        return obj instanceof String ? (String) obj : "";
    }

    /* Access modifiers changed, original: 0000 */
    public void az(int i, int i2) {
        this.al.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.ar[i]) {
            this.ai = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ba() {
        int i = 0;
        for (int i2 = 0; i2 < this.ar.length; i2++) {
            if (!this.ar[i2]) {
                this.al.remove(Integer.valueOf(i2));
            }
        }
        while (i < this.aj.length) {
            this.aj[i] = null;
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bb() {
        return this.ai;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c A:{Catch:{ Exception -> 0x00af, all -> 0x00da }} */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c A:{Catch:{ Exception -> 0x00af, all -> 0x00da }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bd() {
        int e;
        oq am = am(true, 623869408);
        try {
            Entry entry;
            Object value;
            int i;
            Iterator it = this.al.entrySet().iterator();
            int i2 = 0;
            int i3 = 3;
            if (it.hasNext()) {
                entry = (Entry) it.next();
                if (this.ar[((Integer) entry.getKey()).intValue()]) {
                    value = entry.getValue();
                    i = i3 + 3;
                    e = !(value instanceof Integer) ? value instanceof String ? (String) value : i : i + 4;
                    i2++;
                    i3 = e;
                    if (it.hasNext()) {
                    }
                }
                if (it.hasNext()) {
                }
            }
            it = new lj(i3);
            it.al(2, -1427224219);
            it.aj(i2, -630359081);
            i2 = this.al.entrySet().iterator();
            while (i2.hasNext()) {
                entry = (Entry) i2.next();
                i = ((Integer) entry.getKey()).intValue();
                if (this.ar[i]) {
                    it.aj(i, 2043879731);
                    value = entry.getValue();
                    it.al(oz.ar(value.getClass(), -2092895969).aj * -44489751, -123058174);
                    oz.ae(value, it, (byte) 4);
                }
            }
            i2 = it.al * -1631454091;
            am.aq(it.ar, 0, i2, 212748389);
            e = -330674525;
        } catch (Exception e2) {
            e = e2;
        } finally {
            try {
                am.ar(499768893);
            } catch (Exception e3) {
            }
        }
        try {
            am.ar(e);
        } catch (Exception e4) {
        }
        this.ai = false;
        this.ae = gq.ad((byte) -105) * -8855003767225660311L;
    }

    /* Access modifiers changed, original: 0000 */
    public void bf() {
        if (this.ai && this.ae * -7397544156856482855L < gq.ad((byte) 6) - 60000) {
            ak((byte) 51);
        }
    }

    /* Access modifiers changed, original: 0000 */
    @Deprecated
    public String bk(int i) {
        return this.aj[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void bl() {
        if (this.ai && this.ae * -7397544156856482855L < gq.ad((byte) 5) - 60000) {
            ak((byte) 24);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public oq bm(boolean z) {
        return iz.aq(aq, ne.ae.ae, z, (byte) 33);
    }

    /* Access modifiers changed, original: 0000 */
    public void bo() {
        if (this.ai && this.ae * -7397544156856482855L < gq.ad((byte) 33) - 60000) {
            ak((byte) 61);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c A:{Catch:{ Exception -> 0x00af, all -> 0x00da }} */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c A:{Catch:{ Exception -> 0x00af, all -> 0x00da }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bq() {
        int e;
        oq am = am(true, -413490500);
        try {
            Entry entry;
            Object value;
            int i;
            Iterator it = this.al.entrySet().iterator();
            int i2 = 0;
            int i3 = 3;
            if (it.hasNext()) {
                entry = (Entry) it.next();
                if (this.ar[((Integer) entry.getKey()).intValue()]) {
                    value = entry.getValue();
                    i = i3 + 3;
                    e = !(value instanceof Integer) ? value instanceof String ? (String) value : i : i + 4;
                    i2++;
                    i3 = e;
                    if (it.hasNext()) {
                    }
                }
                if (it.hasNext()) {
                }
            }
            it = new lj(i3);
            it.al(2, -170792165);
            it.aj(i2, -937168468);
            i2 = this.al.entrySet().iterator();
            while (i2.hasNext()) {
                entry = (Entry) i2.next();
                i = ((Integer) entry.getKey()).intValue();
                if (this.ar[i]) {
                    it.aj(i, 63014028);
                    value = entry.getValue();
                    it.al(oz.ar(value.getClass(), -2084013366).aj * -1164288475, -988643339);
                    oz.ae(value, it, (byte) 4);
                }
            }
            i2 = it.al * 1072837121;
            am.aq(it.ar, 0, i2, 1621303325);
            e = -1783556597;
        } catch (Exception e2) {
            e = e2;
        } finally {
            try {
                am.ar(-1481909565);
            } catch (Exception e3) {
            }
        }
        try {
            am.ar(e);
        } catch (Exception e4) {
        }
        this.ai = false;
        this.ae = gq.ad((byte) -67) * -8855003767225660311L;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs() {
        int i = 0;
        for (int i2 = 0; i2 < this.ar.length; i2++) {
            if (!this.ar[i2]) {
                this.al.remove(Integer.valueOf(i2));
            }
        }
        while (i < this.aj.length) {
            this.aj[i] = null;
            i++;
        }
    }
}
