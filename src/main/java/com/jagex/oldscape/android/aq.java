package com.jagex.oldscape.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import defpackage.mv;

class aq extends BroadcastReceiver {
    final /* synthetic */ am this$0;

    aq(am amVar) {
        this.this$0 = amVar;
    }

    public void ad(Context context, Intent intent) {
        this.this$0.ai = intent.getIntExtra(Param.LEVEL, -1) * -1653309013;
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        am amVar = this.this$0;
        boolean z = intExtra == 2 || intExtra == 5;
        amVar.ae = z;
    }

    public void aq(Context context, Intent intent) {
        this.this$0.ai = intent.getIntExtra(Param.LEVEL, -1) * -1653309013;
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        am amVar = this.this$0;
        boolean z = intExtra == 2 || intExtra == 5;
        amVar.ae = z;
    }

    public void ar(Context context, Intent intent) {
        this.this$0.ai = intent.getIntExtra(Param.LEVEL, -1) * -1653309013;
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        am amVar = this.this$0;
        boolean z = intExtra == 2 || intExtra == 5;
        amVar.ae = z;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            this.this$0.ai = intent.getIntExtra(Param.LEVEL, -1) * -1653309013;
            int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            am amVar = this.this$0;
            boolean z = intExtra == 2 || intExtra == 5;
            amVar.ae = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/aq.onReceive(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
