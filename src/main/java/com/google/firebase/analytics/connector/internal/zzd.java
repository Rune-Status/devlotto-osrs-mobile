package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener;
import java.util.HashSet;
import java.util.Set;

public final class zzd implements zza {
    private AppMeasurement zzbqh;
    Set<String> zzbqr;
    private AnalyticsConnectorListener zzbqs;
    private zze zzbqt = new zze(this);

    public zzd(AppMeasurement appMeasurement, AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzbqs = analyticsConnectorListener;
        this.zzbqh = appMeasurement;
        this.zzbqh.registerOnMeasurementEventListener(this.zzbqt);
        this.zzbqr = new HashSet();
    }

    public final void registerEventNames(Set<String> set) {
        this.zzbqr.clear();
        Set set2 = this.zzbqr;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (zzc.zzfh(str) && zzc.zzfg(str)) {
                hashSet.add(zzc.zzfj(str));
            }
        }
        set2.addAll(hashSet);
    }

    public final void unregisterEventNames() {
        this.zzbqr.clear();
    }

    public final AnalyticsConnectorListener zzss() {
        return this.zzbqs;
    }
}
