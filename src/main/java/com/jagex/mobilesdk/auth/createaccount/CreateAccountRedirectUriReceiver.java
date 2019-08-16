package com.jagex.mobilesdk.auth.createaccount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CreateAccountRedirectUriReceiver extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(CreateAccountManagementActivity.createResponseHandlingIntent(this, getIntent().getData()));
        finish();
    }
}
