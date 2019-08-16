package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.IOException;

/* renamed from: mc */
public class mc {
    public static File ac = null;
    static final int ad = 1048576000;
    public static of ag = null;
    static final String ai = "main_file_cache.dat2";
    static int aj = 0;
    public static final int ak = 24;
    static File al = null;
    public static of ap = null;
    static final int aq = 1048576;
    static of as;
    public static String ax;

    mc() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mc.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aa() {
        try {
            ag.ad((byte) 23);
            for (int i = 0; i < aj * 142370929; i++) {
                im.au[i].ad((byte) 119);
            }
            ap.ad((byte) 40);
            as.ad((byte) 26);
            ag = null;
            im.au = null;
            ap = null;
            as = null;
        } catch (Exception e) {
        }
    }

    public static void ac() {
        try {
            ag.ad((byte) 53);
            for (int i = 0; i < aj * 142370929; i++) {
                im.au[i].ad((byte) 29);
            }
            ap.ad((byte) 30);
            as.ad((byte) 71);
            ag = null;
            im.au = null;
            ap = null;
            as = null;
        } catch (Exception e) {
        }
    }

    public static void ae(lw lwVar, String str, String str2, int i, int i2) throws IOException {
        aj = -926787439 * i2;
        aw.az = 207718299 * i;
        ac = lwVar.fj(1131407233);
        al = lwVar.fg(str, str2, i, (byte) -38);
        try {
            jl.aw = System.getProperty("os.name");
        } catch (Exception e) {
            jl.aw = "Unknown";
        }
        ax = jl.aw.toLowerCase();
        kq.ad(al, -1861833744);
        io.ar(lwVar.fi(i, 1687535038), (byte) 94);
        ag = new of(new oq(iq.aq(ai, (byte) -29), "rw", 1048576000), 5200, 0);
        ap = new of(new oq(iq.aq("main_file_cache.idx255", (byte) -78), "rw", PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), 6000, 0);
        im.au = new of[(aj * 142370929)];
        for (int i3 = 0; i3 < aj * 142370929; i3++) {
            of[] ofVarArr = im.au;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("main_file_cache.idx");
            stringBuilder.append(i3);
            ofVarArr[i3] = new of(new oq(iq.aq(stringBuilder.toString(), (byte) -39), "rw", PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), 6000, 0);
        }
    }

    public static byte[] ag() {
        int i = 0;
        byte[] bArr = new byte[24];
        try {
            as.aq(0);
            as.al(bArr, (byte) 6);
            int i2 = 0;
            while (i2 < 24 && bArr[i2] == (byte) 0) {
                i2++;
            }
            if (i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            while (i < 24) {
                bArr[i] = (byte) -1;
                i++;
            }
        }
        return bArr;
    }

    public static oq ak(String str, String str2, boolean z) {
        File file = al;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("preferences");
        stringBuilder.append(str);
        stringBuilder.append(".dat");
        File file2 = new File(file, stringBuilder.toString());
        if (file2.exists()) {
            try {
                return new oq(file2, "rw", 10000);
            } catch (IOException e) {
            }
        }
        String str3 = "";
        if (aw.az * -1890810221 == 33) {
            str3 = "_rc";
        } else if (aw.az * -1890810221 == 1057941966) {
            str3 = "_wip";
        }
        File file3 = ac;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("jagex_");
        stringBuilder2.append(str2);
        stringBuilder2.append("_preferences");
        stringBuilder2.append(str);
        stringBuilder2.append(str3);
        stringBuilder2.append(".dat");
        File file4 = new File(file3, stringBuilder2.toString());
        if (!z && file4.exists()) {
            try {
                return new oq(file4, "rw", 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new oq(file2, "rw", 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static oq am(String str, String str2, boolean z) {
        File file = al;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("preferences");
        stringBuilder.append(str);
        stringBuilder.append(".dat");
        File file2 = new File(file, stringBuilder.toString());
        if (file2.exists()) {
            try {
                return new oq(file2, "rw", 10000);
            } catch (IOException e) {
            }
        }
        String str3 = "";
        if (aw.az * -450658042 == 1893196643) {
            str3 = "_rc";
        } else if (aw.az * -1890810221 == 34) {
            str3 = "_wip";
        }
        File file3 = ac;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("jagex_");
        stringBuilder2.append(str2);
        stringBuilder2.append("_preferences");
        stringBuilder2.append(str);
        stringBuilder2.append(str3);
        stringBuilder2.append(".dat");
        File file4 = new File(file3, stringBuilder2.toString());
        if (!z && file4.exists()) {
            try {
                return new oq(file4, "rw", 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new oq(file2, "rw", 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static byte[] ap() {
        int i = 0;
        byte[] bArr = new byte[24];
        try {
            as.aq(0);
            as.al(bArr, (byte) 6);
            int i2 = 0;
            while (i2 < 24 && bArr[i2] == (byte) 0) {
                i2++;
            }
            if (i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            while (i < 24) {
                bArr[i] = (byte) -1;
                i++;
            }
        }
        return bArr;
    }

    public static byte[] as() {
        int i = 0;
        byte[] bArr = new byte[24];
        try {
            as.aq(0);
            as.al(bArr, (byte) 6);
            int i2 = 0;
            while (i2 < 24 && bArr[i2] == (byte) 0) {
                i2++;
            }
            if (i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            while (i < 24) {
                bArr[i] = (byte) -1;
                i++;
            }
        }
        return bArr;
    }

    public static void au(lj ljVar, int i) {
        if (as != null) {
            try {
                as.aq(0);
                as.ae(ljVar.ar, i, 24, 1812126954);
            } catch (Exception e) {
            }
        }
    }

    public static void aw() {
        try {
            ag.ad((byte) 8);
            for (int i = 0; i < aj * 142370929; i++) {
                im.au[i].ad((byte) 100);
            }
            ap.ad((byte) 72);
            as.ad((byte) 108);
            ag = null;
            im.au = null;
            ap = null;
            as = null;
        } catch (Exception e) {
        }
    }

    public static void ax(lj ljVar, int i) {
        if (as != null) {
            try {
                as.aq(0);
                as.ae(ljVar.ar, i, 24, 1897247270);
            } catch (Exception e) {
            }
        }
    }

    public static void az(lj ljVar, int i) {
        if (as != null) {
            try {
                as.aq(0);
                as.ae(ljVar.ar, i, 24, 1257350103);
            } catch (Exception e) {
            }
        }
    }
}
