package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

public class zal extends Handler {
    private static volatile zam zaro;

    public zal(Looper looper) {
        super(looper);
    }

    public zal(Looper looper, Callback callback) {
        super(looper, callback);
    }
}
