package android.support.v7.util;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v7.widget.RecyclerView.Adapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiffUtil {
    private static final Comparator<Snake> SNAKE_COMPARATOR = new Comparator<Snake>() {
        public int compare(Snake snake, Snake snake2) {
            int i = snake.x - snake2.x;
            return i == 0 ? snake.y - snake2.y : i;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        @Nullable
        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_IGNORE = 16;
        private static final int FLAG_MASK = 31;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 5;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;
        private final List<Snake> mSnakes;

        DiffResult(Callback callback, List<Snake> list, int[] iArr, int[] iArr2, boolean z) {
            this.mSnakes = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(this.mOldItemStatuses, 0);
            Arrays.fill(this.mNewItemStatuses, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addRootSnake();
            findMatchingItems();
        }

        private void addRootSnake() {
            Snake snake = this.mSnakes.isEmpty() ? null : (Snake) this.mSnakes.get(0);
            if (snake == null || snake.x != 0 || snake.y != 0) {
                snake = new Snake();
                snake.x = 0;
                snake.y = 0;
                snake.removal = false;
                snake.size = 0;
                snake.reverse = false;
                this.mSnakes.add(0, snake);
            }
        }

        private void dispatchAdditions(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (this.mDetectMoves) {
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    int i5 = i3 + i4;
                    int i6 = this.mNewItemStatuses[i5] & 31;
                    if (i6 == 0) {
                        listUpdateCallback.onInserted(i, 1);
                        for (PostponedUpdate postponedUpdate : list) {
                            postponedUpdate.currentPos++;
                        }
                    } else if (i6 == 4 || i6 == 8) {
                        int i7 = this.mNewItemStatuses[i5] >> 5;
                        listUpdateCallback.onMoved(removePostponedUpdate(list, i7, true).currentPos, i);
                        if (i6 == 4) {
                            listUpdateCallback.onChanged(i, 1, this.mCallback.getChangePayload(i7, i5));
                        }
                    } else if (i6 == 16) {
                        list.add(new PostponedUpdate(i5, i, false));
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unknown flag for pos ");
                        stringBuilder.append(i5);
                        stringBuilder.append(" ");
                        stringBuilder.append(Long.toBinaryString((long) i6));
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                return;
            }
            listUpdateCallback.onInserted(i, i2);
        }

        private void dispatchRemovals(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (this.mDetectMoves) {
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    int i5 = i3 + i4;
                    int i6 = this.mOldItemStatuses[i5] & 31;
                    if (i6 == 0) {
                        listUpdateCallback.onRemoved(i + i4, 1);
                        for (PostponedUpdate postponedUpdate : list) {
                            postponedUpdate.currentPos--;
                        }
                    } else if (i6 == 4 || i6 == 8) {
                        int i7 = this.mOldItemStatuses[i5] >> 5;
                        PostponedUpdate removePostponedUpdate = removePostponedUpdate(list, i7, false);
                        listUpdateCallback.onMoved(i + i4, removePostponedUpdate.currentPos - 1);
                        if (i6 == 4) {
                            listUpdateCallback.onChanged(removePostponedUpdate.currentPos - 1, 1, this.mCallback.getChangePayload(i5, i7));
                        }
                    } else if (i6 == 16) {
                        list.add(new PostponedUpdate(i5, i + i4, true));
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unknown flag for pos ");
                        stringBuilder.append(i5);
                        stringBuilder.append(" ");
                        stringBuilder.append(Long.toBinaryString((long) i6));
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                return;
            }
            listUpdateCallback.onRemoved(i, i2);
        }

        private void findAddition(int i, int i2, int i3) {
            if (this.mOldItemStatuses[i - 1] == 0) {
                findMatchingItem(i, i2, i3, false);
            }
        }

        private boolean findMatchingItem(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            int i7 = 8;
            if (z) {
                i4 = i2 - 1;
                i5 = i4;
                i2 = i4;
                i6 = i;
            } else {
                i4 = i - 1;
                i5 = i4;
                i6 = i4;
            }
            while (i3 >= 0) {
                int i8;
                Snake snake = (Snake) this.mSnakes.get(i3);
                int i9 = snake.x;
                int i10 = snake.size;
                int i11 = snake.y;
                int i12 = snake.size;
                if (z) {
                    while (true) {
                        i6--;
                        if (i6 < i9 + i10) {
                            continue;
                            break;
                        } else if (this.mCallback.areItemsTheSame(i6, i5)) {
                            i4 = this.mCallback.areContentsTheSame(i6, i5) ? 8 : 4;
                            this.mNewItemStatuses[i5] = (i6 << 5) | 16;
                            this.mOldItemStatuses[i6] = i4 | (i5 << 5);
                            return true;
                        }
                    }
                } else {
                    for (i6 = i2 - 1; i6 >= i11 + i12; i6--) {
                        if (this.mCallback.areItemsTheSame(i5, i6)) {
                            if (!this.mCallback.areContentsTheSame(i5, i6)) {
                                i7 = 4;
                            }
                            i8 = i - 1;
                            this.mOldItemStatuses[i8] = (i6 << 5) | 16;
                            this.mNewItemStatuses[i6] = i7 | (i8 << 5);
                            return true;
                        }
                    }
                    continue;
                }
                i8 = snake.x;
                i3--;
                i2 = snake.y;
                i6 = i8;
            }
            return false;
        }

        private void findMatchingItems() {
            int i = this.mOldListSize;
            int i2 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = (Snake) this.mSnakes.get(size);
                int i3 = snake.x;
                int i4 = snake.size;
                int i5 = snake.y;
                int i6 = snake.size;
                if (this.mDetectMoves) {
                    while (i > i3 + i4) {
                        findAddition(i, i2, size);
                        i--;
                    }
                    while (i2 > i5 + i6) {
                        findRemoval(i, i2, size);
                        i2--;
                    }
                }
                for (i2 = 0; i2 < snake.size; i2++) {
                    i3 = snake.x + i2;
                    i4 = snake.y + i2;
                    i = this.mCallback.areContentsTheSame(i3, i4) ? 1 : 2;
                    this.mOldItemStatuses[i3] = (i4 << 5) | i;
                    this.mNewItemStatuses[i4] = i | (i3 << 5);
                }
                i = snake.x;
                i2 = snake.y;
            }
        }

        private void findRemoval(int i, int i2, int i3) {
            if (this.mNewItemStatuses[i2 - 1] == 0) {
                findMatchingItem(i, i2, i3, true);
            }
        }

        private static PostponedUpdate removePostponedUpdate(List<PostponedUpdate> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                PostponedUpdate postponedUpdate = (PostponedUpdate) list.get(size);
                if (postponedUpdate.posInOwnerList == i && postponedUpdate.removal == z) {
                    list.remove(size);
                    while (true) {
                        int i2 = size;
                        if (i2 >= list.size()) {
                            return postponedUpdate;
                        }
                        PostponedUpdate postponedUpdate2 = (PostponedUpdate) list.get(i2);
                        postponedUpdate2.currentPos = (z ? 1 : -1) + postponedUpdate2.currentPos;
                        size = i2 + 1;
                    }
                } else {
                    size--;
                }
            }
            return null;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mNewItemStatuses.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Index out of bounds - passed position = ");
                stringBuilder.append(i);
                stringBuilder.append(", new list size = ");
                stringBuilder.append(this.mNewItemStatuses.length);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            int i2 = this.mNewItemStatuses[i];
            return (i2 & 31) == 0 ? -1 : i2 >> 5;
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mOldItemStatuses.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Index out of bounds - passed position = ");
                stringBuilder.append(i);
                stringBuilder.append(", old list size = ");
                stringBuilder.append(this.mOldItemStatuses.length);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            int i2 = this.mOldItemStatuses[i];
            return (i2 & 31) == 0 ? -1 : i2 >> 5;
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            ListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            ArrayList arrayList = new ArrayList();
            int i = this.mOldListSize;
            int i2 = this.mNewListSize;
            int i3 = i;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = (Snake) this.mSnakes.get(size);
                int i4 = snake.size;
                i = snake.x + i4;
                int i5 = snake.y + i4;
                if (i < i3) {
                    dispatchRemovals(arrayList, batchingListUpdateCallback, i, i3 - i, i);
                }
                if (i5 < i2) {
                    dispatchAdditions(arrayList, batchingListUpdateCallback, i, i2 - i5, i5);
                }
                for (int i6 = i4 - 1; i6 >= 0; i6--) {
                    if ((this.mOldItemStatuses[snake.x + i6] & 31) == 2) {
                        batchingListUpdateCallback.onChanged(snake.x + i6, 1, this.mCallback.getChangePayload(snake.x + i6, snake.y + i6));
                    }
                }
                i = snake.x;
                i2 = snake.y;
                i3 = i;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }

        public void dispatchUpdatesTo(@NonNull Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        /* Access modifiers changed, original: 0000 */
        @VisibleForTesting
        public List<Snake> getSnakes() {
            return this.mSnakes;
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    private static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i, int i2, boolean z) {
            this.posInOwnerList = i;
            this.currentPos = i2;
            this.removal = z;
        }
    }

    static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range(int i, int i2, int i3, int i4) {
            this.oldListStart = i;
            this.oldListEnd = i2;
            this.newListStart = i3;
            this.newListEnd = i4;
        }
    }

    static class Snake {
        boolean removal;
        boolean reverse;
        int size;
        int x;
        int y;

        Snake() {
        }
    }

    private DiffUtil() {
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int abs = Math.abs(oldListSize - newListSize) + (oldListSize + newListSize);
        oldListSize = abs * 2;
        int[] iArr = new int[oldListSize];
        int[] iArr2 = new int[oldListSize];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake diffPartial = diffPartial(callback, range.oldListStart, range.oldListEnd, range.newListStart, range.newListEnd, iArr, iArr2, abs);
            if (diffPartial != null) {
                if (diffPartial.size > 0) {
                    arrayList.add(diffPartial);
                }
                diffPartial.x += range.oldListStart;
                diffPartial.y += range.newListStart;
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                if (diffPartial.reverse) {
                    range2.oldListEnd = diffPartial.x;
                    range2.newListEnd = diffPartial.y;
                } else if (diffPartial.removal) {
                    range2.oldListEnd = diffPartial.x - 1;
                    range2.newListEnd = diffPartial.y;
                } else {
                    range2.oldListEnd = diffPartial.x;
                    range2.newListEnd = diffPartial.y - 1;
                }
                arrayList2.add(range2);
                if (!diffPartial.reverse) {
                    range.oldListStart = diffPartial.x + diffPartial.size;
                    range.newListStart = diffPartial.y + diffPartial.size;
                } else if (diffPartial.removal) {
                    range.oldListStart = (diffPartial.x + diffPartial.size) + 1;
                    range.newListStart = diffPartial.y + diffPartial.size;
                } else {
                    range.oldListStart = diffPartial.x + diffPartial.size;
                    range.newListStart = (diffPartial.y + diffPartial.size) + 1;
                }
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, SNAKE_COMPARATOR);
        return new DiffResult(callback, arrayList, iArr, iArr2, z);
    }

    /* JADX WARNING: Missing block: B:15:0x0044, code skipped:
            if (r20[r2 - 1] < r20[r2 + 1]) goto L_0x0046;
     */
    /* JADX WARNING: Missing block: B:42:0x00c0, code skipped:
            if (r21[r2 - 1] < r21[r2 + 1]) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static Snake diffPartial(Callback callback, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i6 < 1 || i7 < 1) {
            return null;
        }
        int i8 = i6 - i7;
        int i9 = ((i6 + i7) + 1) / 2;
        int i10 = (i5 - i9) - 1;
        int i11 = (i5 + i9) + 1;
        Arrays.fill(iArr, i10, i11, 0);
        Arrays.fill(iArr2, i10 + i8, i11 + i8, i6);
        Object obj = i8 % 2 != 0 ? 1 : null;
        int i12 = 0;
        while (i12 <= i9) {
            int i13;
            boolean z;
            int i14;
            int i15;
            Snake snake;
            int i16 = -i12;
            int i17 = i16;
            while (i17 <= i12) {
                if (i17 != i16) {
                    if (i17 != i12) {
                        i11 = i5 + i17;
                    }
                    i13 = iArr[(i5 + i17) - 1] + 1;
                    z = true;
                    i14 = i13 - i17;
                    i15 = i13;
                    while (i15 < i6 && i14 < i7 && callback.areItemsTheSame(i + i15, i3 + i14)) {
                        i15++;
                        i14++;
                    }
                    i13 = i5 + i17;
                    iArr[i13] = i15;
                    if (obj != null || i17 < (i8 - i12) + 1 || i17 > (i8 + i12) - 1 || iArr[i13] < iArr2[i13]) {
                        i17 += 2;
                    } else {
                        snake = new Snake();
                        snake.x = iArr2[i13];
                        snake.y = snake.x - i17;
                        snake.size = iArr[i13] - iArr2[i13];
                        snake.removal = z;
                        snake.reverse = false;
                        return snake;
                    }
                }
                i13 = iArr[(i5 + i17) + 1];
                z = false;
                i14 = i13 - i17;
                i15 = i13;
                while (i15 < i6) {
                    i15++;
                    i14++;
                }
                i13 = i5 + i17;
                iArr[i13] = i15;
                if (obj != null) {
                }
                i17 += 2;
            }
            for (i17 = i16; i17 <= i12; i17 += 2) {
                int i18 = i17 + i8;
                if (i18 != i12 + i8) {
                    if (i18 != i16 + i8) {
                        i11 = i5 + i18;
                    }
                    i13 = iArr2[(i5 + i18) + 1] - 1;
                    z = true;
                    i14 = i13 - i18;
                    i15 = i13;
                    while (i15 > 0 && i14 > 0 && callback.areItemsTheSame((i + i15) - 1, (i3 + i14) - 1)) {
                        i15--;
                        i14--;
                    }
                    i13 = i5 + i18;
                    iArr2[i13] = i15;
                    if (obj == null || i18 < i16 || i18 > i12 || iArr[i13] < iArr2[i13]) {
                    } else {
                        snake = new Snake();
                        snake.x = iArr2[i13];
                        snake.y = snake.x - i18;
                        snake.size = iArr[i13] - iArr2[i13];
                        snake.removal = z;
                        snake.reverse = true;
                        return snake;
                    }
                }
                i13 = iArr2[(i5 + i18) - 1];
                z = false;
                i14 = i13 - i18;
                i15 = i13;
                while (i15 > 0) {
                    i15--;
                    i14--;
                }
                i13 = i5 + i18;
                iArr2[i13] = i15;
                if (obj == null) {
                }
            }
            i12++;
        }
        throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    }
}
