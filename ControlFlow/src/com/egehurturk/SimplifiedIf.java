package com.egehurturk;


public class SimplifiedIf {

    public static void main(String[] args) {
        int income = 120_000;

        // Long if statement
        // boolean hasHighIncome; -- global variable
        // if (income > 100_000) {
        // hasHighIncome = true;  --  local variable inside if statement (if we declare variables inside if)
        // } else {
        //  hasHighIncome = false;
        //}

        // Simplified
        boolean hasHighIncome = (income > 100_000); // boolean expression (returns true if income > 100_000
        System.out.println(hasHighIncome);
    }
}
