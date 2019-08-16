package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

final class zzaw implements ProxyResult {
    private Status mStatus;
    private ProxyResponse zzch;

    public zzaw(ProxyResponse proxyResponse) {
        this.zzch = proxyResponse;
        this.mStatus = Status.RESULT_SUCCESS;
    }

    public zzaw(Status status) {
        this.mStatus = status;
    }

    public final ProxyResponse getResponse() {
        return this.zzch;
    }

    public final Status getStatus() {
        return this.mStatus;
    }
}
