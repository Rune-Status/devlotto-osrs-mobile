package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReference;

public class zzgn implements zzhk {
    private static volatile zzgn zzaoc;
    private final Clock clock;
    private final long zzaga;
    private final zzee zzahs;
    private final String zzaod;
    private final zzeh zzaoe;
    private final zzft zzaof;
    private final zzfi zzaog;
    private final zzgi zzaoh;
    private final zzjj zzaoi;
    private final AppMeasurement zzaoj;
    private final FirebaseAnalytics zzaok;
    private final zzkd zzaol;
    private final zzfg zzaom;
    private final zzih zzaon;
    private final zzhm zzaoo;
    private final zzdu zzaop;
    private zzfe zzaoq;
    private zzik zzaor;
    private zzer zzaos;
    private zzfd zzaot;
    private zzfz zzaou;
    private Boolean zzaov;
    private long zzaow;
    private int zzaox;
    private int zzaoy;
    private final Context zzqx;
    private boolean zzvn = false;

    private zzgn(zzhl zzhl) {
        zzfk zzjc;
        String str;
        Preconditions.checkNotNull(zzhl);
        this.zzahs = new zzee(zzhl.zzqx);
        zzez.zza(this.zzahs);
        this.zzqx = zzhl.zzqx;
        this.zzaod = zzhl.zzaod;
        zzwx.init(this.zzqx);
        this.clock = DefaultClock.getInstance();
        this.zzaga = this.clock.currentTimeMillis();
        this.zzaoe = new zzeh(this);
        zzft zzft = new zzft(this);
        zzft.zzm();
        this.zzaof = zzft;
        zzfi zzfi = new zzfi(this);
        zzfi.zzm();
        this.zzaog = zzfi;
        zzkd zzkd = new zzkd(this);
        zzkd.zzm();
        this.zzaol = zzkd;
        zzfg zzfg = new zzfg(this);
        zzfg.zzm();
        this.zzaom = zzfg;
        this.zzaop = new zzdu(this);
        zzih zzih = new zzih(this);
        zzih.zzm();
        this.zzaon = zzih;
        zzhm zzhm = new zzhm(this);
        zzhm.zzm();
        this.zzaoo = zzhm;
        this.zzaoj = new AppMeasurement(this);
        this.zzaok = new FirebaseAnalytics(this);
        zzjj zzjj = new zzjj(this);
        zzjj.zzm();
        this.zzaoi = zzjj;
        zzgi zzgi = new zzgi(this);
        zzgi.zzm();
        this.zzaoh = zzgi;
        zzee zzee = this.zzahs;
        if (this.zzqx.getApplicationContext() instanceof Application) {
            zzhm zzfy = zzfy();
            if (zzfy.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) zzfy.getContext().getApplicationContext();
                if (zzfy.zzapl == null) {
                    zzfy.zzapl = new zzif(zzfy, null);
                }
                application.unregisterActivityLifecycleCallbacks(zzfy.zzapl);
                application.registerActivityLifecycleCallbacks(zzfy.zzapl);
                zzjc = zzfy.zzgi().zzjc();
                str = "Registered activity lifecycle callback";
            }
            this.zzaoh.zzc(new zzgo(this, zzhl));
        }
        zzjc = zzgi().zziy();
        str = "Application context is not an Application";
        zzjc.log(str);
        this.zzaoh.zzc(new zzgo(this, zzhl));
    }

    public static zzgn zza(Context context, String str, String str2) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzaoc == null) {
            synchronized (zzgn.class) {
                try {
                    if (zzaoc == null) {
                        zzaoc = new zzgn(new zzhl(context, null));
                    }
                } catch (Throwable th) {
                    while (true) {
                        Class cls = zzgn.class;
                    }
                }
            }
        }
        return zzaoc;
    }

    private static void zza(zzdz zzdz) {
        if (zzdz == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzdz.isInitialized()) {
            String valueOf = String.valueOf(zzdz.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static void zza(zzhi zzhi) {
        if (zzhi == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zzhj zzhj) {
        if (zzhj == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzhj.isInitialized()) {
            String valueOf = String.valueOf(zzhj.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @WorkerThread
    private final void zza(zzhl zzhl) {
        zzfk zzja;
        zzgh().zzab();
        zzeh.zzhn();
        zzer zzer = new zzer(this);
        zzer.zzm();
        this.zzaos = zzer;
        zzfd zzfd = new zzfd(this);
        zzfd.zzm();
        this.zzaot = zzfd;
        zzfe zzfe = new zzfe(this);
        zzfe.zzm();
        this.zzaoq = zzfe;
        zzik zzik = new zzik(this);
        zzik.zzm();
        this.zzaor = zzik;
        this.zzaol.zzgm();
        this.zzaof.zzgm();
        this.zzaou = new zzfz(this);
        this.zzaot.zzgm();
        zzgi().zzja().zzg("App measurement is starting up, version", Long.valueOf(this.zzaoe.zzgw()));
        zzee zzee = this.zzahs;
        zzgi().zzja().log("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        zzee = this.zzahs;
        String zzah = zzfd.zzah();
        if (zzgg().zzcn(zzah)) {
            zzja = zzgi().zzja();
            zzah = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            zzja = zzgi().zzja();
            zzah = String.valueOf(zzah);
            zzah = zzah.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(zzah) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
        }
        zzja.log(zzah);
        zzgi().zzjb().log("Debug-level message logging enabled");
        if (this.zzaox != this.zzaoy) {
            zzgi().zziv().zze("Not all components initialized", Integer.valueOf(this.zzaox), Integer.valueOf(this.zzaoy));
        }
        this.zzvn = true;
    }

    private final void zzch() {
        if (!this.zzvn) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    public final Context getContext() {
        return this.zzqx;
    }

    @WorkerThread
    public final boolean isEnabled() {
        boolean z = false;
        zzgh().zzab();
        zzch();
        if (this.zzaoe.zzho()) {
            return false;
        }
        Boolean zzhp = this.zzaoe.zzhp();
        if (zzhp != null) {
            z = zzhp.booleanValue();
        } else if (!GoogleServices.isMeasurementExplicitlyDisabled()) {
            z = true;
        }
        return zzgj().zzg(z);
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void start() {
        zzgh().zzab();
        if (zzgj().zzalt.get() == 0) {
            zzgj().zzalt.set(this.clock.currentTimeMillis());
        }
        if (Long.valueOf(zzgj().zzaly.get()).longValue() == 0) {
            zzgi().zzjc().zzg("Persisting first open", Long.valueOf(this.zzaga));
            zzgj().zzaly.set(this.zzaga);
        }
        zzee zzee;
        if (zzkg()) {
            zzee = this.zzahs;
            if (!TextUtils.isEmpty(zzfz().getGmpAppId())) {
                String zzjj = zzgj().zzjj();
                if (zzjj == null) {
                    zzgj().zzbt(zzfz().getGmpAppId());
                } else if (!zzjj.equals(zzfz().getGmpAppId())) {
                    zzgi().zzja().log("Rechecking which service to use due to a GMP App Id change");
                    zzgj().zzjm();
                    this.zzaor.disconnect();
                    this.zzaor.zzdf();
                    zzgj().zzbt(zzfz().getGmpAppId());
                    zzgj().zzaly.set(this.zzaga);
                    zzgj().zzama.zzbv(null);
                }
            }
            zzfy().zzbu(zzgj().zzama.zzjq());
            zzee = this.zzahs;
            if (!TextUtils.isEmpty(zzfz().getGmpAppId())) {
                boolean isEnabled = isEnabled();
                if (!(zzgj().zzjp() || this.zzaoe.zzho())) {
                    zzgj().zzh(isEnabled ^ 1);
                }
                if (!this.zzaoe.zzbc(zzfz().zzah()) || isEnabled) {
                    zzfy().zzkm();
                }
                zzga().zza(new AtomicReference());
            }
        } else if (isEnabled()) {
            if (!zzgg().zzx("android.permission.INTERNET")) {
                zzgi().zziv().log("App is missing INTERNET permission");
            }
            if (!zzgg().zzx("android.permission.ACCESS_NETWORK_STATE")) {
                zzgi().zziv().log("App is missing ACCESS_NETWORK_STATE permission");
            }
            zzee = this.zzahs;
            if (!(Wrappers.packageManager(this.zzqx).isCallerInstantApp() || this.zzaoe.zzhu())) {
                if (!zzgd.zza(this.zzqx)) {
                    zzgi().zziv().log("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzkd.zza(this.zzqx, false)) {
                    zzgi().zziv().log("AppMeasurementService not registered/enabled");
                }
            }
            zzgi().zziv().log("Uploading is not possible. App measurement disabled");
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzdz zzdz) {
        this.zzaox++;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzhj zzhj) {
        this.zzaox++;
    }

    public final Clock zzbt() {
        return this.clock;
    }

    /* Access modifiers changed, original: final */
    public final void zzfu() {
        zzee zzee = this.zzahs;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* Access modifiers changed, original: final */
    public final void zzfv() {
        zzee zzee = this.zzahs;
    }

    public final zzdu zzfx() {
        if (this.zzaop != null) {
            return this.zzaop;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzhm zzfy() {
        zza(this.zzaoo);
        return this.zzaoo;
    }

    public final zzfd zzfz() {
        zza(this.zzaot);
        return this.zzaot;
    }

    public final zzik zzga() {
        zza(this.zzaor);
        return this.zzaor;
    }

    public final zzih zzgb() {
        zza(this.zzaon);
        return this.zzaon;
    }

    public final zzfe zzgc() {
        zza(this.zzaoq);
        return this.zzaoq;
    }

    public final zzjj zzgd() {
        zza(this.zzaoi);
        return this.zzaoi;
    }

    public final zzer zzge() {
        zza(this.zzaos);
        return this.zzaos;
    }

    public final zzfg zzgf() {
        zza(this.zzaom);
        return this.zzaom;
    }

    public final zzkd zzgg() {
        zza(this.zzaol);
        return this.zzaol;
    }

    public final zzgi zzgh() {
        zza(this.zzaoh);
        return this.zzaoh;
    }

    public final zzfi zzgi() {
        zza(this.zzaog);
        return this.zzaog;
    }

    public final zzft zzgj() {
        zza(this.zzaof);
        return this.zzaof;
    }

    public final zzeh zzgk() {
        return this.zzaoe;
    }

    public final zzee zzgl() {
        return this.zzahs;
    }

    public final zzfi zzjy() {
        return (this.zzaog == null || !this.zzaog.isInitialized()) ? null : this.zzaog;
    }

    public final zzfz zzjz() {
        return this.zzaou;
    }

    /* Access modifiers changed, original: final */
    public final zzgi zzka() {
        return this.zzaoh;
    }

    public final AppMeasurement zzkb() {
        return this.zzaoj;
    }

    public final FirebaseAnalytics zzkc() {
        return this.zzaok;
    }

    public final String zzkd() {
        return this.zzaod;
    }

    /* Access modifiers changed, original: final */
    public final long zzke() {
        Long valueOf = Long.valueOf(zzgj().zzaly.get());
        return valueOf.longValue() == 0 ? this.zzaga : Math.min(this.zzaga, valueOf.longValue());
    }

    /* Access modifiers changed, original: final */
    public final void zzkf() {
        this.zzaoy++;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final boolean zzkg() {
        boolean z = false;
        zzch();
        zzgh().zzab();
        if (this.zzaov == null || this.zzaow == 0 || !(this.zzaov == null || this.zzaov.booleanValue() || Math.abs(this.clock.elapsedRealtime() - this.zzaow) <= 1000)) {
            this.zzaow = this.clock.elapsedRealtime();
            zzee zzee = this.zzahs;
            if (zzgg().zzx("android.permission.INTERNET") && zzgg().zzx("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzqx).isCallerInstantApp() || this.zzaoe.zzhu() || (zzgd.zza(this.zzqx) && zzkd.zza(this.zzqx, false)))) {
                z = true;
            }
            this.zzaov = Boolean.valueOf(z);
            if (this.zzaov.booleanValue()) {
                this.zzaov = Boolean.valueOf(zzgg().zzck(zzfz().getGmpAppId()));
            }
        }
        return this.zzaov.booleanValue();
    }
}
