package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public class RegistrationMethods<A extends AnyClient, L> {
    public final RegisterListenerMethod<A, L> zajy;
    public final UnregisterListenerMethod<A, L> zajz;

    @KeepForSdk
    public static class Builder<A extends AnyClient, L> {
        private boolean zajv;
        private RemoteCall<A, TaskCompletionSource<Void>> zaka;
        private RemoteCall<A, TaskCompletionSource<Boolean>> zakb;
        private ListenerHolder<L> zakc;
        private Feature[] zakd;

        private Builder() {
            this.zajv = true;
        }

        /* synthetic */ Builder(zabx zabx) {
            this();
        }

        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            boolean z = true;
            Preconditions.checkArgument(this.zaka != null, "Must set register function");
            Preconditions.checkArgument(this.zakb != null, "Must set unregister function");
            if (this.zakc == null) {
                z = false;
            }
            Preconditions.checkArgument(z, "Must set holder");
            return new RegistrationMethods(new zaca(this, this.zakc, this.zakd, this.zajv), new zacb(this, this.zakc.getListenerKey()), null);
        }

        @KeepForSdk
        public Builder<A, L> register(RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.zaka = remoteCall;
            return this;
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, L> register(BiConsumer<A, TaskCompletionSource<Void>> biConsumer) {
            this.zaka = new zaby(biConsumer);
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zajv = z;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setFeatures(Feature[] featureArr) {
            this.zakd = featureArr;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> unregister(RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.zakb = remoteCall;
            return this;
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, L> unregister(BiConsumer<A, TaskCompletionSource<Boolean>> biConsumer) {
            this.zaka = new zabz(this);
            return this;
        }

        @KeepForSdk
        public Builder<A, L> withHolder(ListenerHolder<L> listenerHolder) {
            this.zakc = listenerHolder;
            return this;
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ void zaa(AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.zaka.accept(anyClient, taskCompletionSource);
        }
    }

    private RegistrationMethods(RegisterListenerMethod<A, L> registerListenerMethod, UnregisterListenerMethod<A, L> unregisterListenerMethod) {
        this.zajy = registerListenerMethod;
        this.zajz = unregisterListenerMethod;
    }

    /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, zabx zabx) {
        this(registerListenerMethod, unregisterListenerMethod);
    }

    @KeepForSdk
    public static <A extends AnyClient, L> Builder<A, L> builder() {
        return new Builder();
    }
}
