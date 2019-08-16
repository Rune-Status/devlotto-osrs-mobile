package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Map;

public final class zzgh extends zzjs implements zzej {
    @VisibleForTesting
    private static int zzane = 65535;
    @VisibleForTesting
    private static int zzanf = 2;
    private final Map<String, Map<String, String>> zzang = new ArrayMap();
    private final Map<String, Map<String, Boolean>> zzanh = new ArrayMap();
    private final Map<String, Map<String, Boolean>> zzani = new ArrayMap();
    private final Map<String, zzkn> zzanj = new ArrayMap();
    private final Map<String, Map<String, Integer>> zzank = new ArrayMap();
    private final Map<String, String> zzanl = new ArrayMap();

    zzgh(zzjt zzjt) {
        super(zzjt);
    }

    @WorkerThread
    private final zzkn zza(String str, byte[] bArr) {
        if (bArr == null) {
            return new zzkn();
        }
        zzaca zza = zzaca.zza(bArr, 0, bArr.length);
        zzkn zzkn = new zzkn();
        try {
            zzkn.zzb(zza);
            zzgi().zzjc().zze("Parsed config. version, gmp_app_id", zzkn.zzaum, zzkn.zzafa);
            return zzkn;
        } catch (IOException e) {
            zzgi().zziy().zze("Unable to merge remote config. appId", zzfi.zzbp(str), e);
            return new zzkn();
        }
    }

    private static Map<String, String> zza(zzkn zzkn) {
        ArrayMap arrayMap = new ArrayMap();
        if (!(zzkn == null || zzkn.zzauo == null)) {
            for (zzko zzko : zzkn.zzauo) {
                if (zzko != null) {
                    arrayMap.put(zzko.zzny, zzko.value);
                }
            }
        }
        return arrayMap;
    }

    private final void zza(String str, zzkn zzkn) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (!(zzkn == null || zzkn.zzaup == null)) {
            for (zzkm zzkm : zzkn.zzaup) {
                if (TextUtils.isEmpty(zzkm.name)) {
                    zzgi().zziy().log("EventConfig contained null event name");
                } else {
                    String zzal = Event.zzal(zzkm.name);
                    if (!TextUtils.isEmpty(zzal)) {
                        zzkm.name = zzal;
                    }
                    arrayMap.put(zzkm.name, zzkm.zzauj);
                    arrayMap2.put(zzkm.name, zzkm.zzauk);
                    if (zzkm.zzaul != null) {
                        if (zzkm.zzaul.intValue() < zzanf || zzkm.zzaul.intValue() > zzane) {
                            zzgi().zziy().zze("Invalid sampling rate. Event name, sample rate", zzkm.name, zzkm.zzaul);
                        } else {
                            arrayMap3.put(zzkm.name, zzkm.zzaul);
                        }
                    }
                }
            }
        }
        this.zzanh.put(str, arrayMap);
        this.zzani.put(str, arrayMap2);
        this.zzank.put(str, arrayMap3);
    }

    @WorkerThread
    private final void zzbw(String str) {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        if (this.zzanj.get(str) == null) {
            byte[] zzbh = zzjh().zzbh(str);
            if (zzbh == null) {
                this.zzang.put(str, null);
                this.zzanh.put(str, null);
                this.zzani.put(str, null);
                this.zzanj.put(str, null);
                this.zzanl.put(str, null);
                this.zzank.put(str, null);
                return;
            }
            zzkn zza = zza(str, zzbh);
            this.zzang.put(str, zza(zza));
            zza(str, zza);
            this.zzanj.put(str, zza);
            this.zzanl.put(str, null);
        }
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final boolean zza(String str, byte[] bArr, String str2) {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        zzkn zza = zza(str, bArr);
        if (zza == null) {
            return false;
        }
        zza(str, zza);
        this.zzanj.put(str, zza);
        this.zzanl.put(str, str2);
        this.zzang.put(str, zza(zza));
        zzjg().zza(str, zza.zzauq);
        try {
            zza.zzauq = null;
            byte[] bArr2 = new byte[zza.zzwb()];
            zza.zza(zzacb.zzb(bArr2, 0, bArr2.length));
            bArr = bArr2;
        } catch (IOException e) {
            zzgi().zziy().zze("Unable to serialize reduced-size config. Storing full config instead. appId", zzfi.zzbp(str), e);
        }
        zzek zzjh = zzjh();
        Preconditions.checkNotEmpty(str);
        zzjh.zzab();
        zzjh.zzch();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) zzjh.getWritableDatabase().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                zzjh.zzgi().zziv().zzg("Failed to update remote config (got 0). appId", zzfi.zzbp(str));
                return true;
            }
        } catch (SQLiteException e2) {
            zzjh.zzgi().zziv().zze("Error storing remote config. appId", zzfi.zzbp(str), e2);
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final zzkn zzbx(String str) {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        zzbw(str);
        return (zzkn) this.zzanj.get(str);
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final String zzby(String str) {
        zzab();
        return (String) this.zzanl.get(str);
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzbz(String str) {
        zzab();
        this.zzanl.put(str, null);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzca(String str) {
        zzab();
        this.zzanj.remove(str);
    }

    /* Access modifiers changed, original: final */
    public final boolean zzcb(String str) {
        return "1".equals(zze(str, "measurement.upload.blacklist_internal"));
    }

    /* Access modifiers changed, original: final */
    public final boolean zzcc(String str) {
        return "1".equals(zze(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    public final String zze(String str, String str2) {
        zzab();
        zzbw(str);
        Map map = (Map) this.zzang.get(str);
        return map != null ? (String) map.get(str2) : null;
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

    /* Access modifiers changed, original: protected|final */
    public final boolean zzgn() {
        return false;
    }

    public final /* bridge */ /* synthetic */ zzjz zzjf() {
        return super.zzjf();
    }

    public final /* bridge */ /* synthetic */ zzed zzjg() {
        return super.zzjg();
    }

    public final /* bridge */ /* synthetic */ zzek zzjh() {
        return super.zzjh();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final boolean zzn(String str, String str2) {
        zzab();
        zzbw(str);
        if (zzcb(str) && zzkd.zzcm(str2)) {
            return true;
        }
        if (zzcc(str) && zzkd.zzcg(str2)) {
            return true;
        }
        Map map = (Map) this.zzanh.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final boolean zzo(String str, String str2) {
        zzab();
        zzbw(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzani.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final int zzp(String str, String str2) {
        zzab();
        zzbw(str);
        Map map = (Map) this.zzank.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        return num == null ? 1 : num.intValue();
    }
}
