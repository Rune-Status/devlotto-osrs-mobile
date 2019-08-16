package com.jagex.mobilesdk.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat.Builder;

public class LocalNotificationScheduler extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Notification notification = (Notification) intent.getParcelableExtra(LocalNotificationsManager.NOTIFICATION);
        if (notification != null) {
            notificationManager.notify(intent.getIntExtra(LocalNotificationsManager.NOTIFICATION_ID, 0), notification);
            int intExtra = intent.getIntExtra(LocalNotificationsManager.GROUP_ID, -1);
            if (intExtra > -1) {
                String stringExtra = intent.getStringExtra(LocalNotificationsManager.GROUP_NAME);
                if (stringExtra != null) {
                    notificationManager.notify(intExtra, new Builder(context, LocalNotificationsManager.CHANNEL_ID).setContentIntent(notification.contentIntent).setSmallIcon(context.getApplicationInfo().icon).setGroup(stringExtra).setGroupSummary(true).setAutoCancel(true).build());
                }
            }
        }
    }
}
