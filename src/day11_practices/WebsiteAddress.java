package day11_practices;

import javax.swing.*;

public class WebsiteAddress {

    public static void main(String[] args) {

        /*
        Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
         */


        String url = "www.ebay.com";

        boolean isValid = (url.startsWith("www.") && url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"));

        if (isValid){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }






    }
}
