/**
 * Main package which contains the DrawingBoard Application.
 */
package com.cs.apac.drawingboard;

import java.util.Scanner;

import com.cs.apac.drawingboard.service.DrawingService;
import com.cs.apac.drawingboard.service.DrawingServiceImpl;
import com.cs.apac.drawingboard.util.BoardUtils;
import com.cs.apac.drawingboard.util.Command;
import com.cs.apac.drawingboard.util.CommandParser;

/**
 * This is the main class from which execution starts. class contains the
 * {@link Scanner} which loops over and keep on scanning the console inputs
 * which then being converted to commands and being passed to service layers and
 * then triggers the respective operations on canvas.
 *
 * @author ameyjadiye
 *
 */
public class DrawingBoardApp {

    /**
     *
     */
    private Scanner scanner = new Scanner(System.in, "UTF-8");

    /**
     *
     */
    private DrawingService service = new DrawingServiceImpl();

    /**
     *
     */
    private String username = "amey";

    /**
     *
     * @param args arguments
     */
    public static void main(String... args) {

        DrawingBoardApp app = new DrawingBoardApp();
        app.startLoop();

    }

    /**
     *
     */
    private void startLoop() {
        getUserName();
        System.out.println(BoardUtils.helpMsg());
        System.out.print(username + "@drawingboard:~/cs/apac$ ");
        while (scanner.hasNextLine()) {
            execute(scanner.nextLine());
            System.out.print(username + "@drawingboard:~/cs/apac$ ");
        }
    }

    /**
     *
     */
    private void getUserName() {
        System.out.print("Enter your name > ");
        username = scanner.nextLine();
        username = "".equals(username.trim()) ? "amey" : username;
    }

    /**
     *
     * @param consoleInput console input
     */
    private void execute(String consoleInput) {
        try {
            Command comamnd = CommandParser.getCommand(consoleInput);
            service.executeCommand(comamnd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
