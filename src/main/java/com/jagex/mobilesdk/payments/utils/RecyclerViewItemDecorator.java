package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import com.jagex.mobilesdk.R;

public class RecyclerViewItemDecorator extends ItemDecoration {
    private final int decorationHeight;

    public RecyclerViewItemDecorator(Context context) {
        this.decorationHeight = context.getResources().getDimensionPixelSize(R.dimen.decoration_space);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView != null && view != null) {
            rect.left = this.decorationHeight / 2;
            rect.right = this.decorationHeight / 2;
        }
    }
}
