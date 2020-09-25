package com.egehurturk;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        reverseNumbers(4);
        System.out.println("End");
    }

    public static void reverseNumbers(int limit) {
        for(int i=0; i <= limit; i++) {
            System.out.println(i);
        }
    }
}

/* DEBUG JAVA PROGRAM
Create a breakpoint on a statement
Use the Step Over tool to execute a statement
Use the Step Into tool to go inside a method
Use the Step Out tool to go outside a mehtod and continue from main
 */

/* Package and Deploy Java Applications
To deploy and package java applications, you should crete a jar file.
To do that, go to FILE in menu
Then, go to the project structure.
Select artifacts, then add a new artifact. Select the Main class.
Then, build this jar file. Go to BUILD in menu, then select build artifacts
Create build, and done.

To run jar file, in terminal run `java -jar HelloWorld.jar`
 */
