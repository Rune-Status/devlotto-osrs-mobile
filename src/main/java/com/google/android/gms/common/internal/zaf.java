package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zaf implements BaseConnectionCallbacks {
    private final /* synthetic */ ConnectionCallbacks zaoi;

    zaf(ConnectionCallbacks connectionCallbacks) {
        this.zaoi = connectionCallbacks;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        this.zaoi.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        this.zaoi.onConnectionSuspended(i);
    }
}
