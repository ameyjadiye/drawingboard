package com.cs.apac.drawingboard.operation;

import java.security.InvalidParameterException;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.entity.shape.Point;
import com.cs.apac.drawingboard.util.Command;

public class BucketFillOperation extends FillOperation {

    public BucketFillOperation(Command command, Canvas canvas) {
        this.setCanvas(canvas);
        this.setCommand(command);
    }

    @Override
    public void execute() {

        Point[][] sheet = this.getCanvas().getSheet();
        Command command = this.getCommand();

        int x = Integer.valueOf(command.getArgs()[0]);
        int y = Integer.valueOf(command.getArgs()[1]);
        char colorToPaint = command.getArgs()[2].toCharArray()[0];

        if (x > this.getCanvas().getWidth() || y > this.getCanvas().getHeight()) {
            throw new InvalidParameterException("Given point is out of canvas!");
        }
        
        char colorToReplace = getValueAt(sheet, x - 1, y - 1);

        apply(sheet, colorToReplace, colorToPaint, x - 1, y - 1);

        printCavas();

    }

    /**
     * Implementation of a tail recursive flood fill algorithm to solve this
     * problem. Flood fill, also called seed fill, is an algorithm that determines
     * the area connected to a given node in a multi-dimensional array. It is used
     * in the "bucket" fill tool of paint programs to fill connected,
     * similarly-colored areas with a different color, and in games such as Go and
     * Minesweeper for determining which pieces are cleared. When applied on an
     * image to fill a particular bounded area with color, it is also known as
     * boundary fill.
     *
     * The complexity order of this algorithm in space terms is O(1) because we are
     * not using any additional data structure to store data temporally. In time
     * termsn the complexity order is O(N) where N is the number of pixels to change
     * color.
     */
    public void apply(Point[][] sheet, char colorToReplace, char colorToPaint, int x, int y) {

        char currentColor = getValueAt(sheet, x, y);
        if (currentColor == colorToReplace) {
            sheet[y][x].setColor(colorToPaint);
            apply(sheet, colorToReplace, colorToPaint, x + 1, y);
            apply(sheet, colorToReplace, colorToPaint, x - 1, y);
            apply(sheet, colorToReplace, colorToPaint, x, y + 1);
            apply(sheet, colorToReplace, colorToPaint, x, y - 1);
        }
    }

    /**
     * Method created to avoid IndexOutOfBoundExceptions. This method return -1 if
     * you try to access an invalid position.
     */
    private char getValueAt(Point[][] sheet, int x, int y) {
        if (x < 0 || y < 0 || x >= getCanvas().getWidth() || y >= getCanvas().getHeight()) {
            return (char) -1;
        } else {
            return sheet[y][x].getColor();
        }
    }
}
