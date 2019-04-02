package com.cs.apac.drawingboard.util;

import java.util.Arrays;

/**
 * Command parser for converting raw console input to Command.
 * @author ameyjadiye
 *
 */
public class CommandParser {

    /**
     * Method which takes raw input text and return the Command.
     * @param consoleInput - raw text entered by user.
     * @return returns the non validated command which is as is given by user.
     */
    public static Command getCommand(String consoleInput) {

        consoleInput = consoleInput == null ? "" : consoleInput;

        String[] tokens = consoleInput.split("\\s+");
        String action = tokens[0].toUpperCase();
        String[] args = Arrays.copyOfRange(tokens, 1, tokens.length);

        Command command = new Command(action, args);

        return command;
    }
}
