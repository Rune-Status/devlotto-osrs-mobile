package com.jagex.oldscape.android;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.notifications.MobileNotificationServiceListener;
import defpackage.mv;

class as implements MobileNotificationServiceListener {
    static final String ad = "oldschool";
    static final String al = "com.jagex.mobilesdk.android.osrs:/oauth2redirect";
    final /* synthetic */ ag this$0;

    as(ag agVar) {
        this.this$0 = agVar;
    }

    public void ad(CommsResult commsResult) {
        CharSequence charSequence = "There was a problem retrieving the device token";
        if (commsResult.responseCode == 0) {
            ((ClipboardManager) this.this$0.aj.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Device Token", (CharSequence) commsResult.getResultValue()));
            charSequence = "Device token has been copied to your clipboard";
        }
        Toast.makeText(this.this$0.aj, charSequence, 0).show();
    }

    public void onResult(CommsResult commsResult) {
        CharSequence charSequence = "There was a problem retrieving the device token";
        try {
            if (commsResult.responseCode == 0) {
                ((ClipboardManager) this.this$0.aj.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Device Token", (CharSequence) commsResult.getResultValue()));
                charSequence = "Device token has been copied to your clipboard";
            }
            Toast.makeText(this.this$0.aj, charSequence, 0).show();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/as.onResult(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
