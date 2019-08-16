package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
public class InstantApps {
    private static Context zzht;
    private static Boolean zzhu;

    @KeepForSdk
    public static boolean isInstantApp(Context context) {
        boolean booleanValue;
        synchronized (InstantApps.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (zzht == null || zzhu == null || zzht != applicationContext) {
                    zzhu = null;
                    if (PlatformVersion.isAtLeastO()) {
                        zzhu = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                    } else {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        zzhu = Boolean.valueOf(true);
                    }
                    zzht = applicationContext;
                    booleanValue = zzhu.booleanValue();
                } else {
                    booleanValue = zzhu.booleanValue();
                }
            } catch (ClassNotFoundException e) {
                zzhu = Boolean.valueOf(false);
            } catch (Throwable th) {
                Class cls = InstantApps.class;
            }
        }
        return booleanValue;
    }
}
