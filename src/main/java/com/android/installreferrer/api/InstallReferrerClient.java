package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class InstallReferrerClient {

    public static final class Builder {
        private final Context mContext;

        private Builder(Context context) {
            this.mContext = context;
        }

        @UiThread
        public InstallReferrerClient build() {
            if (this.mContext != null) {
                return new InstallReferrerClientImpl(this.mContext);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;
    }

    @UiThread
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context);
    }

    @UiThread
    public abstract void endConnection();

    @UiThread
    public abstract ReferrerDetails getInstallReferrer() throws RemoteException;

    @UiThread
    public abstract boolean isReady();

    @UiThread
    public abstract void startConnection(@NonNull InstallReferrerStateListener installReferrerStateListener);
}
