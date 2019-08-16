package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzabr {
    private static final Logger logger = Logger.getLogger(zzabr.class.getName());
    private static final Class<?> zzbtc = zzza.zztl();
    private static final Unsafe zzbvq = zzvg();
    private static final boolean zzbwu = zzk(Long.TYPE);
    private static final boolean zzbwv = zzk(Integer.TYPE);
    private static final zzd zzbww;
    private static final boolean zzbwx = zzvi();
    private static final boolean zzbwy = zzvh();
    private static final long zzbwz = ((long) zzi(byte[].class));
    private static final long zzbxa = ((long) zzi(boolean[].class));
    private static final long zzbxb = ((long) zzj(boolean[].class));
    private static final long zzbxc = ((long) zzi(int[].class));
    private static final long zzbxd = ((long) zzj(int[].class));
    private static final long zzbxe = ((long) zzi(long[].class));
    private static final long zzbxf = ((long) zzj(long[].class));
    private static final long zzbxg = ((long) zzi(float[].class));
    private static final long zzbxh = ((long) zzj(float[].class));
    private static final long zzbxi = ((long) zzi(double[].class));
    private static final long zzbxj = ((long) zzj(double[].class));
    private static final long zzbxk = ((long) zzi(Object[].class));
    private static final long zzbxl = ((long) zzj(Object[].class));
    private static final long zzbxm = zza(zzvj());
    private static final long zzbxn;
    private static final boolean zzbxo = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    static abstract class zzd {
        Unsafe zzbxp;

        zzd(Unsafe unsafe) {
            this.zzbxp = unsafe;
        }
    }

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        zzd zzc;
        Field zza;
        Field field = null;
        if (zzbvq != null) {
            if (!zzza.zztk()) {
                zzc = new zzc(zzbvq);
            } else if (zzbwu) {
                zzc = new zzb(zzbvq);
            } else if (zzbwv) {
                zzc = new zza(zzbvq);
            }
            zzbww = zzc;
            zza = zza(String.class, Param.VALUE);
            if (zza != null && zza.getType() == char[].class) {
                field = zza;
            }
            zzbxn = zza(field);
        }
        zzc = null;
        zzbww = zzc;
        zza = zza(String.class, Param.VALUE);
        field = zza;
        zzbxn = zza(field);
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
    }

    private zzabr() {
    }

    private static long zza(Field field) {
        return (field == null || zzbww == null) ? -1 : zzbww.zzbxp.objectFieldOffset(field);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    private static int zzi(Class<?> cls) {
        return zzbwy ? zzbww.zzbxp.arrayBaseOffset(cls) : -1;
    }

    private static int zzj(Class<?> cls) {
        return zzbwy ? zzbww.zzbxp.arrayIndexScale(cls) : -1;
    }

    private static boolean zzk(Class<?> cls) {
        if (!zzza.zztk()) {
            return false;
        }
        try {
            Class cls2 = zzbtc;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    static Unsafe zzvg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzabs());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean zzvh() {
        if (zzbvq == null) {
            return false;
        }
        try {
            Class cls = zzbvq.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zzza.zztk()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
            return false;
        }
    }

    private static boolean zzvi() {
        if (zzbvq == null) {
            return false;
        }
        try {
            Class cls = zzbvq.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzvj() == null) {
                return false;
            }
            if (zzza.zztk()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
            return false;
        }
    }

    private static Field zzvj() {
        Field zza;
        if (zzza.zztk()) {
            zza = zza(Buffer.class, "effectiveDirectAddress");
            if (zza != null) {
                return zza;
            }
        }
        zza = zza(Buffer.class, "address");
        return (zza == null || zza.getType() != Long.TYPE) ? null : zza;
    }
}
