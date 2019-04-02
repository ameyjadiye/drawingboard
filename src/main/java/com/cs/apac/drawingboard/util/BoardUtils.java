package com.cs.apac.drawingboard.util;

import com.cs.apac.drawingboard.DrawingBoardApp;
import com.cs.apac.drawingboard.entity.shape.Point;

/**
 * Utility class for {@link DrawingBoardApp}.
 * @author ameyjadiye
 */
public class BoardUtils {

    /**
     * Method for giving help message.
     * @return reutrn help messgae.
     */
    public static String helpMsg() {
        String help = "Available Command  Description\n"
                + "C w h           Creates a new canvas of width w and height h.\n"
                + "L x1 y1 x2 y2   Creates a new line from (x1,y1) to (x2,y2). Currently only\n"
                + "                horizontal or vertical lines are supported. Horizontal and vertical lines\n"
                + "                will be drawn using the 'x' character.\n"
                + "R x1 y1 x2 y2   Creates a new rectangle, whose upper left corner is (x1,y1) and\n"
                + "                lower right corner is (x2,y2). Horizontal and vertical lines will be drawn\n"
                + "                using the 'x' character.\n"
                + "B x y c         Fills the entire area connected to (x,y) with \"colour\" c. \n"
                + "Q               Quit the program.\n";
        return help;
    }

    /**
     * Method for checking whether the action to be done on Point is valid or not.
     *
     * @param sheet - Canvas sheet.
     * @param height - height of sheet.
     * @param width - width of the sheet.
     * @param x - x value being tested.
     * @param y - y value being tested.
     * @param target - target color or char to be replaced.
     * @return if value is safe or not.
     */
    public static boolean isSafe(Point[][] sheet, int height, int width, int x, int y, char target) {
        return x >= 0 && x < width && y >= 0 && y < height && sheet[y][x].getColor() == target;
    }

}
