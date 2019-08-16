package defpackage;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Random;

/* renamed from: iy */
public class iy {
    static final String ad = "m=accountappeal/login.ws";
    static final BigInteger ai = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    static final BigInteger aj = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    static final int al = 1000;
    static final int am = 3;
    static final String aq = "services";
    public static final int bq = 37;

    iy() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iy.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int ae(long j, String str) {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -950699160\r\n\tat java.util.BitSet.nextSetBit(BitSet.java:712)\r\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\r\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\r\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static final int ai(long j, String str) {
        int i;
        Random random = new Random();
        lj ljVar = new lj(128);
        lj ljVar2 = new lj(128);
        int[] iArr = new int[]{random.nextInt(), random.nextInt(), (int) (j >> 32), (int) j};
        ljVar.al(10, -1255571899);
        for (i = 0; i < 4; i++) {
            ljVar.ae(random.nextInt(), (byte) 30);
        }
        ljVar.ae(iArr[0], (byte) 23);
        ljVar.ae(iArr[1], (byte) 48);
        ljVar.ak(j);
        ljVar.ak(0);
        for (i = 0; i < 4; i++) {
            ljVar.ae(random.nextInt(), (byte) 73);
        }
        ljVar.bw(aj, ai, -1550181656);
        ljVar2.al(10, -460228540);
        for (i = 0; i < 3; i++) {
            ljVar2.ae(random.nextInt(), (byte) 36);
        }
        ljVar2.ak(random.nextLong());
        ljVar2.am(random.nextLong());
        cx.io(ljVar2, -361077777);
        ljVar2.ak(random.nextLong());
        ljVar2.bw(aj, ai, 1950116574);
        i = hs.ag(str, (short) 848);
        int i2 = i % 8;
        if (i2 != 0) {
            i += 8 - i2;
        }
        lj ljVar3 = new lj(i);
        ljVar3.ap(str, 635769462);
        ljVar3.al = i * -879823907;
        ljVar3.bv(iArr, (byte) 61);
        lj ljVar4 = new lj(((ljVar2.al * -1631454091) + ((ljVar.al * -1631454091) + 5)) + (ljVar3.al * -1631454091));
        ljVar4.al(2, -787622282);
        ljVar4.al(ljVar.al * -1631454091, -1794585564);
        ljVar4.ax(ljVar.ar, 0, ljVar.al * -1631454091, 724028854);
        ljVar4.al(ljVar2.al * -1631454091, -1558343135);
        ljVar4.ax(ljVar2.ar, 0, ljVar2.al * -1631454091, 1778164548);
        ljVar4.aj(ljVar3.al * -1631454091, 1933725075);
        ljVar4.ax(ljVar3.ar, 0, ljVar3.al * -1631454091, -1399724042);
        String ad = au.ad(ljVar4.ar, 627128063);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hn.id(aq, false, 1518957261));
            stringBuilder.append(ad);
            URLConnection openConnection = new URL(stringBuilder.toString()).openConnection();
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("data2=");
            stringBuilder2.append(jg.ad(ad, 803237586));
            stringBuilder2.append("&dest=");
            stringBuilder2.append(jg.ad("passwordchoice.ws", -15415777));
            outputStreamWriter.write(stringBuilder2.toString());
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            lj ljVar5 = new lj(new byte[1000]);
            do {
                int read = inputStream.read(ljVar5.ar, ljVar5.al * -1631454091, 1000 - (ljVar5.al * -1631454091));
                if (read == -1) {
                    outputStreamWriter.close();
                    inputStream.close();
                    ad = new String(ljVar5.ar);
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
                    ljVar5.bg(iArr, 1170088516);
                    while (ljVar5.al * -1631454091 > 0 && ljVar5.ar[(ljVar5.al * -1631454091) - 1] == (byte) 0) {
                        ljVar5.al += 879823907;
                    }
                    ad = new String(ljVar5.ar, 0, ljVar5.al * -1631454091);
                    if (!cv.ar(ad, 479520642)) {
                        return 5;
                    }
                    client.aq.abx((byte) 10).gv(-150716009).ad(ad, true, -143614082);
                    return 2;
                }
                ljVar5.al = (read * -879823907) + ljVar5.al;
            } while (ljVar5.al * -1631454091 < 1000);
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    static final int aj(long j, String str) {
        int i;
        Random random = new Random();
        lj ljVar = new lj(128);
        lj ljVar2 = new lj(128);
        int[] iArr = new int[]{random.nextInt(), random.nextInt(), (int) (j >> 32), (int) j};
        ljVar.al(10, -898397464);
        for (i = 0; i < 4; i++) {
            ljVar.ae(random.nextInt(), (byte) 18);
        }
        ljVar.ae(iArr[0], (byte) 126);
        ljVar.ae(iArr[1], (byte) 16);
        ljVar.ak(j);
        ljVar.ak(0);
        for (i = 0; i < 4; i++) {
            ljVar.ae(random.nextInt(), (byte) 34);
        }
        ljVar.bw(aj, ai, 973284976);
        ljVar2.al(10, -186808142);
        for (i = 0; i < 3; i++) {
            ljVar2.ae(random.nextInt(), (byte) 121);
        }
        ljVar2.ak(random.nextLong());
        ljVar2.am(random.nextLong());
        cx.io(ljVar2, 628956664);
        ljVar2.ak(random.nextLong());
        ljVar2.bw(aj, ai, 1932623818);
        i = hs.ag(str, (short) -2446);
        int i2 = i % 8;
        if (i2 != 0) {
            i += 8 - i2;
        }
        lj ljVar3 = new lj(i);
        ljVar3.ap(str, 635769462);
        ljVar3.al = i * -879823907;
        ljVar3.bv(iArr, (byte) 26);
        lj ljVar4 = new lj(((ljVar2.al * 1187190196) + ((ljVar.al * -1631454091) + 5)) + (ljVar3.al * -497332366));
        ljVar4.al(2, -476887314);
        ljVar4.al(ljVar.al * -239394058, -7085729);
        ljVar4.ax(ljVar.ar, 0, ljVar.al * 1473194492, 312788804);
        ljVar4.al(ljVar2.al * -1631454091, -1225000390);
        ljVar4.ax(ljVar2.ar, 0, ljVar2.al * -1631454091, 1098734084);
        ljVar4.aj(ljVar3.al * -1631454091, 1471579817);
        ljVar4.ax(ljVar3.ar, 0, ljVar3.al * -1631454091, 1511092970);
        String ad = au.ad(ljVar4.ar, 1903281100);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hn.id(aq, false, 1518957261));
            stringBuilder.append(ad);
            URLConnection openConnection = new URL(stringBuilder.toString()).openConnection();
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("data2=");
            stringBuilder2.append(jg.ad(ad, -1074100027));
            stringBuilder2.append("&dest=");
            stringBuilder2.append(jg.ad("passwordchoice.ws", 301297129));
            outputStreamWriter.write(stringBuilder2.toString());
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            lj ljVar5 = new lj(new byte[1000]);
            do {
                int read = inputStream.read(ljVar5.ar, ljVar5.al * -1631454091, 1383104100 - (ljVar5.al * -112141659));
                if (read == -1) {
                    outputStreamWriter.close();
                    inputStream.close();
                    ad = new String(ljVar5.ar);
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
                    ljVar5.bg(iArr, 1170088516);
                    while (ljVar5.al * -1631454091 > 0 && ljVar5.ar[(ljVar5.al * 546370764) - 1] == (byte) 0) {
                        ljVar5.al += 879823907;
                    }
                    ad = new String(ljVar5.ar, 0, ljVar5.al * -445635572);
                    if (!cv.ar(ad, -1030728405)) {
                        return 5;
                    }
                    client.aq.abx((byte) 56).gv(1502735857).ad(ad, true, -1803927470);
                    return 2;
                }
                ljVar5.al = (read * -879823907) + ljVar5.al;
            } while (ljVar5.al * -1631454091 < 1000);
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    static boolean ak(String str) {
        if (str == null) {
            return false;
        }
        try {
            URL url = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }

    static long al() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hn.id(aq, false, 1518957261));
            stringBuilder.append(ad);
            URLConnection openConnection = new URL(stringBuilder.toString()).openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            lj ljVar = new lj(new byte[1000]);
            do {
                int read = inputStream.read(ljVar.ar, ljVar.al * -1631454091, 1000 - (ljVar.al * -1631454091));
                if (read == -1) {
                    ljVar.al = 0;
                    return ljVar.bk(-1143092596);
                }
                ljVar.al = (read * -879823907) + ljVar.al;
            } while (ljVar.al * -1631454091 < 1000);
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    static void am(int i) {
        try {
            Iterator it = it.aq.iterator();
            while (it.hasNext()) {
                ((ip) it.next()).aq((byte) 0);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iy.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean am(String str) {
        if (str == null) {
            return false;
        }
        try {
            URL url = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }
}
