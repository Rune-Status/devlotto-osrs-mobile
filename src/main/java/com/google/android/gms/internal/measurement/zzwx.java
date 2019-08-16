package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.support.v4.content.PermissionChecker;
import android.util.Log;
import javax.annotation.Nullable;

public abstract class zzwx<T> {
    private static final Object zzbpg = new Object();
    private static boolean zzbph = false;
    private static volatile Boolean zzbpi = null;
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzqx = null;
    private final zzxh zzbpj;
    final String zzbpk;
    private final String zzbpl;
    private final T zzbpm;
    private T zzbpn;
    private volatile zzwu zzbpo;
    private volatile SharedPreferences zzbpp;

    private zzwx(zzxh zzxh, String str, T t) {
        this.zzbpn = null;
        this.zzbpo = null;
        this.zzbpp = null;
        if (zzxh.zzbpv != null) {
            this.zzbpj = zzxh;
            String valueOf = String.valueOf(zzxh.zzbpw);
            String valueOf2 = String.valueOf(str);
            this.zzbpl = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            valueOf = String.valueOf(zzxh.zzbpx);
            valueOf2 = String.valueOf(str);
            this.zzbpk = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            this.zzbpm = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ zzwx(zzxh zzxh, String str, Object obj, zzxb zzxb) {
        this(zzxh, str, obj);
    }

    public static void init(Context context) {
        synchronized (zzbpg) {
            if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (zzqx != context) {
                zzbpi = null;
            }
            zzqx = context;
        }
        zzbph = false;
    }

    private static zzwx<Double> zza(zzxh zzxh, String str, double d) {
        return new zzxe(zzxh, str, Double.valueOf(d));
    }

    private static zzwx<Integer> zza(zzxh zzxh, String str, int i) {
        return new zzxc(zzxh, str, Integer.valueOf(i));
    }

    private static zzwx<Long> zza(zzxh zzxh, String str, long j) {
        return new zzxb(zzxh, str, Long.valueOf(j));
    }

    private static zzwx<String> zza(zzxh zzxh, String str, String str2) {
        return new zzxf(zzxh, str, str2);
    }

    private static zzwx<Boolean> zza(zzxh zzxh, String str, boolean z) {
        return new zzxd(zzxh, str, Boolean.valueOf(z));
    }

    private static <V> V zza(zzxg<V> zzxg) {
        long clearCallingIdentity;
        try {
            return zzxg.zzsq();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zzsq = zzxg.zzsq();
            return zzsq;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    static boolean zzd(String str, boolean z) {
        try {
            return zzso() ? ((Boolean) zza(new zzxa(str, false))).booleanValue() : false;
        } catch (SecurityException e) {
            Log.e("PhenotypeFlag", "Unable to read GServices, returning default value.", e);
            return false;
        }
    }

    @TargetApi(24)
    @Nullable
    private final T zzsm() {
        String valueOf;
        if (zzd("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            valueOf = String.valueOf(this.zzbpk);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.zzbpj.zzbpv != null) {
            if (this.zzbpo == null) {
                this.zzbpo = zzwu.zza(zzqx.getContentResolver(), this.zzbpj.zzbpv);
            }
            valueOf = (String) zza(new zzwy(this, this.zzbpo));
            if (valueOf != null) {
                return zzfa(valueOf);
            }
        } else {
            zzxh zzxh = this.zzbpj;
        }
        return null;
    }

    @Nullable
    private final T zzsn() {
        zzxh zzxh = this.zzbpj;
        if (zzso()) {
            String str;
            try {
                str = (String) zza(new zzwz(this));
                if (str != null) {
                    return zzfa(str);
                }
            } catch (SecurityException e) {
                Throwable th = e;
                str = String.valueOf(this.zzbpk);
                Log.e("PhenotypeFlag", str.length() != 0 ? "Unable to read GServices for flag: ".concat(str) : new String("Unable to read GServices for flag: "), th);
            }
        }
        return null;
    }

    private static boolean zzso() {
        boolean z = false;
        if (zzbpi == null) {
            if (zzqx == null) {
                return false;
            }
            if (PermissionChecker.checkSelfPermission(zzqx, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            zzbpi = Boolean.valueOf(z);
        }
        return zzbpi.booleanValue();
    }

    public final T get() {
        if (zzqx != null) {
            zzxh zzxh = this.zzbpj;
            Object zzsm = zzsm();
            if (zzsm != null) {
                return zzsm;
            }
            zzsm = zzsn();
            return zzsm == null ? this.zzbpm : zzsm;
        } else {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
    }

    public abstract T zzfa(String str);

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ String zzsp() {
        return zzws.zza(zzqx.getContentResolver(), this.zzbpl, null);
    }
}
