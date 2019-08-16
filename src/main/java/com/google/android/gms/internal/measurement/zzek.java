package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import defpackage.lp;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzek extends zzjs {
    private static final String[] zzagl = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    private static final String[] zzagm = new String[]{Param.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzagn = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"};
    private static final String[] zzago = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzagp = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzagq = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzen zzagr = new zzen(this, getContext(), "google_app_measurement.db");
    private final zzjo zzags = new zzjo(zzbt());

    zzek(zzjt zzjt) {
        super(zzjt);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private final long zza(String str, String[] strArr) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery(str, strArr);
            try {
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzgi().zziv().zze("Database error", str, e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private final long zza(String str, String[] strArr, long j) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery(str, strArr);
            try {
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzgi().zziv().zze("Database error", str, e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    @WorkerThread
    @VisibleForTesting
    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case 0:
                zzgi().zziv().log("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                zzgi().zziv().log("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                zzgi().zziv().zzg("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
        }
    }

    @WorkerThread
    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i, zzkh zzkh) {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzkh);
        if (TextUtils.isEmpty(zzkh.zzatl)) {
            zzgi().zziy().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfi.zzbp(str), Integer.valueOf(i), String.valueOf(zzkh.zzatk));
            return false;
        }
        try {
            byte[] bArr = new byte[zzkh.zzwb()];
            zzacb zzb = zzacb.zzb(bArr, 0, bArr.length);
            zzkh.zza(zzb);
            zzb.zzvt();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", zzkh.zzatk);
            contentValues.put("event_name", zzkh.zzatl);
            contentValues.put("data", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    zzgi().zziv().zzg("Failed to insert event filter (got -1). appId", zzfi.zzbp(str));
                }
                return true;
            } catch (SQLiteException e) {
                zzgi().zziv().zze("Error storing event filter. appId", zzfi.zzbp(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzgi().zziv().zze("Configuration loss. Failed to serialize event filter. appId", zzfi.zzbp(str), e2);
            return false;
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i, zzkk zzkk) {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzkk);
        if (TextUtils.isEmpty(zzkk.zzauc)) {
            zzgi().zziy().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfi.zzbp(str), Integer.valueOf(i), String.valueOf(zzkk.zzatk));
            return false;
        }
        try {
            byte[] bArr = new byte[zzkk.zzwb()];
            zzacb zzb = zzacb.zzb(bArr, 0, bArr.length);
            zzkk.zza(zzb);
            zzb.zzvt();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", zzkk.zzatk);
            contentValues.put("property_name", zzkk.zzauc);
            contentValues.put("data", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                zzgi().zziv().zzg("Failed to insert property filter (got -1). appId", zzfi.zzbp(str));
                return false;
            } catch (SQLiteException e) {
                zzgi().zziv().zze("Error storing property filter. appId", zzfi.zzbp(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzgi().zziv().zze("Configuration loss. Failed to serialize property filter. appId", zzfi.zzbp(str), e2);
            return false;
        }
    }

    private final boolean zza(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzch();
        zzab();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            if (zza("select count(1) from audience_filter_values where app_id=?", new String[]{str}) <= ((long) Math.max(0, Math.min(2000, zzgk().zzb(str, zzez.zzajj))))) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(join).length() + 2);
            stringBuilder.append("(");
            stringBuilder.append(join);
            stringBuilder.append(")");
            join = stringBuilder.toString();
            stringBuilder = new StringBuilder(String.valueOf(join).length() + 140);
            stringBuilder.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            stringBuilder.append(join);
            stringBuilder.append(" order by rowid desc limit -1 offset ?)");
            return writableDatabase.delete("audience_filter_values", stringBuilder.toString(), new String[]{str, Integer.toString(r5)}) > 0;
        } catch (SQLiteException e) {
            zzgi().zziv().zze("Database error querying filters. appId", zzfi.zzbp(str), e);
            return false;
        }
    }

    private final boolean zzid() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    @WorkerThread
    public final void beginTransaction() {
        zzch();
        getWritableDatabase().beginTransaction();
    }

    @WorkerThread
    public final void endTransaction() {
        zzch();
        getWritableDatabase().endTransaction();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final SQLiteDatabase getWritableDatabase() {
        zzab();
        try {
            return this.zzagr.getWritableDatabase();
        } catch (SQLiteException e) {
            zzgi().zziy().zzg("Error opening database", e);
            throw e;
        }
    }

    @WorkerThread
    public final void setTransactionSuccessful() {
        zzch();
        getWritableDatabase().setTransactionSuccessful();
    }

    public final long zza(zzku zzku) throws IOException {
        zzab();
        zzch();
        Preconditions.checkNotNull(zzku);
        Preconditions.checkNotEmpty(zzku.zzth);
        try {
            long j;
            byte[] bArr = new byte[zzku.zzwb()];
            zzacb zzb = zzacb.zzb(bArr, 0, bArr.length);
            zzku.zza(zzb);
            zzb.zzvt();
            zzjz zzjf = zzjf();
            Preconditions.checkNotNull(bArr);
            zzjf.zzgg().zzab();
            MessageDigest messageDigest = zzkd.getMessageDigest();
            if (messageDigest == null) {
                zzjf.zzgi().zziv().log("Failed to get MD5");
                j = 0;
            } else {
                j = zzkd.zzc(messageDigest.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzku.zzth);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", bArr);
            try {
                getWritableDatabase().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                zzgi().zziv().zze("Error storing raw event metadata. appId", zzfi.zzbp(zzku.zzth), e);
                throw e;
            }
        } catch (IOException e2) {
            zzgi().zziv().zze("Data loss. Failed to serialize event metadata. appId", zzfi.zzbp(zzku.zzth), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Pair<zzkr, Long> zza(String str, Long l) {
        Cursor rawQuery;
        Pair<zzkr, Long> create;
        Object e;
        Throwable th;
        Cursor cursor = null;
        zzab();
        zzch();
        try {
            rawQuery = getWritableDatabase().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
            try {
                if (rawQuery.moveToFirst()) {
                    byte[] blob = rawQuery.getBlob(0);
                    long j = rawQuery.getLong(1);
                    zzaca zza = zzaca.zza(blob, 0, blob.length);
                    zzkr zzkr = new zzkr();
                    try {
                        zzkr.zzb(zza);
                        create = Pair.create(zzkr, Long.valueOf(j));
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                    } catch (IOException e2) {
                        zzgi().zziv().zzd("Failed to merge main event. appId, eventId", zzfi.zzbp(str), l, e2);
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                    }
                } else {
                    zzgi().zzjc().log("Main event not found");
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (SQLiteException e4) {
            e = e4;
            rawQuery = cursor;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return create;
        try {
            zzgi().zziv().zzg("Error selecting main event", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return create;
        } catch (Throwable th3) {
            th = th3;
            cursor = rawQuery;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final zzel zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object e;
        Throwable th;
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        zzel zzel = new zzel();
        Cursor query;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            query = writableDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(0) == j) {
                        zzel.zzagu = query.getLong(1);
                        zzel.zzagt = query.getLong(2);
                        zzel.zzagv = query.getLong(3);
                        zzel.zzagw = query.getLong(4);
                        zzel.zzagx = query.getLong(5);
                    }
                    if (z) {
                        zzel.zzagu++;
                    }
                    if (z2) {
                        zzel.zzagt++;
                    }
                    if (z3) {
                        zzel.zzagv++;
                    }
                    if (z4) {
                        zzel.zzagw++;
                    }
                    if (z5) {
                        zzel.zzagx++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzel.zzagt));
                    contentValues.put("daily_events_count", Long.valueOf(zzel.zzagu));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzel.zzagv));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzel.zzagw));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzel.zzagx));
                    writableDatabase.update("apps", contentValues, "app_id=?", new String[]{str});
                    if (query != null) {
                        query.close();
                    }
                    return zzel;
                }
                zzgi().zziy().zzg("Not updating daily counts, app is not known. appId", zzfi.zzbp(str));
                if (query != null) {
                    query.close();
                }
                return zzel;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzgi().zziv().zze("Error updating daily counts. appId", zzfi.zzbp(str), e);
                    if (query != null) {
                        query.close();
                    }
                    return zzel;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (query != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
        } catch (Throwable th4) {
            th = th4;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zza(zzea zzea) {
        Preconditions.checkNotNull(zzea);
        zzab();
        zzch();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzea.zzah());
        contentValues.put("app_instance_id", zzea.getAppInstanceId());
        contentValues.put("gmp_app_id", zzea.getGmpAppId());
        contentValues.put("resettable_device_id_hash", zzea.zzgq());
        contentValues.put("last_bundle_index", Long.valueOf(zzea.zzgy()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzea.zzgs()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzea.zzgt()));
        contentValues.put("app_version", zzea.zzag());
        contentValues.put("app_store", zzea.zzgv());
        contentValues.put("gmp_version", Long.valueOf(zzea.zzgw()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzea.zzgx()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzea.isMeasurementEnabled()));
        contentValues.put("day", Long.valueOf(zzea.zzhc()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzea.zzhd()));
        contentValues.put("daily_events_count", Long.valueOf(zzea.zzhe()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzea.zzhf()));
        contentValues.put("config_fetched_time", Long.valueOf(zzea.zzgz()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzea.zzha()));
        contentValues.put("app_version_int", Long.valueOf(zzea.zzgu()));
        contentValues.put("firebase_instance_id", zzea.zzgr());
        contentValues.put("daily_error_events_count", Long.valueOf(zzea.zzhh()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzea.zzhg()));
        contentValues.put("health_monitor_sample", zzea.zzhi());
        contentValues.put("android_id", Long.valueOf(zzea.zzhk()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzea.zzhl()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzea.zzhm()));
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (((long) writableDatabase.update("apps", contentValues, "app_id = ?", new String[]{zzea.zzah()})) == 0 && writableDatabase.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzgi().zziv().zzg("Failed to insert/update app (got -1). appId", zzfi.zzbp(zzea.zzah()));
            }
        } catch (SQLiteException e) {
            zzgi().zziv().zze("Error storing app. appId", zzfi.zzbp(zzea.zzah()), e);
        }
    }

    @WorkerThread
    public final void zza(zzet zzet) {
        Long l = null;
        Preconditions.checkNotNull(zzet);
        zzab();
        zzch();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzet.zzth);
        contentValues.put(lp.ac, zzet.name);
        contentValues.put("lifetime_count", Long.valueOf(zzet.zzahh));
        contentValues.put("current_bundle_count", Long.valueOf(zzet.zzahi));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzet.zzahj));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzet.zzahk));
        contentValues.put("last_sampled_complex_event_id", zzet.zzahl);
        contentValues.put("last_sampling_rate", zzet.zzahm);
        if (zzet.zzahn != null && zzet.zzahn.booleanValue()) {
            l = Long.valueOf(1);
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (getWritableDatabase().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzgi().zziv().zzg("Failed to insert/update event aggregates (got -1). appId", zzfi.zzbp(zzet.zzth));
            }
        } catch (SQLiteException e) {
            zzgi().zziv().zze("Error storing event aggregates. appId", zzfi.zzbp(zzet.zzth), e);
        }
    }

    @WorkerThread
    public final boolean zza(zzef zzef) {
        Preconditions.checkNotNull(zzef);
        zzab();
        zzch();
        if (zzh(zzef.packageName, zzef.zzage.name) == null) {
            if (zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzef.packageName}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzef.packageName);
        contentValues.put(Param.ORIGIN, zzef.origin);
        contentValues.put(lp.ac, zzef.zzage.name);
        zza(contentValues, Param.VALUE, zzef.zzage.getValue());
        contentValues.put("active", Boolean.valueOf(zzef.active));
        contentValues.put("trigger_event_name", zzef.triggerEventName);
        contentValues.put("trigger_timeout", Long.valueOf(zzef.triggerTimeout));
        zzgg();
        contentValues.put("timed_out_event", zzkd.zza(zzef.zzagf));
        contentValues.put("creation_timestamp", Long.valueOf(zzef.creationTimestamp));
        zzgg();
        contentValues.put("triggered_event", zzkd.zza(zzef.zzagg));
        contentValues.put("triggered_timestamp", Long.valueOf(zzef.zzage.zzast));
        contentValues.put("time_to_live", Long.valueOf(zzef.timeToLive));
        zzgg();
        contentValues.put("expired_event", zzkd.zza(zzef.zzagh));
        try {
            if (getWritableDatabase().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzgi().zziv().zzg("Failed to insert/update conditional user property (got -1)", zzfi.zzbp(zzef.packageName));
                return true;
            }
        } catch (SQLiteException e) {
            zzgi().zziv().zze("Error storing conditional user property", zzfi.zzbp(zzef.packageName), e);
        }
        return true;
    }

    public final boolean zza(zzes zzes, long j, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    @WorkerThread
    public final boolean zza(zzkc zzkc) {
        Preconditions.checkNotNull(zzkc);
        zzab();
        zzch();
        if (zzh(zzkc.zzth, zzkc.name) == null) {
            if (zzkd.zzcg(zzkc.name)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzkc.zzth}) >= 25) {
                    return false;
                }
            }
            if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzkc.zzth, zzkc.origin}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkc.zzth);
        contentValues.put(Param.ORIGIN, zzkc.origin);
        contentValues.put(lp.ac, zzkc.name);
        contentValues.put("set_timestamp", Long.valueOf(zzkc.zzast));
        zza(contentValues, Param.VALUE, zzkc.value);
        try {
            if (getWritableDatabase().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzgi().zziv().zzg("Failed to insert/update user property (got -1). appId", zzfi.zzbp(zzkc.zzth));
                return true;
            }
        } catch (SQLiteException e) {
            zzgi().zziv().zze("Error storing user property. appId", zzfi.zzbp(zzkc.zzth), e);
        }
        return true;
    }

    @WorkerThread
    public final boolean zza(zzku zzku, boolean z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public final boolean zza(String str, Long l, long j, zzkr zzkr) {
        zzab();
        zzch();
        Preconditions.checkNotNull(zzkr);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        try {
            byte[] bArr = new byte[zzkr.zzwb()];
            zzacb zzb = zzacb.zzb(bArr, 0, bArr.length);
            zzkr.zza(zzb);
            zzb.zzvt();
            zzgi().zzjc().zze("Saving complex main event, appId, data size", zzgf().zzbm(str), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                zzgi().zziv().zzg("Failed to insert complex main event (got -1). appId", zzfi.zzbp(str));
                return false;
            } catch (SQLiteException e) {
                zzgi().zziv().zze("Error storing complex main event. appId", zzfi.zzbp(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzgi().zziv().zzd("Data loss. Failed to serialize event params/data. appId, eventId", zzfi.zzbp(str), l, e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final String zzag(long j) {
        Cursor rawQuery;
        String string;
        Object e;
        Throwable th;
        Cursor cursor = null;
        zzab();
        zzch();
        try {
            rawQuery = getWritableDatabase().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                if (rawQuery.moveToFirst()) {
                    string = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else {
                    zzgi().zzjc().log("No expired configs for apps with pending events");
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = cursor;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        return string;
        try {
            zzgi().zziv().zzg("Error selecting expired configs", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return string;
        } catch (Throwable th3) {
            th = th3;
            cursor = rawQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ad A:{SYNTHETIC, EDGE_INSN: B:71:0x00ad->B:40:0x00ad ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab A:{LOOP_END, LOOP:0: B:19:0x005c->B:39:0x00ab} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab A:{LOOP_END, LOOP:0: B:19:0x005c->B:39:0x00ab} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ad A:{SYNTHETIC, EDGE_INSN: B:71:0x00ad->B:40:0x00ad ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final List<Pair<zzku, Long>> zzb(String str, int i, int i2) {
        List<Pair<zzku, Long>> arrayList;
        Object e;
        zzfk zziv;
        String str2;
        Object zzbp;
        Object e2;
        Throwable th;
        Cursor cursor = null;
        boolean z = true;
        int i3 = 0;
        zzab();
        zzch();
        Preconditions.checkArgument(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        Preconditions.checkNotEmpty(str);
        Cursor query;
        try {
            query = getWritableDatabase().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            try {
                if (query.moveToFirst()) {
                    arrayList = new ArrayList();
                    do {
                        long j = query.getLong(0);
                        try {
                            byte[] zza = zzjf().zza(query.getBlob(1));
                            if (!arrayList.isEmpty() && zza.length + i3 > i2) {
                                break;
                            }
                            zzaca zza2 = zzaca.zza(zza, 0, zza.length);
                            zzku zzku = new zzku();
                            try {
                                zzku.zzb(zza2);
                                if (!query.isNull(2)) {
                                    zzku.zzawj = Integer.valueOf(query.getInt(2));
                                }
                                i3 += zza.length;
                                arrayList.add(Pair.create(zzku, Long.valueOf(j)));
                            } catch (IOException e3) {
                                e = e3;
                                zziv = zzgi().zziv();
                                str2 = "Failed to merge queued bundle. appId";
                                zzbp = zzfi.zzbp(str);
                                zziv.zze(str2, zzbp, e);
                                if (!query.moveToNext()) {
                                }
                                if (query != null) {
                                }
                                return arrayList;
                            }
                            if (!query.moveToNext()) {
                                break;
                            }
                        } catch (IOException e4) {
                            zziv = zzgi().zziv();
                            str2 = "Failed to unzip queued bundle. appId";
                            zzbp = zzfi.zzbp(str);
                            IOException e5 = e4;
                            zziv.zze(str2, zzbp, e5);
                            if (!query.moveToNext()) {
                            }
                            if (query != null) {
                            }
                            return arrayList;
                        }
                    } while (i3 <= i2);
                    if (query != null) {
                        query.close();
                    }
                } else {
                    arrayList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                }
            } catch (SQLiteException e6) {
                e2 = e6;
                try {
                    zzgi().zziv().zze("Error querying bundles. appId", zzfi.zzbp(str), e2);
                    arrayList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                }
            } catch (Throwable th3) {
                th = th3;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e7) {
            e2 = e7;
            query = null;
        } catch (Throwable th4) {
            th = th4;
            query = cursor;
            if (query != null) {
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104 A:{Splitter:B:1:0x000f, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010f A:{Splitter:B:30:0x00b7, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104 A:{Splitter:B:1:0x000f, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:45:0x00fe, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:46:0x00ff, code skipped:
            r1 = r7;
     */
    /* JADX WARNING: Missing block: B:49:0x0104, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:50:0x0105, code skipped:
            r7 = null;
     */
    /* JADX WARNING: Missing block: B:56:0x010f, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:59:0x0114, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:60:0x0116, code skipped:
            r0 = e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final List<zzkc> zzb(String str, String str2, String str3) {
        Cursor query;
        Object obj;
        Object e;
        Cursor cursor;
        Throwable th;
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(str);
            StringBuilder stringBuilder = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                stringBuilder.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList2.add(String.valueOf(str3).concat("*"));
                stringBuilder.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String[] strArr2 = new String[]{lp.ac, "set_timestamp", Param.VALUE, Param.ORIGIN};
            query = getWritableDatabase().query("user_attributes", strArr2, stringBuilder.toString(), strArr, null, null, "rowid", "1001");
            try {
                if (query.moveToFirst()) {
                    while (arrayList.size() < 1000) {
                        String string = query.getString(0);
                        long j = query.getLong(1);
                        String string2;
                        try {
                            Object zza = zza(query, 2);
                            string2 = query.getString(3);
                            if (zza == null) {
                                zzgi().zziv().zzd("(2)Read invalid user property value, ignoring it", zzfi.zzbp(str), string2, str3);
                            } else {
                                arrayList.add(new zzkc(str, string2, string, j, zza));
                            }
                            if (!query.moveToNext()) {
                                break;
                            }
                            obj = string2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursor = query;
                            obj = string2;
                        } catch (Throwable th2) {
                        }
                    }
                    zzgi().zziv().zzg("Read more than the max allowed user properties, ignoring excess", Integer.valueOf(1000));
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
            } catch (Throwable th3) {
                th = th3;
                if (query != null) {
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
        } catch (Throwable th4) {
        }
        try {
            zzgi().zziv().zzd("(2)Error querying user properties", zzfi.zzbp(str), obj, e);
            if (cursor != null) {
                return null;
            }
            cursor.close();
            return null;
        } catch (Throwable th5) {
            th = th5;
            query = cursor;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        cursor = null;
        zzgi().zziv().zzd("(2)Error querying user properties", zzfi.zzbp(str), obj, e);
        if (cursor != null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final List<zzef> zzb(String str, String[] strArr) {
        Object e;
        Cursor cursor;
        Throwable th;
        zzab();
        zzch();
        ArrayList arrayList = new ArrayList();
        Cursor query;
        try {
            query = getWritableDatabase().query("conditional_properties", new String[]{"app_id", Param.ORIGIN, lp.ac, Param.VALUE, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            try {
                if (query.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            zzgi().zziv().zzg("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                            break;
                        }
                        boolean z = false;
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object zza = zza(query, 3);
                        if (query.getInt(4) != 0) {
                            z = true;
                        }
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        zzex zzex = (zzex) zzjf().zza(query.getBlob(7), zzex.CREATOR);
                        long j2 = query.getLong(8);
                        zzex zzex2 = (zzex) zzjf().zza(query.getBlob(9), zzex.CREATOR);
                        long j3 = query.getLong(10);
                        long j4 = query.getLong(11);
                        zzex zzex3 = (zzex) zzjf().zza(query.getBlob(12), zzex.CREATOR);
                        arrayList.add(new zzef(string, string2, new zzka(string3, j3, zza, string2), j2, z, string4, zzex, j, zzex2, j4, zzex3));
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            query = cursor;
            if (query != null) {
            }
            throw th;
        }
        try {
            zzgi().zziv().zzg("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor == null) {
                return emptyList;
            }
            cursor.close();
            return emptyList;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzb(String str, zzkg[] zzkgArr) {
        int i = 0;
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzkgArr);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int i2;
            zzch();
            zzab();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase writableDatabase2 = getWritableDatabase();
            writableDatabase2.delete("property_filters", "app_id=?", new String[]{str});
            writableDatabase2.delete("event_filters", "app_id=?", new String[]{str});
            for (Object obj : zzkgArr) {
                Object obj2;
                zzch();
                zzab();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(obj2);
                Preconditions.checkNotNull(obj2.zzatg);
                Preconditions.checkNotNull(obj2.zzatf);
                if (obj2.zzate == null) {
                    zzgi().zziy().zzg("Audience with no ID. appId", zzfi.zzbp(str));
                } else {
                    zzfk zziy;
                    String str2;
                    Object zzbp;
                    int intValue = obj2.zzate.intValue();
                    for (zzkh zzkh : obj2.zzatg) {
                        if (zzkh.zzatk == null) {
                            zziy = zzgi().zziy();
                            str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            zzbp = zzfi.zzbp(str);
                            obj2 = obj2.zzate;
                            break;
                        }
                    }
                    for (zzkk zzkk : obj2.zzatf) {
                        if (zzkk.zzatk == null) {
                            zziy = zzgi().zziy();
                            str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                            zzbp = zzfi.zzbp(str);
                            obj2 = obj2.zzate;
                            zziy.zze(str2, zzbp, obj2);
                            break;
                        }
                    }
                    for (zzkh zzkh2 : obj2.zzatg) {
                        if (!zza(str, intValue, zzkh2)) {
                            i2 = 0;
                            break;
                        }
                    }
                    i2 = 1;
                    if (i2 != 0) {
                        for (zzkk zzkk2 : obj2.zzatf) {
                            if (!zza(str, intValue, zzkk2)) {
                                i2 = 0;
                                break;
                            }
                        }
                    }
                    if (i2 == 0) {
                        zzch();
                        zzab();
                        Preconditions.checkNotEmpty(str);
                        SQLiteDatabase writableDatabase3 = getWritableDatabase();
                        writableDatabase3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                        writableDatabase3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                    }
                }
            }
            List arrayList = new ArrayList();
            i2 = zzkgArr.length;
            while (i < i2) {
                arrayList.add(zzkgArr[i].zzate);
                i++;
            }
            zza(str, arrayList);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final List<zzkc> zzbe(String str) {
        Cursor query;
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        ArrayList arrayList = new ArrayList();
        try {
            query = getWritableDatabase().query("user_attributes", new String[]{lp.ac, Param.ORIGIN, "set_timestamp", Param.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            try {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        long j = query.getLong(2);
                        Object zza = zza(query, 3);
                        if (zza == null) {
                            zzgi().zziv().zzg("Read invalid user property value, ignoring it. appId", zzfi.zzbp(str));
                        } else {
                            arrayList.add(new zzkc(str, string2, string, j, zza));
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = query;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        try {
            zzgi().zziv().zze("Error querying user properties. appId", zzfi.zzbp(str), e);
            if (cursor == null) {
                return null;
            }
            cursor.close();
            return null;
        } catch (Throwable th4) {
            th = th4;
            query = cursor;
            cursor2 = query;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final zzea zzbf(String str) {
        Object e;
        Throwable th;
        boolean z = true;
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        Cursor query;
        try {
            query = getWritableDatabase().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    try {
                        zzea zzea = new zzea(this.zzalo.zzlm(), str);
                        zzea.zzam(query.getString(0));
                        zzea.zzan(query.getString(1));
                        zzea.zzao(query.getString(2));
                        zzea.zzw(query.getLong(3));
                        zzea.zzr(query.getLong(4));
                        zzea.zzs(query.getLong(5));
                        zzea.setAppVersion(query.getString(6));
                        zzea.zzaq(query.getString(7));
                        zzea.zzu(query.getLong(8));
                        zzea.zzv(query.getLong(9));
                        boolean z2 = query.isNull(10) || query.getInt(10) != 0;
                        zzea.setMeasurementEnabled(z2);
                        zzea.zzz(query.getLong(11));
                        zzea.zzaa(query.getLong(12));
                        zzea.zzab(query.getLong(13));
                        zzea.zzac(query.getLong(14));
                        zzea.zzx(query.getLong(15));
                        zzea.zzy(query.getLong(16));
                        zzea.zzt(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                        zzea.zzap(query.getString(18));
                        zzea.zzae(query.getLong(19));
                        zzea.zzad(query.getLong(20));
                        zzea.zzar(query.getString(21));
                        zzea.zzaf(query.isNull(22) ? 0 : query.getLong(22));
                        z2 = query.isNull(23) || query.getInt(23) != 0;
                        zzea.zzd(z2);
                        if (!query.isNull(24) && query.getInt(24) == 0) {
                            z = false;
                        }
                        zzea.zze(z);
                        zzea.zzgp();
                        if (query.moveToNext()) {
                            zzgi().zziv().zzg("Got multiple records for app, expected one. appId", zzfi.zzbp(str));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return zzea;
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            zzgi().zziv().zze("Error querying app. appId", zzfi.zzbp(str), e);
                            if (query == null) {
                                return null;
                            }
                            query.close();
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                            }
                            throw th;
                        }
                    }
                } else if (query == null) {
                    return null;
                } else {
                    query.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                if (query != null) {
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
        } catch (Throwable th4) {
            th = th4;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final long zzbg(String str) {
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        try {
            return (long) getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zzgk().zzb(str, zzez.zzait))))});
        } catch (SQLiteException e) {
            zzgi().zziv().zze("Error deleting over the limit events. appId", zzfi.zzbp(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final byte[] zzbh(String str) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        try {
            query = getWritableDatabase().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    if (query.moveToNext()) {
                        zzgi().zziv().zzg("Got multiple records for app config, expected one. appId", zzfi.zzbp(str));
                    }
                    if (query != null) {
                        query.close();
                    }
                    return blob;
                } else if (query == null) {
                    return null;
                } else {
                    query.close();
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        try {
            zzgi().zziv().zze("Error querying remote config. appId", zzfi.zzbp(str), e);
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Map<Integer, zzkv> zzbi(String str) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        try {
            query = getWritableDatabase().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    ArrayMap arrayMap = new ArrayMap();
                    do {
                        int i = query.getInt(0);
                        byte[] blob = query.getBlob(1);
                        zzaca zza = zzaca.zza(blob, 0, blob.length);
                        zzkv zzkv = new zzkv();
                        try {
                            zzkv.zzb(zza);
                            arrayMap.put(Integer.valueOf(i), zzkv);
                        } catch (IOException e2) {
                            zzgi().zziv().zzd("Failed to merge filter results. appId, audienceId, error", zzfi.zzbp(str), Integer.valueOf(i), e2);
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayMap;
                } else if (query == null) {
                    return null;
                } else {
                    query.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        try {
            zzgi().zziv().zze("Database error querying filter results. appId", zzfi.zzbp(str), e);
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final long zzbj(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    @WorkerThread
    public final List<zzef> zzc(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder stringBuilder = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            stringBuilder.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            stringBuilder.append(" and name glob ?");
        }
        return zzb(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final void zzc(List<Long> list) {
        zzab();
        zzch();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzid()) {
            String join = TextUtils.join(",", list);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(join).length() + 2);
            stringBuilder.append("(");
            stringBuilder.append(join);
            stringBuilder.append(")");
            join = stringBuilder.toString();
            stringBuilder = new StringBuilder(String.valueOf(join).length() + 80);
            stringBuilder.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            stringBuilder.append(join);
            stringBuilder.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zza(stringBuilder.toString(), null) > 0) {
                zzgi().zziy().log("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(join).length() + 127);
                stringBuilder2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                stringBuilder2.append(join);
                stringBuilder2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                writableDatabase.execSQL(stringBuilder2.toString());
            } catch (SQLiteException e) {
                zzgi().zziv().zzg("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final zzet zzf(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        Cursor query;
        try {
            query = getWritableDatabase().query("events", new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    Boolean bool;
                    long j = query.getLong(0);
                    long j2 = query.getLong(1);
                    long j3 = query.getLong(2);
                    long j4 = query.isNull(3) ? 0 : query.getLong(3);
                    Long valueOf = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                    Long valueOf2 = query.isNull(5) ? null : Long.valueOf(query.getLong(5));
                    if (query.isNull(6)) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(query.getLong(6) == 1);
                    }
                    try {
                        zzet zzet = new zzet(str, str2, j, j2, j3, j4, valueOf, valueOf2, bool);
                        if (query.moveToNext()) {
                            zzgi().zziv().zzg("Got multiple records for event aggregates, expected one. appId", zzfi.zzbp(str));
                        }
                        if (query == null) {
                            return zzet;
                        }
                        query.close();
                        return zzet;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = query;
                        try {
                            zzgi().zziv().zzd("Error querying events. appId", zzfi.zzbp(str), zzgf().zzbm(str2), e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            query = cursor;
                            if (query != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
            } catch (Throwable th4) {
                th = th4;
                if (query != null) {
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
            query = null;
            if (query != null) {
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzg(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        try {
            zzgi().zzjc().zzg("Deleted user attribute rows", Integer.valueOf(getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzgi().zziv().zzd("Error deleting user attribute. appId", zzfi.zzbp(str), zzgf().zzbo(str2), e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzgn() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final zzkc zzh(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        Cursor query;
        try {
            query = getWritableDatabase().query("user_attributes", new String[]{"set_timestamp", Param.VALUE, Param.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    long j = query.getLong(0);
                    try {
                        String str3 = str;
                        zzkc zzkc = new zzkc(str3, query.getString(2), str2, j, zza(query, 1));
                        if (query.moveToNext()) {
                            zzgi().zziv().zzg("Got multiple records for user property, expected one. appId", zzfi.zzbp(str));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return zzkc;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = query;
                        try {
                            zzgi().zziv().zzd("Error querying user property. appId", zzfi.zzbp(str), zzgf().zzbo(str2), e);
                            if (cursor == null) {
                                return null;
                            }
                            cursor.close();
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            query = cursor;
                            if (query != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                } else if (query == null) {
                    return null;
                } else {
                    query.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
            } catch (Throwable th4) {
                th = th4;
                if (query != null) {
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
            query = null;
            if (query != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final String zzhv() {
        String string;
        Object e;
        Throwable th;
        Cursor cursor = null;
        Cursor rawQuery;
        try {
            rawQuery = getWritableDatabase().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                if (rawQuery.moveToFirst()) {
                    string = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzgi().zziv().zzg("Database error getting next bundle app id", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = rawQuery;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return string;
    }

    public final boolean zzhw() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzhx() {
        zzab();
        zzch();
        if (zzid()) {
            long j = zzgj().zzalw.get();
            long elapsedRealtime = zzbt().elapsedRealtime();
            if (Math.abs(elapsedRealtime - j) > ((Long) zzez.zzajc.get()).longValue()) {
                zzgj().zzalw.set(elapsedRealtime);
                zzab();
                zzch();
                if (zzid()) {
                    int delete = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzbt().currentTimeMillis()), String.valueOf(zzeh.zzhq())});
                    if (delete > 0) {
                        zzgi().zzjc().zzg("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @WorkerThread
    public final long zzhy() {
        return zza("select max(bundle_end_timestamp) from queue", null, 0);
    }

    @WorkerThread
    public final long zzhz() {
        return zza("select max(timestamp) from raw_events", null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final zzef zzi(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        Cursor query;
        try {
            query = getWritableDatabase().query("conditional_properties", new String[]{Param.ORIGIN, Param.VALUE, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    try {
                        Object zza = zza(query, 1);
                        boolean z = query.getInt(2) != 0;
                        String string2 = query.getString(3);
                        long j = query.getLong(4);
                        zzex zzex = (zzex) zzjf().zza(query.getBlob(5), zzex.CREATOR);
                        long j2 = query.getLong(6);
                        zzex zzex2 = (zzex) zzjf().zza(query.getBlob(7), zzex.CREATOR);
                        long j3 = query.getLong(8);
                        zzef zzef = new zzef(str, string, new zzka(str2, j3, zza, string), j2, z, string2, zzex, j, zzex2, query.getLong(9), (zzex) zzjf().zza(query.getBlob(10), zzex.CREATOR));
                        if (query.moveToNext()) {
                            zzgi().zziv().zze("Got multiple records for conditional property, expected one", zzfi.zzbp(str), zzgf().zzbo(str2));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return zzef;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = query;
                        try {
                            zzgi().zziv().zzd("Error querying conditional property", zzfi.zzbp(str), zzgf().zzbo(str2), e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            query = cursor;
                            if (query != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (query != null) {
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
            } catch (Throwable th4) {
                th = th4;
                if (query != null) {
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final boolean zzia() {
        return zza("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzib() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzic() {
        Object e;
        Throwable th;
        long j = -1;
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            try {
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return j;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
        try {
            zzgi().zziv().zzg("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final int zzj(String str, String str2) {
        int i = 0;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        try {
            return getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzgi().zziv().zzd("Error deleting conditional property", zzfi.zzbp(str), zzgf().zzbo(str2), e);
            return i;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Map<Integer, List<zzkh>> zzk(String str, String str2) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        try {
            query = getWritableDatabase().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    do {
                        byte[] blob = query.getBlob(1);
                        zzaca zza = zzaca.zza(blob, 0, blob.length);
                        zzkh zzkh = new zzkh();
                        try {
                            zzkh.zzb(zza);
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzkh);
                        } catch (IOException e2) {
                            zzgi().zziv().zze("Failed to merge filter. appId", zzfi.zzbp(str), e2);
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayMap;
                }
                Map emptyMap = Collections.emptyMap();
                if (query == null) {
                    return emptyMap;
                }
                query.close();
                return emptyMap;
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        try {
            zzgi().zziv().zze("Database error querying filters. appId", zzfi.zzbp(str), e);
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Map<Integer, List<zzkk>> zzl(String str, String str2) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        try {
            query = getWritableDatabase().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    do {
                        byte[] blob = query.getBlob(1);
                        zzaca zza = zzaca.zza(blob, 0, blob.length);
                        zzkk zzkk = new zzkk();
                        try {
                            zzkk.zzb(zza);
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzkk);
                        } catch (IOException e2) {
                            zzgi().zziv().zze("Failed to merge filter", zzfi.zzbp(str), e2);
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayMap;
                }
                Map emptyMap = Collections.emptyMap();
                if (query == null) {
                    return emptyMap;
                }
                query.close();
                return emptyMap;
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        try {
            zzgi().zziv().zze("Database error querying filters. appId", zzfi.zzbp(str), e);
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    @VisibleForTesting
    public final long zzm(String str, String str2) {
        Object e;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        long zza;
        try {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 32);
            stringBuilder.append("select ");
            stringBuilder.append(str2);
            stringBuilder.append(" from app2 where app_id=?");
            zza = zza(stringBuilder.toString(), new String[]{str}, -1);
            if (zza == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Integer.valueOf(0));
                contentValues.put("previous_install_count", Integer.valueOf(0));
                if (writableDatabase.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    zzgi().zziv().zze("Failed to insert column (got -1). appId", zzfi.zzbp(str), str2);
                    writableDatabase.endTransaction();
                    return -1;
                }
                zza = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + zza));
                if (((long) writableDatabase.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    zzgi().zziv().zze("Failed to update column (got 0). appId", zzfi.zzbp(str), str2);
                    writableDatabase.endTransaction();
                    return -1;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return zza;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzgi().zziv().zzd("Error inserting column. appId", zzfi.zzbp(str), str2, e);
                    writableDatabase.endTransaction();
                    return zza;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            zza = 0;
            zzgi().zziv().zzd("Error inserting column. appId", zzfi.zzbp(str), str2, e);
            writableDatabase.endTransaction();
            return zza;
        }
    }
}
