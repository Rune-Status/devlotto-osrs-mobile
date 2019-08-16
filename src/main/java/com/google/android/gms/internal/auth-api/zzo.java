package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;

final class zzo extends zzg {
    private ResultHolder<Status> zzap;

    zzo(ResultHolder<Status> resultHolder) {
        this.zzap = resultHolder;
    }

    public final void zzc(Status status) {
        this.zzap.setResult(status);
    }
}
