package com.cs.apac.drawingboard.service;

import com.cs.apac.drawingboard.exception.InvalidParameters;
import com.cs.apac.drawingboard.exception.NoCanvasPresentException;
import com.cs.apac.drawingboard.util.Command;

public interface DrawingService {

    void executeCommand(Command comamnd) throws InvalidParameters, NoCanvasPresentException;

}
