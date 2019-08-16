package com.jagex.mobilesdk.payments.comms;

import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import com.jagex.mobilesdk.payments.comms.CompletePaymentComms.CompletePaymentCallback;
import com.jagex.mobilesdk.payments.comms.FetchImageComms.FetchImageCallback;
import com.jagex.mobilesdk.payments.comms.FetchPackagesComms.FetchPackagesCallback;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import java.util.HashMap;
import java.util.Locale;

public class PaymentComms {
    public static void FetchImageComms(String str, FetchImageCallback fetchImageCallback, boolean z) {
        FetchImageComms fetchImageComms = new FetchImageComms(str, fetchImageCallback);
        if (z) {
            fetchImageComms.execute(new Void[0]);
        } else {
            fetchImageComms.fetchImagePostAction(fetchImageComms.fetchImageAction(str), fetchImageCallback);
        }
    }

    public static void completePaymentsComms(String str, MobileAuthState mobileAuthState, PaymentCompletionRequest paymentCompletionRequest, CompletePaymentCallback completePaymentCallback, boolean z) {
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(mobileAuthState.getAccessToken());
        hashMap.put(CommsUtils.HTTP_HEADER_AUTHORIZATION, stringBuilder.toString());
        hashMap.put(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
        CompletePaymentComms completePaymentComms = new CompletePaymentComms(str, hashMap, paymentCompletionRequest, completePaymentCallback);
        if (z) {
            completePaymentComms.execute(new Void[0]);
        } else {
            completePaymentComms.completePaymentPostAction(completePaymentComms.completePaymentAction(str, hashMap, paymentCompletionRequest), completePaymentCallback);
        }
    }

    public static void fetchPackagesComms(String str, MobileAuthState mobileAuthState, float f, FetchPackagesCallback fetchPackagesCallback, boolean z) {
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(mobileAuthState.getAccessToken());
        hashMap.put(CommsUtils.HTTP_HEADER_AUTHORIZATION, stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append(f);
        stringBuilder.append(",d=android");
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT_RESOLUTION, stringBuilder.toString());
        hashMap.put(CommsUtils.HTTP_HEADER_ACCEPT_LANGUAGE, Locale.getDefault().getLanguage());
        FetchPackagesComms fetchPackagesComms = new FetchPackagesComms(str, hashMap, fetchPackagesCallback);
        if (z) {
            fetchPackagesComms.execute(new Void[0]);
        } else {
            fetchPackagesComms.fetchPackagesPostAction(fetchPackagesComms.fetchPackagesAction(str, hashMap), fetchPackagesCallback);
        }
    }
}
