package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzn implements Continuation {
    private final FirebaseInstanceId zzay;
    private final String zzaz;
    private final String zzba;

    zzn(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.zzay = firebaseInstanceId;
        this.zzaz = str;
        this.zzba = str2;
    }

    public final Object then(Task task) {
        return this.zzay.zza(this.zzaz, this.zzba, task);
    }
}
