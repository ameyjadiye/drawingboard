package com.cs.apac.drawingboard.util;

import com.cs.apac.drawingboard.exception.InvalidParameters;
import com.cs.apac.drawingboard.exception.NoSuchCommandException;

/**
 * The Validater class for executing and checking many different validations on
 * given command.
 * @author ameyjadiye
 *
 */
public class CommandValidator {

    /**
     * Method for validating the raw command entered by user.
     * @param command - non validated command.
     * @return - if the command is valid or not.
     * @throws InvalidParameters exception if the command is not valid.
     */
    public static boolean isValidCommand(Command command) throws InvalidParameters {

        switch (command.getCommand()) {
        case "C":
            if (command.getArgs().length != 2) {
                throw new InvalidParameters("Create command must have 2 param, height and width, Ex. C 20 4");
            }
            try {

                int x1 = Integer.parseInt(command.getArgs()[0]);
                int y1 = Integer.parseInt(command.getArgs()[1]);

                if (x1 <= 0 || y1 <= 0) {
                    throw new InvalidParameters("Command must have 2 param, both positive numeric and > 0, Ex. C 20 4");
                }

            } catch (NumberFormatException nfe) {
                throw new InvalidParameters("Create command must have 2 param, numeric height and width, Ex. C 20 4");
            }
            return true;
        case "L":

            if (command.getArgs().length != 4) {
                throw new InvalidParameters("Line command must have 4 param, x1 y1 x2 y2. Ex. L 1 2 6 2");
            }
            try {
                int x1 = Integer.parseInt(command.getArgs()[0]);
                int y1 = Integer.parseInt(command.getArgs()[1]);

                int x2 = Integer.parseInt(command.getArgs()[2]);
                int y2 = Integer.parseInt(command.getArgs()[3]);

                if (x1 <= 0 || y1 <= 0 || x2 <= 0 || y2 <= 0) {
                    throw new InvalidParameters(
                            "Command must have 4 param, all positive numeric and > 0, Ex. L 1 2 6 2");
                }

                if (!(x1 == x2 || y1 == y2)) {
                    throw new InvalidParameters("Only vertical or horizontal lines are allowed!! i.e x1=x2 OR y1=y2");
                }
                
                if (!(x2>=x1 && y2>=y1)) {
                    throw new InvalidParameters("x2,y2 should always be greater than x1,y1 as drawing goes left to right");
                }

            } catch (NumberFormatException nfe) {
                throw new InvalidParameters("Line command must have 4 param, all numeric x1 y1 x2 y2, Ex. L 1 2 6 2");
            }

            return true;
        case "R":

            if (command.getArgs().length != 4) {
                throw new InvalidParameters("Rectanlge command must have 4 param, x1 y1 x2 y2, Ex. R 14 1 18 3");
            }
            try {
                int x1 = Integer.parseInt(command.getArgs()[0]);
                int y1 = Integer.parseInt(command.getArgs()[1]);

                int x2 = Integer.parseInt(command.getArgs()[2]);
                int y2 = Integer.parseInt(command.getArgs()[3]);

                if (x1 <= 0 || y1 <= 0 || x2 <= 0 || y2 <= 0) {
                    throw new InvalidParameters(
                            "Command must have 4 param, all positive numeric and > 0, Ex. L 1 2 6 2");
                }

                if (!(x2>=x1 && y2>=y1)) {
                    throw new InvalidParameters("x2,y2 should always be greater than x1,y1 as x1,y1 should be upper left and x2,y2 should be lower right.");
                }

            } catch (NumberFormatException nfe) {
                throw new InvalidParameters(
                        "Rectanlge command must have 4 param, numeric x1 y1 x2 y2, Ex. R 14 1 18 3");
            }
            return true;
        case "B":
            if (command.getArgs().length != 3) {
                throw new InvalidParameters("Bucketfill command must have 3 param, x y c, Ex. B 10 3 c");
            }
            try {
                int x1 = Integer.parseInt(command.getArgs()[0]);
                int y1 = Integer.parseInt(command.getArgs()[1]);

                if (x1 <= 0 || y1 <= 0) {
                    throw new InvalidParameters(
                            "Command must have 3 param, two positive numeric and > 0 with color char c, Ex. B 10 3 c");
                }
            } catch (NumberFormatException nfe) {
                throw new InvalidParameters("Bucketfill command must have 3 param with numeric x y, Ex. B 10 3 c");
            }

            if (command.getArgs()[2].length() != 1) {
                throw new InvalidParameters("Bucketfill command must have 3rd param as single char c, Ex. B 10 3 c");

            }
            return true;
        case "Q":
            return true;
        default:
            throw new NoSuchCommandException("No Such command. " + System.lineSeparator() + BoardUtils.helpMsg());
        }
    }

}
