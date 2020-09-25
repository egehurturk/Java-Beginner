package com.egehurturk;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // OLD METHOD
        int[] oldNumbers = new int[3]; // Arrays are reference variable
        oldNumbers[0] = 1;
        oldNumbers[1] = 2;
        // numbers[10] = 3; ERROR
        System.out.println(
                Arrays.toString(oldNumbers) // This will return the string representation of our array
        ); // this will return the address in memory

        // NEW METHOD
        // Arrays have fixed length, and immutable
        int[] numbers = { 2,3,5,1,4 }; // new array definition
        int len = numbers.length;
        Arrays.sort(numbers); // Sort our array
        System.out.println(numbers);
    }
}

