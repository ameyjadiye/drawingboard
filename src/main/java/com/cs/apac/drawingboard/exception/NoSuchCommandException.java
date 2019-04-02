package com.cs.apac.drawingboard.exception;

import com.cs.apac.drawingboard.util.Command;

/**
 * Class is custom created exception which will be used for throwing the
 * meaningful exception. In this case we use it to tell that {@link Command}
 * entered by user is not present in system.
 *
 * @author ameyjadiye
 *
 */

public class NoSuchCommandException extends IllegalArgumentException {

    private static final long serialVersionUID = -2361587181899529084L;

    /**
     * Constructor for {@link NoCanvasPresentException}.
     */
    public NoSuchCommandException() {
        super();
    }

    /**
     * Constructor for {@link NoCanvasPresentException}.
     * @param message - message to pass to user on console.
     */
    public NoSuchCommandException(String message) {
        super(message);
    }
}
