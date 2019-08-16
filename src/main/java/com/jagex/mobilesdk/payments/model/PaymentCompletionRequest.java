package com.jagex.mobilesdk.payments.model;

public class PaymentCompletionRequest {
    private final PaymentPayload payload;

    public static class PaymentPayload {
        private final String purchaseData;
        private final String signature;
        private final String skuType;

        public PaymentPayload(String str, String str2, String str3) {
            this.purchaseData = str;
            this.signature = str2;
            this.skuType = str3;
        }

        public String getPurchaseData() {
            return this.purchaseData;
        }

        public String getSignature() {
            return this.signature;
        }

        public String getSkuType() {
            return this.skuType;
        }
    }

    public PaymentCompletionRequest(PaymentPayload paymentPayload) {
        this.payload = paymentPayload;
    }

    public PaymentPayload getPayload() {
        return this.payload;
    }
}
