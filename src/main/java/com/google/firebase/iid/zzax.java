package com.google.firebase.iid;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement.Param;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class zzax {
    private static final long zzdk = TimeUnit.DAYS.toMillis(7);
    private final long timestamp;
    final String zzbu;
    private final String zzdl;

    private zzax(String str, String str2, long j) {
        this.zzbu = str;
        this.zzdl = str2;
        this.timestamp = j;
    }

    static String zza(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CommsUtils.HTTP_PARAM_TOKEN, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(Param.TIMESTAMP, j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("Failed to encode token: ");
            stringBuilder.append(valueOf);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    static String zzb(@Nullable zzax zzax) {
        return zzax == null ? null : zzax.zzbu;
    }

    static zzax zzi(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new zzax(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzax(jSONObject.getString(CommsUtils.HTTP_PARAM_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(Param.TIMESTAMP));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("Failed to parse token: ");
            stringBuilder.append(valueOf);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zzj(String str) {
        return System.currentTimeMillis() > this.timestamp + zzdk || !str.equals(this.zzdl);
    }
}
