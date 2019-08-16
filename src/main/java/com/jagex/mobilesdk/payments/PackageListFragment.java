package com.jagex.mobilesdk.payments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigParcel;
import com.jagex.mobilesdk.payments.PackageListViewController.PackageListViewListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingMessages;
import com.jagex.mobilesdk.payments.model.JagexPackage;
import com.jagex.mobilesdk.payments.utils.JagexSnapHelper;
import com.jagex.mobilesdk.payments.utils.PackageListInteractionListener;
import com.jagex.mobilesdk.payments.utils.RecyclerViewItemDecorator;
import java.util.List;

public class PackageListFragment extends Fragment implements PackageListViewListener {
    private PackageListRecyclerViewAdapter adapter;
    private JagexConfig configuration;
    private int expandedItemPosition;
    private int initialPackage;
    private boolean isCollapse;
    private PackageListInteractionListener listener;
    private int packageID;
    @BindView(2131492980)
    ConstraintLayout packageLayout;
    @BindView(2131492908)
    RecyclerView recyclerView;
    private JagexSnapHelper snapHelper;
    private PackageListViewController viewController;

    private PackageListViewController getViewController() {
        if (this.viewController == null) {
            this.viewController = new PackageListViewController(this, getActivity(), this.configuration);
        }
        return this.viewController;
    }

