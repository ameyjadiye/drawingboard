package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.entity.shape.Line;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.util.Command;
/**
 * Operation class for drawing {@link Line}.
 * @author ameyjadiye
 *
 */
public class DrawLineOperation extends DrawShapeOperation implements DrawOperation {

    /**
     * Constructor for returning instance from {@link OperationFactory}.
     * @param command command.
     * @param canvas canvas.
     */
    public DrawLineOperation(Command command, Canvas canvas) {
        this.setCanvas(canvas);
        this.setCommand(command);
    }

    @Override
    public void execute() {
        Command command = this.getCommand();
        int x1 = Integer.parseInt(command.getArgs()[0]);
        int y1 = Integer.parseInt(command.getArgs()[1]);
        int x2 = Integer.parseInt(command.getArgs()[2]);
        int y2 = Integer.parseInt(command.getArgs()[3]);

        Line line = new Line(x1, y1, x2, y2);

        int height = getCanvas().getHeight();
        int width = getCanvas().getWidth();

        drawLine(line, height, width);

        printCavas();
    }

    /**
     * Method for drawing line on {@link Canvas}.
     * @param line line contains x1,y1 x2,y2 coordinates.
     * @param height height of canvas
     * @param width width of canvas.
     */
    protected void drawLine(Line line, int height, int width) {

        if (line.getX2() >= width) {
            line.setX2(width);
        }
        if (line.getY2() >= height) {
            line.setY2(height);
        }

        for (int i = line.getY1() - 1; i <= line.getY2() - 1 && i < height; i++) {
            for (int j = line.getX1() - 1; j <= line.getX2() - 1 && j < width; j++) {
                getCanvas().getSheet()[i][j].setColor(lineCharachter);
            }
        }
    }
}
