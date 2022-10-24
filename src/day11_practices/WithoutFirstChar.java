package day11_practices;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {


        /*
        Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String word1 = input.next();
        word1 = word1.substring(1);

        System.out.println(word1);

        //-------------------------------------------------------------------

        System.out.println("Enter the second word: ");
        String word2 = input.next();
        word2 = word2.substring(1);

        System.out.println(word2);





    }
}
