package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: jg */
public class jg implements Runnable {
    static final String am = "main_file_cache.idx255";
    static ef ap = null;
    public static final int aw = 32;
    final Thread ad;
    volatile boolean aq;
    Queue ar;

    public jg() {
        try {
            this.ar = new LinkedList();
            this.ad = new Thread(this);
            this.ad.setPriority(1);
            this.ad.start();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jg.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ad(CharSequence charSequence, int i) {
        try {
            int length = charSequence.length();
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || charAt == '.' || '-' == charAt || '*' == charAt || '_' == charAt))) {
                    stringBuilder.append(charAt);
                } else if (charAt == ' ') {
                    stringBuilder.append('+');
                } else {
                    byte ad = je.ad(charAt, -178024138);
                    stringBuilder.append('%');
                    int i3 = (ad >> 4) & 15;
                    if (i3 >= 10) {
                        stringBuilder.append((char) (i3 + 55));
                    } else {
                        stringBuilder.append((char) (i3 + 48));
                    }
                    int i4 = ad & 15;
                    if (i4 >= 10) {
                        stringBuilder.append((char) (i4 + 55));
                    } else {
                        stringBuilder.append((char) (i4 + 48));
                    }
                }
            }
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("jg.ad(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    static void al(int i, mh mhVar, kv kvVar, int i2) {
        try {
            kz kzVar = new kz();
            kzVar.ad = 1675084609;
            kzVar.gs = (long) i;
            kzVar.ar = mhVar;
            kzVar.al = kvVar;
            kg.ad.az(kzVar, 686934612);
            kg.ad.aj(823473032);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jg.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dy aq(int i, byte b) {
        if (i >= 0) {
            try {
                if (i < dy.aq.length && dy.aq[i] != null) {
                    return dy.aq[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jg.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return new dy(i);
    }

    public static boolean iq(int i) {
        try {
            return client.lq * -408822943 >= 2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jg.iq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ix(int i) {
        try {
            client.eb.ar(ib.aq(no.bc, client.eb.aj, -182827155), -1450743822);
            client.ha = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jg.ix(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0092 A:{SYNTHETIC, Splitter:B:54:0x0092} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0092 A:{SYNTHETIC, Splitter:B:54:0x0092} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A:{Catch:{ Exception -> 0x0018 }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A:{Catch:{ Exception -> 0x0018 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ad() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        URLConnection uRLConnection;
        DataInputStream dataInputStream;
        while (!this.aq) {
            try {
                synchronized (this) {
                    jp jpVar = (jp) this.ar.poll();
                    if (jpVar == null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        URLConnection openConnection;
                        DataInputStream dataInputStream2;
                        try {
                            openConnection = jpVar.ad.openConnection();
                            try {
                                openConnection.setConnectTimeout(1807775933);
                                openConnection.setReadTimeout(261366572);
                                openConnection.setUseCaches(false);
                                openConnection.setRequestProperty("Connection", "close");
                                openConnection.setRequestProperty("Accept-Encoding", "identity");
                                int contentLength = openConnection.getContentLength();
                                if (contentLength >= 0) {
                                    byte[] bArr = new byte[contentLength];
                                    dataInputStream2 = new DataInputStream(openConnection.getInputStream());
                                    try {
                                        dataInputStream2.readFully(bArr);
                                        jpVar.al = bArr;
                                    } catch (IOException e2) {
                                        try {
                                            jpVar.ad((byte) 57);
                                            if (dataInputStream2 != null) {
                                                dataInputStream2.close();
                                            }
                                            if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                                httpURLConnection = (HttpURLConnection) openConnection;
                                                httpURLConnection.disconnect();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            uRLConnection = openConnection;
                                            dataInputStream = dataInputStream2;
                                            if (dataInputStream != null) {
                                            }
                                            ((HttpURLConnection) uRLConnection).disconnect();
                                            throw th;
                                        }
                                    }
                                }
                                dataInputStream2 = null;
                                jpVar.ad((byte) 126);
                                if (dataInputStream2 != null) {
                                    dataInputStream2.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    httpURLConnection = (HttpURLConnection) openConnection;
                                    httpURLConnection.disconnect();
                                }
                            } catch (IOException e3) {
                                dataInputStream2 = null;
                                jpVar.ad((byte) 57);
                                if (dataInputStream2 != null) {
                                }
                                httpURLConnection = (HttpURLConnection) openConnection;
                                httpURLConnection.disconnect();
                            } catch (Throwable th22) {
                                Throwable th3 = th22;
                                uRLConnection = openConnection;
                                th = th3;
                                dataInputStream = null;
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) uRLConnection).disconnect();
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            openConnection = null;
                            dataInputStream2 = null;
                            jpVar.ad((byte) 57);
                            if (dataInputStream2 != null) {
                            }
                            httpURLConnection = (HttpURLConnection) openConnection;
                            httpURLConnection.disconnect();
                        } catch (Throwable th222) {
                            Throwable th4 = th222;
                            Object uRLConnection2 = null;
                            th = th4;
                            dataInputStream = null;
                            if (dataInputStream != null) {
                            }
                            ((HttpURLConnection) uRLConnection2).disconnect();
                            throw th;
                        }
                    }
                }
            } catch (Exception th2222) {
                iv.ad(null, th2222, 1692244937);
            }
        }
    }

    public jp ae(URL url) {
        return al(url, null, -98837225);
    }

    /* Access modifiers changed, original: 0000 */
    public jp ag(URL url, jo joVar) {
        jp jpVar = new jp(url, joVar);
        synchronized (this) {
            this.ar.add(jpVar);
            notify();
        }
        return jpVar;
    }

    public jp ai(URL url) {
        return al(url, null, 1271454212);
    }

    public void aj(int i) {
        try {
            this.aq = true;
            try {
                synchronized (this) {
                    notify();
                }
                this.ad.join();
            } catch (InterruptedException e) {
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jg.aj(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public jp ak(URL url) {
        return al(url, null, 1074471881);
    }

    /* Access modifiers changed, original: 0000 */
    public jp al(URL url, jo joVar, int i) {
        try {
            jp jpVar = new jp(url, joVar);
            synchronized (this) {
                this.ar.add(jpVar);
                notify();
            }
            return jpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jg.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public jp am(URL url) {
        return al(url, null, 281696211);
    }

    public void ap() {
        this.aq = true;
        try {
            synchronized (this) {
                notify();
            }
            this.ad.join();
        } catch (InterruptedException e) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0090 A:{SYNTHETIC, Splitter:B:54:0x0090} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078 A:{Catch:{ Exception -> 0x0018 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0090 A:{SYNTHETIC, Splitter:B:54:0x0090} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078 A:{Catch:{ Exception -> 0x0018 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void aq() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        URLConnection uRLConnection;
        DataInputStream dataInputStream;
        while (!this.aq) {
            try {
                synchronized (this) {
                    jp jpVar = (jp) this.ar.poll();
                    if (jpVar == null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        URLConnection openConnection;
                        DataInputStream dataInputStream2;
                        try {
                            openConnection = jpVar.ad.openConnection();
                            try {
                                openConnection.setConnectTimeout(5000);
                                openConnection.setReadTimeout(5000);
                                openConnection.setUseCaches(false);
                                openConnection.setRequestProperty("Connection", "close");
                                openConnection.setRequestProperty("Accept-Encoding", "identity");
                                int contentLength = openConnection.getContentLength();
                                if (contentLength >= 0) {
                                    byte[] bArr = new byte[contentLength];
                                    dataInputStream2 = new DataInputStream(openConnection.getInputStream());
                                    try {
                                        dataInputStream2.readFully(bArr);
                                        jpVar.al = bArr;
                                    } catch (IOException e2) {
                                        try {
                                            jpVar.ad((byte) 112);
                                            if (dataInputStream2 != null) {
                                                dataInputStream2.close();
                                            }
                                            if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                                httpURLConnection = (HttpURLConnection) openConnection;
                                                httpURLConnection.disconnect();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            uRLConnection = openConnection;
                                            dataInputStream = dataInputStream2;
                                            if (dataInputStream != null) {
                                                dataInputStream.close();
                                            }
                                            if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
                                                ((HttpURLConnection) uRLConnection).disconnect();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                dataInputStream2 = null;
                                jpVar.ad((byte) 92);
                                if (dataInputStream2 != null) {
                                    dataInputStream2.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    httpURLConnection = (HttpURLConnection) openConnection;
                                    httpURLConnection.disconnect();
                                }
                            } catch (IOException e3) {
                                dataInputStream2 = null;
                                jpVar.ad((byte) 112);
                                if (dataInputStream2 != null) {
                                }
                                httpURLConnection = (HttpURLConnection) openConnection;
                                httpURLConnection.disconnect();
                            } catch (Throwable th22) {
                                Throwable th3 = th22;
                                uRLConnection = openConnection;
                                th = th3;
                                dataInputStream = null;
                                if (dataInputStream != null) {
                                }
                                ((HttpURLConnection) uRLConnection).disconnect();
                                throw th;
                            }
                        } catch (IOException e4) {
                            openConnection = null;
                            dataInputStream2 = null;
                            jpVar.ad((byte) 112);
                            if (dataInputStream2 != null) {
                            }
                            httpURLConnection = (HttpURLConnection) openConnection;
                            httpURLConnection.disconnect();
                        } catch (Throwable th222) {
                            Throwable th4 = th222;
                            Object uRLConnection2 = null;
                            th = th4;
                            dataInputStream = null;
                            if (dataInputStream != null) {
                            }
                            ((HttpURLConnection) uRLConnection2).disconnect();
                            throw th;
                        }
                    }
                }
            } catch (Exception th2222) {
                iv.ad(null, th2222, 1692244937);
            }
        }
    }

    public jp ar(URL url, int i) {
        try {
            return al(url, null, -1463940261);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jg.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public jp as(URL url, jo joVar) {
        jp jpVar = new jp(url, joVar);
        synchronized (this) {
            this.ar.add(jpVar);
            notify();
        }
        return jpVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093 A:{Catch:{ Exception -> 0x0018 }} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab A:{SYNTHETIC, Splitter:B:61:0x00ab} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093 A:{Catch:{ Exception -> 0x0018 }} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab A:{SYNTHETIC, Splitter:B:61:0x00ab} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        URLConnection uRLConnection;
        DataInputStream dataInputStream;
        while (!this.aq) {
            try {
                try {
                    synchronized (this) {
                        jp jpVar = (jp) this.ar.poll();
                        if (jpVar == null) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                            }
                        } else {
                            URLConnection openConnection;
                            DataInputStream dataInputStream2;
                            try {
                                openConnection = jpVar.ad.openConnection();
                                try {
                                    openConnection.setConnectTimeout(5000);
                                    openConnection.setReadTimeout(5000);
                                    openConnection.setUseCaches(false);
                                    openConnection.setRequestProperty("Connection", "close");
                                    openConnection.setRequestProperty("Accept-Encoding", "identity");
                                    int contentLength = openConnection.getContentLength();
                                    if (contentLength >= 0) {
                                        byte[] bArr = new byte[contentLength];
                                        dataInputStream2 = new DataInputStream(openConnection.getInputStream());
                                        try {
                                            dataInputStream2.readFully(bArr);
                                            jpVar.al = bArr;
                                        } catch (IOException e2) {
                                            try {
                                                jpVar.ad((byte) 115);
                                                if (dataInputStream2 != null) {
                                                }
                                                httpURLConnection = (HttpURLConnection) openConnection;
                                                httpURLConnection.disconnect();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                uRLConnection = openConnection;
                                                dataInputStream = dataInputStream2;
                                                if (dataInputStream != null) {
                                                    dataInputStream.close();
                                                }
                                                if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
                                                    ((HttpURLConnection) uRLConnection).disconnect();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    dataInputStream2 = null;
                                    jpVar.ad((byte) 86);
                                    if (dataInputStream2 != null) {
                                        dataInputStream2.close();
                                    }
                                    if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                        httpURLConnection = (HttpURLConnection) openConnection;
                                        httpURLConnection.disconnect();
                                    }
                                } catch (IOException e3) {
                                    dataInputStream2 = null;
                                    jpVar.ad((byte) 115);
                                    if (dataInputStream2 != null) {
                                        dataInputStream2.close();
                                    }
                                    if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                        httpURLConnection = (HttpURLConnection) openConnection;
                                        httpURLConnection.disconnect();
                                    }
                                } catch (Throwable th22) {
                                    Throwable th3 = th22;
                                    uRLConnection = openConnection;
                                    th = th3;
                                    dataInputStream = null;
                                    if (dataInputStream != null) {
                                    }
                                    ((HttpURLConnection) uRLConnection).disconnect();
                                    throw th;
                                }
                            } catch (IOException e4) {
                                openConnection = null;
                                dataInputStream2 = null;
                                jpVar.ad((byte) 115);
                                if (dataInputStream2 != null) {
                                }
                                httpURLConnection = (HttpURLConnection) openConnection;
                                httpURLConnection.disconnect();
                            } catch (Throwable th222) {
                                Throwable th4 = th222;
                                uRLConnection = null;
                                th = th4;
                                dataInputStream = null;
                                if (dataInputStream != null) {
                                }
                                ((HttpURLConnection) uRLConnection).disconnect();
                                throw th;
                            }
                        }
                    }
                } catch (Exception th2222) {
                    iv.ad(null, th2222, 1692244937);
                }
            } catch (RuntimeException e5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jg.run(");
                stringBuilder.append(')');
                throw mv.aq(e5, stringBuilder.toString());
            }
        }
    }
}
