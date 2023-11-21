package com.pluralsight;

import java.awt.*;

import static com.pluralsight.Home.*;
public class MainApp {
    public static void main(String[] args) {
        int location = 0;
        int border = 0;

        World world = new World(900, 700);
        Turtle turtle = new Turtle(world,0,0);
        turtle.setDelay(.0000000000000000000000000000001);
        homeScreen(turtle);
    }
}
