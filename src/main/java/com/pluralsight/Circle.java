package com.pluralsight;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle turtle, int border, Color color, Point location, double radius) {
        super(turtle, border, color, location);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void paint() {}

    public void drawCircle(double radius) {
        drawUserCircle();
        int numSegments = 360;
        double angleIncrement = 360.0 / numSegments;

        for (int i = 0; i < numSegments; i++) {
            getTurtle().forward(radius * Math.PI * 2 / numSegments);
            getTurtle().turnLeft(angleIncrement);
        }
    }

    public void drawUserCircle() {
        Turtle turtle = getTurtle();

        turtle.penUp();
        turtle.goTo(location.getX(), location.getY());
        turtle.penDown();
        turtle.setColor(color);
        turtle.setPenWidth(border);
    }
}