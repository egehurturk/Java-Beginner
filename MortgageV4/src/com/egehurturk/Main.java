 //NOT WORKING

package com.egehurturk;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Principal, Annual interest, years
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest =  (float) readNumber("Annaul Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Peridod (Years): ", 1, 30);

        double mortgage = calculateMorgage(principal, annualInterest, years);

        // Format and print Mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        formatOutput(mortgage, years, mortgageFormatted, principal, annualInterest);

    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max) break;
            System.out.println("Enter a valid value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMorgage(int principal, float annualInterest, byte years) {
        // Calculate Mortgage
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;


        double numerator = monthlyInterest * Math.pow( 1 + monthlyInterest, numberOfPayments);
        double denominator = Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        return principal * (numerator / denominator);
    }

    public static void formatOutput(double mortgage, byte years, String mortgageFormat, int principal, float annualInterest) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int numberOfPayments = (years * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("MORTGAGE\t");
        System.out.println("- - - - - - - - - ");
        System.out.println("Monthly payments: " + mortgageFormat);
        System.out.println("PAYMENT SCHEDULE");
        System.out.println(" - - - - - - - - - ");

        double remainder = 0;
        for(int i = 0; i < numberOfPayments; i++) {
            double balance = calculateBalance(principal, annualInterest, years, i+1);
            remainder = balance - mortgage;
            System.out.println(remainder);
        }
    }

    public static double calculateBalance(int principal, float annualInterest, byte years, int numberOfPaymentsMade) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double numerator = (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1+monthlyInterest, numberOfPaymentsMade));
        double denominator = Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        return  principal * (numerator / denominator);


    }


}


