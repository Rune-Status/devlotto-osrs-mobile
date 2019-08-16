package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.util.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public class zaae extends zal {
    private GoogleApiManager zabm;
    private final ArraySet<zai<?>> zafo = new ArraySet();

    private zaae(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zaa(Activity activity, GoogleApiManager googleApiManager, zai<?> zai) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zaae zaae = (zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if (zaae == null) {
            zaae = new zaae(fragment);
        }
        zaae.zabm = googleApiManager;
        Preconditions.checkNotNull(zai, "ApiKey cannot be null");
        zaae.zafo.add(zai);
        googleApiManager.zaa(zaae);
    }

    private final void zaak() {
        if (!this.zafo.isEmpty()) {
            this.zabm.zaa(this);
        }
    }

    public void onResume() {
        super.onResume();
        zaak();
    }

    public void onStart() {
        super.onStart();
        zaak();
    }

    public void onStop() {
        super.onStop();
        this.zabm.zab(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zaa(ConnectionResult connectionResult, int i) {
        this.zabm.zaa(connectionResult, i);
    }

    /* Access modifiers changed, original: final */
    public final ArraySet<zai<?>> zaaj() {
        return this.zafo;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zao() {
        this.zabm.zao();
    }
}
