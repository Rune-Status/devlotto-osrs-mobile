package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

@KeepForSdk
public class ProcessUtils {
    private static String zzhd;
    private static int zzhe;

    private ProcessUtils() {
    }

    @KeepForSdk
    @Nullable
    public static String getMyProcessName() {
        if (zzhd == null) {
            if (zzhe == 0) {
                zzhe = Process.myPid();
            }
            zzhd = zzd(zzhe);
        }
        return zzhd;
    }

    @Nullable
    private static String zzd(int i) {
        Throwable th;
        String str = null;
        if (i > 0) {
            Closeable zzj;
            try {
                StringBuilder stringBuilder = new StringBuilder(25);
                stringBuilder.append("/proc/");
                stringBuilder.append(i);
                stringBuilder.append("/cmdline");
                zzj = zzj(stringBuilder.toString());
                try {
                    str = zzj.readLine().trim();
                    IOUtils.closeQuietly(zzj);
                } catch (IOException e) {
                    IOUtils.closeQuietly(zzj);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.closeQuietly(zzj);
                    throw th;
                }
            } catch (IOException e2) {
                zzj = str;
            } catch (Throwable th3) {
                th = th3;
                zzj = str;
                IOUtils.closeQuietly(zzj);
                throw th;
            }
        }
        return str;
    }

    private static BufferedReader zzj(String str) throws IOException {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            return bufferedReader;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
