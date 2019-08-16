package com.appsflyer;

final class q implements c {
    /* renamed from: ˏ */
    private c f217 = this;

    enum a {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native"),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "io.flutter.plugin.common.MethodChannel.MethodCallHandler");
        
        /* renamed from: ʽ */
        private String f215;
        /* renamed from: ॱॱ */
        private String f216;

        private a(String str, String str2) {
            this.f216 = str;
            this.f215 = str2;
        }
    }

    interface c {
        /* renamed from: ˏ */
        Class<?> m159(String str) throws ClassNotFoundException;
    }

    q() {
    }

    /* renamed from: ॱ */
    private boolean m160(String str) {
        try {
            this.f217.m159(str);
            StringBuilder stringBuilder = new StringBuilder("Class: ");
            stringBuilder.append(str);
            stringBuilder.append(" is found.");
            AFLogger.afRDLog(stringBuilder.toString());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final String m161() {
        for (a aVar : a.values()) {
            if (m160(aVar.f215)) {
                return aVar.f216;
            }
        }
        return a.DEFAULT.f216;
    }

    /* renamed from: ˏ */
    public final Class<?> m162(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }
}
