package com.jagex.mobilesdk.payments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jagex.mobilesdk.R;

public class PackageListFragment_ViewBinding<T extends PackageListFragment> implements Unbinder {
    protected T target;

    @UiThread
    public PackageListFragment_ViewBinding(T t, View view) {
        this.target = t;
        t.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.categoryList, "field 'recyclerView'", RecyclerView.class);
        t.packageLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.package_layout, "field 'packageLayout'", ConstraintLayout.class);
    }

    @CallSuper
    public void unbind() {
        PackageListFragment packageListFragment = this.target;
        if (packageListFragment != null) {
            packageListFragment.recyclerView = null;
            packageListFragment.packageLayout = null;
            this.target = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
