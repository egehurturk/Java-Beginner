package com.egehurturk;


import java.util.Arrays; // array package

public class MultiDimArry {

    public static void main(String[] args) {
        // OLD
        int[][] numbers = new int[2][3]; // Multidimensional Array (2X3) Matrix
        numbers[0][0] = 1; // Change the 0x0 number
        System.out.println(Arrays.toString(numbers)); // Print Memory Adress (because this is a multidim array)
        System.out.println(Arrays.deepToString(numbers)); // This will print our array

        // NEW
        int[][] number = { { 1,2,3 }, { 4,5,6 }};
        System.out.println(Arrays.deepToString(number));
    }
}

