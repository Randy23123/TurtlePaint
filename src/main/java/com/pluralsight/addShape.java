package com.pluralsight;

import java.awt.*;

import static com.pluralsight.Home.*;
public class addShape {
    public static void addShapeScreen(Turtle turtle) {
        String addShape;
        do {
            System.out.println("\nAdd Shape Screen");
            int border;
            Color color;
            Point location;

            System.out.println("What is the border width?");
            border = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What is the border color?");
            String colorInput = scanner.nextLine().trim();
            color = parseColor(colorInput);

            System.out.println("What's your X location?");
            int x = scanner.nextInt();

            System.out.println("What's your Y location?");
            scanner.nextLine();
            int y = scanner.nextInt();
            scanner.nextLine();

            location = new Point(x, y);

            System.out.println("1)Add Square");
            System.out.println("2)Add Circle");
            System.out.println("3)Add Triangle");
            System.out.println("0)Back");
            addShape = scanner.next();
            scanner.nextLine();

            switch (addShape) {
                case "1":
                    square(turtle, border, color, location);
                    break;
                case "2":
                    circle(turtle, border, color, location);
                    break;
                case "3":
                    triangle(turtle, border, color, location);
                    break;
                case "0":
                    System.out.println("Back to Home Screen :)");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!addShape.equals("0"));
    }

    private static Color parseColor(String colorInput) {
        switch (colorInput.toLowerCase()) {
            case "red":
                return Color.RED;
            case "blue":
                return Color.BLUE;
            case "green":
                return Color.GREEN;
            default:
                return Color.BLACK;
        }
    }


    public static void square(Turtle turtle, int border, Color color, Point location) {
        double sideLength;

        System.out.println("What is the side length of the square?");
        sideLength = scanner.nextDouble();
        scanner.nextLine();

        Square square = new Square(turtle, border, color, location, sideLength);
        square.drawSquare(sideLength);
    }

    public static void circle(Turtle turtle, int border, Color color, Point location){
        double radius;

        System.out.println("What is the radius of the circle?");
        radius = scanner.nextDouble();
        scanner.nextLine();

        Circle circle = new Circle(turtle, border, color, location, radius);
        circle.drawCircle(radius);
    }

    public static void triangle(Turtle turtle, int border, Color color, Point location) {
        double sideLength;

        System.out.println("What is the side length of the triangle?");
        sideLength = scanner.nextDouble();
        scanner.nextLine();

        Triangle triangle = new Triangle(turtle, border, color, location, sideLength);
        triangle.drawTriangle(sideLength);
    }
}
