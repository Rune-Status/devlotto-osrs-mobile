package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.model.MobileAuthState;
import org.json.JSONException;
import org.json.JSONObject;

public class AppAuthConverter {
    public static final String APPAUTH_ACCESS_TOKEN_KEY = "access_token";
    public static final String APPAUTH_EXPIRES_AT = "expires_at";
    public static final String APPAUTH_REFRESH_TOKEN_KEY = "refresh_token";
    public static final String LASTAUTHORIZATIONRESPONSE_KEY = "lastAuthorizationResponse";
    public static final String LASTTOKENRESPONSE_KEY = "mLastTokenResponse";

    public static MobileAuthState convertAuthState(JSONObject jSONObject) {
        MobileAuthState mobileAuthState = new MobileAuthState();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(LASTTOKENRESPONSE_KEY);
            mobileAuthState.setAccessToken(jSONObject2.getString(APPAUTH_ACCESS_TOKEN_KEY));
            mobileAuthState.setAccessTokenExpiration(jSONObject2.getLong(APPAUTH_EXPIRES_AT));
            mobileAuthState.setRefreshToken(jSONObject2.getString("refresh_token"));
            return mobileAuthState;
        } catch (JSONException e) {
            return new MobileAuthState();
        }
    }

    public static Boolean isAppAuthAuthState(JSONObject jSONObject) {
        boolean z = jSONObject.has(LASTAUTHORIZATIONRESPONSE_KEY) && jSONObject.has(LASTTOKENRESPONSE_KEY);
        return Boolean.valueOf(z);
    }
}
