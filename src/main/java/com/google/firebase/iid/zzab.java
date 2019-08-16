package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zzb;
import com.google.android.gms.internal.firebase_messaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzab {
    @GuardedBy("MessengerIpcClient.class")
    private static zzab zzbx;
    private final Context zzac;
    private final ScheduledExecutorService zzby;
    @GuardedBy("this")
    private zzad zzbz = new zzad(this);
    @GuardedBy("this")
    private int zzca = 1;

    @VisibleForTesting
    private zzab(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzby = scheduledExecutorService;
        this.zzac = context.getApplicationContext();
    }

    private final <T> Task<T> zza(zzak<T> zzak) {
        Task task;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(zzak);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 9);
                stringBuilder.append("Queueing ");
                stringBuilder.append(valueOf);
                Log.d("MessengerIpcClient", stringBuilder.toString());
            }
            if (!this.zzbz.zzb(zzak)) {
                this.zzbz = new zzad(this);
                this.zzbz.zzb(zzak);
            }
            task = zzak.zzck.getTask();
        }
        return task;
    }

    public static zzab zzc(Context context) {
        synchronized (zzab.class) {
            Class zza;
            try {
                if (zzbx == null) {
                    zza = zzb.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), zze.zzd);
                    zzbx = new zzab(context, zza);
                }
                zzab zzab = zzbx;
                return zzab;
            } finally {
                zza = zzab.class;
            }
        }
    }

    private final int zzx() {
        int i;
        synchronized (this) {
            i = this.zzca;
            this.zzca = i + 1;
        }
        return i;
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return zza(new zzaj(zzx(), 2, bundle));
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return zza(new zzam(zzx(), 1, bundle));
    }
}
