package com.egehurturk;


import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        String input = "";

        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.println("");

            System.out.println("> (enter `quit` to quit) ");
            input = scanner.next().toLowerCase().trim();
            System.out.println(input);

        }
    }
}




