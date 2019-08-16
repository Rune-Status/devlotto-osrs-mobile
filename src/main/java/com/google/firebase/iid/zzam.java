package com.google.firebase.iid;

import android.os.Bundle;

final class zzam extends zzak<Bundle> {
    zzam(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* Access modifiers changed, original: final */
    public final boolean zzab() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(Bundle bundle) {
        Object bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        finish(bundle2);
    }
}
