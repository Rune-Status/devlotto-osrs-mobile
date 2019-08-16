package com.jagex.mobilesdk.federatedLogin.model;

public class FederatedLoginResponse {
    private final String oneTimeLoginToken;
    private final String runescapeAccountId;

    public FederatedLoginResponse(String str, String str2) {
        this.oneTimeLoginToken = str;
        this.runescapeAccountId = str2;
    }

    public String getOneTimeLoginToken() {
        return this.oneTimeLoginToken;
    }

    public String getRunescapeAccountId() {
        return this.runescapeAccountId;
    }
}
