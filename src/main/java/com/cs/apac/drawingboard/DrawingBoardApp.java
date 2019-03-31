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
        
        //BoardUtils.printHelp();
        System.out.print("Enter command $>");
        while (scanner.hasNextLine()) {
            execute(scanner.nextLine());
            System.out.print("Enter command $>");
        }
    }

    private static void execute(String consoleInput) {
        try {
        Command comamnd = CommandParser.getCommand(consoleInput);
        service.executeCommand(comamnd);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
