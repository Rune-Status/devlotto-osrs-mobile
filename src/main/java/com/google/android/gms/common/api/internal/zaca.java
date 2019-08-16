package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RegistrationMethods.Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaca extends RegisterListenerMethod<A, L> {
    private final /* synthetic */ Builder zakg;

    zaca(Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z) {
        this.zakg = builder;
        super(listenerHolder, featureArr, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void registerListener(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.zakg.zaka.accept(a, taskCompletionSource);
    }
}
