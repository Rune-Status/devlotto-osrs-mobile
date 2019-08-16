package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.auth-api.zzi;
import com.google.android.gms.internal.auth-api.zzr;

public final class Auth {
    public static final Api<AuthCredentialsOptions> CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzi, zzg);
    public static final CredentialsApi CredentialsApi = new zzi();
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzj, zzh);
    public static final GoogleSignInApi GoogleSignInApi = new zzf();
    @KeepForSdk
    @Deprecated
    public static final Api<AuthProxyOptions> PROXY_API = AuthProxy.API;
    @KeepForSdk
    @Deprecated
    public static final ProxyApi ProxyApi = AuthProxy.ProxyApi;
    public static final ClientKey<zzr> zzg = new ClientKey();
    public static final ClientKey<zzg> zzh = new ClientKey();
    private static final AbstractClientBuilder<zzr, AuthCredentialsOptions> zzi = new zzc();
    private static final AbstractClientBuilder<zzg, GoogleSignInOptions> zzj = new zzd();

    @Deprecated
    public static class AuthCredentialsOptions implements Optional {
        private static final AuthCredentialsOptions zzk = new Builder().zzc();
        private final String zzl = null;
        private final boolean zzm;

        @Deprecated
        public static class Builder {
            protected Boolean zzn = Boolean.valueOf(false);

            public Builder forceEnableSaveDialog() {
                this.zzn = Boolean.valueOf(true);
                return this;
            }

            public AuthCredentialsOptions zzc() {
                return new AuthCredentialsOptions(this);
            }
        }

        public AuthCredentialsOptions(Builder builder) {
            this.zzm = builder.zzn.booleanValue();
        }

        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.zzm);
            return bundle;
        }
    }

    private Auth() {
    }
}
