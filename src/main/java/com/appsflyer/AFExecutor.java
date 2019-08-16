package com.appsflyer;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {
    /* renamed from: ˎ */
    private static AFExecutor f15;
    /* renamed from: ˏ */
    private static final ThreadFactory f16 = new ThreadFactory() {
        public final Thread newThread(@NonNull final Runnable runnable) {
            return new Thread(new Runnable() {
                /* renamed from: ˋ */
                static boolean m7(Context context, String str) {
                    int checkSelfPermission = ContextCompat.checkSelfPermission(context, str);
                    StringBuilder stringBuilder = new StringBuilder("is Permission Available: ");
                    stringBuilder.append(str);
                    stringBuilder.append("; res: ");
                    stringBuilder.append(checkSelfPermission);
                    AFLogger.afRDLog(stringBuilder.toString());
                    return checkSelfPermission == 0;
                }

                public final void run() {
                    if (VERSION.SDK_INT >= 14) {
                        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    }
                    runnable.run();
                }
            });
        }
    };
    /* renamed from: ˊ */
    private ScheduledExecutorService f17;
    /* renamed from: ˋ */
    private ScheduledExecutorService f18;
    /* renamed from: ॱ */
    private Executor f19;

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f15 == null) {
            f15 = new AFExecutor();
        }
        return f15;
    }

    /* renamed from: ˊ */
    private static void m8(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            AFLogger.afRDLog("InterruptedException!!!");
        } finally {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        }
    }

    public ScheduledExecutorService getSerialExecutor() {
        if (this.f17 == null) {
            this.f17 = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f17;
    }

    public Executor getThreadPoolExecutor() {
        Object obj = (this.f19 == null || ((this.f19 instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) this.f19).isShutdown() || ((ThreadPoolExecutor) this.f19).isTerminated() || ((ThreadPoolExecutor) this.f19).isTerminating()))) ? 1 : null;
        if (obj != null) {
            if (VERSION.SDK_INT < 11) {
                return Executors.newSingleThreadExecutor();
            }
            this.f19 = Executors.newFixedThreadPool(2, f16);
        }
        return this.f19;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˋ */
    public final void m9() {
        try {
            m8(this.f18);
            if (this.f19 instanceof ThreadPoolExecutor) {
                m8((ThreadPoolExecutor) this.f19);
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("failed to stop Executors", th);
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final ScheduledThreadPoolExecutor m10() {
        Object obj = (this.f18 == null || this.f18.isShutdown() || this.f18.isTerminated()) ? 1 : null;
        if (obj != null) {
            this.f18 = Executors.newScheduledThreadPool(2, f16);
        }
        return (ScheduledThreadPoolExecutor) this.f18;
    }
}
