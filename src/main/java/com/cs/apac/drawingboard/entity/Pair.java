package com.cs.apac.drawingboard.entity;

/**
 * A pair class is nothing but the holder of x, y coordinates. same thing can be
 * achieved with arrays but looks dirty. this one is clean way to have pairs :)
 *
 * @author ameyjadiye
 *
 */
public class Pair extends BaseEntity {
    /**
     * just x, y co-ordinates.
     */
    int x, y;

    /**
     * Constructor for Pair class.
     * @param x x coordinates.
     * @param y y coordinates.
     */
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pair other = (Pair) obj;
        if (x != other.x) {
            return false;
        }
        if (y != other.y) {
            return false;
        }
        return true;
    }

}
