package com.jagex.mobilesdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import com.jagex.mobilesdk.auth.MobileAuthStateManager.AuthManagerAction;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.createaccount.AuthJagexCustomTabs;
import com.jagex.mobilesdk.auth.createaccount.CreateAccountManagementActivity;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentService.PendingTransactionUpdate;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;

public class MobileAuthService {
    private MobileAuthStateManager authStateManager;
    private MobileAuthStateWriter authStateWriter;
    private MobilePaymentService mPaymentService;

    public MobileAuthService(@NonNull Activity activity, @NonNull JagexConfig jagexConfig) {
        this.authStateWriter = new MobileAuthStateWriter(activity.getApplicationContext());
        this.authStateManager = MobileAuthStateManager.getInstance(this.authStateWriter, jagexConfig);
        this.mPaymentService = new MobilePaymentService(activity, jagexConfig);
        SecurityProviderUpdate.ProviderUpdate(activity);
    }

    private Intent createAccountCreationIntent(CustomTabsIntent customTabsIntent, Uri uri) {
        Intent intent = customTabsIntent.intent;
        intent.setData(uri);
        return intent;
    }

    public void createAccount(@NonNull Activity activity, Uri uri) {
        activity.startActivityForResult(CreateAccountManagementActivity.createStartIntent(activity.getApplicationContext(), createAccountCreationIntent(new AuthJagexCustomTabs(activity.getApplicationContext()).build(), uri)), MobileAuthServiceListener.REQUEST_ACCOUNT_CREATION);
    }

    public boolean isUserAuthenticated() {
        return this.authStateManager.isUserAuthenticated();
    }

    public void logout(@NonNull MobileAuthServiceListener mobileAuthServiceListener) {
        this.authStateManager.logout(mobileAuthServiceListener);
    }

    @Deprecated
    public void requestGameToken(Activity activity, @NonNull MobileAuthServiceListener mobileAuthServiceListener) {
        requestGameToken(activity, true, mobileAuthServiceListener);
    }

    public void requestGameToken(final Activity activity, final boolean z, @NonNull final MobileAuthServiceListener mobileAuthServiceListener) {
        this.authStateManager.performActionWithFreshTokens(activity, new AuthManagerAction() {
            public void execute(@Nullable String str, Exception exception) {
                if (exception != null) {
                    mobileAuthServiceListener.onResult(new CommsResult("", 1401));
                } else if (z) {
                    MobileAuthService.this.authStateManager.requestGameToken(mobileAuthServiceListener);
                } else {
                    MobileAuthService.this.mPaymentService.checkForPendingTransactions(activity, new PendingTransactionUpdate() {
                        public void applyComplete() {
                        }

                        public void applyFailed() {
                        }

                        public void transactionsAvailable(boolean z) {
                            if (z) {
                                mobileAuthServiceListener.onResult(new CommsResult("", CommsResult.RESULT_PENDING_TRANSACTIONS_AVAILABLE));
                                return;
                            }
                            MobileAuthService.this.authStateManager.requestGameToken(mobileAuthServiceListener);
                        }
                    });
                }
            }
        });
    }

    public void requestOAuth2Tokens(@NonNull Activity activity, String str, String str2, String str3, String str4, @NonNull MobileAuthServiceListener mobileAuthServiceListener) {
        this.authStateManager.requestOAuth2Tokens(activity, str, str2, str3, str4, mobileAuthServiceListener);
    }

    public void storeTokens(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @NonNull long j) {
        this.authStateManager.storeTokens(new MobileAuthState(str, str2, j));
    }
}
