package day11_practices;

import java.util.Scanner;

/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next(); // xna

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);

    }


}
