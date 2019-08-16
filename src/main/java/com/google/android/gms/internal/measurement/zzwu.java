package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.annotation.GuardedBy;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzwu {
    private static final ConcurrentHashMap<Uri, zzwu> zzbox = new ConcurrentHashMap();
    private static final String[] zzbpe = new String[]{"key", Param.VALUE};
    private final Uri uri;
    private final ContentResolver zzboy;
    private final ContentObserver zzboz;
    private final Object zzbpa = new Object();
    private volatile Map<String, String> zzbpb;
    private final Object zzbpc = new Object();
    @GuardedBy("listenersLock")
    private final List<zzww> zzbpd = new ArrayList();

    private zzwu(ContentResolver contentResolver, Uri uri) {
        this.zzboy = contentResolver;
        this.uri = uri;
        this.zzboz = new zzwv(this, null);
    }

    public static zzwu zza(ContentResolver contentResolver, Uri uri) {
        zzwu zzwu = (zzwu) zzbox.get(uri);
        if (zzwu != null) {
            return zzwu;
        }
        zzwu zzwu2 = new zzwu(contentResolver, uri);
        zzwu = (zzwu) zzbox.putIfAbsent(uri, zzwu2);
        if (zzwu != null) {
            return zzwu;
        }
        zzwu2.zzboy.registerContentObserver(zzwu2.uri, false, zzwu2.zzboz);
        return zzwu2;
    }

    private final Map<String, String> zzsj() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.zzboy.query(this.uri, zzbpe, null, null, null);
            if (query == null) {
                return hashMap;
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return hashMap;
        } catch (SQLiteException | SecurityException e) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
        }
    }

    private final void zzsk() {
        synchronized (this.zzbpc) {
            for (zzww zzsl : this.zzbpd) {
                zzsl.zzsl();
            }
        }
    }

    public final Map<String, String> zzsh() {
        Map<String, String> zzsj = zzwx.zzd("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzsj() : this.zzbpb;
        if (zzsj == null) {
            synchronized (this.zzbpa) {
                zzsj = this.zzbpb;
                if (zzsj == null) {
                    zzsj = zzsj();
                    this.zzbpb = zzsj;
                }
            }
        }
        return zzsj != null ? zzsj : Collections.emptyMap();
    }

    public final void zzsi() {
        synchronized (this.zzbpa) {
            this.zzbpb = null;
        }
    }
}
