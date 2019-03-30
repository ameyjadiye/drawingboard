package com.cs.apac.drawingboard.operation;

import java.io.Serializable;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.util.Command;

public abstract class BaseOperation implements Operation, Serializable {

    private Canvas canvas;

    // private char HORIZONTAL_CHAR = '–'; //this one looks nice.

    public char HORIZONTAL_CHAR = '-';

    public char VERTICAL_CHAR = '|';

    public char LINE_CHAR = 'x';

    private Command command;

    /**
     * @return the canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * @param canvas the canvas to set
     */
    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    /**
     * @return the command
     */
    public Command getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    public void printCavas() {

        printUpperLowerEdge();

        for (int i = 0; i < canvas.getHeight(); i++) {

            System.out.print(VERTICAL_CHAR);

            for (int j = 0; j < canvas.getWidth(); j++) {
                System.out.print(canvas.getSheet()[i][j]);
            }

            System.out.print(VERTICAL_CHAR);
            System.out.print(System.lineSeparator());

        }

        printUpperLowerEdge();

    }

    private void printUpperLowerEdge() {
        for (int i = 0; i < canvas.getWidth() + 2; i++) {
            System.out.print(HORIZONTAL_CHAR);
        }
        System.out.print(System.lineSeparator());
    }
}
