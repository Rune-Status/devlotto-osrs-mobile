package com.jagex.mobilesdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.jagex.mobilesdk.auth.createaccount.AuthJagexCustomTabs;

public class MobileUtilsService {
    public void openBrowser(@NonNull Activity activity, Uri uri) {
        Intent intent = new AuthJagexCustomTabs(activity.getApplicationContext()).build().intent;
        intent.setData(uri);
        activity.startActivity(intent);
    }
}
