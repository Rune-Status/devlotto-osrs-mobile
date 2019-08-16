package com.jagex.mobilesdk.federatedLogin.model;

public class FederatedLoginRequest {
    private final String packageId;
    private final String serverAuthCode;
    private final String thirdPartyAccountId;

    public FederatedLoginRequest(String str, String str2, String str3) {
        this.serverAuthCode = str;
        this.thirdPartyAccountId = str2;
        this.packageId = str3;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public String getServerAuthCode() {
        return this.serverAuthCode;
    }

    public String getThirdPartyAccountId() {
        return this.thirdPartyAccountId;
    }
}
