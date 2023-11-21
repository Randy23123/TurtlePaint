package com.pluralsight;

import java.util.Scanner;
import static com.pluralsight.addShape.*;

public class Home {
    public static Scanner scanner = new Scanner(System.in);

    public static void homeScreen(Turtle turtle) {
        String homeScreen;
        do {
            System.out.println("\nHome Screen");
            System.out.println("1)Add Shape");
            System.out.println("2)Save Image");
            System.out.println("0)Exit");
            homeScreen = scanner.next();
            scanner.nextLine();

            switch (homeScreen) {
                case "1":
                    addShapeScreen(turtle);
                    break;
                case "2":
                    saveImage();
                    break;
                case "0":
                    System.out.println("You have exited application :)");
                    break;
            }
        }
        while (!homeScreen.equals("0"));
    }

    public static void saveImage() {
    }
}