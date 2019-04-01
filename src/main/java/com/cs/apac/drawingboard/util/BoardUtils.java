package com.cs.apac.drawingboard.util;

import com.cs.apac.drawingboard.entity.shape.Point;

public class BoardUtils {
    
    public static String helpMsg() {
        String help = "Available Command  Description\n" + 
        "C w h           Creates a new canvas of width w and height h.\n" + 
        "L x1 y1 x2 y2   Creates a new line from (x1,y1) to (x2,y2). Currently only\n" + 
        "                horizontal or vertical lines are supported. Horizontal and vertical lines\n" + 
        "                will be drawn using the 'x' character.\n" + 
        "R x1 y1 x2 y2   Creates a new rectangle, whose upper left corner is (x1,y1) and\n" + 
        "                lower right corner is (x2,y2). Horizontal and vertical lines will be drawn\n" + 
        "                using the 'x' character.\n" + 
        "B x y c         Fills the entire area connected to (x,y) with \"colour\" c. \n"+ 
        "Q               Quit the program.\n"; 
        return help;
    }
    
    public static boolean isSafe(Point[][] sheet, int height, int width, int x, int y, char target) {
        return x >= 0 && x < width && y >= 0 && y < height && sheet[y][x].getColor() == target;
    }


    
}
