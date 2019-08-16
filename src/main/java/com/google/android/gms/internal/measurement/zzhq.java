package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

final class zzhq implements Callable<String> {
    private final /* synthetic */ zzhm zzaps;

    zzhq(zzhm zzhm) {
        this.zzaps = zzhm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ Object call() throws Exception {
        Object zzjk = this.zzaps.zzgj().zzjk();
        if (zzjk == null) {
            zzfk zziv;
            String str;
            zzhm zzfy = this.zzaps.zzfy();
            if (zzfy.zzgh().zzju()) {
                zziv = zzfy.zzgi().zziv();
                str = "Cannot retrieve app instance id from analytics worker thread";
            } else if (zzee.isMainThread()) {
                zziv = zzfy.zzgi().zziv();
                str = "Cannot retrieve app instance id from main thread";
            } else {
                long elapsedRealtime = zzfy.zzbt().elapsedRealtime();
                zzjk = zzfy.zzaj(120000);
                elapsedRealtime = zzfy.zzbt().elapsedRealtime() - elapsedRealtime;
                if (zzjk == null && elapsedRealtime < 120000) {
                    zzjk = zzfy.zzaj(120000 - elapsedRealtime);
                }
                if (zzjk == null) {
                    this.zzaps.zzgj().zzbu(zzjk);
                } else {
                    throw new TimeoutException();
                }
            }
            zziv.log(str);
            zzjk = null;
            if (zzjk == null) {
            }
        }
        return zzjk;
    }
}
