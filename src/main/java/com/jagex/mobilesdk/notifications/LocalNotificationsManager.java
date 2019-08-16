package com.jagex.mobilesdk.notifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationManagerCompat;
import defpackage.ol;
import java.util.Random;

public class LocalNotificationsManager {
    private static final String CHANNEL_DESCRIPTION = "Channel for Game notifications";
    public static final String CHANNEL_ID = "GameNotifications";
    private static final String CHANNEL_NAME = "Game Notifications";
    public static final int DEFAULT_GROUP_ID = -1;
    public static final String GROUP_ID = "Group ID";
    public static final String GROUP_NAME = "Group Name";
    public static final String NOTIFICATION = "Notification";
    public static final String NOTIFICATION_ID = "Notification ID";
    private static final int NO_NOTIFICATION_ID = -1;
    private static final Random randomNumberGenerator = new Random();
    private final Activity activity;

    public LocalNotificationsManager(@NonNull Activity activity) {
        this.activity = activity;
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, 3);
            notificationChannel.setDescription(CHANNEL_DESCRIPTION);
            ((NotificationManager) activity.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private Builder createGroupedNotificationBuilder(String str, String str2, int i, String str3) {
        return new Builder(this.activity, CHANNEL_ID).setContentIntent(createLaunchActivityIntent()).setSmallIcon(this.activity.getApplicationInfo().icon).setContentTitle(str).setContentText(str2).setPriority(i).setGroup(str3).setAutoCancel(true);
    }

    private PendingIntent createLaunchActivityIntent() {
        Intent intent = new Intent(this.activity, this.activity.getClass());
        intent.setFlags(ol.ae);
        return PendingIntent.getActivity(this.activity, 0, intent, 134217728);
    }

    private Notification createNotification(String str, String str2, int i, int i2) {
        return new Builder(this.activity, CHANNEL_ID).setContentIntent(createLaunchActivityIntent()).setSmallIcon(this.activity.getApplicationInfo().icon).setContentTitle(str).setContentText(str2).setPriority(i).setGroup(Integer.toString(i2)).setAutoCancel(true).build();
    }

    public void cancelNotification(int i) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.activity, i, new Intent(this.activity, LocalNotificationScheduler.class), ol.ae);
        if (broadcast != null) {
            broadcast.cancel();
            ((AlarmManager) this.activity.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(broadcast);
        }
    }

    public boolean isNotificationScheduled(int i) {
        return PendingIntent.getBroadcast(this.activity, i, new Intent(this.activity, LocalNotificationScheduler.class), ol.ae) != null;
    }

    public void openNotificationSettings(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        activity.startActivity(intent);
    }

    public int sendGroupedNotification(String str, String str2, int i, int i2, String str3, int i3) {
        int i4 = -2;
        int nextInt = randomNumberGenerator.nextInt(Integer.MAX_VALUE);
        if (i >= -2) {
            i4 = i;
        }
        if (i4 > 2) {
            i4 = 2;
        }
        if (i2 <= -1) {
            return -1;
        }
        if (i3 == 0) {
            NotificationManagerCompat from = NotificationManagerCompat.from(this.activity);
            from.notify(nextInt, createGroupedNotificationBuilder(str, str2, i4, str3).build());
            from.notify(i2, createGroupedNotificationBuilder(str, str2, i4, str3).setContentTitle(str).setContentText(str2).setGroupSummary(true).build());
            return nextInt;
        } else if (i3 <= 0) {
            return -1;
        } else {
            Intent intent = new Intent(this.activity, LocalNotificationScheduler.class);
            intent.putExtra(NOTIFICATION_ID, nextInt);
            intent.putExtra(NOTIFICATION, createGroupedNotificationBuilder(str, str2, i4, str3).build());
            intent.putExtra(GROUP_ID, i2);
            intent.putExtra(GROUP_NAME, str3);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.activity, nextInt, intent, 134217728);
            if (broadcast != null) {
                ((AlarmManager) this.activity.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(2, SystemClock.elapsedRealtime() + ((long) (i3 * 1000)), broadcast);
            }
            return nextInt;
        }
    }

    public int sendNotification(String str, String str2, int i, int i2) {
        int i3 = -2;
        int nextInt = randomNumberGenerator.nextInt(Integer.MAX_VALUE);
        if (i >= -2) {
            i3 = i;
        }
        if (i3 > 2) {
            i3 = 2;
        }
        if (i2 == 0) {
            NotificationManagerCompat.from(this.activity).notify(nextInt, createNotification(str, str2, i3, nextInt));
            return nextInt;
        } else if (i2 <= 0) {
            return -1;
        } else {
            Intent intent = new Intent(this.activity, LocalNotificationScheduler.class);
            intent.putExtra(NOTIFICATION_ID, nextInt);
            intent.putExtra(NOTIFICATION, createNotification(str, str2, i3, nextInt));
            PendingIntent broadcast = PendingIntent.getBroadcast(this.activity, nextInt, intent, 134217728);
            if (broadcast != null) {
                ((AlarmManager) this.activity.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(2, SystemClock.elapsedRealtime() + ((long) (i2 * 1000)), broadcast);
            }
            return nextInt;
        }
    }
}
