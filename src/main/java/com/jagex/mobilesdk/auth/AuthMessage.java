package com.jagex.mobilesdk.auth;

public enum AuthMessage {
    GENERIC_ERROR("An error occurred."),
    GENERIC_AUTH_ERROR("An error occurred trying to authorize the user."),
    GENERIC_ACCOUNT_CREATION_ERROR("An error occured trying to create an account."),
    NOT_AUTHORIZED("Tried to perform a action without being authorized."),
    BAD_REQUEST_URL("An error occurred trying to build a request URL"),
    ACTION_AUTH_ERROR("An error occurred trying to perform an action with fresh tokens."),
    HTTP_RESPONSE_NOT_OK("The following HTTP response was not OK: "),
    STORE_TOKENS_ERROR("The supplied tokens were invalid."),
    JAGEX_ACCESS_ERROR("An error occurred when making a request to a Jagex endpoint."),
    PENDING_TRANSACTION_ERROR("A pending transaction is available"),
    GENERIC_ACTIVITY_CANCELLED("User stopped interaction with the activity."),
    FEDERATED_LOGIN_AUTH_ERROR("There was an issue with the request to Google."),
    FEDERATED_LOGIN_ACTIVITY_ERROR("Unknown activity error code received from Google.");
    
    private final String message;

    private AuthMessage(String str) {
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }
}
