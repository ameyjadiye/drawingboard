package com.cs.apac.drawingboard.operation;

import com.cs.apac.drawingboard.entity.holder.Canvas;
import com.cs.apac.drawingboard.entity.shape.Point;
import com.cs.apac.drawingboard.util.Command;

public class CreateCanvasOperation extends BaseOperation implements CreateOperation {

    public CreateCanvasOperation(Command command) {
        this.setCommand(command);
    }

    @Override
    public void execute() {
        createCanvas();
        printCavas();
    }

    @Override
    public void createCanvas() {
        Command command = this.getCommand();
        int width = Integer.parseInt(command.getArgs()[0]);
        int height = Integer.parseInt(command.getArgs()[1]);

        Canvas canvas = new Canvas(width, height);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                canvas.getSheet()[i][j] = new Point(j, i, ' ');
            }
        }

        this.setCanvas(canvas);
    }
}
