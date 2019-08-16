package com.appsflyer;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIdListener extends FirebaseInstanceIdService {
    public void onTokenRefresh() {
        Object token;
        super.onTokenRefresh();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            token = FirebaseInstanceId.getInstance().getToken();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Error registering for uninstall tracking", th);
            token = null;
        }
        if (token != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(token)));
            b ˏ = b.m91(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            b bVar = new b(currentTimeMillis, token);
            if (ˏ.m94(bVar)) {
                y.m204(getApplicationContext(), bVar);
            }
        }
    }
}
