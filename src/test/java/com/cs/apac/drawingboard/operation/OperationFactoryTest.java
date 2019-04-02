/**
 * 
 */
package com.cs.apac.drawingboard.operation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.exception.NoSuchCommandException;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.util.Command;

/**
 * @author amey
 *
 */
public class OperationFactoryTest {

    OperationFactory factory = new OperationFactory();

    /**
     * Test method for {@link OperationFactory}
     */
    @Test
    public final void testGetCreateOperation() {
        Command command = new Command("C", new String[] { "20", "5" });
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);

        assertNotNull(op);
        boolean result = false;
        if (op instanceof CreateCanvasOperation) {
            result = true;
        }
        assertEquals(true, result);
    }

    @Test
    public final void testGetDrawLineOperation() {
        Command command = new Command("L", new String[] { "4", "2", "4", "5" });
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);

        assertNotNull(op);
        boolean result = false;
        if (op instanceof DrawLineOperation) {
            result = true;
        }

        assertEquals(true, result);

    }

    @Test
    public final void testGetDrawRectOperation() {
        Command command = new Command("R", new String[] { "14", "1", "18", "5" });
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);

        assertNotNull(op);
        boolean result = false;
        if (op instanceof DrawRectangleOperation) {
            result = true;
        }

        assertEquals(true, result);

    }

    @Test
    public final void testGetDOBucketfillOperation() {
        Command command = new Command("B", new String[] { "10", "5", "c" });
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);

        assertNotNull(op);
        boolean result = false;
        if (op instanceof BucketFillOperation) {
            result = true;
        }

        assertEquals(true, result);

    }

    @Test
    public final void testGetQuitOperation() {
        Command command = new Command("Q", new String[] {});
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);

        assertNotNull(op);
        boolean result = false;
        if (op instanceof QuitOperation) {
            result = true;
        }

        assertEquals(true, result);

    }

    @Test(expected = NoSuchCommandException.class)
    public final void testGetRandomOperation() {
        Command command = new Command("random_word", new String[] {});
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);

    }
}
