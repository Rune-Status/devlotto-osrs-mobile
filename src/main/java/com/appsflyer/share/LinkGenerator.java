package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask.ResponseListener;
import com.appsflyer.ServerConfigHandler;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkGenerator {
    /* renamed from: ʻ */
    private String f254;
    /* renamed from: ʼ */
    private String f255;
    /* renamed from: ʽ */
    private String f256;
    /* renamed from: ˊ */
    private String f257;
    /* renamed from: ˋ */
    private String f258;
    /* renamed from: ˋॱ */
    private Map<String, String> f259 = new HashMap();
    /* renamed from: ˎ */
    private String f260;
    /* renamed from: ˏ */
    private String f261;
    /* renamed from: ˏॱ */
    private String f262;
    /* renamed from: ॱ */
    private String f263;
    /* renamed from: ॱˊ */
    private Map<String, String> f264 = new HashMap();
    /* renamed from: ॱॱ */
    private String f265;
    /* renamed from: ᐝ */
    private String f266;

    public LinkGenerator(String str) {
        this.f257 = str;
    }

    /* renamed from: ˋ */
    private static String m188(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder stringBuilder = new StringBuilder("Illegal ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            AFLogger.afInfoLog(stringBuilder.toString());
            return "";
        } catch (Throwable th) {
            return "";
        }
    }

    /* renamed from: ˏ */
    private StringBuilder m189() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f266 == null || !this.f266.startsWith("http")) {
            stringBuilder.append(ServerConfigHandler.getUrl(Constants.BASE_URL_APP_APPSFLYER_COM));
        } else {
            stringBuilder.append(this.f266);
        }
        if (this.f254 != null) {
            stringBuilder.append('/');
            stringBuilder.append(this.f254);
        }
        this.f264.put(Constants.URL_MEDIA_SOURCE, this.f257);
        stringBuilder.append('?');
        stringBuilder.append("pid=");
        stringBuilder.append(m188(this.f257, "media source"));
        if (this.f258 != null) {
            this.f264.put(Constants.URL_REFERRER_UID, this.f258);
            stringBuilder.append('&');
            stringBuilder.append("af_referrer_uid=");
            stringBuilder.append(m188(this.f258, "referrerUID"));
        }
        if (this.f260 != null) {
            this.f264.put("af_channel", this.f260);
            stringBuilder.append('&');
            stringBuilder.append("af_channel=");
            stringBuilder.append(m188(this.f260, AppsFlyerProperties.CHANNEL));
        }
        if (this.f263 != null) {
            this.f264.put(Constants.URL_REFERRER_CUSTOMER_ID, this.f263);
            stringBuilder.append('&');
            stringBuilder.append("af_referrer_customer_id=");
            stringBuilder.append(m188(this.f263, "referrerCustomerId"));
        }
        if (this.f261 != null) {
            this.f264.put(Constants.URL_CAMPAIGN, this.f261);
            stringBuilder.append('&');
            stringBuilder.append("c=");
            stringBuilder.append(m188(this.f261, Param.CAMPAIGN));
        }
        if (this.f265 != null) {
            this.f264.put(Constants.URL_REFERRER_NAME, this.f265);
            stringBuilder.append('&');
            stringBuilder.append("af_referrer_name=");
            stringBuilder.append(m188(this.f265, "referrerName"));
        }
        if (this.f256 != null) {
            this.f264.put(Constants.URL_REFERRER_IMAGE_URL, this.f256);
            stringBuilder.append('&');
            stringBuilder.append("af_referrer_image_url=");
            stringBuilder.append(m188(this.f256, "referrerImageURL"));
        }
        if (this.f262 != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.f262);
            stringBuilder2.append(this.f262.endsWith(Constants.URL_PATH_DELIMITER) ? "" : Constants.URL_PATH_DELIMITER);
            if (this.f255 != null) {
                stringBuilder2.append(this.f255);
            }
            this.f264.put(Constants.URL_BASE_DEEPLINK, stringBuilder2.toString());
            stringBuilder.append('&');
            stringBuilder.append("af_dp=");
            stringBuilder.append(m188(this.f262, "baseDeeplink"));
            if (this.f255 != null) {
                stringBuilder.append(this.f262.endsWith(Constants.URL_PATH_DELIMITER) ? "" : "%2F");
                stringBuilder.append(m188(this.f255, "deeplinkPath"));
            }
        }
        for (String str : this.f259.keySet()) {
            String obj = stringBuilder.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append("=");
            stringBuilder3.append(m188((String) this.f259.get(str), str));
            if (!obj.contains(stringBuilder3.toString())) {
                stringBuilder.append('&');
                stringBuilder.append(str);
                stringBuilder.append('=');
                stringBuilder.append(m188((String) this.f259.get(str), str));
            }
        }
        return stringBuilder;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f259.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f259.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        return m189().toString();
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.f259.isEmpty()) {
            for (Entry entry : this.f259.entrySet()) {
                this.f264.put(entry.getKey(), entry.getValue());
            }
        }
        m189();
        ShareInviteHelper.generateUserInviteLink(context, string, this.f264, responseListener);
    }

    public String getCampaign() {
        return this.f261;
    }

    public String getChannel() {
        return this.f260;
    }

    public String getMediaSource() {
        return this.f257;
    }

    public Map<String, String> getParameters() {
        return this.f259;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f262 = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.f266 = String.format(Constants.AF_BASE_URL_FORMAT, new Object[]{ServerConfigHandler.getUrl(Constants.APPSFLYER_DEFAULT_APP_DOMAIN), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = Constants.ONELINK_DEFAULT_DOMAIN;
            }
            this.f266 = String.format(Constants.AF_BASE_URL_FORMAT, new Object[]{str2, str});
        }
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.f261 = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.f260 = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f255 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f263 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f256 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f265 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f258 = str;
        return this;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final LinkGenerator m190(String str) {
        this.f266 = str;
        return this;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final LinkGenerator m191(String str) {
        this.f254 = str;
        return this;
    }
}
