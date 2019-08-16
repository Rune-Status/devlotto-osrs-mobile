package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zah extends zad<Boolean> {
    private final ListenerKey<?> zacs;

    public zah(ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zacs = listenerKey;
    }

    public final /* bridge */ /* synthetic */ void zaa(@NonNull zaab zaab, boolean z) {
    }

    @Nullable
    public final Feature[] zab(zaa<?> zaa) {
        zabw zabw = (zabw) zaa.zabk().get(this.zacs);
        return zabw == null ? null : zabw.zajw.getRequiredFeatures();
    }

    public final boolean zac(zaa<?> zaa) {
        zabw zabw = (zabw) zaa.zabk().get(this.zacs);
        return zabw != null && zabw.zajw.shouldAutoResolveMissingFeatures();
    }

    public final void zad(zaa<?> zaa) throws RemoteException {
        zabw zabw = (zabw) zaa.zabk().remove(this.zacs);
        if (zabw != null) {
            zabw.zajx.unregisterListener(zaa.zaab(), this.zacm);
            zabw.zajw.clearListener();
            return;
        }
        this.zacm.trySetResult(Boolean.valueOf(false));
    }
}
