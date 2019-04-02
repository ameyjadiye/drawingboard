package com.cs.apac.drawingboard.service;

import com.cs.apac.drawingboard.entity.holder.CanvasHolder;
import com.cs.apac.drawingboard.exception.InvalidParameters;
import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.operation.Operation;
import com.cs.apac.drawingboard.util.Command;
import com.cs.apac.drawingboard.util.CommandValidator;

/**
 * Service layer Implementation of {@link DrawingService} which carries the
 * {@link Command}s to Canvas by applying appropriate operations.
 *
 * @author ameyjadiye
 *
 */
public class DrawingServiceImpl implements DrawingService {

    /**
     * Instance of {@link OperationFactory}.
     */
    OperationFactory operationFactory = new OperationFactory();

    /**
     * Instance of {@link CanvasHolder}.
     */
    private CanvasHolder canvasHolder = new CanvasHolder();

    @Override
    public void executeCommand(Command command) throws InvalidParameters, NoCanvasPresentException {

        if (CommandValidator.isValidCommand(command)) {
            Operation operation = operationFactory.getOperation(command, canvasHolder.getCanvas());

            canvasHolder.setOperation(operation);
            canvasHolder.action();
        }
    }
}
