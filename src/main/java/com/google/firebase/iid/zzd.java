package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzd {
    final Intent intent;
    private final PendingResult zzu;
    private boolean zzv = false;
    private final ScheduledFuture<?> zzw;

    zzd(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.intent = intent;
        this.zzu = pendingResult;
        this.zzw = scheduledExecutorService.schedule(new zze(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* Access modifiers changed, original: final */
    public final void finish() {
        synchronized (this) {
            if (!this.zzv) {
                this.zzu.finish();
                this.zzw.cancel(false);
                this.zzv = true;
            }
        }
    }
}
