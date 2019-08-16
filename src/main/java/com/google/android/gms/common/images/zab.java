package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

final class zab {
    public final Uri uri;

    public zab(Uri uri) {
        this.uri = uri;
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof zab) ? false : this == obj ? true : Objects.equal(((zab) obj).uri, this.uri);
    }

    public final int hashCode() {
        return Objects.hashCode(this.uri);
    }
}
