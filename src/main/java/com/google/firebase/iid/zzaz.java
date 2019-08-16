package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;

@VisibleForTesting
final class zzaz extends BroadcastReceiver {
    @Nullable
    private zzay zzdp;

    public zzaz(zzay zzay) {
        this.zzdp = zzay;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.zzdp != null && this.zzdp.zzan()) {
            if (FirebaseInstanceId.zzm()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.zza(this.zzdp, 0);
            this.zzdp.getContext().unregisterReceiver(this);
            this.zzdp = null;
        }
    }

    public final void zzao() {
        if (FirebaseInstanceId.zzm()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.zzdp.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
