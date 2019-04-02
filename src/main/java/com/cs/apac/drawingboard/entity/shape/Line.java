package com.cs.apac.drawingboard.entity.shape;

import com.cs.apac.drawingboard.entity.BaseEntity;

/**
 * <p>
 * The notion of line or straight line was introduced by ancient mathematicians
 * to represent straight objects (i.e., having no curvature) with negligible
 * width and depth.Lines are an idealization of such objects.
 * </p>
 * Until the 17th century, lines were defined as the first species of quantity,
 * which has only one dimension, namely length, without any width nor depth, and
 * is nothing else than the flow or run of the point which will leave from its
 * imaginary moving some vestige in length, exempt of any width. The straight
 * line is that which is equally extended between its points.
 * <p>
 * More Info on below link.
 * <a href="https://en.wikipedia.org/wiki/Line_(geometry)">
 * https://en.wikipedia.org/wiki/Line_(geometry) </a>
 * <p>
 *
 * @author ameyjadiye
 *
 */
public class Line extends BaseEntity {

    /**
     * Co-ordinates of the line,
     * Point 1 = x1, y1.
     * Point 2 = x2, y2.
     */
    int x1, y1, x2, y2;

    /**
     * Constructor for Line.
     * @param x1 value of x1.
     * @param y1 value of x2.
     * @param x2 value of y1.
     * @param y2 value of y2.
     */
    public Line(int x1, int y1, int x2, int y2) {
        super();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * @return the y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

}
