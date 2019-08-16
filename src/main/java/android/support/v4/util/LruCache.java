package android.support.v4.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        if (i > 0) {
            this.maxSize = i;
            this.map = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(k);
        stringBuilder.append("=");
        stringBuilder.append(v);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    @Nullable
    public V create(@NonNull K k) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this) {
            i = this.createCount;
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public void entryRemoved(boolean z, @NonNull K k, @NonNull V v, @Nullable V v2) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this) {
            i = this.evictionCount;
        }
        return i;
    }

    /* JADX WARNING: Missing block: B:9:0x001a, code skipped:
            r1 = create(r5);
     */
    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            if (r1 != null) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:12:0x0022, code skipped:
            monitor-enter(r4);
     */
    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r4.createCount++;
            r0 = r4.map.put(r5, r1);
     */
    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            if (r0 == null) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            r4.map.put(r5, r0);
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:18:0x0037, code skipped:
            if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:19:0x0039, code skipped:
            entryRemoved(false, r5, r1, r0);
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            r4.size += safeSizeOf(r5, r1);
     */
    /* JADX WARNING: Missing block: B:25:0x004b, code skipped:
            trimToSize(r4.maxSize);
     */
    /* JADX WARNING: Missing block: B:36:?, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:37:?, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @Nullable
    public final V get(@NonNull K k) {
        if (k != null) {
            synchronized (this) {
                Object obj = this.map.get(k);
                if (obj != null) {
                    this.hitCount++;
                    return obj;
                }
                this.missCount++;
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this) {
            i = this.missCount;
        }
        return i;
    }

    @Nullable
    public final V put(@NonNull K k, @NonNull V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        Object put;
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k, v);
            put = this.map.put(k, v);
            if (put != null) {
                this.size -= safeSizeOf(k, put);
            }
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i;
        synchronized (this) {
            i = this.putCount;
        }
        return i;
    }

    @Nullable
    public final V remove(@NonNull K k) {
        if (k != null) {
            Object remove;
            synchronized (this) {
                remove = this.map.remove(k);
                if (remove != null) {
                    this.size -= safeSizeOf(k, remove);
                }
            }
            if (remove != null) {
                entryRemoved(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public void resize(int i) {
        if (i > 0) {
            synchronized (this) {
                this.maxSize = i;
            }
            trimToSize(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int size() {
        int i;
        synchronized (this) {
            i = this.size;
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public int sizeOf(@NonNull K k, @NonNull V v) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this) {
            linkedHashMap = new LinkedHashMap(this.map);
        }
        return linkedHashMap;
    }

    public final String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.hitCount + this.missCount;
            if (i2 != 0) {
                i = (this.hitCount * 100) / i2;
            }
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i)});
        }
        return format;
    }

    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r0 = new java.lang.StringBuilder();
            r0.append(getClass().getName());
            r0.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Missing block: B:19:0x0070, code skipped:
            throw new java.lang.IllegalStateException(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int i) {
        while (true) {
            Object key;
            Object value;
            synchronized (this) {
                if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                    break;
                } else if (this.size <= i || this.map.isEmpty()) {
                } else {
                    Entry entry = (Entry) this.map.entrySet().iterator().next();
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.remove(key);
                    this.size -= safeSizeOf(key, value);
                    this.evictionCount++;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
