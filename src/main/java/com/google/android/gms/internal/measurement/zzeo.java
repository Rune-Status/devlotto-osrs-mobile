package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import defpackage.lp;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzeo {
    static void zza(zzfi zzfi, SQLiteDatabase sQLiteDatabase) {
        if (zzfi != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzfi.zziy().log("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzfi.zziy().log("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzfi.zziy().log("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzfi.zziy().log("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    @WorkerThread
    static void zza(zzfi zzfi, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        int i = 0;
        if (zzfi != null) {
            if (!zza(zzfi, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (zzfi != null) {
                try {
                    Set zzb = zzb(sQLiteDatabase, str);
                    String[] split = str3.split(",");
                    int length = split.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Object obj = split[i2];
                        if (zzb.remove(obj)) {
                            i2++;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(obj).length());
                            stringBuilder.append("Table ");
                            stringBuilder.append(str);
                            stringBuilder.append(" is missing required column: ");
                            stringBuilder.append(obj);
                            throw new SQLiteException(stringBuilder.toString());
                        }
                    }
                    if (strArr != null) {
                        while (i < strArr.length) {
                            if (!zzb.remove(strArr[i])) {
                                sQLiteDatabase.execSQL(strArr[i + 1]);
                            }
                            i += 2;
                        }
                    }
                    if (!zzb.isEmpty()) {
                        zzfi.zziy().zze("Table has extra columns. table, columns", str, TextUtils.join(", ", zzb));
                        return;
                    }
                    return;
                } catch (SQLiteException e) {
                    zzfi.zziv().zzg("Failed to verify columns on table that was just created", str);
                    throw e;
                }
            }
            throw new IllegalArgumentException("Monitor must not be null");
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private static boolean zza(zzfi zzfi, SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        if (zzfi != null) {
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{lp.ac}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    query.close();
                    return moveToFirst;
                } catch (SQLiteException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
            } catch (Throwable th3) {
                th = th3;
                query = cursor;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
        try {
            zzfi.zziy().zze("Error querying for table", str, e);
            if (query != null) {
                query.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            cursor = query;
            query = cursor;
            if (query != null) {
            }
            throw th;
        }
    }

    @WorkerThread
    private static Set<String> zzb(SQLiteDatabase sQLiteDatabase, String str) {
        Set<String> hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
        stringBuilder.append("SELECT * FROM ");
        stringBuilder.append(str);
        stringBuilder.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }
}
