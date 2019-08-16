package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseInstanceId {
    private static final long zzan = TimeUnit.HOURS.toSeconds(8);
    private static zzaw zzao;
    @GuardedBy("FirebaseInstanceId.class")
    @VisibleForTesting
    private static ScheduledThreadPoolExecutor zzap;
    private final Executor zzaq;
    private final FirebaseApp zzar;
    private final zzan zzas;
    private MessagingChannel zzat;
    private final zzaq zzau;
    private final zzba zzav;
    @GuardedBy("this")
    private boolean zzaw;
    private final zza zzax;

    private final class zza {
        private final boolean zzbd = zzu();
        private final Subscriber zzbe;
        @Nullable
        @GuardedBy("this")
        private EventHandler<DataCollectionDefaultChange> zzbf;
        @Nullable
        @GuardedBy("this")
        private Boolean zzbg = zzt();

        zza(Subscriber subscriber) {
            this.zzbe = subscriber;
            if (this.zzbg == null && this.zzbd) {
                this.zzbf = new zzq(this);
                subscriber.subscribe(DataCollectionDefaultChange.class, this.zzbf);
            }
        }

        @Nullable
        private final Boolean zzt() {
            Context applicationContext = FirebaseInstanceId.this.zzar.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                }
            } catch (NameNotFoundException e) {
            }
            return null;
        }

        private final boolean zzu() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException e) {
                Context applicationContext = FirebaseInstanceId.this.zzar.getApplicationContext();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:20:?, code skipped:
            return false;
     */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean isEnabled() {
            synchronized (this) {
                if (this.zzbg != null) {
                    boolean booleanValue = this.zzbg.booleanValue();
                    return booleanValue;
                } else if (this.zzbd && FirebaseInstanceId.this.zzar.isDataCollectionDefaultEnabled()) {
                    return true;
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void setEnabled(boolean z) {
            synchronized (this) {
                if (this.zzbf != null) {
                    this.zzbe.unsubscribe(DataCollectionDefaultChange.class, this.zzbf);
                    this.zzbf = null;
                }
                Editor edit = FirebaseInstanceId.this.zzar.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z);
                edit.apply();
                if (z) {
                    FirebaseInstanceId.this.zzh();
                }
                this.zzbg = Boolean.valueOf(z);
            }
        }
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber, UserAgentPublisher userAgentPublisher) {
        this(firebaseApp, new zzan(firebaseApp.getApplicationContext()), zzi.zzg(), zzi.zzg(), subscriber, userAgentPublisher);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, zzan zzan, Executor executor, Executor executor2, Subscriber subscriber, UserAgentPublisher userAgentPublisher) {
        this.zzaw = false;
        if (zzan.zza(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (zzao == null) {
                        zzao = new zzaw(firebaseApp.getApplicationContext());
                    }
                } catch (Throwable th) {
                    while (true) {
                        Class cls = FirebaseInstanceId.class;
                    }
                }
            }
            this.zzar = firebaseApp;
            this.zzas = zzan;
            if (this.zzat == null) {
                MessagingChannel messagingChannel = (MessagingChannel) firebaseApp.get(MessagingChannel.class);
                if (messagingChannel == null || !messagingChannel.isAvailable()) {
                    this.zzat = new zzr(firebaseApp, zzan, executor, userAgentPublisher);
                } else {
                    this.zzat = messagingChannel;
                }
            }
            this.zzat = this.zzat;
            this.zzaq = executor2;
            this.zzav = new zzba(zzao);
            this.zzax = new zza(subscriber);
            this.zzau = new zzaq(executor);
            if (this.zzax.isEnabled()) {
                zzh();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @Keep
    public static FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
    }

    private final void startSync() {
        synchronized (this) {
            if (!this.zzaw) {
                zza(0);
            }
        }
    }

    private final Task<InstanceIdResult> zza(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.zzaq, new zzn(this, str, zzd(str2)));
    }

    private final <T> T zza(Task<T> task) throws IOException {
        try {
            return Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            ExecutionException executionException = e;
            Throwable cause = executionException.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zzn();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(executionException);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static void zza(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (zzap == null) {
                    zzap = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
                }
                zzap.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                Class cls = FirebaseInstanceId.class;
            }
        }
    }

    @Nullable
    @VisibleForTesting
    private static zzax zzb(String str, String str2) {
        return zzao.zzb("", str, str2);
    }

    private static String zzd(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase(AppMeasurement.FCM_ORIGIN) || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private final void zzh() {
        zzax zzk = zzk();
        if (zzr() || zza(zzk) || this.zzav.zzap()) {
            startSync();
        }
    }

    private static String zzj() {
        return zzan.zza(zzao.zzg("").getKeyPair());
    }

    static boolean zzm() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    @WorkerThread
    public void deleteInstanceId() throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zza(this.zzat.deleteInstanceId(zzj()));
            zzn();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    @WorkerThread
    public void deleteToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String zzd = zzd(str2);
            zza(this.zzat.deleteToken(zzj(), zzax.zzb(zzb(str, zzd)), str, zzd));
            zzao.zzc("", str, zzd);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public long getCreationTime() {
        return zzao.zzg("").getCreationTime();
    }

    @WorkerThread
    public String getId() {
        zzh();
        return zzj();
    }

    @NonNull
    public Task<InstanceIdResult> getInstanceId() {
        return zza(zzan.zza(this.zzar), "*");
    }

    @Nullable
    @Deprecated
    public String getToken() {
        zzax zzk = zzk();
        if (this.zzat.needsRefresh() || zza(zzk)) {
            startSync();
        }
        return zzax.zzb(zzk);
    }

    @WorkerThread
    public String getToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) zza(zza(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    public final Task<Void> zza(String str) {
        Task zza;
        synchronized (this) {
            zza = this.zzav.zza(str);
            startSync();
        }
        return zza;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Task zza(String str, String str2, Task task) throws Exception {
        String zzj = zzj();
        zzax zzb = zzb(str, str2);
        if (!this.zzat.needsRefresh() && !zza(zzb)) {
            return Tasks.forResult(new zzx(zzj, zzb.zzbu));
        }
        return this.zzau.zza(str, str2, new zzo(this, zzj, zzax.zzb(zzb), str, str2));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Task zza(String str, String str2, String str3, String str4) {
        return this.zzat.getToken(str, str2, str3, str4).onSuccessTask(this.zzaq, new zzp(this, str3, str4, str));
    }

    /* Access modifiers changed, original: final */
    public final void zza(long j) {
        synchronized (this) {
            zza(new zzay(this, this.zzas, this.zzav, Math.min(Math.max(30, j << 1), zzan)), j);
            this.zzaw = true;
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(boolean z) {
        synchronized (this) {
            this.zzaw = z;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(@Nullable zzax zzax) {
        return zzax == null || zzax.zzj(this.zzas.zzad());
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Task zzb(String str, String str2, String str3, String str4) throws Exception {
        zzao.zza("", str, str2, str4, this.zzas.zzad());
        return Tasks.forResult(new zzx(str3, str4));
    }

    /* Access modifiers changed, original: final */
    public final void zzb(String str) throws IOException {
        zzax zzk = zzk();
        if (zza(zzk)) {
            throw new IOException("token not available");
        }
        zza(this.zzat.subscribeToTopic(zzj(), zzk.zzbu, str));
    }

    @VisibleForTesting
    public final void zzb(boolean z) {
        this.zzax.setEnabled(z);
    }

    /* Access modifiers changed, original: final */
    public final void zzc(String str) throws IOException {
        zzax zzk = zzk();
        if (zza(zzk)) {
            throw new IOException("token not available");
        }
        zza(this.zzat.unsubscribeFromTopic(zzj(), zzk.zzbu, str));
    }

    /* Access modifiers changed, original: final */
    public final FirebaseApp zzi() {
        return this.zzar;
    }

    /* Access modifiers changed, original: final */
    @Nullable
    public final zzax zzk() {
        return zzb(zzan.zza(this.zzar), "*");
    }

    /* Access modifiers changed, original: final */
    public final String zzl() throws IOException {
        return getToken(zzan.zza(this.zzar), "*");
    }

    /* Access modifiers changed, original: final */
    public final void zzn() {
        synchronized (this) {
            zzao.zzal();
            if (this.zzax.isEnabled()) {
                startSync();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zzo() {
        return this.zzat.isAvailable();
    }

    /* Access modifiers changed, original: final */
    public final void zzp() {
        zzao.zzh("");
        startSync();
    }

    @VisibleForTesting
    public final boolean zzq() {
        return this.zzax.isEnabled();
    }

    /* Access modifiers changed, original: final */
    public final boolean zzr() {
        return this.zzat.needsRefresh();
    }
}
