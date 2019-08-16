package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.IOException;
import java.util.concurrent.Executor;

final class zzr implements MessagingChannel {
    private final Executor executor;
    private final FirebaseApp zzar;
    private final zzan zzas;
    private final zzat zzbm;
    private final UserAgentPublisher zzbn;

    @VisibleForTesting
    private zzr(FirebaseApp firebaseApp, zzan zzan, Executor executor, zzat zzat, UserAgentPublisher userAgentPublisher) {
        this.zzar = firebaseApp;
        this.zzas = zzan;
        this.zzbm = zzat;
        this.executor = executor;
        this.zzbn = userAgentPublisher;
    }

    zzr(FirebaseApp firebaseApp, zzan zzan, Executor executor, UserAgentPublisher userAgentPublisher) {
        this(firebaseApp, zzan, executor, new zzat(firebaseApp.getApplicationContext(), zzan), userAgentPublisher);
    }

    private final Task<Bundle> zza(String str, String str2, String str3, Bundle bundle) {
        bundle.putString(CommsUtils.HTTP_PARAM_SCOPE, str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(AppsFlyerProperties.APP_ID, str);
        bundle.putString("gmp_app_id", this.zzar.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.zzas.zzaf()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.zzas.zzad());
        bundle.putString("app_ver_name", this.zzas.zzae());
        bundle.putString("cliv", "fiid-12451000");
        bundle.putString("Firebase-Client", this.zzbn.getUserAgent());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new zzs(this, bundle, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private static String zza(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string == null) {
                string = bundle.getString("unregistered");
                if (string == null) {
                    string = bundle.getString("error");
                    if ("RST".equals(string)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    } else if (string != null) {
                        throw new IOException(string);
                    } else {
                        string = String.valueOf(bundle);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(string).length() + 21);
                        stringBuilder.append("Unexpected response: ");
                        stringBuilder.append(string);
                        Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                }
            }
            return string;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final <T> Task<Void> zzb(Task<T> task) {
        return task.continueWith(zzi.zzf(), new zzt(this));
    }

    private final Task<String> zzc(Task<Bundle> task) {
        return task.continueWith(this.executor, new zzu(this));
    }

    public final Task<Void> ackMessage(String str) {
        return null;
    }

    public final Task<Void> buildChannel(String str, String str2) {
        return Tasks.forResult(null);
    }

    public final Task<Void> deleteInstanceId(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return zzb(zzc(zza(str, "*", "*", bundle)));
    }

    public final Task<Void> deleteToken(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return zzb(zzc(zza(str, str3, str4, bundle)));
    }

    public final Task<String> getToken(String str, String str2, String str3, String str4) {
        return zzc(zza(str, str3, str4, new Bundle()));
    }

    public final boolean isAvailable() {
        return this.zzas.zzac() != 0;
    }

    public final boolean isChannelBuilt() {
        return true;
    }

    public final boolean needsRefresh() {
        return false;
    }

    public final Task<Void> subscribeToTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        valueOf = String.valueOf("/topics/");
        valueOf2 = String.valueOf(str3);
        return zzb(zzc(zza(str, str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), bundle)));
    }

    public final Task<Void> unsubscribeFromTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        valueOf = String.valueOf("/topics/");
        valueOf2 = String.valueOf(str3);
        return zzb(zzc(zza(str, str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), bundle)));
    }
}
