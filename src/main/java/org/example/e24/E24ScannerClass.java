package org.example.e24;

import java.util.Scanner;

public class E24ScannerClass {
    public static void main(String[] args) {
        /*
        Write a program that takes a user's name and prints it.
        **Output:**
            Hello, please enter your name
            Your name is Sumair
         */

        // takes the user's name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name);

    }
}
