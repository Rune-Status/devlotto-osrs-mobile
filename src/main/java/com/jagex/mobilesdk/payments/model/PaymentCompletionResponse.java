package com.jagex.mobilesdk.payments.model;

public class PaymentCompletionResponse {
    private String purchaseProductId;
    private CompletionStatus status;

    public String getPurchaseProductId() {
        return this.purchaseProductId;
    }

    public CompletionStatus getStatus() {
        return this.status;
    }

    public void setPurchaseProductId(String str) {
        this.purchaseProductId = str;
    }

    public void setStatus(CompletionStatus completionStatus) {
        this.status = completionStatus;
    }
}
