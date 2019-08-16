package com.jagex.mobilesdk.auth.config;

import android.content.Context;
import android.content.res.Resources;
import com.jagex.mobilesdk.R;

public final class ResourceConfiguration {
    private ResourceConfiguration() {
        throw new UnsupportedOperationException();
    }

    public static JagexConfig createInstance(Context context) {
        Resources resources = context.getResources();
        return new JagexConfigBuilder(context).setClientId(resources.getString(R.string.com_jagex_mobilesdk_clientId)).setClientSecret(resources.getString(R.string.com_jagex_mobilesdk_clientSecret)).setScope(resources.getString(R.string.com_jagex_mobilesdk_scope)).setIssuerUri(resources.getString(R.string.com_jagex_mobilesdk_issuerUri)).setRedirectUri(resources.getString(R.string.com_jagex_mobilesdk_redirectUri)).setShopName(resources.getString(R.string.com_jagex_mobilesdk_shopname)).setPaymentUri(resources.getString(R.string.com_jagex_mobilesdk_paymentUri)).build();
    }
}
