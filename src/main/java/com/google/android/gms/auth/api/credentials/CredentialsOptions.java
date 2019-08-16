package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;

public final class CredentialsOptions extends AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = ((CredentialsOptions) new Builder().zzc());

    public static final class Builder extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder {
        /* renamed from: build */
        public final CredentialsOptions zzc() {
            return new CredentialsOptions(this, null);
        }

        public final Builder forceEnableSaveDialog() {
            this.zzn = Boolean.valueOf(true);
            return this;
        }
    }

    private CredentialsOptions(Builder builder) {
        super(builder);
    }

    /* synthetic */ CredentialsOptions(Builder builder, zzh zzh) {
        this(builder);
    }
}
