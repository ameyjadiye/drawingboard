package com.cs.apac.drawingboard.util;

import java.util.Arrays;

public class CommandParser {

    public static Command getCommand(String consoleInput) {
        
        consoleInput= consoleInput==null? "" : consoleInput;
        
        String [] tokens = consoleInput.split("\\s+");
        String action = tokens[0].toUpperCase();
        String args[] = Arrays.copyOfRange(tokens, 1, tokens.length);
        
        Command command = new Command(action, args);
        
        return command;
    }
}
