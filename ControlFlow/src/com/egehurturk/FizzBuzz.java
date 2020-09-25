package com.egehurturk;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // infinite loop
        while (true) {
            System.out.print("Number: (Press 89 to escape) ");
            short number = scanner.nextShort();

            if (number == 89) {
                break;
            }

            // Boolean expressions
            boolean fizz = (number % 5 == 0);
            boolean buzz = (number % 3 == 0);

            // if
            if (fizz && buzz) {
                System.out.println("FizzBuzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else if (buzz) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
