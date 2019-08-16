package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
public final class zzik extends zzdz {
    private final zziy zzaqo;
    private zzfa zzaqp;
    private volatile Boolean zzaqq;
    private final zzep zzaqr;
    private final zzjo zzaqs;
    private final List<Runnable> zzaqt = new ArrayList();
    private final zzep zzaqu;

    protected zzik(zzgn zzgn) {
        super(zzgn);
        this.zzaqs = new zzjo(zzgn.zzbt());
        this.zzaqo = new zziy(this);
        this.zzaqr = new zzil(this, zzgn);
        this.zzaqu = new zziq(this, zzgn);
    }

    @WorkerThread
    private final void onServiceDisconnected(ComponentName componentName) {
        zzab();
        if (this.zzaqp != null) {
            this.zzaqp = null;
            zzgi().zzjc().zzg("Disconnected from device MeasurementService", componentName);
            zzab();
            zzdf();
        }
    }

    @WorkerThread
    private final void zzcu() {
        zzab();
        this.zzaqs.start();
        this.zzaqr.zzh(((Long) zzez.zzajk.get()).longValue());
    }

    @WorkerThread
    private final void zzcv() {
        zzab();
        if (isConnected()) {
            zzgi().zzjc().log("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    @WorkerThread
    private final void zzf(Runnable runnable) throws IllegalStateException {
        zzab();
        if (isConnected()) {
            runnable.run();
        } else if (((long) this.zzaqt.size()) >= 1000) {
            zzgi().zziv().log("Discarding data. Max runnable queue size reached");
        } else {
            this.zzaqt.add(runnable);
            this.zzaqu.zzh(60000);
            zzdf();
        }
    }

    @Nullable
    @WorkerThread
    private final zzeb zzk(boolean z) {
        zzgl();
        return zzfz().zzbl(z ? zzgi().zzje() : null);
    }

    private final boolean zzkq() {
        zzgl();
        return true;
    }

    @WorkerThread
    private final void zzks() {
        zzab();
        zzgi().zzjc().zzg("Processing queued up service tasks", Integer.valueOf(this.zzaqt.size()));
        for (Runnable run : this.zzaqt) {
            try {
                run.run();
            } catch (Exception e) {
                zzgi().zziv().zzg("Task exception while flushing queue", e);
            }
        }
        this.zzaqt.clear();
        this.zzaqu.cancel();
    }

    @WorkerThread
    public final void disconnect() {
        zzab();
        zzch();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzaqo);
        } catch (IllegalArgumentException | IllegalStateException e) {
        }
        this.zzaqp = null;
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @WorkerThread
    public final boolean isConnected() {
        zzab();
        zzch();
        return this.zzaqp != null;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void resetAnalyticsData() {
        zzab();
        zzfv();
        zzch();
        zzeb zzk = zzk(false);
        if (zzkq()) {
            zzgc().resetAnalyticsData();
        }
        zzf(new zzim(this, zzk));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    @VisibleForTesting
    public final void zza(zzfa zzfa) {
        zzab();
        Preconditions.checkNotNull(zzfa);
        this.zzaqp = zzfa;
        zzcu();
        zzks();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    @VisibleForTesting
    public final void zza(zzfa zzfa, AbstractSafeParcelable abstractSafeParcelable, zzeb zzeb) {
        Object e;
        zzfk zziv;
        String str;
        zzab();
        zzfv();
        zzch();
        boolean zzkq = zzkq();
        int i = 100;
        for (int i2 = 0; i2 < 1001 && i == 100; i2++) {
            int size;
            int i3;
            ArrayList arrayList = new ArrayList();
            if (zzkq) {
                List zzp = zzgc().zzp(100);
                if (zzp != null) {
                    arrayList.addAll(zzp);
                    i = zzp.size();
                    if (abstractSafeParcelable != null && i < 100) {
                        arrayList.add(abstractSafeParcelable);
                    }
                    arrayList = arrayList;
                    size = arrayList.size();
                    i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i3);
                        if (abstractSafeParcelable2 instanceof zzex) {
                            try {
                                zzfa.zza((zzex) abstractSafeParcelable2, zzeb);
                                i3 = i4;
                            } catch (RemoteException e2) {
                                e = e2;
                                zziv = zzgi().zziv();
                                str = "Failed to send event to the service";
                                zziv.zzg(str, e);
                                i3 = i4;
                            }
                        } else if (abstractSafeParcelable2 instanceof zzka) {
                            try {
                                zzfa.zza((zzka) abstractSafeParcelable2, zzeb);
                                i3 = i4;
                            } catch (RemoteException e3) {
                                e = e3;
                                zziv = zzgi().zziv();
                                str = "Failed to send attribute to the service";
                                zziv.zzg(str, e);
                                i3 = i4;
                            }
                        } else if (abstractSafeParcelable2 instanceof zzef) {
                            try {
                                zzfa.zza((zzef) abstractSafeParcelable2, zzeb);
                                i3 = i4;
                            } catch (RemoteException e4) {
                                e = e4;
                                zziv = zzgi().zziv();
                                str = "Failed to send conditional property to the service";
                                zziv.zzg(str, e);
                                i3 = i4;
                            }
                        } else {
                            zzgi().zziv().log("Discarding data. Unrecognized parcel type.");
                            i3 = i4;
                        }
                    }
                }
            }
            i = 0;
            arrayList.add(abstractSafeParcelable);
            arrayList = arrayList;
            size = arrayList.size();
            i3 = 0;
            while (i3 < size) {
            }
        }
    }

    @WorkerThread
    public final void zza(AtomicReference<String> atomicReference) {
        zzab();
        zzch();
        zzf(new zzin(this, atomicReference, zzk(false)));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(AtomicReference<List<zzef>> atomicReference, String str, String str2, String str3) {
        zzab();
        zzch();
        zzf(new zziu(this, atomicReference, str, str2, str3, zzk(false)));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(AtomicReference<List<zzka>> atomicReference, String str, String str2, String str3, boolean z) {
        zzab();
        zzch();
        zzf(new zziv(this, atomicReference, str, str2, str3, z, zzk(false)));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(AtomicReference<List<zzka>> atomicReference, boolean z) {
        zzab();
        zzch();
        zzf(new zzix(this, atomicReference, zzk(false), z));
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzb(zzex zzex, String str) {
        Preconditions.checkNotNull(zzex);
        zzab();
        zzch();
        boolean zzkq = zzkq();
        boolean z = zzkq && zzgc().zza(zzex);
        zzf(new zzis(this, zzkq, z, zzex, zzk(true), str));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzb(zzig zzig) {
        zzab();
        zzch();
        zzf(new zzip(this, zzig));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzb(zzka zzka) {
        zzab();
        zzch();
        boolean z = zzkq() && zzgc().zza(zzka);
        zzf(new zziw(this, z, zzka, zzk(true)));
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzd(zzef zzef) {
        Preconditions.checkNotNull(zzef);
        zzab();
        zzch();
        zzgl();
        zzf(new zzit(this, true, zzgc().zzc(zzef), new zzef(zzef), zzk(true), zzef));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Missing block: B:35:0x00d7, code skipped:
            r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final void zzdf() {
        Object obj = null;
        zzab();
        zzch();
        if (!isConnected()) {
            if (this.zzaqq == null) {
                boolean z;
                zzab();
                zzch();
                Boolean zzjl = zzgj().zzjl();
                if (zzjl == null || !zzjl.booleanValue()) {
                    Object obj2;
                    zzgl();
                    if (zzfz().zzit() != 1) {
                        zzgi().zzjc().log("Checking service availability");
                        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zzgg().getContext(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        zzfk zzjc;
                        String str;
                        if (isGooglePlayServicesAvailable != 9) {
                            if (isGooglePlayServicesAvailable != 18) {
                                switch (isGooglePlayServicesAvailable) {
                                    case 0:
                                        zzjc = zzgi().zzjc();
                                        str = "Service available";
                                        break;
                                    case 1:
                                        zzgi().zzjc().log("Service missing");
                                        break;
                                    case 2:
                                        zzgi().zzjb().log("Service container out of date");
                                        if (zzgg().zzlp() >= 12600) {
                                            zzjl = zzgj().zzjl();
                                            if (zzjl == null || zzjl.booleanValue()) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        zzjc = zzgi().zziy();
                                        str = "Service disabled";
                                        break;
                                    default:
                                        zzgi().zziy().zzg("Unexpected service status", Integer.valueOf(isGooglePlayServicesAvailable));
                                        break;
                                }
                            }
                            zzjc = zzgi().zziy();
                            str = "Service updating";
                            zzjc.log(str);
                        } else {
                            zzjc = zzgi().zziy();
                            str = "Service invalid";
                            zzjc.log(str);
                        }
                        z = false;
                        obj2 = null;
                        if (!z && zzgk().zzhu()) {
                            zzgi().zziv().log("No way to upload. Consider using the full version of Analytics");
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            zzgj().zzf(z);
                        }
                    }
                    z = true;
                    obj2 = 1;
                    zzgi().zziv().log("No way to upload. Consider using the full version of Analytics");
                    obj2 = null;
                    if (obj2 != null) {
                    }
                } else {
                    z = true;
                }
                this.zzaqq = Boolean.valueOf(z);
            }
            if (this.zzaqq.booleanValue()) {
                this.zzaqo.zzkt();
            } else if (!zzgk().zzhu()) {
                zzgl();
                List queryIntentServices = getContext().getPackageManager().queryIntentServices(new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    obj = 1;
                }
                if (obj != null) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context context = getContext();
                    zzgl();
                    intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.zzaqo.zzc(intent);
                    return;
                }
                zzgi().zziv().log("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
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

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzkm() {
        zzab();
        zzch();
        zzf(new zzio(this, zzk(true)));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzkp() {
        zzab();
        zzch();
        zzf(new zzir(this, zzk(true)));
    }

    /* Access modifiers changed, original: final */
    public final Boolean zzkr() {
        return this.zzaqq;
    }
}
