package day09_practices;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        /*
        Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double r = input.nextDouble();

        double A = r * 3.14;
        double C = 2 * 3.14 * r;

        System.out.println("Area of the circle = " + A);
        System.out.println("Perimeter of the circle = " + C);

        input.close();


    }
}
