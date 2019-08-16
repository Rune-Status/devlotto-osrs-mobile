package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzp implements SuccessContinuation {
    private final FirebaseInstanceId zzay;
    private final String zzaz;
    private final String zzba;
    private final String zzbb;

    zzp(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.zzay = firebaseInstanceId;
        this.zzaz = str;
        this.zzba = str2;
        this.zzbb = str3;
    }

    public final Task then(Object obj) {
        return this.zzay.zzb(this.zzaz, this.zzba, this.zzbb, (String) obj);
    }
}
