package com.cs.apac.drawingboard.entity.holder;

import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.operation.CreateOperation;
import com.cs.apac.drawingboard.operation.Operation;
import com.cs.apac.drawingboard.operation.QuitOperation;

public class CanvasHolder {

    private Canvas canvas;
    private Operation operation;

    /**
     * @return the canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
        
    }

    public void action() throws NoCanvasPresentException {
        
        if (!(this.operation instanceof CreateOperation || this.operation instanceof QuitOperation) && canvas == null) {
            throw new NoCanvasPresentException("Please create canvas first");
        }
        
        
        operation.execute();
        
        if (this.operation instanceof CreateOperation) {
            CreateOperation opt = (CreateOperation)operation;
            this.canvas = opt.getCanvas();
        }
        
    }
}
