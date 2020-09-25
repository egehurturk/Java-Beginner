package com.egehurturk;

import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature for your room: (In celsius)");
        byte temperature = scanner.nextByte();

        if (temperature > 30) {
            System.out.println("It's a hot day!");
            System.out.println("Drink water");
        } else if (temperature > 20) {
            System.out.println("Just perfect!");
        } else {
            System.out.println("Cold day");
        }

    }
}
