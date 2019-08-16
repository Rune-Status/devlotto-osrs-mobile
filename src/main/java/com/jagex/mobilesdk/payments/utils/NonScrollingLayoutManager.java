package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

public class NonScrollingLayoutManager extends GridLayoutManager {
    public NonScrollingLayoutManager(Context context, int i) {
        super(context, i);
    }

    public boolean canScrollVertically() {
        return false;
    }
}
