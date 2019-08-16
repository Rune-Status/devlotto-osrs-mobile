package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.common.internal.PendingResultUtil.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

final class zaj implements StatusListener {
    private final /* synthetic */ PendingResult zaou;
    private final /* synthetic */ TaskCompletionSource zaov;
    private final /* synthetic */ ResultConverter zaow;
    private final /* synthetic */ zaa zaox;

    zaj(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, ResultConverter resultConverter, zaa zaa) {
        this.zaou = pendingResult;
        this.zaov = taskCompletionSource;
        this.zaow = resultConverter;
        this.zaox = zaa;
    }

    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.zaov.setResult(this.zaow.convert(this.zaou.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.zaov.setException(this.zaox.zaf(status));
    }
}
