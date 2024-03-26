package org.example.e95;


import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String st1 = str.substring(0,3);
        System.out.println("The first 3 letters of " + str + " is " + st1);
    }
}
