package com.jagex.mobilesdk.auth;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFInAppEventType;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.comms.GameTokenComms.FetchGameTokenCallback;
import com.jagex.mobilesdk.auth.comms.LogoutComms.PerformLogoutCallback;
import com.jagex.mobilesdk.auth.comms.MobileAuthComms;
import com.jagex.mobilesdk.auth.comms.RefreshComms.RefreshTokenCallback;
import com.jagex.mobilesdk.auth.comms.ShieldOAuth2Comms.ShieldOAuth2Callback;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;

public class MobileAuthStateManager {
    private static final String ENDPOINT_GAME_TOKEN = "/public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play";
    private static final String ENDPOINT_REVOKE = "/shield/oauth/revoke";
    private static final String ENDPOINT_TOKEN = "/shield/oauth/token";
    private static final int EXPIRY_TIME_TOLERANCE_MS = 60000;
    private static volatile MobileAuthStateManager singleInstance;
    private final JagexConfig jagexConfig;
    private MobileAuthState mobileAuthState = this.mobileAuthStateWriter.loadAuthState();
    private final MobileAuthStateWriter mobileAuthStateWriter;

    public interface AuthManagerAction {
        void execute(@Nullable String str, @Nullable Exception exception);
    }

    private MobileAuthStateManager(MobileAuthStateWriter mobileAuthStateWriter, JagexConfig jagexConfig) {
        this.mobileAuthStateWriter = mobileAuthStateWriter;
        this.jagexConfig = jagexConfig;
    }

    public static MobileAuthStateManager getInstance(@NonNull MobileAuthStateWriter mobileAuthStateWriter, @NonNull JagexConfig jagexConfig) {
        if (singleInstance == null) {
            synchronized (MobileAuthStateManager.class) {
                try {
                    if (singleInstance == null) {
                        singleInstance = new MobileAuthStateManager(mobileAuthStateWriter, jagexConfig);
                    }
                } catch (Throwable th) {
                    while (true) {
                        Class cls = MobileAuthStateManager.class;
                    }
                }
            }
        }
        return singleInstance;
    }

    private boolean isAuthStateFresh() {
        if (!isUserAuthenticated() || this.mobileAuthState.getAccessTokenExpiration() == 0) {
            return false;
        }
        return this.mobileAuthState.getAccessTokenExpiration() > System.currentTimeMillis() + 60000;
    }

    public void clearAuthState() {
        this.mobileAuthState = new MobileAuthState();
        this.mobileAuthStateWriter.saveAuthState(this.mobileAuthState);
    }

    public MobileAuthState getAuthState() {
        return this.mobileAuthState;
    }

    public boolean isUserAuthenticated() {
        return (this.mobileAuthState.getAccessToken() == null || this.mobileAuthState.getAccessToken().equals("")) ? false : true;
    }

    public void logout(@NonNull final MobileAuthServiceListener mobileAuthServiceListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.jagexConfig.getIssuerUri());
        stringBuilder.append(ENDPOINT_REVOKE);
        MobileAuthComms.logoutComms(stringBuilder.toString(), this.mobileAuthState, this.jagexConfig, new PerformLogoutCallback() {
            public void onLogoutResult(CommsResult commsResult, Exception exception) {
                MobileAuthStateManager.this.clearAuthState();
                mobileAuthServiceListener.onResult(commsResult);
            }
        }, true);
    }

    public void performActionWithFreshTokens(Activity activity, final AuthManagerAction authManagerAction) {
        if (isAuthStateFresh()) {
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    authManagerAction.execute(MobileAuthStateManager.this.mobileAuthState.getAccessToken(), null);
                }
            });
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.jagexConfig.getIssuerUri());
        stringBuilder.append(ENDPOINT_TOKEN);
        MobileAuthComms.refreshTokenComms(stringBuilder.toString(), this.mobileAuthState, this.jagexConfig, new RefreshTokenCallback() {
            public void onTokenResult(String str, Long l, String str2, Exception exception) {
                if (exception == null) {
                    MobileAuthStateManager.this.mobileAuthState.setAccessToken(str);
                    MobileAuthStateManager.this.mobileAuthState.setAccessTokenExpiration(l.longValue());
                    MobileAuthStateManager.this.mobileAuthState.setRefreshToken(str2);
                    MobileAuthStateManager.this.mobileAuthStateWriter.saveAuthState(MobileAuthStateManager.this.mobileAuthState);
                    authManagerAction.execute(str, null);
                    return;
                }
                MobileAuthStateManager.this.clearAuthState();
                authManagerAction.execute("", exception);
            }
        }, true);
    }

    public void requestGameToken(@NonNull final MobileAuthServiceListener mobileAuthServiceListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.jagexConfig.getIssuerUri());
        stringBuilder.append(ENDPOINT_GAME_TOKEN);
        MobileAuthComms.gameTokenComms(stringBuilder.toString(), this.mobileAuthState, new FetchGameTokenCallback() {
            public void onGameTokenResult(CommsResult commsResult, Exception exception) {
                mobileAuthServiceListener.onResult(commsResult);
            }
        }, true);
    }

    public void requestOAuth2Tokens(final Activity activity, String str, String str2, String str3, String str4, @NonNull final MobileAuthServiceListener mobileAuthServiceListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.jagexConfig.getIssuerUri());
        stringBuilder.append(ENDPOINT_TOKEN);
        MobileAuthComms.shieldOAuth2Comms(stringBuilder.toString(), str, str2, str3, str4, this.jagexConfig, new ShieldOAuth2Callback() {
            public void onShieldOAuth2Result(CommsResult commsResult, Exception exception) {
                if (commsResult.responseCode == 0) {
                    MobileAuthStateManager.this.storeTokens((MobileAuthState) commsResult.getResultValue());
                    MobileAttributionService.sendEvent(activity, AFInAppEventType.LOGIN, null);
                }
                mobileAuthServiceListener.onResult(commsResult);
            }
        }, true);
    }

    public void storeTokens(MobileAuthState mobileAuthState) {
        this.mobileAuthState = mobileAuthState;
        this.mobileAuthStateWriter.saveAuthState(this.mobileAuthState);
    }
}
