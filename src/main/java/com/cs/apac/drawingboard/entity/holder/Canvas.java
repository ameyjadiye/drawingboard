/**
 *
 */
package com.cs.apac.drawingboard.entity.holder;

import com.cs.apac.drawingboard.entity.BaseEntity;
import com.cs.apac.drawingboard.entity.shape.Point;
import com.cs.apac.drawingboard.operation.DrawShapeOperation;

/**
 * Canvas is the workarea and the heart of the application. all the opearaions
 * are happening on canvas and its state will be going to change with all
 * {@link DrawShapeOperation}s }
 *
 * Canvas holds the all points their physical location and color. it also holds
 * its own Height and Width.
 *
 * @author ameyjadiye
 *
 */
public class Canvas extends BaseEntity {

    /**
     * height of sheet, also known as y-axis.
     */
    private int height = 0;

    /**
     * width of sheet, also known as x-axis.
     */
    private int width = 0;

    /**
     * actual sheet, a 2D array of {@link Point}.
     */
    private Point[][] sheet;

    /**
     * Constructor of the canvas which takes height and width and generate the blank
     * sheet.
     *
     * @param widhth width.
     * @param height height.
     */
    public Canvas(int widhth, int height) {
        super();
        this.height = height;
        this.width = widhth;
        sheet = new Point[this.height][this.width];
    }

    /**
     * @return the sheet
     */
    public Point[][] getSheet() {
        return sheet;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Method for getting the color positions of canvas.
     *
     * @return sheet of colors.
     */
    public char[][] toCharArray() {
        char[][] result = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = getSheet()[i][j].getColor();
            }
        }
        return result;
    }

}
