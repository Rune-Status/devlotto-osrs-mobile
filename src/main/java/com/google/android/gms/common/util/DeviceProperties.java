package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {
    private static Boolean zzgl;
    private static Boolean zzgm;
    private static Boolean zzgn;
    private static Boolean zzgo;
    private static Boolean zzgp;
    private static Boolean zzgq;
    private static Boolean zzgr;
    private static Boolean zzgs;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(Context context) {
        if (zzgr == null) {
            boolean z = PlatformVersion.isAtLeastO() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
            zzgr = Boolean.valueOf(z);
        }
        return zzgr.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context) {
        if (zzgp == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services");
            zzgp = Boolean.valueOf(z);
        }
        return zzgp.booleanValue();
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean isSidewinder(Context context) {
        if (zzgo == null) {
            boolean z = PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google");
            zzgo = Boolean.valueOf(z);
        }
        return zzgo.booleanValue();
    }

    /* JADX WARNING: Missing block: B:17:0x0038, code skipped:
            if (zzgm.booleanValue() != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @KeepForSdk
    public static boolean isTablet(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zzgl == null) {
            if (!((resources.getConfiguration().screenLayout & 15) > 3)) {
                if (zzgm == null) {
                    Configuration configuration = resources.getConfiguration();
                    boolean z2 = (configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600;
                    zzgm = Boolean.valueOf(z2);
                }
            }
            z = true;
            zzgl = Boolean.valueOf(z);
        }
        return zzgl.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(Context context) {
        if (zzgs == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback");
            zzgs = Boolean.valueOf(z);
        }
        return zzgs.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @KeepForSdk
    public static boolean isWearable(Context context) {
        if (zzgn == null) {
            boolean z = PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            zzgn = Boolean.valueOf(z);
        }
        return zzgn.booleanValue();
    }

    @TargetApi(26)
    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(Context context) {
        return isWearable(context) && (!PlatformVersion.isAtLeastN() || (isSidewinder(context) && !PlatformVersion.isAtLeastO()));
    }

    public static boolean zzf(Context context) {
        if (zzgq == null) {
            boolean z = context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            zzgq = Boolean.valueOf(z);
        }
        return zzgq.booleanValue();
    }
}
