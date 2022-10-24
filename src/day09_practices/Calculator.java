package day09_practices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
         Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
         */

        System.out.println("Enter the first number: ");

        double num1 = input.nextDouble();

        System.out.println("Enter the operator: ");

        char operator = input.next().charAt(0);

        System.out.println("Enter the second number: ");

        double num2 = input.nextDouble();

        switch (operator) {
            case '-':
                System.out.println(num1 - num2);
                break;

            case '+':
                System.out.println(num1 + num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);

            default:
                System.out.println("Invalid entry");
                break;
        }

        input.close();

    }
}
