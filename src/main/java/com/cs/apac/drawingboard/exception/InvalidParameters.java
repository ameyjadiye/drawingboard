package com.cs.apac.drawingboard.exception;

public class InvalidParameters extends Exception {

    public InvalidParameters() {
        super();
    }

    public InvalidParameters(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public InvalidParameters(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParameters(String message) {
        super(message);
    }

    public InvalidParameters(Throwable cause) {
        super(cause);
    }

}
