package com.egehurturk;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        // In the Scanner object, we must specify where do we need to read the input from. (System.in is terminal)
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Age: ");  adds a new line

        System.out.print("Age: "); // print from the line

        // byte age = scanner.nextByte();  returns a byte value. Can only parse BYTE
        // String age1 = scanner.next(); Every time we call next(), it reads one token.
        String name = scanner.nextLine().trim(); // Reads everything no matter lines, etc.
        System.out.printf("You are %s years old." , name);
    }
}


/* How does the Scanner object work?
*
* 1. We need to define a scanner objet, with the literal: Scanner scanner = new Scanner(System.in);
*       This means that read the input from command line
*
* 2. Then, print the value you want to get: System.out.print("Age: ");
*       System.out.print will print the value in the line, not to a new line.
*
* 3. Getting the input:
*       - For primitive types (int, short, byte, double, float, char): <type> var = scanner.next<type>()
*           - Example: int age = scanner.nextInt();
*
*       - For strings: String name = scanner.nextLine() {.trim() for removing white spaces}
*
*/