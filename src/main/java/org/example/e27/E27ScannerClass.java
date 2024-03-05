package org.example.e27;


import java.util.Scanner;

public class E27ScannerClass {
    /*
    Write a Java program to ask age "Please enter your age".
Based on the age define whether the user is eligible to vote or not.
A person who is eligible to vote must be older or equal to 18 years old and the program will show "You are eligible to vote".
Otherwise, the program will show "You are not eligible to vote".
     */
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Please enter your age");
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        int ageEntered = age.nextInt();

        if (ageEntered >= 18){
            System.out.println("You are eligible to vote");

        } else {
            System.out.println("You are not eligible to vote");

        }
    }
}

