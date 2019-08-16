package android.support.v4.os;

import android.os.Build.VERSION;

public final class CancellationSignal {
    private boolean mCancelInProgress;
    private Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
        void onCancel();
    }

    private void waitForCancelFinishedLocked() {
        while (this.mCancelInProgress) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    /* JADX WARNING: Missing block: B:7:0x0012, code skipped:
            if (r1 == null) goto L_0x0017;
     */
    /* JADX WARNING: Missing block: B:9:?, code skipped:
            r1.onCancel();
     */
    /* JADX WARNING: Missing block: B:10:0x0017, code skipped:
            if (r0 == null) goto L_0x0024;
     */
    /* JADX WARNING: Missing block: B:12:0x001d, code skipped:
            if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0024;
     */
    /* JADX WARNING: Missing block: B:13:0x001f, code skipped:
            ((android.os.CancellationSignal) r0).cancel();
     */
    /* JADX WARNING: Missing block: B:14:0x0024, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r3.mCancelInProgress = false;
            notifyAll();
     */
    /* JADX WARNING: Missing block: B:18:0x002b, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:24:0x0031, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:27:?, code skipped:
            r3.mCancelInProgress = false;
            notifyAll();
     */
    /* JADX WARNING: Missing block: B:45:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        synchronized (this) {
            if (this.mIsCanceled) {
                return;
            }
            this.mIsCanceled = true;
            this.mCancelInProgress = true;
            OnCancelListener onCancelListener = this.mOnCancelListener;
            Object obj = this.mCancellationSignalObj;
        }
    }

    public Object getCancellationSignalObject() {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Object obj;
        synchronized (this) {
            if (this.mCancellationSignalObj == null) {
                this.mCancellationSignalObj = new android.os.CancellationSignal();
                if (this.mIsCanceled) {
                    ((android.os.CancellationSignal) this.mCancellationSignalObj).cancel();
                }
            }
            obj = this.mCancellationSignalObj;
        }
        return obj;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.mIsCanceled;
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:17:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOnCancelListener(OnCancelListener onCancelListener) {
        synchronized (this) {
            waitForCancelFinishedLocked();
            if (this.mOnCancelListener == onCancelListener) {
                return;
            }
            this.mOnCancelListener = onCancelListener;
            if (!this.mIsCanceled || onCancelListener == null) {
            } else {
                onCancelListener.onCancel();
            }
        }
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new OperationCanceledException();
        }
    }
}
