package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.appsflyer.share.Constants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class DynamiteModule {
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzb();
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzid = null;
    @GuardedBy("DynamiteModule.class")
    private static zzi zzie = null;
    @GuardedBy("DynamiteModule.class")
    private static zzk zzif = null;
    @GuardedBy("DynamiteModule.class")
    private static String zzig = null;
    @GuardedBy("DynamiteModule.class")
    private static int zzih = -1;
    private static final ThreadLocal<zza> zzii = new ThreadLocal();
    private static final zza zzij = new zza();
    private static final VersionPolicy zzik = new zzc();
    private static final VersionPolicy zzil = new zzg();
    private final Context zzim;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zza zza) {
            this(str, th);
        }
    }

    public interface VersionPolicy {

        public interface zza {
            int getLocalVersion(Context context, String str);

            int zza(Context context, String str, boolean z) throws LoadingException;
        }

        public static final class zzb {
            public int zziq = 0;
            public int zzir = 0;
            public int zzis = 0;
        }

        zzb zza(Context context, String str, zza zza) throws LoadingException;
    }

    private static final class zza {
        public Cursor zzin;

        private zza() {
        }

        /* synthetic */ zza(zza zza) {
            this();
        }
    }

    private static final class zzb implements zza {
        private final int zzio;
        private final int zzip = 0;

        public zzb(int i, int i2) {
            this.zzio = i;
        }

        public final int getLocalVersion(Context context, String str) {
            return this.zzio;
        }

        public final int zza(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        this.zzim = (Context) Preconditions.checkNotNull(context);
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        String valueOf;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
            stringBuilder.append("com.google.android.gms.dynamite.descriptors.");
            stringBuilder.append(str);
            stringBuilder.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(stringBuilder.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf = String.valueOf(declaredField.get(null));
            stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length());
            stringBuilder.append("Module descriptor id '");
            stringBuilder.append(valueOf);
            stringBuilder.append("' didn't match expected id '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            Log.e("DynamiteModule", stringBuilder.toString());
            return 0;
        } catch (ClassNotFoundException e) {
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 45);
            stringBuilder2.append("Local module descriptor class for ");
            stringBuilder2.append(str);
            stringBuilder2.append(" not found.");
            Log.w("DynamiteModule", stringBuilder2.toString());
            return 0;
        } catch (Exception e2) {
            valueOf = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        zza zza = (zza) zzii.get();
        zza zza2 = new zza();
        zzii.set(zza2);
        zzb zza3;
        DynamiteModule zze;
        try {
            zza3 = versionPolicy.zza(context, str, zzij);
            int i = zza3.zziq;
            int i2 = zza3.zzir;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length());
            stringBuilder.append("Considering local module ");
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append(i);
            stringBuilder.append(" and remote module ");
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append(i2);
            Log.i("DynamiteModule", stringBuilder.toString());
            if (zza3.zzis == 0 || ((zza3.zzis == -1 && zza3.zziq == 0) || (zza3.zzis == 1 && zza3.zzir == 0))) {
                i = zza3.zziq;
                i2 = zza3.zzir;
                StringBuilder stringBuilder2 = new StringBuilder(91);
                stringBuilder2.append("No acceptable module found. Local version is ");
                stringBuilder2.append(i);
                stringBuilder2.append(" and remote version is ");
                stringBuilder2.append(i2);
                stringBuilder2.append(".");
                throw new LoadingException(stringBuilder2.toString(), null);
            } else if (zza3.zzis == -1) {
                zze = zze(context, str);
                if (zza2.zzin != null) {
                    zza2.zzin.close();
                }
                zzii.set(zza);
                return zze;
            } else if (zza3.zzis == 1) {
                zze = zza(context, str, zza3.zzir);
                if (zza2.zzin != null) {
                    zza2.zzin.close();
                }
                zzii.set(zza);
                return zze;
            } else {
                i = zza3.zzis;
                StringBuilder stringBuilder3 = new StringBuilder(47);
                stringBuilder3.append("VersionPolicy returned invalid code:");
                stringBuilder3.append(i);
                throw new LoadingException(stringBuilder3.toString(), null);
            }
        } catch (LoadingException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (zza3.zziq == 0 || versionPolicy.zza(context, str, new zzb(zza3.zziq, 0)).zzis != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
            }
            zze = zze(context, str);
            if (zza2.zzin != null) {
                zza2.zzin.close();
            }
            zzii.set(zza);
            return zze;
        } catch (Throwable th) {
            if (zza2.zzin != null) {
                zza2.zzin.close();
            }
            zzii.set(zza);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fa A:{Catch:{ all -> 0x0078, Throwable -> 0x007d }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A:{SYNTHETIC, Splitter:B:24:0x003d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(Context context, String str, boolean z) {
        String valueOf;
        Class loadClass;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzid;
                if (bool == null) {
                    try {
                        loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        Field declaredField = loadClass.getDeclaredField("sClassLoader");
                        synchronized (loadClass) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader != null) {
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        zza(classLoader);
                                    } catch (LoadingException e) {
                                    }
                                    bool = Boolean.TRUE;
                                }
                            } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int zzc = zzc(context, str, z);
                                    if (zzig == null || zzig.isEmpty()) {
                                        return zzc;
                                    }
                                    zzh zzh = new zzh(zzig, ClassLoader.getSystemClassLoader());
                                    zza(zzh);
                                    declaredField.set(null, zzh);
                                    zzid = Boolean.TRUE;
                                    return zzc;
                                } catch (LoadingException e2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                    zzid = bool;
                                    if (bool.booleanValue()) {
                                        return zzb(context, str, z);
                                    }
                                    try {
                                        return zzc(context, str, z);
                                    } catch (LoadingException e3) {
                                        valueOf = String.valueOf(e3.getMessage());
                                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                                        return 0;
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e4) {
                        valueOf = String.valueOf(e4);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        stringBuilder.append("Failed to load module via V2: ");
                        stringBuilder.append(valueOf);
                        Log.w("DynamiteModule", stringBuilder.toString());
                        bool = Boolean.FALSE;
                        zzid = bool;
                        if (bool.booleanValue()) {
                        }
                    }
                }
            }
        } catch (Throwable e42) {
            CrashUtils.addDynamiteErrorToDropBox(context, e42);
        }
    }

    private static Context zza(Context context, String str, int i, Cursor cursor, zzk zzk) {
        try {
            IObjectWrapper zzb;
            ObjectWrapper.wrap(null);
            if (zzai().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                zzb = zzk.zzb(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                zzb = zzk.zza(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(cursor));
            }
            return (Context) ObjectWrapper.unwrap(zzb);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(valueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static DynamiteModule zza(Context context, String str, int i) throws LoadingException {
        try {
            Boolean bool;
            synchronized (DynamiteModule.class) {
                bool = zzid;
            }
            if (bool != null) {
                return bool.booleanValue() ? zzc(context, str, i) : zzb(context, str, i);
            } else {
                throw new LoadingException("Failed to determine which loading route to use.", null);
            }
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
        }
    }

    @GuardedBy("DynamiteModule.class")
    private static void zza(ClassLoader classLoader) throws LoadingException {
        try {
            zzk zzk;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzk = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzk) {
                    zzk = (zzk) queryLocalInterface;
                } else {
                    Object zzk2 = new zzl(iBinder);
                }
            }
            zzif = zzk2;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static Boolean zzai() {
        boolean z;
        synchronized (DynamiteModule.class) {
            try {
                z = zzih >= 2;
            } catch (Throwable th) {
                Class cls = DynamiteModule.class;
            }
        }
        return Boolean.valueOf(z);
    }

    private static int zzb(Context context, String str, boolean z) {
        zzi zzj = zzj(context);
        if (zzj == null) {
            return 0;
        }
        try {
            if (zzj.zzaj() >= 2) {
                return zzj.zzb(ObjectWrapper.wrap(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return zzj.zza(ObjectWrapper.wrap(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule zzb(Context context, String str, int i) throws LoadingException {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("Selected remote version of ");
        stringBuilder.append(str);
        stringBuilder.append(", version >= ");
        stringBuilder.append(i);
        Log.i("DynamiteModule", stringBuilder.toString());
        zzi zzj = zzj(context);
        if (zzj != null) {
            try {
                IObjectWrapper zzb;
                if (zzj.zzaj() >= 2) {
                    zzb = zzj.zzb(ObjectWrapper.wrap(context), str, i);
                } else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    zzb = zzj.zza(ObjectWrapper.wrap(context), str, i);
                }
                if (ObjectWrapper.unwrap(zzb) != null) {
                    return new DynamiteModule((Context) ObjectWrapper.unwrap(zzb));
                }
                throw new LoadingException("Failed to load remote module.", null);
            } catch (RemoteException e) {
                throw new LoadingException("Failed to load remote module.", e, null);
            }
        }
        throw new LoadingException("Failed to create IDynamiteLoader.", null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzc(Context context, String str, boolean z) throws LoadingException {
        Cursor query;
        Throwable e;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Object obj = z ? "api_force_staging" : "api";
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 42) + String.valueOf(str).length());
            stringBuilder.append("content://com.google.android.gms.chimera/");
            stringBuilder.append(obj);
            stringBuilder.append(Constants.URL_PATH_DELIMITER);
            stringBuilder.append(str);
            query = contentResolver.query(Uri.parse(stringBuilder.toString()), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i = query.getInt(0);
                        if (i > 0) {
                            synchronized (DynamiteModule.class) {
                                zzig = query.getString(2);
                                int columnIndex = query.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    zzih = query.getInt(columnIndex);
                                }
                            }
                            zza zza = (zza) zzii.get();
                            if (zza != null && zza.zzin == null) {
                                zza.zzin = query;
                                query = null;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                        return i;
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th) {
                    e = th;
                    if (query != null) {
                    }
                    throw e;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new LoadingException("Failed to connect to dynamite module ContentResolver.", null);
        } catch (Exception e3) {
            e = e3;
            query = null;
        } catch (Throwable th2) {
            e = th2;
            query = null;
            if (query != null) {
                query.close();
            }
            throw e;
        }
        try {
            if (e instanceof LoadingException) {
                throw e;
            }
            throw new LoadingException("V2 version check failed", e, null);
        } catch (Throwable th3) {
            e = th3;
            if (query != null) {
            }
            throw e;
        }
    }

    private static DynamiteModule zzc(Context context, String str, int i) throws LoadingException {
        zzk zzk;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("Selected remote version of ");
        stringBuilder.append(str);
        stringBuilder.append(", version >= ");
        stringBuilder.append(i);
        Log.i("DynamiteModule", stringBuilder.toString());
        synchronized (DynamiteModule.class) {
            try {
                zzk = zzif;
            } catch (Throwable th) {
                while (true) {
                    Class cls = DynamiteModule.class;
                }
            }
        }
        if (zzk != null) {
            zza zza = (zza) zzii.get();
            if (zza == null || zza.zzin == null) {
                throw new LoadingException("No result cursor", null);
            }
            Context zza2 = zza(context.getApplicationContext(), str, i, zza.zzin, zzk);
            if (zza2 != null) {
                return new DynamiteModule(zza2);
            }
            throw new LoadingException("Failed to get module context", null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
    }

    private static DynamiteModule zze(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static zzi zzj(Context context) {
        synchronized (DynamiteModule.class) {
            try {
                zzi zzi;
                if (zzie != null) {
                    zzi = zzie;
                    return zzi;
                } else if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                    return null;
                } else {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        zzi = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof zzi) {
                            zzi = (zzi) queryLocalInterface;
                        } else {
                            Object zzj = new zzj(iBinder);
                        }
                    }
                    if (zzi != null) {
                        zzie = zzi;
                        return zzi;
                    }
                    return null;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            } catch (Throwable th) {
                Class cls = DynamiteModule.class;
            }
        }
    }

    @KeepForSdk
    public final Context getModuleContext() {
        return this.zzim;
    }

    @KeepForSdk
    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzim.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }
}
