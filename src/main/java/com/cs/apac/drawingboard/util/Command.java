/**
 * 
 */
package com.cs.apac.drawingboard.util;

public class Command {
    
    private String command;
    
    private String[] args;

    public Command() {
    }

    public Command(String command, String[] args) {
        super();
        this.command = command;
        this.args = args;
    }



    /**
     * @return the command
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * @return the args
     */
    public String[] getArgs() {
        return args;
    }

    /**
     * @param args the args to set
     */
    public void setArgs(String[] args) {
        this.args = args;
    }
    
}
