package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.app.NotificationCompat;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.EventInterceptor;
import com.google.android.gms.measurement.AppMeasurement.OnEventListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class zzhm extends zzdz {
    @VisibleForTesting
    protected zzif zzapl;
    private EventInterceptor zzapm;
    private final Set<OnEventListener> zzapn = new CopyOnWriteArraySet();
    private boolean zzapo;
    private final AtomicReference<String> zzapp = new AtomicReference();
    @VisibleForTesting
    protected boolean zzapq = true;

    protected zzhm(zzgn zzgn) {
        super(zzgn);
    }

    private final void zza(ConditionalUserProperty conditionalUserProperty) {
        long currentTimeMillis = zzbt().currentTimeMillis();
        Preconditions.checkNotNull(conditionalUserProperty);
        Preconditions.checkNotEmpty(conditionalUserProperty.mName);
        Preconditions.checkNotEmpty(conditionalUserProperty.mOrigin);
        Preconditions.checkNotNull(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = currentTimeMillis;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (zzgg().zzcj(str) != 0) {
            zzgi().zziv().zzg("Invalid conditional user property name", zzgf().zzbo(str));
        } else if (zzgg().zzi(str, obj) != 0) {
            zzgi().zziv().zze("Invalid conditional user property value", zzgf().zzbo(str), obj);
        } else {
            Object zzj = zzgg().zzj(str, obj);
            if (zzj == null) {
                zzgi().zziv().zze("Unable to normalize conditional user property value", zzgf().zzbo(str), obj);
                return;
            }
            conditionalUserProperty.mValue = zzj;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                j = conditionalUserProperty.mTimeToLive;
                if (j > 15552000000L || j < 1) {
                    zzgi().zziv().zze("Invalid conditional user property time to live", zzgf().zzbo(str), Long.valueOf(j));
                    return;
                } else {
                    zzgh().zzc(new zzht(this, conditionalUserProperty));
                    return;
                }
            }
            zzgi().zziv().zze("Invalid conditional user property timeout", zzgf().zzbo(str), Long.valueOf(j));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0375 A:{SYNTHETIC, EDGE_INSN: B:112:0x0375->B:101:0x0375 ?: BREAK  , EDGE_INSN: B:112:0x0375->B:101:0x0375 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    private final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(bundle);
        zzab();
        zzch();
        if (this.zzacv.isEnabled()) {
            int i;
            int i2 = 0;
            if (!this.zzapo) {
                this.zzapo = true;
                try {
                    try {
                        Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{getContext()});
                    } catch (Exception e) {
                        zzgi().zziy().zzg("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException e2) {
                    zzgi().zzja().log("Tag Manager is not found and thus will not be used");
                }
            }
            if (z3) {
                zzgl();
                if (!"_iap".equals(str2)) {
                    zzkd zzgg = this.zzacv.zzgg();
                    i = !zzgg.zzq(NotificationCompat.CATEGORY_EVENT, str2) ? 2 : !zzgg.zza(NotificationCompat.CATEGORY_EVENT, Event.zzacw, str2) ? 13 : !zzgg.zza(NotificationCompat.CATEGORY_EVENT, 40, str2) ? 2 : 0;
                    if (i != 0) {
                        zzgi().zzix().zzg("Invalid public event name. Event will not be logged (FE)", zzgf().zzbm(str2));
                        this.zzacv.zzgg();
                        this.zzacv.zzgg().zza(i, "_ev", zzkd.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            zzgl();
            zzig zzkn = zzgb().zzkn();
            if (zzkn != null) {
                if (!bundle.containsKey("_sc")) {
                    zzkn.zzaqc = true;
                }
            }
            boolean z4 = z && z3;
            zzih.zza(zzkn, bundle, z4);
            boolean equals = "am".equals(str);
            z4 = zzkd.zzcm(str2);
            if (z && this.zzapm != null && !z4 && !equals) {
                zzgi().zzjb().zze("Passing event to registered event handler (FE)", zzgf().zzbm(str2), zzgf().zzb(bundle));
                this.zzapm.interceptEvent(str, str2, bundle, j);
                return;
            } else if (this.zzacv.zzkg()) {
                int zzch = zzgg().zzch(str2);
                if (zzch != 0) {
                    zzgi().zzix().zzg("Invalid event name. Event will not be logged (FE)", zzgf().zzbm(str2));
                    zzgg();
                    String zza = zzkd.zza(str2, 40, true);
                    if (str2 != null) {
                        i2 = str2.length();
                    }
                    this.zzacv.zzgg().zza(str3, zzch, "_ev", zza, i2);
                    return;
                }
                zzig zzig;
                zzig zzig2;
                ArrayList arrayList;
                long nextLong;
                String[] strArr;
                int i3;
                int i4;
                String[] strArr2;
                zzig zzig3;
                int length;
                int i5;
                int i6;
                List listOf = CollectionUtils.listOf("_o", "_sn", "_sc", "_si");
                Bundle zza2 = zzgg().zza(str3, str2, bundle, listOf, z3, true);
                if (zza2 != null) {
                    if (zza2.containsKey("_sc")) {
                        if (zza2.containsKey("_si")) {
                            Bundle zza3;
                            zzig = new zzig(zza2.getString("_sn"), zza2.getString("_sc"), Long.valueOf(zza2.getLong("_si")).longValue());
                            zzig2 = zzig != null ? zzkn : zzig;
                            arrayList = new ArrayList();
                            arrayList.add(zza2);
                            nextLong = zzgg().zzlo().nextLong();
                            strArr = (String[]) zza2.keySet().toArray(new String[bundle.size()]);
                            Arrays.sort(strArr);
                            i3 = 0;
                            i4 = 0;
                            strArr2 = strArr;
                            zzig3 = zzig2;
                            for (length = strArr.length; i4 < length; length = length) {
                                String str4 = strArr2[i4];
                                Object obj = zza2.get(str4);
                                zzgg();
                                Bundle[] zze = zzkd.zze(obj);
                                if (zze != null) {
                                    zza2.putInt(str4, zze.length);
                                    i5 = 0;
                                    while (true) {
                                        i6 = i5;
                                        if (i6 >= zze.length) {
                                            break;
                                        }
                                        Bundle bundle2 = zze[i6];
                                        zzih.zza(zzig3, bundle2, true);
                                        zza3 = zzgg().zza(str3, "_ep", bundle2, listOf, z3, false);
                                        zza3.putString("_en", str2);
                                        zza3.putLong("_eid", nextLong);
                                        zza3.putString("_gn", str4);
                                        zza3.putInt("_ll", zze.length);
                                        zza3.putInt("_i", i6);
                                        arrayList.add(zza3);
                                        i5 = i6 + 1;
                                    }
                                    zzch = i3 + zze.length;
                                    zzig = zzig3;
                                    i = i4;
                                } else {
                                    zzig = zzig3;
                                    i = i4;
                                    zzch = i3;
                                }
                                i4 = i + 1;
                                strArr2 = strArr2;
                                zzig3 = zzig;
                                i3 = zzch;
                            }
                            if (i3 != 0) {
                                zza2.putLong("_eid", nextLong);
                                zza2.putInt("_epc", i3);
                            }
                            i5 = 0;
                            while (true) {
                                i6 = i5;
                                if (i6 < arrayList.size()) {
                                    break;
                                }
                                zza3 = (Bundle) arrayList.get(i6);
                                String str5 = (i6 != 0 ? 1 : null) != null ? "_ep" : str2;
                                zza3.putString("_o", str);
                                Bundle zzd = z2 ? zzgg().zzd(zza3) : zza3;
                                zzgi().zzjb().zze("Logging event (FE)", zzgf().zzbm(str2), zzgf().zzb(zzd));
                                zzga().zzb(new zzex(str5, new zzeu(zzd), str, j), str3);
                                if (!equals) {
                                    for (OnEventListener onEvent : this.zzapn) {
                                        onEvent.onEvent(str, str2, new Bundle(zzd), j);
                                    }
                                }
                                i5 = i6 + 1;
                            }
                            zzgl();
                            if (zzgb().zzkn() != null && Event.APP_EXCEPTION.equals(str2)) {
                                zzgd().zzl(true);
                                return;
                            }
                            return;
                        }
                    }
                }
                zzig = null;
                if (zzig != null) {
                }
                arrayList = new ArrayList();
                arrayList.add(zza2);
                nextLong = zzgg().zzlo().nextLong();
                strArr = (String[]) zza2.keySet().toArray(new String[bundle.size()]);
                Arrays.sort(strArr);
                i3 = 0;
                i4 = 0;
                strArr2 = strArr;
                zzig3 = zzig2;
                while (i4 < length) {
                }
                if (i3 != 0) {
                }
                i5 = 0;
                while (true) {
                    i6 = i5;
                    if (i6 < arrayList.size()) {
                    }
                    i5 = i6 + 1;
                }
                zzgl();
                if (zzgb().zzkn() != null) {
                    return;
                }
                return;
            } else {
                return;
            }
        }
        zzgi().zzjb().log("Event not sent since app measurement is disabled");
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzgh().zzc(new zzho(this, str, str2, obj, j));
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzb(str, str2, zzbt().currentTimeMillis(), bundle, z, z2, z3, str3);
    }

    @WorkerThread
    private final void zza(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzfv();
        zzch();
        if (!this.zzacv.isEnabled()) {
            zzgi().zzjb().log("User property not set since app measurement is disabled");
        } else if (this.zzacv.zzkg()) {
            zzgi().zzjb().zze("Setting user property (FE)", zzgf().zzbm(str2), obj);
            zzga().zzb(new zzka(str2, j, obj, str));
        }
    }

    private final void zza(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zzbt().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = currentTimeMillis;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        zzgh().zzc(new zzhu(this, conditionalUserProperty));
    }

    @VisibleForTesting
    private final Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        zzfk zziv;
        String str4;
        if (zzgh().zzju()) {
            zziv = zzgi().zziv();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (zzee.isMainThread()) {
            zziv = zzgi().zziv();
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzacv.zzgh().zzc(new zzhw(this, atomicReference, str, str2, str3, z));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    zzgi().zziy().zzg("Interrupted waiting for get user properties", e);
                }
            }
            List<zzka> list = (List) atomicReference.get();
            if (list == null) {
                zziv = zzgi().zziy();
                str4 = "Timed out waiting for get user properties";
            } else {
                ArrayMap arrayMap = new ArrayMap(list.size());
                for (zzka zzka : list) {
                    arrayMap.put(zzka.name, zzka.getValue());
                }
                return arrayMap;
            }
        }
        zziv.log(str4);
        return Collections.emptyMap();
    }

    @WorkerThread
    private final void zzb(ConditionalUserProperty conditionalUserProperty) {
        zzab();
        zzch();
        Preconditions.checkNotNull(conditionalUserProperty);
        Preconditions.checkNotEmpty(conditionalUserProperty.mName);
        Preconditions.checkNotEmpty(conditionalUserProperty.mOrigin);
        Preconditions.checkNotNull(conditionalUserProperty.mValue);
        if (this.zzacv.isEnabled()) {
            zzka zzka = new zzka(conditionalUserProperty.mName, conditionalUserProperty.mTriggeredTimestamp, conditionalUserProperty.mValue, conditionalUserProperty.mOrigin);
            try {
                zzex zza = zzgg().zza(conditionalUserProperty.mAppId, conditionalUserProperty.mTriggeredEventName, conditionalUserProperty.mTriggeredEventParams, conditionalUserProperty.mOrigin, 0, true, false);
                zzga().zzd(new zzef(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, zzka, conditionalUserProperty.mCreationTimestamp, false, conditionalUserProperty.mTriggerEventName, zzgg().zza(conditionalUserProperty.mAppId, conditionalUserProperty.mTimedOutEventName, conditionalUserProperty.mTimedOutEventParams, conditionalUserProperty.mOrigin, 0, true, false), conditionalUserProperty.mTriggerTimeout, zza, conditionalUserProperty.mTimeToLive, zzgg().zza(conditionalUserProperty.mAppId, conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, 0, true, false)));
                return;
            } catch (IllegalArgumentException e) {
                return;
            }
        }
        zzgi().zzjb().log("Conditional property not sent since Firebase Analytics is disabled");
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
            for (String str4 : bundle2.keySet()) {
                Object obj = bundle2.get(str4);
                if (obj instanceof Bundle) {
                    bundle2.putBundle(str4, new Bundle((Bundle) obj));
                } else {
                    int i = 0;
                    int i2;
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        while (true) {
                            i2 = i;
                            if (i2 >= parcelableArr.length) {
                                break;
                            }
                            if (parcelableArr[i2] instanceof Bundle) {
                                parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                            }
                            i = i2 + 1;
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            Object obj2 = arrayList.get(i2);
                            if (obj2 instanceof Bundle) {
                                arrayList.set(i2, new Bundle((Bundle) obj2));
                            }
                        }
                    }
                }
            }
        }
        zzgh().zzc(new zzie(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    @WorkerThread
    private final void zzc(ConditionalUserProperty conditionalUserProperty) {
        zzab();
        zzch();
        Preconditions.checkNotNull(conditionalUserProperty);
        Preconditions.checkNotEmpty(conditionalUserProperty.mName);
        if (this.zzacv.isEnabled()) {
            zzka zzka = new zzka(conditionalUserProperty.mName, 0, null, null);
            try {
                zzga().zzd(new zzef(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, zzka, conditionalUserProperty.mCreationTimestamp, conditionalUserProperty.mActive, conditionalUserProperty.mTriggerEventName, null, conditionalUserProperty.mTriggerTimeout, null, conditionalUserProperty.mTimeToLive, zzgg().zza(conditionalUserProperty.mAppId, conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, conditionalUserProperty.mCreationTimestamp, true, false)));
                return;
            } catch (IllegalArgumentException e) {
                return;
            }
        }
        zzgi().zzjb().log("Conditional property not cleared since Firebase Analytics is disabled");
    }

    @VisibleForTesting
    private final List<ConditionalUserProperty> zzf(String str, String str2, String str3) {
        zzfk zziv;
        String str4;
        if (zzgh().zzju()) {
            zziv = zzgi().zziv();
            str4 = "Cannot get conditional user properties from analytics worker thread";
        } else if (zzee.isMainThread()) {
            zziv = zzgi().zziv();
            str4 = "Cannot get conditional user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzacv.zzgh().zzc(new zzhv(this, atomicReference, str, str2, str3));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    zzgi().zziy().zze("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List<zzef> list = (List) atomicReference.get();
            if (list == null) {
                zzgi().zziy().zzg("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (zzef zzef : list) {
                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                conditionalUserProperty.mAppId = zzef.packageName;
                conditionalUserProperty.mOrigin = zzef.origin;
                conditionalUserProperty.mCreationTimestamp = zzef.creationTimestamp;
                conditionalUserProperty.mName = zzef.zzage.name;
                conditionalUserProperty.mValue = zzef.zzage.getValue();
                conditionalUserProperty.mActive = zzef.active;
                conditionalUserProperty.mTriggerEventName = zzef.triggerEventName;
                if (zzef.zzagf != null) {
                    conditionalUserProperty.mTimedOutEventName = zzef.zzagf.name;
                    if (zzef.zzagf.zzahg != null) {
                        conditionalUserProperty.mTimedOutEventParams = zzef.zzagf.zzahg.zzin();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = zzef.triggerTimeout;
                if (zzef.zzagg != null) {
                    conditionalUserProperty.mTriggeredEventName = zzef.zzagg.name;
                    if (zzef.zzagg.zzahg != null) {
                        conditionalUserProperty.mTriggeredEventParams = zzef.zzagg.zzahg.zzin();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = zzef.zzage.zzast;
                conditionalUserProperty.mTimeToLive = zzef.timeToLive;
                if (zzef.zzagh != null) {
                    conditionalUserProperty.mExpiredEventName = zzef.zzagh.name;
                    if (zzef.zzagh.zzahg != null) {
                        conditionalUserProperty.mExpiredEventParams = zzef.zzagh.zzahg.zzin();
                    }
                }
                arrayList.add(conditionalUserProperty);
            }
            return arrayList;
        }
        zziv.log(str4);
        return Collections.emptyList();
    }

    @WorkerThread
    private final void zzi(boolean z) {
        zzab();
        zzfv();
        zzch();
        zzgi().zzjb().zzg("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzgj().setMeasurementEnabled(z);
        if (!zzgk().zzbc(zzfz().zzah())) {
            zzga().zzkp();
        } else if (this.zzacv.isEnabled() && this.zzapq) {
            zzgi().zzjb().log("Recording app launch after enabling measurement for the first time (FE)");
            zzkm();
        } else {
            zzga().zzkp();
        }
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzfv();
        zza(null, str, str2, bundle);
    }

    public final void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        zzfu();
        zza(str, str2, str3, bundle);
    }

    public final Task<String> getAppInstanceId() {
        try {
            String zzjk = zzgj().zzjk();
            return zzjk != null ? Tasks.forResult(zzjk) : Tasks.call(zzgh().zzjv(), new zzhq(this));
        } catch (Exception e) {
            zzgi().zziy().log("Failed to schedule task for getAppInstanceId");
            return Tasks.forException(e);
        }
    }

    public final List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        zzfv();
        return zzf(null, str, str2);
    }

    public final List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzfu();
        return zzf(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        zzfv();
        return zzb(null, str, str2, z);
    }

    public final Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        zzfu();
        return zzb(str, str2, str3, z);
    }

    public final void logEvent(String str, String str2, Bundle bundle) {
        zzfv();
        boolean z = this.zzapm == null || zzkd.zzcm(str2);
        zza(str, str2, bundle, true, z, false, null);
    }

    public final void logEventNoInterceptor(String str, String str2, Bundle bundle, long j) {
        zzfv();
        zzb(str, str2, j, bundle, false, true, true, null);
    }

    public final void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        zzfv();
        zzch();
        Preconditions.checkNotNull(onEventListener);
        if (!this.zzapn.add(onEventListener)) {
            zzgi().zziy().log("OnEventListener already registered");
        }
    }

    public final void resetAnalyticsData() {
        zzgh().zzc(new zzhs(this, zzbt().currentTimeMillis()));
    }

    public final void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        zzfv();
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            zzgi().zziy().log("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        zza(conditionalUserProperty2);
    }

    public final void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        Preconditions.checkNotEmpty(conditionalUserProperty.mAppId);
        zzfu();
        zza(new ConditionalUserProperty(conditionalUserProperty));
    }

    @WorkerThread
    public final void setEventInterceptor(EventInterceptor eventInterceptor) {
        zzab();
        zzfv();
        zzch();
        if (!(eventInterceptor == null || eventInterceptor == this.zzapm)) {
            Preconditions.checkState(this.zzapm == null, "EventInterceptor already set.");
        }
        this.zzapm = eventInterceptor;
    }

    public final void setMeasurementEnabled(boolean z) {
        zzch();
        zzfv();
        zzgh().zzc(new zzib(this, z));
    }

    public final void setMinimumSessionDuration(long j) {
        zzfv();
        zzgh().zzc(new zzic(this, j));
    }

    public final void setSessionTimeoutDuration(long j) {
        zzfv();
        zzgh().zzc(new zzid(this, j));
    }

    public final void setUserProperty(String str, String str2, Object obj) {
        int i = 0;
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzbt().currentTimeMillis();
        int zzcj = zzgg().zzcj(str2);
        String zza;
        if (zzcj != 0) {
            zzgg();
            zza = zzkd.zza(str2, 24, true);
            if (str2 != null) {
                i = str2.length();
            }
            this.zzacv.zzgg().zza(zzcj, "_ev", zza, i);
        } else if (obj != null) {
            zzcj = zzgg().zzi(str2, obj);
            if (zzcj != 0) {
                zzgg();
                zza = zzkd.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i = String.valueOf(obj).length();
                }
                this.zzacv.zzgg().zza(zzcj, "_ev", zza, i);
                return;
            }
            Object zzj = zzgg().zzj(str2, obj);
            if (zzj != null) {
                zza(str, str2, currentTimeMillis, zzj);
            }
        } else {
            zza(str, str2, currentTimeMillis, null);
        }
    }

    public final void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        zzfv();
        zzch();
        Preconditions.checkNotNull(onEventListener);
        if (!this.zzapn.remove(onEventListener)) {
            zzgi().zziy().log("OnEventListener had not been registered");
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zza(String str, String str2, Bundle bundle) {
        zzfv();
        zzab();
        boolean z = this.zzapm == null || zzkd.zzcm(str2);
        zza(str, str2, zzbt().currentTimeMillis(), bundle, true, z, false, null);
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z) {
        zzfv();
        boolean z2 = this.zzapm == null || zzkd.zzcm(str2);
        zza(str, str2, bundle, true, z2, true, null);
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    /* Access modifiers changed, original: final */
    @Nullable
    public final String zzaj(long j) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            zzgh().zzc(new zzhr(this, atomicReference));
            try {
                atomicReference.wait(j);
            } catch (InterruptedException e) {
                zzgi().zziy().log("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (String) atomicReference.get();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    /* Access modifiers changed, original: final */
    public final void zzbu(@Nullable String str) {
        this.zzapp.set(str);
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

    public final List<zzka> zzj(boolean z) {
        zzfk zziv;
        String str;
        zzfv();
        zzch();
        zzgi().zzjb().log("Fetching user attributes (FE)");
        if (zzgh().zzju()) {
            zziv = zzgi().zziv();
            str = "Cannot get all user properties from analytics worker thread";
        } else if (zzee.isMainThread()) {
            zziv = zzgi().zziv();
            str = "Cannot get all user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzacv.zzgh().zzc(new zzhp(this, atomicReference, z));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    zzgi().zziy().zzg("Interrupted waiting for get user properties", e);
                }
            }
            List list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            zziv = zzgi().zziy();
            str = "Timed out waiting for get user properties";
        }
        zziv.log(str);
        return Collections.emptyList();
    }

    @Nullable
    public final String zzjk() {
        zzfv();
        return (String) this.zzapp.get();
    }

    public final Boolean zzkh() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzgh().zza(atomicReference, 15000, "boolean test flag value", new zzhn(this, atomicReference));
    }

    public final String zzki() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzgh().zza(atomicReference, 15000, "String test flag value", new zzhx(this, atomicReference));
    }

    public final Long zzkj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzgh().zza(atomicReference, 15000, "long test flag value", new zzhy(this, atomicReference));
    }

    public final Integer zzkk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzgh().zza(atomicReference, 15000, "int test flag value", new zzhz(this, atomicReference));
    }

    public final Double zzkl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzgh().zza(atomicReference, 15000, "double test flag value", new zzia(this, atomicReference));
    }

    @WorkerThread
    public final void zzkm() {
        zzab();
        zzfv();
        zzch();
        if (this.zzacv.zzkg()) {
            zzga().zzkm();
            this.zzapq = false;
            String zzjn = zzgj().zzjn();
            if (!TextUtils.isEmpty(zzjn)) {
                zzge().zzch();
                if (!zzjn.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", zzjn);
                    logEvent("auto", "_ou", bundle);
                }
            }
        }
    }
}
