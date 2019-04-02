package com.cs.apac.drawingboard.entity.shape;

import com.cs.apac.drawingboard.entity.BaseEntity;

/**
 * <p>
 * In modern mathematics, a point refers usually to an element of some set
 * called a space.
 * </p>
 * <p>
 * More specifically, in Euclidean geometry, a point is a primitive notion upon
 * which the geometry is built, meaning that a point cannot be defined in terms
 * of previously defined objects. That is, a point is defined only by some
 * properties, called axioms, that it must satisfy. In particular, the geometric
 * points do not have any length, area, volume or any other dimensional
 * attribute. A common interpretation is that the concept of a point is meant to
 * capture the notion of a unique location in Euclidean space.
 * </p>
 *
 * <p>
 * There are several inequivalent definitions of dimension in mathematics. In
 * all of the common definitions, a point is 0-dimensional.
 * </p>
 *
 * <a href="https://en.wikipedia.org/wiki/Point_(geometry)">
 * https://en.wikipedia.org/wiki/Point_(geometry) </a>
 *
 * @author ameyjadiye
 *
 */
public class Point extends BaseEntity {

    /**
     * x value.
     */
    private int x;
    /**
     * y value.
     */
    private int y;

    /**
     * color value of the point.
     */
    private char color;

    /**
     * @param x - x value..
     * @param y - y value.
     * @param color - color value.
     */
    public Point(int x, int y, char color) {
        super();
        this.x = x;
        this.y = y;
        this.color = color;
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

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.valueOf(color);
    }

}
