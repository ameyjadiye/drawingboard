package com.cs.apac.drawingboard.operation;

import java.security.InvalidParameterException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

import com.cs.apac.drawingboard.entity.Pair;
import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.entity.shape.Point;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.util.BoardUtils;
import com.cs.apac.drawingboard.util.Command;

/**
 * Implementation of a BFS flood fill algorithm to solve this problem.
 * Bucketfill operation is using Flood fill algo, also called seed fill, is an
 * algorithm that determines the area connected to a given node in a
 * multi-dimensional array. It is used in the "bucket" fill tool of paint
 * programs to fill connected, similarly-colored areas with a different color,
 * and in games such as Go and Minesweeper for determining which pieces are
 * cleared.When applied on an image to fill a particular bounded area with
 * color, it is also known as boundary fill.
 *
 * @author ameyjadiye
 *
 */
public class BucketFillOperation extends FillOperation {

    /**
     * Constructor used in {@link OperationFactory} for returning instance.
     * @param command - command to set for operation.
     * @param canvas - canvas on which opearion is carriedout.
     */
    public BucketFillOperation(Command command, Canvas canvas) {
        this.setCanvas(canvas);
        this.setCommand(command);
    }

    @Override
    public void execute() {

        Point[][] sheet = this.getCanvas().getSheet();
        Command command = this.getCommand();

        int x = Integer.parseInt(command.getArgs()[0]);
        int y = Integer.parseInt(command.getArgs()[1]);

        char colorToPaint = command.getArgs()[2].toCharArray()[0];

        if (x > this.getCanvas().getWidth() || y > this.getCanvas().getHeight()) {
            throw new InvalidParameterException("Given point is out of canvas!");
        }

        floodfill(sheet, x - 1, y - 1, colorToPaint);

        // this part is fast but throws stackoverflow on big canvas
        /**
         * char colorToReplace = getValueAt(sheet, x - 1, y - 1); apply(sheet,
         * colorToReplace, colorToPaint, x - 1, y - 1);
         */

        printCavas();

    }

    /**
     * Below arrays details all 8 possible movements on x axis.
     */
    private final int[] row = {-1, -1, -1, 0, 0, 1, 1, 1 };

    /**
     * Below arrays details all 8 possible movements on y axis.
     */
    private final int[] col = {-1, 0, 1, -1, 1, -1, 0, 1 };

    /**
     * Implementation of Flood fill using BFS.
     *
     * @param sheet - worksheet for filling given x, y cords.
     * @param x - x coordinate of starting point.
     * @param y - y coordinate of starting point.
     * @param replacement - replacement char.
     */
    public void floodfill(Point[][] sheet, int x, int y, char replacement) {
        int height = sheet.length;
        int width = sheet[0].length;

        // create a queue and enqueue starting Point
        Queue<Pair> processQueue = new ArrayDeque<>();
        Set<Pair> marked = new HashSet<Pair>();
        processQueue.add(new Pair(x, y));

        // get target char
        char target = sheet[y][x].getColor();

        // run till queue is not empty
        while (!processQueue.isEmpty()) {
            // pop front node from queue and process it
            Pair node = processQueue.poll();

            // (x, y) represents current pixel
            x = node.getX();
            y = node.getY();

            // replace current pixel color with that of replacement
            sheet[y][x].setColor(replacement);

            // process all 8 adjacent pixels of current pixel and
            // enqueue each valid pixel
            for (int possibilityIndex = 0; possibilityIndex < row.length; possibilityIndex++) {
                // if adjacent pixel at position (x + row[k], y + col[k]) is
                // a valid pixel and have same color as that of current pixel
                Pair temp = new Pair(x + row[possibilityIndex], y + col[possibilityIndex]);
                if (!marked.contains(temp)) {
                    if (BoardUtils.isSafe(sheet, height, width, x + row[possibilityIndex], y + col[possibilityIndex],
                            target)) {
                        processQueue.add(temp);
                    }
                }
                marked.add(temp);
            }
        }
    }
    /**
     * The complexity order of this algorithm in space terms is O(1) because we are
     * not using any additional data structure to store data temporally. In time
     * terms the complexity order is O(N) where N is the number of pixels to change
     * color.
     *
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
*/
    /**
     * Method created to avoid IndexOutOfBoundExceptions. This method return -1 if
     * you try to access an invalid position.
     *
    private char getValueAt(Point[][] sheet, int x, int y) {
        if (x < 0 || y < 0 || x >= getCanvas().getWidth() || y >= getCanvas().getHeight()) {
            return (char) -1;
        } else {
            return sheet[y][x].getColor();
        }
    }
    */

}
