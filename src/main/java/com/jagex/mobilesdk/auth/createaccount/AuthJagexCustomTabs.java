package com.jagex.mobilesdk.auth.createaccount;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.support.annotation.NonNull;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import com.jagex.mobilesdk.R;

public class AuthJagexCustomTabs {
    private Builder customTab = new Builder();
    private int mBrowserHeaderColor = -13619152;

    public AuthJagexCustomTabs(@NonNull Context context) {
        this.customTab.setToolbarColor(this.mBrowserHeaderColor);
        this.customTab.setSecondaryToolbarColor(this.mBrowserHeaderColor);
        Options options = new Options();
        options.outWidth = 24;
        options.outHeight = 24;
        options.inScaled = true;
        this.customTab.setCloseButtonIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_arrow_back, options));
    }

    public CustomTabsIntent build() {
        return this.customTab.build();
    }
}
