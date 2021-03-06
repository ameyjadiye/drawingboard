package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.entity.shape.Line;
import com.cs.apac.drawingboard.entity.shape.Rectangle;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.util.Command;
/**
 * Operation class for drawing {@link Rectangle}.
 * @author ameyjadiye
 *
 */
public class DrawRectangleOperation extends DrawLineOperation implements DrawOperation {

    /**
     * Constructor for returning instance from {@link OperationFactory}.
     * @param command command.
     * @param canvas canvas.
     */
    public DrawRectangleOperation(Command command, Canvas canvas) {
        super(command, canvas);
    }

    @Override
    public void execute() {

        Command command = this.getCommand();
        int x1 = Integer.parseInt(command.getArgs()[0]);
        int y1 = Integer.parseInt(command.getArgs()[1]);
        int x2 = Integer.parseInt(command.getArgs()[2]);
        int y2 = Integer.parseInt(command.getArgs()[3]);

        int height = getCanvas().getHeight();
        int width = getCanvas().getWidth();

        // upper line
        Line upper = new Line(x1, y1, x2, y1);

        // left line
        Line left = new Line(x1, y1, x1, y2);

        // right line
        Line right = new Line(x2, y1, x2, y2);

        // bottom line
        Line bottom = new Line(x1, y2, x2, y2);

        Rectangle rect = new Rectangle(upper, left, right, bottom);
        drawRectangle(rect, height, width);

        printCavas();
    }

    /**
     * For drawing rectangle.
     * @param rect rectangle.
     * @param height height.
     * @param width width.
     */
    void drawRectangle(Rectangle rect, int height, int width) {
        drawLine(rect.getUpper(), height, width);
        drawLine(rect.getLeft(), height, width);
        drawLine(rect.getRight(), height, width);
        drawLine(rect.getBottom(), height, width);
    }

}
