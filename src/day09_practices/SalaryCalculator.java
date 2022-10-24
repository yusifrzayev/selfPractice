package day09_practices;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
         */

        System.out.println("Enter your hourly rate: ");

        double rate = input.nextDouble();

        System.out.println("How many days do you work in a week?");

        int day = input.nextInt();

        System.out.println("Enter state tax: ");

        double tax1 = input.nextDouble();

        System.out.println("Enter federal tax: ");

        double tax2 = input.nextDouble();


        double salary = (8 * rate) * day * 4;
        double stateTax = salary * tax1;
        double federalTax = salary * tax2;
        double totalTax = stateTax + federalTax;
        double netIncome = (salary - totalTax);

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        input.close();


    }
}
