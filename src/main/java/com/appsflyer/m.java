package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

@RequiresApi(api = 14)
final class m implements ActivityLifecycleCallbacks {
    /* renamed from: ॱ */
    private static m f192;
    /* renamed from: ˋ */
    private d f193 = null;
    /* renamed from: ˎ */
    private boolean f194 = false;
    /* renamed from: ˏ */
    private boolean f195 = true;

    interface d {
        /* renamed from: ˊ */
        void m30(Activity activity);

        /* renamed from: ˊ */
        void m31(WeakReference<Context> weakReference);
    }

    final class c extends AsyncTask<Void, Void, Void> {
        /* renamed from: ॱ */
        private WeakReference<Context> f191;

        public c(WeakReference<Context> weakReference) {
            this.f191 = weakReference;
        }

        /* renamed from: ˋ */
        private Void m144() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                AFLogger.afErrorLog("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            if (m.this.f194 && m.this.f195) {
                m.this.f194 = false;
                try {
                    m.this.f193.m31(this.f191);
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Listener threw exception! ", e2);
                    cancel(true);
                }
            }
            this.f191.clear();
            return null;
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m144();
        }
    }

    m() {
    }

    /* renamed from: ˎ */
    static m m145() {
        if (f192 == null) {
            f192 = new m();
        }
        return f192;
    }

    /* renamed from: ˏ */
    public static m m146() {
        if (f192 != null) {
            return f192;
        }
        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.f195 = true;
        try {
            new c(new WeakReference(activity.getApplicationContext())).executeOnExecutor(AFExecutor.getInstance().getThreadPoolExecutor(), new Void[0]);
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f195 = false;
        boolean z = this.f194;
        this.f194 = true;
        if ((z ^ 1) != 0) {
            try {
                this.f193.m30(activity);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: ˊ */
    public final void m147(Application application, d dVar) {
        this.f193 = dVar;
        if (VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(f192);
        }
    }
}
