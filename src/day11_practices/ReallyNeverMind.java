package day11_practices;


import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {

        /*
        Create a class named ReallyNeverMind. Ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word = input.next();

        if (word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }










    }

}
