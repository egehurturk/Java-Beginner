package com.egehurturk;


import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        String input = "";

        Scanner scanner = new Scanner(System.in);

        // While loop: if the condition is not true, the loop will never run
        while (!input.equals("quit")) {
            System.out.println("");

            System.out.println("> (enter `quit` to quit) ");
            input = scanner.next().toLowerCase().trim();
            System.out.println(input);

        }

        // Do loop: Even if the condition is false, it will run at least once.
        do {
            System.out.println("");
            System.out.println("> (enter `quit` to quit) ");
            input = scanner.next().toLowerCase().trim();
            System.out.println(input);

        } while (!input.equals("quit")); {
            System.out.println("quit");
        }
    }
}




