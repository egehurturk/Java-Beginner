package com.egehurturk;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variable declarations
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        float monthlyInterest;
        int numberOfPayments;


        Scanner scanner = new Scanner(System.in);

        // Principal
        while (true) {
            System.out.print("Principal ($1K - $1M) :  ");
            principal = scanner.nextInt();
            boolean condition = (principal > 1_000 && principal <= 1_000_000);
            if (condition) {
                break;
            }
            System.out.println("Enter a valid number between 1,000 and 1,000,000");

        }

        // Input Annual Interest Rate -> Calculate Monthly Interest Rate
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            boolean condition = (annualInterest > 0 && annualInterest <= 30);
            if (condition) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a number greater than 0 and less than or equal to 30");
        }

        // Years
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            boolean condition = (years > 0 && years <= 30);
            if (condition) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a valid year between 0 and 30");
        }


        // Calculate Mortgage
        double numerator = monthlyInterest * Math.pow( 1 + monthlyInterest, numberOfPayments);
        double denominator = Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        double mortgage = principal * (numerator / denominator);

        // Format and print Mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
