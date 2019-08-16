package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zaby implements RemoteCall {
    private final BiConsumer zake;

    zaby(BiConsumer biConsumer) {
        this.zake = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.zake.accept((AnyClient) obj, (TaskCompletionSource) obj2);
    }
}
