package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb;

final class zzd implements VersionPolicy {
    zzd() {
    }

    public final zzb zza(Context context, String str, zza zza) throws LoadingException {
        zzb zzb = new zzb();
        zzb.zziq = zza.getLocalVersion(context, str);
        zzb.zzir = zza.zza(context, str, true);
        if (zzb.zziq == 0 && zzb.zzir == 0) {
            zzb.zzis = 0;
        } else if (zzb.zziq >= zzb.zzir) {
            zzb.zzis = -1;
        } else {
            zzb.zzis = 1;
        }
        return zzb;
    }
}
