package com.cs.apac.drawingboard.service;

import com.cs.apac.drawingboard.entity.holder.CanvasHolder;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.operation.Operation;
import com.cs.apac.drawingboard.util.Command;
import com.cs.apac.drawingboard.util.CommandValidator;

public class DrawingServiceImpl implements DrawingService {

    OperationFactory operationFactory = new OperationFactory();
    private CanvasHolder canvasHolder = new CanvasHolder();

    @Override
    public void executeCommand(Command command) {

        if (CommandValidator.isValidCommand(command)) {
            Operation operation = operationFactory.getOperation(command, canvasHolder.getCanvas());
            
            canvasHolder.setOperation(operation);
            canvasHolder.action();
        }
    }
}
