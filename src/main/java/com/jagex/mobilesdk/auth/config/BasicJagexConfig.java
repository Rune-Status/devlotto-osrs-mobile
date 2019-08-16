package com.jagex.mobilesdk.auth.config;

import android.net.Uri;

public class BasicJagexConfig implements JagexConfig {
    private final String clientId;
    private final String clientSecret;
    private final Uri issuerUri;
    private final String paymentUri;
    private final Uri redirectUri;
    private final String scope;
    private final String shopName;

    BasicJagexConfig(String str, String str2, String str3, Uri uri, Uri uri2, String str4, String str5) {
        this.clientId = str;
        this.clientSecret = str2;
        this.scope = str3;
        this.redirectUri = uri;
        this.issuerUri = uri2;
        this.shopName = str4;
        this.paymentUri = str5;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public Uri getIssuerUri() {
        return this.issuerUri;
    }

    public String getPaymentUri() {
        return this.paymentUri;
    }

    public Uri getRedirectUri() {
        return this.redirectUri;
    }

    public String getScope() {
        return this.scope;
    }

    public String getShopName() {
        return this.shopName;
    }
}
