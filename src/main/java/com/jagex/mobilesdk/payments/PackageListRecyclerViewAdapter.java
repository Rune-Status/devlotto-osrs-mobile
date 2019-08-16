package com.jagex.mobilesdk.payments;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.transition.ChangeBounds;
import android.support.transition.TransitionManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.RecycledViewPool;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jagex.mobilesdk.R;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.comms.FetchImageComms.FetchImageCallback;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import com.jagex.mobilesdk.payments.model.JagexPackage;
import com.jagex.mobilesdk.payments.utils.NonScrollingLayoutManager;
import com.jagex.mobilesdk.payments.utils.PackageListInteractionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PackageListRecyclerViewAdapter extends Adapter<ViewHolder> {
    private final float FONT_SCALE_THRESHOLD = 1.05f;
    private final float PACKAGE_DESCRIPTION_COLLAPSE_FONT_SCALE = 0.75f;
    private final float PACKAGE_DESCRIPTION_FONT_SCALE = 0.75f;
    private final float PACKAGE_TITLE_COLLAPSE_FONT_SCALE = 0.75f;
    private final float PACKAGE_TITLE_FONT_SCALE = 0.5f;
    private Context context;
    private boolean isPackageViewCollapsedMode = true;
    private final List<JagexPackage> jagexPackages = new ArrayList();
    private final PackageListInteractionListener listener;
    private int moreProductsShownAtPosition = -1;
    private int packageExpandedAtPosition = -1;
    private float pivotX;
    private float pivotY;
    private RecycledViewPool recycledViewPool;
    private boolean showMoreProducts = false;
    private final PackageListViewController viewController;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView(2131492913)
        LinearLayout collapsedContainer;
        ConstraintSet existingConstraints;
        Boolean hasShownFirstFiveProducts = Boolean.valueOf(false);
        Boolean hasShownMoreProducts = Boolean.valueOf(false);
        @BindView(2131492952)
        RelativeLayout includeMoreItems;
        Boolean isExpanded = Boolean.valueOf(false);
        PackageItemsRecyclerViewAdapter itemsAdapter;
        JagexPackage jagexPackage;
        @BindView(2131493060)
        TextView moreItems;
        @BindView(2131493061)
        TextView packageDescription;
        @BindView(2131493062)
        EditText packageDescriptionCollapse;
        @BindView(2131492950)
        ImageView packageImage;
        @BindView(2131492907)
        RecyclerView packageItemsRecycler;
        @BindView(2131492987)
        RelativeLayout packageProductsContainer;
        @BindView(2131493065)
        TextView packageTitle;
        @BindView(2131493066)
        TextView packageTitleCollapse;
        @BindView(2131493067)
        TextView plusMark;
        @BindView(2131493068)
        TextView txt_privacyPolicy;
        @BindView(2131493070)
        TextView txt_termsConditions;
        public final View view;

        ViewHolder(View view) {
            super(view);
            this.view = view;
            ButterKnife.bind((Object) this, view);
            this.existingConstraints = new ConstraintSet();
        }

        @OnClick({2131493068})
        public void onClickPrivacyPolicy(View view) {
            PackageListRecyclerViewAdapter.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jagex.com/terms/privacy")));
        }

        @OnClick({2131492952})
        public void onClickShowMore(View view) {
            PackageListRecyclerViewAdapter.this.listener.onShowHideMoreProducts(PackageListRecyclerViewAdapter.this.showMoreProducts ^ 1, ((Integer) view.getTag()).intValue());
        }

        @OnClick({2131493070})
        public void onClickTermsConditions(View view) {
            PackageListRecyclerViewAdapter.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jagex.com/terms")));
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T target;
        private View view2131492952;
        private View view2131493068;
        private View view2131493070;

        @UiThread
        public ViewHolder_ViewBinding(final T t, View view) {
            this.target = t;
            t.packageImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_PackageImage, "field 'packageImage'", ImageView.class);
            t.packageDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_PackageDescription, "field 'packageDescription'", TextView.class);
            t.packageTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_PackageTitle, "field 'packageTitle'", TextView.class);
            t.collapsedContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.collapsed_detail_container, "field 'collapsedContainer'", LinearLayout.class);
            t.packageTitleCollapse = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_PackageTitleCollapse, "field 'packageTitleCollapse'", TextView.class);
            t.packageDescriptionCollapse = (EditText) Utils.findRequiredViewAsType(view, R.id.txt_PackageDescriptionCollapse, "field 'packageDescriptionCollapse'", EditText.class);
            t.packageItemsRecycler = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.categoryItemsList, "field 'packageItemsRecycler'", RecyclerView.class);
            t.packageProductsContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.productsPackageContainer, "field 'packageProductsContainer'", RelativeLayout.class);
            t.moreItems = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_MoreItems, "field 'moreItems'", TextView.class);
            t.plusMark = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_PlusMark, "field 'plusMark'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, R.id.includeMoreItems, "field 'includeMoreItems' and method 'onClickShowMore'");
            t.includeMoreItems = (RelativeLayout) Utils.castView(findRequiredView, R.id.includeMoreItems, "field 'includeMoreItems'", RelativeLayout.class);
            this.view2131492952 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
                public void doClick(View view) {
                    t.onClickShowMore(view);
                }
            });
            findRequiredView = Utils.findRequiredView(view, R.id.txt_privacyPolicy, "field 'txt_privacyPolicy' and method 'onClickPrivacyPolicy'");
            t.txt_privacyPolicy = (TextView) Utils.castView(findRequiredView, R.id.txt_privacyPolicy, "field 'txt_privacyPolicy'", TextView.class);
            this.view2131493068 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
                public void doClick(View view) {
                    t.onClickPrivacyPolicy(view);
                }
            });
            findRequiredView = Utils.findRequiredView(view, R.id.txt_termsConditions, "field 'txt_termsConditions' and method 'onClickTermsConditions'");
            t.txt_termsConditions = (TextView) Utils.castView(findRequiredView, R.id.txt_termsConditions, "field 'txt_termsConditions'", TextView.class);
            this.view2131493070 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
                public void doClick(View view) {
                    t.onClickTermsConditions(view);
                }
            });
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder != null) {
                viewHolder.packageImage = null;
                viewHolder.packageDescription = null;
                viewHolder.packageTitle = null;
                viewHolder.collapsedContainer = null;
                viewHolder.packageTitleCollapse = null;
                viewHolder.packageDescriptionCollapse = null;
                viewHolder.packageItemsRecycler = null;
                viewHolder.packageProductsContainer = null;
                viewHolder.moreItems = null;
                viewHolder.plusMark = null;
                viewHolder.includeMoreItems = null;
                viewHolder.txt_privacyPolicy = null;
                viewHolder.txt_termsConditions = null;
                this.view2131492952.setOnClickListener(null);
                this.view2131492952 = null;
                this.view2131493068.setOnClickListener(null);
                this.view2131493068 = null;
                this.view2131493070.setOnClickListener(null);
                this.view2131493070 = null;
                this.target = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    PackageListRecyclerViewAdapter(Context context, PackageListInteractionListener packageListInteractionListener, PackageListViewController packageListViewController) {
        this.listener = packageListInteractionListener;
        this.viewController = packageListViewController;
        this.context = context;
        this.recycledViewPool = new RecycledViewPool();
    }

    private void layout_Views_For_Collapsed_Mode(final ViewHolder viewHolder, int i) {
        viewHolder.isExpanded = Boolean.valueOf(false);
        viewHolder.hasShownFirstFiveProducts = Boolean.valueOf(false);
        viewHolder.hasShownMoreProducts = Boolean.valueOf(false);
        this.showMoreProducts = false;
        this.moreProductsShownAtPosition = -1;
        viewHolder.txt_privacyPolicy.setVisibility(4);
        viewHolder.txt_termsConditions.setVisibility(4);
        if (viewHolder.existingConstraints != null) {
            viewHolder.moreItems.setText(R.string.show_more);
            viewHolder.plusMark.setText("+");
            viewHolder.existingConstraints.applyTo((ConstraintLayout) viewHolder.view);
        }
        viewHolder.collapsedContainer.setVisibility(0);
        viewHolder.includeMoreItems.setVisibility(8);
        viewHolder.packageDescription.setVisibility(8);
        viewHolder.packageTitle.setVisibility(8);
        viewHolder.packageItemsRecycler.setVisibility(8);
        PaymentComms.FetchImageComms(viewHolder.jagexPackage.getImageCollapsed(), new FetchImageCallback() {
            public void onFetchImageResult(CommsResult<Bitmap> commsResult, Exception exception) {
                if (commsResult.responseCode == 200 && PackageListRecyclerViewAdapter.this.context != null && commsResult != null) {
                    viewHolder.packageImage.setBackground(new BitmapDrawable(PackageListRecyclerViewAdapter.this.context.getResources(), (Bitmap) commsResult.getResultValue()));
                }
            }
        }, true);
        viewHolder.packageTitleCollapse.setText(viewHolder.jagexPackage.getName().toUpperCase());
        float f = this.context.getResources().getConfiguration().fontScale;
        viewHolder.packageDescriptionCollapse.setText(viewHolder.jagexPackage.getShortDescription());
        if (f > 1.05f) {
            f = 0.75f / f;
            viewHolder.packageTitleCollapse.setTextScaleX(f);
            viewHolder.packageDescriptionCollapse.setTextScaleX(f);
        }
        viewHolder.view.getLayoutParams().width = (int) this.context.getResources().getDimension(R.dimen.package_collapsed_width);
        viewHolder.view.getLayoutParams().height = -1;
        if (i != 0) {
            final LayoutParams layoutParams = (LayoutParams) viewHolder.view.getLayoutParams();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) this.context.getResources().getDimension(R.dimen.package_list_start_margin), 0});
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    layoutParams.setMarginStart(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    viewHolder.view.setLayoutParams(layoutParams);
                }
            });
            ofInt.setDuration((long) this.context.getResources().getInteger(R.integer.package_collapse_duration));
            ofInt.start();
        }
    }

    private void layout_Views_For_Expanded_Mode(final ViewHolder viewHolder, int i) {
        float f = this.context.getResources().getConfiguration().fontScale;
        viewHolder.collapsedContainer.setVisibility(8);
        viewHolder.packageDescription.setVisibility(0);
        viewHolder.packageTitle.setVisibility(0);
        viewHolder.txt_privacyPolicy.setVisibility(0);
        viewHolder.txt_termsConditions.setVisibility(0);
        PaymentComms.FetchImageComms(viewHolder.jagexPackage.getImageExpanded(), new FetchImageCallback() {
            public void onFetchImageResult(CommsResult<Bitmap> commsResult, Exception exception) {
                if (commsResult.responseCode == 200 && PackageListRecyclerViewAdapter.this.context != null && commsResult != null) {
                    viewHolder.packageImage.setBackground(new BitmapDrawable(PackageListRecyclerViewAdapter.this.context.getResources(), (Bitmap) commsResult.getResultValue()));
                }
            }
        }, true);
        viewHolder.packageTitle.setText(viewHolder.jagexPackage.getName().toUpperCase());
        viewHolder.packageDescription.setText(viewHolder.jagexPackage.getLongDescription());
        if (f > 1.05f) {
            viewHolder.packageTitle.setTextScaleX(0.5f / f);
            viewHolder.packageDescription.setTextScaleX(0.75f / f);
            viewHolder.packageDescription.setHeight((int) (((double) viewHolder.packageDescription.getHeight()) * 0.75d));
        }
        viewHolder.view.getLayoutParams().width = (int) this.context.getResources().getDimension(R.dimen.package_expanded_width);
        viewHolder.view.getLayoutParams().height = -1;
        if (!viewHolder.isExpanded.booleanValue()) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, this.pivotX, 1, this.pivotY);
            scaleAnimation.setInterpolator(new LinearInterpolator());
            scaleAnimation.setFillAfter(false);
            scaleAnimation.setDuration((long) this.context.getResources().getInteger(R.integer.expand_duration));
            viewHolder.view.setAnimation(scaleAnimation);
        }
        ConstraintLayout constraintLayout;
        if (!viewHolder.isExpanded.booleanValue() && this.packageExpandedAtPosition == i && !viewHolder.hasShownFirstFiveProducts.booleanValue()) {
            loadProductsAdapter(viewHolder, i);
        } else if (!viewHolder.isExpanded.booleanValue() && !viewHolder.hasShownFirstFiveProducts.booleanValue()) {
            loadProductsAdapter(viewHolder, i);
        } else if (this.showMoreProducts && i == this.moreProductsShownAtPosition) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintLayout = (ConstraintLayout) viewHolder.view;
            constraintSet.clone(constraintLayout);
            viewHolder.existingConstraints.clone(constraintLayout);
            constraintSet.clear(R.id.txt_PackageTitle, 3);
            constraintSet.clear(R.id.txt_PackageDescription, 3);
            constraintSet.clear(R.id.productsPackageContainer, 3);
            constraintSet.connect(R.id.txt_PackageTitle, 4, 0, 3);
            constraintSet.connect(R.id.txt_PackageDescription, 4, 0, 3);
            constraintSet.connect(R.id.productsPackageContainer, 3, 0, 3);
            constraintSet.setMargin(R.id.txt_PackageDescription, 4, 50);
            constraintSet.setMargin(R.id.productsPackageContainer, 3, (int) this.context.getResources().getDimension(R.dimen.show_more_products_top_margin_expanded));
            constraintSet.constrainHeight(R.id.productsPackageContainer, -2);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setInterpolator(new BounceInterpolator());
            changeBounds.setDuration((long) this.context.getResources().getInteger(R.integer.show_more_products_duration));
            TransitionManager.beginDelayedTransition(constraintLayout, changeBounds);
            constraintSet.applyTo(constraintLayout);
            viewHolder.moreItems.setText(R.string.show_less);
            viewHolder.plusMark.setText("-");
            viewHolder.hasShownMoreProducts = Boolean.valueOf(true);
        } else if (viewHolder.hasShownMoreProducts.booleanValue()) {
            constraintLayout = (ConstraintLayout) viewHolder.view;
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds2.setInterpolator(new BounceInterpolator());
            changeBounds2.setDuration((long) this.context.getResources().getInteger(R.integer.show_more_products_duration));
            TransitionManager.beginDelayedTransition(constraintLayout, changeBounds2);
            viewHolder.existingConstraints.applyTo(constraintLayout);
            viewHolder.moreItems.setText(R.string.show_more);
            viewHolder.plusMark.setText("+");
            viewHolder.hasShownMoreProducts = Boolean.valueOf(false);
        }
        viewHolder.isExpanded = Boolean.valueOf(true);
    }

    private void loadProductsAdapter(ViewHolder viewHolder, int i) {
        if (viewHolder.jagexPackage.getProducts().size() > 3) {
            viewHolder.includeMoreItems.setVisibility(0);
            viewHolder.includeMoreItems.setTag(Integer.valueOf(i));
        } else {
            viewHolder.includeMoreItems.setVisibility(8);
        }
        NonScrollingLayoutManager nonScrollingLayoutManager = new NonScrollingLayoutManager(this.context, 3);
        nonScrollingLayoutManager.setItemPrefetchEnabled(true);
        nonScrollingLayoutManager.setInitialPrefetchItemCount(8);
        viewHolder.packageItemsRecycler.setLayoutManager(nonScrollingLayoutManager);
        viewHolder.itemsAdapter = new PackageItemsRecyclerViewAdapter(viewHolder.jagexPackage, this.listener, this.viewController, this.context);
        viewHolder.packageItemsRecycler.setOverScrollMode(2);
        viewHolder.packageItemsRecycler.setRecycledViewPool(this.recycledViewPool);
        viewHolder.packageItemsRecycler.setHasFixedSize(true);
        viewHolder.packageItemsRecycler.setItemViewCacheSize(8);
        viewHolder.packageItemsRecycler.setNestedScrollingEnabled(false);
        viewHolder.packageItemsRecycler.setAdapter(viewHolder.itemsAdapter);
        viewHolder.packageItemsRecycler.setVisibility(0);
        viewHolder.hasShownFirstFiveProducts = Boolean.valueOf(true);
    }

    public void filterPackage(int i) {
        ArrayList arrayList = new ArrayList();
        for (JagexPackage jagexPackage : this.jagexPackages) {
            if ((jagexPackage.getCategoryID() & i) != 0) {
                arrayList.add(jagexPackage);
            }
        }
        if (arrayList.size() > 0) {
            setPackages(arrayList);
        }
    }

    public int getItemCount() {
        return this.jagexPackages.size();
    }

    public long getItemId(int i) {
        return (long) ((JagexPackage) this.jagexPackages.get(i)).hashCode();
    }

    public int getPositionForPackageID(int i) {
        Iterator it = this.jagexPackages.iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return -1;
            }
            if (((JagexPackage) it.next()).getCategoryID() == i) {
                return i3;
            }
            i2 = i3 + 1;
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.jagexPackage = (JagexPackage) this.jagexPackages.get(i);
        if (i == 0) {
            if (this.jagexPackages.size() > 1) {
                ((LayoutParams) viewHolder.view.getLayoutParams()).setMarginStart((int) this.context.getResources().getDimension(R.dimen.package_list_start_margin));
            }
        } else if (i == this.jagexPackages.size() - 1) {
            ((LayoutParams) viewHolder.view.getLayoutParams()).setMarginEnd((int) this.context.getResources().getDimension(R.dimen.package_list_end_margin));
        } else {
            LayoutParams layoutParams = (LayoutParams) viewHolder.view.getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(0);
        }
        if (this.isPackageViewCollapsedMode) {
            layout_Views_For_Collapsed_Mode(viewHolder, i);
        } else {
            layout_Views_For_Expanded_Mode(viewHolder, i);
        }
        viewHolder.view.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (PackageListRecyclerViewAdapter.this.isPackageViewCollapsedMode) {
                    PackageListRecyclerViewAdapter.this.isPackageViewCollapsedMode = PackageListRecyclerViewAdapter.this.isPackageViewCollapsedMode ^ 1;
                    PackageListRecyclerViewAdapter.this.packageExpandedAtPosition = i;
                    PackageListRecyclerViewAdapter.this.listener.setPackageExpandCollapseDetails(PackageListRecyclerViewAdapter.this.isPackageViewCollapsedMode, i);
                }
            }
        });
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.package_expand_collapsed, viewGroup, false));
    }

    /* Access modifiers changed, original: 0000 */
    public void setExpandCollapseMode(boolean z) {
        this.isPackageViewCollapsedMode = z;
        this.moreProductsShownAtPosition = -1;
    }

    /* Access modifiers changed, original: 0000 */
    public void setExpandedPosition(int i) {
        this.packageExpandedAtPosition = i;
    }

    /* Access modifiers changed, original: 0000 */
    public void setPackages(List<JagexPackage> list) {
        this.jagexPackages.clear();
        this.jagexPackages.addAll(list);
    }

    /* Access modifiers changed, original: 0000 */
    public void setPivotX(float f) {
        this.pivotX = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void setPivotY(float f) {
        this.pivotY = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void showMorePackages(boolean z, int i) {
        this.showMoreProducts = z;
        if (!z) {
            i = -1;
        }
        this.moreProductsShownAtPosition = i;
    }
}
