package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.util.Command;

public class CreateCanvasOperation extends BaseOperation implements CreateOperation {
    
    public CreateCanvasOperation(Command command) {
        
    }
    
    @Override
    public void execute() {
        createCanvas();
    }

    @Override
    public void createCanvas() {
        
        //this.setCanvas();
    }
    
}
