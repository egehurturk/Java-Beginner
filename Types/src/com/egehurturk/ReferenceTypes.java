package com.egehurturk;

import java.util.Date; // Importing The Date class. (To use a different class from a different package, import it)

public class ReferenceTypes {
    public static void main(String[] args) {
        byte age = 30; // primitive type, when dealing with primitives, we don't allocate memory
        Date now = new Date(); // when we deal with reference types, we allocate memory.
        System.out.println(now); // prints date time
    }
}