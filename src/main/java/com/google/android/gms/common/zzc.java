package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
final class zzc {
    private static volatile zzm zzn;
    private static final Object zzo = new Object();
    private static Context zzp;

    static zzm zza(String str, zze zze, boolean z) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzm zzb = zzb(str, zze, z);
            return zzb;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static void zza(Context context) {
        synchronized (zzc.class) {
            try {
                if (zzp != null) {
                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                } else if (context != null) {
                    Object applicationContext = context.getApplicationContext();
                    zzp = applicationContext;
                    return;
                }
            } finally {
                Class cls = zzc.class;
            }
        }
    }

    private static zzm zzb(String str, zze zze, boolean z) {
        try {
            if (zzn == null) {
                Preconditions.checkNotNull(zzp);
                synchronized (zzo) {
                    if (zzn == null) {
                        zzn = zzn.zzc(DynamiteModule.load(zzp, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            Preconditions.checkNotNull(zzp);
            try {
                return zzn.zza(new zzk(str, zze, z), ObjectWrapper.wrap(zzp.getPackageManager())) ? zzm.zze() : zzm.zza(new zzd(z, str, zze));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return zzm.zza("module call", e);
            }
        } catch (LoadingException e2) {
            Throwable th = e2;
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", th);
            String valueOf = String.valueOf(th.getMessage());
            return zzm.zza(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), th);
        }
    }
}
