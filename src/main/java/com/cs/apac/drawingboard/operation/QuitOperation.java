package com.cs.apac.drawingboard.operation;

/**
 * Operation for quiting program.
 * @author ameyjadiye
 *
 */
public class QuitOperation extends BaseOperation {

    @Override
    public void execute() {
        System.out.println("Quiting program .. Bbye ..");
        System.exit(0);
    }
}
