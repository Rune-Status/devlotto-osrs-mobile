package com.google.android.gms.internal.firebase_messaging;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

public class zzf extends Handler {
    private static volatile zzg zzf;

    public zzf(Looper looper) {
        super(looper);
    }

    public zzf(Looper looper, Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
