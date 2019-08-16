package com.jagex.mobilesdk.notifications;

import com.jagex.mobilesdk.common.comms.CommsResult;

public interface MobileNotificationServiceListener<T> {
    void onResult(CommsResult<T> commsResult);
}
