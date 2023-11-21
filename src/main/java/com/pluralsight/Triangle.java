package com.pluralsight;

import java.awt.*;

public class Triangle extends Shape {
    private double sideLength;

    public Triangle(Turtle turtle, int border, Color color, Point location, double sideLength) {
        super(turtle, border, color, location);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {
    }

    public void drawTriangle(double sideLength) {
        drawUserTriangle();
        for (int i = 0; i < 3; i++) {
            getTurtle().forward(sideLength);
            getTurtle().turnLeft(120);
        }
    }

    public void drawUserTriangle() {
        Turtle turtle = getTurtle();

        turtle.penUp();
        turtle.goTo(location.getX(), location.getY());
        turtle.penDown();
        turtle.setColor(color);
        turtle.setPenWidth(border);
    }
}
