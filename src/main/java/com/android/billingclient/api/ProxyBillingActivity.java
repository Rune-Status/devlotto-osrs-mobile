package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import com.android.billingclient.util.BillingHelper;

public class ProxyBillingActivity extends Activity {
    private static final int REQUEST_CODE = 100;
    static final String RESPONSE_BUNDLE = "response_bundle_key";
    static final String RESPONSE_CODE = "response_code_key";
    static final String RESPONSE_INTENT_ACTION = "proxy_activity_response_intent_action";
    private static final String TAG = "ProxyBillingActivity";

    private void broadcastResult(int i, Bundle bundle) {
        Intent intent = new Intent(RESPONSE_INTENT_ACTION);
        intent.putExtra(RESPONSE_CODE, i);
        intent.putExtra(RESPONSE_BUNDLE, bundle);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder stringBuilder;
        if (i == 100) {
            int responseCodeFromIntent = BillingHelper.getResponseCodeFromIntent(intent, TAG);
            if (!(i2 == -1 && responseCodeFromIntent == 0)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Got purchases updated result with resultCode ");
                stringBuilder.append(i2);
                stringBuilder.append(" and billing's responseCode: ");
                stringBuilder.append(responseCodeFromIntent);
                BillingHelper.logWarn(TAG, stringBuilder.toString());
            }
            broadcastResult(responseCodeFromIntent, intent == null ? null : intent.getExtras());
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Got onActivityResult with wrong requestCode: ");
            stringBuilder.append(i);
            stringBuilder.append("; skipping...");
            BillingHelper.logWarn(TAG, stringBuilder.toString());
        }
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BillingHelper.logVerbose(TAG, "Launching Play Store billing flow");
        try {
            startIntentSenderForResult(((PendingIntent) getIntent().getParcelableExtra(BillingHelper.RESPONSE_BUY_INTENT)).getIntentSender(), 100, new Intent(), 0, 0, 0);
        } catch (SendIntentException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got exception while trying to start a purchase flow: ");
            stringBuilder.append(e);
            BillingHelper.logWarn(TAG, stringBuilder.toString());
            broadcastResult(6, null);
            finish();
        }
    }
}
