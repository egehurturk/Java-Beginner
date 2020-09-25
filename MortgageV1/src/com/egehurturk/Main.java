package com.egehurturk;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double monthlyInterestRate = (scanner.nextDouble() / 100) / 12;
        System.out.print("Period (years): ");
        int period = scanner.nextInt() * 12;

        double numerator = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, period));
        double denominator = Math.pow(1 + monthlyInterestRate, period)-1;
        double m = principle * (numerator / denominator);
        String formatM = NumberFormat.getCurrencyInstance().format(m);
        System.out.println("Mortgage: $ " + formatM);


    }
}
