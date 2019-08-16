package android.support.v7.widget;

import android.support.v4.util.Pools.Pool;
import android.support.v4.util.Pools.SimplePool;
import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AdapterHelper implements Callback {
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList<UpdateOp> mPendingUpdates;
    final ArrayList<UpdateOp> mPostponedList;
    private Pool<UpdateOp> mUpdateOpPool;

    interface Callback {
        ViewHolder findViewHolder(int i);

        void markViewHoldersUpdated(int i, int i2, Object obj);

        void offsetPositionsForAdd(int i, int i2);

        void offsetPositionsForMove(int i, int i2);

        void offsetPositionsForRemovingInvisible(int i, int i2);

        void offsetPositionsForRemovingLaidOutOrNewView(int i, int i2);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    static class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        Object payload;
        int positionStart;

        UpdateOp(int i, int i2, int i3, Object obj) {
            this.cmd = i;
            this.positionStart = i2;
            this.itemCount = i3;
            this.payload = obj;
        }

        /* Access modifiers changed, original: 0000 */
        public String cmdToString() {
            int i = this.cmd;
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            switch (i) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                default:
                    return "??";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            return this.cmd != updateOp.cmd ? false : (this.cmd == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) ? true : this.itemCount != updateOp.itemCount ? false : this.positionStart != updateOp.positionStart ? false : this.payload != null ? this.payload.equals(updateOp.payload) : updateOp.payload == null;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append("[");
            stringBuilder.append(cmdToString());
            stringBuilder.append(",s:");
            stringBuilder.append(this.positionStart);
            stringBuilder.append("c:");
            stringBuilder.append(this.itemCount);
            stringBuilder.append(",p:");
            stringBuilder.append(this.payload);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    AdapterHelper(Callback callback) {
        this(callback, false);
    }

    AdapterHelper(Callback callback, boolean z) {
        this.mUpdateOpPool = new SimplePool(30);
        this.mPendingUpdates = new ArrayList();
        this.mPostponedList = new ArrayList();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z;
        this.mOpReorderer = new OpReorderer(this);
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(UpdateOp updateOp) {
        int i = updateOp.positionStart;
        int i2 = updateOp.itemCount + updateOp.positionStart;
        int i3 = updateOp.positionStart;
        Object obj = -1;
        int i4 = 0;
        while (i3 < i2) {
            Object obj2;
            int i5;
            if (this.mCallback.findViewHolder(i3) != null || canFindInPreLayout(i3)) {
                if (obj == null) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i, i4, null));
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = 1;
            } else {
                if (obj == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i, i4, null));
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = null;
            }
            if (obj2 != null) {
                i3 -= i4;
                i5 = i2 - i4;
                i4 = 1;
            } else {
                i4++;
                i5 = i2;
            }
            i3++;
            i2 = i5;
        }
        if (i4 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i, i4, null);
        }
        if (obj == null) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i = updateOp.positionStart;
        int i2 = updateOp.positionStart;
        int i3 = updateOp.itemCount;
        int i4 = updateOp.positionStart;
        Object obj = -1;
        int i5 = 0;
        while (i4 < i2 + i3) {
            if (this.mCallback.findViewHolder(i4) != null || canFindInPreLayout(i4)) {
                if (obj == null) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i, i5, updateOp.payload));
                    i = i4;
                    i5 = 0;
                }
                obj = 1;
            } else {
                if (obj == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i, i5, updateOp.payload));
                    i5 = 0;
                    i = i4;
                }
                obj = null;
            }
            i5++;
            i4++;
        }
        if (i5 != updateOp.itemCount) {
            Object obj2 = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i, i5, obj2);
        }
        if (obj == null) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private boolean canFindInPreLayout(int i) {
        int size = this.mPostponedList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) this.mPostponedList.get(i2);
            if (updateOp.cmd == 8) {
                if (findPositionOffset(updateOp.itemCount, i2 + 1) == i) {
                    return true;
                }
            } else if (updateOp.cmd == 1) {
                int i3 = updateOp.positionStart;
                int i4 = updateOp.itemCount;
                for (int i5 = updateOp.positionStart; i5 < i3 + i4; i5++) {
                    if (findPositionOffset(i5, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        if (updateOp.cmd == 1 || updateOp.cmd == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int updatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, updateOp.cmd);
        int i = updateOp.positionStart;
        int i2 = updateOp.cmd;
        if (i2 == 2) {
            i2 = 0;
        } else if (i2 == 4) {
            i2 = 1;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("op should be remove or update.");
            stringBuilder.append(updateOp);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i3 = 1;
        for (int i4 = 1; i4 < updateOp.itemCount; i4++) {
            Object obj;
            int updatePositionWithPostponed2 = updatePositionWithPostponed(updateOp.positionStart + (i2 * i4), updateOp.cmd);
            int i5 = updateOp.cmd;
            if (i5 == 2 ? updatePositionWithPostponed2 != updatePositionWithPostponed : !(i5 == 4 && updatePositionWithPostponed2 == updatePositionWithPostponed + 1)) {
                obj = null;
            } else {
                i5 = 1;
            }
            if (obj != null) {
                i3++;
            } else {
                UpdateOp obtainUpdateOp = obtainUpdateOp(updateOp.cmd, updatePositionWithPostponed, i3, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp, i);
                recycleUpdateOp(obtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i += i3;
                }
                updatePositionWithPostponed = updatePositionWithPostponed2;
                i3 = 1;
            }
        }
        Object obj2 = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i3 > 0) {
            UpdateOp obtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, updatePositionWithPostponed, i3, obj2);
            dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp2, i);
            recycleUpdateOp(obtainUpdateOp2);
        }
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i = updateOp.cmd;
        if (i == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
                    return;
                case 2:
                    this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown update op type for ");
                    stringBuilder.append(updateOp);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else {
            this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
        }
    }

    private int updatePositionWithPostponed(int i, int i2) {
        UpdateOp updateOp;
        int i3;
        int i4 = i;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            int i5;
            updateOp = (UpdateOp) this.mPostponedList.get(size);
            if (updateOp.cmd == 8) {
                int i6;
                if (updateOp.positionStart < updateOp.itemCount) {
                    i6 = updateOp.positionStart;
                    i3 = updateOp.itemCount;
                } else {
                    i6 = updateOp.itemCount;
                    i3 = updateOp.positionStart;
                }
                if (i4 < i6 || i4 > i3) {
                    if (i4 < updateOp.positionStart) {
                        if (i2 == 1) {
                            updateOp.positionStart++;
                            updateOp.itemCount++;
                            i5 = i4;
                        } else if (i2 == 2) {
                            updateOp.positionStart--;
                            updateOp.itemCount--;
                            i5 = i4;
                        }
                    }
                    i5 = i4;
                } else if (i6 == updateOp.positionStart) {
                    if (i2 == 1) {
                        updateOp.itemCount++;
                    } else if (i2 == 2) {
                        updateOp.itemCount--;
                    }
                    i5 = i4 + 1;
                } else {
                    if (i2 == 1) {
                        updateOp.positionStart++;
                    } else if (i2 == 2) {
                        updateOp.positionStart--;
                    }
                    i5 = i4 - 1;
                }
            } else if (updateOp.positionStart <= i4) {
                if (updateOp.cmd == 1) {
                    i5 = i4 - updateOp.itemCount;
                } else {
                    if (updateOp.cmd == 2) {
                        i5 = updateOp.itemCount + i4;
                    }
                    i5 = i4;
                }
            } else if (i2 == 1) {
                updateOp.positionStart++;
                i5 = i4;
            } else {
                if (i2 == 2) {
                    updateOp.positionStart--;
                    i5 = i4;
                }
                i5 = i4;
            }
            i4 = i5;
        }
        for (i3 = this.mPostponedList.size() - 1; i3 >= 0; i3--) {
            updateOp = (UpdateOp) this.mPostponedList.get(i3);
            if (updateOp.cmd == 8) {
                if (updateOp.itemCount == updateOp.positionStart || updateOp.itemCount < 0) {
                    this.mPostponedList.remove(i3);
                    recycleUpdateOp(updateOp);
                }
            } else if (updateOp.itemCount <= 0) {
                this.mPostponedList.remove(i3);
                recycleUpdateOp(updateOp);
            }
        }
        return i4;
    }

    /* Access modifiers changed, original: varargs */
    public AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i) {
        int size = this.mPendingUpdates.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = (UpdateOp) this.mPendingUpdates.get(i3);
            int i4 = updateOp.cmd;
            if (i4 != 8) {
                switch (i4) {
                    case 1:
                        if (updateOp.positionStart > i2) {
                            break;
                        }
                        i2 += updateOp.itemCount;
                        break;
                    case 2:
                        if (updateOp.positionStart <= i2) {
                            if (updateOp.positionStart + updateOp.itemCount <= i2) {
                                i2 -= updateOp.itemCount;
                                break;
                            }
                            return -1;
                        }
                        continue;
                    default:
                        continue;
                }
            } else if (updateOp.positionStart == i2) {
                i2 = updateOp.itemCount;
            } else {
                if (updateOp.positionStart < i2) {
                    i2--;
                }
                if (updateOp.itemCount <= i2) {
                    i2++;
                }
            }
        }
        return i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i = 0; i < size; i++) {
            this.mCallback.onDispatchSecondPass((UpdateOp) this.mPostponedList.get(i));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) this.mPendingUpdates.get(i);
            int i2 = updateOp.cmd;
            if (i2 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.mCallback.onDispatchSecondPass(updateOp);
                        this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
                        break;
                    case 2:
                        this.mCallback.onDispatchSecondPass(updateOp);
                        this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
                        break;
                }
            } else {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            if (this.mOnItemProcessedCallback != null) {
                this.mOnItemProcessedCallback.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i2 = updateOp.cmd;
        if (i2 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i, updateOp.itemCount);
        } else if (i2 == 4) {
            this.mCallback.markViewHoldersUpdated(i, updateOp.itemCount, updateOp.payload);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int findPositionOffset(int i) {
        return findPositionOffset(i, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public int findPositionOffset(int i, int i2) {
        int size = this.mPostponedList.size();
        int i3 = i;
        while (i2 < size) {
            UpdateOp updateOp = (UpdateOp) this.mPostponedList.get(i2);
            if (updateOp.cmd == 8) {
                if (updateOp.positionStart == i3) {
                    i3 = updateOp.itemCount;
                } else {
                    if (updateOp.positionStart < i3) {
                        i3--;
                    }
                    if (updateOp.itemCount <= i3) {
                        i3++;
                    }
                }
            } else if (updateOp.positionStart > i3) {
                continue;
            } else if (updateOp.cmd == 2) {
                if (i3 < updateOp.positionStart + updateOp.itemCount) {
                    return -1;
                }
                i3 -= updateOp.itemCount;
            } else if (updateOp.cmd == 1) {
                i3 += updateOp.itemCount;
            }
            i2++;
        }
        return i3;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasAnyUpdateTypes(int i) {
        return (this.mExistingUpdateTypes & i) != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    public UpdateOp obtainUpdateOp(int i, int i2, int i3, Object obj) {
        UpdateOp updateOp = (UpdateOp) this.mUpdateOpPool.acquire();
        if (updateOp == null) {
            return new UpdateOp(i, i2, i3, obj);
        }
        updateOp.cmd = i;
        updateOp.positionStart = i2;
        updateOp.itemCount = i3;
        updateOp.payload = obj;
        return updateOp;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onItemRangeChanged(int i, int i2, Object obj) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i, i2, obj));
        this.mExistingUpdateTypes |= 4;
        if (this.mPendingUpdates.size() != 1) {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onItemRangeInserted(int i, int i2) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i, i2, null));
        this.mExistingUpdateTypes |= 1;
        if (this.mPendingUpdates.size() != 1) {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onItemRangeMoved(int i, int i2, int i3) {
        boolean z = true;
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.mPendingUpdates.add(obtainUpdateOp(8, i, i2, null));
            this.mExistingUpdateTypes |= 8;
            if (this.mPendingUpdates.size() != 1) {
                z = false;
            }
            return z;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onItemRangeRemoved(int i, int i2) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i, i2, null));
        this.mExistingUpdateTypes |= 2;
        if (this.mPendingUpdates.size() != 1) {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) this.mPendingUpdates.get(i);
            int i2 = updateOp.cmd;
            if (i2 == 4) {
                applyUpdate(updateOp);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        applyAdd(updateOp);
                        break;
                    case 2:
                        applyRemove(updateOp);
                        break;
                }
            } else {
                applyMove(updateOp);
            }
            if (this.mOnItemProcessedCallback != null) {
                this.mOnItemProcessedCallback.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    public void recycleUpdateOp(UpdateOp updateOp) {
        if (!this.mDisableRecycler) {
            updateOp.payload = null;
            this.mUpdateOpPool.release(updateOp);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            recycleUpdateOp((UpdateOp) list.get(i));
        }
        list.clear();
    }

    /* Access modifiers changed, original: 0000 */
    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }
}
