package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzzv.zza;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

final class zzaas {
    static String zza(zzaaq zzaaq, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(str);
        zza(zzaaq, stringBuilder, 0);
        return stringBuilder.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARNING: Missing block: B:71:0x01da, code skipped:
            if (((java.lang.Boolean) r2).booleanValue() == false) goto L_0x01dc;
     */
    /* JADX WARNING: Missing block: B:86:0x0221, code skipped:
            if (((java.lang.Integer) r2).intValue() == 0) goto L_0x01dc;
     */
    /* JADX WARNING: Missing block: B:90:0x0232, code skipped:
            if (((java.lang.Float) r2).floatValue() == 0.0f) goto L_0x01dc;
     */
    /* JADX WARNING: Missing block: B:94:0x0244, code skipped:
            if (((java.lang.Double) r2).doubleValue() == 0.0d) goto L_0x01dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(zzaaq zzaaq, StringBuilder stringBuilder, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzaaq.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String str2;
            String valueOf;
            String valueOf2;
            Method method2;
            String replaceFirst = str2.replaceFirst("get", "");
            if (!(!replaceFirst.endsWith("List") || replaceFirst.endsWith("OrBuilderList") || replaceFirst.equals("List"))) {
                valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(stringBuilder, i, zzfp(valueOf), zzzv.zza(method2, (Object) zzaaq, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    zzb(stringBuilder, i, zzfp(valueOf), zzzv.zza(method2, (Object) zzaaq, new Object[0]));
                }
            }
            valueOf2 = String.valueOf(replaceFirst);
            if (((Method) hashMap2.get(valueOf2.length() != 0 ? "set".concat(valueOf2) : new String("set"))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    valueOf2 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"))) {
                    }
                }
                str2 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf2 = String.valueOf(replaceFirst.substring(1));
                String concat = valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2);
                valueOf2 = String.valueOf(replaceFirst);
                method2 = (Method) hashMap.get(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"));
                str2 = String.valueOf(replaceFirst);
                Method method3 = (Method) hashMap.get(str2.length() != 0 ? "has".concat(str2) : new String("has"));
                if (method2 != null) {
                    boolean z;
                    zzaaq zza = zzzv.zza(method2, (Object) zzaaq, new Object[0]);
                    if (method3 == null) {
                        if (!(zza instanceof Boolean)) {
                            if (!(zza instanceof Integer)) {
                                if (!(zza instanceof Float)) {
                                    if (!(zza instanceof Double)) {
                                        Object obj;
                                        if (zza instanceof String) {
                                            obj = "";
                                        } else if (zza instanceof zzzb) {
                                            obj = zzzb.zzbte;
                                        } else if (zza instanceof zzaaq) {
                                            z = false;
                                            if (z) {
                                            }
                                        } else {
                                            z = false;
                                            z = z;
                                        }
                                        z = zza.equals(obj);
                                        if (z) {
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } else {
                        z = ((Boolean) zzzv.zza(method3, (Object) zzaaq, new Object[0])).booleanValue();
                    }
                    if (z) {
                        zzb(stringBuilder, i, zzfp(concat), zza);
                    }
                }
            }
        }
        if (zzaaq instanceof zza) {
            Iterator it = ((zza) zzaaq).zzbui.iterator();
            if (it.hasNext()) {
                ((Entry) it.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        zzzv zzzv = (zzzv) zzaaq;
        if (zzzv.zzbuf != null) {
            zzabp zzabp = zzzv.zzbuf;
        }
    }

    static final void zzb(StringBuilder stringBuilder, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(stringBuilder, i, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(stringBuilder, i, str, zzb2);
            }
        } else {
            int i3;
            stringBuilder.append(10);
            for (i3 = 0; i3 < i; i3++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(str);
            if (obj instanceof String) {
                stringBuilder.append(": \"");
                stringBuilder.append(zzabl.zza(zzzb.zzfn((String) obj)));
                stringBuilder.append('\"');
            } else if (obj instanceof zzzb) {
                stringBuilder.append(": \"");
                stringBuilder.append(zzabl.zza((zzzb) obj));
                stringBuilder.append('\"');
            } else if (obj instanceof zzzv) {
                stringBuilder.append(" {");
                zza((zzzv) obj, stringBuilder, i + 2);
                stringBuilder.append("\n");
                while (i2 < i) {
                    stringBuilder.append(' ');
                    i2++;
                }
                stringBuilder.append("}");
            } else if (obj instanceof Entry) {
                stringBuilder.append(" {");
                Entry entry = (Entry) obj;
                i3 = i + 2;
                zzb(stringBuilder, i3, "key", entry.getKey());
                zzb(stringBuilder, i3, Param.VALUE, entry.getValue());
                stringBuilder.append("\n");
                while (i2 < i) {
                    stringBuilder.append(' ');
                    i2++;
                }
                stringBuilder.append("}");
            } else {
                stringBuilder.append(": ");
                stringBuilder.append(obj.toString());
            }
        }
    }

    private static final String zzfp(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }
}
