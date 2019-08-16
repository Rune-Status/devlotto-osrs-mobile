package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgd {
    private final zzgg zzamz;

    public zzgd(zzgg zzgg) {
        Preconditions.checkNotNull(zzgg);
        this.zzamz = zzgg;
    }

    public static boolean zza(Context context) {
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            return receiverInfo != null && receiverInfo.enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        zzgn zza = zzgn.zza(context, null, null);
        zzfi zzgi = zza.zzgi();
        if (intent == null) {
            zzgi.zziy().log("Receiver called with null intent");
            return;
        }
        zza.zzgl();
        String action = intent.getAction();
        zzgi.zzjc().zzg("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzgi.zzjc().log("Starting wakeful intent.");
            this.zzamz.doStartService(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                zza.zzgh().zzc(new zzge(this, zza, zzgi));
            } catch (Exception e) {
                zzgi.zziy().zzg("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult doGoAsync = this.zzamz.doGoAsync();
            action = intent.getStringExtra("referrer");
            if (action == null) {
                zzgi.zzjc().log("Install referrer extras are null");
                if (doGoAsync != null) {
                    doGoAsync.finish();
                    return;
                }
                return;
            }
            zzgi.zzja().zzg("Install referrer extras are", action);
            if (!action.contains("?")) {
                action = String.valueOf(action);
                action = action.length() != 0 ? "?".concat(action) : new String("?");
            }
            Bundle zza2 = zza.zzgg().zza(Uri.parse(action));
            if (zza2 == null) {
                zzgi.zzjc().log("No campaign defined in install referrer broadcast");
                if (doGoAsync != null) {
                    doGoAsync.finish();
                    return;
                }
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0);
            if (longExtra == 0) {
                zzgi.zziy().log("Install referrer is missing timestamp");
            }
            zza.zzgh().zzc(new zzgf(this, zza, longExtra, zza2, context, zzgi, doGoAsync));
        }
    }
}
