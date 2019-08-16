package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public final class zzan {
    private final Context zzac;
    @GuardedBy("this")
    private String zzcm;
    @GuardedBy("this")
    private String zzcn;
    @GuardedBy("this")
    private int zzco;
    @GuardedBy("this")
    private int zzcp = 0;

    public zzan(Context context) {
        this.zzac = context;
    }

    public static String zza(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        gcmSenderId = firebaseApp.getOptions().getApplicationId();
        if (!gcmSenderId.startsWith("1:")) {
            return gcmSenderId;
        }
        String[] split = gcmSenderId.split(":");
        if (split.length < 2) {
            return null;
        }
        gcmSenderId = split[1];
        return gcmSenderId.isEmpty() ? null : gcmSenderId;
    }

    public static String zza(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private final void zzag() {
        synchronized (this) {
            PackageInfo zze = zze(this.zzac.getPackageName());
            if (zze != null) {
                this.zzcm = Integer.toString(zze.versionCode);
                this.zzcn = zze.versionName;
            }
        }
    }

    private final PackageInfo zze(String str) {
        try {
            return this.zzac.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("Failed to find package ");
            stringBuilder.append(valueOf);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    public final int zzac() {
        int i = 0;
        synchronized (this) {
            if (this.zzcp != 0) {
                i = this.zzcp;
            } else {
                PackageManager packageManager = this.zzac.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                } else {
                    Intent intent;
                    List queryIntentServices;
                    if (!PlatformVersion.isAtLeastO()) {
                        intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.zzcp = 1;
                            i = this.zzcp;
                        }
                    }
                    intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    queryIntentServices = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.zzcp = 2;
                        } else {
                            this.zzcp = 1;
                        }
                        i = this.zzcp;
                    } else {
                        this.zzcp = 2;
                        i = this.zzcp;
                    }
                }
            }
        }
        return i;
    }

    public final String zzad() {
        String str;
        synchronized (this) {
            if (this.zzcm == null) {
                zzag();
            }
            str = this.zzcm;
        }
        return str;
    }

    public final String zzae() {
        String str;
        synchronized (this) {
            if (this.zzcn == null) {
                zzag();
            }
            str = this.zzcn;
        }
        return str;
    }

    public final int zzaf() {
        int i;
        synchronized (this) {
            if (this.zzco == 0) {
                PackageInfo zze = zze("com.google.android.gms");
                if (zze != null) {
                    this.zzco = zze.versionCode;
                }
            }
            i = this.zzco;
        }
        return i;
    }
}
