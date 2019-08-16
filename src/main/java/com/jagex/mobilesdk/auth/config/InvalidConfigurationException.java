package com.jagex.mobilesdk.auth.config;

public final class InvalidConfigurationException extends RuntimeException {
    public InvalidConfigurationException(String str) {
        super(str);
    }

    public InvalidConfigurationException(String str, Throwable th) {
        super(str, th);
    }
}
