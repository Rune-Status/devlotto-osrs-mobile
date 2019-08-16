package com.jagex.mobilesdk.common.comms;

import com.jagex.mobilesdk.auth.config.JagexConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

public class CommsUtils {
    public static final String ERROR_INVALID_HTTP_RESPONSE = "Invalid HTTP Response";
    public static final String HTTP_ACTION_GET = "GET";
    public static final String HTTP_ACTION_POST = "POST";
    public static final String HTTP_HEADER_ACCEPT = "Accept";
    public static final String HTTP_HEADER_ACCEPT_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public static final String HTTP_HEADER_ACCEPT_HAL_JSON = "application/hal+json";
    public static final String HTTP_HEADER_ACCEPT_JSON = "application/json";
    public static final String HTTP_HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String HTTP_HEADER_ACCEPT_RESOLUTION = "Accept-Resolution";
    public static final String HTTP_HEADER_ACCEPT_TYPE = "Accept-Type";
    public static final String HTTP_HEADER_AUTHORIZATION = "Authorization";
    public static final String HTTP_HEADER_BASIC = "Basic";
    public static final String HTTP_HEADER_BEARER = "Bearer";
    public static final String HTTP_HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HTTP_PARAM_GRANT_TYPE = "grant_type";
    public static final String HTTP_PARAM_REDIRECT_URI = "redirect_uri";
    public static final String HTTP_PARAM_REDIRTO = "redirTo";
    public static final String HTTP_PARAM_REFRESH_TOKEN = "refresh_token";
    public static final String HTTP_PARAM_SCOPE = "scope";
    public static final String HTTP_PARAM_SERVER_AUTH_CODE = "serverAuthCode";
    public static final String HTTP_PARAM_SIG = "sig";
    public static final String HTTP_PARAM_TOKEN = "token";
    public static final String HTTP_PARAM_TOKEN_TYPE_HINT = "token_type_hint";
    public static final String HTTP_THIRD_PARTY_ID = "thirdPartyId";
    public static final String HTTP_VALUE_GRANT_TYPE = "refresh_token";
    public static final String HTTP_VALUE_TOKEN_HINT_TYPE = "refresh_token";
    private static String base64String = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static char[] base64encode = base64String.toCharArray();

    public static String basicAuthParam(JagexConfig jagexConfig) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(jagexConfig.getClientId());
        stringBuilder.append(":");
        stringBuilder.append(jagexConfig.getClientSecret());
        byte[] bytes = stringBuilder.toString().getBytes();
        String encodeBase64 = encodeBase64(bytes, 0, bytes.length);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Basic ");
        stringBuilder2.append(encodeBase64);
        return stringBuilder2.toString();
    }

    public static String encodeBase64(byte[] bArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3 += 3) {
            int i4 = bArr[i3] & 255;
            stringBuilder.append(base64encode[i4 >>> 2]);
            if (i3 < i2 - 1) {
                int i5 = bArr[i3 + 1] & 255;
                stringBuilder.append(base64encode[((i4 & 3) << 4) | (i5 >>> 4)]);
                if (i3 < i2 - 2) {
                    i4 = bArr[i3 + 2] & 255;
                    stringBuilder.append(base64encode[((i5 & 15) << 2) | (i4 >>> 6)]);
                    stringBuilder.append(base64encode[i4 & 63]);
                } else {
                    stringBuilder.append(base64encode[(i5 & 15) << 2]);
                    stringBuilder.append("=");
                }
            } else {
                stringBuilder.append(base64encode[(i4 & 3) << 4]);
                stringBuilder.append("==");
            }
        }
        return stringBuilder.toString();
    }

    public static String formUrlEncode(Map<String, String> map) {
        if (map != null) {
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            for (Entry entry : map.entrySet()) {
                try {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append((String) entry.getKey());
                    stringBuilder2.append("=");
                    stringBuilder2.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
                    stringBuilder.append(stringBuilder2.toString());
                    if (i < map.size() - 1) {
                        stringBuilder.append("&");
                    }
                    i++;
                } catch (UnsupportedEncodingException e) {
                }
            }
            return stringBuilder.toString();
        }
        throw new NullPointerException("Null map of parameters passed in for Encoding.");
    }

    public static int mapResponseCode(int i) {
        return i != 200 ? i != 401 ? (i == 404 || i == 502) ? CommsResult.RESULT_JAGEX_ACCESS_ERROR : -1 : CommsResult.RESULT_NOT_AUTHORIZED : 0;
    }
}
