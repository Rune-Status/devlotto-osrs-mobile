package com.google.android.gms.internal.measurement;

abstract class zzjs extends zzjr {
    private boolean zzvn;

    zzjs(zzjt zzjt) {
        super(zzjt);
        this.zzalo.zzb(this);
    }

    /* Access modifiers changed, original: final */
    public final boolean isInitialized() {
        return this.zzvn;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzch() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract boolean zzgn();

    public final void zzm() {
        if (this.zzvn) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzgn();
        this.zzalo.zzll();
        this.zzvn = true;
    }
}
