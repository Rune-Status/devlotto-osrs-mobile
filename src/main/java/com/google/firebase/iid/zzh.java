package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.GuardedBy;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class zzh implements ServiceConnection {
    private final Context zzac;
    private final Intent zzad;
    private final ScheduledExecutorService zzae;
    private final Queue<zzd> zzaf;
    private zzf zzag;
    @GuardedBy("this")
    private boolean zzah;

    public zzh(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @VisibleForTesting
    private zzh(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzaf = new ArrayDeque();
        this.zzah = false;
        this.zzac = context.getApplicationContext();
        this.zzad = new Intent(str).setPackage(this.zzac.getPackageName());
        this.zzae = scheduledExecutorService;
    }

    /* JADX WARNING: Missing block: B:45:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzd() {
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "flush queue called");
            }
            while (!this.zzaf.isEmpty()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "found intent to be delivered");
                }
                if (this.zzag == null || !this.zzag.isBinderAlive()) {
                    if (Log.isLoggable("EnhancedIntentService", 3)) {
                        boolean z = this.zzah;
                        StringBuilder stringBuilder = new StringBuilder(39);
                        stringBuilder.append("binder is dead. start connection? ");
                        stringBuilder.append(z ^ 1);
                        Log.d("EnhancedIntentService", stringBuilder.toString());
                    }
                    if (!this.zzah) {
                        this.zzah = true;
                        try {
                            if (ConnectionTracker.getInstance().bindService(this.zzac, this.zzad, this, 65)) {
                                return;
                            }
                            Log.e("EnhancedIntentService", "binding to the service failed");
                            this.zzah = false;
                            zze();
                        } catch (SecurityException e) {
                            Log.e("EnhancedIntentService", "Exception while binding the service", e);
                        }
                    }
                } else {
                    if (Log.isLoggable("EnhancedIntentService", 3)) {
                        Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
                    }
                    this.zzag.zza((zzd) this.zzaf.poll());
                }
            }
            return;
        }
    }

    @GuardedBy("this")
    private final void zze() {
        while (!this.zzaf.isEmpty()) {
            ((zzd) this.zzaf.poll()).finish();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            String valueOf;
            StringBuilder stringBuilder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                valueOf = String.valueOf(componentName);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("onServiceConnected: ");
                stringBuilder.append(valueOf);
                Log.d("EnhancedIntentService", stringBuilder.toString());
            }
            this.zzah = false;
            if (iBinder instanceof zzf) {
                this.zzag = (zzf) iBinder;
                zzd();
                return;
            }
            valueOf = String.valueOf(iBinder);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
            stringBuilder.append("Invalid service connection: ");
            stringBuilder.append(valueOf);
            Log.e("EnhancedIntentService", stringBuilder.toString());
            zze();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("onServiceDisconnected: ");
            stringBuilder.append(valueOf);
            Log.d("EnhancedIntentService", stringBuilder.toString());
        }
        zzd();
    }

    public final void zza(Intent intent, PendingResult pendingResult) {
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            this.zzaf.add(new zzd(intent, pendingResult, this.zzae));
            zzd();
        }
    }
}
