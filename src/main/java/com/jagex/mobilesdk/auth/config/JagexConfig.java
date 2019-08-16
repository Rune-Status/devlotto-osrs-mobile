package com.jagex.mobilesdk.auth.config;

import android.net.Uri;
import android.support.annotation.NonNull;

public interface JagexConfig {
    @NonNull
    String getClientId();

    @NonNull
    String getClientSecret();

    @NonNull
    Uri getIssuerUri();

    @NonNull
    String getPaymentUri();

    @NonNull
    Uri getRedirectUri();

    @NonNull
    String getScope();

    @NonNull
    String getShopName();
}
