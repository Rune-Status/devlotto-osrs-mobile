package com.google.android.gms.internal.firebase_messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;

public final class zzaa extends zzz {
    private final zzs zzfb;
    private final zzq zzfc;

    public zzaa(zzs zzs, zzq zzq) {
        this.zzfb = zzs;
        this.zzfc = zzq;
    }

    private static Integer zzb(CharSequence charSequence) {
        try {
            return Integer.valueOf(Color.parseColor(String.valueOf(charSequence)));
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private final boolean zze(int i) {
        return i != 0 && this.zzfc.zza(this.zzfb.zzay(), i);
    }

    private final Intent zzr(String str) {
        return new Intent("android.intent.action.VIEW").setPackage(this.zzfb.getPackageName()).setData(Uri.parse(str));
    }

    private final String zzs(String str) {
        String string = this.zzfb.getData().getString(str);
        return string != null ? string : this.zzfb.getData().getString(str.replace("gcm.n.", "gcm.notification."));
    }

    private final String zzt(String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        valueOf2 = zzs(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(valueOf2)) {
            return null;
        }
        int identifier = this.zzfb.zzay().getIdentifier(valueOf2, "string", this.zzfb.getPackageName());
        String valueOf3;
        if (identifier == 0) {
            valueOf = this.zzfc.zzeo;
            valueOf3 = String.valueOf(str);
            valueOf2 = String.valueOf("_loc_key");
            valueOf2 = (valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3)).substring(6);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 49) + String.valueOf(str).length());
            stringBuilder.append(valueOf2);
            stringBuilder.append(" resource not found: ");
            stringBuilder.append(str);
            stringBuilder.append(" Default value will be used.");
            Log.w(valueOf, stringBuilder.toString());
            return null;
        }
        String[] zzn = this.zzfc.zzn(str);
        if (zzn == null) {
            return this.zzfb.zzay().getString(identifier);
        }
        try {
            return this.zzfb.zzay().getString(identifier, zzn);
        } catch (MissingFormatArgumentException e) {
            valueOf3 = this.zzfc.zzeo;
            valueOf = Arrays.toString(zzn);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 58) + String.valueOf(valueOf).length());
            stringBuilder2.append("Missing format argument for ");
            stringBuilder2.append(str);
            stringBuilder2.append(": ");
            stringBuilder2.append(valueOf);
            stringBuilder2.append(" Default value will be used.");
            Log.w(valueOf3, stringBuilder2.toString(), e);
            return null;
        }
    }

    @Nullable
    public final String getChannelId() {
        if (!PlatformVersion.isAtLeastO() || this.zzfb.zzbc() < 26) {
            return null;
        }
        String zzs = zzs("gcm.n.android_channel_id");
        if (this.zzfb.zzl(zzs)) {
            return zzs;
        }
        if (!TextUtils.isEmpty("com.google.firebase.messaging.default_notification_channel_id")) {
            zzs = this.zzfb.zzaz().getString("com.google.firebase.messaging.default_notification_channel_id");
            if (this.zzfb.zzl(zzs)) {
                return zzs;
            }
        }
        zzs = this.zzfb.zzat();
        return this.zzfb.zzl(zzs) ? zzs : null;
    }

    @Nullable
    public final Uri getSound() {
        CharSequence zzs = zzs("gcm.n.sound2");
        if (TextUtils.isEmpty(zzs)) {
            zzs = zzs("gcm.n.sound");
        }
        if (TextUtils.isEmpty(zzs)) {
            return null;
        }
        Uri uri;
        if (TextUtils.isEmpty(zzs)) {
            uri = null;
        } else {
            if (!"default".equals(zzs)) {
                if ((this.zzfb.zzay().getIdentifier(zzs, "raw", this.zzfb.getPackageName()) != 0 ? 1 : null) != null) {
                    String packageName = this.zzfb.getPackageName();
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(packageName).length() + 24) + String.valueOf(zzs).length());
                    stringBuilder.append("android.resource://");
                    stringBuilder.append(packageName);
                    stringBuilder.append("/raw/");
                    stringBuilder.append(zzs);
                    uri = Uri.parse(stringBuilder.toString());
                }
            }
            uri = RingtoneManager.getDefaultUri(2);
        }
        return uri == null ? RingtoneManager.getDefaultUri(2) : uri;
    }

    @Nullable
    public final String getTag() {
        String zzs = zzs("gcm.n.tag");
        if (!TextUtils.isEmpty(zzs)) {
            return zzs;
        }
        zzs = this.zzfb.zzbd();
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzs).length() + 21);
        stringBuilder.append(zzs);
        stringBuilder.append(":");
        stringBuilder.append(uptimeMillis);
        return stringBuilder.toString();
    }

    @Nullable
    public final CharSequence getTitle() {
        String zzs = zzs("gcm.n.title");
        if (!TextUtils.isEmpty(zzs)) {
            return zzs;
        }
        zzs = zzt("gcm.n.title");
        if (!TextUtils.isEmpty(zzs)) {
            return zzs;
        }
        CharSequence appLabel = this.zzfb.getAppLabel();
        return TextUtils.isEmpty(appLabel) ? "" : appLabel;
    }

    @Nullable
    public final CharSequence zzbf() {
        String zzs = zzs("gcm.n.body");
        if (!TextUtils.isEmpty(zzs)) {
            return zzs;
        }
        zzs = zzt("gcm.n.body");
        return TextUtils.isEmpty(zzs) ? null : zzs;
    }

    @Nullable
    public final Integer zzbg() {
        Integer zzb;
        String zzs = zzs("gcm.n.color");
        if (!TextUtils.isEmpty(zzs)) {
            zzb = zzb(zzs);
            if (zzb != null) {
                return zzb;
            }
        }
        if (!TextUtils.isEmpty("com.google.firebase.messaging.default_notification_color")) {
            int i = this.zzfb.zzaz().getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                zzb = this.zzfb.zzb(i);
                if (zzb != null) {
                    return zzb;
                }
            }
        }
        return null;
    }

    @Nullable
    public final PendingIntent zzbh() {
        Intent zzr;
        String zzs = zzs("gcm.n.click_action");
        if (TextUtils.isEmpty(zzs)) {
            zzs = zzs("gcm.n.link_android");
            if (TextUtils.isEmpty(zzs)) {
                zzs = zzs("gcm.n.link");
                zzr = !TextUtils.isEmpty(zzs) ? zzr(zzs) : this.zzfb.zzba();
            } else {
                zzr = zzr(zzs);
            }
        } else {
            zzr = new Intent(zzs).setPackage(this.zzfb.getPackageName()).setFlags(268435456);
        }
        if (zzr == null) {
            return null;
        }
        zzr.addFlags(67108864);
        Bundle bundle = new Bundle(this.zzfb.getData());
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            zzs = (String) it.next();
            if (zzs != null && (zzs.startsWith("google.c.") || zzs.startsWith("gcm.n.") || zzs.startsWith("gcm.notification."))) {
                it.remove();
            }
        }
        zzr.putExtras(bundle);
        return this.zzfb.zze(zzr);
    }

    @Nullable
    public final PendingIntent zzbi() {
        return this.zzfb.zzau();
    }

    @Nullable
    public final Integer zzbj() {
        int i;
        String zzs = zzs("gcm.n.icon");
        if (!TextUtils.isEmpty(zzs)) {
            for (i = 0; i < 2; i++) {
                int identifier = this.zzfb.zzay().getIdentifier(zzs, new String[]{"drawable", "mipmap"}[i], this.zzfb.getPackageName());
                if (zze(identifier)) {
                    return Integer.valueOf(identifier);
                }
            }
            String str = this.zzfc.zzeo;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzs).length() + 61);
            stringBuilder.append("Icon resource ");
            stringBuilder.append(zzs);
            stringBuilder.append(" not found. Notification will use default icon.");
            Log.w(str, stringBuilder.toString());
        }
        if (!TextUtils.isEmpty("com.google.firebase.messaging.default_notification_icon")) {
            i = this.zzfb.zzaz().getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (zze(i)) {
                return Integer.valueOf(i);
            }
        }
        i = this.zzfb.zzbb();
        return zze(i) ? Integer.valueOf(i) : Integer.valueOf(17301651);
    }
}
