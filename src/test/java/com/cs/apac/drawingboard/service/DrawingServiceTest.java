package com.cs.apac.drawingboard.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cs.apac.drawingboard.exception.InvalidParameters;
import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.util.Command;

public class DrawingServiceTest {

    DrawingService service = new DrawingServiceImpl();

    @Test
    public void test() throws InvalidParameters, NoCanvasPresentException {
        Command cmd = new Command("C", new String[] {"5","5"});
        service.executeCommand(cmd);
        assertTrue(true); 
        // I know this is dumb test case, just to know if there is no error.
    }

}
