package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

public final class zaw<O extends ApiOptions> extends GoogleApi<O> {
    private final AbstractClientBuilder<? extends zad, SignInOptions> zacd;
    private final Client zaeq;
    private final zaq zaer;
    private final ClientSettings zaes;

    public zaw(@NonNull Context context, Api<O> api, Looper looper, @NonNull Client client, @NonNull zaq zaq, ClientSettings clientSettings, AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.zaeq = client;
        this.zaer = zaq;
        this.zaes = clientSettings;
        this.zacd = abstractClientBuilder;
        this.zabm.zaa((GoogleApi) this);
    }

    public final Client zaa(Looper looper, zaa<O> zaa) {
        this.zaer.zaa(zaa);
        return this.zaeq;
    }

    public final zace zaa(Context context, Handler handler) {
        return new zace(context, handler, this.zaes, this.zacd);
    }

    public final Client zaab() {
        return this.zaeq;
    }
}
