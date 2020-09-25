package com.egehurturk;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageV3 {

    public static void main(String[] args) {

        // Principal, Annual interest, years
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest =  (float) readNumber("Annaul Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Peridod (Years): ", 1, 30);

        double mortgage = calculateMorgage(principal, annualInterest, years);

        // Format and print Mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max) break;
            System.out.println("Enter a valid value between" + min + "and" + max);
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

}
