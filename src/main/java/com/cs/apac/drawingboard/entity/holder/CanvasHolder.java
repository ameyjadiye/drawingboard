package com.cs.apac.drawingboard.entity.holder;

import com.cs.apac.drawingboard.operation.CreateOperation;
import com.cs.apac.drawingboard.operation.Operation;

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

    public void action() {
        operation.execute();
        
        if (this.operation instanceof CreateOperation) {
            CreateOperation opt = (CreateOperation)operation;
            this.canvas = opt.getCanvas();
        }
    }
}
