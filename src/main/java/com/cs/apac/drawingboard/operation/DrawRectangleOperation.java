package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.util.Command;

public class DrawRectangleOperation extends DrawLineOperation implements DrawOperation {

    public DrawRectangleOperation(Command command, Canvas canvas) {
        super(command, canvas);
    }

    @Override
    public void execute() {

        Command command = this.getCommand();
        int x1 = Integer.valueOf(command.getArgs()[0]);
        int y1 = Integer.valueOf(command.getArgs()[1]);
        int x2 = Integer.valueOf(command.getArgs()[2]);
        int y2 = Integer.valueOf(command.getArgs()[3]);
        
        int height = getCanvas().getHeight(); 
        int width = getCanvas().getWidth(); 
        
        drawLine(x1, y1, x2, y1, height, width);
        drawLine(x1, y1, x1, y2, height, width);
        drawLine(x2, y1, x2, y2, height, width);
        drawLine(x1, y2, x2, y2, height, width);
        
        printCavas();
    }
}
