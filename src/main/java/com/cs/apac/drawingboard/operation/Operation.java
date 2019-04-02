package com.cs.apac.drawingboard.operation;

/**
 * Interface for all the operations carriedout.
 * @author ameyjadiye
 */
public interface Operation {

    /**
     * Heart of Command pattern implementation. this method exeutes the operation on
     * given object.
     */
    void execute();

}
