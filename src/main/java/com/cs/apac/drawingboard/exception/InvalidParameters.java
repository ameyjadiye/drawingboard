package com.cs.apac.drawingboard.exception;

/**
 * Class is custom created exception which will be used for throwing the
 * meaningful exception. In this case we use it to tell that parameter provided
 * are Invalid.
 *
 * @author ameyjadiye
 *
 */
public class InvalidParameters extends Exception {

    /**
     * Constructor for {@link InvalidParameters}.
     * @param message - message to pass to user on console.
     */
    public InvalidParameters(String message) {
        super(message);
    }

}
