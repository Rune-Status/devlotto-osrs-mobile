package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class zzax implements SpatulaHeaderResult {
    private Status mStatus;
    private String zzci;

    public zzax(@Nonnull Status status) {
        this.mStatus = (Status) Preconditions.checkNotNull(status);
    }

    public zzax(@Nonnull String str) {
        this.zzci = (String) Preconditions.checkNotNull(str);
        this.mStatus = Status.RESULT_SUCCESS;
    }

    @Nullable
    public final String getSpatulaHeader() {
        return this.zzci;
    }

    @Nullable
    public final Status getStatus() {
        return this.mStatus;
    }
}
