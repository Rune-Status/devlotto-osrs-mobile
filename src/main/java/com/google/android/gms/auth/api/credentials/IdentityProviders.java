package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

public final class IdentityProviders {
    public static final String FACEBOOK = "https://www.facebook.com";
    public static final String GOOGLE = "https://accounts.google.com";
    public static final String LINKEDIN = "https://www.linkedin.com";
    public static final String MICROSOFT = "https://login.live.com";
    public static final String PAYPAL = "https://www.paypal.com";
    public static final String TWITTER = "https://twitter.com";
    public static final String YAHOO = "https://login.yahoo.com";

    private IdentityProviders() {
    }

    @Nullable
    public static final String getIdentityProviderForAccount(@NonNull Account account) {
        Preconditions.checkNotNull(account, "account cannot be null");
        return "com.google".equals(account.type) ? GOOGLE : "com.facebook.auth.login".equals(account.type) ? FACEBOOK : null;
    }
}
