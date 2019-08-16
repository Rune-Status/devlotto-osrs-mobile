package com.google.firebase;

import com.google.firebase.annotations.PublicApi;

@PublicApi
public class FirebaseTooManyRequestsException extends FirebaseException {
    @PublicApi
    public FirebaseTooManyRequestsException(String str) {
        super(str);
    }
}
