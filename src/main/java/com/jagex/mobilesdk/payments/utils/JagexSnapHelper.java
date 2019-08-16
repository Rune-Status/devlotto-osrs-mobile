package com.jagex.mobilesdk.payments.utils;

import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;

public class JagexSnapHelper extends PagerSnapHelper {
    private int snapPosition = -1;

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
    }

    public View findSnapView(LayoutManager layoutManager) {
        return (!(layoutManager instanceof LinearLayoutManager) || this.snapPosition == -1) ? super.findSnapView(layoutManager) : layoutManager.findViewByPosition(this.snapPosition);
    }

    public void setSnapPosition(int i) {
        this.snapPosition = i;
    }
}
