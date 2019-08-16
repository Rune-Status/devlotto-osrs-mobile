package android.support.v4.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    @Nullable
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    @Nullable
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i);
        }
        this.mSize = 0;
    }

    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    private void allocArrays(int i) {
        Class cls;
        Object[] objArr;
        Object obj;
        if (i == 8) {
            synchronized (ArrayMap.class) {
                try {
                    if (mTwiceBaseCache != null) {
                        objArr = mTwiceBaseCache;
                        this.mArray = objArr;
                        mTwiceBaseCache = (Object[]) objArr[0];
                        this.mHashes = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        obj = mTwiceBaseCacheSize - 1;
                        mTwiceBaseCacheSize = obj;
                        return;
                    }
                } finally {
                    while (true) {
                        cls = ArrayMap.class;
                    }
                }
            }
        } else if (i == 4) {
            synchronized (ArrayMap.class) {
                try {
                    if (mBaseCache != null) {
                        objArr = mBaseCache;
                        this.mArray = objArr;
                        mBaseCache = (Object[]) objArr[0];
                        this.mHashes = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        obj = mBaseCacheSize - 1;
                        mBaseCacheSize = obj;
                        return;
                    }
                } finally {
                    cls = ArrayMap.class;
                }
            }
        }
        this.mHashes = new int[i];
        this.mArray = new Object[(i << 1)];
    }

    private static int binarySearchHashes(int[] iArr, int i, int i2) {
        try {
            return ContainerHelpers.binarySearch(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i) {
        Class cls;
        int i2;
        if (iArr.length == 8) {
            synchronized (ArrayMap.class) {
                try {
                    if (mTwiceBaseCacheSize < 10) {
                        objArr[0] = mTwiceBaseCache;
                        objArr[1] = iArr;
                        for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        mTwiceBaseCache = objArr;
                        mTwiceBaseCacheSize++;
                    }
                } catch (Throwable th) {
                    cls = ArrayMap.class;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ArrayMap.class) {
                try {
                    if (mBaseCacheSize < 10) {
                        objArr[0] = mBaseCache;
                        objArr[1] = iArr;
                        for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        mBaseCache = objArr;
                        mBaseCacheSize++;
                    }
                } catch (Throwable th2) {
                    cls = ArrayMap.class;
                }
            }
        }
    }

    public void clear() {
        if (this.mSize > 0) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            int i = this.mSize;
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(iArr, objArr, i);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        return indexOfKey(obj) >= 0 ? CONCURRENT_MODIFICATION_EXCEPTIONS : false;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0 ? CONCURRENT_MODIFICATION_EXCEPTIONS : false;
    }

    public void ensureCapacity(int i) {
        int i2 = this.mSize;
        if (this.mHashes.length < i) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            allocArrays(i);
            if (this.mSize > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                System.arraycopy(objArr, 0, this.mArray, 0, i2 << 1);
            }
            freeArrays(iArr, objArr, i2);
        }
        if (this.mSize != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        int i;
        Object keyAt;
        Object valueAt;
        Object obj2;
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            i = 0;
            while (i < this.mSize) {
                try {
                    keyAt = keyAt(i);
                    valueAt = valueAt(i);
                    obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null) {
                            return false;
                        }
                        if (!simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.mSize) {
                try {
                    keyAt = keyAt(i);
                    valueAt = valueAt(i);
                    obj2 = map.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null) {
                            return false;
                        }
                        if (!map.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
    }

    @Nullable
    public V get(Object obj) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? this.mArray[(indexOfKey << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i = this.mSize;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i3 < i) {
            Object obj = objArr[i4];
            int i5 = iArr[i3];
            i3++;
            i4 += 2;
            i2 = ((obj == null ? 0 : obj.hashCode()) ^ i5) + i2;
        }
        return i2;
    }

    /* Access modifiers changed, original: 0000 */
    public int indexOf(Object obj, int i) {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i2, i);
        if (binarySearchHashes < 0 || obj.equals(this.mArray[binarySearchHashes << 1])) {
            return binarySearchHashes;
        }
        int i3 = binarySearchHashes + 1;
        while (i3 < i2 && this.mHashes[i3] == i) {
            if (obj.equals(this.mArray[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        binarySearchHashes--;
        while (binarySearchHashes >= 0 && this.mHashes[binarySearchHashes] == i) {
            if (obj.equals(this.mArray[binarySearchHashes << 1])) {
                return binarySearchHashes;
            }
            binarySearchHashes--;
        }
        return i3;
    }

    public int indexOfKey(@Nullable Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    /* Access modifiers changed, original: 0000 */
    public int indexOfNull() {
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i, 0);
        if (binarySearchHashes < 0 || this.mArray[binarySearchHashes << 1] == null) {
            return binarySearchHashes;
        }
        int i2 = binarySearchHashes + 1;
        while (i2 < i && this.mHashes[i2] == 0) {
            if (this.mArray[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        binarySearchHashes--;
        while (binarySearchHashes >= 0 && this.mHashes[binarySearchHashes] == 0) {
            if (this.mArray[binarySearchHashes << 1] == null) {
                return binarySearchHashes;
            }
            binarySearchHashes--;
        }
        return i2;
    }

    /* Access modifiers changed, original: 0000 */
    public int indexOfValue(Object obj) {
        int i = 1;
        int i2 = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.mSize <= 0 ? CONCURRENT_MODIFICATION_EXCEPTIONS : false;
    }

    public K keyAt(int i) {
        return this.mArray[i << 1];
    }

    @Nullable
    public V put(K k, V v) {
        int indexOfNull;
        int i;
        int i2 = 8;
        int i3 = this.mSize;
        if (k == null) {
            indexOfNull = indexOfNull();
            i = 0;
        } else {
            i = k.hashCode();
            indexOfNull = indexOf(k, i);
        }
        int i4;
        if (indexOfNull >= 0) {
            i4 = (indexOfNull << 1) + 1;
            V v2 = this.mArray[i4];
            this.mArray[i4] = v;
            return v2;
        }
        if (i3 >= this.mHashes.length) {
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i2 = 4;
            }
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            allocArrays(i2);
            if (i3 == this.mSize) {
                if (this.mHashes.length > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
                }
                freeArrays(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (indexOfNull < i3) {
            int i5 = indexOfNull + 1;
            System.arraycopy(this.mHashes, indexOfNull, this.mHashes, i5, i3 - indexOfNull);
            System.arraycopy(this.mArray, indexOfNull << 1, this.mArray, i5 << 1, (this.mSize - indexOfNull) << 1);
        }
        if (i3 != this.mSize || indexOfNull >= this.mHashes.length) {
            throw new ConcurrentModificationException();
        }
        this.mHashes[indexOfNull] = i;
        i4 = indexOfNull << 1;
        this.mArray[i4] = k;
        this.mArray[i4 + 1] = v;
        this.mSize++;
        return null;
    }

    public void putAll(@NonNull SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i = 0;
        int i2 = simpleArrayMap.mSize;
        ensureCapacity(this.mSize + i2);
        if (this.mSize != 0) {
            while (i < i2) {
                put(simpleArrayMap.keyAt(i), simpleArrayMap.valueAt(i));
                i++;
            }
        } else if (i2 > 0) {
            System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, i2);
            System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, i2 << 1);
            this.mSize = i2;
        }
    }

    @Nullable
    public V remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? removeAt(indexOfKey) : null;
    }

    public V removeAt(int i) {
        int i2 = 8;
        int i3 = i << 1;
        V v = this.mArray[i3 + 1];
        int i4 = this.mSize;
        if (i4 <= 1) {
            freeArrays(this.mHashes, this.mArray, i4);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            i2 = 0;
        } else {
            int i5 = i4 - 1;
            if (this.mHashes.length <= 8 || this.mSize >= this.mHashes.length / 3) {
                int i6;
                if (i < i5) {
                    i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(this.mHashes, i6, this.mHashes, i, i7);
                    System.arraycopy(this.mArray, i6 << 1, this.mArray, i3, i7 << 1);
                }
                i6 = i5 << 1;
                this.mArray[i6] = null;
                this.mArray[i6 + 1] = null;
            } else {
                if (i4 > 8) {
                    i2 = (i4 >> 1) + i4;
                }
                int[] iArr = this.mHashes;
                Object[] objArr = this.mArray;
                allocArrays(i2);
                if (i4 == this.mSize) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.mHashes, 0, i);
                        System.arraycopy(objArr, 0, this.mArray, 0, i3);
                    }
                    if (i < i5) {
                        i2 = i + 1;
                        int i8 = i5 - i;
                        System.arraycopy(iArr, i2, this.mHashes, i, i8);
                        System.arraycopy(objArr, i2 << 1, this.mArray, i3, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i2 = i5;
        }
        if (i4 == this.mSize) {
            this.mSize = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.mArray[i2];
        this.mArray[i2] = v;
        return v2;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.mSize * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            SimpleArrayMap keyAt = keyAt(i);
            if (keyAt != this) {
                stringBuilder.append(keyAt);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            keyAt = valueAt(i);
            if (keyAt != this) {
                stringBuilder.append(keyAt);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public V valueAt(int i) {
        return this.mArray[(i << 1) + 1];
    }
}
