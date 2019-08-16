package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzs implements Runnable {
    private final zzr zzbo;
    private final Bundle zzbp;
    private final TaskCompletionSource zzbq;

    zzs(zzr zzr, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.zzbo = zzr;
        this.zzbp = bundle;
        this.zzbq = taskCompletionSource;
    }

    public final void run() {
        this.zzbo.zza(this.zzbp, this.zzbq);
    }
}
