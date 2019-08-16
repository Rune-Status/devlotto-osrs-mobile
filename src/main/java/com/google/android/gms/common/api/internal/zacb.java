package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.RegistrationMethods.Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacb extends UnregisterListenerMethod<A, L> {
    private final /* synthetic */ Builder zakg;

    zacb(Builder builder, ListenerKey listenerKey) {
        this.zakg = builder;
        super(listenerKey);
    }

    /* Access modifiers changed, original: protected|final */
    public final void unregisterListener(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        this.zakg.zakb.accept(a, taskCompletionSource);
    }
}
