package com.pluralsight;

import java.awt.*;

public class Square extends Shape{
    private double sideLength;

    public Square(Turtle turtle, int border, Color color, Point location, double sideLength) {
        super(turtle, border, color, location);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {}

    public void drawSquare(double sideLength) {
        drawUserSquare();
        for (int i = 0; i < 4; i++) {
            getTurtle().forward(sideLength);
            getTurtle().turnRight(90);
        }
    }

    public void drawUserSquare() {
        Turtle turtle = getTurtle();

        turtle.penUp();
        turtle.goTo(location.getX(), location.getY());
        turtle.penDown();
        turtle.setColor(color);
        turtle.setPenWidth(border);
    }
}