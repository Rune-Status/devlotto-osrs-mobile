package com.jagex.mobilesdk.payments.utils;

import android.content.IntentFilter;

public class Intents {
    public static IntentFilter getConnectivityIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }
}
