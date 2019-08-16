package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

public final class zabp<O extends ApiOptions> extends zaag {
    private final GoogleApi<O> zajg;

    public zabp(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zajg = googleApi;
    }

    public final <A extends AnyClient, R extends Result, T extends ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        return this.zajg.doRead((ApiMethodImpl) t);
    }

    public final <A extends AnyClient, T extends ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        return this.zajg.doWrite((ApiMethodImpl) t);
    }

    public final Context getContext() {
        return this.zajg.getApplicationContext();
    }

    public final Looper getLooper() {
        return this.zajg.getLooper();
    }

    public final void zaa(zacm zacm) {
    }

    public final void zab(zacm zacm) {
    }
}
