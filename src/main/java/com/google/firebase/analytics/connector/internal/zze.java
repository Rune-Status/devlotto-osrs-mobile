package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement.OnEventListener;

final class zze implements OnEventListener {
    private final /* synthetic */ zzd zzbqu;

    public zze(zzd zzd) {
        this.zzbqu = zzd;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (this.zzbqu.zzbqr.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzc.zzfi(str2));
            this.zzbqu.zzbqs.onMessageTriggered(2, bundle2);
        }
    }
}
