package com.pluralsight;

import java.awt.*;

public abstract class Shape {
    protected Turtle turtle;
    protected int border;
    protected Color color;
    protected Point location;

    public Shape(Turtle turtle, int border, Color color, Point location) {
        this.turtle = turtle;
        this.border = border;
        this.color = color;
        this.location = location;
    }

    public abstract void paint();

    // Getters
    public Turtle getTurtle() {
        return turtle;
    }

    public int getBorder() {
        return border;
    }

    public Color getColor() {
        return color;
    }

    public Point getLocation() {
        return location;
    }

    // Setters
    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public void setColor(Color color) {  // Change the parameter type to Color
        this.color = color;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
