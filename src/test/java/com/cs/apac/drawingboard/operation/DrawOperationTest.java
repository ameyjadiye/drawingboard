package com.cs.apac.drawingboard.operation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.security.InvalidParameterException;
import java.util.Arrays;

import org.junit.Test;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.entity.holder.CanvasHolder;
import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.factory.OperationFactory;
import com.cs.apac.drawingboard.util.Command;

public class DrawOperationTest {

    OperationFactory factory = new OperationFactory();
    private CanvasHolder canvasHolder = new CanvasHolder();

    @Test(expected = NoCanvasPresentException.class)
    public final void testDrawLineTestExeption() throws NoCanvasPresentException {
        Command command = new Command("L", new String[] { "1", "2", "6", "2" });
        Canvas canvas = null;
        DrawLineOperation op = (DrawLineOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(op);
        canvasHolder.action();

    }

    @Test
    public final void testDrawLineTest() throws NoCanvasPresentException {
        Command command = new Command("C", new String[] { "5", "5" });
        Canvas canvas = null;
        CreateOperation op = (CreateOperation) factory.getOperation(command, canvas);

        assertNull(op.getCanvas());
        canvasHolder.setOperation(op);
        canvasHolder.action();
        assertNotNull(op.getCanvas());

        assertEquals(5, op.getCanvas().getHeight());
        assertEquals(5, op.getCanvas().getWidth());

        command = new Command("L", new String[] { "1", "2", "3", "2" });
        canvas = op.getCanvas();
        DrawLineOperation opLine = (DrawLineOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(opLine);
        canvasHolder.action();

        char[][] expected = { "     ".toCharArray(), "xxx  ".toCharArray(), "     ".toCharArray(),
                "     ".toCharArray(), "     ".toCharArray(), };

        assertTrue(equal(expected, op.getCanvas().toCharArray()));
    }

    @Test
    public final void testDrawLineTest1() throws NoCanvasPresentException {
        Command command = new Command("C", new String[] { "5", "5" });
        Canvas canvas = null;
        CreateOperation op = (CreateOperation) factory.getOperation(command, canvas);

        assertNull(op.getCanvas());
        canvasHolder.setOperation(op);
        canvasHolder.action();
        assertNotNull(op.getCanvas());

        assertEquals(5, op.getCanvas().getHeight());
        assertEquals(5, op.getCanvas().getWidth());

        command = new Command("L", new String[] { "1", "2", "8", "2" });
        canvas = op.getCanvas();
        DrawLineOperation opLine = (DrawLineOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(opLine);
        canvasHolder.action();

        char[][] expected = { "     ".toCharArray(), "xxxxx".toCharArray(), "     ".toCharArray(),
                "     ".toCharArray(), "     ".toCharArray(), };

        assertTrue(equal(expected, op.getCanvas().toCharArray()));
    }

    @Test
    public final void testDrawLineTest2() throws NoCanvasPresentException {
        Command command = new Command("C", new String[] { "5", "5" });
        Canvas canvas = null;
        CreateOperation op = (CreateOperation) factory.getOperation(command, canvas);

        assertNull(op.getCanvas());
        canvasHolder.setOperation(op);
        canvasHolder.action();
        assertNotNull(op.getCanvas());

        assertEquals(5, op.getCanvas().getHeight());
        assertEquals(5, op.getCanvas().getWidth());

        command = new Command("L", new String[] { "2", "1", "2", "8" });
        canvas = op.getCanvas();
        DrawLineOperation opLine = (DrawLineOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(opLine);
        canvasHolder.action();

        char[][] expected = { " x   ".toCharArray(), " x   ".toCharArray(), " x   ".toCharArray(),
                " x   ".toCharArray(), " x   ".toCharArray(), };

        assertTrue(equal(expected, op.getCanvas().toCharArray()));
    }

    @Test
    public final void testDrawRectangleTest() throws NoCanvasPresentException {
        Command command = new Command("C", new String[] { "5", "5" });
        Canvas canvas = null;
        CreateOperation op = (CreateOperation) factory.getOperation(command, canvas);

        assertNull(op.getCanvas());
        canvasHolder.setOperation(op);
        canvasHolder.action();
        assertNotNull(op.getCanvas());

        assertEquals(5, op.getCanvas().getHeight());
        assertEquals(5, op.getCanvas().getWidth());

        command = new Command("R", new String[] { "1", "1", "3", "3" });
        canvas = op.getCanvas();
        DrawRectangleOperation opLine = (DrawRectangleOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(opLine);
        canvasHolder.action();

        char[][] expected = { "xxx  ".toCharArray(), "x x  ".toCharArray(), "xxx  ".toCharArray(),
                "     ".toCharArray(), "     ".toCharArray(), };

        assertTrue(equal(expected, op.getCanvas().toCharArray()));
    }

    @Test
    public final void testBucketFillTest() throws NoCanvasPresentException {
        Command command = new Command("C", new String[] { "5", "5" });
        Canvas canvas = null;
        CreateOperation op = (CreateOperation) factory.getOperation(command, canvas);

        assertNull(op.getCanvas());
        canvasHolder.setOperation(op);
        canvasHolder.action();
        assertNotNull(op.getCanvas());

        assertEquals(5, op.getCanvas().getHeight());
        assertEquals(5, op.getCanvas().getWidth());

        command = new Command("R", new String[] { "1", "1", "3", "3" });
        canvas = op.getCanvas();
        DrawRectangleOperation opLine = (DrawRectangleOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(opLine);
        canvasHolder.action();

        command = new Command("B", new String[] { "5", "5", "*" });
        canvas = op.getCanvas();
        BucketFillOperation bfp = (BucketFillOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(bfp);
        canvasHolder.action();

        char[][] expected = { "xxx**".toCharArray(), "x x**".toCharArray(), "xxx**".toCharArray(),
                "*****".toCharArray(), "*****".toCharArray(), };

        assertTrue(equal(expected, op.getCanvas().toCharArray()));
    }

    @Test(expected = InvalidParameterException.class)
    public final void testBucketFillTestFail() throws NoCanvasPresentException {
        Command command = new Command("C", new String[] { "5", "5" });
        Canvas canvas = null;
        CreateOperation op = (CreateOperation) factory.getOperation(command, canvas);

        assertNull(op.getCanvas());
        canvasHolder.setOperation(op);
        canvasHolder.action();
        assertNotNull(op.getCanvas());

        assertEquals(5, op.getCanvas().getHeight());
        assertEquals(5, op.getCanvas().getWidth());

        command = new Command("R", new String[] { "1", "1", "3", "3" });
        canvas = op.getCanvas();
        DrawRectangleOperation opLine = (DrawRectangleOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(opLine);
        canvasHolder.action();

        command = new Command("B", new String[] { "5", "8", "*" });
        canvas = op.getCanvas();
        BucketFillOperation bfp = (BucketFillOperation) factory.getOperation(command, canvas);

        canvasHolder.setOperation(bfp);
        canvasHolder.action();

        char[][] expected = { "xxx**".toCharArray(), "x x**".toCharArray(), "xxx**".toCharArray(),
                "*****".toCharArray(), "*****".toCharArray(), };

        assertTrue(equal(expected, op.getCanvas().toCharArray()));
    }

    public static boolean equal(final char[][] arr1, final char[][] arr2) {
        if (arr1 == null) {
            return (arr2 == null);
        }
        if (arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!Arrays.equals(arr1[i], arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
