package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle radius: ");

        double radius = input.nextDouble();
        System.out.println("A circle with a radius of " + radius + " is " + Circle.getArea(radius));
    }
}
