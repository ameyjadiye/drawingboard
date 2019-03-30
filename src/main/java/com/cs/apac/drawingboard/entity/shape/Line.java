package com.cs.apac.drawingboard.entity.shape;

import com.cs.apac.drawingboard.entity.BaseEntity;

public class Line extends BaseEntity {

    private Point[] line;

    public Line(Point[] line) {
        super();
        this.line = line;
    }

    public Line(int x1, int y1, int x2, int y2) {
        super();

        line = new Point[Math.max(x2, y2)];
        int count = 0;
        for (int row = y1 - 1; row <= y2 - 1; row++) {
            for (int column = x1 - 1; column <= x2 - 1; column++) {
                line[count++] = new Point(row, column, 'x');
            }
        }
    }

    /**
     * @return the line
     */
    public Point[] getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(Point[] line) {
        this.line = line;
    }

}
