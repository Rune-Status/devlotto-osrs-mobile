package android.support.v7.widget;

import java.util.List;

class OpReorderer {
    final Callback mCallback;

    interface Callback {
        UpdateOp obtainUpdateOp(int i, int i2, int i3, Object obj);

        void recycleUpdateOp(UpdateOp updateOp);
    }

    OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<UpdateOp> list) {
        int size = list.size() - 1;
        Object obj = null;
        while (size >= 0) {
            Object obj2;
            if (((UpdateOp) list.get(size)).cmd != 8) {
                obj2 = 1;
            } else if (obj != null) {
                return size;
            } else {
                obj2 = obj;
            }
            size--;
            obj = obj2;
        }
        return -1;
    }

    private void swapMoveAdd(List<UpdateOp> list, int i, UpdateOp updateOp, int i2, UpdateOp updateOp2) {
        int i3 = updateOp.itemCount < updateOp2.positionStart ? -1 : 0;
        if (updateOp.positionStart < updateOp2.positionStart) {
            i3++;
        }
        if (updateOp2.positionStart <= updateOp.positionStart) {
            updateOp.positionStart += updateOp2.itemCount;
        }
        if (updateOp2.positionStart <= updateOp.itemCount) {
            updateOp.itemCount += updateOp2.itemCount;
        }
        updateOp2.positionStart = i3 + updateOp2.positionStart;
        list.set(i, updateOp2);
        list.set(i2, updateOp);
    }

    private void swapMoveOp(List<UpdateOp> list, int i, int i2) {
        UpdateOp updateOp = (UpdateOp) list.get(i);
        UpdateOp updateOp2 = (UpdateOp) list.get(i2);
        int i3 = updateOp2.cmd;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    swapMoveAdd(list, i, updateOp, i2, updateOp2);
                    return;
                case 2:
                    swapMoveRemove(list, i, updateOp, i2, updateOp2);
                    return;
                default:
                    return;
            }
        }
        swapMoveUpdate(list, i, updateOp, i2, updateOp2);
    }

    /* Access modifiers changed, original: 0000 */
    public void reorderOps(List<UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder != -1) {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void swapMoveRemove(List<UpdateOp> list, int i, UpdateOp updateOp, int i2, UpdateOp updateOp2) {
        int i3;
        int i4;
        int i5 = 0;
        if (updateOp.positionStart < updateOp.itemCount) {
            if (!(updateOp2.positionStart == updateOp.positionStart && updateOp2.itemCount == updateOp.itemCount - updateOp.positionStart)) {
                UpdateOp updateOp3;
                i3 = 0;
                i4 = 0;
                if (updateOp.itemCount < updateOp2.positionStart) {
                    updateOp2.positionStart--;
                } else if (updateOp.itemCount < updateOp2.positionStart + updateOp2.itemCount) {
                    updateOp2.itemCount--;
                    updateOp.cmd = 2;
                    updateOp.itemCount = 1;
                    if (updateOp2.itemCount == 0) {
                        list.remove(i2);
                        this.mCallback.recycleUpdateOp(updateOp2);
                        return;
                    }
                    return;
                }
                if (updateOp.positionStart <= updateOp2.positionStart) {
                    updateOp2.positionStart++;
                    updateOp3 = null;
                } else if (updateOp.positionStart < updateOp2.positionStart + updateOp2.itemCount) {
                    i5 = updateOp2.positionStart;
                    int i6 = updateOp2.itemCount;
                    updateOp3 = this.mCallback.obtainUpdateOp(2, updateOp.positionStart + 1, (i5 + i6) - updateOp.positionStart, null);
                    updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
                } else {
                    updateOp3 = null;
                }
                if (i3 != 0) {
                    list.set(i, updateOp2);
                    list.remove(i2);
                    this.mCallback.recycleUpdateOp(updateOp);
                    return;
                }
                if (i4 != 0) {
                    if (updateOp3 != null) {
                        if (updateOp.positionStart > updateOp3.positionStart) {
                            updateOp.positionStart -= updateOp3.itemCount;
                        }
                        if (updateOp.itemCount > updateOp3.positionStart) {
                            updateOp.itemCount -= updateOp3.itemCount;
                        }
                    }
                    if (updateOp.positionStart > updateOp2.positionStart) {
                        updateOp.positionStart -= updateOp2.itemCount;
                    }
                    if (updateOp.itemCount > updateOp2.positionStart) {
                        updateOp.itemCount -= updateOp2.itemCount;
                    }
                } else {
                    if (updateOp3 != null) {
                        if (updateOp.positionStart >= updateOp3.positionStart) {
                            updateOp.positionStart -= updateOp3.itemCount;
                        }
                        if (updateOp.itemCount >= updateOp3.positionStart) {
                            updateOp.itemCount -= updateOp3.itemCount;
                        }
                    }
                    if (updateOp.positionStart >= updateOp2.positionStart) {
                        updateOp.positionStart -= updateOp2.itemCount;
                    }
                    if (updateOp.itemCount >= updateOp2.positionStart) {
                        updateOp.itemCount -= updateOp2.itemCount;
                    }
                }
                list.set(i, updateOp2);
                if (updateOp.positionStart != updateOp.itemCount) {
                    list.set(i2, updateOp);
                } else {
                    list.remove(i2);
                }
                if (updateOp3 != null) {
                    list.add(i, updateOp3);
                    return;
                }
                return;
            }
        } else if (updateOp2.positionStart == updateOp.itemCount + 1 && updateOp2.itemCount == updateOp.positionStart - updateOp.itemCount) {
            i5 = 1;
        } else {
            i3 = 0;
            i4 = 1;
            if (updateOp.itemCount < updateOp2.positionStart) {
            }
            if (updateOp.positionStart <= updateOp2.positionStart) {
            }
            if (i3 != 0) {
            }
        }
        i3 = 1;
        i4 = i5;
        if (updateOp.itemCount < updateOp2.positionStart) {
        }
        if (updateOp.positionStart <= updateOp2.positionStart) {
        }
        if (i3 != 0) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void swapMoveUpdate(List<UpdateOp> list, int i, UpdateOp updateOp, int i2, UpdateOp updateOp2) {
        Object obtainUpdateOp;
        Object obj = null;
        if (updateOp.itemCount < updateOp2.positionStart) {
            updateOp2.positionStart--;
        } else if (updateOp.itemCount < updateOp2.positionStart + updateOp2.itemCount) {
            updateOp2.itemCount--;
            obtainUpdateOp = this.mCallback.obtainUpdateOp(4, updateOp.positionStart, 1, updateOp2.payload);
            if (updateOp.positionStart > updateOp2.positionStart) {
                updateOp2.positionStart++;
            } else if (updateOp.positionStart < updateOp2.positionStart + updateOp2.itemCount) {
                int i3 = (updateOp2.positionStart + updateOp2.itemCount) - updateOp.positionStart;
                obj = this.mCallback.obtainUpdateOp(4, updateOp.positionStart + 1, i3, updateOp2.payload);
                updateOp2.itemCount -= i3;
            }
            list.set(i2, updateOp);
            if (updateOp2.itemCount <= 0) {
                list.set(i, updateOp2);
            } else {
                list.remove(i);
                this.mCallback.recycleUpdateOp(updateOp2);
            }
            if (obtainUpdateOp != null) {
                list.add(i, obtainUpdateOp);
            }
            if (obj == null) {
                list.add(i, obj);
                return;
            }
            return;
        }
        obtainUpdateOp = null;
        if (updateOp.positionStart > updateOp2.positionStart) {
        }
        list.set(i2, updateOp);
        if (updateOp2.itemCount <= 0) {
        }
        if (obtainUpdateOp != null) {
        }
        if (obj == null) {
        }
    }
}
