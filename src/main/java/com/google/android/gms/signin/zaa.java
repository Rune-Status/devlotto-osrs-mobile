package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zaa {
    public static final Api<SignInOptions> API = new Api("SignIn.API", zapg, CLIENT_KEY);
    private static final ClientKey<SignInClientImpl> CLIENT_KEY = new ClientKey();
    public static final AbstractClientBuilder<SignInClientImpl, SignInOptions> zapg = new zab();
    private static final Scope zar = new Scope(Scopes.PROFILE);
    @ShowFirstParty
    private static final ClientKey<SignInClientImpl> zarp = new ClientKey();
    private static final AbstractClientBuilder<SignInClientImpl, Object> zarq = new zac();
    private static final Api<Object> zarr = new Api("SignIn.INTERNAL_API", zarq, zarp);
    private static final Scope zas = new Scope("email");
}
