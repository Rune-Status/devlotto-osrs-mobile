package com.jagex.mobilesdk.common.comms;

public class CommsResult<T> {
    public static final int RESULT_ACCOUNT_CREATION_ERROR = 1406;
    public static final int RESULT_AUTH_ERROR = 1401;
    public static final int RESULT_CANCELLED = 1402;
    public static final int RESULT_JAGEX_ACCESS_ERROR = 1403;
    public static final int RESULT_NOT_AUTHORIZED = 1404;
    public static final int RESULT_PENDING_TRANSACTIONS_AVAILABLE = 1407;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_UNKNOWN_ERROR = -1;
    public int responseCode;
    private T resultValue;

    public CommsResult(T t, int i) {
        this.resultValue = t;
        this.responseCode = i;
    }

    public T getResultValue() {
        return this.resultValue;
    }
}
