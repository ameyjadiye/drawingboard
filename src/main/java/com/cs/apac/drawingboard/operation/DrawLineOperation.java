package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.util.Command;

public class DrawLineOperation extends DrawShapeOperation implements DrawOperation {

    public DrawLineOperation(Command command , Canvas canvas) {
        this.setCanvas(canvas);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
    }

}
