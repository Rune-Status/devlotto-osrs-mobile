package com.jagex.mobilesdk.notifications;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.jagex.mobilesdk.common.comms.CommsResult;

public class MobileNotificationService extends FirebaseMessagingService {
    public static void getLatestDeviceToken(final MobileNotificationServiceListener mobileNotificationServiceListener) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
            public void onComplete(@NonNull Task<InstanceIdResult> task) {
                if (task.isSuccessful()) {
                    mobileNotificationServiceListener.onResult(new CommsResult(((InstanceIdResult) task.getResult()).getToken(), 0));
                } else {
                    mobileNotificationServiceListener.onResult(new CommsResult("", -1));
                }
            }
        });
    }

    public static void initPushNotificationService(Context context) {
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
        FirebaseAnalytics.getInstance(context).setAnalyticsCollectionEnabled(true);
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onNewToken(String str) {
    }
}
