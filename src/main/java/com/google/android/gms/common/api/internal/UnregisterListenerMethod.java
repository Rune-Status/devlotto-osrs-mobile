package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod<A extends AnyClient, L> {
    private final ListenerKey<L> zajk;

    @KeepForSdk
    protected UnregisterListenerMethod(ListenerKey<L> listenerKey) {
        this.zajk = listenerKey;
    }

    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zajk;
    }

    @KeepForSdk
    public abstract void unregisterListener(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
