package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

final class zaat implements ConnectionCallbacks, OnConnectionFailedListener {
    private final /* synthetic */ zaak zagi;

    private zaat(zaak zaak) {
        this.zagi = zaak;
    }

    /* synthetic */ zaat(zaak zaak, zaal zaal) {
        this(zaak);
    }

    public final void onConnected(Bundle bundle) {
        this.zagi.zaga.zaa(new zaar(this.zagi));
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zagi.zaen.lock();
        try {
            if (this.zagi.zad(connectionResult)) {
                this.zagi.zaar();
                this.zagi.zaap();
            } else {
                this.zagi.zae(connectionResult);
            }
            this.zagi.zaen.unlock();
        } catch (Throwable th) {
            this.zagi.zaen.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
