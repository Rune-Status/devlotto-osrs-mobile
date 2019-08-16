package com.jagex.mobilesdk.auth.config;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.jagex.mobilesdk.common.comms.CommsUtils;

public class JagexConfigBuilder {
    private String clientId;
    private String clientSecret;
    private final Context context;
    private String issuerUri;
    private String paymentUri;
    private String redirectUri;
    private String scope;
    private String shopName;

    public JagexConfigBuilder(Context context) {
        this.context = context;
    }

    private boolean isEmptyString(String str) {
        return str == null || str.trim().isEmpty();
    }

    private boolean isRedirectUriRegistered(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName()).setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(uri);
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ 1;
    }

    private void validateConfigField(StringBuilder stringBuilder, String str, String str2) {
        if (isEmptyString(str2)) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(str);
        }
    }

    public JagexConfig build() throws InvalidConfigurationException {
        StringBuilder stringBuilder = new StringBuilder();
        validateConfigField(stringBuilder, "clientId", this.clientId);
        validateConfigField(stringBuilder, "clientSecret", this.clientSecret);
        validateConfigField(stringBuilder, CommsUtils.HTTP_PARAM_SCOPE, this.scope);
        validateConfigField(stringBuilder, "redirectUri", this.redirectUri);
        validateConfigField(stringBuilder, "issuerUri", this.issuerUri);
        validateConfigField(stringBuilder, "shopName", this.shopName);
        validateConfigField(stringBuilder, "paymentUri", this.paymentUri);
        if (stringBuilder.length() <= 0) {
            BasicJagexConfig basicJagexConfig = new BasicJagexConfig(this.clientId, this.clientSecret, this.scope, Uri.parse(this.redirectUri), Uri.parse(this.issuerUri), this.shopName, this.paymentUri);
            if (isRedirectUriRegistered(this.context, basicJagexConfig.getRedirectUri())) {
                return basicJagexConfig;
            }
            throw new InvalidConfigurationException("com_jagex_mobilesdk_redirectUri is not handled by any activity in this app.\nEnsure that the android:scheme in your AndroidManifest.xml intent-filter is set correctly");
        }
        stringBuilder.insert(0, "The following config fields were empty:");
        throw new InvalidConfigurationException(stringBuilder.toString());
    }

    public JagexConfigBuilder setClientId(String str) {
        this.clientId = str;
        return this;
    }

    public JagexConfigBuilder setClientSecret(String str) {
        this.clientSecret = str;
        return this;
    }

    public JagexConfigBuilder setIssuerUri(String str) {
        this.issuerUri = str;
        return this;
    }

    public JagexConfigBuilder setPaymentUri(String str) {
        this.paymentUri = str;
        return this;
    }

    public JagexConfigBuilder setRedirectUri(String str) {
        this.redirectUri = str;
        return this;
    }

    public JagexConfigBuilder setScope(String str) {
        this.scope = str;
        return this;
    }

    public JagexConfigBuilder setShopName(String str) {
        this.shopName = str;
        return this;
    }
}
