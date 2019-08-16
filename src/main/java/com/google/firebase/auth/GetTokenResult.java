package com.google.firebase.auth;

import android.support.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.PublicApi;
import java.util.Map;

@PublicApi
public class GetTokenResult {
    private static final String AUTH_TIMESTAMP = "auth_time";
    private static final String EXPIRATION_TIMESTAMP = "exp";
    private static final String FIREBASE_KEY = "firebase";
    private static final String ISSUED_AT_TIMESTAMP = "iat";
    private static final String SIGN_IN_PROVIDER = "sign_in_provider";
    private Map<String, Object> claims;
    private String token;

    @KeepForSdk
    public GetTokenResult(String str, Map<String, Object> map) {
        this.token = str;
        this.claims = map;
    }

    private long getLongFromClaimsSafely(String str) {
        Integer num = (Integer) this.claims.get(str);
        return num == null ? 0 : num.longValue();
    }

    @PublicApi
    public long getAuthTimestamp() {
        return getLongFromClaimsSafely(AUTH_TIMESTAMP);
    }

    @PublicApi
    public Map<String, Object> getClaims() {
        return this.claims;
    }

    @PublicApi
    public long getExpirationTimestamp() {
        return getLongFromClaimsSafely(EXPIRATION_TIMESTAMP);
    }

    @PublicApi
    public long getIssuedAtTimestamp() {
        return getLongFromClaimsSafely(ISSUED_AT_TIMESTAMP);
    }

    @Nullable
    @PublicApi
    public String getSignInProvider() {
        Map map = (Map) this.claims.get(FIREBASE_KEY);
        return map != null ? (String) map.get(SIGN_IN_PROVIDER) : null;
    }

    @Nullable
    @PublicApi
    public String getToken() {
        return this.token;
    }
}
