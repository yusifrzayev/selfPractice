package day08_practices;

public class OxygenTank {
    public static void main(String[] args) {

        /*
        Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
        and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
         */


        int n = 45;

        String level = (n >= 90) ? "Your tank is full" : (n >= 80 && n < 90) ? "Still okay" : (n >= 70 && n < 80) ?
                "Don't go too far" : (n >= 60 && n < 70) ? "Start to head back" : "Be careful," +
                "now you are at 50%";

        System.out.println(level);


    }
}
