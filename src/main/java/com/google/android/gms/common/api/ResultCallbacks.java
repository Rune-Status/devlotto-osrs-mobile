package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@NonNull Status status);

    @KeepForSdk
    public final void onResult(@NonNull R r) {
        Status status = r.getStatus();
        if (status.isSuccess()) {
            onSuccess(r);
            return;
        }
        onFailure(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("ResultCallbacks", stringBuilder.toString(), e);
            }
        }
    }

    public abstract void onSuccess(@NonNull R r);
}
