package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
public class LibraryVersion {
    private static final GmsLogger zzel = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzem = new LibraryVersion();
    private ConcurrentHashMap<String, String> zzen = new ConcurrentHashMap();

    @VisibleForTesting
    protected LibraryVersion() {
    }

    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @KeepForSdk
    public String getVersion(@NonNull String str) {
        Object obj;
        Throwable e;
        GmsLogger gmsLogger;
        String valueOf;
        String str2 = null;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzen.containsKey(str)) {
            return (String) this.zzen.get(str);
        }
        Properties properties = new Properties();
        String obj2;
        try {
            InputStream resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                try {
                    GmsLogger gmsLogger2 = zzel;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(str2).length());
                    stringBuilder.append(str);
                    stringBuilder.append(" version is ");
                    stringBuilder.append(str2);
                    gmsLogger2.v("LibraryVersion", stringBuilder.toString());
                    obj2 = str2;
                } catch (IOException e2) {
                    e = e2;
                    gmsLogger = zzel;
                    valueOf = String.valueOf(str);
                    gmsLogger.e("LibraryVersion", valueOf.length() == 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "), e);
                    obj2 = str2;
                    if (obj2 == null) {
                    }
                    this.zzen.put(str, obj2);
                    return obj2;
                }
            }
            GmsLogger gmsLogger3 = zzel;
            obj2 = String.valueOf(str);
            gmsLogger3.e("LibraryVersion", obj2.length() != 0 ? "Failed to get app version for libraryName: ".concat(obj2) : new String("Failed to get app version for libraryName: "));
            obj2 = null;
        } catch (IOException e3) {
            e = e3;
            gmsLogger = zzel;
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
            }
            gmsLogger.e("LibraryVersion", valueOf.length() == 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "), e);
            obj2 = str2;
            if (obj2 == null) {
            }
            this.zzen.put(str, obj2);
            return obj2;
        }
        if (obj2 == null) {
            obj2 = "UNKNOWN";
            zzel.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
        }
        this.zzen.put(str, obj2);
        return obj2;
    }
}
