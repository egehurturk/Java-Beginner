package com.egehurturk;


import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {
        String[] array = { "Apple", "Mango", "Orange" };

        // For loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // For-each loop (Enhanced Loop)
        for (String fruit: array) {
            System.out.println(fruit);
        }


        // for-each loop has a drawbacks, we can't reverseley iterate. Also we can't access the index of array.
    }
}




