package com.google.android.gms.internal.firebase_messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.TextUtils;

public final class zzr {
    @NonNull
    private final Context zzac;
    @NonNull
    private final zzz zzep;

    public zzr(@NonNull Context context, @NonNull zzz zzz) {
        this.zzac = context;
        this.zzep = zzz;
    }

    public final zzab zzax() {
        Builder builder = new Builder(this.zzac, this.zzep.getChannelId());
        builder.setAutoCancel(true);
        builder.setContentTitle(this.zzep.getTitle());
        builder.setContentIntent(this.zzep.zzbh());
        builder.setSmallIcon(this.zzep.zzbj().intValue());
        PendingIntent zzbi = this.zzep.zzbi();
        if (zzbi != null) {
            builder.setDeleteIntent(zzbi);
        }
        Uri sound = this.zzep.getSound();
        if (sound != null) {
            builder.setSound(sound);
        }
        CharSequence zzbf = this.zzep.zzbf();
        if (!TextUtils.isEmpty(zzbf)) {
            builder.setContentText(zzbf);
            builder.setStyle(new BigTextStyle().bigText(zzbf));
        }
        Integer zzbg = this.zzep.zzbg();
        if (zzbg != null) {
            builder.setColor(zzbg.intValue());
        }
        return new zzab(builder, this.zzep.getTag(), 0);
    }
}
