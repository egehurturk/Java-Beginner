package com.egehurturk;


public class Ternary {

    public static void main(String[] args) {
        int income = 120_000;

        // ternary: <condition> ? <value1> : <value2>
        // Meaning: if condition is true: value1  else valuew
        String className =  income > 100_000 ? "Business" : "Economy";

        System.out.println(className);
    }
}
