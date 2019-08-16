package com.google.firebase.iid;

import java.util.concurrent.TimeUnit;

final /* synthetic */ class zzag implements Runnable {
    private final zzad zzcg;

    zzag(zzad zzad) {
        this.zzcg = zzad;
    }

    /* JADX WARNING: Missing block: B:18:0x0043, code skipped:
            if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0069;
     */
    /* JADX WARNING: Missing block: B:19:0x0045, code skipped:
            r2 = java.lang.String.valueOf(r0);
            r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 8);
            r3.append("Sending ");
            r3.append(r2);
            android.util.Log.d("MessengerIpcClient", r3.toString());
     */
    /* JADX WARNING: Missing block: B:20:0x0069, code skipped:
            r2 = r1.zzcf.zzac;
            r3 = r1.zzcb;
            r4 = android.os.Message.obtain();
            r4.what = r0.what;
            r4.arg1 = r0.zzcj;
            r4.replyTo = r3;
            r3 = new android.os.Bundle();
            r3.putBoolean("oneWay", r0.zzab());
            r3.putString("pkg", r2.getPackageName());
            r3.putBundle("data", r0.zzcl);
            r4.setData(r3);
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            r1.zzcc.send(r4);
     */
    /* JADX WARNING: Missing block: B:24:0x00a7, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x00a8, code skipped:
            r1.zza(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        zzad zzad = this.zzcg;
        while (true) {
            synchronized (zzad) {
                if (zzad.state != 2) {
                    return;
                } else if (zzad.zzcd.isEmpty()) {
                    zzad.zzz();
                    return;
                } else {
                    zzak zzak = (zzak) zzad.zzcd.poll();
                    zzad.zzce.put(zzak.zzcj, zzak);
                    zzad.zzcf.zzby.schedule(new zzah(zzad, zzak), 30, TimeUnit.SECONDS);
                }
            }
        }
    }
}
