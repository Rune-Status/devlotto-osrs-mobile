package com.google.android.gms.internal.measurement;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

@WorkerThread
final class zzfq implements Runnable {
    private final String packageName;
    private final URL url;
    private final byte[] zzalk;
    private final zzfo zzall;
    private final Map<String, String> zzalm;
    private final /* synthetic */ zzfm zzaln;

    public zzfq(zzfm zzfm, String str, URL url, byte[] bArr, Map<String, String> map, zzfo zzfo) {
        this.zzaln = zzfm;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfo);
        this.url = url;
        this.zzalk = bArr;
        this.zzall = zzfo;
        this.packageName = str;
        this.zzalm = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb A:{SYNTHETIC, Splitter:B:41:0x00cb} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb A:{SYNTHETIC, Splitter:B:41:0x00cb} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb A:{SYNTHETIC, Splitter:B:41:0x00cb} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb A:{SYNTHETIC, Splitter:B:41:0x00cb} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A:{SYNTHETIC, Splitter:B:15:0x003f} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A:{SYNTHETIC, Splitter:B:15:0x003f} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        HttpURLConnection zzb;
        OutputStream outputStream;
        Throwable e;
        Map map;
        Throwable th;
        zzgi zzgh;
        Runnable zzfp;
        HttpURLConnection httpURLConnection;
        Throwable th2;
        Map map2;
        int i;
        int i2 = 0;
        this.zzaln.zzfw();
        try {
            zzb = this.zzaln.zzb(this.url);
            try {
                if (this.zzalm != null) {
                    for (Entry entry : this.zzalm.entrySet()) {
                        zzb.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.zzalk != null) {
                    byte[] zzb2 = this.zzaln.zzjf().zzb(this.zzalk);
                    this.zzaln.zzgi().zzjc().zzg("Uploading data. size", Integer.valueOf(zzb2.length));
                    zzb.setDoOutput(true);
                    zzb.addRequestProperty("Content-Encoding", "gzip");
                    zzb.setFixedLengthStreamingMode(zzb2.length);
                    zzb.connect();
                    outputStream = zzb.getOutputStream();
                    try {
                        outputStream.write(zzb2);
                        outputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        map = null;
                        th = e;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.zzaln.zzgi().zziv().zze("Error closing HTTP compressed POST connection output stream. appId", zzfi.zzbp(this.packageName), e3);
                            }
                        }
                        if (zzb != null) {
                            zzb.disconnect();
                        }
                        zzgh = this.zzaln.zzgh();
                        zzfp = new zzfp(this.packageName, this.zzall, i2, th, null, map);
                        zzgh.zzc(zzfp);
                    } catch (Throwable th3) {
                        httpURLConnection = zzb;
                        th2 = th3;
                        map2 = null;
                        zzb = httpURLConnection;
                        th = th2;
                        i = 0;
                        if (outputStream != null) {
                        }
                        if (zzb != null) {
                        }
                        this.zzaln.zzgh().zzc(new zzfp(this.packageName, this.zzall, i, null, null, map2));
                        throw th;
                    }
                }
                i = zzb.getResponseCode();
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th32) {
                httpURLConnection = zzb;
                outputStream = null;
                th2 = th32;
                map2 = null;
                zzb = httpURLConnection;
                th = th2;
                i = 0;
                if (outputStream != null) {
                }
                if (zzb != null) {
                }
                this.zzaln.zzgh().zzc(new zzfp(this.packageName, this.zzall, i, null, null, map2));
                throw th;
            }
            try {
                map2 = zzb.getHeaderFields();
                try {
                    byte[] zza = zzfm.zzb(zzb);
                    if (zzb != null) {
                        zzb.disconnect();
                    }
                    zzgi zzgh2 = this.zzaln.zzgh();
                    zzfp = new zzfp(this.packageName, this.zzall, i, null, zza, map2);
                    zzgh = zzgh2;
                } catch (IOException e5) {
                    e = e5;
                } catch (Throwable e6) {
                    outputStream = null;
                    th = e6;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e32) {
                            this.zzaln.zzgi().zziv().zze("Error closing HTTP compressed POST connection output stream. appId", zzfi.zzbp(this.packageName), e32);
                        }
                    }
                    if (zzb != null) {
                        zzb.disconnect();
                    }
                    this.zzaln.zzgh().zzc(new zzfp(this.packageName, this.zzall, i, null, null, map2));
                    throw th;
                }
            } catch (IOException e7) {
                e6 = e7;
                map2 = null;
            } catch (Throwable e62) {
                outputStream = null;
                map2 = null;
                th = e62;
                if (outputStream != null) {
                }
                if (zzb != null) {
                }
                this.zzaln.zzgh().zzc(new zzfp(this.packageName, this.zzall, i, null, null, map2));
                throw th;
            }
        } catch (IOException e8) {
            e62 = e8;
            zzb = null;
        } catch (Throwable th4) {
            Object httpURLConnection2 = null;
            outputStream = null;
            th2 = th4;
            map2 = null;
            zzb = httpURLConnection2;
            th = th2;
            i = 0;
            if (outputStream != null) {
            }
            if (zzb != null) {
            }
            this.zzaln.zzgh().zzc(new zzfp(this.packageName, this.zzall, i, null, null, map2));
            throw th;
        }
        zzgh.zzc(zzfp);
        outputStream = null;
        map = map2;
        th = e62;
        i2 = i;
        if (outputStream != null) {
        }
        if (zzb != null) {
        }
        zzgh = this.zzaln.zzgh();
        zzfp = new zzfp(this.packageName, this.zzall, i2, th, null, map);
        zzgh.zzc(zzfp);
        outputStream = null;
        map = null;
        th = e62;
        if (outputStream != null) {
        }
        if (zzb != null) {
        }
        zzgh = this.zzaln.zzgh();
        zzfp = new zzfp(this.packageName, this.zzall, i2, th, null, map);
        zzgh.zzc(zzfp);
    }
}
