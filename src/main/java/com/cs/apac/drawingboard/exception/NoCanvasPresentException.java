package com.cs.apac.drawingboard.exception;

/**
 * Class is custom created exception which will be used for throwing the
 * meaningful exception. In this case we use it to tell that Canvas is not
 * created.
 *
 * @author ameyjadiye
 *
 */
public class NoCanvasPresentException extends Exception {

    /**
     * Constructor for {@link NoCanvasPresentException}.
     * @param message - message to pass to user on console.
     */
    public NoCanvasPresentException(String message) {
        super(message);
    }

}
