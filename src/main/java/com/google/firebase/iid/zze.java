package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final /* synthetic */ class zze implements Runnable {
    private final zzd zzx;
    private final Intent zzy;

    zze(zzd zzd, Intent intent) {
        this.zzx = zzd;
        this.zzy = intent;
    }

    public final void run() {
        zzd zzd = this.zzx;
        String action = this.zzy.getAction();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(action).length() + 61);
        stringBuilder.append("Service took too long to process intent: ");
        stringBuilder.append(action);
        stringBuilder.append(" App may get closed.");
        Log.w("EnhancedIntentService", stringBuilder.toString());
        zzd.finish();
    }
}
