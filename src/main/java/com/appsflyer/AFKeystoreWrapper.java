package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {
    /* renamed from: ˊ */
    private String f20;
    /* renamed from: ˋ */
    private Context f21;
    /* renamed from: ˎ */
    private KeyStore f22;
    /* renamed from: ˏ */
    private final Object f23 = new Object();
    /* renamed from: ॱ */
    private int f24;

    public AFKeystoreWrapper(Context context) {
        this.f21 = context;
        this.f20 = "";
        this.f24 = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            this.f22 = KeyStore.getInstance("AndroidKeyStore");
            this.f22.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* renamed from: ˎ */
    private void m12(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f23) {
                if (this.f22.containsAlias(str)) {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                } else {
                    if (VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (VERSION.SDK_INT >= 18 && !"OPPO".equals(Build.BRAND)) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f21).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                }
            }
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Exception ");
            stringBuilder.append(th.getMessage());
            stringBuilder.append(" occurred");
            AFLogger.afErrorLog(stringBuilder.toString(), th);
        }
    }

    /* renamed from: ˏ */
    private String m13() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.appsflyer,");
        synchronized (this.f23) {
            stringBuilder.append("KSAppsFlyerId=");
            stringBuilder.append(this.f20);
            stringBuilder.append(",");
            stringBuilder.append("KSAppsFlyerRICounter=");
            stringBuilder.append(this.f24);
        }
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final void m14() {
        String ˏ = m13();
        synchronized (this.f23) {
            this.f24++;
            AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(ˏ)));
            try {
                synchronized (this.f23) {
                    this.f22.deleteEntry(ˏ);
                }
            } catch (KeyStoreException e) {
                StringBuilder stringBuilder = new StringBuilder("Exception ");
                stringBuilder.append(e.getMessage());
                stringBuilder.append(" occurred");
                AFLogger.afErrorLog(stringBuilder.toString(), e);
            }
        }
        m12(m13());
        return;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˋ */
    public final int m15() {
        int i;
        synchronized (this.f23) {
            i = this.f24;
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final boolean m16() {
        boolean z;
        Object th;
        StringBuilder stringBuilder;
        boolean z2 = true;
        synchronized (this.f23) {
            if (this.f22 != null) {
                try {
                    Enumeration aliases = this.f22.aliases();
                    while (aliases.hasMoreElements()) {
                        String str = (String) aliases.nextElement();
                        if (str != null && str.startsWith("com.appsflyer")) {
                            String[] split = str.split(",");
                            if (split.length == 3) {
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(String.valueOf(str)));
                                try {
                                    String[] split2 = split[1].trim().split("=");
                                    String[] split3 = split[2].trim().split("=");
                                    if (split2.length == 2 && split3.length == 2) {
                                        this.f20 = split2[1].trim();
                                        this.f24 = Integer.parseInt(split3[1].trim());
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    stringBuilder = new StringBuilder("Couldn't list KeyStore Aliases: ");
                                    stringBuilder.append(th.getClass().getName());
                                    AFLogger.afErrorLog(stringBuilder.toString(), th);
                                    z = z2;
                                    return z;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z2 = false;
                    stringBuilder = new StringBuilder("Couldn't list KeyStore Aliases: ");
                    stringBuilder.append(th.getClass().getName());
                    AFLogger.afErrorLog(stringBuilder.toString(), th);
                    z = z2;
                    return z;
                }
            }
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final String m17() {
        String str;
        synchronized (this.f23) {
            str = this.f20;
        }
        return str;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final void m18(String str) {
        this.f20 = str;
        this.f24 = 0;
        m12(m13());
    }
}
