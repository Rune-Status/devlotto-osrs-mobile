package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzo<R extends Result> extends ApiMethodImpl<R, zzg> {
    public zzo(GoogleApiClient googleApiClient) {
        super(Auth.GOOGLE_SIGN_IN_API, googleApiClient);
    }
}
