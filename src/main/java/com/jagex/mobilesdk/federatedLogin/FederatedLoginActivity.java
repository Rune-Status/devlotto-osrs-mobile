package com.jagex.mobilesdk.federatedLogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.AuthMessage;
import com.jagex.mobilesdk.auth.JagexCompatActivity;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import com.jagex.mobilesdk.federatedLogin.comms.FederatedComms;
import com.jagex.mobilesdk.federatedLogin.comms.FederatedComms.PerformFederatedCallback;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginRequest;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginResponse;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;
import java.util.HashMap;

public class FederatedLoginActivity extends JagexCompatActivity {
    public static final String DOB_SCOPE = "https://www.googleapis.com/auth/user.birthday.read";
    public static final String googleEndpoint = "/google/v1/login/silent";
    private String googleClientID;
    private GoogleSignInClient googleSignInClient;
    private String issuerURL;
    private String packageId;

    private void handleGoogleLoginResult(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder(this.issuerURL);
        stringBuilder.append(googleEndpoint);
        String stringBuilder2 = stringBuilder.toString();
        HashMap hashMap = new HashMap();
        hashMap.put(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_HAL_JSON);
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
        new FederatedComms(stringBuilder2, hashMap, new FederatedLoginRequest(str, str2, this.packageId), new PerformFederatedCallback() {
            public void onFederatedLoginResult(CommsResult<FederatedLoginResponse> commsResult, Exception exception) {
                if (commsResult == null || commsResult.responseCode != 200) {
                    FederatedLoginActivity.this.finishWithError(CommsResult.RESULT_JAGEX_ACCESS_ERROR, AuthMessage.JAGEX_ACCESS_ERROR.getMessage(), exception);
                    return;
                }
                try {
                    FederatedLoginResponse federatedLoginResponse = (FederatedLoginResponse) commsResult.getResultValue();
                    MobileAttributionService.setUserID(federatedLoginResponse.getRunescapeAccountId());
                    Intent intent = new Intent();
                    intent.putExtra(FederatedLoginService.EXTRA_ONE_TIME_LOGIN_TOKEN, federatedLoginResponse.getOneTimeLoginToken());
                    FederatedLoginActivity.this.finish(0, intent);
                } catch (Exception e) {
                    FederatedLoginActivity.this.finishWithError(1401, AuthMessage.ACTION_AUTH_ERROR.getMessage(), e);
                }
            }
        }).execute(new Void[0]);
    }

    private void performGoogleLogin() {
        this.googleSignInClient = GoogleSignIn.getClient((Activity) this, new Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestScopes(new Scope(DOB_SCOPE), new Scope[0]).requestServerAuthCode(this.googleClientID).build());
        startActivityForResult(this.googleSignInClient.getSignInIntent(), MobileAuthServiceListener.REQUEST_GOOGLE_LOGIN);
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
            String serverAuthCode = googleSignInAccount.getServerAuthCode();
            String id = googleSignInAccount.getId();
            this.googleSignInClient.signOut();
            handleGoogleLoginResult(serverAuthCode, id);
        } catch (ApiException e) {
            switch (e.getStatusCode()) {
                case GoogleSignInStatusCodes.SIGN_IN_FAILED /*12500*/:
                    finishWithError(1401, AuthMessage.FEDERATED_LOGIN_AUTH_ERROR.getMessage(), e);
                    return;
                case GoogleSignInStatusCodes.SIGN_IN_CANCELLED /*12501*/:
                    finishWithError(1402, AuthMessage.GENERIC_AUTH_ERROR.getMessage(), e);
                    return;
                default:
                    finishWithError(1401, AuthMessage.FEDERATED_LOGIN_ACTIVITY_ERROR.getMessage(), e);
                    return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FederatedLoginParcel federatedLoginParcel = (FederatedLoginParcel) getIntent().getParcelableExtra(FederatedLoginService.EXTRA_FEDERATED_LOGIN_CONFIG);
        this.googleClientID = federatedLoginParcel.getGoogleClientId();
        this.packageId = federatedLoginParcel.getPackageId();
        this.issuerURL = federatedLoginParcel.getIssuerURL();
        SecurityProviderUpdate.ProviderUpdate(this);
        performGoogleLogin();
    }
}
