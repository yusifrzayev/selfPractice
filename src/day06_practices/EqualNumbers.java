package day06_practices;

public class EqualNumbers {
    public static void main(String[] args) {

        int n1 = 11;
        int n2 = 11;
        int n3 = 12;

        if (n1 == n2 && n1 == n3 && n2 == n3){
            System.out.println("all equal");
        }

        if (n1 == n2){
            System.out.println("n1&n2 are equal");
        }

        if (n2 == n3){
            System.out.println("n2&n3 are equal");
        }

        if (n3 == n1){
            System.out.println("n3&n1 are equal");
        }

        if (n1 != n2 && n1 != n3 && n2 != n3){
            System.out.println("none of them are equal");
        }




    }
}
