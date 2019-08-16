package com.google.android.gms.internal.firebase_messaging;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzp implements zzy {
    private static final AtomicInteger zzel = new AtomicInteger((int) SystemClock.elapsedRealtime());
    private final Context zzac;
    private final Bundle zzem;
    private final boolean zzen;

    public zzp(Context context, Bundle bundle) {
        this.zzac = context;
        this.zzem = bundle;
        boolean z = bundle != null && "1".equals(bundle.getString("google.c.a.e"));
        this.zzen = z;
    }

    private static PendingIntent zza(Context context, int i, Intent intent) {
        return PendingIntent.getBroadcast(context, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    private static Bundle zzh(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                bundle2.putString(str, bundle.getString(str));
            }
        }
        return bundle2;
    }

    @Nullable
    public final PendingIntent zzau() {
        if (!this.zzen) {
            return null;
        }
        return zza(this.zzac, zzel.incrementAndGet(), new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(zzh(this.zzem)));
    }

    public final PendingIntent zze(Intent intent) {
        PendingIntent activity = PendingIntent.getActivity(this.zzac, zzel.incrementAndGet(), intent, 1073741824);
        if (!this.zzen) {
            return activity;
        }
        return zza(this.zzac, zzel.incrementAndGet(), new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(zzh(this.zzem)).putExtra("pending_intent", activity));
    }
}
