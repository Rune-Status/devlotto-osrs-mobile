package android.support.v7.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        public abstract int compare(T2 t2, T2 t22);

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return null;
        }

        public abstract void onChanged(int i, int i2);

        public void onChanged(int i, int i2, Object obj) {
            onChanged(i, i2);
        }
    }

    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback = new BatchingListUpdateCallback(this.mWrappedCallback);
        final Callback<T2> mWrappedCallback;

        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
        }

        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areContentsTheSame(t2, t22);
        }

        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areItemsTheSame(t2, t22);
        }

        public int compare(T2 t2, T2 t22) {
            return this.mWrappedCallback.compare(t2, t22);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return this.mWrappedCallback.getChangePayload(t2, t22);
        }

        public void onChanged(int i, int i2) {
            this.mBatchingListUpdateCallback.onChanged(i, i2, null);
        }

        public void onChanged(int i, int i2, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i, i2, obj);
        }

        public void onInserted(int i, int i2) {
            this.mBatchingListUpdateCallback.onInserted(i, i2);
        }

        public void onMoved(int i, int i2) {
            this.mBatchingListUpdateCallback.onMoved(i, i2);
        }

        public void onRemoved(int i, int i2) {
            this.mBatchingListUpdateCallback.onRemoved(i, i2);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i) {
        this.mTClass = cls;
        this.mData = (Object[]) Array.newInstance(cls, i);
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t, boolean z) {
        int i = 0;
        int findIndexOf = findIndexOf(t, this.mData, 0, this.mSize, 1);
        if (findIndexOf != -1) {
            if (findIndexOf < this.mSize) {
                Object obj = this.mData[findIndexOf];
                if (this.mCallback.areItemsTheSame(obj, t)) {
                    if (this.mCallback.areContentsTheSame(obj, t)) {
                        this.mData[findIndexOf] = t;
                        return findIndexOf;
                    }
                    this.mData[findIndexOf] = t;
                    this.mCallback.onChanged(findIndexOf, 1, this.mCallback.getChangePayload(obj, t));
                    return findIndexOf;
                }
            }
            i = findIndexOf;
        }
        addToData(i, t);
        if (z) {
            this.mCallback.onInserted(i, 1);
        }
        return i;
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length >= 1) {
            int sortAndDedup = sortAndDedup(tArr);
            if (this.mSize == 0) {
                this.mData = tArr;
                this.mSize = sortAndDedup;
                this.mCallback.onInserted(0, sortAndDedup);
                return;
            }
            merge(tArr, sortAndDedup);
        }
    }

    private void addToData(int i, T t) {
        if (i <= this.mSize) {
            if (this.mSize == this.mData.length) {
                Object[] objArr = (Object[]) Array.newInstance(this.mTClass, this.mData.length + 10);
                System.arraycopy(this.mData, 0, objArr, 0, i);
                objArr[i] = t;
                System.arraycopy(this.mData, i, objArr, i + 1, this.mSize - i);
                this.mData = objArr;
            } else {
                System.arraycopy(this.mData, i, this.mData, i + 1, this.mSize - i);
                this.mData[i] = t;
            }
            this.mSize++;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cannot add item to ");
        stringBuilder.append(i);
        stringBuilder.append(" because size is ");
        stringBuilder.append(this.mSize);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    private T[] copyArray(T[] tArr) {
        Object[] objArr = (Object[]) Array.newInstance(this.mTClass, tArr.length);
        System.arraycopy(tArr, 0, objArr, 0, tArr.length);
        return objArr;
    }

    private int findIndexOf(T t, T[] tArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i2) {
            int i5 = (i4 + i2) / 2;
            Object obj = tArr[i5];
            int compare = this.mCallback.compare(obj, t);
            if (compare < 0) {
                i4 = i5 + 1;
            } else if (compare != 0) {
                i2 = i5;
            } else if (this.mCallback.areItemsTheSame(obj, t)) {
                return i5;
            } else {
                i4 = linearEqualitySearch(t, i5, i4, i2);
                return i3 == 1 ? i4 != -1 ? i4 : i5 : i4;
            }
        }
        return i3 == 1 ? i4 : -1;
    }

    private int findSameItem(T t, T[] tArr, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (this.mCallback.areItemsTheSame(tArr[i3], t)) {
                return i3;
            }
        }
        return -1;
    }

    private int linearEqualitySearch(T t, int i, int i2, int i3) {
        Object obj;
        int i4 = i - 1;
        while (i4 >= i2) {
            obj = this.mData[i4];
            if (this.mCallback.compare(obj, t) != 0) {
                break;
            } else if (this.mCallback.areItemsTheSame(obj, t)) {
                return i4;
            } else {
                i4--;
            }
        }
        while (true) {
            i4 = i + 1;
            if (i4 >= i3) {
                break;
            }
            obj = this.mData[i4];
            if (this.mCallback.compare(obj, t) != 0) {
                break;
            } else if (this.mCallback.areItemsTheSame(obj, t)) {
                return i4;
            } else {
                i = i4;
            }
        }
        return -1;
    }

    private void merge(T[] tArr, int i) {
        int i2 = !(this.mCallback instanceof BatchedCallback) ? 1 : 0;
        if (i2 != 0) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mData = (Object[]) Array.newInstance(this.mTClass, (this.mSize + i) + 10);
        this.mNewDataStart = 0;
        int i3 = 0;
        while (true) {
            if (this.mOldDataStart >= this.mOldDataSize && i3 >= i) {
                break;
            } else if (this.mOldDataStart == this.mOldDataSize) {
                int i4 = i - i3;
                System.arraycopy(tArr, i3, this.mData, this.mNewDataStart, i4);
                this.mNewDataStart += i4;
                this.mSize += i4;
                this.mCallback.onInserted(this.mNewDataStart - i4, i4);
                break;
            } else if (i3 == i) {
                i3 = this.mOldDataSize - this.mOldDataStart;
                System.arraycopy(this.mOldData, this.mOldDataStart, this.mData, this.mNewDataStart, i3);
                this.mNewDataStart = i3 + this.mNewDataStart;
                break;
            } else {
                Object obj = this.mOldData[this.mOldDataStart];
                Object obj2 = tArr[i3];
                int compare = this.mCallback.compare(obj, obj2);
                if (compare > 0) {
                    Object[] objArr = this.mData;
                    compare = this.mNewDataStart;
                    this.mNewDataStart = compare + 1;
                    objArr[compare] = obj2;
                    this.mSize++;
                    i3++;
                    this.mCallback.onInserted(this.mNewDataStart - 1, 1);
                } else if (compare == 0 && this.mCallback.areItemsTheSame(obj, obj2)) {
                    Object[] objArr2 = this.mData;
                    int i5 = this.mNewDataStart;
                    this.mNewDataStart = i5 + 1;
                    objArr2[i5] = obj2;
                    i3++;
                    this.mOldDataStart++;
                    if (!this.mCallback.areContentsTheSame(obj, obj2)) {
                        this.mCallback.onChanged(this.mNewDataStart - 1, 1, this.mCallback.getChangePayload(obj, obj2));
                    }
                } else {
                    Object[] objArr3 = this.mData;
                    compare = this.mNewDataStart;
                    this.mNewDataStart = compare + 1;
                    objArr3[compare] = obj;
                    this.mOldDataStart++;
                }
            }
        }
        this.mOldData = null;
        if (i2 != 0) {
            endBatchedUpdates();
        }
    }

    private boolean remove(T t, boolean z) {
        int findIndexOf = findIndexOf(t, this.mData, 0, this.mSize, 2);
        if (findIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(findIndexOf, z);
        return true;
    }

    private void removeItemAtIndex(int i, boolean z) {
        System.arraycopy(this.mData, i + 1, this.mData, i, (this.mSize - i) - 1);
        this.mSize--;
        this.mData[this.mSize] = null;
        if (z) {
            this.mCallback.onRemoved(i, 1);
        }
    }

    private void replaceAllInsert(T t) {
        this.mData[this.mNewDataStart] = t;
        this.mNewDataStart++;
        this.mSize++;
        this.mCallback.onInserted(this.mNewDataStart - 1, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        int i = !(this.mCallback instanceof BatchedCallback) ? 1 : 0;
        if (i != 0) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int sortAndDedup = sortAndDedup(tArr);
        this.mData = (Object[]) Array.newInstance(this.mTClass, sortAndDedup);
        while (true) {
            int i2;
            if (this.mNewDataStart >= sortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            } else if (this.mOldDataStart >= this.mOldDataSize) {
                i2 = this.mNewDataStart;
                int i3 = sortAndDedup - this.mNewDataStart;
                System.arraycopy(tArr, i2, this.mData, i2, i3);
                this.mNewDataStart += i3;
                this.mSize += i3;
                this.mCallback.onInserted(i2, i3);
                break;
            } else if (this.mNewDataStart >= sortAndDedup) {
                i2 = this.mOldDataSize - this.mOldDataStart;
                this.mSize -= i2;
                this.mCallback.onRemoved(this.mNewDataStart, i2);
                break;
            } else {
                Object obj = this.mOldData[this.mOldDataStart];
                Object obj2 = tArr[this.mNewDataStart];
                int compare = this.mCallback.compare(obj, obj2);
                if (compare < 0) {
                    replaceAllRemove();
                } else if (compare > 0) {
                    replaceAllInsert(obj2);
                } else if (this.mCallback.areItemsTheSame(obj, obj2)) {
                    this.mData[this.mNewDataStart] = obj2;
                    this.mOldDataStart++;
                    this.mNewDataStart++;
                    if (!this.mCallback.areContentsTheSame(obj, obj2)) {
                        this.mCallback.onChanged(this.mNewDataStart - 1, 1, this.mCallback.getChangePayload(obj, obj2));
                    }
                } else {
                    replaceAllRemove();
                    replaceAllInsert(obj2);
                }
            }
        }
        this.mOldData = null;
        if (i != 0) {
            endBatchedUpdates();
        }
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        int i = 1;
        int i2 = 0;
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i3 = 1;
        while (true) {
            int i4 = i;
            if (i3 >= tArr.length) {
                return i4;
            }
            Object obj = tArr[i3];
            if (this.mCallback.compare(tArr[i2], obj) == 0) {
                int findSameItem = findSameItem(obj, tArr, i2, i4);
                if (findSameItem != -1) {
                    tArr[findSameItem] = obj;
                    i = i4;
                } else {
                    if (i4 != i3) {
                        tArr[i4] = obj;
                    }
                    i = i4 + 1;
                }
            } else {
                if (i4 != i3) {
                    tArr[i4] = obj;
                }
                i = i4 + 1;
                i2 = i4;
            }
            i3++;
        }
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t) {
        throwIfInMutationOperation();
        return add(t, true);
    }

    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance(this.mTClass, collection.size())), true);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    public void addAll(@NonNull T[] tArr, boolean z) {
        throwIfInMutationOperation();
        if (tArr.length != 0) {
            if (z) {
                addAllInternal(tArr);
            } else {
                addAllInternal(copyArray(tArr));
            }
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        if (!(this.mCallback instanceof BatchedCallback)) {
            if (this.mBatchedCallback == null) {
                this.mBatchedCallback = new BatchedCallback(this.mCallback);
            }
            this.mCallback = this.mBatchedCallback;
        }
    }

    public void clear() {
        throwIfInMutationOperation();
        if (this.mSize != 0) {
            int i = this.mSize;
            Arrays.fill(this.mData, 0, i, null);
            this.mSize = 0;
            this.mCallback.onRemoved(0, i);
        }
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        if (this.mCallback instanceof BatchedCallback) {
            ((BatchedCallback) this.mCallback).dispatchLastEvent();
        }
        if (this.mCallback == this.mBatchedCallback) {
            this.mCallback = this.mBatchedCallback.mWrappedCallback;
        }
    }

    public T get(int i) throws IndexOutOfBoundsException {
        if (i < this.mSize && i >= 0) {
            return (this.mOldData == null || i < this.mNewDataStart) ? this.mData[i] : this.mOldData[(i - this.mNewDataStart) + this.mOldDataStart];
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Asked to get item at ");
            stringBuilder.append(i);
            stringBuilder.append(" but size is ");
            stringBuilder.append(this.mSize);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public int indexOf(T t) {
        if (this.mOldData != null) {
            int findIndexOf = findIndexOf(t, this.mData, 0, this.mNewDataStart, 4);
            if (findIndexOf != -1) {
                return findIndexOf;
            }
            findIndexOf = findIndexOf(t, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
            return findIndexOf != -1 ? (findIndexOf - this.mOldDataStart) + this.mNewDataStart : -1;
        } else {
            return findIndexOf(t, this.mData, 0, this.mSize, 4);
        }
    }

    public void recalculatePositionOfItemAt(int i) {
        throwIfInMutationOperation();
        Object obj = get(i);
        removeItemAtIndex(i, false);
        int add = add(obj, false);
        if (i != add) {
            this.mCallback.onMoved(i, add);
        }
    }

    public boolean remove(T t) {
        throwIfInMutationOperation();
        return remove(t, true);
    }

    public T removeItemAt(int i) {
        throwIfInMutationOperation();
        Object obj = get(i);
        removeItemAtIndex(i, true);
        return obj;
    }

    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance(this.mTClass, collection.size())), true);
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void replaceAll(@NonNull T[] tArr, boolean z) {
        throwIfInMutationOperation();
        if (z) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i, T t) {
        throwIfInMutationOperation();
        T t2 = get(i);
        boolean z = t2 == t || !this.mCallback.areContentsTheSame(t2, t);
        if (t2 == t || this.mCallback.compare(t2, t) != 0) {
            if (z) {
                this.mCallback.onChanged(i, 1, this.mCallback.getChangePayload(t2, t));
            }
            removeItemAtIndex(i, false);
            int add = add(t, false);
            if (i != add) {
                this.mCallback.onMoved(i, add);
                return;
            }
            return;
        }
        this.mData[i] = t;
        if (z) {
            this.mCallback.onChanged(i, 1, this.mCallback.getChangePayload(t2, t));
        }
    }
}
