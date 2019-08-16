package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zack extends TaskApiCall<A, ResultT> {
    private final /* synthetic */ Builder zakm;

    zack(Builder builder, Feature[] featureArr, boolean z) {
        this.zakm = builder;
        super(featureArr, z, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void doExecute(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException {
        this.zakm.zakl.accept(a, taskCompletionSource);
    }
}
