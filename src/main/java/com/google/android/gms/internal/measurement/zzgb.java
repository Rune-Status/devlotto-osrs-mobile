package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.MainThread;

final class zzgb implements ServiceConnection {
    final /* synthetic */ zzfz zzamx;

    private zzgb(zzfz zzfz) {
        this.zzamx = zzfz;
    }

    /* synthetic */ zzgb(zzfz zzfz, zzga zzga) {
        this(zzfz);
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zzamx.zzacv.zzgi().zziy().log("Install Referrer connection returned with null binder");
            return;
        }
        try {
            this.zzamx.zzamv = zzs.zza(iBinder);
            if (this.zzamx.zzamv == null) {
                this.zzamx.zzacv.zzgi().zziy().log("Install Referrer Service implementation was not found");
                return;
            }
            this.zzamx.zzacv.zzgi().zzja().log("Install Referrer Service connected");
            this.zzamx.zzacv.zzgh().zzc(new zzgc(this));
        } catch (Exception e) {
            this.zzamx.zzacv.zzgi().zziy().zzg("Exception occurred while calling Install Referrer API", e);
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzamx.zzamv = null;
        this.zzamx.zzacv.zzgi().zzja().log("Install Referrer Service disconnected");
    }
}
