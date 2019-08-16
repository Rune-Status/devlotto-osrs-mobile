package com.google.firebase.iid;

import android.os.Handler.Callback;
import android.os.Message;

final /* synthetic */ class zzae implements Callback {
    private final zzad zzcg;

    zzae(zzad zzad) {
        this.zzcg = zzad;
    }

    public final boolean handleMessage(Message message) {
        return this.zzcg.zza(message);
    }
}
