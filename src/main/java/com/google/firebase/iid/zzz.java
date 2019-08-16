package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

final class zzz {
    private final KeyPair zzbv;
    private final long zzbw;

    @VisibleForTesting
    zzz(KeyPair keyPair, long j) {
        this.zzbv = keyPair;
        this.zzbw = j;
    }

    private final String zzv() {
        return Base64.encodeToString(this.zzbv.getPublic().getEncoded(), 11);
    }

    private final String zzw() {
        return Base64.encodeToString(this.zzbv.getPrivate().getEncoded(), 11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzz)) {
            return false;
        }
        zzz zzz = (zzz) obj;
        return this.zzbw == zzz.zzbw && this.zzbv.getPublic().equals(zzz.zzbv.getPublic()) && this.zzbv.getPrivate().equals(zzz.zzbv.getPrivate());
    }

    /* Access modifiers changed, original: final */
    public final long getCreationTime() {
        return this.zzbw;
    }

    /* Access modifiers changed, original: final */
    public final KeyPair getKeyPair() {
        return this.zzbv;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbv.getPublic(), this.zzbv.getPrivate(), Long.valueOf(this.zzbw));
    }
}
