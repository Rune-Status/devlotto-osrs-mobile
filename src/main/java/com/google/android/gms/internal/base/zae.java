package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import android.support.v7.widget.helper.ItemTouchHelper;

public final class zae extends Drawable implements Callback {
    private int mAlpha;
    private int mFrom;
    private boolean zamy;
    private int zang;
    private long zanh;
    private int zani;
    private int zanj;
    private int zank;
    private boolean zanl;
    private zai zanm;
    private Drawable zann;
    private Drawable zano;
    private boolean zanp;
    private boolean zanq;
    private boolean zanr;
    private int zans;

    public zae(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = zag.zant;
        }
        this.zann = drawable;
        drawable.setCallback(this);
        zai zai = this.zanm;
        zai.zanv |= drawable.getChangingConfigurations();
        if (drawable2 == null) {
            drawable2 = zag.zant;
        }
        this.zano = drawable2;
        drawable2.setCallback(this);
        zai = this.zanm;
        zai.zanv |= drawable2.getChangingConfigurations();
    }

    zae(zai zai) {
        this.zang = 0;
        this.zanj = 255;
        this.mAlpha = 0;
        this.zamy = true;
        this.zanm = new zai(zai);
    }

    private final boolean canConstantState() {
        if (!this.zanp) {
            boolean z = (this.zann.getConstantState() == null || this.zano.getConstantState() == null) ? false : true;
            this.zanq = z;
            this.zanp = true;
        }
        return this.zanq;
    }

    public final void draw(Canvas canvas) {
        int i = 1;
        switch (this.zang) {
            case 1:
                this.zanh = SystemClock.uptimeMillis();
                this.zang = 2;
                i = 0;
                break;
            case 2:
                if (this.zanh >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.zanh)) / ((float) this.zank);
                    if (uptimeMillis < 1.0f) {
                        i = 0;
                    }
                    if (i != 0) {
                        this.zang = 0;
                    }
                    this.mAlpha = (int) ((Math.min(uptimeMillis, 1.0f) * ((float) this.zani)) + 0.0f);
                    break;
                }
                break;
        }
        int i2 = this.mAlpha;
        boolean z = this.zamy;
        Drawable drawable = this.zann;
        Drawable drawable2 = this.zano;
        if (i != 0) {
            if (!z || i2 == 0) {
                drawable.draw(canvas);
            }
            if (i2 == this.zanj) {
                drawable2.setAlpha(this.zanj);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z) {
            drawable.setAlpha(this.zanj - i2);
        }
        drawable.draw(canvas);
        if (z) {
            drawable.setAlpha(this.zanj);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.zanj);
        }
        invalidateSelf();
    }

    public final int getChangingConfigurations() {
        return (super.getChangingConfigurations() | this.zanm.mChangingConfigurations) | this.zanm.zanv;
    }

    public final ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.zanm.mChangingConfigurations = getChangingConfigurations();
        return this.zanm;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.zann.getIntrinsicHeight(), this.zano.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.zann.getIntrinsicWidth(), this.zano.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.zanr) {
            this.zans = Drawable.resolveOpacity(this.zann.getOpacity(), this.zano.getOpacity());
            this.zanr = true;
        }
        return this.zans;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.zanl && super.mutate() == this) {
            if (canConstantState()) {
                this.zann.mutate();
                this.zano.mutate();
                this.zanl = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.zann.setBounds(rect);
        this.zano.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.mAlpha == this.zanj) {
            this.mAlpha = i;
        }
        this.zanj = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.zann.setColorFilter(colorFilter);
        this.zano.setColorFilter(colorFilter);
    }

    public final void startTransition(int i) {
        this.mFrom = 0;
        this.zani = this.zanj;
        this.mAlpha = 0;
        this.zank = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        this.zang = 1;
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zacf() {
        return this.zano;
    }
}
