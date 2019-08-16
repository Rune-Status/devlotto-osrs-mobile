package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

public class WorkAccount {
    public static final Api<NoOptions> API = new Api("WorkAccount.API", CLIENT_BUILDER, CLIENT_KEY);
    private static final AbstractClientBuilder<zzr, NoOptions> CLIENT_BUILDER = new zzf();
    private static final ClientKey<zzr> CLIENT_KEY = new ClientKey();
    @Deprecated
    public static final WorkAccountApi WorkAccountApi = new zzh();

    private WorkAccount() {
    }

    public static WorkAccountClient getClient(@NonNull Activity activity) {
        return new WorkAccountClient(activity);
    }

    public static WorkAccountClient getClient(@NonNull Context context) {
        return new WorkAccountClient(context);
    }
}
