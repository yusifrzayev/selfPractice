package day09_practices;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

         */

        System.out.println("Enter miles: ");

        double miles = input.nextDouble();

        double km = miles * 1.69;

        System.out.println(miles + " miles equal to " + km + " kilometers");

        input.close();


    }
}
