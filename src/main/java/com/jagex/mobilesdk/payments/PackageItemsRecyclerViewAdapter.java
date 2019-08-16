package com.jagex.mobilesdk.payments;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.billingclient.api.BillingClient.SkuType;
import com.jagex.mobilesdk.R;
import com.jagex.mobilesdk.payments.model.JagexPackage;
import com.jagex.mobilesdk.payments.model.JagexProducts;
import com.jagex.mobilesdk.payments.utils.PackageListInteractionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class PackageItemsRecyclerViewAdapter extends Adapter<android.support.v7.widget.RecyclerView.ViewHolder> {
    private static final int PRODUCT_TITLE_LENGTH_THRESHOLD = 4;
    private final float FONT_SCALE_THRESHOLD = 1.05f;
    private final float PACKAGE_ITEMS_FONT_SCALE = 1.0f;
    private final float PRICE_DIVISOR = 1000000.0f;
    private final Context context;
    private final float fontScale;
    private final PackageListInteractionListener listener;
    private float maximumPricePerUnit;
    private final List<JagexProducts> products = new ArrayList();
    private final int shopCategory;
    private final PackageListViewController viewController;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @BindView(2131493057)
        TextView itemPrice;
        JagexProducts jagexProducts;
        @BindView(2131493058)
        TextView originalPrice;
        @BindView(2131492902)
        RelativeLayout purchaseButton;
        @BindView(2131492903)
        TextView purchaseButtonText;
        @BindView(2131492951)
        ImageView recommended;
        @BindView(2131493069)
        TextView savings;
        int shopCategory;
        @BindView(2131493063)
        TextView subTitle;
        @BindView(2131493064)
        TextView title;
        @BindView(2131493059)
        TextView trialOffer;
        public final View view;

        ViewHolder(View view) {
            super(view);
            this.view = view;
            ButterKnife.bind((Object) this, view);
        }

        public void resetHolderTextViews() {
            this.savings.setText("");
            this.originalPrice.setText("");
            this.trialOffer.setText("");
            this.title.setText("");
            this.subTitle.setText("");
            this.itemPrice.setText("");
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {
        protected T target;

        @UiThread
        public ViewHolder_ViewBinding(T t, View view) {
            this.target = t;
            t.title = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_PackageItemTitle, "field 'title'", TextView.class);
            t.subTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_PackageItemSubTitle, "field 'subTitle'", TextView.class);
            t.itemPrice = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_ItemPrice, "field 'itemPrice'", TextView.class);
            t.recommended = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_Recommended, "field 'recommended'", ImageView.class);
            t.purchaseButton = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.btn_Purchase, "field 'purchaseButton'", RelativeLayout.class);
            t.purchaseButtonText = (TextView) Utils.findRequiredViewAsType(view, R.id.btn_PurchaseText, "field 'purchaseButtonText'", TextView.class);
            t.savings = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_savings, "field 'savings'", TextView.class);
            t.originalPrice = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_ItemPriceOriginal, "field 'originalPrice'", TextView.class);
            t.trialOffer = (TextView) Utils.findRequiredViewAsType(view, R.id.txt_ItemTrial, "field 'trialOffer'", TextView.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder != null) {
                viewHolder.title = null;
                viewHolder.subTitle = null;
                viewHolder.itemPrice = null;
                viewHolder.recommended = null;
                viewHolder.purchaseButton = null;
                viewHolder.purchaseButtonText = null;
                viewHolder.savings = null;
                viewHolder.originalPrice = null;
                viewHolder.trialOffer = null;
                this.target = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    PackageItemsRecyclerViewAdapter(JagexPackage jagexPackage, PackageListInteractionListener packageListInteractionListener, PackageListViewController packageListViewController, Context context) {
        this.shopCategory = jagexPackage.getCategoryID();
        for (JagexProducts jagexProducts : jagexPackage.getProducts()) {
            if (jagexProducts.getSkuItem() != null) {
                this.products.add(jagexProducts);
            }
        }
        this.maximumPricePerUnit = 0.0f;
        for (JagexProducts jagexProducts2 : this.products) {
            if (TextUtils.isDigitsOnly(jagexProducts2.getTitle())) {
                float parseFloat = Float.parseFloat(jagexProducts2.getTitle());
                if (0.0f != parseFloat) {
                    float priceAmountMicros = (((float) jagexProducts2.getSkuItem().getPriceAmountMicros()) / 1000000.0f) / parseFloat;
                    if (priceAmountMicros > this.maximumPricePerUnit) {
                        this.maximumPricePerUnit = priceAmountMicros;
                    }
                }
            }
        }
        this.listener = packageListInteractionListener;
        this.viewController = packageListViewController;
        this.context = context;
        Configuration configuration = this.context.getResources().getConfiguration();
        if (configuration.fontScale > 1.05f) {
            this.fontScale = 1.0f / configuration.fontScale;
        } else {
            this.fontScale = configuration.fontScale;
        }
    }

    private String getCurrencySymbol(String str) {
        try {
            return Currency.getInstance(str).getSymbol();
        } catch (Exception e) {
            return str;
        }
    }

    public int getItemCount() {
        return this.products.size();
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int i) {
        StringBuilder stringBuilder;
        final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        Resources resources = this.context.getResources();
        viewHolder2.resetHolderTextViews();
        viewHolder2.shopCategory = this.shopCategory;
        viewHolder2.jagexProducts = (JagexProducts) this.products.get(i);
        if (viewHolder2.jagexProducts.getTitle().length() > 4) {
            viewHolder2.title.setTextSize(0, (float) ((int) this.context.getResources().getDimension(R.dimen.package_item_keys_title_size)));
            viewHolder2.subTitle.setTextSize(0, (float) ((int) this.context.getResources().getDimension(R.dimen.package_item_keys_sub_title_size)));
        } else {
            viewHolder2.title.setTextSize(0, (float) ((int) this.context.getResources().getDimension(R.dimen.package_item_title_size)));
            viewHolder2.subTitle.setTextSize(0, (float) ((int) this.context.getResources().getDimension(R.dimen.package_item_sub_title_size)));
        }
        viewHolder2.title.setText(viewHolder2.jagexProducts.getTitle().toUpperCase());
        viewHolder2.subTitle.setText(viewHolder2.jagexProducts.getSubtitle().toUpperCase());
        viewHolder2.itemPrice.setText(viewHolder2.jagexProducts.getSkuItem().getPrice());
        viewHolder2.title.setTextScaleX(this.fontScale);
        viewHolder2.subTitle.setTextScaleX(this.fontScale);
        viewHolder2.itemPrice.setTextScaleX(this.fontScale);
        if (viewHolder2.jagexProducts.isRecommended()) {
            viewHolder2.recommended.setVisibility(0);
        } else {
            viewHolder2.recommended.setVisibility(8);
        }
        viewHolder2.view.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (PackageItemsRecyclerViewAdapter.this.listener != null) {
                    PackageItemsRecyclerViewAdapter.this.listener.purchaseProduct(viewHolder2.jagexProducts.getSkuItem());
                }
            }
        });
        float priceAmountMicros = ((float) viewHolder2.jagexProducts.getSkuItem().getPriceAmountMicros()) / 1000000.0f;
        float f = 0.0f;
        if (TextUtils.isDigitsOnly(viewHolder2.jagexProducts.getTitle())) {
            f = Float.parseFloat(viewHolder2.jagexProducts.getTitle());
        }
        if (viewHolder2.jagexProducts.getSkuItem().getType().equals(SkuType.SUBS)) {
            String freeTrialPeriod;
            String substring;
            if (!viewHolder2.jagexProducts.getSkuItem().getFreeTrialPeriod().isEmpty() && this.viewController.eligibleForTrialPurchase()) {
                viewHolder2.purchaseButtonText.setText(R.string.SUBS_TRIAL_BUTTON_TEXT);
                freeTrialPeriod = viewHolder2.jagexProducts.getSkuItem().getFreeTrialPeriod();
                CharSequence charSequence = "";
                if (freeTrialPeriod.length() >= 3) {
                    substring = freeTrialPeriod.substring(1, freeTrialPeriod.length() - 1);
                    int parseInt = Integer.parseInt(substring);
                    if (freeTrialPeriod.startsWith("P")) {
                        if (freeTrialPeriod.endsWith("D")) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(" + ");
                            stringBuilder.append(substring);
                            stringBuilder.append(" ");
                            stringBuilder.append(resources.getString(parseInt > 1 ? R.string.SHOP_DAYS_TRIAL : R.string.SHOP_DAY_TRIAL));
                            stringBuilder.append(" ");
                            charSequence = stringBuilder.toString();
                        } else if (freeTrialPeriod.endsWith("W")) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(" + ");
                            stringBuilder.append(substring);
                            stringBuilder.append(" ");
                            stringBuilder.append(resources.getString(parseInt > 1 ? R.string.SHOP_WEEKS_TRIAL : R.string.SHOP_WEEK_TRIAL));
                            stringBuilder.append(" ");
                            charSequence = stringBuilder.toString();
                        } else if (freeTrialPeriod.endsWith("M")) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(" + ");
                            stringBuilder.append(substring);
                            stringBuilder.append(" ");
                            stringBuilder.append(resources.getString(parseInt > 1 ? R.string.SHOP_MONTHS_TRIAL : R.string.SHOP_MONTH_TRIAL));
                            stringBuilder.append(" ");
                            charSequence = stringBuilder.toString();
                        }
                    }
                }
                viewHolder2.trialOffer.setText(charSequence);
                viewHolder2.trialOffer.setVisibility(0);
                viewHolder2.trialOffer.setTextScaleX(this.fontScale);
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            viewHolder2.originalPrice.setVisibility(4);
            if (f > 1.0f) {
                String format = decimalFormat.format((double) (priceAmountMicros / f));
                freeTrialPeriod = getCurrencySymbol(viewHolder2.jagexProducts.getSkuItem().getPriceCurrencyCode());
                substring = resources.getString(R.string.PER_MONTH);
                TextView textView = viewHolder2.originalPrice;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(freeTrialPeriod);
                stringBuilder2.append(format);
                stringBuilder2.append(" ");
                stringBuilder2.append(substring);
                textView.setText(stringBuilder2.toString());
                viewHolder2.originalPrice.setVisibility(0);
                viewHolder2.originalPrice.setTextScaleX(this.fontScale);
            }
        }
        viewHolder2.savings.setVisibility(4);
        viewHolder2.savings.setText("");
        if (viewHolder2.shopCategory != 1) {
            viewHolder2.savings.setVisibility(0);
            f *= this.maximumPricePerUnit;
            if (f > priceAmountMicros && ((double) f) > 0.0d) {
                f = (f - priceAmountMicros) / f;
                NumberFormat percentInstance = NumberFormat.getPercentInstance();
                percentInstance.setMinimumFractionDigits(0);
                String string = resources.getString(R.string.SAVE);
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(" ");
                stringBuilder.append(percentInstance.format((double) f));
                viewHolder2.savings.setText(stringBuilder.toString());
                viewHolder2.savings.setVisibility(0);
                viewHolder2.savings.setTextScaleX(this.fontScale);
            }
        }
        if (!viewHolder2.jagexProducts.getSkuItem().getIntroductoryPrice().isEmpty() && this.viewController.eligibleForIntroductoryPrice()) {
            String string2 = resources.getString(R.string.SHOP_NORMALLY);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append(" ");
            stringBuilder3.append(viewHolder2.jagexProducts.getSkuItem().getPrice());
            string2 = stringBuilder3.toString();
            viewHolder2.itemPrice.setText(viewHolder2.jagexProducts.getSkuItem().getIntroductoryPrice());
            viewHolder2.originalPrice.setText(string2);
            viewHolder2.originalPrice.setTextColor(resources.getColor(R.color.lemon_yellow));
            viewHolder2.originalPrice.setVisibility(0);
            viewHolder2.originalPrice.setTextScaleX(this.fontScale);
        }
        if (!viewHolder2.jagexProducts.isAvailable()) {
            viewHolder2.purchaseButton.setBackgroundColor(-12303292);
            Builder builder = new Builder(this.context);
            builder.setTitle(R.string.PRODUCT_UNAVAILABLE).setMessage(R.string.INAPP_UNAVAILABLE_MESSAGE).setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            if (viewHolder2.jagexProducts.getSkuItem().getType().equals(SkuType.SUBS)) {
                builder.setMessage(R.string.SUBS_UNAVAILABLE_MESSAGE);
            }
            final AlertDialog create = builder.create();
            viewHolder2.view.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    create.show();
                }
            });
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.package_item, viewGroup, false));
    }
}
