package com.jagex.mobilesdk.federatedLogin;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.config.JagexConfig;

public class FederatedLoginService {
    public static final String EXTRA_FEDERATED_LOGIN_CONFIG;
    public static final String EXTRA_ONE_TIME_LOGIN_TOKEN;
    private static final String PACKAGE_NAME = FederatedLoginService.class.getPackage().getName();
    private final JagexConfig config;
    private final String googleClientID;
    private final String packageId;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".ONE_TIME_LOGIN_TOKEN");
        EXTRA_ONE_TIME_LOGIN_TOKEN = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".CONFIG");
        EXTRA_FEDERATED_LOGIN_CONFIG = stringBuilder.toString();
    }

    public FederatedLoginService(@NonNull JagexConfig jagexConfig, String str, String str2) {
        this.config = jagexConfig;
        this.googleClientID = str;
        this.packageId = str2;
    }

    public void authenticateWithGooglePlay(@NonNull Activity activity) {
        activity.startActivityForResult(new Intent(activity, FederatedLoginActivity.class).putExtra(EXTRA_FEDERATED_LOGIN_CONFIG, new FederatedLoginParcel(this.packageId, this.googleClientID, this.config.getIssuerUri())).addFlags(65536), MobileAuthServiceListener.REQUEST_GOOGLE_LOGIN);
    }
}
