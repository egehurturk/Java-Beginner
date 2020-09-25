package com.egehurturk;

import java.lang.Math;

public class Maths {

    public static void main(String[] args) {
        int result = Math.round(1.1F); // rounding a float or decimal to integer
        int ceil = (int) Math.ceil(1.1F); // integer larger than the float number
        int floor = (int) Math.floor(1.1f); // integer smaller than the float number
        int max = Math.max(1,2); // return maximum
        int min = Math.min(1,2);
        double random = Math.random(); // random integer between 0,1
        double random100 = Math.random() * 100; // random integer between 0,100
        int roundedRandom = (int) Math.round(Math.random() * 100); // rounds the random variable
        int zero = (int) (Math.random() * 100); // will return 0 because we apply casting to Math.random()
        int pow = (int) Math.pow(2, 3); // Math.pow wll return double
    }
}

/*
* Math.round() -> Rounds to float or decimal or to integer,
*              -> returns int
*
* Math.ceil() -> Rounds to the greater integer
*             -> returns double or float
*
* Math.floor() -> Rounds to the smaller integer
*              -> returns double or float
*
* Math.min() / Math.max() -> returns min and max
*                         -> returns arbitrary
*
* Math.random() -> Gives a random variable between 0.1
*               -> returns double or float
*
* Math.pow() -> takes the power
*            -> returns double or float
*
*
*
 */