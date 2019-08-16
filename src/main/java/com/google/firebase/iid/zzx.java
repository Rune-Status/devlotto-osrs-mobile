package com.google.firebase.iid;

final class zzx implements InstanceIdResult {
    private final String zzbt;
    private final String zzbu;

    zzx(String str, String str2) {
        this.zzbt = str;
        this.zzbu = str2;
    }

    public final String getId() {
        return this.zzbt;
    }

    public final String getToken() {
        return this.zzbu;
    }
}
