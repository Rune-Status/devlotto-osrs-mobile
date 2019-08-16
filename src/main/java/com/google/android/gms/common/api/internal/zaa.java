package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<zaa> zack;

    @VisibleForTesting(otherwise = 2)
    static class zaa extends LifecycleCallback {
        private List<Runnable> zacl = new ArrayList();

        private zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        private static zaa zaa(Activity activity) {
            zaa zaa;
            synchronized (activity) {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                zaa = (zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", zaa.class);
                if (zaa == null) {
                    zaa = new zaa(fragment);
                }
            }
            return zaa;
        }

        private final void zaa(Runnable runnable) {
            synchronized (this) {
                this.zacl.add(runnable);
            }
        }

        @MainThread
        public void onStop() {
            synchronized (this) {
                List<Runnable> list = this.zacl;
                this.zacl = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }
    }

    public zaa(Activity activity) {
        this(zaa.zaa(activity));
    }

    @VisibleForTesting(otherwise = 2)
    private zaa(zaa zaa) {
        this.zack = new WeakReference(zaa);
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaa = (zaa) this.zack.get();
        if (zaa != null) {
            zaa.zaa(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
