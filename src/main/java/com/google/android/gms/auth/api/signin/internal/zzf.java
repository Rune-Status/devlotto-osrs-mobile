package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzf implements GoogleSignInApi {
    private static GoogleSignInOptions zzc(GoogleApiClient googleApiClient) {
        return ((zzg) googleApiClient.getClient(Auth.zzh)).zzg();
    }

    public final Intent getSignInIntent(GoogleApiClient googleApiClient) {
        return zzh.zzc(googleApiClient.getContext(), zzc(googleApiClient));
    }

    public final GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        return zzh.getSignInResultFromIntent(intent);
    }

    public final PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient) {
        return zzh.zzd(googleApiClient, googleApiClient.getContext(), false);
    }

    public final PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return zzh.zzc(googleApiClient, googleApiClient.getContext(), false);
    }

    public final OptionalPendingResult<GoogleSignInResult> silentSignIn(GoogleApiClient googleApiClient) {
        return zzh.zzc(googleApiClient, googleApiClient.getContext(), zzc(googleApiClient), false);
    }
}
