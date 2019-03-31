package com.cs.apac.drawingboard.operation;

import java.security.InvalidParameterException;
import java.util.ArrayDeque;
import java.util.Queue;

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

        int x = Integer.parseInt(command.getArgs()[0]);
        int y = Integer.parseInt(command.getArgs()[1]);
        
        char colorToPaint = command.getArgs()[2].toCharArray()[0];

        if (x > this.getCanvas().getWidth() || y > this.getCanvas().getHeight()) {
            throw new InvalidParameterException("Given point is out of canvas!");
        }
        
        
        floodfill(sheet, x-1, y-1, colorToPaint);

        // this part is fast but throws stackoverflow on big canvas
        /**char colorToReplace = getValueAt(sheet, x - 1, y - 1);
        apply(sheet, colorToReplace, colorToPaint, x - 1, y - 1); */
        
        printCavas();

    }
    
    

    // Below arrays details all 8 possible movements
    private static final int[] row = { -1, -1, -1, 0, 0, 1, 1, 1 };
    private static final int[] col = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public static boolean isSafe(Point[][] M, int m, int n, int x, int y, char target) {
        return x >= 0 && x < m && y >= 0 && y < n && M[x][y].getColor() == target;
    }


    /**
     * Flood fill using BFS
     * @param M
     * @param x
     * @param y
     * @param replacement
     */
    public static void floodfill(Point[][] M, int x, int y, char replacement) {
        int m = M.length;
        int n = M[0].length;

        // create a queue and enqueue starting pixel
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(x, y));

        // get target color
        char target = M[x][y].getColor();

        // run till queue is not empty
        while (!q.isEmpty()) {
            // pop front node from queue and process it
            Pair node = q.poll();

            // (x, y) represents current pixel
            x = node.x;
            y = node.y;

            // replace current pixel color with that of replacement
            M[x][y].setColor(replacement);

            // process all 8 adjacent pixels of current pixel and
            // enqueue each valid pixel
            for (int k = 0; k < row.length; k++) {
                // if adjacent pixel at position (x + row[k], y + col[k]) is
                // a valid pixel and have same color as that of current pixel
                if (isSafe(M, m, n, x + row[k], y + col[k], target)) {
                    // enqueue adjacent pixel
                    q.add(new Pair(x + row[k], y + col[k]));
                }
            }
        }
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

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
