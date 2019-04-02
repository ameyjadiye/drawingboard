package com.cs.apac.drawingboard.entity.holder;

import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.operation.CreateOperation;
import com.cs.apac.drawingboard.operation.Operation;
import com.cs.apac.drawingboard.operation.QuitOperation;

/**
 * A simple stand which holds the Canvas. :-) This class is just a middle agent
 * between service and operations.
 * @author ameyjadiye
 *
 */
public class CanvasHolder {

    /**
     * Instance of the {@link Canvas} class.
     */
    private Canvas canvas;
    /**
     * Instance of the operation which going to be carried out.
     */
    private Operation operation;

    /**
     * @return the canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * Setter class for operation.
     * @param operation opearion.
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * Action method is just like a trigger point to execue the action.
     * @throws NoCanvasPresentException if the canvas is not ready.
     */
    public void action() throws NoCanvasPresentException {

        if (!(this.operation instanceof CreateOperation || this.operation instanceof QuitOperation) && canvas == null) {
            throw new NoCanvasPresentException("Please create canvas first");
        }

        operation.execute();

        if (this.operation instanceof CreateOperation) {
            CreateOperation opt = (CreateOperation) operation;
            this.canvas = opt.getCanvas();
        }

    }
}
