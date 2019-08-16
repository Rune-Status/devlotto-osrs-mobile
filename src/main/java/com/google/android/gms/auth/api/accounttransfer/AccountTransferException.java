package com.google.android.gms.auth.api.accounttransfer;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

public class AccountTransferException extends ApiException {
    public AccountTransferException(@NonNull Status status) {
        super(status);
    }
}
