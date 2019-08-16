package com.jagex.mobilesdk.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

public class MobileAuthStateWriter {
    private static final String AUTHSTATE_ACCESS_TOKEN = "access_Token";
    private static final String AUTHSTATE_EXPIRYTIME = "token_expires";
    private static final String AUTHSTATE_REFRESH_TOKEN = "refresh_Token";
    private static final String AUTHSTATE_VERSION = "version";
    private static final String KEY_STATE = "state";
    private static final String STORE_NAME = "AuthState";
    private final SharedPreferences sharedPreferences;
    private final ReentrantLock sharedPreferencesLock = new ReentrantLock();

    public MobileAuthStateWriter(@NonNull Context context) {
        this.sharedPreferences = context.getSharedPreferences(STORE_NAME, 0);
    }

    private void clearAuthState(MobileAuthState mobileAuthState) {
        mobileAuthState.setAccessToken("");
        mobileAuthState.setAccessTokenExpiration(0);
        mobileAuthState.setRefreshToken("");
    }

    private MobileAuthState jsonDeserialize(String str) {
        MobileAuthState mobileAuthState = new MobileAuthState();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (AppAuthConverter.isAppAuthAuthState(jSONObject).booleanValue()) {
                return AppAuthConverter.convertAuthState(jSONObject);
            }
            mobileAuthState.setAccessToken(jSONObject.getString(AUTHSTATE_ACCESS_TOKEN));
            mobileAuthState.setAccessTokenExpiration(jSONObject.getLong(AUTHSTATE_EXPIRYTIME));
            mobileAuthState.setRefreshToken(jSONObject.getString(AUTHSTATE_REFRESH_TOKEN));
            return mobileAuthState;
        } catch (JSONException e) {
            clearAuthState(mobileAuthState);
            return mobileAuthState;
        }
    }

    private String jsonSerialize(MobileAuthState mobileAuthState) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AUTHSTATE_VERSION, mobileAuthState.getVersion());
            jSONObject.put(AUTHSTATE_ACCESS_TOKEN, mobileAuthState.getAccessToken());
            jSONObject.put(AUTHSTATE_EXPIRYTIME, mobileAuthState.getAccessTokenExpiration());
            jSONObject.put(AUTHSTATE_REFRESH_TOKEN, mobileAuthState.getRefreshToken());
        } catch (JSONException e) {
            clearAuthState(mobileAuthState);
        }
        return jSONObject.toString();
    }

    public MobileAuthState loadAuthState() {
        MobileAuthState jsonDeserialize;
        this.sharedPreferencesLock.lock();
        try {
            jsonDeserialize = jsonDeserialize(this.sharedPreferences.getString(KEY_STATE, null));
        } catch (Exception e) {
            jsonDeserialize = new MobileAuthState();
        } catch (Throwable th) {
            this.sharedPreferencesLock.unlock();
        }
        this.sharedPreferencesLock.unlock();
        return jsonDeserialize;
    }

    public void saveAuthState(MobileAuthState mobileAuthState) {
        this.sharedPreferencesLock.lock();
        try {
            Editor edit = this.sharedPreferences.edit();
            if (mobileAuthState == null) {
                edit.remove(KEY_STATE);
            } else {
                edit.putString(KEY_STATE, jsonSerialize(mobileAuthState));
            }
            if (!edit.commit()) {
                throw new IllegalStateException("Failed to write state to shared prefs");
            }
        } finally {
            this.sharedPreferencesLock.unlock();
        }
    }
}
