package com.egehurturk;


import java.text.NumberFormat;

public class Format {

    public static void main(String[] args) {
        // How to format numers
        // FORMATTING NUMBERS AS CURRENCY
        // NumberFormat currency = new NumberFormat(); We can't instantiate the NumberFormat class because it is abstract
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891); // will return string representation formatted as currency
        System.out.println(result);

        // FORMATTING NUMBERS AS PERCENTAGE
        String percentResult = NumberFormat.getPercentInstance().format(0.1); // formatting as percentage
        System.out.println(percentResult);

        // MANUAL FORMATTING
        String name = "sonoo";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %32.12f", 32.33232); // returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

    }
}

/* String Formatting
 *       %a -> floating point except BigDecimal
 *       %b -> Any Type
 *       %c -> char
 *      !!! %d -> integer (byte, short, int, long, bigint)
 *       %e -> floating point in scientific notation
 *       %f -> floating point
 *       %g -> floating point in scientific notation depending on precision
 *       %h -> any hex type
 *       %n -> none
 *       %o -> integer (Octal)
 *      !!! %s -> String
 *       %t -> Date/Time
 *       %x -> Hex string
 *
 */

