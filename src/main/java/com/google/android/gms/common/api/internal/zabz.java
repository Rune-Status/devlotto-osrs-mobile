package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.RegistrationMethods.Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zabz implements RemoteCall {
    private final Builder zakf;

    zabz(Builder builder) {
        this.zakf = builder;
    }

    public final void accept(Object obj, Object obj2) {
        this.zakf.zaa((AnyClient) obj, (TaskCompletionSource) obj2);
    }
}
