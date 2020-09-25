package com.egehurturk;

public class LogicalOperators {

    public static void main(String[] args) {
        // and
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30; // and "&&"
        System.out.println(isWarm);

        // or
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean eligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }
}