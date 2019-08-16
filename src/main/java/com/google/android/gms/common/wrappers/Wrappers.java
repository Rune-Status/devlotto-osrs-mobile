package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public class Wrappers {
    private static Wrappers zzhx = new Wrappers();
    private PackageManagerWrapper zzhw = null;

    @KeepForSdk
    public static PackageManagerWrapper packageManager(Context context) {
        return zzhx.zzi(context);
    }

    @VisibleForTesting
    private final PackageManagerWrapper zzi(Context context) {
        PackageManagerWrapper packageManagerWrapper;
        synchronized (this) {
            if (this.zzhw == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzhw = new PackageManagerWrapper(context);
            }
            packageManagerWrapper = this.zzhw;
        }
        return packageManagerWrapper;
    }
}
