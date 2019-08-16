package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

final class zzr<TResult> {
    private final Object mLock = new Object();
    @GuardedBy("mLock")
    private Queue<zzq<TResult>> zzt;
    @GuardedBy("mLock")
    private boolean zzu;

    zzr() {
    }

    /* JADX WARNING: Missing block: B:10:0x0011, code skipped:
            r1 = r2.mLock;
     */
    /* JADX WARNING: Missing block: B:11:0x0013, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            r0 = (com.google.android.gms.tasks.zzq) r2.zzt.poll();
     */
    /* JADX WARNING: Missing block: B:14:0x001c, code skipped:
            if (r0 != null) goto L_0x0026;
     */
    /* JADX WARNING: Missing block: B:15:0x001e, code skipped:
            r2.zzu = false;
     */
    /* JADX WARNING: Missing block: B:16:0x0021, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:23:0x0027, code skipped:
            r0.onComplete(r3);
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(@NonNull Task<TResult> task) {
        synchronized (this.mLock) {
            if (this.zzt == null || this.zzu) {
            } else {
                this.zzu = true;
            }
        }
    }

    public final void zza(@NonNull zzq<TResult> zzq) {
        synchronized (this.mLock) {
            if (this.zzt == null) {
                this.zzt = new ArrayDeque();
            }
            this.zzt.add(zzq);
        }
    }
}
