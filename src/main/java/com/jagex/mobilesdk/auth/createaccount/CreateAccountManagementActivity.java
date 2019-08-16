package com.jagex.mobilesdk.auth.createaccount;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.AuthMessage;
import com.jagex.mobilesdk.auth.JagexCompatActivity;
import com.jagex.mobilesdk.common.comms.CommsResult;

public class CreateAccountManagementActivity extends JagexCompatActivity {
    private static final String ACCOUNT_ID_IDENTIFER = "id";
    private static final String APPS_FLYER_ACCOUNT_CREATE_CANCELLED = "af_account_creation_cancelled";
    private static final String APPS_FLYER_ACCOUNT_CREATE_COMPLETE = "af_account_creation_completed";
    static final String KEY_ACCOUNT_CREATE_STARTED = "accountCreationStarted";
    static final String KEY_ACCOUNT_CREATION_INTENT = "accountCreationIntent";
    private Intent mAccountCreationIntent;
    private boolean mCreateAccountStarted = false;

    private static Intent createBaseIntent(Context context) {
        return new Intent(context, CreateAccountManagementActivity.class);
    }

    public static Intent createResponseHandlingIntent(Context context, Uri uri) {
        Intent createBaseIntent = createBaseIntent(context);
        createBaseIntent.setData(uri);
        createBaseIntent.addFlags(603979776);
        return createBaseIntent;
    }

    public static Intent createStartIntent(Context context, Intent intent) {
        Intent createBaseIntent = createBaseIntent(context);
        createBaseIntent.putExtra(KEY_ACCOUNT_CREATION_INTENT, intent);
        return createBaseIntent;
    }

    private void extractState(Bundle bundle) {
        if (bundle == null) {
            finishWithError(CommsResult.RESULT_ACCOUNT_CREATION_ERROR, AuthMessage.GENERIC_ACCOUNT_CREATION_ERROR.getMessage(), null);
            return;
        }
        this.mAccountCreationIntent = (Intent) bundle.getParcelable(KEY_ACCOUNT_CREATION_INTENT);
        this.mCreateAccountStarted = bundle.getBoolean(KEY_ACCOUNT_CREATE_STARTED, false);
    }

    private void handleAuthorizationCanceled() {
        MobileAttributionService.sendEvent(this, APPS_FLYER_ACCOUNT_CREATE_CANCELLED, null);
        finish(0);
    }

    private void handleCreateAccountComplete() {
        MobileAttributionService.setUserID(getIntent().getData().getQueryParameter(ACCOUNT_ID_IDENTIFER));
        MobileAttributionService.sendEvent(this, APPS_FLYER_ACCOUNT_CREATE_COMPLETE, null);
        finish(-1);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            extractState(getIntent().getExtras());
        } else {
            extractState(bundle);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        if (!this.mCreateAccountStarted) {
            startActivity(this.mAccountCreationIntent);
            this.mCreateAccountStarted = true;
        } else if (getIntent().getData() != null) {
            handleCreateAccountComplete();
        } else {
            handleAuthorizationCanceled();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(KEY_ACCOUNT_CREATE_STARTED, this.mCreateAccountStarted);
        bundle.putParcelable(KEY_ACCOUNT_CREATION_INTENT, this.mAccountCreationIntent);
    }
}
