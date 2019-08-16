package com.google.android.gms.internal.measurement;

final class zzzu implements zzaap {
    private static final zzzu zzbue = new zzzu();

    private zzzu() {
    }

    public static zzzu zzua() {
        return zzbue;
    }

    public final boolean zzd(Class<?> cls) {
        return zzzv.class.isAssignableFrom(cls);
    }

    public final zzaao zze(Class<?> cls) {
        String valueOf;
        if (zzzv.class.isAssignableFrom(cls)) {
            try {
                return (zzaao) zzzv.zzf(cls.asSubclass(zzzv.class)).zza(3, null, null);
            } catch (Exception e) {
                Throwable th = e;
                valueOf = String.valueOf(cls.getName());
                throw new RuntimeException(valueOf.length() != 0 ? "Unable to get message info for ".concat(valueOf) : new String("Unable to get message info for "), th);
            }
        }
        valueOf = String.valueOf(cls.getName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
    }
}
