package com.google.firebase.iid;

import android.util.Log;

final class zzg implements Runnable {
    private final /* synthetic */ zzd zzaa;
    private final /* synthetic */ zzf zzab;

    zzg(zzf zzf, zzd zzd) {
        this.zzab = zzf;
        this.zzaa = zzd;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.zzab.zzz.zzd(this.zzaa.intent);
        this.zzaa.finish();
    }
}
