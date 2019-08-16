package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.firebase_messaging.zzaa;
import com.google.android.gms.internal.firebase_messaging.zzab;
import com.google.android.gms.internal.firebase_messaging.zzn;
import com.google.android.gms.internal.firebase_messaging.zzo;
import com.google.android.gms.internal.firebase_messaging.zzp;
import com.google.android.gms.internal.firebase_messaging.zzq;
import com.google.android.gms.internal.firebase_messaging.zzr;
import com.google.android.gms.internal.firebase_messaging.zzu;
import com.google.android.gms.internal.firebase_messaging.zzv;
import java.util.List;

final class zza {
    private final Context zzac;
    private final Bundle zzcl;

    public zza(Context context, Bundle bundle) {
        this.zzac = context.getApplicationContext();
        this.zzcl = bundle;
    }

    private final Bundle zzas() {
        try {
            Bundle bundle = this.zzac.getPackageManager().getApplicationInfo(this.zzac.getPackageName(), 128).metaData;
            return bundle != null ? bundle : Bundle.EMPTY;
        } catch (NameNotFoundException e) {
            return Bundle.EMPTY;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzar() {
        zzq zzq = new zzq("FirebaseMessaging", this.zzcl);
        if ("1".equals(zzq.getString("gcm.n.noui"))) {
            return true;
        }
        int i;
        if (!((KeyguardManager) this.zzac.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.zzac.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (runningAppProcessInfo.importance == 100) {
                            i = 1;
                            if (i == 0) {
                                return false;
                            }
                            PackageManager packageManager = this.zzac.getPackageManager();
                            String packageName = this.zzac.getPackageName();
                            ApplicationInfo applicationInfo = this.zzac.getApplicationInfo();
                            zzv zzn = new zzn(this.zzac);
                            zzab zzax = new zzr(this.zzac, new zzaa(new zzu(this.zzcl, packageName).zzc(applicationInfo.icon).zza(applicationInfo.loadLabel(packageManager)).zzf(packageManager.getLaunchIntentForPackage(packageName)).zza(zzn).zza(new zzo(this.zzac)).zza(new zzb(this, (NotificationManager) this.zzac.getSystemService("notification"))).zzq("FCM-Notification").zzi(zzas()).zza(this.zzac.getResources()).zza(new zzp(this.zzac, this.zzcl)).zzd(applicationInfo.targetSdkVersion).zzbe(), zzq)).zzax();
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Showing notification");
                            }
                            ((NotificationManager) this.zzac.getSystemService("notification")).notify(zzax.tag, 0, zzax.zzfd.build());
                            return true;
                        }
                    }
                }
            }
        }
        i = 0;
        if (i == 0) {
        }
    }
}
