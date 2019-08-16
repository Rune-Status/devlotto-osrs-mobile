package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics.Param;

final class c {
    /* renamed from: ˋ */
    private IntentFilter f128 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static final class a {
        /* renamed from: ˏ */
        static final c f125 = new c();
    }

    static final class d {
        /* renamed from: ˊ */
        private final float f126;
        /* renamed from: ˎ */
        private final String f127;

        d() {
        }

        d(float f, String str) {
            this.f126 = f;
            this.f127 = str;
        }

        /* Access modifiers changed, original: final */
        /* renamed from: ˎ */
        public final String m109() {
            return this.f127;
        }

        /* Access modifiers changed, original: final */
        /* renamed from: ˏ */
        public final float m110() {
            return this.f126;
        }
    }

    c() {
    }

    /* Access modifiers changed, original: final */
    @NonNull
    /* renamed from: ˎ */
    public final d m111(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.f128);
            if (registerReceiver != null) {
                if ((2 == registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) ? 1 : null) != null) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 4) {
                        switch (intExtra) {
                            case 1:
                                str = "ac";
                                break;
                            case 2:
                                str = "usb";
                                break;
                            default:
                                str = "other";
                                break;
                        }
                    }
                    str = "wireless";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra(Param.LEVEL, -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable th) {
        }
        return new d(f, str);
    }
}
