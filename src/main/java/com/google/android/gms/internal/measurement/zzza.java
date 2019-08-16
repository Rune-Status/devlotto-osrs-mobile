package com.google.android.gms.internal.measurement;

final class zzza {
    private static final Class<?> zzbtc = zzfm("libcore.io.Memory");
    private static final boolean zzbtd = (zzfm("org.robolectric.Robolectric") != null);

    private static <T> Class<T> zzfm(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean zztk() {
        return (zzbtc == null || zzbtd) ? false : true;
    }

    static Class<?> zztl() {
        return zzbtc;
    }
}
