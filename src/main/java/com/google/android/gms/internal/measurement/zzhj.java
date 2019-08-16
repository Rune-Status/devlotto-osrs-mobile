package com.google.android.gms.internal.measurement;

abstract class zzhj extends zzhi {
    private boolean zzvn;

    zzhj(zzgn zzgn) {
        super(zzgn);
        this.zzacv.zzb(this);
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

    public final void zzgm() {
        if (this.zzvn) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzgo();
        this.zzacv.zzkf();
        this.zzvn = true;
    }

    public abstract boolean zzgn();

    /* Access modifiers changed, original: protected */
    public void zzgo() {
    }

    public final void zzm() {
        if (this.zzvn) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!zzgn()) {
            this.zzacv.zzkf();
            this.zzvn = true;
        }
    }
}
