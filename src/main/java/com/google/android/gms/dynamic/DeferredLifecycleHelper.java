package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import java.util.LinkedList;

@KeepForSdk
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    private T zare;
    private Bundle zarf;
    private LinkedList<zaa> zarg;
    private final OnDelegateCreatedListener<T> zarh = new zaa(this);

    private interface zaa {
        int getState();

        void zaa(LifecycleDelegate lifecycleDelegate);
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String errorMessage = ConnectionErrorMessages.getErrorMessage(context, isGooglePlayServicesAvailable);
        String errorDialogButtonMessage = ConnectionErrorMessages.getErrorDialogButtonMessage(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(errorMessage);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(errorDialogButtonMessage);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, errorResolutionIntent));
        }
    }

    private final void zaa(Bundle bundle, zaa zaa) {
        if (this.zare != null) {
            zaa.zaa(this.zare);
            return;
        }
        if (this.zarg == null) {
            this.zarg = new LinkedList();
        }
        this.zarg.add(zaa);
        if (bundle != null) {
            if (this.zarf == null) {
                this.zarf = (Bundle) bundle.clone();
            } else {
                this.zarf.putAll(bundle);
            }
        }
        createDelegate(this.zarh);
    }

    private final void zal(int i) {
        while (!this.zarg.isEmpty() && ((zaa) this.zarg.getLast()).getState() >= i) {
            this.zarg.removeLast();
        }
    }

    @KeepForSdk
    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @KeepForSdk
    public T getDelegate() {
        return this.zare;
    }

    /* Access modifiers changed, original: protected */
    @KeepForSdk
    public void handleGooglePlayUnavailable(FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public void onCreate(Bundle bundle) {
        zaa(bundle, new zac(this, bundle));
    }

    @KeepForSdk
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        zaa(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zare == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        if (this.zare != null) {
            this.zare.onDestroy();
        } else {
            zal(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        if (this.zare != null) {
            this.zare.onDestroyView();
        } else {
            zal(2);
        }
    }

    @KeepForSdk
    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        zaa(bundle2, new zab(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        if (this.zare != null) {
            this.zare.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        if (this.zare != null) {
            this.zare.onPause();
        } else {
            zal(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        zaa(null, new zag(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(Bundle bundle) {
        if (this.zare != null) {
            this.zare.onSaveInstanceState(bundle);
        } else if (this.zarf != null) {
            bundle.putAll(this.zarf);
        }
    }

    @KeepForSdk
    public void onStart() {
        zaa(null, new zaf(this));
    }

    @KeepForSdk
    public void onStop() {
        if (this.zare != null) {
            this.zare.onStop();
        } else {
            zal(4);
        }
    }
}
