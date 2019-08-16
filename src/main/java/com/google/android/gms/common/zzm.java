package com.google.android.gms.common;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
class zzm {
    private static final zzm zzab = new zzm(true, null, null);
    private final Throwable cause;
    final boolean zzac;
    private final String zzad;

    zzm(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.zzac = z;
        this.zzad = str;
        this.cause = th;
    }

    static zzm zza(@NonNull String str, @NonNull Throwable th) {
        return new zzm(false, str, th);
    }

    static zzm zza(Callable<String> callable) {
        return new zzo(callable);
    }

    static String zza(String str, zze zze, boolean z, boolean z2) {
        String str2 = z2 ? "debug cert rejected" : "not whitelisted";
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{str2, str, Hex.zza(AndroidUtilsLight.zzi("SHA-1").digest(zze.getBytes())), Boolean.valueOf(z), "12451009.false"});
    }

    static zzm zzb(@NonNull String str) {
        return new zzm(false, str, null);
    }

    static zzm zze() {
        return zzab;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public String getErrorMessage() {
        return this.zzad;
    }

    /* Access modifiers changed, original: final */
    public final void zzf() {
        if (!this.zzac && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.cause != null) {
                Log.d("GoogleCertificatesRslt", getErrorMessage(), this.cause);
            } else {
                Log.d("GoogleCertificatesRslt", getErrorMessage());
            }
        }
    }
}
