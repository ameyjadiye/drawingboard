package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.util.Command;

public class DrawLineOperation extends DrawShapeOperation implements DrawOperation {

    public DrawLineOperation(Command command , Canvas canvas) {
        this.setCanvas(canvas);
        this.setCommand(command);
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
        
        drawLine(x1, y1, x2, y2, height, width);
        
        printCavas();
    }

    protected void drawLine(int x1, int y1, int x2, int y2, int height, int width) {

        if (x2 >= width)    { x2 = width;}
        if (y2 >= height)   { y2 = height;}
        
        for (int i = y1 - 1; i <= y2 - 1 && i < height; i++) {
            for (int j = x1 - 1; j <= x2 - 1 && j < width; j++) {
                getCanvas().getSheet()[i][j].setColor(LINE_CHAR);
            }
        }
    }
}