    private void loadPackageItems(final int i, final boolean z) {
        final ItemAnimator itemAnimator = this.recyclerView.getItemAnimator();
        this.recyclerView.setItemAnimator(null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                if (!z) {
                    for (int i = 0; i < PackageListFragment.this.recyclerView.getAdapter().getItemCount(); i++) {
                        if (i != i) {
                            PackageListFragment.this.adapter.notifyItemChanged(i);
                        }
                    }
                }
                PackageListFragment.this.recyclerView.setItemAnimator(itemAnimator);
            }
        }, (long) getContext().getResources().getInteger(R.integer.package_list_load_delay));
    }

    private void runOnParentActivity(Runnable runnable) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    private void startExpandCollapseSelectedView() {
        LayoutParams layoutParams = (LayoutParams) this.recyclerView.getLayoutParams();
        if (this.isCollapse) {
            if (this.listener != null) {
                this.listener.onCollapsePackages();
            }
            this.snapHelper.attachToRecyclerView(null);
            layoutParams.width = -2;
            this.recyclerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = -1;
            this.recyclerView.setLayoutParams(layoutParams);
            this.snapHelper.attachToRecyclerView(this.recyclerView);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.recyclerView.getLayoutManager();
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == this.expandedItemPosition) {
                this.adapter.setPivotX(1.0f);
                this.adapter.setPivotY(1.0f);
            } else if (linearLayoutManager.findFirstVisibleItemPosition() == this.expandedItemPosition) {
                this.adapter.setPivotX(0.0f);
                this.adapter.setPivotY(0.0f);
            } else {
                this.adapter.setPivotX(0.5f);
                this.adapter.setPivotY(0.5f);
            }
        }
        this.recyclerView.invalidate();
        this.snapHelper.setSnapPosition(this.expandedItemPosition);
        this.recyclerView.getAdapter().notifyItemChanged(this.expandedItemPosition);
        if (this.recyclerView.getAdapter().getItemCount() >= 3) {
            return;
        }
        if (getResources().getBoolean(R.bool.isTablet)) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    PackageListFragment.this.recyclerView.scrollToPosition(PackageListFragment.this.expandedItemPosition);
                }
            }, 5);
        } else {
            this.recyclerView.scrollToPosition(this.expandedItemPosition);
        }
    }

    public void billingInitialiseAttempt(int i) {
        if (i == 0) {
            getViewController().checkNetwork();
        } else {
            onDisplayMessage(BillingMessages.getErrorMessage(i));
        }
    }

    public void collapseExpandedPackagesView() {
        this.adapter.setExpandedPosition(-1);
        this.adapter.setExpandCollapseMode(true);
        this.isCollapse = true;
        startExpandCollapseSelectedView();
        expandCollapseRemainingViews();
    }

    public void expandCollapseRemainingViews() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                for (int i = 0; i < PackageListFragment.this.adapter.getItemCount(); i++) {
                    if (i != PackageListFragment.this.expandedItemPosition) {
                        PackageListFragment.this.recyclerView.getAdapter().notifyItemChanged(i);
                    }
                }
                PackageListFragment.this.recyclerView.getLayoutManager().scrollToPosition(PackageListFragment.this.expandedItemPosition);
                if (!PackageListFragment.this.isCollapse) {
                    PackageListFragment.this.recyclerView.smoothScrollBy(1, 0);
                    PackageListFragment.this.loadPackageItems(PackageListFragment.this.expandedItemPosition, PackageListFragment.this.isCollapse);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        PackageListFragment.this.snapHelper.setSnapPosition(-1);
                    }
                }, (long) PackageListFragment.this.getContext().getResources().getInteger(R.integer.snap_reset_delay));
            }
        });
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PackageListInteractionListener) {
            this.listener = (PackageListInteractionListener) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnListFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onCategoriesLoaded(final List<JagexPackage> list) {
        runOnParentActivity(new Runnable() {
            public void run() {
                PackageListFragment.this.adapter.setPackages(list);
                PackageListFragment.this.adapter.filterPackage(PackageListFragment.this.packageID);
                if (PackageListFragment.this.initialPackage != 15) {
                    int positionForPackageID = (list == null || list.size() <= 1) ? 0 : PackageListFragment.this.adapter.getPositionForPackageID(PackageListFragment.this.initialPackage);
                    PackageListFragment.this.adapter.setExpandCollapseMode(false);
                    PackageListFragment.this.adapter.setExpandedPosition(positionForPackageID);
                    PackageListFragment.this.setExpandCollapseDetails(false, positionForPackageID);
                    PackageListFragment.this.recyclerView.scrollToPosition(positionForPackageID);
                    return;
                }
                PackageListFragment.this.adapter.setExpandCollapseMode(true);
                PackageListFragment.this.adapter.setExpandedPosition(0);
                PackageListFragment.this.setExpandCollapseDetails(true, 0);
                PackageListFragment.this.recyclerView.setItemViewCacheSize(list.size() - 1);
                ((LinearLayoutManager) PackageListFragment.this.recyclerView.getLayoutManager()).setInitialPrefetchItemCount(list.size() - 1);
                PackageListFragment.this.recyclerView.setDrawingCacheQuality(524288);
                PackageListFragment.this.adapter.notifyDataSetChanged();
                PackageListFragment.this.recyclerView.scrollToPosition(list.size() - 1);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        PackageListFragment.this.recyclerView.scrollToPosition(0);
                    }
                }, 50);
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getActivity().getIntent().getExtras();
        JagexConfigParcel jagexConfigParcel = (JagexConfigParcel) extras.getParcelable(MobilePaymentService.EXTRA_CONFIG);
        this.packageID = extras.getInt(MobilePaymentService.PACKAGE_CONFIG);
        this.initialPackage = extras.getInt(MobilePaymentService.SELECTED_CONFIG);
        this.configuration = jagexConfigParcel.getConfig();
        getViewController();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_package_list, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.adapter = new PackageListRecyclerViewAdapter(getContext(), this.listener, this.viewController);
        this.adapter.setHasStableIds(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recyclerView.addItemDecoration(new RecyclerViewItemDecorator(getContext()));
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setDrawingCacheEnabled(true);
        this.recyclerView.getLayoutManager().setItemPrefetchEnabled(true);
        this.recyclerView.setDrawingCacheQuality(1048576);
        this.snapHelper = new JagexSnapHelper();
        ((SimpleItemAnimator) this.recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setOverScrollMode(2);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDetach() {
        super.onDetach();
        this.listener = null;
        if (this.viewController != null) {
            this.viewController.onDetach();
            this.viewController = null;
        }
    }

    public void onDisplayMessage(final int i) {
        runOnParentActivity(new Runnable() {
            public void run() {
                Toast.makeText(PackageListFragment.this.getContext(), i, 1).show();
            }
        });
    }

    public void onInternetStateChanged(boolean z) {
    }

    public void onPendingPurchasesAvailable() {
        runOnParentActivity(new Runnable() {
            public void run() {
                Builder builder = new Builder(PackageListFragment.this.getContext());
                builder.setTitle(R.string.PENDING_TRANSACTIONS);
                builder.setMessage(R.string.PENDING_TRANSACTION_MESSAGE).setCancelable(false).setPositiveButton(R.string.YES, new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        PackageListFragment.this.getViewController().applyUnconsumedPurchases(true, null);
                        dialogInterface.cancel();
                    }
                }).setNegativeButton(R.string.NO, new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        PackageListFragment.this.getViewController().applyUnconsumedPurchases(false, null);
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        });
    }

    public void onShopLoaded(String str, String str2) {
        if (this.listener != null) {
            this.listener.onShopLoaded(str, str2);
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onSuccessfulConsumption() {
    }

    public void purchaseProduct(SkuDetails skuDetails) {
        getViewController().buyProduct(skuDetails, null);
    }

    public void returnToGame() {
        if (this.listener != null) {
            this.listener.finish();
        }
    }

    public void setExpandCollapseDetails(boolean z, int i) {
        this.isCollapse = z;
        this.expandedItemPosition = i;
        this.recyclerView.smoothScrollBy(5, 0);
        startExpandCollapseSelectedView();
        expandCollapseRemainingViews();
    }

    public void showHideMoreProducts(boolean z, int i) {
        this.adapter.showMorePackages(z, i);
        this.adapter.notifyItemChanged(i);
    }
}
