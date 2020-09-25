package com.egehurturk;


public class Arithmetic {

    public static void main(String[] args) {
        // +, -, *, /, %, ...
        double result = (double)10 / (double)3; // casting
        int x = 1;
        int y = x++; // we first assign the value of x to y, and increment x
        int z = ++x; // x and z will be same
        x = x+2;
        x += 2; // same as the above

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}