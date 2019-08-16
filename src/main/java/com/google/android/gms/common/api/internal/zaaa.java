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

final class zaaa implements OnCompleteListener<Map<zai<?>, String>> {
    private final /* synthetic */ zax zafh;
    private SignInConnectionListener zafi;

    zaaa(zax zax, SignInConnectionListener signInConnectionListener) {
        this.zafh = zax;
        this.zafi = signInConnectionListener;
    }

    /* Access modifiers changed, original: final */
    public final void cancel() {
        this.zafi.onComplete();
    }

    public final void onComplete(@NonNull Task<Map<zai<?>, String>> task) {
        this.zafh.zaen.lock();
        try {
            if (this.zafh.zafc) {
                if (task.isSuccessful()) {
                    this.zafh.zafe = new ArrayMap(this.zafh.zaeu.size());
                    for (zaw zak : this.zafh.zaeu.values()) {
                        this.zafh.zafe.put(zak.zak(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.getException();
                    if (this.zafh.zafa) {
                        this.zafh.zafe = new ArrayMap(this.zafh.zaeu.size());
                        for (zaw zaw : this.zafh.zaeu.values()) {
                            zai zak2 = zaw.zak();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(zaw);
                            if (this.zafh.zaa(zaw, connectionResult)) {
                                this.zafh.zafe.put(zak2, new ConnectionResult(16));
                            } else {
                                this.zafh.zafe.put(zak2, connectionResult);
                            }
                        }
                    } else {
                        this.zafh.zafe = availabilityException.zaj();
                    }
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                    this.zafh.zafe = Collections.emptyMap();
                }
                if (this.zafh.isConnected()) {
                    this.zafh.zafd.putAll(this.zafh.zafe);
                    if (this.zafh.zaaf() == null) {
                        this.zafh.zaad();
                        this.zafh.zaae();
                        this.zafh.zaey.signalAll();
                    }
                }
                this.zafi.onComplete();
                this.zafh.zaen.unlock();
                return;
            }
            this.zafi.onComplete();
        } finally {
            this.zafh.zaen.unlock();
        }
    }
}
