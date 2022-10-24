package day09_practices;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        /*
        Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents




         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents: ");

        int cents = input.nextInt();

        int dollar = (cents / 100);
        cents = cents - (dollar * 100);

        System.out.println(dollar + " dollars " + cents + " cents");

        input.close();


    }
}
