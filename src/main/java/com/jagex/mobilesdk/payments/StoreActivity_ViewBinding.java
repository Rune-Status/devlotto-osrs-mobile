package com.jagex.mobilesdk.payments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jagex.mobilesdk.R;

public class StoreActivity_ViewBinding<T extends StoreActivity> implements Unbinder {
    protected T target;
    private View view2131492900;
    private View view2131492901;

    @UiThread
    public StoreActivity_ViewBinding(final T t, View view) {
        this.target = t;
        View findRequiredView = Utils.findRequiredView(view, R.id.btn_CollapsePackage, "field 'collapsePackage' and method 'onCollapsePackageClicked'");
        t.collapsePackage = (RelativeLayout) Utils.castView(findRequiredView, R.id.btn_CollapsePackage, "field 'collapsePackage'", RelativeLayout.class);
        this.view2131492901 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.onCollapsePackageClicked(view);
            }
        });
        t.shopLogo = (ImageView) Utils.findRequiredViewAsType(view, R.id.shopLogo, "field 'shopLogo'", ImageView.class);
        t.shopParentLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.coordinatorLayout, "field 'shopParentLayout'", ConstraintLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.btn_BackToGame, "method 'onBackToGameClicked'");
        this.view2131492900 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public void doClick(View view) {
                t.onBackToGameClicked(view);
            }
        });
    }

    @CallSuper
    public void unbind() {
        StoreActivity storeActivity = this.target;
        if (storeActivity != null) {
            storeActivity.collapsePackage = null;
            storeActivity.shopLogo = null;
            storeActivity.shopParentLayout = null;
            this.view2131492901.setOnClickListener(null);
            this.view2131492901 = null;
            this.view2131492900.setOnClickListener(null);
            this.view2131492900 = null;
            this.target = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
