package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String stringExtra;
            try {
                stringExtra = intent.getStringExtra("referrer");
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
                stringExtra = null;
            }
            if (stringExtra != null) {
                if ("AppsFlyer_Test".equals(stringExtra) && intent.getStringExtra("TestIntegrationMode") != null) {
                    AppsFlyerLib.getInstance().m79(context, intent);
                    return;
                } else if (AppsFlyerLib.m57(context).getString("referrer", null) != null) {
                    AppsFlyerLib.getInstance();
                    AppsFlyerLib.m69(context, stringExtra);
                    return;
                }
            }
            AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
            AppsFlyerLib.getInstance().m79(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
                String action = intent.getAction();
                if (resolveInfo.activityInfo.packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(resolveInfo.activityInfo.name)) {
                    StringBuilder stringBuilder = new StringBuilder("trigger onReceive: class: ");
                    stringBuilder.append(resolveInfo.activityInfo.name);
                    AFLogger.afInfoLog(stringBuilder.toString());
                    try {
                        ((BroadcastReceiver) Class.forName(resolveInfo.activityInfo.name).newInstance()).onReceive(context, intent);
                    } catch (Throwable th2) {
                        StringBuilder stringBuilder2 = new StringBuilder("error in BroadcastReceiver ");
                        stringBuilder2.append(resolveInfo.activityInfo.name);
                        AFLogger.afErrorLog(stringBuilder2.toString(), th2);
                    }
                }
            }
        }
    }
}
