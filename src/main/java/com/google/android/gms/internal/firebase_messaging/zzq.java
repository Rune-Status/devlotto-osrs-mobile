package com.google.android.gms.internal.firebase_messaging;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzq {
    private final Bundle zzcl;
    final String zzeo;

    public zzq(String str, Bundle bundle) {
        this.zzeo = (String) Preconditions.checkNotNull(str);
        this.zzcl = (Bundle) Preconditions.checkNotNull(bundle);
    }

    @Nullable
    private final String zza(String... strArr) {
        for (String string : strArr) {
            String string2 = getString(string2);
            if (!TextUtils.isEmpty(string2)) {
                return string2;
            }
        }
        return null;
    }

    private final Object[] zzo(String str) {
        Bundle bundle = this.zzcl;
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_args");
        valueOf = zzac.zza(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(valueOf);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException e) {
            String str2 = this.zzeo;
            String valueOf3 = String.valueOf(str);
            valueOf2 = String.valueOf("_loc_args");
            valueOf2 = (valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3)).substring(6);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 41) + String.valueOf(valueOf).length());
            stringBuilder.append("Malformed ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            stringBuilder.append("  Default value will be used.");
            Log.w(str2, stringBuilder.toString());
            return null;
        }
    }

    public final String getString(String str) {
        return zzac.zza(this.zzcl, str);
    }

    /* Access modifiers changed, original: final */
    @TargetApi(26)
    public final boolean zza(Resources resources, int i) {
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        String str;
        StringBuilder stringBuilder;
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            str = this.zzeo;
            stringBuilder = new StringBuilder(77);
            stringBuilder.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            stringBuilder.append(i);
            Log.e(str, stringBuilder.toString());
            return false;
        } catch (NotFoundException e) {
            str = this.zzeo;
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Couldn't find resource ");
            stringBuilder.append(i);
            stringBuilder.append(", treating it as an invalid icon");
            Log.e(str, stringBuilder.toString());
            return false;
        }
    }

    public final String zzav() {
        return zza("gcm.n.sound2", "gcm.n.sound");
    }

    @Nullable
    public final Uri zzaw() {
        String zza = zza("gcm.n.link_android", "gcm.n.link");
        return TextUtils.isEmpty(zza) ? null : Uri.parse(zza);
    }

    public final String[] zzn(String str) {
        Object[] zzo = zzo(str);
        if (zzo == null) {
            return null;
        }
        String[] strArr = new String[zzo.length];
        for (int i = 0; i < zzo.length; i++) {
            strArr[i] = String.valueOf(zzo[i]);
        }
        return strArr;
    }

    public final String zzp(String str) {
        Bundle bundle = this.zzcl;
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        return zzac.zza(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
