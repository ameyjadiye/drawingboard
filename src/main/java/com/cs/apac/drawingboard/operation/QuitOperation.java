package com.cs.apac.drawingboard.operation;

public class QuitOperation extends BaseOperation {

    @Override
    public void execute() {
        System.out.println("Quiting program .. Bbye ..");
        System.exit(0);
    }
}
