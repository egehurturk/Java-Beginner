package com.egehurturk;

public class Functions {

    public static void main(String[] args) {
        String fullnameEge = greet("Ege", "Hurturk");
        String fullnameMosh = greet("Mosh", "Hamedani");
        System.out.println(fullnameEge);
        System.out.println(fullnameMosh);
    }

    public static String greet(String firstName, String lastName) {
        // @param name: parameter of greet
        return "Hello " + firstName + " " + lastName;
    }

}
