package com.cs.apac.drawingboard.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilTest {

    @Test
    public void testCommandParser() {
        Command cmd = CommandParser.getCommand("");
        assertEquals(cmd.getCommand(), "");
        assertArrayEquals(cmd.getArgs(), new String[] {});
    }

    @Test
    public void testCommandParser1() {
        Command cmd = CommandParser.getCommand("C 20 4");
        assertEquals(cmd.getCommand(), "C");
        assertArrayEquals(cmd.getArgs(), new String[] { "20", "4" });
    }

    @Test
    public void testCommandParser2() {
        Command cmd = CommandParser.getCommand("R 10 4 20 10");
        assertEquals(cmd.getCommand(), "R");
        assertArrayEquals(cmd.getArgs(), new String[] { "10", "4", "20", "10" });
    }

    @Test
    public void testCommandParserNull() {
        Command cmd = CommandParser.getCommand(null);
        assertEquals(cmd.getCommand(), "");
        assertArrayEquals(cmd.getArgs(), new String[] {});
    }
}
