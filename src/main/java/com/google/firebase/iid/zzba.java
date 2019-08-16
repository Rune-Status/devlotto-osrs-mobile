package com.google.firebase.iid;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Map;

final class zzba {
    @GuardedBy("itself")
    private final zzaw zzao;
    @GuardedBy("this")
    private int zzdq = 0;
    @GuardedBy("this")
    private final Map<Integer, TaskCompletionSource<Void>> zzdr = new ArrayMap();

    zzba(zzaw zzaw) {
        this.zzao = zzaw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private static boolean zza(FirebaseInstanceId firebaseInstanceId, String str) {
        String valueOf;
        String[] split = str.split("!");
        if (split.length != 2) {
            return true;
        }
        String str2 = split[0];
        String str3 = split[1];
        int i = -1;
        try {
            int hashCode = str2.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && str2.equals("U")) {
                    i = 1;
                }
            } else if (str2.equals("S")) {
                i = 0;
            }
            switch (i) {
                case 0:
                    firebaseInstanceId.zzb(str3);
                    if (!FirebaseInstanceId.zzm()) {
                        return true;
                    }
                    Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                    return true;
                case 1:
                    firebaseInstanceId.zzc(str3);
                    if (!FirebaseInstanceId.zzm()) {
                        return true;
                    }
                    Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                    return true;
                default:
                    return true;
            }
        } catch (IOException e) {
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
            }
            Log.e("FirebaseInstanceId", valueOf.length() == 0 ? "Topic sync failed: ".concat(valueOf) : new String("Topic sync failed: "));
            return false;
        }
        valueOf = String.valueOf(e.getMessage());
        Log.e("FirebaseInstanceId", valueOf.length() == 0 ? "Topic sync failed: ".concat(valueOf) : new String("Topic sync failed: "));
        return false;
    }

    @Nullable
    @GuardedBy("this")
    private final String zzaq() {
        String zzak;
        synchronized (this.zzao) {
            zzak = this.zzao.zzak();
        }
        if (!TextUtils.isEmpty(zzak)) {
            String[] split = zzak.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    private final boolean zzk(String str) {
        synchronized (this) {
            synchronized (this.zzao) {
                String zzak = this.zzao.zzak();
                String valueOf = String.valueOf(",");
                String valueOf2 = String.valueOf(str);
                if (zzak.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                    valueOf = String.valueOf(",");
                    valueOf2 = String.valueOf(str);
                    this.zzao.zzf(zzak.substring((valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).length()));
                    return true;
                }
                return false;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final Task<Void> zza(String str) {
        Task task;
        synchronized (this) {
            String zzak;
            synchronized (this.zzao) {
                zzak = this.zzao.zzak();
                zzaw zzaw = this.zzao;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzak).length() + 1) + String.valueOf(str).length());
                stringBuilder.append(zzak);
                stringBuilder.append(",");
                stringBuilder.append(str);
                zzaw.zzf(stringBuilder.toString());
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zzdr.put(Integer.valueOf((TextUtils.isEmpty(zzak) ? 0 : zzak.split(",").length - 1) + this.zzdq), taskCompletionSource);
            task = taskCompletionSource.getTask();
        }
        return task;
    }

    /* Access modifiers changed, original: final */
    public final boolean zzap() {
        boolean z;
        synchronized (this) {
            z = zzaq() != null;
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (zza(r4, r1) != false) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:13:0x0020, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:15:?, code skipped:
            r0 = (com.google.android.gms.tasks.TaskCompletionSource) r3.zzdr.remove(java.lang.Integer.valueOf(r3.zzdq));
            zzk(r1);
            r3.zzdq++;
     */
    /* JADX WARNING: Missing block: B:16:0x0038, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:17:0x0039, code skipped:
            if (r0 == null) goto L_0x0000;
     */
    /* JADX WARNING: Missing block: B:18:0x003b, code skipped:
            r0.setResult(null);
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:39:?, code skipped:
            return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final boolean zzc(FirebaseInstanceId firebaseInstanceId) {
        while (true) {
            synchronized (this) {
                String zzaq = zzaq();
                if (zzaq == null) {
                    if (FirebaseInstanceId.zzm()) {
                        Log.d("FirebaseInstanceId", "topic sync succeeded");
                    }
                }
            }
        }
        while (true) {
        }
    }
}
