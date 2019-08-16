package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;

public class Credentials {
    public static CredentialsClient getClient(@NonNull Activity activity) {
        return new CredentialsClient(activity, CredentialsOptions.DEFAULT);
    }

    public static CredentialsClient getClient(@NonNull Activity activity, @NonNull CredentialsOptions credentialsOptions) {
        return new CredentialsClient(activity, (AuthCredentialsOptions) credentialsOptions);
    }

    public static CredentialsClient getClient(@NonNull Context context) {
        return new CredentialsClient(context, CredentialsOptions.DEFAULT);
    }

    public static CredentialsClient getClient(@NonNull Context context, @NonNull CredentialsOptions credentialsOptions) {
        return new CredentialsClient(context, (AuthCredentialsOptions) credentialsOptions);
    }
}
