package com.cs.apac.drawingboard.operation;

import java.io.Serializable;

import com.cs.apac.drawingboard.entity.holder.Canvas;

public abstract class BaseOperation implements Operation, Serializable {

    private Canvas canvas;

    /**
     * @return the canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * @param canvas the canvas to set
     */
    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
    
    
    
}
