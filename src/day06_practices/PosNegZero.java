package day06_practices;

public class PosNegZero {
    public static void main(String[] args) {

        int number = 0;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        if (positive) {
            System.out.println("Positive");
        }

        if (negative) {
            System.out.println("Negative");
        }
        if (zero){
            System.out.println("Zero");
        }


        System.out.println("--------------------------------------------------------");

        if (number > 0){
            System.out.println("Positive");
        }

        if (number < 0){
            System.out.println("Negative");
        }

        if (number == 0){
            System.out.println("Zero");
        }


    }
}
