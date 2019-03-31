package com.cs.apac.drawingboard.entity.shape;

import com.cs.apac.drawingboard.entity.BaseEntity;

public class Rectangle extends BaseEntity{
    
    Line upper;

    Line left;

    Line right;

    Line bottom;

    
    
    public Rectangle(Line upper, Line left, Line right, Line bottom) {
        super();
        this.upper = upper;
        this.left = left;
        this.right = right;
        this.bottom = bottom;
    }

    /**
     * @return the upper
     */
    public Line getUpper() {
        return upper;
    }

    /**
     * @param upper the upper to set
     */
    public void setUpper(Line upper) {
        this.upper = upper;
    }

    /**
     * @return the left
     */
    public Line getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Line left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Line getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Line right) {
        this.right = right;
    }

    /**
     * @return the bottom
     */
    public Line getBottom() {
        return bottom;
    }

    /**
     * @param bottom the bottom to set
     */
    public void setBottom(Line bottom) {
        this.bottom = bottom;
    }

    
    
}
