package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;

public final class zzdu extends zzdy {
    private final Map<String, Long> zzaeu = new ArrayMap();
    private final Map<String, Integer> zzaev = new ArrayMap();
    private long zzaew;

    public zzdu(zzgn zzgn) {
        super(zzgn);
    }

    @WorkerThread
    private final void zza(long j, zzig zzig) {
        if (zzig == null) {
            zzgi().zzjc().log("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            zzgi().zzjc().zzg("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzih.zza(zzig, bundle, true);
            zzfy().logEvent("am", "_xa", bundle);
        }
    }

    @WorkerThread
    private final void zza(String str, long j) {
        zzfv();
        zzab();
        Preconditions.checkNotEmpty(str);
        if (this.zzaev.isEmpty()) {
            this.zzaew = j;
        }
        Integer num = (Integer) this.zzaev.get(str);
        if (num != null) {
            this.zzaev.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.zzaev.size() >= 100) {
            zzgi().zziy().log("Too many ads visible");
        } else {
            this.zzaev.put(str, Integer.valueOf(1));
            this.zzaeu.put(str, Long.valueOf(j));
        }
    }

    @WorkerThread
    private final void zza(String str, long j, zzig zzig) {
        if (zzig == null) {
            zzgi().zzjc().log("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            zzgi().zzjc().zzg("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzih.zza(zzig, bundle, true);
            zzfy().logEvent("am", "_xu", bundle);
        }
    }

    @WorkerThread
    private final void zzb(String str, long j) {
        zzfv();
        zzab();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) this.zzaev.get(str);
        if (num != null) {
            zzig zzkn = zzgb().zzkn();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.zzaev.remove(str);
                Long l = (Long) this.zzaeu.get(str);
                if (l == null) {
                    zzgi().zziv().log("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    this.zzaeu.remove(str);
                    zza(str, j - longValue, zzkn);
                }
                if (!this.zzaev.isEmpty()) {
                    return;
                }
                if (this.zzaew == 0) {
                    zzgi().zziv().log("First ad exposure time was never set");
                    return;
                }
                zza(j - this.zzaew, zzkn);
                this.zzaew = 0;
                return;
            }
            this.zzaev.put(str, Integer.valueOf(intValue));
            return;
        }
        zzgi().zziv().zzg("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @WorkerThread
    private final void zzq(long j) {
        for (String put : this.zzaeu.keySet()) {
            this.zzaeu.put(put, Long.valueOf(j));
        }
        if (!this.zzaeu.isEmpty()) {
            this.zzaew = j;
        }
    }

    public final void beginAdUnitExposure(String str) {
        if (str == null || str.length() == 0) {
            zzgi().zziv().log("Ad unit id must be a non-empty string");
            return;
        }
        zzgh().zzc(new zzdv(this, str, zzbt().elapsedRealtime()));
    }

    public final void endAdUnitExposure(String str) {
        if (str == null || str.length() == 0) {
            zzgi().zziv().log("Ad unit id must be a non-empty string");
            return;
        }
        zzgh().zzc(new zzdw(this, str, zzbt().elapsedRealtime()));
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzdu zzfx() {
        return super.zzfx();
    }

    public final /* bridge */ /* synthetic */ zzhm zzfy() {
        return super.zzfy();
    }

    public final /* bridge */ /* synthetic */ zzfd zzfz() {
        return super.zzfz();
    }

    public final /* bridge */ /* synthetic */ zzik zzga() {
        return super.zzga();
    }

    public final /* bridge */ /* synthetic */ zzih zzgb() {
        return super.zzgb();
    }

    public final /* bridge */ /* synthetic */ zzfe zzgc() {
        return super.zzgc();
    }

    public final /* bridge */ /* synthetic */ zzjj zzgd() {
        return super.zzgd();
    }

    public final /* bridge */ /* synthetic */ zzer zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfg zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzkd zzgg() {
        return super.zzgg();
    }

    public final /* bridge */ /* synthetic */ zzgi zzgh() {
        return super.zzgh();
    }

    public final /* bridge */ /* synthetic */ zzfi zzgi() {
        return super.zzgi();
    }

    public final /* bridge */ /* synthetic */ zzft zzgj() {
        return super.zzgj();
    }

    public final /* bridge */ /* synthetic */ zzeh zzgk() {
        return super.zzgk();
    }

    public final /* bridge */ /* synthetic */ zzee zzgl() {
        return super.zzgl();
    }

    @WorkerThread
    public final void zzp(long j) {
        zzig zzkn = zzgb().zzkn();
        for (String str : this.zzaeu.keySet()) {
            zza(str, j - ((Long) this.zzaeu.get(str)).longValue(), zzkn);
        }
        if (!this.zzaeu.isEmpty()) {
            zza(j - this.zzaew, zzkn);
        }
        zzq(j);
    }
}
