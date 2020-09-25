package com.egehurturk;


public class Switch {

    public static void main(String[] args) {
        String role = "admin";

        // If statement
        if (role == "admin") {
            System.out.println("Welcome, admin");
        } else if (role == "moderator") {
            System.out.println("You are a moderator");
        } else {
            System.out.println("You are a guest");
        }

        // Switch Statement
        switch (role) {
            case "admin":
                System.out.println("Welcome, admin");
                break; // necessary to stop program
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

        // Enhanced switch
        switch (role) {
            case "admin" -> System.out.println("Welcome, admin");
            case "moderator" -> System.out.println("You are a moderator");
            default -> System.out.println("You are a guest");
        }
    }
}
