/**
 *
 */
package com.cs.apac.drawingboard.factory;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.exception.NoSuchCommandException;
import com.cs.apac.drawingboard.operation.BucketFillOperation;
import com.cs.apac.drawingboard.operation.CreateCanvasOperation;
import com.cs.apac.drawingboard.operation.DrawLineOperation;
import com.cs.apac.drawingboard.operation.DrawRectangleOperation;
import com.cs.apac.drawingboard.operation.Operation;
import com.cs.apac.drawingboard.operation.QuitOperation;
import com.cs.apac.drawingboard.util.Command;
/**
 * Factory class for creating the opearations.
 * @author ameyjadiye
 *
 */
public class OperationFactory {

    /**
     * method which return the new instance of the Operation.
     * @param command - command entered by user.
     * @param canvas - canvas, which is the present state of sheet shown to user.
     * @return - Returns the instance of operation.
     */
    public Operation getOperation(Command command, Canvas canvas) {

        switch (command.getCommand()) {
        case "C":
            return new CreateCanvasOperation(command);
        case "L":
            return new DrawLineOperation(command, canvas);
        case "R":
            return new DrawRectangleOperation(command, canvas);
        case "B":
            return new BucketFillOperation(command, canvas);
        case "Q":
            return new QuitOperation();
        default:
            throw new NoSuchCommandException();
        }
    }
}
