package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzje<T extends Context & zzji> {
    private final T zzabl;

    public zzje(T t) {
        Preconditions.checkNotNull(t);
        this.zzabl = t;
    }

    private final void zzb(Runnable runnable) {
        zzjt zzg = zzjt.zzg(this.zzabl);
        zzg.zzgh().zzc(new zzjh(this, zzg, runnable));
    }

    private final zzfi zzgi() {
        return zzgn.zza(this.zzabl, null, null).zzgi();
    }

    @MainThread
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            zzgi().zziv().log("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgp(zzjt.zzg(this.zzabl));
        }
        zzgi().zziy().zzg("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public final void onCreate() {
        zzgn zza = zzgn.zza(this.zzabl, null, null);
        zzfi zzgi = zza.zzgi();
        zza.zzgl();
        zzgi.zzjc().log("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void onDestroy() {
        zzgn zza = zzgn.zza(this.zzabl, null, null);
        zzfi zzgi = zza.zzgi();
        zza.zzgl();
        zzgi.zzjc().log("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void onRebind(Intent intent) {
        if (intent == null) {
            zzgi().zziv().log("onRebind called with null intent");
            return;
        }
        zzgi().zzjc().zzg("onRebind called. action", intent.getAction());
    }

    @MainThread
    public final int onStartCommand(Intent intent, int i, int i2) {
        zzgn zza = zzgn.zza(this.zzabl, null, null);
        zzfi zzgi = zza.zzgi();
        if (intent == null) {
            zzgi.zziy().log("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            zza.zzgl();
            zzgi.zzjc().zze("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                zzb(new zzjf(this, i2, zzgi, intent));
            }
        }
        return 2;
    }

    @TargetApi(24)
    @MainThread
    public final boolean onStartJob(JobParameters jobParameters) {
        zzgn zza = zzgn.zza(this.zzabl, null, null);
        zzfi zzgi = zza.zzgi();
        String string = jobParameters.getExtras().getString("action");
        zza.zzgl();
        zzgi.zzjc().zzg("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zzb(new zzjg(this, zzgi, jobParameters));
        }
        return true;
    }

    @MainThread
    public final boolean onUnbind(Intent intent) {
        if (intent == null) {
            zzgi().zziv().log("onUnbind called with null intent");
        } else {
            zzgi().zzjc().zzg("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zza(int i, zzfi zzfi, Intent intent) {
        if (((zzji) this.zzabl).callServiceStopSelfResult(i)) {
            zzfi.zzjc().zzg("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzgi().zzjc().log("Completed wakeful intent.");
            ((zzji) this.zzabl).zzb(intent);
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zza(zzfi zzfi, JobParameters jobParameters) {
        zzfi.zzjc().log("AppMeasurementJobService processed last upload request.");
        ((zzji) this.zzabl).zza(jobParameters, false);
    }
}
