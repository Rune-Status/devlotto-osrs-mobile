package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzws {
    private static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzbol = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzbom = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzbon = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzboo = new AtomicBoolean();
    private static HashMap<String, String> zzbop;
    private static final HashMap<String, Boolean> zzboq = new HashMap();
    private static final HashMap<String, Integer> zzbor = new HashMap();
    private static final HashMap<String, Long> zzbos = new HashMap();
    private static final HashMap<String, Float> zzbot = new HashMap();
    private static Object zzbou;
    private static boolean zzbov;
    private static String[] zzbow = new String[0];

    private static <T> T zza(HashMap<String, T> hashMap, String str, T t) {
        synchronized (zzws.class) {
            try {
                if (hashMap.containsKey(str)) {
                    T t2 = hashMap.get(str);
                    if (t2 == null) {
                        t2 = t;
                    }
                    return t2;
                }
                return null;
            } catch (Throwable th) {
                Class cls = zzws.class;
            }
        }
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        String str3 = null;
        synchronized (zzws.class) {
            try {
                zza(contentResolver);
                Object obj = zzbou;
                String str4;
                if (zzbop.containsKey(str)) {
                    str4 = (String) zzbop.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                } else {
                    String[] strArr = zzbow;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        if (str.startsWith(strArr[i])) {
                            if (!zzbov || zzbop.isEmpty()) {
                                zzbop.putAll(zza(contentResolver, zzbow));
                                zzbov = true;
                                if (zzbop.containsKey(str)) {
                                    str4 = (String) zzbop.get(str);
                                    if (str4 != null) {
                                        str3 = str4;
                                    }
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                    Cursor query = contentResolver.query(CONTENT_URI, null, null, new String[]{str}, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str4 = query.getString(1);
                                if (str4 != null && str4.equals(null)) {
                                    str4 = null;
                                }
                                zza(obj, str, str4);
                                if (str4 != null) {
                                    str3 = str4;
                                }
                                if (query != null) {
                                    query.close();
                                }
                            } else {
                                zza(obj, str, null);
                                if (query != null) {
                                    query.close();
                                }
                            }
                        } catch (Throwable th) {
                            if (query != null) {
                                query.close();
                            }
                        }
                    } else if (query != null) {
                        query.close();
                    }
                }
            } catch (Throwable th2) {
                Class cls = zzws.class;
            }
        }
        return str3;
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzbol, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    private static void zza(ContentResolver contentResolver) {
        if (zzbop == null) {
            zzboo.set(false);
            zzbop = new HashMap();
            zzbou = new Object();
            zzbov = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzwt(null));
        } else if (zzboo.getAndSet(false)) {
            zzbop.clear();
            zzboq.clear();
            zzbor.clear();
            zzbos.clear();
            zzbot.clear();
            zzbou = new Object();
            zzbov = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzws.class) {
            try {
                if (obj == zzbou) {
                    zzbop.put(str, str2);
                }
            } catch (Throwable th) {
                Class cls = zzws.class;
            }
        }
    }

    private static <T> void zza(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (zzws.class) {
            try {
                if (obj == zzbou) {
                    hashMap.put(str, t);
                    zzbop.remove(str);
                }
            } catch (Throwable th) {
                Class cls = zzws.class;
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object zzb = zzb(contentResolver);
        Object obj = (Boolean) zza(zzboq, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        String zza = zza(contentResolver, str, null);
        if (!(zza == null || zza.equals(""))) {
            if (zzbom.matcher(zza).matches()) {
                obj = Boolean.valueOf(true);
                z = true;
            } else if (zzbon.matcher(zza).matches()) {
                obj = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder stringBuilder = new StringBuilder("attempt to read gservices key ");
                stringBuilder.append(str);
                stringBuilder.append(" (value \"");
                stringBuilder.append(zza);
                stringBuilder.append("\") as boolean");
                Log.w("Gservices", stringBuilder.toString());
            }
        }
        zza(zzb, zzboq, str, obj);
        return z;
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzws.class) {
            try {
                zza(contentResolver);
                obj = zzbou;
            } catch (Throwable th) {
                Class cls = zzws.class;
            }
        }
        return obj;
    }
}
