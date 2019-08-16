package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class zzkd extends zzhj {
    private static final String[] zzasx = new String[]{"firebase_", "google_", "ga_"};
    private int zzadj;
    private SecureRandom zzasy;
    private final AtomicLong zzasz = new AtomicLong(0);
    private Integer zzata = null;

    zzkd(zzgn zzgn) {
        super(zzgn);
    }

    static MessageDigest getMessageDigest() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                return null;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i = i2 + 1;
            } catch (NoSuchAlgorithmException e) {
            }
        }
    }

    private static Object zza(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Float ? Double.valueOf(((Float) obj).doubleValue()) : ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) ? zza(String.valueOf(obj), i, z) : null;
        } else {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
    }

    public static String zza(String str, int i, boolean z) {
        return str.codePointCount(0, str.length()) > i ? z ? String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...") : null : str;
    }

    @Nullable
    public static String zza(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            if (zzs(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    private static void zza(Bundle bundle, Object obj) {
        Preconditions.checkNotNull(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    static boolean zza(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return zzc(context, VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    private static boolean zza(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    private final boolean zza(String str, String str2, int i, Object obj, boolean z) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) <= i) {
                return true;
            }
            zzgi().zziy().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        } else if ((obj instanceof Bundle) && z) {
            return true;
        } else {
            int length;
            int i2;
            Object obj2;
            if ((obj instanceof Parcelable[]) && z) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                length = parcelableArr.length;
                i2 = 0;
                while (i2 < length) {
                    obj2 = parcelableArr[i2];
                    if (obj2 instanceof Bundle) {
                        i2++;
                    } else {
                        zzgi().zziy().zze("All Parcelable[] elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof ArrayList) || !z) {
                return false;
            } else {
                ArrayList arrayList = (ArrayList) obj;
                length = arrayList.size();
                i2 = 0;
                while (i2 < length) {
                    obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        zzgi().zziy().zze("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            return marshall;
        } finally {
            obtain.recycle();
        }
    }

    @VisibleForTesting
    static long zzc(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(bArr.length > 0);
        long j = 0;
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += 8;
            length--;
            j = ((((long) bArr[length]) & 255) << j2) + j;
        }
        return j;
    }

    private static boolean zzc(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            return serviceInfo != null && serviceInfo.enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    static boolean zzcg(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static int zzcl(String str) {
        return "_ldl".equals(str) ? 2048 : "_id".equals(str) ? 256 : 36;
    }

    static boolean zzcm(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean zzd(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    @VisibleForTesting
    private final boolean zze(Context context, String str) {
        Object e;
        zzfk zziv;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e2) {
            e = e2;
            zziv = zzgi().zziv();
            str2 = "Error obtaining certificate";
            zziv.zzg(str2, e);
            return true;
        } catch (NameNotFoundException e3) {
            e = e3;
            zziv = zzgi().zziv();
            str2 = "Package name not found";
            zziv.zzg(str2, e);
            return true;
        }
        return true;
    }

    static Bundle[] zze(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        Object[] copyOf;
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            copyOf = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            copyOf = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) copyOf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A:{Catch:{ IOException | ClassNotFoundException -> 0x003b }} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A:{Catch:{ IOException | ClassNotFoundException -> 0x003b }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Object zzf(Object obj) {
        Throwable th;
        if (obj == null) {
            return null;
        }
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                try {
                    Object readObject = objectInputStream.readObject();
                    try {
                        objectOutputStream.close();
                        objectInputStream.close();
                        return readObject;
                    } catch (IOException | ClassNotFoundException e) {
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                if (objectOutputStream != null) {
                }
                if (objectInputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
            objectInputStream = null;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            throw th;
        }
    }

    private final boolean zzr(String str, String str2) {
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzgi().zziv().zzg("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        zzgi().zziv().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzgi().zziv().zze("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    static boolean zzs(String str, String str2) {
        return (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* Access modifiers changed, original: final */
    public final Bundle zza(@NonNull Uri uri) {
        Bundle bundle = null;
        if (uri != null) {
            try {
                CharSequence queryParameter;
                CharSequence queryParameter2;
                CharSequence queryParameter3;
                CharSequence queryParameter4;
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                } else {
                    queryParameter4 = null;
                    queryParameter3 = null;
                    queryParameter2 = null;
                    queryParameter = null;
                }
                if (!(TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4))) {
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString(Param.CAMPAIGN, queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString(Param.SOURCE, queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString(Param.MEDIUM, queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString(Param.TERM, queryParameter5);
                    }
                    queryParameter5 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString(Param.CONTENT, queryParameter5);
                    }
                    queryParameter5 = uri.getQueryParameter(Param.ACLID);
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString(Param.ACLID, queryParameter5);
                    }
                    queryParameter5 = uri.getQueryParameter(Param.CP1);
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString(Param.CP1, queryParameter5);
                    }
                    queryParameter5 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("anid", queryParameter5);
                    }
                }
            } catch (UnsupportedOperationException e) {
                zzgi().zziy().zzg("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return bundle;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x005b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Missing block: B:30:0x0073, code skipped:
            if (zza("event param", 40, r2) != false) goto L_0x0075;
     */
    /* JADX WARNING: Missing block: B:35:0x0088, code skipped:
            if (zza("event param", 40, r2) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Bundle zza(String str, String str2, Bundle bundle, @Nullable List<String> list, boolean z, boolean z2) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator it = bundle.keySet().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return bundle2;
            }
            String str3 = (String) it.next();
            if (list == null || !list.contains(str3)) {
                int i3;
                i = 14;
                if (z) {
                    if (zzq("event param", str3)) {
                        if (!zza("event param", null, str3)) {
                            i3 = 14;
                            if (i3 == 0) {
                                if (zzr("event param", str3)) {
                                    if (zza("event param", null, str3)) {
                                    }
                                }
                                i = 3;
                            } else {
                                i = i3;
                            }
                            if (i != 0) {
                                Object obj = bundle.get(str3);
                                zzab();
                                if (z2) {
                                    Object obj2;
                                    if (obj instanceof Parcelable[]) {
                                        i = ((Parcelable[]) obj).length;
                                    } else {
                                        if (obj instanceof ArrayList) {
                                            i = ((ArrayList) obj).size();
                                        }
                                        obj2 = 1;
                                        if (obj2 == null) {
                                            i = 17;
                                            if (i != 0 || "_ev".equals(str3)) {
                                                if (!zzcg(str3)) {
                                                    i2++;
                                                    if (i2 > 25) {
                                                        StringBuilder stringBuilder = new StringBuilder(48);
                                                        stringBuilder.append("Event can't contain more than 25 params");
                                                        zzgi().zziv().zze(stringBuilder.toString(), zzgf().zzbm(str2), zzgf().zzb(bundle));
                                                        zza(bundle2, 5);
                                                    }
                                                }
                                                i = i2;
                                            } else if (zza(bundle2, i)) {
                                                bundle2.putString("_ev", zza(str3, 40, true));
                                                zza(bundle2, bundle.get(str3));
                                            }
                                        }
                                    }
                                    if (i > 1000) {
                                        zzgi().zziy().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(i));
                                        obj2 = null;
                                        if (obj2 == null) {
                                        }
                                    }
                                    obj2 = 1;
                                    if (obj2 == null) {
                                    }
                                }
                                int i4 = ((zzgk().zzax(str) && zzcm(str2)) || zzcm(str3)) ? 256 : 100;
                                i = zza("param", str3, i4, obj, z2) ? 0 : 4;
                                if (i != 0) {
                                }
                                if (!zzcg(str3)) {
                                }
                                i = i2;
                            } else if (zza(bundle2, i)) {
                                bundle2.putString("_ev", zza(str3, 40, true));
                                if (i == 3) {
                                    zza(bundle2, (Object) str3);
                                }
                            }
                            bundle2.remove(str3);
                            i = i2;
                        }
                    }
                    i3 = 3;
                    if (i3 == 0) {
                    }
                    if (i != 0) {
                    }
                    bundle2.remove(str3);
                    i = i2;
                }
                i3 = 0;
                if (i3 == 0) {
                }
                if (i != 0) {
                }
                bundle2.remove(str3);
                i = i2;
            }
            i = 0;
            if (i != 0) {
            }
            bundle2.remove(str3);
            i = i2;
        }
    }

    /* Access modifiers changed, original: final */
    public final zzex zza(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzch(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            return new zzex(str2, new zzeu(zzd(zza(str, str2, bundle2, CollectionUtils.listOf((Object) "_o"), false, false))), str3, j);
        }
        zzgi().zziv().zzg("Invalid conditional property event name", zzgf().zzbo(str2));
        throw new IllegalArgumentException();
    }

    public final void zza(int i, String str, String str2, int i2) {
        zza(null, i, str, str2, i2);
    }

    /* Access modifiers changed, original: final */
    public final void zza(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                zzgi().zziz().zze("Not putting event parameter. Invalid value type. name, type", zzgf().zzbn(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zza(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.zzacv.zzgl();
        this.zzacv.zzfy().logEvent("auto", "_err", bundle);
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(String str, int i, String str2) {
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            zzgi().zziv().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(String str, String[] strArr, String str2) {
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        boolean z;
        Preconditions.checkNotNull(str2);
        for (String startsWith : zzasx) {
            if (str2.startsWith(startsWith)) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            zzgi().zziv().zze("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Preconditions.checkNotNull(strArr);
            for (String zzs : strArr) {
                if (zzs(str2, zzs)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                zzgi().zziv().zze("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    /* Access modifiers changed, original: final */
    public final int zzch(String str) {
        return !zzr(NotificationCompat.CATEGORY_EVENT, str) ? 2 : !zza(NotificationCompat.CATEGORY_EVENT, Event.zzacw, str) ? 13 : zza(NotificationCompat.CATEGORY_EVENT, 40, str) ? 0 : 2;
    }

    public final int zzci(String str) {
        return !zzq("user property", str) ? 6 : !zza("user property", UserProperty.zzada, str) ? 15 : zza("user property", 24, str) ? 0 : 6;
    }

    /* Access modifiers changed, original: final */
    public final int zzcj(String str) {
        return !zzr("user property", str) ? 6 : !zza("user property", UserProperty.zzada, str) ? 15 : zza("user property", 24, str) ? 0 : 6;
    }

    /* Access modifiers changed, original: final */
    public final boolean zzck(String str) {
        if (TextUtils.isEmpty(str)) {
            zzgi().zziv().log("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        zzgi().zziv().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean zzcn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzhs = zzgk().zzhs();
        zzgl();
        return zzhs.equals(str);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final long zzd(Context context, String str) {
        zzab();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigest = getMessageDigest();
        if (messageDigest == null) {
            zzgi().zziv().log("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!zze(context, str)) {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(getContext().getPackageName(), 64);
                    if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                        return zzc(messageDigest.digest(packageInfo.signatures[0].toByteArray()));
                    }
                    zzgi().zziy().log("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                zzgi().zziv().zzg("Package name not found", e);
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final Bundle zzd(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzh = zzh(str, bundle.get(str));
                if (zzh == null) {
                    zzgi().zziy().zzg("Param value can't be null", zzgf().zzbn(str));
                } else {
                    zza(bundle2, str, zzh);
                }
            }
        }
        return bundle2;
    }

    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzer zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfg zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzkd zzgg() {
        return super.zzgg();
    }

    public final /* bridge */ /* synthetic */ zzgi zzgh() {
        return super.zzgh();
    }

    public final /* bridge */ /* synthetic */ zzfi zzgi() {
        return super.zzgi();
    }

    public final /* bridge */ /* synthetic */ zzft zzgj() {
        return super.zzgj();
    }

    public final /* bridge */ /* synthetic */ zzeh zzgk() {
        return super.zzgk();
    }

    public final /* bridge */ /* synthetic */ zzee zzgl() {
        return super.zzgl();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzgn() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzgo() {
        zzab();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzgi().zziy().log("Utils falling back to Random for random id");
            }
        }
        this.zzasz.set(nextLong);
    }

    /* Access modifiers changed, original: final */
    public final Object zzh(String str, Object obj) {
        boolean z;
        int i = 256;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            if (!zzcm(str)) {
                i = 100;
            }
            z = false;
        }
        return zza(i, obj, z);
    }

    /* Access modifiers changed, original: final */
    public final int zzi(String str, Object obj) {
        return "_ldl".equals(str) ? zza("user property referrer", str, zzcl(str), obj, false) : zza("user property", str, zzcl(str), obj, false) ? 0 : 7;
    }

    /* Access modifiers changed, original: final */
    public final Object zzj(String str, Object obj) {
        int zzcl;
        boolean z;
        if ("_ldl".equals(str)) {
            zzcl = zzcl(str);
            z = true;
        } else {
            zzcl = zzcl(str);
            z = false;
        }
        return zza(zzcl, obj, z);
    }

    public final long zzln() {
        if (this.zzasz.get() == 0) {
            long nextLong;
            long j;
            synchronized (this.zzasz) {
                nextLong = new Random(System.nanoTime() ^ zzbt().currentTimeMillis()).nextLong();
                int i = this.zzadj + 1;
                this.zzadj = i;
                j = (long) i;
            }
            return nextLong + j;
        }
        long andIncrement;
        synchronized (this.zzasz) {
            this.zzasz.compareAndSet(-1, 1);
            andIncrement = this.zzasz.getAndIncrement();
        }
        return andIncrement;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final SecureRandom zzlo() {
        zzab();
        if (this.zzasy == null) {
            this.zzasy = new SecureRandom();
        }
        return this.zzasy;
    }

    public final int zzlp() {
        if (this.zzata == null) {
            this.zzata = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
        }
        return this.zzata.intValue();
    }

    /* Access modifiers changed, original: final */
    public final boolean zzq(String str, String str2) {
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzgi().zziv().zzg("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt)) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        zzgi().zziv().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzgi().zziv().zze("Name must start with a letter. Type, name", str, str2);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final boolean zzx(String str) {
        zzab();
        if (Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzgi().zzjb().zzg("Permission not granted", str);
        return false;
    }
}
