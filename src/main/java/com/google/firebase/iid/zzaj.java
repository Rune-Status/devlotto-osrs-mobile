package com.google.firebase.iid;

import android.os.Bundle;

final class zzaj extends zzak<Void> {
    zzaj(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* Access modifiers changed, original: final */
    public final boolean zzab() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            finish(null);
        } else {
            zza(new zzal(4, "Invalid response to one way request"));
        }
    }
}
