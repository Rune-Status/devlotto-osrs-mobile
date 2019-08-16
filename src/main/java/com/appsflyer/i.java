package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class i {
    /* renamed from: ʽ */
    private static final BitSet f158 = new BitSet(6);
    /* renamed from: ॱॱ */
    private static volatile i f159;
    /* renamed from: ᐝ */
    private static final Handler f160 = new Handler(Looper.getMainLooper());
    /* renamed from: ʻ */
    final Runnable f161 = new Runnable() {
        public final void run() {
            synchronized (i.this.f165) {
                if (i.this.f167) {
                    i.this.f163.removeCallbacks(i.this.f166);
                    i.this.f163.removeCallbacks(i.this.f169);
                    i.this.m138();
                    i.this.f167 = false;
                }
            }
        }
    };
    /* renamed from: ʼ */
    private final Map<g, g> f162 = new HashMap(f158.size());
    /* renamed from: ˊ */
    final Handler f163;
    /* renamed from: ˊॱ */
    private final Map<g, Map<String, Object>> f164 = new HashMap(f158.size());
    /* renamed from: ˋ */
    final Object f165 = new Object();
    /* renamed from: ˎ */
    final Runnable f166 = new Runnable() {
        public final void run() {
            synchronized (i.this.f165) {
                i.this.m139();
                i.this.f163.postDelayed(i.this.f169, 500);
                i.this.f167 = true;
            }
        }
    };
    /* renamed from: ˏ */
    boolean f167;
    /* renamed from: ͺ */
    private boolean f168;
    /* renamed from: ॱ */
    final Runnable f169 = new Runnable() {
        public final void run() {
            synchronized (i.this.f165) {
                i.this.m138();
                i.this.f163.postDelayed(i.this.f166, 1800000);
            }
        }
    };
    /* renamed from: ॱˊ */
    private final SensorManager f170;

    static {
        f158.set(1);
        f158.set(2);
        f158.set(4);
    }

    private i(@NonNull SensorManager sensorManager, Handler handler) {
        this.f170 = sensorManager;
        this.f163 = handler;
    }

    /* renamed from: ˋ */
    private static i m135(SensorManager sensorManager, Handler handler) {
        if (f159 == null) {
            synchronized (i.class) {
                try {
                    if (f159 == null) {
                        f159 = new i(sensorManager, handler);
                    }
                } catch (Throwable th) {
                    Class cls = i.class;
                }
            }
        }
        return f159;
    }

    /* renamed from: ˏ */
    static i m136(Context context) {
        return m135((SensorManager) context.getApplicationContext().getSystemService("sensor"), f160);
    }

    /* Access modifiers changed, original: final */
    @NonNull
    /* renamed from: ˋ */
    public final List<Map<String, Object>> m137() {
        List<Map<String, Object>> emptyList;
        synchronized (this.f165) {
            if (!this.f162.isEmpty() && this.f168) {
                for (g ˏ : this.f162.values()) {
                    ˏ.m128(this.f164);
                }
            }
            if (this.f164.isEmpty()) {
                emptyList = Collections.emptyList();
            } else {
                emptyList = new ArrayList(this.f164.values());
            }
        }
        return emptyList;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m138() {
        try {
            if (!this.f162.isEmpty()) {
                for (g gVar : this.f162.values()) {
                    this.f170.unregisterListener(gVar);
                    gVar.m127(this.f164);
                }
            }
        } catch (Throwable th) {
        }
        this.f168 = false;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final void m139() {
        try {
            for (Sensor sensor : this.f170.getSensorList(-1)) {
                int type = sensor.getType();
                boolean z = type >= 0 && f158.get(type);
                if (z) {
                    g ˋ = g.m120(sensor);
                    if (!this.f162.containsKey(ˋ)) {
                        this.f162.put(ˋ, ˋ);
                    }
                    this.f170.registerListener((SensorEventListener) this.f162.get(ˋ), sensor, 0);
                }
            }
        } catch (Throwable th) {
        }
        this.f168 = true;
    }
}
