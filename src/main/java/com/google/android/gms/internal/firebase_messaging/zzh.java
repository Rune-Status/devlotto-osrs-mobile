package com.google.android.gms.internal.firebase_messaging;

import java.io.PrintStream;

public final class zzh {
    private static final zzi zzg;
    private static final int zzh;

    static final class zza extends zzi {
        zza() {
        }

        public final void zza(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        Integer zzb;
        zzi zzm;
        Throwable th;
        try {
            zzb = zzb();
            if (zzb != null) {
                try {
                    if (zzb.intValue() >= 19) {
                        zzm = new zzm();
                        zzg = zzm;
                        zzh = zzb == null ? 1 : zzb.intValue();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            zzm = (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ 1) != 0 ? new zzl() : new zza();
        } catch (Throwable th3) {
            th = th3;
            zzb = null;
        }
        zzg = zzm;
        if (zzb == null) {
        }
        zzh = zzb == null ? 1 : zzb.intValue();
        PrintStream printStream = System.err;
        String name = zza.class.getName();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 133);
        stringBuilder.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
        stringBuilder.append(name);
        stringBuilder.append("will be used. The error is: ");
        printStream.println(stringBuilder.toString());
        th.printStackTrace(System.err);
        zzm = new zza();
        zzg = zzm;
        if (zzb == null) {
        }
        zzh = zzb == null ? 1 : zzb.intValue();
    }

    public static void zza(Throwable th, Throwable th2) {
        zzg.zza(th, th2);
    }

    private static Integer zzb() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
