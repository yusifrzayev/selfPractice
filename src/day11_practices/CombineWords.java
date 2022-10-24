package day11_practices;


import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        /*
        Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneigh
         */

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the first word: ");
        String word1 = input.next();

        System.out.println("Enter the second word: ");
        String word2 = input.next();

        if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println(word1 + word2);
        }


    }}