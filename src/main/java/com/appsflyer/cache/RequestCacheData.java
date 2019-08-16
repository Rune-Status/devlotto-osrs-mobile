package com.appsflyer.cache;

import java.util.Scanner;

public class RequestCacheData {
    /* renamed from: ˋ */
    private String f130;
    /* renamed from: ˎ */
    private String f131;
    /* renamed from: ˏ */
    private String f132;
    /* renamed from: ॱ */
    private String f133;

    public RequestCacheData(String str, String str2, String str3) {
        this.f133 = str;
        this.f130 = str2;
        this.f131 = str3;
    }

    public RequestCacheData(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f133 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f131 = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.f130 = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }

    public String getCacheKey() {
        return this.f132;
    }

    public String getPostData() {
        return this.f130;
    }

    public String getRequestURL() {
        return this.f133;
    }

    public String getVersion() {
        return this.f131;
    }

    public void setCacheKey(String str) {
        this.f132 = str;
    }

    public void setPostData(String str) {
        this.f130 = str;
    }

    public void setRequestURL(String str) {
        this.f133 = str;
    }

    public void setVersion(String str) {
        this.f131 = str;
    }
}
