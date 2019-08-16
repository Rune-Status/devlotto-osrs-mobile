package com.google.android.gms.internal.measurement;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzack {
    private static void zza(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj == null) {
            return;
        }
        int modifiers;
        int length;
        String name;
        if (obj instanceof zzacj) {
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(zzfs(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class cls = obj.getClass();
            for (Field field : cls.getFields()) {
                modifiers = field.getModifiers();
                String name2 = field.getName();
                if (!("cachedSize".equals(name2) || (modifiers & 1) != 1 || (modifiers & 8) == 8 || name2.startsWith("_") || name2.endsWith("_"))) {
                    Class type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        zza(name2, obj2, stringBuffer, stringBuffer2);
                    } else {
                        length = obj2 == null ? 0 : Array.getLength(obj2);
                        for (modifiers = 0; modifiers < length; modifiers++) {
                            zza(name2, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name3 : cls.getMethods()) {
                name = name3.getName();
                if (name.startsWith("set")) {
                    String substring = name.substring(3);
                    try {
                        name = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(name.length() != 0 ? "has".concat(name) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            name = String.valueOf(substring);
                            zza(substring, cls.getMethod(name.length() != 0 ? "get".concat(name) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException e) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        name = zzfs(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(name);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith("http") && str2.length() > 200) {
                str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
            }
            modifiers = str2.length();
            StringBuilder stringBuilder = new StringBuilder(modifiers);
            for (length = 0; length < modifiers; length++) {
                char charAt = str2.charAt(length);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                } else {
                    stringBuilder.append(charAt);
                }
            }
            name = stringBuilder.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(name);
            name = "\"";
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    name = "\"\"";
                } else {
                    stringBuffer2.append('\"');
                    for (byte b : bArr) {
                        modifiers = b & 255;
                        if (modifiers == 92 || modifiers == 34) {
                            stringBuffer2.append('\\');
                        } else if (modifiers < 32 || modifiers >= 127) {
                            stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(modifiers)}));
                        }
                        stringBuffer2.append((char) modifiers);
                    }
                    stringBuffer2.append('\"');
                }
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
        stringBuffer2.append(name);
        stringBuffer2.append("\n");
    }

    public static <T extends zzacj> String zzc(T t) {
        String valueOf;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            zza(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? "Error printing proto: ".concat(valueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? "Error printing proto: ".concat(valueOf) : new String("Error printing proto: ");
        }
    }

    private static String zzfs(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                } else {
                    stringBuffer.append(charAt);
                }
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }
}
