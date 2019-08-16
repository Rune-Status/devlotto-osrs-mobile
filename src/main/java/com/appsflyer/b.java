package com.appsflyer;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFExecutor.3.AnonymousClass5;
import com.google.firebase.analytics.FirebaseAnalytics.Param;

final class b {

    static final class a {
        /* renamed from: ॱ */
        static final b f124 = new b();
    }

    b() {
    }

    /* renamed from: ˏ */
    private static boolean m107(@NonNull Context context, @NonNull String[] strArr) {
        for (String ˋ : strArr) {
            if (AnonymousClass5.m7(context, ˋ)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: ॱ */
    static Location m108(@NonNull Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(Param.LOCATION);
            Location lastKnownLocation = m107(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = m107(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation2 = null;
            } else if ((lastKnownLocation2 == null && lastKnownLocation != null) || ((lastKnownLocation != null || lastKnownLocation2 == null) && 60000 < lastKnownLocation.getTime() - lastKnownLocation2.getTime())) {
                lastKnownLocation2 = lastKnownLocation;
            }
            return lastKnownLocation2 != null ? lastKnownLocation2 : null;
        } catch (Throwable th) {
            return null;
        }
    }
}
