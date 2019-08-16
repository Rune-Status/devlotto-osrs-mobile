package com.jagex.mobilesdk.payments.utils;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

public class SecurityProviderUpdate {
    public static void ProviderUpdate(@NonNull Activity activity) {
        try {
            ProviderInstaller.installIfNeeded(activity.getApplicationContext());
        } catch (GooglePlayServicesRepairableException e) {
            GoogleApiAvailability.getInstance().showErrorNotification(activity.getApplicationContext(), e.getConnectionStatusCode());
        } catch (GooglePlayServicesNotAvailableException | Exception e2) {
        }
    }
}
