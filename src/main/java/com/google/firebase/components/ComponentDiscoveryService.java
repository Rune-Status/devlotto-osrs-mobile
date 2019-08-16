package com.google.firebase.components;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class ComponentDiscoveryService extends Service {
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
