package com.egehurturk;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mosh {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Principal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Input Annual Interest Rate -> Calculate Monthly Interest Rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // Years
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // Calculate Mortgage
        double numerator = monthlyInterest * Math.pow( 1 + monthlyInterest, numberOfPayments);
        double denominator = Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        double mortgage = principal * (numerator / denominator);

        // Format and print Mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
