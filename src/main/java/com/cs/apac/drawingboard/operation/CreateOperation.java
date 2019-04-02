package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;

/**
 * Interface for all the create operations.
 *
 * @author ameyjadiye
 *
 */
public interface CreateOperation extends Operation {

    /**
     * For creating the canvas.
     */
    void createCanvas();

    /**
     * For getting created canvas.
     * @return returns existing canvas
     */
    Canvas getCanvas();

}
