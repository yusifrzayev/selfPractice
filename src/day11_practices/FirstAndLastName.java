package day11_practices;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Write a program that asks user to enter first and last names,
        and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */

        System.out.println("Enter your first name: ");
        String f = input.next().toLowerCase();

        f = ("" + f.charAt(0)).toUpperCase() + f.substring(1);


        System.out.println("Enter your last name: ");
        String l = input.next().toLowerCase();

        l = ("" + l.charAt(0)).toUpperCase() + l.substring(1);

        System.out.println(f + " " + l);

        input.close();



    }

}
