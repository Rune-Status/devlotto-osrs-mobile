package com.appsflyer;

import android.os.Build.VERSION;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AFHelper {
    public static JSONObject convertToJsonObject(Map<String, ?> map) {
        return VERSION.SDK_INT >= 19 ? new JSONObject(map) : toJsonObject(map);
    }

    public static JSONObject toJsonObject(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), m11(entry.getValue()));
            } catch (JSONException e) {
            }
        }
        return jSONObject;
    }

    /* renamed from: ˏ */
    private static Object m11(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            JSONArray jSONArray;
            if (obj instanceof Collection) {
                jSONArray = new JSONArray();
                for (Object ˏ : (Collection) obj) {
                    jSONArray.put(m11(ˏ));
                }
                return jSONArray;
            } else if (!obj.getClass().isArray()) {
                return obj instanceof Map ? toJsonObject((Map) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            } else {
                int length = Array.getLength(obj);
                jSONArray = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray.put(m11(Array.get(obj, i)));
                }
                return jSONArray;
            }
        } catch (Exception e) {
            return JSONObject.NULL;
        }
    }
}
