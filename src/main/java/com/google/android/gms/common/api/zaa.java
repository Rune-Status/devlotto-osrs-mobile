package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult.StatusListener;

final class zaa implements StatusListener {
    private final /* synthetic */ Batch zabd;

    zaa(Batch batch) {
        this.zabd = batch;
    }

    /* JADX WARNING: Missing block: B:29:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(Status status) {
        synchronized (this.zabd.mLock) {
            if (this.zabd.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                this.zabd.zabb = true;
            } else if (!status.isSuccess()) {
                this.zabd.zaba = true;
            }
            this.zabd.zaaz = this.zabd.zaaz - 1;
            if (this.zabd.zaaz == 0) {
                if (this.zabd.zabb) {
                    super.cancel();
                } else {
                    this.zabd.setResult(new BatchResult(this.zabd.zaba ? new Status(13) : Status.RESULT_SUCCESS, this.zabd.zabc));
                }
            }
        }
    }
}
