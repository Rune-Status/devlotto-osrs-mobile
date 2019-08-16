package com.appsflyer;

import java.security.MessageDigest;
import java.util.Formatter;

final class p {
    p() {
    }

    /* renamed from: ˊ */
    public static String m155(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m156(instance.digest());
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to SHA1");
            AFLogger.afErrorLog(stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: ˎ */
    private static String m156(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    /* renamed from: ˏ */
    public static String m157(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to SHA-256");
            AFLogger.afErrorLog(stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: ॱ */
    public static String m158(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m156(instance.digest());
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to MD5");
            AFLogger.afErrorLog(stringBuilder.toString(), e);
            return null;
        }
    }
}
