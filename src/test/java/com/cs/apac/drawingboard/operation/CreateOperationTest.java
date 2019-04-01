package com.cs.apac.drawingboard.operation;

import org.junit.Test;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.entity.holder.CanvasHolder;
import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.util.Command;

import junit.framework.TestCase;

public class CreateOperationTest extends TestCase {

    OperationFactory factory = new OperationFactory();
    private CanvasHolder canvasHolder = new CanvasHolder();

    @Test
    public final void testCreateCanvasTest() throws NoCanvasPresentException {
        Command command = new Command("C", new String[] {"20","5"});
        Canvas canvas = null;
        CreateOperation op = (CreateOperation)factory.getOperation(command, canvas);

        assertNull(op.getCanvas());
        canvasHolder.setOperation(op);
        canvasHolder.action();
        assertNotNull(op.getCanvas());
        
    }
}
