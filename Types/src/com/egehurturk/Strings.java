package com.egehurturk;


public class Strings {
    public static void main(String[] args) {
        // String message = new String("Hello World");  This is redundant
        String message = "Hello World" + "!!"; // reference type
        boolean ex = message.endsWith("!!"); // String class has methods, endswith checks if it ends with the string specified
        boolean pre = message.startsWith("Hello"); // checks if that starts with "Hello"
        int length = message.length(); // returns the length of the string
        int index = message.indexOf("H"); // returns the index of the specified char. If it is -1, that means it doesn't exist
        String newmessage = message.replace("!", "*"); // Replaces the string with the replacement
        // message.replace does not change our original string. Because strings are immutable.
        String lower = message.toLowerCase(); // To all lower case
        String trimmed = message.trim(); // Get rid of whitespaces
        System.out.println(trimmed);
    }
}

