package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class zzy {
    zzy() {
    }

    @Nullable
    private final zzz zza(Context context, String str, zzz zzz, boolean z) {
        String valueOf;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to properties file");
        }
        Properties properties = new Properties();
        properties.setProperty("pub", zzz.zzv());
        properties.setProperty("pri", zzz.zzw());
        properties.setProperty("cre", String.valueOf(zzz.zzbw));
        File zzf = zzf(context, str);
        try {
            zzf.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(zzf, "rw");
            Throwable th;
            Throwable th2;
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0);
                            zzz = zza(channel);
                            if (channel != null) {
                                zza(null, channel);
                            }
                            zza(null, randomAccessFile);
                            return zzz;
                        } catch (zzaa | IOException e) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                valueOf = String.valueOf(e);
                                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 64);
                                stringBuilder.append("Tried reading key pair before writing new one, but failed with: ");
                                stringBuilder.append(valueOf);
                                Log.d("FirebaseInstanceId", stringBuilder.toString());
                            }
                        }
                    }
                    channel.position(0);
                    properties.store(Channels.newOutputStream(channel), null);
                    if (channel != null) {
                        zza(null, channel);
                    }
                    zza(null, randomAccessFile);
                    return zzz;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = e;
                }
                zza(th2, randomAccessFile);
                throw th;
                if (channel != null) {
                    zza(th2, channel);
                }
                throw th;
            } catch (Throwable th4) {
                th = th4;
                th2 = e;
            }
        } catch (IOException e2) {
            valueOf = String.valueOf(e2);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder2.append("Failed to write key: ");
            stringBuilder2.append(valueOf);
            Log.w("FirebaseInstanceId", stringBuilder2.toString());
            return null;
        }
    }

    @Nullable
    private static zzz zza(SharedPreferences sharedPreferences, String str) throws zzaa {
        String string = sharedPreferences.getString(zzaw.zzd(str, "|P|"), null);
        String string2 = sharedPreferences.getString(zzaw.zzd(str, "|K|"), null);
        return (string == null || string2 == null) ? null : new zzz(zzc(string, string2), zzb(sharedPreferences, str));
    }

    private final zzz zza(File file) throws zzaa, IOException {
        Throwable th;
        FileInputStream fileInputStream = new FileInputStream(file);
        Throwable th2;
        try {
            Throwable th3;
            Throwable th4;
            FileChannel channel = fileInputStream.getChannel();
            try {
                channel.lock(0, Long.MAX_VALUE, true);
                zzz zza = zza(channel);
                if (channel != null) {
                    zza(null, channel);
                }
                zza(null, fileInputStream);
                return zza;
            } catch (Throwable th5) {
                th4 = th5;
                th3 = th;
            }
            if (channel != null) {
                zza(th3, channel);
            }
            throw th4;
            zza(th2, fileInputStream);
            throw th;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private static zzz zza(FileChannel fileChannel) throws zzaa, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new zzaa("Invalid properties file");
        }
        try {
            return new zzz(zzc(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new zzaa(e);
        }
    }

    static void zza(Context context) {
        for (File file : zzb(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final void zza(Context context, String str, zzz zzz) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (zzz.equals(zza(sharedPreferences, str))) {
                return;
            }
        } catch (zzaa e) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(zzaw.zzd(str, "|P|"), zzz.zzv());
        edit.putString(zzaw.zzd(str, "|K|"), zzz.zzw());
        edit.putString(zzaw.zzd(str, "cre"), String.valueOf(zzz.zzbw));
        edit.commit();
    }

    private static long zzb(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzaw.zzd(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    private static File zzb(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static KeyPair zzc(String str, String str2) throws zzaa {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
                stringBuilder.append("Invalid key stored ");
                stringBuilder.append(valueOf);
                Log.w("FirebaseInstanceId", stringBuilder.toString());
                throw new zzaa(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzaa(e2);
        }
    }

    @Nullable
    private final zzz zzd(Context context, String str) throws zzaa {
        zzaa zzaa;
        zzaa e;
        try {
            zzz zze = zze(context, str);
            if (zze != null) {
                zza(context, str, zze);
                return zze;
            }
            zzaa = null;
            try {
                zze = zza(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (zze != null) {
                    zza(context, str, zze, false);
                    return zze;
                }
                e = zzaa;
                if (e == null) {
                    return null;
                }
                throw e;
            } catch (zzaa e2) {
                e = e2;
            }
        } catch (zzaa e3) {
            zzaa = e3;
        }
    }

    @Nullable
    private final zzz zze(Context context, String str) throws zzaa {
        StringBuilder stringBuilder;
        File zzf = zzf(context, str);
        if (!zzf.exists()) {
            return null;
        }
        try {
            return zza(zzf);
        } catch (zzaa | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
                stringBuilder.append("Failed to read key from file, retrying: ");
                stringBuilder.append(valueOf);
                Log.d("FirebaseInstanceId", stringBuilder.toString());
            }
            try {
                return zza(zzf);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                stringBuilder.append("IID file exists, but failed to read from it: ");
                stringBuilder.append(valueOf2);
                Log.w("FirebaseInstanceId", stringBuilder.toString());
                throw new zzaa(e2);
            }
        }
    }

    private static File zzf(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                str2 = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 33);
                stringBuilder.append("com.google.InstanceId_");
                stringBuilder.append(str2);
                stringBuilder.append(".properties");
                str2 = stringBuilder.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(zzb(context), str2);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final zzz zzb(Context context, String str) throws zzaa {
        zzz zzd = zzd(context, str);
        return zzd != null ? zzd : zzc(context, str);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final zzz zzc(Context context, String str) {
        zzz zzz = new zzz(zza.zzc(), System.currentTimeMillis());
        zzz zza = zza(context, str, zzz, true);
        if (zza == null || zza.equals(zzz)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            zza(context, str, zzz);
            return zzz;
        } else if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return zza;
        } else {
            Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            return zza;
        }
    }
}
