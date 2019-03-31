package com.cs.apac.drawingboard.entity.holder;

import java.util.Arrays;

import com.cs.apac.drawingboard.entity.BaseEntity;
import com.cs.apac.drawingboard.entity.shape.Point;

public class Canvas extends BaseEntity {

    private int height = 0;
    private int width = 0;

    private Point[][] sheet;

    public Canvas() {
        super();
    }

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
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    public char[][] toCharArray() {
        char[][] result = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = getSheet()[i][j].getColor();
            }
        }
        return result;
    }

    /**
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Canvas [sheet=" + Arrays.toString(sheet) + "]";
    }
}
