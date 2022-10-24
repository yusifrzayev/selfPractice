package day04_practices;

public class SalaryCalculator_02 {

    public static void main(String[ ] args){

        int hourlyRate = 82;
        int weeklyHours = 40;
        double stateTaxRate =  0.7;
        double federalTaxRate = 2.4;
        double grossPay = hourlyRate * weeklyHours * 52;

        System.out.println("Gross pay is: $ " + grossPay);
        System.out.println("\t Federal tax is: $ " + grossPay/federalTaxRate);
        System.out.println("\t State tax is: $ " + grossPay/stateTaxRate);
        System.out.println("\t Total tax is: $ " + grossPay/(federalTaxRate+stateTaxRate));
        System.out.println( "\t Net income is: $ " + grossPay);





    }

}
