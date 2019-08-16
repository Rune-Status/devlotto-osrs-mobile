package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement.Param;
import java.util.ArrayList;
import java.util.List;

public final class zzfe extends zzdz {
    private final zzff zzakf = new zzff(this, getContext(), "google_app_measurement_local.db");
    private boolean zzakg;

    zzfe(zzgn zzgn) {
        super(zzgn);
    }

    @WorkerThread
    @VisibleForTesting
    private final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        if (this.zzakg) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzakf.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzakg = true;
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A:{SYNTHETIC, Splitter:B:20:0x003e} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0061 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A:{SYNTHETIC, Splitter:B:20:0x003e} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0061 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private final boolean zza(int i, byte[] bArr) {
        SQLiteFullException e;
        SQLiteDatabase sQLiteDatabase;
        Object e2;
        Throwable th;
        int i2;
        Object e3;
        zzfv();
        zzab();
        if (this.zzakg) {
            return false;
        }
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        long j;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Param.TYPE, Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i3 = 0;
        int i4 = 5;
        while (true) {
            int i5 = i3;
            if (i5 < 5) {
                cursor = null;
                Cursor cursor2 = null;
                sQLiteDatabase2 = null;
                try {
                    sQLiteDatabase2 = getWritableDatabase();
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.beginTransaction();
                        cursor = sQLiteDatabase2.rawQuery("select count(1) from messages", null);
                        if (cursor == null) {
                            break;
                        }
                        try {
                            if (cursor.moveToFirst()) {
                                j = cursor.getLong(0);
                            }
                        } catch (SQLiteFullException e4) {
                            e2 = e4;
                            sQLiteDatabase = sQLiteDatabase2;
                            try {
                                zzgi().zziv().zzg("Error writing entry to local database", e2);
                                this.zzakg = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    i3 = i4;
                                    sQLiteDatabase2.close();
                                    i4 = i3;
                                    i3 = i5 + 1;
                                } else {
                                    i3 = i5 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor;
                                sQLiteDatabase2 = sQLiteDatabase;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase2 != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteDatabaseLockedException e5) {
                            SystemClock.sleep((long) i4);
                            i2 = i4 + 20;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 != null) {
                            }
                        } catch (SQLiteException e6) {
                            e3 = e6;
                            cursor2 = cursor;
                            if (sQLiteDatabase2 != null) {
                            }
                            zzgi().zziv().zzg("Error writing entry to local database", e3);
                            this.zzakg = true;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase2 != null) {
                            }
                            i3 = i5 + 1;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase2 != null) {
                            }
                            throw th;
                        }
                    }
                    try {
                        this.zzakg = true;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                        }
                        return false;
                    } catch (SQLiteFullException e7) {
                        e2 = e7;
                        cursor = null;
                        sQLiteDatabase = sQLiteDatabase2;
                    } catch (SQLiteDatabaseLockedException e8) {
                        try {
                            SystemClock.sleep((long) i4);
                            i2 = i4 + 20;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 != null) {
                                i3 = i2;
                                sQLiteDatabase2.close();
                                i4 = i3;
                                i3 = i5 + 1;
                            } else {
                                i4 = i2;
                                i3 = i5 + 1;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor2 = cursor;
                            sQLiteDatabase = sQLiteDatabase2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase2 != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteException e9) {
                        e3 = e9;
                        cursor = null;
                        cursor2 = cursor;
                        if (sQLiteDatabase2 != null) {
                            try {
                                if (sQLiteDatabase2.inTransaction()) {
                                    sQLiteDatabase2.endTransaction();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase2 != null) {
                                }
                                throw th;
                            }
                        }
                        zzgi().zziv().zzg("Error writing entry to local database", e3);
                        this.zzakg = true;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                        }
                        i3 = i5 + 1;
                    } catch (Throwable th52) {
                        th = th52;
                        sQLiteDatabase = sQLiteDatabase2;
                        sQLiteDatabase2 = sQLiteDatabase;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                        }
                        throw th;
                    }
                } catch (SQLiteFullException e10) {
                    sQLiteDatabase = null;
                    cursor = null;
                    e2 = e10;
                } catch (SQLiteDatabaseLockedException e11) {
                    sQLiteDatabase2 = null;
                    SystemClock.sleep((long) i4);
                    i2 = i4 + 20;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase2 != null) {
                    }
                } catch (SQLiteException e12) {
                    e3 = e12;
                    cursor2 = null;
                    if (sQLiteDatabase2 != null) {
                    }
                    zzgi().zziv().zzg("Error writing entry to local database", e3);
                    this.zzakg = true;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase2 != null) {
                    }
                    i3 = i5 + 1;
                } catch (Throwable th6) {
                    th = th6;
                    cursor2 = null;
                    sQLiteDatabase2 = null;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase2 != null) {
                    }
                    throw th;
                }
            }
            zzgi().zziy().log("Failed to write entry to local database");
            return false;
            i3 = i5 + 1;
        }
        j = 0;
        if (j >= 100000) {
            zzgi().zziv().log("Data loss, local db full");
            j = (100000 - j) + 1;
            long delete = (long) sQLiteDatabase2.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j)});
            if (delete != j) {
                zzgi().zziv().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j), Long.valueOf(delete), Long.valueOf(j - delete));
            }
        }
        sQLiteDatabase2.insertOrThrow("messages", null, contentValues);
        sQLiteDatabase2.setTransactionSuccessful();
        sQLiteDatabase2.endTransaction();
        if (cursor != null) {
            cursor.close();
        }
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.close();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @WorkerThread
    public final void resetAnalyticsData() {
        zzfv();
        zzab();
        try {
            int delete = getWritableDatabase().delete("messages", null, null) + 0;
            if (delete > 0) {
                zzgi().zzjc().zzg("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzgi().zziv().zzg("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zza(zzex zzex) {
        Parcel obtain = Parcel.obtain();
        zzex.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(0, marshall);
        }
        zzgi().zziy().log("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zza(zzka zzka) {
        Parcel obtain = Parcel.obtain();
        zzka.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(1, marshall);
        }
        zzgi().zziy().log("User property too long for local database. Sending directly to service");
        return false;
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final boolean zzc(zzef zzef) {
        zzgg();
        byte[] zza = zzkd.zza((Parcelable) zzef);
        if (zza.length <= 131072) {
            return zza(2, zza);
        }
        zzgi().zziy().log("Conditional user property too long for local database. Sending directly to service");
        return false;
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

    /* Access modifiers changed, original: protected|final */
    public final boolean zzgn() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x00ba A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x00ba A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A:{SYNTHETIC, Splitter:B:28:0x004c} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0071 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A:{SYNTHETIC, Splitter:B:28:0x004c} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0071 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0214 A:{Splitter:B:13:0x0030, ExcHandler: SQLiteDatabaseLockedException (e android.database.sqlite.SQLiteDatabaseLockedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A:{SYNTHETIC, Splitter:B:28:0x004c} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0071 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A:{SYNTHETIC, Splitter:B:28:0x004c} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0071 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:21:0x003e, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:23:0x0043, code skipped:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:30:0x0050, code skipped:
            if (r3.inTransaction() != false) goto L_0x0052;
     */
    /* JADX WARNING: Missing block: B:31:0x0052, code skipped:
            r3.endTransaction();
     */
    /* JADX WARNING: Missing block: B:34:0x0067, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:36:0x006c, code skipped:
            r0 = r9;
     */
    /* JADX WARNING: Missing block: B:77:0x010f, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:79:0x0114, code skipped:
            r9 = r0;
     */
    /* JADX WARNING: Missing block: B:128:0x01d8, code skipped:
            r1 = th;
     */
    /* JADX WARNING: Missing block: B:130:0x01dd, code skipped:
            r1 = e;
     */
    /* JADX WARNING: Missing block: B:134:0x01e7, code skipped:
            r1 = e;
     */
    /* JADX WARNING: Missing block: B:146:0x0216, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:147:0x0217, code skipped:
            r1 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final List<AbstractSafeParcelable> zzp(int i) {
        Object e;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        Throwable th;
        zzab();
        zzfv();
        if (this.zzakg) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!getContext().getDatabasePath("google_app_measurement_local.db").exists()) {
            return arrayList;
        }
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i2;
            if (i4 < 5) {
                try {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    if (writableDatabase == null) {
                        try {
                            this.zzakg = true;
                            if (writableDatabase != null) {
                                writableDatabase.close();
                            }
                            return null;
                        } catch (SQLiteFullException e2) {
                            e = e2;
                            cursor = null;
                            sQLiteDatabase = writableDatabase;
                        } catch (SQLiteDatabaseLockedException e3) {
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursor2 = null;
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                            }
                            zzgi().zziv().zzg("Error reading entries from local database", e);
                            this.zzakg = true;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = null;
                            sQLiteDatabase = writableDatabase;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    writableDatabase.beginTransaction();
                    try {
                        cursor2 = writableDatabase.query("messages", new String[]{"rowid", Param.TYPE, "entry"}, null, null, null, null, "rowid asc", Integer.toString(100));
                        long j = -1;
                        while (cursor2.moveToNext()) {
                            try {
                                j = cursor2.getLong(0);
                                int i5 = cursor2.getInt(1);
                                byte[] blob = cursor2.getBlob(2);
                                Parcel obtain;
                                if (i5 == 0) {
                                    obtain = Parcel.obtain();
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        e = (zzex) zzex.CREATOR.createFromParcel(obtain);
                                        if (e == null) {
                                        }
                                    } catch (ParseException e5) {
                                        e = zzgi().zziv();
                                        e.log("Failed to load event from local database");
                                    } finally {
                                        obtain.recycle();
                                    }
                                } else if (i5 == 1) {
                                    obtain = Parcel.obtain();
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        e = (zzka) zzka.CREATOR.createFromParcel(obtain);
                                    } catch (ParseException e6) {
                                        e = zzgi().zziv();
                                        e.log("Failed to load user property from local database");
                                        e = null;
                                        if (e == null) {
                                        }
                                        arrayList.add(e);
                                    } finally {
                                        obtain.recycle();
                                    }
                                    if (e == null) {
                                    }
                                } else if (i5 == 2) {
                                    obtain = Parcel.obtain();
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        e = (zzef) zzef.CREATOR.createFromParcel(obtain);
                                    } catch (ParseException e7) {
                                        e = zzgi().zziv();
                                        e.log("Failed to load user property from local database");
                                        e = null;
                                        if (e == null) {
                                        }
                                        arrayList.add(e);
                                    } finally {
                                        obtain.recycle();
                                    }
                                    if (e == null) {
                                    }
                                } else {
                                    zzgi().zziv().log("Unknown record type in local database");
                                }
                                arrayList.add(e);
                            } catch (SQLiteFullException e8) {
                                e = e8;
                                cursor = cursor2;
                                sQLiteDatabase = writableDatabase;
                            } catch (SQLiteDatabaseLockedException e9) {
                                sQLiteDatabase = writableDatabase;
                                SystemClock.sleep((long) i3);
                                i2 = i3 + 20;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i3 = i2;
                                i2 = i4 + 1;
                            } catch (SQLiteException e10) {
                                e = e10;
                                sQLiteDatabase = writableDatabase;
                                if (sQLiteDatabase != null) {
                                }
                                zzgi().zziv().zzg("Error reading entries from local database", e);
                                this.zzakg = true;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteDatabase = writableDatabase;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        if (writableDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                            zzgi().zziv().log("Fewer entries removed from local database than expected");
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return arrayList;
                    } catch (SQLiteFullException e11) {
                        e = e11;
                        cursor = null;
                        sQLiteDatabase = writableDatabase;
                        try {
                            zzgi().zziv().zzg("Error reading entries from local database", e);
                            this.zzakg = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                i2 = i3;
                                sQLiteDatabase.close();
                                i3 = i2;
                                i2 = i4 + 1;
                            } else {
                                i2 = i4 + 1;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException e12) {
                        cursor2 = null;
                        sQLiteDatabase = writableDatabase;
                        SystemClock.sleep((long) i3);
                        i2 = i3 + 20;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase == null) {
                        }
                        sQLiteDatabase.close();
                        i3 = i2;
                        i2 = i4 + 1;
                    } catch (SQLiteException e13) {
                        e = e13;
                        cursor2 = null;
                        sQLiteDatabase = writableDatabase;
                        if (sQLiteDatabase != null) {
                        }
                        zzgi().zziv().zzg("Error reading entries from local database", e);
                        this.zzakg = true;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        cursor2 = null;
                        sQLiteDatabase = writableDatabase;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteFullException e14) {
                    e = e14;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteDatabaseLockedException e15) {
                    cursor2 = null;
                    sQLiteDatabase = null;
                    SystemClock.sleep((long) i3);
                    i2 = i3 + 20;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i3 = i2;
                    i2 = i4 + 1;
                } catch (SQLiteException e16) {
                    e = e16;
                    cursor2 = null;
                    sQLiteDatabase = null;
                    if (sQLiteDatabase != null) {
                    }
                    zzgi().zziv().zzg("Error reading entries from local database", e);
                    this.zzakg = true;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    cursor2 = null;
                    sQLiteDatabase = null;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            }
            zzgi().zziy().log("Failed to read events from database in reasonable time");
            return null;
            i2 = i4 + 1;
        }
    }
}
