package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
public class PooledExecutorsProvider {
    private static PooledExecutorFactory zzey;

    public interface PooledExecutorFactory {
        @KeepForSdk
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @KeepForSdk
    public static PooledExecutorFactory getInstance() {
        synchronized (PooledExecutorsProvider.class) {
            try {
                if (zzey == null) {
                    zzey = new zza();
                }
                PooledExecutorFactory pooledExecutorFactory = zzey;
                return pooledExecutorFactory;
            } finally {
                Object obj = PooledExecutorsProvider.class;
            }
        }
    }
}
