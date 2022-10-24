package day09_practices;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Create a class named GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
         */

        System.out.println("Enter your score: ");

        int score = input.nextInt();

        String result = (score >= 0 && score <= 100)?
        (score > 90)? "A" :(score > 80 && score < 90)? "B" :(score > 70 && score < 80)? "C"
                :(score > 60 && score < 70)? "D" : "F" : "Invalid Number";

        System.out.println(result);
    }
}
