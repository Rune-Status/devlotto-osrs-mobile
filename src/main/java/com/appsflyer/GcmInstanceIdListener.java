package com.appsflyer;

import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.google.android.gms.stats.CodePackage;

public class GcmInstanceIdListener extends InstanceIDListenerService {
    public void onTokenRefresh() {
        Object token;
        super.onTokenRefresh();
        String string = AppsFlyerProperties.getInstance().getString("gcmProjectNumber");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            token = InstanceID.getInstance(getApplicationContext()).getToken(string, CodePackage.GCM, null);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Error registering for uninstall tracking", th);
            token = null;
        }
        if (token != null) {
            AFLogger.afInfoLog("GCM Refreshed Token = ".concat(String.valueOf(token)));
            b ˏ = b.m91(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            b bVar = new b(currentTimeMillis, token);
            if (ˏ.m94(bVar)) {
                y.m204(getApplicationContext(), bVar);
            }
        }
    }
}
