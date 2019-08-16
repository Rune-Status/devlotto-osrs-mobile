package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

final class zaz implements OnCompleteListener<Map<zai<?>, String>> {
    private final /* synthetic */ zax zafh;

    private zaz(zax zax) {
        this.zafh = zax;
    }

    public final void onComplete(@NonNull Task<Map<zai<?>, String>> task) {
        this.zafh.zaen.lock();
        try {
            if (this.zafh.zafc) {
                if (task.isSuccessful()) {
                    this.zafh.zafd = new ArrayMap(this.zafh.zaet.size());
                    for (zaw zak : this.zafh.zaet.values()) {
                        this.zafh.zafd.put(zak.zak(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.getException();
                    if (this.zafh.zafa) {
                        this.zafh.zafd = new ArrayMap(this.zafh.zaet.size());
                        for (zaw zaw : this.zafh.zaet.values()) {
                            zai zak2 = zaw.zak();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(zaw);
                            if (this.zafh.zaa(zaw, connectionResult)) {
                                this.zafh.zafd.put(zak2, new ConnectionResult(16));
                            } else {
                                this.zafh.zafd.put(zak2, connectionResult);
                            }
                        }
                    } else {
                        this.zafh.zafd = availabilityException.zaj();
                    }
                    this.zafh.zafg = this.zafh.zaaf();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                    this.zafh.zafd = Collections.emptyMap();
                    this.zafh.zafg = new ConnectionResult(8);
                }
                if (this.zafh.zafe != null) {
                    this.zafh.zafd.putAll(this.zafh.zafe);
                    this.zafh.zafg = this.zafh.zaaf();
                }
                if (this.zafh.zafg == null) {
                    this.zafh.zaad();
                    this.zafh.zaae();
                } else {
                    this.zafh.zafc = false;
                    this.zafh.zaew.zac(this.zafh.zafg);
                }
                this.zafh.zaey.signalAll();
                this.zafh.zaen.unlock();
            }
        } finally {
            this.zafh.zaen.unlock();
        }
    }
}
