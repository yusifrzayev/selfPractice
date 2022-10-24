package day08_practices;

public class CydeoBatches {
    public static void main(String[] args) {

        /*
        Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */

        String batch = "EU";

        switch (batch) {

            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;

            case "US evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;

            case "EU":
                System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");
                break;

            default:
                System.out.println("Invalid Batch");
        }

        System.out.println("----------------------------------------------------------------------------");

        String batch1 = "US evening";

        if (batch1 == "EU" || batch1 == "US morning" || batch1 == "US evening") {
            if (batch1 == "EU") {
                System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");
            } else if (batch1 == "US evening") {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            } else {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }
        } else {
            System.out.println("Invalid Batch");
        }

        System.out.println("----------------------------------------------------------------------------");

        String batch2 = "EU";

        if (batch2 == "EU" || batch2 == "US morning" || batch2 == "US evening") {

            switch (batch2) {
                case "E":
                    System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                    break;

                case "US evening":
                    System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                    break;

                case "US morning":
                    System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");
                    break;

                default:
                    System.out.println("Invalid Batch");
            }
        }

    }
}
