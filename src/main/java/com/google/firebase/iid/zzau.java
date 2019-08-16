package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.zzf;

final class zzau extends zzf {
    private final /* synthetic */ zzat zzda;

    zzau(zzat zzat, Looper looper) {
        this.zzda = zzat;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.zzda.zzb(message);
    }
}
