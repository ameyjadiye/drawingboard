package com.cs.apac.drawingboard.service;

import com.cs.apac.drawingboard.exception.InvalidParameters;
import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.util.Command;

/**
 * Service layer interface which carries the {@link Command}s to Canvas by applying
 * appropriate operations.
 *
 * @author ameyjadiye
 *
 */
public interface DrawingService {
    /**
     * Method for executing the commands on Canvas.
     *
     * @param comamnd - command being carried out.
     * @throws InvalidParameters exception if Parameters are not valid.
     * @throws NoCanvasPresentException exception if Canvas is not ready.
     */
    void executeCommand(Command comamnd) throws InvalidParameters, NoCanvasPresentException;

}
