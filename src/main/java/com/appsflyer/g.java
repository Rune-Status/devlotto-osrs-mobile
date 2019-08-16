package com.appsflyer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class g implements SensorEventListener {
    /* renamed from: ʼ */
    private final int f141;
    /* renamed from: ʽ */
    private double f142;
    @NonNull
    /* renamed from: ˊ */
    private final String f143;
    /* renamed from: ˋ */
    private final float[][] f144 = new float[2][];
    /* renamed from: ˎ */
    private final long[] f145 = new long[2];
    @NonNull
    /* renamed from: ˏ */
    private final String f146;
    /* renamed from: ॱ */
    private final int f147;
    /* renamed from: ᐝ */
    private long f148;

    private g(int i, @Nullable String str, @Nullable String str2) {
        this.f147 = i;
        if (str == null) {
            str = "";
        }
        this.f143 = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f146 = str2;
        int i2 = (i + 31) * 31;
        this.f141 = ((this.f143.hashCode() + i2) * 31) + this.f146.hashCode();
    }

    /* renamed from: ˋ */
    static g m120(Sensor sensor) {
        return new g(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    /* renamed from: ˎ */
    private static double m121(@NonNull float[] fArr, @NonNull float[] fArr2) {
        double d = 0.0d;
        for (int i = 0; i < Math.min(fArr.length, fArr2.length); i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    @NonNull
    /* renamed from: ˎ */
    private static List<Float> m122(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: ˎ */
    private boolean m123(int i, @NonNull String str, @NonNull String str2) {
        return this.f147 == i && this.f143.equals(str) && this.f146.equals(str2);
    }

    /* renamed from: ˏ */
    private void m124() {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            this.f144[i2] = null;
        }
        while (i < 2) {
            this.f145[i] = 0;
            i++;
        }
        this.f142 = 0.0d;
        this.f148 = 0;
    }

    @NonNull
    /* renamed from: ॱ */
    private Map<String, Object> m125() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f147));
        hashMap.put("sN", this.f143);
        hashMap.put("sV", this.f146);
        float[] fArr = this.f144[0];
        if (fArr != null) {
            hashMap.put("sVS", m122(fArr));
        }
        fArr = this.f144[1];
        if (fArr != null) {
            hashMap.put("sVE", m122(fArr));
        }
        return hashMap;
    }

    /* renamed from: ॱ */
    private void m126(@NonNull Map<g, Map<String, Object>> map, boolean z) {
        int i = 0;
        if (this.f144[0] != null) {
            i = 1;
        }
        if (i != 0) {
            map.put(this, m125());
            if (z) {
                m124();
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m125());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m123(gVar.f147, gVar.f143, gVar.f146);
    }

    public final int hashCode() {
        return this.f141;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null && sensorEvent.values != null) {
            Sensor sensor = sensorEvent.sensor;
            int i = (sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? 0 : 1;
            if (i != 0) {
                i = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (m123(i, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[] fArr2 = this.f144[0];
                    if (fArr2 == null) {
                        this.f144[0] = Arrays.copyOf(fArr, fArr.length);
                        this.f145[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr3 = this.f144[1];
                    if (fArr3 == null) {
                        fArr3 = Arrays.copyOf(fArr, fArr.length);
                        this.f144[1] = fArr3;
                        this.f145[1] = currentTimeMillis;
                        this.f142 = m121(fArr2, fArr3);
                    } else if (50000000 <= j - this.f148) {
                        this.f148 = j;
                        if (Arrays.equals(fArr3, fArr)) {
                            this.f145[1] = currentTimeMillis;
                            return;
                        }
                        double ˎ = m121(fArr2, fArr);
                        if (ˎ > this.f142) {
                            this.f144[1] = Arrays.copyOf(fArr, fArr.length);
                            this.f145[1] = currentTimeMillis;
                            this.f142 = ˎ;
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final void m127(@NonNull Map<g, Map<String, Object>> map) {
        m126(map, true);
    }

    /* renamed from: ˏ */
    public final void m128(Map<g, Map<String, Object>> map) {
        m126(map, false);
    }
}
