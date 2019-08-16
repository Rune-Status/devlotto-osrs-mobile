package com.google.firebase.messaging;

import java.util.Locale;

public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    SendException(String str) {
        int i = 3;
        super(str);
        if (str != null) {
            String toLowerCase = str.toLowerCase(Locale.US);
            int i2 = -1;
            switch (toLowerCase.hashCode()) {
                case -1743242157:
                    if (toLowerCase.equals("service_not_available")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case -1290953729:
                    if (toLowerCase.equals("toomanymessages")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case -920906446:
                    if (toLowerCase.equals("invalid_parameters")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case -617027085:
                    if (toLowerCase.equals("messagetoobig")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case -95047692:
                    if (toLowerCase.equals("missing_to")) {
                        i2 = 1;
                        break;
                    }
                    break;
            }
            switch (i2) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    break;
                case 4:
                    i = 4;
                    break;
            }
        }
        i = 0;
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
