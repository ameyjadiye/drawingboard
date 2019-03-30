package com.cs.apac.drawingboard.exception;

public class NoSuchCommandException extends IllegalArgumentException {

    
    private static final long serialVersionUID = -2361587181899529084L;

    public NoSuchCommandException() {
        super();
    }

    public NoSuchCommandException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchCommandException(String s) {
        super(s);
    }

    public NoSuchCommandException(Throwable cause) {
        super(cause);
    }
}
