package com.cli; /**
 * Created by gavin on 9/22/16.
 */
import java.util.Scanner;
public class PerimeterApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the Room Detail Generator!");
        String inputYes = "y";
        Scanner sc = new Scanner(System.in);

        while (inputYes.equalsIgnoreCase("y") || inputYes.equalsIgnoreCase("yes")) {
            double length;
            double width;
            System.out.println("Enter length in feet:");
            length = sc.nextDouble();
            System.out.println("Enter the width in feet:");
            width = sc.nextDouble();

            double area = width * length;
            double perimeter = (2 * width) + (2 * length);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Continue? (y/n):");
            inputYes = sc.next();
        }
        System.out.println("Thank you. Goodbye...");
    }
}