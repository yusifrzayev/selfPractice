package day09_practices;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
         */


        System.out.println("Enter your number: ");

        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Enter the value: ");


        double value = input.nextDouble();

        System.out.println("Enter the name of the company: ");

        input.nextLine();

        String name = input.nextLine();

        System.out.println("Your total stock market holding is $" + value + " which is made up of "
        + num + " shares. " + name + " is your company holdings."); }

        input.close();


    }
}
