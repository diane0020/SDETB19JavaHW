package org.example.e26;


import java.util.Scanner;

public class E26ScannerClass {
    /*
The variable "name" holds a String user input
Write a conditional statement starting on line 9 that does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if (name.equals("Chen")) {
            System.out.println("teacher");

        } else {
            System.out.println("student");

        }

    }
}
