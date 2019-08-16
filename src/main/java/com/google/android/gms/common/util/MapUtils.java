package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder stringBuilder, HashMap<String, String> hashMap) {
        stringBuilder.append("{");
        Object obj = 1;
        for (String str : hashMap.keySet()) {
            Object obj2;
            if (obj == null) {
                stringBuilder.append(",");
                obj2 = obj;
            } else {
                obj2 = null;
            }
            String str2 = (String) hashMap.get(str);
            stringBuilder.append("\"");
            stringBuilder.append(str);
            stringBuilder.append("\":");
            if (str2 == null) {
                stringBuilder.append("null");
                obj = obj2;
            } else {
                stringBuilder.append("\"");
                stringBuilder.append(str2);
                stringBuilder.append("\"");
                obj = obj2;
            }
        }
        stringBuilder.append("}");
    }
}
