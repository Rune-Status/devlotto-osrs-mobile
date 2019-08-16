package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.GuardedBy;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

final class zzaw {
    private final Context zzac;
    private final SharedPreferences zzdh;
    private final zzy zzdi;
    @GuardedBy("this")
    private final Map<String, zzz> zzdj;

    public zzaw(Context context) {
        this(context, new zzy());
    }

    private zzaw(Context context, zzy zzy) {
        this.zzdj = new ArrayMap();
        this.zzac = context;
        this.zzdh = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzdi = zzy;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.zzac), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !isEmpty()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    zzal();
                    FirebaseInstanceId.getInstance().zzn();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    private final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.zzdh.getAll().isEmpty();
        }
        return isEmpty;
    }

    private static String zza(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append("|T|");
        stringBuilder.append(str2);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    static String zzd(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("|S|");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final void zza(String str, String str2, String str3, String str4, String str5) {
        synchronized (this) {
            String zza = zzax.zza(str4, str5, System.currentTimeMillis());
            if (zza == null) {
                return;
            }
            Editor edit = this.zzdh.edit();
            edit.putString(zza(str, str2, str3), zza);
            edit.commit();
        }
    }

    public final String zzak() {
        String string;
        synchronized (this) {
            string = this.zzdh.getString("topic_operaion_queue", "");
        }
        return string;
    }

    public final void zzal() {
        synchronized (this) {
            this.zzdj.clear();
            zzy.zza(this.zzac);
            this.zzdh.edit().clear().commit();
        }
    }

    public final zzax zzb(String str, String str2, String str3) {
        zzax zzi;
        synchronized (this) {
            zzi = zzax.zzi(this.zzdh.getString(zza(str, str2, str3), null));
        }
        return zzi;
    }

    public final void zzc(String str, String str2, String str3) {
        synchronized (this) {
            String zza = zza(str, str2, str3);
            Editor edit = this.zzdh.edit();
            edit.remove(zza);
            edit.commit();
        }
    }

    public final void zzf(String str) {
        synchronized (this) {
            this.zzdh.edit().putString("topic_operaion_queue", str).apply();
        }
    }

    public final zzz zzg(String str) {
        zzz zzz;
        synchronized (this) {
            zzz = (zzz) this.zzdj.get(str);
            if (zzz != null) {
            } else {
                try {
                    zzz = this.zzdi.zzb(this.zzac, str);
                } catch (zzaa e) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    FirebaseInstanceId.getInstance().zzn();
                    zzz = this.zzdi.zzc(this.zzac, str);
                }
                this.zzdj.put(str, zzz);
            }
        }
        return zzz;
    }

    public final void zzh(String str) {
        synchronized (this) {
            String concat = String.valueOf(str).concat("|T|");
            Editor edit = this.zzdh.edit();
            for (String str2 : this.zzdh.getAll().keySet()) {
                if (str2.startsWith(concat)) {
                    edit.remove(str2);
                }
            }
            edit.commit();
        }
    }
}
