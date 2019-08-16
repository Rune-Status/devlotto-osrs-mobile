package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.appsflyer.AFExecutor.3.AnonymousClass5;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.iid.FirebaseInstanceIdService;
import java.lang.ref.WeakReference;

final class y {

    static final class a extends AsyncTask<Void, Void, String> {
        /* renamed from: ˊ */
        private String f271;
        /* renamed from: ˏ */
        private final WeakReference<Context> f272;

        a(WeakReference<Context> weakReference) {
            this.f272 = weakReference;
        }

        /* renamed from: ˋ */
        private String m200() {
            try {
                return this.f271 != null ? y.m201(this.f272, this.f271) : null;
            } catch (Throwable th) {
                AFLogger.afErrorLog("Error registering for uninstall feature", th);
                return null;
            }
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m200();
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                String string = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                b bVar = new b(str);
                if (string == null) {
                    y.m204((Context) this.f272.get(), bVar);
                    return;
                }
                b ˏ = b.m91(string);
                if (ˏ.m94(bVar)) {
                    y.m204((Context) this.f272.get(), ˏ);
                }
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void onPreExecute() {
            super.onPreExecute();
            this.f271 = AppsFlyerProperties.getInstance().getString("gcmProjectNumber");
        }
    }

    y() {
    }

    /* renamed from: ˊ */
    private static String m201(WeakReference<Context> weakReference, String str) {
        try {
            Class cls = Class.forName("com.google.android.gms.iid.InstanceID");
            Class.forName("com.google.android.gms.gcm.GcmReceiver");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{weakReference.get()});
            String str2 = (String) cls.getDeclaredMethod("getToken", new Class[]{String.class, String.class}).invoke(invoke, new Object[]{str, CodePackage.GCM});
            if (str2 != null) {
                return str2;
            }
            AFLogger.afWarnLog("Couldn't get token using reflection.");
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't get token using GoogleCloudMessaging. ", th);
            return null;
        }
    }

    /* renamed from: ˋ */
    static boolean m202(Context context) {
        return m203(context) | m205(context);
    }

    /* renamed from: ˎ */
    private static boolean m203(Context context) {
        if (AppsFlyerLib.getInstance().isTrackingStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.android.gms.iid.InstanceIDListenerService");
            Intent intent = new Intent("com.google.android.gms.iid.InstanceID", null, context, GcmInstanceIdListener.class);
            Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID", null, context, InstanceIDListenerService.class);
            if (!(context.getPackageManager().queryIntentServices(intent, 0).size() > 0)) {
                if (!(context.getPackageManager().queryIntentServices(intent2, 0).size() > 0)) {
                    return false;
                }
            }
            if (context.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.c2dm.intent.RECEIVE", null, context, Class.forName("com.google.android.gms.gcm.GcmReceiver")), 0).size() > 0) {
                String packageName = context.getPackageName();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(packageName);
                stringBuilder.append(".permission.C2D_MESSAGE");
                if (AnonymousClass5.m7(context, stringBuilder.toString())) {
                    return true;
                }
                AFLogger.afWarnLog("Cannot verify existence of the app's \"permission.C2D_MESSAGE\" permission in the manifest. Please refer to documentation.");
                return false;
            }
            AFLogger.afWarnLog("Cannot verify existence of GcmReceiver receiver in the manifest. Please refer to documentation.");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afRDLog(e.getMessage());
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
            return false;
        }
    }

    /* renamed from: ॱ */
    static void m204(Context context, b bVar) {
        StringBuilder stringBuilder = new StringBuilder("updateServerUninstallToken called with: ");
        stringBuilder.append(bVar.toString());
        AFLogger.afInfoLog(stringBuilder.toString());
        b ˏ = b.m91(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
        if (!AppsFlyerLib.m57(context).getBoolean("sentRegisterRequestToAF", false) || ˏ.m93() == null || !ˏ.m93().equals(bVar.m93())) {
            AppsFlyerProperties.getInstance().set("afUninstallToken", bVar.toString());
            AppsFlyerLib.getInstance().m75(context, bVar.m93());
        }
    }

    /* renamed from: ॱ */
    private static boolean m205(Context context) {
        if (AppsFlyerLib.getInstance().isTrackingStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdService");
            Intent intent = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, context, FirebaseInstanceIdListener.class);
            Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, context, FirebaseInstanceIdService.class);
            if (context.getPackageManager().queryIntentServices(intent, 0).size() > 0) {
                return true;
            }
            if (context.getPackageManager().queryIntentServices(intent2, 0).size() > 0) {
                return true;
            }
            AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
            return false;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
            return false;
        }
    }
}
