package com.cs.apac.drawingboard.exception;

public class NoCanvasPresentException extends Exception {

    public NoCanvasPresentException() {
        super();
    }

    public NoCanvasPresentException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NoCanvasPresentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoCanvasPresentException(String message) {
        super(message);
    }

    public NoCanvasPresentException(Throwable cause) {
        super(cause);
    }

}
