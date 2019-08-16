package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import com.appsflyer.share.Constants;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class zzav {
    private static zzav zzdb;
    @GuardedBy("serviceClassNames")
    private final SimpleArrayMap<String, String> zzdc = new SimpleArrayMap();
    private Boolean zzdd = null;
    private Boolean zzde = null;
    final Queue<Intent> zzdf = new ArrayDeque();
    private final Queue<Intent> zzdg = new ArrayDeque();

    private zzav() {
    }

    private static Intent zza(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public static zzav zzai() {
        synchronized (zzav.class) {
            try {
                if (zzdb == null) {
                    zzdb = new zzav();
                }
                zzav zzav = zzdb;
                return zzav;
            } finally {
                Object obj = zzav.class;
            }
        }
    }

    public static void zzb(Context context, Intent intent) {
        context.sendBroadcast(zza(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    public static void zzc(Context context, Intent intent) {
        context.sendBroadcast(zza(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb A:{SYNTHETIC, Splitter:B:46:0x00eb} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A:{Catch:{ SecurityException -> 0x00f8, IllegalStateException -> 0x0107 }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A:{Catch:{ SecurityException -> 0x00f8, IllegalStateException -> 0x0107 }} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A:{Catch:{ SecurityException -> 0x00f8, IllegalStateException -> 0x0107 }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb A:{SYNTHETIC, Splitter:B:46:0x00eb} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A:{Catch:{ SecurityException -> 0x00f8, IllegalStateException -> 0x0107 }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzd(Context context, Intent intent) {
        Object obj;
        ComponentName startWakefulService;
        String str;
        String str2;
        synchronized (this.zzdc) {
            obj = (String) this.zzdc.get(intent.getAction());
        }
        if (obj == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null || resolveService.serviceInfo == null) {
                Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                if (zzd(context)) {
                    startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
                } else {
                    startWakefulService = context.startService(intent);
                    Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                }
                if (startWakefulService != null) {
                    return -1;
                }
                Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                str = serviceInfo.packageName;
                str2 = serviceInfo.name;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 94) + String.valueOf(str2).length());
                stringBuilder.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                stringBuilder.append(str);
                stringBuilder.append(Constants.URL_PATH_DELIMITER);
                stringBuilder.append(str2);
                Log.e("FirebaseInstanceId", stringBuilder.toString());
                if (zzd(context)) {
                }
                if (startWakefulService != null) {
                }
            } else {
                obj = serviceInfo.name;
                if (obj.startsWith(".")) {
                    str = String.valueOf(context.getPackageName());
                    str2 = String.valueOf(obj);
                    obj = str2.length() != 0 ? str.concat(str2) : new String(str);
                }
                synchronized (this.zzdc) {
                    this.zzdc.put(intent.getAction(), obj);
                }
            }
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            str = String.valueOf(obj);
            Log.d("FirebaseInstanceId", str.length() != 0 ? "Restricting intent to a specific service: ".concat(str) : new String("Restricting intent to a specific service: "));
        }
        intent.setClassName(context.getPackageName(), obj);
        try {
            if (zzd(context)) {
            }
            if (startWakefulService != null) {
            }
        } catch (SecurityException e) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            str2 = String.valueOf(e2);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str2).length() + 45);
            stringBuilder2.append("Failed to start service while in background: ");
            stringBuilder2.append(str2);
            Log.e("FirebaseInstanceId", stringBuilder2.toString());
            return 402;
        }
    }

    public final Intent zzaj() {
        return (Intent) this.zzdg.poll();
    }

    public final int zzb(Context context, String str, Intent intent) {
        String valueOf;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            valueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Starting service: ".concat(valueOf) : new String("Starting service: "));
        }
        Object obj = -1;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                obj = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            obj = null;
        }
        switch (obj) {
            case null:
                this.zzdf.offer(intent);
                break;
            case 1:
                this.zzdg.offer(intent);
                break;
            default:
                valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Unknown service action: ".concat(valueOf) : new String("Unknown service action: "));
                return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return zzd(context, intent2);
    }

    /* Access modifiers changed, original: final */
    public final boolean zzd(Context context) {
        if (this.zzdd == null) {
            this.zzdd = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.zzdd.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzdd.booleanValue();
    }

    /* Access modifiers changed, original: final */
    public final boolean zze(Context context) {
        if (this.zzde == null) {
            this.zzde = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.zzdd.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzde.booleanValue();
    }
}
