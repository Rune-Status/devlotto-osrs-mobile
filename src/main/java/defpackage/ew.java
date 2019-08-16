package defpackage;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

/* renamed from: ew */
public abstract class ew {
    static final int ap = 128;
    static final int ay = 30;
    static final int fq = 4700;
    static final int ti = 20;

    ew() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ew.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean aa(char c, int i) {
        return (c < ' ' || c > '~') ? (c >= 160 && c <= 255) || c == 8364 || c == 338 || 8212 == c || c == 339 || c == 376 : true;
    }

    static int ab(byte b) {
        try {
            if (client.rp == null || client.rk * -1908803273 >= client.rp.size()) {
                return 10000;
            }
            int i = 0;
            int i2 = 0;
            while (i <= client.rk * -1908803273) {
                int i3 = i2 + (((im) client.rp.get(i)).al * -2052413413);
                i++;
                i2 = i3;
            }
            return (i2 * 10000) / (client.ry * 369862783);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ew.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ah(byte b) {
        try {
            oz.ak(go.hq, -769293814);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ew.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int aq(long j, String str, int i) {
        int i2 = 0;
        try {
            int i3;
            Random random = new Random();
            lj ljVar = new lj(128);
            lj ljVar2 = new lj(128);
            int[] iArr = new int[4];
            iArr[0] = random.nextInt();
            iArr[1] = random.nextInt();
            iArr[2] = (int) (j >> 32);
            iArr[3] = (int) j;
            ljVar.al(10, -1033914554);
            for (i3 = 0; i3 < 4; i3++) {
                ljVar.ae(random.nextInt(), (byte) 114);
            }
            ljVar.ae(iArr[0], (byte) 107);
            ljVar.ae(iArr[1], (byte) 87);
            ljVar.ak(j);
            ljVar.ak(0);
            for (i3 = 0; i3 < 4; i3++) {
                ljVar.ae(random.nextInt(), (byte) 22);
            }
            ljVar.bw(iy.aj, iy.ai, 1424804031);
            ljVar2.al(10, -1231894385);
            while (i2 < 3) {
                ljVar2.ae(random.nextInt(), (byte) 121);
                i2++;
            }
            ljVar2.ak(random.nextLong());
            ljVar2.am(random.nextLong());
            cx.io(ljVar2, -1460986434);
            ljVar2.ak(random.nextLong());
            ljVar2.bw(iy.aj, iy.ai, -562325196);
            i2 = hs.ag(str, (short) -19741);
            if (i2 % 8 != 0) {
                i2 += 8 - (i2 % 8);
            }
            lj ljVar3 = new lj(i2);
            ljVar3.ap(str, 635769462);
            ljVar3.al = i2 * -879823907;
            ljVar3.bv(iArr, (byte) 17);
            lj ljVar4 = new lj(((ljVar2.al * -1631454091) + ((ljVar.al * -1631454091) + 5)) + (ljVar3.al * -1631454091));
            ljVar4.al(2, -1873916539);
            ljVar4.al(ljVar.al * -1631454091, -2131827408);
            ljVar4.ax(ljVar.ar, 0, ljVar.al * -1631454091, -595985938);
            ljVar4.al(ljVar2.al * -1631454091, -1984903553);
            ljVar4.ax(ljVar2.ar, 0, ljVar2.al * -1631454091, -55004140);
            ljVar4.aj(ljVar3.al * -1631454091, -1743540969);
            ljVar4.ax(ljVar3.ar, 0, ljVar3.al * -1631454091, 868267458);
            String ad = au.ad(ljVar4.ar, 252628318);
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(hn.id("services", false, 1518957261));
                stringBuilder.append("m=accountappeal/login.ws");
                URLConnection openConnection = new URL(stringBuilder.toString()).openConnection();
                openConnection.setDoInput(true);
                openConnection.setDoOutput(true);
                openConnection.setConnectTimeout(5000);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("data2=");
                stringBuilder2.append(jg.ad(ad, -571638166));
                stringBuilder2.append("&dest=");
                stringBuilder2.append(jg.ad("passwordchoice.ws", -1430716070));
                outputStreamWriter.write(stringBuilder2.toString());
                outputStreamWriter.flush();
                InputStream inputStream = openConnection.getInputStream();
                ljVar3 = new lj(new byte[1000]);
                do {
                    int read = inputStream.read(ljVar3.ar, ljVar3.al * -1631454091, 1000 - (ljVar3.al * -1631454091));
                    if (read == -1) {
                        outputStreamWriter.close();
                        inputStream.close();
                        ad = new String(ljVar3.ar);
                        if (ad.startsWith("OFFLINE")) {
                            return 4;
                        }
                        if (ad.startsWith("WRONG")) {
                            return 7;
                        }
                        if (ad.startsWith("RELOAD")) {
                            return 3;
                        }
                        if (ad.startsWith("Not permitted for social network accounts.")) {
                            return 6;
                        }
                        ljVar3.bg(iArr, 1170088516);
                        while (ljVar3.al * -1631454091 > 0 && ljVar3.ar[(ljVar3.al * -1631454091) - 1] == (byte) 0) {
                            ljVar3.al += 879823907;
                        }
                        String str2 = new String(ljVar3.ar, 0, ljVar3.al * -1631454091);
                        if (!cv.ar(str2, 1560079435)) {
                            return 5;
                        }
                        client.aq.abx((byte) 65).gv(1175141714).ad(str2, true, -1845840177);
                        return 2;
                    }
                    ljVar3.al = (read * -879823907) + ljVar3.al;
                } while (ljVar3.al * -1631454091 < 1000);
                return 5;
            } catch (Throwable th) {
                th.printStackTrace();
                return 5;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("ew.aq(");
            stringBuilder3.append(')');
            throw mv.aq(e, stringBuilder3.toString());
        }
    }

    static void bd(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i8 >= 255) {
            try {
                ea.ao(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, 1909487159);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ew.bd(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13 = -i4;
            int i14 = i10;
            while (i13 < 0) {
                int i15 = iArr2[i11];
                if (i15 != 0) {
                    i10 = iArr[i14];
                    if (i10 == 0) {
                        i10 = i14 + 1;
                        iArr[i14] = (i15 & ViewCompat.MEASURED_SIZE_MASK) | (i8 << 24);
                    } else {
                        int i16 = i10 >>> 24;
                        int i17 = 255 - i16;
                        int i18 = (((255 - i8) * i17) / 255) + i8;
                        int i19 = 255 - i18;
                        iArr[i14] = ((((((i10 & 16711935) * i19) + ((i15 & 16711935) * i18)) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i19) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i18)) & 16711680)) >>> 8) | ((((i17 * i8) / 255) + i16) << 24);
                        i10 = i14 + 1;
                    }
                } else {
                    i10 = i14 + 1;
                }
                i13++;
                i11++;
                i14 = i10;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    static int bi(int i, hw hwVar, boolean z, byte b) {
        int[] iArr;
        int i2;
        if (6200 == i) {
            try {
                ds.am += 1128905694;
                client.qi = (short) kw.bf(hl.ae[ds.am * -757592335], 342787858);
                if (client.qi <= (short) 0) {
                    client.qi = (short) 256;
                }
                client.qc = (short) kw.bf(hl.ae[(ds.am * -757592335) + 1], -1424785894);
                if (client.qc > (short) 0) {
                    return 1;
                }
                client.qc = (short) 256;
                return 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ew.bi(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (i == 6201) {
            ds.am += 1128905694;
            client.qm = (short) hl.ae[ds.am * -757592335];
            if (client.qm <= (short) 0) {
                client.qm = (short) 256;
            }
            client.qe = (short) hl.ae[(ds.am * -757592335) + 1];
            if (client.qe > (short) 0) {
                return 1;
            }
            client.qe = (short) 320;
            return 1;
        } else if (i == 6202) {
            ds.am -= 2037155908;
            client.qf = (short) hl.ae[ds.am * -757592335];
            if (client.qf <= (short) 0) {
                client.qf = (short) 1;
            }
            client.qn = (short) hl.ae[(ds.am * -757592335) + 1];
            if (client.qn <= (short) 0) {
                client.qn = Short.MAX_VALUE;
            } else if (client.qn < client.qf) {
                client.qn = client.qf;
            }
            client.qt = (short) hl.ae[(ds.am * -757592335) + 2];
            if (client.qt <= (short) 0) {
                client.qt = (short) 1;
            }
            client.qv = (short) hl.ae[(ds.am * -757592335) + 3];
            if (client.qv <= (short) 0) {
                client.qv = Short.MAX_VALUE;
                return 1;
            } else if (client.qv >= client.qt) {
                return 1;
            } else {
                client.qv = client.qt;
                return 1;
            }
        } else if (i == 6203) {
            if (client.lw != null) {
                em.dd(0, 0, client.lw.bl * 1272191791, client.lw.bf * 1813264797, false, 5379157);
                iArr = hl.ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = client.qr * 1271637141;
                iArr = hl.ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = client.rh * -402617027;
                return 1;
            }
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = -1;
            return 1;
        } else if (i == 6204) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.qm;
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = client.qe;
            return 1;
        } else if (i != 6205) {
            return 2;
        } else {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = gh.bb(client.qi, -1922881285);
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = gh.bb(client.qc, 1130113859);
            return 1;
        }
    }

    public void aa() {
        aq(1095073871).ad((byte) 12);
        ad(-601277067).ad(-1115626467);
    }

    public abstract void ab(int i, int i2);

    public void ac() {
        aq(1636831320).ad((byte) 12);
        ad(-601277067).ad(-1502141628);
    }

    public abstract es ad(int i);

    public abstract void ae(int i, int i2, int i3);

    public void af() {
        aq(1973767673).ad((byte) 12);
        ad(-601277067).ad(-820704745);
    }

    public abstract es ag();

    public void ah() {
        aq(-1054297527).ad((byte) 12);
        ad(-601277067).ad(-1382002379);
    }

    public abstract void ai(int i, int i2, int i3, int i4, int i5);

    public void aj(int i) {
        try {
            aq(-2039450334).ad((byte) 12);
            ad(-601277067).ad(-1205377394);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ew.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak(int i, byte b) {
    }

    public abstract void al(int i, int i2, int i3);

    public abstract void am(int i);

    public abstract void an(int i, int i2, int i3, int i4);

    public void ao() {
        aq(168066414).ad((byte) 12);
        ad(-601277067).ad(-1644535941);
    }

    public abstract bl ap();

    public abstract bl aq(int i);

    public abstract bw ar(int i);

    public abstract void as(float f, int i);

    public abstract void at();

    public abstract bw au();

    public abstract void av(int i, int i2);

    public abstract void aw(int i, int i2);

    public abstract void ax(int i, int i2);

    public abstract void ay(int i, int i2, int i3, int i4);

    public abstract void az(int i, int i2);

    public abstract void ba(float f);

    public abstract void bk(float f);

    public void bs(int i) {
    }
}
