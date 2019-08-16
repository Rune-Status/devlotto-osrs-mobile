package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics.Param;

public final class zza {
    private static final IntentFilter filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static long zzgt;
    private static float zzgu = Float.NaN;

    @TargetApi(20)
    public static int zzg(Context context) {
        int i = 1;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (!(PlatformVersion.isAtLeastKitKatWatch() ? powerManager.isInteractive() : powerManager.isScreenOn())) {
            i = 0;
        }
        return (i << 1) | i2;
    }

    public static float zzh(Context context) {
        float f;
        synchronized (zza.class) {
            try {
                if (SystemClock.elapsedRealtime() - zzgt >= 60000 || Float.isNaN(zzgu)) {
                    Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
                    if (registerReceiver != null) {
                        zzgu = ((float) registerReceiver.getIntExtra(Param.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                    }
                    zzgt = SystemClock.elapsedRealtime();
                    f = zzgu;
                } else {
                    f = zzgu;
                }
            } finally {
                Object obj = zza.class;
            }
        }
        return f;
    }
}
