package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.comms.FetchImageComms.FetchImageCallback;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import com.jagex.mobilesdk.payments.utils.PackageListInteractionListener;

public class StoreActivity extends AppCompatActivity implements PackageListInteractionListener {
    @BindView(2131492901)
    RelativeLayout collapsePackage;
    private View decorView;
    @BindView(2131493014)
    ImageView shopLogo;
    @BindView(2131492919)
    ConstraintLayout shopParentLayout;

    @OnClick({2131492900})
    public void onBackToGameClicked(View view) {
        finish();
    }

    @OnClick({2131492901})
    public void onCollapsePackageClicked(View view) {
        ((PackageListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_package)).collapseExpandedPackagesView();
    }

    public void onCollapsePackages() {
        runOnUiThread(new Runnable() {
            public void run() {
                StoreActivity.this.collapsePackage.setVisibility(8);
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_store);
        ButterKnife.bind((Activity) this);
        this.decorView = getWindow().getDecorView();
        this.collapsePackage.setVisibility(4);
    }

    public void onPackageExpanded() {
        runOnUiThread(new Runnable() {
            public void run() {
                StoreActivity.this.collapsePackage.setVisibility(0);
            }
        });
        ((PackageListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_package)).expandCollapseRemainingViews();
    }

    public void onShopLoaded(final String str, final String str2) {
        runOnUiThread(new Runnable() {
            public void run() {
                final Context applicationContext = StoreActivity.this.getApplicationContext();
                PaymentComms.FetchImageComms(str, new FetchImageCallback() {
                    public void onFetchImageResult(CommsResult<Bitmap> commsResult, Exception exception) {
                        if (commsResult.responseCode == 200 && applicationContext != null && commsResult != null) {
                            StoreActivity.this.shopLogo.setBackground(new BitmapDrawable(applicationContext.getResources(), (Bitmap) commsResult.getResultValue()));
                        }
                    }
                }, true);
                PaymentComms.FetchImageComms(str2, new FetchImageCallback() {
                    public void onFetchImageResult(CommsResult<Bitmap> commsResult, Exception exception) {
                        if (commsResult.responseCode == 200 && applicationContext != null && commsResult != null) {
                            StoreActivity.this.shopParentLayout.setBackground(new BitmapDrawable(applicationContext.getResources(), (Bitmap) commsResult.getResultValue()));
                        }
                    }
                }, true);
            }
        });
    }

    public void onShowHideMoreProducts(boolean z, int i) {
        ((PackageListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_package)).showHideMoreProducts(z, i);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.decorView.setSystemUiVisibility(5894);
        }
    }

    public void purchaseProduct(SkuDetails skuDetails) {
        ((PackageListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_package)).purchaseProduct(skuDetails);
    }

    public void setPackageExpandCollapseDetails(boolean z, int i) {
        ((PackageListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_package)).setExpandCollapseDetails(z, i);
    }
}
