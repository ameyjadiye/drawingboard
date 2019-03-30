package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;

public interface CreateOperation extends Operation {
    
    public void createCanvas();
    
    public Canvas getCanvas();

}
