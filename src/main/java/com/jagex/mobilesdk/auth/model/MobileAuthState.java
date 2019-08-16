package com.jagex.mobilesdk.auth.model;

public class MobileAuthState {
    private String accessToken;
    private long accessTokenExpiration;
    private String refreshToken;
    private final String version = "1.0";

    public MobileAuthState(String str, String str2, long j) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.accessTokenExpiration = j;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getAccessTokenExpiration() {
        return this.accessTokenExpiration;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getVersion() {
        return "1.0";
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAccessTokenExpiration(long j) {
        this.accessTokenExpiration = j;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }
}
