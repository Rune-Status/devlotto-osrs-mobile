package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Class(creator = "CredentialPickerConfigCreator")
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new zze();
    @Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean mShowCancelButton;
    @Field(id = 1000)
    private final int zzu;
    @Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean zzv;
    @Field(getter = "isForNewAccount", id = 3)
    @Deprecated
    private final boolean zzw;
    @Field(getter = "getPromptInternalId", id = 4)
    private final int zzx;

    public static class Builder {
        private boolean mShowCancelButton = true;
        private boolean zzv = false;
        private int zzy = 1;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(this, null);
        }

        @Deprecated
        public Builder setForNewAccount(boolean z) {
            this.zzy = z ? 3 : 1;
            return this;
        }

        public Builder setPrompt(int i) {
            this.zzy = i;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z) {
            this.zzv = z;
            return this;
        }

        public Builder setShowCancelButton(boolean z) {
            this.mShowCancelButton = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    @Constructor
    CredentialPickerConfig(@Param(id = 1000) int i, @Param(id = 1) boolean z, @Param(id = 2) boolean z2, @Param(id = 3) boolean z3, @Param(id = 4) int i2) {
        int i3 = 3;
        boolean z4 = true;
        this.zzu = i;
        this.zzv = z;
        this.mShowCancelButton = z2;
        if (i < 2) {
            this.zzw = z3;
            if (!z3) {
                i3 = 1;
            }
            this.zzx = i3;
            return;
        }
        if (i2 != 3) {
            z4 = false;
        }
        this.zzw = z4;
        this.zzx = i2;
    }

    private CredentialPickerConfig(Builder builder) {
        this(2, builder.zzv, builder.mShowCancelButton, false, builder.zzy);
    }

    /* synthetic */ CredentialPickerConfig(Builder builder, zzd zzd) {
        this(builder);
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.zzx == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzv;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.zzx);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
