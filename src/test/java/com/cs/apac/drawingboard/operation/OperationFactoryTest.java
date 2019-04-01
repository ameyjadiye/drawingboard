/**
 * 
 */
package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.operation.BucketFillOperation;
import com.cs.apac.drawingboard.operation.CreateCanvasOperation;
import com.cs.apac.drawingboard.operation.DrawLineOperation;
import com.cs.apac.drawingboard.operation.DrawRectangleOperation;
import com.cs.apac.drawingboard.operation.Operation;
import com.cs.apac.drawingboard.operation.QuitOperation;
import com.cs.apac.drawingboard.util.Command;

import junit.framework.TestCase;

/**
 * @author amey
 *
 */
public class OperationFactoryTest extends TestCase {

    
    OperationFactory factory = new OperationFactory();
    
    /**
     * Test method for {@link com.cs.apac.drawingboard.factory.OperationFactory#getOperation(com.cs.apac.drawingboard.util.Command, com.cs.apac.drawingboard.entity.holder.Canvas)}.
     */
    public final void testGetCreateOperation() {
        Command command = new Command("C", new String[] {"20","5"});
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);
        
        assertNotNull(op);
        boolean result  = false;
        if (op instanceof CreateCanvasOperation) {
            result  = true;
        }
        assertEquals(true,result);
    }

    public final void testGetDrawLineOperation() {
        Command command = new Command("L", new String[] {"4","2","4","5"});
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);
        
        assertNotNull(op);
        boolean result  = false;
        if (op instanceof DrawLineOperation) {
            result  = true;
        }
        
        assertEquals(true,result);
        
    }
    public final void testGetDrawRectOperation() {
        Command command = new Command("R", new String[] {"14", "1", "18", "5"});
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);
        
        assertNotNull(op);
        boolean result  = false;
        if (op instanceof DrawRectangleOperation) {
            result  = true;
        }
        
        assertEquals(true,result);
        
    }
    public final void testGetDOBucketfillOperation() {
        Command command = new Command("B", new String[] {"10","5", "c"});
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);
        
        assertNotNull(op);
        boolean result  = false;
        if (op instanceof BucketFillOperation) {
            result  = true;
        }
        
        assertEquals(true,result);
        
    }
    public final void testGetQuitOperation() {
        Command command = new Command("Q", new String[] {});
        Canvas canvas = null;
        Operation op = factory.getOperation(command, canvas);
        
        assertNotNull(op);
        boolean result  = false;
        if (op instanceof QuitOperation) {
            result  = true;
        }
        
        assertEquals(true,result);
        
    }
}
