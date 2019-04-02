package com.cs.apac.drawingboard.entity.shape;

import com.cs.apac.drawingboard.entity.BaseEntity;

/**
 * <p>In Euclidean plane geometry, a rectangle is a quadrilateral with four right
 * angles. It can also be defined as an equiangular quadrilateral, since
 * equiangular means that all of its angles are equal (360°/4 = 90°). It can
 * also be defined as a parallelogram containing a right angle. A rectangle with
 * four sides of equal length is a square. The term oblong is occasionally used
 * to refer to a non-square rectangle.</p>
 * <p>
 * The word rectangle comes from the Latin rectangulus, which is a combination
 * of rectus (as an adjective, right, proper) and angulus (angle).</p>
 * More info on
 * <a href="https://en.wikipedia.org/wiki/Rectangle">
 * https://en.wikipedia.org/wiki/Rectangle </a>
 * @author ameyjadiye
 *
 */
public class Rectangle extends BaseEntity {

    /**
     * Upper edge.
     */
    Line upper;

    /**
     * Left edge.
     */
    Line left;

    /**
     * Right edge.
     */
    Line right;

    /**
     * Bottom edge.
     */
    Line bottom;

    /**
     * Constructor.
     * @param upper - upper line;
     * @param left - left line.
     * @param right - right line.
     * @param bottom - bottom line.
     */
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
     * @return the left
     */
    public Line getLeft() {
        return left;
    }

    /**
     * @return the right
     */
    public Line getRight() {
        return right;
    }

    /**
     * @return the bottom
     */
    public Line getBottom() {
        return bottom;
    }

}
