package com.google.android.gms.internal.measurement;

import java.io.PrintStream;

public final class zzxi {
    private static final zzxj zzbqa;
    private static final int zzbqb;

    static final class zza extends zzxj {
        zza() {
        }

        public final void zza(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        Integer zzsr;
        zzxj zzxn;
        Throwable th;
        try {
            zzsr = zzsr();
            if (zzsr != null) {
                try {
                    if (zzsr.intValue() >= 19) {
                        zzxn = new zzxn();
                        zzbqa = zzxn;
                        zzbqb = zzsr == null ? 1 : zzsr.intValue();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            zzxn = (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ 1) != 0 ? new zzxm() : new zza();
        } catch (Throwable th3) {
            th = th3;
            zzsr = null;
        }
        zzbqa = zzxn;
        if (zzsr == null) {
        }
        zzbqb = zzsr == null ? 1 : zzsr.intValue();
        PrintStream printStream = System.err;
        String name = zza.class.getName();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
        stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
        stringBuilder.append(name);
        stringBuilder.append("will be used. The error is: ");
        printStream.println(stringBuilder.toString());
        th.printStackTrace(System.err);
        zzxn = new zza();
        zzbqa = zzxn;
        if (zzsr == null) {
        }
        zzbqb = zzsr == null ? 1 : zzsr.intValue();
    }

    public static void zza(Throwable th, PrintStream printStream) {
        zzbqa.zza(th, printStream);
    }

    private static Integer zzsr() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
