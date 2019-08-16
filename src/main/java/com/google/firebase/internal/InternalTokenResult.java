package com.google.firebase.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.jagex.mobilesdk.common.comms.CommsUtils;

@KeepForSdk
public class InternalTokenResult {
    private String token;

    @KeepForSdk
    public InternalTokenResult(@Nullable String str) {
        this.token = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InternalTokenResult)) {
            return false;
        }
        return Objects.equal(this.token, ((InternalTokenResult) obj).token);
    }

    @Nullable
    @KeepForSdk
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Objects.hashCode(this.token);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(CommsUtils.HTTP_PARAM_TOKEN, this.token).toString();
    }
}
