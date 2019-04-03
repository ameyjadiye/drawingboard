package com.cs.apac.drawingboard.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cs.apac.drawingboard.exception.InvalidParameters;
import com.cs.apac.drawingboard.exception.NoSuchCommandException;

public class CommandValidatorTest {

    @Test(expected = NoSuchCommandException.class)
    public void testIsValidCommandForAnything() throws InvalidParameters {
        Command command = new Command("Amey", new String[] {});
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForCreateCanvas() throws InvalidParameters {
        Command command = new Command("C", new String[] {});
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForCreateCanvas1() throws InvalidParameters {
        Command command = new Command("C", new String[] { "", "" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForCreateCanvas3() throws InvalidParameters {
        Command command = new Command("C", new String[] { "1", "e" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForCreateCanvas4() throws InvalidParameters {
        Command command = new Command("C", new String[] { "1", "-1" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test
    public void testIsValidCommandForCreateCanvas5() throws InvalidParameters {
        Command command = new Command("C", new String[] { "20", "5" });
        assertTrue(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawLine() throws InvalidParameters {
        Command command = new Command("L", new String[] {});
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawLine1() throws InvalidParameters {
        Command command = new Command("L", new String[] { "", "", "", "" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawLine3() throws InvalidParameters {
        Command command = new Command("L", new String[] { "1", "e", "1", "w" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawLine4() throws InvalidParameters {
        Command command = new Command("L", new String[] { "1", "-1", "3", "3" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawLine5() throws InvalidParameters {
        Command command = new Command("L", new String[] { "1", "2", "3", "4" });
        assertFalse(CommandValidator.isValidCommand(command));
    }
    
    @Test
    public void testIsValidCommandForDrawLine7() throws InvalidParameters {
        Command command = new Command("L", new String[] { "5", "2", "1", "2" });
        assertTrue(CommandValidator.isValidCommand(command));
    }

    @Test
    public void testIsValidCommandForDrawLine6() throws InvalidParameters {
        Command command = new Command("L", new String[] { "2", "1", "2", "5" });
        assertTrue(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawRectangle() throws InvalidParameters {
        Command command = new Command("R", new String[] {});
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawRectangle1() throws InvalidParameters {
        Command command = new Command("R", new String[] { "", "", "", "" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawRectangle3() throws InvalidParameters {
        Command command = new Command("R", new String[] { "1", "e", "1", "w" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForDrawRectangle4() throws InvalidParameters {
        Command command = new Command("R", new String[] { "1", "-1", "-5", "-3" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test
    public void testIsValidCommandForDrawRectangle5() throws InvalidParameters {
        Command command = new Command("R", new String[] { "1", "2", "7", "7" });
        assertTrue(CommandValidator.isValidCommand(command));
    }

    @Test
    public void testIsValidCommandForDrawRectangle6() throws InvalidParameters {
        Command command = new Command("R", new String[] { "2", "1", "4", "4" });
        assertTrue(CommandValidator.isValidCommand(command));
    }
    
    @Test
    public void testIsValidCommandForDrawRectangle7() throws InvalidParameters {
        Command command = new Command("R", new String[] { "4", "2", "1", "3" });
        assertTrue(CommandValidator.isValidCommand(command));
    }
    
    @Test
    public void testIsValidCommandForDrawRectangle8() throws InvalidParameters {
        Command command = new Command("R", new String[] { "4", "2", "1", "2" });
        assertTrue(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForBucketFill() throws InvalidParameters {
        Command command = new Command("B", new String[] {});
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForBucketFill1() throws InvalidParameters {
        Command command = new Command("B", new String[] { "", "", "" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForBucketFill3() throws InvalidParameters {
        Command command = new Command("B", new String[] { "2", "2", "1#" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test(expected = InvalidParameters.class)
    public void testIsValidCommandForBucketFill4() throws InvalidParameters {
        Command command = new Command("B", new String[] { "1", "-1", "c" });
        assertFalse(CommandValidator.isValidCommand(command));
    }

    @Test
    public void testIsValidCommandForBucketFill5() throws InvalidParameters {
        Command command = new Command("B", new String[] { "2", "1", "*" });
        assertTrue(CommandValidator.isValidCommand(command));
    }

    @Test
    public void testIsValidCommandForQuit() throws InvalidParameters {
        Command command = new Command("Q", new String[] {});
        assertTrue(CommandValidator.isValidCommand(command));
    }

}
