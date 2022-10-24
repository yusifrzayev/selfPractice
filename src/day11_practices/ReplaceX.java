package day11_practices;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        /*
        Create a class named ReplaceX, and write a program that asks user to enter a word.
         and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */

        Scanner input = new Scanner(System.in);

        String word = input.next();

        if (word.contains("x") || word.contains("X")) {
            System.out.println(word.replace('x', 'a').replace('X', 'a'));
        }


    }
}
