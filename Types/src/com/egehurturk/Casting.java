package com.egehurturk;


public class Casting {

    public static void main(String[] args) {
        // IMPLICIT CASTING (automatic casting)
        // byte > short > int > long > float > double (they all can be automatically converted)
        short x = 1; // 2 bytes
        int y = x + 2; // 4 bytes

        double e = 1.1;
        double g = e+2; // double + integer (Java will automatically cast integer to double)

        // EXPLICIT CASTING (Can be only happen within competable types)
        double h = 1.1;
        int k = (int)h + 2; // we convert x to an integer

        String p = "1"; // we can't cast String to int
        Integer.parseInt(p); // Integer is the wrapper class for the int primitive type and provides more methods
        Short.parseShort("3"); // Short is the wrapper class for the short primitive type (Float, Double, ...)
        int o = Integer.parseInt(p) + 2;
        System.out.println(o); // 3
    }
}

/* Type casting happens in 2 ways
*           Wide Casting: (Automatic Casting) - converting a smaller type to a larger type
*                   byte -> short -> char -> int -> long -> float -> double
*
*           Narrowing Casting (Explicit Casting) - converting a larger type to a smaller type
*                   double -> float -> long -> int -> char -> short -> byte
*
*                   Example:
*                           double myDouble = 9.78;
*                           int myInt = (int) myDouble;
*
 */