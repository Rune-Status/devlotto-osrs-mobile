package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics.Event;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import defpackage.lp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzjt implements zzhk {
    private static volatile zzjt zzarr;
    private final zzgn zzacv;
    private zzgh zzars;
    private zzfm zzart;
    private zzek zzaru;
    private zzfr zzarv;
    private zzjp zzarw;
    private zzed zzarx;
    private final zzjz zzary;
    private boolean zzarz;
    @VisibleForTesting
    private long zzasa;
    private List<Runnable> zzasb;
    private int zzasc;
    private int zzasd;
    private boolean zzase;
    private boolean zzasf;
    private boolean zzasg;
    private FileLock zzash;
    private FileChannel zzasi;
    private List<Long> zzasj;
    private List<Long> zzask;
    private long zzasl;
    private boolean zzvn;

    final class zza implements zzem {
        zzku zzasp;
        List<Long> zzasq;
        List<zzkr> zzasr;
        private long zzass;

        private zza() {
        }

        /* synthetic */ zza(zzjt zzjt, zzju zzju) {
            this();
        }

        private static long zza(zzkr zzkr) {
            return ((zzkr.zzavb.longValue() / 1000) / 60) / 60;
        }

        public final boolean zza(long j, zzkr zzkr) {
            Preconditions.checkNotNull(zzkr);
            if (this.zzasr == null) {
                this.zzasr = new ArrayList();
            }
            if (this.zzasq == null) {
                this.zzasq = new ArrayList();
            }
            if (this.zzasr.size() > 0 && zza((zzkr) this.zzasr.get(0)) != zza(zzkr)) {
                return false;
            }
            long zzwb = this.zzass + ((long) zzkr.zzwb());
            if (zzwb >= ((long) Math.max(0, ((Integer) zzez.zzaim.get()).intValue()))) {
                return false;
            }
            this.zzass = zzwb;
            this.zzasr.add(zzkr);
            this.zzasq.add(Long.valueOf(j));
            return this.zzasr.size() < Math.max(1, ((Integer) zzez.zzain.get()).intValue());
        }

        public final void zzb(zzku zzku) {
            Preconditions.checkNotNull(zzku);
            this.zzasp = zzku;
        }
    }

    private zzjt(zzjy zzjy) {
        this(zzjy, null);
    }

    private zzjt(zzjy zzjy, zzgn zzgn) {
        this.zzvn = false;
        Preconditions.checkNotNull(zzjy);
        this.zzacv = zzgn.zza(zzjy.zzqx, null, null);
        this.zzasl = -1;
        zzjz zzjz = new zzjz(this);
        zzjz.zzm();
        this.zzary = zzjz;
        zzfm zzfm = new zzfm(this);
        zzfm.zzm();
        this.zzart = zzfm;
        zzgh zzgh = new zzgh(this);
        zzgh.zzm();
        this.zzars = zzgh;
        this.zzacv.zzgh().zzc(new zzju(this, zzjy));
    }

    @WorkerThread
    @VisibleForTesting
    private final int zza(FileChannel fileChannel) {
        int i = 0;
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzacv.zzgi().zziv().log("Bad channel to read from");
            return i;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            } else if (read == -1) {
                return i;
            } else {
                this.zzacv.zzgi().zziy().zzg("Unexpected data length. Bytes read", Integer.valueOf(read));
                return i;
            }
        } catch (IOException e) {
            this.zzacv.zzgi().zziv().zzg("Failed to read from channel", e);
            return i;
        }
    }

    private final zzeb zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j) {
        String str3 = "Unknown";
        String str4 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.zzacv.zzgi().zziv().log("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str3 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException e) {
            this.zzacv.zzgi().zziv().zzg("Error retrieving installer package name. appId", zzfi.zzbp(str));
        }
        if (str3 == null) {
            str3 = "manual_install";
        } else if ("com.android.vending".equals(str3)) {
            str3 = "";
        }
        try {
            String str5;
            int i;
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    str4 = applicationLabel.toString();
                }
                str5 = packageInfo.versionName;
                i = packageInfo.versionCode;
            } else {
                str5 = "Unknown";
                i = Integer.MIN_VALUE;
            }
            this.zzacv.zzgl();
            return new zzeb(str, str2, str5, (long) i, str3, this.zzacv.zzgk().zzgw(), this.zzacv.zzgg().zzd(context, str), null, z, false, "", 0, this.zzacv.zzgk().zzbd(str) ? j : 0, 0, z2, z3, false);
        } catch (NameNotFoundException e2) {
            this.zzacv.zzgi().zziv().zze("Error retrieving newly installed package info. appId, appName", zzfi.zzbp(str), str4);
            return null;
        }
    }

    private static void zza(zzjs zzjs) {
        if (zzjs == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!zzjs.isInitialized()) {
            String valueOf = String.valueOf(zzjs.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @WorkerThread
    private final void zza(zzjy zzjy) {
        this.zzacv.zzgh().zzab();
        zzek zzek = new zzek(this);
        zzek.zzm();
        this.zzaru = zzek;
        this.zzacv.zzgk().zza(this.zzars);
        zzed zzed = new zzed(this);
        zzed.zzm();
        this.zzarx = zzed;
        zzjp zzjp = new zzjp(this);
        zzjp.zzm();
        this.zzarw = zzjp;
        this.zzarv = new zzfr(this);
        if (this.zzasc != this.zzasd) {
            this.zzacv.zzgi().zziv().zze("Not all upload components initialized", Integer.valueOf(this.zzasc), Integer.valueOf(this.zzasd));
        }
        this.zzvn = true;
    }

    @WorkerThread
    @VisibleForTesting
    private final boolean zza(int i, FileChannel fileChannel) {
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzacv.zzgi().zziv().log("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() == 4) {
                return true;
            }
            this.zzacv.zzgi().zziv().zzg("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            return true;
        } catch (IOException e) {
            this.zzacv.zzgi().zziv().zzg("Failed to write to channel", e);
            return false;
        }
    }

    private final boolean zza(String str, zzex zzex) {
        long round;
        String string = zzex.zzahg.getString(Param.CURRENCY);
        if (Event.ECOMMERCE_PURCHASE.equals(zzex.name)) {
            double doubleValue = zzex.zzahg.zzbk(Param.VALUE).doubleValue() * 1000000.0d;
            if (doubleValue == 0.0d) {
                doubleValue = ((double) zzex.zzahg.getLong(Param.VALUE).longValue()) * 1000000.0d;
            }
            if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                this.zzacv.zzgi().zziy().zze("Data lost. Currency value is too big. appId", zzfi.zzbp(str), Double.valueOf(doubleValue));
                return false;
            }
            round = Math.round(doubleValue);
        } else {
            round = zzex.zzahg.getLong(Param.VALUE).longValue();
        }
        if (!TextUtils.isEmpty(string)) {
            String toUpperCase = string.toUpperCase(Locale.US);
            if (toUpperCase.matches("[A-Z]{3}")) {
                String valueOf = String.valueOf("_ltv_");
                toUpperCase = String.valueOf(toUpperCase);
                String concat = toUpperCase.length() != 0 ? valueOf.concat(toUpperCase) : new String(valueOf);
                zzkc zzh = zzjh().zzh(str, concat);
                if (zzh == null || !(zzh.value instanceof Long)) {
                    zzek zzjh = zzjh();
                    int zzb = this.zzacv.zzgk().zzb(str, zzez.zzaji);
                    Preconditions.checkNotEmpty(str);
                    zzjh.zzab();
                    zzjh.zzch();
                    try {
                        zzjh.getWritableDatabase().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(zzb - 1)});
                    } catch (SQLiteException e) {
                        zzjh.zzgi().zziv().zze("Error pruning currencies. appId", zzfi.zzbp(str), e);
                    }
                    zzh = new zzkc(str, zzex.origin, concat, this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(round));
                } else {
                    zzh = new zzkc(str, zzex.origin, concat, this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(round + ((Long) zzh.value).longValue()));
                }
                if (!zzjh().zza(zzh)) {
                    this.zzacv.zzgi().zziv().zzd("Too many unique user properties are set. Ignoring user property. appId", zzfi.zzbp(str), this.zzacv.zzgf().zzbo(zzh.name), zzh.value);
                    this.zzacv.zzgg().zza(str, 9, null, null, 0);
                }
            }
        }
        return true;
    }

    private final zzkp[] zza(String str, zzkx[] zzkxArr, zzkr[] zzkrArr) {
        Preconditions.checkNotEmpty(str);
        return zzjg().zza(str, zzkrArr, zzkxArr);
    }

    @WorkerThread
    private final void zzab() {
        this.zzacv.zzgh().zzab();
    }

    @WorkerThread
    private final void zzb(zzea zzea) {
        zzab();
        if (TextUtils.isEmpty(zzea.getGmpAppId())) {
            zzb(zzea.zzah(), 204, null, null, null);
            return;
        }
        zzeh zzgk = this.zzacv.zzgk();
        String gmpAppId = zzea.getGmpAppId();
        String appInstanceId = zzea.getAppInstanceId();
        Builder builder = new Builder();
        Builder encodedAuthority = builder.scheme((String) zzez.zzaii.get()).encodedAuthority((String) zzez.zzaij.get());
        String valueOf = String.valueOf(gmpAppId);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", appInstanceId).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(zzgk.zzgw()));
        String uri = builder.build().toString();
        try {
            Map map;
            URL url = new URL(uri);
            this.zzacv.zzgi().zzjc().zzg("Fetching remote configuration", zzea.zzah());
            zzkn zzbx = zzky().zzbx(zzea.zzah());
            String zzby = zzky().zzby(zzea.zzah());
            if (zzbx == null || TextUtils.isEmpty(zzby)) {
                map = null;
            } else {
                map = new ArrayMap();
                map.put("If-Modified-Since", zzby);
            }
            this.zzase = true;
            zzfm zzkz = zzkz();
            gmpAppId = zzea.zzah();
            zzjw zzjw = new zzjw(this);
            zzkz.zzab();
            zzkz.zzch();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzjw);
            zzkz.zzgh().zzd(new zzfq(zzkz, gmpAppId, url, null, map, zzjw));
        } catch (MalformedURLException e) {
            this.zzacv.zzgi().zziv().zze("Failed to parse config URL. Not fetching. appId", zzfi.zzbp(zzea.zzah()), uri);
        }
    }

    @WorkerThread
    private final Boolean zzc(zzea zzea) {
        try {
            if (zzea.zzgu() != -2147483648L) {
                if (zzea.zzgu() == ((long) Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(zzea.zzah(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            }
            String str = Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(zzea.zzah(), 0).versionName;
            if (zzea.zzag() != null && zzea.zzag().equals(str)) {
                return Boolean.valueOf(true);
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    @WorkerThread
    private final void zzc(zzex zzex, zzeb zzeb) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a23 = a18\r\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\r\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\r\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\r\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\r\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\r\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\nCaused by: java.lang.NullPointerException\r\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\r\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\r\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\r\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\r\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\r\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\r\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\r\n\t... 17 more\r\n");
    }

    @WorkerThread
    private final zzeb zzce(String str) {
        zzfk zzjb;
        String str2;
        Object str3;
        zzea zzbf = zzjh().zzbf(str3);
        if (zzbf == null || TextUtils.isEmpty(zzbf.zzag())) {
            zzjb = this.zzacv.zzgi().zzjb();
            str2 = "No app data available; dropping";
        } else {
            Boolean zzc = zzc(zzbf);
            if (zzc == null || zzc.booleanValue()) {
                return new zzeb(str3, zzbf.getGmpAppId(), zzbf.zzag(), zzbf.zzgu(), zzbf.zzgv(), zzbf.zzgw(), zzbf.zzgx(), null, zzbf.isMeasurementEnabled(), false, zzbf.zzgr(), zzbf.zzhk(), 0, 0, zzbf.zzhl(), zzbf.zzhm(), false);
            }
            zzjb = this.zzacv.zzgi().zziv();
            str2 = "App version does not match; dropping. appId";
            str3 = zzfi.zzbp(str3);
        }
        zzjb.zzg(str2, str3);
        return null;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0173=Splitter:B:50:0x0173, B:20:0x0078=Splitter:B:20:0x0078, B:128:0x02cb=Splitter:B:128:0x02cb} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x004c=Splitter:B:14:0x004c, B:90:0x01fc=Splitter:B:90:0x01fc} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x004c=Splitter:B:14:0x004c, B:90:0x01fc=Splitter:B:90:0x01fc} */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x039e A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0c38  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x039e A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0c38  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x039e A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0c38  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0583 A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x06a9 A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x06d3 A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0c4e  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0813 A:{SYNTHETIC, Splitter:B:329:0x0813} */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0881 A:{SYNTHETIC, Splitter:B:355:0x0881} */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0829 A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0c1e A:{Catch:{ SQLiteException -> 0x0c0b, all -> 0x033a }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081 A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0c1e A:{Catch:{ SQLiteException -> 0x0c0b, all -> 0x033a }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c7 A:{SYNTHETIC, Splitter:B:72:0x01c7} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081 A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0c1e A:{Catch:{ SQLiteException -> 0x0c0b, all -> 0x033a }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A:{Catch:{ all -> 0x0178 }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0c78 A:{Splitter:B:16:0x0070, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0336 A:{SYNTHETIC, Splitter:B:154:0x0336} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:154:0x0336, B:468:0x0bed] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:19:0x0076, code skipped:
            if (r4 != null) goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:49:0x0171, code skipped:
            if (r12 != null) goto L_0x0173;
     */
    /* JADX WARNING: Missing block: B:51:?, code skipped:
            r12.close();
     */
    /* JADX WARNING: Missing block: B:53:0x0179, code skipped:
            zzjh().endTransaction();
     */
    /* JADX WARNING: Missing block: B:54:0x0180, code skipped:
            throw r2;
     */
    /* JADX WARNING: Missing block: B:95:0x0226, code skipped:
            if (r4 != null) goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:127:0x02c9, code skipped:
            if (r3 != null) goto L_0x02cb;
     */
    /* JADX WARNING: Missing block: B:150:0x032f, code skipped:
            if (r3 != null) goto L_0x02cb;
     */
    /* JADX WARNING: Missing block: B:157:0x033a, code skipped:
            r2 = th;
     */
    /* JADX WARNING: Missing block: B:163:0x0354, code skipped:
            if (r12 == null) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:166:0x035e, code skipped:
            r5 = e;
     */
    /* JADX WARNING: Missing block: B:167:0x035f, code skipped:
            r2 = null;
            r4 = r4;
     */
    /* JADX WARNING: Missing block: B:184:0x039f, code skipped:
            if (r2 == null) goto L_0x0581;
     */
    /* JADX WARNING: Missing block: B:473:0x0c0b, code skipped:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:475:?, code skipped:
            r3.zzgi().zziv().zze("Failed to remove unused event metadata. appId", com.google.android.gms.internal.measurement.zzfi.zzbp(r7), r2);
     */
    /* JADX WARNING: Missing block: B:501:0x0c78, code skipped:
            r2 = th;
     */
    /* JADX WARNING: Missing block: B:502:0x0c79, code skipped:
            r12 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private final boolean zzd(String str, long j) {
        Object e;
        String str2;
        Cursor cursor;
        String str3;
        Cursor cursor2;
        Throwable th;
        SQLiteException e2;
        SQLiteException e3;
        zzjh().beginTransaction();
        try {
            String str4;
            Object obj;
            zza zza = new zza(this, null);
            zzek zzjh = zzjh();
            long j2 = this.zzasl;
            Preconditions.checkNotNull(zza);
            zzjh.zzab();
            zzjh.zzch();
            try {
                SQLiteDatabase writableDatabase = zzjh.getWritableDatabase();
                int i;
                String[] strArr;
                Object obj2;
                StringBuilder stringBuilder;
                String str5;
                if (TextUtils.isEmpty(null)) {
                    i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                    if (i != 0) {
                        try {
                            strArr = new String[]{String.valueOf(j2), String.valueOf(j)};
                        } catch (SQLiteException e4) {
                            e2 = e4;
                            str2 = null;
                            cursor = null;
                            str3 = str2;
                            cursor2 = cursor;
                            try {
                                zzjh.zzgi().zziv().zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str3), e2);
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = null;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    }
                    strArr = new String[]{String.valueOf(j)};
                    obj2 = i != 0 ? "rowid <= ? and " : "";
                    stringBuilder = new StringBuilder(String.valueOf(obj2).length() + 148);
                    stringBuilder.append("select app_id, metadata_fingerprint from raw_events where ");
                    stringBuilder.append(obj2);
                    stringBuilder.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursor = writableDatabase.rawQuery(stringBuilder.toString(), strArr);
                    try {
                        if (cursor.moveToFirst()) {
                            str3 = cursor.getString(0);
                            String string = cursor.getString(1);
                            cursor.close();
                            str5 = string;
                            cursor2 = cursor;
                            str4 = str3;
                            try {
                                cursor2 = writableDatabase.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str5}, null, null, "rowid", "2");
                            } catch (SQLiteException e32) {
                                str2 = str4;
                                cursor = cursor2;
                                e2 = e32;
                            } catch (Throwable th4) {
                                th = th4;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                            try {
                                long j3;
                                if (cursor2.moveToFirst()) {
                                    try {
                                        zzjh.zzgi().zziv().zzg("Raw event metadata record is missing. appId", zzfi.zzbp(str4));
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    } catch (SQLiteException e322) {
                                        str2 = str4;
                                        cursor = cursor2;
                                        e2 = e322;
                                        str3 = str2;
                                        cursor2 = cursor;
                                        zzjh.zzgi().zziv().zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str3), e2);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (cursor2 != null) {
                                        }
                                        throw th;
                                    }
                                    obj = (zza.zzasr != null || zza.zzasr.isEmpty()) ? 1 : null;
                                    if (obj != null) {
                                        int i2;
                                        int hashCode;
                                        Long l;
                                        zza zza2;
                                        zzku zzku = zza.zzasp;
                                        zzku.zzavi = new zzkr[zza.zzasr.size()];
                                        boolean zzaw = this.zzacv.zzgk().zzaw(zzku.zzth);
                                        boolean z = false;
                                        int i3 = 0;
                                        long j4 = 0;
                                        int i4 = 0;
                                        while (i4 < zza.zzasr.size()) {
                                            zzkr zzkr = (zzkr) zza.zzasr.get(i4);
                                            if (zzky().zzn(zza.zzasp.zzth, zzkr.name)) {
                                                this.zzacv.zzgi().zziy().zze("Dropping blacklisted raw event. appId", zzfi.zzbp(zza.zzasp.zzth), this.zzacv.zzgf().zzbm(zzkr.name));
                                                obj = (zzky().zzcb(zza.zzasp.zzth) || zzky().zzcc(zza.zzasp.zzth)) ? 1 : null;
                                                if (obj == null && !"_err".equals(zzkr.name)) {
                                                    this.zzacv.zzgg().zza(zza.zzasp.zzth, 11, "_ev", zzkr.name, 0);
                                                }
                                                i2 = i3;
                                                j3 = j4;
                                            } else {
                                                zzks[] zzksArr;
                                                zzks zzks;
                                                boolean z2;
                                                boolean zzo = zzky().zzo(zza.zzasp.zzth, zzkr.name);
                                                if (!zzo) {
                                                    zzjf();
                                                    str2 = zzkr.name;
                                                    Preconditions.checkNotEmpty(str2);
                                                    hashCode = str2.hashCode();
                                                    if (hashCode == 94660) {
                                                        if (str2.equals("_in")) {
                                                            obj = null;
                                                            switch (obj) {
                                                                case null:
                                                                case 1:
                                                                case 2:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    } else if (hashCode == 95025) {
                                                        if (str2.equals("_ug")) {
                                                            obj = 2;
                                                            switch (obj) {
                                                                case null:
                                                                case 1:
                                                                case 2:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    } else if (hashCode == 95027 && str2.equals("_ui")) {
                                                        obj = 1;
                                                        switch (obj) {
                                                            case null:
                                                            case 1:
                                                            case 2:
                                                                obj = 1;
                                                                break;
                                                            default:
                                                                obj = null;
                                                                break;
                                                        }
                                                    }
                                                    obj = -1;
                                                    switch (obj) {
                                                        case null:
                                                        case 1:
                                                        case 2:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                if (zzkr.zzava == null) {
                                                    zzkr.zzava = new zzks[0];
                                                }
                                                obj = null;
                                                obj2 = null;
                                                for (zzks zzks2 : zzkr.zzava) {
                                                    if ("_c".equals(zzks2.name)) {
                                                        zzks2.zzave = Long.valueOf(1);
                                                        obj = 1;
                                                    } else if ("_r".equals(zzks2.name)) {
                                                        zzks2.zzave = Long.valueOf(1);
                                                        obj2 = 1;
                                                    }
                                                }
                                                if (obj == null && zzo) {
                                                    this.zzacv.zzgi().zzjc().zzg("Marking event as conversion", this.zzacv.zzgf().zzbm(zzkr.name));
                                                    zzksArr = (zzks[]) Arrays.copyOf(zzkr.zzava, zzkr.zzava.length + 1);
                                                    zzks zzks3 = new zzks();
                                                    zzks3.name = "_c";
                                                    zzks3.zzave = Long.valueOf(1);
                                                    zzksArr[zzksArr.length - 1] = zzks3;
                                                    zzkr.zzava = zzksArr;
                                                }
                                                if (obj2 == null) {
                                                    this.zzacv.zzgi().zzjc().zzg("Marking event as real-time", this.zzacv.zzgf().zzbm(zzkr.name));
                                                    zzksArr = (zzks[]) Arrays.copyOf(zzkr.zzava, zzkr.zzava.length + 1);
                                                    zzks = new zzks();
                                                    zzks.name = "_r";
                                                    zzks.zzave = Long.valueOf(1);
                                                    zzksArr[zzksArr.length - 1] = zzks;
                                                    zzkr.zzava = zzksArr;
                                                }
                                                if (zzjh().zza(zzld(), zza.zzasp.zzth, false, false, false, false, true).zzagx > ((long) this.zzacv.zzgk().zzas(zza.zzasp.zzth))) {
                                                    i2 = 0;
                                                    while (i2 < zzkr.zzava.length) {
                                                        if ("_r".equals(zzkr.zzava[i2].name)) {
                                                            zzks[] zzksArr2 = new zzks[(zzkr.zzava.length - 1)];
                                                            if (i2 > 0) {
                                                                System.arraycopy(zzkr.zzava, 0, zzksArr2, 0, i2);
                                                            }
                                                            if (i2 < zzksArr2.length) {
                                                                System.arraycopy(zzkr.zzava, i2 + 1, zzksArr2, i2, zzksArr2.length - i2);
                                                            }
                                                            zzkr.zzava = zzksArr2;
                                                            z2 = z;
                                                        } else {
                                                            i2++;
                                                        }
                                                    }
                                                    z2 = z;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (zzkd.zzcg(zzkr.name) && zzo && zzjh().zza(zzld(), zza.zzasp.zzth, false, false, true, false, false).zzagv > ((long) this.zzacv.zzgk().zzb(zza.zzasp.zzth, zzez.zzair))) {
                                                    this.zzacv.zzgi().zziy().zzg("Too many conversions. Not logging as conversion. appId", zzfi.zzbp(zza.zzasp.zzth));
                                                    zzks[] zzksArr3 = zzkr.zzava;
                                                    int length = zzksArr3.length;
                                                    Object obj3 = null;
                                                    zzks = null;
                                                    i = 0;
                                                    while (i < length) {
                                                        zzks zzks4 = zzksArr3[i];
                                                        if (!"_c".equals(zzks4.name)) {
                                                            if ("_err".equals(zzks4.name)) {
                                                                obj3 = 1;
                                                                zzks4 = zzks;
                                                            } else {
                                                                zzks4 = zzks;
                                                            }
                                                        }
                                                        i++;
                                                        zzks = zzks4;
                                                    }
                                                    if (obj3 == null || zzks == null) {
                                                        if (zzks != null) {
                                                            zzks.name = "_err";
                                                            zzks.zzave = Long.valueOf(10);
                                                            z = z2;
                                                        } else {
                                                            this.zzacv.zzgi().zziv().zzg("Did not find conversion parameter. appId", zzfi.zzbp(zza.zzasp.zzth));
                                                            z = z2;
                                                        }
                                                        if (zzaw) {
                                                        }
                                                        j3 = j4;
                                                        zzku.zzavi[i3] = zzkr;
                                                        i2 = i3 + 1;
                                                    } else {
                                                        zzkr.zzava = (zzks[]) ArrayUtils.removeAll(zzkr.zzava, zzks);
                                                        z = z2;
                                                        if (zzaw) {
                                                        }
                                                        j3 = j4;
                                                        zzku.zzavi[i3] = zzkr;
                                                        i2 = i3 + 1;
                                                    }
                                                } else {
                                                    z = z2;
                                                    if (zzaw || !"_e".equals(zzkr.name)) {
                                                        j3 = j4;
                                                    } else {
                                                        zzfk zziy;
                                                        if (zzkr.zzava == null || zzkr.zzava.length == 0) {
                                                            zziy = this.zzacv.zzgi().zziy();
                                                            str3 = "Engagement event does not contain any parameters. appId";
                                                            obj = zzfi.zzbp(zza.zzasp.zzth);
                                                        } else {
                                                            zzjf();
                                                            l = (Long) zzjz.zzb(zzkr, "_et");
                                                            if (l == null) {
                                                                zziy = this.zzacv.zzgi().zziy();
                                                                str3 = "Engagement event does not include duration. appId";
                                                                obj = zzfi.zzbp(zza.zzasp.zzth);
                                                            } else {
                                                                j3 = j4 + l.longValue();
                                                            }
                                                        }
                                                        zziy.zzg(str3, obj);
                                                        j3 = j4;
                                                    }
                                                    zzku.zzavi[i3] = zzkr;
                                                    i2 = i3 + 1;
                                                }
                                            }
                                            i3 = i2;
                                            i4++;
                                            j4 = j3;
                                        }
                                        if (i3 < zza.zzasr.size()) {
                                            zzku.zzavi = (zzkr[]) Arrays.copyOf(zzku.zzavi, i3);
                                        }
                                        if (zzaw) {
                                            zzkc zzh = zzjh().zzh(zzku.zzth, "_lte");
                                            zzkc zzkc = (zzh == null || zzh.value == null) ? new zzkc(zzku.zzth, "auto", "_lte", this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(j4)) : new zzkc(zzku.zzth, "auto", "_lte", this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(((Long) zzh.value).longValue() + j4));
                                            zzkx zzkx = new zzkx();
                                            zzkx.name = "_lte";
                                            zzkx.zzaws = Long.valueOf(this.zzacv.zzbt().currentTimeMillis());
                                            zzkx.zzave = (Long) zzkc.value;
                                            i2 = 0;
                                            while (i2 < zzku.zzavj.length) {
                                                if ("_lte".equals(zzku.zzavj[i2].name)) {
                                                    zzku.zzavj[i2] = zzkx;
                                                    obj = 1;
                                                    if (obj == null) {
                                                        zzku.zzavj = (zzkx[]) Arrays.copyOf(zzku.zzavj, zzku.zzavj.length + 1);
                                                        zzku.zzavj[zza.zzasp.zzavj.length - 1] = zzkx;
                                                    }
                                                    if (j4 > 0) {
                                                        zzjh().zza(zzkc);
                                                        this.zzacv.zzgi().zzjb().zzg("Updated lifetime engagement user property with value. Value", zzkc.value);
                                                    }
                                                } else {
                                                    i2++;
                                                }
                                            }
                                            obj = null;
                                            if (obj == null) {
                                            }
                                            if (j4 > 0) {
                                            }
                                        }
                                        zzku.zzawa = zza(zzku.zzth, zzku.zzavj, zzku.zzavi);
                                        if (this.zzacv.zzgk().zzav(zza.zzasp.zzth)) {
                                            try {
                                                HashMap hashMap = new HashMap();
                                                zzkr[] zzkrArr = new zzkr[zzku.zzavi.length];
                                                SecureRandom zzlo = this.zzacv.zzgg().zzlo();
                                                zzkr[] zzkrArr2 = zzku.zzavi;
                                                int length2 = zzkrArr2.length;
                                                i2 = 0;
                                                int i5 = 0;
                                                while (true) {
                                                    int i6 = i2;
                                                    if (i6 < length2) {
                                                        zzkr zzkr2 = zzkrArr2[i6];
                                                        zzet zzet;
                                                        if (zzkr2.name.equals("_ep")) {
                                                            zzjf();
                                                            str3 = (String) zzjz.zzb(zzkr2, "_en");
                                                            zzet = (zzet) hashMap.get(str3);
                                                            if (zzet == null) {
                                                                zzet = zzjh().zzf(zza.zzasp.zzth, str3);
                                                                hashMap.put(str3, zzet);
                                                            }
                                                            if (zzet.zzahl == null) {
                                                                if (zzet.zzahm.longValue() > 1) {
                                                                    zzjf();
                                                                    zzkr2.zzava = zzjz.zza(zzkr2.zzava, "_sr", zzet.zzahm);
                                                                }
                                                                if (zzet.zzahn != null && zzet.zzahn.booleanValue()) {
                                                                    zzjf();
                                                                    zzkr2.zzava = zzjz.zza(zzkr2.zzava, "_efs", Long.valueOf(1));
                                                                }
                                                                i2 = i5 + 1;
                                                                zzkrArr[i5] = zzkr2;
                                                            } else {
                                                                i2 = i5;
                                                            }
                                                        } else {
                                                            int zzp;
                                                            Long valueOf = Long.valueOf(1);
                                                            if (!(TextUtils.isEmpty("_dbg") || valueOf == null)) {
                                                                zzks[] zzksArr4 = zzkr2.zzava;
                                                                i = zzksArr4.length;
                                                                i2 = 0;
                                                                while (i2 < i) {
                                                                    zzks zzks5 = zzksArr4[i2];
                                                                    if (!"_dbg".equals(zzks5.name)) {
                                                                        i2++;
                                                                    } else if (((valueOf instanceof Long) && valueOf.equals(zzks5.zzave)) || (((valueOf instanceof String) && valueOf.equals(zzks5.zzale)) || ((valueOf instanceof Double) && valueOf.equals(zzks5.zzasw)))) {
                                                                        obj = 1;
                                                                        zzp = obj != null ? zzky().zzp(zza.zzasp.zzth, zzkr2.name) : 1;
                                                                        if (zzp > 0) {
                                                                            this.zzacv.zzgi().zziy().zze("Sample rate must be positive. event, rate", zzkr2.name, Integer.valueOf(zzp));
                                                                            i2 = i5 + 1;
                                                                            zzkrArr[i5] = zzkr2;
                                                                        } else {
                                                                            zzet zzf;
                                                                            zzet = (zzet) hashMap.get(zzkr2.name);
                                                                            if (zzet == null) {
                                                                                zzf = zzjh().zzf(zza.zzasp.zzth, zzkr2.name);
                                                                                if (zzf == null) {
                                                                                    this.zzacv.zzgi().zziy().zze("Event being bundled has no eventAggregate. appId, eventName", zza.zzasp.zzth, zzkr2.name);
                                                                                    zzf = new zzet(zza.zzasp.zzth, zzkr2.name, 1, 1, zzkr2.zzavb.longValue(), 0, null, null, null);
                                                                                }
                                                                            } else {
                                                                                zzf = zzet;
                                                                            }
                                                                            zzjf();
                                                                            l = (Long) zzjz.zzb(zzkr2, "_eid");
                                                                            Boolean valueOf2 = Boolean.valueOf(l != null);
                                                                            long j5;
                                                                            if (zzp == 1) {
                                                                                i2 = i5 + 1;
                                                                                zzkrArr[i5] = zzkr2;
                                                                                if (valueOf2.booleanValue() && !(zzf.zzahl == null && zzf.zzahm == null && zzf.zzahn == null)) {
                                                                                    hashMap.put(zzkr2.name, zzf.zza(null, null, null));
                                                                                }
                                                                            } else if (zzlo.nextInt(zzp) == 0) {
                                                                                zzjf();
                                                                                j5 = (long) zzp;
                                                                                zzkr2.zzava = zzjz.zza(zzkr2.zzava, "_sr", Long.valueOf(j5));
                                                                                zzkrArr[i5] = zzkr2;
                                                                                if (valueOf2.booleanValue()) {
                                                                                    zzf = zzf.zza(null, Long.valueOf(j5), null);
                                                                                }
                                                                                hashMap.put(zzkr2.name, zzf.zzai(zzkr2.zzavb.longValue()));
                                                                                i2 = i5 + 1;
                                                                            } else {
                                                                                if (Math.abs(zzkr2.zzavb.longValue() - zzf.zzahk) >= 86400000) {
                                                                                    zzjf();
                                                                                    zzkr2.zzava = zzjz.zza(zzkr2.zzava, "_efs", Long.valueOf(1));
                                                                                    zzjf();
                                                                                    j5 = (long) zzp;
                                                                                    zzkr2.zzava = zzjz.zza(zzkr2.zzava, "_sr", Long.valueOf(j5));
                                                                                    zzkrArr[i5] = zzkr2;
                                                                                    hashMap.put(zzkr2.name, (valueOf2.booleanValue() ? zzf.zza(null, Long.valueOf(j5), Boolean.valueOf(true)) : zzf).zzai(zzkr2.zzavb.longValue()));
                                                                                    i5++;
                                                                                } else if (valueOf2.booleanValue()) {
                                                                                    hashMap.put(zzkr2.name, zzf.zza(l, null, null));
                                                                                }
                                                                                i2 = i6 + 1;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            obj = null;
                                                            if (obj != null) {
                                                            }
                                                            if (zzp > 0) {
                                                            }
                                                        }
                                                        i5 = i2;
                                                        i2 = i6 + 1;
                                                    } else {
                                                        if (i5 < zzku.zzavi.length) {
                                                            zzku.zzavi = (zzkr[]) Arrays.copyOf(zzkrArr, i5);
                                                        }
                                                        for (Entry value : hashMap.entrySet()) {
                                                            zzjh().zza((zzet) value.getValue());
                                                        }
                                                        zza2 = zza;
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                            }
                                        } else {
                                            zza2 = zza;
                                        }
                                        try {
                                            zzku.zzavl = Long.valueOf(Long.MAX_VALUE);
                                            zzku.zzavm = Long.valueOf(Long.MIN_VALUE);
                                            for (zzkr zzkr3 : zzku.zzavi) {
                                                if (zzkr3.zzavb.longValue() < zzku.zzavl.longValue()) {
                                                    zzku.zzavl = zzkr3.zzavb;
                                                }
                                                if (zzkr3.zzavb.longValue() > zzku.zzavm.longValue()) {
                                                    zzku.zzavm = zzkr3.zzavb;
                                                }
                                            }
                                            String str6 = zza2.zzasp.zzth;
                                            zzea zzbf = zzjh().zzbf(str6);
                                            if (zzbf == null) {
                                                this.zzacv.zzgi().zziv().zzg("Bundling raw events w/o app info. appId", zzfi.zzbp(zza2.zzasp.zzth));
                                            } else if (zzku.zzavi.length > 0) {
                                                long zzgt = zzbf.zzgt();
                                                zzku.zzavo = zzgt != 0 ? Long.valueOf(zzgt) : null;
                                                j3 = zzbf.zzgs();
                                                if (j3 != 0) {
                                                    zzgt = j3;
                                                }
                                                zzku.zzavn = zzgt != 0 ? Long.valueOf(zzgt) : null;
                                                zzbf.zzhb();
                                                zzku.zzavy = Integer.valueOf((int) zzbf.zzgy());
                                                zzbf.zzr(zzku.zzavl.longValue());
                                                zzbf.zzs(zzku.zzavm.longValue());
                                                zzku.zzafy = zzbf.zzhj();
                                                zzjh().zza(zzbf);
                                            }
                                            if (zzku.zzavi.length > 0) {
                                                this.zzacv.zzgl();
                                                zzkn zzbx = zzky().zzbx(zza2.zzasp.zzth);
                                                if (zzbx != null && zzbx.zzaum != null) {
                                                    l = zzbx.zzaum;
                                                } else if (TextUtils.isEmpty(zza2.zzasp.zzafa)) {
                                                    l = Long.valueOf(-1);
                                                } else {
                                                    this.zzacv.zzgi().zziy().zzg("Did not find measurement config or missing version info. appId", zzfi.zzbp(zza2.zzasp.zzth));
                                                    zzjh().zza(zzku, z);
                                                }
                                                zzku.zzawf = l;
                                                zzjh().zza(zzku, z);
                                            }
                                            zzek zzjh2 = zzjh();
                                            List list = zza2.zzasq;
                                            Preconditions.checkNotNull(list);
                                            zzjh2.zzab();
                                            zzjh2.zzch();
                                            StringBuilder stringBuilder2 = new StringBuilder("rowid in (");
                                            for (hashCode = 0; hashCode < list.size(); hashCode++) {
                                                if (hashCode != 0) {
                                                    stringBuilder2.append(",");
                                                }
                                                stringBuilder2.append(((Long) list.get(hashCode)).longValue());
                                            }
                                            stringBuilder2.append(")");
                                            i2 = zzjh2.getWritableDatabase().delete("raw_events", stringBuilder2.toString(), null);
                                            if (i2 != list.size()) {
                                                zzjh2.zzgi().zziv().zze("Deleted fewer rows from raw events table than expected", Integer.valueOf(i2), Integer.valueOf(list.size()));
                                            }
                                            zzek zzjh3 = zzjh();
                                            zzjh3.getWritableDatabase().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str6, str6});
                                            zzjh().setTransactionSuccessful();
                                            zzjh().endTransaction();
                                            return true;
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } else {
                                        zzjh().setTransactionSuccessful();
                                        zzjh().endTransaction();
                                        return false;
                                    }
                                }
                                String[] strArr2;
                                byte[] blob = cursor2.getBlob(0);
                                zzaca zza3 = zzaca.zza(blob, 0, blob.length);
                                zzku zzku2 = new zzku();
                                try {
                                    zzku2.zzb(zza3);
                                    if (cursor2.moveToNext()) {
                                        zzjh.zzgi().zziy().zzg("Get multiple raw event metadata records, expected one. appId", zzfi.zzbp(str4));
                                    }
                                    cursor2.close();
                                    zza.zzb(zzku2);
                                    if (j2 != -1) {
                                        string = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{str4, str5, String.valueOf(j2)};
                                    } else {
                                        string = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{str4, str5};
                                    }
                                } catch (IOException e5) {
                                    zzjh.zzgi().zziv().zze("Data loss. Failed to merge raw event metadata. appId", zzfi.zzbp(str4), e5);
                                }
                                try {
                                    Cursor query = writableDatabase.query("raw_events", new String[]{"rowid", lp.ac, AppMeasurement.Param.TIMESTAMP, "data"}, string, strArr2, null, null, "rowid", null);
                                    try {
                                        if (query.moveToFirst()) {
                                            do {
                                                j3 = query.getLong(0);
                                                byte[] blob2 = query.getBlob(3);
                                                zzaca zza4 = zzaca.zza(blob2, 0, blob2.length);
                                                zzkr zzkr4 = new zzkr();
                                                try {
                                                    zzkr4.zzb(zza4);
                                                    zzkr4.name = query.getString(1);
                                                    zzkr4.zzavb = Long.valueOf(query.getLong(2));
                                                    if (!zza.zza(j3, zzkr4)) {
                                                        if (query != null) {
                                                        }
                                                        if (zza.zzasr != null) {
                                                        }
                                                        if (obj != null) {
                                                        }
                                                    }
                                                } catch (IOException e52) {
                                                    zzjh.zzgi().zziv().zze("Data loss. Failed to merge raw event. appId", zzfi.zzbp(str4), e52);
                                                }
                                            } while (query.moveToNext());
                                        } else {
                                            zzjh.zzgi().zziy().zzg("Raw event data disappeared while in transaction. appId", zzfi.zzbp(str4));
                                        }
                                        query.close();
                                    } catch (SQLiteException e6) {
                                        e2 = e6;
                                        str2 = str4;
                                        cursor = query;
                                        str3 = str2;
                                        cursor2 = cursor;
                                        zzjh.zzgi().zziv().zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str3), e2);
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor2 = query;
                                        if (cursor2 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e7) {
                                    e322 = e7;
                                } catch (Throwable th9) {
                                    th = th9;
                                    if (cursor2 != null) {
                                    }
                                    throw th;
                                }
                                if (zza.zzasr != null) {
                                }
                                if (obj != null) {
                                }
                            } catch (SQLiteException e8) {
                                e322 = e8;
                            } catch (Throwable th10) {
                                th = th10;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (SQLiteException e9) {
                        e2 = e9;
                        str2 = str3;
                    } catch (Throwable th11) {
                    }
                } else {
                    i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                    if (i != 0) {
                        String[] strArr3 = new String[2];
                        strArr3[0] = null;
                        strArr3[1] = String.valueOf(j2);
                        strArr = strArr3;
                    } else {
                        strArr = new String[]{null};
                    }
                    obj2 = i != 0 ? " and rowid <= ?" : "";
                    stringBuilder = new StringBuilder(String.valueOf(obj2).length() + 84);
                    stringBuilder.append("select metadata_fingerprint from raw_events where app_id = ?");
                    stringBuilder.append(obj2);
                    stringBuilder.append(" order by rowid limit 1;");
                    cursor = writableDatabase.rawQuery(stringBuilder.toString(), strArr);
                    if (cursor.moveToFirst()) {
                        str3 = cursor.getString(0);
                        cursor.close();
                        str4 = null;
                        str5 = str3;
                        cursor2 = cursor;
                        cursor2 = writableDatabase.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str5}, null, null, "rowid", "2");
                        if (cursor2.moveToFirst()) {
                        }
                    }
                }
                cursor.close();
            } catch (SQLiteException e10) {
                cursor2 = null;
                str3 = null;
                e2 = e10;
            } catch (Throwable th12) {
                th = th12;
                cursor2 = null;
                if (cursor2 != null) {
                }
                throw th;
            }
            if (zza.zzasr != null) {
            }
            if (obj != null) {
            }
            str2 = str4;
            cursor = cursor2;
            e2 = e322;
            str3 = str2;
            cursor2 = cursor;
            zzjh.zzgi().zziv().zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str3), e2);
        } catch (Throwable th13) {
            th = th13;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private final zzea zzg(zzeb zzeb) {
        Object obj;
        Object obj2 = 1;
        zzab();
        zzlc();
        Preconditions.checkNotNull(zzeb);
        Preconditions.checkNotEmpty(zzeb.packageName);
        zzea zzbf = zzjh().zzbf(zzeb.packageName);
        String zzbs = this.zzacv.zzgj().zzbs(zzeb.packageName);
        if (zzbf == null) {
            zzbf = new zzea(this.zzacv, zzeb.packageName);
            zzbf.zzam(this.zzacv.zzfz().zzir());
            zzbf.zzao(zzbs);
        } else if (zzbs.equals(zzbf.zzgq())) {
            obj = null;
            if (!(TextUtils.isEmpty(zzeb.zzafa) || zzeb.zzafa.equals(zzbf.getGmpAppId()))) {
                zzbf.zzan(zzeb.zzafa);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(zzeb.zzafc) || zzeb.zzafc.equals(zzbf.zzgr()))) {
                zzbf.zzap(zzeb.zzafc);
                obj = 1;
            }
            if (!(zzeb.zzafi == 0 || zzeb.zzafi == zzbf.zzgw())) {
                zzbf.zzu(zzeb.zzafi);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(zzeb.zztg) || zzeb.zztg.equals(zzbf.zzag()))) {
                zzbf.setAppVersion(zzeb.zztg);
                obj = 1;
            }
            if (zzeb.zzafg != zzbf.zzgu()) {
                zzbf.zzt(zzeb.zzafg);
                obj = 1;
            }
            if (!(zzeb.zzafh == null || zzeb.zzafh.equals(zzbf.zzgv()))) {
                zzbf.zzaq(zzeb.zzafh);
                obj = 1;
            }
            if (zzeb.zzafj != zzbf.zzgx()) {
                zzbf.zzv(zzeb.zzafj);
                obj = 1;
            }
            if (zzeb.zzafk != zzbf.isMeasurementEnabled()) {
                zzbf.setMeasurementEnabled(zzeb.zzafk);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(zzeb.zzafy) || zzeb.zzafy.equals(zzbf.zzhi()))) {
                zzbf.zzar(zzeb.zzafy);
                obj = 1;
            }
            if (zzeb.zzafl != zzbf.zzhk()) {
                zzbf.zzaf(zzeb.zzafl);
                obj = 1;
            }
            if (zzeb.zzafm != zzbf.zzhl()) {
                zzbf.zzd(zzeb.zzafm);
                obj = 1;
            }
            if (zzeb.zzafn == zzbf.zzhm()) {
                zzbf.zze(zzeb.zzafn);
            } else {
                obj2 = obj;
            }
            if (obj2 != null) {
                zzjh().zza(zzbf);
            }
            return zzbf;
        } else {
            zzbf.zzao(zzbs);
            zzbf.zzam(this.zzacv.zzfz().zzir());
        }
        obj = 1;
        zzbf.zzan(zzeb.zzafa);
        obj = 1;
        zzbf.zzap(zzeb.zzafc);
        obj = 1;
        zzbf.zzu(zzeb.zzafi);
        obj = 1;
        zzbf.setAppVersion(zzeb.zztg);
        obj = 1;
        if (zzeb.zzafg != zzbf.zzgu()) {
        }
        zzbf.zzaq(zzeb.zzafh);
        obj = 1;
        if (zzeb.zzafj != zzbf.zzgx()) {
        }
        if (zzeb.zzafk != zzbf.isMeasurementEnabled()) {
        }
        zzbf.zzar(zzeb.zzafy);
        obj = 1;
        if (zzeb.zzafl != zzbf.zzhk()) {
        }
        if (zzeb.zzafm != zzbf.zzhl()) {
        }
        if (zzeb.zzafn == zzbf.zzhm()) {
        }
        if (obj2 != null) {
        }
        return zzbf;
    }

    public static zzjt zzg(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzarr == null) {
            synchronized (zzjt.class) {
                try {
                    if (zzarr == null) {
                        zzarr = new zzjt(new zzjy(context));
                    }
                } catch (Throwable th) {
                    while (true) {
                        Class cls = zzjt.class;
                    }
                }
            }
        }
        return zzarr;
    }

    private final zzgh zzky() {
        zza(this.zzars);
        return this.zzars;
    }

    private final zzfr zzla() {
        if (this.zzarv != null) {
            return this.zzarv;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzjp zzlb() {
        zza(this.zzarw);
        return this.zzarw;
    }

    private final long zzld() {
        long currentTimeMillis = this.zzacv.zzbt().currentTimeMillis();
        zzft zzgj = this.zzacv.zzgj();
        zzgj.zzch();
        zzgj.zzab();
        long j = zzgj.zzalx.get();
        if (j == 0) {
            j = 1 + ((long) zzgj.zzgg().zzlo().nextInt(86400000));
            zzgj.zzalx.set(j);
        }
        return ((((j + currentTimeMillis) / 1000) / 60) / 60) / 24;
    }

    private final boolean zzlf() {
        zzab();
        zzlc();
        return zzjh().zzia() || !TextUtils.isEmpty(zzjh().zzhv());
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private final void zzlg() {
        zzab();
        zzlc();
        if (zzlk()) {
            long abs;
            if (this.zzasa > 0) {
                abs = 3600000 - Math.abs(this.zzacv.zzbt().elapsedRealtime() - this.zzasa);
                if (abs > 0) {
                    this.zzacv.zzgi().zzjc().zzg("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                    zzla().unregister();
                    zzlb().cancel();
                    return;
                }
                this.zzasa = 0;
            }
            if (this.zzacv.zzkg() && zzlf()) {
                com.google.android.gms.internal.measurement.zzez.zza zza;
                long j;
                long currentTimeMillis = this.zzacv.zzbt().currentTimeMillis();
                long max = Math.max(0, ((Long) zzez.zzaje.get()).longValue());
                Object obj = (zzjh().zzib() || zzjh().zzhw()) ? 1 : null;
                if (obj != null) {
                    String zzhs = this.zzacv.zzgk().zzhs();
                    zza = (TextUtils.isEmpty(zzhs) || ".none.".equals(zzhs)) ? zzez.zzaiy : zzez.zzaiz;
                } else {
                    zza = zzez.zzaix;
                }
                long max2 = Math.max(0, ((Long) zza.get()).longValue());
                abs = this.zzacv.zzgj().zzalt.get();
                long j2 = this.zzacv.zzgj().zzalu.get();
                long max3 = Math.max(zzjh().zzhy(), zzjh().zzhz());
                if (max3 != 0) {
                    max3 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
                    j2 = currentTimeMillis - Math.abs(j2 - currentTimeMillis);
                    currentTimeMillis = Math.max(currentTimeMillis - Math.abs(abs - currentTimeMillis), j2);
                    abs = max3 + max;
                    if (obj != null && currentTimeMillis > 0) {
                        abs = Math.min(max3, currentTimeMillis) + max2;
                    }
                    if (!zzjf().zza(currentTimeMillis, max2)) {
                        abs = currentTimeMillis + max2;
                    }
                    if (j2 == 0 || j2 < max3) {
                        j = abs;
                        if (j == 0) {
                            this.zzacv.zzgi().zzjc().log("Next upload time is 0");
                            zzla().unregister();
                            zzlb().cancel();
                            return;
                        } else if (zzkz().zzex()) {
                            currentTimeMillis = this.zzacv.zzgj().zzalv.get();
                            abs = Math.max(0, ((Long) zzez.zzaiv.get()).longValue());
                            abs = !zzjf().zza(currentTimeMillis, abs) ? Math.max(j, abs + currentTimeMillis) : j;
                            zzla().unregister();
                            abs -= this.zzacv.zzbt().currentTimeMillis();
                            if (abs <= 0) {
                                abs = Math.max(0, ((Long) zzez.zzaja.get()).longValue());
                                this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
                            }
                            this.zzacv.zzgi().zzjc().zzg("Upload scheduled in approximately ms", Long.valueOf(abs));
                            zzlb().zzh(abs);
                            return;
                        } else {
                            this.zzacv.zzgi().zzjc().log("No network");
                            zzla().zzeu();
                            zzlb().cancel();
                            return;
                        }
                    }
                    int i = 0;
                    while (true) {
                        j = abs;
                        if (i >= Math.min(20, Math.max(0, ((Integer) zzez.zzajg.get()).intValue()))) {
                            break;
                        }
                        abs = (Math.max(0, ((Long) zzez.zzajf.get()).longValue()) * (1 << i)) + j;
                        if (abs > j2) {
                            j = abs;
                            break;
                        }
                        i++;
                    }
                    if (j == 0) {
                    }
                }
                j = 0;
                if (j == 0) {
                }
            } else {
                this.zzacv.zzgi().zzjc().log("Nothing to upload or uploading impossible");
                zzla().unregister();
                zzlb().cancel();
            }
        }
    }

    @WorkerThread
    private final void zzlh() {
        zzab();
        if (this.zzase || this.zzasf || this.zzasg) {
            this.zzacv.zzgi().zzjc().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzase), Boolean.valueOf(this.zzasf), Boolean.valueOf(this.zzasg));
            return;
        }
        this.zzacv.zzgi().zzjc().log("Stopping uploading service(s)");
        if (this.zzasb != null) {
            for (Runnable run : this.zzasb) {
                run.run();
            }
            this.zzasb.clear();
        }
    }

    @WorkerThread
    @VisibleForTesting
    private final boolean zzli() {
        Object e;
        zzfk zziv;
        String str;
        zzab();
        try {
            this.zzasi = new RandomAccessFile(new File(this.zzacv.getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzash = this.zzasi.tryLock();
            if (this.zzash != null) {
                this.zzacv.zzgi().zzjc().log("Storage concurrent access okay");
                return true;
            }
            this.zzacv.zzgi().zziv().log("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            e = e2;
            zziv = this.zzacv.zzgi().zziv();
            str = "Failed to acquire storage lock";
            zziv.zzg(str, e);
            return false;
        } catch (IOException e3) {
            e = e3;
            zziv = this.zzacv.zzgi().zziv();
            str = "Failed to access storage lock file";
            zziv.zzg(str, e);
            return false;
        }
    }

    @WorkerThread
    private final boolean zzlk() {
        zzab();
        zzlc();
        return this.zzarz;
    }

    public final Context getContext() {
        return this.zzacv.getContext();
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void start() {
        this.zzacv.zzgh().zzab();
        zzjh().zzhx();
        if (this.zzacv.zzgj().zzalt.get() == 0) {
            this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
        }
        zzlg();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzab();
        zzlc();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzasf = false;
                zzlh();
            }
        }
        List<Long> list = this.zzasj;
        this.zzasj = null;
        Object obj = 1;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
                this.zzacv.zzgj().zzalu.set(0);
                zzlg();
                this.zzacv.zzgi().zzjc().zze("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzjh().beginTransaction();
                try {
                    for (Long l : list) {
                        zzek zzjh;
                        try {
                            zzjh = zzjh();
                            long longValue = l.longValue();
                            zzjh.zzab();
                            zzjh.zzch();
                            if (zzjh.getWritableDatabase().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zzjh.zzgi().zziv().zzg("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.zzask == null || !this.zzask.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    zzjh().setTransactionSuccessful();
                    this.zzask = null;
                    if (zzkz().zzex() && zzlf()) {
                        zzle();
                    } else {
                        this.zzasl = -1;
                        zzlg();
                    }
                    this.zzasa = 0;
                } finally {
                    zzjh().endTransaction();
                }
            } catch (SQLiteException e3) {
                this.zzacv.zzgi().zziv().zzg("Database error while trying to delete uploaded bundles", e3);
                this.zzasa = this.zzacv.zzbt().elapsedRealtime();
                this.zzacv.zzgi().zzjc().zzg("Disable upload, time", Long.valueOf(this.zzasa));
            }
        } else {
            this.zzacv.zzgi().zzjc().zze("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzacv.zzgj().zzalu.set(this.zzacv.zzbt().currentTimeMillis());
            if (!(i == 503 || i == 429)) {
                obj = null;
            }
            if (obj != null) {
                this.zzacv.zzgj().zzalv.set(this.zzacv.zzbt().currentTimeMillis());
            }
            if (this.zzacv.zzgk().zzay(str)) {
                zzjh().zzc(list);
            }
            zzlg();
        }
        this.zzasf = false;
        zzlh();
    }

    @WorkerThread
    public final byte[] zza(@NonNull zzex zzex, @Size(min = 1) String str) {
        zzlc();
        zzab();
        this.zzacv.zzfu();
        Preconditions.checkNotNull(zzex);
        Preconditions.checkNotEmpty(str);
        zzacj zzkt = new zzkt();
        zzjh().beginTransaction();
        try {
            zzea zzbf = zzjh().zzbf(str);
            if (zzbf == null) {
                this.zzacv.zzgi().zzjb().zzg("Log and bundle not available. package_name", str);
            } else if (zzbf.isMeasurementEnabled()) {
                Long l;
                zzkc zzkc;
                zzkx zzkx;
                long j;
                if (("_iap".equals(zzex.name) || Event.ECOMMERCE_PURCHASE.equals(zzex.name)) && !zza(str, zzex)) {
                    this.zzacv.zzgi().zziy().zzg("Failed to handle purchase event at single event bundle creation. appId", zzfi.zzbp(str));
                }
                boolean zzaw = this.zzacv.zzgk().zzaw(str);
                Long valueOf = Long.valueOf(0);
                if (zzaw && "_e".equals(zzex.name)) {
                    zzfk zziy;
                    String str2;
                    Object zzbp;
                    if (zzex.zzahg == null || zzex.zzahg.size() == 0) {
                        zziy = this.zzacv.zzgi().zziy();
                        str2 = "The engagement event does not contain any parameters. appId";
                        zzbp = zzfi.zzbp(str);
                    } else if (zzex.zzahg.getLong("_et") == null) {
                        zziy = this.zzacv.zzgi().zziy();
                        str2 = "The engagement event does not include duration. appId";
                        zzbp = zzfi.zzbp(str);
                    } else {
                        l = zzex.zzahg.getLong("_et");
                    }
                    zziy.zzg(str2, zzbp);
                    l = valueOf;
                } else {
                    l = valueOf;
                }
                zzku zzku = new zzku();
                zzkt.zzavf = new zzku[]{zzku};
                zzku.zzavh = Integer.valueOf(1);
                zzku.zzavp = "android";
                zzku.zzth = zzbf.zzah();
                zzku.zzafh = zzbf.zzgv();
                zzku.zztg = zzbf.zzag();
                long zzgu = zzbf.zzgu();
                zzku.zzawb = zzgu == -2147483648L ? null : Integer.valueOf((int) zzgu);
                zzku.zzavt = Long.valueOf(zzbf.zzgw());
                zzku.zzafa = zzbf.getGmpAppId();
                zzku.zzavx = Long.valueOf(zzbf.zzgx());
                if (this.zzacv.isEnabled() && zzeh.zzht() && this.zzacv.zzgk().zzau(zzku.zzth)) {
                    zzku.zzawh = null;
                }
                Pair zzbr = this.zzacv.zzgj().zzbr(zzbf.zzah());
                if (!(!zzbf.zzhl() || zzbr == null || TextUtils.isEmpty((CharSequence) zzbr.first))) {
                    zzku.zzavv = (String) zzbr.first;
                    zzku.zzavw = (Boolean) zzbr.second;
                }
                this.zzacv.zzge().zzch();
                zzku.zzavr = Build.MODEL;
                this.zzacv.zzge().zzch();
                zzku.zzavq = VERSION.RELEASE;
                zzku.zzavs = Integer.valueOf((int) this.zzacv.zzge().zzik());
                zzku.zzahd = this.zzacv.zzge().zzil();
                zzku.zzaez = zzbf.getAppInstanceId();
                zzku.zzafc = zzbf.zzgr();
                List zzbe = zzjh().zzbe(zzbf.zzah());
                zzku.zzavj = new zzkx[zzbe.size()];
                if (zzaw) {
                    zzkc zzh = zzjh().zzh(zzku.zzth, "_lte");
                    zzkc = (zzh == null || zzh.value == null) ? new zzkc(zzku.zzth, "auto", "_lte", this.zzacv.zzbt().currentTimeMillis(), l) : l.longValue() > 0 ? new zzkc(zzku.zzth, "auto", "_lte", this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(((Long) zzh.value).longValue() + l.longValue())) : zzh;
                } else {
                    zzkc = null;
                }
                zzkx zzkx2 = null;
                for (int i = 0; i < zzbe.size(); i++) {
                    zzkx zzkx3;
                    zzkx = new zzkx();
                    zzku.zzavj[i] = zzkx;
                    zzkx.name = ((zzkc) zzbe.get(i)).name;
                    zzkx.zzaws = Long.valueOf(((zzkc) zzbe.get(i)).zzast);
                    zzjf().zza(zzkx, ((zzkc) zzbe.get(i)).value);
                    if (zzaw && "_lte".equals(zzkx.name)) {
                        zzkx.zzave = (Long) zzkc.value;
                        zzkx.zzaws = Long.valueOf(this.zzacv.zzbt().currentTimeMillis());
                        zzkx3 = zzkx;
                    } else {
                        zzkx3 = zzkx2;
                    }
                    zzkx2 = zzkx3;
                }
                if (zzaw && zzkx2 == null) {
                    zzkx = new zzkx();
                    zzkx.name = "_lte";
                    zzkx.zzaws = Long.valueOf(this.zzacv.zzbt().currentTimeMillis());
                    zzkx.zzave = (Long) zzkc.value;
                    zzku.zzavj = (zzkx[]) Arrays.copyOf(zzku.zzavj, zzku.zzavj.length + 1);
                    zzku.zzavj[zzku.zzavj.length - 1] = zzkx;
                }
                if (l.longValue() > 0) {
                    zzjh().zza(zzkc);
                }
                Bundle zzin = zzex.zzahg.zzin();
                if ("_iap".equals(zzex.name)) {
                    zzin.putLong("_c", 1);
                    this.zzacv.zzgi().zzjb().log("Marking in-app purchase as real-time");
                    zzin.putLong("_r", 1);
                }
                zzin.putString("_o", zzex.origin);
                if (this.zzacv.zzgg().zzcn(zzku.zzth)) {
                    this.zzacv.zzgg().zza(zzin, "_dbg", Long.valueOf(1));
                    this.zzacv.zzgg().zza(zzin, "_r", Long.valueOf(1));
                }
                zzet zzf = zzjh().zzf(str, zzex.name);
                if (zzf == null) {
                    zzjh().zza(new zzet(str, zzex.name, 1, 0, zzex.zzahr, 0, null, null, null));
                    j = 0;
                } else {
                    j = zzf.zzahj;
                    zzjh().zza(zzf.zzah(zzex.zzahr).zzim());
                }
                zzes zzes = new zzes(this.zzacv, zzex.origin, str, zzex.name, zzex.zzahr, j, zzin);
                zzkr zzkr = new zzkr();
                zzku.zzavi = new zzkr[]{zzkr};
                zzkr.zzavb = Long.valueOf(zzes.timestamp);
                zzkr.name = zzes.name;
                zzkr.zzavc = Long.valueOf(zzes.zzahf);
                zzkr.zzava = new zzks[zzes.zzahg.size()];
                Iterator it = zzes.zzahg.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    zzks zzks = new zzks();
                    zzkr.zzava[i2] = zzks;
                    zzks.name = str3;
                    zzjf().zza(zzks, zzes.zzahg.get(str3));
                    i2++;
                }
                zzku.zzawa = zza(zzbf.zzah(), zzku.zzavj, zzku.zzavi);
                zzku.zzavl = zzkr.zzavb;
                zzku.zzavm = zzkr.zzavb;
                zzgu = zzbf.zzgt();
                zzku.zzavo = zzgu != 0 ? Long.valueOf(zzgu) : null;
                long zzgs = zzbf.zzgs();
                if (zzgs != 0) {
                    zzgu = zzgs;
                }
                zzku.zzavn = zzgu != 0 ? Long.valueOf(zzgu) : null;
                zzbf.zzhb();
                zzku.zzavy = Integer.valueOf((int) zzbf.zzgy());
                zzku.zzavu = Long.valueOf(this.zzacv.zzgk().zzgw());
                zzku.zzavk = Long.valueOf(this.zzacv.zzbt().currentTimeMillis());
                zzku.zzavz = Boolean.TRUE;
                zzbf.zzr(zzku.zzavl.longValue());
                zzbf.zzs(zzku.zzavm.longValue());
                zzjh().zza(zzbf);
                zzjh().setTransactionSuccessful();
                zzjh().endTransaction();
                try {
                    byte[] bArr = new byte[zzkt.zzwb()];
                    zzacb zzb = zzacb.zzb(bArr, 0, bArr.length);
                    zzkt.zza(zzb);
                    zzb.zzvt();
                    return zzjf().zzb(bArr);
                } catch (IOException e) {
                    this.zzacv.zzgi().zziv().zze("Data loss. Failed to bundle and serialize. appId", zzfi.zzbp(str), e);
                    return null;
                }
            } else {
                this.zzacv.zzgi().zzjb().zzg("Log and bundle disabled. package_name", str);
            }
            zzjh().endTransaction();
            return new byte[0];
        } catch (Throwable th) {
            zzjh().endTransaction();
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzb(zzef zzef, zzeb zzeb) {
        boolean z = true;
        Preconditions.checkNotNull(zzef);
        Preconditions.checkNotEmpty(zzef.packageName);
        Preconditions.checkNotNull(zzef.origin);
        Preconditions.checkNotNull(zzef.zzage);
        Preconditions.checkNotEmpty(zzef.zzage.name);
        zzab();
        zzlc();
        if (!TextUtils.isEmpty(zzeb.zzafa)) {
            if (zzeb.zzafk) {
                zzef zzef2 = new zzef(zzef);
                zzef2.active = false;
                zzjh().beginTransaction();
                try {
                    Object obj;
                    zzfk zzjb;
                    String str;
                    Object obj2;
                    Object value;
                    zzef zzi = zzjh().zzi(zzef2.packageName, zzef2.zzage.name);
                    if (!(zzi == null || zzi.origin.equals(zzef2.origin))) {
                        this.zzacv.zzgi().zziy().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzacv.zzgf().zzbo(zzef2.zzage.name), zzef2.origin, zzi.origin);
                    }
                    if (zzi != null && zzi.active) {
                        zzef2.origin = zzi.origin;
                        zzef2.creationTimestamp = zzi.creationTimestamp;
                        zzef2.triggerTimeout = zzi.triggerTimeout;
                        zzef2.triggerEventName = zzi.triggerEventName;
                        zzef2.zzagg = zzi.zzagg;
                        zzef2.active = zzi.active;
                        zzef2.zzage = new zzka(zzef2.zzage.name, zzi.zzage.zzast, zzef2.zzage.getValue(), zzi.zzage.origin);
                        z = false;
                    } else if (TextUtils.isEmpty(zzef2.triggerEventName)) {
                        zzef2.zzage = new zzka(zzef2.zzage.name, zzef2.creationTimestamp, zzef2.zzage.getValue(), zzef2.zzage.origin);
                        zzef2.active = true;
                    } else {
                        z = false;
                    }
                    if (zzef2.active) {
                        zzfk zzjb2;
                        String str2;
                        Object zzbo;
                        Object obj3;
                        zzka zzka = zzef2.zzage;
                        zzkc zzkc = new zzkc(zzef2.packageName, zzef2.origin, zzka.name, zzka.zzast, zzka.getValue());
                        if (zzjh().zza(zzkc)) {
                            zzjb2 = this.zzacv.zzgi().zzjb();
                            str2 = "User property updated immediately";
                            obj = zzef2.packageName;
                            zzbo = this.zzacv.zzgf().zzbo(zzkc.name);
                            obj3 = zzkc.value;
                        } else {
                            zzjb2 = this.zzacv.zzgi().zziv();
                            str2 = "(2)Too many active user properties, ignoring";
                            obj = zzfi.zzbp(zzef2.packageName);
                            zzbo = this.zzacv.zzgf().zzbo(zzkc.name);
                            obj3 = zzkc.value;
                        }
                        zzjb2.zzd(str2, obj, zzbo, obj3);
                        if (z && zzef2.zzagg != null) {
                            zzc(new zzex(zzef2.zzagg, zzef2.creationTimestamp), zzeb);
                        }
                    }
                    if (zzjh().zza(zzef2)) {
                        zzjb = this.zzacv.zzgi().zzjb();
                        str = "Conditional property added";
                        obj2 = zzef2.packageName;
                        obj = this.zzacv.zzgf().zzbo(zzef2.zzage.name);
                        value = zzef2.zzage.getValue();
                    } else {
                        zzjb = this.zzacv.zzgi().zziv();
                        str = "Too many conditional properties, ignoring";
                        obj2 = zzfi.zzbp(zzef2.packageName);
                        obj = this.zzacv.zzgf().zzbo(zzef2.zzage.name);
                        value = zzef2.zzage.getValue();
                    }
                    zzjb.zzd(str, obj2, obj, value);
                    zzjh().setTransactionSuccessful();
                } finally {
                    zzjh().endTransaction();
                }
            } else {
                zzg(zzeb);
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzb(zzex zzex, zzeb zzeb) {
        Preconditions.checkNotNull(zzeb);
        Preconditions.checkNotEmpty(zzeb.packageName);
        zzab();
        zzlc();
        String str = zzeb.packageName;
        long j = zzex.zzahr;
        if (!zzjf().zzd(zzex, zzeb)) {
            return;
        }
        if (zzeb.zzafk) {
            zzjh().beginTransaction();
            try {
                List emptyList;
                Object obj;
                zzek zzjh = zzjh();
                Preconditions.checkNotEmpty(str);
                zzjh.zzab();
                zzjh.zzch();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    zzjh.zzgi().zziy().zze("Invalid time querying timed out conditional properties", zzfi.zzbp(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = zzjh.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzef zzef : emptyList) {
                    if (zzef != null) {
                        this.zzacv.zzgi().zzjb().zzd("User property timed out", zzef.packageName, this.zzacv.zzgf().zzbo(zzef.zzage.name), zzef.zzage.getValue());
                        if (zzef.zzagf != null) {
                            zzc(new zzex(zzef.zzagf, j), zzeb);
                        }
                        zzjh().zzj(str, zzef.zzage.name);
                    }
                }
                zzjh = zzjh();
                Preconditions.checkNotEmpty(str);
                zzjh.zzab();
                zzjh.zzch();
                if (i < 0) {
                    zzjh.zzgi().zziy().zze("Invalid time querying expired conditional properties", zzfi.zzbp(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = zzjh.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(r2.size());
                for (zzef zzef2 : r2) {
                    if (zzef2 != null) {
                        this.zzacv.zzgi().zzjb().zzd("User property expired", zzef2.packageName, this.zzacv.zzgf().zzbo(zzef2.zzage.name), zzef2.zzage.getValue());
                        zzjh().zzg(str, zzef2.zzage.name);
                        if (zzef2.zzagh != null) {
                            arrayList.add(zzef2.zzagh);
                        }
                        zzjh().zzj(str, zzef2.zzage.name);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    obj = arrayList2.get(i2);
                    i2++;
                    zzc(new zzex((zzex) obj, j), zzeb);
                }
                zzjh = zzjh();
                String str2 = zzex.name;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zzjh.zzab();
                zzjh.zzch();
                if (i < 0) {
                    zzjh.zzgi().zziy().zzd("Invalid time querying triggered conditional properties", zzfi.zzbp(str), zzjh.zzgf().zzbm(str2), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = zzjh.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(r2.size());
                for (zzef zzef3 : r2) {
                    if (zzef3 != null) {
                        zzfk zzjb;
                        String str3;
                        Object obj2;
                        Object zzbo;
                        zzka zzka = zzef3.zzage;
                        zzkc zzkc = new zzkc(zzef3.packageName, zzef3.origin, zzka.name, j, zzka.getValue());
                        if (zzjh().zza(zzkc)) {
                            zzjb = this.zzacv.zzgi().zzjb();
                            str3 = "User property triggered";
                            obj2 = zzef3.packageName;
                            zzbo = this.zzacv.zzgf().zzbo(zzkc.name);
                            obj = zzkc.value;
                        } else {
                            zzjb = this.zzacv.zzgi().zziv();
                            str3 = "Too many active user properties, ignoring";
                            obj2 = zzfi.zzbp(zzef3.packageName);
                            zzbo = this.zzacv.zzgf().zzbo(zzkc.name);
                            obj = zzkc.value;
                        }
                        zzjb.zzd(str3, obj2, zzbo, obj);
                        if (zzef3.zzagg != null) {
                            arrayList3.add(zzef3.zzagg);
                        }
                        zzef3.zzage = new zzka(zzkc);
                        zzef3.active = true;
                        zzjh().zza(zzef3);
                    }
                }
                zzc(zzex, zzeb);
                arrayList2 = arrayList3;
                int size2 = arrayList2.size();
                i2 = 0;
                while (i2 < size2) {
                    obj = arrayList2.get(i2);
                    i2++;
                    zzc(new zzex((zzex) obj, j), zzeb);
                }
                zzjh().setTransactionSuccessful();
            } finally {
                zzjh().endTransaction();
            }
        } else {
            zzg(zzeb);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzjs zzjs) {
        this.zzasc++;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzb(zzka zzka, zzeb zzeb) {
        int i = 0;
        zzab();
        zzlc();
        if (!TextUtils.isEmpty(zzeb.zzafa)) {
            if (zzeb.zzafk) {
                int zzcj = this.zzacv.zzgg().zzcj(zzka.name);
                String zza;
                if (zzcj != 0) {
                    this.zzacv.zzgg();
                    zza = zzkd.zza(zzka.name, 24, true);
                    if (zzka.name != null) {
                        i = zzka.name.length();
                    }
                    this.zzacv.zzgg().zza(zzeb.packageName, zzcj, "_ev", zza, i);
                    return;
                }
                zzcj = this.zzacv.zzgg().zzi(zzka.name, zzka.getValue());
                if (zzcj != 0) {
                    this.zzacv.zzgg();
                    zza = zzkd.zza(zzka.name, 24, true);
                    Object value = zzka.getValue();
                    if (value != null && ((value instanceof String) || (value instanceof CharSequence))) {
                        i = String.valueOf(value).length();
                    }
                    this.zzacv.zzgg().zza(zzeb.packageName, zzcj, "_ev", zza, i);
                    return;
                }
                Object zzj = this.zzacv.zzgg().zzj(zzka.name, zzka.getValue());
                if (zzj != null) {
                    zzkc zzkc = new zzkc(zzeb.packageName, zzka.origin, zzka.name, zzka.zzast, zzj);
                    this.zzacv.zzgi().zzjb().zze("Setting user property", this.zzacv.zzgf().zzbo(zzkc.name), zzj);
                    zzjh().beginTransaction();
                    try {
                        zzg(zzeb);
                        boolean zza2 = zzjh().zza(zzkc);
                        zzjh().setTransactionSuccessful();
                        if (zza2) {
                            this.zzacv.zzgi().zzjb().zze("User property set", this.zzacv.zzgf().zzbo(zzkc.name), zzkc.value);
                        } else {
                            this.zzacv.zzgi().zziv().zze("Too many unique user properties are set. Ignoring user property", this.zzacv.zzgf().zzbo(zzkc.name), zzkc.value);
                            this.zzacv.zzgg().zza(zzeb.packageName, 9, null, null, 0);
                        }
                        zzjh().endTransaction();
                        return;
                    } catch (Throwable th) {
                        zzjh().endTransaction();
                    }
                } else {
                    return;
                }
            }
            zzg(zzeb);
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final void zzb(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        zzek zzjh;
        boolean z = true;
        zzab();
        zzlc();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzase = false;
                zzlh();
            }
        }
        this.zzacv.zzgi().zzjc().zzg("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        zzjh().beginTransaction();
        zzea zzbf = zzjh().zzbf(str);
        boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
        if (zzbf == null) {
            this.zzacv.zzgi().zziy().zzg("App does not exist in onConfigFetched. appId", zzfi.zzbp(str));
        } else {
            if (z2 || i == 404) {
                List list = map != null ? (List) map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
                if (i == 404 || i == 304) {
                    if (zzky().zzbx(str) == null && !zzky().zza(str, null, null)) {
                        zzjh = zzjh();
                        zzjh.endTransaction();
                        this.zzase = false;
                        zzlh();
                    }
                } else if (!zzky().zza(str, bArr, str2)) {
                    zzjh = zzjh();
                    zzjh.endTransaction();
                    this.zzase = false;
                    zzlh();
                }
                zzbf.zzx(this.zzacv.zzbt().currentTimeMillis());
                zzjh().zza(zzbf);
                if (i == 404) {
                    this.zzacv.zzgi().zziz().zzg("Config not found. Using empty config. appId", str);
                } else {
                    this.zzacv.zzgi().zzjc().zze("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (zzkz().zzex() && zzlf()) {
                    zzle();
                }
            } else {
                zzbf.zzy(this.zzacv.zzbt().currentTimeMillis());
                zzjh().zza(zzbf);
                this.zzacv.zzgi().zzjc().zze("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzky().zzbz(str);
                this.zzacv.zzgj().zzalu.set(this.zzacv.zzbt().currentTimeMillis());
                if (!(i == 503 || i == 429)) {
                    z = false;
                }
                if (z) {
                    this.zzacv.zzgj().zzalv.set(this.zzacv.zzbt().currentTimeMillis());
                }
            }
            zzlg();
        }
        zzjh().setTransactionSuccessful();
        zzjh = zzjh();
        zzjh.endTransaction();
        this.zzase = false;
        zzlh();
    }

    public final Clock zzbt() {
        return this.zzacv.zzbt();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzc(zzef zzef, zzeb zzeb) {
        Preconditions.checkNotNull(zzef);
        Preconditions.checkNotEmpty(zzef.packageName);
        Preconditions.checkNotNull(zzef.zzage);
        Preconditions.checkNotEmpty(zzef.zzage.name);
        zzab();
        zzlc();
        if (!TextUtils.isEmpty(zzeb.zzafa)) {
            if (zzeb.zzafk) {
                zzjh().beginTransaction();
                try {
                    zzg(zzeb);
                    zzef zzi = zzjh().zzi(zzef.packageName, zzef.zzage.name);
                    if (zzi != null) {
                        this.zzacv.zzgi().zzjb().zze("Removing conditional user property", zzef.packageName, this.zzacv.zzgf().zzbo(zzef.zzage.name));
                        zzjh().zzj(zzef.packageName, zzef.zzage.name);
                        if (zzi.active) {
                            zzjh().zzg(zzef.packageName, zzef.zzage.name);
                        }
                        if (zzef.zzagh != null) {
                            Bundle bundle = null;
                            if (zzef.zzagh.zzahg != null) {
                                bundle = zzef.zzagh.zzahg.zzin();
                            }
                            zzc(this.zzacv.zzgg().zza(zzef.packageName, zzef.zzagh.name, bundle, zzi.origin, zzef.zzagh.zzahr, true, false), zzeb);
                        }
                    } else {
                        this.zzacv.zzgi().zziy().zze("Conditional user property doesn't exist", zzfi.zzbp(zzef.packageName), this.zzacv.zzgf().zzbo(zzef.zzage.name));
                    }
                    zzjh().setTransactionSuccessful();
                } finally {
                    zzjh().endTransaction();
                }
            } else {
                zzg(zzeb);
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzc(zzex zzex, String str) {
        zzea zzbf = zzjh().zzbf(str);
        if (zzbf == null || TextUtils.isEmpty(zzbf.zzag())) {
            this.zzacv.zzgi().zzjb().zzg("No app data available; dropping event", str);
            return;
        }
        Boolean zzc = zzc(zzbf);
        if (zzc == null) {
            if (!"_ui".equals(zzex.name)) {
                this.zzacv.zzgi().zziy().zzg("Could not find package. appId", zzfi.zzbp(str));
            }
        } else if (!zzc.booleanValue()) {
            this.zzacv.zzgi().zziv().zzg("App version does not match; dropping event. appId", zzfi.zzbp(str));
            return;
        }
        zzex zzex2 = zzex;
        zzb(zzex2, new zzeb(str, zzbf.getGmpAppId(), zzbf.zzag(), zzbf.zzgu(), zzbf.zzgv(), zzbf.zzgw(), zzbf.zzgx(), null, zzbf.isMeasurementEnabled(), false, zzbf.zzgr(), zzbf.zzhk(), 0, 0, zzbf.zzhl(), zzbf.zzhm(), false));
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzc(zzka zzka, zzeb zzeb) {
        zzab();
        zzlc();
        if (!TextUtils.isEmpty(zzeb.zzafa)) {
            if (zzeb.zzafk) {
                this.zzacv.zzgi().zzjb().zzg("Removing user property", this.zzacv.zzgf().zzbo(zzka.name));
                zzjh().beginTransaction();
                try {
                    zzg(zzeb);
                    zzjh().zzg(zzeb.packageName, zzka.name);
                    zzjh().setTransactionSuccessful();
                    this.zzacv.zzgi().zzjb().zzg("User property removed", this.zzacv.zzgf().zzbo(zzka.name));
                } finally {
                    zzjh().endTransaction();
                }
            } else {
                zzg(zzeb);
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final void zzd(zzeb zzeb) {
        if (this.zzasj != null) {
            this.zzask = new ArrayList();
            this.zzask.addAll(this.zzasj);
        }
        zzek zzjh = zzjh();
        String str = zzeb.packageName;
        Preconditions.checkNotEmpty(str);
        zzjh.zzab();
        zzjh.zzch();
        try {
            SQLiteDatabase writableDatabase = zzjh.getWritableDatabase();
            String[] strArr = new String[1];
            strArr[0] = str;
            int delete = writableDatabase.delete("main_event_params", "app_id=?", strArr) + ((((((((writableDatabase.delete("apps", "app_id=?", strArr) + 0) + writableDatabase.delete("events", "app_id=?", strArr)) + writableDatabase.delete("user_attributes", "app_id=?", strArr)) + writableDatabase.delete("conditional_properties", "app_id=?", strArr)) + writableDatabase.delete("raw_events", "app_id=?", strArr)) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr)) + writableDatabase.delete("queue", "app_id=?", strArr)) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr));
            if (delete > 0) {
                zzjh.zzgi().zzjc().zze("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzjh.zzgi().zziv().zze("Error resetting analytics data. appId, error", zzfi.zzbp(str), e);
        }
        zzeb zza = zza(this.zzacv.getContext(), zzeb.packageName, zzeb.zzafa, zzeb.zzafk, zzeb.zzafm, zzeb.zzafn, zzeb.zzaga);
        if (!this.zzacv.zzgk().zzbc(zzeb.packageName) || zzeb.zzafk) {
            zzf(zza);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zze(zzeb zzeb) {
        zzab();
        zzlc();
        Preconditions.checkNotEmpty(zzeb.packageName);
        zzg(zzeb);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zze(zzef zzef) {
        zzeb zzce = zzce(zzef.packageName);
        if (zzce != null) {
            zzb(zzef, zzce);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03b8 A:{Catch:{ SQLiteException -> 0x0273, all -> 0x0287 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018c A:{Catch:{ SQLiteException -> 0x0273, all -> 0x0287 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final void zzf(zzeb zzeb) {
        zzab();
        zzlc();
        Preconditions.checkNotNull(zzeb);
        Preconditions.checkNotEmpty(zzeb.packageName);
        if (!TextUtils.isEmpty(zzeb.zzafa)) {
            zzea zzbf = zzjh().zzbf(zzeb.packageName);
            if (!(zzbf == null || !TextUtils.isEmpty(zzbf.getGmpAppId()) || TextUtils.isEmpty(zzeb.zzafa))) {
                zzbf.zzx(0);
                zzjh().zza(zzbf);
                zzky().zzca(zzeb.packageName);
            }
            if (zzeb.zzafk) {
                int i;
                Bundle bundle;
                zzex zzex;
                zzek zzjh;
                String str;
                String str2;
                zzet zzet;
                long j = zzeb.zzaga;
                if (j == 0) {
                    j = this.zzacv.zzbt().currentTimeMillis();
                }
                int i2 = zzeb.zzagb;
                if (i2 == 0 || i2 == 1) {
                    i = i2;
                } else {
                    this.zzacv.zzgi().zziy().zze("Incorrect app type, assuming installed app. appId, appType", zzfi.zzbp(zzeb.packageName), Integer.valueOf(i2));
                    i = 0;
                }
                zzjh().beginTransaction();
                zzbf = zzjh().zzbf(zzeb.packageName);
                if (!(zzbf == null || zzbf.getGmpAppId() == null || zzbf.getGmpAppId().equals(zzeb.zzafa))) {
                    this.zzacv.zzgi().zziy().zzg("New GMP App Id passed in. Removing cached database data. appId", zzfi.zzbp(zzbf.zzah()));
                    zzek zzjh2 = zzjh();
                    String zzah = zzbf.zzah();
                    zzjh2.zzch();
                    zzjh2.zzab();
                    Preconditions.checkNotEmpty(zzah);
                    try {
                        SQLiteDatabase writableDatabase = zzjh2.getWritableDatabase();
                        String[] strArr = new String[1];
                        strArr[0] = zzah;
                        i2 = writableDatabase.delete("audience_filter_values", "app_id=?", strArr) + ((((((((writableDatabase.delete("events", "app_id=?", strArr) + 0) + writableDatabase.delete("user_attributes", "app_id=?", strArr)) + writableDatabase.delete("conditional_properties", "app_id=?", strArr)) + writableDatabase.delete("apps", "app_id=?", strArr)) + writableDatabase.delete("raw_events", "app_id=?", strArr)) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr)) + writableDatabase.delete("event_filters", "app_id=?", strArr)) + writableDatabase.delete("property_filters", "app_id=?", strArr));
                        if (i2 > 0) {
                            zzjh2.zzgi().zzjc().zze("Deleted application data. app, records", zzah, Integer.valueOf(i2));
                        }
                    } catch (SQLiteException e) {
                        zzjh2.zzgi().zziv().zze("Error deleting application data. appId, error", zzfi.zzbp(zzah), e);
                    } catch (Throwable th) {
                        zzjh().endTransaction();
                    }
                    zzbf = null;
                }
                if (zzbf != null) {
                    if (zzbf.zzgu() != -2147483648L) {
                        if (zzbf.zzgu() != zzeb.zzafg) {
                            bundle = new Bundle();
                            bundle.putString("_pv", zzbf.zzag());
                            zzex = new zzex("_au", new zzeu(bundle), "auto", j);
                        }
                    } else if (!(zzbf.zzag() == null || zzbf.zzag().equals(zzeb.zztg))) {
                        bundle = new Bundle();
                        bundle.putString("_pv", zzbf.zzag());
                        zzex = new zzex("_au", new zzeu(bundle), "auto", j);
                    }
                    zzb(zzex, zzeb);
                }
                zzg(zzeb);
                if (i == 0) {
                    zzjh = zzjh();
                    str = zzeb.packageName;
                    str2 = "_f";
                } else if (i == 1) {
                    zzjh = zzjh();
                    str = zzeb.packageName;
                    str2 = "_v";
                } else {
                    zzet = null;
                    if (zzet != null) {
                        long j2 = ((j / 3600000) + 1) * 3600000;
                        if (i == 0) {
                            zzb(new zzka("_fot", j, Long.valueOf(j2), "auto"), zzeb);
                            zzab();
                            zzlc();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1);
                            bundle2.putLong("_r", 1);
                            bundle2.putLong("_uwa", 0);
                            bundle2.putLong("_pfo", 0);
                            bundle2.putLong("_sys", 0);
                            bundle2.putLong("_sysu", 0);
                            if (this.zzacv.zzgk().zzbc(zzeb.packageName) && zzeb.zzagc) {
                                bundle2.putLong("_dac", 1);
                            }
                            if (this.zzacv.getContext().getPackageManager() == null) {
                                this.zzacv.zzgi().zziv().zzg("PackageManager is null, first open report might be inaccurate. appId", zzfi.zzbp(zzeb.packageName));
                            } else {
                                PackageInfo packageInfo;
                                ApplicationInfo applicationInfo;
                                try {
                                    packageInfo = Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(zzeb.packageName, 0);
                                } catch (NameNotFoundException e2) {
                                    this.zzacv.zzgi().zziv().zze("Package info is null, first open report might be inaccurate. appId", zzfi.zzbp(zzeb.packageName), e2);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    if (packageInfo.firstInstallTime != 0) {
                                        Object obj;
                                        if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                            bundle2.putLong("_uwa", 1);
                                            obj = null;
                                        } else {
                                            obj = 1;
                                        }
                                        zzb(new zzka("_fi", j, Long.valueOf(obj != null ? 1 : 0), "auto"), zzeb);
                                    }
                                }
                                try {
                                    applicationInfo = Wrappers.packageManager(this.zzacv.getContext()).getApplicationInfo(zzeb.packageName, 0);
                                } catch (NameNotFoundException e22) {
                                    this.zzacv.zzgi().zziv().zze("Application info is null, first open report might be inaccurate. appId", zzfi.zzbp(zzeb.packageName), e22);
                                    applicationInfo = null;
                                }
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & 1) != 0) {
                                        bundle2.putLong("_sys", 1);
                                    }
                                    if ((applicationInfo.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", 1);
                                    }
                                }
                            }
                            zzek zzjh3 = zzjh();
                            str = zzeb.packageName;
                            Preconditions.checkNotEmpty(str);
                            zzjh3.zzab();
                            zzjh3.zzch();
                            j2 = zzjh3.zzm(str, "first_open_count");
                            if (j2 >= 0) {
                                bundle2.putLong("_pfo", j2);
                            }
                            zzb(new zzex("_f", new zzeu(bundle2), "auto", j), zzeb);
                        } else if (i == 1) {
                            zzb(new zzka("_fvt", j, Long.valueOf(j2), "auto"), zzeb);
                            zzab();
                            zzlc();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1);
                            bundle.putLong("_r", 1);
                            if (this.zzacv.zzgk().zzbc(zzeb.packageName) && zzeb.zzagc) {
                                bundle.putLong("_dac", 1);
                            }
                            zzb(new zzex("_v", new zzeu(bundle), "auto", j), zzeb);
                        }
                        bundle = new Bundle();
                        bundle.putLong("_et", 1);
                        zzex = new zzex("_e", new zzeu(bundle), "auto", j);
                    } else {
                        if (zzeb.zzafz) {
                            zzex = new zzex("_cd", new zzeu(new Bundle()), "auto", j);
                        }
                        zzjh().setTransactionSuccessful();
                        zzjh().endTransaction();
                        return;
                    }
                    zzb(zzex, zzeb);
                    zzjh().setTransactionSuccessful();
                    zzjh().endTransaction();
                    return;
                }
                zzet = zzjh.zzf(str, str2);
                if (zzet != null) {
                }
                zzb(zzex, zzeb);
                zzjh().setTransactionSuccessful();
                zzjh().endTransaction();
                return;
            }
            zzg(zzeb);
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzf(zzef zzef) {
        zzeb zzce = zzce(zzef.packageName);
        if (zzce != null) {
            zzc(zzef, zzce);
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzg(Runnable runnable) {
        zzab();
        if (this.zzasb == null) {
            this.zzasb = new ArrayList();
        }
        this.zzasb.add(runnable);
    }

    public final zzfg zzgf() {
        return this.zzacv.zzgf();
    }

    public final zzkd zzgg() {
        return this.zzacv.zzgg();
    }

    public final zzgi zzgh() {
        return this.zzacv.zzgh();
    }

    public final zzfi zzgi() {
        return this.zzacv.zzgi();
    }

    public final zzeh zzgk() {
        return this.zzacv.zzgk();
    }

    public final zzee zzgl() {
        return this.zzacv.zzgl();
    }

    /* Access modifiers changed, original: final */
    public final String zzh(zzeb zzeb) {
        try {
            return (String) this.zzacv.zzgh().zzb(new zzjx(this, zzeb)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzacv.zzgi().zziv().zze("Failed to get app instance id. appId", zzfi.zzbp(zzeb.packageName), e);
            return null;
        }
    }

    public final zzjz zzjf() {
        zza(this.zzary);
        return this.zzary;
    }

    public final zzed zzjg() {
        zza(this.zzarx);
        return this.zzarx;
    }

    public final zzek zzjh() {
        zza(this.zzaru);
        return this.zzaru;
    }

    public final zzfm zzkz() {
        zza(this.zzart);
        return this.zzart;
    }

    /* Access modifiers changed, original: final */
    public final void zzlc() {
        if (!this.zzvn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzle() {
        zzab();
        zzlc();
        this.zzasg = true;
        String zzhv;
        String str;
        try {
            zzfk zziy;
            String str2;
            this.zzacv.zzgl();
            Boolean zzkr = this.zzacv.zzga().zzkr();
            if (zzkr == null) {
                zziy = this.zzacv.zzgi().zziy();
                str2 = "Upload data called on the client side before use of service was decided";
            } else if (zzkr.booleanValue()) {
                zziy = this.zzacv.zzgi().zziv();
                str2 = "Upload called in the client side when service should be used";
            } else {
                if (this.zzasa <= 0) {
                    zzab();
                    if (this.zzasj != null) {
                        zziy = this.zzacv.zzgi().zzjc();
                        str2 = "Uploading requested multiple times";
                    } else if (zzkz().zzex()) {
                        long currentTimeMillis = this.zzacv.zzbt().currentTimeMillis();
                        zzd(null, currentTimeMillis - zzeh.zzhr());
                        long j = this.zzacv.zzgj().zzalt.get();
                        if (j != 0) {
                            this.zzacv.zzgi().zzjb().zzg("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - j)));
                        }
                        zzhv = zzjh().zzhv();
                        if (TextUtils.isEmpty(zzhv)) {
                            this.zzasl = -1;
                            str2 = zzjh().zzag(currentTimeMillis - zzeh.zzhr());
                            if (!TextUtils.isEmpty(str2)) {
                                zzea zzbf = zzjh().zzbf(str2);
                                if (zzbf != null) {
                                    zzb(zzbf);
                                }
                            }
                            this.zzasg = false;
                            zzlh();
                        }
                        if (this.zzasl == -1) {
                            this.zzasl = zzjh().zzic();
                        }
                        List<Pair> zzb = zzjh().zzb(zzhv, this.zzacv.zzgk().zzb(zzhv, zzez.zzaik), Math.max(0, this.zzacv.zzgk().zzb(zzhv, zzez.zzail)));
                        if (!zzb.isEmpty()) {
                            zzku zzku;
                            Object obj;
                            List zzb2;
                            for (Pair pair : zzb2) {
                                zzku = (zzku) pair.first;
                                if (!TextUtils.isEmpty(zzku.zzavv)) {
                                    obj = zzku.zzavv;
                                    break;
                                }
                            }
                            obj = null;
                            if (obj != null) {
                                for (int i = 0; i < zzb2.size(); i++) {
                                    zzku = (zzku) ((Pair) zzb2.get(i)).first;
                                    if (!TextUtils.isEmpty(zzku.zzavv) && !zzku.zzavv.equals(obj)) {
                                        zzb2 = zzb2.subList(0, i);
                                        break;
                                    }
                                }
                            }
                            zzkt zzkt = new zzkt();
                            zzkt.zzavf = new zzku[zzb2.size()];
                            ArrayList arrayList = new ArrayList(zzb2.size());
                            boolean z = zzeh.zzht() && this.zzacv.zzgk().zzau(zzhv);
                            for (int i2 = 0; i2 < zzkt.zzavf.length; i2++) {
                                zzkt.zzavf[i2] = (zzku) ((Pair) zzb2.get(i2)).first;
                                arrayList.add((Long) ((Pair) zzb2.get(i2)).second);
                                zzkt.zzavf[i2].zzavu = Long.valueOf(this.zzacv.zzgk().zzgw());
                                zzkt.zzavf[i2].zzavk = Long.valueOf(currentTimeMillis);
                                zzku = zzkt.zzavf[i2];
                                this.zzacv.zzgl();
                                zzku.zzavz = Boolean.valueOf(false);
                                if (!z) {
                                    zzkt.zzavf[i2].zzawh = null;
                                }
                            }
                            Object zzb3 = this.zzacv.zzgi().isLoggable(2) ? zzjf().zzb(zzkt) : null;
                            byte[] zza = zzjf().zza(zzkt);
                            str = (String) zzez.zzaiu.get();
                            URL url = new URL(str);
                            Preconditions.checkArgument(arrayList.isEmpty() ^ 1);
                            if (this.zzasj != null) {
                                this.zzacv.zzgi().zziv().log("Set uploading progress before finishing the previous upload");
                            } else {
                                this.zzasj = new ArrayList(arrayList);
                            }
                            this.zzacv.zzgj().zzalu.set(currentTimeMillis);
                            Object obj2 = "?";
                            if (zzkt.zzavf.length > 0) {
                                obj2 = zzkt.zzavf[0].zzth;
                            }
                            this.zzacv.zzgi().zzjc().zzd("Uploading data. app, uncompressed size, data", obj2, Integer.valueOf(zza.length), zzb3);
                            this.zzasf = true;
                            zzfm zzkz = zzkz();
                            zzjv zzjv = new zzjv(this, zzhv);
                            zzkz.zzab();
                            zzkz.zzch();
                            Preconditions.checkNotNull(url);
                            Preconditions.checkNotNull(zza);
                            Preconditions.checkNotNull(zzjv);
                            zzkz.zzgh().zzd(new zzfq(zzkz, zzhv, url, zza, null, zzjv));
                        }
                        this.zzasg = false;
                        zzlh();
                    } else {
                        this.zzacv.zzgi().zzjc().log("Network not connected, ignoring upload request");
                    }
                }
                zzlg();
                this.zzasg = false;
                zzlh();
            }
            zziy.log(str2);
        } catch (MalformedURLException e) {
            this.zzacv.zzgi().zziv().zze("Failed to parse upload URL. Not uploading. appId", zzfi.zzbp(zzhv), str);
        } catch (Throwable th) {
            this.zzasg = false;
            zzlh();
        }
        this.zzasg = false;
        zzlh();
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzlj() {
        zzab();
        zzlc();
        if (!this.zzarz) {
            this.zzacv.zzgi().zzja().log("This instance being marked as an uploader");
            zzab();
            zzlc();
            if (zzlk() && zzli()) {
                zzfk zziv;
                String str;
                int zza = zza(this.zzasi);
                int zzis = this.zzacv.zzfz().zzis();
                zzab();
                if (zza > zzis) {
                    zziv = this.zzacv.zzgi().zziv();
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (zza < zzis) {
                    if (zza(zzis, this.zzasi)) {
                        zziv = this.zzacv.zzgi().zzjc();
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        zziv = this.zzacv.zzgi().zziv();
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                zziv.zze(str, Integer.valueOf(zza), Integer.valueOf(zzis));
            }
            this.zzarz = true;
            zzlg();
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzll() {
        this.zzasd++;
    }

    /* Access modifiers changed, original: final */
    public final zzgn zzlm() {
        return this.zzacv;
    }

    /* Access modifiers changed, original: final */
    public final void zzm(boolean z) {
        zzlg();
    }
}
