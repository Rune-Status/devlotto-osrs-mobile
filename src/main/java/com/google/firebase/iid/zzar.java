package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzar implements Continuation {
    private final zzaq zzct;
    private final Pair zzcu;

    zzar(zzaq zzaq, Pair pair) {
        this.zzct = zzaq;
        this.zzcu = pair;
    }

    public final Object then(Task task) {
        return this.zzct.zza(this.zzcu, task);
    }
}
