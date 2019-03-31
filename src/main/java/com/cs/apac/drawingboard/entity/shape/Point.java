package com.cs.apac.drawingboard.entity.shape;

import com.cs.apac.drawingboard.entity.BaseEntity;

public class Point extends BaseEntity {
    
    private int x;
    
    private int y;
    
    private char color;

    public Point() {
        
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param color
     */
    public Point(int x, int y, char color) {
        super();
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the color
     */
    public char getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(char color) {
        this.color = color;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.valueOf(color);
    }
    
    
    
}
