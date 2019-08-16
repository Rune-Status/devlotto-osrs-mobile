package com.google.firebase.iid;

import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzaq {
    private final Executor executor;
    @GuardedBy("this")
    private final Map<Pair<String, String>, Task<InstanceIdResult>> zzcs = new ArrayMap();

    zzaq(Executor executor) {
        this.executor = executor;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Task zza(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.zzcs.remove(pair);
        }
        return task;
    }

    /* Access modifiers changed, original: final */
    public final Task<InstanceIdResult> zza(String str, String str2, zzas zzas) {
        Task<InstanceIdResult> task;
        synchronized (this) {
            Pair pair = new Pair(str, str2);
            task = (Task) this.zzcs.get(pair);
            StringBuilder stringBuilder;
            if (task != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(pair);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    stringBuilder.append("Joining ongoing request for: ");
                    stringBuilder.append(valueOf);
                    Log.d("FirebaseInstanceId", stringBuilder.toString());
                }
            } else {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf2 = String.valueOf(pair);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                    stringBuilder.append("Making new request for: ");
                    stringBuilder.append(valueOf2);
                    Log.d("FirebaseInstanceId", stringBuilder.toString());
                }
                task = zzas.zzs().continueWithTask(this.executor, new zzar(this, pair));
                this.zzcs.put(pair, task);
            }
        }
        return task;
    }
}
