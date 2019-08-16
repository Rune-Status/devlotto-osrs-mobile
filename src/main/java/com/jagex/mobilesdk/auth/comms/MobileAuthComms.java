package com.jagex.mobilesdk.auth.comms;

import com.jagex.mobilesdk.auth.comms.GameTokenComms.FetchGameTokenCallback;
import com.jagex.mobilesdk.auth.comms.LogoutComms.PerformLogoutCallback;
import com.jagex.mobilesdk.auth.comms.RefreshComms.RefreshTokenCallback;
import com.jagex.mobilesdk.auth.comms.ShieldOAuth2Comms.ShieldOAuth2Callback;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.util.HashMap;

public class MobileAuthComms {
    public static void gameTokenComms(String str, MobileAuthState mobileAuthState, FetchGameTokenCallback fetchGameTokenCallback, boolean z) {
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(mobileAuthState.getAccessToken());
        hashMap.put(CommsUtils.HTTP_HEADER_AUTHORIZATION, stringBuilder.toString());
        hashMap.put(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_FORM_URLENCODED);
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
        GameTokenComms gameTokenComms = new GameTokenComms(str, hashMap, fetchGameTokenCallback);
        if (z) {
            gameTokenComms.execute(new Void[0]);
        } else {
            gameTokenComms.fetchGameTokenPostAction(gameTokenComms.fetchGameTokenAction(str, hashMap), fetchGameTokenCallback);
        }
    }

    public static void logoutComms(String str, MobileAuthState mobileAuthState, JagexConfig jagexConfig, PerformLogoutCallback performLogoutCallback, boolean z) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(CommsUtils.HTTP_HEADER_AUTHORIZATION, CommsUtils.basicAuthParam(jagexConfig));
        hashMap.put(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_FORM_URLENCODED);
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
        hashMap2.put(CommsUtils.HTTP_PARAM_TOKEN, mobileAuthState.getRefreshToken());
        hashMap2.put(CommsUtils.HTTP_PARAM_TOKEN_TYPE_HINT, "refresh_token");
        LogoutComms logoutComms = new LogoutComms(str, hashMap, hashMap2, performLogoutCallback);
        if (z) {
            logoutComms.execute(new Void[0]);
        } else {
            logoutComms.logoutPostAction(logoutComms.logoutAction(str, hashMap, hashMap2), performLogoutCallback);
        }
    }

    public static void refreshTokenComms(String str, MobileAuthState mobileAuthState, JagexConfig jagexConfig, RefreshTokenCallback refreshTokenCallback, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_FORM_URLENCODED);
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
        hashMap.put(CommsUtils.HTTP_HEADER_AUTHORIZATION, CommsUtils.basicAuthParam(jagexConfig));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("refresh_token", mobileAuthState.getRefreshToken());
        hashMap2.put(CommsUtils.HTTP_PARAM_SCOPE, jagexConfig.getScope());
        hashMap2.put(CommsUtils.HTTP_PARAM_REDIRECT_URI, jagexConfig.getRedirectUri().toString());
        hashMap2.put(CommsUtils.HTTP_PARAM_GRANT_TYPE, "refresh_token");
        RefreshComms refreshComms = new RefreshComms(str, hashMap, hashMap2, refreshTokenCallback);
        if (z) {
            refreshComms.execute(new Void[0]);
        } else {
            refreshComms.refreshTokenPostAction(refreshComms.refreshTokenAction(str, hashMap, hashMap2), refreshTokenCallback);
        }
    }

    public static void shieldOAuth2Comms(String str, String str2, String str3, String str4, String str5, JagexConfig jagexConfig, ShieldOAuth2Callback shieldOAuth2Callback, boolean z) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(CommsUtils.HTTP_HEADER_AUTHORIZATION, CommsUtils.basicAuthParam(jagexConfig));
        hashMap.put(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_FORM_URLENCODED);
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
        hashMap2.put(CommsUtils.HTTP_PARAM_GRANT_TYPE, str2);
        hashMap2.put(CommsUtils.HTTP_PARAM_TOKEN, str3);
        hashMap2.put(CommsUtils.HTTP_PARAM_REDIRTO, str4);
        hashMap2.put(CommsUtils.HTTP_PARAM_SIG, str5);
        ShieldOAuth2Comms shieldOAuth2Comms = new ShieldOAuth2Comms(str, hashMap, hashMap2, shieldOAuth2Callback);
        if (z) {
            shieldOAuth2Comms.execute(new Void[0]);
        } else {
            shieldOAuth2Comms.shieldOAuth2PostAction(shieldOAuth2Comms.shieldOAuth2Action(str, hashMap, hashMap2), shieldOAuth2Callback);
        }
    }
}
