/**
 * Operations package.
 */
package com.cs.apac.drawingboard.operation;

import java.io.Serializable;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.util.Command;

/**
 * BaseOperation, father of all operations :), this class contains all the
 * common operations and base to them.
 *
 * @author ameyjadiye
 */
public abstract class BaseOperation implements Operation, Serializable {

    /**
     * {@link Canvas} on which the operations going to happen.
     */
    private Canvas canvas;

    // this one looks cool but could be messedup on non-english operating system.
    // private char HORIZONTAL_CHAR = '–'; //

    /**
     * horizontal edge chars.
     */
    public char horizontalCharachter = '-';

    /**
     * Vertical edge char.
     */
    public char verticalCharachter = '|';

    /**
     * Line char.
     */
    public char lineCharachter = 'x';

    /**
     * {@link Command} Inatance.
     */
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

    /**
     * Prints canvas on console.
     */
    public void printCavas() {

        printUpperLowerEdge();

        for (int i = 0; i < canvas.getHeight(); i++) {

            System.out.print(verticalCharachter);

            for (int j = 0; j < canvas.getWidth(); j++) {
                System.out.print(canvas.getSheet()[i][j]);
            }

            System.out.print(verticalCharachter);
            System.out.print(System.lineSeparator());

        }

        printUpperLowerEdge();

    }

    /**
     * Method for printing upper and lower edge of canvas.
     */
    private void printUpperLowerEdge() {
        for (int i = 0; i < canvas.getWidth() + 2; i++) {
            System.out.print(horizontalCharachter);
        }
        System.out.print(System.lineSeparator());
    }
}
