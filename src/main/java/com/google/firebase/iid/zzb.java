package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.internal.firebase_messaging.zze;
import java.util.concurrent.ExecutorService;

public abstract class zzb extends Service {
    private final Object lock;
    @VisibleForTesting
    final ExecutorService zzn;
    private Binder zzo;
    private int zzp;
    private int zzq;

    public zzb() {
        zza zza = com.google.android.gms.internal.firebase_messaging.zzb.zza();
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.zzn = zza.zza(new NamedThreadFactory(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")), zze.zzd);
        this.lock = new Object();
        this.zzq = 0;
    }

    private final void zza(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            this.zzq--;
            if (this.zzq == 0) {
                stopSelfResult(this.zzp);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        Binder binder;
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.zzo == null) {
                this.zzo = new zzf(this);
            }
            binder = this.zzo;
        }
        return binder;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.zzp = i2;
            this.zzq++;
        }
        Intent zzb = zzb(intent);
        if (zzb == null) {
            zza(intent);
            return 2;
        } else if (zzc(zzb)) {
            zza(intent);
            return 2;
        } else {
            this.zzn.execute(new zzc(this, zzb, intent));
            return 3;
        }
    }

    /* Access modifiers changed, original: protected */
    public Intent zzb(Intent intent) {
        return intent;
    }

    public boolean zzc(Intent intent) {
        return false;
    }

    public abstract void zzd(Intent intent);
}
