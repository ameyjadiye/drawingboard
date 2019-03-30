package com.cs.apac.drawingboard;

import java.util.Scanner;

import com.cs.apac.drawingboard.service.DrawingService;
import com.cs.apac.drawingboard.service.DrawingServiceImpl;
import com.cs.apac.drawingboard.util.BoardUtils;
import com.cs.apac.drawingboard.util.Command;
import com.cs.apac.drawingboard.util.CommandParser;

public class DrawingBoardApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static DrawingService service = new DrawingServiceImpl();

    public static void main(String ... args) {
        
        BoardUtils.printHelp();
        
        while (scanner.hasNextLine()) {
            execute(scanner.nextLine());
        }
    }

    private static void execute(String consoleInput) {
        Command comamnd = CommandParser.getCommand(consoleInput);
        service.executeCommand(comamnd);
    }
}
