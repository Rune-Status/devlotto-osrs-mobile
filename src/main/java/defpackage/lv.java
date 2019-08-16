package defpackage;

import android.support.v4.app.FrameMetricsAggregator;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;

/* renamed from: lv */
public class lv extends lj {
    static final int[] as = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095, 8191, 16383, 32767, SupportMenu.USER_MASK, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, ViewCompat.MEASURED_SIZE_MASK, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    public static final int bh = 64;
    int ag;
    mj ak;

    public lv(int i) {
        try {
            super(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void al(kv kvVar, int i, int i2) {
        try {
            if (cv.ab != null) {
                cv.ab.al = (1551343336 * i) - 104152239;
                kvVar.ea(cv.ab.at((byte) -83), cv.ab.at((byte) -108), -521045747);
                return;
            }
            cv.aj(null, 255, 255, 0, (byte) 0, true, 1139376012);
            kk.av[i] = kvVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bs(String str, String str2, String str3, int i) {
        try {
            hm.cz = str;
            hm.cd = str2;
            hm.cf = str3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int jb(byte b) {
        try {
            byte[] bArr = this.ar;
            int i = this.al - 879823907;
            this.al = i;
            int ad = (bArr[(i * -1631454091) - 1] - this.ak.ad(2131165231)) & 255;
            if (ad < 128) {
                return ad;
            }
            byte[] bArr2 = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return ((ad - 128) << 8) + ((bArr2[(i2 * -1631454091) - 1] - this.ak.ad(2131165231)) & 255);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void jc(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i2) {
            try {
                byte[] bArr2 = this.ar;
                int i5 = this.al - 879823907;
                this.al = i5;
                bArr[i + i4] = (byte) (bArr2[(i5 * -1631454091) - 1] - this.ak.ad(2131165231));
                i4++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("lv.jc(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void je(int[] iArr) {
        this.ak = new mj(iArr);
    }

    public void jh(mj mjVar, byte b) {
        try {
            this.ak = mjVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ji(mj mjVar) {
        this.ak = mjVar;
    }

    public boolean jj(int i) {
        try {
            return ((this.ar[this.al * -1631454091] - this.ak.aq(1500788520)) & 255) >= 128;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int jm(int i, int i2) {
        try {
            int i3 = (this.ag * -1101764463) >> 3;
            int i4 = 8 - ((this.ag * -1101764463) & 7);
            int i5 = 0;
            this.ag += -234071951 * i;
            while (i > i4) {
                i -= i4;
                i5 += (this.ar[i3] & as[i4]) << i;
                i3++;
                i4 = 8;
            }
            if (i4 == i) {
                return (this.ar[i3] & as[i4]) + i5;
            }
            return ((this.ar[i3] >> (i4 - i)) & as[i]) + i5;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void jn(int[] iArr) {
        this.ak = new mj(iArr);
    }

    public void jr(int[] iArr, int i) {
        try {
            this.ak = new mj(iArr);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jr(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void js(int i) {
        try {
            this.al = (((this.ag * -1101764463) + 7) / 8) * -879823907;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.js(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void jt(int i) {
        try {
            this.ag = this.al * -1893384920;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int jx(int i, int i2) {
        try {
            return (i * 8) - (this.ag * -1101764463);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int jy(int i) {
        try {
            byte[] bArr = this.ar;
            int i2 = this.al - 879823907;
            this.al = i2;
            return (bArr[(i2 * -1631454091) - 1] - this.ak.ad(2131165231)) & 255;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void jz(int i, int i2) {
        try {
            byte[] bArr = this.ar;
            int i3 = this.al - 879823907;
            this.al = i3;
            bArr[(i3 * -1631454091) - 1] = (byte) (this.ak.ad(2131165231) + i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lv.jz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void kb() {
        this.ag = this.al * -1451160325;
    }

    public void kc() {
        this.al = (((this.ag * -205028547) + 7) / 8) * 468857897;
    }

    public boolean kg() {
        return ((this.ar[this.al * -1631454091] - this.ak.aq(1500788520)) & 255) >= 128;
    }

    public boolean kh() {
        return ((this.ar[this.al * -1631454091] - this.ak.aq(1500788520)) & 1368724657) >= 128;
    }

    public int kj(int i) {
        return (i * 8) - (this.ag * -1101764463);
    }

    public int kk() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        return (bArr[(i * -1631454091) - 1] - this.ak.ad(2131165231)) & 255;
    }

    public void kl(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr[i + i3] = (byte) (bArr2[(i4 * -1631454091) - 1] - this.ak.ad(2131165231));
        }
    }

    public void km(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al + 448478284;
            this.al = i4;
            bArr[i + i3] = (byte) (bArr2[(i4 * -603552513) - 1] - this.ak.ad(2131165231));
        }
    }

    public int ko(int i) {
        int i2 = (this.ag * 630557008) >> 3;
        int i3 = 8 - ((this.ag * -1101764463) & 7);
        int i4 = 0;
        this.ag += -580866395 * i;
        while (i > i3) {
            i -= i3;
            i4 += (this.ar[i2] & as[i3]) << i;
            i2++;
            i3 = 8;
        }
        if (i3 == i) {
            return (this.ar[i2] & as[i3]) + i4;
        }
        return ((this.ar[i2] >> (i3 - i)) & as[i]) + i4;
    }

    public void kp() {
        this.al = (((this.ag * -1981238487) + 7) / 8) * 1442899159;
    }

    public void kq(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.ar;
            int i4 = this.al - 879823907;
            this.al = i4;
            bArr[i + i3] = (byte) (bArr2[(i4 * -1631454091) - 1] - this.ak.ad(2131165231));
        }
    }

    public int kr(int i) {
        return (i * 8) - (this.ag * -1101764463);
    }

    public void ks() {
        this.ag = this.al * -1893384920;
    }

    public void kt(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (this.ak.ad(2131165231) + i);
    }

    public void ku(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (this.ak.ad(2131165231) + i);
    }

    public boolean kv() {
        return ((this.ar[this.al * -1631454091] - this.ak.aq(1500788520)) & 255) >= 128;
    }

    public void kw(int i) {
        byte[] bArr = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        bArr[(i2 * -1631454091) - 1] = (byte) (this.ak.ad(2131165231) + i);
    }

    public boolean kx() {
        return ((this.ar[this.al * -1631454091] - this.ak.aq(1500788520)) & 255) >= -39671542;
    }

    public int kz() {
        byte[] bArr = this.ar;
        int i = this.al - 879823907;
        this.al = i;
        int ad = (bArr[(i * -1631454091) - 1] - this.ak.ad(2131165231)) & 255;
        if (ad < 128) {
            return ad;
        }
        byte[] bArr2 = this.ar;
        int i2 = this.al - 879823907;
        this.al = i2;
        return ((ad - 128) << 8) + ((bArr2[(i2 * -1631454091) - 1] - this.ak.ad(2131165231)) & 255);
    }
}
