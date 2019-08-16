package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager.OnImageLoadedListener;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zad extends zaa {
    private WeakReference<OnImageLoadedListener> zanc;

    public zad(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(onImageLoadedListener);
        this.zanc = new WeakReference(onImageLoadedListener);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zad)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zad zad = (zad) obj;
        OnImageLoadedListener onImageLoadedListener = (OnImageLoadedListener) this.zanc.get();
        OnImageLoadedListener onImageLoadedListener2 = (OnImageLoadedListener) zad.zanc.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.equal(onImageLoadedListener2, onImageLoadedListener) && Objects.equal(zad.zamu, this.zamu);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zamu);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zaa(Drawable drawable, boolean z, boolean z2, boolean z3) {
        if (!z2) {
            OnImageLoadedListener onImageLoadedListener = (OnImageLoadedListener) this.zanc.get();
            if (onImageLoadedListener != null) {
                onImageLoadedListener.onImageLoaded(this.zamu.uri, drawable, z3);
            }
        }
    }
}
