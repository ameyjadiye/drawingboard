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

    public Canvas(Point[][] sheet) {
        super();
        this.sheet = sheet;
    }

    /**
     * @return the sheet
     */
    public Point[][] getSheet() {
        return sheet;
    }

    /**
     * @param sheet the sheet to set
     */
    public void setSheet(Point[][] sheet) {
        this.sheet = sheet;
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
