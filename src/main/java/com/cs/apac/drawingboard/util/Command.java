package com.cs.apac.drawingboard.util;

import java.util.Arrays;

/**
 * Command class which holds the raw command and parameters entered by user.
 * @author ameyjadiye
 *
 */
public class Command {

    /**
     * Main Command entered by user.
     */
    private String command;

    /**
     * Arguments passed by users.
     */
    private String[] args;

    /**
     * Constructor for building new command.
     * @param command - main command.
     * @param args - parametres.
     */
    public Command(String command, String[] args) {
        super();
        this.command = command;
        this.args = Arrays.copyOf(args, args.length);
    }

    /**
     * @return the command
     */
    public String getCommand() {
        return command;
    }

    /**
     * @return the args
     */
    public String[] getArgs() {
        return Arrays.copyOf(args, args.length);
    }
}
